/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deploy;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentImpl#getSetups <em>Setups</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentImpl#getDeploys <em>Deploys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment
{
  /**
   * The cached value of the '{@link #getSetups() <em>Setups</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetups()
   * @generated
   * @ordered
   */
  protected Setup setups;

  /**
   * The cached value of the '{@link #getDeploys() <em>Deploys</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeploys()
   * @generated
   * @ordered
   */
  protected Deploy deploys;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentImpl()
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
    return GiraffeDSLPackage.Literals.DEPLOYMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Setup getSetups()
  {
    return setups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSetups(Setup newSetups, NotificationChain msgs)
  {
    Setup oldSetups = setups;
    setups = newSetups;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.DEPLOYMENT__SETUPS, oldSetups, newSetups);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetups(Setup newSetups)
  {
    if (newSetups != setups)
    {
      NotificationChain msgs = null;
      if (setups != null)
        msgs = ((InternalEObject)setups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GiraffeDSLPackage.DEPLOYMENT__SETUPS, null, msgs);
      if (newSetups != null)
        msgs = ((InternalEObject)newSetups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GiraffeDSLPackage.DEPLOYMENT__SETUPS, null, msgs);
      msgs = basicSetSetups(newSetups, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.DEPLOYMENT__SETUPS, newSetups, newSetups));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deploy getDeploys()
  {
    return deploys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeploys(Deploy newDeploys, NotificationChain msgs)
  {
    Deploy oldDeploys = deploys;
    deploys = newDeploys;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.DEPLOYMENT__DEPLOYS, oldDeploys, newDeploys);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeploys(Deploy newDeploys)
  {
    if (newDeploys != deploys)
    {
      NotificationChain msgs = null;
      if (deploys != null)
        msgs = ((InternalEObject)deploys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GiraffeDSLPackage.DEPLOYMENT__DEPLOYS, null, msgs);
      if (newDeploys != null)
        msgs = ((InternalEObject)newDeploys).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GiraffeDSLPackage.DEPLOYMENT__DEPLOYS, null, msgs);
      msgs = basicSetDeploys(newDeploys, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.DEPLOYMENT__DEPLOYS, newDeploys, newDeploys));
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
      case GiraffeDSLPackage.DEPLOYMENT__SETUPS:
        return basicSetSetups(null, msgs);
      case GiraffeDSLPackage.DEPLOYMENT__DEPLOYS:
        return basicSetDeploys(null, msgs);
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
      case GiraffeDSLPackage.DEPLOYMENT__SETUPS:
        return getSetups();
      case GiraffeDSLPackage.DEPLOYMENT__DEPLOYS:
        return getDeploys();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.DEPLOYMENT__SETUPS:
        setSetups((Setup)newValue);
        return;
      case GiraffeDSLPackage.DEPLOYMENT__DEPLOYS:
        setDeploys((Deploy)newValue);
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
      case GiraffeDSLPackage.DEPLOYMENT__SETUPS:
        setSetups((Setup)null);
        return;
      case GiraffeDSLPackage.DEPLOYMENT__DEPLOYS:
        setDeploys((Deploy)null);
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
      case GiraffeDSLPackage.DEPLOYMENT__SETUPS:
        return setups != null;
      case GiraffeDSLPackage.DEPLOYMENT__DEPLOYS:
        return deploys != null;
    }
    return super.eIsSet(featureID);
  }

} //DeploymentImpl
