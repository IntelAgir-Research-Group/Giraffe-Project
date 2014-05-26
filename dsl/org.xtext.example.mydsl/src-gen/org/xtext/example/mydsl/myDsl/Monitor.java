/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Monitor#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Monitor#getMonitoringType <em>Monitoring Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMonitor()
 * @model
 * @generated
 */
public interface Monitor extends Type
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.MonitorRangeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMonitor_Range()
   * @model containment="true"
   * @generated
   */
  EList<MonitorRangeType> getRange();

  /**
   * Returns the value of the '<em><b>Monitoring Type</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.MonitoringType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Monitoring Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monitoring Type</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMonitor_MonitoringType()
   * @model containment="true"
   * @generated
   */
  EList<MonitoringType> getMonitoringType();

} // Monitor
