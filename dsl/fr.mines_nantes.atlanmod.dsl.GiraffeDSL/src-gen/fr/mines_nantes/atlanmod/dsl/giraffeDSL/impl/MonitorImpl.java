/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitorImpl#getRange <em>Range</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.MonitorImpl#getMonitoringType <em>Monitoring Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonitorImpl extends TypeImpl implements Monitor
{
  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected EList<MonitorRangeType> range;

  /**
   * The cached value of the '{@link #getMonitoringType() <em>Monitoring Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonitoringType()
   * @generated
   * @ordered
   */
  protected EList<MonitoringType> monitoringType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonitorImpl()
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
    return GiraffeDSLPackage.Literals.MONITOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MonitorRangeType> getRange()
  {
    if (range == null)
    {
      range = new EObjectContainmentEList<MonitorRangeType>(MonitorRangeType.class, this, GiraffeDSLPackage.MONITOR__RANGE);
    }
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MonitoringType> getMonitoringType()
  {
    if (monitoringType == null)
    {
      monitoringType = new EObjectContainmentEList<MonitoringType>(MonitoringType.class, this, GiraffeDSLPackage.MONITOR__MONITORING_TYPE);
    }
    return monitoringType;
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
      case GiraffeDSLPackage.MONITOR__RANGE:
        return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.MONITOR__MONITORING_TYPE:
        return ((InternalEList<?>)getMonitoringType()).basicRemove(otherEnd, msgs);
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
      case GiraffeDSLPackage.MONITOR__RANGE:
        return getRange();
      case GiraffeDSLPackage.MONITOR__MONITORING_TYPE:
        return getMonitoringType();
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
      case GiraffeDSLPackage.MONITOR__RANGE:
        getRange().clear();
        getRange().addAll((Collection<? extends MonitorRangeType>)newValue);
        return;
      case GiraffeDSLPackage.MONITOR__MONITORING_TYPE:
        getMonitoringType().clear();
        getMonitoringType().addAll((Collection<? extends MonitoringType>)newValue);
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
      case GiraffeDSLPackage.MONITOR__RANGE:
        getRange().clear();
        return;
      case GiraffeDSLPackage.MONITOR__MONITORING_TYPE:
        getMonitoringType().clear();
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
      case GiraffeDSLPackage.MONITOR__RANGE:
        return range != null && !range.isEmpty();
      case GiraffeDSLPackage.MONITOR__MONITORING_TYPE:
        return monitoringType != null && !monitoringType.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MonitorImpl
