/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getName <em>Name</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getSo <em>So</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getAuth <em>Auth</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getDep <em>Dep</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getVirtualMachine()
 * @model
 * @generated
 */
public interface VirtualMachine extends EObject
{
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
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getVirtualMachine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>So</b></em>' attribute.
   * The literals are from the enumeration {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>So</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>So</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO
   * @see #setSo(NativeSO)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getVirtualMachine_So()
   * @model
   * @generated
   */
  NativeSO getSo();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getSo <em>So</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>So</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO
   * @see #getSo()
   * @generated
   */
  void setSo(NativeSO value);

  /**
   * Returns the value of the '<em><b>Distribution</b></em>' attribute.
   * The literals are from the enumeration {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distribution</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution
   * @see #setDistribution(NativeDistribution)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getVirtualMachine_Distribution()
   * @model
   * @generated
   */
  NativeDistribution getDistribution();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getDistribution <em>Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distribution</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution
   * @see #getDistribution()
   * @generated
   */
  void setDistribution(NativeDistribution value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(float)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getVirtualMachine_Version()
   * @model
   * @generated
   */
  float getVersion();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(float value);

  /**
   * Returns the value of the '<em><b>Auth</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Auth</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Auth</em>' reference.
   * @see #setAuth(Auth)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getVirtualMachine_Auth()
   * @model
   * @generated
   */
  Auth getAuth();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine#getAuth <em>Auth</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Auth</em>' reference.
   * @see #getAuth()
   * @generated
   */
  void setAuth(Auth value);

  /**
   * Returns the value of the '<em><b>Dep</b></em>' reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dep</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dep</em>' reference list.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getVirtualMachine_Dep()
   * @model
   * @generated
   */
  EList<Dependency> getDep();

} // VirtualMachine
