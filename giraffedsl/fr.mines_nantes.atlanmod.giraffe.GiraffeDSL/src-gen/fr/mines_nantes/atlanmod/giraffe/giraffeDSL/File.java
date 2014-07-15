/**
 */
package fr.mines_nantes.atlanmod.giraffe.giraffeDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File#getFileType <em>File Type</em>}</li>
 *   <li>{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getFile()
 * @model
 * @generated
 */
public interface File extends Dependency
{
  /**
   * Returns the value of the '<em><b>File Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.FileType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Type</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.FileType
   * @see #setFileType(FileType)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getFile_FileType()
   * @model
   * @generated
   */
  FileType getFileType();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File#getFileType <em>File Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Type</em>' attribute.
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.FileType
   * @see #getFileType()
   * @generated
   */
  void setFileType(FileType value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see fr.mines_nantes.atlanmod.giraffe.giraffeDSL.GiraffeDSLPackage#getFile_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link fr.mines_nantes.atlanmod.giraffe.giraffeDSL.File#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

} // File
