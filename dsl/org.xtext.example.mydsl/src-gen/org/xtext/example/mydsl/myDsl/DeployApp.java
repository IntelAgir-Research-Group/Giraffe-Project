/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeployApp#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeployApp#getDeployMasterMethod <em>Deploy Master Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DeployApp#getDeploySlaveMethod <em>Deploy Slave Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeployApp()
 * @model
 * @generated
 */
public interface DeployApp extends Type
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DeployAppClassType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeployApp_Class()
   * @model containment="true"
   * @generated
   */
  EList<DeployAppClassType> getClass_();

  /**
   * Returns the value of the '<em><b>Deploy Master Method</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DeployAppMasterMethodType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deploy Master Method</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deploy Master Method</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeployApp_DeployMasterMethod()
   * @model containment="true"
   * @generated
   */
  EList<DeployAppMasterMethodType> getDeployMasterMethod();

  /**
   * Returns the value of the '<em><b>Deploy Slave Method</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DeployAppSlaveMethodType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deploy Slave Method</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deploy Slave Method</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeployApp_DeploySlaveMethod()
   * @model containment="true"
   * @generated
   */
  EList<DeployAppSlaveMethodType> getDeploySlaveMethod();

} // DeployApp
