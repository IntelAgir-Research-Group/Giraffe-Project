/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Native Distribution</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getNativeDistribution()
 * @model
 * @generated
 */
public enum NativeDistribution implements Enumerator
{
  /**
   * The '<em><b>Ubuntu</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UBUNTU_VALUE
   * @generated
   * @ordered
   */
  UBUNTU(0, "ubuntu", "ubuntu"),

  /**
   * The '<em><b>Debian</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEBIAN_VALUE
   * @generated
   * @ordered
   */
  DEBIAN(1, "debian", "debian"),

  /**
   * The '<em><b>Centos</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CENTOS_VALUE
   * @generated
   * @ordered
   */
  CENTOS(2, "centos", "centos"),

  /**
   * The '<em><b>Fedora</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FEDORA_VALUE
   * @generated
   * @ordered
   */
  FEDORA(3, "fedora", "fedora");

  /**
   * The '<em><b>Ubuntu</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ubuntu</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UBUNTU
   * @model name="ubuntu"
   * @generated
   * @ordered
   */
  public static final int UBUNTU_VALUE = 0;

  /**
   * The '<em><b>Debian</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Debian</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEBIAN
   * @model name="debian"
   * @generated
   * @ordered
   */
  public static final int DEBIAN_VALUE = 1;

  /**
   * The '<em><b>Centos</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Centos</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CENTOS
   * @model name="centos"
   * @generated
   * @ordered
   */
  public static final int CENTOS_VALUE = 2;

  /**
   * The '<em><b>Fedora</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fedora</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FEDORA
   * @model name="fedora"
   * @generated
   * @ordered
   */
  public static final int FEDORA_VALUE = 3;

  /**
   * An array of all the '<em><b>Native Distribution</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final NativeDistribution[] VALUES_ARRAY =
    new NativeDistribution[]
    {
      UBUNTU,
      DEBIAN,
      CENTOS,
      FEDORA,
    };

  /**
   * A public read-only list of all the '<em><b>Native Distribution</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<NativeDistribution> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Native Distribution</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NativeDistribution get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NativeDistribution result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Native Distribution</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NativeDistribution getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NativeDistribution result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Native Distribution</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NativeDistribution get(int value)
  {
    switch (value)
    {
      case UBUNTU_VALUE: return UBUNTU;
      case DEBIAN_VALUE: return DEBIAN;
      case CENTOS_VALUE: return CENTOS;
      case FEDORA_VALUE: return FEDORA;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private NativeDistribution(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //NativeDistribution
