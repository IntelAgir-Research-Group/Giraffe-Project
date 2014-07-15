/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes;
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
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLFactory;
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
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Type;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
  private EClass domainModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initMachinesFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initIncrementFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virtualMachineFeatureEClass = null;

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
  private EClass virtualMachineTypeFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cloudProviderTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cloudProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cloudOptionalTypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cloudTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoZoneTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mgmAddressTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cloudCredentialTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cloudUserTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cloudPasswordTypeEClass = null;

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
  private EClass deployAppFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deployTypeFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deployTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deployRangeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deployAppEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deployAppClassTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deployAppMasterMethodTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deployAppSlaveMethodTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monitorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monitorRangeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monitoringTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stressRangeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stressClassTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stressMethodTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionRangeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionClassTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionMethodTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featuresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intFeatureEClass = null;

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
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#eNS_URI
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
  public EClass getDomainModel()
  {
    return domainModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainModel_Elements()
  {
    return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreate()
  {
    return createEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreate_VMachine()
  {
    return (EReference)createEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreate_InitMachines()
  {
    return (EReference)createEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreate_InitIncrement()
  {
    return (EReference)createEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitMachinesFeature()
  {
    return initMachinesFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitMachinesFeature_Many()
  {
    return (EAttribute)initMachinesFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitMachinesFeature_Name()
  {
    return (EAttribute)initMachinesFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitMachinesFeature_Type()
  {
    return (EAttribute)initMachinesFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitIncrementFeature()
  {
    return initIncrementFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitIncrementFeature_Many()
  {
    return (EAttribute)initIncrementFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitIncrementFeature_Name()
  {
    return (EAttribute)initIncrementFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitIncrementFeature_Type()
  {
    return (EAttribute)initIncrementFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirtualMachineFeature()
  {
    return virtualMachineFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualMachineFeature_Many()
  {
    return (EAttribute)virtualMachineFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualMachineFeature_Name()
  {
    return (EAttribute)virtualMachineFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVirtualMachineFeature_Type()
  {
    return (EReference)virtualMachineFeatureEClass.getEStructuralFeatures().get(2);
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
  public EReference getVirtualMachine_VM()
  {
    return (EReference)virtualMachineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVirtualMachine_CloudProvider()
  {
    return (EReference)virtualMachineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirtualMachineTypeFeature()
  {
    return virtualMachineTypeFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualMachineTypeFeature_Many()
  {
    return (EAttribute)virtualMachineTypeFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualMachineTypeFeature_Name()
  {
    return (EAttribute)virtualMachineTypeFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualMachineTypeFeature_Type()
  {
    return (EAttribute)virtualMachineTypeFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCloudProviderType()
  {
    return cloudProviderTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudProviderType_Many()
  {
    return (EAttribute)cloudProviderTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudProviderType_Name()
  {
    return (EAttribute)cloudProviderTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCloudProviderType_Type()
  {
    return (EReference)cloudProviderTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCloudProvider()
  {
    return cloudProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCloudProvider_CloudType()
  {
    return (EReference)cloudProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCloudProvider_CloudAddress()
  {
    return (EReference)cloudProviderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCloudProvider_CloudCredential()
  {
    return (EReference)cloudProviderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCloudProvider_CloudOptionalTypes()
  {
    return (EReference)cloudProviderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCloudOptionalTypes()
  {
    return cloudOptionalTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudOptionalTypes_Many()
  {
    return (EAttribute)cloudOptionalTypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudOptionalTypes_Name()
  {
    return (EAttribute)cloudOptionalTypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudOptionalTypes_Type()
  {
    return (EAttribute)cloudOptionalTypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCloudType()
  {
    return cloudTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudType_Many()
  {
    return (EAttribute)cloudTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudType_Name()
  {
    return (EAttribute)cloudTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudType_Type()
  {
    return (EAttribute)cloudTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScriptType()
  {
    return scriptTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoZoneType()
  {
    return geoZoneTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMgmAddressType()
  {
    return mgmAddressTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMgmAddressType_Many()
  {
    return (EAttribute)mgmAddressTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMgmAddressType_Name()
  {
    return (EAttribute)mgmAddressTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMgmAddressType_Type()
  {
    return (EAttribute)mgmAddressTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCloudCredentialType()
  {
    return cloudCredentialTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudCredentialType_Many()
  {
    return (EAttribute)cloudCredentialTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudCredentialType_Name()
  {
    return (EAttribute)cloudCredentialTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCloudCredentialType_Type()
  {
    return (EAttribute)cloudCredentialTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCloudUserType()
  {
    return cloudUserTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCloudPasswordType()
  {
    return cloudPasswordTypeEClass;
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
  public EReference getDeploy_DeployOne()
  {
    return (EReference)deployEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploy_DeployTwo()
  {
    return (EReference)deployEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployAppFeature()
  {
    return deployAppFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppFeature_Many()
  {
    return (EAttribute)deployAppFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppFeature_Name()
  {
    return (EAttribute)deployAppFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployAppFeature_Type()
  {
    return (EReference)deployAppFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployTypeFeature()
  {
    return deployTypeFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployTypeFeature_Many()
  {
    return (EAttribute)deployTypeFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployTypeFeature_Name()
  {
    return (EAttribute)deployTypeFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployTypeFeature_Type()
  {
    return (EReference)deployTypeFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployType()
  {
    return deployTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployType_Range()
  {
    return (EReference)deployTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployRangeType()
  {
    return deployRangeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployRangeType_Many()
  {
    return (EAttribute)deployRangeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployRangeType_Name()
  {
    return (EAttribute)deployRangeTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployRangeType_Type()
  {
    return (EAttribute)deployRangeTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployApp()
  {
    return deployAppEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployApp_Class()
  {
    return (EReference)deployAppEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployApp_DeployMasterMethod()
  {
    return (EReference)deployAppEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployApp_DeploySlaveMethod()
  {
    return (EReference)deployAppEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployAppClassType()
  {
    return deployAppClassTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppClassType_Many()
  {
    return (EAttribute)deployAppClassTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppClassType_Name()
  {
    return (EAttribute)deployAppClassTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppClassType_Type()
  {
    return (EAttribute)deployAppClassTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployAppMasterMethodType()
  {
    return deployAppMasterMethodTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppMasterMethodType_Many()
  {
    return (EAttribute)deployAppMasterMethodTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppMasterMethodType_Name()
  {
    return (EAttribute)deployAppMasterMethodTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppMasterMethodType_Type()
  {
    return (EAttribute)deployAppMasterMethodTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployAppSlaveMethodType()
  {
    return deployAppSlaveMethodTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppSlaveMethodType_Many()
  {
    return (EAttribute)deployAppSlaveMethodTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppSlaveMethodType_Name()
  {
    return (EAttribute)deployAppSlaveMethodTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployAppSlaveMethodType_Type()
  {
    return (EAttribute)deployAppSlaveMethodTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonitor()
  {
    return monitorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMonitor_Range()
  {
    return (EReference)monitorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMonitor_MonitoringType()
  {
    return (EReference)monitorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonitorRangeType()
  {
    return monitorRangeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonitorRangeType_Many()
  {
    return (EAttribute)monitorRangeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonitorRangeType_Name()
  {
    return (EAttribute)monitorRangeTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonitorRangeType_Type()
  {
    return (EAttribute)monitorRangeTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonitoringType()
  {
    return monitoringTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonitoringType_Many()
  {
    return (EAttribute)monitoringTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonitoringType_Name()
  {
    return (EAttribute)monitoringTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonitoringType_Type()
  {
    return (EAttribute)monitoringTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStress()
  {
    return stressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStress_Range()
  {
    return (EReference)stressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStress_StressClass()
  {
    return (EReference)stressEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStress_StressMethod()
  {
    return (EReference)stressEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStressRangeType()
  {
    return stressRangeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStressRangeType_Many()
  {
    return (EAttribute)stressRangeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStressRangeType_Name()
  {
    return (EAttribute)stressRangeTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStressRangeType_Type()
  {
    return (EAttribute)stressRangeTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStressClassType()
  {
    return stressClassTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStressClassType_Many()
  {
    return (EAttribute)stressClassTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStressClassType_Name()
  {
    return (EAttribute)stressClassTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStressClassType_Type()
  {
    return (EAttribute)stressClassTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStressMethodType()
  {
    return stressMethodTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStressMethodType_Many()
  {
    return (EAttribute)stressMethodTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStressMethodType_Name()
  {
    return (EAttribute)stressMethodTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStressMethodType_Type()
  {
    return (EAttribute)stressMethodTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Range()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Class()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Method()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionRangeType()
  {
    return actionRangeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionRangeType_Many()
  {
    return (EAttribute)actionRangeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionRangeType_Name()
  {
    return (EAttribute)actionRangeTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionRangeType_Type()
  {
    return (EAttribute)actionRangeTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionClassType()
  {
    return actionClassTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionClassType_Many()
  {
    return (EAttribute)actionClassTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionClassType_Name()
  {
    return (EAttribute)actionClassTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionClassType_Type()
  {
    return (EAttribute)actionClassTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionMethodType()
  {
    return actionMethodTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionMethodType_Many()
  {
    return (EAttribute)actionMethodTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionMethodType_Name()
  {
    return (EAttribute)actionMethodTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionMethodType_Type()
  {
    return (EAttribute)actionMethodTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatures()
  {
    return featuresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatures_Name()
  {
    return (EAttribute)featuresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntFeature()
  {
    return intFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntFeature_Name()
  {
    return (EAttribute)intFeatureEClass.getEStructuralFeatures().get(0);
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
    domainModelEClass = createEClass(DOMAIN_MODEL);
    createEReference(domainModelEClass, DOMAIN_MODEL__ELEMENTS);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);

    createEClass = createEClass(CREATE);
    createEReference(createEClass, CREATE__VMACHINE);
    createEReference(createEClass, CREATE__INIT_MACHINES);
    createEReference(createEClass, CREATE__INIT_INCREMENT);

    initMachinesFeatureEClass = createEClass(INIT_MACHINES_FEATURE);
    createEAttribute(initMachinesFeatureEClass, INIT_MACHINES_FEATURE__MANY);
    createEAttribute(initMachinesFeatureEClass, INIT_MACHINES_FEATURE__NAME);
    createEAttribute(initMachinesFeatureEClass, INIT_MACHINES_FEATURE__TYPE);

    initIncrementFeatureEClass = createEClass(INIT_INCREMENT_FEATURE);
    createEAttribute(initIncrementFeatureEClass, INIT_INCREMENT_FEATURE__MANY);
    createEAttribute(initIncrementFeatureEClass, INIT_INCREMENT_FEATURE__NAME);
    createEAttribute(initIncrementFeatureEClass, INIT_INCREMENT_FEATURE__TYPE);

    virtualMachineFeatureEClass = createEClass(VIRTUAL_MACHINE_FEATURE);
    createEAttribute(virtualMachineFeatureEClass, VIRTUAL_MACHINE_FEATURE__MANY);
    createEAttribute(virtualMachineFeatureEClass, VIRTUAL_MACHINE_FEATURE__NAME);
    createEReference(virtualMachineFeatureEClass, VIRTUAL_MACHINE_FEATURE__TYPE);

    virtualMachineEClass = createEClass(VIRTUAL_MACHINE);
    createEReference(virtualMachineEClass, VIRTUAL_MACHINE__VM);
    createEReference(virtualMachineEClass, VIRTUAL_MACHINE__CLOUD_PROVIDER);

    virtualMachineTypeFeatureEClass = createEClass(VIRTUAL_MACHINE_TYPE_FEATURE);
    createEAttribute(virtualMachineTypeFeatureEClass, VIRTUAL_MACHINE_TYPE_FEATURE__MANY);
    createEAttribute(virtualMachineTypeFeatureEClass, VIRTUAL_MACHINE_TYPE_FEATURE__NAME);
    createEAttribute(virtualMachineTypeFeatureEClass, VIRTUAL_MACHINE_TYPE_FEATURE__TYPE);

    cloudProviderTypeEClass = createEClass(CLOUD_PROVIDER_TYPE);
    createEAttribute(cloudProviderTypeEClass, CLOUD_PROVIDER_TYPE__MANY);
    createEAttribute(cloudProviderTypeEClass, CLOUD_PROVIDER_TYPE__NAME);
    createEReference(cloudProviderTypeEClass, CLOUD_PROVIDER_TYPE__TYPE);

    cloudProviderEClass = createEClass(CLOUD_PROVIDER);
    createEReference(cloudProviderEClass, CLOUD_PROVIDER__CLOUD_TYPE);
    createEReference(cloudProviderEClass, CLOUD_PROVIDER__CLOUD_ADDRESS);
    createEReference(cloudProviderEClass, CLOUD_PROVIDER__CLOUD_CREDENTIAL);
    createEReference(cloudProviderEClass, CLOUD_PROVIDER__CLOUD_OPTIONAL_TYPES);

    cloudOptionalTypesEClass = createEClass(CLOUD_OPTIONAL_TYPES);
    createEAttribute(cloudOptionalTypesEClass, CLOUD_OPTIONAL_TYPES__MANY);
    createEAttribute(cloudOptionalTypesEClass, CLOUD_OPTIONAL_TYPES__NAME);
    createEAttribute(cloudOptionalTypesEClass, CLOUD_OPTIONAL_TYPES__TYPE);

    cloudTypeEClass = createEClass(CLOUD_TYPE);
    createEAttribute(cloudTypeEClass, CLOUD_TYPE__MANY);
    createEAttribute(cloudTypeEClass, CLOUD_TYPE__NAME);
    createEAttribute(cloudTypeEClass, CLOUD_TYPE__TYPE);

    scriptTypeEClass = createEClass(SCRIPT_TYPE);

    geoZoneTypeEClass = createEClass(GEO_ZONE_TYPE);

    mgmAddressTypeEClass = createEClass(MGM_ADDRESS_TYPE);
    createEAttribute(mgmAddressTypeEClass, MGM_ADDRESS_TYPE__MANY);
    createEAttribute(mgmAddressTypeEClass, MGM_ADDRESS_TYPE__NAME);
    createEAttribute(mgmAddressTypeEClass, MGM_ADDRESS_TYPE__TYPE);

    cloudCredentialTypeEClass = createEClass(CLOUD_CREDENTIAL_TYPE);
    createEAttribute(cloudCredentialTypeEClass, CLOUD_CREDENTIAL_TYPE__MANY);
    createEAttribute(cloudCredentialTypeEClass, CLOUD_CREDENTIAL_TYPE__NAME);
    createEAttribute(cloudCredentialTypeEClass, CLOUD_CREDENTIAL_TYPE__TYPE);

    cloudUserTypeEClass = createEClass(CLOUD_USER_TYPE);

    cloudPasswordTypeEClass = createEClass(CLOUD_PASSWORD_TYPE);

    deployEClass = createEClass(DEPLOY);
    createEReference(deployEClass, DEPLOY__DEPLOY_ONE);
    createEReference(deployEClass, DEPLOY__DEPLOY_TWO);

    deployAppFeatureEClass = createEClass(DEPLOY_APP_FEATURE);
    createEAttribute(deployAppFeatureEClass, DEPLOY_APP_FEATURE__MANY);
    createEAttribute(deployAppFeatureEClass, DEPLOY_APP_FEATURE__NAME);
    createEReference(deployAppFeatureEClass, DEPLOY_APP_FEATURE__TYPE);

    deployTypeFeatureEClass = createEClass(DEPLOY_TYPE_FEATURE);
    createEAttribute(deployTypeFeatureEClass, DEPLOY_TYPE_FEATURE__MANY);
    createEAttribute(deployTypeFeatureEClass, DEPLOY_TYPE_FEATURE__NAME);
    createEReference(deployTypeFeatureEClass, DEPLOY_TYPE_FEATURE__TYPE);

    deployTypeEClass = createEClass(DEPLOY_TYPE);
    createEReference(deployTypeEClass, DEPLOY_TYPE__RANGE);

    deployRangeTypeEClass = createEClass(DEPLOY_RANGE_TYPE);
    createEAttribute(deployRangeTypeEClass, DEPLOY_RANGE_TYPE__MANY);
    createEAttribute(deployRangeTypeEClass, DEPLOY_RANGE_TYPE__NAME);
    createEAttribute(deployRangeTypeEClass, DEPLOY_RANGE_TYPE__TYPE);

    deployAppEClass = createEClass(DEPLOY_APP);
    createEReference(deployAppEClass, DEPLOY_APP__CLASS);
    createEReference(deployAppEClass, DEPLOY_APP__DEPLOY_MASTER_METHOD);
    createEReference(deployAppEClass, DEPLOY_APP__DEPLOY_SLAVE_METHOD);

    deployAppClassTypeEClass = createEClass(DEPLOY_APP_CLASS_TYPE);
    createEAttribute(deployAppClassTypeEClass, DEPLOY_APP_CLASS_TYPE__MANY);
    createEAttribute(deployAppClassTypeEClass, DEPLOY_APP_CLASS_TYPE__NAME);
    createEAttribute(deployAppClassTypeEClass, DEPLOY_APP_CLASS_TYPE__TYPE);

    deployAppMasterMethodTypeEClass = createEClass(DEPLOY_APP_MASTER_METHOD_TYPE);
    createEAttribute(deployAppMasterMethodTypeEClass, DEPLOY_APP_MASTER_METHOD_TYPE__MANY);
    createEAttribute(deployAppMasterMethodTypeEClass, DEPLOY_APP_MASTER_METHOD_TYPE__NAME);
    createEAttribute(deployAppMasterMethodTypeEClass, DEPLOY_APP_MASTER_METHOD_TYPE__TYPE);

    deployAppSlaveMethodTypeEClass = createEClass(DEPLOY_APP_SLAVE_METHOD_TYPE);
    createEAttribute(deployAppSlaveMethodTypeEClass, DEPLOY_APP_SLAVE_METHOD_TYPE__MANY);
    createEAttribute(deployAppSlaveMethodTypeEClass, DEPLOY_APP_SLAVE_METHOD_TYPE__NAME);
    createEAttribute(deployAppSlaveMethodTypeEClass, DEPLOY_APP_SLAVE_METHOD_TYPE__TYPE);

    monitorEClass = createEClass(MONITOR);
    createEReference(monitorEClass, MONITOR__RANGE);
    createEReference(monitorEClass, MONITOR__MONITORING_TYPE);

    monitorRangeTypeEClass = createEClass(MONITOR_RANGE_TYPE);
    createEAttribute(monitorRangeTypeEClass, MONITOR_RANGE_TYPE__MANY);
    createEAttribute(monitorRangeTypeEClass, MONITOR_RANGE_TYPE__NAME);
    createEAttribute(monitorRangeTypeEClass, MONITOR_RANGE_TYPE__TYPE);

    monitoringTypeEClass = createEClass(MONITORING_TYPE);
    createEAttribute(monitoringTypeEClass, MONITORING_TYPE__MANY);
    createEAttribute(monitoringTypeEClass, MONITORING_TYPE__NAME);
    createEAttribute(monitoringTypeEClass, MONITORING_TYPE__TYPE);

    stressEClass = createEClass(STRESS);
    createEReference(stressEClass, STRESS__RANGE);
    createEReference(stressEClass, STRESS__STRESS_CLASS);
    createEReference(stressEClass, STRESS__STRESS_METHOD);

    stressRangeTypeEClass = createEClass(STRESS_RANGE_TYPE);
    createEAttribute(stressRangeTypeEClass, STRESS_RANGE_TYPE__MANY);
    createEAttribute(stressRangeTypeEClass, STRESS_RANGE_TYPE__NAME);
    createEAttribute(stressRangeTypeEClass, STRESS_RANGE_TYPE__TYPE);

    stressClassTypeEClass = createEClass(STRESS_CLASS_TYPE);
    createEAttribute(stressClassTypeEClass, STRESS_CLASS_TYPE__MANY);
    createEAttribute(stressClassTypeEClass, STRESS_CLASS_TYPE__NAME);
    createEAttribute(stressClassTypeEClass, STRESS_CLASS_TYPE__TYPE);

    stressMethodTypeEClass = createEClass(STRESS_METHOD_TYPE);
    createEAttribute(stressMethodTypeEClass, STRESS_METHOD_TYPE__MANY);
    createEAttribute(stressMethodTypeEClass, STRESS_METHOD_TYPE__NAME);
    createEAttribute(stressMethodTypeEClass, STRESS_METHOD_TYPE__TYPE);

    actionEClass = createEClass(ACTION);
    createEReference(actionEClass, ACTION__RANGE);
    createEReference(actionEClass, ACTION__CLASS);
    createEReference(actionEClass, ACTION__METHOD);

    actionRangeTypeEClass = createEClass(ACTION_RANGE_TYPE);
    createEAttribute(actionRangeTypeEClass, ACTION_RANGE_TYPE__MANY);
    createEAttribute(actionRangeTypeEClass, ACTION_RANGE_TYPE__NAME);
    createEAttribute(actionRangeTypeEClass, ACTION_RANGE_TYPE__TYPE);

    actionClassTypeEClass = createEClass(ACTION_CLASS_TYPE);
    createEAttribute(actionClassTypeEClass, ACTION_CLASS_TYPE__MANY);
    createEAttribute(actionClassTypeEClass, ACTION_CLASS_TYPE__NAME);
    createEAttribute(actionClassTypeEClass, ACTION_CLASS_TYPE__TYPE);

    actionMethodTypeEClass = createEClass(ACTION_METHOD_TYPE);
    createEAttribute(actionMethodTypeEClass, ACTION_METHOD_TYPE__MANY);
    createEAttribute(actionMethodTypeEClass, ACTION_METHOD_TYPE__NAME);
    createEAttribute(actionMethodTypeEClass, ACTION_METHOD_TYPE__TYPE);

    featuresEClass = createEClass(FEATURES);
    createEAttribute(featuresEClass, FEATURES__NAME);

    intFeatureEClass = createEClass(INT_FEATURE);
    createEAttribute(intFeatureEClass, INT_FEATURE__NAME);
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
    createEClass.getESuperTypes().add(this.getType());
    virtualMachineEClass.getESuperTypes().add(this.getType());
    cloudProviderEClass.getESuperTypes().add(this.getType());
    scriptTypeEClass.getESuperTypes().add(this.getCloudOptionalTypes());
    geoZoneTypeEClass.getESuperTypes().add(this.getCloudOptionalTypes());
    cloudUserTypeEClass.getESuperTypes().add(this.getCloudOptionalTypes());
    cloudPasswordTypeEClass.getESuperTypes().add(this.getCloudOptionalTypes());
    deployEClass.getESuperTypes().add(this.getType());
    deployTypeEClass.getESuperTypes().add(this.getType());
    deployAppEClass.getESuperTypes().add(this.getType());
    monitorEClass.getESuperTypes().add(this.getType());
    stressEClass.getESuperTypes().add(this.getType());
    actionEClass.getESuperTypes().add(this.getType());

    // Initialize classes and features; add operations and parameters
    initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainModel_Elements(), this.getType(), null, "elements", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreate_VMachine(), this.getVirtualMachineFeature(), null, "vMachine", null, 0, -1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreate_InitMachines(), this.getInitMachinesFeature(), null, "initMachines", null, 0, -1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreate_InitIncrement(), this.getInitIncrementFeature(), null, "initIncrement", null, 0, -1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initMachinesFeatureEClass, InitMachinesFeature.class, "InitMachinesFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInitMachinesFeature_Many(), ecorePackage.getEString(), "many", null, 0, 1, InitMachinesFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInitMachinesFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, InitMachinesFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInitMachinesFeature_Type(), ecorePackage.getEInt(), "type", null, 0, 1, InitMachinesFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initIncrementFeatureEClass, InitIncrementFeature.class, "InitIncrementFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInitIncrementFeature_Many(), ecorePackage.getEString(), "many", null, 0, 1, InitIncrementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInitIncrementFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, InitIncrementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInitIncrementFeature_Type(), ecorePackage.getEInt(), "type", null, 0, 1, InitIncrementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualMachineFeatureEClass, VirtualMachineFeature.class, "VirtualMachineFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirtualMachineFeature_Many(), ecorePackage.getEString(), "many", null, 0, 1, VirtualMachineFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualMachineFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, VirtualMachineFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVirtualMachineFeature_Type(), this.getVirtualMachine(), null, "type", null, 0, 1, VirtualMachineFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVirtualMachine_VM(), this.getVirtualMachineTypeFeature(), null, "vM", null, 0, -1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVirtualMachine_CloudProvider(), this.getCloudProviderType(), null, "cloudProvider", null, 0, -1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualMachineTypeFeatureEClass, VirtualMachineTypeFeature.class, "VirtualMachineTypeFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirtualMachineTypeFeature_Many(), ecorePackage.getEString(), "many", null, 0, 1, VirtualMachineTypeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualMachineTypeFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, VirtualMachineTypeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualMachineTypeFeature_Type(), ecorePackage.getEString(), "type", null, 0, 1, VirtualMachineTypeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cloudProviderTypeEClass, CloudProviderType.class, "CloudProviderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCloudProviderType_Many(), ecorePackage.getEString(), "many", null, 0, 1, CloudProviderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCloudProviderType_Name(), ecorePackage.getEString(), "name", null, 0, 1, CloudProviderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCloudProviderType_Type(), this.getCloudProvider(), null, "type", null, 0, 1, CloudProviderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cloudProviderEClass, CloudProvider.class, "CloudProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCloudProvider_CloudType(), this.getCloudType(), null, "cloudType", null, 0, -1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCloudProvider_CloudAddress(), this.getMgmAddressType(), null, "cloudAddress", null, 0, -1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCloudProvider_CloudCredential(), this.getCloudCredentialType(), null, "cloudCredential", null, 0, -1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCloudProvider_CloudOptionalTypes(), this.getCloudOptionalTypes(), null, "cloudOptionalTypes", null, 0, -1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cloudOptionalTypesEClass, CloudOptionalTypes.class, "CloudOptionalTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCloudOptionalTypes_Many(), ecorePackage.getEString(), "many", null, 0, 1, CloudOptionalTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCloudOptionalTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, CloudOptionalTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCloudOptionalTypes_Type(), ecorePackage.getEString(), "type", null, 0, 1, CloudOptionalTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cloudTypeEClass, CloudType.class, "CloudType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCloudType_Many(), ecorePackage.getEString(), "many", null, 0, 1, CloudType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCloudType_Name(), ecorePackage.getEString(), "name", null, 0, 1, CloudType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCloudType_Type(), ecorePackage.getEString(), "type", null, 0, 1, CloudType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptTypeEClass, ScriptType.class, "ScriptType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(geoZoneTypeEClass, GeoZoneType.class, "GeoZoneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mgmAddressTypeEClass, MgmAddressType.class, "MgmAddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMgmAddressType_Many(), ecorePackage.getEString(), "many", null, 0, 1, MgmAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMgmAddressType_Name(), ecorePackage.getEString(), "name", null, 0, 1, MgmAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMgmAddressType_Type(), ecorePackage.getEString(), "type", null, 0, 1, MgmAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cloudCredentialTypeEClass, CloudCredentialType.class, "CloudCredentialType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCloudCredentialType_Many(), ecorePackage.getEString(), "many", null, 0, 1, CloudCredentialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCloudCredentialType_Name(), ecorePackage.getEString(), "name", null, 0, 1, CloudCredentialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCloudCredentialType_Type(), ecorePackage.getEString(), "type", null, 0, 1, CloudCredentialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cloudUserTypeEClass, CloudUserType.class, "CloudUserType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cloudPasswordTypeEClass, CloudPasswordType.class, "CloudPasswordType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(deployEClass, Deploy.class, "Deploy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeploy_DeployOne(), this.getDeployAppFeature(), null, "deployOne", null, 0, -1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeploy_DeployTwo(), this.getDeployTypeFeature(), null, "deployTwo", null, 0, -1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deployAppFeatureEClass, DeployAppFeature.class, "DeployAppFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeployAppFeature_Many(), ecorePackage.getEString(), "many", null, 0, 1, DeployAppFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployAppFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeployAppFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployAppFeature_Type(), this.getDeployApp(), null, "type", null, 0, 1, DeployAppFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deployTypeFeatureEClass, DeployTypeFeature.class, "DeployTypeFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeployTypeFeature_Many(), ecorePackage.getEString(), "many", null, 0, 1, DeployTypeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployTypeFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeployTypeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployTypeFeature_Type(), this.getDeployType(), null, "type", null, 0, 1, DeployTypeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deployTypeEClass, DeployType.class, "DeployType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeployType_Range(), this.getDeployRangeType(), null, "range", null, 0, -1, DeployType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deployRangeTypeEClass, DeployRangeType.class, "DeployRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeployRangeType_Many(), ecorePackage.getEString(), "many", null, 0, 1, DeployRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployRangeType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeployRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployRangeType_Type(), ecorePackage.getEString(), "type", null, 0, 1, DeployRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deployAppEClass, DeployApp.class, "DeployApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeployApp_Class(), this.getDeployAppClassType(), null, "class", null, 0, -1, DeployApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployApp_DeployMasterMethod(), this.getDeployAppMasterMethodType(), null, "deployMasterMethod", null, 0, -1, DeployApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployApp_DeploySlaveMethod(), this.getDeployAppSlaveMethodType(), null, "deploySlaveMethod", null, 0, -1, DeployApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deployAppClassTypeEClass, DeployAppClassType.class, "DeployAppClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeployAppClassType_Many(), ecorePackage.getEString(), "many", null, 0, 1, DeployAppClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployAppClassType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeployAppClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployAppClassType_Type(), ecorePackage.getEString(), "type", null, 0, 1, DeployAppClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deployAppMasterMethodTypeEClass, DeployAppMasterMethodType.class, "DeployAppMasterMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeployAppMasterMethodType_Many(), ecorePackage.getEString(), "many", null, 0, 1, DeployAppMasterMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployAppMasterMethodType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeployAppMasterMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployAppMasterMethodType_Type(), ecorePackage.getEString(), "type", null, 0, 1, DeployAppMasterMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deployAppSlaveMethodTypeEClass, DeployAppSlaveMethodType.class, "DeployAppSlaveMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeployAppSlaveMethodType_Many(), ecorePackage.getEString(), "many", null, 0, 1, DeployAppSlaveMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployAppSlaveMethodType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeployAppSlaveMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployAppSlaveMethodType_Type(), ecorePackage.getEString(), "type", null, 0, 1, DeployAppSlaveMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMonitor_Range(), this.getMonitorRangeType(), null, "range", null, 0, -1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMonitor_MonitoringType(), this.getMonitoringType(), null, "monitoringType", null, 0, -1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(monitorRangeTypeEClass, MonitorRangeType.class, "MonitorRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMonitorRangeType_Many(), ecorePackage.getEString(), "many", null, 0, 1, MonitorRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMonitorRangeType_Name(), ecorePackage.getEString(), "name", null, 0, 1, MonitorRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMonitorRangeType_Type(), ecorePackage.getEString(), "type", null, 0, 1, MonitorRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(monitoringTypeEClass, MonitoringType.class, "MonitoringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMonitoringType_Many(), ecorePackage.getEString(), "many", null, 0, 1, MonitoringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMonitoringType_Name(), ecorePackage.getEString(), "name", null, 0, 1, MonitoringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMonitoringType_Type(), ecorePackage.getEString(), "type", null, 0, 1, MonitoringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stressEClass, Stress.class, "Stress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStress_Range(), this.getStressRangeType(), null, "range", null, 0, -1, Stress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStress_StressClass(), this.getStressClassType(), null, "stressClass", null, 0, -1, Stress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStress_StressMethod(), this.getStressMethodType(), null, "stressMethod", null, 0, -1, Stress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stressRangeTypeEClass, StressRangeType.class, "StressRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStressRangeType_Many(), ecorePackage.getEString(), "many", null, 0, 1, StressRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStressRangeType_Name(), ecorePackage.getEString(), "name", null, 0, 1, StressRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStressRangeType_Type(), ecorePackage.getEString(), "type", null, 0, 1, StressRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stressClassTypeEClass, StressClassType.class, "StressClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStressClassType_Many(), ecorePackage.getEString(), "many", null, 0, 1, StressClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStressClassType_Name(), ecorePackage.getEString(), "name", null, 0, 1, StressClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStressClassType_Type(), ecorePackage.getEString(), "type", null, 0, 1, StressClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stressMethodTypeEClass, StressMethodType.class, "StressMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStressMethodType_Many(), ecorePackage.getEString(), "many", null, 0, 1, StressMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStressMethodType_Name(), ecorePackage.getEString(), "name", null, 0, 1, StressMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStressMethodType_Type(), ecorePackage.getEString(), "type", null, 0, 1, StressMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAction_Range(), this.getActionRangeType(), null, "range", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Class(), this.getActionClassType(), null, "class", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Method(), this.getActionMethodType(), null, "method", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionRangeTypeEClass, ActionRangeType.class, "ActionRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionRangeType_Many(), ecorePackage.getEString(), "many", null, 0, 1, ActionRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionRangeType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionRangeType_Type(), ecorePackage.getEString(), "type", null, 0, 1, ActionRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionClassTypeEClass, ActionClassType.class, "ActionClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionClassType_Many(), ecorePackage.getEString(), "many", null, 0, 1, ActionClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionClassType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionClassType_Type(), ecorePackage.getEString(), "type", null, 0, 1, ActionClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionMethodTypeEClass, ActionMethodType.class, "ActionMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionMethodType_Many(), ecorePackage.getEString(), "many", null, 0, 1, ActionMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionMethodType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionMethodType_Type(), ecorePackage.getEString(), "type", null, 0, 1, ActionMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featuresEClass, Features.class, "Features", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeatures_Name(), ecorePackage.getEString(), "name", null, 0, 1, Features.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intFeatureEClass, IntFeature.class, "IntFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GiraffeDSLPackageImpl
