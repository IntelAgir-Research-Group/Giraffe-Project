package fr.mines_nantes.atlanmod.giraffe.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Code;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Config;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfigBlock;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Import;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Key;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Script;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptBlock;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptCommand;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine;
import fr.mines_nantes.atlanmod.giraffe.services.GiraffeDSLGrammarAccess;
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
			case GiraffeDSLPackage.CODE:
				if(context == grammarAccess.getArtifactRule() ||
				   context == grammarAccess.getCodeRule()) {
					sequence_Code(context, (Code) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CODE_EXTERNAL:
				if(context == grammarAccess.getArtifactRule() ||
				   context == grammarAccess.getCodeExternalRule()) {
					sequence_CodeExternal(context, (CodeExternal) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CONFIG:
				if(context == grammarAccess.getConfArtifactRule() ||
				   context == grammarAccess.getConfigRule()) {
					sequence_Config(context, (Config) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CONFIG_BLOCK:
				if(context == grammarAccess.getConfArtifactRule() ||
				   context == grammarAccess.getConfigBlockRule()) {
					sequence_ConfigBlock(context, (ConfigBlock) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.CREDENTIAL:
				if(context == grammarAccess.getAuthRule() ||
				   context == grammarAccess.getCredentialRule()) {
					sequence_Credential(context, (Credential) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOY:
				if(context == grammarAccess.getDeployRule()) {
					sequence_Deploy(context, (Deploy) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOYMENT:
				if(context == grammarAccess.getDeploymentRule()) {
					sequence_Deployment(context, (Deployment) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS:
				if(context == grammarAccess.getDeploymentDefinitionsRule()) {
					sequence_DeploymentDefinitions(context, (DeploymentDefinitions) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.ENVIRONMENT:
				if(context == grammarAccess.getEnvironmentRule()) {
					sequence_Environment(context, (Environment) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.EXECUTION:
				if(context == grammarAccess.getExecutionRule()) {
					sequence_Execution(context, (Execution) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.FILE:
				if(context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getFileRule()) {
					sequence_File(context, (File) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.GIRAFFE_META_MODEL:
				if(context == grammarAccess.getGiraffeMetaModelRule()) {
					sequence_GiraffeMetaModel(context, (GiraffeMetaModel) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.INSTALL:
				if(context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getInstallRule()) {
					sequence_Install(context, (Install) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.KEY:
				if(context == grammarAccess.getAuthRule() ||
				   context == grammarAccess.getKeyRule()) {
					sequence_Key(context, (Key) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.NODESET:
				if(context == grammarAccess.getNodesetRule()) {
					sequence_Nodeset(context, (Nodeset) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.OTHER_PROVIDER:
				if(context == grammarAccess.getOtherProviderRule() ||
				   context == grammarAccess.getProvidersRule()) {
					sequence_OtherProvider(context, (OtherProvider) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.PASSWORD:
				if(context == grammarAccess.getAuthRule() ||
				   context == grammarAccess.getPasswordRule()) {
					sequence_Password(context, (Password) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.PROVIDER:
				if(context == grammarAccess.getProviderRule() ||
				   context == grammarAccess.getProvidersRule()) {
					sequence_Provider(context, (fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.REQUERIMENTS:
				if(context == grammarAccess.getRequerimentsRule()) {
					sequence_Requeriments(context, (Requeriments) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.RESOURCE:
				if(context == grammarAccess.getResourceRule()) {
					sequence_Resource(context, (Resource) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.SCRIPT:
				if(context == grammarAccess.getArtifactRule() ||
				   context == grammarAccess.getScriptRule()) {
					sequence_Script(context, (Script) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.SCRIPT_BLOCK:
				if(context == grammarAccess.getArtifactRule() ||
				   context == grammarAccess.getScriptBlockRule()) {
					sequence_ScriptBlock(context, (ScriptBlock) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.SCRIPT_COMMAND:
				if(context == grammarAccess.getArtifactRule() ||
				   context == grammarAccess.getScriptCommandRule()) {
					sequence_ScriptCommand(context, (ScriptCommand) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.SERVICE:
				if(context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.SETUP:
				if(context == grammarAccess.getSetupRule()) {
					sequence_Setup(context, (Setup) semanticObject); 
					return; 
				}
				else break;
			case GiraffeDSLPackage.VIRTUAL_MACHINE:
				if(context == grammarAccess.getVirtualMachineRule()) {
					sequence_VirtualMachine(context, (VirtualMachine) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (type='code-external' name=EString class=EString method=EString)
	 */
	protected void sequence_CodeExternal(EObject context, CodeExternal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CODE_EXTERNAL__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CODE_EXTERNAL__CLASS));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CODE_EXTERNAL__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CODE_EXTERNAL__METHOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCodeExternalAccess().getTypeCodeExternalKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCodeExternalAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCodeExternalAccess().getClassEStringParserRuleCall_4_0(), semanticObject.getClass_());
		feeder.accept(grammarAccess.getCodeExternalAccess().getMethodEStringParserRuleCall_6_0(), semanticObject.getMethod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='code' name=EString code=EString)
	 */
	protected void sequence_Code(EObject context, Code semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CODE__CODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CODE__CODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCodeAccess().getTypeCodeKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCodeAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCodeAccess().getCodeEStringParserRuleCall_5_0(), semanticObject.getCode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='config-block' name=EString destFile=EString config=EString)
	 */
	protected void sequence_ConfigBlock(EObject context, ConfigBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__DEST_FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__DEST_FILE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CONFIG_BLOCK__CONFIG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CONFIG_BLOCK__CONFIG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConfigBlockAccess().getTypeConfigBlockKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConfigBlockAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConfigBlockAccess().getDestFileEStringParserRuleCall_4_0(), semanticObject.getDestFile());
		feeder.accept(grammarAccess.getConfigBlockAccess().getConfigEStringParserRuleCall_6_0(), semanticObject.getConfig());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='config' name=EString localFile=EString destFile=EString)
	 */
	protected void sequence_Config(EObject context, Config semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__DEST_FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CONF_ARTIFACT__DEST_FILE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CONFIG__LOCAL_FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CONFIG__LOCAL_FILE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConfigAccess().getTypeConfigKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConfigAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConfigAccess().getLocalFileEStringParserRuleCall_4_0(), semanticObject.getLocalFile());
		feeder.accept(grammarAccess.getConfigAccess().getDestFileEStringParserRuleCall_5_0(), semanticObject.getDestFile());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='credential' name=EString credentialFile=EString)
	 */
	protected void sequence_Credential(EObject context, Credential semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.AUTH__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.AUTH__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.AUTH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.AUTH__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.CREDENTIAL__CREDENTIAL_FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.CREDENTIAL__CREDENTIAL_FILE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCredentialAccess().getTypeCredentialKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCredentialAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCredentialAccess().getCredentialFileEStringParserRuleCall_4_0(), semanticObject.getCredentialFile());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString setups+=[Setup|ID]* timeout=EInt executions+=Execution*)
	 */
	protected void sequence_Deploy(EObject context, Deploy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((artifacts+=Artifact | artifacts+=ConfArtifact)* nodesets+=Nodeset*)
	 */
	protected void sequence_DeploymentDefinitions(EObject context, DeploymentDefinitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (setups=Setup deploys=Deploy)
	 */
	protected void sequence_Deployment(EObject context, Deployment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.DEPLOYMENT__SETUPS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.DEPLOYMENT__SETUPS));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.DEPLOYMENT__DEPLOYS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.DEPLOYMENT__DEPLOYS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeploymentAccess().getSetupsSetupParserRuleCall_2_0(), semanticObject.getSetups());
		feeder.accept(grammarAccess.getDeploymentAccess().getDeploysDeployParserRuleCall_3_0(), semanticObject.getDeploys());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (auths+=Auth* resources+=Resource* dependencies+=Dependency* virtualmachines+=VirtualMachine* providers+=Providers*)
	 */
	protected void sequence_Environment(EObject context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString code=[Artifact|ID] config+=[ConfArtifact|ID]? nodes=[Nodeset|ID] seq=EInt)
	 */
	protected void sequence_Execution(EObject context, Execution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='file' fileType=FileType name=EString location=EString)
	 */
	protected void sequence_File(EObject context, File semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.FILE__FILE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.FILE__FILE_TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.FILE__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.FILE__LOCATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFileAccess().getTypeFileKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getFileAccess().getFileTypeFileTypeEnumRuleCall_2_0(), semanticObject.getFileType());
		feeder.accept(grammarAccess.getFileAccess().getNameEStringParserRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFileAccess().getLocationEStringParserRuleCall_5_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* environment=Environment deploymentdefinitions=DeploymentDefinitions deployment=Deployment)
	 */
	protected void sequence_GiraffeMetaModel(EObject context, GiraffeMetaModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='install' name=EString depName=EString depVersion=EFloat)
	 */
	protected void sequence_Install(EObject context, Install semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.INSTALL__DEP_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.INSTALL__DEP_NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.INSTALL__DEP_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.INSTALL__DEP_VERSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstallAccess().getTypeInstallKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstallAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInstallAccess().getDepNameEStringParserRuleCall_4_0(), semanticObject.getDepName());
		feeder.accept(grammarAccess.getInstallAccess().getDepVersionEFloatParserRuleCall_6_0(), semanticObject.getDepVersion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='key' name=EString keyFile=EString)
	 */
	protected void sequence_Key(EObject context, Key semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.AUTH__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.AUTH__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.AUTH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.AUTH__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.KEY__KEY_FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.KEY__KEY_FILE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKeyAccess().getTypeKeyKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getKeyAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getKeyAccess().getKeyFileEStringParserRuleCall_4_0(), semanticObject.getKeyFile());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString range=EString)
	 */
	protected void sequence_Nodeset(EObject context, Nodeset semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.NODESET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.NODESET__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.NODESET__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.NODESET__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNodesetAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNodesetAccess().getRangeEStringParserRuleCall_3_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type='other' 
	 *         name=EString 
	 *         authMethod=[Auth|ID] 
	 *         resources=[Resource|ID] 
	 *         vm=[VirtualMachine|ID] 
	 *         host=EString 
	 *         imports+=Import*
	 *     )
	 */
	protected void sequence_OtherProvider(EObject context, OtherProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='password' name=EString username=EString password=EString)
	 */
	protected void sequence_Password(EObject context, Password semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.AUTH__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.AUTH__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.AUTH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.AUTH__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.PASSWORD__USERNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.PASSWORD__USERNAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.PASSWORD__PASSWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.PASSWORD__PASSWORD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPasswordAccess().getTypePasswordKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getPasswordAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPasswordAccess().getUsernameEStringParserRuleCall_4_0(), semanticObject.getUsername());
		feeder.accept(grammarAccess.getPasswordAccess().getPasswordEStringParserRuleCall_6_0(), semanticObject.getPassword());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=NativeProvType 
	 *         name=EString 
	 *         authMethod=[Auth|ID] 
	 *         resources=[Resource|ID] 
	 *         vm=[VirtualMachine|ID] 
	 *         host=EString
	 *     )
	 */
	protected void sequence_Provider(EObject context, fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.PROVIDERS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.PROVIDERS__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.PROVIDERS__AUTH_METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.PROVIDERS__AUTH_METHOD));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.PROVIDERS__RESOURCES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.PROVIDERS__RESOURCES));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.PROVIDERS__VM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.PROVIDERS__VM));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.PROVIDERS__HOST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.PROVIDERS__HOST));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.PROVIDER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.PROVIDER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProviderAccess().getTypeNativeProvTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getProviderAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProviderAccess().getAuthMethodAuthIDTerminalRuleCall_4_0_1(), semanticObject.getAuthMethod());
		feeder.accept(grammarAccess.getProviderAccess().getResourcesResourceIDTerminalRuleCall_6_0_1(), semanticObject.getResources());
		feeder.accept(grammarAccess.getProviderAccess().getVmVirtualMachineIDTerminalRuleCall_8_0_1(), semanticObject.getVm());
		feeder.accept(grammarAccess.getProviderAccess().getHostEStringParserRuleCall_10_0(), semanticObject.getHost());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (native=NativeRequirement | other=EString)
	 */
	protected void sequence_Requeriments(EObject context, Requeriments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString cpu=CPU memory=INT disk=INT relax=INT)
	 */
	protected void sequence_Resource(EObject context, Resource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.RESOURCE__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.RESOURCE__CPU) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.RESOURCE__CPU));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.RESOURCE__MEMORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.RESOURCE__MEMORY));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.RESOURCE__DISK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.RESOURCE__DISK));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.RESOURCE__RELAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.RESOURCE__RELAX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getResourceAccess().getCpuCPUParserRuleCall_3_0(), semanticObject.getCpu());
		feeder.accept(grammarAccess.getResourceAccess().getMemoryINTTerminalRuleCall_5_0(), semanticObject.getMemory());
		feeder.accept(grammarAccess.getResourceAccess().getDiskINTTerminalRuleCall_7_0(), semanticObject.getDisk());
		feeder.accept(grammarAccess.getResourceAccess().getRelaxINTTerminalRuleCall_9_0(), semanticObject.getRelax());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='script-block' name=EString block=EString)
	 */
	protected void sequence_ScriptBlock(EObject context, ScriptBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.SCRIPT_BLOCK__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.SCRIPT_BLOCK__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScriptBlockAccess().getTypeScriptBlockKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getScriptBlockAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getScriptBlockAccess().getBlockEStringParserRuleCall_5_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='script-command' name=EString scriptCommand=EString)
	 */
	protected void sequence_ScriptCommand(EObject context, ScriptCommand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.SCRIPT_COMMAND__SCRIPT_COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.SCRIPT_COMMAND__SCRIPT_COMMAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScriptCommandAccess().getTypeScriptCommandKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getScriptCommandAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getScriptCommandAccess().getScriptCommandEStringParserRuleCall_4_0(), semanticObject.getScriptCommand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='script' name=EString scriptFile=EString)
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.ARTIFACT__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.SCRIPT__SCRIPT_FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.SCRIPT__SCRIPT_FILE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScriptAccess().getTypeScriptKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getScriptAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getScriptAccess().getScriptFileEStringParserRuleCall_4_0(), semanticObject.getScriptFile());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type='service' srvAction=SrvSignal name=EString serviceName=EString)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__TYPE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.DEPENDENCY__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.SERVICE__SRV_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.SERVICE__SRV_ACTION));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.SERVICE__SERVICE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.SERVICE__SERVICE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getServiceAccess().getTypeServiceKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getServiceAccess().getSrvActionSrvSignalEnumRuleCall_2_0(), semanticObject.getSrvAction());
		feeder.accept(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getServiceAccess().getServiceNameEStringParserRuleCall_5_0(), semanticObject.getServiceName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString provider=[Providers|ID] numberMachines=EInt autoscale=EBoolean predictive=EBoolean)
	 */
	protected void sequence_Setup(EObject context, Setup semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.SETUP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.SETUP__NAME));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.SETUP__PROVIDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.SETUP__PROVIDER));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.SETUP__NUMBER_MACHINES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.SETUP__NUMBER_MACHINES));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.SETUP__AUTOSCALE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.SETUP__AUTOSCALE));
			if(transientValues.isValueTransient(semanticObject, GiraffeDSLPackage.Literals.SETUP__PREDICTIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GiraffeDSLPackage.Literals.SETUP__PREDICTIVE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetupAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSetupAccess().getProviderProvidersIDTerminalRuleCall_4_0_1(), semanticObject.getProvider());
		feeder.accept(grammarAccess.getSetupAccess().getNumberMachinesEIntParserRuleCall_6_0(), semanticObject.getNumberMachines());
		feeder.accept(grammarAccess.getSetupAccess().getAutoscaleEBooleanParserRuleCall_8_0(), semanticObject.isAutoscale());
		feeder.accept(grammarAccess.getSetupAccess().getPredictiveEBooleanParserRuleCall_10_0(), semanticObject.isPredictive());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         so=NativeSO 
	 *         distribution=NativeDistribution 
	 *         version=EFloat 
	 *         auth=[Auth|ID]? 
	 *         dep+=[Dependency|ID]*
	 *     )
	 */
	protected void sequence_VirtualMachine(EObject context, VirtualMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
