The Giraffe/La Girafe
===============

By using the Giraffe Tool, it's possible for testers to control the CBS elastic behavior as they need, which can be useful for regression testing or bug reproduction/repeatability. In addition, controlling the elastic behavior can reduce the execution time and cost (as a consequence).


Giraffe=scale up + top view

How to execute:
---------------
- Configure the parameters in monitoring.properties
- Create a VirtualMachine to be cloned (requirements: OpenSSH and Java)
- Set the virtual machine user and password in create-vm.sh
- Compile the Giraffe-Project to generate the .jar (mvn install)
- Run the master (./run-master.sh)
- See the execution tracking in the log files (server-log.txt and monitor-log.txt)
