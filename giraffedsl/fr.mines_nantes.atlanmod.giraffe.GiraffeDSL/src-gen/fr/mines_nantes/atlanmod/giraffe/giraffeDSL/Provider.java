/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends Providers
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeProvType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeProvType
   * @see #setType(NativeProvType)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getProvider_Type()
   * @model
   * @generated
   */
  NativeProvType getType();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Provider#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeProvType
   * @see #getType()
   * @generated
   */
  void setType(NativeProvType value);

} // Provider
