Giraffe-Project
===============

It is a repository of the Giraffe Project, which is a monitoring/scalability tool prototype.

Giraffe=scale up + top view

How to execute:
---------------
- Config the hostname x IP in remote nodes
- Create a new ssh key without password (will be more easy to execute)
- Update the config/slaves list
- Copy the ssh ky to slaves (./run-ssh-copy-id.sh)
- Compile the Maven Project to generate the .jar
- Run the master (./run-master.sh)
- Run the slaves (./run-slaves.sh) - In the first time you will need to sync the project folder with all nodes. I will solve that later!
- See the execution tracking in the log files (server-log.txt and monitor-log.txt)
