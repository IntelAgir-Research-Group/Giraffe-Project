#!/bin/bash

slaves=`cat config/slaves`
remoteuser='root'
remotepassword='123'

ssh-copy-id $remoteuser@172.28.2.122

VAR=$(expect -c" 
     expect "*?assword:*"
     send \"$remotepassword\r";
     send -- "\r"
     expect eof
     ")

echo "$VAR"

#for slave in $slaves
#do
#	ssh-copy-id $remoteuser@$slave
#done
