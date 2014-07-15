/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Install</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install#getDepName <em>Dep Name</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install#getDepVersion <em>Dep Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getInstall()
 * @model
 * @generated
 */
public interface Install extends Dependency
{
  /**
   * Returns the value of the '<em><b>Dep Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dep Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dep Name</em>' attribute.
   * @see #setDepName(String)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getInstall_DepName()
   * @model
   * @generated
   */
  String getDepName();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install#getDepName <em>Dep Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dep Name</em>' attribute.
   * @see #getDepName()
   * @generated
   */
  void setDepName(String value);

  /**
   * Returns the value of the '<em><b>Dep Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dep Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dep Version</em>' attribute.
   * @see #setDepVersion(float)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getInstall_DepVersion()
   * @model
   * @generated
   */
  float getDepVersion();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Install#getDepVersion <em>Dep Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dep Version</em>' attribute.
   * @see #getDepVersion()
   * @generated
   */
  void setDepVersion(float value);

} // Install
