package fr.mines_nantes.atlanmod.monitoring.manager;

import java.io.IOException;
import java.util.Random;

import fr.mines_nantes.atlanmod.ReadConfigurations;
import fr.mines_nantes.atlanmod.annotations.CreateVM;
import fr.mines_nantes.atlanmod.annotations.DestroyVM;

public class VirtualBoxManager {
	
	int ID = 0;
	String vmName = "VM";
	String shellScript = "";
	
	@CreateVM
	public void createVM() {
		Random r = new Random();
		ID = r.nextInt();
		vmName="VM"+ID;
		Runtime run = Runtime.getRuntime();
		try {
			shellScript = (String) ReadConfigurations.getPropertyValue("virtualbox_vm_create_script");
			Process p = run.exec(shellScript+" "+vmName);
			p.waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	@DestroyVM
	public void destroyVM() {
		Random r = new Random();
		Runtime run = Runtime.getRuntime();
		try {
			shellScript = (String) ReadConfigurations.getPropertyValue("virtualbox_vm_delete_script");
			Process p = run.exec(shellScript+" "+vmName);
			p.waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
