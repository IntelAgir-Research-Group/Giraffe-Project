/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Stress;
import org.xtext.example.mydsl.myDsl.StressClassType;
import org.xtext.example.mydsl.myDsl.StressMethodType;
import org.xtext.example.mydsl.myDsl.StressRangeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StressImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StressImpl#getStressClass <em>Stress Class</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StressImpl#getStressMethod <em>Stress Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StressImpl extends TypeImpl implements Stress
{
  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected EList<StressRangeType> range;

  /**
   * The cached value of the '{@link #getStressClass() <em>Stress Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStressClass()
   * @generated
   * @ordered
   */
  protected EList<StressClassType> stressClass;

  /**
   * The cached value of the '{@link #getStressMethod() <em>Stress Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStressMethod()
   * @generated
   * @ordered
   */
  protected EList<StressMethodType> stressMethod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StressImpl()
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
    return MyDslPackage.Literals.STRESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StressRangeType> getRange()
  {
    if (range == null)
    {
      range = new EObjectContainmentEList<StressRangeType>(StressRangeType.class, this, MyDslPackage.STRESS__RANGE);
    }
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StressClassType> getStressClass()
  {
    if (stressClass == null)
    {
      stressClass = new EObjectContainmentEList<StressClassType>(StressClassType.class, this, MyDslPackage.STRESS__STRESS_CLASS);
    }
    return stressClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StressMethodType> getStressMethod()
  {
    if (stressMethod == null)
    {
      stressMethod = new EObjectContainmentEList<StressMethodType>(StressMethodType.class, this, MyDslPackage.STRESS__STRESS_METHOD);
    }
    return stressMethod;
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
      case MyDslPackage.STRESS__RANGE:
        return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
      case MyDslPackage.STRESS__STRESS_CLASS:
        return ((InternalEList<?>)getStressClass()).basicRemove(otherEnd, msgs);
      case MyDslPackage.STRESS__STRESS_METHOD:
        return ((InternalEList<?>)getStressMethod()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.STRESS__RANGE:
        return getRange();
      case MyDslPackage.STRESS__STRESS_CLASS:
        return getStressClass();
      case MyDslPackage.STRESS__STRESS_METHOD:
        return getStressMethod();
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
      case MyDslPackage.STRESS__RANGE:
        getRange().clear();
        getRange().addAll((Collection<? extends StressRangeType>)newValue);
        return;
      case MyDslPackage.STRESS__STRESS_CLASS:
        getStressClass().clear();
        getStressClass().addAll((Collection<? extends StressClassType>)newValue);
        return;
      case MyDslPackage.STRESS__STRESS_METHOD:
        getStressMethod().clear();
        getStressMethod().addAll((Collection<? extends StressMethodType>)newValue);
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
      case MyDslPackage.STRESS__RANGE:
        getRange().clear();
        return;
      case MyDslPackage.STRESS__STRESS_CLASS:
        getStressClass().clear();
        return;
      case MyDslPackage.STRESS__STRESS_METHOD:
        getStressMethod().clear();
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
      case MyDslPackage.STRESS__RANGE:
        return range != null && !range.isEmpty();
      case MyDslPackage.STRESS__STRESS_CLASS:
        return stressClass != null && !stressClass.isEmpty();
      case MyDslPackage.STRESS__STRESS_METHOD:
        return stressMethod != null && !stressMethod.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StressImpl
