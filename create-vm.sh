#!/bin/bash

username='root'
password='123'
vmname=$1

if [ "$1" == "" ]
then
	echo "You need to specify a name for the new machine. Ex.: create-vm.sh MachineName"
else
VBoxManage clonevm "Linux1-CloudTest" --name "$1" --register

echo "Starting VM $1"
VBoxManage startvm "$1"

echo "Waiting for the VM start"
sleep 60

echo "Getting the IP"
ip=`VBoxManage guestproperty get "$1" "/VirtualBox/GuestInfo/Net/0/V4/IP" | awk '{ print $2 }'`
echo "The IP is: $ip"
echo "Synching the files with the VM $1"
#sshpass -p 123 ssh -o "StrictHostKeyChecking no" root@172.28.3.104 'ls'
sshpass -p $password scp -o "StrictHostKeyChecking no" -r ~/workspace/Giraffe-Project/ $username@$ip:~/

echo "Setting the hostname to VM $1"
sshpass -p $password ssh -o "StrictHostKeyChecking no" root@$ip 'echo '$vmname' > /etc/hostname'
sshpass -p $password ssh -o "StrictHostKeyChecking no" root@$ip 'echo '$ip' $'\t' '$1' > /etc/hosts'
sshpass -p $password ssh -o "StrictHostKeyChecking no" root@$ip 'hostname '$vmname''
sshpass -p $password ssh -o "StrictHostKeyChecking no" root#$ip 'cd ~/Giraffe-Project && java -cp .:./target/lib/:./target/Cloud-Resources-Monitor-0.0.1-SNAPSHOT.jar:./target/lib/hadoop-core-0.20.2.jar fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner &' 
echo "Starting the Monitor"
#ssh root@$ip 'command'
fi
