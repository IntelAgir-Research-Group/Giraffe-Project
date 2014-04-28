#!/bin/bash

slaves=`cat config/slaves`
remoteuser='root'

for slave in $slaves
do
	ssh-copy-id $remoteuser@$slave
done
