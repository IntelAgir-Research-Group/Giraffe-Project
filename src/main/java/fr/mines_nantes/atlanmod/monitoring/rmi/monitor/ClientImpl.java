package fr.mines_nantes.atlanmod.monitoring.rmi.monitor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import fr.mines_nantes.atlanmod.annotations.Monitor;
import fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner;

public class ClientImpl extends UnicastRemoteObject implements Client {

	public ClientImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @author albonico 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum Signal {
	    START, STOP, RESTART, KILL, CREATE, DEPLOY, DEPLOYMASTER
	}

	public void receiveSrvMessage(String msg) throws RemoteException, InterruptedException {
		MonitorRunner.printLog("[MONITOR] Message received: "+msg);
		Signal s = Signal.valueOf(msg);
		try {
			switch(s) {
			case START: 
				MonitorRunner.setStart(true);
				MonitorRunner.startWatch();
				break;
			case STOP:
				//MonitorRunner.pauseWatchdog();
				MonitorRunner.stopWatch();
				break;
			case RESTART:
				MonitorRunner.restartWatchdog();
				break;
			case KILL:
				MonitorRunner.stopMonitor();
				break;
			case CREATE:
				MonitorRunner.sendCreatedMsg(MonitorRunner.createNode());
				break;
			case DEPLOY:
				MonitorRunner.sendDeployAppMessage(MonitorRunner.deployApp());
				break;
			case DEPLOYMASTER:
				MonitorRunner.sendMasterDeployed(MonitorRunner.deployMasterApp());
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
