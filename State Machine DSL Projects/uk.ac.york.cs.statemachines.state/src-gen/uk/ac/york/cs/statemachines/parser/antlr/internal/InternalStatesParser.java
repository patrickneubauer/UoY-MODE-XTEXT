package uk.ac.york.cs.statemachines.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.york.cs.statemachines.services.StatesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'events'", "'end'", "'resetEvents'", "'state'", "'=>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalStatesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStatesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStatesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStates.g"; }



     	private StatesGrammarAccess grammarAccess;
     	
        public InternalStatesParser(TokenStream input, StatesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";	
       	}
       	
       	@Override
       	protected StatesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStateMachine"
    // InternalStates.g:67:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStates.g:68:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStates.g:69:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStates.g:76:1: ruleStateMachine returns [EObject current=null] : ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )+ ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_events_2_0 = null;

        EObject lv_states_7_0 = null;


         enterRule(); 
            
        try {
            // InternalStates.g:79:28: ( ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )+ ) )
            // InternalStates.g:80:1: ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )+ )
            {
            // InternalStates.g:80:1: ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )+ )
            // InternalStates.g:80:2: () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )+
            {
            // InternalStates.g:80:2: ()
            // InternalStates.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getEventsKeyword_1());
                
            // InternalStates.g:90:1: ( (lv_events_2_0= ruleEvent ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStates.g:91:1: (lv_events_2_0= ruleEvent )
            	    {
            	    // InternalStates.g:91:1: (lv_events_2_0= ruleEvent )
            	    // InternalStates.g:92:3: lv_events_2_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_events_2_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_2_0, 
            	            		"uk.ac.york.cs.statemachines.States.Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getEndKeyword_3());
                
            // InternalStates.g:112:1: (otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStates.g:112:3: otherlv_4= 'resetEvents' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getResetEventsKeyword_4_0());
                        
                    // InternalStates.g:116:1: ( (otherlv_5= RULE_ID ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalStates.g:117:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalStates.g:117:1: (otherlv_5= RULE_ID )
                    	    // InternalStates.g:118:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateMachineRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_4); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getResetEventsEventCrossReference_4_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getEndKeyword_4_2());
                        

                    }
                    break;

            }

            // InternalStates.g:133:3: ( (lv_states_7_0= ruleState ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStates.g:134:1: (lv_states_7_0= ruleState )
            	    {
            	    // InternalStates.g:134:1: (lv_states_7_0= ruleState )
            	    // InternalStates.g:135:3: lv_states_7_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_states_7_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_7_0, 
            	            		"uk.ac.york.cs.statemachines.States.State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleEvent"
    // InternalStates.g:159:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStates.g:160:2: (iv_ruleEvent= ruleEvent EOF )
            // InternalStates.g:161:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalStates.g:168:1: ruleEvent returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_code_2_0=null;

         enterRule(); 
            
        try {
            // InternalStates.g:171:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_ID ) ) ) )
            // InternalStates.g:172:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_ID ) ) )
            {
            // InternalStates.g:172:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_ID ) ) )
            // InternalStates.g:172:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_ID ) )
            {
            // InternalStates.g:172:2: ()
            // InternalStates.g:173:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            // InternalStates.g:178:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalStates.g:179:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStates.g:179:1: (lv_name_1_0= RULE_ID )
            // InternalStates.g:180:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStates.g:196:2: ( (lv_code_2_0= RULE_ID ) )
            // InternalStates.g:197:1: (lv_code_2_0= RULE_ID )
            {
            // InternalStates.g:197:1: (lv_code_2_0= RULE_ID )
            // InternalStates.g:198:3: lv_code_2_0= RULE_ID
            {
            lv_code_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_code_2_0, grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleState"
    // InternalStates.g:222:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStates.g:223:2: (iv_ruleState= ruleState EOF )
            // InternalStates.g:224:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStates.g:231:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransition ) )* otherlv_3= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_transitions_2_0 = null;


         enterRule(); 
            
        try {
            // InternalStates.g:234:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransition ) )* otherlv_3= 'end' ) )
            // InternalStates.g:235:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransition ) )* otherlv_3= 'end' )
            {
            // InternalStates.g:235:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransition ) )* otherlv_3= 'end' )
            // InternalStates.g:235:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransition ) )* otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // InternalStates.g:239:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStates.g:240:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStates.g:240:1: (lv_name_1_0= RULE_ID )
            // InternalStates.g:241:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStates.g:257:2: ( (lv_transitions_2_0= ruleTransition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStates.g:258:1: (lv_transitions_2_0= ruleTransition )
            	    {
            	    // InternalStates.g:258:1: (lv_transitions_2_0= ruleTransition )
            	    // InternalStates.g:259:3: lv_transitions_2_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_transitions_2_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_2_0, 
            	            		"uk.ac.york.cs.statemachines.States.Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getEndKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStates.g:287:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStates.g:288:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalStates.g:289:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStates.g:296:1: ruleTransition returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '=>' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalStates.g:299:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '=>' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalStates.g:300:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '=>' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalStates.g:300:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '=>' ( (otherlv_3= RULE_ID ) ) )
            // InternalStates.g:300:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '=>' ( (otherlv_3= RULE_ID ) )
            {
            // InternalStates.g:300:2: ()
            // InternalStates.g:301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransitionAccess().getTransitionAction_0(),
                        current);
                

            }

            // InternalStates.g:306:2: ( (otherlv_1= RULE_ID ) )
            // InternalStates.g:307:1: (otherlv_1= RULE_ID )
            {
            // InternalStates.g:307:1: (otherlv_1= RULE_ID )
            // InternalStates.g:308:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

            		newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_2());
                
            // InternalStates.g:323:1: ( (otherlv_3= RULE_ID ) )
            // InternalStates.g:324:1: (otherlv_3= RULE_ID )
            {
            // InternalStates.g:324:1: (otherlv_3= RULE_ID )
            // InternalStates.g:325:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    }


}