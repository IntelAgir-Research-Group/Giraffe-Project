/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Nodeset;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentDefinitionsImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.DeploymentDefinitionsImpl#getNodesets <em>Nodesets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentDefinitionsImpl extends MinimalEObjectImpl.Container implements DeploymentDefinitions
{
  /**
   * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifacts()
   * @generated
   * @ordered
   */
  protected EList<EObject> artifacts;

  /**
   * The cached value of the '{@link #getNodesets() <em>Nodesets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodesets()
   * @generated
   * @ordered
   */
  protected EList<Nodeset> nodesets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentDefinitionsImpl()
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
    return GiraffeDSLPackage.Literals.DEPLOYMENT_DEFINITIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getArtifacts()
  {
    if (artifacts == null)
    {
      artifacts = new EObjectContainmentEList<EObject>(EObject.class, this, GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__ARTIFACTS);
    }
    return artifacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Nodeset> getNodesets()
  {
    if (nodesets == null)
    {
      nodesets = new EObjectContainmentEList<Nodeset>(Nodeset.class, this, GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__NODESETS);
    }
    return nodesets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__ARTIFACTS:
        return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__NODESETS:
        return ((InternalEList<?>)getNodesets()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__ARTIFACTS:
        return getArtifacts();
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__NODESETS:
        return getNodesets();
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
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__ARTIFACTS:
        getArtifacts().clear();
        getArtifacts().addAll((Collection<? extends EObject>)newValue);
        return;
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__NODESETS:
        getNodesets().clear();
        getNodesets().addAll((Collection<? extends Nodeset>)newValue);
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
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__ARTIFACTS:
        getArtifacts().clear();
        return;
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__NODESETS:
        getNodesets().clear();
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
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__ARTIFACTS:
        return artifacts != null && !artifacts.isEmpty();
      case GiraffeDSLPackage.DEPLOYMENT_DEFINITIONS__NODESETS:
        return nodesets != null && !nodesets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeploymentDefinitionsImpl
