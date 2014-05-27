/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CreateImpl#getVMachine <em>VMachine</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CreateImpl#getInitMachines <em>Init Machines</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CreateImpl#getInitIncrement <em>Init Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateImpl extends TypeImpl implements Create
{
  /**
   * The cached value of the '{@link #getVMachine() <em>VMachine</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVMachine()
   * @generated
   * @ordered
   */
  protected EList<VirtualMachineFeature> vMachine;

  /**
   * The cached value of the '{@link #getInitMachines() <em>Init Machines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitMachines()
   * @generated
   * @ordered
   */
  protected EList<InitMachinesFeature> initMachines;

  /**
   * The cached value of the '{@link #getInitIncrement() <em>Init Increment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitIncrement()
   * @generated
   * @ordered
   */
  protected EList<InitIncrementFeature> initIncrement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateImpl()
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
    return GiraffeDSLPackage.Literals.CREATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VirtualMachineFeature> getVMachine()
  {
    if (vMachine == null)
    {
      vMachine = new EObjectContainmentEList<VirtualMachineFeature>(VirtualMachineFeature.class, this, GiraffeDSLPackage.CREATE__VMACHINE);
    }
    return vMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InitMachinesFeature> getInitMachines()
  {
    if (initMachines == null)
    {
      initMachines = new EObjectContainmentEList<InitMachinesFeature>(InitMachinesFeature.class, this, GiraffeDSLPackage.CREATE__INIT_MACHINES);
    }
    return initMachines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InitIncrementFeature> getInitIncrement()
  {
    if (initIncrement == null)
    {
      initIncrement = new EObjectContainmentEList<InitIncrementFeature>(InitIncrementFeature.class, this, GiraffeDSLPackage.CREATE__INIT_INCREMENT);
    }
    return initIncrement;
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
      case GiraffeDSLPackage.CREATE__VMACHINE:
        return ((InternalEList<?>)getVMachine()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.CREATE__INIT_MACHINES:
        return ((InternalEList<?>)getInitMachines()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.CREATE__INIT_INCREMENT:
        return ((InternalEList<?>)getInitIncrement()).basicRemove(otherEnd, msgs);
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
      case GiraffeDSLPackage.CREATE__VMACHINE:
        return getVMachine();
      case GiraffeDSLPackage.CREATE__INIT_MACHINES:
        return getInitMachines();
      case GiraffeDSLPackage.CREATE__INIT_INCREMENT:
        return getInitIncrement();
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
      case GiraffeDSLPackage.CREATE__VMACHINE:
        getVMachine().clear();
        getVMachine().addAll((Collection<? extends VirtualMachineFeature>)newValue);
        return;
      case GiraffeDSLPackage.CREATE__INIT_MACHINES:
        getInitMachines().clear();
        getInitMachines().addAll((Collection<? extends InitMachinesFeature>)newValue);
        return;
      case GiraffeDSLPackage.CREATE__INIT_INCREMENT:
        getInitIncrement().clear();
        getInitIncrement().addAll((Collection<? extends InitIncrementFeature>)newValue);
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
      case GiraffeDSLPackage.CREATE__VMACHINE:
        getVMachine().clear();
        return;
      case GiraffeDSLPackage.CREATE__INIT_MACHINES:
        getInitMachines().clear();
        return;
      case GiraffeDSLPackage.CREATE__INIT_INCREMENT:
        getInitIncrement().clear();
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
      case GiraffeDSLPackage.CREATE__VMACHINE:
        return vMachine != null && !vMachine.isEmpty();
      case GiraffeDSLPackage.CREATE__INIT_MACHINES:
        return initMachines != null && !initMachines.isEmpty();
      case GiraffeDSLPackage.CREATE__INIT_INCREMENT:
        return initIncrement != null && !initIncrement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CreateImpl
