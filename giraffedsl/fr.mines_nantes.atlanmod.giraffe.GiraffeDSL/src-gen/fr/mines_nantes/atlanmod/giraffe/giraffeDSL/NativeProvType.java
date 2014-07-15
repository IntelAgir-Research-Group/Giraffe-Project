/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Native Prov Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getNativeProvType()
 * @model
 * @generated
 */
public enum NativeProvType implements Enumerator
{
  /**
   * The '<em><b>Amazon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AMAZON_VALUE
   * @generated
   * @ordered
   */
  AMAZON(0, "amazon", "amazon"),

  /**
   * The '<em><b>Google</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GOOGLE_VALUE
   * @generated
   * @ordered
   */
  GOOGLE(1, "google", "google"),

  /**
   * The '<em><b>G5000</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #G5000_VALUE
   * @generated
   * @ordered
   */
  G5000(2, "g5000", "g5000"),

  /**
   * The '<em><b>Virtualbox</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VIRTUALBOX_VALUE
   * @generated
   * @ordered
   */
  VIRTUALBOX(3, "virtualbox", "virtualbox");

  /**
   * The '<em><b>Amazon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Amazon</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AMAZON
   * @model name="amazon"
   * @generated
   * @ordered
   */
  public static final int AMAZON_VALUE = 0;

  /**
   * The '<em><b>Google</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Google</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GOOGLE
   * @model name="google"
   * @generated
   * @ordered
   */
  public static final int GOOGLE_VALUE = 1;

  /**
   * The '<em><b>G5000</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>G5000</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #G5000
   * @model name="g5000"
   * @generated
   * @ordered
   */
  public static final int G5000_VALUE = 2;

  /**
   * The '<em><b>Virtualbox</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Virtualbox</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VIRTUALBOX
   * @model name="virtualbox"
   * @generated
   * @ordered
   */
  public static final int VIRTUALBOX_VALUE = 3;

  /**
   * An array of all the '<em><b>Native Prov Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final NativeProvType[] VALUES_ARRAY =
    new NativeProvType[]
    {
      AMAZON,
      GOOGLE,
      G5000,
      VIRTUALBOX,
    };

  /**
   * A public read-only list of all the '<em><b>Native Prov Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<NativeProvType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Native Prov Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NativeProvType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NativeProvType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Native Prov Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NativeProvType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NativeProvType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Native Prov Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NativeProvType get(int value)
  {
    switch (value)
    {
      case AMAZON_VALUE: return AMAZON;
      case GOOGLE_VALUE: return GOOGLE;
      case G5000_VALUE: return G5000;
      case VIRTUALBOX_VALUE: return VIRTUALBOX;
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
  private NativeProvType(int value, String name, String literal)
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
  
} //NativeProvType
