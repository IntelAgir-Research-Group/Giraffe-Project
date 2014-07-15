/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Providers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProvidersImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProvidersImpl#getAuthMethod <em>Auth Method</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProvidersImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProvidersImpl#getVm <em>Vm</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ProvidersImpl#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidersImpl extends MinimalEObjectImpl.Container implements Providers
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
   * The cached value of the '{@link #getAuthMethod() <em>Auth Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthMethod()
   * @generated
   * @ordered
   */
  protected Auth authMethod;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected Resource resources;

  /**
   * The cached value of the '{@link #getVm() <em>Vm</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVm()
   * @generated
   * @ordered
   */
  protected VirtualMachine vm;

  /**
   * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected static final String HOST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected String host = HOST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvidersImpl()
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
    return GiraffeDSLPackage.Literals.PROVIDERS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.PROVIDERS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Auth getAuthMethod()
  {
    if (authMethod != null && authMethod.eIsProxy())
    {
      InternalEObject oldAuthMethod = (InternalEObject)authMethod;
      authMethod = (Auth)eResolveProxy(oldAuthMethod);
      if (authMethod != oldAuthMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GiraffeDSLPackage.PROVIDERS__AUTH_METHOD, oldAuthMethod, authMethod));
      }
    }
    return authMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Auth basicGetAuthMethod()
  {
    return authMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthMethod(Auth newAuthMethod)
  {
    Auth oldAuthMethod = authMethod;
    authMethod = newAuthMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.PROVIDERS__AUTH_METHOD, oldAuthMethod, authMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource getResources()
  {
    if (resources != null && resources.eIsProxy())
    {
      InternalEObject oldResources = (InternalEObject)resources;
      resources = (Resource)eResolveProxy(oldResources);
      if (resources != oldResources)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GiraffeDSLPackage.PROVIDERS__RESOURCES, oldResources, resources));
      }
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource basicGetResources()
  {
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResources(Resource newResources)
  {
    Resource oldResources = resources;
    resources = newResources;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.PROVIDERS__RESOURCES, oldResources, resources));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualMachine getVm()
  {
    if (vm != null && vm.eIsProxy())
    {
      InternalEObject oldVm = (InternalEObject)vm;
      vm = (VirtualMachine)eResolveProxy(oldVm);
      if (vm != oldVm)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GiraffeDSLPackage.PROVIDERS__VM, oldVm, vm));
      }
    }
    return vm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualMachine basicGetVm()
  {
    return vm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVm(VirtualMachine newVm)
  {
    VirtualMachine oldVm = vm;
    vm = newVm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.PROVIDERS__VM, oldVm, vm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHost()
  {
    return host;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHost(String newHost)
  {
    String oldHost = host;
    host = newHost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.PROVIDERS__HOST, oldHost, host));
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
      case GiraffeDSLPackage.PROVIDERS__NAME:
        return getName();
      case GiraffeDSLPackage.PROVIDERS__AUTH_METHOD:
        if (resolve) return getAuthMethod();
        return basicGetAuthMethod();
      case GiraffeDSLPackage.PROVIDERS__RESOURCES:
        if (resolve) return getResources();
        return basicGetResources();
      case GiraffeDSLPackage.PROVIDERS__VM:
        if (resolve) return getVm();
        return basicGetVm();
      case GiraffeDSLPackage.PROVIDERS__HOST:
        return getHost();
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
      case GiraffeDSLPackage.PROVIDERS__NAME:
        setName((String)newValue);
        return;
      case GiraffeDSLPackage.PROVIDERS__AUTH_METHOD:
        setAuthMethod((Auth)newValue);
        return;
      case GiraffeDSLPackage.PROVIDERS__RESOURCES:
        setResources((Resource)newValue);
        return;
      case GiraffeDSLPackage.PROVIDERS__VM:
        setVm((VirtualMachine)newValue);
        return;
      case GiraffeDSLPackage.PROVIDERS__HOST:
        setHost((String)newValue);
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
      case GiraffeDSLPackage.PROVIDERS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GiraffeDSLPackage.PROVIDERS__AUTH_METHOD:
        setAuthMethod((Auth)null);
        return;
      case GiraffeDSLPackage.PROVIDERS__RESOURCES:
        setResources((Resource)null);
        return;
      case GiraffeDSLPackage.PROVIDERS__VM:
        setVm((VirtualMachine)null);
        return;
      case GiraffeDSLPackage.PROVIDERS__HOST:
        setHost(HOST_EDEFAULT);
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
      case GiraffeDSLPackage.PROVIDERS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GiraffeDSLPackage.PROVIDERS__AUTH_METHOD:
        return authMethod != null;
      case GiraffeDSLPackage.PROVIDERS__RESOURCES:
        return resources != null;
      case GiraffeDSLPackage.PROVIDERS__VM:
        return vm != null;
      case GiraffeDSLPackage.PROVIDERS__HOST:
        return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
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
    result.append(", host: ");
    result.append(host);
    result.append(')');
    return result.toString();
  }

} //ProvidersImpl
