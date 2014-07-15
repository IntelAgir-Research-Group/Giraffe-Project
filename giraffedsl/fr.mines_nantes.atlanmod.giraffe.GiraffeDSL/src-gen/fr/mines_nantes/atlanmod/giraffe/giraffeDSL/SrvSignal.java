/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Srv Signal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getSrvSignal()
 * @model
 * @generated
 */
public enum SrvSignal implements Enumerator
{
  /**
   * The '<em><b>Start</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #START_VALUE
   * @generated
   * @ordered
   */
  START(0, "start", "start"),

  /**
   * The '<em><b>Restart</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RESTART_VALUE
   * @generated
   * @ordered
   */
  RESTART(1, "restart", "restart"),

  /**
   * The '<em><b>Stop</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STOP_VALUE
   * @generated
   * @ordered
   */
  STOP(2, "stop", "stop");

  /**
   * The '<em><b>Start</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Start</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #START
   * @model name="start"
   * @generated
   * @ordered
   */
  public static final int START_VALUE = 0;

  /**
   * The '<em><b>Restart</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Restart</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RESTART
   * @model name="restart"
   * @generated
   * @ordered
   */
  public static final int RESTART_VALUE = 1;

  /**
   * The '<em><b>Stop</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Stop</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STOP
   * @model name="stop"
   * @generated
   * @ordered
   */
  public static final int STOP_VALUE = 2;

  /**
   * An array of all the '<em><b>Srv Signal</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SrvSignal[] VALUES_ARRAY =
    new SrvSignal[]
    {
      START,
      RESTART,
      STOP,
    };

  /**
   * A public read-only list of all the '<em><b>Srv Signal</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SrvSignal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Srv Signal</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SrvSignal get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SrvSignal result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Srv Signal</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SrvSignal getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SrvSignal result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Srv Signal</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SrvSignal get(int value)
  {
    switch (value)
    {
      case START_VALUE: return START;
      case RESTART_VALUE: return RESTART;
      case STOP_VALUE: return STOP;
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
  private SrvSignal(int value, String name, String literal)
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
  
} //SrvSignal
