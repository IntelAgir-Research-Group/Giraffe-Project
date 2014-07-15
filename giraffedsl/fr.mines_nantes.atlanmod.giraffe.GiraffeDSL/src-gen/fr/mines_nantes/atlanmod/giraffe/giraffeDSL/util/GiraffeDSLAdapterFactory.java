/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.util;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage
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
      public Adapter caseGiraffeMetaModel(GiraffeMetaModel object)
      {
        return createGiraffeMetaModelAdapter();
      }
      @Override
      public Adapter caseEnvironment(Environment object)
      {
        return createEnvironmentAdapter();
      }
      @Override
      public Adapter caseDeploymentDefinitions(DeploymentDefinitions object)
      {
        return createDeploymentDefinitionsAdapter();
      }
      @Override
      public Adapter caseDeployment(Deployment object)
      {
        return createDeploymentAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseVirtualMachine(VirtualMachine object)
      {
        return createVirtualMachineAdapter();
      }
      @Override
      public Adapter caseRequeriments(Requeriments object)
      {
        return createRequerimentsAdapter();
      }
      @Override
      public Adapter caseProviders(Providers object)
      {
        return createProvidersAdapter();
      }
      @Override
      public Adapter caseProvider(Provider object)
      {
        return createProviderAdapter();
      }
      @Override
      public Adapter caseOtherProvider(OtherProvider object)
      {
        return createOtherProviderAdapter();
      }
      @Override
      public Adapter caseAuth(Auth object)
      {
        return createAuthAdapter();
      }
      @Override
      public Adapter casePassword(Password object)
      {
        return createPasswordAdapter();
      }
      @Override
      public Adapter caseKey(Key object)
      {
        return createKeyAdapter();
      }
      @Override
      public Adapter caseCredential(Credential object)
      {
        return createCredentialAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseDependency(Dependency object)
      {
        return createDependencyAdapter();
      }
      @Override
      public Adapter caseInstall(Install object)
      {
        return createInstallAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseFile(File object)
      {
        return createFileAdapter();
      }
      @Override
      public Adapter caseArtifact(Artifact object)
      {
        return createArtifactAdapter();
      }
      @Override
      public Adapter caseConfArtifact(ConfArtifact object)
      {
        return createConfArtifactAdapter();
      }
      @Override
      public Adapter caseConfig(Config object)
      {
        return createConfigAdapter();
      }
      @Override
      public Adapter caseConfigBlock(ConfigBlock object)
      {
        return createConfigBlockAdapter();
      }
      @Override
      public Adapter caseCode(Code object)
      {
        return createCodeAdapter();
      }
      @Override
      public Adapter caseCodeExternal(CodeExternal object)
      {
        return createCodeExternalAdapter();
      }
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseScriptCommand(ScriptCommand object)
      {
        return createScriptCommandAdapter();
      }
      @Override
      public Adapter caseScriptBlock(ScriptBlock object)
      {
        return createScriptBlockAdapter();
      }
      @Override
      public Adapter caseNodeset(Nodeset object)
      {
        return createNodesetAdapter();
      }
      @Override
      public Adapter caseSetup(Setup object)
      {
        return createSetupAdapter();
      }
      @Override
      public Adapter caseDeploy(Deploy object)
      {
        return createDeployAdapter();
      }
      @Override
      public Adapter caseExecution(Execution object)
      {
        return createExecutionAdapter();
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
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel <em>Giraffe Meta Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel
   * @generated
   */
  public Adapter createGiraffeMetaModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment
   * @generated
   */
  public Adapter createEnvironmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions <em>Deployment Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions
   * @generated
   */
  public Adapter createDeploymentDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment
   * @generated
   */
  public Adapter createDeploymentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine <em>Virtual Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine
   * @generated
   */
  public Adapter createVirtualMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments <em>Requeriments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments
   * @generated
   */
  public Adapter createRequerimentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers
   * @generated
   */
  public Adapter createProvidersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider
   * @generated
   */
  public Adapter createProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider <em>Other Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.OtherProvider
   * @generated
   */
  public Adapter createOtherProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth <em>Auth</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth
   * @generated
   */
  public Adapter createAuthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Password
   * @generated
   */
  public Adapter createPasswordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Key
   * @generated
   */
  public Adapter createKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential <em>Credential</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential
   * @generated
   */
  public Adapter createCredentialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency
   * @generated
   */
  public Adapter createDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install <em>Install</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install
   * @generated
   */
  public Adapter createInstallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File
   * @generated
   */
  public Adapter createFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact
   * @generated
   */
  public Adapter createArtifactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact <em>Conf Artifact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact
   * @generated
   */
  public Adapter createConfArtifactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Config <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Config
   * @generated
   */
  public Adapter createConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfigBlock <em>Config Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfigBlock
   * @generated
   */
  public Adapter createConfigBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Code <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Code
   * @generated
   */
  public Adapter createCodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal <em>Code External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.CodeExternal
   * @generated
   */
  public Adapter createCodeExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptCommand <em>Script Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptCommand
   * @generated
   */
  public Adapter createScriptCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptBlock <em>Script Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptBlock
   * @generated
   */
  public Adapter createScriptBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset <em>Nodeset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset
   * @generated
   */
  public Adapter createNodesetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup <em>Setup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup
   * @generated
   */
  public Adapter createSetupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy <em>Deploy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy
   * @generated
   */
  public Adapter createDeployAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution
   * @generated
   */
  public Adapter createExecutionAdapter()
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
