#!/bin/bash

slaves=`cat config/slaves`

for slave in $slaves
do
	ssh root@$slave 'killall java'
done
