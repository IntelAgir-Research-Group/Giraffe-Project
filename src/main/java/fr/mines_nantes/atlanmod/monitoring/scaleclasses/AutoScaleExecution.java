package fr.mines_nantes.atlanmod.monitoring.scaleclasses;

import fr.mines_nantes.atlanmod.annotations.Create;
import fr.mines_nantes.atlanmod.annotations.Deploy;
import fr.mines_nantes.atlanmod.annotations.Exec;
import fr.mines_nantes.atlanmod.annotations.Monitor;
import fr.mines_nantes.atlanmod.monitoring.frameworks.HDFS;
import fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner;

public class AutoScaleExecution {
	
	HDFS hdfs = new HDFS();

	@Create
	public void createNodes() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Creating a new node!");
	}
	
	@Deploy(sequence = 1)
	public void deployMaster() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Creating NameNode!");
		try {
			HDFS.startNameNode();
		} catch (Exception e) {
			MonitorRunner.printLog("[AUTO SCALE CLASS] Error: "+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MonitorRunner.printLog("[AUTO SCALE CLASS] NameNode created!");
	}
	
	/*
	@Deploy(sequence = 2)
	public void deploySlave() {
		MonitorRunner.printLog("[AUTO SCALE CLASSE] Create DataNode!");
		Thread dn = HDFSManager.startDataNode();
		dn.start();
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	
	@Monitor
	public void monitorNodes() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Start to monitoring!");
	}
	
	@Exec(sequence = 1)
	public void action1() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Action 1!");
	}

}
