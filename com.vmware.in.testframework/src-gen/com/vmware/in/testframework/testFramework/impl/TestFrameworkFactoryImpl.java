/**
 */
package com.vmware.in.testframework.testFramework.impl;

import com.vmware.in.testframework.testFramework.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestFrameworkFactoryImpl extends EFactoryImpl implements TestFrameworkFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TestFrameworkFactory init()
  {
    try
    {
      TestFrameworkFactory theTestFrameworkFactory = (TestFrameworkFactory)EPackage.Registry.INSTANCE.getEFactory(TestFrameworkPackage.eNS_URI);
      if (theTestFrameworkFactory != null)
      {
        return theTestFrameworkFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TestFrameworkFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestFrameworkFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TestFrameworkPackage.MODEL: return createModel();
      case TestFrameworkPackage.GREETING: return createGreeting();
      case TestFrameworkPackage.FIRSTACTION: return createFIRSTACTION();
      case TestFrameworkPackage.TABLEACTION: return createTABLEACTION();
      case TestFrameworkPackage.IDENTIFIER: return createIDENTIFIER();
      case TestFrameworkPackage.LABEL: return createLABEL();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FIRSTACTION createFIRSTACTION()
  {
    FIRSTACTIONImpl firstaction = new FIRSTACTIONImpl();
    return firstaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TABLEACTION createTABLEACTION()
  {
    TABLEACTIONImpl tableaction = new TABLEACTIONImpl();
    return tableaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDENTIFIER createIDENTIFIER()
  {
    IDENTIFIERImpl identifier = new IDENTIFIERImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LABEL createLABEL()
  {
    LABELImpl label = new LABELImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestFrameworkPackage getTestFrameworkPackage()
  {
    return (TestFrameworkPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TestFrameworkPackage getPackage()
  {
    return TestFrameworkPackage.eINSTANCE;
  }

} //TestFrameworkFactoryImpl
