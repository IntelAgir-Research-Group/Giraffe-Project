/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Action#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Action#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Action#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Type
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ActionRangeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAction_Range()
   * @model containment="true"
   * @generated
   */
  EList<ActionRangeType> getRange();

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ActionClassType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAction_Class()
   * @model containment="true"
   * @generated
   */
  EList<ActionClassType> getClass_();

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ActionMethodType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAction_Method()
   * @model containment="true"
   * @generated
   */
  EList<ActionMethodType> getMethod();

} // Action
