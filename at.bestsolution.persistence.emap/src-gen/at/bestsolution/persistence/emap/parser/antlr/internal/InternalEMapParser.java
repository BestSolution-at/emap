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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bundle'", "'{'", "','", "'}'", "'databases'", "'import'", "'package'", "';'", "'abstract'", "'entity'", "'extends'", "'derived'", "'attributes'", "'queries'", "'as'", "'primarykey'", "'=>'", "'generatedby'", "'resolve'", "'('", "')'", "'autokey'", "'query'", "'seqnext'", "'default'", "'FROM'", "'WHERE'", "'GROUP BY'", "'ORDER BY'", "'descriminatedby'", "'map'", "'etype'", "'#'", "'.'", "'*'", "'list'", "'single'"
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:460:1: ruleEMappingEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )? otherlv_19= '}' (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )? ) ;
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
        EObject lv_etype_6_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_namedQueries_15_0 = null;

        EObject lv_namedQueries_17_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:463:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )? otherlv_19= '}' (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:464:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )? otherlv_19= '}' (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:464:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )? otherlv_19= '}' (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:464:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( (lv_namedQueries_15_0= ruleENamedQuery ) ) (otherlv_16= ',' ( (lv_namedQueries_17_0= ruleENamedQuery ) ) )* otherlv_18= '}' )? otherlv_19= '}' (otherlv_20= 'as' ( (lv_tableName_21_0= RULE_ID ) ) )?
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:706:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:707:2: (iv_ruleEAttribute= ruleEAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:708:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_entryRuleEAttribute1350);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttribute1360); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:715:1: ruleEAttribute returns [EObject current=null] : ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= RULE_ID ) ) otherlv_2= '=>' ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ) ) ) ;
    public final EObject ruleEAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_pk_0_0=null;
        Token lv_property_1_0=null;
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
        EObject lv_valueGenerators_6_0 = null;

        EObject lv_valueGenerators_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:718:28: ( ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= RULE_ID ) ) otherlv_2= '=>' ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:719:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= RULE_ID ) ) otherlv_2= '=>' ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:719:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= RULE_ID ) ) otherlv_2= '=>' ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:719:2: ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= RULE_ID ) ) otherlv_2= '=>' ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:719:2: ( (lv_pk_0_0= 'primarykey' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:720:1: (lv_pk_0_0= 'primarykey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:720:1: (lv_pk_0_0= 'primarykey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:721:3: lv_pk_0_0= 'primarykey'
                    {
                    lv_pk_0_0=(Token)match(input,26,FOLLOW_26_in_ruleEAttribute1403); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:734:3: ( (lv_property_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:735:1: (lv_property_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:735:1: (lv_property_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:736:3: lv_property_1_0= RULE_ID
            {
            lv_property_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute1434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_property_1_0, grammarAccess.getEAttributeAccess().getPropertyIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"property",
                      		lv_property_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEAttribute1451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:756:1: ( ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? ) | ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:756:2: ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:756:2: ( ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:756:3: ( (lv_columnName_3_0= RULE_ID ) ) (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:756:3: ( (lv_columnName_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:757:1: (lv_columnName_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:757:1: (lv_columnName_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:758:3: lv_columnName_3_0= RULE_ID
                    {
                    lv_columnName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute1470); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:774:2: (otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==28) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:774:4: otherlv_4= 'generatedby' otherlv_5= '{' ( (lv_valueGenerators_6_0= ruleEValueGenerator ) ) (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )* otherlv_9= '}'
                            {
                            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleEAttribute1488); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getEAttributeAccess().getGeneratedbyKeyword_3_0_1_0());
                                  
                            }
                            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleEAttribute1500); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_3_0_1_1());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:782:1: ( (lv_valueGenerators_6_0= ruleEValueGenerator ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:783:1: (lv_valueGenerators_6_0= ruleEValueGenerator )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:783:1: (lv_valueGenerators_6_0= ruleEValueGenerator )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:784:3: lv_valueGenerators_6_0= ruleEValueGenerator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEValueGenerator_in_ruleEAttribute1521);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:800:2: (otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==13) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:800:4: otherlv_7= ',' ( (lv_valueGenerators_8_0= ruleEValueGenerator ) )
                            	    {
                            	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleEAttribute1534); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_7, grammarAccess.getEAttributeAccess().getCommaKeyword_3_0_1_3_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:804:1: ( (lv_valueGenerators_8_0= ruleEValueGenerator ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:805:1: (lv_valueGenerators_8_0= ruleEValueGenerator )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:805:1: (lv_valueGenerators_8_0= ruleEValueGenerator )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:806:3: lv_valueGenerators_8_0= ruleEValueGenerator
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEValueGenerator_in_ruleEAttribute1555);
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
                            	    break loop17;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEAttribute1569); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:827:6: ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:827:6: ( ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:827:7: ( (lv_resolved_10_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_12= '(' ( (lv_parameters_13_0= RULE_ID ) ) otherlv_14= ')'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:827:7: ( (lv_resolved_10_0= 'resolve' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:828:1: (lv_resolved_10_0= 'resolve' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:828:1: (lv_resolved_10_0= 'resolve' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:829:3: lv_resolved_10_0= 'resolve'
                    {
                    lv_resolved_10_0=(Token)match(input,29,FOLLOW_29_in_ruleEAttribute1597); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:842:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:843:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:843:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:844:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEAttribute1633);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleEAttribute1645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:861:1: ( (lv_parameters_13_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:862:1: (lv_parameters_13_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:862:1: (lv_parameters_13_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:863:3: lv_parameters_13_0= RULE_ID
                    {
                    lv_parameters_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute1662); if (state.failed) return current;
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

                    otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleEAttribute1679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:891:1: entryRuleEValueGenerator returns [EObject current=null] : iv_ruleEValueGenerator= ruleEValueGenerator EOF ;
    public final EObject entryRuleEValueGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueGenerator = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:892:2: (iv_ruleEValueGenerator= ruleEValueGenerator EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:893:2: iv_ruleEValueGenerator= ruleEValueGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEValueGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator1717);
            iv_ruleEValueGenerator=ruleEValueGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEValueGenerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEValueGenerator1727); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:900:1: ruleEValueGenerator returns [EObject current=null] : ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:903:28: ( ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:904:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:904:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:904:2: ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:904:2: ( (lv_dbType_0_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:905:1: (lv_dbType_0_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:905:1: (lv_dbType_0_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:906:3: lv_dbType_0_0= RULE_STRING
            {
            lv_dbType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator1769); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:922:2: ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 34:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:922:3: ( (lv_autokey_1_0= 'autokey' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:922:3: ( (lv_autokey_1_0= 'autokey' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:923:1: (lv_autokey_1_0= 'autokey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:923:1: (lv_autokey_1_0= 'autokey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:924:3: lv_autokey_1_0= 'autokey'
                    {
                    lv_autokey_1_0=(Token)match(input,32,FOLLOW_32_in_ruleEValueGenerator1793); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:938:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:938:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:938:8: otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleEValueGenerator1825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEValueGeneratorAccess().getQueryKeyword_1_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:942:1: ( (lv_query_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:943:1: (lv_query_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:943:1: (lv_query_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:944:3: lv_query_3_0= RULE_STRING
                    {
                    lv_query_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator1842); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:961:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:961:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:961:8: otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleEValueGenerator1867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEValueGeneratorAccess().getSeqnextKeyword_1_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:965:1: ( (lv_sequence_5_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:966:1: (lv_sequence_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:966:1: (lv_sequence_5_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:967:3: lv_sequence_5_0= RULE_STRING
                    {
                    lv_sequence_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator1884); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:991:1: entryRuleENamedQuery returns [EObject current=null] : iv_ruleENamedQuery= ruleENamedQuery EOF ;
    public final EObject entryRuleENamedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:992:2: (iv_ruleENamedQuery= ruleENamedQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:993:2: iv_ruleENamedQuery= ruleENamedQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery1927);
            iv_ruleENamedQuery=ruleENamedQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedQuery1937); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1000:1: ruleENamedQuery returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= ')' )? otherlv_5= '{' ( (lv_queries_6_0= ruleEQuery ) ) (otherlv_7= ',' ( (lv_queries_8_0= ruleEQuery ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleENamedQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_returnType_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_queries_6_0 = null;

        EObject lv_queries_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1003:28: ( ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= ')' )? otherlv_5= '{' ( (lv_queries_6_0= ruleEQuery ) ) (otherlv_7= ',' ( (lv_queries_8_0= ruleEQuery ) ) )* otherlv_9= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1004:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= ')' )? otherlv_5= '{' ( (lv_queries_6_0= ruleEQuery ) ) (otherlv_7= ',' ( (lv_queries_8_0= ruleEQuery ) ) )* otherlv_9= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1004:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= ')' )? otherlv_5= '{' ( (lv_queries_6_0= ruleEQuery ) ) (otherlv_7= ',' ( (lv_queries_8_0= ruleEQuery ) ) )* otherlv_9= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1004:2: ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= ')' )? otherlv_5= '{' ( (lv_queries_6_0= ruleEQuery ) ) (otherlv_7= ',' ( (lv_queries_8_0= ruleEQuery ) ) )* otherlv_9= '}'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1004:2: ( (lv_returnType_0_0= ruleReturnType ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=46 && LA21_0<=47)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1005:1: (lv_returnType_0_0= ruleReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1005:1: (lv_returnType_0_0= ruleReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1006:3: lv_returnType_0_0= ruleReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getReturnTypeReturnTypeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnType_in_ruleENamedQuery1983);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1022:3: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1023:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1023:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1024:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleENamedQuery2001); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1040:2: (otherlv_2= '(' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1040:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleENamedQuery2019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1044:1: ( (lv_parameters_3_0= ruleEParameter ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1045:1: (lv_parameters_3_0= ruleEParameter )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1045:1: (lv_parameters_3_0= ruleEParameter )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1046:3: lv_parameters_3_0= ruleEParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEParameter_in_ruleENamedQuery2040);
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
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleENamedQuery2053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleENamedQuery2067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1070:1: ( (lv_queries_6_0= ruleEQuery ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1071:1: (lv_queries_6_0= ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1071:1: (lv_queries_6_0= ruleEQuery )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1072:3: lv_queries_6_0= ruleEQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEQuery_in_ruleENamedQuery2088);
            lv_queries_6_0=ruleEQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getENamedQueryRule());
              	        }
                     		add(
                     			current, 
                     			"queries",
                      		lv_queries_6_0, 
                      		"EQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1088:2: (otherlv_7= ',' ( (lv_queries_8_0= ruleEQuery ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==13) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1088:4: otherlv_7= ',' ( (lv_queries_8_0= ruleEQuery ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleENamedQuery2101); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getENamedQueryAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1092:1: ( (lv_queries_8_0= ruleEQuery ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1093:1: (lv_queries_8_0= ruleEQuery )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1093:1: (lv_queries_8_0= ruleEQuery )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1094:3: lv_queries_8_0= ruleEQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQuery_in_ruleENamedQuery2122);
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


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleENamedQuery2136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getENamedQueryAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1122:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1123:2: (iv_ruleEParameter= ruleEParameter EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1124:2: iv_ruleEParameter= ruleEParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEParameterRule()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_entryRuleEParameter2172);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEParameter2182); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1131:1: ruleEParameter returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1134:28: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1135:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1135:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1135:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1135:2: ( (lv_type_0_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1136:1: (lv_type_0_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1136:1: (lv_type_0_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1137:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEParameter2224); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1153:2: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1154:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1154:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEParameter2246); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1179:1: entryRuleEQuery returns [EObject current=null] : iv_ruleEQuery= ruleEQuery EOF ;
    public final EObject entryRuleEQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1180:2: (iv_ruleEQuery= ruleEQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1181:2: iv_ruleEQuery= ruleEQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQueryRule()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_entryRuleEQuery2287);
            iv_ruleEQuery=ruleEQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQuery2297); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1188:1: ruleEQuery returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1191:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1192:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1192:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1192:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1192:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1193:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1193:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1194:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1194:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_STRING) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1195:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,35,FOLLOW_35_in_ruleEQuery2342); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1207:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2370); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1225:2: ( (lv_mapping_1_0= ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1226:1: (lv_mapping_1_0= ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1226:1: (lv_mapping_1_0= ruleEObjectSection )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1227:3: lv_mapping_1_0= ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_ruleEQuery2399);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1243:2: ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_STRING) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1243:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1243:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1243:5: otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleEQuery2413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1247:1: ( (lv_from_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1248:1: (lv_from_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1248:1: (lv_from_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1249:3: lv_from_3_0= RULE_STRING
                    {
                    lv_from_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2430); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1265:2: (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==37) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1265:4: otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleEQuery2448); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1269:1: ( (lv_where_5_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1270:1: (lv_where_5_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1270:1: (lv_where_5_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1271:3: lv_where_5_0= RULE_STRING
                            {
                            lv_where_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2465); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1287:4: (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==38) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1287:6: otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleEQuery2485); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1291:1: ( (lv_groupBy_7_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1292:1: (lv_groupBy_7_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1292:1: (lv_groupBy_7_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1293:3: lv_groupBy_7_0= RULE_STRING
                            {
                            lv_groupBy_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2502); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1309:4: (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==39) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1309:6: otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleEQuery2522); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1313:1: ( (lv_orderby_9_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1314:1: (lv_orderby_9_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1314:1: (lv_orderby_9_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1315:3: lv_orderby_9_0= RULE_STRING
                            {
                            lv_orderby_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2539); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1332:6: ( (lv_all_10_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1332:6: ( (lv_all_10_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1333:1: (lv_all_10_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1333:1: (lv_all_10_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1334:3: lv_all_10_0= RULE_STRING
                    {
                    lv_all_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery2570); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1358:1: entryRuleEObjectSection returns [EObject current=null] : iv_ruleEObjectSection= ruleEObjectSection EOF ;
    public final EObject entryRuleEObjectSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectSection = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1359:2: (iv_ruleEObjectSection= ruleEObjectSection EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1360:2: iv_ruleEObjectSection= ruleEObjectSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEObjectSectionRule()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection2612);
            iv_ruleEObjectSection=ruleEObjectSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEObjectSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEObjectSection2622); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1367:1: ruleEObjectSection returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'descriminatedby' ( (lv_descrimatorColumn_6_0= RULE_ID ) ) otherlv_7= ')' )? ( ( (lv_prefix_8_0= RULE_ID ) ) (otherlv_9= '{' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) (otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) ) )* otherlv_13= '}' )? )? ) ;
    public final EObject ruleEObjectSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_descrimatorColumn_6_0=null;
        Token otherlv_7=null;
        Token lv_prefix_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_attributes_10_0 = null;

        EObject lv_attributes_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1370:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'descriminatedby' ( (lv_descrimatorColumn_6_0= RULE_ID ) ) otherlv_7= ')' )? ( ( (lv_prefix_8_0= RULE_ID ) ) (otherlv_9= '{' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) (otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) ) )* otherlv_13= '}' )? )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1371:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'descriminatedby' ( (lv_descrimatorColumn_6_0= RULE_ID ) ) otherlv_7= ')' )? ( ( (lv_prefix_8_0= RULE_ID ) ) (otherlv_9= '{' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) (otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) ) )* otherlv_13= '}' )? )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1371:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'descriminatedby' ( (lv_descrimatorColumn_6_0= RULE_ID ) ) otherlv_7= ')' )? ( ( (lv_prefix_8_0= RULE_ID ) ) (otherlv_9= '{' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) (otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) ) )* otherlv_13= '}' )? )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1371:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'descriminatedby' ( (lv_descrimatorColumn_6_0= RULE_ID ) ) otherlv_7= ')' )? ( ( (lv_prefix_8_0= RULE_ID ) ) (otherlv_9= '{' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) (otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) ) )* otherlv_13= '}' )? )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1371:2: ( (otherlv_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1372:1: (otherlv_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1372:1: (otherlv_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1373:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEObjectSectionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection2667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
              	
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1384:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'descriminatedby' ( (lv_descrimatorColumn_6_0= RULE_ID ) ) otherlv_7= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1384:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= 'descriminatedby' ( (lv_descrimatorColumn_6_0= RULE_ID ) ) otherlv_7= ')'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleEObjectSection2680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEObjectSectionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1388:1: ( (otherlv_2= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1389:1: (otherlv_2= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1389:1: (otherlv_2= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1390:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection2700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1401:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==13) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1401:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEObjectSection2713); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1405:1: ( (otherlv_4= RULE_ID ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1406:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1406:1: (otherlv_4= RULE_ID )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1407:3: otherlv_4= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection2733); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_4, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleEObjectSection2747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEObjectSectionAccess().getDescriminatedbyKeyword_1_3());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1422:1: ( (lv_descrimatorColumn_6_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1423:1: (lv_descrimatorColumn_6_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1423:1: (lv_descrimatorColumn_6_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1424:3: lv_descrimatorColumn_6_0= RULE_ID
                    {
                    lv_descrimatorColumn_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection2764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_descrimatorColumn_6_0, grammarAccess.getEObjectSectionAccess().getDescrimatorColumnIDTerminalRuleCall_1_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"descrimatorColumn",
                              		lv_descrimatorColumn_6_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleEObjectSection2781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEObjectSectionAccess().getRightParenthesisKeyword_1_5());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1444:3: ( ( (lv_prefix_8_0= RULE_ID ) ) (otherlv_9= '{' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) (otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) ) )* otherlv_13= '}' )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1444:4: ( (lv_prefix_8_0= RULE_ID ) ) (otherlv_9= '{' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) (otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) ) )* otherlv_13= '}' )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1444:4: ( (lv_prefix_8_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1445:1: (lv_prefix_8_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1445:1: (lv_prefix_8_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1446:3: lv_prefix_8_0= RULE_ID
                    {
                    lv_prefix_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection2801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_prefix_8_0, grammarAccess.getEObjectSectionAccess().getPrefixIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"prefix",
                              		lv_prefix_8_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1462:2: (otherlv_9= '{' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) (otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) ) )* otherlv_13= '}' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==12) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1462:4: otherlv_9= '{' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) (otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) ) )* otherlv_13= '}'
                            {
                            otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleEObjectSection2819); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_2_1_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1466:1: ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1467:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1467:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1468:3: lv_attributes_10_0= ruleEMappingAttribute
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection2840);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1484:2: (otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==13) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1484:4: otherlv_11= ',' ( (lv_attributes_12_0= ruleEMappingAttribute ) )
                            	    {
                            	    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleEObjectSection2853); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getEObjectSectionAccess().getCommaKeyword_2_1_2_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1488:1: ( (lv_attributes_12_0= ruleEMappingAttribute ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1489:1: (lv_attributes_12_0= ruleEMappingAttribute )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1489:1: (lv_attributes_12_0= ruleEMappingAttribute )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1490:3: lv_attributes_12_0= ruleEMappingAttribute
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection2874);
                            	    lv_attributes_12_0=ruleEMappingAttribute();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getEObjectSectionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"attributes",
                            	              		lv_attributes_12_0, 
                            	              		"EMappingAttribute");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleEObjectSection2888); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getEObjectSectionAccess().getRightCurlyBracketKeyword_2_1_3());
                                  
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1518:1: entryRuleEMappingAttribute returns [EObject current=null] : iv_ruleEMappingAttribute= ruleEMappingAttribute EOF ;
    public final EObject entryRuleEMappingAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1519:2: (iv_ruleEMappingAttribute= ruleEMappingAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1520:2: iv_ruleEMappingAttribute= ruleEMappingAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute2928);
            iv_ruleEMappingAttribute=ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingAttribute2938); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1527:1: ruleEMappingAttribute returns [EObject current=null] : ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1530:28: ( ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1531:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1531:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1531:2: ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1531:2: ( (lv_pk_0_0= 'primarykey' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1532:1: (lv_pk_0_0= 'primarykey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1532:1: (lv_pk_0_0= 'primarykey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1533:3: lv_pk_0_0= 'primarykey'
                    {
                    lv_pk_0_0=(Token)match(input,26,FOLLOW_26_in_ruleEMappingAttribute2981); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1546:3: ( (lv_property_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1547:1: (lv_property_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1547:1: (lv_property_1_0= ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1548:3: lv_property_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute3016);
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEMappingAttribute3028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1568:1: ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt36=1;
                }
                break;
            case 29:
                {
                alt36=2;
                }
                break;
            case 41:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1568:2: ( (lv_columnName_3_0= RULE_ID ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1568:2: ( (lv_columnName_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1569:1: (lv_columnName_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1569:1: (lv_columnName_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1570:3: lv_columnName_3_0= RULE_ID
                    {
                    lv_columnName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingAttribute3046); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1587:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1587:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1587:7: ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1587:7: ( (lv_resolved_4_0= 'resolve' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1588:1: (lv_resolved_4_0= 'resolve' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1588:1: (lv_resolved_4_0= 'resolve' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1589:3: lv_resolved_4_0= 'resolve'
                    {
                    lv_resolved_4_0=(Token)match(input,29,FOLLOW_29_in_ruleEMappingAttribute3076); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1602:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1603:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1603:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1604:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute3112);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleEMappingAttribute3124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1621:1: ( (lv_parameters_7_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1622:1: (lv_parameters_7_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1622:1: (lv_parameters_7_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1623:3: lv_parameters_7_0= RULE_ID
                    {
                    lv_parameters_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingAttribute3141); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleEMappingAttribute3158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1644:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1644:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1644:7: ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1644:7: ( (lv_mapped_9_0= 'map' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1645:1: (lv_mapped_9_0= 'map' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1645:1: (lv_mapped_9_0= 'map' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1646:3: lv_mapped_9_0= 'map'
                    {
                    lv_mapped_9_0=(Token)match(input,41,FOLLOW_41_in_ruleEMappingAttribute3184); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1659:2: ( (lv_map_10_0= ruleEObjectSection ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1660:1: (lv_map_10_0= ruleEObjectSection )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1660:1: (lv_map_10_0= ruleEObjectSection )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1661:3: lv_map_10_0= ruleEObjectSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEObjectSection_in_ruleEMappingAttribute3218);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1685:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1686:2: (iv_ruleEType= ruleEType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1687:2: iv_ruleEType= ruleEType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETypeRule()); 
            }
            pushFollow(FOLLOW_ruleEType_in_entryRuleEType3256);
            iv_ruleEType=ruleEType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEType3266); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1694:1: ruleEType returns [EObject current=null] : (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1697:28: ( (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1698:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1698:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1698:3: otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleEType3303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getEtypeKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1702:1: ( (lv_url_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1703:1: (lv_url_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1703:1: (lv_url_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1704:3: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEType3320); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleEType3337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getETypeAccess().getNumberSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1724:1: ( (lv_name_3_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1725:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1725:1: (lv_name_3_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1726:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEType3354); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1750:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1751:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1752:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3396);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3407); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1759:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1762:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1763:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1763:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1763:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1770:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==44) ) {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==RULE_ID) && (synpred1_InternalEMap())) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1770:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1770:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1770:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_44_in_ruleQualifiedName3475); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3491); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1793:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1794:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1795:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3539);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3550); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1802:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1805:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1806:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1806:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1807:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3597);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,44,FOLLOW_44_in_ruleQualifiedNameWithWildcard3615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedNameWithWildcard3628); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1837:1: ruleReturnType returns [Enumerator current=null] : ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) ;
    public final Enumerator ruleReturnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1839:28: ( ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1840:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1840:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            else if ( (LA38_0==47) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1840:2: (enumLiteral_0= 'list' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1840:2: (enumLiteral_0= 'list' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1840:4: enumLiteral_0= 'list'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleReturnType3682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1846:6: (enumLiteral_1= 'single' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1846:6: (enumLiteral_1= 'single' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1846:8: enumLiteral_1= 'single'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleReturnType3699); if (state.failed) return current;
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
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1770:3: ( '.' )
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1771:2: '.'
        {
        match(input,44,FOLLOW_44_in_synpred1_InternalEMap3466); if (state.failed) return ;

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
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA7_minS =
        "\1\4\1\13\1\4\2\uffff\1\13";
    static final String DFA7_maxS =
        "\1\4\1\54\1\55\2\uffff\1\54";
    static final String DFA7_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\3\4\uffff\1\3\2\uffff\2\3\27\uffff\1\2",
            "\1\5\50\uffff\1\4",
            "",
            "",
            "\1\3\4\uffff\1\3\2\uffff\2\3\27\uffff\1\2"
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
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity1052 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleEType_in_ruleEMappingEntity1073 = new BitSet(new long[]{0x0000000001804000L});
    public static final BitSet FOLLOW_23_in_ruleEMappingEntity1086 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity1098 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleEAttribute_in_ruleEMappingEntity1119 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingEntity1132 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleEAttribute_in_ruleEMappingEntity1153 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEMappingEntity1167 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleEMappingEntity1182 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity1194 = new BitSet(new long[]{0x0000C00000000010L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_ruleEMappingEntity1215 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingEntity1228 = new BitSet(new long[]{0x0000C00000000010L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_ruleEMappingEntity1249 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEMappingEntity1263 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEMappingEntity1277 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleEMappingEntity1290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_entryRuleEAttribute1350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttribute1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEAttribute1403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute1434 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEAttribute1451 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute1470 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleEAttribute1488 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEAttribute1500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_ruleEAttribute1521 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEAttribute1534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_ruleEAttribute1555 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEAttribute1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEAttribute1597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEAttribute1633 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEAttribute1645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute1662 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEAttribute1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator1717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEValueGenerator1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator1769 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_ruleEValueGenerator1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEValueGenerator1825 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEValueGenerator1867 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedQuery1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleENamedQuery1983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleENamedQuery2001 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_30_in_ruleENamedQuery2019 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedQuery2040 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_ruleENamedQuery2053 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleENamedQuery2067 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleEQuery_in_ruleENamedQuery2088 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleENamedQuery2101 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleEQuery_in_ruleENamedQuery2122 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleENamedQuery2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_entryRuleEParameter2172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEParameter2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEParameter2224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEParameter2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_entryRuleEQuery2287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQuery2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEQuery2342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_ruleEQuery2399 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_36_in_ruleEQuery2413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2430 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_37_in_ruleEQuery2448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2465 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleEQuery2485 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2502 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleEQuery2522 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection2612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEObjectSection2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection2667 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_30_in_ruleEObjectSection2680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection2700 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEObjectSection2713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection2733 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_40_in_ruleEObjectSection2747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection2764 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEObjectSection2781 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection2801 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleEObjectSection2819 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection2840 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEObjectSection2853 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection2874 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEObjectSection2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute2928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingAttribute2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEMappingAttribute2981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute3016 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEMappingAttribute3028 = new BitSet(new long[]{0x0000020020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingAttribute3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEMappingAttribute3076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute3112 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEMappingAttribute3124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingAttribute3141 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEMappingAttribute3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleEMappingAttribute3184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_ruleEMappingAttribute3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_entryRuleEType3256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEType3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEType3303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEType3320 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEType3337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEType3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3447 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleQualifiedName3475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3491 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3597 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleQualifiedNameWithWildcard3615 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedNameWithWildcard3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReturnType3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReturnType3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred1_InternalEMap3466 = new BitSet(new long[]{0x0000000000000002L});

}