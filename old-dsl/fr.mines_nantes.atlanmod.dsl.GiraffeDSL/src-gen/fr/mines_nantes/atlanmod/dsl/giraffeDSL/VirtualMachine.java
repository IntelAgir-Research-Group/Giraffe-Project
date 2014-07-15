/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine#getVM <em>VM</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachine#getCloudProvider <em>Cloud Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getVirtualMachine()
 * @model
 * @generated
 */
public interface VirtualMachine extends Type
{
  /**
   * Returns the value of the '<em><b>VM</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.VirtualMachineTypeFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VM</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VM</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getVirtualMachine_VM()
   * @model containment="true"
   * @generated
   */
  EList<VirtualMachineTypeFeature> getVM();

  /**
   * Returns the value of the '<em><b>Cloud Provider</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cloud Provider</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cloud Provider</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getVirtualMachine_CloudProvider()
   * @model containment="true"
   * @generated
   */
  EList<CloudProviderType> getCloudProvider();

} // VirtualMachine
