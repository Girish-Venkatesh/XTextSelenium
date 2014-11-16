/**
 */
package com.vmware.in.testframework.testFramework.impl;

import com.vmware.in.testframework.testFramework.LABEL;
import com.vmware.in.testframework.testFramework.TestFrameworkPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LABEL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vmware.in.testframework.testFramework.impl.LABELImpl#getLabelvalue <em>Labelvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LABELImpl extends MinimalEObjectImpl.Container implements LABEL
{
  /**
   * The default value of the '{@link #getLabelvalue() <em>Labelvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelvalue()
   * @generated
   * @ordered
   */
  protected static final String LABELVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabelvalue() <em>Labelvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelvalue()
   * @generated
   * @ordered
   */
  protected String labelvalue = LABELVALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LABELImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TestFrameworkPackage.Literals.LABEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabelvalue()
  {
    return labelvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelvalue(String newLabelvalue)
  {
    String oldLabelvalue = labelvalue;
    labelvalue = newLabelvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.LABEL__LABELVALUE, oldLabelvalue, labelvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TestFrameworkPackage.LABEL__LABELVALUE:
        return getLabelvalue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TestFrameworkPackage.LABEL__LABELVALUE:
        setLabelvalue((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TestFrameworkPackage.LABEL__LABELVALUE:
        setLabelvalue(LABELVALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TestFrameworkPackage.LABEL__LABELVALUE:
        return LABELVALUE_EDEFAULT == null ? labelvalue != null : !LABELVALUE_EDEFAULT.equals(labelvalue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (labelvalue: ");
    result.append(labelvalue);
    result.append(')');
    return result.toString();
  }

} //LABELImpl
