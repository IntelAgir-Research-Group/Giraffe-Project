/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.EnvironmentImpl#getAuths <em>Auths</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.EnvironmentImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.EnvironmentImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.EnvironmentImpl#getVirtualmachines <em>Virtualmachines</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.EnvironmentImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment
{
  /**
   * The cached value of the '{@link #getAuths() <em>Auths</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuths()
   * @generated
   * @ordered
   */
  protected EList<Auth> auths;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<Dependency> dependencies;

  /**
   * The cached value of the '{@link #getVirtualmachines() <em>Virtualmachines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVirtualmachines()
   * @generated
   * @ordered
   */
  protected EList<VirtualMachine> virtualmachines;

  /**
   * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProviders()
   * @generated
   * @ordered
   */
  protected EList<Providers> providers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GiraffeDSLPackage.Literals.ENVIRONMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Auth> getAuths()
  {
    if (auths == null)
    {
      auths = new EObjectContainmentEList<Auth>(Auth.class, this, GiraffeDSLPackage.ENVIRONMENT__AUTHS);
    }
    return auths;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Resource>(Resource.class, this, GiraffeDSLPackage.ENVIRONMENT__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dependency> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, GiraffeDSLPackage.ENVIRONMENT__DEPENDENCIES);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VirtualMachine> getVirtualmachines()
  {
    if (virtualmachines == null)
    {
      virtualmachines = new EObjectContainmentEList<VirtualMachine>(VirtualMachine.class, this, GiraffeDSLPackage.ENVIRONMENT__VIRTUALMACHINES);
    }
    return virtualmachines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Providers> getProviders()
  {
    if (providers == null)
    {
      providers = new EObjectContainmentEList<Providers>(Providers.class, this, GiraffeDSLPackage.ENVIRONMENT__PROVIDERS);
    }
    return providers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.ENVIRONMENT__AUTHS:
        return ((InternalEList<?>)getAuths()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.ENVIRONMENT__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.ENVIRONMENT__DEPENDENCIES:
        return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.ENVIRONMENT__VIRTUALMACHINES:
        return ((InternalEList<?>)getVirtualmachines()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.ENVIRONMENT__PROVIDERS:
        return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.ENVIRONMENT__AUTHS:
        return getAuths();
      case GiraffeDSLPackage.ENVIRONMENT__RESOURCES:
        return getResources();
      case GiraffeDSLPackage.ENVIRONMENT__DEPENDENCIES:
        return getDependencies();
      case GiraffeDSLPackage.ENVIRONMENT__VIRTUALMACHINES:
        return getVirtualmachines();
      case GiraffeDSLPackage.ENVIRONMENT__PROVIDERS:
        return getProviders();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.ENVIRONMENT__AUTHS:
        getAuths().clear();
        getAuths().addAll((Collection<? extends Auth>)newValue);
        return;
      case GiraffeDSLPackage.ENVIRONMENT__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
        return;
      case GiraffeDSLPackage.ENVIRONMENT__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends Dependency>)newValue);
        return;
      case GiraffeDSLPackage.ENVIRONMENT__VIRTUALMACHINES:
        getVirtualmachines().clear();
        getVirtualmachines().addAll((Collection<? extends VirtualMachine>)newValue);
        return;
      case GiraffeDSLPackage.ENVIRONMENT__PROVIDERS:
        getProviders().clear();
        getProviders().addAll((Collection<? extends Providers>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.ENVIRONMENT__AUTHS:
        getAuths().clear();
        return;
      case GiraffeDSLPackage.ENVIRONMENT__RESOURCES:
        getResources().clear();
        return;
      case GiraffeDSLPackage.ENVIRONMENT__DEPENDENCIES:
        getDependencies().clear();
        return;
      case GiraffeDSLPackage.ENVIRONMENT__VIRTUALMACHINES:
        getVirtualmachines().clear();
        return;
      case GiraffeDSLPackage.ENVIRONMENT__PROVIDERS:
        getProviders().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.ENVIRONMENT__AUTHS:
        return auths != null && !auths.isEmpty();
      case GiraffeDSLPackage.ENVIRONMENT__RESOURCES:
        return resources != null && !resources.isEmpty();
      case GiraffeDSLPackage.ENVIRONMENT__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case GiraffeDSLPackage.ENVIRONMENT__VIRTUALMACHINES:
        return virtualmachines != null && !virtualmachines.isEmpty();
      case GiraffeDSLPackage.ENVIRONMENT__PROVIDERS:
        return providers != null && !providers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnvironmentImpl
