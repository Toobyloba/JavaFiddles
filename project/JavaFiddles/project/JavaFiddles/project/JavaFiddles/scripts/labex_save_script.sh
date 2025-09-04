#!/bin/bash
git config user.name "Toobyloba"
git config user.email "balogun.tooby@gmail.com"
current_date=$(date)
git add .
git commit -m "Commit on $current_date"
git push