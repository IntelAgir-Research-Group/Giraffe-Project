/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requeriments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments#getNative <em>Native</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments#getOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getRequeriments()
 * @model
 * @generated
 */
public interface Requeriments extends EObject
{
  /**
   * Returns the value of the '<em><b>Native</b></em>' attribute.
   * The literals are from the enumeration {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Native</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Native</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement
   * @see #setNative(NativeRequirement)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getRequeriments_Native()
   * @model
   * @generated
   */
  NativeRequirement getNative();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments#getNative <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Native</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeRequirement
   * @see #getNative()
   * @generated
   */
  void setNative(NativeRequirement value);

  /**
   * Returns the value of the '<em><b>Other</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other</em>' attribute.
   * @see #setOther(String)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getRequeriments_Other()
   * @model
   * @generated
   */
  String getOther();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Requeriments#getOther <em>Other</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Other</em>' attribute.
   * @see #getOther()
   * @generated
   */
  void setOther(String value);

} // Requeriments
