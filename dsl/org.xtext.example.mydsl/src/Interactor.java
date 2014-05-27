import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.generator.MyDslGenerator;
import org.xtext.example.mydsl.myDsl.Action;
import org.xtext.example.mydsl.myDsl.CloudCredentialType;
import org.xtext.example.mydsl.myDsl.CloudOptionalTypes;
import org.xtext.example.mydsl.myDsl.CloudProvider;
import org.xtext.example.mydsl.myDsl.CloudProviderType;
import org.xtext.example.mydsl.myDsl.CloudType;
import org.xtext.example.mydsl.myDsl.Create;
import org.xtext.example.mydsl.myDsl.Deploy;
import org.xtext.example.mydsl.myDsl.DeployApp;
import org.xtext.example.mydsl.myDsl.DeployAppFeature;
import org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType;
import org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType;
import org.xtext.example.mydsl.myDsl.DeployRangeType;
import org.xtext.example.mydsl.myDsl.DeployType;
import org.xtext.example.mydsl.myDsl.DeployTypeFeature;
import org.xtext.example.mydsl.myDsl.InitIncrementFeature;
import org.xtext.example.mydsl.myDsl.InitMachinesFeature;
import org.xtext.example.mydsl.myDsl.MgmAddressType;
import org.xtext.example.mydsl.myDsl.Monitor;
import org.xtext.example.mydsl.myDsl.MonitoringType;
import org.xtext.example.mydsl.myDsl.Stress;
import org.xtext.example.mydsl.myDsl.VirtualMachine;
import org.xtext.example.mydsl.myDsl.VirtualMachineFeature;
import org.xtext.example.mydsl.myDsl.VirtualMachineTypeFeature;

import com.google.common.collect.Iterables;


public class Standalone extends MyDslGenerator {

	static Resource res = null;
	
	public void doParse(final Resource resource) {
		
		// Create
		TreeIterator<EObject> _allContents = resource.getAllContents();
	    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
	    Iterable<Create> _filter = Iterables.<Create>filter(_iterable, Create.class);
	    for (final Create c : _filter) {
	      System.out.println(c.getName());
	      // VM feature
	      EList<VirtualMachineFeature> vmList = c.getVMachine();
	      if (vmList.size() > 0) {
	    	  VirtualMachineFeature vmF = vmList.get(0);
		      System.out.println("Feature ("+vmF.getType().getName().toString()+")");
	      }
	      // Init machines
	      EList<InitMachinesFeature> iM = c.getInitMachines();
	      if (iM.size() > 0) {
	    	  InitMachinesFeature imF = iM.get(0);
		      System.out.println("Feature ("+imF.getType()+")");
	      }
	      // Init machines
	      EList<InitIncrementFeature> iI = c.getInitIncrement();
	      if (iI.size() > 0) {
	    	  InitIncrementFeature iiF = iI.get(0);
		      System.out.println("Feature ("+iiF.getType()+")");
	      }
	    }
	    
	    // Deploy
	    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
	    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
	    Iterable<Deploy> _filter_1 = Iterables.<Deploy>filter(_iterable_1, Deploy.class);
	    for (final Deploy d : _filter_1) {
	    	System.out.println(d.getName());
		      EList<DeployAppFeature> daf = d.getDeployOne();
		      EList<DeployTypeFeature> dtf = d.getDeployTwo();
		      // App feature
		      if (daf.size() > 0) {
			      DeployAppFeature df = daf.get(0);
			      System.out.println("Feature ("+df.getType().getName().toString()+")");
		      }
		      // Type feature
		      if (dtf.size() > 0) {
		    	  DeployTypeFeature dttf = dtf.get(0);
		    	  System.out.println("Feature ("+dttf.getType().getName().toString()+")");
		      }
	    }
	    
	    // VirtualMachine
	    TreeIterator<EObject> _allContents_2 = resource.getAllContents();
	    Iterable<EObject> _iterable_2 = IteratorExtensions.<EObject>toIterable(_allContents_2);
	    Iterable<VirtualMachine> _filter_2 = Iterables.<VirtualMachine>filter(_iterable_2, VirtualMachine.class);
	    for (final VirtualMachine v : _filter_2) {
	      System.out.println(v.getName());
	      // CloudProvider feature
	      EList<CloudProviderType> cP = v.getCloudProvider();
	      if (cP.size() > 0) {
	    	  CloudProviderType cpF = cP.get(0);
	    	  System.out.println("Feature ("+cpF.getType().getName().toString()+")");
	      }
	      // VirtualMachine feature
	      EList<VirtualMachineTypeFeature> vM = v.getVM();
	      if (vM.size() > 0) {
	    	  VirtualMachineTypeFeature vmF = vM.get(0);
	    	  String vmType = new String(vmF.getType().getBytes());
	    	  System.out.println("Feature ("+vmType+")");
	      }
	    }
	    
	    // CloudProvider
	    TreeIterator<EObject> _allContents_3 = resource.getAllContents();
	    Iterable<EObject> _iterable_3 = IteratorExtensions.<EObject>toIterable(_allContents_3);
	    Iterable<CloudProvider> _filter_3 = Iterables.<CloudProvider>filter(_iterable_3, CloudProvider.class);
	    for (final CloudProvider cl : _filter_3) {
	      System.out.println(cl.getName());
	      // CloudType feature
	      EList<CloudType> cT = cl.getCloudType();
	      if (cT.size() > 0) {
	    	  CloudType ctF = cT.get(0);
	    	  System.out.println("Feature ("+new String(ctF.getType().getBytes())+")");
	      }
	      // MgmAddress feature
	      EList<MgmAddressType> mt = cl.getCloudAddress();
	      if (mt.size() > 0) {
	    	  MgmAddressType mtF = mt.get(0);
	    	  System.out.println("Feature ("+new String(mtF.getType().getBytes())+")");
	      }
	      // Credential feature
	      EList<CloudCredentialType> cc = cl.getCloudCredential();
	      if (cc.size() > 0) {
	    	  CloudCredentialType ccF = cc.get(0);
	    	  System.out.println("Feature ("+new String(ccF.getType().getBytes())+")");
	      }
	      // Optional features
	      EList<CloudOptionalTypes> co = cl.getCloudOptionalTypes();
	      for (int i=0; i<co.size(); i++) {
	    	  String name = co.get(i).getName();
	    	  String type = new String(co.get(i).getType().getBytes());
	    	  System.out.println("Feature ( name: "+name+" | type: "+type+" )");
	      }
	    }
	    
	    // DeployType
	    TreeIterator<EObject> _allContents_4 = resource.getAllContents();
	    Iterable<EObject> _iterable_4 = IteratorExtensions.<EObject>toIterable(_allContents_4);
	    Iterable<DeployType> _filter_4 = Iterables.<DeployType>filter(_iterable_4, DeployType.class);
	    for (final DeployType dt : _filter_4) {
	      System.out.println(dt.getName());
	      // Range feature
	      DeployRangeType dr = dt.getRange().get(0);
	      System.out.println("Feature ("+new String(dr.getType().getBytes())+")");
	    }
	    
	    // DeployApp
	    TreeIterator<EObject> _allContents_5 = resource.getAllContents();
	    Iterable<EObject> _iterable_5 = IteratorExtensions.<EObject>toIterable(_allContents_5);
	    Iterable<DeployApp> _filter_5 = Iterables.<DeployApp>filter(_iterable_5, DeployApp.class);
	    for (final DeployApp da : _filter_5) {
	      System.out.println(da.getName());
	      // MasterMethod feature
	      if (da.getDeployMasterMethod().size() > 0) {
	    	  DeployAppMasterMethodType dmmF = da.getDeployMasterMethod().get(0);
	    	  System.out.println("Feature ("+new String(dmmF.getType().getBytes())+")");
	      }
	      // SlaveMethod feature
	      if (da.getDeploySlaveMethod().size() > 0) {
	    	  DeployAppSlaveMethodType dsmF = da.getDeploySlaveMethod().get(0);
	    	  System.out.println("Feature ("+new String(dsmF.getType().getBytes())+")");
	      }
	    }
	    
	    // Monitor
	    TreeIterator<EObject> _allContents_6 = resource.getAllContents();
	    Iterable<EObject> _iterable_6 = IteratorExtensions.<EObject>toIterable(_allContents_6);
	    Iterable<Monitor> _filter_6 = Iterables.<Monitor>filter(_iterable_6, Monitor.class);
	    for (final Monitor m : _filter_6) {
	      System.out.println(m.getName());
	      // MonitorType feature
	      if (m.getMonitoringType().size() > 0) {
	    	  MonitoringType monF = m.getMonitoringType().get(0);
	    	  System.out.println("Feature ("+new String(monF.getType().getBytes())+")");
	      }
	      // Reange feature
	      if (m.getRange().size()>0) {
	    	  System.out.println("Feature ("+new String(m.getRange().get(0).getType().getBytes())+")");
	      }
	    }
	    
	    // Stress
	    TreeIterator<EObject> _allContents_7 = resource.getAllContents();
	    Iterable<EObject> _iterable_7 = IteratorExtensions.<EObject>toIterable(_allContents_7);
	    Iterable<Stress> _filter_7 = Iterables.<Stress>filter(_iterable_7, Stress.class);
	    for (final Stress s : _filter_7) {
	      System.out.println(s.getName());
	      // StressClass feature
	      if (s.getStressClass().size() > 0) {
	    	  System.out.println("Feature ("+new String(s.getStressClass().get(0).getType().getBytes())+")");
	      }
	      // MethodClass feature
	      if (s.getStressMethod().size() > 0) {
	    	  System.out.println("Feature ("+new String(s.getStressMethod().get(0).getType().getBytes())+")");
	      }
	      // Range feature
	      if (s.getRange().size() > 0) {
	    	  System.out.println("Feature ("+new String(s.getRange().get(0).getType().getBytes())+")");
	      }
	    }
	    
	    // Action
	    TreeIterator<EObject> _allContents_8 = resource.getAllContents();
	    Iterable<EObject> _iterable_8 = IteratorExtensions.<EObject>toIterable(_allContents_8);
	    Iterable<Action> _filter_8 = Iterables.<Action>filter(_iterable_8, Action.class);
	    for (final Action a : _filter_8) {
	      System.out.println(a.getName());
	      // Range feature
	      if (a.getRange().size() > 0) {
	    	  System.out.println("Feature ("+new String(a.getRange().get(0).getType().getBytes())+")");
	      }
	      // Class feature
	      if (a.getClass_().size() > 0) {
	    	  System.out.println("Feature ("+new String(a.getClass_().get(0).getType().getBytes())+")");
	      }
	      // Method feature
	      if (a.getMethod().size() > 0) {
	    	  System.out.println("Feature ("+new String(a.getMethod().get(0).getType().getBytes())+")");
	      }
	    }
	}
	
	public static void main(String args[]) {
		if (args.length < 1) {
			System.out.println("The scale specification (File.mydsl) needs to be specified!");
		} else {
			MyDslStandaloneSetup.doSetup();
			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = URI.createFileURI("src/MichelSample.mydsl");
			res = resourceSet.getResource(uri, true);
			Standalone stnd = new Standalone();
			stnd.doParse(res);
		}
	}
	
}
