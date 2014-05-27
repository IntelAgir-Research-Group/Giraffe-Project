/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Provider Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getMany <em>Many</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getName <em>Name</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCloudProviderType()
 * @model
 * @generated
 */
public interface CloudProviderType extends EObject
{
  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(String)
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCloudProviderType_Many()
   * @model
   * @generated
   */
  String getMany();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #getMany()
   * @generated
   */
  void setMany(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCloudProviderType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(CloudProvider)
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getCloudProviderType_Type()
   * @model
   * @generated
   */
  CloudProvider getType();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.CloudProviderType#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(CloudProvider value);

} // CloudProviderType
