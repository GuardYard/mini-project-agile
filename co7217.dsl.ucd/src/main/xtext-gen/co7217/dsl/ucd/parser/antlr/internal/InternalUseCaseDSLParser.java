package co7217.dsl.ucd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co7217.dsl.ucd.services.UseCaseDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use cases:'", "'useCase'", "'('", "')'", "'actors:'", "'actor'", "'extends'", "'=>'", "','"
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

        public InternalUseCaseDSLParser(TokenStream input, UseCaseDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Diagram";
       	}

       	@Override
       	protected UseCaseDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDiagram"
    // InternalUseCaseDSL.g:64:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalUseCaseDSL.g:64:48: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalUseCaseDSL.g:65:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalUseCaseDSL.g:71:1: ruleDiagram returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDSL.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalUseCaseDSL.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalUseCaseDSL.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDSL.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalUseCaseDSL.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalUseCaseDSL.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getDiagramAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"co7217.dsl.ucd.UseCaseDSL.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalUseCaseDSL.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalUseCaseDSL.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalUseCaseDSL.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalUseCaseDSL.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_UseCases_0= ruleUseCases | this_Actors_1= ruleActors ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_UseCases_0 = null;

        EObject this_Actors_1 = null;



        	enterRule();

        try {
            // InternalUseCaseDSL.g:113:2: ( (this_UseCases_0= ruleUseCases | this_Actors_1= ruleActors ) )
            // InternalUseCaseDSL.g:114:2: (this_UseCases_0= ruleUseCases | this_Actors_1= ruleActors )
            {
            // InternalUseCaseDSL.g:114:2: (this_UseCases_0= ruleUseCases | this_Actors_1= ruleActors )
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
                    // InternalUseCaseDSL.g:115:3: this_UseCases_0= ruleUseCases
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getUseCasesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UseCases_0=ruleUseCases();

                    state._fsp--;


                    			current = this_UseCases_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUseCaseDSL.g:124:3: this_Actors_1= ruleActors
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getActorsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actors_1=ruleActors();

                    state._fsp--;


                    			current = this_Actors_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleUseCases"
    // InternalUseCaseDSL.g:136:1: entryRuleUseCases returns [EObject current=null] : iv_ruleUseCases= ruleUseCases EOF ;
    public final EObject entryRuleUseCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCases = null;


        try {
            // InternalUseCaseDSL.g:136:49: (iv_ruleUseCases= ruleUseCases EOF )
            // InternalUseCaseDSL.g:137:2: iv_ruleUseCases= ruleUseCases EOF
            {
             newCompositeNode(grammarAccess.getUseCasesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCases=ruleUseCases();

            state._fsp--;

             current =iv_ruleUseCases; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUseCases"


    // $ANTLR start "ruleUseCases"
    // InternalUseCaseDSL.g:143:1: ruleUseCases returns [EObject current=null] : (otherlv_0= 'use cases:' ( (lv_useCase_1_0= ruleUsecase ) )* ) ;
    public final EObject ruleUseCases() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_useCase_1_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDSL.g:149:2: ( (otherlv_0= 'use cases:' ( (lv_useCase_1_0= ruleUsecase ) )* ) )
            // InternalUseCaseDSL.g:150:2: (otherlv_0= 'use cases:' ( (lv_useCase_1_0= ruleUsecase ) )* )
            {
            // InternalUseCaseDSL.g:150:2: (otherlv_0= 'use cases:' ( (lv_useCase_1_0= ruleUsecase ) )* )
            // InternalUseCaseDSL.g:151:3: otherlv_0= 'use cases:' ( (lv_useCase_1_0= ruleUsecase ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCasesAccess().getUseCasesKeyword_0());
            		
            // InternalUseCaseDSL.g:155:3: ( (lv_useCase_1_0= ruleUsecase ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDSL.g:156:4: (lv_useCase_1_0= ruleUsecase )
            	    {
            	    // InternalUseCaseDSL.g:156:4: (lv_useCase_1_0= ruleUsecase )
            	    // InternalUseCaseDSL.g:157:5: lv_useCase_1_0= ruleUsecase
            	    {

            	    					newCompositeNode(grammarAccess.getUseCasesAccess().getUseCaseUsecaseParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_useCase_1_0=ruleUsecase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCasesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"useCase",
            	    						lv_useCase_1_0,
            	    						"co7217.dsl.ucd.UseCaseDSL.Usecase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "ruleUseCases"


    // $ANTLR start "entryRuleUsecase"
    // InternalUseCaseDSL.g:178:1: entryRuleUsecase returns [EObject current=null] : iv_ruleUsecase= ruleUsecase EOF ;
    public final EObject entryRuleUsecase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsecase = null;


        try {
            // InternalUseCaseDSL.g:178:48: (iv_ruleUsecase= ruleUsecase EOF )
            // InternalUseCaseDSL.g:179:2: iv_ruleUsecase= ruleUsecase EOF
            {
             newCompositeNode(grammarAccess.getUsecaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsecase=ruleUsecase();

            state._fsp--;

             current =iv_ruleUsecase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUsecase"


    // $ANTLR start "ruleUsecase"
    // InternalUseCaseDSL.g:185:1: ruleUsecase returns [EObject current=null] : (otherlv_0= 'useCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_instructions_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleUsecase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_instructions_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUseCaseDSL.g:191:2: ( (otherlv_0= 'useCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_instructions_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalUseCaseDSL.g:192:2: (otherlv_0= 'useCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_instructions_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalUseCaseDSL.g:192:2: (otherlv_0= 'useCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_instructions_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalUseCaseDSL.g:193:3: otherlv_0= 'useCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_instructions_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUsecaseAccess().getUseCaseKeyword_0());
            		
            // InternalUseCaseDSL.g:197:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCaseDSL.g:198:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCaseDSL.g:198:4: (lv_name_1_0= RULE_ID )
            // InternalUseCaseDSL.g:199:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUsecaseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsecaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getUsecaseAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCaseDSL.g:219:3: ( (lv_instructions_3_0= RULE_STRING ) )
            // InternalUseCaseDSL.g:220:4: (lv_instructions_3_0= RULE_STRING )
            {
            // InternalUseCaseDSL.g:220:4: (lv_instructions_3_0= RULE_STRING )
            // InternalUseCaseDSL.g:221:5: lv_instructions_3_0= RULE_STRING
            {
            lv_instructions_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_instructions_3_0, grammarAccess.getUsecaseAccess().getInstructionsSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsecaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"instructions",
            						lv_instructions_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUsecaseAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleUsecase"


    // $ANTLR start "entryRuleActors"
    // InternalUseCaseDSL.g:245:1: entryRuleActors returns [EObject current=null] : iv_ruleActors= ruleActors EOF ;
    public final EObject entryRuleActors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActors = null;


        try {
            // InternalUseCaseDSL.g:245:47: (iv_ruleActors= ruleActors EOF )
            // InternalUseCaseDSL.g:246:2: iv_ruleActors= ruleActors EOF
            {
             newCompositeNode(grammarAccess.getActorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActors=ruleActors();

            state._fsp--;

             current =iv_ruleActors; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActors"


    // $ANTLR start "ruleActors"
    // InternalUseCaseDSL.g:252:1: ruleActors returns [EObject current=null] : (otherlv_0= 'actors:' ( (lv_actor_1_0= ruleActor ) )* ) ;
    public final EObject ruleActors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_actor_1_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDSL.g:258:2: ( (otherlv_0= 'actors:' ( (lv_actor_1_0= ruleActor ) )* ) )
            // InternalUseCaseDSL.g:259:2: (otherlv_0= 'actors:' ( (lv_actor_1_0= ruleActor ) )* )
            {
            // InternalUseCaseDSL.g:259:2: (otherlv_0= 'actors:' ( (lv_actor_1_0= ruleActor ) )* )
            // InternalUseCaseDSL.g:260:3: otherlv_0= 'actors:' ( (lv_actor_1_0= ruleActor ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getActorsAccess().getActorsKeyword_0());
            		
            // InternalUseCaseDSL.g:264:3: ( (lv_actor_1_0= ruleActor ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCaseDSL.g:265:4: (lv_actor_1_0= ruleActor )
            	    {
            	    // InternalUseCaseDSL.g:265:4: (lv_actor_1_0= ruleActor )
            	    // InternalUseCaseDSL.g:266:5: lv_actor_1_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getActorsAccess().getActorActorParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_actor_1_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actor",
            	    						lv_actor_1_0,
            	    						"co7217.dsl.ucd.UseCaseDSL.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
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
    // $ANTLR end "ruleActors"


    // $ANTLR start "entryRuleActor"
    // InternalUseCaseDSL.g:287:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalUseCaseDSL.g:287:46: (iv_ruleActor= ruleActor EOF )
            // InternalUseCaseDSL.g:288:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalUseCaseDSL.g:294:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalUseCaseDSL.g:300:2: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) )
            // InternalUseCaseDSL.g:301:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            {
            // InternalUseCaseDSL.g:301:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            // InternalUseCaseDSL.g:302:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
            		
            // InternalUseCaseDSL.g:306:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCaseDSL.g:307:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCaseDSL.g:307:4: (lv_name_1_0= RULE_ID )
            // InternalUseCaseDSL.g:308:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUseCaseDSL.g:324:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCaseDSL.g:325:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getActorAccess().getExtendsKeyword_2_0());
                    			
                    // InternalUseCaseDSL.g:329:4: ( (otherlv_3= RULE_ID ) )
                    // InternalUseCaseDSL.g:330:5: (otherlv_3= RULE_ID )
                    {
                    // InternalUseCaseDSL.g:330:5: (otherlv_3= RULE_ID )
                    // InternalUseCaseDSL.g:331:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getActorAccess().getTypeActorCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getActorAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalUseCaseDSL.g:347:3: ( (otherlv_5= RULE_ID ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUseCaseDSL.g:348:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalUseCaseDSL.g:348:4: (otherlv_5= RULE_ID )
            	    // InternalUseCaseDSL.g:349:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getActorRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_5, grammarAccess.getActorAccess().getUsecaseUsecaseCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalUseCaseDSL.g:360:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUseCaseDSL.g:361:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getActorAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalUseCaseDSL.g:365:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalUseCaseDSL.g:366:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalUseCaseDSL.g:366:5: (otherlv_7= RULE_ID )
            	    // InternalUseCaseDSL.g:367:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActorRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    						newLeafNode(otherlv_7, grammarAccess.getActorAccess().getUsecaseUsecaseCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
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
    // $ANTLR end "ruleActor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});

}