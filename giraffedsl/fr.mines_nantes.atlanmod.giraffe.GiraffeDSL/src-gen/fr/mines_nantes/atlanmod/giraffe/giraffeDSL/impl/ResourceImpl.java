/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl;

import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage;
import fr.mines_nantes.atlanmod.giraffe.giraffeDSL.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ResourceImpl#getCpu <em>Cpu</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ResourceImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ResourceImpl#getDisk <em>Disk</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.impl.ResourceImpl#getRelax <em>Relax</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource
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
   * The default value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpu()
   * @generated
   * @ordered
   */
  protected static final String CPU_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpu()
   * @generated
   * @ordered
   */
  protected String cpu = CPU_EDEFAULT;

  /**
   * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemory()
   * @generated
   * @ordered
   */
  protected static final int MEMORY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemory()
   * @generated
   * @ordered
   */
  protected int memory = MEMORY_EDEFAULT;

  /**
   * The default value of the '{@link #getDisk() <em>Disk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisk()
   * @generated
   * @ordered
   */
  protected static final int DISK_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDisk() <em>Disk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisk()
   * @generated
   * @ordered
   */
  protected int disk = DISK_EDEFAULT;

  /**
   * The default value of the '{@link #getRelax() <em>Relax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelax()
   * @generated
   * @ordered
   */
  protected static final int RELAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRelax() <em>Relax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelax()
   * @generated
   * @ordered
   */
  protected int relax = RELAX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceImpl()
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
    return GiraffeDSLPackage.Literals.RESOURCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.RESOURCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCpu()
  {
    return cpu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCpu(String newCpu)
  {
    String oldCpu = cpu;
    cpu = newCpu;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.RESOURCE__CPU, oldCpu, cpu));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMemory()
  {
    return memory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemory(int newMemory)
  {
    int oldMemory = memory;
    memory = newMemory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.RESOURCE__MEMORY, oldMemory, memory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDisk()
  {
    return disk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisk(int newDisk)
  {
    int oldDisk = disk;
    disk = newDisk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.RESOURCE__DISK, oldDisk, disk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRelax()
  {
    return relax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelax(int newRelax)
  {
    int oldRelax = relax;
    relax = newRelax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GiraffeDSLPackage.RESOURCE__RELAX, oldRelax, relax));
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
      case GiraffeDSLPackage.RESOURCE__NAME:
        return getName();
      case GiraffeDSLPackage.RESOURCE__CPU:
        return getCpu();
      case GiraffeDSLPackage.RESOURCE__MEMORY:
        return getMemory();
      case GiraffeDSLPackage.RESOURCE__DISK:
        return getDisk();
      case GiraffeDSLPackage.RESOURCE__RELAX:
        return getRelax();
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
      case GiraffeDSLPackage.RESOURCE__NAME:
        setName((String)newValue);
        return;
      case GiraffeDSLPackage.RESOURCE__CPU:
        setCpu((String)newValue);
        return;
      case GiraffeDSLPackage.RESOURCE__MEMORY:
        setMemory((Integer)newValue);
        return;
      case GiraffeDSLPackage.RESOURCE__DISK:
        setDisk((Integer)newValue);
        return;
      case GiraffeDSLPackage.RESOURCE__RELAX:
        setRelax((Integer)newValue);
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
      case GiraffeDSLPackage.RESOURCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GiraffeDSLPackage.RESOURCE__CPU:
        setCpu(CPU_EDEFAULT);
        return;
      case GiraffeDSLPackage.RESOURCE__MEMORY:
        setMemory(MEMORY_EDEFAULT);
        return;
      case GiraffeDSLPackage.RESOURCE__DISK:
        setDisk(DISK_EDEFAULT);
        return;
      case GiraffeDSLPackage.RESOURCE__RELAX:
        setRelax(RELAX_EDEFAULT);
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
      case GiraffeDSLPackage.RESOURCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GiraffeDSLPackage.RESOURCE__CPU:
        return CPU_EDEFAULT == null ? cpu != null : !CPU_EDEFAULT.equals(cpu);
      case GiraffeDSLPackage.RESOURCE__MEMORY:
        return memory != MEMORY_EDEFAULT;
      case GiraffeDSLPackage.RESOURCE__DISK:
        return disk != DISK_EDEFAULT;
      case GiraffeDSLPackage.RESOURCE__RELAX:
        return relax != RELAX_EDEFAULT;
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
    result.append(", cpu: ");
    result.append(cpu);
    result.append(", memory: ");
    result.append(memory);
    result.append(", disk: ");
    result.append(disk);
    result.append(", relax: ");
    result.append(relax);
    result.append(')');
    return result.toString();
  }

} //ResourceImpl
