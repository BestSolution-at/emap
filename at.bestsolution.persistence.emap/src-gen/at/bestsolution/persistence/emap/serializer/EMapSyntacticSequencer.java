package at.bestsolution.persistence.emap.serializer;

import at.bestsolution.persistence.emap.services.EMapGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EMapSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EMapGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ENamedQuery___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EMapGrammarAccess) access;
		match_ENamedQuery___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ENamedQuery___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_ENamedQuery___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_ENamedQuery___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
