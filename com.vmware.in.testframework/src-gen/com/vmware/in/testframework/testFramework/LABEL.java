/**
 */
package com.vmware.in.testframework.testFramework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LABEL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vmware.in.testframework.testFramework.LABEL#getLabelvalue <em>Labelvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getLABEL()
 * @model
 * @generated
 */
public interface LABEL extends EObject
{
  /**
   * Returns the value of the '<em><b>Labelvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labelvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labelvalue</em>' attribute.
   * @see #setLabelvalue(String)
   * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#getLABEL_Labelvalue()
   * @model
   * @generated
   */
  String getLabelvalue();

  /**
   * Sets the value of the '{@link com.vmware.in.testframework.testFramework.LABEL#getLabelvalue <em>Labelvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Labelvalue</em>' attribute.
   * @see #getLabelvalue()
   * @generated
   */
  void setLabelvalue(String value);

} // LABEL
