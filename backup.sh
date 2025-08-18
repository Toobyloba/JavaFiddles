#!/bin/bash
current_date=$(date +"%Y-%m-%d")
directory_name=$1
tarfile_name=${directory_name}_${current_date}
echo $current_date
echo $tarfile_name

