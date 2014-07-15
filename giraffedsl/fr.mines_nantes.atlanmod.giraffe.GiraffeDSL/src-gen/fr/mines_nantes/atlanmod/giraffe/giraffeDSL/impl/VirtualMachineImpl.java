/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Auth;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Dependency;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeDistribution;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.NativeSO;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.VirtualMachine;

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
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.VirtualMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.VirtualMachineImpl#getSo <em>So</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.VirtualMachineImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.VirtualMachineImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.VirtualMachineImpl#getAuth <em>Auth</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.VirtualMachineImpl#getDep <em>Dep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualMachineImpl extends MinimalEObjectImpl.Container implements VirtualMachine
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
   * The default value of the '{@link #getSo() <em>So</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSo()
   * @generated
   * @ordered
   */
  protected static final NativeSO SO_EDEFAULT = NativeSO.LINUX;

  /**
   * The cached value of the '{@link #getSo() <em>So</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSo()
   * @generated
   * @ordered
   */
  protected NativeSO so = SO_EDEFAULT;

  /**
   * The default value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistribution()
   * @generated
   * @ordered
   */
  protected static final NativeDistribution DISTRIBUTION_EDEFAULT = NativeDistribution.UBUNTU;

  /**
   * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistribution()
   * @generated
   * @ordered
   */
  protected NativeDistribution distribution = DISTRIBUTION_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final float VERSION_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected float version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getAuth() <em>Auth</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuth()
   * @generated
   * @ordered
   */
  protected Auth auth;

  /**
   * The cached value of the '{@link #getDep() <em>Dep</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDep()
   * @generated
   * @ordered
   */
  protected EList<Dependency> dep;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VirtualMachineImpl()
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
    return GiraffeDSLPackage.Literals.VIRTUAL_MACHINE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.VIRTUAL_MACHINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeSO getSo()
  {
    return so;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSo(NativeSO newSo)
  {
    NativeSO oldSo = so;
    so = newSo == null ? SO_EDEFAULT : newSo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.VIRTUAL_MACHINE__SO, oldSo, so));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeDistribution getDistribution()
  {
    return distribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistribution(NativeDistribution newDistribution)
  {
    NativeDistribution oldDistribution = distribution;
    distribution = newDistribution == null ? DISTRIBUTION_EDEFAULT : newDistribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.VIRTUAL_MACHINE__DISTRIBUTION, oldDistribution, distribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(float newVersion)
  {
    float oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.VIRTUAL_MACHINE__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Auth getAuth()
  {
    if (auth != null && auth.eIsProxy())
    {
      InternalEObject oldAuth = (InternalEObject)auth;
      auth = (Auth)eResolveProxy(oldAuth);
      if (auth != oldAuth)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GiraffeDSLPackage.VIRTUAL_MACHINE__AUTH, oldAuth, auth));
      }
    }
    return auth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Auth basicGetAuth()
  {
    return auth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuth(Auth newAuth)
  {
    Auth oldAuth = auth;
    auth = newAuth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.VIRTUAL_MACHINE__AUTH, oldAuth, auth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dependency> getDep()
  {
    if (dep == null)
    {
      dep = new EObjectResolvingEList<Dependency>(Dependency.class, this, GiraffeDSLPackage.VIRTUAL_MACHINE__DEP);
    }
    return dep;
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
      case GiraffeDSLPackage.VIRTUAL_MACHINE__NAME:
        return getName();
      case GiraffeDSLPackage.VIRTUAL_MACHINE__SO:
        return getSo();
      case GiraffeDSLPackage.VIRTUAL_MACHINE__DISTRIBUTION:
        return getDistribution();
      case GiraffeDSLPackage.VIRTUAL_MACHINE__VERSION:
        return getVersion();
      case GiraffeDSLPackage.VIRTUAL_MACHINE__AUTH:
        if (resolve) return getAuth();
        return basicGetAuth();
      case GiraffeDSLPackage.VIRTUAL_MACHINE__DEP:
        return getDep();
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
      case GiraffeDSLPackage.VIRTUAL_MACHINE__NAME:
        setName((String)newValue);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__SO:
        setSo((NativeSO)newValue);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__DISTRIBUTION:
        setDistribution((NativeDistribution)newValue);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__VERSION:
        setVersion((Float)newValue);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__AUTH:
        setAuth((Auth)newValue);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__DEP:
        getDep().clear();
        getDep().addAll((Collection<? extends Dependency>)newValue);
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
      case GiraffeDSLPackage.VIRTUAL_MACHINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__SO:
        setSo(SO_EDEFAULT);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__DISTRIBUTION:
        setDistribution(DISTRIBUTION_EDEFAULT);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__AUTH:
        setAuth((Auth)null);
        return;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__DEP:
        getDep().clear();
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
      case GiraffeDSLPackage.VIRTUAL_MACHINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GiraffeDSLPackage.VIRTUAL_MACHINE__SO:
        return so != SO_EDEFAULT;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__DISTRIBUTION:
        return distribution != DISTRIBUTION_EDEFAULT;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__VERSION:
        return version != VERSION_EDEFAULT;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__AUTH:
        return auth != null;
      case GiraffeDSLPackage.VIRTUAL_MACHINE__DEP:
        return dep != null && !dep.isEmpty();
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
    result.append(", so: ");
    result.append(so);
    result.append(", distribution: ");
    result.append(distribution);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //VirtualMachineImpl
