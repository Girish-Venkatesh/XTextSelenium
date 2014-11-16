/**
 */
package com.vmware.in.testframework.testFramework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TABLEACTION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vmware.in.testframework.testFramework.TABLEACTION#getIdentifierAction <em>Identifier Action</em>}</li>
 *   <li>{@link com.vmware.in.testframework.testFramework.TABLEACTION#getNextAction <em>Next Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getTABLEACTION()
 * @model
 * @generated
 */
public interface TABLEACTION extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier Action</em>' containment reference.
   * @see #setIdentifierAction(IDENTIFIER)
   * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getTABLEACTION_IdentifierAction()
   * @model containment="true"
   * @generated
   */
  IDENTIFIER getIdentifierAction();

  /**
   * Sets the value of the '{@link com.vmware.in.testframework.testFramework.TABLEACTION#getIdentifierAction <em>Identifier Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier Action</em>' containment reference.
   * @see #getIdentifierAction()
   * @generated
   */
  void setIdentifierAction(IDENTIFIER value);

  /**
   * Returns the value of the '<em><b>Next Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Action</em>' containment reference.
   * @see #setNextAction(LABEL)
   * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getTABLEACTION_NextAction()
   * @model containment="true"
   * @generated
   */
  LABEL getNextAction();

  /**
   * Sets the value of the '{@link com.vmware.in.testframework.testFramework.TABLEACTION#getNextAction <em>Next Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Action</em>' containment reference.
   * @see #getNextAction()
   * @generated
   */
  void setNextAction(LABEL value);

} // TABLEACTION
