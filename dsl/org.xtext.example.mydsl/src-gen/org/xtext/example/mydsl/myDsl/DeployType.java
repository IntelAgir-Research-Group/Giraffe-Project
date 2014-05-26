/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeployType#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeployType()
 * @model
 * @generated
 */
public interface DeployType extends Type
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DeployRangeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeployType_Range()
   * @model containment="true"
   * @generated
   */
  EList<DeployRangeType> getRange();

} // DeployType
