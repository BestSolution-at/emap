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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bundle'", "'{'", "','", "'}'", "'databases'", "'import'", "'package'", "';'", "'.'", "'abstract'", "'entity'", "'extends'", "'derived'", "'attributes'", "'queries'", "'as'", "'descriminatedby'", "'primarykey'", "'forced-fk'", "'=>'", "'generatedby'", "'resolve'", "'('", "')'", "'on'", "'autokey'", "'query'", "'seqnext'", "'int'", "'long'", "'double'", "'float'", "'boolean'", "'map'", "'['", "']'", "'typedef'", "'cached'", "'default'", "'FROM'", "'WHERE'", "'GROUP BY'", "'ORDER BY'", "'etype'", "'#'", "'*'", "'list'", "'single'"
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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleFQN"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:451:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:452:2: (iv_ruleFQN= ruleFQN EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:453:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN849);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN860); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:460:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:463:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:464:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:464:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:464:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:471:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) && (synpred1_InternalEMap())) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:471:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:471:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:471:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleFQN928); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN944); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEMappingEntity"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:494:1: entryRuleEMappingEntity returns [EObject current=null] : iv_ruleEMappingEntity= ruleEMappingEntity EOF ;
    public final EObject entryRuleEMappingEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingEntity = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:495:2: (iv_ruleEMappingEntity= ruleEMappingEntity EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:496:2: iv_ruleEMappingEntity= ruleEMappingEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_entryRuleEMappingEntity991);
            iv_ruleEMappingEntity=ruleEMappingEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingEntity1001); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:503:1: ruleEMappingEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? ) ;
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
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_tableName_23_0=null;
        Token otherlv_24=null;
        Token lv_descriminationColumn_25_0=null;
        EObject lv_etype_6_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_namedQueries_15_0 = null;

        EObject lv_namedCustomQueries_16_0 = null;

        EObject lv_namedQueries_18_0 = null;

        EObject lv_namedCustomQueries_19_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:506:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:507:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:507:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:507:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:507:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:508:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:508:1: (lv_abstract_0_0= 'abstract' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:509:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,20,FOLLOW_20_in_ruleEMappingEntity1044); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleEMappingEntity1070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEMappingEntityAccess().getEntityKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:526:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:527:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:527:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:528:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity1087); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:544:2: ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=22 && LA11_0<=23)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:544:3: ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:544:3: ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:545:1: ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:545:1: ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:546:1: (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:546:1: (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==23) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:547:3: lv_extensionType_3_1= 'extends'
                            {
                            lv_extensionType_3_1=(Token)match(input,22,FOLLOW_22_in_ruleEMappingEntity1113); if (state.failed) return current;
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
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:559:8: lv_extensionType_3_2= 'derived'
                            {
                            lv_extensionType_3_2=(Token)match(input,23,FOLLOW_23_in_ruleEMappingEntity1142); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:574:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:575:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:575:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:576:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingEntity1181);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleEMappingEntity1195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:593:1: ( (lv_etype_6_0= ruleEType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:594:1: (lv_etype_6_0= ruleEType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:594:1: (lv_etype_6_0= ruleEType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:595:3: lv_etype_6_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getEtypeETypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEType_in_ruleEMappingEntity1216);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:611:2: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:611:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleEMappingEntity1229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleEMappingEntity1241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_6_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:619:1: ( (lv_attributes_9_0= ruleEAttribute ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:620:1: (lv_attributes_9_0= ruleEAttribute )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:620:1: (lv_attributes_9_0= ruleEAttribute )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:621:3: lv_attributes_9_0= ruleEAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEAttribute_in_ruleEMappingEntity1262);
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:637:2: (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:637:4: otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleEMappingEntity1275); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getEMappingEntityAccess().getCommaKeyword_6_3_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:641:1: ( (lv_attributes_11_0= ruleEAttribute ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:642:1: (lv_attributes_11_0= ruleEAttribute )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:642:1: (lv_attributes_11_0= ruleEAttribute )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:643:3: lv_attributes_11_0= ruleEAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEAttribute_in_ruleEMappingEntity1296);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleEMappingEntity1310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:663:3: (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:663:5: otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}'
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleEMappingEntity1325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEMappingEntityAccess().getQueriesKeyword_7_0());
                          
                    }
                    otherlv_14=(Token)match(input,12,FOLLOW_12_in_ruleEMappingEntity1337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:671:1: ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) )
                    int alt14=2;
                    switch ( input.LA(1) ) {
                    case 57:
                    case 58:
                        {
                        alt14=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA14_2 = input.LA(2);

                        if ( (LA14_2==RULE_ID||LA14_2==19) ) {
                            alt14=2;
                        }
                        else if ( (LA14_2==12||LA14_2==33) ) {
                            alt14=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 47:
                    case 54:
                        {
                        alt14=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:671:2: ( (lv_namedQueries_15_0= ruleENamedQuery ) )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:671:2: ( (lv_namedQueries_15_0= ruleENamedQuery ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:672:1: (lv_namedQueries_15_0= ruleENamedQuery )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:672:1: (lv_namedQueries_15_0= ruleENamedQuery )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:673:3: lv_namedQueries_15_0= ruleENamedQuery
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleENamedQuery_in_ruleEMappingEntity1359);
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


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:690:6: ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:690:6: ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:691:1: (lv_namedCustomQueries_16_0= ruleENamedCustomQuery )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:691:1: (lv_namedCustomQueries_16_0= ruleENamedCustomQuery )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:692:3: lv_namedCustomQueries_16_0= ruleENamedCustomQuery
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedCustomQueriesENamedCustomQueryParserRuleCall_7_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity1386);
                            lv_namedCustomQueries_16_0=ruleENamedCustomQuery();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEMappingEntityRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"namedCustomQueries",
                                      		lv_namedCustomQueries_16_0, 
                                      		"ENamedCustomQuery");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:708:3: (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==13) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:708:5: otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) )
                    	    {
                    	    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleEMappingEntity1400); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_17, grammarAccess.getEMappingEntityAccess().getCommaKeyword_7_3_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:712:1: ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) )
                    	    int alt15=2;
                    	    switch ( input.LA(1) ) {
                    	    case 57:
                    	    case 58:
                    	        {
                    	        alt15=1;
                    	        }
                    	        break;
                    	    case RULE_ID:
                    	        {
                    	        int LA15_2 = input.LA(2);

                    	        if ( (LA15_2==12||LA15_2==33) ) {
                    	            alt15=1;
                    	        }
                    	        else if ( (LA15_2==RULE_ID||LA15_2==19) ) {
                    	            alt15=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 15, 2, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 39:
                    	    case 40:
                    	    case 41:
                    	    case 42:
                    	    case 43:
                    	    case 44:
                    	    case 45:
                    	    case 47:
                    	    case 54:
                    	        {
                    	        alt15=2;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 15, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt15) {
                    	        case 1 :
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:712:2: ( (lv_namedQueries_18_0= ruleENamedQuery ) )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:712:2: ( (lv_namedQueries_18_0= ruleENamedQuery ) )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:713:1: (lv_namedQueries_18_0= ruleENamedQuery )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:713:1: (lv_namedQueries_18_0= ruleENamedQuery )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:714:3: lv_namedQueries_18_0= ruleENamedQuery
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_3_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleENamedQuery_in_ruleEMappingEntity1422);
                    	            lv_namedQueries_18_0=ruleENamedQuery();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getEMappingEntityRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"namedQueries",
                    	                      		lv_namedQueries_18_0, 
                    	                      		"ENamedQuery");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:731:6: ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:731:6: ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:732:1: (lv_namedCustomQueries_19_0= ruleENamedCustomQuery )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:732:1: (lv_namedCustomQueries_19_0= ruleENamedCustomQuery )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:733:3: lv_namedCustomQueries_19_0= ruleENamedCustomQuery
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedCustomQueriesENamedCustomQueryParserRuleCall_7_3_1_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity1449);
                    	            lv_namedCustomQueries_19_0=ruleENamedCustomQuery();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getEMappingEntityRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"namedCustomQueries",
                    	                      		lv_namedCustomQueries_19_0, 
                    	                      		"ENamedCustomQuery");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleEMappingEntity1464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            otherlv_21=(Token)match(input,14,FOLLOW_14_in_ruleEMappingEntity1478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_8());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:757:1: (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:757:3: otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) )
                    {
                    otherlv_22=(Token)match(input,26,FOLLOW_26_in_ruleEMappingEntity1491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getEMappingEntityAccess().getAsKeyword_9_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:761:1: ( (lv_tableName_23_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:762:1: (lv_tableName_23_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:762:1: (lv_tableName_23_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:763:3: lv_tableName_23_0= RULE_ID
                    {
                    lv_tableName_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity1508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_tableName_23_0, grammarAccess.getEMappingEntityAccess().getTableNameIDTerminalRuleCall_9_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"tableName",
                              		lv_tableName_23_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:779:4: (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:779:6: otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) )
                    {
                    otherlv_24=(Token)match(input,27,FOLLOW_27_in_ruleEMappingEntity1528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getEMappingEntityAccess().getDescriminatedbyKeyword_10_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:783:1: ( (lv_descriminationColumn_25_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:784:1: (lv_descriminationColumn_25_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:784:1: (lv_descriminationColumn_25_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:785:3: lv_descriminationColumn_25_0= RULE_ID
                    {
                    lv_descriminationColumn_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity1545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_descriminationColumn_25_0, grammarAccess.getEMappingEntityAccess().getDescriminationColumnIDTerminalRuleCall_10_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"descriminationColumn",
                              		lv_descriminationColumn_25_0, 
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:809:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:810:2: (iv_ruleEAttribute= ruleEAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:811:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_entryRuleEAttribute1588);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttribute1598); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:818:1: ruleEAttribute returns [EObject current=null] : ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) ) ;
    public final EObject ruleEAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_pk_0_0=null;
        Token lv_forcedFk_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_columnName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_resolved_11_0=null;
        Token otherlv_13=null;
        Token lv_parameters_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_relationTable_18_0=null;
        Token otherlv_19=null;
        Token lv_relationColumn_20_0=null;
        EObject lv_valueGenerators_7_0 = null;

        EObject lv_valueGenerators_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:821:28: ( ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:1: ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:1: ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:2: ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:2: ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==28) ) {
                alt21=1;
            }
            else if ( (LA21_0==29) ) {
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:3: ( (lv_pk_0_0= 'primarykey' ) )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:3: ( (lv_pk_0_0= 'primarykey' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==28) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:823:1: (lv_pk_0_0= 'primarykey' )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:823:1: (lv_pk_0_0= 'primarykey' )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:824:3: lv_pk_0_0= 'primarykey'
                            {
                            lv_pk_0_0=(Token)match(input,28,FOLLOW_28_in_ruleEAttribute1642); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_pk_0_0, grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0_0());
                                  
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


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:838:6: ( (lv_forcedFk_1_0= 'forced-fk' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:838:6: ( (lv_forcedFk_1_0= 'forced-fk' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:839:1: (lv_forcedFk_1_0= 'forced-fk' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:839:1: (lv_forcedFk_1_0= 'forced-fk' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:840:3: lv_forcedFk_1_0= 'forced-fk'
                    {
                    lv_forcedFk_1_0=(Token)match(input,29,FOLLOW_29_in_ruleEAttribute1680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_forcedFk_1_0, grammarAccess.getEAttributeAccess().getForcedFkForcedFkKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "forcedFk", true, "forced-fk");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:853:3: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:854:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:854:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:855:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute1711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleEAttribute1728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:875:1: ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==32) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:875:2: ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:875:2: ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:875:3: ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:875:3: ( (lv_columnName_4_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:876:1: (lv_columnName_4_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:876:1: (lv_columnName_4_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:877:3: lv_columnName_4_0= RULE_ID
                    {
                    lv_columnName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute1747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_columnName_4_0, grammarAccess.getEAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"columnName",
                              		lv_columnName_4_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:893:2: (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==31) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:893:4: otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}'
                            {
                            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleEAttribute1765); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getEAttributeAccess().getGeneratedbyKeyword_3_0_1_0());
                                  
                            }
                            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleEAttribute1777); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_3_0_1_1());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:901:1: ( (lv_valueGenerators_7_0= ruleEValueGenerator ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:902:1: (lv_valueGenerators_7_0= ruleEValueGenerator )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:902:1: (lv_valueGenerators_7_0= ruleEValueGenerator )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:903:3: lv_valueGenerators_7_0= ruleEValueGenerator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEValueGenerator_in_ruleEAttribute1798);
                            lv_valueGenerators_7_0=ruleEValueGenerator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"valueGenerators",
                                      		lv_valueGenerators_7_0, 
                                      		"EValueGenerator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:919:2: (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==13) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:919:4: otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) )
                            	    {
                            	    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleEAttribute1811); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getCommaKeyword_3_0_1_3_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:923:1: ( (lv_valueGenerators_9_0= ruleEValueGenerator ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:924:1: (lv_valueGenerators_9_0= ruleEValueGenerator )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:924:1: (lv_valueGenerators_9_0= ruleEValueGenerator )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:925:3: lv_valueGenerators_9_0= ruleEValueGenerator
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEValueGenerator_in_ruleEAttribute1832);
                            	    lv_valueGenerators_9_0=ruleEValueGenerator();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getEAttributeRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"valueGenerators",
                            	              		lv_valueGenerators_9_0, 
                            	              		"EValueGenerator");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleEAttribute1846); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_3_0_1_4());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:946:6: ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:946:6: ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:946:7: ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:946:7: ( (lv_resolved_11_0= 'resolve' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:947:1: (lv_resolved_11_0= 'resolve' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:947:1: (lv_resolved_11_0= 'resolve' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:948:3: lv_resolved_11_0= 'resolve'
                    {
                    lv_resolved_11_0=(Token)match(input,32,FOLLOW_32_in_ruleEAttribute1874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_resolved_11_0, grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                             		setWithLastConsumed(current, "resolved", true, "resolve");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:961:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:962:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:962:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:963:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEAttribute1910);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,33,FOLLOW_33_in_ruleEAttribute1922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:980:1: ( (lv_parameters_14_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:981:1: (lv_parameters_14_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:981:1: (lv_parameters_14_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:982:3: lv_parameters_14_0= RULE_ID
                    {
                    lv_parameters_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute1939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_parameters_14_0, grammarAccess.getEAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"parameters",
                              		lv_parameters_14_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,34,FOLLOW_34_in_ruleEAttribute1956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1002:1: ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1002:2: ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )?
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1002:2: ( ( ruleQualifiedName ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1003:1: ( ruleQualifiedName )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1003:1: ( ruleQualifiedName )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1004:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getEAttributeRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getOppositeEAttributeCrossReference_3_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEAttribute1980);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_17=(Token)match(input,35,FOLLOW_35_in_ruleEAttribute1992); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getOnKeyword_3_1_5_1());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1021:1: ( (lv_relationTable_18_0= RULE_ID ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1022:1: (lv_relationTable_18_0= RULE_ID )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1022:1: (lv_relationTable_18_0= RULE_ID )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1023:3: lv_relationTable_18_0= RULE_ID
                            {
                            lv_relationTable_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute2009); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_relationTable_18_0, grammarAccess.getEAttributeAccess().getRelationTableIDTerminalRuleCall_3_1_5_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEAttributeRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"relationTable",
                                      		lv_relationTable_18_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1039:2: (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==19) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1039:4: otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) )
                                    {
                                    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleEAttribute2027); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getFullStopKeyword_3_1_5_3_0());
                                          
                                    }
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1043:1: ( (lv_relationColumn_20_0= RULE_ID ) )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1044:1: (lv_relationColumn_20_0= RULE_ID )
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1044:1: (lv_relationColumn_20_0= RULE_ID )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1045:3: lv_relationColumn_20_0= RULE_ID
                                    {
                                    lv_relationColumn_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute2044); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_relationColumn_20_0, grammarAccess.getEAttributeAccess().getRelationColumnIDTerminalRuleCall_3_1_5_3_1_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"relationColumn",
                                              		lv_relationColumn_20_0, 
                                              		"ID");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1069:1: entryRuleEValueGenerator returns [EObject current=null] : iv_ruleEValueGenerator= ruleEValueGenerator EOF ;
    public final EObject entryRuleEValueGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueGenerator = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1070:2: (iv_ruleEValueGenerator= ruleEValueGenerator EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1071:2: iv_ruleEValueGenerator= ruleEValueGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEValueGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator2091);
            iv_ruleEValueGenerator=ruleEValueGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEValueGenerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEValueGenerator2101); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1078:1: ruleEValueGenerator returns [EObject current=null] : ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1081:28: ( ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1082:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1082:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1082:2: ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1082:2: ( (lv_dbType_0_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1083:1: (lv_dbType_0_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1083:1: (lv_dbType_0_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1084:3: lv_dbType_0_0= RULE_STRING
            {
            lv_dbType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator2143); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1100:2: ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt27=1;
                }
                break;
            case 37:
                {
                alt27=2;
                }
                break;
            case 38:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1100:3: ( (lv_autokey_1_0= 'autokey' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1100:3: ( (lv_autokey_1_0= 'autokey' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1101:1: (lv_autokey_1_0= 'autokey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1101:1: (lv_autokey_1_0= 'autokey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1102:3: lv_autokey_1_0= 'autokey'
                    {
                    lv_autokey_1_0=(Token)match(input,36,FOLLOW_36_in_ruleEValueGenerator2167); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1116:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1116:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1116:8: otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleEValueGenerator2199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEValueGeneratorAccess().getQueryKeyword_1_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1120:1: ( (lv_query_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1121:1: (lv_query_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1121:1: (lv_query_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1122:3: lv_query_3_0= RULE_STRING
                    {
                    lv_query_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator2216); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1139:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1139:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1139:8: otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleEValueGenerator2241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEValueGeneratorAccess().getSeqnextKeyword_1_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1143:1: ( (lv_sequence_5_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1144:1: (lv_sequence_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1144:1: (lv_sequence_5_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1145:3: lv_sequence_5_0= RULE_STRING
                    {
                    lv_sequence_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator2258); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1169:1: entryRuleENamedQuery returns [EObject current=null] : iv_ruleENamedQuery= ruleENamedQuery EOF ;
    public final EObject entryRuleENamedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1170:2: (iv_ruleENamedQuery= ruleENamedQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1171:2: iv_ruleENamedQuery= ruleENamedQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery2301);
            iv_ruleENamedQuery=ruleENamedQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedQuery2311); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1178:1: ruleENamedQuery returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1181:28: ( ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1182:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1182:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1182:2: ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1182:2: ( (lv_returnType_0_0= ruleReturnType ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=57 && LA28_0<=58)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1183:1: (lv_returnType_0_0= ruleReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1183:1: (lv_returnType_0_0= ruleReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1184:3: lv_returnType_0_0= ruleReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getReturnTypeReturnTypeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnType_in_ruleENamedQuery2357);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1200:3: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1201:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1201:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1202:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleENamedQuery2375); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1218:2: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1218:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleENamedQuery2393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1222:1: ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID||LA30_0==28||(LA30_0>=39 && LA30_0<=43)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1222:2: ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1222:2: ( (lv_parameters_3_0= ruleEParameter ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1223:1: (lv_parameters_3_0= ruleEParameter )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1223:1: (lv_parameters_3_0= ruleEParameter )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1224:3: lv_parameters_3_0= ruleEParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEParameter_in_ruleENamedQuery2415);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1240:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==13) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1240:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleENamedQuery2428); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getENamedQueryAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1244:1: ( (lv_parameters_5_0= ruleEParameter ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1245:1: (lv_parameters_5_0= ruleEParameter )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1245:1: (lv_parameters_5_0= ruleEParameter )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1246:3: lv_parameters_5_0= ruleEParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEParameter_in_ruleENamedQuery2449);
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
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleENamedQuery2465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleENamedQuery2479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1270:1: ( (lv_queries_8_0= ruleEQuery ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1271:1: (lv_queries_8_0= ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1271:1: (lv_queries_8_0= ruleEQuery )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1272:3: lv_queries_8_0= ruleEQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEQuery_in_ruleENamedQuery2500);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1288:2: (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==13) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1288:4: otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) )
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleENamedQuery2513); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getENamedQueryAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1292:1: ( (lv_queries_10_0= ruleEQuery ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1293:1: (lv_queries_10_0= ruleEQuery )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1293:1: (lv_queries_10_0= ruleEQuery )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1294:3: lv_queries_10_0= ruleEQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQuery_in_ruleENamedQuery2534);
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
            	    break loop32;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleENamedQuery2548); if (state.failed) return current;
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


    // $ANTLR start "entryRuleEPrimtiveType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1322:1: entryRuleEPrimtiveType returns [String current=null] : iv_ruleEPrimtiveType= ruleEPrimtiveType EOF ;
    public final String entryRuleEPrimtiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEPrimtiveType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1323:2: (iv_ruleEPrimtiveType= ruleEPrimtiveType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1324:2: iv_ruleEPrimtiveType= ruleEPrimtiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPrimtiveTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEPrimtiveType_in_entryRuleEPrimtiveType2585);
            iv_ruleEPrimtiveType=ruleEPrimtiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPrimtiveType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPrimtiveType2596); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEPrimtiveType"


    // $ANTLR start "ruleEPrimtiveType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1331:1: ruleEPrimtiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleEPrimtiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_5 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1334:28: ( (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1335:1: (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1335:1: (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt33=1;
                }
                break;
            case 40:
                {
                alt33=2;
                }
                break;
            case 41:
                {
                alt33=3;
                }
                break;
            case 42:
                {
                alt33=4;
                }
                break;
            case 43:
                {
                alt33=5;
                }
                break;
            case RULE_ID:
                {
                alt33=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1336:2: kw= 'int'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleEPrimtiveType2634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getIntKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1343:2: kw= 'long'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleEPrimtiveType2653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getLongKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1350:2: kw= 'double'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleEPrimtiveType2672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getDoubleKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1357:2: kw= 'float'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleEPrimtiveType2691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getFloatKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1364:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleEPrimtiveType2710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getBooleanKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1371:5: this_FQN_5= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEPrimtiveTypeAccess().getFQNParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEPrimtiveType2738);
                    this_FQN_5=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FQN_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleEPrimtiveType"


    // $ANTLR start "entryRuleEMapType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1389:1: entryRuleEMapType returns [String current=null] : iv_ruleEMapType= ruleEMapType EOF ;
    public final String entryRuleEMapType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMapType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1390:2: (iv_ruleEMapType= ruleEMapType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1391:2: iv_ruleEMapType= ruleEMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMapTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEMapType_in_entryRuleEMapType2784);
            iv_ruleEMapType=ruleEMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMapType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMapType2795); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEMapType"


    // $ANTLR start "ruleEMapType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1398:1: ruleEMapType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'map' ;
    public final AntlrDatatypeRuleToken ruleEMapType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1401:28: (kw= 'map' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1403:2: kw= 'map'
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleEMapType2832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEMapTypeAccess().getMapKeyword()); 
                  
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
    // $ANTLR end "ruleEMapType"


    // $ANTLR start "entryRuleENamedCustomQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1416:1: entryRuleENamedCustomQuery returns [EObject current=null] : iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF ;
    public final EObject entryRuleENamedCustomQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedCustomQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1417:2: (iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1418:2: iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedCustomQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedCustomQuery_in_entryRuleENamedCustomQuery2871);
            iv_ruleENamedCustomQuery=ruleENamedCustomQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedCustomQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedCustomQuery2881); if (state.failed) return current;

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
    // $ANTLR end "entryRuleENamedCustomQuery"


    // $ANTLR start "ruleENamedCustomQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1425:1: ruleENamedCustomQuery returns [EObject current=null] : ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) otherlv_12= '}' ) ;
    public final EObject ruleENamedCustomQuery() throws RecognitionException {
        EObject current = null;

        Token lv_list_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_returnType_0_0 = null;

        EObject lv_returnType_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_queries_11_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1428:28: ( ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) otherlv_12= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1429:1: ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) otherlv_12= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1429:1: ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) otherlv_12= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1429:2: ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) otherlv_12= '}'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1429:2: ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||(LA34_0>=39 && LA34_0<=44)||LA34_0==47||LA34_0==54) ) {
                alt34=1;
            }
            else if ( (LA34_0==45) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1429:3: ( (lv_returnType_0_0= ruleEReturnType ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1429:3: ( (lv_returnType_0_0= ruleEReturnType ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1430:1: (lv_returnType_0_0= ruleEReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1430:1: (lv_returnType_0_0= ruleEReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1431:3: lv_returnType_0_0= ruleEReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getReturnTypeEReturnTypeParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery2928);
                    lv_returnType_0_0=ruleEReturnType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getENamedCustomQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"returnType",
                              		lv_returnType_0_0, 
                              		"EReturnType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1448:6: ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1448:6: ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1448:7: ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1448:7: ( (lv_list_1_0= '[' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1449:1: (lv_list_1_0= '[' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1449:1: (lv_list_1_0= '[' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1450:3: lv_list_1_0= '['
                    {
                    lv_list_1_0=(Token)match(input,45,FOLLOW_45_in_ruleENamedCustomQuery2953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_list_1_0, grammarAccess.getENamedCustomQueryAccess().getListLeftSquareBracketKeyword_0_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getENamedCustomQueryRule());
                      	        }
                             		setWithLastConsumed(current, "list", true, "[");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1463:2: ( (lv_returnType_2_0= ruleEReturnType ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1464:1: (lv_returnType_2_0= ruleEReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1464:1: (lv_returnType_2_0= ruleEReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1465:3: lv_returnType_2_0= ruleEReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getReturnTypeEReturnTypeParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery2987);
                    lv_returnType_2_0=ruleEReturnType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getENamedCustomQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"returnType",
                              		lv_returnType_2_0, 
                              		"EReturnType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleENamedCustomQuery2999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getENamedCustomQueryAccess().getRightSquareBracketKeyword_0_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1485:3: ( (lv_name_4_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1486:1: (lv_name_4_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1486:1: (lv_name_4_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1487:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleENamedCustomQuery3018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getENamedCustomQueryAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getENamedCustomQueryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1503:2: (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1503:4: otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleENamedCustomQuery3036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getENamedCustomQueryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1507:1: ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ID||LA36_0==28||(LA36_0>=39 && LA36_0<=43)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1507:2: ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1507:2: ( (lv_parameters_6_0= ruleEParameter ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1508:1: (lv_parameters_6_0= ruleEParameter )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1508:1: (lv_parameters_6_0= ruleEParameter )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1509:3: lv_parameters_6_0= ruleEParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getParametersEParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEParameter_in_ruleENamedCustomQuery3058);
                            lv_parameters_6_0=ruleEParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getENamedCustomQueryRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_6_0, 
                                      		"EParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1525:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==13) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1525:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) )
                            	    {
                            	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleENamedCustomQuery3071); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_7, grammarAccess.getENamedCustomQueryAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1529:1: ( (lv_parameters_8_0= ruleEParameter ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1530:1: (lv_parameters_8_0= ruleEParameter )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1530:1: (lv_parameters_8_0= ruleEParameter )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1531:3: lv_parameters_8_0= ruleEParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getParametersEParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEParameter_in_ruleENamedCustomQuery3092);
                            	    lv_parameters_8_0=ruleEParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getENamedCustomQueryRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_8_0, 
                            	              		"EParameter");
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


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleENamedCustomQuery3108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getENamedCustomQueryAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleENamedCustomQuery3122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getENamedCustomQueryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1555:1: ( (lv_queries_11_0= ruleECustomQuery ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1556:1: (lv_queries_11_0= ruleECustomQuery )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1556:1: (lv_queries_11_0= ruleECustomQuery )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1557:3: lv_queries_11_0= ruleECustomQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getQueriesECustomQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleECustomQuery_in_ruleENamedCustomQuery3143);
            lv_queries_11_0=ruleECustomQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getENamedCustomQueryRule());
              	        }
                     		add(
                     			current, 
                     			"queries",
                      		lv_queries_11_0, 
                      		"ECustomQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleENamedCustomQuery3155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getENamedCustomQueryAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleENamedCustomQuery"


    // $ANTLR start "entryRuleEReturnType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1585:1: entryRuleEReturnType returns [EObject current=null] : iv_ruleEReturnType= ruleEReturnType EOF ;
    public final EObject entryRuleEReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReturnType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1586:2: (iv_ruleEReturnType= ruleEReturnType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1587:2: iv_ruleEReturnType= ruleEReturnType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEReturnTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEReturnType_in_entryRuleEReturnType3191);
            iv_ruleEReturnType=ruleEReturnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEReturnType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEReturnType3201); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEReturnType"


    // $ANTLR start "ruleEReturnType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1594:1: ruleEReturnType returns [EObject current=null] : (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef ) ;
    public final EObject ruleEReturnType() throws RecognitionException {
        EObject current = null;

        EObject this_EPredefinedType_0 = null;

        EObject this_ETypeDef_1 = null;

        EObject this_EModelTypeDef_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1597:28: ( (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1598:1: (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1598:1: (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt38=1;
                }
                break;
            case 47:
                {
                alt38=2;
                }
                break;
            case 54:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1599:5: this_EPredefinedType_0= ruleEPredefinedType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getEPredefinedTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEPredefinedType_in_ruleEReturnType3248);
                    this_EPredefinedType_0=ruleEPredefinedType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EPredefinedType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1609:5: this_ETypeDef_1= ruleETypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getETypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleETypeDef_in_ruleEReturnType3275);
                    this_ETypeDef_1=ruleETypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ETypeDef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1619:5: this_EModelTypeDef_2= ruleEModelTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getEModelTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEModelTypeDef_in_ruleEReturnType3302);
                    this_EModelTypeDef_2=ruleEModelTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EModelTypeDef_2; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleEReturnType"


    // $ANTLR start "entryRuleEPredefinedType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1635:1: entryRuleEPredefinedType returns [EObject current=null] : iv_ruleEPredefinedType= ruleEPredefinedType EOF ;
    public final EObject entryRuleEPredefinedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPredefinedType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1636:2: (iv_ruleEPredefinedType= ruleEPredefinedType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1637:2: iv_ruleEPredefinedType= ruleEPredefinedType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPredefinedTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEPredefinedType_in_entryRuleEPredefinedType3337);
            iv_ruleEPredefinedType=ruleEPredefinedType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPredefinedType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPredefinedType3347); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEPredefinedType"


    // $ANTLR start "ruleEPredefinedType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1644:1: ruleEPredefinedType returns [EObject current=null] : ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) ) ;
    public final EObject ruleEPredefinedType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ref_0_1 = null;

        AntlrDatatypeRuleToken lv_ref_0_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1647:28: ( ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1648:1: ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1648:1: ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1649:1: ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1649:1: ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1650:1: (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1650:1: (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID||(LA39_0>=39 && LA39_0<=43)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1651:3: lv_ref_0_1= ruleEMapType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEPredefinedTypeAccess().getRefEMapTypeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEMapType_in_ruleEPredefinedType3394);
                    lv_ref_0_1=ruleEMapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEPredefinedTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"ref",
                              		lv_ref_0_1, 
                              		"EMapType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1666:8: lv_ref_0_2= ruleEPrimtiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEPredefinedTypeAccess().getRefEPrimtiveTypeParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEPredefinedType3413);
                    lv_ref_0_2=ruleEPrimtiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEPredefinedTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"ref",
                              		lv_ref_0_2, 
                              		"EPrimtiveType");
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
    // $ANTLR end "ruleEPredefinedType"


    // $ANTLR start "entryRuleETypeDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1692:1: entryRuleETypeDef returns [EObject current=null] : iv_ruleETypeDef= ruleETypeDef EOF ;
    public final EObject entryRuleETypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1693:2: (iv_ruleETypeDef= ruleETypeDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1694:2: iv_ruleETypeDef= ruleETypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleETypeDef_in_entryRuleETypeDef3451);
            iv_ruleETypeDef=ruleETypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleETypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleETypeDef3461); if (state.failed) return current;

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
    // $ANTLR end "entryRuleETypeDef"


    // $ANTLR start "ruleETypeDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1701:1: ruleETypeDef returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleETypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_types_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1704:28: ( (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1705:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1705:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1705:3: otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleETypeDef3498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getETypeDefAccess().getTypedefKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1709:1: ( (lv_name_1_0= ruleFQN ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1710:1: (lv_name_1_0= ruleFQN )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1710:1: (lv_name_1_0= ruleFQN )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1711:3: lv_name_1_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getETypeDefAccess().getNameFQNParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleETypeDef3519);
            lv_name_1_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getETypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleETypeDef3531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getETypeDefAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1731:1: ( (lv_types_3_0= ruleEValueTypeAttribute ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1732:1: (lv_types_3_0= ruleEValueTypeAttribute )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1732:1: (lv_types_3_0= ruleEValueTypeAttribute )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1733:3: lv_types_3_0= ruleEValueTypeAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getETypeDefAccess().getTypesEValueTypeAttributeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef3552);
            lv_types_3_0=ruleEValueTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getETypeDefRule());
              	        }
                     		add(
                     			current, 
                     			"types",
                      		lv_types_3_0, 
                      		"EValueTypeAttribute");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1749:2: (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==13) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1749:4: otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleETypeDef3565); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getETypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1753:1: ( (lv_types_5_0= ruleEValueTypeAttribute ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1754:1: (lv_types_5_0= ruleEValueTypeAttribute )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1754:1: (lv_types_5_0= ruleEValueTypeAttribute )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1755:3: lv_types_5_0= ruleEValueTypeAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getETypeDefAccess().getTypesEValueTypeAttributeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef3586);
            	    lv_types_5_0=ruleEValueTypeAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getETypeDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_5_0, 
            	              		"EValueTypeAttribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleETypeDef3600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getETypeDefAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleETypeDef"


    // $ANTLR start "entryRuleEModelTypeDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1783:1: entryRuleEModelTypeDef returns [EObject current=null] : iv_ruleEModelTypeDef= ruleEModelTypeDef EOF ;
    public final EObject entryRuleEModelTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelTypeDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1784:2: (iv_ruleEModelTypeDef= ruleEModelTypeDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1785:2: iv_ruleEModelTypeDef= ruleEModelTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEModelTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleEModelTypeDef_in_entryRuleEModelTypeDef3636);
            iv_ruleEModelTypeDef=ruleEModelTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEModelTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEModelTypeDef3646); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEModelTypeDef"


    // $ANTLR start "ruleEModelTypeDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1792:1: ruleEModelTypeDef returns [EObject current=null] : ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleEModelTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_eclassDef_0_0 = null;

        EObject lv_attributes_2_0 = null;

        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1795:28: ( ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1796:1: ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1796:1: ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1796:2: ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1796:2: ( (lv_eclassDef_0_0= ruleEType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1797:1: (lv_eclassDef_0_0= ruleEType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1797:1: (lv_eclassDef_0_0= ruleEType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1798:3: lv_eclassDef_0_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getEclassDefETypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEType_in_ruleEModelTypeDef3692);
            lv_eclassDef_0_0=ruleEType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEModelTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"eclassDef",
                      		lv_eclassDef_0_0, 
                      		"EType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleEModelTypeDef3704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEModelTypeDefAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1818:1: ( (lv_attributes_2_0= ruleEModelTypeAttribute ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1819:1: (lv_attributes_2_0= ruleEModelTypeAttribute )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1819:1: (lv_attributes_2_0= ruleEModelTypeAttribute )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1820:3: lv_attributes_2_0= ruleEModelTypeAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getAttributesEModelTypeAttributeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef3725);
            lv_attributes_2_0=ruleEModelTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEModelTypeDefRule());
              	        }
                     		add(
                     			current, 
                     			"attributes",
                      		lv_attributes_2_0, 
                      		"EModelTypeAttribute");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1836:2: (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==13) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1836:4: otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEModelTypeDef3738); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEModelTypeDefAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1840:1: ( (lv_attributes_4_0= ruleEModelTypeAttribute ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1841:1: (lv_attributes_4_0= ruleEModelTypeAttribute )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1841:1: (lv_attributes_4_0= ruleEModelTypeAttribute )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1842:3: lv_attributes_4_0= ruleEModelTypeAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getAttributesEModelTypeAttributeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef3759);
            	    lv_attributes_4_0=ruleEModelTypeAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEModelTypeDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_4_0, 
            	              		"EModelTypeAttribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleEModelTypeDef3773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEModelTypeDefAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleEModelTypeDef"


    // $ANTLR start "entryRuleEModelTypeAttribute"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1870:1: entryRuleEModelTypeAttribute returns [EObject current=null] : iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF ;
    public final EObject entryRuleEModelTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelTypeAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1871:2: (iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1872:2: iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEModelTypeAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEModelTypeAttribute_in_entryRuleEModelTypeAttribute3809);
            iv_ruleEModelTypeAttribute=ruleEModelTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEModelTypeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEModelTypeAttribute3819); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEModelTypeAttribute"


    // $ANTLR start "ruleEModelTypeAttribute"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1879:1: ruleEModelTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? ) ;
    public final EObject ruleEModelTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_parameters_4_0=null;
        Token otherlv_5=null;
        Token lv_parameters_6_0=null;
        Token otherlv_7=null;
        Token lv_cached_8_0=null;
        Token lv_cacheName_9_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1882:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1883:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1883:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1883:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1883:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1884:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1884:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1885:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute3861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEModelTypeAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEModelTypeAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1901:2: (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==32) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1901:4: otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )?
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleEModelTypeAttribute3879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEModelTypeAttributeAccess().getResolveKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1905:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1906:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1906:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1907:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEModelTypeAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEModelTypeAttributeAccess().getQueryENamedCustomQueryCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEModelTypeAttribute3902);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1920:2: (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==33) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1920:4: otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')'
                            {
                            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleEModelTypeAttribute3915); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getEModelTypeAttributeAccess().getLeftParenthesisKeyword_1_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1924:1: ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==RULE_ID) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1924:2: ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1924:2: ( (lv_parameters_4_0= RULE_ID ) )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1925:1: (lv_parameters_4_0= RULE_ID )
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1925:1: (lv_parameters_4_0= RULE_ID )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1926:3: lv_parameters_4_0= RULE_ID
                                    {
                                    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute3933); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_parameters_4_0, grammarAccess.getEModelTypeAttributeAccess().getParametersIDTerminalRuleCall_1_2_1_0_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getEModelTypeAttributeRule());
                                      	        }
                                             		addWithLastConsumed(
                                             			current, 
                                             			"parameters",
                                              		lv_parameters_4_0, 
                                              		"ID");
                                      	    
                                    }

                                    }


                                    }

                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1942:2: (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
                                    loop42:
                                    do {
                                        int alt42=2;
                                        int LA42_0 = input.LA(1);

                                        if ( (LA42_0==13) ) {
                                            alt42=1;
                                        }


                                        switch (alt42) {
                                    	case 1 :
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1942:4: otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) )
                                    	    {
                                    	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEModelTypeAttribute3951); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_5, grammarAccess.getEModelTypeAttributeAccess().getCommaKeyword_1_2_1_1_0());
                                    	          
                                    	    }
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1946:1: ( (lv_parameters_6_0= RULE_ID ) )
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1947:1: (lv_parameters_6_0= RULE_ID )
                                    	    {
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1947:1: (lv_parameters_6_0= RULE_ID )
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1948:3: lv_parameters_6_0= RULE_ID
                                    	    {
                                    	    lv_parameters_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute3968); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      			newLeafNode(lv_parameters_6_0, grammarAccess.getEModelTypeAttributeAccess().getParametersIDTerminalRuleCall_1_2_1_1_1_0()); 
                                    	      		
                                    	    }
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElement(grammarAccess.getEModelTypeAttributeRule());
                                    	      	        }
                                    	             		addWithLastConsumed(
                                    	             			current, 
                                    	             			"parameters",
                                    	              		lv_parameters_6_0, 
                                    	              		"ID");
                                    	      	    
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop42;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleEModelTypeAttribute3989); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getEModelTypeAttributeAccess().getRightParenthesisKeyword_1_2_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1968:3: ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==48) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1968:4: ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )?
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1968:4: ( (lv_cached_8_0= 'cached' ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1969:1: (lv_cached_8_0= 'cached' )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1969:1: (lv_cached_8_0= 'cached' )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1970:3: lv_cached_8_0= 'cached'
                            {
                            lv_cached_8_0=(Token)match(input,48,FOLLOW_48_in_ruleEModelTypeAttribute4010); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_cached_8_0, grammarAccess.getEModelTypeAttributeAccess().getCachedCachedKeyword_1_3_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEModelTypeAttributeRule());
                              	        }
                                     		setWithLastConsumed(current, "cached", true, "cached");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1983:2: ( (lv_cacheName_9_0= RULE_ID ) )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==RULE_ID) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1984:1: (lv_cacheName_9_0= RULE_ID )
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1984:1: (lv_cacheName_9_0= RULE_ID )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1985:3: lv_cacheName_9_0= RULE_ID
                                    {
                                    lv_cacheName_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute4040); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_cacheName_9_0, grammarAccess.getEModelTypeAttributeAccess().getCacheNameIDTerminalRuleCall_1_3_1_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getEModelTypeAttributeRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"cacheName",
                                              		lv_cacheName_9_0, 
                                              		"ID");
                                      	    
                                    }

                                    }


                                    }
                                    break;

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
    // $ANTLR end "ruleEModelTypeAttribute"


    // $ANTLR start "entryRuleEValueTypeAttribute"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2009:1: entryRuleEValueTypeAttribute returns [EObject current=null] : iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF ;
    public final EObject entryRuleEValueTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueTypeAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2010:2: (iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2011:2: iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEValueTypeAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEValueTypeAttribute_in_entryRuleEValueTypeAttribute4086);
            iv_ruleEValueTypeAttribute=ruleEValueTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEValueTypeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEValueTypeAttribute4096); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEValueTypeAttribute"


    // $ANTLR start "ruleEValueTypeAttribute"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2018:1: ruleEValueTypeAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEValueTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2021:28: ( ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2022:1: ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2022:1: ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2022:2: ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2022:2: ( (lv_type_0_0= ruleEPrimtiveType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2023:1: (lv_type_0_0= ruleEPrimtiveType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2023:1: (lv_type_0_0= ruleEPrimtiveType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2024:3: lv_type_0_0= ruleEPrimtiveType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEValueTypeAttributeAccess().getTypeEPrimtiveTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEValueTypeAttribute4142);
            lv_type_0_0=ruleEPrimtiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEValueTypeAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"EPrimtiveType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2040:2: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2041:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2041:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2042:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEValueTypeAttribute4159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEValueTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEValueTypeAttributeRule());
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
    // $ANTLR end "ruleEValueTypeAttribute"


    // $ANTLR start "entryRuleEParameter"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2066:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2067:2: (iv_ruleEParameter= ruleEParameter EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2068:2: iv_ruleEParameter= ruleEParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEParameterRule()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_entryRuleEParameter4200);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEParameter4210); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2075:1: ruleEParameter returns [EObject current=null] : ( ( (lv_id_0_0= 'primarykey' ) )? ( (lv_type_1_0= ruleEPrimtiveType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2078:28: ( ( ( (lv_id_0_0= 'primarykey' ) )? ( (lv_type_1_0= ruleEPrimtiveType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2079:1: ( ( (lv_id_0_0= 'primarykey' ) )? ( (lv_type_1_0= ruleEPrimtiveType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2079:1: ( ( (lv_id_0_0= 'primarykey' ) )? ( (lv_type_1_0= ruleEPrimtiveType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2079:2: ( (lv_id_0_0= 'primarykey' ) )? ( (lv_type_1_0= ruleEPrimtiveType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2079:2: ( (lv_id_0_0= 'primarykey' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==28) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2080:1: (lv_id_0_0= 'primarykey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2080:1: (lv_id_0_0= 'primarykey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2081:3: lv_id_0_0= 'primarykey'
                    {
                    lv_id_0_0=(Token)match(input,28,FOLLOW_28_in_ruleEParameter4253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_id_0_0, grammarAccess.getEParameterAccess().getIdPrimarykeyKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEParameterRule());
                      	        }
                             		setWithLastConsumed(current, "id", true, "primarykey");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2094:3: ( (lv_type_1_0= ruleEPrimtiveType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2095:1: (lv_type_1_0= ruleEPrimtiveType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2095:1: (lv_type_1_0= ruleEPrimtiveType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2096:3: lv_type_1_0= ruleEPrimtiveType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEParameterAccess().getTypeEPrimtiveTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEParameter4288);
            lv_type_1_0=ruleEPrimtiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"EPrimtiveType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2112:2: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2113:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2113:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2114:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEParameter4305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2138:1: entryRuleEQuery returns [EObject current=null] : iv_ruleEQuery= ruleEQuery EOF ;
    public final EObject entryRuleEQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2139:2: (iv_ruleEQuery= ruleEQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2140:2: iv_ruleEQuery= ruleEQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQueryRule()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_entryRuleEQuery4346);
            iv_ruleEQuery=ruleEQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQuery4356); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2147:1: ruleEQuery returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2150:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2151:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2151:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2151:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2151:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2152:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2152:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2153:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2153:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==49) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_STRING) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2154:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,49,FOLLOW_49_in_ruleEQuery4401); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2166:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery4429); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2184:2: ( (lv_mapping_1_0= ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2185:1: (lv_mapping_1_0= ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2185:1: (lv_mapping_1_0= ruleEObjectSection )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2186:3: lv_mapping_1_0= ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_ruleEQuery4458);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2202:2: ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_STRING) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2202:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2202:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2202:5: otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleEQuery4472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2206:1: ( (lv_from_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2207:1: (lv_from_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2207:1: (lv_from_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2208:3: lv_from_3_0= RULE_STRING
                    {
                    lv_from_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery4489); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2224:2: (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==51) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2224:4: otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleEQuery4507); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2228:1: ( (lv_where_5_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2229:1: (lv_where_5_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2229:1: (lv_where_5_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2230:3: lv_where_5_0= RULE_STRING
                            {
                            lv_where_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery4524); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2246:4: (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==52) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2246:6: otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleEQuery4544); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2250:1: ( (lv_groupBy_7_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2251:1: (lv_groupBy_7_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2251:1: (lv_groupBy_7_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2252:3: lv_groupBy_7_0= RULE_STRING
                            {
                            lv_groupBy_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery4561); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2268:4: (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==53) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2268:6: otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleEQuery4581); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2272:1: ( (lv_orderby_9_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2273:1: (lv_orderby_9_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2273:1: (lv_orderby_9_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2274:3: lv_orderby_9_0= RULE_STRING
                            {
                            lv_orderby_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery4598); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2291:6: ( (lv_all_10_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2291:6: ( (lv_all_10_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2292:1: (lv_all_10_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2292:1: (lv_all_10_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2293:3: lv_all_10_0= RULE_STRING
                    {
                    lv_all_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery4629); if (state.failed) return current;
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


    // $ANTLR start "entryRuleECustomQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2317:1: entryRuleECustomQuery returns [EObject current=null] : iv_ruleECustomQuery= ruleECustomQuery EOF ;
    public final EObject entryRuleECustomQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECustomQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2318:2: (iv_ruleECustomQuery= ruleECustomQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2319:2: iv_ruleECustomQuery= ruleECustomQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECustomQueryRule()); 
            }
            pushFollow(FOLLOW_ruleECustomQuery_in_entryRuleECustomQuery4671);
            iv_ruleECustomQuery=ruleECustomQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECustomQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECustomQuery4681); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECustomQuery"


    // $ANTLR start "ruleECustomQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2326:1: ruleECustomQuery returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleECustomQuery() throws RecognitionException {
        EObject current = null;

        Token lv_dbType_0_1=null;
        Token lv_dbType_0_2=null;
        Token lv_columns_1_0=null;
        Token otherlv_2=null;
        Token lv_from_3_0=null;
        Token otherlv_4=null;
        Token lv_where_5_0=null;
        Token otherlv_6=null;
        Token lv_groupBy_7_0=null;
        Token otherlv_8=null;
        Token lv_orderby_9_0=null;
        Token lv_all_10_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2329:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2330:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2330:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2330:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2330:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2331:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2331:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2332:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2332:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_STRING) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2333:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,49,FOLLOW_49_in_ruleECustomQuery4726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_dbType_0_1, grammarAccess.getECustomQueryAccess().getDbTypeDefaultKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getECustomQueryRule());
                      	        }
                             		setWithLastConsumed(current, "dbType", lv_dbType_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2345:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery4754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_dbType_0_2, grammarAccess.getECustomQueryAccess().getDbTypeSTRINGTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getECustomQueryRule());
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2363:2: ( (lv_columns_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2364:1: (lv_columns_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2364:1: (lv_columns_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2365:3: lv_columns_1_0= RULE_STRING
            {
            lv_columns_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery4779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_columns_1_0, grammarAccess.getECustomQueryAccess().getColumnsSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECustomQueryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"columns",
                      		lv_columns_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2381:2: ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==50) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_STRING) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2381:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2381:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2381:5: otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleECustomQuery4798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getECustomQueryAccess().getFROMKeyword_2_0_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2385:1: ( (lv_from_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2386:1: (lv_from_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2386:1: (lv_from_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2387:3: lv_from_3_0= RULE_STRING
                    {
                    lv_from_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery4815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_from_3_0, grammarAccess.getECustomQueryAccess().getFromSTRINGTerminalRuleCall_2_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getECustomQueryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"from",
                              		lv_from_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2403:2: (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==51) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2403:4: otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleECustomQuery4833); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getECustomQueryAccess().getWHEREKeyword_2_0_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2407:1: ( (lv_where_5_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2408:1: (lv_where_5_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2408:1: (lv_where_5_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2409:3: lv_where_5_0= RULE_STRING
                            {
                            lv_where_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery4850); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_where_5_0, grammarAccess.getECustomQueryAccess().getWhereSTRINGTerminalRuleCall_2_0_2_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getECustomQueryRule());
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2425:4: (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==52) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2425:6: otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleECustomQuery4870); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getECustomQueryAccess().getGROUPBYKeyword_2_0_3_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2429:1: ( (lv_groupBy_7_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2430:1: (lv_groupBy_7_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2430:1: (lv_groupBy_7_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2431:3: lv_groupBy_7_0= RULE_STRING
                            {
                            lv_groupBy_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery4887); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_groupBy_7_0, grammarAccess.getECustomQueryAccess().getGroupBySTRINGTerminalRuleCall_2_0_3_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getECustomQueryRule());
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2447:4: (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==53) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2447:6: otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleECustomQuery4907); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getECustomQueryAccess().getORDERBYKeyword_2_0_4_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2451:1: ( (lv_orderby_9_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2452:1: (lv_orderby_9_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2452:1: (lv_orderby_9_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2453:3: lv_orderby_9_0= RULE_STRING
                            {
                            lv_orderby_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery4924); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_orderby_9_0, grammarAccess.getECustomQueryAccess().getOrderbySTRINGTerminalRuleCall_2_0_4_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getECustomQueryRule());
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2470:6: ( (lv_all_10_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2470:6: ( (lv_all_10_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2471:1: (lv_all_10_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2471:1: (lv_all_10_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2472:3: lv_all_10_0= RULE_STRING
                    {
                    lv_all_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery4955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_all_10_0, grammarAccess.getECustomQueryAccess().getAllSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getECustomQueryRule());
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
    // $ANTLR end "ruleECustomQuery"


    // $ANTLR start "entryRuleEObjectSection"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2496:1: entryRuleEObjectSection returns [EObject current=null] : iv_ruleEObjectSection= ruleEObjectSection EOF ;
    public final EObject entryRuleEObjectSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectSection = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2497:2: (iv_ruleEObjectSection= ruleEObjectSection EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2498:2: iv_ruleEObjectSection= ruleEObjectSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEObjectSectionRule()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection4997);
            iv_ruleEObjectSection=ruleEObjectSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEObjectSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEObjectSection5007); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2505:1: ruleEObjectSection returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2508:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2509:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2509:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2509:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2509:2: ( (otherlv_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2510:1: (otherlv_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2510:1: (otherlv_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2511:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEObjectSectionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection5052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
              	
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2522:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==33) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2522:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleEObjectSection5065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEObjectSectionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2526:1: ( (otherlv_2= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2527:1: (otherlv_2= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2527:1: (otherlv_2= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2528:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection5085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2539:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==13) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2539:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEObjectSection5098); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2543:1: ( (otherlv_4= RULE_ID ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2544:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2544:1: (otherlv_4= RULE_ID )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2545:3: otherlv_4= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection5118); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_4, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleEObjectSection5132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEObjectSectionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2560:3: ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2560:4: ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2560:4: ( (lv_prefix_6_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2561:1: (lv_prefix_6_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2561:1: (lv_prefix_6_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2562:3: lv_prefix_6_0= RULE_ID
                    {
                    lv_prefix_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection5152); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2578:2: (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==12) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2578:4: otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}'
                            {
                            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleEObjectSection5170); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_2_1_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2582:1: ( (lv_attributes_8_0= ruleEMappingAttribute ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2583:1: (lv_attributes_8_0= ruleEMappingAttribute )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2583:1: (lv_attributes_8_0= ruleEMappingAttribute )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2584:3: lv_attributes_8_0= ruleEMappingAttribute
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection5191);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2600:2: (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==13) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2600:4: otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            	    {
                            	    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleEObjectSection5204); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getEObjectSectionAccess().getCommaKeyword_2_1_2_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2604:1: ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2605:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2605:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2606:3: lv_attributes_10_0= ruleEMappingAttribute
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection5225);
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
                            	    break loop61;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleEObjectSection5239); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2634:1: entryRuleEMappingAttribute returns [EObject current=null] : iv_ruleEMappingAttribute= ruleEMappingAttribute EOF ;
    public final EObject entryRuleEMappingAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2635:2: (iv_ruleEMappingAttribute= ruleEMappingAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2636:2: iv_ruleEMappingAttribute= ruleEMappingAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute5279);
            iv_ruleEMappingAttribute=ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingAttribute5289); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2643:1: ruleEMappingAttribute returns [EObject current=null] : ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2646:28: ( ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2647:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2647:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2647:2: ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2647:2: ( (lv_pk_0_0= 'primarykey' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==28) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2648:1: (lv_pk_0_0= 'primarykey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2648:1: (lv_pk_0_0= 'primarykey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2649:3: lv_pk_0_0= 'primarykey'
                    {
                    lv_pk_0_0=(Token)match(input,28,FOLLOW_28_in_ruleEMappingAttribute5332); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2662:3: ( (lv_property_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2663:1: (lv_property_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2663:1: (lv_property_1_0= ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2664:3: lv_property_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute5367);
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleEMappingAttribute5379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2684:1: ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt65=1;
                }
                break;
            case 32:
                {
                alt65=2;
                }
                break;
            case 44:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2684:2: ( (lv_columnName_3_0= RULE_ID ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2684:2: ( (lv_columnName_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2685:1: (lv_columnName_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2685:1: (lv_columnName_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2686:3: lv_columnName_3_0= RULE_ID
                    {
                    lv_columnName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingAttribute5397); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2703:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2703:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2703:7: ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2703:7: ( (lv_resolved_4_0= 'resolve' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2704:1: (lv_resolved_4_0= 'resolve' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2704:1: (lv_resolved_4_0= 'resolve' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2705:3: lv_resolved_4_0= 'resolve'
                    {
                    lv_resolved_4_0=(Token)match(input,32,FOLLOW_32_in_ruleEMappingAttribute5427); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2718:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2719:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2719:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2720:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute5463);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleEMappingAttribute5475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2737:1: ( (lv_parameters_7_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2738:1: (lv_parameters_7_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2738:1: (lv_parameters_7_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2739:3: lv_parameters_7_0= RULE_ID
                    {
                    lv_parameters_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingAttribute5492); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleEMappingAttribute5509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2760:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2760:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2760:7: ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2760:7: ( (lv_mapped_9_0= 'map' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2761:1: (lv_mapped_9_0= 'map' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2761:1: (lv_mapped_9_0= 'map' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2762:3: lv_mapped_9_0= 'map'
                    {
                    lv_mapped_9_0=(Token)match(input,44,FOLLOW_44_in_ruleEMappingAttribute5535); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2775:2: ( (lv_map_10_0= ruleEObjectSection ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2776:1: (lv_map_10_0= ruleEObjectSection )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2776:1: (lv_map_10_0= ruleEObjectSection )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2777:3: lv_map_10_0= ruleEObjectSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEObjectSection_in_ruleEMappingAttribute5569);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2801:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2802:2: (iv_ruleEType= ruleEType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2803:2: iv_ruleEType= ruleEType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETypeRule()); 
            }
            pushFollow(FOLLOW_ruleEType_in_entryRuleEType5607);
            iv_ruleEType=ruleEType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEType5617); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2810:1: ruleEType returns [EObject current=null] : (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2813:28: ( (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2814:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2814:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2814:3: otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleEType5654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getEtypeKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2818:1: ( (lv_url_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2819:1: (lv_url_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2819:1: (lv_url_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2820:3: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEType5671); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleEType5688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getETypeAccess().getNumberSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2840:1: ( (lv_name_3_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2841:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2841:1: (lv_name_3_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2842:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEType5705); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2866:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2867:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2868:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5747);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5758); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2875:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2878:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2879:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2879:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2879:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2886:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==19) ) {
                    int LA66_2 = input.LA(2);

                    if ( (LA66_2==RULE_ID) && (synpred2_InternalEMap())) {
                        alt66=1;
                    }


                }


                switch (alt66) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2886:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2886:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2886:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedName5826); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5842); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2909:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2910:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2911:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard5890);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard5901); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2918:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2921:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2922:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2922:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2923:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard5948);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedNameWithWildcard5966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,56,FOLLOW_56_in_ruleQualifiedNameWithWildcard5979); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2953:1: ruleReturnType returns [Enumerator current=null] : ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) ;
    public final Enumerator ruleReturnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2955:28: ( ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2956:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2956:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==57) ) {
                alt67=1;
            }
            else if ( (LA67_0==58) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2956:2: (enumLiteral_0= 'list' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2956:2: (enumLiteral_0= 'list' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2956:4: enumLiteral_0= 'list'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleReturnType6033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2962:6: (enumLiteral_1= 'single' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2962:6: (enumLiteral_1= 'single' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2962:8: enumLiteral_1= 'single'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleReturnType6050); if (state.failed) return current;
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
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:471:3: ( '.' )
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:472:2: '.'
        {
        match(input,19,FOLLOW_19_in_synpred1_InternalEMap919); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEMap

    // $ANTLR start synpred2_InternalEMap
    public final void synpred2_InternalEMap_fragment() throws RecognitionException {   
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2886:3: ( '.' )
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2887:2: '.'
        {
        match(input,19,FOLLOW_19_in_synpred2_InternalEMap5817); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalEMap

    // Delegated rules

    public final boolean synpred2_InternalEMap() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEMap_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
        "\1\4\1\25\1\70\2\uffff\1\25";
    static final String DFA7_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\3\4\uffff\1\3\2\uffff\1\2\2\3",
            "\1\5\63\uffff\1\4",
            "",
            "",
            "\1\3\4\uffff\1\3\2\uffff\1\2\2\3"
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
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleEMappingEntityDef525 = new BitSet(new long[]{0x0000000000310800L});
    public static final BitSet FOLLOW_ruleImport_in_ruleEMappingEntityDef546 = new BitSet(new long[]{0x0000000000310800L});
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
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN900 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFQN928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN944 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_entryRuleEMappingEntity991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingEntity1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEMappingEntity1044 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEMappingEntity1070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity1087 = new BitSet(new long[]{0x0000000000C01000L});
    public static final BitSet FOLLOW_22_in_ruleEMappingEntity1113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23_in_ruleEMappingEntity1142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingEntity1181 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity1195 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleEType_in_ruleEMappingEntity1216 = new BitSet(new long[]{0x0000000003004000L});
    public static final BitSet FOLLOW_24_in_ruleEMappingEntity1229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity1241 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_ruleEAttribute_in_ruleEMappingEntity1262 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingEntity1275 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_ruleEAttribute_in_ruleEMappingEntity1296 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEMappingEntity1310 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleEMappingEntity1325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity1337 = new BitSet(new long[]{0x0640BF8000000010L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_ruleEMappingEntity1359 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity1386 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingEntity1400 = new BitSet(new long[]{0x0640BF8000000010L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_ruleEMappingEntity1422 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity1449 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEMappingEntity1464 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEMappingEntity1478 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_ruleEMappingEntity1491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity1508 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleEMappingEntity1528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_entryRuleEAttribute1588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttribute1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEAttribute1642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29_in_ruleEAttribute1680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute1711 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEAttribute1728 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute1747 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleEAttribute1765 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEAttribute1777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_ruleEAttribute1798 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEAttribute1811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_ruleEAttribute1832 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEAttribute1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEAttribute1874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEAttribute1910 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEAttribute1922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute1939 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEAttribute1956 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEAttribute1980 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleEAttribute1992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute2009 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleEAttribute2027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEValueGenerator2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator2143 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_36_in_ruleEValueGenerator2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEValueGenerator2199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEValueGenerator2241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery2301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedQuery2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleENamedQuery2357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleENamedQuery2375 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_33_in_ruleENamedQuery2393 = new BitSet(new long[]{0x00001F8410000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedQuery2415 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_13_in_ruleENamedQuery2428 = new BitSet(new long[]{0x00001F8010000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedQuery2449 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_34_in_ruleENamedQuery2465 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleENamedQuery2479 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_ruleEQuery_in_ruleENamedQuery2500 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleENamedQuery2513 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_ruleEQuery_in_ruleENamedQuery2534 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleENamedQuery2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_entryRuleEPrimtiveType2585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPrimtiveType2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEPrimtiveType2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEPrimtiveType2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleEPrimtiveType2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEPrimtiveType2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEPrimtiveType2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEPrimtiveType2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMapType_in_entryRuleEMapType2784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMapType2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleEMapType2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedCustomQuery_in_entryRuleENamedCustomQuery2871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedCustomQuery2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery2928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45_in_ruleENamedCustomQuery2953 = new BitSet(new long[]{0x00409F8000000010L});
    public static final BitSet FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery2987 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleENamedCustomQuery2999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleENamedCustomQuery3018 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_33_in_ruleENamedCustomQuery3036 = new BitSet(new long[]{0x00001F8410000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedCustomQuery3058 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_13_in_ruleENamedCustomQuery3071 = new BitSet(new long[]{0x00001F8010000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedCustomQuery3092 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_34_in_ruleENamedCustomQuery3108 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleENamedCustomQuery3122 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_ruleECustomQuery_in_ruleENamedCustomQuery3143 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleENamedCustomQuery3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReturnType_in_entryRuleEReturnType3191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEReturnType3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPredefinedType_in_ruleEReturnType3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETypeDef_in_ruleEReturnType3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEModelTypeDef_in_ruleEReturnType3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPredefinedType_in_entryRuleEPredefinedType3337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPredefinedType3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMapType_in_ruleEPredefinedType3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEPredefinedType3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETypeDef_in_entryRuleETypeDef3451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETypeDef3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleETypeDef3498 = new BitSet(new long[]{0x00001F8000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleETypeDef3519 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleETypeDef3531 = new BitSet(new long[]{0x00001F8000000010L});
    public static final BitSet FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef3552 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_13_in_ruleETypeDef3565 = new BitSet(new long[]{0x00001F8000000010L});
    public static final BitSet FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef3586 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_34_in_ruleETypeDef3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEModelTypeDef_in_entryRuleEModelTypeDef3636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEModelTypeDef3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_ruleEModelTypeDef3692 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEModelTypeDef3704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef3725 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_13_in_ruleEModelTypeDef3738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef3759 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_34_in_ruleEModelTypeDef3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEModelTypeAttribute_in_entryRuleEModelTypeAttribute3809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEModelTypeAttribute3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute3861 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleEModelTypeAttribute3879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEModelTypeAttribute3902 = new BitSet(new long[]{0x0001000200000002L});
    public static final BitSet FOLLOW_33_in_ruleEModelTypeAttribute3915 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute3933 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_13_in_ruleEModelTypeAttribute3951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute3968 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_34_in_ruleEModelTypeAttribute3989 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEModelTypeAttribute4010 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueTypeAttribute_in_entryRuleEValueTypeAttribute4086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEValueTypeAttribute4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEValueTypeAttribute4142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEValueTypeAttribute4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_entryRuleEParameter4200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEParameter4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEParameter4253 = new BitSet(new long[]{0x00001F8000000010L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEParameter4288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEParameter4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_entryRuleEQuery4346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQuery4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEQuery4401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery4429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_ruleEQuery4458 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_50_in_ruleEQuery4472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery4489 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEQuery4507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery4524 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52_in_ruleEQuery4544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery4561 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEQuery4581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECustomQuery_in_entryRuleECustomQuery4671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECustomQuery4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleECustomQuery4726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery4754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery4779 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_50_in_ruleECustomQuery4798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery4815 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_51_in_ruleECustomQuery4833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery4850 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52_in_ruleECustomQuery4870 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery4887 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleECustomQuery4907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection4997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEObjectSection5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection5052 = new BitSet(new long[]{0x0000000200000012L});
    public static final BitSet FOLLOW_33_in_ruleEObjectSection5065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection5085 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEObjectSection5098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection5118 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_34_in_ruleEObjectSection5132 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection5152 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleEObjectSection5170 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection5191 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEObjectSection5204 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection5225 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleEObjectSection5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute5279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingAttribute5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEMappingAttribute5332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute5367 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEMappingAttribute5379 = new BitSet(new long[]{0x0000100100000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingAttribute5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEMappingAttribute5427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute5463 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEMappingAttribute5475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingAttribute5492 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEMappingAttribute5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleEMappingAttribute5535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_ruleEMappingAttribute5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_entryRuleEType5607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEType5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEType5654 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEType5671 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleEType5688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEType5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5798 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedName5826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5842 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard5890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard5948 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedNameWithWildcard5966 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleQualifiedNameWithWildcard5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleReturnType6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleReturnType6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred1_InternalEMap919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred2_InternalEMap5817 = new BitSet(new long[]{0x0000000000000002L});

}