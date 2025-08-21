#!/bin/bash
if [ -z "$1" ]; then
    echo "You need to specify a directory"
    exit 1
fi

directory_name=$1
tarfile_name=$(basename $1)_$(date +"%Y-%m-%d").tar.gz
echo $tarfile_name
tar -czvf $tarfile_name $(basename $1)
