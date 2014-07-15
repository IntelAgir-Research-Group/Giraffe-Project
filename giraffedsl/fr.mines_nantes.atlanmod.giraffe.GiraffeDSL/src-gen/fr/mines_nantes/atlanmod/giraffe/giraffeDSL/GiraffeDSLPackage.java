/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLFactory
 * @model kind="package"
 * @generated
 */
public interface GiraffeDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "giraffeDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mines_nantes.fr/atlanmod/giraffe/GiraffeDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "giraffeDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GiraffeDSLPackage eINSTANCE = fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeMetaModelImpl <em>Giraffe Meta Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeMetaModelImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getGiraffeMetaModel()
   * @generated
   */
  int GIRAFFE_META_MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIRAFFE_META_MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIRAFFE_META_MODEL__ENVIRONMENT = 1;

  /**
   * The feature id for the '<em><b>Deploymentdefinitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS = 2;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIRAFFE_META_MODEL__DEPLOYMENT = 3;

  /**
   * The number of structural features of the '<em>Giraffe Meta Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIRAFFE_META_MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.EnvironmentImpl <em>Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.EnvironmentImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getEnvironment()
   * @generated
   */
  int ENVIRONMENT = 1;

  /**
   * The feature id for the '<em><b>Auths</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__AUTHS = 0;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__RESOURCES = 1;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__DEPENDENCIES = 2;

  /**
   * The feature id for the '<em><b>Virtualmachines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__VIRTUALMACHINES = 3;

  /**
   * The feature id for the '<em><b>Providers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__PROVIDERS = 4;

  /**
   * The number of structural features of the '<em>Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentDefinitionsImpl <em>Deployment Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentDefinitionsImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeploymentDefinitions()
   * @generated
   */
  int DEPLOYMENT_DEFINITIONS = 2;

  /**
   * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_DEFINITIONS__ARTIFACTS = 0;

  /**
   * The feature id for the '<em><b>Nodesets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_DEFINITIONS__NODESETS = 1;

  /**
   * The number of structural features of the '<em>Deployment Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_DEFINITIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentImpl <em>Deployment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployment()
   * @generated
   */
  int DEPLOYMENT = 3;

  /**
   * The feature id for the '<em><b>Setups</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__SETUPS = 0;

  /**
   * The feature id for the '<em><b>Deploys</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__DEPLOYS = 1;

  /**
   * The number of structural features of the '<em>Deployment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ImportImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 4;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.VirtualMachineImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getVirtualMachine()
   * @generated
   */
  int VIRTUAL_MACHINE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE__NAME = 0;

  /**
   * The feature id for the '<em><b>So</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE__SO = 1;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE__DISTRIBUTION = 2;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE__VERSION = 3;

  /**
   * The feature id for the '<em><b>Auth</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE__AUTH = 4;

  /**
   * The feature id for the '<em><b>Dep</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE__DEP = 5;

  /**
   * The number of structural features of the '<em>Virtual Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_MACHINE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.RequerimentsImpl <em>Requeriments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.RequerimentsImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getRequeriments()
   * @generated
   */
  int REQUERIMENTS = 6;

  /**
   * The feature id for the '<em><b>Native</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUERIMENTS__NATIVE = 0;

  /**
   * The feature id for the '<em><b>Other</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUERIMENTS__OTHER = 1;

  /**
   * The number of structural features of the '<em>Requeriments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUERIMENTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProvidersImpl <em>Providers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProvidersImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getProviders()
   * @generated
   */
  int PROVIDERS = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDERS__NAME = 0;

  /**
   * The feature id for the '<em><b>Auth Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDERS__AUTH_METHOD = 1;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDERS__RESOURCES = 2;

  /**
   * The feature id for the '<em><b>Vm</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDERS__VM = 3;

  /**
   * The feature id for the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDERS__HOST = 4;

  /**
   * The number of structural features of the '<em>Providers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDERS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProviderImpl <em>Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProviderImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getProvider()
   * @generated
   */
  int PROVIDER = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__NAME = PROVIDERS__NAME;

  /**
   * The feature id for the '<em><b>Auth Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__AUTH_METHOD = PROVIDERS__AUTH_METHOD;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__RESOURCES = PROVIDERS__RESOURCES;

  /**
   * The feature id for the '<em><b>Vm</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__VM = PROVIDERS__VM;

  /**
   * The feature id for the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__HOST = PROVIDERS__HOST;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER__TYPE = PROVIDERS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_FEATURE_COUNT = PROVIDERS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.OtherProviderImpl <em>Other Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.OtherProviderImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getOtherProvider()
   * @generated
   */
  int OTHER_PROVIDER = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_PROVIDER__NAME = PROVIDERS__NAME;

  /**
   * The feature id for the '<em><b>Auth Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_PROVIDER__AUTH_METHOD = PROVIDERS__AUTH_METHOD;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_PROVIDER__RESOURCES = PROVIDERS__RESOURCES;

  /**
   * The feature id for the '<em><b>Vm</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_PROVIDER__VM = PROVIDERS__VM;

  /**
   * The feature id for the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_PROVIDER__HOST = PROVIDERS__HOST;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_PROVIDER__TYPE = PROVIDERS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_PROVIDER__IMPORTS = PROVIDERS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Other Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_PROVIDER_FEATURE_COUNT = PROVIDERS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.AuthImpl <em>Auth</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.AuthImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getAuth()
   * @generated
   */
  int AUTH = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTH__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTH__NAME = 1;

  /**
   * The number of structural features of the '<em>Auth</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.PasswordImpl <em>Password</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.PasswordImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getPassword()
   * @generated
   */
  int PASSWORD = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASSWORD__TYPE = AUTH__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASSWORD__NAME = AUTH__NAME;

  /**
   * The feature id for the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASSWORD__USERNAME = AUTH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASSWORD__PASSWORD = AUTH_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Password</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASSWORD_FEATURE_COUNT = AUTH_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.KeyImpl <em>Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.KeyImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getKey()
   * @generated
   */
  int KEY = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__TYPE = AUTH__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__NAME = AUTH__NAME;

  /**
   * The feature id for the '<em><b>Key File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__KEY_FILE = AUTH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FEATURE_COUNT = AUTH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CredentialImpl <em>Credential</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CredentialImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getCredential()
   * @generated
   */
  int CREDENTIAL = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDENTIAL__TYPE = AUTH__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDENTIAL__NAME = AUTH__NAME;

  /**
   * The feature id for the '<em><b>Credential File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDENTIAL__CREDENTIAL_FILE = AUTH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Credential</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDENTIAL_FEATURE_COUNT = AUTH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ResourceImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Cpu</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__CPU = 1;

  /**
   * The feature id for the '<em><b>Memory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__MEMORY = 2;

  /**
   * The feature id for the '<em><b>Disk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DISK = 3;

  /**
   * The feature id for the '<em><b>Relax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__RELAX = 4;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DependencyImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__NAME = 1;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.InstallImpl <em>Install</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.InstallImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getInstall()
   * @generated
   */
  int INSTALL = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALL__TYPE = DEPENDENCY__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALL__NAME = DEPENDENCY__NAME;

  /**
   * The feature id for the '<em><b>Dep Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALL__DEP_NAME = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dep Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALL__DEP_VERSION = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Install</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALL_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ServiceImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getService()
   * @generated
   */
  int SERVICE = 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__TYPE = DEPENDENCY__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = DEPENDENCY__NAME;

  /**
   * The feature id for the '<em><b>Srv Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SRV_ACTION = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Service Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERVICE_NAME = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.FileImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getFile()
   * @generated
   */
  int FILE = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__TYPE = DEPENDENCY__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__NAME = DEPENDENCY__NAME;

  /**
   * The feature id for the '<em><b>File Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__FILE_TYPE = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__LOCATION = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ArtifactImpl <em>Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ArtifactImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getArtifact()
   * @generated
   */
  int ARTIFACT = 19;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__NAME = 1;

  /**
   * The number of structural features of the '<em>Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfArtifactImpl <em>Conf Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfArtifactImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getConfArtifact()
   * @generated
   */
  int CONF_ARTIFACT = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONF_ARTIFACT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONF_ARTIFACT__NAME = 1;

  /**
   * The feature id for the '<em><b>Dest File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONF_ARTIFACT__DEST_FILE = 2;

  /**
   * The number of structural features of the '<em>Conf Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONF_ARTIFACT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfigImpl <em>Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfigImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getConfig()
   * @generated
   */
  int CONFIG = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__TYPE = CONF_ARTIFACT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__NAME = CONF_ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Dest File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__DEST_FILE = CONF_ARTIFACT__DEST_FILE;

  /**
   * The feature id for the '<em><b>Local File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__LOCAL_FILE = CONF_ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_FEATURE_COUNT = CONF_ARTIFACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfigBlockImpl <em>Config Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfigBlockImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getConfigBlock()
   * @generated
   */
  int CONFIG_BLOCK = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_BLOCK__TYPE = CONF_ARTIFACT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_BLOCK__NAME = CONF_ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Dest File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_BLOCK__DEST_FILE = CONF_ARTIFACT__DEST_FILE;

  /**
   * The feature id for the '<em><b>Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_BLOCK__CONFIG = CONF_ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Config Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_BLOCK_FEATURE_COUNT = CONF_ARTIFACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CodeImpl <em>Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CodeImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getCode()
   * @generated
   */
  int CODE = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE__TYPE = ARTIFACT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE__NAME = ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE__CODE = ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CodeExternalImpl <em>Code External</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CodeExternalImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getCodeExternal()
   * @generated
   */
  int CODE_EXTERNAL = 24;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_EXTERNAL__TYPE = ARTIFACT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_EXTERNAL__NAME = ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_EXTERNAL__CLASS = ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_EXTERNAL__METHOD = ARTIFACT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Code External</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_EXTERNAL_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 25;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__TYPE = ARTIFACT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__NAME = ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Script File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SCRIPT_FILE = ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptCommandImpl <em>Script Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptCommandImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getScriptCommand()
   * @generated
   */
  int SCRIPT_COMMAND = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_COMMAND__TYPE = ARTIFACT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_COMMAND__NAME = ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Script Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_COMMAND__SCRIPT_COMMAND = ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Script Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_COMMAND_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptBlockImpl <em>Script Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptBlockImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getScriptBlock()
   * @generated
   */
  int SCRIPT_BLOCK = 27;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_BLOCK__TYPE = ARTIFACT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_BLOCK__NAME = ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Block</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_BLOCK__BLOCK = ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Script Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_BLOCK_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.NodesetImpl <em>Nodeset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.NodesetImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getNodeset()
   * @generated
   */
  int NODESET = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODESET__NAME = 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODESET__RANGE = 1;

  /**
   * The number of structural features of the '<em>Nodeset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODESET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.SetupImpl <em>Setup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.SetupImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getSetup()
   * @generated
   */
  int SETUP = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP__PROVIDER = 1;

  /**
   * The feature id for the '<em><b>Number Machines</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP__NUMBER_MACHINES = 2;

  /**
   * The feature id for the '<em><b>Autoscale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP__AUTOSCALE = 3;

  /**
   * The feature id for the '<em><b>Predictive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP__PREDICTIVE = 4;

  /**
   * The number of structural features of the '<em>Setup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETUP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeployImpl <em>Deploy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeployImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeploy()
   * @generated
   */
  int DEPLOY = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY__NAME = 0;

  /**
   * The feature id for the '<em><b>Setups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY__SETUPS = 1;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY__TIMEOUT = 2;

  /**
   * The feature id for the '<em><b>Executions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY__EXECUTIONS = 3;

  /**
   * The number of structural features of the '<em>Deploy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ExecutionImpl <em>Execution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ExecutionImpl
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getExecution()
   * @generated
   */
  int EXECUTION = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__CODE = 1;

  /**
   * The feature id for the '<em><b>Config</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__CONFIG = 2;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__NODES = 3;

  /**
   * The feature id for the '<em><b>Seq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__SEQ = 4;

  /**
   * The number of structural features of the '<em>Execution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeProvType <em>Native Prov Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeProvType
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getNativeProvType()
   * @generated
   */
  int NATIVE_PROV_TYPE = 32;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO <em>Native SO</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getNativeSO()
   * @generated
   */
  int NATIVE_SO = 33;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement <em>Native Requirement</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getNativeRequirement()
   * @generated
   */
  int NATIVE_REQUIREMENT = 34;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution <em>Native Distribution</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getNativeDistribution()
   * @generated
   */
  int NATIVE_DISTRIBUTION = 35;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal <em>Srv Signal</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getSrvSignal()
   * @generated
   */
  int SRV_SIGNAL = 36;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.FileType <em>File Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.FileType
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getFileType()
   * @generated
   */
  int FILE_TYPE = 37;

  /**
   * The meta object id for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.MonitoringType <em>Monitoring Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.MonitoringType
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getMonitoringType()
   * @generated
   */
  int MONITORING_TYPE = 38;


  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel <em>Giraffe Meta Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Giraffe Meta Model</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel
   * @generated
   */
  EClass getGiraffeMetaModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel#getImports()
   * @see #getGiraffeMetaModel()
   * @generated
   */
  EReference getGiraffeMetaModel_Imports();

  /**
   * Returns the meta object for the containment reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel#getEnvironment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Environment</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel#getEnvironment()
   * @see #getGiraffeMetaModel()
   * @generated
   */
  EReference getGiraffeMetaModel_Environment();

  /**
   * Returns the meta object for the containment reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel#getDeploymentdefinitions <em>Deploymentdefinitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deploymentdefinitions</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel#getDeploymentdefinitions()
   * @see #getGiraffeMetaModel()
   * @generated
   */
  EReference getGiraffeMetaModel_Deploymentdefinitions();

  /**
   * Returns the meta object for the containment reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel#getDeployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deployment</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel#getDeployment()
   * @see #getGiraffeMetaModel()
   * @generated
   */
  EReference getGiraffeMetaModel_Deployment();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment
   * @generated
   */
  EClass getEnvironment();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getAuths <em>Auths</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Auths</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getAuths()
   * @see #getEnvironment()
   * @generated
   */
  EReference getEnvironment_Auths();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getResources()
   * @see #getEnvironment()
   * @generated
   */
  EReference getEnvironment_Resources();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependencies</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getDependencies()
   * @see #getEnvironment()
   * @generated
   */
  EReference getEnvironment_Dependencies();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getVirtualmachines <em>Virtualmachines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Virtualmachines</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getVirtualmachines()
   * @see #getEnvironment()
   * @generated
   */
  EReference getEnvironment_Virtualmachines();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getProviders <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Providers</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getProviders()
   * @see #getEnvironment()
   * @generated
   */
  EReference getEnvironment_Providers();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions <em>Deployment Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment Definitions</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions
   * @generated
   */
  EClass getDeploymentDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions#getArtifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Artifacts</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions#getArtifacts()
   * @see #getDeploymentDefinitions()
   * @generated
   */
  EReference getDeploymentDefinitions_Artifacts();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions#getNodesets <em>Nodesets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodesets</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions#getNodesets()
   * @see #getDeploymentDefinitions()
   * @generated
   */
  EReference getDeploymentDefinitions_Nodesets();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment
   * @generated
   */
  EClass getDeployment();

  /**
   * Returns the meta object for the containment reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment#getSetups <em>Setups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Setups</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment#getSetups()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Setups();

  /**
   * Returns the meta object for the containment reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment#getDeploys <em>Deploys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deploys</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment#getDeploys()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Deploys();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine <em>Virtual Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Machine</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine
   * @generated
   */
  EClass getVirtualMachine();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getName()
   * @see #getVirtualMachine()
   * @generated
   */
  EAttribute getVirtualMachine_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getSo <em>So</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>So</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getSo()
   * @see #getVirtualMachine()
   * @generated
   */
  EAttribute getVirtualMachine_So();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getDistribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distribution</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getDistribution()
   * @see #getVirtualMachine()
   * @generated
   */
  EAttribute getVirtualMachine_Distribution();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getVersion()
   * @see #getVirtualMachine()
   * @generated
   */
  EAttribute getVirtualMachine_Version();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getAuth <em>Auth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Auth</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getAuth()
   * @see #getVirtualMachine()
   * @generated
   */
  EReference getVirtualMachine_Auth();

  /**
   * Returns the meta object for the reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getDep <em>Dep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dep</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getDep()
   * @see #getVirtualMachine()
   * @generated
   */
  EReference getVirtualMachine_Dep();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments <em>Requeriments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requeriments</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments
   * @generated
   */
  EClass getRequeriments();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments#getNative <em>Native</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Native</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments#getNative()
   * @see #getRequeriments()
   * @generated
   */
  EAttribute getRequeriments_Native();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments#getOther <em>Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Other</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments#getOther()
   * @see #getRequeriments()
   * @generated
   */
  EAttribute getRequeriments_Other();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Providers</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers
   * @generated
   */
  EClass getProviders();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers#getName()
   * @see #getProviders()
   * @generated
   */
  EAttribute getProviders_Name();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers#getAuthMethod <em>Auth Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Auth Method</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers#getAuthMethod()
   * @see #getProviders()
   * @generated
   */
  EReference getProviders_AuthMethod();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resources</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers#getResources()
   * @see #getProviders()
   * @generated
   */
  EReference getProviders_Resources();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers#getVm <em>Vm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Vm</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers#getVm()
   * @see #getProviders()
   * @generated
   */
  EReference getProviders_Vm();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers#getHost <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers#getHost()
   * @see #getProviders()
   * @generated
   */
  EAttribute getProviders_Host();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provider</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider
   * @generated
   */
  EClass getProvider();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider#getType()
   * @see #getProvider()
   * @generated
   */
  EAttribute getProvider_Type();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider <em>Other Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other Provider</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider
   * @generated
   */
  EClass getOtherProvider();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider#getType()
   * @see #getOtherProvider()
   * @generated
   */
  EAttribute getOtherProvider_Type();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider#getImports()
   * @see #getOtherProvider()
   * @generated
   */
  EReference getOtherProvider_Imports();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth <em>Auth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Auth</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth
   * @generated
   */
  EClass getAuth();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth#getType()
   * @see #getAuth()
   * @generated
   */
  EAttribute getAuth_Type();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth#getName()
   * @see #getAuth()
   * @generated
   */
  EAttribute getAuth_Name();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Password</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password
   * @generated
   */
  EClass getPassword();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password#getUsername <em>Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Username</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password#getUsername()
   * @see #getPassword()
   * @generated
   */
  EAttribute getPassword_Username();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password#getPassword()
   * @see #getPassword()
   * @generated
   */
  EAttribute getPassword_Password();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Key
   * @generated
   */
  EClass getKey();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Key#getKeyFile <em>Key File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key File</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Key#getKeyFile()
   * @see #getKey()
   * @generated
   */
  EAttribute getKey_KeyFile();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential <em>Credential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Credential</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential
   * @generated
   */
  EClass getCredential();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential#getCredentialFile <em>Credential File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Credential File</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential#getCredentialFile()
   * @see #getCredential()
   * @generated
   */
  EAttribute getCredential_CredentialFile();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource#getCpu <em>Cpu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cpu</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource#getCpu()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Cpu();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource#getMemory <em>Memory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memory</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource#getMemory()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Memory();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource#getDisk <em>Disk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Disk</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource#getDisk()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Disk();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource#getRelax <em>Relax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relax</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource#getRelax()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Relax();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency#getType()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_Type();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency#getName()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_Name();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install <em>Install</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Install</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install
   * @generated
   */
  EClass getInstall();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install#getDepName <em>Dep Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dep Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install#getDepName()
   * @see #getInstall()
   * @generated
   */
  EAttribute getInstall_DepName();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install#getDepVersion <em>Dep Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dep Version</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install#getDepVersion()
   * @see #getInstall()
   * @generated
   */
  EAttribute getInstall_DepVersion();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service#getSrvAction <em>Srv Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Srv Action</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service#getSrvAction()
   * @see #getService()
   * @generated
   */
  EAttribute getService_SrvAction();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service#getServiceName <em>Service Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service#getServiceName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_ServiceName();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File#getFileType <em>File Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Type</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File#getFileType()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_FileType();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File#getLocation()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_Location();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact
   * @generated
   */
  EClass getArtifact();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact#getType()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Type();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact#getName()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Name();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact <em>Conf Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conf Artifact</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact
   * @generated
   */
  EClass getConfArtifact();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact#getType()
   * @see #getConfArtifact()
   * @generated
   */
  EAttribute getConfArtifact_Type();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact#getName()
   * @see #getConfArtifact()
   * @generated
   */
  EAttribute getConfArtifact_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact#getDestFile <em>Dest File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dest File</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact#getDestFile()
   * @see #getConfArtifact()
   * @generated
   */
  EAttribute getConfArtifact_DestFile();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Config <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Config
   * @generated
   */
  EClass getConfig();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Config#getLocalFile <em>Local File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Local File</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Config#getLocalFile()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_LocalFile();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfigBlock <em>Config Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config Block</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfigBlock
   * @generated
   */
  EClass getConfigBlock();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfigBlock#getConfig <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Config</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfigBlock#getConfig()
   * @see #getConfigBlock()
   * @generated
   */
  EAttribute getConfigBlock_Config();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Code <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Code
   * @generated
   */
  EClass getCode();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Code#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Code#getCode()
   * @see #getCode()
   * @generated
   */
  EAttribute getCode_Code();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal <em>Code External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code External</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal
   * @generated
   */
  EClass getCodeExternal();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal#getClass_()
   * @see #getCodeExternal()
   * @generated
   */
  EAttribute getCodeExternal_Class();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal#getMethod()
   * @see #getCodeExternal()
   * @generated
   */
  EAttribute getCodeExternal_Method();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Script#getScriptFile <em>Script File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Script File</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Script#getScriptFile()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_ScriptFile();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptCommand <em>Script Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Command</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptCommand
   * @generated
   */
  EClass getScriptCommand();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptCommand#getScriptCommand <em>Script Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Script Command</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptCommand#getScriptCommand()
   * @see #getScriptCommand()
   * @generated
   */
  EAttribute getScriptCommand_ScriptCommand();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptBlock <em>Script Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Block</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptBlock
   * @generated
   */
  EClass getScriptBlock();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptBlock#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Block</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptBlock#getBlock()
   * @see #getScriptBlock()
   * @generated
   */
  EAttribute getScriptBlock_Block();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset <em>Nodeset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nodeset</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset
   * @generated
   */
  EClass getNodeset();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset#getName()
   * @see #getNodeset()
   * @generated
   */
  EAttribute getNodeset_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset#getRange()
   * @see #getNodeset()
   * @generated
   */
  EAttribute getNodeset_Range();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup <em>Setup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Setup</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup
   * @generated
   */
  EClass getSetup();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup#getName()
   * @see #getSetup()
   * @generated
   */
  EAttribute getSetup_Name();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Provider</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup#getProvider()
   * @see #getSetup()
   * @generated
   */
  EReference getSetup_Provider();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup#getNumberMachines <em>Number Machines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Machines</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup#getNumberMachines()
   * @see #getSetup()
   * @generated
   */
  EAttribute getSetup_NumberMachines();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup#isAutoscale <em>Autoscale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Autoscale</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup#isAutoscale()
   * @see #getSetup()
   * @generated
   */
  EAttribute getSetup_Autoscale();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup#isPredictive <em>Predictive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Predictive</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup#isPredictive()
   * @see #getSetup()
   * @generated
   */
  EAttribute getSetup_Predictive();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy <em>Deploy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy
   * @generated
   */
  EClass getDeploy();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy#getName()
   * @see #getDeploy()
   * @generated
   */
  EAttribute getDeploy_Name();

  /**
   * Returns the meta object for the reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy#getSetups <em>Setups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Setups</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy#getSetups()
   * @see #getDeploy()
   * @generated
   */
  EReference getDeploy_Setups();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy#getTimeout()
   * @see #getDeploy()
   * @generated
   */
  EAttribute getDeploy_Timeout();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy#getExecutions <em>Executions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Executions</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy#getExecutions()
   * @see #getDeploy()
   * @generated
   */
  EReference getDeploy_Executions();

  /**
   * Returns the meta object for class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Execution</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution
   * @generated
   */
  EClass getExecution();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution#getName()
   * @see #getExecution()
   * @generated
   */
  EAttribute getExecution_Name();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Code</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution#getCode()
   * @see #getExecution()
   * @generated
   */
  EReference getExecution_Code();

  /**
   * Returns the meta object for the reference list '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution#getConfig <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Config</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution#getConfig()
   * @see #getExecution()
   * @generated
   */
  EReference getExecution_Config();

  /**
   * Returns the meta object for the reference '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nodes</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution#getNodes()
   * @see #getExecution()
   * @generated
   */
  EReference getExecution_Nodes();

  /**
   * Returns the meta object for the attribute '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution#getSeq <em>Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seq</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution#getSeq()
   * @see #getExecution()
   * @generated
   */
  EAttribute getExecution_Seq();

  /**
   * Returns the meta object for enum '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeProvType <em>Native Prov Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Native Prov Type</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeProvType
   * @generated
   */
  EEnum getNativeProvType();

  /**
   * Returns the meta object for enum '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO <em>Native SO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Native SO</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO
   * @generated
   */
  EEnum getNativeSO();

  /**
   * Returns the meta object for enum '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement <em>Native Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Native Requirement</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement
   * @generated
   */
  EEnum getNativeRequirement();

  /**
   * Returns the meta object for enum '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution <em>Native Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Native Distribution</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution
   * @generated
   */
  EEnum getNativeDistribution();

  /**
   * Returns the meta object for enum '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal <em>Srv Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Srv Signal</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal
   * @generated
   */
  EEnum getSrvSignal();

  /**
   * Returns the meta object for enum '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.FileType <em>File Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>File Type</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.FileType
   * @generated
   */
  EEnum getFileType();

  /**
   * Returns the meta object for enum '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.MonitoringType <em>Monitoring Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Monitoring Type</em>'.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.MonitoringType
   * @generated
   */
  EEnum getMonitoringType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GiraffeDSLFactory getGiraffeDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeMetaModelImpl <em>Giraffe Meta Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeMetaModelImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getGiraffeMetaModel()
     * @generated
     */
    EClass GIRAFFE_META_MODEL = eINSTANCE.getGiraffeMetaModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GIRAFFE_META_MODEL__IMPORTS = eINSTANCE.getGiraffeMetaModel_Imports();

    /**
     * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GIRAFFE_META_MODEL__ENVIRONMENT = eINSTANCE.getGiraffeMetaModel_Environment();

    /**
     * The meta object literal for the '<em><b>Deploymentdefinitions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS = eINSTANCE.getGiraffeMetaModel_Deploymentdefinitions();

    /**
     * The meta object literal for the '<em><b>Deployment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GIRAFFE_META_MODEL__DEPLOYMENT = eINSTANCE.getGiraffeMetaModel_Deployment();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.EnvironmentImpl <em>Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.EnvironmentImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getEnvironment()
     * @generated
     */
    EClass ENVIRONMENT = eINSTANCE.getEnvironment();

    /**
     * The meta object literal for the '<em><b>Auths</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT__AUTHS = eINSTANCE.getEnvironment_Auths();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT__RESOURCES = eINSTANCE.getEnvironment_Resources();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT__DEPENDENCIES = eINSTANCE.getEnvironment_Dependencies();

    /**
     * The meta object literal for the '<em><b>Virtualmachines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT__VIRTUALMACHINES = eINSTANCE.getEnvironment_Virtualmachines();

    /**
     * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT__PROVIDERS = eINSTANCE.getEnvironment_Providers();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentDefinitionsImpl <em>Deployment Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentDefinitionsImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeploymentDefinitions()
     * @generated
     */
    EClass DEPLOYMENT_DEFINITIONS = eINSTANCE.getDeploymentDefinitions();

    /**
     * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_DEFINITIONS__ARTIFACTS = eINSTANCE.getDeploymentDefinitions_Artifacts();

    /**
     * The meta object literal for the '<em><b>Nodesets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_DEFINITIONS__NODESETS = eINSTANCE.getDeploymentDefinitions_Nodesets();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentImpl <em>Deployment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeployment()
     * @generated
     */
    EClass DEPLOYMENT = eINSTANCE.getDeployment();

    /**
     * The meta object literal for the '<em><b>Setups</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__SETUPS = eINSTANCE.getDeployment_Setups();

    /**
     * The meta object literal for the '<em><b>Deploys</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__DEPLOYS = eINSTANCE.getDeployment_Deploys();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ImportImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.VirtualMachineImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getVirtualMachine()
     * @generated
     */
    EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MACHINE__NAME = eINSTANCE.getVirtualMachine_Name();

    /**
     * The meta object literal for the '<em><b>So</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MACHINE__SO = eINSTANCE.getVirtualMachine_So();

    /**
     * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MACHINE__DISTRIBUTION = eINSTANCE.getVirtualMachine_Distribution();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_MACHINE__VERSION = eINSTANCE.getVirtualMachine_Version();

    /**
     * The meta object literal for the '<em><b>Auth</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIRTUAL_MACHINE__AUTH = eINSTANCE.getVirtualMachine_Auth();

    /**
     * The meta object literal for the '<em><b>Dep</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIRTUAL_MACHINE__DEP = eINSTANCE.getVirtualMachine_Dep();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.RequerimentsImpl <em>Requeriments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.RequerimentsImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getRequeriments()
     * @generated
     */
    EClass REQUERIMENTS = eINSTANCE.getRequeriments();

    /**
     * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUERIMENTS__NATIVE = eINSTANCE.getRequeriments_Native();

    /**
     * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUERIMENTS__OTHER = eINSTANCE.getRequeriments_Other();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProvidersImpl <em>Providers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProvidersImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getProviders()
     * @generated
     */
    EClass PROVIDERS = eINSTANCE.getProviders();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDERS__NAME = eINSTANCE.getProviders_Name();

    /**
     * The meta object literal for the '<em><b>Auth Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDERS__AUTH_METHOD = eINSTANCE.getProviders_AuthMethod();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDERS__RESOURCES = eINSTANCE.getProviders_Resources();

    /**
     * The meta object literal for the '<em><b>Vm</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDERS__VM = eINSTANCE.getProviders_Vm();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDERS__HOST = eINSTANCE.getProviders_Host();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProviderImpl <em>Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProviderImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getProvider()
     * @generated
     */
    EClass PROVIDER = eINSTANCE.getProvider();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDER__TYPE = eINSTANCE.getProvider_Type();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.OtherProviderImpl <em>Other Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.OtherProviderImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getOtherProvider()
     * @generated
     */
    EClass OTHER_PROVIDER = eINSTANCE.getOtherProvider();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OTHER_PROVIDER__TYPE = eINSTANCE.getOtherProvider_Type();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHER_PROVIDER__IMPORTS = eINSTANCE.getOtherProvider_Imports();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.AuthImpl <em>Auth</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.AuthImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getAuth()
     * @generated
     */
    EClass AUTH = eINSTANCE.getAuth();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTH__TYPE = eINSTANCE.getAuth_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTH__NAME = eINSTANCE.getAuth_Name();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.PasswordImpl <em>Password</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.PasswordImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getPassword()
     * @generated
     */
    EClass PASSWORD = eINSTANCE.getPassword();

    /**
     * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PASSWORD__USERNAME = eINSTANCE.getPassword_Username();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PASSWORD__PASSWORD = eINSTANCE.getPassword_Password();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.KeyImpl <em>Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.KeyImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getKey()
     * @generated
     */
    EClass KEY = eINSTANCE.getKey();

    /**
     * The meta object literal for the '<em><b>Key File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY__KEY_FILE = eINSTANCE.getKey_KeyFile();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CredentialImpl <em>Credential</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CredentialImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getCredential()
     * @generated
     */
    EClass CREDENTIAL = eINSTANCE.getCredential();

    /**
     * The meta object literal for the '<em><b>Credential File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREDENTIAL__CREDENTIAL_FILE = eINSTANCE.getCredential_CredentialFile();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ResourceImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '<em><b>Cpu</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__CPU = eINSTANCE.getResource_Cpu();

    /**
     * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__MEMORY = eINSTANCE.getResource_Memory();

    /**
     * The meta object literal for the '<em><b>Disk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__DISK = eINSTANCE.getResource_Disk();

    /**
     * The meta object literal for the '<em><b>Relax</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__RELAX = eINSTANCE.getResource_Relax();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DependencyImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__TYPE = eINSTANCE.getDependency_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__NAME = eINSTANCE.getDependency_Name();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.InstallImpl <em>Install</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.InstallImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getInstall()
     * @generated
     */
    EClass INSTALL = eINSTANCE.getInstall();

    /**
     * The meta object literal for the '<em><b>Dep Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTALL__DEP_NAME = eINSTANCE.getInstall_DepName();

    /**
     * The meta object literal for the '<em><b>Dep Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTALL__DEP_VERSION = eINSTANCE.getInstall_DepVersion();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ServiceImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Srv Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__SRV_ACTION = eINSTANCE.getService_SrvAction();

    /**
     * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__SERVICE_NAME = eINSTANCE.getService_ServiceName();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.FileImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>File Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__FILE_TYPE = eINSTANCE.getFile_FileType();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__LOCATION = eINSTANCE.getFile_Location();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ArtifactImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getArtifact()
     * @generated
     */
    EClass ARTIFACT = eINSTANCE.getArtifact();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__TYPE = eINSTANCE.getArtifact_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfArtifactImpl <em>Conf Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfArtifactImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getConfArtifact()
     * @generated
     */
    EClass CONF_ARTIFACT = eINSTANCE.getConfArtifact();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONF_ARTIFACT__TYPE = eINSTANCE.getConfArtifact_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONF_ARTIFACT__NAME = eINSTANCE.getConfArtifact_Name();

    /**
     * The meta object literal for the '<em><b>Dest File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONF_ARTIFACT__DEST_FILE = eINSTANCE.getConfArtifact_DestFile();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfigImpl <em>Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfigImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getConfig()
     * @generated
     */
    EClass CONFIG = eINSTANCE.getConfig();

    /**
     * The meta object literal for the '<em><b>Local File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__LOCAL_FILE = eINSTANCE.getConfig_LocalFile();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfigBlockImpl <em>Config Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ConfigBlockImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getConfigBlock()
     * @generated
     */
    EClass CONFIG_BLOCK = eINSTANCE.getConfigBlock();

    /**
     * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG_BLOCK__CONFIG = eINSTANCE.getConfigBlock_Config();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CodeImpl <em>Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CodeImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getCode()
     * @generated
     */
    EClass CODE = eINSTANCE.getCode();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE__CODE = eINSTANCE.getCode_Code();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CodeExternalImpl <em>Code External</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CodeExternalImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getCodeExternal()
     * @generated
     */
    EClass CODE_EXTERNAL = eINSTANCE.getCodeExternal();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_EXTERNAL__CLASS = eINSTANCE.getCodeExternal_Class();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_EXTERNAL__METHOD = eINSTANCE.getCodeExternal_Method();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Script File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__SCRIPT_FILE = eINSTANCE.getScript_ScriptFile();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptCommandImpl <em>Script Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptCommandImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getScriptCommand()
     * @generated
     */
    EClass SCRIPT_COMMAND = eINSTANCE.getScriptCommand();

    /**
     * The meta object literal for the '<em><b>Script Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_COMMAND__SCRIPT_COMMAND = eINSTANCE.getScriptCommand_ScriptCommand();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptBlockImpl <em>Script Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptBlockImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getScriptBlock()
     * @generated
     */
    EClass SCRIPT_BLOCK = eINSTANCE.getScriptBlock();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_BLOCK__BLOCK = eINSTANCE.getScriptBlock_Block();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.NodesetImpl <em>Nodeset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.NodesetImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getNodeset()
     * @generated
     */
    EClass NODESET = eINSTANCE.getNodeset();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODESET__NAME = eINSTANCE.getNodeset_Name();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODESET__RANGE = eINSTANCE.getNodeset_Range();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.SetupImpl <em>Setup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.SetupImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getSetup()
     * @generated
     */
    EClass SETUP = eINSTANCE.getSetup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETUP__NAME = eINSTANCE.getSetup_Name();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETUP__PROVIDER = eINSTANCE.getSetup_Provider();

    /**
     * The meta object literal for the '<em><b>Number Machines</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETUP__NUMBER_MACHINES = eINSTANCE.getSetup_NumberMachines();

    /**
     * The meta object literal for the '<em><b>Autoscale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETUP__AUTOSCALE = eINSTANCE.getSetup_Autoscale();

    /**
     * The meta object literal for the '<em><b>Predictive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETUP__PREDICTIVE = eINSTANCE.getSetup_Predictive();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeployImpl <em>Deploy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeployImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getDeploy()
     * @generated
     */
    EClass DEPLOY = eINSTANCE.getDeploy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY__NAME = eINSTANCE.getDeploy_Name();

    /**
     * The meta object literal for the '<em><b>Setups</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOY__SETUPS = eINSTANCE.getDeploy_Setups();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY__TIMEOUT = eINSTANCE.getDeploy_Timeout();

    /**
     * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOY__EXECUTIONS = eINSTANCE.getDeploy_Executions();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ExecutionImpl <em>Execution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ExecutionImpl
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getExecution()
     * @generated
     */
    EClass EXECUTION = eINSTANCE.getExecution();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXECUTION__NAME = eINSTANCE.getExecution_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION__CODE = eINSTANCE.getExecution_Code();

    /**
     * The meta object literal for the '<em><b>Config</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION__CONFIG = eINSTANCE.getExecution_Config();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION__NODES = eINSTANCE.getExecution_Nodes();

    /**
     * The meta object literal for the '<em><b>Seq</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXECUTION__SEQ = eINSTANCE.getExecution_Seq();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeProvType <em>Native Prov Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeProvType
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getNativeProvType()
     * @generated
     */
    EEnum NATIVE_PROV_TYPE = eINSTANCE.getNativeProvType();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO <em>Native SO</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getNativeSO()
     * @generated
     */
    EEnum NATIVE_SO = eINSTANCE.getNativeSO();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement <em>Native Requirement</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getNativeRequirement()
     * @generated
     */
    EEnum NATIVE_REQUIREMENT = eINSTANCE.getNativeRequirement();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution <em>Native Distribution</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getNativeDistribution()
     * @generated
     */
    EEnum NATIVE_DISTRIBUTION = eINSTANCE.getNativeDistribution();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal <em>Srv Signal</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getSrvSignal()
     * @generated
     */
    EEnum SRV_SIGNAL = eINSTANCE.getSrvSignal();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.FileType <em>File Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.FileType
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getFileType()
     * @generated
     */
    EEnum FILE_TYPE = eINSTANCE.getFileType();

    /**
     * The meta object literal for the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.MonitoringType <em>Monitoring Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.MonitoringType
     * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeDSLPackageImpl#getMonitoringType()
     * @generated
     */
    EEnum MONITORING_TYPE = eINSTANCE.getMonitoringType();

  }

} //GiraffeDSLPackage
