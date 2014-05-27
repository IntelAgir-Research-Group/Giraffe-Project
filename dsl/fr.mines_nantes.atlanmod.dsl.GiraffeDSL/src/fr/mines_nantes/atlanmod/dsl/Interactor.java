package fr.mines_nantes.atlanmod.dsl;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

import com.google.common.collect.Iterables;

import fr.mines_nantes.atlanmod.dsl.generator.GiraffeDSLGenerator;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature;


public class Interactor extends GiraffeDSLGenerator {

	static Resource res = null;
	
	// List of features
	List<Object> createFeatures = new ArrayList<Object>();
	List<Object> deployFeatures = new ArrayList<Object>();
	List<Object> vMachineFeatures = new ArrayList<Object>();
	List<Object> cloudProviderFeatures = new ArrayList<Object>();
	List<Object> deployTypeFeatures = new ArrayList<Object>();
	List<Object> deployAppFeatures = new ArrayList<Object>();
	List<Object> monitorFeatures = new ArrayList<Object>();
	List<Object> stressFeatures = new ArrayList<Object>();
	List<List<Object>> actionsFeatures = new ArrayList<List<Object>>();
	
	public List<Object> getCreateFeatures() {
		return createFeatures;
	}

	public void addCreateFeatures(Object feature) {
		this.createFeatures.add(feature);
	}

	public List<Object> getDeployFeatures() {
		return deployFeatures;
	}

	public void addDeployFeatures(Object feature) {
		this.deployFeatures.add(feature);
	}

	public List<Object> getvMachineFeatures() {
		return vMachineFeatures;
	}

	public void addvMachineFeatures(Object feature) {
		this.vMachineFeatures.add(feature);
	}

	public List<Object> getCloudProviderFeatures() {
		return cloudProviderFeatures;
	}

	public void addCloudProviderFeatures(Object feature) {
		this.cloudProviderFeatures.add(feature);
	}

	public List<Object> getDeployTypeFeatures() {
		return deployTypeFeatures;
	}

	public void addDeployTypeFeatures(Object feature) {
		this.deployTypeFeatures.add(feature);
	}

	public List<Object> getDeployAppFeatures() {
		return deployAppFeatures;
	}

	public void addDeployAppFeatures(Object feature) {
		this.deployAppFeatures.add(feature);
	}

	public List<Object> getMonitorFeatures() {
		return monitorFeatures;
	}

	public void addMonitorFeatures(Object feature) {
		this.monitorFeatures.add(feature);
	}

	public List<Object> getStressFeatures() {
		return stressFeatures;
	}

	public void addStressFeatures(Object feature) {
		this.stressFeatures.add(feature);
	}

	public List<List<Object>> getActionsFeatures() {
		return actionsFeatures;
	}

	public void addActionsFeatures(List<Object> featuresList) {
		this.actionsFeatures.add(featuresList);
	}

	public Interactor(String scaleFile) {
		GiraffeDSLStandaloneSetup.doSetup();
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI(scaleFile);
		res = resourceSet.getResource(uri, true);
	}	
	
	public void doParse() {
		
		// Create
		TreeIterator<EObject> _allContents = res.getAllContents();
	    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
	    Iterable<Create> _filter = Iterables.<Create>filter(_iterable, Create.class);
	    for (final Create c : _filter) {
	      System.out.println(c.getName());
	      // VM feature
	      EList<VirtualMachineFeature> vmList = c.getVMachine();
	      if (vmList.size() > 0) {
		      System.out.println("Feature ("+vmList.get(0).getType().getName().toString()+")");
		      addCreateFeatures(vmList.get(0).getType().getName());
	      }
	      // Init machines
	      EList<InitMachinesFeature> iM = c.getInitMachines();
	      if (iM.size() > 0) {
		      System.out.println("Feature ("+iM.get(0).getType()+")");
		      addCreateFeatures(iM.get(0).getType());
	      }
	      // Init machines
	      EList<InitIncrementFeature> iI = c.getInitIncrement();
	      if (iI.size() > 0) {
		      System.out.println("Feature ("+iI.get(0).getType()+")");
		      addCreateFeatures(iI.get(0).getType());
	      }
	    }
	    
	    // Deploy
	    TreeIterator<EObject> _allContents_1 = res.getAllContents();
	    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
	    Iterable<Deploy> _filter_1 = Iterables.<Deploy>filter(_iterable_1, Deploy.class);
	    for (final Deploy d : _filter_1) {
	    	System.out.println(d.getName());
		      // App feature
		      if (d.getDeployOne().size() > 0) {
			      System.out.println("Feature ("+d.getDeployOne().get(0).getType().getName().toString()+")");
			      addDeployFeatures(d.getDeployOne().get(0).getType().getName());
		      }
		      // Type feature
		      if (d.getDeployTwo().size() > 0) {
		    	  System.out.println("Feature ("+d.getDeployTwo().get(0).getType().getName().toString()+")");
		    	  addDeployFeatures(d.getDeployTwo().get(0).getType().getName());
		      }
	    }
	    
	    // VirtualMachine
	    TreeIterator<EObject> _allContents_2 = res.getAllContents();
	    Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_allContents_2);
	    Iterable<VirtualMachine> _filter_2 = Iterables.<VirtualMachine>filter(_iterable_2, VirtualMachine.class);
	    for (final VirtualMachine v : _filter_2) {
	      System.out.println(v.getName());
	      // CloudProvider feature
	      if (v.getCloudProvider().size() > 0) {
	    	  System.out.println("Feature ("+v.getCloudProvider().get(0).getType().getName().toString()+")");
	    	  addvMachineFeatures(v.getCloudProvider().get(0).getType().getName());
	      }
	      // VirtualMachine feature
	      if (v.getVM().size() > 0) {
	    	  System.out.println("Feature ("+new String(v.getVM().get(0).getType().getBytes())+")");
	    	  addvMachineFeatures(new String(v.getVM().get(0).getType().getBytes()));
	      }
	    }
	    
	    // CloudProvider
	    TreeIterator<EObject> _allContents_3 = res.getAllContents();
	    Iterable<EObject> _iterable_3 = IteratorExtensions.<EObject>toIterable(_allContents_3);
	    Iterable<CloudProvider> _filter_3 = Iterables.<CloudProvider>filter(_iterable_3, CloudProvider.class);
	    for (final CloudProvider cl : _filter_3) {
	      System.out.println(cl.getName());
	      // CloudType feature
	      if (cl.getCloudType().size() > 0) {
	    	  System.out.println("Feature ("+new String(cl.getCloudType().get(0).getType().getBytes())+")");
	    	  addCloudProviderFeatures(new String(cl.getCloudType().get(0).getType().getBytes()));
	      }
	      // MgmAddress feature
	      if (cl.getCloudAddress().size() > 0) {
	    	  System.out.println("Feature ("+new String(cl.getCloudAddress().get(0).getType().getBytes())+")");
	    	  addCloudProviderFeatures(new String(cl.getCloudAddress().get(0).getType().getBytes()));
	      }
	      // Credential feature
	      if (cl.getCloudCredential().size() > 0) {
	    	  System.out.println("Feature ("+new String(cl.getCloudCredential().get(0).getType().getBytes())+")");
	    	  addCloudProviderFeatures(new String(cl.getCloudCredential().get(0).getType().getBytes()));
	      }
	      // Optional features
	      for (int i=0; i<cl.getCloudOptionalTypes().size(); i++) {
	    	  System.out.println("Feature ( name: "+cl.getCloudOptionalTypes().get(i).getName()+" | type: "+new String(cl.getCloudOptionalTypes().get(i).getType().getBytes())+" )");
	    	  addCloudProviderFeatures(new String(cl.getCloudOptionalTypes().get(i).getType().getBytes()));
	      }
	    }
	    
	    // DeployType
	    TreeIterator<EObject> _allContents_4 = res.getAllContents();
	    Iterable<EObject> _iterable_4 = IteratorExtensions.<EObject>toIterable(_allContents_4);
	    Iterable<DeployType> _filter_4 = Iterables.<DeployType>filter(_iterable_4, DeployType.class);
	    for (final DeployType dt : _filter_4) {
	      System.out.println(dt.getName());
	      // Range feature
	      System.out.println("Feature ("+new String(dt.getRange().get(0).getType().getBytes())+")");
	      addDeployTypeFeatures(new String(dt.getRange().get(0).getType().getBytes()));
	    }
	    
	    // DeployApp
	    TreeIterator<EObject> _allContents_5 = res.getAllContents();
	    Iterable<EObject> _iterable_5 = IteratorExtensions.<EObject>toIterable(_allContents_5);
	    Iterable<DeployApp> _filter_5 = Iterables.<DeployApp>filter(_iterable_5, DeployApp.class);
	    for (final DeployApp da : _filter_5) {
	      System.out.println(da.getName());
	      // MasterMethod feature
	      if (da.getDeployMasterMethod().size() > 0) {
	    	  DeployAppMasterMethodType dmmF = da.getDeployMasterMethod().get(0);
	    	  System.out.println("Feature ("+new String(dmmF.getType().getBytes())+")");
	    	  addDeployAppFeatures(new String(dmmF.getType().getBytes()));
	      }
	      // SlaveMethod feature
	      if (da.getDeploySlaveMethod().size() > 0) {
	    	  DeployAppSlaveMethodType dsmF = da.getDeploySlaveMethod().get(0);
	    	  System.out.println("Feature ("+new String(dsmF.getType().getBytes())+")");
	    	  addDeployAppFeatures(new String(dsmF.getType().getBytes()));
	      }
	    }
	    
	    // Monitor
	    TreeIterator<EObject> _allContents_6 = res.getAllContents();
	    Iterable<EObject> _iterable_6 = IteratorExtensions.<EObject>toIterable(_allContents_6);
	    Iterable<Monitor> _filter_6 = Iterables.<Monitor>filter(_iterable_6, Monitor.class);
	    for (final Monitor m : _filter_6) {
	      System.out.println(m.getName());
	      // MonitorType feature
	      if (m.getMonitoringType().size() > 0) {
	    	  MonitoringType monF = m.getMonitoringType().get(0);
	    	  System.out.println("Feature ("+new String(monF.getType().getBytes())+")");
	    	  addMonitorFeatures(new String(monF.getType().getBytes()));
	      }
	      // Reange feature
	      if (m.getRange().size()>0) {
	    	  System.out.println("Feature ("+new String(m.getRange().get(0).getType().getBytes())+")");
	    	  addMonitorFeatures(new String(m.getRange().get(0).getType().getBytes()));
	      }
	    }
	    
	    // Stress
	    TreeIterator<EObject> _allContents_7 = res.getAllContents();
	    Iterable<EObject> _iterable_7 = IteratorExtensions.<EObject>toIterable(_allContents_7);
	    Iterable<Stress> _filter_7 = Iterables.<Stress>filter(_iterable_7, Stress.class);
	    for (final Stress s : _filter_7) {
	      System.out.println(s.getName());
	      // StressClass feature
	      if (s.getStressClass().size() > 0) {
	    	  System.out.println("Feature ("+new String(s.getStressClass().get(0).getType().getBytes())+")");
	    	  addStressFeatures(new String(s.getStressClass().get(0).getType().getBytes()));
	      }
	      // MethodClass feature
	      if (s.getStressMethod().size() > 0) {
	    	  System.out.println("Feature ("+new String(s.getStressMethod().get(0).getType().getBytes())+")");
	    	  addStressFeatures(new String(s.getStressMethod().get(0).getType().getBytes()));
	      }
	      // Range feature
	      if (s.getRange().size() > 0) {
	    	  System.out.println("Feature ("+new String(s.getRange().get(0).getType().getBytes())+")");
	    	  addStressFeatures(new String(s.getRange().get(0).getType().getBytes()));
	      }
	    }
	    
	    // Action
	    TreeIterator<EObject> _allContents_8 = res.getAllContents();
	    Iterable<EObject> _iterable_8 = IteratorExtensions.<EObject>toIterable(_allContents_8);
	    Iterable<Action> _filter_8 = Iterables.<Action>filter(_iterable_8, Action.class);
	    for (final Action a : _filter_8) {
	      System.out.println(a.getName());
	      List<Object> listActions = new ArrayList<Object>();
	      // Range feature
	      if (a.getRange().size() > 0) {
	    	  System.out.println("Feature ("+new String(a.getRange().get(0).getType().getBytes())+")");
	    	  listActions.add(new String(a.getRange().get(0).getType().getBytes()));
	      }
	      // Class feature
	      if (a.getClass_().size() > 0) {
	    	  System.out.println("Feature ("+new String(a.getClass_().get(0).getType().getBytes())+")");
	    	  listActions.add(new String(a.getClass_().get(0).getType().getBytes()));
	      }
	      // Method feature
	      if (a.getMethod().size() > 0) {
	    	  System.out.println("Feature ("+new String(a.getMethod().get(0).getType().getBytes())+")");
	    	  listActions.add(new String(a.getMethod().get(0).getType().getBytes()));
	      }
	      if (listActions.size() > 0) {
	    	  addActionsFeatures(listActions);
	      }
	    }
	}
	
	public static void main(String args[]) {
	/*
		if (args.length < 1) {
			System.out.println("The scale specification needs to be specified:\n"
					+ "<<java -jar GiraffeDSL.jar fr.mines_nantes.atlanmod.dsl.GiraffeDSL.Interactor Scale.gsf>>");
		} else {
			//Interactor stnd = new Interactor("src/MichelSample.mydsl");
			Interactor stnd = new Interactor(args[0]);
			stnd.doParse();
		}
	*/
	}
	
}
