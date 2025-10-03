#!/bin/bash

REGISTRY=${1:-"hub.docker.com"}
PORT=${2:-"443"}

echo "Checking certificate for $REGISTRY:$PORT..."
echo | openssl s_client -connect $REGISTRY:$PORT 2>/dev/null | openssl x509 -noout -dates -issuer -subject

echo -e "\nVerifying certificate chain..."
openssl s_client -connect $REGISTRY:$PORT -showcerts </dev/null 2>/dev/null | grep -A 1 "Certificate chain"
