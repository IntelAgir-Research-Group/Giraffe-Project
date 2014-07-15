/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL.util;

import fr.mines_nantes.atlanmod.dsl.giraffeDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage
 * @generated
 */
public class GiraffeDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GiraffeDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GiraffeDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GiraffeDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GiraffeDSLSwitch<Adapter> modelSwitch =
    new GiraffeDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainModel(DomainModel object)
      {
        return createDomainModelAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseCreate(Create object)
      {
        return createCreateAdapter();
      }
      @Override
      public Adapter caseInitMachinesFeature(InitMachinesFeature object)
      {
        return createInitMachinesFeatureAdapter();
      }
      @Override
      public Adapter caseInitIncrementFeature(InitIncrementFeature object)
      {
        return createInitIncrementFeatureAdapter();
      }
      @Override
      public Adapter caseVirtualMachineFeature(VirtualMachineFeature object)
      {
        return createVirtualMachineFeatureAdapter();
      }
      @Override
      public Adapter caseVirtualMachine(VirtualMachine object)
      {
        return createVirtualMachineAdapter();
      }
      @Override
      public Adapter caseVirtualMachineTypeFeature(VirtualMachineTypeFeature object)
      {
        return createVirtualMachineTypeFeatureAdapter();
      }
      @Override
      public Adapter caseCloudProviderType(CloudProviderType object)
      {
        return createCloudProviderTypeAdapter();
      }
      @Override
      public Adapter caseCloudProvider(CloudProvider object)
      {
        return createCloudProviderAdapter();
      }
      @Override
      public Adapter caseCloudOptionalTypes(CloudOptionalTypes object)
      {
        return createCloudOptionalTypesAdapter();
      }
      @Override
      public Adapter caseCloudType(CloudType object)
      {
        return createCloudTypeAdapter();
      }
      @Override
      public Adapter caseScriptType(ScriptType object)
      {
        return createScriptTypeAdapter();
      }
      @Override
      public Adapter caseGeoZoneType(GeoZoneType object)
      {
        return createGeoZoneTypeAdapter();
      }
      @Override
      public Adapter caseMgmAddressType(MgmAddressType object)
      {
        return createMgmAddressTypeAdapter();
      }
      @Override
      public Adapter caseCloudCredentialType(CloudCredentialType object)
      {
        return createCloudCredentialTypeAdapter();
      }
      @Override
      public Adapter caseCloudUserType(CloudUserType object)
      {
        return createCloudUserTypeAdapter();
      }
      @Override
      public Adapter caseCloudPasswordType(CloudPasswordType object)
      {
        return createCloudPasswordTypeAdapter();
      }
      @Override
      public Adapter caseDeploy(Deploy object)
      {
        return createDeployAdapter();
      }
      @Override
      public Adapter caseDeployAppFeature(DeployAppFeature object)
      {
        return createDeployAppFeatureAdapter();
      }
      @Override
      public Adapter caseDeployTypeFeature(DeployTypeFeature object)
      {
        return createDeployTypeFeatureAdapter();
      }
      @Override
      public Adapter caseDeployType(DeployType object)
      {
        return createDeployTypeAdapter();
      }
      @Override
      public Adapter caseDeployRangeType(DeployRangeType object)
      {
        return createDeployRangeTypeAdapter();
      }
      @Override
      public Adapter caseDeployApp(DeployApp object)
      {
        return createDeployAppAdapter();
      }
      @Override
      public Adapter caseDeployAppClassType(DeployAppClassType object)
      {
        return createDeployAppClassTypeAdapter();
      }
      @Override
      public Adapter caseDeployAppMasterMethodType(DeployAppMasterMethodType object)
      {
        return createDeployAppMasterMethodTypeAdapter();
      }
      @Override
      public Adapter caseDeployAppSlaveMethodType(DeployAppSlaveMethodType object)
      {
        return createDeployAppSlaveMethodTypeAdapter();
      }
      @Override
      public Adapter caseMonitor(Monitor object)
      {
        return createMonitorAdapter();
      }
      @Override
      public Adapter caseMonitorRangeType(MonitorRangeType object)
      {
        return createMonitorRangeTypeAdapter();
      }
      @Override
      public Adapter caseMonitoringType(MonitoringType object)
      {
        return createMonitoringTypeAdapter();
      }
      @Override
      public Adapter caseStress(Stress object)
      {
        return createStressAdapter();
      }
      @Override
      public Adapter caseStressRangeType(StressRangeType object)
      {
        return createStressRangeTypeAdapter();
      }
      @Override
      public Adapter caseStressClassType(StressClassType object)
      {
        return createStressClassTypeAdapter();
      }
      @Override
      public Adapter caseStressMethodType(StressMethodType object)
      {
        return createStressMethodTypeAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseActionRangeType(ActionRangeType object)
      {
        return createActionRangeTypeAdapter();
      }
      @Override
      public Adapter caseActionClassType(ActionClassType object)
      {
        return createActionClassTypeAdapter();
      }
      @Override
      public Adapter caseActionMethodType(ActionMethodType object)
      {
        return createActionMethodTypeAdapter();
      }
      @Override
      public Adapter caseFeatures(Features object)
      {
        return createFeaturesAdapter();
      }
      @Override
      public Adapter caseIntFeature(IntFeature object)
      {
        return createIntFeatureAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DomainModel
   * @generated
   */
  public Adapter createDomainModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create
   * @generated
   */
  public Adapter createCreateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature <em>Init Machines Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature
   * @generated
   */
  public Adapter createInitMachinesFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature <em>Init Increment Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature
   * @generated
   */
  public Adapter createInitIncrementFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature <em>Virtual Machine Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature
   * @generated
   */
  public Adapter createVirtualMachineFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine <em>Virtual Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine
   * @generated
   */
  public Adapter createVirtualMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature <em>Virtual Machine Type Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature
   * @generated
   */
  public Adapter createVirtualMachineTypeFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType <em>Cloud Provider Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType
   * @generated
   */
  public Adapter createCloudProviderTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider <em>Cloud Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider
   * @generated
   */
  public Adapter createCloudProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes <em>Cloud Optional Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes
   * @generated
   */
  public Adapter createCloudOptionalTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType <em>Cloud Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType
   * @generated
   */
  public Adapter createCloudTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ScriptType <em>Script Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ScriptType
   * @generated
   */
  public Adapter createScriptTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.GeoZoneType <em>Geo Zone Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GeoZoneType
   * @generated
   */
  public Adapter createGeoZoneTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType <em>Mgm Address Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType
   * @generated
   */
  public Adapter createMgmAddressTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType <em>Cloud Credential Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType
   * @generated
   */
  public Adapter createCloudCredentialTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudUserType <em>Cloud User Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudUserType
   * @generated
   */
  public Adapter createCloudUserTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudPasswordType <em>Cloud Password Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudPasswordType
   * @generated
   */
  public Adapter createCloudPasswordTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy <em>Deploy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy
   * @generated
   */
  public Adapter createDeployAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature <em>Deploy App Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature
   * @generated
   */
  public Adapter createDeployAppFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature <em>Deploy Type Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature
   * @generated
   */
  public Adapter createDeployTypeFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployType <em>Deploy Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployType
   * @generated
   */
  public Adapter createDeployTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType <em>Deploy Range Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployRangeType
   * @generated
   */
  public Adapter createDeployRangeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp <em>Deploy App</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployApp
   * @generated
   */
  public Adapter createDeployAppAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType <em>Deploy App Class Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppClassType
   * @generated
   */
  public Adapter createDeployAppClassTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType <em>Deploy App Master Method Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppMasterMethodType
   * @generated
   */
  public Adapter createDeployAppMasterMethodTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType <em>Deploy App Slave Method Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppSlaveMethodType
   * @generated
   */
  public Adapter createDeployAppSlaveMethodTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor <em>Monitor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor
   * @generated
   */
  public Adapter createMonitorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType <em>Monitor Range Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType
   * @generated
   */
  public Adapter createMonitorRangeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType <em>Monitoring Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType
   * @generated
   */
  public Adapter createMonitoringTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress <em>Stress</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Stress
   * @generated
   */
  public Adapter createStressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType <em>Stress Range Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressRangeType
   * @generated
   */
  public Adapter createStressRangeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType <em>Stress Class Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressClassType
   * @generated
   */
  public Adapter createStressClassTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType <em>Stress Method Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.StressMethodType
   * @generated
   */
  public Adapter createStressMethodTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType <em>Action Range Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionRangeType
   * @generated
   */
  public Adapter createActionRangeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType <em>Action Class Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionClassType
   * @generated
   */
  public Adapter createActionClassTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType <em>Action Method Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.ActionMethodType
   * @generated
   */
  public Adapter createActionMethodTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Features <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.Features
   * @generated
   */
  public Adapter createFeaturesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.IntFeature <em>Int Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.IntFeature
   * @generated
   */
  public Adapter createIntFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GiraffeDSLAdapterFactory
