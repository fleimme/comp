package org.xtext.tl.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.tl.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARIABLE", "RULE_SYMBOLES", "RULE_LC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nil'", "'cons'", "'list'", "'hd'", "'tl'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'do'", "'od'", "'in'", "'then'", "'fi'", "'else'", "'and'", "'or'", "'=?'", "'('", "')'", "'while'", "'for'", "'foreach'", "'if'", "'not'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SYMBOLES=5;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_LC=6;
    public static final int RULE_INT=8;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_VARIABLE=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:63:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:64:1: ( ruleModel EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:65:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel76);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel83); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:72:1: ruleModel : ( ( rule__Model__Group__0 )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: ( ( ( rule__Model__Group__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:77:1: ( ( rule__Model__Group__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:77:1: ( ( rule__Model__Group__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:78:1: ( rule__Model__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:79:1: ( rule__Model__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:79:2: rule__Model__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel109);
            	    rule__Model__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
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


    // $ANTLR start "entryRulefunction"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:91:1: entryRulefunction : rulefunction EOF ;
    public final void entryRulefunction() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:92:1: ( rulefunction EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:93:1: rulefunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction137);
            rulefunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction144); if (state.failed) return ;

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
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:100:1: rulefunction : ( ( rule__Function__Group__0 ) ) ;
    public final void rulefunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: ( ( rule__Function__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:1: ( rule__Function__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:107:1: ( rule__Function__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:107:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_rulefunction170);
            rule__Function__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup()); 
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
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRuleDefiniton"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:119:1: entryRuleDefiniton : ruleDefiniton EOF ;
    public final void entryRuleDefiniton() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:120:1: ( ruleDefiniton EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:121:1: ruleDefiniton EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonRule()); 
            }
            pushFollow(FOLLOW_ruleDefiniton_in_entryRuleDefiniton197);
            ruleDefiniton();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefiniton204); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDefiniton"


    // $ANTLR start "ruleDefiniton"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:128:1: ruleDefiniton : ( ( rule__Definiton__Group__0 ) ) ;
    public final void ruleDefiniton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: ( ( ( rule__Definiton__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( ( rule__Definiton__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( ( rule__Definiton__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:1: ( rule__Definiton__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:135:1: ( rule__Definiton__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:135:2: rule__Definiton__Group__0
            {
            pushFollow(FOLLOW_rule__Definiton__Group__0_in_ruleDefiniton230);
            rule__Definiton__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getGroup()); 
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
    // $ANTLR end "ruleDefiniton"


    // $ANTLR start "entryRuleInput"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: ( ruleInput EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:149:1: ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput257);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput264); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:156:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( ( rule__Input__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( ( rule__Input__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( rule__Input__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:163:1: ( rule__Input__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:163:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput290);
            rule__Input__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup()); 
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: ( ruleOutput EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:177:1: ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput317);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput324); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:184:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: ( ( ( rule__Output__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( ( rule__Output__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( ( rule__Output__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( rule__Output__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:191:1: ( rule__Output__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:191:2: rule__Output__Group__0
            {
            pushFollow(FOLLOW_rule__Output__Group__0_in_ruleOutput350);
            rule__Output__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup()); 
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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: entryRuleCommands : ruleCommands EOF ;
    public final void entryRuleCommands() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: ( ruleCommands EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:205:1: ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands377);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands384); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:212:1: ruleCommands : ( ( rule__Commands__Group__0 ) ) ;
    public final void ruleCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: ( ( ( rule__Commands__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( ( rule__Commands__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( ( rule__Commands__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( rule__Commands__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:219:1: ( rule__Commands__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:219:2: rule__Commands__Group__0
            {
            pushFollow(FOLLOW_rule__Commands__Group__0_in_ruleCommands410);
            rule__Commands__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup()); 
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
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleVars"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:231:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: ( ruleVars EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:233:1: ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars437);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars444); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:240:1: ruleVars : ( ( rule__Vars__Group__0 ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: ( ( ( rule__Vars__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( ( rule__Vars__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( ( rule__Vars__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( rule__Vars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ( rule__Vars__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:247:2: rule__Vars__Group__0
            {
            pushFollow(FOLLOW_rule__Vars__Group__0_in_ruleVars470);
            rule__Vars__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup()); 
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
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: entryRuleExprs : ruleExprs EOF ;
    public final void entryRuleExprs() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:260:1: ( ruleExprs EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:261:1: ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs497);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs504); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:268:1: ruleExprs : ( ( rule__Exprs__Group__0 ) ) ;
    public final void ruleExprs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: ( ( ( rule__Exprs__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( ( rule__Exprs__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( ( rule__Exprs__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( rule__Exprs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: ( rule__Exprs__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:275:2: rule__Exprs__Group__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0_in_ruleExprs530);
            rule__Exprs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup()); 
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
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleCommand"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:287:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: ( ruleCommand EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand557);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand564); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:296:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( ( rule__Command__Alternatives ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ( rule__Command__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: ( rule__Command__Alternatives )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:303:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand590);
            rule__Command__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ( ruleExpr EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr617);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr624); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: ( ( ( rule__Expr__Alternatives ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( ( rule__Expr__Alternatives ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( ( rule__Expr__Alternatives ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ( rule__Expr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAlternatives()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:331:1: ( rule__Expr__Alternatives )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:331:2: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Expr__Alternatives_in_ruleExpr650);
            rule__Expr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getAlternatives()); 
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleAnd"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( ruleAnd EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd677);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd684); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: ( ( ( rule__And__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( ( rule__And__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( ( rule__And__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( rule__And__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd710);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( ruleOr EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:373:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr737);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr744); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:380:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( ( rule__Or__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( ( rule__Or__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( rule__Or__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:387:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr770);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleNot"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( ruleNot EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotRule()); 
            }
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot797);
            ruleNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot804); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:408:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: ( ( ( rule__Not__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: ( ( rule__Not__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: ( ( rule__Not__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: ( rule__Not__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:415:1: ( rule__Not__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:415:2: rule__Not__Group__0
            {
            pushFollow(FOLLOW_rule__Not__Group__0_in_ruleNot830);
            rule__Not__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getGroup()); 
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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleEq"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: entryRuleEq : ruleEq EOF ;
    public final void entryRuleEq() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: ( ruleEq EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: ruleEq EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqRule()); 
            }
            pushFollow(FOLLOW_ruleEq_in_entryRuleEq857);
            ruleEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEq864); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEq"


    // $ANTLR start "ruleEq"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: ruleEq : ( ( rule__Eq__Alternatives ) ) ;
    public final void ruleEq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: ( ( ( rule__Eq__Alternatives ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( ( rule__Eq__Alternatives ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( ( rule__Eq__Alternatives ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: ( rule__Eq__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getAlternatives()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: ( rule__Eq__Alternatives )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:443:2: rule__Eq__Alternatives
            {
            pushFollow(FOLLOW_rule__Eq__Alternatives_in_ruleEq890);
            rule__Eq__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEq"


    // $ANTLR start "entryRuleExprTerm"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: entryRuleExprTerm : ruleExprTerm EOF ;
    public final void entryRuleExprTerm() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ( ruleExprTerm EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ruleExprTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermRule()); 
            }
            pushFollow(FOLLOW_ruleExprTerm_in_entryRuleExprTerm917);
            ruleExprTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTermRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTerm924); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprTerm"


    // $ANTLR start "ruleExprTerm"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: ruleExprTerm : ( ( rule__ExprTerm__ExprTermAssignment ) ) ;
    public final void ruleExprTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: ( ( ( rule__ExprTerm__ExprTermAssignment ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( rule__ExprTerm__ExprTermAssignment ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( rule__ExprTerm__ExprTermAssignment ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( rule__ExprTerm__ExprTermAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getExprTermAssignment()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:471:1: ( rule__ExprTerm__ExprTermAssignment )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:471:2: rule__ExprTerm__ExprTermAssignment
            {
            pushFollow(FOLLOW_rule__ExprTerm__ExprTermAssignment_in_ruleExprTerm950);
            rule__ExprTerm__ExprTermAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTermAccess().getExprTermAssignment()); 
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
    // $ANTLR end "ruleExprTerm"


    // $ANTLR start "entryRuleExprSimple"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: entryRuleExprSimple : ruleExprSimple EOF ;
    public final void entryRuleExprSimple() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( ruleExprSimple EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple977);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple984); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:492:1: ruleExprSimple : ( ( rule__ExprSimple__Group__0 ) ) ;
    public final void ruleExprSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: ( ( ( rule__ExprSimple__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( ( rule__ExprSimple__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( ( rule__ExprSimple__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( rule__ExprSimple__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:499:1: ( rule__ExprSimple__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:499:2: rule__ExprSimple__Group__0
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__0_in_ruleExprSimple1010);
            rule__ExprSimple__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getGroup()); 
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
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleLexpr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: entryRuleLexpr : ruleLexpr EOF ;
    public final void entryRuleLexpr() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:512:1: ( ruleLexpr EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:513:1: ruleLexpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprRule()); 
            }
            pushFollow(FOLLOW_ruleLexpr_in_entryRuleLexpr1037);
            ruleLexpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLexpr1044); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLexpr"


    // $ANTLR start "ruleLexpr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: ruleLexpr : ( ( ( rule__Lexpr__Group__0 ) ) ( ( rule__Lexpr__Group__0 )* ) ) ;
    public final void ruleLexpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:2: ( ( ( ( rule__Lexpr__Group__0 ) ) ( ( rule__Lexpr__Group__0 )* ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( ( ( rule__Lexpr__Group__0 ) ) ( ( rule__Lexpr__Group__0 )* ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( ( ( rule__Lexpr__Group__0 ) ) ( ( rule__Lexpr__Group__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( ( rule__Lexpr__Group__0 ) ) ( ( rule__Lexpr__Group__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( ( rule__Lexpr__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: ( rule__Lexpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ( rule__Lexpr__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:2: rule__Lexpr__Group__0
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__0_in_ruleLexpr1072);
            rule__Lexpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getGroup()); 
            }

            }

            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:531:1: ( ( rule__Lexpr__Group__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: ( rule__Lexpr__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:533:1: ( rule__Lexpr__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_LC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:533:2: rule__Lexpr__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Lexpr__Group__0_in_ruleLexpr1084);
            	    rule__Lexpr__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleLexpr"


    // $ANTLR start "rule__Command__Alternatives"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: rule__Command__Alternatives : ( ( ( rule__Command__Group_0__0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__Group_2__0 ) ) | ( ( rule__Command__Group_3__0 ) ) | ( ( rule__Command__Group_4__0 ) ) | ( ( rule__Command__Group_5__0 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( ( rule__Command__Group_0__0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__Group_2__0 ) ) | ( ( rule__Command__Group_3__0 ) ) | ( ( rule__Command__Group_4__0 ) ) | ( ( rule__Command__Group_5__0 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            case 41:
                {
                alt3=5;
                }
                break;
            case 42:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( rule__Command__Group_0__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( rule__Command__Group_0__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__Command__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( rule__Command__Group_0__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:2: rule__Command__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_0__0_in_rule__Command__Alternatives1123);
                    rule__Command__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:557:6: ( ( rule__Command__Group_1__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:557:6: ( ( rule__Command__Group_1__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: ( rule__Command__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: ( rule__Command__Group_1__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:2: rule__Command__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1141);
                    rule__Command__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:563:6: ( ( rule__Command__Group_2__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:563:6: ( ( rule__Command__Group_2__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: ( rule__Command__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_2()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( rule__Command__Group_2__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:2: rule__Command__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_2__0_in_rule__Command__Alternatives1159);
                    rule__Command__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:569:6: ( ( rule__Command__Group_3__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:569:6: ( ( rule__Command__Group_3__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( rule__Command__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_3()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: ( rule__Command__Group_3__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:2: rule__Command__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_3__0_in_rule__Command__Alternatives1177);
                    rule__Command__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:6: ( ( rule__Command__Group_4__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:6: ( ( rule__Command__Group_4__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:576:1: ( rule__Command__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_4()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: ( rule__Command__Group_4__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:2: rule__Command__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_4__0_in_rule__Command__Alternatives1195);
                    rule__Command__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:6: ( ( rule__Command__Group_5__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:6: ( ( rule__Command__Group_5__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( rule__Command__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_5()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( rule__Command__Group_5__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:2: rule__Command__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_5__0_in_rule__Command__Alternatives1213);
                    rule__Command__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__Expr__Alternatives"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: rule__Expr__Alternatives : ( ( ( rule__Expr__ExprSimpleAssignment_0 ) ) | ( ( rule__Expr__ExpEtAssignment_1 ) ) | ( ( rule__Expr__ExpTerminaleAssignment_2 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ( ( ( rule__Expr__ExprSimpleAssignment_0 ) ) | ( ( rule__Expr__ExpEtAssignment_1 ) ) | ( ( rule__Expr__ExpTerminaleAssignment_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__Expr__ExprSimpleAssignment_0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__Expr__ExprSimpleAssignment_0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ( rule__Expr__ExprSimpleAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExprSimpleAssignment_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( rule__Expr__ExprSimpleAssignment_0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:2: rule__Expr__ExprSimpleAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expr__ExprSimpleAssignment_0_in_rule__Expr__Alternatives1246);
                    rule__Expr__ExprSimpleAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExprSimpleAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( rule__Expr__ExpEtAssignment_1 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( rule__Expr__ExpEtAssignment_1 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ( rule__Expr__ExpEtAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExpEtAssignment_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: ( rule__Expr__ExpEtAssignment_1 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: rule__Expr__ExpEtAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExpEtAssignment_1_in_rule__Expr__Alternatives1264);
                    rule__Expr__ExpEtAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExpEtAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:6: ( ( rule__Expr__ExpTerminaleAssignment_2 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:6: ( ( rule__Expr__ExpTerminaleAssignment_2 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: ( rule__Expr__ExpTerminaleAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExpTerminaleAssignment_2()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( rule__Expr__ExpTerminaleAssignment_2 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:2: rule__Expr__ExpTerminaleAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Expr__ExpTerminaleAssignment_2_in_rule__Expr__Alternatives1282);
                    rule__Expr__ExpTerminaleAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExpTerminaleAssignment_2()); 
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
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__Eq__Alternatives"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: rule__Eq__Alternatives : ( ( ( rule__Eq__Group_0__0 ) ) | ( ( rule__Eq__Group_1__0 ) ) );
    public final void rule__Eq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ( ( ( rule__Eq__Group_0__0 ) ) | ( ( rule__Eq__Group_1__0 ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( ( rule__Eq__Group_0__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( ( rule__Eq__Group_0__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:626:1: ( rule__Eq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getGroup_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: ( rule__Eq__Group_0__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:627:2: rule__Eq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Eq__Group_0__0_in_rule__Eq__Alternatives1315);
                    rule__Eq__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:6: ( ( rule__Eq__Group_1__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:6: ( ( rule__Eq__Group_1__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( rule__Eq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getGroup_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( rule__Eq__Group_1__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:2: rule__Eq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Eq__Group_1__0_in_rule__Eq__Alternatives1333);
                    rule__Eq__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Eq__Alternatives"


    // $ANTLR start "rule__Eq__ExprEq1Alternatives_0_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:642:1: rule__Eq__ExprEq1Alternatives_0_0_0 : ( ( ruleExprSimple ) | ( ruleExprTerm ) );
    public final void rule__Eq__ExprEq1Alternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( ( ruleExprSimple ) | ( ruleExprTerm ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_VARIABLE && LA6_0<=RULE_SYMBOLES)||LA6_0==14) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprEq1ExprSimpleParserRuleCall_0_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__ExprEq1Alternatives_0_0_01366);
                    ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprEq1ExprSimpleParserRuleCall_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:653:6: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:653:6: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprEq1ExprTermParserRuleCall_0_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__ExprEq1Alternatives_0_0_01383);
                    ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprEq1ExprTermParserRuleCall_0_0_0_1()); 
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
    // $ANTLR end "rule__Eq__ExprEq1Alternatives_0_0_0"


    // $ANTLR start "rule__Eq__ExprEq2Alternatives_0_4_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: rule__Eq__ExprEq2Alternatives_0_4_0 : ( ( ruleExprSimple ) | ( ruleExprTerm ) );
    public final void rule__Eq__ExprEq2Alternatives_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( ( ruleExprSimple ) | ( ruleExprTerm ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_VARIABLE && LA7_0<=RULE_SYMBOLES)||LA7_0==14) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprEq2ExprSimpleParserRuleCall_0_4_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__ExprEq2Alternatives_0_4_01415);
                    ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprEq2ExprSimpleParserRuleCall_0_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:6: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:6: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprEq2ExprTermParserRuleCall_0_4_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__ExprEq2Alternatives_0_4_01432);
                    ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprEq2ExprTermParserRuleCall_0_4_0_1()); 
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
    // $ANTLR end "rule__Eq__ExprEq2Alternatives_0_4_0"


    // $ANTLR start "rule__Eq__ExpAlternatives_1_1_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: rule__Eq__ExpAlternatives_1_1_0 : ( ( ruleExprTerm ) | ( ruleExprSimple ) );
    public final void rule__Eq__ExpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( ruleExprTerm ) | ( ruleExprSimple ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_VARIABLE && LA8_0<=RULE_SYMBOLES)||LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExpExprTermParserRuleCall_1_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__ExpAlternatives_1_1_01464);
                    ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExpExprTermParserRuleCall_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:6: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:6: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExpExprSimpleParserRuleCall_1_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__ExpAlternatives_1_1_01481);
                    ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExpExprSimpleParserRuleCall_1_1_0_1()); 
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
    // $ANTLR end "rule__Eq__ExpAlternatives_1_1_0"


    // $ANTLR start "rule__ExprTerm__ExprTermAlternatives_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: rule__ExprTerm__ExprTermAlternatives_0 : ( ( 'nil' ) | ( RULE_VARIABLE ) | ( RULE_SYMBOLES ) );
    public final void rule__ExprTerm__ExprTermAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: ( ( 'nil' ) | ( RULE_VARIABLE ) | ( RULE_SYMBOLES ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt9=2;
                }
                break;
            case RULE_SYMBOLES:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( 'nil' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( 'nil' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: 'nil'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getExprTermNilKeyword_0_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__ExprTerm__ExprTermAlternatives_01514); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getExprTermNilKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:6: ( RULE_VARIABLE )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:6: ( RULE_VARIABLE )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: RULE_VARIABLE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getExprTermVARIABLETerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__ExprTerm__ExprTermAlternatives_01533); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getExprTermVARIABLETerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:6: ( RULE_SYMBOLES )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:6: ( RULE_SYMBOLES )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: RULE_SYMBOLES
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getExprTermSYMBOLESTerminalRuleCall_0_2()); 
                    }
                    match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rule__ExprTerm__ExprTermAlternatives_01550); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getExprTermSYMBOLESTerminalRuleCall_0_2()); 
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
    // $ANTLR end "rule__ExprTerm__ExprTermAlternatives_0"


    // $ANTLR start "rule__ExprSimple__Alternatives_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: rule__ExprSimple__Alternatives_1 : ( ( ( rule__ExprSimple__Group_1_0__0 ) ) | ( ( rule__ExprSimple__Group_1_1__0 ) ) );
    public final void rule__ExprSimple__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( ( ( rule__ExprSimple__Group_1_0__0 ) ) | ( ( rule__ExprSimple__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=15 && LA10_0<=16)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=17 && LA10_0<=18)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( ( rule__ExprSimple__Group_1_0__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( ( rule__ExprSimple__Group_1_0__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:744:1: ( rule__ExprSimple__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( rule__ExprSimple__Group_1_0__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:2: rule__ExprSimple__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__0_in_rule__ExprSimple__Alternatives_11582);
                    rule__ExprSimple__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:6: ( ( rule__ExprSimple__Group_1_1__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:6: ( ( rule__ExprSimple__Group_1_1__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( rule__ExprSimple__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: ( rule__ExprSimple__Group_1_1__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:2: rule__ExprSimple__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__0_in_rule__ExprSimple__Alternatives_11600);
                    rule__ExprSimple__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__ExprSimple__Alternatives_1"


    // $ANTLR start "rule__ExprSimple__MotAlternatives_1_0_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: rule__ExprSimple__MotAlternatives_1_0_0_0 : ( ( 'cons' ) | ( 'list' ) );
    public final void rule__ExprSimple__MotAlternatives_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ( ( 'cons' ) | ( 'list' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( 'cons' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( 'cons' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: 'cons'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotConsKeyword_1_0_0_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__ExprSimple__MotAlternatives_1_0_0_01634); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotConsKeyword_1_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:6: ( 'list' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:6: ( 'list' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: 'list'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotListKeyword_1_0_0_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__ExprSimple__MotAlternatives_1_0_0_01654); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotListKeyword_1_0_0_0_1()); 
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
    // $ANTLR end "rule__ExprSimple__MotAlternatives_1_0_0_0"


    // $ANTLR start "rule__ExprSimple__MotAlternatives_1_1_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: rule__ExprSimple__MotAlternatives_1_1_0_0 : ( ( 'hd' ) | ( 'tl' ) );
    public final void rule__ExprSimple__MotAlternatives_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( ( 'hd' ) | ( 'tl' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( 'hd' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( 'hd' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: 'hd'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotHdKeyword_1_1_0_0_0()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__ExprSimple__MotAlternatives_1_1_0_01689); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotHdKeyword_1_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:6: ( 'tl' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:6: ( 'tl' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:800:1: 'tl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotTlKeyword_1_1_0_0_1()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__ExprSimple__MotAlternatives_1_1_0_01709); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotTlKeyword_1_1_0_0_1()); 
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
    // $ANTLR end "rule__ExprSimple__MotAlternatives_1_1_0_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:819:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01741);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01744);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: rule__Model__Group__0__Impl : ( ( rule__Model__ModelAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( ( rule__Model__ModelAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( ( rule__Model__ModelAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( ( rule__Model__ModelAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__Model__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( rule__Model__ModelAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:2: rule__Model__ModelAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ModelAssignment_0_in_rule__Model__Group__0__Impl1771);
            rule__Model__ModelAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelAssignment_0()); 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: ( rule__Model__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:848:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11801);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: rule__Model__Group__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLCTerminalRuleCall_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( RULE_LC )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Model__Group__1__Impl1829); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLCTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:880:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01864);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01867);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: ( ( 'function' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( 'function' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( 'function' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Function__Group__0__Impl1895); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
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
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11926);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11929);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: rule__Function__Group__1__Impl : ( RULE_LC ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Function__Group__1__Impl1956); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21985);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21988);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: rule__Function__Group__2__Impl : ( ( rule__Function__FunNameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( ( ( rule__Function__FunNameAssignment_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( ( rule__Function__FunNameAssignment_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( ( rule__Function__FunNameAssignment_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( rule__Function__FunNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunNameAssignment_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( rule__Function__FunNameAssignment_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:2: rule__Function__FunNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__FunNameAssignment_2_in_rule__Function__Group__2__Impl2015);
            rule__Function__FunNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFunNameAssignment_2()); 
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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:964:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:969:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32045);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32048);
            rule__Function__Group__4();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: rule__Function__Group__3__Impl : ( ':' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ( ( ':' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( ':' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( ':' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__Function__Group__3__Impl2076); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42107);
            rule__Function__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42110);
            rule__Function__Group__5();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: rule__Function__Group__4__Impl : ( RULE_LC ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_4()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Function__Group__4__Impl2137); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( rule__Function__Group__5__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52166);
            rule__Function__Group__5__Impl();

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
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: rule__Function__Group__5__Impl : ( ( rule__Function__DefAssignment_5 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( ( ( rule__Function__DefAssignment_5 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: ( ( rule__Function__DefAssignment_5 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: ( ( rule__Function__DefAssignment_5 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( rule__Function__DefAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefAssignment_5()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( rule__Function__DefAssignment_5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:2: rule__Function__DefAssignment_5
            {
            pushFollow(FOLLOW_rule__Function__DefAssignment_5_in_rule__Function__Group__5__Impl2193);
            rule__Function__DefAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDefAssignment_5()); 
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
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Definiton__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:1: rule__Definiton__Group__0 : rule__Definiton__Group__0__Impl rule__Definiton__Group__1 ;
    public final void rule__Definiton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( rule__Definiton__Group__0__Impl rule__Definiton__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:2: rule__Definiton__Group__0__Impl rule__Definiton__Group__1
            {
            pushFollow(FOLLOW_rule__Definiton__Group__0__Impl_in_rule__Definiton__Group__02235);
            rule__Definiton__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__1_in_rule__Definiton__Group__02238);
            rule__Definiton__Group__1();

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
    // $ANTLR end "rule__Definiton__Group__0"


    // $ANTLR start "rule__Definiton__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: rule__Definiton__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definiton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( ( 'read' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( 'read' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( 'read' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getReadKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Definiton__Group__0__Impl2266); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getReadKeyword_0()); 
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
    // $ANTLR end "rule__Definiton__Group__0__Impl"


    // $ANTLR start "rule__Definiton__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:1: rule__Definiton__Group__1 : rule__Definiton__Group__1__Impl rule__Definiton__Group__2 ;
    public final void rule__Definiton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: ( rule__Definiton__Group__1__Impl rule__Definiton__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:2: rule__Definiton__Group__1__Impl rule__Definiton__Group__2
            {
            pushFollow(FOLLOW_rule__Definiton__Group__1__Impl_in_rule__Definiton__Group__12297);
            rule__Definiton__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__2_in_rule__Definiton__Group__12300);
            rule__Definiton__Group__2();

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
    // $ANTLR end "rule__Definiton__Group__1"


    // $ANTLR start "rule__Definiton__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: rule__Definiton__Group__1__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__1__Impl2327); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Definiton__Group__1__Impl"


    // $ANTLR start "rule__Definiton__Group__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: rule__Definiton__Group__2 : rule__Definiton__Group__2__Impl rule__Definiton__Group__3 ;
    public final void rule__Definiton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( rule__Definiton__Group__2__Impl rule__Definiton__Group__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:2: rule__Definiton__Group__2__Impl rule__Definiton__Group__3
            {
            pushFollow(FOLLOW_rule__Definiton__Group__2__Impl_in_rule__Definiton__Group__22356);
            rule__Definiton__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__3_in_rule__Definiton__Group__22359);
            rule__Definiton__Group__3();

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
    // $ANTLR end "rule__Definiton__Group__2"


    // $ANTLR start "rule__Definiton__Group__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:1: rule__Definiton__Group__2__Impl : ( ( rule__Definiton__InputVarsAssignment_2 ) ) ;
    public final void rule__Definiton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( ( ( rule__Definiton__InputVarsAssignment_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( ( rule__Definiton__InputVarsAssignment_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( ( rule__Definiton__InputVarsAssignment_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( rule__Definiton__InputVarsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getInputVarsAssignment_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( rule__Definiton__InputVarsAssignment_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:2: rule__Definiton__InputVarsAssignment_2
            {
            pushFollow(FOLLOW_rule__Definiton__InputVarsAssignment_2_in_rule__Definiton__Group__2__Impl2386);
            rule__Definiton__InputVarsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getInputVarsAssignment_2()); 
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
    // $ANTLR end "rule__Definiton__Group__2__Impl"


    // $ANTLR start "rule__Definiton__Group__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:1: rule__Definiton__Group__3 : rule__Definiton__Group__3__Impl rule__Definiton__Group__4 ;
    public final void rule__Definiton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:1: ( rule__Definiton__Group__3__Impl rule__Definiton__Group__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:2: rule__Definiton__Group__3__Impl rule__Definiton__Group__4
            {
            pushFollow(FOLLOW_rule__Definiton__Group__3__Impl_in_rule__Definiton__Group__32416);
            rule__Definiton__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__4_in_rule__Definiton__Group__32419);
            rule__Definiton__Group__4();

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
    // $ANTLR end "rule__Definiton__Group__3"


    // $ANTLR start "rule__Definiton__Group__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: rule__Definiton__Group__3__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__3__Impl2446); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__Definiton__Group__3__Impl"


    // $ANTLR start "rule__Definiton__Group__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: rule__Definiton__Group__4 : rule__Definiton__Group__4__Impl rule__Definiton__Group__5 ;
    public final void rule__Definiton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1186:1: ( rule__Definiton__Group__4__Impl rule__Definiton__Group__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:2: rule__Definiton__Group__4__Impl rule__Definiton__Group__5
            {
            pushFollow(FOLLOW_rule__Definiton__Group__4__Impl_in_rule__Definiton__Group__42475);
            rule__Definiton__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__5_in_rule__Definiton__Group__42478);
            rule__Definiton__Group__5();

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
    // $ANTLR end "rule__Definiton__Group__4"


    // $ANTLR start "rule__Definiton__Group__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: rule__Definiton__Group__4__Impl : ( '%' ) ;
    public final void rule__Definiton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: ( ( '%' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: ( '%' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: ( '%' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getPercentSignKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__Definiton__Group__4__Impl2506); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getPercentSignKeyword_4()); 
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
    // $ANTLR end "rule__Definiton__Group__4__Impl"


    // $ANTLR start "rule__Definiton__Group__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: rule__Definiton__Group__5 : rule__Definiton__Group__5__Impl rule__Definiton__Group__6 ;
    public final void rule__Definiton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( rule__Definiton__Group__5__Impl rule__Definiton__Group__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:2: rule__Definiton__Group__5__Impl rule__Definiton__Group__6
            {
            pushFollow(FOLLOW_rule__Definiton__Group__5__Impl_in_rule__Definiton__Group__52537);
            rule__Definiton__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__6_in_rule__Definiton__Group__52540);
            rule__Definiton__Group__6();

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
    // $ANTLR end "rule__Definiton__Group__5"


    // $ANTLR start "rule__Definiton__Group__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: rule__Definiton__Group__5__Impl : ( ( rule__Definiton__CommandListAssignment_5 ) ) ;
    public final void rule__Definiton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( ( ( rule__Definiton__CommandListAssignment_5 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( ( rule__Definiton__CommandListAssignment_5 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( ( rule__Definiton__CommandListAssignment_5 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( rule__Definiton__CommandListAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getCommandListAssignment_5()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( rule__Definiton__CommandListAssignment_5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:2: rule__Definiton__CommandListAssignment_5
            {
            pushFollow(FOLLOW_rule__Definiton__CommandListAssignment_5_in_rule__Definiton__Group__5__Impl2567);
            rule__Definiton__CommandListAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getCommandListAssignment_5()); 
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
    // $ANTLR end "rule__Definiton__Group__5__Impl"


    // $ANTLR start "rule__Definiton__Group__6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: rule__Definiton__Group__6 : rule__Definiton__Group__6__Impl rule__Definiton__Group__7 ;
    public final void rule__Definiton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( rule__Definiton__Group__6__Impl rule__Definiton__Group__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:2: rule__Definiton__Group__6__Impl rule__Definiton__Group__7
            {
            pushFollow(FOLLOW_rule__Definiton__Group__6__Impl_in_rule__Definiton__Group__62597);
            rule__Definiton__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__7_in_rule__Definiton__Group__62600);
            rule__Definiton__Group__7();

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
    // $ANTLR end "rule__Definiton__Group__6"


    // $ANTLR start "rule__Definiton__Group__6__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: rule__Definiton__Group__6__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_6()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__6__Impl2627); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_6()); 
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
    // $ANTLR end "rule__Definiton__Group__6__Impl"


    // $ANTLR start "rule__Definiton__Group__7"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: rule__Definiton__Group__7 : rule__Definiton__Group__7__Impl rule__Definiton__Group__8 ;
    public final void rule__Definiton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( rule__Definiton__Group__7__Impl rule__Definiton__Group__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:2: rule__Definiton__Group__7__Impl rule__Definiton__Group__8
            {
            pushFollow(FOLLOW_rule__Definiton__Group__7__Impl_in_rule__Definiton__Group__72656);
            rule__Definiton__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__8_in_rule__Definiton__Group__72659);
            rule__Definiton__Group__8();

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
    // $ANTLR end "rule__Definiton__Group__7"


    // $ANTLR start "rule__Definiton__Group__7__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1283:1: rule__Definiton__Group__7__Impl : ( '%' ) ;
    public final void rule__Definiton__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: ( ( '%' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( '%' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( '%' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getPercentSignKeyword_7()); 
            }
            match(input,22,FOLLOW_22_in_rule__Definiton__Group__7__Impl2687); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getPercentSignKeyword_7()); 
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
    // $ANTLR end "rule__Definiton__Group__7__Impl"


    // $ANTLR start "rule__Definiton__Group__8"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: rule__Definiton__Group__8 : rule__Definiton__Group__8__Impl rule__Definiton__Group__9 ;
    public final void rule__Definiton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( rule__Definiton__Group__8__Impl rule__Definiton__Group__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:2: rule__Definiton__Group__8__Impl rule__Definiton__Group__9
            {
            pushFollow(FOLLOW_rule__Definiton__Group__8__Impl_in_rule__Definiton__Group__82718);
            rule__Definiton__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__9_in_rule__Definiton__Group__82721);
            rule__Definiton__Group__9();

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
    // $ANTLR end "rule__Definiton__Group__8"


    // $ANTLR start "rule__Definiton__Group__8__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: rule__Definiton__Group__8__Impl : ( 'write' ) ;
    public final void rule__Definiton__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: ( ( 'write' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( 'write' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( 'write' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getWriteKeyword_8()); 
            }
            match(input,23,FOLLOW_23_in_rule__Definiton__Group__8__Impl2749); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getWriteKeyword_8()); 
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
    // $ANTLR end "rule__Definiton__Group__8__Impl"


    // $ANTLR start "rule__Definiton__Group__9"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: rule__Definiton__Group__9 : rule__Definiton__Group__9__Impl rule__Definiton__Group__10 ;
    public final void rule__Definiton__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ( rule__Definiton__Group__9__Impl rule__Definiton__Group__10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:2: rule__Definiton__Group__9__Impl rule__Definiton__Group__10
            {
            pushFollow(FOLLOW_rule__Definiton__Group__9__Impl_in_rule__Definiton__Group__92780);
            rule__Definiton__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__10_in_rule__Definiton__Group__92783);
            rule__Definiton__Group__10();

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
    // $ANTLR end "rule__Definiton__Group__9"


    // $ANTLR start "rule__Definiton__Group__9__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1345:1: rule__Definiton__Group__9__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_9()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__9__Impl2810); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_9()); 
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
    // $ANTLR end "rule__Definiton__Group__9__Impl"


    // $ANTLR start "rule__Definiton__Group__10"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: rule__Definiton__Group__10 : rule__Definiton__Group__10__Impl ;
    public final void rule__Definiton__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( rule__Definiton__Group__10__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:2: rule__Definiton__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Definiton__Group__10__Impl_in_rule__Definiton__Group__102839);
            rule__Definiton__Group__10__Impl();

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
    // $ANTLR end "rule__Definiton__Group__10"


    // $ANTLR start "rule__Definiton__Group__10__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:1: rule__Definiton__Group__10__Impl : ( ( rule__Definiton__OutputVarsAssignment_10 ) ) ;
    public final void rule__Definiton__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: ( ( ( rule__Definiton__OutputVarsAssignment_10 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: ( ( rule__Definiton__OutputVarsAssignment_10 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: ( ( rule__Definiton__OutputVarsAssignment_10 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: ( rule__Definiton__OutputVarsAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getOutputVarsAssignment_10()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:1: ( rule__Definiton__OutputVarsAssignment_10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:2: rule__Definiton__OutputVarsAssignment_10
            {
            pushFollow(FOLLOW_rule__Definiton__OutputVarsAssignment_10_in_rule__Definiton__Group__10__Impl2866);
            rule__Definiton__OutputVarsAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getOutputVarsAssignment_10()); 
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
    // $ANTLR end "rule__Definiton__Group__10__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02918);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02921);
            rule__Input__Group__1();

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
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: rule__Input__Group__0__Impl : ( ( rule__Input__VAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( ( ( rule__Input__VAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( ( rule__Input__VAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( ( rule__Input__VAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: ( rule__Input__VAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:1: ( rule__Input__VAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:2: rule__Input__VAssignment_0
            {
            pushFollow(FOLLOW_rule__Input__VAssignment_0_in_rule__Input__Group__0__Impl2948);
            rule__Input__VAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVAssignment_0()); 
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
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: ( rule__Input__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12978);
            rule__Input__Group__1__Impl();

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
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: rule__Input__Group__1__Impl : ( ( rule__Input__Group_1__0 )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( ( ( rule__Input__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ( rule__Input__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ( rule__Input__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( rule__Input__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:1: ( rule__Input__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:2: rule__Input__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3005);
            	    rule__Input__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: rule__Input__Group_1__0 : rule__Input__Group_1__0__Impl rule__Input__Group_1__1 ;
    public final void rule__Input__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: ( rule__Input__Group_1__0__Impl rule__Input__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:2: rule__Input__Group_1__0__Impl rule__Input__Group_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03040);
            rule__Input__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03043);
            rule__Input__Group_1__1();

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
    // $ANTLR end "rule__Input__Group_1__0"


    // $ANTLR start "rule__Input__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: rule__Input__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Input__Group_1__0__Impl3071); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Input__Group_1__0__Impl"


    // $ANTLR start "rule__Input__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: rule__Input__Group_1__1 : rule__Input__Group_1__1__Impl rule__Input__Group_1__2 ;
    public final void rule__Input__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: ( rule__Input__Group_1__1__Impl rule__Input__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:2: rule__Input__Group_1__1__Impl rule__Input__Group_1__2
            {
            pushFollow(FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13102);
            rule__Input__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__2_in_rule__Input__Group_1__13105);
            rule__Input__Group_1__2();

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
    // $ANTLR end "rule__Input__Group_1__1"


    // $ANTLR start "rule__Input__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: rule__Input__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Input__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1522:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( RULE_LC )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LC) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Input__Group_1__1__Impl3133); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__Input__Group_1__1__Impl"


    // $ANTLR start "rule__Input__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: rule__Input__Group_1__2 : rule__Input__Group_1__2__Impl ;
    public final void rule__Input__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: ( rule__Input__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:2: rule__Input__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_1__2__Impl_in_rule__Input__Group_1__23164);
            rule__Input__Group_1__2__Impl();

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
    // $ANTLR end "rule__Input__Group_1__2"


    // $ANTLR start "rule__Input__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: rule__Input__Group_1__2__Impl : ( ( rule__Input__V2Assignment_1_2 ) ) ;
    public final void rule__Input__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( ( ( rule__Input__V2Assignment_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( ( rule__Input__V2Assignment_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( ( rule__Input__V2Assignment_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: ( rule__Input__V2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getV2Assignment_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: ( rule__Input__V2Assignment_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:2: rule__Input__V2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__Input__V2Assignment_1_2_in_rule__Input__Group_1__2__Impl3191);
            rule__Input__V2Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getV2Assignment_1_2()); 
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
    // $ANTLR end "rule__Input__Group_1__2__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03227);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03230);
            rule__Output__Group__1();

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
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: rule__Output__Group__0__Impl : ( ( rule__Output__VAssignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:1: ( ( ( rule__Output__VAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( ( rule__Output__VAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( ( rule__Output__VAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( rule__Output__VAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( rule__Output__VAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:2: rule__Output__VAssignment_0
            {
            pushFollow(FOLLOW_rule__Output__VAssignment_0_in_rule__Output__Group__0__Impl3257);
            rule__Output__VAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVAssignment_0()); 
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
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:1: ( rule__Output__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1601:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13287);
            rule__Output__Group__1__Impl();

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
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: rule__Output__Group__1__Impl : ( ( rule__Output__Group_1__0 )* ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:1: ( ( ( rule__Output__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( ( rule__Output__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( ( rule__Output__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( rule__Output__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( rule__Output__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:2: rule__Output__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3314);
            	    rule__Output__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: rule__Output__Group_1__0 : rule__Output__Group_1__0__Impl rule__Output__Group_1__1 ;
    public final void rule__Output__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( rule__Output__Group_1__0__Impl rule__Output__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:2: rule__Output__Group_1__0__Impl rule__Output__Group_1__1
            {
            pushFollow(FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03349);
            rule__Output__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03352);
            rule__Output__Group_1__1();

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
    // $ANTLR end "rule__Output__Group_1__0"


    // $ANTLR start "rule__Output__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1640:1: rule__Output__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Output__Group_1__0__Impl3380); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Output__Group_1__0__Impl"


    // $ANTLR start "rule__Output__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: rule__Output__Group_1__1 : rule__Output__Group_1__1__Impl rule__Output__Group_1__2 ;
    public final void rule__Output__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( rule__Output__Group_1__1__Impl rule__Output__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:2: rule__Output__Group_1__1__Impl rule__Output__Group_1__2
            {
            pushFollow(FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13411);
            rule__Output__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__2_in_rule__Output__Group_1__13414);
            rule__Output__Group_1__2();

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
    // $ANTLR end "rule__Output__Group_1__1"


    // $ANTLR start "rule__Output__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: rule__Output__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Output__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( RULE_LC )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Output__Group_1__1__Impl3442); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__Output__Group_1__1__Impl"


    // $ANTLR start "rule__Output__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: rule__Output__Group_1__2 : rule__Output__Group_1__2__Impl ;
    public final void rule__Output__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( rule__Output__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:2: rule__Output__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_1__2__Impl_in_rule__Output__Group_1__23473);
            rule__Output__Group_1__2__Impl();

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
    // $ANTLR end "rule__Output__Group_1__2"


    // $ANTLR start "rule__Output__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: rule__Output__Group_1__2__Impl : ( ( rule__Output__V2Assignment_1_2 ) ) ;
    public final void rule__Output__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( ( ( rule__Output__V2Assignment_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( ( rule__Output__V2Assignment_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( ( rule__Output__V2Assignment_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: ( rule__Output__V2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getV2Assignment_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:1: ( rule__Output__V2Assignment_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:2: rule__Output__V2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__Output__V2Assignment_1_2_in_rule__Output__Group_1__2__Impl3500);
            rule__Output__V2Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getV2Assignment_1_2()); 
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
    // $ANTLR end "rule__Output__Group_1__2__Impl"


    // $ANTLR start "rule__Commands__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03536);
            rule__Commands__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03539);
            rule__Commands__Group__1();

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
    // $ANTLR end "rule__Commands__Group__0"


    // $ANTLR start "rule__Commands__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1734:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__CAssignment_0 ) ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( ( ( rule__Commands__CAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( ( rule__Commands__CAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( ( rule__Commands__CAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( rule__Commands__CAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( rule__Commands__CAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:2: rule__Commands__CAssignment_0
            {
            pushFollow(FOLLOW_rule__Commands__CAssignment_0_in_rule__Commands__Group__0__Impl3566);
            rule__Commands__CAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCAssignment_0()); 
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
    // $ANTLR end "rule__Commands__Group__0__Impl"


    // $ANTLR start "rule__Commands__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ( rule__Commands__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13596);
            rule__Commands__Group__1__Impl();

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
    // $ANTLR end "rule__Commands__Group__1"


    // $ANTLR start "rule__Commands__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__Group_1__0 )* ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: ( ( ( rule__Commands__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( ( rule__Commands__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( ( rule__Commands__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( rule__Commands__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: ( rule__Commands__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:2: rule__Commands__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl3623);
            	    rule__Commands__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Commands__Group__1__Impl"


    // $ANTLR start "rule__Commands__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: rule__Commands__Group_1__0 : rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 ;
    public final void rule__Commands__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:2: rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__03658);
            rule__Commands__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__03661);
            rule__Commands__Group_1__1();

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
    // $ANTLR end "rule__Commands__Group_1__0"


    // $ANTLR start "rule__Commands__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: rule__Commands__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commands__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( ( ';' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( ';' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( ';' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Commands__Group_1__0__Impl3689); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
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
    // $ANTLR end "rule__Commands__Group_1__0__Impl"


    // $ANTLR start "rule__Commands__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:1: rule__Commands__Group_1__1 : rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 ;
    public final void rule__Commands__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1818:1: ( rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:2: rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__13720);
            rule__Commands__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__13723);
            rule__Commands__Group_1__2();

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
    // $ANTLR end "rule__Commands__Group_1__1"


    // $ANTLR start "rule__Commands__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: rule__Commands__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Commands__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( RULE_LC )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LC) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Commands__Group_1__1__Impl3751); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__Commands__Group_1__1__Impl"


    // $ANTLR start "rule__Commands__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: rule__Commands__Group_1__2 : rule__Commands__Group_1__2__Impl ;
    public final void rule__Commands__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( rule__Commands__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:2: rule__Commands__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__23782);
            rule__Commands__Group_1__2__Impl();

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
    // $ANTLR end "rule__Commands__Group_1__2"


    // $ANTLR start "rule__Commands__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: rule__Commands__Group_1__2__Impl : ( ( rule__Commands__CAssignment_1_2 ) ) ;
    public final void rule__Commands__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( ( ( rule__Commands__CAssignment_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( rule__Commands__CAssignment_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( rule__Commands__CAssignment_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( rule__Commands__CAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCAssignment_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ( rule__Commands__CAssignment_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:2: rule__Commands__CAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Commands__CAssignment_1_2_in_rule__Commands__Group_1__2__Impl3809);
            rule__Commands__CAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCAssignment_1_2()); 
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
    // $ANTLR end "rule__Commands__Group_1__2__Impl"


    // $ANTLR start "rule__Vars__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__03845);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__03848);
            rule__Vars__Group__1();

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
    // $ANTLR end "rule__Vars__Group__0"


    // $ANTLR start "rule__Vars__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: rule__Vars__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__Group__0__Impl3875); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Vars__Group__0__Impl"


    // $ANTLR start "rule__Vars__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: ( rule__Vars__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__13904);
            rule__Vars__Group__1__Impl();

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
    // $ANTLR end "rule__Vars__Group__1"


    // $ANTLR start "rule__Vars__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )? ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( ( ( rule__Vars__Group_1__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( rule__Vars__Group_1__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( rule__Vars__Group_1__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( rule__Vars__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: ( rule__Vars__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:2: rule__Vars__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl3931);
                    rule__Vars__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Vars__Group__1__Impl"


    // $ANTLR start "rule__Vars__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__03966);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__03969);
            rule__Vars__Group_1__1();

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
    // $ANTLR end "rule__Vars__Group_1__0"


    // $ANTLR start "rule__Vars__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Vars__Group_1__0__Impl3997); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Vars__Group_1__0__Impl"


    // $ANTLR start "rule__Vars__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:1: ( rule__Vars__Group_1__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:2: rule__Vars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__14028);
            rule__Vars__Group_1__1__Impl();

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
    // $ANTLR end "rule__Vars__Group_1__1"


    // $ANTLR start "rule__Vars__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: rule__Vars__Group_1__1__Impl : ( ruleVars ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( ruleVars ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( ruleVars )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( ruleVars )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarsParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Vars__Group_1__1__Impl4055);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVarsParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__Vars__Group_1__1__Impl"


    // $ANTLR start "rule__Exprs__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04088);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04091);
            rule__Exprs__Group__1();

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
    // $ANTLR end "rule__Exprs__Group__0"


    // $ANTLR start "rule__Exprs__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: rule__Exprs__Group__0__Impl : ( ruleExpr ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__Group__0__Impl4118);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExprParserRuleCall_0()); 
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
    // $ANTLR end "rule__Exprs__Group__0__Impl"


    // $ANTLR start "rule__Exprs__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( rule__Exprs__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14147);
            rule__Exprs__Group__1__Impl();

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
    // $ANTLR end "rule__Exprs__Group__1"


    // $ANTLR start "rule__Exprs__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )? ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:1: ( ( ( rule__Exprs__Group_1__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( ( rule__Exprs__Group_1__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( ( rule__Exprs__Group_1__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( rule__Exprs__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( rule__Exprs__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:2: rule__Exprs__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl4174);
                    rule__Exprs__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Exprs__Group__1__Impl"


    // $ANTLR start "rule__Exprs__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2066:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__04209);
            rule__Exprs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__04212);
            rule__Exprs__Group_1__1();

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
    // $ANTLR end "rule__Exprs__Group_1__0"


    // $ANTLR start "rule__Exprs__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Exprs__Group_1__0__Impl4240); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Exprs__Group_1__0__Impl"


    // $ANTLR start "rule__Exprs__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: ( rule__Exprs__Group_1__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:2: rule__Exprs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__14271);
            rule__Exprs__Group_1__1__Impl();

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
    // $ANTLR end "rule__Exprs__Group_1__1"


    // $ANTLR start "rule__Exprs__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: rule__Exprs__Group_1__1__Impl : ( ( rule__Exprs__ExpAssignment_1_1 ) ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ( ( ( rule__Exprs__ExpAssignment_1_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( ( rule__Exprs__ExpAssignment_1_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( ( rule__Exprs__ExpAssignment_1_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( rule__Exprs__ExpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpAssignment_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( rule__Exprs__ExpAssignment_1_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:2: rule__Exprs__ExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Exprs__ExpAssignment_1_1_in_rule__Exprs__Group_1__1__Impl4298);
            rule__Exprs__ExpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpAssignment_1_1()); 
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
    // $ANTLR end "rule__Exprs__Group_1__1__Impl"


    // $ANTLR start "rule__Command__Group_0__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:1: rule__Command__Group_0__0 : rule__Command__Group_0__0__Impl rule__Command__Group_0__1 ;
    public final void rule__Command__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: ( rule__Command__Group_0__0__Impl rule__Command__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:2: rule__Command__Group_0__0__Impl rule__Command__Group_0__1
            {
            pushFollow(FOLLOW_rule__Command__Group_0__0__Impl_in_rule__Command__Group_0__04332);
            rule__Command__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_0__1_in_rule__Command__Group_0__04335);
            rule__Command__Group_0__1();

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
    // $ANTLR end "rule__Command__Group_0__0"


    // $ANTLR start "rule__Command__Group_0__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: rule__Command__Group_0__0__Impl : ( () ) ;
    public final void rule__Command__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: ( ( () ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: ( () )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: ( () )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandAction_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ()
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCommandAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_0__0__Impl"


    // $ANTLR start "rule__Command__Group_0__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:1: rule__Command__Group_0__1 : rule__Command__Group_0__1__Impl ;
    public final void rule__Command__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: ( rule__Command__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:2: rule__Command__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_0__1__Impl_in_rule__Command__Group_0__14393);
            rule__Command__Group_0__1__Impl();

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
    // $ANTLR end "rule__Command__Group_0__1"


    // $ANTLR start "rule__Command__Group_0__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: rule__Command__Group_0__1__Impl : ( 'nop' ) ;
    public final void rule__Command__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: ( ( 'nop' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( 'nop' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( 'nop' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopKeyword_0_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Command__Group_0__1__Impl4421); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopKeyword_0_1()); 
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
    // $ANTLR end "rule__Command__Group_0__1__Impl"


    // $ANTLR start "rule__Command__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__04456);
            rule__Command__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__04459);
            rule__Command__Group_1__1();

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
    // $ANTLR end "rule__Command__Group_1__0"


    // $ANTLR start "rule__Command__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: rule__Command__Group_1__0__Impl : ( ( rule__Command__VarLAssignment_1_0 ) ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( ( ( rule__Command__VarLAssignment_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: ( ( rule__Command__VarLAssignment_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: ( ( rule__Command__VarLAssignment_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: ( rule__Command__VarLAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarLAssignment_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( rule__Command__VarLAssignment_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:2: rule__Command__VarLAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Command__VarLAssignment_1_0_in_rule__Command__Group_1__0__Impl4486);
            rule__Command__VarLAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getVarLAssignment_1_0()); 
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
    // $ANTLR end "rule__Command__Group_1__0__Impl"


    // $ANTLR start "rule__Command__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__14516);
            rule__Command__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__14519);
            rule__Command__Group_1__2();

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
    // $ANTLR end "rule__Command__Group_1__1"


    // $ANTLR start "rule__Command__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: rule__Command__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: ( RULE_LC )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_LC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_1__1__Impl4547); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__Command__Group_1__1__Impl"


    // $ANTLR start "rule__Command__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl rule__Command__Group_1__3 ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( rule__Command__Group_1__2__Impl rule__Command__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:2: rule__Command__Group_1__2__Impl rule__Command__Group_1__3
            {
            pushFollow(FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__24578);
            rule__Command__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__24581);
            rule__Command__Group_1__3();

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
    // $ANTLR end "rule__Command__Group_1__2"


    // $ANTLR start "rule__Command__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: rule__Command__Group_1__2__Impl : ( ':=' ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: ( ( ':=' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: ( ':=' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: ( ':=' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Command__Group_1__2__Impl4609); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2()); 
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
    // $ANTLR end "rule__Command__Group_1__2__Impl"


    // $ANTLR start "rule__Command__Group_1__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: rule__Command__Group_1__3 : rule__Command__Group_1__3__Impl rule__Command__Group_1__4 ;
    public final void rule__Command__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: ( rule__Command__Group_1__3__Impl rule__Command__Group_1__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:2: rule__Command__Group_1__3__Impl rule__Command__Group_1__4
            {
            pushFollow(FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__34640);
            rule__Command__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__4_in_rule__Command__Group_1__34643);
            rule__Command__Group_1__4();

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
    // $ANTLR end "rule__Command__Group_1__3"


    // $ANTLR start "rule__Command__Group_1__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: rule__Command__Group_1__3__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Command__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2297:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: ( RULE_LC )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LC) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_1__3__Impl4671); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()); 
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
    // $ANTLR end "rule__Command__Group_1__3__Impl"


    // $ANTLR start "rule__Command__Group_1__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: rule__Command__Group_1__4 : rule__Command__Group_1__4__Impl ;
    public final void rule__Command__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( rule__Command__Group_1__4__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:2: rule__Command__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_1__4__Impl_in_rule__Command__Group_1__44702);
            rule__Command__Group_1__4__Impl();

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
    // $ANTLR end "rule__Command__Group_1__4"


    // $ANTLR start "rule__Command__Group_1__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: rule__Command__Group_1__4__Impl : ( ( rule__Command__ExpLAssignment_1_4 ) ) ;
    public final void rule__Command__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: ( ( ( rule__Command__ExpLAssignment_1_4 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( rule__Command__ExpLAssignment_1_4 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( rule__Command__ExpLAssignment_1_4 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( rule__Command__ExpLAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpLAssignment_1_4()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ( rule__Command__ExpLAssignment_1_4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:2: rule__Command__ExpLAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Command__ExpLAssignment_1_4_in_rule__Command__Group_1__4__Impl4729);
            rule__Command__ExpLAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpLAssignment_1_4()); 
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
    // $ANTLR end "rule__Command__Group_1__4__Impl"


    // $ANTLR start "rule__Command__Group_2__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: rule__Command__Group_2__0 : rule__Command__Group_2__0__Impl rule__Command__Group_2__1 ;
    public final void rule__Command__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( rule__Command__Group_2__0__Impl rule__Command__Group_2__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:2: rule__Command__Group_2__0__Impl rule__Command__Group_2__1
            {
            pushFollow(FOLLOW_rule__Command__Group_2__0__Impl_in_rule__Command__Group_2__04769);
            rule__Command__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__1_in_rule__Command__Group_2__04772);
            rule__Command__Group_2__1();

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
    // $ANTLR end "rule__Command__Group_2__0"


    // $ANTLR start "rule__Command__Group_2__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: rule__Command__Group_2__0__Impl : ( ( rule__Command__NomAssignment_2_0 ) ) ;
    public final void rule__Command__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:1: ( ( ( rule__Command__NomAssignment_2_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: ( ( rule__Command__NomAssignment_2_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: ( ( rule__Command__NomAssignment_2_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2364:1: ( rule__Command__NomAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_2_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: ( rule__Command__NomAssignment_2_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:2: rule__Command__NomAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_2_0_in_rule__Command__Group_2__0__Impl4799);
            rule__Command__NomAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomAssignment_2_0()); 
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
    // $ANTLR end "rule__Command__Group_2__0__Impl"


    // $ANTLR start "rule__Command__Group_2__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: rule__Command__Group_2__1 : rule__Command__Group_2__1__Impl rule__Command__Group_2__2 ;
    public final void rule__Command__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: ( rule__Command__Group_2__1__Impl rule__Command__Group_2__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:2: rule__Command__Group_2__1__Impl rule__Command__Group_2__2
            {
            pushFollow(FOLLOW_rule__Command__Group_2__1__Impl_in_rule__Command__Group_2__14829);
            rule__Command__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__2_in_rule__Command__Group_2__14832);
            rule__Command__Group_2__2();

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
    // $ANTLR end "rule__Command__Group_2__1"


    // $ANTLR start "rule__Command__Group_2__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:1: rule__Command__Group_2__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__1__Impl4859); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__Command__Group_2__1__Impl"


    // $ANTLR start "rule__Command__Group_2__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: rule__Command__Group_2__2 : rule__Command__Group_2__2__Impl rule__Command__Group_2__3 ;
    public final void rule__Command__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:1: ( rule__Command__Group_2__2__Impl rule__Command__Group_2__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2409:2: rule__Command__Group_2__2__Impl rule__Command__Group_2__3
            {
            pushFollow(FOLLOW_rule__Command__Group_2__2__Impl_in_rule__Command__Group_2__24888);
            rule__Command__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__3_in_rule__Command__Group_2__24891);
            rule__Command__Group_2__3();

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
    // $ANTLR end "rule__Command__Group_2__2"


    // $ANTLR start "rule__Command__Group_2__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: rule__Command__Group_2__2__Impl : ( ( rule__Command__ExpAssignment_2_2 ) ) ;
    public final void rule__Command__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: ( ( ( rule__Command__ExpAssignment_2_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: ( ( rule__Command__ExpAssignment_2_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: ( ( rule__Command__ExpAssignment_2_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:1: ( rule__Command__ExpAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_2_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: ( rule__Command__ExpAssignment_2_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:2: rule__Command__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_2_2_in_rule__Command__Group_2__2__Impl4918);
            rule__Command__ExpAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpAssignment_2_2()); 
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
    // $ANTLR end "rule__Command__Group_2__2__Impl"


    // $ANTLR start "rule__Command__Group_2__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: rule__Command__Group_2__3 : rule__Command__Group_2__3__Impl rule__Command__Group_2__4 ;
    public final void rule__Command__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ( rule__Command__Group_2__3__Impl rule__Command__Group_2__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:2: rule__Command__Group_2__3__Impl rule__Command__Group_2__4
            {
            pushFollow(FOLLOW_rule__Command__Group_2__3__Impl_in_rule__Command__Group_2__34948);
            rule__Command__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__4_in_rule__Command__Group_2__34951);
            rule__Command__Group_2__4();

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
    // $ANTLR end "rule__Command__Group_2__3"


    // $ANTLR start "rule__Command__Group_2__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:1: rule__Command__Group_2__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__3__Impl4978); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()); 
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
    // $ANTLR end "rule__Command__Group_2__3__Impl"


    // $ANTLR start "rule__Command__Group_2__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: rule__Command__Group_2__4 : rule__Command__Group_2__4__Impl rule__Command__Group_2__5 ;
    public final void rule__Command__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( rule__Command__Group_2__4__Impl rule__Command__Group_2__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:2: rule__Command__Group_2__4__Impl rule__Command__Group_2__5
            {
            pushFollow(FOLLOW_rule__Command__Group_2__4__Impl_in_rule__Command__Group_2__45007);
            rule__Command__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__5_in_rule__Command__Group_2__45010);
            rule__Command__Group_2__5();

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
    // $ANTLR end "rule__Command__Group_2__4"


    // $ANTLR start "rule__Command__Group_2__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: rule__Command__Group_2__4__Impl : ( 'do' ) ;
    public final void rule__Command__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2480:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_2_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_2__4__Impl5038); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getDoKeyword_2_4()); 
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
    // $ANTLR end "rule__Command__Group_2__4__Impl"


    // $ANTLR start "rule__Command__Group_2__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:1: rule__Command__Group_2__5 : rule__Command__Group_2__5__Impl rule__Command__Group_2__6 ;
    public final void rule__Command__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( rule__Command__Group_2__5__Impl rule__Command__Group_2__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:2: rule__Command__Group_2__5__Impl rule__Command__Group_2__6
            {
            pushFollow(FOLLOW_rule__Command__Group_2__5__Impl_in_rule__Command__Group_2__55069);
            rule__Command__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__6_in_rule__Command__Group_2__55072);
            rule__Command__Group_2__6();

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
    // $ANTLR end "rule__Command__Group_2__5"


    // $ANTLR start "rule__Command__Group_2__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:1: rule__Command__Group_2__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__5__Impl5099); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()); 
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
    // $ANTLR end "rule__Command__Group_2__5__Impl"


    // $ANTLR start "rule__Command__Group_2__6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:1: rule__Command__Group_2__6 : rule__Command__Group_2__6__Impl rule__Command__Group_2__7 ;
    public final void rule__Command__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( rule__Command__Group_2__6__Impl rule__Command__Group_2__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2527:2: rule__Command__Group_2__6__Impl rule__Command__Group_2__7
            {
            pushFollow(FOLLOW_rule__Command__Group_2__6__Impl_in_rule__Command__Group_2__65128);
            rule__Command__Group_2__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__7_in_rule__Command__Group_2__65131);
            rule__Command__Group_2__7();

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
    // $ANTLR end "rule__Command__Group_2__6"


    // $ANTLR start "rule__Command__Group_2__6__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: rule__Command__Group_2__6__Impl : ( ( rule__Command__C1Assignment_2_6 ) ) ;
    public final void rule__Command__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( ( ( rule__Command__C1Assignment_2_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ( ( rule__Command__C1Assignment_2_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ( ( rule__Command__C1Assignment_2_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: ( rule__Command__C1Assignment_2_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_2_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: ( rule__Command__C1Assignment_2_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:2: rule__Command__C1Assignment_2_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_2_6_in_rule__Command__Group_2__6__Impl5158);
            rule__Command__C1Assignment_2_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1Assignment_2_6()); 
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
    // $ANTLR end "rule__Command__Group_2__6__Impl"


    // $ANTLR start "rule__Command__Group_2__7"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: rule__Command__Group_2__7 : rule__Command__Group_2__7__Impl rule__Command__Group_2__8 ;
    public final void rule__Command__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( rule__Command__Group_2__7__Impl rule__Command__Group_2__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:2: rule__Command__Group_2__7__Impl rule__Command__Group_2__8
            {
            pushFollow(FOLLOW_rule__Command__Group_2__7__Impl_in_rule__Command__Group_2__75188);
            rule__Command__Group_2__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__8_in_rule__Command__Group_2__75191);
            rule__Command__Group_2__8();

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
    // $ANTLR end "rule__Command__Group_2__7"


    // $ANTLR start "rule__Command__Group_2__7__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: rule__Command__Group_2__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__7__Impl5218); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_7()); 
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
    // $ANTLR end "rule__Command__Group_2__7__Impl"


    // $ANTLR start "rule__Command__Group_2__8"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2580:1: rule__Command__Group_2__8 : rule__Command__Group_2__8__Impl ;
    public final void rule__Command__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ( rule__Command__Group_2__8__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:2: rule__Command__Group_2__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_2__8__Impl_in_rule__Command__Group_2__85247);
            rule__Command__Group_2__8__Impl();

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
    // $ANTLR end "rule__Command__Group_2__8"


    // $ANTLR start "rule__Command__Group_2__8__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: rule__Command__Group_2__8__Impl : ( 'od' ) ;
    public final void rule__Command__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_2_8()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_2__8__Impl5275); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getOdKeyword_2_8()); 
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
    // $ANTLR end "rule__Command__Group_2__8__Impl"


    // $ANTLR start "rule__Command__Group_3__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: rule__Command__Group_3__0 : rule__Command__Group_3__0__Impl rule__Command__Group_3__1 ;
    public final void rule__Command__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2632:1: ( rule__Command__Group_3__0__Impl rule__Command__Group_3__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:2: rule__Command__Group_3__0__Impl rule__Command__Group_3__1
            {
            pushFollow(FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__05324);
            rule__Command__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__05327);
            rule__Command__Group_3__1();

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
    // $ANTLR end "rule__Command__Group_3__0"


    // $ANTLR start "rule__Command__Group_3__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: rule__Command__Group_3__0__Impl : ( ( rule__Command__NomAssignment_3_0 ) ) ;
    public final void rule__Command__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( ( ( rule__Command__NomAssignment_3_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ( ( rule__Command__NomAssignment_3_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ( ( rule__Command__NomAssignment_3_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( rule__Command__NomAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_3_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: ( rule__Command__NomAssignment_3_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:2: rule__Command__NomAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_3_0_in_rule__Command__Group_3__0__Impl5354);
            rule__Command__NomAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomAssignment_3_0()); 
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
    // $ANTLR end "rule__Command__Group_3__0__Impl"


    // $ANTLR start "rule__Command__Group_3__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: rule__Command__Group_3__1 : rule__Command__Group_3__1__Impl rule__Command__Group_3__2 ;
    public final void rule__Command__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2661:1: ( rule__Command__Group_3__1__Impl rule__Command__Group_3__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:2: rule__Command__Group_3__1__Impl rule__Command__Group_3__2
            {
            pushFollow(FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__15384);
            rule__Command__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__2_in_rule__Command__Group_3__15387);
            rule__Command__Group_3__2();

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
    // $ANTLR end "rule__Command__Group_3__1"


    // $ANTLR start "rule__Command__Group_3__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: rule__Command__Group_3__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2675:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__1__Impl5414); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()); 
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
    // $ANTLR end "rule__Command__Group_3__1__Impl"


    // $ANTLR start "rule__Command__Group_3__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:1: rule__Command__Group_3__2 : rule__Command__Group_3__2__Impl rule__Command__Group_3__3 ;
    public final void rule__Command__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:1: ( rule__Command__Group_3__2__Impl rule__Command__Group_3__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:2: rule__Command__Group_3__2__Impl rule__Command__Group_3__3
            {
            pushFollow(FOLLOW_rule__Command__Group_3__2__Impl_in_rule__Command__Group_3__25443);
            rule__Command__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__3_in_rule__Command__Group_3__25446);
            rule__Command__Group_3__3();

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
    // $ANTLR end "rule__Command__Group_3__2"


    // $ANTLR start "rule__Command__Group_3__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: rule__Command__Group_3__2__Impl : ( ( rule__Command__ExpAssignment_3_2 ) ) ;
    public final void rule__Command__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: ( ( ( rule__Command__ExpAssignment_3_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: ( ( rule__Command__ExpAssignment_3_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: ( ( rule__Command__ExpAssignment_3_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:1: ( rule__Command__ExpAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_3_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: ( rule__Command__ExpAssignment_3_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:2: rule__Command__ExpAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_3_2_in_rule__Command__Group_3__2__Impl5473);
            rule__Command__ExpAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpAssignment_3_2()); 
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
    // $ANTLR end "rule__Command__Group_3__2__Impl"


    // $ANTLR start "rule__Command__Group_3__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:1: rule__Command__Group_3__3 : rule__Command__Group_3__3__Impl rule__Command__Group_3__4 ;
    public final void rule__Command__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: ( rule__Command__Group_3__3__Impl rule__Command__Group_3__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:2: rule__Command__Group_3__3__Impl rule__Command__Group_3__4
            {
            pushFollow(FOLLOW_rule__Command__Group_3__3__Impl_in_rule__Command__Group_3__35503);
            rule__Command__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__4_in_rule__Command__Group_3__35506);
            rule__Command__Group_3__4();

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
    // $ANTLR end "rule__Command__Group_3__3"


    // $ANTLR start "rule__Command__Group_3__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: rule__Command__Group_3__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2731:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__3__Impl5533); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()); 
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
    // $ANTLR end "rule__Command__Group_3__3__Impl"


    // $ANTLR start "rule__Command__Group_3__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: rule__Command__Group_3__4 : rule__Command__Group_3__4__Impl rule__Command__Group_3__5 ;
    public final void rule__Command__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2748:1: ( rule__Command__Group_3__4__Impl rule__Command__Group_3__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:2: rule__Command__Group_3__4__Impl rule__Command__Group_3__5
            {
            pushFollow(FOLLOW_rule__Command__Group_3__4__Impl_in_rule__Command__Group_3__45562);
            rule__Command__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__5_in_rule__Command__Group_3__45565);
            rule__Command__Group_3__5();

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
    // $ANTLR end "rule__Command__Group_3__4"


    // $ANTLR start "rule__Command__Group_3__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: rule__Command__Group_3__4__Impl : ( 'do' ) ;
    public final void rule__Command__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2760:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_3_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_3__4__Impl5593); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getDoKeyword_3_4()); 
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
    // $ANTLR end "rule__Command__Group_3__4__Impl"


    // $ANTLR start "rule__Command__Group_3__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: rule__Command__Group_3__5 : rule__Command__Group_3__5__Impl rule__Command__Group_3__6 ;
    public final void rule__Command__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:1: ( rule__Command__Group_3__5__Impl rule__Command__Group_3__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:2: rule__Command__Group_3__5__Impl rule__Command__Group_3__6
            {
            pushFollow(FOLLOW_rule__Command__Group_3__5__Impl_in_rule__Command__Group_3__55624);
            rule__Command__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__6_in_rule__Command__Group_3__55627);
            rule__Command__Group_3__6();

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
    // $ANTLR end "rule__Command__Group_3__5"


    // $ANTLR start "rule__Command__Group_3__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: rule__Command__Group_3__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2793:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__5__Impl5654); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5()); 
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
    // $ANTLR end "rule__Command__Group_3__5__Impl"


    // $ANTLR start "rule__Command__Group_3__6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: rule__Command__Group_3__6 : rule__Command__Group_3__6__Impl rule__Command__Group_3__7 ;
    public final void rule__Command__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2808:1: ( rule__Command__Group_3__6__Impl rule__Command__Group_3__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:2: rule__Command__Group_3__6__Impl rule__Command__Group_3__7
            {
            pushFollow(FOLLOW_rule__Command__Group_3__6__Impl_in_rule__Command__Group_3__65683);
            rule__Command__Group_3__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__7_in_rule__Command__Group_3__65686);
            rule__Command__Group_3__7();

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
    // $ANTLR end "rule__Command__Group_3__6"


    // $ANTLR start "rule__Command__Group_3__6__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: rule__Command__Group_3__6__Impl : ( ( rule__Command__C1Assignment_3_6 ) ) ;
    public final void rule__Command__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ( ( ( rule__Command__C1Assignment_3_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ( ( rule__Command__C1Assignment_3_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ( ( rule__Command__C1Assignment_3_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2822:1: ( rule__Command__C1Assignment_3_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_3_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: ( rule__Command__C1Assignment_3_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:2: rule__Command__C1Assignment_3_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_3_6_in_rule__Command__Group_3__6__Impl5713);
            rule__Command__C1Assignment_3_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1Assignment_3_6()); 
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
    // $ANTLR end "rule__Command__Group_3__6__Impl"


    // $ANTLR start "rule__Command__Group_3__7"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: rule__Command__Group_3__7 : rule__Command__Group_3__7__Impl rule__Command__Group_3__8 ;
    public final void rule__Command__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2837:1: ( rule__Command__Group_3__7__Impl rule__Command__Group_3__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:2: rule__Command__Group_3__7__Impl rule__Command__Group_3__8
            {
            pushFollow(FOLLOW_rule__Command__Group_3__7__Impl_in_rule__Command__Group_3__75743);
            rule__Command__Group_3__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__8_in_rule__Command__Group_3__75746);
            rule__Command__Group_3__8();

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
    // $ANTLR end "rule__Command__Group_3__7"


    // $ANTLR start "rule__Command__Group_3__7__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: rule__Command__Group_3__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__7__Impl5773); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_7()); 
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
    // $ANTLR end "rule__Command__Group_3__7__Impl"


    // $ANTLR start "rule__Command__Group_3__8"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:1: rule__Command__Group_3__8 : rule__Command__Group_3__8__Impl ;
    public final void rule__Command__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:1: ( rule__Command__Group_3__8__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2867:2: rule__Command__Group_3__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_3__8__Impl_in_rule__Command__Group_3__85802);
            rule__Command__Group_3__8__Impl();

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
    // $ANTLR end "rule__Command__Group_3__8"


    // $ANTLR start "rule__Command__Group_3__8__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2873:1: rule__Command__Group_3__8__Impl : ( 'od' ) ;
    public final void rule__Command__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_3_8()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_3__8__Impl5830); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getOdKeyword_3_8()); 
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
    // $ANTLR end "rule__Command__Group_3__8__Impl"


    // $ANTLR start "rule__Command__Group_4__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: rule__Command__Group_4__0 : rule__Command__Group_4__0__Impl rule__Command__Group_4__1 ;
    public final void rule__Command__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: ( rule__Command__Group_4__0__Impl rule__Command__Group_4__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:2: rule__Command__Group_4__0__Impl rule__Command__Group_4__1
            {
            pushFollow(FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__05879);
            rule__Command__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__05882);
            rule__Command__Group_4__1();

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
    // $ANTLR end "rule__Command__Group_4__0"


    // $ANTLR start "rule__Command__Group_4__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: rule__Command__Group_4__0__Impl : ( ( rule__Command__NomAssignment_4_0 ) ) ;
    public final void rule__Command__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( ( ( rule__Command__NomAssignment_4_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( rule__Command__NomAssignment_4_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( rule__Command__NomAssignment_4_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: ( rule__Command__NomAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_4_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:1: ( rule__Command__NomAssignment_4_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:2: rule__Command__NomAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_4_0_in_rule__Command__Group_4__0__Impl5909);
            rule__Command__NomAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomAssignment_4_0()); 
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
    // $ANTLR end "rule__Command__Group_4__0__Impl"


    // $ANTLR start "rule__Command__Group_4__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: rule__Command__Group_4__1 : rule__Command__Group_4__1__Impl rule__Command__Group_4__2 ;
    public final void rule__Command__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( rule__Command__Group_4__1__Impl rule__Command__Group_4__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:2: rule__Command__Group_4__1__Impl rule__Command__Group_4__2
            {
            pushFollow(FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__15939);
            rule__Command__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__2_in_rule__Command__Group_4__15942);
            rule__Command__Group_4__2();

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
    // $ANTLR end "rule__Command__Group_4__1"


    // $ANTLR start "rule__Command__Group_4__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2951:1: rule__Command__Group_4__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__1__Impl5969); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()); 
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
    // $ANTLR end "rule__Command__Group_4__1__Impl"


    // $ANTLR start "rule__Command__Group_4__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:1: rule__Command__Group_4__2 : rule__Command__Group_4__2__Impl rule__Command__Group_4__3 ;
    public final void rule__Command__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: ( rule__Command__Group_4__2__Impl rule__Command__Group_4__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:2: rule__Command__Group_4__2__Impl rule__Command__Group_4__3
            {
            pushFollow(FOLLOW_rule__Command__Group_4__2__Impl_in_rule__Command__Group_4__25998);
            rule__Command__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__3_in_rule__Command__Group_4__26001);
            rule__Command__Group_4__3();

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
    // $ANTLR end "rule__Command__Group_4__2"


    // $ANTLR start "rule__Command__Group_4__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2980:1: rule__Command__Group_4__2__Impl : ( ( rule__Command__Exp1Assignment_4_2 ) ) ;
    public final void rule__Command__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( ( ( rule__Command__Exp1Assignment_4_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: ( ( rule__Command__Exp1Assignment_4_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: ( ( rule__Command__Exp1Assignment_4_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( rule__Command__Exp1Assignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp1Assignment_4_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( rule__Command__Exp1Assignment_4_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:2: rule__Command__Exp1Assignment_4_2
            {
            pushFollow(FOLLOW_rule__Command__Exp1Assignment_4_2_in_rule__Command__Group_4__2__Impl6028);
            rule__Command__Exp1Assignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExp1Assignment_4_2()); 
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
    // $ANTLR end "rule__Command__Group_4__2__Impl"


    // $ANTLR start "rule__Command__Group_4__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: rule__Command__Group_4__3 : rule__Command__Group_4__3__Impl rule__Command__Group_4__4 ;
    public final void rule__Command__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:1: ( rule__Command__Group_4__3__Impl rule__Command__Group_4__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:2: rule__Command__Group_4__3__Impl rule__Command__Group_4__4
            {
            pushFollow(FOLLOW_rule__Command__Group_4__3__Impl_in_rule__Command__Group_4__36058);
            rule__Command__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__4_in_rule__Command__Group_4__36061);
            rule__Command__Group_4__4();

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
    // $ANTLR end "rule__Command__Group_4__3"


    // $ANTLR start "rule__Command__Group_4__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: rule__Command__Group_4__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3015:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__3__Impl6088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()); 
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
    // $ANTLR end "rule__Command__Group_4__3__Impl"


    // $ANTLR start "rule__Command__Group_4__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:1: rule__Command__Group_4__4 : rule__Command__Group_4__4__Impl rule__Command__Group_4__5 ;
    public final void rule__Command__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: ( rule__Command__Group_4__4__Impl rule__Command__Group_4__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:2: rule__Command__Group_4__4__Impl rule__Command__Group_4__5
            {
            pushFollow(FOLLOW_rule__Command__Group_4__4__Impl_in_rule__Command__Group_4__46117);
            rule__Command__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__5_in_rule__Command__Group_4__46120);
            rule__Command__Group_4__5();

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
    // $ANTLR end "rule__Command__Group_4__4"


    // $ANTLR start "rule__Command__Group_4__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: rule__Command__Group_4__4__Impl : ( 'in' ) ;
    public final void rule__Command__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: ( ( 'in' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: ( 'in' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: ( 'in' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3044:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getInKeyword_4_4()); 
            }
            match(input,30,FOLLOW_30_in_rule__Command__Group_4__4__Impl6148); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getInKeyword_4_4()); 
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
    // $ANTLR end "rule__Command__Group_4__4__Impl"


    // $ANTLR start "rule__Command__Group_4__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: rule__Command__Group_4__5 : rule__Command__Group_4__5__Impl rule__Command__Group_4__6 ;
    public final void rule__Command__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3061:1: ( rule__Command__Group_4__5__Impl rule__Command__Group_4__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:2: rule__Command__Group_4__5__Impl rule__Command__Group_4__6
            {
            pushFollow(FOLLOW_rule__Command__Group_4__5__Impl_in_rule__Command__Group_4__56179);
            rule__Command__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__6_in_rule__Command__Group_4__56182);
            rule__Command__Group_4__6();

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
    // $ANTLR end "rule__Command__Group_4__5"


    // $ANTLR start "rule__Command__Group_4__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: rule__Command__Group_4__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3073:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__5__Impl6209); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()); 
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
    // $ANTLR end "rule__Command__Group_4__5__Impl"


    // $ANTLR start "rule__Command__Group_4__6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: rule__Command__Group_4__6 : rule__Command__Group_4__6__Impl rule__Command__Group_4__7 ;
    public final void rule__Command__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3090:1: ( rule__Command__Group_4__6__Impl rule__Command__Group_4__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:2: rule__Command__Group_4__6__Impl rule__Command__Group_4__7
            {
            pushFollow(FOLLOW_rule__Command__Group_4__6__Impl_in_rule__Command__Group_4__66238);
            rule__Command__Group_4__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__7_in_rule__Command__Group_4__66241);
            rule__Command__Group_4__7();

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
    // $ANTLR end "rule__Command__Group_4__6"


    // $ANTLR start "rule__Command__Group_4__6__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: rule__Command__Group_4__6__Impl : ( ( rule__Command__Exp2Assignment_4_6 ) ) ;
    public final void rule__Command__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: ( ( ( rule__Command__Exp2Assignment_4_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( ( rule__Command__Exp2Assignment_4_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( ( rule__Command__Exp2Assignment_4_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:1: ( rule__Command__Exp2Assignment_4_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp2Assignment_4_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:1: ( rule__Command__Exp2Assignment_4_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:2: rule__Command__Exp2Assignment_4_6
            {
            pushFollow(FOLLOW_rule__Command__Exp2Assignment_4_6_in_rule__Command__Group_4__6__Impl6268);
            rule__Command__Exp2Assignment_4_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExp2Assignment_4_6()); 
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
    // $ANTLR end "rule__Command__Group_4__6__Impl"


    // $ANTLR start "rule__Command__Group_4__7"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: rule__Command__Group_4__7 : rule__Command__Group_4__7__Impl rule__Command__Group_4__8 ;
    public final void rule__Command__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:1: ( rule__Command__Group_4__7__Impl rule__Command__Group_4__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3120:2: rule__Command__Group_4__7__Impl rule__Command__Group_4__8
            {
            pushFollow(FOLLOW_rule__Command__Group_4__7__Impl_in_rule__Command__Group_4__76298);
            rule__Command__Group_4__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__8_in_rule__Command__Group_4__76301);
            rule__Command__Group_4__8();

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
    // $ANTLR end "rule__Command__Group_4__7"


    // $ANTLR start "rule__Command__Group_4__7__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: rule__Command__Group_4__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__7__Impl6328); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()); 
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
    // $ANTLR end "rule__Command__Group_4__7__Impl"


    // $ANTLR start "rule__Command__Group_4__8"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: rule__Command__Group_4__8 : rule__Command__Group_4__8__Impl rule__Command__Group_4__9 ;
    public final void rule__Command__Group_4__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3148:1: ( rule__Command__Group_4__8__Impl rule__Command__Group_4__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:2: rule__Command__Group_4__8__Impl rule__Command__Group_4__9
            {
            pushFollow(FOLLOW_rule__Command__Group_4__8__Impl_in_rule__Command__Group_4__86357);
            rule__Command__Group_4__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__9_in_rule__Command__Group_4__86360);
            rule__Command__Group_4__9();

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
    // $ANTLR end "rule__Command__Group_4__8"


    // $ANTLR start "rule__Command__Group_4__8__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:1: rule__Command__Group_4__8__Impl : ( 'do' ) ;
    public final void rule__Command__Group_4__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_4_8()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_4__8__Impl6388); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getDoKeyword_4_8()); 
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
    // $ANTLR end "rule__Command__Group_4__8__Impl"


    // $ANTLR start "rule__Command__Group_4__9"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3175:1: rule__Command__Group_4__9 : rule__Command__Group_4__9__Impl rule__Command__Group_4__10 ;
    public final void rule__Command__Group_4__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: ( rule__Command__Group_4__9__Impl rule__Command__Group_4__10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:2: rule__Command__Group_4__9__Impl rule__Command__Group_4__10
            {
            pushFollow(FOLLOW_rule__Command__Group_4__9__Impl_in_rule__Command__Group_4__96419);
            rule__Command__Group_4__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__10_in_rule__Command__Group_4__96422);
            rule__Command__Group_4__10();

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
    // $ANTLR end "rule__Command__Group_4__9"


    // $ANTLR start "rule__Command__Group_4__9__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: rule__Command__Group_4__9__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__9__Impl6449); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9()); 
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
    // $ANTLR end "rule__Command__Group_4__9__Impl"


    // $ANTLR start "rule__Command__Group_4__10"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3204:1: rule__Command__Group_4__10 : rule__Command__Group_4__10__Impl rule__Command__Group_4__11 ;
    public final void rule__Command__Group_4__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( rule__Command__Group_4__10__Impl rule__Command__Group_4__11 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:2: rule__Command__Group_4__10__Impl rule__Command__Group_4__11
            {
            pushFollow(FOLLOW_rule__Command__Group_4__10__Impl_in_rule__Command__Group_4__106478);
            rule__Command__Group_4__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__11_in_rule__Command__Group_4__106481);
            rule__Command__Group_4__11();

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
    // $ANTLR end "rule__Command__Group_4__10"


    // $ANTLR start "rule__Command__Group_4__10__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: rule__Command__Group_4__10__Impl : ( ( rule__Command__C1Assignment_4_10 ) ) ;
    public final void rule__Command__Group_4__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( ( ( rule__Command__C1Assignment_4_10 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( ( rule__Command__C1Assignment_4_10 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( ( rule__Command__C1Assignment_4_10 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: ( rule__Command__C1Assignment_4_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_4_10()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: ( rule__Command__C1Assignment_4_10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:2: rule__Command__C1Assignment_4_10
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_4_10_in_rule__Command__Group_4__10__Impl6508);
            rule__Command__C1Assignment_4_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1Assignment_4_10()); 
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
    // $ANTLR end "rule__Command__Group_4__10__Impl"


    // $ANTLR start "rule__Command__Group_4__11"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3233:1: rule__Command__Group_4__11 : rule__Command__Group_4__11__Impl rule__Command__Group_4__12 ;
    public final void rule__Command__Group_4__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ( rule__Command__Group_4__11__Impl rule__Command__Group_4__12 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:2: rule__Command__Group_4__11__Impl rule__Command__Group_4__12
            {
            pushFollow(FOLLOW_rule__Command__Group_4__11__Impl_in_rule__Command__Group_4__116538);
            rule__Command__Group_4__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__12_in_rule__Command__Group_4__116541);
            rule__Command__Group_4__12();

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
    // $ANTLR end "rule__Command__Group_4__11"


    // $ANTLR start "rule__Command__Group_4__11__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:1: rule__Command__Group_4__11__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_11()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__11__Impl6568); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_11()); 
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
    // $ANTLR end "rule__Command__Group_4__11__Impl"


    // $ANTLR start "rule__Command__Group_4__12"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3262:1: rule__Command__Group_4__12 : rule__Command__Group_4__12__Impl ;
    public final void rule__Command__Group_4__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: ( rule__Command__Group_4__12__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3267:2: rule__Command__Group_4__12__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_4__12__Impl_in_rule__Command__Group_4__126597);
            rule__Command__Group_4__12__Impl();

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
    // $ANTLR end "rule__Command__Group_4__12"


    // $ANTLR start "rule__Command__Group_4__12__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: rule__Command__Group_4__12__Impl : ( 'od' ) ;
    public final void rule__Command__Group_4__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_4_12()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_4__12__Impl6625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getOdKeyword_4_12()); 
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
    // $ANTLR end "rule__Command__Group_4__12__Impl"


    // $ANTLR start "rule__Command__Group_5__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: rule__Command__Group_5__0 : rule__Command__Group_5__0__Impl rule__Command__Group_5__1 ;
    public final void rule__Command__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3322:1: ( rule__Command__Group_5__0__Impl rule__Command__Group_5__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3323:2: rule__Command__Group_5__0__Impl rule__Command__Group_5__1
            {
            pushFollow(FOLLOW_rule__Command__Group_5__0__Impl_in_rule__Command__Group_5__06682);
            rule__Command__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__1_in_rule__Command__Group_5__06685);
            rule__Command__Group_5__1();

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
    // $ANTLR end "rule__Command__Group_5__0"


    // $ANTLR start "rule__Command__Group_5__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: rule__Command__Group_5__0__Impl : ( ( rule__Command__NomAssignment_5_0 ) ) ;
    public final void rule__Command__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:1: ( ( ( rule__Command__NomAssignment_5_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: ( ( rule__Command__NomAssignment_5_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: ( ( rule__Command__NomAssignment_5_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:1: ( rule__Command__NomAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_5_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:1: ( rule__Command__NomAssignment_5_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:2: rule__Command__NomAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_5_0_in_rule__Command__Group_5__0__Impl6712);
            rule__Command__NomAssignment_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomAssignment_5_0()); 
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
    // $ANTLR end "rule__Command__Group_5__0__Impl"


    // $ANTLR start "rule__Command__Group_5__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:1: rule__Command__Group_5__1 : rule__Command__Group_5__1__Impl rule__Command__Group_5__2 ;
    public final void rule__Command__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3351:1: ( rule__Command__Group_5__1__Impl rule__Command__Group_5__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3352:2: rule__Command__Group_5__1__Impl rule__Command__Group_5__2
            {
            pushFollow(FOLLOW_rule__Command__Group_5__1__Impl_in_rule__Command__Group_5__16742);
            rule__Command__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__2_in_rule__Command__Group_5__16745);
            rule__Command__Group_5__2();

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
    // $ANTLR end "rule__Command__Group_5__1"


    // $ANTLR start "rule__Command__Group_5__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: rule__Command__Group_5__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3363:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3365:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__1__Impl6772); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_1()); 
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
    // $ANTLR end "rule__Command__Group_5__1__Impl"


    // $ANTLR start "rule__Command__Group_5__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: rule__Command__Group_5__2 : rule__Command__Group_5__2__Impl rule__Command__Group_5__3 ;
    public final void rule__Command__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3380:1: ( rule__Command__Group_5__2__Impl rule__Command__Group_5__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3381:2: rule__Command__Group_5__2__Impl rule__Command__Group_5__3
            {
            pushFollow(FOLLOW_rule__Command__Group_5__2__Impl_in_rule__Command__Group_5__26801);
            rule__Command__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__3_in_rule__Command__Group_5__26804);
            rule__Command__Group_5__3();

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
    // $ANTLR end "rule__Command__Group_5__2"


    // $ANTLR start "rule__Command__Group_5__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3388:1: rule__Command__Group_5__2__Impl : ( ( rule__Command__ExpAssignment_5_2 ) ) ;
    public final void rule__Command__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:1: ( ( ( rule__Command__ExpAssignment_5_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:1: ( ( rule__Command__ExpAssignment_5_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:1: ( ( rule__Command__ExpAssignment_5_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3394:1: ( rule__Command__ExpAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_5_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:1: ( rule__Command__ExpAssignment_5_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:2: rule__Command__ExpAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_5_2_in_rule__Command__Group_5__2__Impl6831);
            rule__Command__ExpAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpAssignment_5_2()); 
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
    // $ANTLR end "rule__Command__Group_5__2__Impl"


    // $ANTLR start "rule__Command__Group_5__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: rule__Command__Group_5__3 : rule__Command__Group_5__3__Impl rule__Command__Group_5__4 ;
    public final void rule__Command__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3409:1: ( rule__Command__Group_5__3__Impl rule__Command__Group_5__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:2: rule__Command__Group_5__3__Impl rule__Command__Group_5__4
            {
            pushFollow(FOLLOW_rule__Command__Group_5__3__Impl_in_rule__Command__Group_5__36861);
            rule__Command__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__4_in_rule__Command__Group_5__36864);
            rule__Command__Group_5__4();

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
    // $ANTLR end "rule__Command__Group_5__3"


    // $ANTLR start "rule__Command__Group_5__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: rule__Command__Group_5__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3423:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__3__Impl6891); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_3()); 
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
    // $ANTLR end "rule__Command__Group_5__3__Impl"


    // $ANTLR start "rule__Command__Group_5__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: rule__Command__Group_5__4 : rule__Command__Group_5__4__Impl rule__Command__Group_5__5 ;
    public final void rule__Command__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:1: ( rule__Command__Group_5__4__Impl rule__Command__Group_5__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:2: rule__Command__Group_5__4__Impl rule__Command__Group_5__5
            {
            pushFollow(FOLLOW_rule__Command__Group_5__4__Impl_in_rule__Command__Group_5__46920);
            rule__Command__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__5_in_rule__Command__Group_5__46923);
            rule__Command__Group_5__5();

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
    // $ANTLR end "rule__Command__Group_5__4"


    // $ANTLR start "rule__Command__Group_5__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: rule__Command__Group_5__4__Impl : ( 'then' ) ;
    public final void rule__Command__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: ( ( 'then' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( 'then' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( 'then' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3452:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getThenKeyword_5_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__Command__Group_5__4__Impl6951); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getThenKeyword_5_4()); 
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
    // $ANTLR end "rule__Command__Group_5__4__Impl"


    // $ANTLR start "rule__Command__Group_5__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3465:1: rule__Command__Group_5__5 : rule__Command__Group_5__5__Impl rule__Command__Group_5__6 ;
    public final void rule__Command__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: ( rule__Command__Group_5__5__Impl rule__Command__Group_5__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3470:2: rule__Command__Group_5__5__Impl rule__Command__Group_5__6
            {
            pushFollow(FOLLOW_rule__Command__Group_5__5__Impl_in_rule__Command__Group_5__56982);
            rule__Command__Group_5__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__6_in_rule__Command__Group_5__56985);
            rule__Command__Group_5__6();

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
    // $ANTLR end "rule__Command__Group_5__5"


    // $ANTLR start "rule__Command__Group_5__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: rule__Command__Group_5__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__5__Impl7012); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_5()); 
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
    // $ANTLR end "rule__Command__Group_5__5__Impl"


    // $ANTLR start "rule__Command__Group_5__6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: rule__Command__Group_5__6 : rule__Command__Group_5__6__Impl rule__Command__Group_5__7 ;
    public final void rule__Command__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( rule__Command__Group_5__6__Impl rule__Command__Group_5__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:2: rule__Command__Group_5__6__Impl rule__Command__Group_5__7
            {
            pushFollow(FOLLOW_rule__Command__Group_5__6__Impl_in_rule__Command__Group_5__67041);
            rule__Command__Group_5__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__7_in_rule__Command__Group_5__67044);
            rule__Command__Group_5__7();

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
    // $ANTLR end "rule__Command__Group_5__6"


    // $ANTLR start "rule__Command__Group_5__6__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: rule__Command__Group_5__6__Impl : ( ( rule__Command__C1Assignment_5_6 ) ) ;
    public final void rule__Command__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( ( ( rule__Command__C1Assignment_5_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ( rule__Command__C1Assignment_5_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ( rule__Command__C1Assignment_5_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: ( rule__Command__C1Assignment_5_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_5_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: ( rule__Command__C1Assignment_5_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:2: rule__Command__C1Assignment_5_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_5_6_in_rule__Command__Group_5__6__Impl7071);
            rule__Command__C1Assignment_5_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1Assignment_5_6()); 
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
    // $ANTLR end "rule__Command__Group_5__6__Impl"


    // $ANTLR start "rule__Command__Group_5__7"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: rule__Command__Group_5__7 : rule__Command__Group_5__7__Impl rule__Command__Group_5__8 ;
    public final void rule__Command__Group_5__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: ( rule__Command__Group_5__7__Impl rule__Command__Group_5__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:2: rule__Command__Group_5__7__Impl rule__Command__Group_5__8
            {
            pushFollow(FOLLOW_rule__Command__Group_5__7__Impl_in_rule__Command__Group_5__77101);
            rule__Command__Group_5__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__8_in_rule__Command__Group_5__77104);
            rule__Command__Group_5__8();

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
    // $ANTLR end "rule__Command__Group_5__7"


    // $ANTLR start "rule__Command__Group_5__7__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: rule__Command__Group_5__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__7__Impl7131); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_7()); 
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
    // $ANTLR end "rule__Command__Group_5__7__Impl"


    // $ANTLR start "rule__Command__Group_5__8"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3552:1: rule__Command__Group_5__8 : rule__Command__Group_5__8__Impl rule__Command__Group_5__9 ;
    public final void rule__Command__Group_5__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: ( rule__Command__Group_5__8__Impl rule__Command__Group_5__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:2: rule__Command__Group_5__8__Impl rule__Command__Group_5__9
            {
            pushFollow(FOLLOW_rule__Command__Group_5__8__Impl_in_rule__Command__Group_5__87160);
            rule__Command__Group_5__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__9_in_rule__Command__Group_5__87163);
            rule__Command__Group_5__9();

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
    // $ANTLR end "rule__Command__Group_5__8"


    // $ANTLR start "rule__Command__Group_5__8__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3564:1: rule__Command__Group_5__8__Impl : ( ( rule__Command__Group_5_8__0 )? ) ;
    public final void rule__Command__Group_5__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( ( ( rule__Command__Group_5_8__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( ( rule__Command__Group_5_8__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( ( rule__Command__Group_5_8__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: ( rule__Command__Group_5_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup_5_8()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( rule__Command__Group_5_8__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:2: rule__Command__Group_5_8__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_5_8__0_in_rule__Command__Group_5__8__Impl7190);
                    rule__Command__Group_5_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getGroup_5_8()); 
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
    // $ANTLR end "rule__Command__Group_5__8__Impl"


    // $ANTLR start "rule__Command__Group_5__9"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: rule__Command__Group_5__9 : rule__Command__Group_5__9__Impl ;
    public final void rule__Command__Group_5__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: ( rule__Command__Group_5__9__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:2: rule__Command__Group_5__9__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_5__9__Impl_in_rule__Command__Group_5__97221);
            rule__Command__Group_5__9__Impl();

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
    // $ANTLR end "rule__Command__Group_5__9"


    // $ANTLR start "rule__Command__Group_5__9__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3592:1: rule__Command__Group_5__9__Impl : ( 'fi' ) ;
    public final void rule__Command__Group_5__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: ( ( 'fi' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( 'fi' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( 'fi' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getFiKeyword_5_9()); 
            }
            match(input,32,FOLLOW_32_in_rule__Command__Group_5__9__Impl7249); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getFiKeyword_5_9()); 
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
    // $ANTLR end "rule__Command__Group_5__9__Impl"


    // $ANTLR start "rule__Command__Group_5_8__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: rule__Command__Group_5_8__0 : rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1 ;
    public final void rule__Command__Group_5_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3635:1: ( rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3636:2: rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__0__Impl_in_rule__Command__Group_5_8__07300);
            rule__Command__Group_5_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__1_in_rule__Command__Group_5_8__07303);
            rule__Command__Group_5_8__1();

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
    // $ANTLR end "rule__Command__Group_5_8__0"


    // $ANTLR start "rule__Command__Group_5_8__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3643:1: rule__Command__Group_5_8__0__Impl : ( 'else' ) ;
    public final void rule__Command__Group_5_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: ( ( 'else' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( 'else' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( 'else' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getElseKeyword_5_8_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Command__Group_5_8__0__Impl7331); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getElseKeyword_5_8_0()); 
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
    // $ANTLR end "rule__Command__Group_5_8__0__Impl"


    // $ANTLR start "rule__Command__Group_5_8__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: rule__Command__Group_5_8__1 : rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2 ;
    public final void rule__Command__Group_5_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:1: ( rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3667:2: rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__1__Impl_in_rule__Command__Group_5_8__17362);
            rule__Command__Group_5_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__2_in_rule__Command__Group_5_8__17365);
            rule__Command__Group_5_8__2();

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
    // $ANTLR end "rule__Command__Group_5_8__1"


    // $ANTLR start "rule__Command__Group_5_8__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3674:1: rule__Command__Group_5_8__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5_8__1__Impl7392); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_1()); 
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
    // $ANTLR end "rule__Command__Group_5_8__1__Impl"


    // $ANTLR start "rule__Command__Group_5_8__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3691:1: rule__Command__Group_5_8__2 : rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3 ;
    public final void rule__Command__Group_5_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: ( rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:2: rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__2__Impl_in_rule__Command__Group_5_8__27421);
            rule__Command__Group_5_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__3_in_rule__Command__Group_5_8__27424);
            rule__Command__Group_5_8__3();

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
    // $ANTLR end "rule__Command__Group_5_8__2"


    // $ANTLR start "rule__Command__Group_5_8__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3703:1: rule__Command__Group_5_8__2__Impl : ( ( rule__Command__C2Assignment_5_8_2 ) ) ;
    public final void rule__Command__Group_5_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( ( ( rule__Command__C2Assignment_5_8_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( ( rule__Command__C2Assignment_5_8_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( ( rule__Command__C2Assignment_5_8_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ( rule__Command__C2Assignment_5_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC2Assignment_5_8_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: ( rule__Command__C2Assignment_5_8_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:2: rule__Command__C2Assignment_5_8_2
            {
            pushFollow(FOLLOW_rule__Command__C2Assignment_5_8_2_in_rule__Command__Group_5_8__2__Impl7451);
            rule__Command__C2Assignment_5_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC2Assignment_5_8_2()); 
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
    // $ANTLR end "rule__Command__Group_5_8__2__Impl"


    // $ANTLR start "rule__Command__Group_5_8__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3720:1: rule__Command__Group_5_8__3 : rule__Command__Group_5_8__3__Impl ;
    public final void rule__Command__Group_5_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: ( rule__Command__Group_5_8__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:2: rule__Command__Group_5_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__3__Impl_in_rule__Command__Group_5_8__37481);
            rule__Command__Group_5_8__3__Impl();

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
    // $ANTLR end "rule__Command__Group_5_8__3"


    // $ANTLR start "rule__Command__Group_5_8__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:1: rule__Command__Group_5_8__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5_8__3__Impl7508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_3()); 
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
    // $ANTLR end "rule__Command__Group_5_8__3__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3760:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3761:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07545);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__07548);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: rule__And__Group__0__Impl : ( ( rule__And__ExpOuAssignment_0 ) ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:1: ( ( ( rule__And__ExpOuAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:1: ( ( rule__And__ExpOuAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:1: ( ( rule__And__ExpOuAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3774:1: ( rule__And__ExpOuAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOuAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3775:1: ( rule__And__ExpOuAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3775:2: rule__And__ExpOuAssignment_0
            {
            pushFollow(FOLLOW_rule__And__ExpOuAssignment_0_in_rule__And__Group__0__Impl7575);
            rule__And__ExpOuAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpOuAssignment_0()); 
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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:1: ( rule__And__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__17605);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( ( rule__And__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3802:1: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: ( rule__And__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl7632);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1()); 
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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__07667);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__07670);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: rule__And__Group_1__0__Impl : ( RULE_LC ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__And__Group_1__0__Impl7697); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__17726);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__17729);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( ( 'and' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( 'and' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( 'and' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__And__Group_1__1__Impl7757); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl rule__And__Group_1__3 ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( rule__And__Group_1__2__Impl rule__And__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:2: rule__And__Group_1__2__Impl rule__And__Group_1__3
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__27788);
            rule__And__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__3_in_rule__And__Group_1__27791);
            rule__And__Group_1__3();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: rule__And__Group_1__2__Impl : ( RULE_LC ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__And__Group_1__2__Impl7818); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
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
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group_1__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: rule__And__Group_1__3 : rule__And__Group_1__3__Impl ;
    public final void rule__And__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( rule__And__Group_1__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:2: rule__And__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__3__Impl_in_rule__And__Group_1__37847);
            rule__And__Group_1__3__Impl();

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
    // $ANTLR end "rule__And__Group_1__3"


    // $ANTLR start "rule__And__Group_1__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: rule__And__Group_1__3__Impl : ( ( rule__And__ExpOu2Assignment_1_3 ) ) ;
    public final void rule__And__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:1: ( ( ( rule__And__ExpOu2Assignment_1_3 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( ( rule__And__ExpOu2Assignment_1_3 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( ( rule__And__ExpOu2Assignment_1_3 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( rule__And__ExpOu2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOu2Assignment_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: ( rule__And__ExpOu2Assignment_1_3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:2: rule__And__ExpOu2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__And__ExpOu2Assignment_1_3_in_rule__And__Group_1__3__Impl7874);
            rule__And__ExpOu2Assignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpOu2Assignment_1_3()); 
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
    // $ANTLR end "rule__And__Group_1__3__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3947:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07912);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07915);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: rule__Or__Group__0__Impl : ( ( rule__Or__ExpNonAssignment_0 ) ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ( ( ( rule__Or__ExpNonAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( ( rule__Or__ExpNonAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( ( rule__Or__ExpNonAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: ( rule__Or__ExpNonAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNonAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3961:1: ( rule__Or__ExpNonAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3961:2: rule__Or__ExpNonAssignment_0
            {
            pushFollow(FOLLOW_rule__Or__ExpNonAssignment_0_in_rule__Or__Group__0__Impl7942);
            rule__Or__ExpNonAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpNonAssignment_0()); 
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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3975:1: ( rule__Or__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3976:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17972);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3988:1: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: ( rule__Or__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl7999);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08034);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08037);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4015:1: rule__Or__Group_1__0__Impl : ( RULE_LC ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Or__Group_1__0__Impl8064); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4032:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18093);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__18096);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4044:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:1: ( ( 'or' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: ( 'or' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: ( 'or' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4050:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Or__Group_1__1__Impl8124); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
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
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl rule__Or__Group_1__3 ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:1: ( rule__Or__Group_1__2__Impl rule__Or__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:2: rule__Or__Group_1__2__Impl rule__Or__Group_1__3
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__28155);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__3_in_rule__Or__Group_1__28158);
            rule__Or__Group_1__3();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4075:1: rule__Or__Group_1__2__Impl : ( RULE_LC ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4081:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Or__Group_1__2__Impl8185); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
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
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__Or__Group_1__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: rule__Or__Group_1__3 : rule__Or__Group_1__3__Impl ;
    public final void rule__Or__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4096:1: ( rule__Or__Group_1__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:2: rule__Or__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__3__Impl_in_rule__Or__Group_1__38214);
            rule__Or__Group_1__3__Impl();

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
    // $ANTLR end "rule__Or__Group_1__3"


    // $ANTLR start "rule__Or__Group_1__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4103:1: rule__Or__Group_1__3__Impl : ( ( rule__Or__ExpNon2Assignment_1_3 ) ) ;
    public final void rule__Or__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:1: ( ( ( rule__Or__ExpNon2Assignment_1_3 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ( ( rule__Or__ExpNon2Assignment_1_3 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ( ( rule__Or__ExpNon2Assignment_1_3 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:1: ( rule__Or__ExpNon2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNon2Assignment_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:1: ( rule__Or__ExpNon2Assignment_1_3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:2: rule__Or__ExpNon2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__Or__ExpNon2Assignment_1_3_in_rule__Or__Group_1__3__Impl8241);
            rule__Or__ExpNon2Assignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpNon2Assignment_1_3()); 
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
    // $ANTLR end "rule__Or__Group_1__3__Impl"


    // $ANTLR start "rule__Not__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4128:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4132:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4133:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__08279);
            rule__Not__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Not__Group__1_in_rule__Not__Group__08282);
            rule__Not__Group__1();

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
    // $ANTLR end "rule__Not__Group__0"


    // $ANTLR start "rule__Not__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:1: rule__Not__Group__0__Impl : ( ( rule__Not__Group_0__0 )* ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4144:1: ( ( ( rule__Not__Group_0__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: ( ( rule__Not__Group_0__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: ( ( rule__Not__Group_0__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: ( rule__Not__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getGroup_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:1: ( rule__Not__Group_0__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:2: rule__Not__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Not__Group_0__0_in_rule__Not__Group__0__Impl8309);
            	    rule__Not__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getGroup_0()); 
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
    // $ANTLR end "rule__Not__Group__0__Impl"


    // $ANTLR start "rule__Not__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4157:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: ( rule__Not__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:2: rule__Not__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__18340);
            rule__Not__Group__1__Impl();

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
    // $ANTLR end "rule__Not__Group__1"


    // $ANTLR start "rule__Not__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: rule__Not__Group__1__Impl : ( ( rule__Not__ExpEqAssignment_1 ) ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4172:1: ( ( ( rule__Not__ExpEqAssignment_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4173:1: ( ( rule__Not__ExpEqAssignment_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4173:1: ( ( rule__Not__ExpEqAssignment_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4174:1: ( rule__Not__ExpEqAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getExpEqAssignment_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:1: ( rule__Not__ExpEqAssignment_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:2: rule__Not__ExpEqAssignment_1
            {
            pushFollow(FOLLOW_rule__Not__ExpEqAssignment_1_in_rule__Not__Group__1__Impl8367);
            rule__Not__ExpEqAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getExpEqAssignment_1()); 
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
    // $ANTLR end "rule__Not__Group__1__Impl"


    // $ANTLR start "rule__Not__Group_0__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4194:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
            {
            pushFollow(FOLLOW_rule__Not__Group_0__0__Impl_in_rule__Not__Group_0__08401);
            rule__Not__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Not__Group_0__1_in_rule__Not__Group_0__08404);
            rule__Not__Group_0__1();

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
    // $ANTLR end "rule__Not__Group_0__0"


    // $ANTLR start "rule__Not__Group_0__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4201:1: rule__Not__Group_0__0__Impl : ( ( rule__Not__NonAssignment_0_0 ) ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4205:1: ( ( ( rule__Not__NonAssignment_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: ( ( rule__Not__NonAssignment_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: ( ( rule__Not__NonAssignment_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: ( rule__Not__NonAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNonAssignment_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:1: ( rule__Not__NonAssignment_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:2: rule__Not__NonAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Not__NonAssignment_0_0_in_rule__Not__Group_0__0__Impl8431);
            rule__Not__NonAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getNonAssignment_0_0()); 
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
    // $ANTLR end "rule__Not__Group_0__0__Impl"


    // $ANTLR start "rule__Not__Group_0__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4218:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:1: ( rule__Not__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4223:2: rule__Not__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Not__Group_0__1__Impl_in_rule__Not__Group_0__18461);
            rule__Not__Group_0__1__Impl();

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
    // $ANTLR end "rule__Not__Group_0__1"


    // $ANTLR start "rule__Not__Group_0__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: rule__Not__Group_0__1__Impl : ( RULE_LC ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4233:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4234:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4234:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4235:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Not__Group_0__1__Impl8488); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
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
    // $ANTLR end "rule__Not__Group_0__1__Impl"


    // $ANTLR start "rule__Eq__Group_0__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4250:1: rule__Eq__Group_0__0 : rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1 ;
    public final void rule__Eq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:1: ( rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4255:2: rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__0__Impl_in_rule__Eq__Group_0__08521);
            rule__Eq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__1_in_rule__Eq__Group_0__08524);
            rule__Eq__Group_0__1();

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
    // $ANTLR end "rule__Eq__Group_0__0"


    // $ANTLR start "rule__Eq__Group_0__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4262:1: rule__Eq__Group_0__0__Impl : ( ( rule__Eq__ExprEq1Assignment_0_0 ) ) ;
    public final void rule__Eq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: ( ( ( rule__Eq__ExprEq1Assignment_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:1: ( ( rule__Eq__ExprEq1Assignment_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:1: ( ( rule__Eq__ExprEq1Assignment_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:1: ( rule__Eq__ExprEq1Assignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq1Assignment_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4269:1: ( rule__Eq__ExprEq1Assignment_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4269:2: rule__Eq__ExprEq1Assignment_0_0
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq1Assignment_0_0_in_rule__Eq__Group_0__0__Impl8551);
            rule__Eq__ExprEq1Assignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExprEq1Assignment_0_0()); 
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
    // $ANTLR end "rule__Eq__Group_0__0__Impl"


    // $ANTLR start "rule__Eq__Group_0__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4279:1: rule__Eq__Group_0__1 : rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2 ;
    public final void rule__Eq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4283:1: ( rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4284:2: rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__1__Impl_in_rule__Eq__Group_0__18581);
            rule__Eq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__2_in_rule__Eq__Group_0__18584);
            rule__Eq__Group_0__2();

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
    // $ANTLR end "rule__Eq__Group_0__1"


    // $ANTLR start "rule__Eq__Group_0__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4291:1: rule__Eq__Group_0__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Eq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4295:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:1: ( RULE_LC )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LC) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Eq__Group_0__1__Impl8612); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
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
    // $ANTLR end "rule__Eq__Group_0__1__Impl"


    // $ANTLR start "rule__Eq__Group_0__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4308:1: rule__Eq__Group_0__2 : rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3 ;
    public final void rule__Eq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: ( rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4313:2: rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__2__Impl_in_rule__Eq__Group_0__28643);
            rule__Eq__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__3_in_rule__Eq__Group_0__28646);
            rule__Eq__Group_0__3();

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
    // $ANTLR end "rule__Eq__Group_0__2"


    // $ANTLR start "rule__Eq__Group_0__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4320:1: rule__Eq__Group_0__2__Impl : ( '=?' ) ;
    public final void rule__Eq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4324:1: ( ( '=?' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4325:1: ( '=?' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4325:1: ( '=?' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4326:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__Eq__Group_0__2__Impl8674); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
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
    // $ANTLR end "rule__Eq__Group_0__2__Impl"


    // $ANTLR start "rule__Eq__Group_0__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4339:1: rule__Eq__Group_0__3 : rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4 ;
    public final void rule__Eq__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: ( rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:2: rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__3__Impl_in_rule__Eq__Group_0__38705);
            rule__Eq__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__4_in_rule__Eq__Group_0__38708);
            rule__Eq__Group_0__4();

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
    // $ANTLR end "rule__Eq__Group_0__3"


    // $ANTLR start "rule__Eq__Group_0__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4351:1: rule__Eq__Group_0__3__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Eq__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4355:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4356:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4356:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4357:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( RULE_LC )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_LC) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Eq__Group_0__3__Impl8736); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
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
    // $ANTLR end "rule__Eq__Group_0__3__Impl"


    // $ANTLR start "rule__Eq__Group_0__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4368:1: rule__Eq__Group_0__4 : rule__Eq__Group_0__4__Impl ;
    public final void rule__Eq__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4372:1: ( rule__Eq__Group_0__4__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4373:2: rule__Eq__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__4__Impl_in_rule__Eq__Group_0__48767);
            rule__Eq__Group_0__4__Impl();

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
    // $ANTLR end "rule__Eq__Group_0__4"


    // $ANTLR start "rule__Eq__Group_0__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4379:1: rule__Eq__Group_0__4__Impl : ( ( rule__Eq__ExprEq2Assignment_0_4 ) ) ;
    public final void rule__Eq__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4383:1: ( ( ( rule__Eq__ExprEq2Assignment_0_4 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: ( ( rule__Eq__ExprEq2Assignment_0_4 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: ( ( rule__Eq__ExprEq2Assignment_0_4 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: ( rule__Eq__ExprEq2Assignment_0_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq2Assignment_0_4()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4386:1: ( rule__Eq__ExprEq2Assignment_0_4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4386:2: rule__Eq__ExprEq2Assignment_0_4
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq2Assignment_0_4_in_rule__Eq__Group_0__4__Impl8794);
            rule__Eq__ExprEq2Assignment_0_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExprEq2Assignment_0_4()); 
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
    // $ANTLR end "rule__Eq__Group_0__4__Impl"


    // $ANTLR start "rule__Eq__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4406:1: rule__Eq__Group_1__0 : rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1 ;
    public final void rule__Eq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4410:1: ( rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4411:2: rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__0__Impl_in_rule__Eq__Group_1__08834);
            rule__Eq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_1__1_in_rule__Eq__Group_1__08837);
            rule__Eq__Group_1__1();

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
    // $ANTLR end "rule__Eq__Group_1__0"


    // $ANTLR start "rule__Eq__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: rule__Eq__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Eq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4422:1: ( ( '(' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4423:1: ( '(' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4423:1: ( '(' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4424:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Eq__Group_1__0__Impl8865); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0()); 
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
    // $ANTLR end "rule__Eq__Group_1__0__Impl"


    // $ANTLR start "rule__Eq__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4437:1: rule__Eq__Group_1__1 : rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2 ;
    public final void rule__Eq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:1: ( rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4442:2: rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__1__Impl_in_rule__Eq__Group_1__18896);
            rule__Eq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_1__2_in_rule__Eq__Group_1__18899);
            rule__Eq__Group_1__2();

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
    // $ANTLR end "rule__Eq__Group_1__1"


    // $ANTLR start "rule__Eq__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:1: rule__Eq__Group_1__1__Impl : ( ( rule__Eq__ExpAssignment_1_1 ) ) ;
    public final void rule__Eq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( ( ( rule__Eq__ExpAssignment_1_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: ( ( rule__Eq__ExpAssignment_1_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: ( ( rule__Eq__ExpAssignment_1_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:1: ( rule__Eq__ExpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExpAssignment_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4456:1: ( rule__Eq__ExpAssignment_1_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4456:2: rule__Eq__ExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Eq__ExpAssignment_1_1_in_rule__Eq__Group_1__1__Impl8926);
            rule__Eq__ExpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExpAssignment_1_1()); 
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
    // $ANTLR end "rule__Eq__Group_1__1__Impl"


    // $ANTLR start "rule__Eq__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4466:1: rule__Eq__Group_1__2 : rule__Eq__Group_1__2__Impl ;
    public final void rule__Eq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4470:1: ( rule__Eq__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:2: rule__Eq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__2__Impl_in_rule__Eq__Group_1__28956);
            rule__Eq__Group_1__2__Impl();

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
    // $ANTLR end "rule__Eq__Group_1__2"


    // $ANTLR start "rule__Eq__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4477:1: rule__Eq__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Eq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4481:1: ( ( ')' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4482:1: ( ')' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4482:1: ( ')' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,38,FOLLOW_38_in_rule__Eq__Group_1__2__Impl8984); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2()); 
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
    // $ANTLR end "rule__Eq__Group_1__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4502:1: rule__ExprSimple__Group__0 : rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1 ;
    public final void rule__ExprSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4506:1: ( rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4507:2: rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__0__Impl_in_rule__ExprSimple__Group__09021);
            rule__ExprSimple__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group__1_in_rule__ExprSimple__Group__09024);
            rule__ExprSimple__Group__1();

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
    // $ANTLR end "rule__ExprSimple__Group__0"


    // $ANTLR start "rule__ExprSimple__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: rule__ExprSimple__Group__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4518:1: ( ( '(' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4519:1: ( '(' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4519:1: ( '(' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ExprSimple__Group__0__Impl9052); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__ExprSimple__Group__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:1: rule__ExprSimple__Group__1 : rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2 ;
    public final void rule__ExprSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: ( rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4538:2: rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__1__Impl_in_rule__ExprSimple__Group__19083);
            rule__ExprSimple__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group__2_in_rule__ExprSimple__Group__19086);
            rule__ExprSimple__Group__2();

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
    // $ANTLR end "rule__ExprSimple__Group__1"


    // $ANTLR start "rule__ExprSimple__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4545:1: rule__ExprSimple__Group__1__Impl : ( ( rule__ExprSimple__Alternatives_1 ) ) ;
    public final void rule__ExprSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: ( ( ( rule__ExprSimple__Alternatives_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:1: ( ( rule__ExprSimple__Alternatives_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:1: ( ( rule__ExprSimple__Alternatives_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: ( rule__ExprSimple__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:1: ( rule__ExprSimple__Alternatives_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:2: rule__ExprSimple__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_1_in_rule__ExprSimple__Group__1__Impl9113);
            rule__ExprSimple__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__ExprSimple__Group__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: rule__ExprSimple__Group__2 : rule__ExprSimple__Group__2__Impl ;
    public final void rule__ExprSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4566:1: ( rule__ExprSimple__Group__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:2: rule__ExprSimple__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__2__Impl_in_rule__ExprSimple__Group__29143);
            rule__ExprSimple__Group__2__Impl();

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
    // $ANTLR end "rule__ExprSimple__Group__2"


    // $ANTLR start "rule__ExprSimple__Group__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:1: rule__ExprSimple__Group__2__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4577:1: ( ( ')' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4578:1: ( ')' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4578:1: ( ')' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_38_in_rule__ExprSimple__Group__2__Impl9171); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ExprSimple__Group__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1_0__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:1: rule__ExprSimple__Group_1_0__0 : rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1 ;
    public final void rule__ExprSimple__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4602:1: ( rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4603:2: rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__0__Impl_in_rule__ExprSimple__Group_1_0__09208);
            rule__ExprSimple__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__1_in_rule__ExprSimple__Group_1_0__09211);
            rule__ExprSimple__Group_1_0__1();

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
    // $ANTLR end "rule__ExprSimple__Group_1_0__0"


    // $ANTLR start "rule__ExprSimple__Group_1_0__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4610:1: rule__ExprSimple__Group_1_0__0__Impl : ( ( rule__ExprSimple__MotAssignment_1_0_0 ) ) ;
    public final void rule__ExprSimple__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4614:1: ( ( ( rule__ExprSimple__MotAssignment_1_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4615:1: ( ( rule__ExprSimple__MotAssignment_1_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4615:1: ( ( rule__ExprSimple__MotAssignment_1_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4616:1: ( rule__ExprSimple__MotAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAssignment_1_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:1: ( rule__ExprSimple__MotAssignment_1_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:2: rule__ExprSimple__MotAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAssignment_1_0_0_in_rule__ExprSimple__Group_1_0__0__Impl9238);
            rule__ExprSimple__MotAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAssignment_1_0_0()); 
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
    // $ANTLR end "rule__ExprSimple__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1_0__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4627:1: rule__ExprSimple__Group_1_0__1 : rule__ExprSimple__Group_1_0__1__Impl ;
    public final void rule__ExprSimple__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4631:1: ( rule__ExprSimple__Group_1_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4632:2: rule__ExprSimple__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__1__Impl_in_rule__ExprSimple__Group_1_0__19268);
            rule__ExprSimple__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__ExprSimple__Group_1_0__1"


    // $ANTLR start "rule__ExprSimple__Group_1_0__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4638:1: rule__ExprSimple__Group_1_0__1__Impl : ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) ) ;
    public final void rule__ExprSimple__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4642:1: ( ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4644:1: ( rule__ExprSimple__LexprAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexprAssignment_1_0_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:1: ( rule__ExprSimple__LexprAssignment_1_0_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:2: rule__ExprSimple__LexprAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__LexprAssignment_1_0_1_in_rule__ExprSimple__Group_1_0__1__Impl9295);
            rule__ExprSimple__LexprAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLexprAssignment_1_0_1()); 
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
    // $ANTLR end "rule__ExprSimple__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4659:1: rule__ExprSimple__Group_1_1__0 : rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1 ;
    public final void rule__ExprSimple__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4663:1: ( rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4664:2: rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__0__Impl_in_rule__ExprSimple__Group_1_1__09329);
            rule__ExprSimple__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__1_in_rule__ExprSimple__Group_1_1__09332);
            rule__ExprSimple__Group_1_1__1();

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
    // $ANTLR end "rule__ExprSimple__Group_1_1__0"


    // $ANTLR start "rule__ExprSimple__Group_1_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4671:1: rule__ExprSimple__Group_1_1__0__Impl : ( ( rule__ExprSimple__MotAssignment_1_1_0 ) ) ;
    public final void rule__ExprSimple__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4675:1: ( ( ( rule__ExprSimple__MotAssignment_1_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4676:1: ( ( rule__ExprSimple__MotAssignment_1_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4676:1: ( ( rule__ExprSimple__MotAssignment_1_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: ( rule__ExprSimple__MotAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAssignment_1_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:1: ( rule__ExprSimple__MotAssignment_1_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:2: rule__ExprSimple__MotAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAssignment_1_1_0_in_rule__ExprSimple__Group_1_1__0__Impl9359);
            rule__ExprSimple__MotAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAssignment_1_1_0()); 
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
    // $ANTLR end "rule__ExprSimple__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4688:1: rule__ExprSimple__Group_1_1__1 : rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2 ;
    public final void rule__ExprSimple__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:1: ( rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4693:2: rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__1__Impl_in_rule__ExprSimple__Group_1_1__19389);
            rule__ExprSimple__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__2_in_rule__ExprSimple__Group_1_1__19392);
            rule__ExprSimple__Group_1_1__2();

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
    // $ANTLR end "rule__ExprSimple__Group_1_1__1"


    // $ANTLR start "rule__ExprSimple__Group_1_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4700:1: rule__ExprSimple__Group_1_1__1__Impl : ( RULE_LC ) ;
    public final void rule__ExprSimple__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4705:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4705:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__ExprSimple__Group_1_1__1__Impl9419); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
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
    // $ANTLR end "rule__ExprSimple__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4717:1: rule__ExprSimple__Group_1_1__2 : rule__ExprSimple__Group_1_1__2__Impl ;
    public final void rule__ExprSimple__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4721:1: ( rule__ExprSimple__Group_1_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:2: rule__ExprSimple__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__2__Impl_in_rule__ExprSimple__Group_1_1__29448);
            rule__ExprSimple__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__ExprSimple__Group_1_1__2"


    // $ANTLR start "rule__ExprSimple__Group_1_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4728:1: rule__ExprSimple__Group_1_1__2__Impl : ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) ) ;
    public final void rule__ExprSimple__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4732:1: ( ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4733:1: ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4733:1: ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4734:1: ( rule__ExprSimple__ExprAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprAssignment_1_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: ( rule__ExprSimple__ExprAssignment_1_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:2: rule__ExprSimple__ExprAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprAssignment_1_1_2_in_rule__ExprSimple__Group_1_1__2__Impl9475);
            rule__ExprSimple__ExprAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprAssignment_1_1_2()); 
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
    // $ANTLR end "rule__ExprSimple__Group_1_1__2__Impl"


    // $ANTLR start "rule__Lexpr__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:1: rule__Lexpr__Group__0 : rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1 ;
    public final void rule__Lexpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4755:1: ( rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:2: rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__0__Impl_in_rule__Lexpr__Group__09511);
            rule__Lexpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Lexpr__Group__1_in_rule__Lexpr__Group__09514);
            rule__Lexpr__Group__1();

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
    // $ANTLR end "rule__Lexpr__Group__0"


    // $ANTLR start "rule__Lexpr__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4763:1: rule__Lexpr__Group__0__Impl : ( RULE_LC ) ;
    public final void rule__Lexpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4767:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4768:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4768:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4769:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Lexpr__Group__0__Impl9541); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Lexpr__Group__0__Impl"


    // $ANTLR start "rule__Lexpr__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4780:1: rule__Lexpr__Group__1 : rule__Lexpr__Group__1__Impl ;
    public final void rule__Lexpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: ( rule__Lexpr__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4785:2: rule__Lexpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__1__Impl_in_rule__Lexpr__Group__19570);
            rule__Lexpr__Group__1__Impl();

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
    // $ANTLR end "rule__Lexpr__Group__1"


    // $ANTLR start "rule__Lexpr__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4791:1: rule__Lexpr__Group__1__Impl : ( ( rule__Lexpr__ExpAssignment_1 ) ) ;
    public final void rule__Lexpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( ( ( rule__Lexpr__ExpAssignment_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ( ( rule__Lexpr__ExpAssignment_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ( ( rule__Lexpr__ExpAssignment_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( rule__Lexpr__ExpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getExpAssignment_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ( rule__Lexpr__ExpAssignment_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:2: rule__Lexpr__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__Lexpr__ExpAssignment_1_in_rule__Lexpr__Group__1__Impl9597);
            rule__Lexpr__ExpAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getExpAssignment_1()); 
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
    // $ANTLR end "rule__Lexpr__Group__1__Impl"


    // $ANTLR start "rule__Model__ModelAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: rule__Model__ModelAssignment_0 : ( rulefunction ) ;
    public final void rule__Model__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4817:1: ( ( rulefunction ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4818:1: ( rulefunction )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4818:1: ( rulefunction )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4819:1: rulefunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelFunctionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulefunction_in_rule__Model__ModelAssignment_09636);
            rulefunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelFunctionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Model__ModelAssignment_0"


    // $ANTLR start "rule__Function__FunNameAssignment_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:1: rule__Function__FunNameAssignment_2 : ( RULE_SYMBOLES ) ;
    public final void rule__Function__FunNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4832:1: ( ( RULE_SYMBOLES ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4833:1: ( RULE_SYMBOLES )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4833:1: ( RULE_SYMBOLES )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4834:1: RULE_SYMBOLES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunNameSYMBOLESTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rule__Function__FunNameAssignment_29667); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFunNameSYMBOLESTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Function__FunNameAssignment_2"


    // $ANTLR start "rule__Function__DefAssignment_5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4843:1: rule__Function__DefAssignment_5 : ( ruleDefiniton ) ;
    public final void rule__Function__DefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:1: ( ( ruleDefiniton ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4848:1: ( ruleDefiniton )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4848:1: ( ruleDefiniton )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4849:1: ruleDefiniton
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefDefinitonParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleDefiniton_in_rule__Function__DefAssignment_59698);
            ruleDefiniton();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDefDefinitonParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Function__DefAssignment_5"


    // $ANTLR start "rule__Definiton__InputVarsAssignment_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: rule__Definiton__InputVarsAssignment_2 : ( ruleInput ) ;
    public final void rule__Definiton__InputVarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4862:1: ( ( ruleInput ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4863:1: ( ruleInput )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4863:1: ( ruleInput )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4864:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getInputVarsInputParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Definiton__InputVarsAssignment_29729);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getInputVarsInputParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Definiton__InputVarsAssignment_2"


    // $ANTLR start "rule__Definiton__CommandListAssignment_5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4873:1: rule__Definiton__CommandListAssignment_5 : ( ruleCommands ) ;
    public final void rule__Definiton__CommandListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4877:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4879:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getCommandListCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Definiton__CommandListAssignment_59760);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getCommandListCommandsParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Definiton__CommandListAssignment_5"


    // $ANTLR start "rule__Definiton__OutputVarsAssignment_10"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4888:1: rule__Definiton__OutputVarsAssignment_10 : ( ruleOutput ) ;
    public final void rule__Definiton__OutputVarsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4892:1: ( ( ruleOutput ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4893:1: ( ruleOutput )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4893:1: ( ruleOutput )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4894:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getOutputVarsOutputParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Definiton__OutputVarsAssignment_109791);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getOutputVarsOutputParserRuleCall_10_0()); 
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
    // $ANTLR end "rule__Definiton__OutputVarsAssignment_10"


    // $ANTLR start "rule__Input__VAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4903:1: rule__Input__VAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4907:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4908:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4908:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4909:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVVARIABLETerminalRuleCall_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VAssignment_09822); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVVARIABLETerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Input__VAssignment_0"


    // $ANTLR start "rule__Input__V2Assignment_1_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:1: rule__Input__V2Assignment_1_2 : ( RULE_VARIABLE ) ;
    public final void rule__Input__V2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4922:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4924:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__V2Assignment_1_29853); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Input__V2Assignment_1_2"


    // $ANTLR start "rule__Output__VAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4933:1: rule__Output__VAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4937:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4939:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVVARIABLETerminalRuleCall_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VAssignment_09884); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVVARIABLETerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Output__VAssignment_0"


    // $ANTLR start "rule__Output__V2Assignment_1_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: rule__Output__V2Assignment_1_2 : ( RULE_VARIABLE ) ;
    public final void rule__Output__V2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4952:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4954:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__V2Assignment_1_29915); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Output__V2Assignment_1_2"


    // $ANTLR start "rule__Commands__CAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4963:1: rule__Commands__CAssignment_0 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4967:1: ( ( ruleCommand ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4968:1: ( ruleCommand )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4968:1: ( ruleCommand )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4969:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_09946);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Commands__CAssignment_0"


    // $ANTLR start "rule__Commands__CAssignment_1_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:1: rule__Commands__CAssignment_1_2 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4982:1: ( ( ruleCommand ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: ( ruleCommand )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: ( ruleCommand )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4984:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_29977);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Commands__CAssignment_1_2"


    // $ANTLR start "rule__Exprs__ExpAssignment_1_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: rule__Exprs__ExpAssignment_1_1 : ( ruleExprs ) ;
    public final void rule__Exprs__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4997:1: ( ( ruleExprs ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4998:1: ( ruleExprs )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4998:1: ( ruleExprs )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpExprsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Exprs__ExpAssignment_1_110008);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpExprsParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Exprs__ExpAssignment_1_1"


    // $ANTLR start "rule__Command__VarLAssignment_1_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: rule__Command__VarLAssignment_1_0 : ( ruleVars ) ;
    public final void rule__Command__VarLAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5012:1: ( ( ruleVars ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: ( ruleVars )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: ( ruleVars )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5014:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarLVarsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Command__VarLAssignment_1_010039);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getVarLVarsParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Command__VarLAssignment_1_0"


    // $ANTLR start "rule__Command__ExpLAssignment_1_4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5023:1: rule__Command__ExpLAssignment_1_4 : ( ruleExprs ) ;
    public final void rule__Command__ExpLAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5027:1: ( ( ruleExprs ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5028:1: ( ruleExprs )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5028:1: ( ruleExprs )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5029:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpLExprsParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Command__ExpLAssignment_1_410070);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpLExprsParserRuleCall_1_4_0()); 
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
    // $ANTLR end "rule__Command__ExpLAssignment_1_4"


    // $ANTLR start "rule__Command__NomAssignment_2_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5038:1: rule__Command__NomAssignment_2_0 : ( ( 'while' ) ) ;
    public final void rule__Command__NomAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5042:1: ( ( ( 'while' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: ( ( 'while' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: ( ( 'while' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5044:1: ( 'while' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5045:1: ( 'while' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5046:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Command__NomAssignment_2_010106); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
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
    // $ANTLR end "rule__Command__NomAssignment_2_0"


    // $ANTLR start "rule__Command__ExpAssignment_2_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: rule__Command__ExpAssignment_2_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5065:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_2_210145);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpExprParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__Command__ExpAssignment_2_2"


    // $ANTLR start "rule__Command__C1Assignment_2_6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5076:1: rule__Command__C1Assignment_2_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5080:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5082:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_2_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_2_610176);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_2_6_0()); 
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
    // $ANTLR end "rule__Command__C1Assignment_2_6"


    // $ANTLR start "rule__Command__NomAssignment_3_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5091:1: rule__Command__NomAssignment_3_0 : ( ( 'for' ) ) ;
    public final void rule__Command__NomAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5095:1: ( ( ( 'for' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:1: ( ( 'for' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:1: ( ( 'for' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( 'for' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: ( 'for' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Command__NomAssignment_3_010212); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
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
    // $ANTLR end "rule__Command__NomAssignment_3_0"


    // $ANTLR start "rule__Command__ExpAssignment_3_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: rule__Command__ExpAssignment_3_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5118:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5119:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5119:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5120:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_3_210251);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpExprParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__Command__ExpAssignment_3_2"


    // $ANTLR start "rule__Command__C1Assignment_3_6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: rule__Command__C1Assignment_3_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5133:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5134:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5134:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5135:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_3_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_3_610282);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_3_6_0()); 
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
    // $ANTLR end "rule__Command__C1Assignment_3_6"


    // $ANTLR start "rule__Command__NomAssignment_4_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: rule__Command__NomAssignment_4_0 : ( ( 'foreach' ) ) ;
    public final void rule__Command__NomAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5148:1: ( ( ( 'foreach' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5149:1: ( ( 'foreach' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5149:1: ( ( 'foreach' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5150:1: ( 'foreach' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5151:1: ( 'foreach' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5152:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Command__NomAssignment_4_010318); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
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
    // $ANTLR end "rule__Command__NomAssignment_4_0"


    // $ANTLR start "rule__Command__Exp1Assignment_4_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5167:1: rule__Command__Exp1Assignment_4_2 : ( ruleExpr ) ;
    public final void rule__Command__Exp1Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5171:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp1ExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Exp1Assignment_4_210357);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExp1ExprParserRuleCall_4_2_0()); 
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
    // $ANTLR end "rule__Command__Exp1Assignment_4_2"


    // $ANTLR start "rule__Command__Exp2Assignment_4_6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5182:1: rule__Command__Exp2Assignment_4_6 : ( ruleExpr ) ;
    public final void rule__Command__Exp2Assignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5186:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5187:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5187:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp2ExprParserRuleCall_4_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Exp2Assignment_4_610388);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExp2ExprParserRuleCall_4_6_0()); 
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
    // $ANTLR end "rule__Command__Exp2Assignment_4_6"


    // $ANTLR start "rule__Command__C1Assignment_4_10"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5197:1: rule__Command__C1Assignment_4_10 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_4_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5201:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5202:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5202:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5203:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_4_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_4_1010419);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_4_10_0()); 
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
    // $ANTLR end "rule__Command__C1Assignment_4_10"


    // $ANTLR start "rule__Command__NomAssignment_5_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5212:1: rule__Command__NomAssignment_5_0 : ( ( 'if' ) ) ;
    public final void rule__Command__NomAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5216:1: ( ( ( 'if' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5217:1: ( ( 'if' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5217:1: ( ( 'if' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: ( 'if' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: ( 'if' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5220:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Command__NomAssignment_5_010455); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
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
    // $ANTLR end "rule__Command__NomAssignment_5_0"


    // $ANTLR start "rule__Command__ExpAssignment_5_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: rule__Command__ExpAssignment_5_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5239:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5240:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5240:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5241:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_5_210494);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpExprParserRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__Command__ExpAssignment_5_2"


    // $ANTLR start "rule__Command__C1Assignment_5_6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: rule__Command__C1Assignment_5_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_5_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5254:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5255:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5255:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5256:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_5_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_5_610525);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_5_6_0()); 
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
    // $ANTLR end "rule__Command__C1Assignment_5_6"


    // $ANTLR start "rule__Command__C2Assignment_5_8_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: rule__Command__C2Assignment_5_8_2 : ( ruleCommands ) ;
    public final void rule__Command__C2Assignment_5_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5269:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5270:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5270:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5271:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC2CommandsParserRuleCall_5_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C2Assignment_5_8_210556);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC2CommandsParserRuleCall_5_8_2_0()); 
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
    // $ANTLR end "rule__Command__C2Assignment_5_8_2"


    // $ANTLR start "rule__Expr__ExprSimpleAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5280:1: rule__Expr__ExprSimpleAssignment_0 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExprSimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5284:1: ( ( ruleExprSimple ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5285:1: ( ruleExprSimple )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5285:1: ( ruleExprSimple )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5286:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprSimpleExprSimpleParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpleAssignment_010587);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExprSimpleExprSimpleParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Expr__ExprSimpleAssignment_0"


    // $ANTLR start "rule__Expr__ExpEtAssignment_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:1: rule__Expr__ExpEtAssignment_1 : ( ruleAnd ) ;
    public final void rule__Expr__ExpEtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:1: ( ( ruleAnd ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5300:1: ( ruleAnd )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5300:1: ( ruleAnd )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5301:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpEtAndParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Expr__ExpEtAssignment_110618);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExpEtAndParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Expr__ExpEtAssignment_1"


    // $ANTLR start "rule__Expr__ExpTerminaleAssignment_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5310:1: rule__Expr__ExpTerminaleAssignment_2 : ( ruleExprTerm ) ;
    public final void rule__Expr__ExpTerminaleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5314:1: ( ( ruleExprTerm ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5315:1: ( ruleExprTerm )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5315:1: ( ruleExprTerm )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5316:1: ruleExprTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpTerminaleExprTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprTerm_in_rule__Expr__ExpTerminaleAssignment_210649);
            ruleExprTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExpTerminaleExprTermParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Expr__ExpTerminaleAssignment_2"


    // $ANTLR start "rule__And__ExpOuAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: rule__And__ExpOuAssignment_0 : ( ruleOr ) ;
    public final void rule__And__ExpOuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5329:1: ( ( ruleOr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5330:1: ( ruleOr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5330:1: ( ruleOr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5331:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOuOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__And__ExpOuAssignment_010680);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpOuOrParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__And__ExpOuAssignment_0"


    // $ANTLR start "rule__And__ExpOu2Assignment_1_3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5340:1: rule__And__ExpOu2Assignment_1_3 : ( ruleOr ) ;
    public final void rule__And__ExpOu2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5344:1: ( ( ruleOr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5345:1: ( ruleOr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5345:1: ( ruleOr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5346:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOu2OrParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__And__ExpOu2Assignment_1_310711);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpOu2OrParserRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__And__ExpOu2Assignment_1_3"


    // $ANTLR start "rule__Or__ExpNonAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5355:1: rule__Or__ExpNonAssignment_0 : ( ruleNot ) ;
    public final void rule__Or__ExpNonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5359:1: ( ( ruleNot ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5360:1: ( ruleNot )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5360:1: ( ruleNot )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5361:1: ruleNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNonNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNot_in_rule__Or__ExpNonAssignment_010742);
            ruleNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpNonNotParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Or__ExpNonAssignment_0"


    // $ANTLR start "rule__Or__ExpNon2Assignment_1_3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:1: rule__Or__ExpNon2Assignment_1_3 : ( ruleNot ) ;
    public final void rule__Or__ExpNon2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5374:1: ( ( ruleNot ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5375:1: ( ruleNot )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5375:1: ( ruleNot )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5376:1: ruleNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNon2NotParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleNot_in_rule__Or__ExpNon2Assignment_1_310773);
            ruleNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpNon2NotParserRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__Or__ExpNon2Assignment_1_3"


    // $ANTLR start "rule__Not__NonAssignment_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5385:1: rule__Not__NonAssignment_0_0 : ( ( 'not' ) ) ;
    public final void rule__Not__NonAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5389:1: ( ( ( 'not' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:1: ( ( 'not' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:1: ( ( 'not' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5391:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNonNotKeyword_0_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: ( 'not' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5393:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNonNotKeyword_0_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Not__NonAssignment_0_010809); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getNonNotKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getNonNotKeyword_0_0_0()); 
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
    // $ANTLR end "rule__Not__NonAssignment_0_0"


    // $ANTLR start "rule__Not__ExpEqAssignment_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5408:1: rule__Not__ExpEqAssignment_1 : ( ruleEq ) ;
    public final void rule__Not__ExpEqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5412:1: ( ( ruleEq ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5413:1: ( ruleEq )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5413:1: ( ruleEq )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5414:1: ruleEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getExpEqEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEq_in_rule__Not__ExpEqAssignment_110848);
            ruleEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getExpEqEqParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Not__ExpEqAssignment_1"


    // $ANTLR start "rule__Eq__ExprEq1Assignment_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5423:1: rule__Eq__ExprEq1Assignment_0_0 : ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) ) ;
    public final void rule__Eq__ExprEq1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5427:1: ( ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5428:1: ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5428:1: ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5429:1: ( rule__Eq__ExprEq1Alternatives_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq1Alternatives_0_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5430:1: ( rule__Eq__ExprEq1Alternatives_0_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5430:2: rule__Eq__ExprEq1Alternatives_0_0_0
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq1Alternatives_0_0_0_in_rule__Eq__ExprEq1Assignment_0_010879);
            rule__Eq__ExprEq1Alternatives_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExprEq1Alternatives_0_0_0()); 
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
    // $ANTLR end "rule__Eq__ExprEq1Assignment_0_0"


    // $ANTLR start "rule__Eq__ExprEq2Assignment_0_4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5439:1: rule__Eq__ExprEq2Assignment_0_4 : ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) ) ;
    public final void rule__Eq__ExprEq2Assignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5443:1: ( ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5444:1: ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5444:1: ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5445:1: ( rule__Eq__ExprEq2Alternatives_0_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq2Alternatives_0_4_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5446:1: ( rule__Eq__ExprEq2Alternatives_0_4_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5446:2: rule__Eq__ExprEq2Alternatives_0_4_0
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq2Alternatives_0_4_0_in_rule__Eq__ExprEq2Assignment_0_410912);
            rule__Eq__ExprEq2Alternatives_0_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExprEq2Alternatives_0_4_0()); 
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
    // $ANTLR end "rule__Eq__ExprEq2Assignment_0_4"


    // $ANTLR start "rule__Eq__ExpAssignment_1_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5455:1: rule__Eq__ExpAssignment_1_1 : ( ( rule__Eq__ExpAlternatives_1_1_0 ) ) ;
    public final void rule__Eq__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5459:1: ( ( ( rule__Eq__ExpAlternatives_1_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5460:1: ( ( rule__Eq__ExpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5460:1: ( ( rule__Eq__ExpAlternatives_1_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: ( rule__Eq__ExpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExpAlternatives_1_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5462:1: ( rule__Eq__ExpAlternatives_1_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5462:2: rule__Eq__ExpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Eq__ExpAlternatives_1_1_0_in_rule__Eq__ExpAssignment_1_110945);
            rule__Eq__ExpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExpAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__Eq__ExpAssignment_1_1"


    // $ANTLR start "rule__ExprTerm__ExprTermAssignment"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5471:1: rule__ExprTerm__ExprTermAssignment : ( ( rule__ExprTerm__ExprTermAlternatives_0 ) ) ;
    public final void rule__ExprTerm__ExprTermAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5475:1: ( ( ( rule__ExprTerm__ExprTermAlternatives_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: ( ( rule__ExprTerm__ExprTermAlternatives_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: ( ( rule__ExprTerm__ExprTermAlternatives_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5477:1: ( rule__ExprTerm__ExprTermAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getExprTermAlternatives_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5478:1: ( rule__ExprTerm__ExprTermAlternatives_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5478:2: rule__ExprTerm__ExprTermAlternatives_0
            {
            pushFollow(FOLLOW_rule__ExprTerm__ExprTermAlternatives_0_in_rule__ExprTerm__ExprTermAssignment10978);
            rule__ExprTerm__ExprTermAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTermAccess().getExprTermAlternatives_0()); 
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
    // $ANTLR end "rule__ExprTerm__ExprTermAssignment"


    // $ANTLR start "rule__ExprSimple__MotAssignment_1_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: rule__ExprSimple__MotAssignment_1_0_0 : ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) ) ;
    public final void rule__ExprSimple__MotAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: ( ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5492:1: ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5492:1: ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5493:1: ( rule__ExprSimple__MotAlternatives_1_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAlternatives_1_0_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5494:1: ( rule__ExprSimple__MotAlternatives_1_0_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5494:2: rule__ExprSimple__MotAlternatives_1_0_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAlternatives_1_0_0_0_in_rule__ExprSimple__MotAssignment_1_0_011011);
            rule__ExprSimple__MotAlternatives_1_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAlternatives_1_0_0_0()); 
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
    // $ANTLR end "rule__ExprSimple__MotAssignment_1_0_0"


    // $ANTLR start "rule__ExprSimple__LexprAssignment_1_0_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: rule__ExprSimple__LexprAssignment_1_0_1 : ( ruleLexpr ) ;
    public final void rule__ExprSimple__LexprAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5507:1: ( ( ruleLexpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:1: ( ruleLexpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:1: ( ruleLexpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5509:1: ruleLexpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLexpr_in_rule__ExprSimple__LexprAssignment_1_0_111044);
            ruleLexpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__ExprSimple__LexprAssignment_1_0_1"


    // $ANTLR start "rule__ExprSimple__MotAssignment_1_1_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5518:1: rule__ExprSimple__MotAssignment_1_1_0 : ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) ) ;
    public final void rule__ExprSimple__MotAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5522:1: ( ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5523:1: ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5523:1: ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5524:1: ( rule__ExprSimple__MotAlternatives_1_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAlternatives_1_1_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5525:1: ( rule__ExprSimple__MotAlternatives_1_1_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5525:2: rule__ExprSimple__MotAlternatives_1_1_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAlternatives_1_1_0_0_in_rule__ExprSimple__MotAssignment_1_1_011075);
            rule__ExprSimple__MotAlternatives_1_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAlternatives_1_1_0_0()); 
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
    // $ANTLR end "rule__ExprSimple__MotAssignment_1_1_0"


    // $ANTLR start "rule__ExprSimple__ExprAssignment_1_1_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5534:1: rule__ExprSimple__ExprAssignment_1_1_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5538:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5539:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5539:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5540:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprAssignment_1_1_211108);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__ExprSimple__ExprAssignment_1_1_2"


    // $ANTLR start "rule__Lexpr__ExpAssignment_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5549:1: rule__Lexpr__ExpAssignment_1 : ( ruleExpr ) ;
    public final void rule__Lexpr__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5553:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5554:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5554:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5555:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getExpExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Lexpr__ExpAssignment_111139);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getExpExprParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Lexpr__ExpAssignment_1"

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( ( rule__Expr__ExprSimpleAssignment_0 ) ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__Expr__ExprSimpleAssignment_0 ) )
        {
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__Expr__ExprSimpleAssignment_0 ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ( rule__Expr__ExprSimpleAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getExprSimpleAssignment_0()); 
        }
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( rule__Expr__ExprSimpleAssignment_0 )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:2: rule__Expr__ExprSimpleAssignment_0
        {
        pushFollow(FOLLOW_rule__Expr__ExprSimpleAssignment_0_in_synpred8_InternalMyDsl1246);
        rule__Expr__ExprSimpleAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( ( rule__Expr__ExpEtAssignment_1 ) ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( rule__Expr__ExpEtAssignment_1 ) )
        {
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( rule__Expr__ExpEtAssignment_1 ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ( rule__Expr__ExpEtAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getExpEtAssignment_1()); 
        }
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: ( rule__Expr__ExpEtAssignment_1 )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: rule__Expr__ExpEtAssignment_1
        {
        pushFollow(FOLLOW_rule__Expr__ExpEtAssignment_1_in_synpred9_InternalMyDsl1264);
        rule__Expr__ExpEtAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalMyDsl

    // Delegated rules

    public final boolean synpred8_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA4_eotS =
        "\41\uffff";
    static final String DFA4_eofS =
        "\3\uffff\3\16\33\uffff";
    static final String DFA4_minS =
        "\2\4\1\uffff\3\6\4\uffff\4\0\3\uffff\1\0\2\uffff\1\0\5\uffff\1\0"+
        "\6\uffff";
    static final String DFA4_maxS =
        "\1\53\1\45\1\uffff\3\46\4\uffff\4\0\3\uffff\1\0\2\uffff\1\0\5\uffff"+
        "\1\0\6\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\13\uffff\1\3\21\uffff\1\1";
    static final String DFA4_specialS =
        "\12\uffff\1\0\1\1\1\2\1\3\3\uffff\1\4\2\uffff\1\5\5\uffff\1\6\6"+
        "\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\1\5\10\uffff\1\3\26\uffff\1\1\5\uffff\1\2",
            "\2\2\10\uffff\1\2\1\12\1\13\1\14\1\15\22\uffff\1\2",
            "",
            "\1\21\21\uffff\2\16\12\uffff\1\2\1\uffff\1\16",
            "\1\24\21\uffff\2\16\12\uffff\1\2\1\uffff\1\16",
            "\1\32\21\uffff\2\16\12\uffff\1\2\1\uffff\1\16",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "592:1: rule__Expr__Alternatives : ( ( ( rule__Expr__ExprSimpleAssignment_0 ) ) | ( ( rule__Expr__ExpEtAssignment_1 ) ) | ( ( rule__Expr__ExpTerminaleAssignment_2 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_12 = input.LA(1);

                         
                        int index4_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_13 = input.LA(1);

                         
                        int index4_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_17 = input.LA(1);

                         
                        int index4_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index4_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_20 = input.LA(1);

                         
                        int index4_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index4_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_26 = input.LA(1);

                         
                        int index4_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index4_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\2\4\13\uffff";
    static final String DFA5_maxS =
        "\2\45\13\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\7\uffff";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\2\10\uffff\1\2\26\uffff\1\1",
            "\2\5\10\uffff\1\5\4\2\22\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "620:1: rule__Eq__Alternatives : ( ( ( rule__Eq__Group_0__0 ) ) | ( ( rule__Eq__Group_1__0 ) ) );";
        }
    }
    static final String DFA25_eotS =
        "\24\uffff";
    static final String DFA25_eofS =
        "\1\1\3\uffff\1\1\17\uffff";
    static final String DFA25_minS =
        "\1\6\3\uffff\1\4\17\uffff";
    static final String DFA25_maxS =
        "\1\46\3\uffff\1\53\17\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\20\uffff\1\1\1\uffff";
    static final String DFA25_specialS =
        "\24\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\4\21\uffff\2\1\14\uffff\1\1",
            "",
            "",
            "",
            "\2\1\10\uffff\1\1\7\uffff\1\1\5\uffff\6\1\1\22\2\uffff\1\1"+
            "\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()* loopback of 3803:1: ( rule__And__Group_1__0 )*";
        }
    }
    static final String DFA26_eotS =
        "\25\uffff";
    static final String DFA26_eofS =
        "\1\1\1\uffff\1\1\22\uffff";
    static final String DFA26_minS =
        "\1\6\1\uffff\1\4\22\uffff";
    static final String DFA26_maxS =
        "\1\46\1\uffff\1\53\22\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\21\uffff\1\1\1\uffff";
    static final String DFA26_specialS =
        "\25\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\21\uffff\2\1\14\uffff\1\1",
            "",
            "\2\1\10\uffff\1\1\7\uffff\1\1\5\uffff\7\1\1\23\1\uffff\1\1"+
            "\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 3989:1: ( rule__Or__Group_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel76 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel109 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_rulefunction170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefiniton_in_entryRuleDefiniton197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefiniton204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__0_in_ruleDefiniton230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0_in_ruleOutput350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0_in_ruleCommands410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0_in_ruleVars470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0_in_ruleExprs530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Alternatives_in_ruleExpr650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__0_in_ruleNot830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEq_in_entryRuleEq857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEq864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Alternatives_in_ruleEq890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_entryRuleExprTerm917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTerm924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTerm__ExprTermAssignment_in_ruleExprTerm950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__0_in_ruleExprSimple1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLexpr_in_entryRuleLexpr1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLexpr1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__0_in_ruleLexpr1072 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__0_in_ruleLexpr1084 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Command__Group_0__0_in_rule__Command__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__0_in_rule__Command__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0_in_rule__Command__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0_in_rule__Command__Alternatives1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__0_in_rule__Command__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprSimpleAssignment_0_in_rule__Expr__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpEtAssignment_1_in_rule__Expr__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpTerminaleAssignment_2_in_rule__Expr__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__0_in_rule__Eq__Alternatives1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__0_in_rule__Eq__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__ExprEq1Alternatives_0_0_01366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__ExprEq1Alternatives_0_0_01383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__ExprEq2Alternatives_0_4_01415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__ExprEq2Alternatives_0_4_01432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__ExpAlternatives_1_1_01464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__ExpAlternatives_1_1_01481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ExprTerm__ExprTermAlternatives_01514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__ExprTerm__ExprTermAlternatives_01533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rule__ExprTerm__ExprTermAlternatives_01550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__0_in_rule__ExprSimple__Alternatives_11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__0_in_rule__ExprSimple__Alternatives_11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ExprSimple__MotAlternatives_1_0_0_01634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExprSimple__MotAlternatives_1_0_0_01654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExprSimple__MotAlternatives_1_1_0_01689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExprSimple__MotAlternatives_1_1_0_01709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01741 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ModelAssignment_0_in_rule__Model__Group__0__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Model__Group__1__Impl1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01864 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Function__Group__0__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Function__Group__1__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21985 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__FunNameAssignment_2_in_rule__Function__Group__2__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32045 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Function__Group__3__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42107 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Function__Group__4__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DefAssignment_5_in_rule__Function__Group__5__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__0__Impl_in_rule__Definiton__Group__02235 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__1_in_rule__Definiton__Group__02238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Definiton__Group__0__Impl2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__1__Impl_in_rule__Definiton__Group__12297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__2_in_rule__Definiton__Group__12300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__1__Impl2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__2__Impl_in_rule__Definiton__Group__22356 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__3_in_rule__Definiton__Group__22359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__InputVarsAssignment_2_in_rule__Definiton__Group__2__Impl2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__3__Impl_in_rule__Definiton__Group__32416 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__4_in_rule__Definiton__Group__32419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__3__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__4__Impl_in_rule__Definiton__Group__42475 = new BitSet(new long[]{0x0000078004000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__5_in_rule__Definiton__Group__42478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Definiton__Group__4__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__5__Impl_in_rule__Definiton__Group__52537 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__6_in_rule__Definiton__Group__52540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__CommandListAssignment_5_in_rule__Definiton__Group__5__Impl2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__6__Impl_in_rule__Definiton__Group__62597 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__7_in_rule__Definiton__Group__62600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__6__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__7__Impl_in_rule__Definiton__Group__72656 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__8_in_rule__Definiton__Group__72659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Definiton__Group__7__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__8__Impl_in_rule__Definiton__Group__82718 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__9_in_rule__Definiton__Group__82721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Definiton__Group__8__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__9__Impl_in_rule__Definiton__Group__92780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__10_in_rule__Definiton__Group__92783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__9__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__10__Impl_in_rule__Definiton__Group__102839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__OutputVarsAssignment_10_in_rule__Definiton__Group__10__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02918 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VAssignment_0_in_rule__Input__Group__0__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3005 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03040 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Input__Group_1__0__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13102 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Input__Group_1__2_in_rule__Input__Group_1__13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Input__Group_1__1__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__2__Impl_in_rule__Input__Group_1__23164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__V2Assignment_1_2_in_rule__Input__Group_1__2__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03227 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VAssignment_0_in_rule__Output__Group__0__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3314 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03349 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Output__Group_1__0__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13411 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Output__Group_1__2_in_rule__Output__Group_1__13414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Output__Group_1__1__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__2__Impl_in_rule__Output__Group_1__23473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__V2Assignment_1_2_in_rule__Output__Group_1__2__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03536 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CAssignment_0_in_rule__Commands__Group__0__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl3623 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__03658 = new BitSet(new long[]{0x0000078004000050L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__03661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Commands__Group_1__0__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__13720 = new BitSet(new long[]{0x0000078004000050L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__13723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Commands__Group_1__1__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__23782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CAssignment_1_2_in_rule__Commands__Group_1__2__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__03845 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__03848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__Group__0__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__13904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__03966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__03969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Vars__Group_1__0__Impl3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__14028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Vars__Group_1__1__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04088 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__Group__0__Impl4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__04209 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__04212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Exprs__Group_1__0__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__14271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpAssignment_1_1_in_rule__Exprs__Group_1__1__Impl4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__0__Impl_in_rule__Command__Group_0__04332 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Command__Group_0__1_in_rule__Command__Group_0__04335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__1__Impl_in_rule__Command__Group_0__14393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Command__Group_0__1__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__04456 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__04459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__VarLAssignment_1_0_in_rule__Command__Group_1__0__Impl4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__14516 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__14519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_1__1__Impl4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__24578 = new BitSet(new long[]{0x0000082000004070L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__24581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Command__Group_1__2__Impl4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__34640 = new BitSet(new long[]{0x0000082000004070L});
    public static final BitSet FOLLOW_rule__Command__Group_1__4_in_rule__Command__Group_1__34643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_1__3__Impl4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__4__Impl_in_rule__Command__Group_1__44702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpLAssignment_1_4_in_rule__Command__Group_1__4__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__0__Impl_in_rule__Command__Group_2__04769 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__1_in_rule__Command__Group_2__04772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_2_0_in_rule__Command__Group_2__0__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__1__Impl_in_rule__Command__Group_2__14829 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__Command__Group_2__2_in_rule__Command__Group_2__14832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__1__Impl4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__2__Impl_in_rule__Command__Group_2__24888 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__3_in_rule__Command__Group_2__24891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_2_2_in_rule__Command__Group_2__2__Impl4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__3__Impl_in_rule__Command__Group_2__34948 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_2__4_in_rule__Command__Group_2__34951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__3__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__4__Impl_in_rule__Command__Group_2__45007 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__5_in_rule__Command__Group_2__45010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_2__4__Impl5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__5__Impl_in_rule__Command__Group_2__55069 = new BitSet(new long[]{0x0000078004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__6_in_rule__Command__Group_2__55072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__5__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__6__Impl_in_rule__Command__Group_2__65128 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__7_in_rule__Command__Group_2__65131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_2_6_in_rule__Command__Group_2__6__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__7__Impl_in_rule__Command__Group_2__75188 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_2__8_in_rule__Command__Group_2__75191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__7__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__8__Impl_in_rule__Command__Group_2__85247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_2__8__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__05324 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__05327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_3_0_in_rule__Command__Group_3__0__Impl5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__15384 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__Command__Group_3__2_in_rule__Command__Group_3__15387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__1__Impl5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__2__Impl_in_rule__Command__Group_3__25443 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__3_in_rule__Command__Group_3__25446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_3_2_in_rule__Command__Group_3__2__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__3__Impl_in_rule__Command__Group_3__35503 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_3__4_in_rule__Command__Group_3__35506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__3__Impl5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__4__Impl_in_rule__Command__Group_3__45562 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__5_in_rule__Command__Group_3__45565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_3__4__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__5__Impl_in_rule__Command__Group_3__55624 = new BitSet(new long[]{0x0000078004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__6_in_rule__Command__Group_3__55627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__5__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__6__Impl_in_rule__Command__Group_3__65683 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__7_in_rule__Command__Group_3__65686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_3_6_in_rule__Command__Group_3__6__Impl5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__7__Impl_in_rule__Command__Group_3__75743 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_3__8_in_rule__Command__Group_3__75746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__7__Impl5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__8__Impl_in_rule__Command__Group_3__85802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_3__8__Impl5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__05879 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__05882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_4_0_in_rule__Command__Group_4__0__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__15939 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__Command__Group_4__2_in_rule__Command__Group_4__15942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__1__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__2__Impl_in_rule__Command__Group_4__25998 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__3_in_rule__Command__Group_4__26001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Exp1Assignment_4_2_in_rule__Command__Group_4__2__Impl6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__3__Impl_in_rule__Command__Group_4__36058 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__4_in_rule__Command__Group_4__36061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__3__Impl6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__4__Impl_in_rule__Command__Group_4__46117 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__5_in_rule__Command__Group_4__46120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Command__Group_4__4__Impl6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__5__Impl_in_rule__Command__Group_4__56179 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__Command__Group_4__6_in_rule__Command__Group_4__56182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__5__Impl6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__6__Impl_in_rule__Command__Group_4__66238 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__7_in_rule__Command__Group_4__66241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Exp2Assignment_4_6_in_rule__Command__Group_4__6__Impl6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__7__Impl_in_rule__Command__Group_4__76298 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__8_in_rule__Command__Group_4__76301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__7__Impl6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__8__Impl_in_rule__Command__Group_4__86357 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__9_in_rule__Command__Group_4__86360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_4__8__Impl6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__9__Impl_in_rule__Command__Group_4__96419 = new BitSet(new long[]{0x0000078004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__10_in_rule__Command__Group_4__96422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__9__Impl6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__10__Impl_in_rule__Command__Group_4__106478 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__11_in_rule__Command__Group_4__106481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_4_10_in_rule__Command__Group_4__10__Impl6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__11__Impl_in_rule__Command__Group_4__116538 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__12_in_rule__Command__Group_4__116541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__11__Impl6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__12__Impl_in_rule__Command__Group_4__126597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_4__12__Impl6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__0__Impl_in_rule__Command__Group_5__06682 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__1_in_rule__Command__Group_5__06685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_5_0_in_rule__Command__Group_5__0__Impl6712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__1__Impl_in_rule__Command__Group_5__16742 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__Command__Group_5__2_in_rule__Command__Group_5__16745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__1__Impl6772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__2__Impl_in_rule__Command__Group_5__26801 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__3_in_rule__Command__Group_5__26804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_5_2_in_rule__Command__Group_5__2__Impl6831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__3__Impl_in_rule__Command__Group_5__36861 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__4_in_rule__Command__Group_5__36864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__3__Impl6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__4__Impl_in_rule__Command__Group_5__46920 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__5_in_rule__Command__Group_5__46923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Command__Group_5__4__Impl6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__5__Impl_in_rule__Command__Group_5__56982 = new BitSet(new long[]{0x0000078004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__6_in_rule__Command__Group_5__56985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__5__Impl7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__6__Impl_in_rule__Command__Group_5__67041 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__7_in_rule__Command__Group_5__67044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_5_6_in_rule__Command__Group_5__6__Impl7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__7__Impl_in_rule__Command__Group_5__77101 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__8_in_rule__Command__Group_5__77104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__7__Impl7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__8__Impl_in_rule__Command__Group_5__87160 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__9_in_rule__Command__Group_5__87163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__0_in_rule__Command__Group_5__8__Impl7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__9__Impl_in_rule__Command__Group_5__97221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Command__Group_5__9__Impl7249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__0__Impl_in_rule__Command__Group_5_8__07300 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__1_in_rule__Command__Group_5_8__07303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Command__Group_5_8__0__Impl7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__1__Impl_in_rule__Command__Group_5_8__17362 = new BitSet(new long[]{0x0000078004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__2_in_rule__Command__Group_5_8__17365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5_8__1__Impl7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__2__Impl_in_rule__Command__Group_5_8__27421 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__3_in_rule__Command__Group_5_8__27424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C2Assignment_5_8_2_in_rule__Command__Group_5_8__2__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__3__Impl_in_rule__Command__Group_5_8__37481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5_8__3__Impl7508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07545 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__07548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__ExpOuAssignment_0_in_rule__And__Group__0__Impl7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__17605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl7632 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__07667 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__07670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__And__Group_1__0__Impl7697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__17726 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__17729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__And__Group_1__1__Impl7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__27788 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__And__Group_1__3_in_rule__And__Group_1__27791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__And__Group_1__2__Impl7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__3__Impl_in_rule__And__Group_1__37847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__ExpOu2Assignment_1_3_in_rule__And__Group_1__3__Impl7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07912 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__ExpNonAssignment_0_in_rule__Or__Group__0__Impl7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl7999 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08034 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Or__Group_1__0__Impl8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18093 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__18096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Or__Group_1__1__Impl8124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__28155 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__Or__Group_1__3_in_rule__Or__Group_1__28158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Or__Group_1__2__Impl8185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__3__Impl_in_rule__Or__Group_1__38214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__ExpNon2Assignment_1_3_in_rule__Or__Group_1__3__Impl8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__08279 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__Not__Group__1_in_rule__Not__Group__08282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__0_in_rule__Not__Group__0__Impl8309 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__18340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__ExpEqAssignment_1_in_rule__Not__Group__1__Impl8367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__0__Impl_in_rule__Not__Group_0__08401 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Not__Group_0__1_in_rule__Not__Group_0__08404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__NonAssignment_0_0_in_rule__Not__Group_0__0__Impl8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__1__Impl_in_rule__Not__Group_0__18461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Not__Group_0__1__Impl8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__0__Impl_in_rule__Eq__Group_0__08521 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__1_in_rule__Eq__Group_0__08524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq1Assignment_0_0_in_rule__Eq__Group_0__0__Impl8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__1__Impl_in_rule__Eq__Group_0__18581 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__2_in_rule__Eq__Group_0__18584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Eq__Group_0__1__Impl8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__2__Impl_in_rule__Eq__Group_0__28643 = new BitSet(new long[]{0x0000002000004070L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__3_in_rule__Eq__Group_0__28646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Eq__Group_0__2__Impl8674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__3__Impl_in_rule__Eq__Group_0__38705 = new BitSet(new long[]{0x0000002000004070L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__4_in_rule__Eq__Group_0__38708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Eq__Group_0__3__Impl8736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__4__Impl_in_rule__Eq__Group_0__48767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq2Assignment_0_4_in_rule__Eq__Group_0__4__Impl8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__0__Impl_in_rule__Eq__Group_1__08834 = new BitSet(new long[]{0x0000002000004030L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__1_in_rule__Eq__Group_1__08837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Eq__Group_1__0__Impl8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__1__Impl_in_rule__Eq__Group_1__18896 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__2_in_rule__Eq__Group_1__18899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExpAssignment_1_1_in_rule__Eq__Group_1__1__Impl8926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__2__Impl_in_rule__Eq__Group_1__28956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Eq__Group_1__2__Impl8984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__0__Impl_in_rule__ExprSimple__Group__09021 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__1_in_rule__ExprSimple__Group__09024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ExprSimple__Group__0__Impl9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__1__Impl_in_rule__ExprSimple__Group__19083 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__2_in_rule__ExprSimple__Group__19086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_1_in_rule__ExprSimple__Group__1__Impl9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__2__Impl_in_rule__ExprSimple__Group__29143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExprSimple__Group__2__Impl9171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__0__Impl_in_rule__ExprSimple__Group_1_0__09208 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__1_in_rule__ExprSimple__Group_1_0__09211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAssignment_1_0_0_in_rule__ExprSimple__Group_1_0__0__Impl9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__1__Impl_in_rule__ExprSimple__Group_1_0__19268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__LexprAssignment_1_0_1_in_rule__ExprSimple__Group_1_0__1__Impl9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__0__Impl_in_rule__ExprSimple__Group_1_1__09329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__1_in_rule__ExprSimple__Group_1_1__09332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAssignment_1_1_0_in_rule__ExprSimple__Group_1_1__0__Impl9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__1__Impl_in_rule__ExprSimple__Group_1_1__19389 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__2_in_rule__ExprSimple__Group_1_1__19392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__ExprSimple__Group_1_1__1__Impl9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__2__Impl_in_rule__ExprSimple__Group_1_1__29448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprAssignment_1_1_2_in_rule__ExprSimple__Group_1_1__2__Impl9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__0__Impl_in_rule__Lexpr__Group__09511 = new BitSet(new long[]{0x0000082000004030L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__1_in_rule__Lexpr__Group__09514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Lexpr__Group__0__Impl9541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__1__Impl_in_rule__Lexpr__Group__19570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__ExpAssignment_1_in_rule__Lexpr__Group__1__Impl9597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_rule__Model__ModelAssignment_09636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rule__Function__FunNameAssignment_29667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefiniton_in_rule__Function__DefAssignment_59698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Definiton__InputVarsAssignment_29729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Definiton__CommandListAssignment_59760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Definiton__OutputVarsAssignment_109791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VAssignment_09822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__V2Assignment_1_29853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VAssignment_09884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__V2Assignment_1_29915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_09946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_29977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Exprs__ExpAssignment_1_110008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Command__VarLAssignment_1_010039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Command__ExpLAssignment_1_410070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Command__NomAssignment_2_010106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_2_210145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_2_610176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Command__NomAssignment_3_010212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_3_210251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_3_610282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Command__NomAssignment_4_010318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Exp1Assignment_4_210357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Exp2Assignment_4_610388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_4_1010419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Command__NomAssignment_5_010455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_5_210494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_5_610525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C2Assignment_5_8_210556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpleAssignment_010587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Expr__ExpEtAssignment_110618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Expr__ExpTerminaleAssignment_210649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__And__ExpOuAssignment_010680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__And__ExpOu2Assignment_1_310711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rule__Or__ExpNonAssignment_010742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rule__Or__ExpNon2Assignment_1_310773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Not__NonAssignment_0_010809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEq_in_rule__Not__ExpEqAssignment_110848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq1Alternatives_0_0_0_in_rule__Eq__ExprEq1Assignment_0_010879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq2Alternatives_0_4_0_in_rule__Eq__ExprEq2Assignment_0_410912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExpAlternatives_1_1_0_in_rule__Eq__ExpAssignment_1_110945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTerm__ExprTermAlternatives_0_in_rule__ExprTerm__ExprTermAssignment10978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAlternatives_1_0_0_0_in_rule__ExprSimple__MotAssignment_1_0_011011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLexpr_in_rule__ExprSimple__LexprAssignment_1_0_111044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAlternatives_1_1_0_0_in_rule__ExprSimple__MotAssignment_1_1_011075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprAssignment_1_1_211108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Lexpr__ExpAssignment_111139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprSimpleAssignment_0_in_synpred8_InternalMyDsl1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpEtAssignment_1_in_synpred9_InternalMyDsl1264 = new BitSet(new long[]{0x0000000000000002L});

}