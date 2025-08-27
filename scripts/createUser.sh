#!/bin/bash

# --- 1. Check if the username argument was provided ---
# We check if the number of arguments ($#) is zero.
if [ "$#" -eq 0 ]; then
    echo "Error: Username is required."
    exit 1
fi

# Store the username in a variable for clarity
USERNAME=$1
ADMIN_FLAG=$2

# --- 2. Check the second argument to decide user type ---

# The -z "$ADMIN_FLAG" checks if the second argument was not provided at all.
if [ -z "$ADMIN_FLAG" ]; then
    # --- Standard User Creation ---
    echo "Creating standard user..."
    useradd -m "$USERNAME"
    echo "Standard user '$USERNAME' created."

elif [ "$ADMIN_FLAG" == "--admin" ]; then
    # --- Admin User Creation ---
    echo "Creating admin user..."
    # First, create the user with their home directory
    useradd -m "$USERNAME"
    # Then, add the new user to the 'sudo' group (for Debian/Ubuntu)
    # Use 'wheel' for CentOS/RHEL, e.g., usermod -aG wheel "$USERNAME"
    usermod -aG sudo "$USERNAME"
    echo "Admin user '$USERNAME' created and added to sudo group."

else
    # --- Handle Invalid Flags ---
    echo "Error: Invalid flag '$ADMIN_FLAG'. Only '--admin' is supported."
    exit 1
fi

exit 0
