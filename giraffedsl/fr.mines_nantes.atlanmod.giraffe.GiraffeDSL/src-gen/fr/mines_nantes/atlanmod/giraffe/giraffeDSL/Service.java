/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service#getSrvAction <em>Srv Action</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service#getServiceName <em>Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Dependency
{
  /**
   * Returns the value of the '<em><b>Srv Action</b></em>' attribute.
   * The literals are from the enumeration {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Srv Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Srv Action</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal
   * @see #setSrvAction(SrvSignal)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getService_SrvAction()
   * @model
   * @generated
   */
  SrvSignal getSrvAction();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service#getSrvAction <em>Srv Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Srv Action</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.SrvSignal
   * @see #getSrvAction()
   * @generated
   */
  void setSrvAction(SrvSignal value);

  /**
   * Returns the value of the '<em><b>Service Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Name</em>' attribute.
   * @see #setServiceName(String)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getService_ServiceName()
   * @model
   * @generated
   */
  String getServiceName();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Service#getServiceName <em>Service Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Name</em>' attribute.
   * @see #getServiceName()
   * @generated
   */
  void setServiceName(String value);

} // Service
