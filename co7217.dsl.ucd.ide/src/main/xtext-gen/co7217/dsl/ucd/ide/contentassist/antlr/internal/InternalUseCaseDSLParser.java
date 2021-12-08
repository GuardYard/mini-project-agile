package co7217.dsl.ucd.ide.contentassist.antlr.internal;

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
import co7217.dsl.ucd.services.UseCaseDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use cases:'", "'useCase'", "'('", "')'", "'actors:'", "'actor'", "'=>'", "'extends'", "','"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalUseCaseDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUseCaseDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUseCaseDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUseCaseDSL.g"; }


    	private UseCaseDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(UseCaseDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDiagram"
    // InternalUseCaseDSL.g:53:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // InternalUseCaseDSL.g:54:1: ( ruleDiagram EOF )
            // InternalUseCaseDSL.g:55:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalUseCaseDSL.g:62:1: ruleDiagram : ( ( rule__Diagram__ElementsAssignment )* ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:66:2: ( ( ( rule__Diagram__ElementsAssignment )* ) )
            // InternalUseCaseDSL.g:67:2: ( ( rule__Diagram__ElementsAssignment )* )
            {
            // InternalUseCaseDSL.g:67:2: ( ( rule__Diagram__ElementsAssignment )* )
            // InternalUseCaseDSL.g:68:3: ( rule__Diagram__ElementsAssignment )*
            {
             before(grammarAccess.getDiagramAccess().getElementsAssignment()); 
            // InternalUseCaseDSL.g:69:3: ( rule__Diagram__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDSL.g:69:4: rule__Diagram__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Diagram__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalUseCaseDSL.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalUseCaseDSL.g:79:1: ( ruleAbstractElement EOF )
            // InternalUseCaseDSL.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalUseCaseDSL.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalUseCaseDSL.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalUseCaseDSL.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalUseCaseDSL.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalUseCaseDSL.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalUseCaseDSL.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleUseCases"
    // InternalUseCaseDSL.g:103:1: entryRuleUseCases : ruleUseCases EOF ;
    public final void entryRuleUseCases() throws RecognitionException {
        try {
            // InternalUseCaseDSL.g:104:1: ( ruleUseCases EOF )
            // InternalUseCaseDSL.g:105:1: ruleUseCases EOF
            {
             before(grammarAccess.getUseCasesRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCases();

            state._fsp--;

             after(grammarAccess.getUseCasesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUseCases"


    // $ANTLR start "ruleUseCases"
    // InternalUseCaseDSL.g:112:1: ruleUseCases : ( ( rule__UseCases__Group__0 ) ) ;
    public final void ruleUseCases() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:116:2: ( ( ( rule__UseCases__Group__0 ) ) )
            // InternalUseCaseDSL.g:117:2: ( ( rule__UseCases__Group__0 ) )
            {
            // InternalUseCaseDSL.g:117:2: ( ( rule__UseCases__Group__0 ) )
            // InternalUseCaseDSL.g:118:3: ( rule__UseCases__Group__0 )
            {
             before(grammarAccess.getUseCasesAccess().getGroup()); 
            // InternalUseCaseDSL.g:119:3: ( rule__UseCases__Group__0 )
            // InternalUseCaseDSL.g:119:4: rule__UseCases__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseCases__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCasesAccess().getGroup()); 

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
    // $ANTLR end "ruleUseCases"


    // $ANTLR start "entryRuleUsecase"
    // InternalUseCaseDSL.g:128:1: entryRuleUsecase : ruleUsecase EOF ;
    public final void entryRuleUsecase() throws RecognitionException {
        try {
            // InternalUseCaseDSL.g:129:1: ( ruleUsecase EOF )
            // InternalUseCaseDSL.g:130:1: ruleUsecase EOF
            {
             before(grammarAccess.getUsecaseRule()); 
            pushFollow(FOLLOW_1);
            ruleUsecase();

            state._fsp--;

             after(grammarAccess.getUsecaseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUsecase"


    // $ANTLR start "ruleUsecase"
    // InternalUseCaseDSL.g:137:1: ruleUsecase : ( ( rule__Usecase__Group__0 ) ) ;
    public final void ruleUsecase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:141:2: ( ( ( rule__Usecase__Group__0 ) ) )
            // InternalUseCaseDSL.g:142:2: ( ( rule__Usecase__Group__0 ) )
            {
            // InternalUseCaseDSL.g:142:2: ( ( rule__Usecase__Group__0 ) )
            // InternalUseCaseDSL.g:143:3: ( rule__Usecase__Group__0 )
            {
             before(grammarAccess.getUsecaseAccess().getGroup()); 
            // InternalUseCaseDSL.g:144:3: ( rule__Usecase__Group__0 )
            // InternalUseCaseDSL.g:144:4: rule__Usecase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Usecase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsecaseAccess().getGroup()); 

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
    // $ANTLR end "ruleUsecase"


    // $ANTLR start "entryRuleActors"
    // InternalUseCaseDSL.g:153:1: entryRuleActors : ruleActors EOF ;
    public final void entryRuleActors() throws RecognitionException {
        try {
            // InternalUseCaseDSL.g:154:1: ( ruleActors EOF )
            // InternalUseCaseDSL.g:155:1: ruleActors EOF
            {
             before(grammarAccess.getActorsRule()); 
            pushFollow(FOLLOW_1);
            ruleActors();

            state._fsp--;

             after(grammarAccess.getActorsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActors"


    // $ANTLR start "ruleActors"
    // InternalUseCaseDSL.g:162:1: ruleActors : ( ( rule__Actors__Group__0 ) ) ;
    public final void ruleActors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:166:2: ( ( ( rule__Actors__Group__0 ) ) )
            // InternalUseCaseDSL.g:167:2: ( ( rule__Actors__Group__0 ) )
            {
            // InternalUseCaseDSL.g:167:2: ( ( rule__Actors__Group__0 ) )
            // InternalUseCaseDSL.g:168:3: ( rule__Actors__Group__0 )
            {
             before(grammarAccess.getActorsAccess().getGroup()); 
            // InternalUseCaseDSL.g:169:3: ( rule__Actors__Group__0 )
            // InternalUseCaseDSL.g:169:4: rule__Actors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorsAccess().getGroup()); 

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
    // $ANTLR end "ruleActors"


    // $ANTLR start "entryRuleActor"
    // InternalUseCaseDSL.g:178:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalUseCaseDSL.g:179:1: ( ruleActor EOF )
            // InternalUseCaseDSL.g:180:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalUseCaseDSL.g:187:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:191:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalUseCaseDSL.g:192:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalUseCaseDSL.g:192:2: ( ( rule__Actor__Group__0 ) )
            // InternalUseCaseDSL.g:193:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalUseCaseDSL.g:194:3: ( rule__Actor__Group__0 )
            // InternalUseCaseDSL.g:194:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalUseCaseDSL.g:202:1: rule__AbstractElement__Alternatives : ( ( ruleUseCases ) | ( ruleActors ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:206:1: ( ( ruleUseCases ) | ( ruleActors ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCaseDSL.g:207:2: ( ruleUseCases )
                    {
                    // InternalUseCaseDSL.g:207:2: ( ruleUseCases )
                    // InternalUseCaseDSL.g:208:3: ruleUseCases
                    {
                     before(grammarAccess.getAbstractElementAccess().getUseCasesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUseCases();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getUseCasesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDSL.g:213:2: ( ruleActors )
                    {
                    // InternalUseCaseDSL.g:213:2: ( ruleActors )
                    // InternalUseCaseDSL.g:214:3: ruleActors
                    {
                     before(grammarAccess.getAbstractElementAccess().getActorsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActors();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getActorsParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__UseCases__Group__0"
    // InternalUseCaseDSL.g:223:1: rule__UseCases__Group__0 : rule__UseCases__Group__0__Impl rule__UseCases__Group__1 ;
    public final void rule__UseCases__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:227:1: ( rule__UseCases__Group__0__Impl rule__UseCases__Group__1 )
            // InternalUseCaseDSL.g:228:2: rule__UseCases__Group__0__Impl rule__UseCases__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCases__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCases__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCases__Group__0"


    // $ANTLR start "rule__UseCases__Group__0__Impl"
    // InternalUseCaseDSL.g:235:1: rule__UseCases__Group__0__Impl : ( 'use cases:' ) ;
    public final void rule__UseCases__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:239:1: ( ( 'use cases:' ) )
            // InternalUseCaseDSL.g:240:1: ( 'use cases:' )
            {
            // InternalUseCaseDSL.g:240:1: ( 'use cases:' )
            // InternalUseCaseDSL.g:241:2: 'use cases:'
            {
             before(grammarAccess.getUseCasesAccess().getUseCasesKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUseCasesAccess().getUseCasesKeyword_0()); 

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
    // $ANTLR end "rule__UseCases__Group__0__Impl"


    // $ANTLR start "rule__UseCases__Group__1"
    // InternalUseCaseDSL.g:250:1: rule__UseCases__Group__1 : rule__UseCases__Group__1__Impl ;
    public final void rule__UseCases__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:254:1: ( rule__UseCases__Group__1__Impl )
            // InternalUseCaseDSL.g:255:2: rule__UseCases__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCases__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCases__Group__1"


    // $ANTLR start "rule__UseCases__Group__1__Impl"
    // InternalUseCaseDSL.g:261:1: rule__UseCases__Group__1__Impl : ( ( rule__UseCases__UseCaseAssignment_1 )* ) ;
    public final void rule__UseCases__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:265:1: ( ( ( rule__UseCases__UseCaseAssignment_1 )* ) )
            // InternalUseCaseDSL.g:266:1: ( ( rule__UseCases__UseCaseAssignment_1 )* )
            {
            // InternalUseCaseDSL.g:266:1: ( ( rule__UseCases__UseCaseAssignment_1 )* )
            // InternalUseCaseDSL.g:267:2: ( rule__UseCases__UseCaseAssignment_1 )*
            {
             before(grammarAccess.getUseCasesAccess().getUseCaseAssignment_1()); 
            // InternalUseCaseDSL.g:268:2: ( rule__UseCases__UseCaseAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDSL.g:268:3: rule__UseCases__UseCaseAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__UseCases__UseCaseAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getUseCasesAccess().getUseCaseAssignment_1()); 

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
    // $ANTLR end "rule__UseCases__Group__1__Impl"


    // $ANTLR start "rule__Usecase__Group__0"
    // InternalUseCaseDSL.g:277:1: rule__Usecase__Group__0 : rule__Usecase__Group__0__Impl rule__Usecase__Group__1 ;
    public final void rule__Usecase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:281:1: ( rule__Usecase__Group__0__Impl rule__Usecase__Group__1 )
            // InternalUseCaseDSL.g:282:2: rule__Usecase__Group__0__Impl rule__Usecase__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Usecase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Usecase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Usecase__Group__0"


    // $ANTLR start "rule__Usecase__Group__0__Impl"
    // InternalUseCaseDSL.g:289:1: rule__Usecase__Group__0__Impl : ( 'useCase' ) ;
    public final void rule__Usecase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:293:1: ( ( 'useCase' ) )
            // InternalUseCaseDSL.g:294:1: ( 'useCase' )
            {
            // InternalUseCaseDSL.g:294:1: ( 'useCase' )
            // InternalUseCaseDSL.g:295:2: 'useCase'
            {
             before(grammarAccess.getUsecaseAccess().getUseCaseKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUsecaseAccess().getUseCaseKeyword_0()); 

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
    // $ANTLR end "rule__Usecase__Group__0__Impl"


    // $ANTLR start "rule__Usecase__Group__1"
    // InternalUseCaseDSL.g:304:1: rule__Usecase__Group__1 : rule__Usecase__Group__1__Impl rule__Usecase__Group__2 ;
    public final void rule__Usecase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:308:1: ( rule__Usecase__Group__1__Impl rule__Usecase__Group__2 )
            // InternalUseCaseDSL.g:309:2: rule__Usecase__Group__1__Impl rule__Usecase__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Usecase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Usecase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Usecase__Group__1"


    // $ANTLR start "rule__Usecase__Group__1__Impl"
    // InternalUseCaseDSL.g:316:1: rule__Usecase__Group__1__Impl : ( ( rule__Usecase__NameAssignment_1 ) ) ;
    public final void rule__Usecase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:320:1: ( ( ( rule__Usecase__NameAssignment_1 ) ) )
            // InternalUseCaseDSL.g:321:1: ( ( rule__Usecase__NameAssignment_1 ) )
            {
            // InternalUseCaseDSL.g:321:1: ( ( rule__Usecase__NameAssignment_1 ) )
            // InternalUseCaseDSL.g:322:2: ( rule__Usecase__NameAssignment_1 )
            {
             before(grammarAccess.getUsecaseAccess().getNameAssignment_1()); 
            // InternalUseCaseDSL.g:323:2: ( rule__Usecase__NameAssignment_1 )
            // InternalUseCaseDSL.g:323:3: rule__Usecase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Usecase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsecaseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Usecase__Group__1__Impl"


    // $ANTLR start "rule__Usecase__Group__2"
    // InternalUseCaseDSL.g:331:1: rule__Usecase__Group__2 : rule__Usecase__Group__2__Impl rule__Usecase__Group__3 ;
    public final void rule__Usecase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:335:1: ( rule__Usecase__Group__2__Impl rule__Usecase__Group__3 )
            // InternalUseCaseDSL.g:336:2: rule__Usecase__Group__2__Impl rule__Usecase__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Usecase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Usecase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Usecase__Group__2"


    // $ANTLR start "rule__Usecase__Group__2__Impl"
    // InternalUseCaseDSL.g:343:1: rule__Usecase__Group__2__Impl : ( '(' ) ;
    public final void rule__Usecase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:347:1: ( ( '(' ) )
            // InternalUseCaseDSL.g:348:1: ( '(' )
            {
            // InternalUseCaseDSL.g:348:1: ( '(' )
            // InternalUseCaseDSL.g:349:2: '('
            {
             before(grammarAccess.getUsecaseAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUsecaseAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Usecase__Group__2__Impl"


    // $ANTLR start "rule__Usecase__Group__3"
    // InternalUseCaseDSL.g:358:1: rule__Usecase__Group__3 : rule__Usecase__Group__3__Impl rule__Usecase__Group__4 ;
    public final void rule__Usecase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:362:1: ( rule__Usecase__Group__3__Impl rule__Usecase__Group__4 )
            // InternalUseCaseDSL.g:363:2: rule__Usecase__Group__3__Impl rule__Usecase__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Usecase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Usecase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Usecase__Group__3"


    // $ANTLR start "rule__Usecase__Group__3__Impl"
    // InternalUseCaseDSL.g:370:1: rule__Usecase__Group__3__Impl : ( ( rule__Usecase__InstructionsAssignment_3 ) ) ;
    public final void rule__Usecase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:374:1: ( ( ( rule__Usecase__InstructionsAssignment_3 ) ) )
            // InternalUseCaseDSL.g:375:1: ( ( rule__Usecase__InstructionsAssignment_3 ) )
            {
            // InternalUseCaseDSL.g:375:1: ( ( rule__Usecase__InstructionsAssignment_3 ) )
            // InternalUseCaseDSL.g:376:2: ( rule__Usecase__InstructionsAssignment_3 )
            {
             before(grammarAccess.getUsecaseAccess().getInstructionsAssignment_3()); 
            // InternalUseCaseDSL.g:377:2: ( rule__Usecase__InstructionsAssignment_3 )
            // InternalUseCaseDSL.g:377:3: rule__Usecase__InstructionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Usecase__InstructionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUsecaseAccess().getInstructionsAssignment_3()); 

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
    // $ANTLR end "rule__Usecase__Group__3__Impl"


    // $ANTLR start "rule__Usecase__Group__4"
    // InternalUseCaseDSL.g:385:1: rule__Usecase__Group__4 : rule__Usecase__Group__4__Impl ;
    public final void rule__Usecase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:389:1: ( rule__Usecase__Group__4__Impl )
            // InternalUseCaseDSL.g:390:2: rule__Usecase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Usecase__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Usecase__Group__4"


    // $ANTLR start "rule__Usecase__Group__4__Impl"
    // InternalUseCaseDSL.g:396:1: rule__Usecase__Group__4__Impl : ( ')' ) ;
    public final void rule__Usecase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:400:1: ( ( ')' ) )
            // InternalUseCaseDSL.g:401:1: ( ')' )
            {
            // InternalUseCaseDSL.g:401:1: ( ')' )
            // InternalUseCaseDSL.g:402:2: ')'
            {
             before(grammarAccess.getUsecaseAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUsecaseAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Usecase__Group__4__Impl"


    // $ANTLR start "rule__Actors__Group__0"
    // InternalUseCaseDSL.g:412:1: rule__Actors__Group__0 : rule__Actors__Group__0__Impl rule__Actors__Group__1 ;
    public final void rule__Actors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:416:1: ( rule__Actors__Group__0__Impl rule__Actors__Group__1 )
            // InternalUseCaseDSL.g:417:2: rule__Actors__Group__0__Impl rule__Actors__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Actors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actors__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actors__Group__0"


    // $ANTLR start "rule__Actors__Group__0__Impl"
    // InternalUseCaseDSL.g:424:1: rule__Actors__Group__0__Impl : ( 'actors:' ) ;
    public final void rule__Actors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:428:1: ( ( 'actors:' ) )
            // InternalUseCaseDSL.g:429:1: ( 'actors:' )
            {
            // InternalUseCaseDSL.g:429:1: ( 'actors:' )
            // InternalUseCaseDSL.g:430:2: 'actors:'
            {
             before(grammarAccess.getActorsAccess().getActorsKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getActorsAccess().getActorsKeyword_0()); 

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
    // $ANTLR end "rule__Actors__Group__0__Impl"


    // $ANTLR start "rule__Actors__Group__1"
    // InternalUseCaseDSL.g:439:1: rule__Actors__Group__1 : rule__Actors__Group__1__Impl ;
    public final void rule__Actors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:443:1: ( rule__Actors__Group__1__Impl )
            // InternalUseCaseDSL.g:444:2: rule__Actors__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actors__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actors__Group__1"


    // $ANTLR start "rule__Actors__Group__1__Impl"
    // InternalUseCaseDSL.g:450:1: rule__Actors__Group__1__Impl : ( ( rule__Actors__ActorAssignment_1 )* ) ;
    public final void rule__Actors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:454:1: ( ( ( rule__Actors__ActorAssignment_1 )* ) )
            // InternalUseCaseDSL.g:455:1: ( ( rule__Actors__ActorAssignment_1 )* )
            {
            // InternalUseCaseDSL.g:455:1: ( ( rule__Actors__ActorAssignment_1 )* )
            // InternalUseCaseDSL.g:456:2: ( rule__Actors__ActorAssignment_1 )*
            {
             before(grammarAccess.getActorsAccess().getActorAssignment_1()); 
            // InternalUseCaseDSL.g:457:2: ( rule__Actors__ActorAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCaseDSL.g:457:3: rule__Actors__ActorAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Actors__ActorAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getActorsAccess().getActorAssignment_1()); 

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
    // $ANTLR end "rule__Actors__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalUseCaseDSL.g:466:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:470:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalUseCaseDSL.g:471:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalUseCaseDSL.g:478:1: rule__Actor__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:482:1: ( ( 'actor' ) )
            // InternalUseCaseDSL.g:483:1: ( 'actor' )
            {
            // InternalUseCaseDSL.g:483:1: ( 'actor' )
            // InternalUseCaseDSL.g:484:2: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

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
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalUseCaseDSL.g:493:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:497:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalUseCaseDSL.g:498:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalUseCaseDSL.g:505:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:509:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // InternalUseCaseDSL.g:510:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // InternalUseCaseDSL.g:510:1: ( ( rule__Actor__NameAssignment_1 ) )
            // InternalUseCaseDSL.g:511:2: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // InternalUseCaseDSL.g:512:2: ( rule__Actor__NameAssignment_1 )
            // InternalUseCaseDSL.g:512:3: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalUseCaseDSL.g:520:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:524:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalUseCaseDSL.g:525:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalUseCaseDSL.g:532:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__Group_2__0 )? ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:536:1: ( ( ( rule__Actor__Group_2__0 )? ) )
            // InternalUseCaseDSL.g:537:1: ( ( rule__Actor__Group_2__0 )? )
            {
            // InternalUseCaseDSL.g:537:1: ( ( rule__Actor__Group_2__0 )? )
            // InternalUseCaseDSL.g:538:2: ( rule__Actor__Group_2__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_2()); 
            // InternalUseCaseDSL.g:539:2: ( rule__Actor__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCaseDSL.g:539:3: rule__Actor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalUseCaseDSL.g:547:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:551:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalUseCaseDSL.g:552:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Actor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalUseCaseDSL.g:559:1: rule__Actor__Group__3__Impl : ( '=>' ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:563:1: ( ( '=>' ) )
            // InternalUseCaseDSL.g:564:1: ( '=>' )
            {
            // InternalUseCaseDSL.g:564:1: ( '=>' )
            // InternalUseCaseDSL.g:565:2: '=>'
            {
             before(grammarAccess.getActorAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getEqualsSignGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Actor__Group__4"
    // InternalUseCaseDSL.g:574:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl rule__Actor__Group__5 ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:578:1: ( rule__Actor__Group__4__Impl rule__Actor__Group__5 )
            // InternalUseCaseDSL.g:579:2: rule__Actor__Group__4__Impl rule__Actor__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Actor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4"


    // $ANTLR start "rule__Actor__Group__4__Impl"
    // InternalUseCaseDSL.g:586:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__UsecaseAssignment_4 )* ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:590:1: ( ( ( rule__Actor__UsecaseAssignment_4 )* ) )
            // InternalUseCaseDSL.g:591:1: ( ( rule__Actor__UsecaseAssignment_4 )* )
            {
            // InternalUseCaseDSL.g:591:1: ( ( rule__Actor__UsecaseAssignment_4 )* )
            // InternalUseCaseDSL.g:592:2: ( rule__Actor__UsecaseAssignment_4 )*
            {
             before(grammarAccess.getActorAccess().getUsecaseAssignment_4()); 
            // InternalUseCaseDSL.g:593:2: ( rule__Actor__UsecaseAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUseCaseDSL.g:593:3: rule__Actor__UsecaseAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Actor__UsecaseAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getUsecaseAssignment_4()); 

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
    // $ANTLR end "rule__Actor__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group__5"
    // InternalUseCaseDSL.g:601:1: rule__Actor__Group__5 : rule__Actor__Group__5__Impl ;
    public final void rule__Actor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:605:1: ( rule__Actor__Group__5__Impl )
            // InternalUseCaseDSL.g:606:2: rule__Actor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__5"


    // $ANTLR start "rule__Actor__Group__5__Impl"
    // InternalUseCaseDSL.g:612:1: rule__Actor__Group__5__Impl : ( ( rule__Actor__Group_5__0 )* ) ;
    public final void rule__Actor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:616:1: ( ( ( rule__Actor__Group_5__0 )* ) )
            // InternalUseCaseDSL.g:617:1: ( ( rule__Actor__Group_5__0 )* )
            {
            // InternalUseCaseDSL.g:617:1: ( ( rule__Actor__Group_5__0 )* )
            // InternalUseCaseDSL.g:618:2: ( rule__Actor__Group_5__0 )*
            {
             before(grammarAccess.getActorAccess().getGroup_5()); 
            // InternalUseCaseDSL.g:619:2: ( rule__Actor__Group_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUseCaseDSL.g:619:3: rule__Actor__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Actor__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Actor__Group__5__Impl"


    // $ANTLR start "rule__Actor__Group_2__0"
    // InternalUseCaseDSL.g:628:1: rule__Actor__Group_2__0 : rule__Actor__Group_2__0__Impl rule__Actor__Group_2__1 ;
    public final void rule__Actor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:632:1: ( rule__Actor__Group_2__0__Impl rule__Actor__Group_2__1 )
            // InternalUseCaseDSL.g:633:2: rule__Actor__Group_2__0__Impl rule__Actor__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Actor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2__0"


    // $ANTLR start "rule__Actor__Group_2__0__Impl"
    // InternalUseCaseDSL.g:640:1: rule__Actor__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Actor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:644:1: ( ( 'extends' ) )
            // InternalUseCaseDSL.g:645:1: ( 'extends' )
            {
            // InternalUseCaseDSL.g:645:1: ( 'extends' )
            // InternalUseCaseDSL.g:646:2: 'extends'
            {
             before(grammarAccess.getActorAccess().getExtendsKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__Actor__Group_2__0__Impl"


    // $ANTLR start "rule__Actor__Group_2__1"
    // InternalUseCaseDSL.g:655:1: rule__Actor__Group_2__1 : rule__Actor__Group_2__1__Impl ;
    public final void rule__Actor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:659:1: ( rule__Actor__Group_2__1__Impl )
            // InternalUseCaseDSL.g:660:2: rule__Actor__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_2__1"


    // $ANTLR start "rule__Actor__Group_2__1__Impl"
    // InternalUseCaseDSL.g:666:1: rule__Actor__Group_2__1__Impl : ( ( rule__Actor__TypeAssignment_2_1 ) ) ;
    public final void rule__Actor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:670:1: ( ( ( rule__Actor__TypeAssignment_2_1 ) ) )
            // InternalUseCaseDSL.g:671:1: ( ( rule__Actor__TypeAssignment_2_1 ) )
            {
            // InternalUseCaseDSL.g:671:1: ( ( rule__Actor__TypeAssignment_2_1 ) )
            // InternalUseCaseDSL.g:672:2: ( rule__Actor__TypeAssignment_2_1 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_2_1()); 
            // InternalUseCaseDSL.g:673:2: ( rule__Actor__TypeAssignment_2_1 )
            // InternalUseCaseDSL.g:673:3: rule__Actor__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Actor__Group_2__1__Impl"


    // $ANTLR start "rule__Actor__Group_5__0"
    // InternalUseCaseDSL.g:682:1: rule__Actor__Group_5__0 : rule__Actor__Group_5__0__Impl rule__Actor__Group_5__1 ;
    public final void rule__Actor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:686:1: ( rule__Actor__Group_5__0__Impl rule__Actor__Group_5__1 )
            // InternalUseCaseDSL.g:687:2: rule__Actor__Group_5__0__Impl rule__Actor__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Actor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_5__0"


    // $ANTLR start "rule__Actor__Group_5__0__Impl"
    // InternalUseCaseDSL.g:694:1: rule__Actor__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Actor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:698:1: ( ( ',' ) )
            // InternalUseCaseDSL.g:699:1: ( ',' )
            {
            // InternalUseCaseDSL.g:699:1: ( ',' )
            // InternalUseCaseDSL.g:700:2: ','
            {
             before(grammarAccess.getActorAccess().getCommaKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Actor__Group_5__0__Impl"


    // $ANTLR start "rule__Actor__Group_5__1"
    // InternalUseCaseDSL.g:709:1: rule__Actor__Group_5__1 : rule__Actor__Group_5__1__Impl ;
    public final void rule__Actor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:713:1: ( rule__Actor__Group_5__1__Impl )
            // InternalUseCaseDSL.g:714:2: rule__Actor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_5__1"


    // $ANTLR start "rule__Actor__Group_5__1__Impl"
    // InternalUseCaseDSL.g:720:1: rule__Actor__Group_5__1__Impl : ( ( rule__Actor__UsecaseAssignment_5_1 ) ) ;
    public final void rule__Actor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:724:1: ( ( ( rule__Actor__UsecaseAssignment_5_1 ) ) )
            // InternalUseCaseDSL.g:725:1: ( ( rule__Actor__UsecaseAssignment_5_1 ) )
            {
            // InternalUseCaseDSL.g:725:1: ( ( rule__Actor__UsecaseAssignment_5_1 ) )
            // InternalUseCaseDSL.g:726:2: ( rule__Actor__UsecaseAssignment_5_1 )
            {
             before(grammarAccess.getActorAccess().getUsecaseAssignment_5_1()); 
            // InternalUseCaseDSL.g:727:2: ( rule__Actor__UsecaseAssignment_5_1 )
            // InternalUseCaseDSL.g:727:3: rule__Actor__UsecaseAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__UsecaseAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getUsecaseAssignment_5_1()); 

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
    // $ANTLR end "rule__Actor__Group_5__1__Impl"


    // $ANTLR start "rule__Diagram__ElementsAssignment"
    // InternalUseCaseDSL.g:736:1: rule__Diagram__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Diagram__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:740:1: ( ( ruleAbstractElement ) )
            // InternalUseCaseDSL.g:741:2: ( ruleAbstractElement )
            {
            // InternalUseCaseDSL.g:741:2: ( ruleAbstractElement )
            // InternalUseCaseDSL.g:742:3: ruleAbstractElement
            {
             before(grammarAccess.getDiagramAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getElementsAbstractElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Diagram__ElementsAssignment"


    // $ANTLR start "rule__UseCases__UseCaseAssignment_1"
    // InternalUseCaseDSL.g:751:1: rule__UseCases__UseCaseAssignment_1 : ( ruleUsecase ) ;
    public final void rule__UseCases__UseCaseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:755:1: ( ( ruleUsecase ) )
            // InternalUseCaseDSL.g:756:2: ( ruleUsecase )
            {
            // InternalUseCaseDSL.g:756:2: ( ruleUsecase )
            // InternalUseCaseDSL.g:757:3: ruleUsecase
            {
             before(grammarAccess.getUseCasesAccess().getUseCaseUsecaseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUsecase();

            state._fsp--;

             after(grammarAccess.getUseCasesAccess().getUseCaseUsecaseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UseCases__UseCaseAssignment_1"


    // $ANTLR start "rule__Usecase__NameAssignment_1"
    // InternalUseCaseDSL.g:766:1: rule__Usecase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Usecase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:770:1: ( ( RULE_ID ) )
            // InternalUseCaseDSL.g:771:2: ( RULE_ID )
            {
            // InternalUseCaseDSL.g:771:2: ( RULE_ID )
            // InternalUseCaseDSL.g:772:3: RULE_ID
            {
             before(grammarAccess.getUsecaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUsecaseAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Usecase__NameAssignment_1"


    // $ANTLR start "rule__Usecase__InstructionsAssignment_3"
    // InternalUseCaseDSL.g:781:1: rule__Usecase__InstructionsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Usecase__InstructionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:785:1: ( ( RULE_STRING ) )
            // InternalUseCaseDSL.g:786:2: ( RULE_STRING )
            {
            // InternalUseCaseDSL.g:786:2: ( RULE_STRING )
            // InternalUseCaseDSL.g:787:3: RULE_STRING
            {
             before(grammarAccess.getUsecaseAccess().getInstructionsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUsecaseAccess().getInstructionsSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Usecase__InstructionsAssignment_3"


    // $ANTLR start "rule__Actors__ActorAssignment_1"
    // InternalUseCaseDSL.g:796:1: rule__Actors__ActorAssignment_1 : ( ruleActor ) ;
    public final void rule__Actors__ActorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:800:1: ( ( ruleActor ) )
            // InternalUseCaseDSL.g:801:2: ( ruleActor )
            {
            // InternalUseCaseDSL.g:801:2: ( ruleActor )
            // InternalUseCaseDSL.g:802:3: ruleActor
            {
             before(grammarAccess.getActorsAccess().getActorActorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorsAccess().getActorActorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Actors__ActorAssignment_1"


    // $ANTLR start "rule__Actor__NameAssignment_1"
    // InternalUseCaseDSL.g:811:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:815:1: ( ( RULE_ID ) )
            // InternalUseCaseDSL.g:816:2: ( RULE_ID )
            {
            // InternalUseCaseDSL.g:816:2: ( RULE_ID )
            // InternalUseCaseDSL.g:817:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Actor__NameAssignment_1"


    // $ANTLR start "rule__Actor__TypeAssignment_2_1"
    // InternalUseCaseDSL.g:826:1: rule__Actor__TypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:830:1: ( ( ( RULE_ID ) ) )
            // InternalUseCaseDSL.g:831:2: ( ( RULE_ID ) )
            {
            // InternalUseCaseDSL.g:831:2: ( ( RULE_ID ) )
            // InternalUseCaseDSL.g:832:3: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getTypeActorCrossReference_2_1_0()); 
            // InternalUseCaseDSL.g:833:3: ( RULE_ID )
            // InternalUseCaseDSL.g:834:4: RULE_ID
            {
             before(grammarAccess.getActorAccess().getTypeActorIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getTypeActorIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getTypeActorCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Actor__TypeAssignment_2_1"


    // $ANTLR start "rule__Actor__UsecaseAssignment_4"
    // InternalUseCaseDSL.g:845:1: rule__Actor__UsecaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__UsecaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:849:1: ( ( ( RULE_ID ) ) )
            // InternalUseCaseDSL.g:850:2: ( ( RULE_ID ) )
            {
            // InternalUseCaseDSL.g:850:2: ( ( RULE_ID ) )
            // InternalUseCaseDSL.g:851:3: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getUsecaseUsecaseCrossReference_4_0()); 
            // InternalUseCaseDSL.g:852:3: ( RULE_ID )
            // InternalUseCaseDSL.g:853:4: RULE_ID
            {
             before(grammarAccess.getActorAccess().getUsecaseUsecaseIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getUsecaseUsecaseIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getActorAccess().getUsecaseUsecaseCrossReference_4_0()); 

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
    // $ANTLR end "rule__Actor__UsecaseAssignment_4"


    // $ANTLR start "rule__Actor__UsecaseAssignment_5_1"
    // InternalUseCaseDSL.g:864:1: rule__Actor__UsecaseAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__UsecaseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDSL.g:868:1: ( ( ( RULE_ID ) ) )
            // InternalUseCaseDSL.g:869:2: ( ( RULE_ID ) )
            {
            // InternalUseCaseDSL.g:869:2: ( ( RULE_ID ) )
            // InternalUseCaseDSL.g:870:3: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getUsecaseUsecaseCrossReference_5_1_0()); 
            // InternalUseCaseDSL.g:871:3: ( RULE_ID )
            // InternalUseCaseDSL.g:872:4: RULE_ID
            {
             before(grammarAccess.getActorAccess().getUsecaseUsecaseIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getUsecaseUsecaseIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getUsecaseUsecaseCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Actor__UsecaseAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});

}