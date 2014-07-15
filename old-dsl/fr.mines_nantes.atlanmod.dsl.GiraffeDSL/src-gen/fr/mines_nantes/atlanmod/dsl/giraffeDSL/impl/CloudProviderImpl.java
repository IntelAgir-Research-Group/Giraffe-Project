/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudCredentialType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudOptionalTypes;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProvider;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudType;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.MgmAddressType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderImpl#getCloudType <em>Cloud Type</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderImpl#getCloudAddress <em>Cloud Address</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderImpl#getCloudCredential <em>Cloud Credential</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.CloudProviderImpl#getCloudOptionalTypes <em>Cloud Optional Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudProviderImpl extends TypeImpl implements CloudProvider
{
  /**
   * The cached value of the '{@link #getCloudType() <em>Cloud Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCloudType()
   * @generated
   * @ordered
   */
  protected EList<CloudType> cloudType;

  /**
   * The cached value of the '{@link #getCloudAddress() <em>Cloud Address</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCloudAddress()
   * @generated
   * @ordered
   */
  protected EList<MgmAddressType> cloudAddress;

  /**
   * The cached value of the '{@link #getCloudCredential() <em>Cloud Credential</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCloudCredential()
   * @generated
   * @ordered
   */
  protected EList<CloudCredentialType> cloudCredential;

  /**
   * The cached value of the '{@link #getCloudOptionalTypes() <em>Cloud Optional Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCloudOptionalTypes()
   * @generated
   * @ordered
   */
  protected EList<CloudOptionalTypes> cloudOptionalTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CloudProviderImpl()
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
    return GiraffeDSLPackage.Literals.CLOUD_PROVIDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CloudType> getCloudType()
  {
    if (cloudType == null)
    {
      cloudType = new EObjectContainmentEList<CloudType>(CloudType.class, this, GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_TYPE);
    }
    return cloudType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MgmAddressType> getCloudAddress()
  {
    if (cloudAddress == null)
    {
      cloudAddress = new EObjectContainmentEList<MgmAddressType>(MgmAddressType.class, this, GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_ADDRESS);
    }
    return cloudAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CloudCredentialType> getCloudCredential()
  {
    if (cloudCredential == null)
    {
      cloudCredential = new EObjectContainmentEList<CloudCredentialType>(CloudCredentialType.class, this, GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_CREDENTIAL);
    }
    return cloudCredential;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CloudOptionalTypes> getCloudOptionalTypes()
  {
    if (cloudOptionalTypes == null)
    {
      cloudOptionalTypes = new EObjectContainmentEList<CloudOptionalTypes>(CloudOptionalTypes.class, this, GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_OPTIONAL_TYPES);
    }
    return cloudOptionalTypes;
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
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_TYPE:
        return ((InternalEList<?>)getCloudType()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_ADDRESS:
        return ((InternalEList<?>)getCloudAddress()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_CREDENTIAL:
        return ((InternalEList<?>)getCloudCredential()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_OPTIONAL_TYPES:
        return ((InternalEList<?>)getCloudOptionalTypes()).basicRemove(otherEnd, msgs);
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
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_TYPE:
        return getCloudType();
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_ADDRESS:
        return getCloudAddress();
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_CREDENTIAL:
        return getCloudCredential();
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_OPTIONAL_TYPES:
        return getCloudOptionalTypes();
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
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_TYPE:
        getCloudType().clear();
        getCloudType().addAll((Collection<? extends CloudType>)newValue);
        return;
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_ADDRESS:
        getCloudAddress().clear();
        getCloudAddress().addAll((Collection<? extends MgmAddressType>)newValue);
        return;
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_CREDENTIAL:
        getCloudCredential().clear();
        getCloudCredential().addAll((Collection<? extends CloudCredentialType>)newValue);
        return;
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_OPTIONAL_TYPES:
        getCloudOptionalTypes().clear();
        getCloudOptionalTypes().addAll((Collection<? extends CloudOptionalTypes>)newValue);
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
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_TYPE:
        getCloudType().clear();
        return;
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_ADDRESS:
        getCloudAddress().clear();
        return;
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_CREDENTIAL:
        getCloudCredential().clear();
        return;
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_OPTIONAL_TYPES:
        getCloudOptionalTypes().clear();
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
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_TYPE:
        return cloudType != null && !cloudType.isEmpty();
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_ADDRESS:
        return cloudAddress != null && !cloudAddress.isEmpty();
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_CREDENTIAL:
        return cloudCredential != null && !cloudCredential.isEmpty();
      case GiraffeDSLPackage.CLOUD_PROVIDER__CLOUD_OPTIONAL_TYPES:
        return cloudOptionalTypes != null && !cloudOptionalTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CloudProviderImpl
