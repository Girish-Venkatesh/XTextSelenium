package com.vmware.in.testframework.serializer;

import com.google.inject.Inject;
import com.vmware.in.testframework.services.TestFrameworkGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class TestFrameworkSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TestFrameworkGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Greeting_SPACETerminalRuleCall_1_q;
	protected AbstractElementAlias match_Greeting_SPACETerminalRuleCall_3_q;
	protected AbstractElementAlias match_Greeting_SPACETerminalRuleCall_6_q;
	protected AbstractElementAlias match_Greeting_SPACETerminalRuleCall_8_q;
	protected AbstractElementAlias match_IDENTIFIER_SPACETerminalRuleCall_1_q;
	protected AbstractElementAlias match_IDENTIFIER_SPACETerminalRuleCall_3_q;
	protected AbstractElementAlias match_LABEL_SPACETerminalRuleCall_1_q;
	protected AbstractElementAlias match_LABEL_SPACETerminalRuleCall_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TestFrameworkGrammarAccess) access;
		match_Greeting_SPACETerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getGreetingAccess().getSPACETerminalRuleCall_1());
		match_Greeting_SPACETerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getGreetingAccess().getSPACETerminalRuleCall_3());
		match_Greeting_SPACETerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getGreetingAccess().getSPACETerminalRuleCall_6());
		match_Greeting_SPACETerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getGreetingAccess().getSPACETerminalRuleCall_8());
		match_IDENTIFIER_SPACETerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getIDENTIFIERAccess().getSPACETerminalRuleCall_1());
		match_IDENTIFIER_SPACETerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getIDENTIFIERAccess().getSPACETerminalRuleCall_3());
		match_LABEL_SPACETerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getLABELAccess().getSPACETerminalRuleCall_1());
		match_LABEL_SPACETerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getLABELAccess().getSPACETerminalRuleCall_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSPACERule())
			return getSPACEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal SPACE : (' ')*;
	 */
	protected String getSPACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Greeting_SPACETerminalRuleCall_1_q.equals(syntax))
				emit_Greeting_SPACETerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Greeting_SPACETerminalRuleCall_3_q.equals(syntax))
				emit_Greeting_SPACETerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Greeting_SPACETerminalRuleCall_6_q.equals(syntax))
				emit_Greeting_SPACETerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Greeting_SPACETerminalRuleCall_8_q.equals(syntax))
				emit_Greeting_SPACETerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IDENTIFIER_SPACETerminalRuleCall_1_q.equals(syntax))
				emit_IDENTIFIER_SPACETerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IDENTIFIER_SPACETerminalRuleCall_3_q.equals(syntax))
				emit_IDENTIFIER_SPACETerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LABEL_SPACETerminalRuleCall_1_q.equals(syntax))
				emit_LABEL_SPACETerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LABEL_SPACETerminalRuleCall_3_q.equals(syntax))
				emit_LABEL_SPACETerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     SPACE?
	 */
	protected void emit_Greeting_SPACETerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SPACE?
	 */
	protected void emit_Greeting_SPACETerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SPACE?
	 */
	protected void emit_Greeting_SPACETerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SPACE?
	 */
	protected void emit_Greeting_SPACETerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SPACE?
	 */
	protected void emit_IDENTIFIER_SPACETerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SPACE?
	 */
	protected void emit_IDENTIFIER_SPACETerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SPACE?
	 */
	protected void emit_LABEL_SPACETerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SPACE?
	 */
	protected void emit_LABEL_SPACETerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
