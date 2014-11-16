/**
 */
package com.vmware.in.testframework.testFramework.impl;

import com.vmware.in.testframework.testFramework.IDENTIFIER;
import com.vmware.in.testframework.testFramework.LABEL;
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
 * An implementation of the model object '<em><b>TABLEACTION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vmware.in.testframework.testFramework.impl.TABLEACTIONImpl#getIdentifierAction <em>Identifier Action</em>}</li>
 *   <li>{@link com.vmware.in.testframework.testFramework.impl.TABLEACTIONImpl#getNextAction <em>Next Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TABLEACTIONImpl extends MinimalEObjectImpl.Container implements TABLEACTION
{
  /**
   * The cached value of the '{@link #getIdentifierAction() <em>Identifier Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifierAction()
   * @generated
   * @ordered
   */
  protected IDENTIFIER identifierAction;

  /**
   * The cached value of the '{@link #getNextAction() <em>Next Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextAction()
   * @generated
   * @ordered
   */
  protected LABEL nextAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TABLEACTIONImpl()
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
    return TestFrameworkPackage.Literals.TABLEACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDENTIFIER getIdentifierAction()
  {
    return identifierAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifierAction(IDENTIFIER newIdentifierAction, NotificationChain msgs)
  {
    IDENTIFIER oldIdentifierAction = identifierAction;
    identifierAction = newIdentifierAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.TABLEACTION__IDENTIFIER_ACTION, oldIdentifierAction, newIdentifierAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifierAction(IDENTIFIER newIdentifierAction)
  {
    if (newIdentifierAction != identifierAction)
    {
      NotificationChain msgs = null;
      if (identifierAction != null)
        msgs = ((InternalEObject)identifierAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestFrameworkPackage.TABLEACTION__IDENTIFIER_ACTION, null, msgs);
      if (newIdentifierAction != null)
        msgs = ((InternalEObject)newIdentifierAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestFrameworkPackage.TABLEACTION__IDENTIFIER_ACTION, null, msgs);
      msgs = basicSetIdentifierAction(newIdentifierAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.TABLEACTION__IDENTIFIER_ACTION, newIdentifierAction, newIdentifierAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LABEL getNextAction()
  {
    return nextAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNextAction(LABEL newNextAction, NotificationChain msgs)
  {
    LABEL oldNextAction = nextAction;
    nextAction = newNextAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.TABLEACTION__NEXT_ACTION, oldNextAction, newNextAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextAction(LABEL newNextAction)
  {
    if (newNextAction != nextAction)
    {
      NotificationChain msgs = null;
      if (nextAction != null)
        msgs = ((InternalEObject)nextAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestFrameworkPackage.TABLEACTION__NEXT_ACTION, null, msgs);
      if (newNextAction != null)
        msgs = ((InternalEObject)newNextAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestFrameworkPackage.TABLEACTION__NEXT_ACTION, null, msgs);
      msgs = basicSetNextAction(newNextAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestFrameworkPackage.TABLEACTION__NEXT_ACTION, newNextAction, newNextAction));
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
      case TestFrameworkPackage.TABLEACTION__IDENTIFIER_ACTION:
        return basicSetIdentifierAction(null, msgs);
      case TestFrameworkPackage.TABLEACTION__NEXT_ACTION:
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
      case TestFrameworkPackage.TABLEACTION__IDENTIFIER_ACTION:
        return getIdentifierAction();
      case TestFrameworkPackage.TABLEACTION__NEXT_ACTION:
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
      case TestFrameworkPackage.TABLEACTION__IDENTIFIER_ACTION:
        setIdentifierAction((IDENTIFIER)newValue);
        return;
      case TestFrameworkPackage.TABLEACTION__NEXT_ACTION:
        setNextAction((LABEL)newValue);
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
      case TestFrameworkPackage.TABLEACTION__IDENTIFIER_ACTION:
        setIdentifierAction((IDENTIFIER)null);
        return;
      case TestFrameworkPackage.TABLEACTION__NEXT_ACTION:
        setNextAction((LABEL)null);
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
      case TestFrameworkPackage.TABLEACTION__IDENTIFIER_ACTION:
        return identifierAction != null;
      case TestFrameworkPackage.TABLEACTION__NEXT_ACTION:
        return nextAction != null;
    }
    return super.eIsSet(featureID);
  }

} //TABLEACTIONImpl
