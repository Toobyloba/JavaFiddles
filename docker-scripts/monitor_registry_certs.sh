#!/bin/bash

# List of registries to check
REGISTRIES=(
  "hub.docker.com"
  "mcr.microsoft.com"
  "registry.k8s.io"
  "quay.io"
)

echo "========================================"
echo "Docker Registry Certificate Monitor"
echo "========================================"
echo "Date: $(date)"
echo ""

for registry in "${REGISTRIES[@]}"; do
  echo "Checking $registry..."
  CERT_INFO=$(echo | openssl s_client -connect $registry:443 2>/dev/null | openssl x509 -noout -dates -issuer -subject 2>/dev/null)
  
  if [ -z "$CERT_INFO" ]; then
    echo "ERROR: Could not retrieve certificate for $registry"
  else
    echo "$CERT_INFO"
    
    # Extract expiry date
    EXPIRY=$(echo "$CERT_INFO" | grep "notAfter" | cut -d= -f2)
    EXPIRY_SECONDS=$(date -d "$EXPIRY" +%s)
    NOW_SECONDS=$(date +%s)
    DAYS_LEFT=$(( (EXPIRY_SECONDS - NOW_SECONDS) / 86400 ))
    
    echo "Days until expiry: $DAYS_LEFT"
    
    if [ $DAYS_LEFT -lt 30 ]; then
      echo "WARNING: Certificate will expire in less than 30 days!"
    fi
  fi
  echo "----------------------------------------"
done
