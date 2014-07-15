/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment#getSetups <em>Setups</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment#getDeploys <em>Deploys</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject
{
  /**
   * Returns the value of the '<em><b>Setups</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setups</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setups</em>' containment reference.
   * @see #setSetups(Setup)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getDeployment_Setups()
   * @model containment="true"
   * @generated
   */
  Setup getSetups();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment#getSetups <em>Setups</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Setups</em>' containment reference.
   * @see #getSetups()
   * @generated
   */
  void setSetups(Setup value);

  /**
   * Returns the value of the '<em><b>Deploys</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deploys</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deploys</em>' containment reference.
   * @see #setDeploys(Deploy)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getDeployment_Deploys()
   * @model containment="true"
   * @generated
   */
  Deploy getDeploys();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment#getDeploys <em>Deploys</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deploys</em>' containment reference.
   * @see #getDeploys()
   * @generated
   */
  void setDeploys(Deploy value);

} // Deployment
