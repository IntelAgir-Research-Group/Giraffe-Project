/**
 */
package fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.dsl.giraffeDSL.Deploy;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployAppFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.DeployTypeFeature;
import fr.mines_nantes.atlanmod.dsl.giraffeDSL.GiraffeDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployImpl#getDeployOne <em>Deploy One</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.dsl.giraffeDSL.impl.DeployImpl#getDeployTwo <em>Deploy Two</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeployImpl extends TypeImpl implements Deploy
{
  /**
   * The cached value of the '{@link #getDeployOne() <em>Deploy One</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeployOne()
   * @generated
   * @ordered
   */
  protected EList<DeployAppFeature> deployOne;

  /**
   * The cached value of the '{@link #getDeployTwo() <em>Deploy Two</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeployTwo()
   * @generated
   * @ordered
   */
  protected EList<DeployTypeFeature> deployTwo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeployImpl()
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
    return GiraffeDSLPackage.Literals.DEPLOY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeployAppFeature> getDeployOne()
  {
    if (deployOne == null)
    {
      deployOne = new EObjectContainmentEList<DeployAppFeature>(DeployAppFeature.class, this, GiraffeDSLPackage.DEPLOY__DEPLOY_ONE);
    }
    return deployOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeployTypeFeature> getDeployTwo()
  {
    if (deployTwo == null)
    {
      deployTwo = new EObjectContainmentEList<DeployTypeFeature>(DeployTypeFeature.class, this, GiraffeDSLPackage.DEPLOY__DEPLOY_TWO);
    }
    return deployTwo;
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
      case GiraffeDSLPackage.DEPLOY__DEPLOY_ONE:
        return ((InternalEList<?>)getDeployOne()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.DEPLOY__DEPLOY_TWO:
        return ((InternalEList<?>)getDeployTwo()).basicRemove(otherEnd, msgs);
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
      case GiraffeDSLPackage.DEPLOY__DEPLOY_ONE:
        return getDeployOne();
      case GiraffeDSLPackage.DEPLOY__DEPLOY_TWO:
        return getDeployTwo();
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
      case GiraffeDSLPackage.DEPLOY__DEPLOY_ONE:
        getDeployOne().clear();
        getDeployOne().addAll((Collection<? extends DeployAppFeature>)newValue);
        return;
      case GiraffeDSLPackage.DEPLOY__DEPLOY_TWO:
        getDeployTwo().clear();
        getDeployTwo().addAll((Collection<? extends DeployTypeFeature>)newValue);
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
      case GiraffeDSLPackage.DEPLOY__DEPLOY_ONE:
        getDeployOne().clear();
        return;
      case GiraffeDSLPackage.DEPLOY__DEPLOY_TWO:
        getDeployTwo().clear();
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
      case GiraffeDSLPackage.DEPLOY__DEPLOY_ONE:
        return deployOne != null && !deployOne.isEmpty();
      case GiraffeDSLPackage.DEPLOY__DEPLOY_TWO:
        return deployTwo != null && !deployTwo.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeployImpl
