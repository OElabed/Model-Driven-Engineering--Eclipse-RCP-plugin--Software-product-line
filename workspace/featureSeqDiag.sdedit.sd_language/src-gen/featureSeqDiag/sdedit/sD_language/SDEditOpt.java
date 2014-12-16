/**
 */
package featureSeqDiag.sdedit.sD_language;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD Edit Opt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.SDEditOpt#getCondOpt <em>Cond Opt</em>}</li>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.SDEditOpt#getOpts <em>Opts</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditOpt()
 * @model
 * @generated
 */
public interface SDEditOpt extends SDEditCombinedFragment
{
  /**
   * Returns the value of the '<em><b>Cond Opt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond Opt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond Opt</em>' containment reference.
   * @see #setCondOpt(Condition)
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditOpt_CondOpt()
   * @model containment="true"
   * @generated
   */
  Condition getCondOpt();

  /**
   * Sets the value of the '{@link featureSeqDiag.sdedit.sD_language.SDEditOpt#getCondOpt <em>Cond Opt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond Opt</em>' containment reference.
   * @see #getCondOpt()
   * @generated
   */
  void setCondOpt(Condition value);

  /**
   * Returns the value of the '<em><b>Opts</b></em>' containment reference list.
   * The list contents are of type {@link featureSeqDiag.sdedit.sD_language.SDEditCombinableDiagElt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opts</em>' containment reference list.
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditOpt_Opts()
   * @model containment="true"
   * @generated
   */
  EList<SDEditCombinableDiagElt> getOpts();

} // SDEditOpt