/**
 */
package com.vmware.in.testframework.testFramework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vmware.in.testframework.testFramework.Greeting#getTestcaseValue <em>Testcase Value</em>}</li>
 *   <li>{@link com.vmware.in.testframework.testFramework.Greeting#getSummaryDetails <em>Summary Details</em>}</li>
 *   <li>{@link com.vmware.in.testframework.testFramework.Greeting#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getGreeting()
 * @model
 * @generated
 */
public interface Greeting extends EObject
{
  /**
   * Returns the value of the '<em><b>Testcase Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testcase Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testcase Value</em>' attribute.
   * @see #setTestcaseValue(int)
   * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getGreeting_TestcaseValue()
   * @model
   * @generated
   */
  int getTestcaseValue();

  /**
   * Sets the value of the '{@link com.vmware.in.testframework.testFramework.Greeting#getTestcaseValue <em>Testcase Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Testcase Value</em>' attribute.
   * @see #getTestcaseValue()
   * @generated
   */
  void setTestcaseValue(int value);

  /**
   * Returns the value of the '<em><b>Summary Details</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Summary Details</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summary Details</em>' attribute.
   * @see #setSummaryDetails(String)
   * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getGreeting_SummaryDetails()
   * @model
   * @generated
   */
  String getSummaryDetails();

  /**
   * Sets the value of the '{@link com.vmware.in.testframework.testFramework.Greeting#getSummaryDetails <em>Summary Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Summary Details</em>' attribute.
   * @see #getSummaryDetails()
   * @generated
   */
  void setSummaryDetails(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(FIRSTACTION)
   * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getGreeting_Action()
   * @model containment="true"
   * @generated
   */
  FIRSTACTION getAction();

  /**
   * Sets the value of the '{@link com.vmware.in.testframework.testFramework.Greeting#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(FIRSTACTION value);

} // Greeting
