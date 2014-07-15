/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Artifact;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.ConfArtifact;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Execution;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ExecutionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ExecutionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ExecutionImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ExecutionImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ExecutionImpl#getSeq <em>Seq</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionImpl extends MinimalEObjectImpl.Container implements Execution
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected Artifact code;

  /**
   * The cached value of the '{@link #getConfig() <em>Config</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfig()
   * @generated
   * @ordered
   */
  protected EList<ConfArtifact> config;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected Nodeset nodes;

  /**
   * The default value of the '{@link #getSeq() <em>Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeq()
   * @generated
   * @ordered
   */
  protected static final int SEQ_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSeq() <em>Seq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeq()
   * @generated
   * @ordered
   */
  protected int seq = SEQ_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecutionImpl()
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
    return GiraffeDSLPackage.Literals.EXECUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.EXECUTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact getCode()
  {
    if (code != null && code.eIsProxy())
    {
      InternalEObject oldCode = (InternalEObject)code;
      code = (Artifact)eResolveProxy(oldCode);
      if (code != oldCode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GiraffeDSLPackage.EXECUTION__CODE, oldCode, code));
      }
    }
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact basicGetCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCode(Artifact newCode)
  {
    Artifact oldCode = code;
    code = newCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.EXECUTION__CODE, oldCode, code));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConfArtifact> getConfig()
  {
    if (config == null)
    {
      config = new EObjectResolvingEList<ConfArtifact>(ConfArtifact.class, this, GiraffeDSLPackage.EXECUTION__CONFIG);
    }
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nodeset getNodes()
  {
    if (nodes != null && nodes.eIsProxy())
    {
      InternalEObject oldNodes = (InternalEObject)nodes;
      nodes = (Nodeset)eResolveProxy(oldNodes);
      if (nodes != oldNodes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GiraffeDSLPackage.EXECUTION__NODES, oldNodes, nodes));
      }
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nodeset basicGetNodes()
  {
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodes(Nodeset newNodes)
  {
    Nodeset oldNodes = nodes;
    nodes = newNodes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.EXECUTION__NODES, oldNodes, nodes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSeq()
  {
    return seq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeq(int newSeq)
  {
    int oldSeq = seq;
    seq = newSeq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.EXECUTION__SEQ, oldSeq, seq));
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
      case GiraffeDSLPackage.EXECUTION__NAME:
        return getName();
      case GiraffeDSLPackage.EXECUTION__CODE:
        if (resolve) return getCode();
        return basicGetCode();
      case GiraffeDSLPackage.EXECUTION__CONFIG:
        return getConfig();
      case GiraffeDSLPackage.EXECUTION__NODES:
        if (resolve) return getNodes();
        return basicGetNodes();
      case GiraffeDSLPackage.EXECUTION__SEQ:
        return getSeq();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.EXECUTION__NAME:
        setName((String)newValue);
        return;
      case GiraffeDSLPackage.EXECUTION__CODE:
        setCode((Artifact)newValue);
        return;
      case GiraffeDSLPackage.EXECUTION__CONFIG:
        getConfig().clear();
        getConfig().addAll((Collection<? extends ConfArtifact>)newValue);
        return;
      case GiraffeDSLPackage.EXECUTION__NODES:
        setNodes((Nodeset)newValue);
        return;
      case GiraffeDSLPackage.EXECUTION__SEQ:
        setSeq((Integer)newValue);
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
      case GiraffeDSLPackage.EXECUTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GiraffeDSLPackage.EXECUTION__CODE:
        setCode((Artifact)null);
        return;
      case GiraffeDSLPackage.EXECUTION__CONFIG:
        getConfig().clear();
        return;
      case GiraffeDSLPackage.EXECUTION__NODES:
        setNodes((Nodeset)null);
        return;
      case GiraffeDSLPackage.EXECUTION__SEQ:
        setSeq(SEQ_EDEFAULT);
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
      case GiraffeDSLPackage.EXECUTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GiraffeDSLPackage.EXECUTION__CODE:
        return code != null;
      case GiraffeDSLPackage.EXECUTION__CONFIG:
        return config != null && !config.isEmpty();
      case GiraffeDSLPackage.EXECUTION__NODES:
        return nodes != null;
      case GiraffeDSLPackage.EXECUTION__SEQ:
        return seq != SEQ_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", seq: ");
    result.append(seq);
    result.append(')');
    return result.toString();
  }

} //ExecutionImpl
