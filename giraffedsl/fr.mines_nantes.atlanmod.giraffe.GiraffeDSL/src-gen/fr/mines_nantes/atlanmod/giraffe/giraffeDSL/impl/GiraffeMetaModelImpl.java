/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Deployment;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.DeploymentDefinitions;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Environment;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeMetaModel;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Import;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Giraffe Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeMetaModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeMetaModelImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeMetaModelImpl#getDeploymentdefinitions <em>Deploymentdefinitions</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.GiraffeMetaModelImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GiraffeMetaModelImpl extends MinimalEObjectImpl.Container implements GiraffeMetaModel
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironment()
   * @generated
   * @ordered
   */
  protected Environment environment;

  /**
   * The cached value of the '{@link #getDeploymentdefinitions() <em>Deploymentdefinitions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeploymentdefinitions()
   * @generated
   * @ordered
   */
  protected DeploymentDefinitions deploymentdefinitions;

  /**
   * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeployment()
   * @generated
   * @ordered
   */
  protected Deployment deployment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GiraffeMetaModelImpl()
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
    return GiraffeDSLPackage.Literals.GIRAFFE_META_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, GiraffeDSLPackage.GIRAFFE_META_MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment getEnvironment()
  {
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs)
  {
    Environment oldEnvironment = environment;
    environment = newEnvironment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.GIRAFFE_META_MODEL__ENVIRONMENT, oldEnvironment, newEnvironment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnvironment(Environment newEnvironment)
  {
    if (newEnvironment != environment)
    {
      NotificationChain msgs = null;
      if (environment != null)
        msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GiraffeDSLPackage.GIRAFFE_META_MODEL__ENVIRONMENT, null, msgs);
      if (newEnvironment != null)
        msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GiraffeDSLPackage.GIRAFFE_META_MODEL__ENVIRONMENT, null, msgs);
      msgs = basicSetEnvironment(newEnvironment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.GIRAFFE_META_MODEL__ENVIRONMENT, newEnvironment, newEnvironment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentDefinitions getDeploymentdefinitions()
  {
    return deploymentdefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeploymentdefinitions(DeploymentDefinitions newDeploymentdefinitions, NotificationChain msgs)
  {
    DeploymentDefinitions oldDeploymentdefinitions = deploymentdefinitions;
    deploymentdefinitions = newDeploymentdefinitions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS, oldDeploymentdefinitions, newDeploymentdefinitions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeploymentdefinitions(DeploymentDefinitions newDeploymentdefinitions)
  {
    if (newDeploymentdefinitions != deploymentdefinitions)
    {
      NotificationChain msgs = null;
      if (deploymentdefinitions != null)
        msgs = ((InternalEObject)deploymentdefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS, null, msgs);
      if (newDeploymentdefinitions != null)
        msgs = ((InternalEObject)newDeploymentdefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS, null, msgs);
      msgs = basicSetDeploymentdefinitions(newDeploymentdefinitions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS, newDeploymentdefinitions, newDeploymentdefinitions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment getDeployment()
  {
    return deployment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs)
  {
    Deployment oldDeployment = deployment;
    deployment = newDeployment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENT, oldDeployment, newDeployment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeployment(Deployment newDeployment)
  {
    if (newDeployment != deployment)
    {
      NotificationChain msgs = null;
      if (deployment != null)
        msgs = ((InternalEObject)deployment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENT, null, msgs);
      if (newDeployment != null)
        msgs = ((InternalEObject)newDeployment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENT, null, msgs);
      msgs = basicSetDeployment(newDeployment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENT, newDeployment, newDeployment));
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
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__ENVIRONMENT:
        return basicSetEnvironment(null, msgs);
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS:
        return basicSetDeploymentdefinitions(null, msgs);
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENT:
        return basicSetDeployment(null, msgs);
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
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__IMPORTS:
        return getImports();
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__ENVIRONMENT:
        return getEnvironment();
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS:
        return getDeploymentdefinitions();
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENT:
        return getDeployment();
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
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__ENVIRONMENT:
        setEnvironment((Environment)newValue);
        return;
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS:
        setDeploymentdefinitions((DeploymentDefinitions)newValue);
        return;
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENT:
        setDeployment((Deployment)newValue);
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
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__IMPORTS:
        getImports().clear();
        return;
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__ENVIRONMENT:
        setEnvironment((Environment)null);
        return;
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS:
        setDeploymentdefinitions((DeploymentDefinitions)null);
        return;
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENT:
        setDeployment((Deployment)null);
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
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__ENVIRONMENT:
        return environment != null;
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENTDEFINITIONS:
        return deploymentdefinitions != null;
      case GiraffeDSLPackage.GIRAFFE_META_MODEL__DEPLOYMENT:
        return deployment != null;
    }
    return super.eIsSet(featureID);
  }

} //GiraffeMetaModelImpl
