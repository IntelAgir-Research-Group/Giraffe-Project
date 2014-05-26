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

import org.xtext.example.mydsl.myDsl.Action;
import org.xtext.example.mydsl.myDsl.ActionClassType;
import org.xtext.example.mydsl.myDsl.ActionMethodType;
import org.xtext.example.mydsl.myDsl.ActionRangeType;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActionImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActionImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActionImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends TypeImpl implements Action
{
  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected EList<ActionRangeType> range;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<ActionClassType> class_;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected EList<ActionMethodType> method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return MyDslPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionRangeType> getRange()
  {
    if (range == null)
    {
      range = new EObjectContainmentEList<ActionRangeType>(ActionRangeType.class, this, MyDslPackage.ACTION__RANGE);
    }
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionClassType> getClass_()
  {
    if (class_ == null)
    {
      class_ = new EObjectContainmentEList<ActionClassType>(ActionClassType.class, this, MyDslPackage.ACTION__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionMethodType> getMethod()
  {
    if (method == null)
    {
      method = new EObjectContainmentEList<ActionMethodType>(ActionMethodType.class, this, MyDslPackage.ACTION__METHOD);
    }
    return method;
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
      case MyDslPackage.ACTION__RANGE:
        return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ACTION__CLASS:
        return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ACTION__METHOD:
        return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ACTION__RANGE:
        return getRange();
      case MyDslPackage.ACTION__CLASS:
        return getClass_();
      case MyDslPackage.ACTION__METHOD:
        return getMethod();
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
      case MyDslPackage.ACTION__RANGE:
        getRange().clear();
        getRange().addAll((Collection<? extends ActionRangeType>)newValue);
        return;
      case MyDslPackage.ACTION__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends ActionClassType>)newValue);
        return;
      case MyDslPackage.ACTION__METHOD:
        getMethod().clear();
        getMethod().addAll((Collection<? extends ActionMethodType>)newValue);
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
      case MyDslPackage.ACTION__RANGE:
        getRange().clear();
        return;
      case MyDslPackage.ACTION__CLASS:
        getClass_().clear();
        return;
      case MyDslPackage.ACTION__METHOD:
        getMethod().clear();
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
      case MyDslPackage.ACTION__RANGE:
        return range != null && !range.isEmpty();
      case MyDslPackage.ACTION__CLASS:
        return class_ != null && !class_.isEmpty();
      case MyDslPackage.ACTION__METHOD:
        return method != null && !method.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActionImpl
