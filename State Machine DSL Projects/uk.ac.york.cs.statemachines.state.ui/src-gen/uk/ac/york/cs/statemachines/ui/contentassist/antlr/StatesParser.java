/*
 * generated by Xtext
 */
package uk.ac.york.cs.statemachines.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import uk.ac.york.cs.statemachines.services.StatesGrammarAccess;

public class StatesParser extends AbstractContentAssistParser {
	
	@Inject
	private StatesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected uk.ac.york.cs.statemachines.ui.contentassist.antlr.internal.InternalStatesParser createParser() {
		uk.ac.york.cs.statemachines.ui.contentassist.antlr.internal.InternalStatesParser result = new uk.ac.york.cs.statemachines.ui.contentassist.antlr.internal.InternalStatesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStateMachineAccess().getGroup(), "rule__StateMachine__Group__0");
					put(grammarAccess.getStateMachineAccess().getGroup_4(), "rule__StateMachine__Group_4__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getStateMachineAccess().getEventsAssignment_2(), "rule__StateMachine__EventsAssignment_2");
					put(grammarAccess.getStateMachineAccess().getResetEventsAssignment_4_1(), "rule__StateMachine__ResetEventsAssignment_4_1");
					put(grammarAccess.getStateMachineAccess().getStatesAssignment_5(), "rule__StateMachine__StatesAssignment_5");
					put(grammarAccess.getEventAccess().getNameAssignment_1(), "rule__Event__NameAssignment_1");
					put(grammarAccess.getEventAccess().getCodeAssignment_2(), "rule__Event__CodeAssignment_2");
					put(grammarAccess.getStateAccess().getNameAssignment_1(), "rule__State__NameAssignment_1");
					put(grammarAccess.getStateAccess().getTransitionsAssignment_2(), "rule__State__TransitionsAssignment_2");
					put(grammarAccess.getTransitionAccess().getEventAssignment_1(), "rule__Transition__EventAssignment_1");
					put(grammarAccess.getTransitionAccess().getStateAssignment_3(), "rule__Transition__StateAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			uk.ac.york.cs.statemachines.ui.contentassist.antlr.internal.InternalStatesParser typedParser = (uk.ac.york.cs.statemachines.ui.contentassist.antlr.internal.InternalStatesParser) parser;
			typedParser.entryRuleStateMachine();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public StatesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(StatesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
