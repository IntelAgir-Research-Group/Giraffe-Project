/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getAuths <em>Auths</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getResources <em>Resources</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getVirtualmachines <em>Virtualmachines</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment#getProviders <em>Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject
{
  /**
   * Returns the value of the '<em><b>Auths</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Auths</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Auths</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getEnvironment_Auths()
   * @model containment="true"
   * @generated
   */
  EList<Auth> getAuths();

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getEnvironment_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Resource> getResources();

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getEnvironment_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<Dependency> getDependencies();

  /**
   * Returns the value of the '<em><b>Virtualmachines</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Virtualmachines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtualmachines</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getEnvironment_Virtualmachines()
   * @model containment="true"
   * @generated
   */
  EList<VirtualMachine> getVirtualmachines();

  /**
   * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Providers</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getEnvironment_Providers()
   * @model containment="true"
   * @generated
   */
  EList<Providers> getProviders();

} // Environment
