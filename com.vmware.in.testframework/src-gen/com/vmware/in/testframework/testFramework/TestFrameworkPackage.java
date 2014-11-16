/**
 */
package com.vmware.in.testframework.testFramework;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.vmware.in.testframework.testFramework.TestFrameworkFactory
 * @model kind="package"
 * @generated
 */
public interface TestFrameworkPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "testFramework";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.vmware.com/in/testframework/TestFramework";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "testFramework";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TestFrameworkPackage eINSTANCE = com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl.init();

  /**
   * The meta object id for the '{@link com.vmware.in.testframework.testFramework.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.vmware.in.testframework.testFramework.impl.ModelImpl
   * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.vmware.in.testframework.testFramework.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.vmware.in.testframework.testFramework.impl.GreetingImpl
   * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 1;

  /**
   * The feature id for the '<em><b>Testcase Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__TESTCASE_VALUE = 0;

  /**
   * The feature id for the '<em><b>Summary Details</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__SUMMARY_DETAILS = 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__ACTION = 2;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.vmware.in.testframework.testFramework.impl.FIRSTACTIONImpl <em>FIRSTACTION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.vmware.in.testframework.testFramework.impl.FIRSTACTIONImpl
   * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getFIRSTACTION()
   * @generated
   */
  int FIRSTACTION = 2;

  /**
   * The feature id for the '<em><b>Checktable Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRSTACTION__CHECKTABLE_ACTION = 0;

  /**
   * The feature id for the '<em><b>Next Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRSTACTION__NEXT_ACTION = 1;

  /**
   * The number of structural features of the '<em>FIRSTACTION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRSTACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.vmware.in.testframework.testFramework.impl.TABLEACTIONImpl <em>TABLEACTION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.vmware.in.testframework.testFramework.impl.TABLEACTIONImpl
   * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getTABLEACTION()
   * @generated
   */
  int TABLEACTION = 3;

  /**
   * The feature id for the '<em><b>Identifier Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLEACTION__IDENTIFIER_ACTION = 0;

  /**
   * The feature id for the '<em><b>Next Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLEACTION__NEXT_ACTION = 1;

  /**
   * The number of structural features of the '<em>TABLEACTION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLEACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.vmware.in.testframework.testFramework.impl.IDENTIFIERImpl <em>IDENTIFIER</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.vmware.in.testframework.testFramework.impl.IDENTIFIERImpl
   * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getIDENTIFIER()
   * @generated
   */
  int IDENTIFIER = 4;

  /**
   * The feature id for the '<em><b>Identifiervalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__IDENTIFIERVALUE = 0;

  /**
   * The number of structural features of the '<em>IDENTIFIER</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.vmware.in.testframework.testFramework.impl.LABELImpl <em>LABEL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.vmware.in.testframework.testFramework.impl.LABELImpl
   * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getLABEL()
   * @generated
   */
  int LABEL = 5;

  /**
   * The feature id for the '<em><b>Labelvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__LABELVALUE = 0;

  /**
   * The number of structural features of the '<em>LABEL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.vmware.in.testframework.testFramework.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.vmware.in.testframework.testFramework.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.vmware.in.testframework.testFramework.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see com.vmware.in.testframework.testFramework.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link com.vmware.in.testframework.testFramework.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see com.vmware.in.testframework.testFramework.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for the attribute '{@link com.vmware.in.testframework.testFramework.Greeting#getTestcaseValue <em>Testcase Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Testcase Value</em>'.
   * @see com.vmware.in.testframework.testFramework.Greeting#getTestcaseValue()
   * @see #getGreeting()
   * @generated
   */
  EAttribute getGreeting_TestcaseValue();

  /**
   * Returns the meta object for the attribute '{@link com.vmware.in.testframework.testFramework.Greeting#getSummaryDetails <em>Summary Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summary Details</em>'.
   * @see com.vmware.in.testframework.testFramework.Greeting#getSummaryDetails()
   * @see #getGreeting()
   * @generated
   */
  EAttribute getGreeting_SummaryDetails();

  /**
   * Returns the meta object for the containment reference '{@link com.vmware.in.testframework.testFramework.Greeting#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see com.vmware.in.testframework.testFramework.Greeting#getAction()
   * @see #getGreeting()
   * @generated
   */
  EReference getGreeting_Action();

  /**
   * Returns the meta object for class '{@link com.vmware.in.testframework.testFramework.FIRSTACTION <em>FIRSTACTION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FIRSTACTION</em>'.
   * @see com.vmware.in.testframework.testFramework.FIRSTACTION
   * @generated
   */
  EClass getFIRSTACTION();

  /**
   * Returns the meta object for the attribute '{@link com.vmware.in.testframework.testFramework.FIRSTACTION#getChecktableAction <em>Checktable Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Checktable Action</em>'.
   * @see com.vmware.in.testframework.testFramework.FIRSTACTION#getChecktableAction()
   * @see #getFIRSTACTION()
   * @generated
   */
  EAttribute getFIRSTACTION_ChecktableAction();

  /**
   * Returns the meta object for the containment reference '{@link com.vmware.in.testframework.testFramework.FIRSTACTION#getNextAction <em>Next Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next Action</em>'.
   * @see com.vmware.in.testframework.testFramework.FIRSTACTION#getNextAction()
   * @see #getFIRSTACTION()
   * @generated
   */
  EReference getFIRSTACTION_NextAction();

  /**
   * Returns the meta object for class '{@link com.vmware.in.testframework.testFramework.TABLEACTION <em>TABLEACTION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TABLEACTION</em>'.
   * @see com.vmware.in.testframework.testFramework.TABLEACTION
   * @generated
   */
  EClass getTABLEACTION();

  /**
   * Returns the meta object for the containment reference '{@link com.vmware.in.testframework.testFramework.TABLEACTION#getIdentifierAction <em>Identifier Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier Action</em>'.
   * @see com.vmware.in.testframework.testFramework.TABLEACTION#getIdentifierAction()
   * @see #getTABLEACTION()
   * @generated
   */
  EReference getTABLEACTION_IdentifierAction();

  /**
   * Returns the meta object for the containment reference '{@link com.vmware.in.testframework.testFramework.TABLEACTION#getNextAction <em>Next Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next Action</em>'.
   * @see com.vmware.in.testframework.testFramework.TABLEACTION#getNextAction()
   * @see #getTABLEACTION()
   * @generated
   */
  EReference getTABLEACTION_NextAction();

  /**
   * Returns the meta object for class '{@link com.vmware.in.testframework.testFramework.IDENTIFIER <em>IDENTIFIER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IDENTIFIER</em>'.
   * @see com.vmware.in.testframework.testFramework.IDENTIFIER
   * @generated
   */
  EClass getIDENTIFIER();

  /**
   * Returns the meta object for the attribute '{@link com.vmware.in.testframework.testFramework.IDENTIFIER#getIdentifiervalue <em>Identifiervalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifiervalue</em>'.
   * @see com.vmware.in.testframework.testFramework.IDENTIFIER#getIdentifiervalue()
   * @see #getIDENTIFIER()
   * @generated
   */
  EAttribute getIDENTIFIER_Identifiervalue();

  /**
   * Returns the meta object for class '{@link com.vmware.in.testframework.testFramework.LABEL <em>LABEL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LABEL</em>'.
   * @see com.vmware.in.testframework.testFramework.LABEL
   * @generated
   */
  EClass getLABEL();

  /**
   * Returns the meta object for the attribute '{@link com.vmware.in.testframework.testFramework.LABEL#getLabelvalue <em>Labelvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Labelvalue</em>'.
   * @see com.vmware.in.testframework.testFramework.LABEL#getLabelvalue()
   * @see #getLABEL()
   * @generated
   */
  EAttribute getLABEL_Labelvalue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TestFrameworkFactory getTestFrameworkFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.vmware.in.testframework.testFramework.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.vmware.in.testframework.testFramework.impl.ModelImpl
     * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

    /**
     * The meta object literal for the '{@link com.vmware.in.testframework.testFramework.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.vmware.in.testframework.testFramework.impl.GreetingImpl
     * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '<em><b>Testcase Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GREETING__TESTCASE_VALUE = eINSTANCE.getGreeting_TestcaseValue();

    /**
     * The meta object literal for the '<em><b>Summary Details</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GREETING__SUMMARY_DETAILS = eINSTANCE.getGreeting_SummaryDetails();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREETING__ACTION = eINSTANCE.getGreeting_Action();

    /**
     * The meta object literal for the '{@link com.vmware.in.testframework.testFramework.impl.FIRSTACTIONImpl <em>FIRSTACTION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.vmware.in.testframework.testFramework.impl.FIRSTACTIONImpl
     * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getFIRSTACTION()
     * @generated
     */
    EClass FIRSTACTION = eINSTANCE.getFIRSTACTION();

    /**
     * The meta object literal for the '<em><b>Checktable Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIRSTACTION__CHECKTABLE_ACTION = eINSTANCE.getFIRSTACTION_ChecktableAction();

    /**
     * The meta object literal for the '<em><b>Next Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIRSTACTION__NEXT_ACTION = eINSTANCE.getFIRSTACTION_NextAction();

    /**
     * The meta object literal for the '{@link com.vmware.in.testframework.testFramework.impl.TABLEACTIONImpl <em>TABLEACTION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.vmware.in.testframework.testFramework.impl.TABLEACTIONImpl
     * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getTABLEACTION()
     * @generated
     */
    EClass TABLEACTION = eINSTANCE.getTABLEACTION();

    /**
     * The meta object literal for the '<em><b>Identifier Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLEACTION__IDENTIFIER_ACTION = eINSTANCE.getTABLEACTION_IdentifierAction();

    /**
     * The meta object literal for the '<em><b>Next Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLEACTION__NEXT_ACTION = eINSTANCE.getTABLEACTION_NextAction();

    /**
     * The meta object literal for the '{@link com.vmware.in.testframework.testFramework.impl.IDENTIFIERImpl <em>IDENTIFIER</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.vmware.in.testframework.testFramework.impl.IDENTIFIERImpl
     * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getIDENTIFIER()
     * @generated
     */
    EClass IDENTIFIER = eINSTANCE.getIDENTIFIER();

    /**
     * The meta object literal for the '<em><b>Identifiervalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER__IDENTIFIERVALUE = eINSTANCE.getIDENTIFIER_Identifiervalue();

    /**
     * The meta object literal for the '{@link com.vmware.in.testframework.testFramework.impl.LABELImpl <em>LABEL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.vmware.in.testframework.testFramework.impl.LABELImpl
     * @see com.vmware.in.testframework.testFramework.impl.TestFrameworkPackageImpl#getLABEL()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLABEL();

    /**
     * The meta object literal for the '<em><b>Labelvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__LABELVALUE = eINSTANCE.getLABEL_Labelvalue();

  }

} //TestFrameworkPackage
