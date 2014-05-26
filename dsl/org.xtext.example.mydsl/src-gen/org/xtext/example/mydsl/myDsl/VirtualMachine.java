/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.VirtualMachine#getVM <em>VM</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.VirtualMachine#getCloudProvider <em>Cloud Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVirtualMachine()
 * @model
 * @generated
 */
public interface VirtualMachine extends Type
{
  /**
   * Returns the value of the '<em><b>VM</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.VirtualMachineTypeFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VM</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VM</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVirtualMachine_VM()
   * @model containment="true"
   * @generated
   */
  EList<VirtualMachineTypeFeature> getVM();

  /**
   * Returns the value of the '<em><b>Cloud Provider</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.CloudProviderType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cloud Provider</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cloud Provider</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVirtualMachine_CloudProvider()
   * @model containment="true"
   * @generated
   */
  EList<CloudProviderType> getCloudProvider();

} // VirtualMachine
