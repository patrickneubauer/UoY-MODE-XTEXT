/*
 * generated by Xtext
 */
package uk.ac.york.cs.statemachines.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class StatesGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class StateMachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.cs.statemachines.States.StateMachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateMachineAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEventsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEventsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEventsEventParserRuleCall_2_0 = (RuleCall)cEventsAssignment_2.eContents().get(0);
		private final Keyword cEndKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cResetEventsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cResetEventsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cResetEventsEventCrossReference_4_1_0 = (CrossReference)cResetEventsAssignment_4_1.eContents().get(0);
		private final RuleCall cResetEventsEventIDTerminalRuleCall_4_1_0_1 = (RuleCall)cResetEventsEventCrossReference_4_1_0.eContents().get(1);
		private final Keyword cEndKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cStatesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cStatesStateParserRuleCall_5_0 = (RuleCall)cStatesAssignment_5.eContents().get(0);
		
		//StateMachine:
		//	{StateMachine}
		//	'events'
		//	events+=Event+
		//	'end' ('resetEvents'
		//	resetEvents+=[Event]+
		//	'end')?
		//	states+=State+;
		@Override public ParserRule getRule() { return rule; }

		//{StateMachine} 'events' events+=Event+ 'end' ('resetEvents' resetEvents+=[Event]+ 'end')? states+=State+
		public Group getGroup() { return cGroup; }

		//{StateMachine}
		public Action getStateMachineAction_0() { return cStateMachineAction_0; }

		//'events'
		public Keyword getEventsKeyword_1() { return cEventsKeyword_1; }

		//events+=Event+
		public Assignment getEventsAssignment_2() { return cEventsAssignment_2; }

		//Event
		public RuleCall getEventsEventParserRuleCall_2_0() { return cEventsEventParserRuleCall_2_0; }

		//'end'
		public Keyword getEndKeyword_3() { return cEndKeyword_3; }

		//('resetEvents' resetEvents+=[Event]+ 'end')?
		public Group getGroup_4() { return cGroup_4; }

		//'resetEvents'
		public Keyword getResetEventsKeyword_4_0() { return cResetEventsKeyword_4_0; }

		//resetEvents+=[Event]+
		public Assignment getResetEventsAssignment_4_1() { return cResetEventsAssignment_4_1; }

		//[Event]
		public CrossReference getResetEventsEventCrossReference_4_1_0() { return cResetEventsEventCrossReference_4_1_0; }

		//ID
		public RuleCall getResetEventsEventIDTerminalRuleCall_4_1_0_1() { return cResetEventsEventIDTerminalRuleCall_4_1_0_1; }

		//'end'
		public Keyword getEndKeyword_4_2() { return cEndKeyword_4_2; }

		//states+=State+
		public Assignment getStatesAssignment_5() { return cStatesAssignment_5; }

		//State
		public RuleCall getStatesStateParserRuleCall_5_0() { return cStatesStateParserRuleCall_5_0; }
	}

	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.cs.statemachines.States.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEventAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cCodeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCodeIDTerminalRuleCall_2_0 = (RuleCall)cCodeAssignment_2.eContents().get(0);
		
		//Event:
		//	{Event} name=ID code=ID;
		@Override public ParserRule getRule() { return rule; }

		//{Event} name=ID code=ID
		public Group getGroup() { return cGroup; }

		//{Event}
		public Action getEventAction_0() { return cEventAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//code=ID
		public Assignment getCodeAssignment_2() { return cCodeAssignment_2; }

		//ID
		public RuleCall getCodeIDTerminalRuleCall_2_0() { return cCodeIDTerminalRuleCall_2_0; }
	}

	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.cs.statemachines.States.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTransitionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTransitionsTransitionParserRuleCall_2_0 = (RuleCall)cTransitionsAssignment_2.eContents().get(0);
		private final Keyword cEndKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//State:
		//	'state' name=ID
		//	transitions+=Transition*
		//	'end';
		@Override public ParserRule getRule() { return rule; }

		//'state' name=ID transitions+=Transition* 'end'
		public Group getGroup() { return cGroup; }

		//'state'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//transitions+=Transition*
		public Assignment getTransitionsAssignment_2() { return cTransitionsAssignment_2; }

		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_2_0() { return cTransitionsTransitionParserRuleCall_2_0; }

		//'end'
		public Keyword getEndKeyword_3() { return cEndKeyword_3; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.cs.statemachines.States.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTransitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cEventAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEventEventCrossReference_1_0 = (CrossReference)cEventAssignment_1.eContents().get(0);
		private final RuleCall cEventEventIDTerminalRuleCall_1_0_1 = (RuleCall)cEventEventCrossReference_1_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cStateStateCrossReference_3_0 = (CrossReference)cStateAssignment_3.eContents().get(0);
		private final RuleCall cStateStateIDTerminalRuleCall_3_0_1 = (RuleCall)cStateStateCrossReference_3_0.eContents().get(1);
		
		//Transition:
		//	{Transition} event=[Event] '=>' state=[State];
		@Override public ParserRule getRule() { return rule; }

		//{Transition} event=[Event] '=>' state=[State]
		public Group getGroup() { return cGroup; }

		//{Transition}
		public Action getTransitionAction_0() { return cTransitionAction_0; }

		//event=[Event]
		public Assignment getEventAssignment_1() { return cEventAssignment_1; }

		//[Event]
		public CrossReference getEventEventCrossReference_1_0() { return cEventEventCrossReference_1_0; }

		//ID
		public RuleCall getEventEventIDTerminalRuleCall_1_0_1() { return cEventEventIDTerminalRuleCall_1_0_1; }

		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_2() { return cEqualsSignGreaterThanSignKeyword_2; }

		//state=[State]
		public Assignment getStateAssignment_3() { return cStateAssignment_3; }

		//[State]
		public CrossReference getStateStateCrossReference_3_0() { return cStateStateCrossReference_3_0; }

		//ID
		public RuleCall getStateStateIDTerminalRuleCall_3_0_1() { return cStateStateIDTerminalRuleCall_3_0_1; }
	}
	
	
	private final StateMachineElements pStateMachine;
	private final EventElements pEvent;
	private final StateElements pState;
	private final TransitionElements pTransition;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public StatesGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pStateMachine = new StateMachineElements();
		this.pEvent = new EventElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.york.cs.statemachines.States".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//StateMachine:
	//	{StateMachine}
	//	'events'
	//	events+=Event+
	//	'end' ('resetEvents'
	//	resetEvents+=[Event]+
	//	'end')?
	//	states+=State+;
	public StateMachineElements getStateMachineAccess() {
		return pStateMachine;
	}
	
	public ParserRule getStateMachineRule() {
		return getStateMachineAccess().getRule();
	}

	//Event:
	//	{Event} name=ID code=ID;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}

	//State:
	//	'state' name=ID
	//	transitions+=Transition*
	//	'end';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}

	//Transition:
	//	{Transition} event=[Event] '=>' state=[State];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
