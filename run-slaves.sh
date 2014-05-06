#!/bin/bash

remoteuser='root'
destinationfolder='~/Giraffe-Project'
sourcefolder='~/workspace/Giraffe-Project' # Did not work
jarfile='Cloud-Resources-Monitor-0.0.1-SNAPSHOT.jar' # Did not work... 
remoteclass='fr.mines_nantes.atlanmod.monitoring.MonitorRunner' # Did not work.... Try again later!

## Slaves Execution
slaves=`cat config/slaves`

for slave in $slaves
do
echo "Synchronazing files with $slave"
scp ~/workspace/Giraffe-Project/monitoring.properties $remoteuser@$slave:$destinationfolder/
scp ~/workspace/Giraffe-Project/hadoop.properties $remoteuser@$slave:$destinationfolder/
scp -r ~/workspace/Giraffe-Project/target/* $remoteuser@$slave:$destinationfolder/target/
scp ~/workspace/Giraffe-Project/gen-input-file.sh $remoteuser@$slave:$destinationfolder/
echo "Executing $salve now..."
ssh root@$slave 'rm -rf /tmp/datanodedatadir/'
ssh root@$slave 'cd ~/Giraffe-Project/ && java -cp .:./target/lib/:./target/Cloud-Resources-Monitor-0.0.1-SNAPSHOT.jar:./target/lib/hadoop-core-0.20.2.jar fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner&' > /dev/null 2>&1 &
echo "$slave OK"
done

echo "All nodes are executing!"
