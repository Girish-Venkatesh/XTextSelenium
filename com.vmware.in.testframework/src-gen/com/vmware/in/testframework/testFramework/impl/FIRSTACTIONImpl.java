/**
 */
package com.vmware.in.testframework.testFramework.impl;

import com.vmware.in.testframework.testFramework.FIRSTACTION;
import com.vmware.in.testframework.testFramework.TABLEACTION;
import com.vmware.in.testframework.testFramework.TestFrameworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FIRSTACTION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vmware.in.testframework.testFramework.impl.FIRSTACTIONImpl#getChecktableAction <em>Checktable Action</em>}</li>
 *   <li>{@link com.vmware.in.testframework.testFramework.impl.FIRSTACTIONImpl#getNextAction <em>Next Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FIRSTACTIONImpl extends MinimalEObjectImpl.Container implements FIRSTACTION
{
  /**
   * The default value of the '{@link #getChecktableAction() <em>Checktable Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChecktableAction()
   * @generated
   * @ordered
   */
  protected static final String CHECKTABLE_ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChecktableAction() <em>Checktable Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChecktableAction()
   * @generated
   * @ordered
   */
  protected String checktableAction = CHECKTABLE_ACTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getNextAction() <em>Next Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextAction()
   * @generated
   * @ordered
   */
  protected TABLEACTION nextAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FIRSTACTIONImpl()
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
    return TestFrameworkPackage.Literals.FIRSTACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChecktableAction()
  {
    return checktableAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChecktableAction(String newChecktableAction)
  {
    String oldChecktableAction = checktableAction;
    checktableAction = newChecktableAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.FIRSTACTION__CHECKTABLE_ACTION, oldChecktableAction, checktableAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TABLEACTION getNextAction()
  {
    return nextAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNextAction(TABLEACTION newNextAction, NotificationChain msgs)
  {
    TABLEACTION oldNextAction = nextAction;
    nextAction = newNextAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.FIRSTACTION__NEXT_ACTION, oldNextAction, newNextAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextAction(TABLEACTION newNextAction)
  {
    if (newNextAction != nextAction)
    {
      NotificationChain msgs = null;
      if (nextAction != null)
        msgs = ((InternalEObject)nextAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestFrameworkPackage.FIRSTACTION__NEXT_ACTION, null, msgs);
      if (newNextAction != null)
        msgs = ((InternalEObject)newNextAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestFrameworkPackage.FIRSTACTION__NEXT_ACTION, null, msgs);
      msgs = basicSetNextAction(newNextAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.FIRSTACTION__NEXT_ACTION, newNextAction, newNextAction));
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
      case TestFrameworkPackage.FIRSTACTION__NEXT_ACTION:
        return basicSetNextAction(null, msgs);
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
      case TestFrameworkPackage.FIRSTACTION__CHECKTABLE_ACTION:
        return getChecktableAction();
      case TestFrameworkPackage.FIRSTACTION__NEXT_ACTION:
        return getNextAction();
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
      case TestFrameworkPackage.FIRSTACTION__CHECKTABLE_ACTION:
        setChecktableAction((String)newValue);
        return;
      case TestFrameworkPackage.FIRSTACTION__NEXT_ACTION:
        setNextAction((TABLEACTION)newValue);
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
      case TestFrameworkPackage.FIRSTACTION__CHECKTABLE_ACTION:
        setChecktableAction(CHECKTABLE_ACTION_EDEFAULT);
        return;
      case TestFrameworkPackage.FIRSTACTION__NEXT_ACTION:
        setNextAction((TABLEACTION)null);
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
      case TestFrameworkPackage.FIRSTACTION__CHECKTABLE_ACTION:
        return CHECKTABLE_ACTION_EDEFAULT == null ? checktableAction != null : !CHECKTABLE_ACTION_EDEFAULT.equals(checktableAction);
      case TestFrameworkPackage.FIRSTACTION__NEXT_ACTION:
        return nextAction != null;
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
    result.append(" (checktableAction: ");
    result.append(checktableAction);
    result.append(')');
    return result.toString();
  }

} //FIRSTACTIONImpl
