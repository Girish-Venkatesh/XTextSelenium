/**
 */
package com.vmware.in.testframework.testFramework.impl;

import com.vmware.in.testframework.testFramework.Greeting;
import com.vmware.in.testframework.testFramework.Model;
import com.vmware.in.testframework.testFramework.TestFrameworkFactory;
import com.vmware.in.testframework.testFramework.TestFrameworkPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestFrameworkPackageImpl extends EPackageImpl implements TestFrameworkPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass greetingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass firstactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.vmware.in.testframework.testFramework.TestFrameworkPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TestFrameworkPackageImpl()
  {
    super(eNS_URI, TestFrameworkFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TestFrameworkPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TestFrameworkPackage init()
  {
    if (isInited) return (TestFrameworkPackage)EPackage.Registry.INSTANCE.getEPackage(TestFrameworkPackage.eNS_URI);

    // Obtain or create and register package
    TestFrameworkPackageImpl theTestFrameworkPackage = (TestFrameworkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestFrameworkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestFrameworkPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTestFrameworkPackage.createPackageContents();

    // Initialize created meta-data
    theTestFrameworkPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTestFrameworkPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TestFrameworkPackage.eNS_URI, theTestFrameworkPackage);
    return theTestFrameworkPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Greetings()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGreeting()
  {
    return greetingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGreeting_TestcaseValue()
  {
    return (EAttribute)greetingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGreeting_SummaryDetails()
  {
    return (EAttribute)greetingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGreeting_Action()
  {
    return (EReference)greetingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFIRSTACTION()
  {
    return firstactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFIRSTACTION_ChecktableAction()
  {
    return (EAttribute)firstactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFIRSTACTION_NextAction()
  {
    return (EReference)firstactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTABLEACTION()
  {
    return tableactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTABLEACTION_IdentifierAction()
  {
    return (EReference)tableactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTABLEACTION_NextAction()
  {
    return (EReference)tableactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIDENTIFIER()
  {
    return identifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIDENTIFIER_Identifiervalue()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLABEL()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLABEL_Labelvalue()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestFrameworkFactory getTestFrameworkFactory()
  {
    return (TestFrameworkFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__GREETINGS);

    greetingEClass = createEClass(GREETING);
    createEAttribute(greetingEClass, GREETING__TESTCASE_VALUE);
    createEAttribute(greetingEClass, GREETING__SUMMARY_DETAILS);
    createEReference(greetingEClass, GREETING__ACTION);

    firstactionEClass = createEClass(FIRSTACTION);
    createEAttribute(firstactionEClass, FIRSTACTION__CHECKTABLE_ACTION);
    createEReference(firstactionEClass, FIRSTACTION__NEXT_ACTION);

    tableactionEClass = createEClass(TABLEACTION);
    createEReference(tableactionEClass, TABLEACTION__IDENTIFIER_ACTION);
    createEReference(tableactionEClass, TABLEACTION__NEXT_ACTION);

    identifierEClass = createEClass(IDENTIFIER);
    createEAttribute(identifierEClass, IDENTIFIER__IDENTIFIERVALUE);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__LABELVALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Greetings(), this.getGreeting(), null, "greetings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(greetingEClass, Greeting.class, "Greeting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGreeting_TestcaseValue(), ecorePackage.getEInt(), "testcaseValue", null, 0, 1, Greeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGreeting_SummaryDetails(), ecorePackage.getEString(), "summaryDetails", null, 0, 1, Greeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGreeting_Action(), this.getFIRSTACTION(), null, "action", null, 0, 1, Greeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(firstactionEClass, com.vmware.in.testframework.testFramework.FIRSTACTION.class, "FIRSTACTION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFIRSTACTION_ChecktableAction(), ecorePackage.getEString(), "checktableAction", null, 0, 1, com.vmware.in.testframework.testFramework.FIRSTACTION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFIRSTACTION_NextAction(), this.getTABLEACTION(), null, "nextAction", null, 0, 1, com.vmware.in.testframework.testFramework.FIRSTACTION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableactionEClass, com.vmware.in.testframework.testFramework.TABLEACTION.class, "TABLEACTION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTABLEACTION_IdentifierAction(), this.getIDENTIFIER(), null, "identifierAction", null, 0, 1, com.vmware.in.testframework.testFramework.TABLEACTION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTABLEACTION_NextAction(), this.getLABEL(), null, "nextAction", null, 0, 1, com.vmware.in.testframework.testFramework.TABLEACTION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierEClass, com.vmware.in.testframework.testFramework.IDENTIFIER.class, "IDENTIFIER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIDENTIFIER_Identifiervalue(), ecorePackage.getEString(), "identifiervalue", null, 0, 1, com.vmware.in.testframework.testFramework.IDENTIFIER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, com.vmware.in.testframework.testFramework.LABEL.class, "LABEL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLABEL_Labelvalue(), ecorePackage.getEString(), "labelvalue", null, 0, 1, com.vmware.in.testframework.testFramework.LABEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TestFrameworkPackageImpl
