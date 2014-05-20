Giraffe-Project
===============

It is a repository of the Giraffe Project, which is a monitoring/scalability tool prototype.

Giraffe=scale up + top view

How to execute:
---------------
- Configure the parameters in monitoring.properties
- Create a VirtualMachine to be cloned (requirements: OpenSSH and Java)
- Set the virtual machine user and password in create-vm.sh
- Compile the Giraffe-Project to generate the .jar (mvn install)
- Run the master (./run-master.sh)
- See the execution tracking in the log files (server-log.txt and monitor-log.txt)
