/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requeriments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.RequerimentsImpl#getNative <em>Native</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.RequerimentsImpl#getOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequerimentsImpl extends MinimalEObjectImpl.Container implements Requeriments
{
  /**
   * The default value of the '{@link #getNative() <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNative()
   * @generated
   * @ordered
   */
  protected static final NativeRequirement NATIVE_EDEFAULT = NativeRequirement.SSH;

  /**
   * The cached value of the '{@link #getNative() <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNative()
   * @generated
   * @ordered
   */
  protected NativeRequirement native_ = NATIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOther()
   * @generated
   * @ordered
   */
  protected static final String OTHER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOther()
   * @generated
   * @ordered
   */
  protected String other = OTHER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequerimentsImpl()
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
    return GiraffeDSLPackage.Literals.REQUERIMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeRequirement getNative()
  {
    return native_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNative(NativeRequirement newNative)
  {
    NativeRequirement oldNative = native_;
    native_ = newNative == null ? NATIVE_EDEFAULT : newNative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.REQUERIMENTS__NATIVE, oldNative, native_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOther()
  {
    return other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOther(String newOther)
  {
    String oldOther = other;
    other = newOther;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.REQUERIMENTS__OTHER, oldOther, other));
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
      case GiraffeDSLPackage.REQUERIMENTS__NATIVE:
        return getNative();
      case GiraffeDSLPackage.REQUERIMENTS__OTHER:
        return getOther();
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
      case GiraffeDSLPackage.REQUERIMENTS__NATIVE:
        setNative((NativeRequirement)newValue);
        return;
      case GiraffeDSLPackage.REQUERIMENTS__OTHER:
        setOther((String)newValue);
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
      case GiraffeDSLPackage.REQUERIMENTS__NATIVE:
        setNative(NATIVE_EDEFAULT);
        return;
      case GiraffeDSLPackage.REQUERIMENTS__OTHER:
        setOther(OTHER_EDEFAULT);
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
      case GiraffeDSLPackage.REQUERIMENTS__NATIVE:
        return native_ != NATIVE_EDEFAULT;
      case GiraffeDSLPackage.REQUERIMENTS__OTHER:
        return OTHER_EDEFAULT == null ? other != null : !OTHER_EDEFAULT.equals(other);
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
    result.append(" (native: ");
    result.append(native_);
    result.append(", other: ");
    result.append(other);
    result.append(')');
    return result.toString();
  }

} //RequerimentsImpl
