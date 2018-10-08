package uk.ac.york.cs.entities.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.york.cs.entities.services.EntityDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEntityDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'entity'", "'{'", "'}'", "'extends'", "'property'", "':'", "'.'", "'[]'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalEntityDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntityDSL.g"; }


    	private EntityDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(EntityDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalEntityDSL.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEntityDSL.g:55:1: ( ruleModel EOF )
            // InternalEntityDSL.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEntityDSL.g:63:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:67:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalEntityDSL.g:68:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalEntityDSL.g:68:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalEntityDSL.g:69:3: ( rule__Model__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsAssignment()); 
            }
            // InternalEntityDSL.g:70:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntityDSL.g:70:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalEntityDSL.g:79:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalEntityDSL.g:80:1: ( ruleType EOF )
            // InternalEntityDSL.g:81:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalEntityDSL.g:88:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:92:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalEntityDSL.g:93:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalEntityDSL.g:93:2: ( ( rule__Type__Alternatives ) )
            // InternalEntityDSL.g:94:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalEntityDSL.g:95:3: ( rule__Type__Alternatives )
            // InternalEntityDSL.g:95:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // InternalEntityDSL.g:104:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // InternalEntityDSL.g:105:1: ( ruleSimpleType EOF )
            // InternalEntityDSL.g:106:1: ruleSimpleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSimpleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalEntityDSL.g:113:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:117:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // InternalEntityDSL.g:118:2: ( ( rule__SimpleType__Group__0 ) )
            {
            // InternalEntityDSL.g:118:2: ( ( rule__SimpleType__Group__0 ) )
            // InternalEntityDSL.g:119:3: ( rule__SimpleType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            }
            // InternalEntityDSL.g:120:3: ( rule__SimpleType__Group__0 )
            // InternalEntityDSL.g:120:4: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleEntity"
    // InternalEntityDSL.g:129:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalEntityDSL.g:130:1: ( ruleEntity EOF )
            // InternalEntityDSL.g:131:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalEntityDSL.g:138:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:142:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalEntityDSL.g:143:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalEntityDSL.g:143:2: ( ( rule__Entity__Group__0 ) )
            // InternalEntityDSL.g:144:3: ( rule__Entity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // InternalEntityDSL.g:145:3: ( rule__Entity__Group__0 )
            // InternalEntityDSL.g:145:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // InternalEntityDSL.g:154:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalEntityDSL.g:155:1: ( ruleProperty EOF )
            // InternalEntityDSL.g:156:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalEntityDSL.g:163:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:167:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalEntityDSL.g:168:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalEntityDSL.g:168:2: ( ( rule__Property__Group__0 ) )
            // InternalEntityDSL.g:169:3: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // InternalEntityDSL.g:170:3: ( rule__Property__Group__0 )
            // InternalEntityDSL.g:170:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEntityDSL.g:179:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalEntityDSL.g:180:1: ( ruleQualifiedName EOF )
            // InternalEntityDSL.g:181:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalEntityDSL.g:188:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:192:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalEntityDSL.g:193:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalEntityDSL.g:193:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalEntityDSL.g:194:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalEntityDSL.g:195:3: ( rule__QualifiedName__Group__0 )
            // InternalEntityDSL.g:195:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEString"
    // InternalEntityDSL.g:204:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEntityDSL.g:205:1: ( ruleEString EOF )
            // InternalEntityDSL.g:206:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEntityDSL.g:213:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:217:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEntityDSL.g:218:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEntityDSL.g:218:2: ( ( rule__EString__Alternatives ) )
            // InternalEntityDSL.g:219:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalEntityDSL.g:220:3: ( rule__EString__Alternatives )
            // InternalEntityDSL.g:220:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalEntityDSL.g:228:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:232:1: ( ( ruleSimpleType ) | ( ruleEntity ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntityDSL.g:233:2: ( ruleSimpleType )
                    {
                    // InternalEntityDSL.g:233:2: ( ruleSimpleType )
                    // InternalEntityDSL.g:234:3: ruleSimpleType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSimpleType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDSL.g:239:2: ( ruleEntity )
                    {
                    // InternalEntityDSL.g:239:2: ( ruleEntity )
                    // InternalEntityDSL.g:240:3: ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEntityDSL.g:249:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:253:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDSL.g:254:2: ( RULE_STRING )
                    {
                    // InternalEntityDSL.g:254:2: ( RULE_STRING )
                    // InternalEntityDSL.g:255:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDSL.g:260:2: ( RULE_ID )
                    {
                    // InternalEntityDSL.g:260:2: ( RULE_ID )
                    // InternalEntityDSL.g:261:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__SimpleType__Group__0"
    // InternalEntityDSL.g:270:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:274:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // InternalEntityDSL.g:275:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SimpleType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__0"


    // $ANTLR start "rule__SimpleType__Group__0__Impl"
    // InternalEntityDSL.g:282:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:286:1: ( ( 'type' ) )
            // InternalEntityDSL.g:287:1: ( 'type' )
            {
            // InternalEntityDSL.g:287:1: ( 'type' )
            // InternalEntityDSL.g:288:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__0__Impl"


    // $ANTLR start "rule__SimpleType__Group__1"
    // InternalEntityDSL.g:297:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:301:1: ( rule__SimpleType__Group__1__Impl )
            // InternalEntityDSL.g:302:2: rule__SimpleType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__1"


    // $ANTLR start "rule__SimpleType__Group__1__Impl"
    // InternalEntityDSL.g:308:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:312:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // InternalEntityDSL.g:313:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // InternalEntityDSL.g:313:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // InternalEntityDSL.g:314:2: ( rule__SimpleType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            }
            // InternalEntityDSL.g:315:2: ( rule__SimpleType__NameAssignment_1 )
            // InternalEntityDSL.g:315:3: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalEntityDSL.g:324:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:328:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalEntityDSL.g:329:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalEntityDSL.g:336:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:340:1: ( ( 'entity' ) )
            // InternalEntityDSL.g:341:1: ( 'entity' )
            {
            // InternalEntityDSL.g:341:1: ( 'entity' )
            // InternalEntityDSL.g:342:2: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalEntityDSL.g:351:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:355:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalEntityDSL.g:356:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalEntityDSL.g:363:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:367:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalEntityDSL.g:368:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalEntityDSL.g:368:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalEntityDSL.g:369:2: ( rule__Entity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }
            // InternalEntityDSL.g:370:2: ( rule__Entity__NameAssignment_1 )
            // InternalEntityDSL.g:370:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalEntityDSL.g:378:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:382:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalEntityDSL.g:383:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalEntityDSL.g:390:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:394:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalEntityDSL.g:395:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalEntityDSL.g:395:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalEntityDSL.g:396:2: ( rule__Entity__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_2()); 
            }
            // InternalEntityDSL.g:397:2: ( rule__Entity__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntityDSL.g:397:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalEntityDSL.g:405:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:409:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalEntityDSL.g:410:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalEntityDSL.g:417:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:421:1: ( ( '{' ) )
            // InternalEntityDSL.g:422:1: ( '{' )
            {
            // InternalEntityDSL.g:422:1: ( '{' )
            // InternalEntityDSL.g:423:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalEntityDSL.g:432:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:436:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalEntityDSL.g:437:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalEntityDSL.g:444:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__PropertiesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:448:1: ( ( ( rule__Entity__PropertiesAssignment_4 )* ) )
            // InternalEntityDSL.g:449:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            {
            // InternalEntityDSL.g:449:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            // InternalEntityDSL.g:450:2: ( rule__Entity__PropertiesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 
            }
            // InternalEntityDSL.g:451:2: ( rule__Entity__PropertiesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEntityDSL.g:451:3: rule__Entity__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__PropertiesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalEntityDSL.g:459:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:463:1: ( rule__Entity__Group__5__Impl )
            // InternalEntityDSL.g:464:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalEntityDSL.g:470:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:474:1: ( ( '}' ) )
            // InternalEntityDSL.g:475:1: ( '}' )
            {
            // InternalEntityDSL.g:475:1: ( '}' )
            // InternalEntityDSL.g:476:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalEntityDSL.g:486:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:490:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalEntityDSL.g:491:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalEntityDSL.g:498:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:502:1: ( ( 'extends' ) )
            // InternalEntityDSL.g:503:1: ( 'extends' )
            {
            // InternalEntityDSL.g:503:1: ( 'extends' )
            // InternalEntityDSL.g:504:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalEntityDSL.g:513:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:517:1: ( rule__Entity__Group_2__1__Impl )
            // InternalEntityDSL.g:518:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalEntityDSL.g:524:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:528:1: ( ( ( rule__Entity__ExtendsAssignment_2_1 ) ) )
            // InternalEntityDSL.g:529:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            {
            // InternalEntityDSL.g:529:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            // InternalEntityDSL.g:530:2: ( rule__Entity__ExtendsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            }
            // InternalEntityDSL.g:531:2: ( rule__Entity__ExtendsAssignment_2_1 )
            // InternalEntityDSL.g:531:3: rule__Entity__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ExtendsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalEntityDSL.g:540:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:544:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalEntityDSL.g:545:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalEntityDSL.g:552:1: rule__Property__Group__0__Impl : ( 'property' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:556:1: ( ( 'property' ) )
            // InternalEntityDSL.g:557:1: ( 'property' )
            {
            // InternalEntityDSL.g:557:1: ( 'property' )
            // InternalEntityDSL.g:558:2: 'property'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalEntityDSL.g:567:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:571:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalEntityDSL.g:572:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalEntityDSL.g:579:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:583:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalEntityDSL.g:584:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalEntityDSL.g:584:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalEntityDSL.g:585:2: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // InternalEntityDSL.g:586:2: ( rule__Property__NameAssignment_1 )
            // InternalEntityDSL.g:586:3: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalEntityDSL.g:594:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:598:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalEntityDSL.g:599:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalEntityDSL.g:606:1: rule__Property__Group__2__Impl : ( ':' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:610:1: ( ( ':' ) )
            // InternalEntityDSL.g:611:1: ( ':' )
            {
            // InternalEntityDSL.g:611:1: ( ':' )
            // InternalEntityDSL.g:612:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalEntityDSL.g:621:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:625:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalEntityDSL.g:626:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Property__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalEntityDSL.g:633:1: rule__Property__Group__3__Impl : ( ( rule__Property__TypeAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:637:1: ( ( ( rule__Property__TypeAssignment_3 ) ) )
            // InternalEntityDSL.g:638:1: ( ( rule__Property__TypeAssignment_3 ) )
            {
            // InternalEntityDSL.g:638:1: ( ( rule__Property__TypeAssignment_3 ) )
            // InternalEntityDSL.g:639:2: ( rule__Property__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            }
            // InternalEntityDSL.g:640:2: ( rule__Property__TypeAssignment_3 )
            // InternalEntityDSL.g:640:3: rule__Property__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalEntityDSL.g:648:1: rule__Property__Group__4 : rule__Property__Group__4__Impl ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:652:1: ( rule__Property__Group__4__Impl )
            // InternalEntityDSL.g:653:2: rule__Property__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalEntityDSL.g:659:1: rule__Property__Group__4__Impl : ( ( rule__Property__ManyAssignment_4 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:663:1: ( ( ( rule__Property__ManyAssignment_4 )? ) )
            // InternalEntityDSL.g:664:1: ( ( rule__Property__ManyAssignment_4 )? )
            {
            // InternalEntityDSL.g:664:1: ( ( rule__Property__ManyAssignment_4 )? )
            // InternalEntityDSL.g:665:2: ( rule__Property__ManyAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getManyAssignment_4()); 
            }
            // InternalEntityDSL.g:666:2: ( rule__Property__ManyAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntityDSL.g:666:3: rule__Property__ManyAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__ManyAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getManyAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalEntityDSL.g:675:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:679:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalEntityDSL.g:680:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalEntityDSL.g:687:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:691:1: ( ( RULE_ID ) )
            // InternalEntityDSL.g:692:1: ( RULE_ID )
            {
            // InternalEntityDSL.g:692:1: ( RULE_ID )
            // InternalEntityDSL.g:693:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalEntityDSL.g:702:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:706:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalEntityDSL.g:707:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalEntityDSL.g:713:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:717:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalEntityDSL.g:718:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalEntityDSL.g:718:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalEntityDSL.g:719:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalEntityDSL.g:720:2: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEntityDSL.g:720:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalEntityDSL.g:729:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:733:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalEntityDSL.g:734:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalEntityDSL.g:741:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:745:1: ( ( ( '.' ) ) )
            // InternalEntityDSL.g:746:1: ( ( '.' ) )
            {
            // InternalEntityDSL.g:746:1: ( ( '.' ) )
            // InternalEntityDSL.g:747:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalEntityDSL.g:748:2: ( '.' )
            // InternalEntityDSL.g:748:3: '.'
            {
            match(input,18,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalEntityDSL.g:756:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:760:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalEntityDSL.g:761:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalEntityDSL.g:767:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:771:1: ( ( RULE_ID ) )
            // InternalEntityDSL.g:772:1: ( RULE_ID )
            {
            // InternalEntityDSL.g:772:1: ( RULE_ID )
            // InternalEntityDSL.g:773:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalEntityDSL.g:783:1: rule__Model__ElementsAssignment : ( ruleType ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:787:1: ( ( ruleType ) )
            // InternalEntityDSL.g:788:2: ( ruleType )
            {
            // InternalEntityDSL.g:788:2: ( ruleType )
            // InternalEntityDSL.g:789:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__SimpleType__NameAssignment_1"
    // InternalEntityDSL.g:798:1: rule__SimpleType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:802:1: ( ( ruleEString ) )
            // InternalEntityDSL.g:803:2: ( ruleEString )
            {
            // InternalEntityDSL.g:803:2: ( ruleEString )
            // InternalEntityDSL.g:804:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__NameAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalEntityDSL.g:813:1: rule__Entity__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:817:1: ( ( ruleEString ) )
            // InternalEntityDSL.g:818:2: ( ruleEString )
            {
            // InternalEntityDSL.g:818:2: ( ruleEString )
            // InternalEntityDSL.g:819:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ExtendsAssignment_2_1"
    // InternalEntityDSL.g:828:1: rule__Entity__ExtendsAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:832:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEntityDSL.g:833:2: ( ( ruleQualifiedName ) )
            {
            // InternalEntityDSL.g:833:2: ( ( ruleQualifiedName ) )
            // InternalEntityDSL.g:834:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            }
            // InternalEntityDSL.g:835:3: ( ruleQualifiedName )
            // InternalEntityDSL.g:836:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getExtendsEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ExtendsAssignment_2_1"


    // $ANTLR start "rule__Entity__PropertiesAssignment_4"
    // InternalEntityDSL.g:847:1: rule__Entity__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:851:1: ( ( ruleProperty ) )
            // InternalEntityDSL.g:852:2: ( ruleProperty )
            {
            // InternalEntityDSL.g:852:2: ( ruleProperty )
            // InternalEntityDSL.g:853:3: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__PropertiesAssignment_4"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // InternalEntityDSL.g:862:1: rule__Property__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:866:1: ( ( ruleEString ) )
            // InternalEntityDSL.g:867:2: ( ruleEString )
            {
            // InternalEntityDSL.g:867:2: ( ruleEString )
            // InternalEntityDSL.g:868:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__Property__TypeAssignment_3"
    // InternalEntityDSL.g:877:1: rule__Property__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Property__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:881:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEntityDSL.g:882:2: ( ( ruleQualifiedName ) )
            {
            // InternalEntityDSL.g:882:2: ( ( ruleQualifiedName ) )
            // InternalEntityDSL.g:883:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 
            }
            // InternalEntityDSL.g:884:3: ( ruleQualifiedName )
            // InternalEntityDSL.g:885:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_3"


    // $ANTLR start "rule__Property__ManyAssignment_4"
    // InternalEntityDSL.g:896:1: rule__Property__ManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__Property__ManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:900:1: ( ( ( '[]' ) ) )
            // InternalEntityDSL.g:901:2: ( ( '[]' ) )
            {
            // InternalEntityDSL.g:901:2: ( ( '[]' ) )
            // InternalEntityDSL.g:902:3: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            }
            // InternalEntityDSL.g:903:3: ( '[]' )
            // InternalEntityDSL.g:904:4: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ManyAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});

}