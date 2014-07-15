/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ServiceImpl#getSrvAction <em>Srv Action</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ServiceImpl#getServiceName <em>Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends DependencyImpl implements Service
{
  /**
   * The default value of the '{@link #getSrvAction() <em>Srv Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrvAction()
   * @generated
   * @ordered
   */
  protected static final SrvSignal SRV_ACTION_EDEFAULT = SrvSignal.START;

  /**
   * The cached value of the '{@link #getSrvAction() <em>Srv Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrvAction()
   * @generated
   * @ordered
   */
  protected SrvSignal srvAction = SRV_ACTION_EDEFAULT;

  /**
   * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceName()
   * @generated
   * @ordered
   */
  protected static final String SERVICE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceName()
   * @generated
   * @ordered
   */
  protected String serviceName = SERVICE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceImpl()
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
    return GiraffeDSLPackage.Literals.SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SrvSignal getSrvAction()
  {
    return srvAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrvAction(SrvSignal newSrvAction)
  {
    SrvSignal oldSrvAction = srvAction;
    srvAction = newSrvAction == null ? SRV_ACTION_EDEFAULT : newSrvAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.SERVICE__SRV_ACTION, oldSrvAction, srvAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServiceName()
  {
    return serviceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceName(String newServiceName)
  {
    String oldServiceName = serviceName;
    serviceName = newServiceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.SERVICE__SERVICE_NAME, oldServiceName, serviceName));
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
      case GiraffeDSLPackage.SERVICE__SRV_ACTION:
        return getSrvAction();
      case GiraffeDSLPackage.SERVICE__SERVICE_NAME:
        return getServiceName();
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
      case GiraffeDSLPackage.SERVICE__SRV_ACTION:
        setSrvAction((SrvSignal)newValue);
        return;
      case GiraffeDSLPackage.SERVICE__SERVICE_NAME:
        setServiceName((String)newValue);
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
      case GiraffeDSLPackage.SERVICE__SRV_ACTION:
        setSrvAction(SRV_ACTION_EDEFAULT);
        return;
      case GiraffeDSLPackage.SERVICE__SERVICE_NAME:
        setServiceName(SERVICE_NAME_EDEFAULT);
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
      case GiraffeDSLPackage.SERVICE__SRV_ACTION:
        return srvAction != SRV_ACTION_EDEFAULT;
      case GiraffeDSLPackage.SERVICE__SERVICE_NAME:
        return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (srvAction: ");
    result.append(srvAction);
    result.append(", serviceName: ");
    result.append(serviceName);
    result.append(')');
    return result.toString();
  }

} //ServiceImpl
