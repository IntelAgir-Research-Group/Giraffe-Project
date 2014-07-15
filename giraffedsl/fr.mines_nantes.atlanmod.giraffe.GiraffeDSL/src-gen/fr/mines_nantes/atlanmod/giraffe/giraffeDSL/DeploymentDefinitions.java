/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions#getNodesets <em>Nodesets</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getDeploymentDefinitions()
 * @model
 * @generated
 */
public interface DeploymentDefinitions extends EObject
{
  /**
   * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifacts</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getDeploymentDefinitions_Artifacts()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getArtifacts();

  /**
   * Returns the value of the '<em><b>Nodesets</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodesets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodesets</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getDeploymentDefinitions_Nodesets()
   * @model containment="true"
   * @generated
   */
  EList<Nodeset> getNodesets();

} // DeploymentDefinitions
