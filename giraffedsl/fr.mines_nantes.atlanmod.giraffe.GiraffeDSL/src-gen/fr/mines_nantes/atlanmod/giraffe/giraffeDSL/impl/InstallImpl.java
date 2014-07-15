/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Install</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.InstallImpl#getDepName <em>Dep Name</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.InstallImpl#getDepVersion <em>Dep Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstallImpl extends DependencyImpl implements Install
{
  /**
   * The default value of the '{@link #getDepName() <em>Dep Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepName()
   * @generated
   * @ordered
   */
  protected static final String DEP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDepName() <em>Dep Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepName()
   * @generated
   * @ordered
   */
  protected String depName = DEP_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDepVersion() <em>Dep Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepVersion()
   * @generated
   * @ordered
   */
  protected static final float DEP_VERSION_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getDepVersion() <em>Dep Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepVersion()
   * @generated
   * @ordered
   */
  protected float depVersion = DEP_VERSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstallImpl()
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
    return GiraffeDSLPackage.Literals.INSTALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDepName()
  {
    return depName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDepName(String newDepName)
  {
    String oldDepName = depName;
    depName = newDepName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.INSTALL__DEP_NAME, oldDepName, depName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getDepVersion()
  {
    return depVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDepVersion(float newDepVersion)
  {
    float oldDepVersion = depVersion;
    depVersion = newDepVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.INSTALL__DEP_VERSION, oldDepVersion, depVersion));
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
      case GiraffeDSLPackage.INSTALL__DEP_NAME:
        return getDepName();
      case GiraffeDSLPackage.INSTALL__DEP_VERSION:
        return getDepVersion();
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
      case GiraffeDSLPackage.INSTALL__DEP_NAME:
        setDepName((String)newValue);
        return;
      case GiraffeDSLPackage.INSTALL__DEP_VERSION:
        setDepVersion((Float)newValue);
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
      case GiraffeDSLPackage.INSTALL__DEP_NAME:
        setDepName(DEP_NAME_EDEFAULT);
        return;
      case GiraffeDSLPackage.INSTALL__DEP_VERSION:
        setDepVersion(DEP_VERSION_EDEFAULT);
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
      case GiraffeDSLPackage.INSTALL__DEP_NAME:
        return DEP_NAME_EDEFAULT == null ? depName != null : !DEP_NAME_EDEFAULT.equals(depName);
      case GiraffeDSLPackage.INSTALL__DEP_VERSION:
        return depVersion != DEP_VERSION_EDEFAULT;
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
    result.append(" (depName: ");
    result.append(depName);
    result.append(", depVersion: ");
    result.append(depVersion);
    result.append(')');
    return result.toString();
  }

} //InstallImpl
