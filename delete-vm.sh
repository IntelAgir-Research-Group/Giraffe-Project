#!/bin/bash


if  [ "$1" == "" ]
then
	echo "You need to specify a name for the machine which must be deleted. Ex.: delete-vm.sh MachineName"
else
echo "Stopping the VM $1"
VBoxManage controlvm $1 poweroff
sleep 5
echo "Unregistering/Deleting the VM $1"
VBoxManage unregistervm $1 --delete
fi
