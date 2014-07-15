/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage
 * @generated
 */
public interface GiraffeDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GiraffeDSLFactory eINSTANCE = fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Giraffe Meta Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Giraffe Meta Model</em>'.
   * @generated
   */
  GiraffeMetaModel createGiraffeMetaModel();

  /**
   * Returns a new object of class '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment</em>'.
   * @generated
   */
  Environment createEnvironment();

  /**
   * Returns a new object of class '<em>Deployment Definitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment Definitions</em>'.
   * @generated
   */
  DeploymentDefinitions createDeploymentDefinitions();

  /**
   * Returns a new object of class '<em>Deployment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment</em>'.
   * @generated
   */
  Deployment createDeployment();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Virtual Machine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virtual Machine</em>'.
   * @generated
   */
  VirtualMachine createVirtualMachine();

  /**
   * Returns a new object of class '<em>Requeriments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requeriments</em>'.
   * @generated
   */
  Requeriments createRequeriments();

  /**
   * Returns a new object of class '<em>Providers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Providers</em>'.
   * @generated
   */
  Providers createProviders();

  /**
   * Returns a new object of class '<em>Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provider</em>'.
   * @generated
   */
  Provider createProvider();

  /**
   * Returns a new object of class '<em>Other Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Provider</em>'.
   * @generated
   */
  OtherProvider createOtherProvider();

  /**
   * Returns a new object of class '<em>Auth</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Auth</em>'.
   * @generated
   */
  Auth createAuth();

  /**
   * Returns a new object of class '<em>Password</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Password</em>'.
   * @generated
   */
  Password createPassword();

  /**
   * Returns a new object of class '<em>Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key</em>'.
   * @generated
   */
  Key createKey();

  /**
   * Returns a new object of class '<em>Credential</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Credential</em>'.
   * @generated
   */
  Credential createCredential();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency</em>'.
   * @generated
   */
  Dependency createDependency();

  /**
   * Returns a new object of class '<em>Install</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Install</em>'.
   * @generated
   */
  Install createInstall();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  File createFile();

  /**
   * Returns a new object of class '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifact</em>'.
   * @generated
   */
  Artifact createArtifact();

  /**
   * Returns a new object of class '<em>Conf Artifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conf Artifact</em>'.
   * @generated
   */
  ConfArtifact createConfArtifact();

  /**
   * Returns a new object of class '<em>Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config</em>'.
   * @generated
   */
  Config createConfig();

  /**
   * Returns a new object of class '<em>Config Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Block</em>'.
   * @generated
   */
  ConfigBlock createConfigBlock();

  /**
   * Returns a new object of class '<em>Code</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Code</em>'.
   * @generated
   */
  Code createCode();

  /**
   * Returns a new object of class '<em>Code External</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Code External</em>'.
   * @generated
   */
  CodeExternal createCodeExternal();

  /**
   * Returns a new object of class '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script</em>'.
   * @generated
   */
  Script createScript();

  /**
   * Returns a new object of class '<em>Script Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script Command</em>'.
   * @generated
   */
  ScriptCommand createScriptCommand();

  /**
   * Returns a new object of class '<em>Script Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script Block</em>'.
   * @generated
   */
  ScriptBlock createScriptBlock();

  /**
   * Returns a new object of class '<em>Nodeset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nodeset</em>'.
   * @generated
   */
  Nodeset createNodeset();

  /**
   * Returns a new object of class '<em>Setup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Setup</em>'.
   * @generated
   */
  Setup createSetup();

  /**
   * Returns a new object of class '<em>Deploy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy</em>'.
   * @generated
   */
  Deploy createDeploy();

  /**
   * Returns a new object of class '<em>Execution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Execution</em>'.
   * @generated
   */
  Execution createExecution();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GiraffeDSLPackage getGiraffeDSLPackage();

} //GiraffeDSLFactory
