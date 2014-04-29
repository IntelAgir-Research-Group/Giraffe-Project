package fr.mines_nantes.atlanmod.monitoring.scaleclasses;

import fr.mines_nantes.atlanmod.annotations.Create;
import fr.mines_nantes.atlanmod.annotations.Deploy;
import fr.mines_nantes.atlanmod.annotations.Exec;
import fr.mines_nantes.atlanmod.annotations.Monitor;
import fr.mines_nantes.atlanmod.monitoring.MonitorRunner;

public class AutoScaleExecution {

	private static boolean created=false;
	
	@Create
	public void createNodes() {
		MonitorRunner.printLog("[AUTO SCALE CLASSE] Hello!");
	}
	
	@Deploy(sequence = 1)
	public void deployApp() {
		MonitorRunner.printLog("[AUTO SCALE CLASSE] Hello App!");
	}
	
	@Monitor
	public void monitorNodes() {
		MonitorRunner.printLog("[AUTO SCALE CLASSE] Start to monitoring!");
	}
	
	@Exec(sequence = 1)
	public void action1() {
		MonitorRunner.printLog("[AUTO SCALE CLASSE] Action 1!");
	}

}
