package fr.mines_nantes.atlanmod.monitoring.scaleclasses;

import java.io.IOException;
import java.util.Random;

import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;

import fr.mines_nantes.atlanmod.ReadConfigurations;
import fr.mines_nantes.atlanmod.annotations.Create;
import fr.mines_nantes.atlanmod.annotations.Deploy;
import fr.mines_nantes.atlanmod.annotations.Exec;
import fr.mines_nantes.atlanmod.annotations.Monitor;
import fr.mines_nantes.atlanmod.annotations.Stress;
import fr.mines_nantes.atlanmod.monitoring.frameworks.HDFS;
import fr.mines_nantes.atlanmod.monitoring.master.MasterRunner;
import fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner;

public class AutoScaleExecution {
	
	HDFS hdfs = new HDFS();
	static int i=1;

	@Create
	public boolean createNodes() {
		MonitorRunner.printLog("[AUTO SCALE CLASS] Creating new nodes!");
			try {
				int count = 0;
				int maxCount = Integer.valueOf(ReadConfigurations.getPropertyValue("server_max_monitors"));
				while (!MasterRunner.allMonitors && count < maxCount) {
					MonitorRunner.printLog("[AUTO SCALE CLASS] All Monitors Status: "+MasterRunner.allMonitors);
					Thread tCreate = new Thread() {
						public void run() {
							try {
								String createScript = (String) ReadConfigurations.getPropertyValue("virtualbox_vm_create_script");
								Random rID = new Random();
								int monitorID = rID.nextInt();
								MonitorRunner.printLog("[AUTO SCALE CLASS] Node "+monitorID);
								String command = "bash ./"+createScript+" Monitor"+monitorID;
								MonitorRunner.printLog("[AUTO SCALE CLASS] Executing: "+command);
								Runtime run = Runtime.getRuntime();
								Process p = run.exec(command);
								p.waitFor();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					};
					tCreate.start();
					tCreate.join();
					count++;
					//MonitorRunner.printLog("[AUTO SCALE CLASS] Waiting for monitor connection");
					//Thread.sleep(15000);
					MonitorRunner.printLog("[AUTO SCALE CLASS] Node "+i+" - OK");
				}
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		MonitorRunner.printLog("[AUTO SCALE CLASS] Nodes created!");
		return true;
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
	
	@Deploy(type = "slave", monitor=-1)
	public void deploySlave() {
		MonitorRunner.printLog("[AUTO SCALE CLASSE] Create DataNode!");
		HDFS.startDataNode();
		MonitorRunner.printLog("[AUTO SCALE CLASSE] DataNode created!");
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
