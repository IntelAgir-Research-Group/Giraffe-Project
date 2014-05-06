#!/bash

# 16MB
dd if=/dev/urandom of=$1 bs=1MB count=16
