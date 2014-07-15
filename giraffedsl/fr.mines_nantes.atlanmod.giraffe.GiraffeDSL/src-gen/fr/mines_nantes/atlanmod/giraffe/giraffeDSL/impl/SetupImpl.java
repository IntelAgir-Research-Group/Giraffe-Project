/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Providers;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Setup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.SetupImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.SetupImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.SetupImpl#getNumberMachines <em>Number Machines</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.SetupImpl#isAutoscale <em>Autoscale</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.SetupImpl#isPredictive <em>Predictive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetupImpl extends MinimalEObjectImpl.Container implements Setup
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
   * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvider()
   * @generated
   * @ordered
   */
  protected Providers provider;

  /**
   * The default value of the '{@link #getNumberMachines() <em>Number Machines</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberMachines()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_MACHINES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumberMachines() <em>Number Machines</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberMachines()
   * @generated
   * @ordered
   */
  protected int numberMachines = NUMBER_MACHINES_EDEFAULT;

  /**
   * The default value of the '{@link #isAutoscale() <em>Autoscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutoscale()
   * @generated
   * @ordered
   */
  protected static final boolean AUTOSCALE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAutoscale() <em>Autoscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutoscale()
   * @generated
   * @ordered
   */
  protected boolean autoscale = AUTOSCALE_EDEFAULT;

  /**
   * The default value of the '{@link #isPredictive() <em>Predictive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPredictive()
   * @generated
   * @ordered
   */
  protected static final boolean PREDICTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPredictive() <em>Predictive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPredictive()
   * @generated
   * @ordered
   */
  protected boolean predictive = PREDICTIVE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetupImpl()
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
    return GiraffeDSLPackage.Literals.SETUP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.SETUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Providers getProvider()
  {
    if (provider != null && provider.eIsProxy())
    {
      InternalEObject oldProvider = (InternalEObject)provider;
      provider = (Providers)eResolveProxy(oldProvider);
      if (provider != oldProvider)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GiraffeDSLPackage.SETUP__PROVIDER, oldProvider, provider));
      }
    }
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Providers basicGetProvider()
  {
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvider(Providers newProvider)
  {
    Providers oldProvider = provider;
    provider = newProvider;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.SETUP__PROVIDER, oldProvider, provider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumberMachines()
  {
    return numberMachines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberMachines(int newNumberMachines)
  {
    int oldNumberMachines = numberMachines;
    numberMachines = newNumberMachines;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.SETUP__NUMBER_MACHINES, oldNumberMachines, numberMachines));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAutoscale()
  {
    return autoscale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutoscale(boolean newAutoscale)
  {
    boolean oldAutoscale = autoscale;
    autoscale = newAutoscale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.SETUP__AUTOSCALE, oldAutoscale, autoscale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPredictive()
  {
    return predictive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredictive(boolean newPredictive)
  {
    boolean oldPredictive = predictive;
    predictive = newPredictive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.SETUP__PREDICTIVE, oldPredictive, predictive));
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
      case GiraffeDSLPackage.SETUP__NAME:
        return getName();
      case GiraffeDSLPackage.SETUP__PROVIDER:
        if (resolve) return getProvider();
        return basicGetProvider();
      case GiraffeDSLPackage.SETUP__NUMBER_MACHINES:
        return getNumberMachines();
      case GiraffeDSLPackage.SETUP__AUTOSCALE:
        return isAutoscale();
      case GiraffeDSLPackage.SETUP__PREDICTIVE:
        return isPredictive();
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
      case GiraffeDSLPackage.SETUP__NAME:
        setName((String)newValue);
        return;
      case GiraffeDSLPackage.SETUP__PROVIDER:
        setProvider((Providers)newValue);
        return;
      case GiraffeDSLPackage.SETUP__NUMBER_MACHINES:
        setNumberMachines((Integer)newValue);
        return;
      case GiraffeDSLPackage.SETUP__AUTOSCALE:
        setAutoscale((Boolean)newValue);
        return;
      case GiraffeDSLPackage.SETUP__PREDICTIVE:
        setPredictive((Boolean)newValue);
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
      case GiraffeDSLPackage.SETUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GiraffeDSLPackage.SETUP__PROVIDER:
        setProvider((Providers)null);
        return;
      case GiraffeDSLPackage.SETUP__NUMBER_MACHINES:
        setNumberMachines(NUMBER_MACHINES_EDEFAULT);
        return;
      case GiraffeDSLPackage.SETUP__AUTOSCALE:
        setAutoscale(AUTOSCALE_EDEFAULT);
        return;
      case GiraffeDSLPackage.SETUP__PREDICTIVE:
        setPredictive(PREDICTIVE_EDEFAULT);
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
      case GiraffeDSLPackage.SETUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GiraffeDSLPackage.SETUP__PROVIDER:
        return provider != null;
      case GiraffeDSLPackage.SETUP__NUMBER_MACHINES:
        return numberMachines != NUMBER_MACHINES_EDEFAULT;
      case GiraffeDSLPackage.SETUP__AUTOSCALE:
        return autoscale != AUTOSCALE_EDEFAULT;
      case GiraffeDSLPackage.SETUP__PREDICTIVE:
        return predictive != PREDICTIVE_EDEFAULT;
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
    result.append(", numberMachines: ");
    result.append(numberMachines);
    result.append(", autoscale: ");
    result.append(autoscale);
    result.append(", predictive: ");
    result.append(predictive);
    result.append(')');
    return result.toString();
  }

} //SetupImpl
