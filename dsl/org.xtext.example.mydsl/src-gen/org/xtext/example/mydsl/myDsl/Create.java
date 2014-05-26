/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Create#getVMachine <em>VMachine</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Create#getInitMachines <em>Init Machines</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Create#getInitIncrement <em>Init Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends Type
{
  /**
   * Returns the value of the '<em><b>VMachine</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.VirtualMachineFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VMachine</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VMachine</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreate_VMachine()
   * @model containment="true"
   * @generated
   */
  EList<VirtualMachineFeature> getVMachine();

  /**
   * Returns the value of the '<em><b>Init Machines</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.InitMachinesFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Machines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Machines</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreate_InitMachines()
   * @model containment="true"
   * @generated
   */
  EList<InitMachinesFeature> getInitMachines();

  /**
   * Returns the value of the '<em><b>Init Increment</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.InitIncrementFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Increment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Increment</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreate_InitIncrement()
   * @model containment="true"
   * @generated
   */
  EList<InitIncrementFeature> getInitIncrement();

} // Create
