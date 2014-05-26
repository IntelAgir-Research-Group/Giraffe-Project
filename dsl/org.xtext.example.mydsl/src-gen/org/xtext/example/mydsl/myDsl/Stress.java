/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Stress#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Stress#getStressClass <em>Stress Class</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Stress#getStressMethod <em>Stress Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStress()
 * @model
 * @generated
 */
public interface Stress extends Type
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.StressRangeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStress_Range()
   * @model containment="true"
   * @generated
   */
  EList<StressRangeType> getRange();

  /**
   * Returns the value of the '<em><b>Stress Class</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.StressClassType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stress Class</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stress Class</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStress_StressClass()
   * @model containment="true"
   * @generated
   */
  EList<StressClassType> getStressClass();

  /**
   * Returns the value of the '<em><b>Stress Method</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.StressMethodType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stress Method</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stress Method</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStress_StressMethod()
   * @model containment="true"
   * @generated
   */
  EList<StressMethodType> getStressMethod();

} // Stress
