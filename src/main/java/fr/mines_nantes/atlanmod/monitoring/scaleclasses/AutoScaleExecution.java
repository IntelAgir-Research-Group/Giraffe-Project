package fr.mines_nantes.atlanmod.monitoring.scaleclasses;

import fr.mines_nantes.atlanmod.annotations.Create;
import fr.mines_nantes.atlanmod.annotations.Deploy;
import fr.mines_nantes.atlanmod.annotations.Exec;
import fr.mines_nantes.atlanmod.annotations.Monitor;
import fr.mines_nantes.atlanmod.annotations.Stress;
import fr.mines_nantes.atlanmod.monitoring.frameworks.HDFS;
import fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner;

public class AutoScaleExecution {
	
	HDFS hdfs = new HDFS();

	@Create
	public void createNodes() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Creating a new node!");
	}
	
	@Deploy(type = "master", monitor=0)
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
	
	@Deploy(type = "slave", monitor=-2)
	public void deploySlave() {
		MonitorRunner.printLog("[AUTO SCALE CLASSE] Create DataNode!");
		HDFS.startDataNode();
	}
	
	@Monitor 
	// Crate the monitoring specification here or remove
	public void monitorNodes() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Start to monitoring!");
		HDFS.stress();
	}
	
	@Stress
	public void stressHDFS() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Stressing the HDFS");
		HDFS.stress();
	}
	
	@Exec(sequence=1, monitor=-2)
	public void action1() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Action 1!");
	}
	
	@Exec(sequence=2, monitor=-2)
	public void action2() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Action 2!");
	}
	
	@Exec(sequence=3, monitor=-2)
	public void action3() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Action 3!");
	}

}
