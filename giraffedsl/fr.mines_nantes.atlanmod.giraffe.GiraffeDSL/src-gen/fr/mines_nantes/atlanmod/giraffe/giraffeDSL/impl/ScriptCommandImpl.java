/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ScriptCommand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ScriptCommandImpl#getScriptCommand <em>Script Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptCommandImpl extends ArtifactImpl implements ScriptCommand
{
  /**
   * The default value of the '{@link #getScriptCommand() <em>Script Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptCommand()
   * @generated
   * @ordered
   */
  protected static final String SCRIPT_COMMAND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScriptCommand() <em>Script Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptCommand()
   * @generated
   * @ordered
   */
  protected String scriptCommand = SCRIPT_COMMAND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptCommandImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GiraffeDSLPackage.Literals.SCRIPT_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScriptCommand()
  {
    return scriptCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScriptCommand(String newScriptCommand)
  {
    String oldScriptCommand = scriptCommand;
    scriptCommand = newScriptCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.SCRIPT_COMMAND__SCRIPT_COMMAND, oldScriptCommand, scriptCommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.SCRIPT_COMMAND__SCRIPT_COMMAND:
        return getScriptCommand();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.SCRIPT_COMMAND__SCRIPT_COMMAND:
        setScriptCommand((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.SCRIPT_COMMAND__SCRIPT_COMMAND:
        setScriptCommand(SCRIPT_COMMAND_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.SCRIPT_COMMAND__SCRIPT_COMMAND:
        return SCRIPT_COMMAND_EDEFAULT == null ? scriptCommand != null : !SCRIPT_COMMAND_EDEFAULT.equals(scriptCommand);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (scriptCommand: ");
    result.append(scriptCommand);
    result.append(')');
    return result.toString();
  }

} //ScriptCommandImpl
