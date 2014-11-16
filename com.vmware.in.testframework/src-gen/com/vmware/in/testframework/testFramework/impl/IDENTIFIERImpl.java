/**
 */
package com.vmware.in.testframework.testFramework.impl;

import com.vmware.in.testframework.testFramework.IDENTIFIER;
import com.vmware.in.testframework.testFramework.TestFrameworkPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDENTIFIER</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vmware.in.testframework.testFramework.impl.IDENTIFIERImpl#getIdentifiervalue <em>Identifiervalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IDENTIFIERImpl extends MinimalEObjectImpl.Container implements IDENTIFIER
{
  /**
   * The default value of the '{@link #getIdentifiervalue() <em>Identifiervalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifiervalue()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIERVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifiervalue() <em>Identifiervalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifiervalue()
   * @generated
   * @ordered
   */
  protected String identifiervalue = IDENTIFIERVALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IDENTIFIERImpl()
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
    return TestFrameworkPackage.Literals.IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifiervalue()
  {
    return identifiervalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifiervalue(String newIdentifiervalue)
  {
    String oldIdentifiervalue = identifiervalue;
    identifiervalue = newIdentifiervalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.IDENTIFIER__IDENTIFIERVALUE, oldIdentifiervalue, identifiervalue));
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
      case TestFrameworkPackage.IDENTIFIER__IDENTIFIERVALUE:
        return getIdentifiervalue();
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
      case TestFrameworkPackage.IDENTIFIER__IDENTIFIERVALUE:
        setIdentifiervalue((String)newValue);
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
      case TestFrameworkPackage.IDENTIFIER__IDENTIFIERVALUE:
        setIdentifiervalue(IDENTIFIERVALUE_EDEFAULT);
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
      case TestFrameworkPackage.IDENTIFIER__IDENTIFIERVALUE:
        return IDENTIFIERVALUE_EDEFAULT == null ? identifiervalue != null : !IDENTIFIERVALUE_EDEFAULT.equals(identifiervalue);
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
    result.append(" (identifiervalue: ");
    result.append(identifiervalue);
    result.append(')');
    return result.toString();
  }

} //IDENTIFIERImpl
