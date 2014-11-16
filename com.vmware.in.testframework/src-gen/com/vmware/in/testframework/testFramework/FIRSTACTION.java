/**
 */
package com.vmware.in.testframework.testFramework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FIRSTACTION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vmware.in.testframework.testFramework.FIRSTACTION#getChecktableAction <em>Checktable Action</em>}</li>
 *   <li>{@link com.vmware.in.testframework.testFramework.FIRSTACTION#getNextAction <em>Next Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getFIRSTACTION()
 * @model
 * @generated
 */
public interface FIRSTACTION extends EObject
{
  /**
   * Returns the value of the '<em><b>Checktable Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checktable Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Checktable Action</em>' attribute.
   * @see #setChecktableAction(String)
   * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getFIRSTACTION_ChecktableAction()
   * @model
   * @generated
   */
  String getChecktableAction();

  /**
   * Sets the value of the '{@link com.vmware.in.testframework.testFramework.FIRSTACTION#getChecktableAction <em>Checktable Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Checktable Action</em>' attribute.
   * @see #getChecktableAction()
   * @generated
   */
  void setChecktableAction(String value);

  /**
   * Returns the value of the '<em><b>Next Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Action</em>' containment reference.
   * @see #setNextAction(TABLEACTION)
   * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getFIRSTACTION_NextAction()
   * @model containment="true"
   * @generated
   */
  TABLEACTION getNextAction();

  /**
   * Sets the value of the '{@link com.vmware.in.testframework.testFramework.FIRSTACTION#getNextAction <em>Next Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Action</em>' containment reference.
   * @see #getNextAction()
   * @generated
   */
  void setNextAction(TABLEACTION value);

} // FIRSTACTION
