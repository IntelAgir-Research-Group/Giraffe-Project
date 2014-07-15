/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Code;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Config;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfigBlock;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.FileType;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLFactory;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Import;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Key;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.MonitoringType;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeProvType;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Script;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptBlock;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptCommand;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GiraffeDSLPackageImpl extends EPackageImpl implements GiraffeDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass giraffeMetaModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deploymentDefinitionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deploymentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virtualMachineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requerimentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass passwordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass credentialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass installEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass artifactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass confArtifactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeExternalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodesetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deployEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nativeProvTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nativeSOEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nativeRequirementEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nativeDistributionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum srvSignalEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fileTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum monitoringTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GiraffeDSLPackageImpl()
  {
    super(eNS_URI, GiraffeDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GiraffeDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GiraffeDSLPackage init()
  {
    if (isInited) return (GiraffeDSLPackage)EPackage.Registry.INSTANCE.getEPackage(GiraffeDSLPackage.eNS_URI);

    // Obtain or create and register package
    GiraffeDSLPackageImpl theGiraffeDSLPackage = (GiraffeDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GiraffeDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GiraffeDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGiraffeDSLPackage.createPackageContents();

    // Initialize created meta-data
    theGiraffeDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGiraffeDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GiraffeDSLPackage.eNS_URI, theGiraffeDSLPackage);
    return theGiraffeDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGiraffeMetaModel()
  {
    return giraffeMetaModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGiraffeMetaModel_Imports()
  {
    return (EReference)giraffeMetaModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGiraffeMetaModel_Environment()
  {
    return (EReference)giraffeMetaModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGiraffeMetaModel_Deploymentdefinitions()
  {
    return (EReference)giraffeMetaModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGiraffeMetaModel_Deployment()
  {
    return (EReference)giraffeMetaModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironment()
  {
    return environmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironment_Auths()
  {
    return (EReference)environmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironment_Resources()
  {
    return (EReference)environmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironment_Dependencies()
  {
    return (EReference)environmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironment_Virtualmachines()
  {
    return (EReference)environmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironment_Providers()
  {
    return (EReference)environmentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeploymentDefinitions()
  {
    return deploymentDefinitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentDefinitions_Artifacts()
  {
    return (EReference)deploymentDefinitionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentDefinitions_Nodesets()
  {
    return (EReference)deploymentDefinitionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployment()
  {
    return deploymentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Setups()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Deploys()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirtualMachine()
  {
    return virtualMachineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualMachine_Name()
  {
    return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualMachine_So()
  {
    return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualMachine_Distribution()
  {
    return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualMachine_Version()
  {
    return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVirtualMachine_Auth()
  {
    return (EReference)virtualMachineEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVirtualMachine_Dep()
  {
    return (EReference)virtualMachineEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequeriments()
  {
    return requerimentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequeriments_Native()
  {
    return (EAttribute)requerimentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequeriments_Other()
  {
    return (EAttribute)requerimentsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProviders()
  {
    return providersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProviders_Name()
  {
    return (EAttribute)providersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProviders_AuthMethod()
  {
    return (EReference)providersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProviders_Resources()
  {
    return (EReference)providersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProviders_Vm()
  {
    return (EReference)providersEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProviders_Host()
  {
    return (EAttribute)providersEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvider()
  {
    return providerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvider_Type()
  {
    return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOtherProvider()
  {
    return otherProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherProvider_Type()
  {
    return (EAttribute)otherProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOtherProvider_Imports()
  {
    return (EReference)otherProviderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuth()
  {
    return authEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAuth_Type()
  {
    return (EAttribute)authEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAuth_Name()
  {
    return (EAttribute)authEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPassword()
  {
    return passwordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPassword_Username()
  {
    return (EAttribute)passwordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPassword_Password()
  {
    return (EAttribute)passwordEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKey()
  {
    return keyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKey_KeyFile()
  {
    return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCredential()
  {
    return credentialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCredential_CredentialFile()
  {
    return (EAttribute)credentialEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Name()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Cpu()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Memory()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Disk()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Relax()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependency()
  {
    return dependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependency_Type()
  {
    return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependency_Name()
  {
    return (EAttribute)dependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstall()
  {
    return installEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstall_DepName()
  {
    return (EAttribute)installEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstall_DepVersion()
  {
    return (EAttribute)installEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_SrvAction()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_ServiceName()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFile()
  {
    return fileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFile_FileType()
  {
    return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFile_Location()
  {
    return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtifact()
  {
    return artifactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifact_Type()
  {
    return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifact_Name()
  {
    return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfArtifact()
  {
    return confArtifactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfArtifact_Type()
  {
    return (EAttribute)confArtifactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfArtifact_Name()
  {
    return (EAttribute)confArtifactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfArtifact_DestFile()
  {
    return (EAttribute)confArtifactEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfig()
  {
    return configEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfig_LocalFile()
  {
    return (EAttribute)configEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigBlock()
  {
    return configBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfigBlock_Config()
  {
    return (EAttribute)configBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCode()
  {
    return codeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCode_Code()
  {
    return (EAttribute)codeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeExternal()
  {
    return codeExternalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeExternal_Class()
  {
    return (EAttribute)codeExternalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeExternal_Method()
  {
    return (EAttribute)codeExternalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScript()
  {
    return scriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScript_ScriptFile()
  {
    return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScriptCommand()
  {
    return scriptCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScriptCommand_ScriptCommand()
  {
    return (EAttribute)scriptCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScriptBlock()
  {
    return scriptBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScriptBlock_Block()
  {
    return (EAttribute)scriptBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeset()
  {
    return nodesetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeset_Name()
  {
    return (EAttribute)nodesetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeset_Range()
  {
    return (EAttribute)nodesetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetup()
  {
    return setupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetup_Name()
  {
    return (EAttribute)setupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetup_Provider()
  {
    return (EReference)setupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetup_NumberMachines()
  {
    return (EAttribute)setupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetup_Autoscale()
  {
    return (EAttribute)setupEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetup_Predictive()
  {
    return (EAttribute)setupEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeploy()
  {
    return deployEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploy_Name()
  {
    return (EAttribute)deployEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploy_Setups()
  {
    return (EReference)deployEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploy_Timeout()
  {
    return (EAttribute)deployEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploy_Executions()
  {
    return (EReference)deployEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecution()
  {
    return executionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecution_Name()
  {
    return (EAttribute)executionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecution_Code()
  {
    return (EReference)executionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecution_Config()
  {
    return (EReference)executionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecution_Nodes()
  {
    return (EReference)executionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecution_Seq()
  {
    return (EAttribute)executionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNativeProvType()
  {
    return nativeProvTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNativeSO()
  {
    return nativeSOEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNativeRequirement()
  {
    return nativeRequirementEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNativeDistribution()
  {
    return nativeDistributionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSrvSignal()
  {
    return srvSignalEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFileType()
  {
    return fileTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMonitoringType()
  {
    return monitoringTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GiraffeDSLFactory getGiraffeDSLFactory()
  {
    return (GiraffeDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    giraffeMetaModelEClass = createEClass(GIRAFFE_META_MODEL);
    createEReference(giraffeMetaModelEClass, GIRAFFE_META_MODEL__IMPORTS);
    createEReference(giraffeMetaModelEClass, GIRAFFE_META_MODEL__ENVIRONMENT);
    createEReference(giraffeMetaModelEClass, GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS);
    createEReference(giraffeMetaModelEClass, GIRAFFE_META_MODEL__DEPLOYMENT);

    environmentEClass = createEClass(ENVIRONMENT);
    createEReference(environmentEClass, ENVIRONMENT__AUTHS);
    createEReference(environmentEClass, ENVIRONMENT__RESOURCES);
    createEReference(environmentEClass, ENVIRONMENT__DEPENDENCIES);
    createEReference(environmentEClass, ENVIRONMENT__VIRTUALMACHINES);
    createEReference(environmentEClass, ENVIRONMENT__PROVIDERS);

    deploymentDefinitionsEClass = createEClass(DEPLOYMENT_DEFINITIONS);
    createEReference(deploymentDefinitionsEClass, DEPLOYMENT_DEFINITIONS__ARTIFACTS);
    createEReference(deploymentDefinitionsEClass, DEPLOYMENT_DEFINITIONS__NODESETS);

    deploymentEClass = createEClass(DEPLOYMENT);
    createEReference(deploymentEClass, DEPLOYMENT__SETUPS);
    createEReference(deploymentEClass, DEPLOYMENT__DEPLOYS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    virtualMachineEClass = createEClass(VIRTUAL_MACHINE);
    createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__NAME);
    createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__SO);
    createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__DISTRIBUTION);
    createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__VERSION);
    createEReference(virtualMachineEClass, VIRTUAL_MACHINE__AUTH);
    createEReference(virtualMachineEClass, VIRTUAL_MACHINE__DEP);

    requerimentsEClass = createEClass(REQUERIMENTS);
    createEAttribute(requerimentsEClass, REQUERIMENTS__NATIVE);
    createEAttribute(requerimentsEClass, REQUERIMENTS__OTHER);

    providersEClass = createEClass(PROVIDERS);
    createEAttribute(providersEClass, PROVIDERS__NAME);
    createEReference(providersEClass, PROVIDERS__AUTH_METHOD);
    createEReference(providersEClass, PROVIDERS__RESOURCES);
    createEReference(providersEClass, PROVIDERS__VM);
    createEAttribute(providersEClass, PROVIDERS__HOST);

    providerEClass = createEClass(PROVIDER);
    createEAttribute(providerEClass, PROVIDER__TYPE);

    otherProviderEClass = createEClass(OTHER_PROVIDER);
    createEAttribute(otherProviderEClass, OTHER_PROVIDER__TYPE);
    createEReference(otherProviderEClass, OTHER_PROVIDER__IMPORTS);

    authEClass = createEClass(AUTH);
    createEAttribute(authEClass, AUTH__TYPE);
    createEAttribute(authEClass, AUTH__NAME);

    passwordEClass = createEClass(PASSWORD);
    createEAttribute(passwordEClass, PASSWORD__USERNAME);
    createEAttribute(passwordEClass, PASSWORD__PASSWORD);

    keyEClass = createEClass(KEY);
    createEAttribute(keyEClass, KEY__KEY_FILE);

    credentialEClass = createEClass(CREDENTIAL);
    createEAttribute(credentialEClass, CREDENTIAL__CREDENTIAL_FILE);

    resourceEClass = createEClass(RESOURCE);
    createEAttribute(resourceEClass, RESOURCE__NAME);
    createEAttribute(resourceEClass, RESOURCE__CPU);
    createEAttribute(resourceEClass, RESOURCE__MEMORY);
    createEAttribute(resourceEClass, RESOURCE__DISK);
    createEAttribute(resourceEClass, RESOURCE__RELAX);

    dependencyEClass = createEClass(DEPENDENCY);
    createEAttribute(dependencyEClass, DEPENDENCY__TYPE);
    createEAttribute(dependencyEClass, DEPENDENCY__NAME);

    installEClass = createEClass(INSTALL);
    createEAttribute(installEClass, INSTALL__DEP_NAME);
    createEAttribute(installEClass, INSTALL__DEP_VERSION);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__SRV_ACTION);
    createEAttribute(serviceEClass, SERVICE__SERVICE_NAME);

    fileEClass = createEClass(FILE);
    createEAttribute(fileEClass, FILE__FILE_TYPE);
    createEAttribute(fileEClass, FILE__LOCATION);

    artifactEClass = createEClass(ARTIFACT);
    createEAttribute(artifactEClass, ARTIFACT__TYPE);
    createEAttribute(artifactEClass, ARTIFACT__NAME);

    confArtifactEClass = createEClass(CONF_ARTIFACT);
    createEAttribute(confArtifactEClass, CONF_ARTIFACT__TYPE);
    createEAttribute(confArtifactEClass, CONF_ARTIFACT__NAME);
    createEAttribute(confArtifactEClass, CONF_ARTIFACT__DEST_FILE);

    configEClass = createEClass(CONFIG);
    createEAttribute(configEClass, CONFIG__LOCAL_FILE);

    configBlockEClass = createEClass(CONFIG_BLOCK);
    createEAttribute(configBlockEClass, CONFIG_BLOCK__CONFIG);

    codeEClass = createEClass(CODE);
    createEAttribute(codeEClass, CODE__CODE);

    codeExternalEClass = createEClass(CODE_EXTERNAL);
    createEAttribute(codeExternalEClass, CODE_EXTERNAL__CLASS);
    createEAttribute(codeExternalEClass, CODE_EXTERNAL__METHOD);

    scriptEClass = createEClass(SCRIPT);
    createEAttribute(scriptEClass, SCRIPT__SCRIPT_FILE);

    scriptCommandEClass = createEClass(SCRIPT_COMMAND);
    createEAttribute(scriptCommandEClass, SCRIPT_COMMAND__SCRIPT_COMMAND);

    scriptBlockEClass = createEClass(SCRIPT_BLOCK);
    createEAttribute(scriptBlockEClass, SCRIPT_BLOCK__BLOCK);

    nodesetEClass = createEClass(NODESET);
    createEAttribute(nodesetEClass, NODESET__NAME);
    createEAttribute(nodesetEClass, NODESET__RANGE);

    setupEClass = createEClass(SETUP);
    createEAttribute(setupEClass, SETUP__NAME);
    createEReference(setupEClass, SETUP__PROVIDER);
    createEAttribute(setupEClass, SETUP__NUMBER_MACHINES);
    createEAttribute(setupEClass, SETUP__AUTOSCALE);
    createEAttribute(setupEClass, SETUP__PREDICTIVE);

    deployEClass = createEClass(DEPLOY);
    createEAttribute(deployEClass, DEPLOY__NAME);
    createEReference(deployEClass, DEPLOY__SETUPS);
    createEAttribute(deployEClass, DEPLOY__TIMEOUT);
    createEReference(deployEClass, DEPLOY__EXECUTIONS);

    executionEClass = createEClass(EXECUTION);
    createEAttribute(executionEClass, EXECUTION__NAME);
    createEReference(executionEClass, EXECUTION__CODE);
    createEReference(executionEClass, EXECUTION__CONFIG);
    createEReference(executionEClass, EXECUTION__NODES);
    createEAttribute(executionEClass, EXECUTION__SEQ);

    // Create enums
    nativeProvTypeEEnum = createEEnum(NATIVE_PROV_TYPE);
    nativeSOEEnum = createEEnum(NATIVE_SO);
    nativeRequirementEEnum = createEEnum(NATIVE_REQUIREMENT);
    nativeDistributionEEnum = createEEnum(NATIVE_DISTRIBUTION);
    srvSignalEEnum = createEEnum(SRV_SIGNAL);
    fileTypeEEnum = createEEnum(FILE_TYPE);
    monitoringTypeEEnum = createEEnum(MONITORING_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    providerEClass.getESuperTypes().add(this.getProviders());
    otherProviderEClass.getESuperTypes().add(this.getProviders());
    passwordEClass.getESuperTypes().add(this.getAuth());
    keyEClass.getESuperTypes().add(this.getAuth());
    credentialEClass.getESuperTypes().add(this.getAuth());
    installEClass.getESuperTypes().add(this.getDependency());
    serviceEClass.getESuperTypes().add(this.getDependency());
    fileEClass.getESuperTypes().add(this.getDependency());
    configEClass.getESuperTypes().add(this.getConfArtifact());
    configBlockEClass.getESuperTypes().add(this.getConfArtifact());
    codeEClass.getESuperTypes().add(this.getArtifact());
    codeExternalEClass.getESuperTypes().add(this.getArtifact());
    scriptEClass.getESuperTypes().add(this.getArtifact());
    scriptCommandEClass.getESuperTypes().add(this.getArtifact());
    scriptBlockEClass.getESuperTypes().add(this.getArtifact());

    // Initialize classes and features; add operations and parameters
    initEClass(giraffeMetaModelEClass, GiraffeMetaModel.class, "GiraffeMetaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGiraffeMetaModel_Imports(), this.getImport(), null, "imports", null, 0, -1, GiraffeMetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGiraffeMetaModel_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, GiraffeMetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGiraffeMetaModel_Deploymentdefinitions(), this.getDeploymentDefinitions(), null, "deploymentdefinitions", null, 0, 1, GiraffeMetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGiraffeMetaModel_Deployment(), this.getDeployment(), null, "deployment", null, 0, 1, GiraffeMetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnvironment_Auths(), this.getAuth(), null, "auths", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnvironment_Resources(), this.getResource(), null, "resources", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnvironment_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnvironment_Virtualmachines(), this.getVirtualMachine(), null, "virtualmachines", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnvironment_Providers(), this.getProviders(), null, "providers", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentDefinitionsEClass, DeploymentDefinitions.class, "DeploymentDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeploymentDefinitions_Artifacts(), ecorePackage.getEObject(), null, "artifacts", null, 0, -1, DeploymentDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeploymentDefinitions_Nodesets(), this.getNodeset(), null, "nodesets", null, 0, -1, DeploymentDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeployment_Setups(), this.getSetup(), null, "setups", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Deploys(), this.getDeploy(), null, "deploys", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirtualMachine_Name(), ecorePackage.getEString(), "name", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualMachine_So(), this.getNativeSO(), "so", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualMachine_Distribution(), this.getNativeDistribution(), "distribution", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualMachine_Version(), ecorePackage.getEFloat(), "version", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVirtualMachine_Auth(), this.getAuth(), null, "auth", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVirtualMachine_Dep(), this.getDependency(), null, "dep", null, 0, -1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requerimentsEClass, Requeriments.class, "Requeriments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequeriments_Native(), this.getNativeRequirement(), "native", null, 0, 1, Requeriments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequeriments_Other(), ecorePackage.getEString(), "other", null, 0, 1, Requeriments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providersEClass, Providers.class, "Providers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProviders_Name(), ecorePackage.getEString(), "name", null, 0, 1, Providers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProviders_AuthMethod(), this.getAuth(), null, "authMethod", null, 0, 1, Providers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProviders_Resources(), this.getResource(), null, "resources", null, 0, 1, Providers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProviders_Vm(), this.getVirtualMachine(), null, "vm", null, 0, 1, Providers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProviders_Host(), ecorePackage.getEString(), "host", null, 0, 1, Providers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProvider_Type(), this.getNativeProvType(), "type", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(otherProviderEClass, OtherProvider.class, "OtherProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOtherProvider_Type(), ecorePackage.getEString(), "type", null, 0, 1, OtherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOtherProvider_Imports(), this.getImport(), null, "imports", null, 0, -1, OtherProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(authEClass, Auth.class, "Auth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAuth_Type(), ecorePackage.getEString(), "type", null, 0, 1, Auth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAuth_Name(), ecorePackage.getEString(), "name", null, 0, 1, Auth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(passwordEClass, Password.class, "Password", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPassword_Username(), ecorePackage.getEString(), "username", null, 0, 1, Password.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPassword_Password(), ecorePackage.getEString(), "password", null, 0, 1, Password.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKey_KeyFile(), ecorePackage.getEString(), "keyFile", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(credentialEClass, Credential.class, "Credential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCredential_CredentialFile(), ecorePackage.getEString(), "credentialFile", null, 0, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Cpu(), ecorePackage.getEString(), "cpu", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Memory(), ecorePackage.getEInt(), "memory", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Disk(), ecorePackage.getEInt(), "disk", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Relax(), ecorePackage.getEInt(), "relax", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependency_Type(), ecorePackage.getEString(), "type", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependency_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(installEClass, Install.class, "Install", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstall_DepName(), ecorePackage.getEString(), "depName", null, 0, 1, Install.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstall_DepVersion(), ecorePackage.getEFloat(), "depVersion", null, 0, 1, Install.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_SrvAction(), this.getSrvSignal(), "srvAction", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getService_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFile_FileType(), this.getFileType(), "fileType", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFile_Location(), ecorePackage.getEString(), "location", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArtifact_Type(), ecorePackage.getEString(), "type", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(confArtifactEClass, ConfArtifact.class, "ConfArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfArtifact_Type(), ecorePackage.getEString(), "type", null, 0, 1, ConfArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConfArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConfArtifact_DestFile(), ecorePackage.getEString(), "destFile", null, 0, 1, ConfArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfig_LocalFile(), ecorePackage.getEString(), "localFile", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configBlockEClass, ConfigBlock.class, "ConfigBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfigBlock_Config(), ecorePackage.getEString(), "config", null, 0, 1, ConfigBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCode_Code(), ecorePackage.getEString(), "code", null, 0, 1, Code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeExternalEClass, CodeExternal.class, "CodeExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeExternal_Class(), ecorePackage.getEString(), "class", null, 0, 1, CodeExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCodeExternal_Method(), ecorePackage.getEString(), "method", null, 0, 1, CodeExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScript_ScriptFile(), ecorePackage.getEString(), "scriptFile", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptCommandEClass, ScriptCommand.class, "ScriptCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScriptCommand_ScriptCommand(), ecorePackage.getEString(), "scriptCommand", null, 0, 1, ScriptCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptBlockEClass, ScriptBlock.class, "ScriptBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScriptBlock_Block(), ecorePackage.getEString(), "block", null, 0, 1, ScriptBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodesetEClass, Nodeset.class, "Nodeset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Nodeset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeset_Range(), ecorePackage.getEString(), "range", null, 0, 1, Nodeset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setupEClass, Setup.class, "Setup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Setup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetup_Provider(), this.getProviders(), null, "provider", null, 0, 1, Setup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetup_NumberMachines(), ecorePackage.getEInt(), "numberMachines", null, 0, 1, Setup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetup_Autoscale(), ecorePackage.getEBoolean(), "autoscale", null, 0, 1, Setup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetup_Predictive(), ecorePackage.getEBoolean(), "predictive", null, 0, 1, Setup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deployEClass, Deploy.class, "Deploy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeploy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeploy_Setups(), this.getSetup(), null, "setups", null, 0, -1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeploy_Timeout(), ecorePackage.getEInt(), "timeout", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeploy_Executions(), this.getExecution(), null, "executions", null, 0, -1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(executionEClass, Execution.class, "Execution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExecution_Name(), ecorePackage.getEString(), "name", null, 0, 1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecution_Code(), this.getArtifact(), null, "code", null, 0, 1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecution_Config(), this.getConfArtifact(), null, "config", null, 0, -1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecution_Nodes(), this.getNodeset(), null, "nodes", null, 0, 1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExecution_Seq(), ecorePackage.getEInt(), "seq", null, 0, 1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(nativeProvTypeEEnum, NativeProvType.class, "NativeProvType");
    addEEnumLiteral(nativeProvTypeEEnum, NativeProvType.AMAZON);
    addEEnumLiteral(nativeProvTypeEEnum, NativeProvType.GOOGLE);
    addEEnumLiteral(nativeProvTypeEEnum, NativeProvType.G5000);
    addEEnumLiteral(nativeProvTypeEEnum, NativeProvType.VIRTUALBOX);

    initEEnum(nativeSOEEnum, NativeSO.class, "NativeSO");
    addEEnumLiteral(nativeSOEEnum, NativeSO.LINUX);

    initEEnum(nativeRequirementEEnum, NativeRequirement.class, "NativeRequirement");
    addEEnumLiteral(nativeRequirementEEnum, NativeRequirement.SSH);
    addEEnumLiteral(nativeRequirementEEnum, NativeRequirement.TOMCAT);
    addEEnumLiteral(nativeRequirementEEnum, NativeRequirement.APACHE);

    initEEnum(nativeDistributionEEnum, NativeDistribution.class, "NativeDistribution");
    addEEnumLiteral(nativeDistributionEEnum, NativeDistribution.UBUNTU);
    addEEnumLiteral(nativeDistributionEEnum, NativeDistribution.DEBIAN);
    addEEnumLiteral(nativeDistributionEEnum, NativeDistribution.CENTOS);
    addEEnumLiteral(nativeDistributionEEnum, NativeDistribution.FEDORA);

    initEEnum(srvSignalEEnum, SrvSignal.class, "SrvSignal");
    addEEnumLiteral(srvSignalEEnum, SrvSignal.START);
    addEEnumLiteral(srvSignalEEnum, SrvSignal.RESTART);
    addEEnumLiteral(srvSignalEEnum, SrvSignal.STOP);

    initEEnum(fileTypeEEnum, FileType.class, "FileType");
    addEEnumLiteral(fileTypeEEnum, FileType.LOCAL);
    addEEnumLiteral(fileTypeEEnum, FileType.REMOTE);

    initEEnum(monitoringTypeEEnum, MonitoringType.class, "MonitoringType");
    addEEnumLiteral(monitoringTypeEEnum, MonitoringType.PREDICTIVE);
    addEEnumLiteral(monitoringTypeEEnum, MonitoringType.REACTIVE);

    // Create resource
    createResource(eNS_URI);
  }

} //GiraffeDSLPackageImpl
