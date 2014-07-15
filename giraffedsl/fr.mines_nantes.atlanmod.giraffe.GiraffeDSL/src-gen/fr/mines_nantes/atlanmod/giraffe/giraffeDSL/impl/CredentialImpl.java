/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.CredentialImpl#getCredentialFile <em>Credential File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CredentialImpl extends AuthImpl implements Credential
{
  /**
   * The default value of the '{@link #getCredentialFile() <em>Credential File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCredentialFile()
   * @generated
   * @ordered
   */
  protected static final String CREDENTIAL_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCredentialFile() <em>Credential File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCredentialFile()
   * @generated
   * @ordered
   */
  protected String credentialFile = CREDENTIAL_FILE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CredentialImpl()
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
    return GiraffeDSLPackage.Literals.CREDENTIAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCredentialFile()
  {
    return credentialFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCredentialFile(String newCredentialFile)
  {
    String oldCredentialFile = credentialFile;
    credentialFile = newCredentialFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.CREDENTIAL__CREDENTIAL_FILE, oldCredentialFile, credentialFile));
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
      case GiraffeDSLPackage.CREDENTIAL__CREDENTIAL_FILE:
        return getCredentialFile();
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
      case GiraffeDSLPackage.CREDENTIAL__CREDENTIAL_FILE:
        setCredentialFile((String)newValue);
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
      case GiraffeDSLPackage.CREDENTIAL__CREDENTIAL_FILE:
        setCredentialFile(CREDENTIAL_FILE_EDEFAULT);
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
      case GiraffeDSLPackage.CREDENTIAL__CREDENTIAL_FILE:
        return CREDENTIAL_FILE_EDEFAULT == null ? credentialFile != null : !CREDENTIAL_FILE_EDEFAULT.equals(credentialFile);
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
    result.append(" (credentialFile: ");
    result.append(credentialFile);
    result.append(')');
    return result.toString();
  }

} //CredentialImpl
