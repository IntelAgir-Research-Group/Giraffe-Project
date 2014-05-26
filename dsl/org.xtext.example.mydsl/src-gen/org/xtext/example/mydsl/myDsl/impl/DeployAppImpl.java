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

import org.xtext.example.mydsl.myDsl.DeployApp;
import org.xtext.example.mydsl.myDsl.DeployAppClassType;
import org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType;
import org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeployAppImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeployAppImpl#getDeployMasterMethod <em>Deploy Master Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeployAppImpl#getDeploySlaveMethod <em>Deploy Slave Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeployAppImpl extends TypeImpl implements DeployApp
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<DeployAppClassType> class_;

  /**
   * The cached value of the '{@link #getDeployMasterMethod() <em>Deploy Master Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeployMasterMethod()
   * @generated
   * @ordered
   */
  protected EList<DeployAppMasterMethodType> deployMasterMethod;

  /**
   * The cached value of the '{@link #getDeploySlaveMethod() <em>Deploy Slave Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeploySlaveMethod()
   * @generated
   * @ordered
   */
  protected EList<DeployAppSlaveMethodType> deploySlaveMethod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeployAppImpl()
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
    return MyDslPackage.Literals.DEPLOY_APP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeployAppClassType> getClass_()
  {
    if (class_ == null)
    {
      class_ = new EObjectContainmentEList<DeployAppClassType>(DeployAppClassType.class, this, MyDslPackage.DEPLOY_APP__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeployAppMasterMethodType> getDeployMasterMethod()
  {
    if (deployMasterMethod == null)
    {
      deployMasterMethod = new EObjectContainmentEList<DeployAppMasterMethodType>(DeployAppMasterMethodType.class, this, MyDslPackage.DEPLOY_APP__DEPLOY_MASTER_METHOD);
    }
    return deployMasterMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeployAppSlaveMethodType> getDeploySlaveMethod()
  {
    if (deploySlaveMethod == null)
    {
      deploySlaveMethod = new EObjectContainmentEList<DeployAppSlaveMethodType>(DeployAppSlaveMethodType.class, this, MyDslPackage.DEPLOY_APP__DEPLOY_SLAVE_METHOD);
    }
    return deploySlaveMethod;
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
      case MyDslPackage.DEPLOY_APP__CLASS:
        return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DEPLOY_APP__DEPLOY_MASTER_METHOD:
        return ((InternalEList<?>)getDeployMasterMethod()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DEPLOY_APP__DEPLOY_SLAVE_METHOD:
        return ((InternalEList<?>)getDeploySlaveMethod()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.DEPLOY_APP__CLASS:
        return getClass_();
      case MyDslPackage.DEPLOY_APP__DEPLOY_MASTER_METHOD:
        return getDeployMasterMethod();
      case MyDslPackage.DEPLOY_APP__DEPLOY_SLAVE_METHOD:
        return getDeploySlaveMethod();
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
      case MyDslPackage.DEPLOY_APP__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends DeployAppClassType>)newValue);
        return;
      case MyDslPackage.DEPLOY_APP__DEPLOY_MASTER_METHOD:
        getDeployMasterMethod().clear();
        getDeployMasterMethod().addAll((Collection<? extends DeployAppMasterMethodType>)newValue);
        return;
      case MyDslPackage.DEPLOY_APP__DEPLOY_SLAVE_METHOD:
        getDeploySlaveMethod().clear();
        getDeploySlaveMethod().addAll((Collection<? extends DeployAppSlaveMethodType>)newValue);
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
      case MyDslPackage.DEPLOY_APP__CLASS:
        getClass_().clear();
        return;
      case MyDslPackage.DEPLOY_APP__DEPLOY_MASTER_METHOD:
        getDeployMasterMethod().clear();
        return;
      case MyDslPackage.DEPLOY_APP__DEPLOY_SLAVE_METHOD:
        getDeploySlaveMethod().clear();
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
      case MyDslPackage.DEPLOY_APP__CLASS:
        return class_ != null && !class_.isEmpty();
      case MyDslPackage.DEPLOY_APP__DEPLOY_MASTER_METHOD:
        return deployMasterMethod != null && !deployMasterMethod.isEmpty();
      case MyDslPackage.DEPLOY_APP__DEPLOY_SLAVE_METHOD:
        return deploySlaveMethod != null && !deploySlaveMethod.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeployAppImpl
