/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GiraffeDSLFactoryImpl extends EFactoryImpl implements GiraffeDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GiraffeDSLFactory init()
  {
    try
    {
      GiraffeDSLFactory theGiraffeDSLFactory = (GiraffeDSLFactory)EPackage.Registry.INSTANCE.getEFactory(GiraffeDSLPackage.eNS_URI);
      if (theGiraffeDSLFactory != null)
      {
        return theGiraffeDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GiraffeDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GiraffeDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GiraffeDSLPackage.GIRAFFE_META_MODEL: return createGiraffeMetaModel();
      case GiraffeDSLPackage.ENVIRONMENT: return createEnvironment();
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS: return createDeploymentDefinitions();
      case GiraffeDSLPackage.DEPLOYMENT: return createDeployment();
      case GiraffeDSLPackage.IMPORT: return createImport();
      case GiraffeDSLPackage.VIRTUAL_MACHINE: return createVirtualMachine();
      case GiraffeDSLPackage.REQUERIMENTS: return createRequeriments();
      case GiraffeDSLPackage.PROVIDERS: return createProviders();
      case GiraffeDSLPackage.PROVIDER: return createProvider();
      case GiraffeDSLPackage.OTHER_PROVIDER: return createOtherProvider();
      case GiraffeDSLPackage.AUTH: return createAuth();
      case GiraffeDSLPackage.PASSWORD: return createPassword();
      case GiraffeDSLPackage.KEY: return createKey();
      case GiraffeDSLPackage.CREDENTIAL: return createCredential();
      case GiraffeDSLPackage.RESOURCE: return createResource();
      case GiraffeDSLPackage.DEPENDENCY: return createDependency();
      case GiraffeDSLPackage.INSTALL: return createInstall();
      case GiraffeDSLPackage.SERVICE: return createService();
      case GiraffeDSLPackage.FILE: return createFile();
      case GiraffeDSLPackage.ARTIFACT: return createArtifact();
      case GiraffeDSLPackage.CONF_ARTIFACT: return createConfArtifact();
      case GiraffeDSLPackage.CONFIG: return createConfig();
      case GiraffeDSLPackage.CONFIG_BLOCK: return createConfigBlock();
      case GiraffeDSLPackage.CODE: return createCode();
      case GiraffeDSLPackage.CODE_EXTERNAL: return createCodeExternal();
      case GiraffeDSLPackage.SCRIPT: return createScript();
      case GiraffeDSLPackage.SCRIPT_COMMAND: return createScriptCommand();
      case GiraffeDSLPackage.SCRIPT_BLOCK: return createScriptBlock();
      case GiraffeDSLPackage.NODESET: return createNodeset();
      case GiraffeDSLPackage.SETUP: return createSetup();
      case GiraffeDSLPackage.DEPLOY: return createDeploy();
      case GiraffeDSLPackage.EXECUTION: return createExecution();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GiraffeDSLPackage.NATIVE_PROV_TYPE:
        return createNativeProvTypeFromString(eDataType, initialValue);
      case GiraffeDSLPackage.NATIVE_SO:
        return createNativeSOFromString(eDataType, initialValue);
      case GiraffeDSLPackage.NATIVE_REQUIREMENT:
        return createNativeRequirementFromString(eDataType, initialValue);
      case GiraffeDSLPackage.NATIVE_DISTRIBUTION:
        return createNativeDistributionFromString(eDataType, initialValue);
      case GiraffeDSLPackage.SRV_SIGNAL:
        return createSrvSignalFromString(eDataType, initialValue);
      case GiraffeDSLPackage.FILE_TYPE:
        return createFileTypeFromString(eDataType, initialValue);
      case GiraffeDSLPackage.MONITORING_TYPE:
        return createMonitoringTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GiraffeDSLPackage.NATIVE_PROV_TYPE:
        return convertNativeProvTypeToString(eDataType, instanceValue);
      case GiraffeDSLPackage.NATIVE_SO:
        return convertNativeSOToString(eDataType, instanceValue);
      case GiraffeDSLPackage.NATIVE_REQUIREMENT:
        return convertNativeRequirementToString(eDataType, instanceValue);
      case GiraffeDSLPackage.NATIVE_DISTRIBUTION:
        return convertNativeDistributionToString(eDataType, instanceValue);
      case GiraffeDSLPackage.SRV_SIGNAL:
        return convertSrvSignalToString(eDataType, instanceValue);
      case GiraffeDSLPackage.FILE_TYPE:
        return convertFileTypeToString(eDataType, instanceValue);
      case GiraffeDSLPackage.MONITORING_TYPE:
        return convertMonitoringTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GiraffeMetaModel createGiraffeMetaModel()
  {
    GiraffeMetaModelImpl giraffeMetaModel = new GiraffeMetaModelImpl();
    return giraffeMetaModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment createEnvironment()
  {
    EnvironmentImpl environment = new EnvironmentImpl();
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentDefinitions createDeploymentDefinitions()
  {
    DeploymentDefinitionsImpl deploymentDefinitions = new DeploymentDefinitionsImpl();
    return deploymentDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment createDeployment()
  {
    DeploymentImpl deployment = new DeploymentImpl();
    return deployment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualMachine createVirtualMachine()
  {
    VirtualMachineImpl virtualMachine = new VirtualMachineImpl();
    return virtualMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requeriments createRequeriments()
  {
    RequerimentsImpl requeriments = new RequerimentsImpl();
    return requeriments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Providers createProviders()
  {
    ProvidersImpl providers = new ProvidersImpl();
    return providers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Provider createProvider()
  {
    ProviderImpl provider = new ProviderImpl();
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherProvider createOtherProvider()
  {
    OtherProviderImpl otherProvider = new OtherProviderImpl();
    return otherProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Auth createAuth()
  {
    AuthImpl auth = new AuthImpl();
    return auth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Password createPassword()
  {
    PasswordImpl password = new PasswordImpl();
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key createKey()
  {
    KeyImpl key = new KeyImpl();
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Credential createCredential()
  {
    CredentialImpl credential = new CredentialImpl();
    return credential;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependency createDependency()
  {
    DependencyImpl dependency = new DependencyImpl();
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Install createInstall()
  {
    InstallImpl install = new InstallImpl();
    return install;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact createArtifact()
  {
    ArtifactImpl artifact = new ArtifactImpl();
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfArtifact createConfArtifact()
  {
    ConfArtifactImpl confArtifact = new ConfArtifactImpl();
    return confArtifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Config createConfig()
  {
    ConfigImpl config = new ConfigImpl();
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigBlock createConfigBlock()
  {
    ConfigBlockImpl configBlock = new ConfigBlockImpl();
    return configBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Code createCode()
  {
    CodeImpl code = new CodeImpl();
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeExternal createCodeExternal()
  {
    CodeExternalImpl codeExternal = new CodeExternalImpl();
    return codeExternal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptCommand createScriptCommand()
  {
    ScriptCommandImpl scriptCommand = new ScriptCommandImpl();
    return scriptCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptBlock createScriptBlock()
  {
    ScriptBlockImpl scriptBlock = new ScriptBlockImpl();
    return scriptBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nodeset createNodeset()
  {
    NodesetImpl nodeset = new NodesetImpl();
    return nodeset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Setup createSetup()
  {
    SetupImpl setup = new SetupImpl();
    return setup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deploy createDeploy()
  {
    DeployImpl deploy = new DeployImpl();
    return deploy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Execution createExecution()
  {
    ExecutionImpl execution = new ExecutionImpl();
    return execution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeProvType createNativeProvTypeFromString(EDataType eDataType, String initialValue)
  {
    NativeProvType result = NativeProvType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNativeProvTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeSO createNativeSOFromString(EDataType eDataType, String initialValue)
  {
    NativeSO result = NativeSO.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNativeSOToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeRequirement createNativeRequirementFromString(EDataType eDataType, String initialValue)
  {
    NativeRequirement result = NativeRequirement.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNativeRequirementToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeDistribution createNativeDistributionFromString(EDataType eDataType, String initialValue)
  {
    NativeDistribution result = NativeDistribution.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNativeDistributionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SrvSignal createSrvSignalFromString(EDataType eDataType, String initialValue)
  {
    SrvSignal result = SrvSignal.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSrvSignalToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileType createFileTypeFromString(EDataType eDataType, String initialValue)
  {
    FileType result = FileType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFileTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonitoringType createMonitoringTypeFromString(EDataType eDataType, String initialValue)
  {
    MonitoringType result = MonitoringType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMonitoringTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GiraffeDSLPackage getGiraffeDSLPackage()
  {
    return (GiraffeDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GiraffeDSLPackage getPackage()
  {
    return GiraffeDSLPackage.eINSTANCE;
  }

} //GiraffeDSLFactoryImpl
