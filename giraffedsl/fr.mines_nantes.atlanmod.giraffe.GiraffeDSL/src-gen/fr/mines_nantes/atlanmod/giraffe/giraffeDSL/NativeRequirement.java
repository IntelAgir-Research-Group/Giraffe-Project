/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Native Requirement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getNativeRequirement()
 * @model
 * @generated
 */
public enum NativeRequirement implements Enumerator
{
  /**
   * The '<em><b>Ssh</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SSH_VALUE
   * @generated
   * @ordered
   */
  SSH(0, "ssh", "ssh"),

  /**
   * The '<em><b>Tomcat</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOMCAT_VALUE
   * @generated
   * @ordered
   */
  TOMCAT(1, "tomcat", "tomcat"),

  /**
   * The '<em><b>Apache</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APACHE_VALUE
   * @generated
   * @ordered
   */
  APACHE(2, "apache", "httpd");

  /**
   * The '<em><b>Ssh</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ssh</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SSH
   * @model name="ssh"
   * @generated
   * @ordered
   */
  public static final int SSH_VALUE = 0;

  /**
   * The '<em><b>Tomcat</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tomcat</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOMCAT
   * @model name="tomcat"
   * @generated
   * @ordered
   */
  public static final int TOMCAT_VALUE = 1;

  /**
   * The '<em><b>Apache</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Apache</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APACHE
   * @model name="apache" literal="httpd"
   * @generated
   * @ordered
   */
  public static final int APACHE_VALUE = 2;

  /**
   * An array of all the '<em><b>Native Requirement</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final NativeRequirement[] VALUES_ARRAY =
    new NativeRequirement[]
    {
      SSH,
      TOMCAT,
      APACHE,
    };

  /**
   * A public read-only list of all the '<em><b>Native Requirement</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<NativeRequirement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Native Requirement</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NativeRequirement get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NativeRequirement result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Native Requirement</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NativeRequirement getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NativeRequirement result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Native Requirement</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NativeRequirement get(int value)
  {
    switch (value)
    {
      case SSH_VALUE: return SSH;
      case TOMCAT_VALUE: return TOMCAT;
      case APACHE_VALUE: return APACHE;
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
  private NativeRequirement(int value, String name, String literal)
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
  
} //NativeRequirement
