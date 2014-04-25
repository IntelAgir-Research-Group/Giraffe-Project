package fr.mines_nantes.atlanmod.monitoring.rmi;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;

import fr.mines_nantes.atlanmod.ReadConfigurations;
import fr.mines_nantes.atlanmod.monitoring.StartUp;

public class RmiRegistryRunner {
	
	public RmiRegistryRunner() {
		try {
			int port = Integer.valueOf(ReadConfigurations.getPropertyValue("server_port"));
			LocateRegistry.createRegistry(port);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public RmiRegistryRunner(int port) {
		try {
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
