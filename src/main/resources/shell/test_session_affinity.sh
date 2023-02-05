#!/bin/bash

i=1
sum=0

while ((i <= 10))
do
    ((sum += i))
    ((i++))
    curl http://172.16.124.10:30007/hostname
    echo ""
done