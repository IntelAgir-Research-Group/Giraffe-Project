/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineImpl#getVM <em>VM</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.VirtualMachineImpl#getCloudProvider <em>Cloud Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualMachineImpl extends TypeImpl implements VirtualMachine
{
  /**
   * The cached value of the '{@link #getVM() <em>VM</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVM()
   * @generated
   * @ordered
   */
  protected EList<VirtualMachineTypeFeature> vM;

  /**
   * The cached value of the '{@link #getCloudProvider() <em>Cloud Provider</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCloudProvider()
   * @generated
   * @ordered
   */
  protected EList<CloudProviderType> cloudProvider;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VirtualMachineImpl()
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
    return GiraffeDSLPackage.Literals.VIRTUAL_MACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VirtualMachineTypeFeature> getVM()
  {
    if (vM == null)
    {
      vM = new EObjectContainmentEList<VirtualMachineTypeFeature>(VirtualMachineTypeFeature.class, this, GiraffeDSLPackage.VIRTUAL_MACHINE__VM);
    }
    return vM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CloudProviderType> getCloudProvider()
  {
    if (cloudProvider == null)
    {
      cloudProvider = new EObjectContainmentEList<CloudProviderType>(CloudProviderType.class, this, GiraffeDSLPackage.VIRTUAL_MACHINE__CLOUD_PROVIDER);
    }
    return cloudProvider;
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
      case GiraffeDSLPackage.VIRTUAL_MACHINE__VM:
        return ((InternalEList<?>)getVM()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.VIRTUAL_MACHINE__CLOUD_PROVIDER:
        return ((InternalEList<?>)getCloudProvider()).basicRemove(otherEnd, msgs);
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
      case GiraffeDSLPackage.VIRTUAL_MACHINE__VM:
        return getVM();
      case GiraffeDSLPackage.VIRTUAL_MACHINE__CLOUD_PROVIDER:
        return getCloudProvider();
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
      case GiraffeDSLPackage.VIRTUAL_MACHINE__VM:
        getVM().clear();
        getVM().addAll((Collection<? extends VirtualMachineTypeFeature>)newValue);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__CLOUD_PROVIDER:
        getCloudProvider().clear();
        getCloudProvider().addAll((Collection<? extends CloudProviderType>)newValue);
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
      case GiraffeDSLPackage.VIRTUAL_MACHINE__VM:
        getVM().clear();
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__CLOUD_PROVIDER:
        getCloudProvider().clear();
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
      case GiraffeDSLPackage.VIRTUAL_MACHINE__VM:
        return vM != null && !vM.isEmpty();
      case GiraffeDSLPackage.VIRTUAL_MACHINE__CLOUD_PROVIDER:
        return cloudProvider != null && !cloudProvider.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VirtualMachineImpl
