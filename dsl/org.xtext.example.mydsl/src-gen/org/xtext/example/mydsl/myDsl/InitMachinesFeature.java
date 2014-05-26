/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Machines Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InitMachinesFeature#getMany <em>Many</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InitMachinesFeature#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.InitMachinesFeature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInitMachinesFeature()
 * @model
 * @generated
 */
public interface InitMachinesFeature extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInitMachinesFeature_Many()
   * @model
   * @generated
   */
  String getMany();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InitMachinesFeature#getMany <em>Many</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInitMachinesFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InitMachinesFeature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInitMachinesFeature_Type()
   * @model
   * @generated
   */
  int getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.InitMachinesFeature#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(int value);

} // InitMachinesFeature
