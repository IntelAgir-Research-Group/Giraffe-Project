package fr.mines_nantes.atlanmod.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudPasswordType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudUserType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DomainModel;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Features;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.GeoZoneType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.IntFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.ScriptType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature;
import fr.mines_nantes.atlanmod.dsl.services.GiraffeDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GiraffeDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GiraffeDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GiraffeDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GiraffeDSLPackage.ACTION:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.ACTION_CLASS_TYPE:
				if(context == grammarAccess.getActionClassTypeRule()) {
					sequence_ActionClassType(context, (ActionClassType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.ACTION_METHOD_TYPE:
				if(context == grammarAccess.getActionMethodTypeRule()) {
					sequence_ActionMethodType(context, (ActionMethodType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.ACTION_RANGE_TYPE:
				if(context == grammarAccess.getActionRangeTypeRule()) {
					sequence_ActionRangeType(context, (ActionRangeType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CLOUD_CREDENTIAL_TYPE:
				if(context == grammarAccess.getCloudCredentialTypeRule()) {
					sequence_CloudCredentialType(context, (CloudCredentialType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CLOUD_PASSWORD_TYPE:
				if(context == grammarAccess.getCloudOptionalTypesRule() ||
				   context == grammarAccess.getCloudPasswordTypeRule()) {
					sequence_CloudPasswordType(context, (CloudPasswordType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CLOUD_PROVIDER:
				if(context == grammarAccess.getCloudProviderRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_CloudProvider(context, (CloudProvider) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE:
				if(context == grammarAccess.getCloudProviderTypeRule()) {
					sequence_CloudProviderType(context, (CloudProviderType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CLOUD_TYPE:
				if(context == grammarAccess.getCloudTypeRule()) {
					sequence_CloudType(context, (CloudType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CLOUD_USER_TYPE:
				if(context == grammarAccess.getCloudOptionalTypesRule() ||
				   context == grammarAccess.getCloudUserTypeRule()) {
					sequence_CloudUserType(context, (CloudUserType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CREATE:
				if(context == grammarAccess.getCreateRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Create(context, (Create) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOY:
				if(context == grammarAccess.getDeployRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Deploy(context, (Deploy) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOY_APP:
				if(context == grammarAccess.getDeployAppRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DeployApp(context, (DeployApp) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOY_APP_CLASS_TYPE:
				if(context == grammarAccess.getDeployAppClassTypeRule()) {
					sequence_DeployAppClassType(context, (DeployAppClassType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOY_APP_FEATURE:
				if(context == grammarAccess.getDeployAppFeatureRule()) {
					sequence_DeployAppFeature(context, (DeployAppFeature) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOY_APP_MASTER_METHOD_TYPE:
				if(context == grammarAccess.getDeployAppMasterMethodTypeRule()) {
					sequence_DeployAppMasterMethodType(context, (DeployAppMasterMethodType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOY_APP_SLAVE_METHOD_TYPE:
				if(context == grammarAccess.getDeployAppSlaveMethodTypeRule()) {
					sequence_DeployAppSlaveMethodType(context, (DeployAppSlaveMethodType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOY_RANGE_TYPE:
				if(context == grammarAccess.getDeployRangeTypeRule()) {
					sequence_DeployRangeType(context, (DeployRangeType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOY_TYPE:
				if(context == grammarAccess.getDeployTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DeployType(context, (DeployType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOY_TYPE_FEATURE:
				if(context == grammarAccess.getDeployTypeFeatureRule()) {
					sequence_DeployTypeFeature(context, (DeployTypeFeature) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DOMAIN_MODEL:
				if(context == grammarAccess.getDomainModelRule()) {
					sequence_DomainModel(context, (DomainModel) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.FEATURES:
				if(context == grammarAccess.getFeaturesRule()) {
					sequence_Features(context, (Features) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.GEO_ZONE_TYPE:
				if(context == grammarAccess.getCloudOptionalTypesRule() ||
				   context == grammarAccess.getGeoZoneTypeRule()) {
					sequence_GeoZoneType(context, (GeoZoneType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.INIT_INCREMENT_FEATURE:
				if(context == grammarAccess.getInitIncrementFeatureRule()) {
					sequence_InitIncrementFeature(context, (InitIncrementFeature) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.INIT_MACHINES_FEATURE:
				if(context == grammarAccess.getInitMachinesFeatureRule()) {
					sequence_InitMachinesFeature(context, (InitMachinesFeature) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.INT_FEATURE:
				if(context == grammarAccess.getIntFeatureRule()) {
					sequence_IntFeature(context, (IntFeature) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.MGM_ADDRESS_TYPE:
				if(context == grammarAccess.getMgmAddressTypeRule()) {
					sequence_MgmAddressType(context, (MgmAddressType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.MONITOR:
				if(context == grammarAccess.getMonitorRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Monitor(context, (Monitor) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.MONITOR_RANGE_TYPE:
				if(context == grammarAccess.getMonitorRangeTypeRule()) {
					sequence_MonitorRangeType(context, (MonitorRangeType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.MONITORING_TYPE:
				if(context == grammarAccess.getMonitoringTypeRule()) {
					sequence_MonitoringType(context, (MonitoringType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.SCRIPT_TYPE:
				if(context == grammarAccess.getCloudOptionalTypesRule() ||
				   context == grammarAccess.getScriptTypeRule()) {
					sequence_ScriptType(context, (ScriptType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.STRESS:
				if(context == grammarAccess.getStressRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Stress(context, (Stress) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.STRESS_CLASS_TYPE:
				if(context == grammarAccess.getStressClassTypeRule()) {
					sequence_StressClassType(context, (StressClassType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.STRESS_METHOD_TYPE:
				if(context == grammarAccess.getStressMethodTypeRule()) {
					sequence_StressMethodType(context, (StressMethodType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.STRESS_RANGE_TYPE:
				if(context == grammarAccess.getStressRangeTypeRule()) {
					sequence_StressRangeType(context, (StressRangeType) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.VIRTUAL_MACHINE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVirtualMachineRule()) {
					sequence_VirtualMachine(context, (VirtualMachine) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.VIRTUAL_MACHINE_FEATURE:
				if(context == grammarAccess.getVirtualMachineFeatureRule()) {
					sequence_VirtualMachineFeature(context, (VirtualMachineFeature) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.VIRTUAL_MACHINE_TYPE_FEATURE:
				if(context == grammarAccess.getVirtualMachineTypeFeatureRule()) {
					sequence_VirtualMachineTypeFeature(context, (VirtualMachineTypeFeature) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (many='many'? name='class' type=STRING)
	 */
	protected void sequence_ActionClassType(EObject context, ActionClassType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='method' type=STRING)
	 */
	protected void sequence_ActionMethodType(EObject context, ActionMethodType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='range' type=STRING)
	 */
	protected void sequence_ActionRangeType(EObject context, ActionRangeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID range+=ActionRangeType class+=ActionClassType method+=ActionMethodType)
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='cloudCredential' type=STRING)
	 */
	protected void sequence_CloudCredentialType(EObject context, CloudCredentialType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='cloudPassword' type=STRING)
	 */
	protected void sequence_CloudPasswordType(EObject context, CloudPasswordType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='cloudProvider' type=[CloudProvider|ID])
	 */
	protected void sequence_CloudProviderType(EObject context, CloudProviderType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID cloudType+=CloudType cloudAddress+=MgmAddressType cloudCredential+=CloudCredentialType cloudOptionalTypes+=CloudOptionalTypes*)
	 */
	protected void sequence_CloudProvider(EObject context, CloudProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='cloudType' (type='G5000' | type='AmazonEC2' | type='Google' | type='VirtualBox'))
	 */
	protected void sequence_CloudType(EObject context, CloudType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='cloudUser' type=STRING)
	 */
	protected void sequence_CloudUserType(EObject context, CloudUserType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID vMachine+=VirtualMachineFeature initMachines+=InitMachinesFeature initIncrement+=InitIncrementFeature)
	 */
	protected void sequence_Create(EObject context, Create semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='class' type=STRING)
	 */
	protected void sequence_DeployAppClassType(EObject context, DeployAppClassType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='deployApp' type=[DeployApp|ID])
	 */
	protected void sequence_DeployAppFeature(EObject context, DeployAppFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='deployMasterMethod' type=STRING)
	 */
	protected void sequence_DeployAppMasterMethodType(EObject context, DeployAppMasterMethodType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='deploySlaveMethod' type=STRING)
	 */
	protected void sequence_DeployAppSlaveMethodType(EObject context, DeployAppSlaveMethodType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID class+=DeployAppClassType deployMasterMethod+=DeployAppMasterMethodType* deploySlaveMethod+=DeployAppSlaveMethodType*)
	 */
	protected void sequence_DeployApp(EObject context, DeployApp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='range' type=STRING)
	 */
	protected void sequence_DeployRangeType(EObject context, DeployRangeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='deployType' type=[DeployType|ID])
	 */
	protected void sequence_DeployTypeFeature(EObject context, DeployTypeFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID range+=DeployRangeType)
	 */
	protected void sequence_DeployType(EObject context, DeployType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID deployOne+=DeployAppFeature deployTwo+=DeployTypeFeature?)
	 */
	protected void sequence_Deploy(EObject context, Deploy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Type*
	 */
	protected void sequence_DomainModel(EObject context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Features(EObject context, Features semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.FEATURES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.FEATURES__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeaturesAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='geoZone' type=STRING)
	 */
	protected void sequence_GeoZoneType(EObject context, GeoZoneType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='initialIncrement' type=INT)
	 */
	protected void sequence_InitIncrementFeature(EObject context, InitIncrementFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='initialMachines' type=INT)
	 */
	protected void sequence_InitMachinesFeature(EObject context, InitMachinesFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_IntFeature(EObject context, IntFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.INT_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.INT_FEATURE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntFeatureAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='cloudMgmAddress' type=STRING)
	 */
	protected void sequence_MgmAddressType(EObject context, MgmAddressType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='range' type=STRING)
	 */
	protected void sequence_MonitorRangeType(EObject context, MonitorRangeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID range+=MonitorRangeType monitoringType+=MonitoringType?)
	 */
	protected void sequence_Monitor(EObject context, Monitor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='monitoringType' (type='reactive' | type='predictive'))
	 */
	protected void sequence_MonitoringType(EObject context, MonitoringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='newMachinesScript' type=STRING)
	 */
	protected void sequence_ScriptType(EObject context, ScriptType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='stressClass' type=STRING)
	 */
	protected void sequence_StressClassType(EObject context, StressClassType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='stressMethod' type=STRING)
	 */
	protected void sequence_StressMethodType(EObject context, StressMethodType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='range' type=STRING)
	 */
	protected void sequence_StressRangeType(EObject context, StressRangeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID range+=StressRangeType stressClass+=StressClassType* stressMethod+=StressMethodType*)
	 */
	protected void sequence_Stress(EObject context, Stress semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='vMachine' type=[VirtualMachine|ID])
	 */
	protected void sequence_VirtualMachineFeature(EObject context, VirtualMachineFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many='many'? name='vM' (type='Linux1-CloudTest' | type='Small'))
	 */
	protected void sequence_VirtualMachineTypeFeature(EObject context, VirtualMachineTypeFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID vM+=VirtualMachineTypeFeature cloudProvider+=CloudProviderType)
	 */
	protected void sequence_VirtualMachine(EObject context, VirtualMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
