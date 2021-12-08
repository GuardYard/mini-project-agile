/*
 * generated by Xtext 2.23.0
 */
package co7217.dsl.ucd.serializer;

import co7217.dsl.ucd.services.UseCaseDSLGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class UseCaseDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UseCaseDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Actors_UseCases_ActorsKeyword_0_or_UseCasesKeyword_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UseCaseDSLGrammarAccess) access;
		match_Actors_UseCases_ActorsKeyword_0_or_UseCasesKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getActorsAccess().getActorsKeyword_0()), new TokenAlias(false, false, grammarAccess.getUseCasesAccess().getUseCasesKeyword_0()));
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
			if (match_Actors_UseCases_ActorsKeyword_0_or_UseCasesKeyword_0.equals(syntax))
				emit_Actors_UseCases_ActorsKeyword_0_or_UseCasesKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'use cases:' | 'actors:'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Actors_UseCases_ActorsKeyword_0_or_UseCasesKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
