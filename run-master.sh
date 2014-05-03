#!/bin/bash

jarfile='Cloud-Resources-Monitor-0.0.1-SNAPSHOT.jar'
homedir='~/workspace/Giraffe-Project'
masterclass='fr.mines_nantes.atlanmod.monitoring.MasterRunner'

# Executing Master
#echo "java -cp $homedir/target/$jarfile $masterclass &"
#/usr/bin/java -cp $homedir/target/$jarfile $masterclass &
java -cp .:./target/lib/jetty-6.1.14.jar:./target/lib/*:./target/Cloud-Resources-Monitor-0.0.1-SNAPSHOT.jar:./target/lib/hadoop-core-0.20.2.jar fr.mines_nantes.atlanmod.monitoring.master.MasterRunner&
