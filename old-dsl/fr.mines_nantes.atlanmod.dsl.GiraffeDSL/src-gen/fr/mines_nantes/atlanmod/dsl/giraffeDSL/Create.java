/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create#getVMachine <em>VMachine</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create#getInitMachines <em>Init Machines</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Create#getInitIncrement <em>Init Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends Type
{
  /**
   * Returns the value of the '<em><b>VMachine</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VMachine</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VMachine</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCreate_VMachine()
   * @model containment="true"
   * @generated
   */
  EList<VirtualMachineFeature> getVMachine();

  /**
   * Returns the value of the '<em><b>Init Machines</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitMachinesFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Machines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Machines</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCreate_InitMachines()
   * @model containment="true"
   * @generated
   */
  EList<InitMachinesFeature> getInitMachines();

  /**
   * Returns the value of the '<em><b>Init Increment</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.InitIncrementFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Increment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Increment</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCreate_InitIncrement()
   * @model containment="true"
   * @generated
   */
  EList<InitIncrementFeature> getInitIncrement();

} // Create
