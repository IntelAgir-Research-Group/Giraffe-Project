/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential#getCredentialFile <em>Credential File</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getCredential()
 * @model
 * @generated
 */
public interface Credential extends Auth
{
  /**
   * Returns the value of the '<em><b>Credential File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Credential File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Credential File</em>' attribute.
   * @see #setCredentialFile(String)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getCredential_CredentialFile()
   * @model
   * @generated
   */
  String getCredentialFile();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Credential#getCredentialFile <em>Credential File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Credential File</em>' attribute.
   * @see #getCredentialFile()
   * @generated
   */
  void setCredentialFile(String value);

} // Credential
