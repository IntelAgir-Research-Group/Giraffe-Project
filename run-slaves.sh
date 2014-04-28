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
scp ~/workspace/Giraffe-Project/target/*.jar $remoteuser@$slave:$destinationfolder/target/
echo "Executing $salve now..."
ssh root@$slave 'cd ~/Giraffe-Project/ && java -cp ~/Giraffe-Project/target/Cloud-Resources-Monitor-0.0.1-SNAPSHOT.jar fr.mines_nantes.atlanmod.monitoring.MonitorRunner &' > /dev/null 2>&1 &
echo "$slave OK"
done

echo "All nodes are executing!"
