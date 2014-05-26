/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Deploy#getDeployOne <em>Deploy One</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Deploy#getDeployTwo <em>Deploy Two</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeploy()
 * @model
 * @generated
 */
public interface Deploy extends Type
{
  /**
   * Returns the value of the '<em><b>Deploy One</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DeployAppFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deploy One</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deploy One</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeploy_DeployOne()
   * @model containment="true"
   * @generated
   */
  EList<DeployAppFeature> getDeployOne();

  /**
   * Returns the value of the '<em><b>Deploy Two</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DeployTypeFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deploy Two</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deploy Two</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeploy_DeployTwo()
   * @model containment="true"
   * @generated
   */
  EList<DeployTypeFeature> getDeployTwo();

} // Deploy
