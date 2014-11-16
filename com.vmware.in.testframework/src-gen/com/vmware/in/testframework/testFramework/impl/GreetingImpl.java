/**
 */
package com.vmware.in.testframework.testFramework.impl;

import com.vmware.in.testframework.testFramework.FIRSTACTION;
import com.vmware.in.testframework.testFramework.Greeting;
import com.vmware.in.testframework.testFramework.TestFrameworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vmware.in.testframework.testFramework.impl.GreetingImpl#getTestcaseValue <em>Testcase Value</em>}</li>
 *   <li>{@link com.vmware.in.testframework.testFramework.impl.GreetingImpl#getSummaryDetails <em>Summary Details</em>}</li>
 *   <li>{@link com.vmware.in.testframework.testFramework.impl.GreetingImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GreetingImpl extends MinimalEObjectImpl.Container implements Greeting
{
  /**
   * The default value of the '{@link #getTestcaseValue() <em>Testcase Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestcaseValue()
   * @generated
   * @ordered
   */
  protected static final int TESTCASE_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTestcaseValue() <em>Testcase Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestcaseValue()
   * @generated
   * @ordered
   */
  protected int testcaseValue = TESTCASE_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getSummaryDetails() <em>Summary Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummaryDetails()
   * @generated
   * @ordered
   */
  protected static final String SUMMARY_DETAILS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummaryDetails() <em>Summary Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummaryDetails()
   * @generated
   * @ordered
   */
  protected String summaryDetails = SUMMARY_DETAILS_EDEFAULT;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected FIRSTACTION action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreetingImpl()
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
    return TestFrameworkPackage.Literals.GREETING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTestcaseValue()
  {
    return testcaseValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestcaseValue(int newTestcaseValue)
  {
    int oldTestcaseValue = testcaseValue;
    testcaseValue = newTestcaseValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.GREETING__TESTCASE_VALUE, oldTestcaseValue, testcaseValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSummaryDetails()
  {
    return summaryDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummaryDetails(String newSummaryDetails)
  {
    String oldSummaryDetails = summaryDetails;
    summaryDetails = newSummaryDetails;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.GREETING__SUMMARY_DETAILS, oldSummaryDetails, summaryDetails));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FIRSTACTION getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(FIRSTACTION newAction, NotificationChain msgs)
  {
    FIRSTACTION oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.GREETING__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(FIRSTACTION newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestFrameworkPackage.GREETING__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestFrameworkPackage.GREETING__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.GREETING__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TestFrameworkPackage.GREETING__ACTION:
        return basicSetAction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case TestFrameworkPackage.GREETING__TESTCASE_VALUE:
        return getTestcaseValue();
      case TestFrameworkPackage.GREETING__SUMMARY_DETAILS:
        return getSummaryDetails();
      case TestFrameworkPackage.GREETING__ACTION:
        return getAction();
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
      case TestFrameworkPackage.GREETING__TESTCASE_VALUE:
        setTestcaseValue((Integer)newValue);
        return;
      case TestFrameworkPackage.GREETING__SUMMARY_DETAILS:
        setSummaryDetails((String)newValue);
        return;
      case TestFrameworkPackage.GREETING__ACTION:
        setAction((FIRSTACTION)newValue);
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
      case TestFrameworkPackage.GREETING__TESTCASE_VALUE:
        setTestcaseValue(TESTCASE_VALUE_EDEFAULT);
        return;
      case TestFrameworkPackage.GREETING__SUMMARY_DETAILS:
        setSummaryDetails(SUMMARY_DETAILS_EDEFAULT);
        return;
      case TestFrameworkPackage.GREETING__ACTION:
        setAction((FIRSTACTION)null);
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
      case TestFrameworkPackage.GREETING__TESTCASE_VALUE:
        return testcaseValue != TESTCASE_VALUE_EDEFAULT;
      case TestFrameworkPackage.GREETING__SUMMARY_DETAILS:
        return SUMMARY_DETAILS_EDEFAULT == null ? summaryDetails != null : !SUMMARY_DETAILS_EDEFAULT.equals(summaryDetails);
      case TestFrameworkPackage.GREETING__ACTION:
        return action != null;
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
    result.append(" (testcaseValue: ");
    result.append(testcaseValue);
    result.append(", summaryDetails: ");
    result.append(summaryDetails);
    result.append(')');
    return result.toString();
  }

} //GreetingImpl
