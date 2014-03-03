package at.bestsolution.persistence.emap.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.persistence.emap.services.EMapGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEMapParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bundle'", "'{'", "','", "'}'", "'databases'", "'import'", "'package'", "';'", "'abstract'", "'entity'", "'extends'", "'derived'", "'attributes'", "'queries'", "'as'", "'descriminatedby'", "'primarykey'", "'=>'", "'generatedby'", "'resolve'", "'('", "')'", "'on'", "'autokey'", "'query'", "'seqnext'", "'default'", "'FROM'", "'WHERE'", "'GROUP BY'", "'ORDER BY'", "'map'", "'etype'", "'#'", "'.'", "'*'", "'list'", "'single'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalEMapParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEMapParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEMapParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g"; }



     	private EMapGrammarAccess grammarAccess;
     	
        public InternalEMapParser(TokenStream input, EMapGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "EMapping";	
       	}
       	
       	@Override
       	protected EMapGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEMapping"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:68:1: entryRuleEMapping returns [EObject current=null] : iv_ruleEMapping= ruleEMapping EOF ;
    public final EObject entryRuleEMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMapping = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:69:2: (iv_ruleEMapping= ruleEMapping EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:70:2: iv_ruleEMapping= ruleEMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEMapping_in_entryRuleEMapping75);
            iv_ruleEMapping=ruleEMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMapping85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEMapping"


    // $ANTLR start "ruleEMapping"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:77:1: ruleEMapping returns [EObject current=null] : ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) ) ) ;
    public final EObject ruleEMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_root_0_1 = null;

        EObject lv_root_0_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:80:28: ( ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:81:1: ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:81:1: ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:82:1: ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:82:1: ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:83:1: (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:83:1: (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11||LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:84:3: lv_root_0_1= ruleEMappingBundle
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAccess().getRootEMappingBundleParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEMappingBundle_in_ruleEMapping132);
                    lv_root_0_1=ruleEMappingBundle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"root",
                              		lv_root_0_1, 
                              		"EMappingBundle");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:99:8: lv_root_0_2= ruleEMappingEntityDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAccess().getRootEMappingEntityDefParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEMappingEntityDef_in_ruleEMapping151);
                    lv_root_0_2=ruleEMappingEntityDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"root",
                              		lv_root_0_2, 
                              		"EMappingEntityDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEMapping"


    // $ANTLR start "entryRuleEMappingBundle"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:125:1: entryRuleEMappingBundle returns [EObject current=null] : iv_ruleEMappingBundle= ruleEMappingBundle EOF ;
    public final EObject entryRuleEMappingBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingBundle = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:126:2: (iv_ruleEMappingBundle= ruleEMappingBundle EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:127:2: iv_ruleEMappingBundle= ruleEMappingBundle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingBundleRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingBundle_in_entryRuleEMappingBundle189);
            iv_ruleEMappingBundle=ruleEMappingBundle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingBundle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingBundle199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEMappingBundle"


    // $ANTLR start "ruleEMappingBundle"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:134:1: ruleEMappingBundle returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' (otherlv_8= 'databases' ( (lv_databases_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_databases_11_0= RULE_STRING ) ) )* )? ) ;
    public final EObject ruleEMappingBundle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_databases_9_0=null;
        Token otherlv_10=null;
        Token lv_databases_11_0=null;
        EObject lv_imports_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:137:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' (otherlv_8= 'databases' ( (lv_databases_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_databases_11_0= RULE_STRING ) ) )* )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:138:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' (otherlv_8= 'databases' ( (lv_databases_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_databases_11_0= RULE_STRING ) ) )* )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:138:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' (otherlv_8= 'databases' ( (lv_databases_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_databases_11_0= RULE_STRING ) ) )* )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:138:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' (otherlv_8= 'databases' ( (lv_databases_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_databases_11_0= RULE_STRING ) ) )* )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:138:2: ( (lv_imports_0_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:139:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:139:1: (lv_imports_0_0= ruleImport )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:140:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleEMappingBundle245);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleEMappingBundle258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEMappingBundleAccess().getBundleKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:160:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:161:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:161:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:162:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingBundle275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEMappingBundleAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEMappingBundleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleEMappingBundle292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:182:1: ( (otherlv_4= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:183:1: (otherlv_4= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:183:1: (otherlv_4= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:184:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEMappingBundleRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingBundle312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_4_0()); 
              	
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:195:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:195:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEMappingBundle325); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getEMappingBundleAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:199:1: ( (otherlv_6= RULE_ID ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:200:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:200:1: (otherlv_6= RULE_ID )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:201:3: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEMappingBundleRule());
            	      	        }
            	              
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingBundle345); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_6, grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_5_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleEMappingBundle359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_6());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:216:1: (otherlv_8= 'databases' ( (lv_databases_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_databases_11_0= RULE_STRING ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:216:3: otherlv_8= 'databases' ( (lv_databases_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_databases_11_0= RULE_STRING ) ) )*
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEMappingBundle372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingBundleAccess().getDatabasesKeyword_7_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:220:1: ( (lv_databases_9_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:221:1: (lv_databases_9_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:221:1: (lv_databases_9_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:222:3: lv_databases_9_0= RULE_STRING
                    {
                    lv_databases_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEMappingBundle389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_databases_9_0, grammarAccess.getEMappingBundleAccess().getDatabasesSTRINGTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingBundleRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"databases",
                              		lv_databases_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:238:2: (otherlv_10= ',' ( (lv_databases_11_0= RULE_STRING ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:238:4: otherlv_10= ',' ( (lv_databases_11_0= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleEMappingBundle407); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getEMappingBundleAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:242:1: ( (lv_databases_11_0= RULE_STRING ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:243:1: (lv_databases_11_0= RULE_STRING )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:243:1: (lv_databases_11_0= RULE_STRING )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:244:3: lv_databases_11_0= RULE_STRING
                    	    {
                    	    lv_databases_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEMappingBundle424); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_databases_11_0, grammarAccess.getEMappingBundleAccess().getDatabasesSTRINGTerminalRuleCall_7_2_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEMappingBundleRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"databases",
                    	              		lv_databases_11_0, 
                    	              		"STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEMappingBundle"


    // $ANTLR start "entryRuleEMappingEntityDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:268:1: entryRuleEMappingEntityDef returns [EObject current=null] : iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF ;
    public final EObject entryRuleEMappingEntityDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingEntityDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:269:2: (iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:270:2: iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingEntityDefRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntityDef_in_entryRuleEMappingEntityDef469);
            iv_ruleEMappingEntityDef=ruleEMappingEntityDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingEntityDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingEntityDef479); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEMappingEntityDef"


    // $ANTLR start "ruleEMappingEntityDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:277:1: ruleEMappingEntityDef returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) ) ;
    public final EObject ruleEMappingEntityDef() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_entity_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:280:28: ( ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:281:1: ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:281:1: ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:281:2: ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:281:2: ( (lv_package_0_0= rulePackageDeclaration ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:282:1: (lv_package_0_0= rulePackageDeclaration )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:282:1: (lv_package_0_0= rulePackageDeclaration )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:283:3: lv_package_0_0= rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_ruleEMappingEntityDef525);
            lv_package_0_0=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEMappingEntityDefRule());
              	        }
                     		set(
                     			current, 
                     			"package",
                      		lv_package_0_0, 
                      		"PackageDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:299:2: ( (lv_imports_1_0= ruleImport ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:300:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:300:1: (lv_imports_1_0= ruleImport )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:301:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleEMappingEntityDef546);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEMappingEntityDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:317:3: ( (lv_entity_2_0= ruleEMappingEntity ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:318:1: (lv_entity_2_0= ruleEMappingEntity )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:318:1: (lv_entity_2_0= ruleEMappingEntity )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:319:3: lv_entity_2_0= ruleEMappingEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getEntityEMappingEntityParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_ruleEMappingEntityDef568);
            lv_entity_2_0=ruleEMappingEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEMappingEntityDefRule());
              	        }
                     		set(
                     			current, 
                     			"entity",
                      		lv_entity_2_0, 
                      		"EMappingEntity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEMappingEntityDef"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:343:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:344:2: (iv_ruleImport= ruleImport EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:345:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport604);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport614); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:352:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:355:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:356:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:356:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:356:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:360:1: ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:361:1: ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:361:1: ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:362:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:362:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:363:3: lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport674);
                    lv_importedNamespace_1_1=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_1_1, 
                              		"QualifiedNameWithWildcard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:378:8: lv_importedNamespace_1_2= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport693);
                    lv_importedNamespace_1_2=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_1_2, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:404:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:405:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:406:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration732);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration742); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:413:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:416:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:417:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:417:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:417:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePackageDeclaration779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:421:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:422:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:422:1: (lv_name_1_0= ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:423:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration800);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulePackageDeclaration812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleEMappingEntity"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:451:1: entryRuleEMappingEntity returns [EObject current=null] : iv_ruleEMappingEntity= ruleEMappingEntity EOF ;
    public final EObject entryRuleEMappingEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingEntity = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:452:2: (iv_ruleEMappingEntity= ruleEMappingEntity EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:453:2: iv_ruleEMappingEntity= ruleEMappingEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_entryRuleEMappingEntity848);
            iv_ruleEMappingEntity=ruleEMappingEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingEntity858); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEMappingEntity"


    // $ANTLR start "ruleEMappingEntity"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:460:1: ruleEMappingEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )? otherlv_19= '}' (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )? (otherlv_22= 'descriminatedby' ( (lv_descriminationColumn_23_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEMappingEntity() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_extensionType_3_1=null;
        Token lv_extensionType_3_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_tableName_21_0=null;
        Token otherlv_22=null;
        Token lv_descriminationColumn_23_0=null;
        EObject lv_etype_6_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_namedQueries_15_0 = null;

        EObject lv_namedQueries_17_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:463:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )? otherlv_19= '}' (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )? (otherlv_22= 'descriminatedby' ( (lv_descriminationColumn_23_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:464:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )? otherlv_19= '}' (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )? (otherlv_22= 'descriminatedby' ( (lv_descriminationColumn_23_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:464:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )? otherlv_19= '}' (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )? (otherlv_22= 'descriminatedby' ( (lv_descriminationColumn_23_0= RULE_ID ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:464:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )? otherlv_19= '}' (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )? (otherlv_22= 'descriminatedby' ( (lv_descriminationColumn_23_0= RULE_ID ) ) )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:464:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:465:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:465:1: (lv_abstract_0_0= 'abstract' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:466:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,19,FOLLOW_19_in_ruleEMappingEntity901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_0_0, grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                      	        }
                             		setWithLastConsumed(current, "abstract", true, "abstract");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleEMappingEntity927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEMappingEntityAccess().getEntityKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:483:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:484:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:484:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:485:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEMappingEntityAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEMappingEntityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:501:2: ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=21 && LA10_0<=22)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:501:3: ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:501:3: ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:502:1: ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:502:1: ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:503:1: (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:503:1: (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==22) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:504:3: lv_extensionType_3_1= 'extends'
                            {
                            lv_extensionType_3_1=(Token)match(input,21,FOLLOW_21_in_ruleEMappingEntity970); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extensionType_3_1, grammarAccess.getEMappingEntityAccess().getExtensionTypeExtendsKeyword_3_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                              	        }
                                     		setWithLastConsumed(current, "extensionType", lv_extensionType_3_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:516:8: lv_extensionType_3_2= 'derived'
                            {
                            lv_extensionType_3_2=(Token)match(input,22,FOLLOW_22_in_ruleEMappingEntity999); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extensionType_3_2, grammarAccess.getEMappingEntityAccess().getExtensionTypeDerivedKeyword_3_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                              	        }
                                     		setWithLastConsumed(current, "extensionType", lv_extensionType_3_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:531:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:532:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:532:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:533:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingEntity1038);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleEMappingEntity1052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:550:1: ( (lv_etype_6_0= ruleEType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:551:1: (lv_etype_6_0= ruleEType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:551:1: (lv_etype_6_0= ruleEType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:552:3: lv_etype_6_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getEtypeETypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEType_in_ruleEMappingEntity1073);
            lv_etype_6_0=ruleEType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEMappingEntityRule());
              	        }
                     		set(
                     			current, 
                     			"etype",
                      		lv_etype_6_0, 
                      		"EType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:568:2: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:568:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleEMappingEntity1086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleEMappingEntity1098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_6_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:576:1: ( (lv_attributes_9_0= ruleEAttribute ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:577:1: (lv_attributes_9_0= ruleEAttribute )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:577:1: (lv_attributes_9_0= ruleEAttribute )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:578:3: lv_attributes_9_0= ruleEAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEAttribute_in_ruleEMappingEntity1119);
                    lv_attributes_9_0=ruleEAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEMappingEntityRule());
                      	        }
                             		add(
                             			current, 
                             			"attributes",
                              		lv_attributes_9_0, 
                              		"EAttribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:594:2: (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==13) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:594:4: otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleEMappingEntity1132); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getEMappingEntityAccess().getCommaKeyword_6_3_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:598:1: ( (lv_attributes_11_0= ruleEAttribute ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:599:1: (lv_attributes_11_0= ruleEAttribute )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:599:1: (lv_attributes_11_0= ruleEAttribute )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:600:3: lv_attributes_11_0= ruleEAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEAttribute_in_ruleEMappingEntity1153);
                    	    lv_attributes_11_0=ruleEAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEMappingEntityRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_11_0, 
                    	              		"EAttribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleEMappingEntity1167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:620:3: (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:620:5: otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleEMappingEntity1182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEMappingEntityAccess().getQueriesKeyword_7_0());
                          
                    }
                    otherlv_14=(Token)match(input,12,FOLLOW_12_in_ruleEMappingEntity1194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:628:1: ( (lv_namedQueries_15_0= ruleENamedQuery ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:629:1: (lv_namedQueries_15_0= ruleENamedQuery )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:629:1: (lv_namedQueries_15_0= ruleENamedQuery )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:630:3: lv_namedQueries_15_0= ruleENamedQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleENamedQuery_in_ruleEMappingEntity1215);
                    lv_namedQueries_15_0=ruleENamedQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEMappingEntityRule());
                      	        }
                             		add(
                             			current, 
                             			"namedQueries",
                              		lv_namedQueries_15_0, 
                              		"ENamedQuery");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:646:2: (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:646:4: otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) )
                    	    {
                    	    otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleEMappingEntity1228); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_16, grammarAccess.getEMappingEntityAccess().getCommaKeyword_7_3_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:650:1: ( (lv_namedQueries_17_0= ruleENamedQuery ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:651:1: (lv_namedQueries_17_0= ruleENamedQuery )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:651:1: (lv_namedQueries_17_0= ruleENamedQuery )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:652:3: lv_namedQueries_17_0= ruleENamedQuery
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleENamedQuery_in_ruleEMappingEntity1249);
                    	    lv_namedQueries_17_0=ruleENamedQuery();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEMappingEntityRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"namedQueries",
                    	              		lv_namedQueries_17_0, 
                    	              		"ENamedQuery");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,14,FOLLOW_14_in_ruleEMappingEntity1263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            otherlv_19=(Token)match(input,14,FOLLOW_14_in_ruleEMappingEntity1277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_19, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_8());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:676:1: (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:676:3: otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) )
                    {
                    otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleEMappingEntity1290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getEMappingEntityAccess().getAsKeyword_9_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:680:1: ( (lv_tableName_21_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:681:1: (lv_tableName_21_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:681:1: (lv_tableName_21_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:682:3: lv_tableName_21_0= RULE_ID
                    {
                    lv_tableName_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity1307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_tableName_21_0, grammarAccess.getEMappingEntityAccess().getTableNameIDTerminalRuleCall_9_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"tableName",
                              		lv_tableName_21_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:698:4: (otherlv_22= 'descriminatedby' ( (lv_descriminationColumn_23_0= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:698:6: otherlv_22= 'descriminatedby' ( (lv_descriminationColumn_23_0= RULE_ID ) )
                    {
                    otherlv_22=(Token)match(input,26,FOLLOW_26_in_ruleEMappingEntity1327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getEMappingEntityAccess().getDescriminatedbyKeyword_10_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:702:1: ( (lv_descriminationColumn_23_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:703:1: (lv_descriminationColumn_23_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:703:1: (lv_descriminationColumn_23_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:704:3: lv_descriminationColumn_23_0= RULE_ID
                    {
                    lv_descriminationColumn_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity1344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_descriminationColumn_23_0, grammarAccess.getEMappingEntityAccess().getDescriminationColumnIDTerminalRuleCall_10_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"descriminationColumn",
                              		lv_descriminationColumn_23_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEMappingEntity"


    // $ANTLR start "entryRuleEAttribute"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:728:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:729:2: (iv_ruleEAttribute= ruleEAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:730:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_entryRuleEAttribute1387);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttribute1397); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEAttribute"


    // $ANTLR start "ruleEAttribute"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:737:1: ruleEAttribute returns [EObject current=null] : ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=>' ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ( ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) ) )? ) ) ) ;
    public final EObject ruleEAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_pk_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_columnName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_resolved_10_0=null;
        Token otherlv_12=null;
        Token lv_parameters_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_relationTable_17_0=null;
        EObject lv_valueGenerators_6_0 = null;

        EObject lv_valueGenerators_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:740:28: ( ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=>' ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ( ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) ) )? ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:741:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=>' ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ( ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) ) )? ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:741:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=>' ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ( ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) ) )? ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:741:2: ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=>' ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ( ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) ) )? ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:741:2: ( (lv_pk_0_0= 'primarykey' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:742:1: (lv_pk_0_0= 'primarykey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:742:1: (lv_pk_0_0= 'primarykey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:743:3: lv_pk_0_0= 'primarykey'
                    {
                    lv_pk_0_0=(Token)match(input,27,FOLLOW_27_in_ruleEAttribute1440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_pk_0_0, grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "pk", true, "primarykey");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:756:3: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:757:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:757:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:758:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute1471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEAttribute1488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:778:1: ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ( ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) ) )? ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==30) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:778:2: ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:778:2: ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:778:3: ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:778:3: ( (lv_columnName_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:779:1: (lv_columnName_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:779:1: (lv_columnName_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:780:3: lv_columnName_3_0= RULE_ID
                    {
                    lv_columnName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute1507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_columnName_3_0, grammarAccess.getEAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"columnName",
                              		lv_columnName_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:796:2: (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==29) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:796:4: otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}'
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleEAttribute1525); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getEAttributeAccess().getGeneratedbyKeyword_3_0_1_0());
                                  
                            }
                            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleEAttribute1537); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_3_0_1_1());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:804:1: ( (lv_valueGenerators_6_0= ruleEValueGenerator ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:805:1: (lv_valueGenerators_6_0= ruleEValueGenerator )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:805:1: (lv_valueGenerators_6_0= ruleEValueGenerator )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:806:3: lv_valueGenerators_6_0= ruleEValueGenerator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEValueGenerator_in_ruleEAttribute1558);
                            lv_valueGenerators_6_0=ruleEValueGenerator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"valueGenerators",
                                      		lv_valueGenerators_6_0, 
                                      		"EValueGenerator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:2: (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==13) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:4: otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) )
                            	    {
                            	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleEAttribute1571); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_7, grammarAccess.getEAttributeAccess().getCommaKeyword_3_0_1_3_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:826:1: ( (lv_valueGenerators_8_0= ruleEValueGenerator ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:827:1: (lv_valueGenerators_8_0= ruleEValueGenerator )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:827:1: (lv_valueGenerators_8_0= ruleEValueGenerator )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:828:3: lv_valueGenerators_8_0= ruleEValueGenerator
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEValueGenerator_in_ruleEAttribute1592);
                            	    lv_valueGenerators_8_0=ruleEValueGenerator();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"valueGenerators",
                            	              		lv_valueGenerators_8_0, 
                            	              		"EValueGenerator");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEAttribute1606); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_3_0_1_4());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:849:6: ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ( ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) ) )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:849:6: ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ( ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) ) )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:849:7: ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ( ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) ) )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:849:7: ( (lv_resolved_10_0= 'resolve' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:850:1: (lv_resolved_10_0= 'resolve' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:850:1: (lv_resolved_10_0= 'resolve' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:851:3: lv_resolved_10_0= 'resolve'
                    {
                    lv_resolved_10_0=(Token)match(input,30,FOLLOW_30_in_ruleEAttribute1634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_resolved_10_0, grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "resolved", true, "resolve");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:864:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:865:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:865:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:866:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEAttribute1670);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleEAttribute1682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:883:1: ( (lv_parameters_13_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:884:1: (lv_parameters_13_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:884:1: (lv_parameters_13_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:885:3: lv_parameters_13_0= RULE_ID
                    {
                    lv_parameters_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute1699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_parameters_13_0, grammarAccess.getEAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"parameters",
                              		lv_parameters_13_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleEAttribute1716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:905:1: ( ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:905:2: ( ( ruleQualifiedName ) ) otherlv_16= 'on' ( (lv_relationTable_17_0= RULE_ID ) )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:905:2: ( ( ruleQualifiedName ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:906:1: ( ruleQualifiedName )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:906:1: ( ruleQualifiedName )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:907:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getEAttributeRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getOppositeEAttributeCrossReference_3_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEAttribute1740);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_16=(Token)match(input,33,FOLLOW_33_in_ruleEAttribute1752); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getEAttributeAccess().getOnKeyword_3_1_5_1());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:924:1: ( (lv_relationTable_17_0= RULE_ID ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:925:1: (lv_relationTable_17_0= RULE_ID )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:925:1: (lv_relationTable_17_0= RULE_ID )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:926:3: lv_relationTable_17_0= RULE_ID
                            {
                            lv_relationTable_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute1769); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_relationTable_17_0, grammarAccess.getEAttributeAccess().getRelationTableIDTerminalRuleCall_3_1_5_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEAttributeRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"relationTable",
                                      		lv_relationTable_17_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEAttribute"


    // $ANTLR start "entryRuleEValueGenerator"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:950:1: entryRuleEValueGenerator returns [EObject current=null] : iv_ruleEValueGenerator= ruleEValueGenerator EOF ;
    public final EObject entryRuleEValueGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueGenerator = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:951:2: (iv_ruleEValueGenerator= ruleEValueGenerator EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:952:2: iv_ruleEValueGenerator= ruleEValueGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEValueGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator1814);
            iv_ruleEValueGenerator=ruleEValueGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEValueGenerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEValueGenerator1824); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEValueGenerator"


    // $ANTLR start "ruleEValueGenerator"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:959:1: ruleEValueGenerator returns [EObject current=null] : ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleEValueGenerator() throws RecognitionException {
        EObject current = null;

        Token lv_dbType_0_0=null;
        Token lv_autokey_1_0=null;
        Token otherlv_2=null;
        Token lv_query_3_0=null;
        Token otherlv_4=null;
        Token lv_sequence_5_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:962:28: ( ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:963:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:963:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:963:2: ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:963:2: ( (lv_dbType_0_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:964:1: (lv_dbType_0_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:964:1: (lv_dbType_0_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:965:3: lv_dbType_0_0= RULE_STRING
            {
            lv_dbType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator1866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_dbType_0_0, grammarAccess.getEValueGeneratorAccess().getDbTypeSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEValueGeneratorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"dbType",
                      		lv_dbType_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:981:2: ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt22=1;
                }
                break;
            case 35:
                {
                alt22=2;
                }
                break;
            case 36:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:981:3: ( (lv_autokey_1_0= 'autokey' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:981:3: ( (lv_autokey_1_0= 'autokey' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:982:1: (lv_autokey_1_0= 'autokey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:982:1: (lv_autokey_1_0= 'autokey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:983:3: lv_autokey_1_0= 'autokey'
                    {
                    lv_autokey_1_0=(Token)match(input,34,FOLLOW_34_in_ruleEValueGenerator1890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_autokey_1_0, grammarAccess.getEValueGeneratorAccess().getAutokeyAutokeyKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEValueGeneratorRule());
                      	        }
                             		setWithLastConsumed(current, "autokey", true, "autokey");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:997:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:997:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:997:8: otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleEValueGenerator1922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEValueGeneratorAccess().getQueryKeyword_1_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1001:1: ( (lv_query_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1002:1: (lv_query_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1002:1: (lv_query_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1003:3: lv_query_3_0= RULE_STRING
                    {
                    lv_query_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator1939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_query_3_0, grammarAccess.getEValueGeneratorAccess().getQuerySTRINGTerminalRuleCall_1_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEValueGeneratorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"query",
                              		lv_query_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1020:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1020:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1020:8: otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleEValueGenerator1964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEValueGeneratorAccess().getSeqnextKeyword_1_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1024:1: ( (lv_sequence_5_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1025:1: (lv_sequence_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1025:1: (lv_sequence_5_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1026:3: lv_sequence_5_0= RULE_STRING
                    {
                    lv_sequence_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator1981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sequence_5_0, grammarAccess.getEValueGeneratorAccess().getSequenceSTRINGTerminalRuleCall_1_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEValueGeneratorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sequence",
                              		lv_sequence_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEValueGenerator"


    // $ANTLR start "entryRuleENamedQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1050:1: entryRuleENamedQuery returns [EObject current=null] : iv_ruleENamedQuery= ruleENamedQuery EOF ;
    public final EObject entryRuleENamedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1051:2: (iv_ruleENamedQuery= ruleENamedQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1052:2: iv_ruleENamedQuery= ruleENamedQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery2024);
            iv_ruleENamedQuery=ruleENamedQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedQuery2034); if (state.failed) return current;

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
    // $ANTLR end "entryRuleENamedQuery"


    // $ANTLR start "ruleENamedQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1059:1: ruleENamedQuery returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleENamedQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_returnType_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_queries_8_0 = null;

        EObject lv_queries_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1062:28: ( ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1063:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1063:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1063:2: ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1063:2: ( (lv_returnType_0_0= ruleReturnType ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=47 && LA23_0<=48)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1064:1: (lv_returnType_0_0= ruleReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1064:1: (lv_returnType_0_0= ruleReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1065:3: lv_returnType_0_0= ruleReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getReturnTypeReturnTypeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnType_in_ruleENamedQuery2080);
                    lv_returnType_0_0=ruleReturnType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getENamedQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"returnType",
                              		lv_returnType_0_0, 
                              		"ReturnType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1081:3: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1082:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1082:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1083:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleENamedQuery2098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getENamedQueryAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getENamedQueryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1099:2: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1099:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleENamedQuery2116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1103:1: ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1103:2: ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1103:2: ( (lv_parameters_3_0= ruleEParameter ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1104:1: (lv_parameters_3_0= ruleEParameter )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1104:1: (lv_parameters_3_0= ruleEParameter )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1105:3: lv_parameters_3_0= ruleEParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEParameter_in_ruleENamedQuery2138);
                            lv_parameters_3_0=ruleEParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getENamedQueryRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_3_0, 
                                      		"EParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1121:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==13) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1121:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleENamedQuery2151); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getENamedQueryAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1125:1: ( (lv_parameters_5_0= ruleEParameter ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1126:1: (lv_parameters_5_0= ruleEParameter )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1126:1: (lv_parameters_5_0= ruleEParameter )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1127:3: lv_parameters_5_0= ruleEParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEParameter_in_ruleENamedQuery2172);
                            	    lv_parameters_5_0=ruleEParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getENamedQueryRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_5_0, 
                            	              		"EParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleENamedQuery2188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleENamedQuery2202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1151:1: ( (lv_queries_8_0= ruleEQuery ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1152:1: (lv_queries_8_0= ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1152:1: (lv_queries_8_0= ruleEQuery )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1153:3: lv_queries_8_0= ruleEQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEQuery_in_ruleENamedQuery2223);
            lv_queries_8_0=ruleEQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getENamedQueryRule());
              	        }
                     		add(
                     			current, 
                     			"queries",
                      		lv_queries_8_0, 
                      		"EQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1169:2: (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==13) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1169:4: otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) )
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleENamedQuery2236); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getENamedQueryAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1173:1: ( (lv_queries_10_0= ruleEQuery ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1174:1: (lv_queries_10_0= ruleEQuery )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1174:1: (lv_queries_10_0= ruleEQuery )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1175:3: lv_queries_10_0= ruleEQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQuery_in_ruleENamedQuery2257);
            	    lv_queries_10_0=ruleEQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getENamedQueryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"queries",
            	              		lv_queries_10_0, 
            	              		"EQuery");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleENamedQuery2271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getENamedQueryAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleENamedQuery"


    // $ANTLR start "entryRuleEParameter"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1203:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1204:2: (iv_ruleEParameter= ruleEParameter EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1205:2: iv_ruleEParameter= ruleEParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEParameterRule()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_entryRuleEParameter2307);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEParameter2317); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEParameter"


    // $ANTLR start "ruleEParameter"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1212:1: ruleEParameter returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1215:28: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1216:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1216:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1216:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1216:2: ( (lv_type_0_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1217:1: (lv_type_0_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1217:1: (lv_type_0_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1218:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEParameter2359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_0_0, grammarAccess.getEParameterAccess().getTypeIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1234:2: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1235:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1235:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1236:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEParameter2381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEParameter"


    // $ANTLR start "entryRuleEQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1260:1: entryRuleEQuery returns [EObject current=null] : iv_ruleEQuery= ruleEQuery EOF ;
    public final EObject entryRuleEQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1261:2: (iv_ruleEQuery= ruleEQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1262:2: iv_ruleEQuery= ruleEQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQueryRule()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_entryRuleEQuery2422);
            iv_ruleEQuery=ruleEQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQuery2432); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEQuery"


    // $ANTLR start "ruleEQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1269:1: ruleEQuery returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleEQuery() throws RecognitionException {
        EObject current = null;

        Token lv_dbType_0_1=null;
        Token lv_dbType_0_2=null;
        Token otherlv_2=null;
        Token lv_from_3_0=null;
        Token otherlv_4=null;
        Token lv_where_5_0=null;
        Token otherlv_6=null;
        Token lv_groupBy_7_0=null;
        Token otherlv_8=null;
        Token lv_orderby_9_0=null;
        Token lv_all_10_0=null;
        EObject lv_mapping_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1272:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1273:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1273:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1273:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1273:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1274:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1274:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1275:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1275:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_STRING) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1276:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,37,FOLLOW_37_in_ruleEQuery2477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_dbType_0_1, grammarAccess.getEQueryAccess().getDbTypeDefaultKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEQueryRule());
                      	        }
                             		setWithLastConsumed(current, "dbType", lv_dbType_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1288:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_dbType_0_2, grammarAccess.getEQueryAccess().getDbTypeSTRINGTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEQueryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"dbType",
                              		lv_dbType_0_2, 
                              		"STRING");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1306:2: ( (lv_mapping_1_0= ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1307:1: (lv_mapping_1_0= ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1307:1: (lv_mapping_1_0= ruleEObjectSection )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1308:3: lv_mapping_1_0= ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_ruleEQuery2534);
            lv_mapping_1_0=ruleEObjectSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEQueryRule());
              	        }
                     		set(
                     			current, 
                     			"mapping",
                      		lv_mapping_1_0, 
                      		"EObjectSection");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1324:2: ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_STRING) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1324:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1324:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1324:5: otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleEQuery2548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1328:1: ( (lv_from_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1329:1: (lv_from_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1329:1: (lv_from_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1330:3: lv_from_3_0= RULE_STRING
                    {
                    lv_from_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_from_3_0, grammarAccess.getEQueryAccess().getFromSTRINGTerminalRuleCall_2_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEQueryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"from",
                              		lv_from_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1346:2: (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==39) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1346:4: otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleEQuery2583); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1350:1: ( (lv_where_5_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1351:1: (lv_where_5_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1351:1: (lv_where_5_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1352:3: lv_where_5_0= RULE_STRING
                            {
                            lv_where_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2600); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_where_5_0, grammarAccess.getEQueryAccess().getWhereSTRINGTerminalRuleCall_2_0_2_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEQueryRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"where",
                                      		lv_where_5_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1368:4: (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==40) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1368:6: otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,40,FOLLOW_40_in_ruleEQuery2620); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1372:1: ( (lv_groupBy_7_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1373:1: (lv_groupBy_7_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1373:1: (lv_groupBy_7_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1374:3: lv_groupBy_7_0= RULE_STRING
                            {
                            lv_groupBy_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2637); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_groupBy_7_0, grammarAccess.getEQueryAccess().getGroupBySTRINGTerminalRuleCall_2_0_3_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEQueryRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"groupBy",
                                      		lv_groupBy_7_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1390:4: (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==41) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1390:6: otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleEQuery2657); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1394:1: ( (lv_orderby_9_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1395:1: (lv_orderby_9_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1395:1: (lv_orderby_9_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1396:3: lv_orderby_9_0= RULE_STRING
                            {
                            lv_orderby_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2674); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_orderby_9_0, grammarAccess.getEQueryAccess().getOrderbySTRINGTerminalRuleCall_2_0_4_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEQueryRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"orderby",
                                      		lv_orderby_9_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1413:6: ( (lv_all_10_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1413:6: ( (lv_all_10_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1414:1: (lv_all_10_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1414:1: (lv_all_10_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1415:3: lv_all_10_0= RULE_STRING
                    {
                    lv_all_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_all_10_0, grammarAccess.getEQueryAccess().getAllSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEQueryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"all",
                              		lv_all_10_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEQuery"


    // $ANTLR start "entryRuleEObjectSection"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1439:1: entryRuleEObjectSection returns [EObject current=null] : iv_ruleEObjectSection= ruleEObjectSection EOF ;
    public final EObject entryRuleEObjectSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectSection = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1440:2: (iv_ruleEObjectSection= ruleEObjectSection EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1441:2: iv_ruleEObjectSection= ruleEObjectSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEObjectSectionRule()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection2747);
            iv_ruleEObjectSection=ruleEObjectSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEObjectSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEObjectSection2757); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEObjectSection"


    // $ANTLR start "ruleEObjectSection"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1448:1: ruleEObjectSection returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? ) ;
    public final EObject ruleEObjectSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_prefix_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_attributes_8_0 = null;

        EObject lv_attributes_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1451:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1452:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1452:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1452:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1452:2: ( (otherlv_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1453:1: (otherlv_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1453:1: (otherlv_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1454:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEObjectSectionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection2802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
              	
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1465:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1465:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleEObjectSection2815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEObjectSectionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1469:1: ( (otherlv_2= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1470:1: (otherlv_2= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1470:1: (otherlv_2= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1471:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection2835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1482:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==13) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1482:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEObjectSection2848); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1486:1: ( (otherlv_4= RULE_ID ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1487:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1487:1: (otherlv_4= RULE_ID )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1488:3: otherlv_4= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection2868); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_4, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);

                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleEObjectSection2882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEObjectSectionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1503:3: ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1503:4: ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1503:4: ( (lv_prefix_6_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1504:1: (lv_prefix_6_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1504:1: (lv_prefix_6_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1505:3: lv_prefix_6_0= RULE_ID
                    {
                    lv_prefix_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection2902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_prefix_6_0, grammarAccess.getEObjectSectionAccess().getPrefixIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"prefix",
                              		lv_prefix_6_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1521:2: (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==12) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1521:4: otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}'
                            {
                            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleEObjectSection2920); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_2_1_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1525:1: ( (lv_attributes_8_0= ruleEMappingAttribute ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1526:1: (lv_attributes_8_0= ruleEMappingAttribute )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1526:1: (lv_attributes_8_0= ruleEMappingAttribute )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1527:3: lv_attributes_8_0= ruleEMappingAttribute
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection2941);
                            lv_attributes_8_0=ruleEMappingAttribute();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEObjectSectionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"attributes",
                                      		lv_attributes_8_0, 
                                      		"EMappingAttribute");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1543:2: (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==13) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1543:4: otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            	    {
                            	    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleEObjectSection2954); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getEObjectSectionAccess().getCommaKeyword_2_1_2_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1547:1: ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1548:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1548:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1549:3: lv_attributes_10_0= ruleEMappingAttribute
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection2975);
                            	    lv_attributes_10_0=ruleEMappingAttribute();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getEObjectSectionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"attributes",
                            	              		lv_attributes_10_0, 
                            	              		"EMappingAttribute");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleEObjectSection2989); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getEObjectSectionAccess().getRightCurlyBracketKeyword_2_1_3());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEObjectSection"


    // $ANTLR start "entryRuleEMappingAttribute"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1577:1: entryRuleEMappingAttribute returns [EObject current=null] : iv_ruleEMappingAttribute= ruleEMappingAttribute EOF ;
    public final EObject entryRuleEMappingAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1578:2: (iv_ruleEMappingAttribute= ruleEMappingAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1579:2: iv_ruleEMappingAttribute= ruleEMappingAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute3029);
            iv_ruleEMappingAttribute=ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingAttribute3039); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEMappingAttribute"


    // $ANTLR start "ruleEMappingAttribute"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1586:1: ruleEMappingAttribute returns [EObject current=null] : ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) ;
    public final EObject ruleEMappingAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_pk_0_0=null;
        Token otherlv_2=null;
        Token lv_columnName_3_0=null;
        Token lv_resolved_4_0=null;
        Token otherlv_6=null;
        Token lv_parameters_7_0=null;
        Token otherlv_8=null;
        Token lv_mapped_9_0=null;
        AntlrDatatypeRuleToken lv_property_1_0 = null;

        EObject lv_map_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1589:28: ( ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1590:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1590:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1590:2: ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1590:2: ( (lv_pk_0_0= 'primarykey' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==27) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1591:1: (lv_pk_0_0= 'primarykey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1591:1: (lv_pk_0_0= 'primarykey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1592:3: lv_pk_0_0= 'primarykey'
                    {
                    lv_pk_0_0=(Token)match(input,27,FOLLOW_27_in_ruleEMappingAttribute3082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_pk_0_0, grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "pk", true, "primarykey");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1605:3: ( (lv_property_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1606:1: (lv_property_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1606:1: (lv_property_1_0= ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1607:3: lv_property_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute3117);
            lv_property_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEMappingAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"property",
                      		lv_property_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEMappingAttribute3129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1627:1: ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt39=1;
                }
                break;
            case 30:
                {
                alt39=2;
                }
                break;
            case 42:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1627:2: ( (lv_columnName_3_0= RULE_ID ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1627:2: ( (lv_columnName_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1628:1: (lv_columnName_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1628:1: (lv_columnName_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1629:3: lv_columnName_3_0= RULE_ID
                    {
                    lv_columnName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingAttribute3147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_columnName_3_0, grammarAccess.getEMappingAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"columnName",
                              		lv_columnName_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1646:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1646:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1646:7: ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1646:7: ( (lv_resolved_4_0= 'resolve' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1647:1: (lv_resolved_4_0= 'resolve' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1647:1: (lv_resolved_4_0= 'resolve' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1648:3: lv_resolved_4_0= 'resolve'
                    {
                    lv_resolved_4_0=(Token)match(input,30,FOLLOW_30_in_ruleEMappingAttribute3177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_resolved_4_0, grammarAccess.getEMappingAttributeAccess().getResolvedResolveKeyword_3_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "resolved", true, "resolve");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1661:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1662:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1662:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1663:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute3213);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEMappingAttribute3225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1680:1: ( (lv_parameters_7_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1681:1: (lv_parameters_7_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1681:1: (lv_parameters_7_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1682:3: lv_parameters_7_0= RULE_ID
                    {
                    lv_parameters_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingAttribute3242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_parameters_7_0, grammarAccess.getEMappingAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"parameters",
                              		lv_parameters_7_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleEMappingAttribute3259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1703:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1703:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1703:7: ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1703:7: ( (lv_mapped_9_0= 'map' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1704:1: (lv_mapped_9_0= 'map' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1704:1: (lv_mapped_9_0= 'map' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1705:3: lv_mapped_9_0= 'map'
                    {
                    lv_mapped_9_0=(Token)match(input,42,FOLLOW_42_in_ruleEMappingAttribute3285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_mapped_9_0, grammarAccess.getEMappingAttributeAccess().getMappedMapKeyword_3_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "mapped", true, "map");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1718:2: ( (lv_map_10_0= ruleEObjectSection ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1719:1: (lv_map_10_0= ruleEObjectSection )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1719:1: (lv_map_10_0= ruleEObjectSection )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1720:3: lv_map_10_0= ruleEObjectSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEObjectSection_in_ruleEMappingAttribute3319);
                    lv_map_10_0=ruleEObjectSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEMappingAttributeRule());
                      	        }
                             		set(
                             			current, 
                             			"map",
                              		lv_map_10_0, 
                              		"EObjectSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEMappingAttribute"


    // $ANTLR start "entryRuleEType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1744:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1745:2: (iv_ruleEType= ruleEType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1746:2: iv_ruleEType= ruleEType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETypeRule()); 
            }
            pushFollow(FOLLOW_ruleEType_in_entryRuleEType3357);
            iv_ruleEType=ruleEType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEType3367); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEType"


    // $ANTLR start "ruleEType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1753:1: ruleEType returns [EObject current=null] : (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1756:28: ( (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1757:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1757:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1757:3: otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleEType3404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getEtypeKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1761:1: ( (lv_url_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1762:1: (lv_url_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1762:1: (lv_url_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1763:3: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEType3421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_url_1_0, grammarAccess.getETypeAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getETypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"url",
                      		lv_url_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleEType3438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getETypeAccess().getNumberSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1783:1: ( (lv_name_3_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1784:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1784:1: (lv_name_3_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1785:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEType3455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getETypeAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getETypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1809:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1810:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1811:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3497);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3508); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1818:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1821:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1822:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1822:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1822:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1829:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==45) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_ID) && (synpred1_InternalEMap())) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1829:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1829:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1829:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedName3576); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3592); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1852:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1853:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1854:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3640);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3651); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1861:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1864:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1865:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1865:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1866:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3698);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedNameWithWildcard3716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,46,FOLLOW_46_in_ruleQualifiedNameWithWildcard3729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleReturnType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1896:1: ruleReturnType returns [Enumerator current=null] : ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) ;
    public final Enumerator ruleReturnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1898:28: ( ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1899:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1899:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            else if ( (LA41_0==48) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1899:2: (enumLiteral_0= 'list' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1899:2: (enumLiteral_0= 'list' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1899:4: enumLiteral_0= 'list'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleReturnType3783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1905:6: (enumLiteral_1= 'single' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1905:6: (enumLiteral_1= 'single' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1905:8: enumLiteral_1= 'single'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleReturnType3800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReturnTypeAccess().getSingleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getReturnTypeAccess().getSingleEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReturnType"

    // $ANTLR start synpred1_InternalEMap
    public final void synpred1_InternalEMap_fragment() throws RecognitionException {   
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1829:3: ( '.' )
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1830:2: '.'
        {
        match(input,45,FOLLOW_45_in_synpred1_InternalEMap3567); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEMap

    // Delegated rules

    public final boolean synpred1_InternalEMap() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEMap_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\6\uffff";
    static final String DFA7_eofS =
        "\1\uffff\1\3\2\uffff\1\3\1\uffff";
    static final String DFA7_minS =
        "\1\4\1\13\1\4\1\uffff\1\13\1\uffff";
    static final String DFA7_maxS =
        "\1\4\1\55\1\56\1\uffff\1\55\1\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\2\1\uffff\1\1";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\3\4\uffff\1\3\2\uffff\2\3\30\uffff\1\2",
            "\1\4\51\uffff\1\5",
            "",
            "\1\3\4\uffff\1\3\2\uffff\2\3\30\uffff\1\2",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "362:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )";
        }
    }
 

    public static final BitSet FOLLOW_ruleEMapping_in_entryRuleEMapping75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMapping85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingBundle_in_ruleEMapping132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntityDef_in_ruleEMapping151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingBundle_in_entryRuleEMappingBundle189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingBundle199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleEMappingBundle245 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_11_in_ruleEMappingBundle258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingBundle275 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingBundle292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingBundle312 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingBundle325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingBundle345 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEMappingBundle359 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEMappingBundle372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEMappingBundle389 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEMappingBundle407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEMappingBundle424 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleEMappingEntityDef_in_entryRuleEMappingEntityDef469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingEntityDef479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleEMappingEntityDef525 = new BitSet(new long[]{0x0000000000190800L});
    public static final BitSet FOLLOW_ruleImport_in_ruleEMappingEntityDef546 = new BitSet(new long[]{0x0000000000190800L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_ruleEMappingEntityDef568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePackageDeclaration779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration800 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePackageDeclaration812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_entryRuleEMappingEntity848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingEntity858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEMappingEntity901 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEMappingEntity927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity944 = new BitSet(new long[]{0x0000000000601000L});
    public static final BitSet FOLLOW_21_in_ruleEMappingEntity970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleEMappingEntity999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingEntity1038 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity1052 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleEType_in_ruleEMappingEntity1073 = new BitSet(new long[]{0x0000000001804000L});
    public static final BitSet FOLLOW_23_in_ruleEMappingEntity1086 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity1098 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleEAttribute_in_ruleEMappingEntity1119 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingEntity1132 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleEAttribute_in_ruleEMappingEntity1153 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEMappingEntity1167 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleEMappingEntity1182 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity1194 = new BitSet(new long[]{0x0001800000000010L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_ruleEMappingEntity1215 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingEntity1228 = new BitSet(new long[]{0x0001800000000010L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_ruleEMappingEntity1249 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEMappingEntity1263 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEMappingEntity1277 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleEMappingEntity1290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity1307 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleEMappingEntity1327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_entryRuleEAttribute1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttribute1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEAttribute1440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute1471 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEAttribute1488 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute1507 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleEAttribute1525 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEAttribute1537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_ruleEAttribute1558 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEAttribute1571 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_ruleEAttribute1592 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEAttribute1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEAttribute1634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEAttribute1670 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEAttribute1682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute1699 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEAttribute1716 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEAttribute1740 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEAttribute1752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator1814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEValueGenerator1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator1866 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_34_in_ruleEValueGenerator1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEValueGenerator1922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEValueGenerator1964 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedQuery2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleENamedQuery2080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleENamedQuery2098 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_31_in_ruleENamedQuery2116 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedQuery2138 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_13_in_ruleENamedQuery2151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedQuery2172 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_32_in_ruleENamedQuery2188 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleENamedQuery2202 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_ruleEQuery_in_ruleENamedQuery2223 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleENamedQuery2236 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_ruleEQuery_in_ruleENamedQuery2257 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleENamedQuery2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_entryRuleEParameter2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEParameter2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEParameter2359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEParameter2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_entryRuleEQuery2422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQuery2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEQuery2477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_ruleEQuery2534 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_38_in_ruleEQuery2548 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2565 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_39_in_ruleEQuery2583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2600 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_40_in_ruleEQuery2620 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2637 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleEQuery2657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection2747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEObjectSection2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection2802 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_31_in_ruleEObjectSection2815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection2835 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEObjectSection2848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection2868 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_32_in_ruleEObjectSection2882 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection2902 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleEObjectSection2920 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection2941 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEObjectSection2954 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection2975 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEObjectSection2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute3029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingAttribute3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEMappingAttribute3082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute3117 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEMappingAttribute3129 = new BitSet(new long[]{0x0000040040000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingAttribute3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEMappingAttribute3177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute3213 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEMappingAttribute3225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingAttribute3242 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEMappingAttribute3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEMappingAttribute3285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_ruleEMappingAttribute3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_entryRuleEType3357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEType3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEType3404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEType3421 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleEType3438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEType3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3548 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedName3576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3592 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3698 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedNameWithWildcard3716 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleQualifiedNameWithWildcard3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReturnType3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleReturnType3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred1_InternalEMap3567 = new BitSet(new long[]{0x0000000000000002L});

}