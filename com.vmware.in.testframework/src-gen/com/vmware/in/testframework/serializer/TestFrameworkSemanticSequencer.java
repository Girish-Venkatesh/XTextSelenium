package com.vmware.in.testframework.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.vmware.in.testframework.services.TestFrameworkGrammarAccess;
import com.vmware.in.testframework.testFramework.FIRSTACTION;
import com.vmware.in.testframework.testFramework.Greeting;
import com.vmware.in.testframework.testFramework.IDENTIFIER;
import com.vmware.in.testframework.testFramework.LABEL;
import com.vmware.in.testframework.testFramework.Model;
import com.vmware.in.testframework.testFramework.TABLEACTION;
import com.vmware.in.testframework.testFramework.TestFrameworkPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TestFrameworkSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TestFrameworkGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TestFrameworkPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TestFrameworkPackage.FIRSTACTION:
				if(context == grammarAccess.getFIRSTACTIONRule()) {
					sequence_FIRSTACTION(context, (FIRSTACTION) semanticObject); 
					return; 
				}
				else break;
			case TestFrameworkPackage.GREETING:
				if(context == grammarAccess.getGreetingRule()) {
					sequence_Greeting(context, (Greeting) semanticObject); 
					return; 
				}
				else break;
			case TestFrameworkPackage.IDENTIFIER:
				if(context == grammarAccess.getIDENTIFIERRule()) {
					sequence_IDENTIFIER(context, (IDENTIFIER) semanticObject); 
					return; 
				}
				else break;
			case TestFrameworkPackage.LABEL:
				if(context == grammarAccess.getLABELRule()) {
					sequence_LABEL(context, (LABEL) semanticObject); 
					return; 
				}
				else break;
			case TestFrameworkPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case TestFrameworkPackage.TABLEACTION:
				if(context == grammarAccess.getTABLEACTIONRule()) {
					sequence_TABLEACTION(context, (TABLEACTION) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (checktableAction='Checktable' nextAction=TABLEACTION)
	 */
	protected void sequence_FIRSTACTION(EObject context, FIRSTACTION semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TestFrameworkPackage.Literals.FIRSTACTION__CHECKTABLE_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestFrameworkPackage.Literals.FIRSTACTION__CHECKTABLE_ACTION));
			if(transientValues.isValueTransient(semanticObject, TestFrameworkPackage.Literals.FIRSTACTION__NEXT_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestFrameworkPackage.Literals.FIRSTACTION__NEXT_ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFIRSTACTIONAccess().getChecktableActionChecktableKeyword_0_0(), semanticObject.getChecktableAction());
		feeder.accept(grammarAccess.getFIRSTACTIONAccess().getNextActionTABLEACTIONParserRuleCall_1_0(), semanticObject.getNextAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (testcaseValue=INT summaryDetails=STRING action=FIRSTACTION)
	 */
	protected void sequence_Greeting(EObject context, Greeting semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TestFrameworkPackage.Literals.GREETING__TESTCASE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestFrameworkPackage.Literals.GREETING__TESTCASE_VALUE));
			if(transientValues.isValueTransient(semanticObject, TestFrameworkPackage.Literals.GREETING__SUMMARY_DETAILS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestFrameworkPackage.Literals.GREETING__SUMMARY_DETAILS));
			if(transientValues.isValueTransient(semanticObject, TestFrameworkPackage.Literals.GREETING__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestFrameworkPackage.Literals.GREETING__ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGreetingAccess().getTestcaseValueINTTerminalRuleCall_4_0(), semanticObject.getTestcaseValue());
		feeder.accept(grammarAccess.getGreetingAccess().getSummaryDetailsSTRINGTerminalRuleCall_9_0(), semanticObject.getSummaryDetails());
		feeder.accept(grammarAccess.getGreetingAccess().getActionFIRSTACTIONParserRuleCall_10_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     identifiervalue=STRING
	 */
	protected void sequence_IDENTIFIER(EObject context, IDENTIFIER semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TestFrameworkPackage.Literals.IDENTIFIER__IDENTIFIERVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestFrameworkPackage.Literals.IDENTIFIER__IDENTIFIERVALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIDENTIFIERAccess().getIdentifiervalueSTRINGTerminalRuleCall_4_0(), semanticObject.getIdentifiervalue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     labelvalue=ID
	 */
	protected void sequence_LABEL(EObject context, LABEL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TestFrameworkPackage.Literals.LABEL__LABELVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestFrameworkPackage.Literals.LABEL__LABELVALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLABELAccess().getLabelvalueIDTerminalRuleCall_4_0(), semanticObject.getLabelvalue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     greetings+=Greeting*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifierAction=IDENTIFIER nextAction=LABEL)
	 */
	protected void sequence_TABLEACTION(EObject context, TABLEACTION semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TestFrameworkPackage.Literals.TABLEACTION__IDENTIFIER_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestFrameworkPackage.Literals.TABLEACTION__IDENTIFIER_ACTION));
			if(transientValues.isValueTransient(semanticObject, TestFrameworkPackage.Literals.TABLEACTION__NEXT_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestFrameworkPackage.Literals.TABLEACTION__NEXT_ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTABLEACTIONAccess().getIdentifierActionIDENTIFIERParserRuleCall_2_0(), semanticObject.getIdentifierAction());
		feeder.accept(grammarAccess.getTABLEACTIONAccess().getNextActionLABELParserRuleCall_3_0(), semanticObject.getNextAction());
		feeder.finish();
	}
}
