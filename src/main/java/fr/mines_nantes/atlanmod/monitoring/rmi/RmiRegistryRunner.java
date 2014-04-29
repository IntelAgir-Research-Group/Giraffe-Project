package fr.mines_nantes.atlanmod.monitoring.rmi;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;

import fr.mines_nantes.atlanmod.ReadConfigurations;

public class RmiRegistryRunner {
	
	public void setHost(String host) {	
			System.setProperty("java.rmi.server.hostname",host);
	}
	
	// Master
	public RmiRegistryRunner() {
		try {
			int port = Integer.valueOf(ReadConfigurations.getPropertyValue("server_port"));
			String host = (String) ReadConfigurations.getPropertyValue("server_host");
			setHost(host);
			LocateRegistry.createRegistry(port);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Monitor
	public RmiRegistryRunner(int port, String host) {
		try {
			setHost(host);
			LocateRegistry.createRegistry(port);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
