# Docker Registry Certificate Management Best Practices

## Certificate Procurement
- Use certificates from trusted Certificate Authorities for production environments
- Use appropriate certificate types (DV, OV, or EV based on needs)
- Ensure certificates match the exact domain names used to access registries
- Consider wildcard certificates for multiple subdomains
- Use appropriate key lengths (minimum 2048 bits for RSA)

## Certificate Deployment
- Store certificates securely
- Use proper file permissions (readable only by the Docker daemon)
- Back up certificates and private keys securely
- Implement proper certificate rotation procedures
- Keep certificate paths consistent across all nodes in a cluster

## Monitoring and Maintenance
- Set up alerts for certificates nearing expiration (at least 30 days in advance)
- Maintain an inventory of all certificates in use
- Document renewal procedures
- Test certificate renewals in a staging environment before production
- Automate certificate renewal where possible (using tools like certbot)

## Security Considerations
- Never use insecure registries in production environments
- Avoid using self-signed certificates in production
- Implement proper certificate revocation procedures
- Regularly audit certificate usage and permissions
- Keep the CA bundle updated on all systems
