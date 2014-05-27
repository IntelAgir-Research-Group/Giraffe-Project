/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL.util;

import fr.mines_nantes.atlanmod.dsl.giraffeDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage
 * @generated
 */
public class GiraffeDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GiraffeDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GiraffeDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GiraffeDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GiraffeDSLPackage.DOMAIN_MODEL:
      {
        DomainModel domainModel = (DomainModel)theEObject;
        T result = caseDomainModel(domainModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.CREATE:
      {
        Create create = (Create)theEObject;
        T result = caseCreate(create);
        if (result == null) result = caseType(create);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.INIT_MACHINES_FEATURE:
      {
        InitMachinesFeature initMachinesFeature = (InitMachinesFeature)theEObject;
        T result = caseInitMachinesFeature(initMachinesFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.INIT_INCREMENT_FEATURE:
      {
        InitIncrementFeature initIncrementFeature = (InitIncrementFeature)theEObject;
        T result = caseInitIncrementFeature(initIncrementFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.VIRTUAL_MACHINE_FEATURE:
      {
        VirtualMachineFeature virtualMachineFeature = (VirtualMachineFeature)theEObject;
        T result = caseVirtualMachineFeature(virtualMachineFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.VIRTUAL_MACHINE:
      {
        VirtualMachine virtualMachine = (VirtualMachine)theEObject;
        T result = caseVirtualMachine(virtualMachine);
        if (result == null) result = caseType(virtualMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.VIRTUAL_MACHINE_TYPE_FEATURE:
      {
        VirtualMachineTypeFeature virtualMachineTypeFeature = (VirtualMachineTypeFeature)theEObject;
        T result = caseVirtualMachineTypeFeature(virtualMachineTypeFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE:
      {
        CloudProviderType cloudProviderType = (CloudProviderType)theEObject;
        T result = caseCloudProviderType(cloudProviderType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.CLOUD_PROVIDER:
      {
        CloudProvider cloudProvider = (CloudProvider)theEObject;
        T result = caseCloudProvider(cloudProvider);
        if (result == null) result = caseType(cloudProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.CLOUD_OPTIONAL_TYPES:
      {
        CloudOptionalTypes cloudOptionalTypes = (CloudOptionalTypes)theEObject;
        T result = caseCloudOptionalTypes(cloudOptionalTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.CLOUD_TYPE:
      {
        CloudType cloudType = (CloudType)theEObject;
        T result = caseCloudType(cloudType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.SCRIPT_TYPE:
      {
        ScriptType scriptType = (ScriptType)theEObject;
        T result = caseScriptType(scriptType);
        if (result == null) result = caseCloudOptionalTypes(scriptType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.GEO_ZONE_TYPE:
      {
        GeoZoneType geoZoneType = (GeoZoneType)theEObject;
        T result = caseGeoZoneType(geoZoneType);
        if (result == null) result = caseCloudOptionalTypes(geoZoneType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.MGM_ADDRESS_TYPE:
      {
        MgmAddressType mgmAddressType = (MgmAddressType)theEObject;
        T result = caseMgmAddressType(mgmAddressType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.CLOUD_CREDENTIAL_TYPE:
      {
        CloudCredentialType cloudCredentialType = (CloudCredentialType)theEObject;
        T result = caseCloudCredentialType(cloudCredentialType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.CLOUD_USER_TYPE:
      {
        CloudUserType cloudUserType = (CloudUserType)theEObject;
        T result = caseCloudUserType(cloudUserType);
        if (result == null) result = caseCloudOptionalTypes(cloudUserType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.CLOUD_PASSWORD_TYPE:
      {
        CloudPasswordType cloudPasswordType = (CloudPasswordType)theEObject;
        T result = caseCloudPasswordType(cloudPasswordType);
        if (result == null) result = caseCloudOptionalTypes(cloudPasswordType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.DEPLOY:
      {
        Deploy deploy = (Deploy)theEObject;
        T result = caseDeploy(deploy);
        if (result == null) result = caseType(deploy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.DEPLOY_APP_FEATURE:
      {
        DeployAppFeature deployAppFeature = (DeployAppFeature)theEObject;
        T result = caseDeployAppFeature(deployAppFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.DEPLOY_TYPE_FEATURE:
      {
        DeployTypeFeature deployTypeFeature = (DeployTypeFeature)theEObject;
        T result = caseDeployTypeFeature(deployTypeFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.DEPLOY_TYPE:
      {
        DeployType deployType = (DeployType)theEObject;
        T result = caseDeployType(deployType);
        if (result == null) result = caseType(deployType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.DEPLOY_RANGE_TYPE:
      {
        DeployRangeType deployRangeType = (DeployRangeType)theEObject;
        T result = caseDeployRangeType(deployRangeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.DEPLOY_APP:
      {
        DeployApp deployApp = (DeployApp)theEObject;
        T result = caseDeployApp(deployApp);
        if (result == null) result = caseType(deployApp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.DEPLOY_APP_CLASS_TYPE:
      {
        DeployAppClassType deployAppClassType = (DeployAppClassType)theEObject;
        T result = caseDeployAppClassType(deployAppClassType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.DEPLOY_APP_MASTER_METHOD_TYPE:
      {
        DeployAppMasterMethodType deployAppMasterMethodType = (DeployAppMasterMethodType)theEObject;
        T result = caseDeployAppMasterMethodType(deployAppMasterMethodType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.DEPLOY_APP_SLAVE_METHOD_TYPE:
      {
        DeployAppSlaveMethodType deployAppSlaveMethodType = (DeployAppSlaveMethodType)theEObject;
        T result = caseDeployAppSlaveMethodType(deployAppSlaveMethodType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.MONITOR:
      {
        Monitor monitor = (Monitor)theEObject;
        T result = caseMonitor(monitor);
        if (result == null) result = caseType(monitor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.MONITOR_RANGE_TYPE:
      {
        MonitorRangeType monitorRangeType = (MonitorRangeType)theEObject;
        T result = caseMonitorRangeType(monitorRangeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.MONITORING_TYPE:
      {
        MonitoringType monitoringType = (MonitoringType)theEObject;
        T result = caseMonitoringType(monitoringType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.STRESS:
      {
        Stress stress = (Stress)theEObject;
        T result = caseStress(stress);
        if (result == null) result = caseType(stress);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.STRESS_RANGE_TYPE:
      {
        StressRangeType stressRangeType = (StressRangeType)theEObject;
        T result = caseStressRangeType(stressRangeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.STRESS_CLASS_TYPE:
      {
        StressClassType stressClassType = (StressClassType)theEObject;
        T result = caseStressClassType(stressClassType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.STRESS_METHOD_TYPE:
      {
        StressMethodType stressMethodType = (StressMethodType)theEObject;
        T result = caseStressMethodType(stressMethodType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = caseType(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.ACTION_RANGE_TYPE:
      {
        ActionRangeType actionRangeType = (ActionRangeType)theEObject;
        T result = caseActionRangeType(actionRangeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.ACTION_CLASS_TYPE:
      {
        ActionClassType actionClassType = (ActionClassType)theEObject;
        T result = caseActionClassType(actionClassType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.ACTION_METHOD_TYPE:
      {
        ActionMethodType actionMethodType = (ActionMethodType)theEObject;
        T result = caseActionMethodType(actionMethodType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.FEATURES:
      {
        Features features = (Features)theEObject;
        T result = caseFeatures(features);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GiraffeDSLPackage.INT_FEATURE:
      {
        IntFeature intFeature = (IntFeature)theEObject;
        T result = caseIntFeature(intFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainModel(DomainModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreate(Create object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Machines Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Machines Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitMachinesFeature(InitMachinesFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Increment Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Increment Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitIncrementFeature(InitIncrementFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virtual Machine Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualMachineFeature(VirtualMachineFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualMachine(VirtualMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Type Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virtual Machine Type Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualMachineTypeFeature(VirtualMachineTypeFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cloud Provider Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cloud Provider Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCloudProviderType(CloudProviderType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cloud Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cloud Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCloudProvider(CloudProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cloud Optional Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cloud Optional Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCloudOptionalTypes(CloudOptionalTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cloud Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cloud Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCloudType(CloudType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScriptType(ScriptType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geo Zone Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geo Zone Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeoZoneType(GeoZoneType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mgm Address Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mgm Address Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMgmAddressType(MgmAddressType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cloud Credential Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cloud Credential Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCloudCredentialType(CloudCredentialType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cloud User Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cloud User Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCloudUserType(CloudUserType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cloud Password Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cloud Password Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCloudPasswordType(CloudPasswordType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploy(Deploy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy App Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy App Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployAppFeature(DeployAppFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy Type Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy Type Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployTypeFeature(DeployTypeFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployType(DeployType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy Range Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy Range Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployRangeType(DeployRangeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy App</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy App</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployApp(DeployApp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy App Class Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy App Class Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployAppClassType(DeployAppClassType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy App Master Method Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy App Master Method Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployAppMasterMethodType(DeployAppMasterMethodType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy App Slave Method Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy App Slave Method Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployAppSlaveMethodType(DeployAppSlaveMethodType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitor(Monitor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitor Range Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitor Range Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitorRangeType(MonitorRangeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitoring Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitoring Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitoringType(MonitoringType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stress</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stress</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStress(Stress object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stress Range Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stress Range Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStressRangeType(StressRangeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stress Class Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stress Class Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStressClassType(StressClassType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stress Method Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stress Method Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStressMethodType(StressMethodType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Range Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Range Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionRangeType(ActionRangeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Class Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Class Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionClassType(ActionClassType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Method Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Method Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionMethodType(ActionMethodType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Features</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Features</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatures(Features object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntFeature(IntFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GiraffeDSLSwitch
