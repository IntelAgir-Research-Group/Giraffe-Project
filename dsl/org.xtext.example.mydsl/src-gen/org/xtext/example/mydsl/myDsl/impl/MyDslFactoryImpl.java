/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
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
      case MyDslPackage.DOMAIN_MODEL: return createDomainModel();
      case MyDslPackage.TYPE: return createType();
      case MyDslPackage.CREATE: return createCreate();
      case MyDslPackage.INIT_MACHINES_FEATURE: return createInitMachinesFeature();
      case MyDslPackage.INIT_INCREMENT_FEATURE: return createInitIncrementFeature();
      case MyDslPackage.VIRTUAL_MACHINE_FEATURE: return createVirtualMachineFeature();
      case MyDslPackage.VIRTUAL_MACHINE: return createVirtualMachine();
      case MyDslPackage.VIRTUAL_MACHINE_TYPE_FEATURE: return createVirtualMachineTypeFeature();
      case MyDslPackage.CLOUD_PROVIDER_TYPE: return createCloudProviderType();
      case MyDslPackage.CLOUD_PROVIDER: return createCloudProvider();
      case MyDslPackage.CLOUD_OPTIONAL_TYPES: return createCloudOptionalTypes();
      case MyDslPackage.CLOUD_TYPE: return createCloudType();
      case MyDslPackage.SCRIPT_TYPE: return createScriptType();
      case MyDslPackage.GEO_ZONE_TYPE: return createGeoZoneType();
      case MyDslPackage.MGM_ADDRESS_TYPE: return createMgmAddressType();
      case MyDslPackage.CLOUD_CREDENTIAL_TYPE: return createCloudCredentialType();
      case MyDslPackage.CLOUD_USER_TYPE: return createCloudUserType();
      case MyDslPackage.CLOUD_PASSWORD_TYPE: return createCloudPasswordType();
      case MyDslPackage.DEPLOY: return createDeploy();
      case MyDslPackage.DEPLOY_APP_FEATURE: return createDeployAppFeature();
      case MyDslPackage.DEPLOY_TYPE_FEATURE: return createDeployTypeFeature();
      case MyDslPackage.DEPLOY_TYPE: return createDeployType();
      case MyDslPackage.DEPLOY_RANGE_TYPE: return createDeployRangeType();
      case MyDslPackage.DEPLOY_APP: return createDeployApp();
      case MyDslPackage.DEPLOY_APP_CLASS_TYPE: return createDeployAppClassType();
      case MyDslPackage.DEPLOY_APP_MASTER_METHOD_TYPE: return createDeployAppMasterMethodType();
      case MyDslPackage.DEPLOY_APP_SLAVE_METHOD_TYPE: return createDeployAppSlaveMethodType();
      case MyDslPackage.MONITOR: return createMonitor();
      case MyDslPackage.MONITOR_RANGE_TYPE: return createMonitorRangeType();
      case MyDslPackage.MONITORING_TYPE: return createMonitoringType();
      case MyDslPackage.STRESS: return createStress();
      case MyDslPackage.STRESS_RANGE_TYPE: return createStressRangeType();
      case MyDslPackage.STRESS_CLASS_TYPE: return createStressClassType();
      case MyDslPackage.STRESS_METHOD_TYPE: return createStressMethodType();
      case MyDslPackage.ACTION: return createAction();
      case MyDslPackage.ACTION_RANGE_TYPE: return createActionRangeType();
      case MyDslPackage.ACTION_CLASS_TYPE: return createActionClassType();
      case MyDslPackage.ACTION_METHOD_TYPE: return createActionMethodType();
      case MyDslPackage.FEATURES: return createFeatures();
      case MyDslPackage.INT_FEATURE: return createIntFeature();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Create createCreate()
  {
    CreateImpl create = new CreateImpl();
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitMachinesFeature createInitMachinesFeature()
  {
    InitMachinesFeatureImpl initMachinesFeature = new InitMachinesFeatureImpl();
    return initMachinesFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitIncrementFeature createInitIncrementFeature()
  {
    InitIncrementFeatureImpl initIncrementFeature = new InitIncrementFeatureImpl();
    return initIncrementFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualMachineFeature createVirtualMachineFeature()
  {
    VirtualMachineFeatureImpl virtualMachineFeature = new VirtualMachineFeatureImpl();
    return virtualMachineFeature;
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
  public VirtualMachineTypeFeature createVirtualMachineTypeFeature()
  {
    VirtualMachineTypeFeatureImpl virtualMachineTypeFeature = new VirtualMachineTypeFeatureImpl();
    return virtualMachineTypeFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloudProviderType createCloudProviderType()
  {
    CloudProviderTypeImpl cloudProviderType = new CloudProviderTypeImpl();
    return cloudProviderType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloudProvider createCloudProvider()
  {
    CloudProviderImpl cloudProvider = new CloudProviderImpl();
    return cloudProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloudOptionalTypes createCloudOptionalTypes()
  {
    CloudOptionalTypesImpl cloudOptionalTypes = new CloudOptionalTypesImpl();
    return cloudOptionalTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloudType createCloudType()
  {
    CloudTypeImpl cloudType = new CloudTypeImpl();
    return cloudType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptType createScriptType()
  {
    ScriptTypeImpl scriptType = new ScriptTypeImpl();
    return scriptType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoZoneType createGeoZoneType()
  {
    GeoZoneTypeImpl geoZoneType = new GeoZoneTypeImpl();
    return geoZoneType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MgmAddressType createMgmAddressType()
  {
    MgmAddressTypeImpl mgmAddressType = new MgmAddressTypeImpl();
    return mgmAddressType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloudCredentialType createCloudCredentialType()
  {
    CloudCredentialTypeImpl cloudCredentialType = new CloudCredentialTypeImpl();
    return cloudCredentialType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloudUserType createCloudUserType()
  {
    CloudUserTypeImpl cloudUserType = new CloudUserTypeImpl();
    return cloudUserType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloudPasswordType createCloudPasswordType()
  {
    CloudPasswordTypeImpl cloudPasswordType = new CloudPasswordTypeImpl();
    return cloudPasswordType;
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
  public DeployAppFeature createDeployAppFeature()
  {
    DeployAppFeatureImpl deployAppFeature = new DeployAppFeatureImpl();
    return deployAppFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployTypeFeature createDeployTypeFeature()
  {
    DeployTypeFeatureImpl deployTypeFeature = new DeployTypeFeatureImpl();
    return deployTypeFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployType createDeployType()
  {
    DeployTypeImpl deployType = new DeployTypeImpl();
    return deployType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployRangeType createDeployRangeType()
  {
    DeployRangeTypeImpl deployRangeType = new DeployRangeTypeImpl();
    return deployRangeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployApp createDeployApp()
  {
    DeployAppImpl deployApp = new DeployAppImpl();
    return deployApp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployAppClassType createDeployAppClassType()
  {
    DeployAppClassTypeImpl deployAppClassType = new DeployAppClassTypeImpl();
    return deployAppClassType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployAppMasterMethodType createDeployAppMasterMethodType()
  {
    DeployAppMasterMethodTypeImpl deployAppMasterMethodType = new DeployAppMasterMethodTypeImpl();
    return deployAppMasterMethodType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployAppSlaveMethodType createDeployAppSlaveMethodType()
  {
    DeployAppSlaveMethodTypeImpl deployAppSlaveMethodType = new DeployAppSlaveMethodTypeImpl();
    return deployAppSlaveMethodType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Monitor createMonitor()
  {
    MonitorImpl monitor = new MonitorImpl();
    return monitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonitorRangeType createMonitorRangeType()
  {
    MonitorRangeTypeImpl monitorRangeType = new MonitorRangeTypeImpl();
    return monitorRangeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonitoringType createMonitoringType()
  {
    MonitoringTypeImpl monitoringType = new MonitoringTypeImpl();
    return monitoringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stress createStress()
  {
    StressImpl stress = new StressImpl();
    return stress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StressRangeType createStressRangeType()
  {
    StressRangeTypeImpl stressRangeType = new StressRangeTypeImpl();
    return stressRangeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StressClassType createStressClassType()
  {
    StressClassTypeImpl stressClassType = new StressClassTypeImpl();
    return stressClassType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StressMethodType createStressMethodType()
  {
    StressMethodTypeImpl stressMethodType = new StressMethodTypeImpl();
    return stressMethodType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionRangeType createActionRangeType()
  {
    ActionRangeTypeImpl actionRangeType = new ActionRangeTypeImpl();
    return actionRangeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionClassType createActionClassType()
  {
    ActionClassTypeImpl actionClassType = new ActionClassTypeImpl();
    return actionClassType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionMethodType createActionMethodType()
  {
    ActionMethodTypeImpl actionMethodType = new ActionMethodTypeImpl();
    return actionMethodType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Features createFeatures()
  {
    FeaturesImpl features = new FeaturesImpl();
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntFeature createIntFeature()
  {
    IntFeatureImpl intFeature = new IntFeatureImpl();
    return intFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
