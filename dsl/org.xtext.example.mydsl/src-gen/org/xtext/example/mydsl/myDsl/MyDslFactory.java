/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Model</em>'.
   * @generated
   */
  DomainModel createDomainModel();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Create</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create</em>'.
   * @generated
   */
  Create createCreate();

  /**
   * Returns a new object of class '<em>Init Machines Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Machines Feature</em>'.
   * @generated
   */
  InitMachinesFeature createInitMachinesFeature();

  /**
   * Returns a new object of class '<em>Init Increment Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Increment Feature</em>'.
   * @generated
   */
  InitIncrementFeature createInitIncrementFeature();

  /**
   * Returns a new object of class '<em>Virtual Machine Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virtual Machine Feature</em>'.
   * @generated
   */
  VirtualMachineFeature createVirtualMachineFeature();

  /**
   * Returns a new object of class '<em>Virtual Machine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virtual Machine</em>'.
   * @generated
   */
  VirtualMachine createVirtualMachine();

  /**
   * Returns a new object of class '<em>Virtual Machine Type Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virtual Machine Type Feature</em>'.
   * @generated
   */
  VirtualMachineTypeFeature createVirtualMachineTypeFeature();

  /**
   * Returns a new object of class '<em>Cloud Provider Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cloud Provider Type</em>'.
   * @generated
   */
  CloudProviderType createCloudProviderType();

  /**
   * Returns a new object of class '<em>Cloud Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cloud Provider</em>'.
   * @generated
   */
  CloudProvider createCloudProvider();

  /**
   * Returns a new object of class '<em>Cloud Optional Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cloud Optional Types</em>'.
   * @generated
   */
  CloudOptionalTypes createCloudOptionalTypes();

  /**
   * Returns a new object of class '<em>Cloud Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cloud Type</em>'.
   * @generated
   */
  CloudType createCloudType();

  /**
   * Returns a new object of class '<em>Script Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script Type</em>'.
   * @generated
   */
  ScriptType createScriptType();

  /**
   * Returns a new object of class '<em>Geo Zone Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Zone Type</em>'.
   * @generated
   */
  GeoZoneType createGeoZoneType();

  /**
   * Returns a new object of class '<em>Mgm Address Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mgm Address Type</em>'.
   * @generated
   */
  MgmAddressType createMgmAddressType();

  /**
   * Returns a new object of class '<em>Cloud Credential Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cloud Credential Type</em>'.
   * @generated
   */
  CloudCredentialType createCloudCredentialType();

  /**
   * Returns a new object of class '<em>Cloud User Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cloud User Type</em>'.
   * @generated
   */
  CloudUserType createCloudUserType();

  /**
   * Returns a new object of class '<em>Cloud Password Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cloud Password Type</em>'.
   * @generated
   */
  CloudPasswordType createCloudPasswordType();

  /**
   * Returns a new object of class '<em>Deploy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy</em>'.
   * @generated
   */
  Deploy createDeploy();

  /**
   * Returns a new object of class '<em>Deploy App Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy App Feature</em>'.
   * @generated
   */
  DeployAppFeature createDeployAppFeature();

  /**
   * Returns a new object of class '<em>Deploy Type Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy Type Feature</em>'.
   * @generated
   */
  DeployTypeFeature createDeployTypeFeature();

  /**
   * Returns a new object of class '<em>Deploy Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy Type</em>'.
   * @generated
   */
  DeployType createDeployType();

  /**
   * Returns a new object of class '<em>Deploy Range Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy Range Type</em>'.
   * @generated
   */
  DeployRangeType createDeployRangeType();

  /**
   * Returns a new object of class '<em>Deploy App</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy App</em>'.
   * @generated
   */
  DeployApp createDeployApp();

  /**
   * Returns a new object of class '<em>Deploy App Class Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy App Class Type</em>'.
   * @generated
   */
  DeployAppClassType createDeployAppClassType();

  /**
   * Returns a new object of class '<em>Deploy App Master Method Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy App Master Method Type</em>'.
   * @generated
   */
  DeployAppMasterMethodType createDeployAppMasterMethodType();

  /**
   * Returns a new object of class '<em>Deploy App Slave Method Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy App Slave Method Type</em>'.
   * @generated
   */
  DeployAppSlaveMethodType createDeployAppSlaveMethodType();

  /**
   * Returns a new object of class '<em>Monitor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Monitor</em>'.
   * @generated
   */
  Monitor createMonitor();

  /**
   * Returns a new object of class '<em>Monitor Range Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Monitor Range Type</em>'.
   * @generated
   */
  MonitorRangeType createMonitorRangeType();

  /**
   * Returns a new object of class '<em>Monitoring Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Monitoring Type</em>'.
   * @generated
   */
  MonitoringType createMonitoringType();

  /**
   * Returns a new object of class '<em>Stress</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stress</em>'.
   * @generated
   */
  Stress createStress();

  /**
   * Returns a new object of class '<em>Stress Range Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stress Range Type</em>'.
   * @generated
   */
  StressRangeType createStressRangeType();

  /**
   * Returns a new object of class '<em>Stress Class Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stress Class Type</em>'.
   * @generated
   */
  StressClassType createStressClassType();

  /**
   * Returns a new object of class '<em>Stress Method Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stress Method Type</em>'.
   * @generated
   */
  StressMethodType createStressMethodType();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Action Range Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Range Type</em>'.
   * @generated
   */
  ActionRangeType createActionRangeType();

  /**
   * Returns a new object of class '<em>Action Class Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Class Type</em>'.
   * @generated
   */
  ActionClassType createActionClassType();

  /**
   * Returns a new object of class '<em>Action Method Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Method Type</em>'.
   * @generated
   */
  ActionMethodType createActionMethodType();

  /**
   * Returns a new object of class '<em>Features</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Features</em>'.
   * @generated
   */
  Features createFeatures();

  /**
   * Returns a new object of class '<em>Int Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Feature</em>'.
   * @generated
   */
  IntFeature createIntFeature();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
