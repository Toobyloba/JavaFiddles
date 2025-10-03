#!/bin/bash

CERT_FILE=$1
DAYS_WARNING=${2:-30}

if [ ! -f "$CERT_FILE" ]; then
    echo "Certificate file not found: $CERT_FILE"
    exit 1
fi

# Get expiration date in seconds since epoch
EXPIRY=$(openssl x509 -in "$CERT_FILE" -noout -enddate | cut -d= -f2)
EXPIRY_SECONDS=$(date -d "$EXPIRY" +%s)
NOW_SECONDS=$(date +%s)
SECONDS_LEFT=$((EXPIRY_SECONDS - NOW_SECONDS))
DAYS_LEFT=$((SECONDS_LEFT / 86400))

echo "Certificate: $CERT_FILE"
echo "Expires on: $EXPIRY"
echo "Days remaining: $DAYS_LEFT"

if [ $DAYS_LEFT -lt 0 ]; then
    echo "CRITICAL: Certificate has EXPIRED!"
    exit 2
elif [ $DAYS_LEFT -lt $DAYS_WARNING ]; then
    echo "WARNING: Certificate will expire in less than $DAYS_WARNING days!"
    exit 1
else
    echo "OK: Certificate is valid for more than $DAYS_WARNING days."
    exit 0
fi
