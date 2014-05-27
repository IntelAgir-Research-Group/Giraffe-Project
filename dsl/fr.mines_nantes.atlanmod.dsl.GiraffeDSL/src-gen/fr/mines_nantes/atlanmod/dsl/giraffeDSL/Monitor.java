/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor#getRange <em>Range</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.Monitor#getMonitoringType <em>Monitoring Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getMonitor()
 * @model
 * @generated
 */
public interface Monitor extends Type
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitorRangeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getMonitor_Range()
   * @model containment="true"
   * @generated
   */
  EList<MonitorRangeType> getRange();

  /**
   * Returns the value of the '<em><b>Monitoring Type</b></em>' containment reference list.
   * The list contents are of type {@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.MonitoringType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Monitoring Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monitoring Type</em>' containment reference list.
   * @see fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage#getMonitor_MonitoringType()
   * @model containment="true"
   * @generated
   */
  EList<MonitoringType> getMonitoringType();

} // Monitor
