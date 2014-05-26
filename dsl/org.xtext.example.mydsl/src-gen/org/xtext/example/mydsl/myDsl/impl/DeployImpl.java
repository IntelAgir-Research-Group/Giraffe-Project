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

import org.xtext.example.mydsl.myDsl.Deploy;
import org.xtext.example.mydsl.myDsl.DeployAppFeature;
import org.xtext.example.mydsl.myDsl.DeployTypeFeature;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeployImpl#getDeployOne <em>Deploy One</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeployImpl#getDeployTwo <em>Deploy Two</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeployImpl extends TypeImpl implements Deploy
{
  /**
   * The cached value of the '{@link #getDeployOne() <em>Deploy One</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeployOne()
   * @generated
   * @ordered
   */
  protected EList<DeployAppFeature> deployOne;

  /**
   * The cached value of the '{@link #getDeployTwo() <em>Deploy Two</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeployTwo()
   * @generated
   * @ordered
   */
  protected EList<DeployTypeFeature> deployTwo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeployImpl()
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
    return MyDslPackage.Literals.DEPLOY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeployAppFeature> getDeployOne()
  {
    if (deployOne == null)
    {
      deployOne = new EObjectContainmentEList<DeployAppFeature>(DeployAppFeature.class, this, MyDslPackage.DEPLOY__DEPLOY_ONE);
    }
    return deployOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeployTypeFeature> getDeployTwo()
  {
    if (deployTwo == null)
    {
      deployTwo = new EObjectContainmentEList<DeployTypeFeature>(DeployTypeFeature.class, this, MyDslPackage.DEPLOY__DEPLOY_TWO);
    }
    return deployTwo;
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
      case MyDslPackage.DEPLOY__DEPLOY_ONE:
        return ((InternalEList<?>)getDeployOne()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DEPLOY__DEPLOY_TWO:
        return ((InternalEList<?>)getDeployTwo()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.DEPLOY__DEPLOY_ONE:
        return getDeployOne();
      case MyDslPackage.DEPLOY__DEPLOY_TWO:
        return getDeployTwo();
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
      case MyDslPackage.DEPLOY__DEPLOY_ONE:
        getDeployOne().clear();
        getDeployOne().addAll((Collection<? extends DeployAppFeature>)newValue);
        return;
      case MyDslPackage.DEPLOY__DEPLOY_TWO:
        getDeployTwo().clear();
        getDeployTwo().addAll((Collection<? extends DeployTypeFeature>)newValue);
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
      case MyDslPackage.DEPLOY__DEPLOY_ONE:
        getDeployOne().clear();
        return;
      case MyDslPackage.DEPLOY__DEPLOY_TWO:
        getDeployTwo().clear();
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
      case MyDslPackage.DEPLOY__DEPLOY_ONE:
        return deployOne != null && !deployOne.isEmpty();
      case MyDslPackage.DEPLOY__DEPLOY_TWO:
        return deployTwo != null && !deployTwo.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeployImpl
