/**
 */
package sdcombin.sDCLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contexte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sdcombin.sDCLang.Contexte#getObjof <em>Objof</em>}</li>
 *   <li>{@link sdcombin.sDCLang.Contexte#getSequence <em>Sequence</em>}</li>
 *   <li>{@link sdcombin.sDCLang.Contexte#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link sdcombin.sDCLang.Contexte#getLoop <em>Loop</em>}</li>
 *   <li>{@link sdcombin.sDCLang.Contexte#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see sdcombin.sDCLang.SDCLangPackage#getContexte()
 * @model
 * @generated
 */
public interface Contexte extends EObject
{
  /**
   * Returns the value of the '<em><b>Objof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objof</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objof</em>' reference.
   * @see #setObjof(Feature)
   * @see sdcombin.sDCLang.SDCLangPackage#getContexte_Objof()
   * @model
   * @generated
   */
  Feature getObjof();

  /**
   * Sets the value of the '{@link sdcombin.sDCLang.Contexte#getObjof <em>Objof</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objof</em>' reference.
   * @see #getObjof()
   * @generated
   */
  void setObjof(Feature value);

  /**
   * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' containment reference.
   * @see #setSequence(Sequence)
   * @see sdcombin.sDCLang.SDCLangPackage#getContexte_Sequence()
   * @model containment="true"
   * @generated
   */
  Sequence getSequence();

  /**
   * Sets the value of the '{@link sdcombin.sDCLang.Contexte#getSequence <em>Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' containment reference.
   * @see #getSequence()
   * @generated
   */
  void setSequence(Sequence value);

  /**
   * Returns the value of the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternative</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternative</em>' containment reference.
   * @see #setAlternative(Alternative)
   * @see sdcombin.sDCLang.SDCLangPackage#getContexte_Alternative()
   * @model containment="true"
   * @generated
   */
  Alternative getAlternative();

  /**
   * Sets the value of the '{@link sdcombin.sDCLang.Contexte#getAlternative <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alternative</em>' containment reference.
   * @see #getAlternative()
   * @generated
   */
  void setAlternative(Alternative value);

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference.
   * @see #setLoop(Loop)
   * @see sdcombin.sDCLang.SDCLangPackage#getContexte_Loop()
   * @model containment="true"
   * @generated
   */
  Loop getLoop();

  /**
   * Sets the value of the '{@link sdcombin.sDCLang.Contexte#getLoop <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop</em>' containment reference.
   * @see #getLoop()
   * @generated
   */
  void setLoop(Loop value);

  /**
   * Returns the value of the '<em><b>Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' containment reference.
   * @see #setOption(Option)
   * @see sdcombin.sDCLang.SDCLangPackage#getContexte_Option()
   * @model containment="true"
   * @generated
   */
  Option getOption();

  /**
   * Sets the value of the '{@link sdcombin.sDCLang.Contexte#getOption <em>Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' containment reference.
   * @see #getOption()
   * @generated
   */
  void setOption(Option value);

} // Contexte
