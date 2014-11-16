/**
 */
package com.vmware.in.testframework.testFramework;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage
 * @generated
 */
public interface TestFrameworkFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TestFrameworkFactory eINSTANCE = com.vmware.in.testframework.testFramework.impl.TestFrameworkFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Greeting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greeting</em>'.
   * @generated
   */
  Greeting createGreeting();

  /**
   * Returns a new object of class '<em>FIRSTACTION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FIRSTACTION</em>'.
   * @generated
   */
  FIRSTACTION createFIRSTACTION();

  /**
   * Returns a new object of class '<em>TABLEACTION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TABLEACTION</em>'.
   * @generated
   */
  TABLEACTION createTABLEACTION();

  /**
   * Returns a new object of class '<em>IDENTIFIER</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IDENTIFIER</em>'.
   * @generated
   */
  IDENTIFIER createIDENTIFIER();

  /**
   * Returns a new object of class '<em>LABEL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LABEL</em>'.
   * @generated
   */
  LABEL createLABEL();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TestFrameworkPackage getTestFrameworkPackage();

} //TestFrameworkFactory
