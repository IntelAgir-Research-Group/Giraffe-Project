/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Provider Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderTypeImpl#getMany <em>Many</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudProviderTypeImpl extends MinimalEObjectImpl.Container implements CloudProviderType
{
  /**
   * The default value of the '{@link #getMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMany()
   * @generated
   * @ordered
   */
  protected static final String MANY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMany()
   * @generated
   * @ordered
   */
  protected String many = MANY_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected CloudProvider type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CloudProviderTypeImpl()
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
    return GiraffeDSLPackage.Literals.CLOUD_PROVIDER_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMany()
  {
    return many;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMany(String newMany)
  {
    String oldMany = many;
    many = newMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__MANY, oldMany, many));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloudProvider getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (CloudProvider)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloudProvider basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(CloudProvider newType)
  {
    CloudProvider oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__TYPE, oldType, type));
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
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__MANY:
        return getMany();
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__NAME:
        return getName();
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__MANY:
        setMany((String)newValue);
        return;
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__NAME:
        setName((String)newValue);
        return;
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__TYPE:
        setType((CloudProvider)newValue);
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
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__MANY:
        setMany(MANY_EDEFAULT);
        return;
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__TYPE:
        setType((CloudProvider)null);
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
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__MANY:
        return MANY_EDEFAULT == null ? many != null : !MANY_EDEFAULT.equals(many);
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GiraffeDSLPackage.CLOUD_PROVIDER_TYPE__TYPE:
        return type != null;
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
    result.append(" (many: ");
    result.append(many);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CloudProviderTypeImpl
