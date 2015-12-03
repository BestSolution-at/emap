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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bundle'", "'extends'", "'{'", "'predefined'", "','", "'}'", "'generator'", "'databases'", "'colsort'", "'sequence'", "'table'", "':'", "'pk-constraint'", "'index'", "'('", "')'", "'fk-constraint'", "'unique-constraint'", "'sql-type-def'", "'default'", "'size'", "'webservice'", "'rest'", "'as'", "'greedy'", "'path-param'", "'named'", "'query-param'", "'import'", "'package'", "';'", "'.'", "'abstract'", "'entity'", "'derived'", "'attributes'", "'queries'", "'descriminatedby'", "'primarykey'", "'forced-fk'", "'=>'", "'generatedby'", "'resolve'", "'on'", "'autokey'", "'query'", "'seqnext'", "'int'", "'long'", "'double'", "'float'", "'boolean'", "'map'", "'['", "']'", "'typedef'", "'cached'", "'FROM'", "'WHERE'", "'GROUP BY'", "'ORDER BY'", "'etype'", "'#'", "'*'", "'EMAP'", "'ECORE'", "'ECORE_REVERSED'", "'ALPHABETIC'", "'list'", "'single'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
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
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
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
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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

            if ( (LA1_0==11||LA1_0==39) ) {
                alt1=1;
            }
            else if ( (LA1_0==40) ) {
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:134:1: ruleEMappingBundle returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )? ( (lv_entities_12_0= ruleEBundleEntity ) ) (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )* (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )? otherlv_20= '}' (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )? (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )? ) ;
    public final EObject ruleEMappingBundle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_databases_22_0=null;
        Token otherlv_23=null;
        Token lv_databases_24_0=null;
        Token otherlv_25=null;
        EObject lv_imports_0_0 = null;

        EObject lv_predef_8_0 = null;

        EObject lv_predef_10_0 = null;

        EObject lv_entities_12_0 = null;

        EObject lv_entities_14_0 = null;

        EObject lv_typeDefs_15_0 = null;

        EObject lv_generators_18_0 = null;

        Enumerator lv_colSort_26_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:137:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )? ( (lv_entities_12_0= ruleEBundleEntity ) ) (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )* (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )? otherlv_20= '}' (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )? (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:138:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )? ( (lv_entities_12_0= ruleEBundleEntity ) ) (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )* (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )? otherlv_20= '}' (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )? (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:138:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )? ( (lv_entities_12_0= ruleEBundleEntity ) ) (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )* (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )? otherlv_20= '}' (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )? (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:138:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )? ( (lv_entities_12_0= ruleEBundleEntity ) ) (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )* (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )? otherlv_20= '}' (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )? (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:138:2: ( (lv_imports_0_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==39) ) {
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:178:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:178:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleEMappingBundle293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEMappingBundleAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:182:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:183:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:183:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:184:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingBundleRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getParentBundleEMappingBundleCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingBundle316);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEMappingBundle330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:201:1: (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:201:3: otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEMappingBundle343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEMappingBundleAccess().getPredefinedKeyword_5_0());
                          
                    }
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleEMappingBundle355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:209:1: ( (lv_predef_8_0= ruleEPredef ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:210:1: (lv_predef_8_0= ruleEPredef )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:210:1: (lv_predef_8_0= ruleEPredef )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:211:3: lv_predef_8_0= ruleEPredef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getPredefEPredefParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEPredef_in_ruleEMappingBundle376);
                    lv_predef_8_0=ruleEPredef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
                      	        }
                             		add(
                             			current, 
                             			"predef",
                              		lv_predef_8_0, 
                              		"EPredef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:227:2: (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:227:4: otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleEMappingBundle389); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getEMappingBundleAccess().getCommaKeyword_5_3_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:231:1: ( (lv_predef_10_0= ruleEPredef ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:232:1: (lv_predef_10_0= ruleEPredef )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:232:1: (lv_predef_10_0= ruleEPredef )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:233:3: lv_predef_10_0= ruleEPredef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getPredefEPredefParserRuleCall_5_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEPredef_in_ruleEMappingBundle410);
                    	    lv_predef_10_0=ruleEPredef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"predef",
                    	              		lv_predef_10_0, 
                    	              		"EPredef");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleEMappingBundle424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_5_4());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:253:3: ( (lv_entities_12_0= ruleEBundleEntity ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:254:1: (lv_entities_12_0= ruleEBundleEntity )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:254:1: (lv_entities_12_0= ruleEBundleEntity )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:255:3: lv_entities_12_0= ruleEBundleEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getEntitiesEBundleEntityParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEBundleEntity_in_ruleEMappingBundle447);
            lv_entities_12_0=ruleEBundleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
              	        }
                     		add(
                     			current, 
                     			"entities",
                      		lv_entities_12_0, 
                      		"EBundleEntity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:271:2: (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:271:4: otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleEMappingBundle460); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getEMappingBundleAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:275:1: ( (lv_entities_14_0= ruleEBundleEntity ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:276:1: (lv_entities_14_0= ruleEBundleEntity )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:276:1: (lv_entities_14_0= ruleEBundleEntity )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:277:3: lv_entities_14_0= ruleEBundleEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getEntitiesEBundleEntityParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBundleEntity_in_ruleEMappingBundle481);
            	    lv_entities_14_0=ruleEBundleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_14_0, 
            	              		"EBundleEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:293:4: ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:294:1: (lv_typeDefs_15_0= ruleESQLTypeDef )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:294:1: (lv_typeDefs_15_0= ruleESQLTypeDef )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:295:3: lv_typeDefs_15_0= ruleESQLTypeDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getTypeDefsESQLTypeDefParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleESQLTypeDef_in_ruleEMappingBundle504);
            	    lv_typeDefs_15_0=ruleESQLTypeDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeDefs",
            	              		lv_typeDefs_15_0, 
            	              		"ESQLTypeDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:311:3: (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:311:5: otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleEMappingBundle518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getEMappingBundleAccess().getGeneratorKeyword_9_0());
                          
                    }
                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleEMappingBundle530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_9_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:319:1: ( (lv_generators_18_0= ruleEGeneratorDef ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:320:1: (lv_generators_18_0= ruleEGeneratorDef )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:320:1: (lv_generators_18_0= ruleEGeneratorDef )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:321:3: lv_generators_18_0= ruleEGeneratorDef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getGeneratorsEGeneratorDefParserRuleCall_9_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEGeneratorDef_in_ruleEMappingBundle551);
                    	    lv_generators_18_0=ruleEGeneratorDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"generators",
                    	              		lv_generators_18_0, 
                    	              		"EGeneratorDef");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleEMappingBundle564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_9_3());
                          
                    }

                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleEMappingBundle578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_10());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:345:1: (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:345:3: otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )*
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleEMappingBundle591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getEMappingBundleAccess().getDatabasesKeyword_11_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:349:1: ( (lv_databases_22_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:350:1: (lv_databases_22_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:350:1: (lv_databases_22_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:351:3: lv_databases_22_0= RULE_STRING
                    {
                    lv_databases_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEMappingBundle608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_databases_22_0, grammarAccess.getEMappingBundleAccess().getDatabasesSTRINGTerminalRuleCall_11_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingBundleRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"databases",
                              		lv_databases_22_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:367:2: (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:367:4: otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleEMappingBundle626); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_23, grammarAccess.getEMappingBundleAccess().getCommaKeyword_11_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:371:1: ( (lv_databases_24_0= RULE_STRING ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:372:1: (lv_databases_24_0= RULE_STRING )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:372:1: (lv_databases_24_0= RULE_STRING )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:373:3: lv_databases_24_0= RULE_STRING
                    	    {
                    	    lv_databases_24_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEMappingBundle643); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_databases_24_0, grammarAccess.getEMappingBundleAccess().getDatabasesSTRINGTerminalRuleCall_11_2_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEMappingBundleRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"databases",
                    	              		lv_databases_24_0, 
                    	              		"STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:389:6: (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:389:8: otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) )
                    {
                    otherlv_25=(Token)match(input,19,FOLLOW_19_in_ruleEMappingBundle665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getEMappingBundleAccess().getColsortKeyword_12_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:393:1: ( (lv_colSort_26_0= ruleColSort ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:394:1: (lv_colSort_26_0= ruleColSort )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:394:1: (lv_colSort_26_0= ruleColSort )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:395:3: lv_colSort_26_0= ruleColSort
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getColSortColSortEnumRuleCall_12_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColSort_in_ruleEMappingBundle686);
                    lv_colSort_26_0=ruleColSort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
                      	        }
                             		set(
                             			current, 
                             			"colSort",
                              		lv_colSort_26_0, 
                              		"ColSort");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleEMappingBundle"


    // $ANTLR start "entryRuleEPredef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:419:1: entryRuleEPredef returns [EObject current=null] : iv_ruleEPredef= ruleEPredef EOF ;
    public final EObject entryRuleEPredef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPredef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:420:2: (iv_ruleEPredef= ruleEPredef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:421:2: iv_ruleEPredef= ruleEPredef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPredefRule()); 
            }
            pushFollow(FOLLOW_ruleEPredef_in_entryRuleEPredef724);
            iv_ruleEPredef=ruleEPredef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPredef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPredef734); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEPredef"


    // $ANTLR start "ruleEPredef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:428:1: ruleEPredef returns [EObject current=null] : ( ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleEPredef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:431:28: ( ( ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:432:1: ( ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:432:1: ( ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:432:2: ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:432:2: ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:432:3: () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:432:3: ()
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:433:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getEPredefAccess().getEPredefSequenceAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleEPredef781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEPredefAccess().getSequenceKeyword_0_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:442:1: ( (lv_name_2_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:443:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:443:1: (lv_name_2_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:444:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEPredef798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getEPredefAccess().getNameSTRINGTerminalRuleCall_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEPredefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:461:6: ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:461:6: ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:461:7: () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:461:7: ()
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:462:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getEPredefAccess().getEPredefTableAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleEPredef832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEPredefAccess().getTableKeyword_1_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:471:1: ( (lv_name_5_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:472:1: (lv_name_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:472:1: (lv_name_5_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:473:3: lv_name_5_0= RULE_STRING
                    {
                    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEPredef849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getEPredefAccess().getNameSTRINGTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEPredefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"STRING");
                      	    
                    }

                    }


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
    // $ANTLR end "ruleEPredef"


    // $ANTLR start "entryRuleEGeneratorDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:497:1: entryRuleEGeneratorDef returns [EObject current=null] : iv_ruleEGeneratorDef= ruleEGeneratorDef EOF ;
    public final EObject entryRuleEGeneratorDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGeneratorDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:498:2: (iv_ruleEGeneratorDef= ruleEGeneratorDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:499:2: iv_ruleEGeneratorDef= ruleEGeneratorDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEGeneratorDefRule()); 
            }
            pushFollow(FOLLOW_ruleEGeneratorDef_in_entryRuleEGeneratorDef891);
            iv_ruleEGeneratorDef=ruleEGeneratorDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEGeneratorDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEGeneratorDef901); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEGeneratorDef"


    // $ANTLR start "ruleEGeneratorDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:506:1: ruleEGeneratorDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )? ) ;
    public final EObject ruleEGeneratorDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:509:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:510:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:510:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:510:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:510:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:511:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:511:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:512:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEGeneratorDef943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEGeneratorDefAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEGeneratorDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:528:2: (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:528:4: otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEGeneratorDef961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEGeneratorDefAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:532:1: ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:533:1: (lv_parameters_2_0= ruleEGeneratorConfigValue )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:533:1: (lv_parameters_2_0= ruleEGeneratorConfigValue )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:534:3: lv_parameters_2_0= ruleEGeneratorConfigValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEGeneratorDefAccess().getParametersEGeneratorConfigValueParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEGeneratorConfigValue_in_ruleEGeneratorDef982);
                    	    lv_parameters_2_0=ruleEGeneratorConfigValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEGeneratorDefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_2_0, 
                    	              		"EGeneratorConfigValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleEGeneratorDef995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEGeneratorDefAccess().getRightCurlyBracketKeyword_1_2());
                          
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
    // $ANTLR end "ruleEGeneratorDef"


    // $ANTLR start "entryRuleEGeneratorConfigValue"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:562:1: entryRuleEGeneratorConfigValue returns [EObject current=null] : iv_ruleEGeneratorConfigValue= ruleEGeneratorConfigValue EOF ;
    public final EObject entryRuleEGeneratorConfigValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGeneratorConfigValue = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:563:2: (iv_ruleEGeneratorConfigValue= ruleEGeneratorConfigValue EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:564:2: iv_ruleEGeneratorConfigValue= ruleEGeneratorConfigValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEGeneratorConfigValueRule()); 
            }
            pushFollow(FOLLOW_ruleEGeneratorConfigValue_in_entryRuleEGeneratorConfigValue1033);
            iv_ruleEGeneratorConfigValue=ruleEGeneratorConfigValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEGeneratorConfigValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEGeneratorConfigValue1043); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEGeneratorConfigValue"


    // $ANTLR start "ruleEGeneratorConfigValue"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:571:1: ruleEGeneratorConfigValue returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) ) ) ;
    public final EObject ruleEGeneratorConfigValue() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_simpleValue_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:574:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:575:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:575:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:575:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:575:2: ( (lv_key_0_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:576:1: (lv_key_0_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:576:1: (lv_key_0_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:577:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEGeneratorConfigValue1085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getEGeneratorConfigValueAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEGeneratorConfigValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleEGeneratorConfigValue1102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEGeneratorConfigValueAccess().getColonKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:597:1: ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==13) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:597:2: ( (lv_simpleValue_2_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:597:2: ( (lv_simpleValue_2_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:598:1: (lv_simpleValue_2_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:598:1: (lv_simpleValue_2_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:599:3: lv_simpleValue_2_0= RULE_STRING
                    {
                    lv_simpleValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEGeneratorConfigValue1120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_simpleValue_2_0, grammarAccess.getEGeneratorConfigValueAccess().getSimpleValueSTRINGTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEGeneratorConfigValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"simpleValue",
                              		lv_simpleValue_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:616:6: (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:616:6: (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:616:8: otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEGeneratorConfigValue1144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEGeneratorConfigValueAccess().getLeftCurlyBracketKeyword_2_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:620:1: ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:621:1: (lv_children_4_0= ruleEGeneratorConfigValue )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:621:1: (lv_children_4_0= ruleEGeneratorConfigValue )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:622:3: lv_children_4_0= ruleEGeneratorConfigValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEGeneratorConfigValueAccess().getChildrenEGeneratorConfigValueParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEGeneratorConfigValue_in_ruleEGeneratorConfigValue1165);
                    	    lv_children_4_0=ruleEGeneratorConfigValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEGeneratorConfigValueRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"children",
                    	              		lv_children_4_0, 
                    	              		"EGeneratorConfigValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleEGeneratorConfigValue1178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEGeneratorConfigValueAccess().getRightCurlyBracketKeyword_2_1_2());
                          
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
    // $ANTLR end "ruleEGeneratorConfigValue"


    // $ANTLR start "entryRuleEBundleEntity"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:650:1: entryRuleEBundleEntity returns [EObject current=null] : iv_ruleEBundleEntity= ruleEBundleEntity EOF ;
    public final EObject entryRuleEBundleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBundleEntity = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:651:2: (iv_ruleEBundleEntity= ruleEBundleEntity EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:652:2: iv_ruleEBundleEntity= ruleEBundleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBundleEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEBundleEntity_in_entryRuleEBundleEntity1216);
            iv_ruleEBundleEntity=ruleEBundleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBundleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBundleEntity1226); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEBundleEntity"


    // $ANTLR start "ruleEBundleEntity"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:659:1: ruleEBundleEntity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )? ) ;
    public final EObject ruleEBundleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pkConstraintName_3_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        EObject lv_fkConstraints_4_0 = null;

        EObject lv_fkConstraints_6_0 = null;

        EObject lv_uniqueContraints_7_0 = null;

        EObject lv_uniqueContraints_9_0 = null;

        EObject lv_indices_10_0 = null;

        EObject lv_indices_12_0 = null;

        EObject lv_typeDefs_13_0 = null;

        EObject lv_typeDefs_15_0 = null;

        EObject lv_rest_16_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:662:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:663:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:663:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:663:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:663:2: ( (otherlv_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:664:1: (otherlv_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:664:1: (otherlv_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:665:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEBundleEntityRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEBundleEntity1271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEBundleEntityAccess().getEntityEMappingEntityCrossReference_0_0()); 
              	
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:676:2: (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:676:4: otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEBundleEntity1284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEBundleEntityAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:680:1: (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==23) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:680:3: otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) )
                            {
                            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEBundleEntity1297); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getEBundleEntityAccess().getPkConstraintKeyword_1_1_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:684:1: ( (lv_pkConstraintName_3_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:685:1: (lv_pkConstraintName_3_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:685:1: (lv_pkConstraintName_3_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:686:3: lv_pkConstraintName_3_0= RULE_STRING
                            {
                            lv_pkConstraintName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEBundleEntity1314); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_pkConstraintName_3_0, grammarAccess.getEBundleEntityAccess().getPkConstraintNameSTRINGTerminalRuleCall_1_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEBundleEntityRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"pkConstraintName",
                                      		lv_pkConstraintName_3_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:702:4: ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==27) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:702:5: ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:702:5: ( (lv_fkConstraints_4_0= ruleEFkConstraint ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:703:1: (lv_fkConstraints_4_0= ruleEFkConstraint )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:703:1: (lv_fkConstraints_4_0= ruleEFkConstraint )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:704:3: lv_fkConstraints_4_0= ruleEFkConstraint
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getFkConstraintsEFkConstraintParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEFkConstraint_in_ruleEBundleEntity1343);
                            lv_fkConstraints_4_0=ruleEFkConstraint();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEBundleEntityRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"fkConstraints",
                                      		lv_fkConstraints_4_0, 
                                      		"EFkConstraint");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:720:2: (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==15) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:720:4: otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) )
                            	    {
                            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEBundleEntity1356); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_2_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:724:1: ( (lv_fkConstraints_6_0= ruleEFkConstraint ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:725:1: (lv_fkConstraints_6_0= ruleEFkConstraint )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:725:1: (lv_fkConstraints_6_0= ruleEFkConstraint )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:726:3: lv_fkConstraints_6_0= ruleEFkConstraint
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getFkConstraintsEFkConstraintParserRuleCall_1_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEFkConstraint_in_ruleEBundleEntity1377);
                            	    lv_fkConstraints_6_0=ruleEFkConstraint();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getEBundleEntityRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"fkConstraints",
                            	              		lv_fkConstraints_6_0, 
                            	              		"EFkConstraint");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:742:6: ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==28) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:742:7: ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:742:7: ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:743:1: (lv_uniqueContraints_7_0= ruleEUniqueConstraint )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:743:1: (lv_uniqueContraints_7_0= ruleEUniqueConstraint )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:744:3: lv_uniqueContraints_7_0= ruleEUniqueConstraint
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getUniqueContraintsEUniqueConstraintParserRuleCall_1_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEUniqueConstraint_in_ruleEBundleEntity1403);
                            lv_uniqueContraints_7_0=ruleEUniqueConstraint();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEBundleEntityRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"uniqueContraints",
                                      		lv_uniqueContraints_7_0, 
                                      		"EUniqueConstraint");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:760:2: (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==15) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:760:4: otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEBundleEntity1416); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_3_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:764:1: ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:765:1: (lv_uniqueContraints_9_0= ruleEUniqueConstraint )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:765:1: (lv_uniqueContraints_9_0= ruleEUniqueConstraint )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:766:3: lv_uniqueContraints_9_0= ruleEUniqueConstraint
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getUniqueContraintsEUniqueConstraintParserRuleCall_1_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEUniqueConstraint_in_ruleEBundleEntity1437);
                            	    lv_uniqueContraints_9_0=ruleEUniqueConstraint();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getEBundleEntityRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"uniqueContraints",
                            	              		lv_uniqueContraints_9_0, 
                            	              		"EUniqueConstraint");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:782:6: ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==24) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:782:7: ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:782:7: ( (lv_indices_10_0= ruleEIndex ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:783:1: (lv_indices_10_0= ruleEIndex )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:783:1: (lv_indices_10_0= ruleEIndex )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:784:3: lv_indices_10_0= ruleEIndex
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getIndicesEIndexParserRuleCall_1_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEIndex_in_ruleEBundleEntity1463);
                            lv_indices_10_0=ruleEIndex();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEBundleEntityRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"indices",
                                      		lv_indices_10_0, 
                                      		"EIndex");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:800:2: (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==15) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:800:4: otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) )
                            	    {
                            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleEBundleEntity1476); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_4_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:804:1: ( (lv_indices_12_0= ruleEIndex ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:805:1: (lv_indices_12_0= ruleEIndex )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:805:1: (lv_indices_12_0= ruleEIndex )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:806:3: lv_indices_12_0= ruleEIndex
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getIndicesEIndexParserRuleCall_1_4_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEIndex_in_ruleEBundleEntity1497);
                            	    lv_indices_12_0=ruleEIndex();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getEBundleEntityRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"indices",
                            	              		lv_indices_12_0, 
                            	              		"EIndex");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:6: ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==29) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:7: ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:822:7: ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:823:1: (lv_typeDefs_13_0= ruleESQLAttTypeDef )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:823:1: (lv_typeDefs_13_0= ruleESQLAttTypeDef )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:824:3: lv_typeDefs_13_0= ruleESQLAttTypeDef
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getTypeDefsESQLAttTypeDefParserRuleCall_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleESQLAttTypeDef_in_ruleEBundleEntity1523);
                            lv_typeDefs_13_0=ruleESQLAttTypeDef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEBundleEntityRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"typeDefs",
                                      		lv_typeDefs_13_0, 
                                      		"ESQLAttTypeDef");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:840:2: (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==15) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:840:4: otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) )
                            	    {
                            	    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleEBundleEntity1536); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_5_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:844:1: ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:845:1: (lv_typeDefs_15_0= ruleESQLAttTypeDef )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:845:1: (lv_typeDefs_15_0= ruleESQLAttTypeDef )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:846:3: lv_typeDefs_15_0= ruleESQLAttTypeDef
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getTypeDefsESQLAttTypeDefParserRuleCall_1_5_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleESQLAttTypeDef_in_ruleEBundleEntity1557);
                            	    lv_typeDefs_15_0=ruleESQLAttTypeDef();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getEBundleEntityRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"typeDefs",
                            	              		lv_typeDefs_15_0, 
                            	              		"ESQLAttTypeDef");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:862:6: ( (lv_rest_16_0= ruleERestServiceMapping ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==32) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:863:1: (lv_rest_16_0= ruleERestServiceMapping )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:863:1: (lv_rest_16_0= ruleERestServiceMapping )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:864:3: lv_rest_16_0= ruleERestServiceMapping
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getRestERestServiceMappingParserRuleCall_1_6_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleERestServiceMapping_in_ruleEBundleEntity1582);
                            lv_rest_16_0=ruleERestServiceMapping();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEBundleEntityRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rest",
                                      		lv_rest_16_0, 
                                      		"ERestServiceMapping");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleEBundleEntity1595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getEBundleEntityAccess().getRightCurlyBracketKeyword_1_7());
                          
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
    // $ANTLR end "ruleEBundleEntity"


    // $ANTLR start "entryRuleEIndex"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:892:1: entryRuleEIndex returns [EObject current=null] : iv_ruleEIndex= ruleEIndex EOF ;
    public final EObject entryRuleEIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIndex = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:893:2: (iv_ruleEIndex= ruleEIndex EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:894:2: iv_ruleEIndex= ruleEIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIndexRule()); 
            }
            pushFollow(FOLLOW_ruleEIndex_in_entryRuleEIndex1633);
            iv_ruleEIndex=ruleEIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEIndex; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIndex1643); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEIndex"


    // $ANTLR start "ruleEIndex"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:901:1: ruleEIndex returns [EObject current=null] : (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:904:28: ( (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:905:1: (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:905:1: (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:905:3: otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleEIndex1680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEIndexAccess().getIndexKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:909:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:910:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:910:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:911:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEIndex1697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEIndexAccess().getNameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEIndexRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleEIndex1714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEIndexAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:931:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:932:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:932:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:933:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEIndexRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEIndexAccess().getAttributesEAttributeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEIndex1737);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:946:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:946:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEIndex1750); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEIndexAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:950:1: ( ( ruleQualifiedName ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:951:1: ( ruleQualifiedName )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:951:1: ( ruleQualifiedName )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:952:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEIndexRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEIndexAccess().getAttributesEAttributeCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEIndex1773);
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

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleEIndex1787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEIndexAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleEIndex"


    // $ANTLR start "entryRuleEFkConstraint"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:977:1: entryRuleEFkConstraint returns [EObject current=null] : iv_ruleEFkConstraint= ruleEFkConstraint EOF ;
    public final EObject entryRuleEFkConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFkConstraint = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:978:2: (iv_ruleEFkConstraint= ruleEFkConstraint EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:979:2: iv_ruleEFkConstraint= ruleEFkConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFkConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleEFkConstraint_in_entryRuleEFkConstraint1823);
            iv_ruleEFkConstraint=ruleEFkConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFkConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFkConstraint1833); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFkConstraint"


    // $ANTLR start "ruleEFkConstraint"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:986:1: ruleEFkConstraint returns [EObject current=null] : (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEFkConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:989:28: ( (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:990:1: (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:990:1: (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:990:3: otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleEFkConstraint1870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEFkConstraintAccess().getFkConstraintKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:994:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:995:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:995:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:996:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEFkConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEFkConstraintAccess().getAttributeEAttributeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEFkConstraint1893);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1009:2: ( (lv_name_2_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1010:1: (lv_name_2_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1010:1: (lv_name_2_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1011:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEFkConstraint1910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEFkConstraintAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEFkConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleEFkConstraint"


    // $ANTLR start "entryRuleEUniqueConstraint"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1035:1: entryRuleEUniqueConstraint returns [EObject current=null] : iv_ruleEUniqueConstraint= ruleEUniqueConstraint EOF ;
    public final EObject entryRuleEUniqueConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUniqueConstraint = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1036:2: (iv_ruleEUniqueConstraint= ruleEUniqueConstraint EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1037:2: iv_ruleEUniqueConstraint= ruleEUniqueConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEUniqueConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleEUniqueConstraint_in_entryRuleEUniqueConstraint1951);
            iv_ruleEUniqueConstraint=ruleEUniqueConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEUniqueConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEUniqueConstraint1961); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEUniqueConstraint"


    // $ANTLR start "ruleEUniqueConstraint"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1044:1: ruleEUniqueConstraint returns [EObject current=null] : (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEUniqueConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1047:28: ( (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1048:1: (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1048:1: (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1048:3: otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleEUniqueConstraint1998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEUniqueConstraintAccess().getUniqueConstraintKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1052:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1053:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1053:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1054:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEUniqueConstraint2015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEUniqueConstraintAccess().getNameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEUniqueConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleEUniqueConstraint2032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEUniqueConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1074:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1075:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1075:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1076:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEUniqueConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEUniqueConstraintAccess().getAttributesEAttributeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEUniqueConstraint2055);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1089:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1089:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEUniqueConstraint2068); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEUniqueConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1093:1: ( ( ruleQualifiedName ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1094:1: ( ruleQualifiedName )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1094:1: ( ruleQualifiedName )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1095:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEUniqueConstraintRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEUniqueConstraintAccess().getAttributesEAttributeCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEUniqueConstraint2091);
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

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleEUniqueConstraint2105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEUniqueConstraintAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleEUniqueConstraint"


    // $ANTLR start "entryRuleESQLAttTypeDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1120:1: entryRuleESQLAttTypeDef returns [EObject current=null] : iv_ruleESQLAttTypeDef= ruleESQLAttTypeDef EOF ;
    public final EObject entryRuleESQLAttTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESQLAttTypeDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1121:2: (iv_ruleESQLAttTypeDef= ruleESQLAttTypeDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1122:2: iv_ruleESQLAttTypeDef= ruleESQLAttTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getESQLAttTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleESQLAttTypeDef_in_entryRuleESQLAttTypeDef2141);
            iv_ruleESQLAttTypeDef=ruleESQLAttTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleESQLAttTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleESQLAttTypeDef2151); if (state.failed) return current;

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
    // $ANTLR end "entryRuleESQLAttTypeDef"


    // $ANTLR start "ruleESQLAttTypeDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1129:1: ruleESQLAttTypeDef returns [EObject current=null] : (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleESQLAttTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dbTypes_3_0 = null;

        EObject lv_dbTypes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1132:28: ( (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1133:1: (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1133:1: (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1133:3: otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleESQLAttTypeDef2188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getESQLAttTypeDefAccess().getSqlTypeDefKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1137:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1138:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1138:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1139:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getESQLAttTypeDefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLAttTypeDefAccess().getAttributeEAttributeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleESQLAttTypeDef2211);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleESQLAttTypeDef2223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getESQLAttTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1156:1: ( (lv_dbTypes_3_0= ruleESQLDbType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1157:1: (lv_dbTypes_3_0= ruleESQLDbType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1157:1: (lv_dbTypes_3_0= ruleESQLDbType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1158:3: lv_dbTypes_3_0= ruleESQLDbType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLAttTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleESQLDbType_in_ruleESQLAttTypeDef2244);
            lv_dbTypes_3_0=ruleESQLDbType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getESQLAttTypeDefRule());
              	        }
                     		add(
                     			current, 
                     			"dbTypes",
                      		lv_dbTypes_3_0, 
                      		"ESQLDbType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1174:2: (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1174:4: otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleESQLAttTypeDef2257); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getESQLAttTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1178:1: ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1179:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1179:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1180:3: lv_dbTypes_5_0= ruleESQLDbType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getESQLAttTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleESQLDbType_in_ruleESQLAttTypeDef2278);
            	    lv_dbTypes_5_0=ruleESQLDbType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getESQLAttTypeDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dbTypes",
            	              		lv_dbTypes_5_0, 
            	              		"ESQLDbType");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleESQLAttTypeDef2292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getESQLAttTypeDefAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleESQLAttTypeDef"


    // $ANTLR start "entryRuleESQLTypeDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1208:1: entryRuleESQLTypeDef returns [EObject current=null] : iv_ruleESQLTypeDef= ruleESQLTypeDef EOF ;
    public final EObject entryRuleESQLTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESQLTypeDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1209:2: (iv_ruleESQLTypeDef= ruleESQLTypeDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1210:2: iv_ruleESQLTypeDef= ruleESQLTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getESQLTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleESQLTypeDef_in_entryRuleESQLTypeDef2328);
            iv_ruleESQLTypeDef=ruleESQLTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleESQLTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleESQLTypeDef2338); if (state.failed) return current;

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
    // $ANTLR end "entryRuleESQLTypeDef"


    // $ANTLR start "ruleESQLTypeDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1217:1: ruleESQLTypeDef returns [EObject current=null] : (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleESQLTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_etype_1_0 = null;

        EObject lv_dbTypes_3_0 = null;

        EObject lv_dbTypes_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1220:28: ( (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1221:1: (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1221:1: (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1221:3: otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleESQLTypeDef2375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getESQLTypeDefAccess().getSqlTypeDefKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1225:1: ( (lv_etype_1_0= ruleEType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1226:1: (lv_etype_1_0= ruleEType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1226:1: (lv_etype_1_0= ruleEType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1227:3: lv_etype_1_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLTypeDefAccess().getEtypeETypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEType_in_ruleESQLTypeDef2396);
            lv_etype_1_0=ruleEType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getESQLTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"etype",
                      		lv_etype_1_0, 
                      		"EType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleESQLTypeDef2408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getESQLTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1247:1: ( (lv_dbTypes_3_0= ruleESQLDbType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1248:1: (lv_dbTypes_3_0= ruleESQLDbType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1248:1: (lv_dbTypes_3_0= ruleESQLDbType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1249:3: lv_dbTypes_3_0= ruleESQLDbType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleESQLDbType_in_ruleESQLTypeDef2429);
            lv_dbTypes_3_0=ruleESQLDbType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getESQLTypeDefRule());
              	        }
                     		add(
                     			current, 
                     			"dbTypes",
                      		lv_dbTypes_3_0, 
                      		"ESQLDbType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1265:2: (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1265:4: otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleESQLTypeDef2442); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getESQLTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1269:1: ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1270:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1270:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1271:3: lv_dbTypes_5_0= ruleESQLDbType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getESQLTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleESQLDbType_in_ruleESQLTypeDef2463);
            	    lv_dbTypes_5_0=ruleESQLDbType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getESQLTypeDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dbTypes",
            	              		lv_dbTypes_5_0, 
            	              		"ESQLDbType");
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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleESQLTypeDef2477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getESQLTypeDefAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleESQLTypeDef"


    // $ANTLR start "entryRuleESQLDbType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1299:1: entryRuleESQLDbType returns [EObject current=null] : iv_ruleESQLDbType= ruleESQLDbType EOF ;
    public final EObject entryRuleESQLDbType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESQLDbType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1300:2: (iv_ruleESQLDbType= ruleESQLDbType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1301:2: iv_ruleESQLDbType= ruleESQLDbType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getESQLDbTypeRule()); 
            }
            pushFollow(FOLLOW_ruleESQLDbType_in_entryRuleESQLDbType2513);
            iv_ruleESQLDbType=ruleESQLDbType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleESQLDbType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleESQLDbType2523); if (state.failed) return current;

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
    // $ANTLR end "entryRuleESQLDbType"


    // $ANTLR start "ruleESQLDbType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1308:1: ruleESQLDbType returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleESQLDbType() throws RecognitionException {
        EObject current = null;

        Token lv_dbType_0_1=null;
        Token lv_dbType_0_2=null;
        Token lv_sqlTypeDef_1_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1311:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1312:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1312:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1312:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1312:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1313:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1313:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1314:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1314:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_STRING) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1315:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,30,FOLLOW_30_in_ruleESQLDbType2568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_dbType_0_1, grammarAccess.getESQLDbTypeAccess().getDbTypeDefaultKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getESQLDbTypeRule());
                      	        }
                             		setWithLastConsumed(current, "dbType", lv_dbType_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1327:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleESQLDbType2596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_dbType_0_2, grammarAccess.getESQLDbTypeAccess().getDbTypeSTRINGTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getESQLDbTypeRule());
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1345:2: ( (lv_sqlTypeDef_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1346:1: (lv_sqlTypeDef_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1346:1: (lv_sqlTypeDef_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1347:3: lv_sqlTypeDef_1_0= RULE_STRING
            {
            lv_sqlTypeDef_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleESQLDbType2621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_sqlTypeDef_1_0, grammarAccess.getESQLDbTypeAccess().getSqlTypeDefSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getESQLDbTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"sqlTypeDef",
                      		lv_sqlTypeDef_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1363:2: (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1363:4: otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleESQLDbType2639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getESQLDbTypeAccess().getSizeKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1367:1: ( (lv_size_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1368:1: (lv_size_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1368:1: (lv_size_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1369:3: lv_size_3_0= RULE_STRING
                    {
                    lv_size_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleESQLDbType2656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_size_3_0, grammarAccess.getESQLDbTypeAccess().getSizeSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getESQLDbTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"size",
                              		lv_size_3_0, 
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
    // $ANTLR end "ruleESQLDbType"


    // $ANTLR start "entryRuleERestServiceMapping"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1393:1: entryRuleERestServiceMapping returns [EObject current=null] : iv_ruleERestServiceMapping= ruleERestServiceMapping EOF ;
    public final EObject entryRuleERestServiceMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERestServiceMapping = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1394:2: (iv_ruleERestServiceMapping= ruleERestServiceMapping EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1395:2: iv_ruleERestServiceMapping= ruleERestServiceMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getERestServiceMappingRule()); 
            }
            pushFollow(FOLLOW_ruleERestServiceMapping_in_entryRuleERestServiceMapping2699);
            iv_ruleERestServiceMapping=ruleERestServiceMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleERestServiceMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleERestServiceMapping2709); if (state.failed) return current;

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
    // $ANTLR end "entryRuleERestServiceMapping"


    // $ANTLR start "ruleERestServiceMapping"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1402:1: ruleERestServiceMapping returns [EObject current=null] : (otherlv_0= 'webservice' () (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )+ otherlv_4= '}' )? ( (lv_rest_5_0= 'rest' ) ) ) ;
    public final EObject ruleERestServiceMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_rest_5_0=null;
        EObject lv_serviceMethods_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1405:28: ( (otherlv_0= 'webservice' () (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )+ otherlv_4= '}' )? ( (lv_rest_5_0= 'rest' ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1406:1: (otherlv_0= 'webservice' () (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )+ otherlv_4= '}' )? ( (lv_rest_5_0= 'rest' ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1406:1: (otherlv_0= 'webservice' () (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )+ otherlv_4= '}' )? ( (lv_rest_5_0= 'rest' ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1406:3: otherlv_0= 'webservice' () (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )+ otherlv_4= '}' )? ( (lv_rest_5_0= 'rest' ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleERestServiceMapping2746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getERestServiceMappingAccess().getWebserviceKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1410:1: ()
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1411:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getERestServiceMappingAccess().getERestServiceMappingAction_1(),
                          current);
                  
            }

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1416:2: (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )+ otherlv_4= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1416:4: otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )+ otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleERestServiceMapping2768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getERestServiceMappingAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1420:1: ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1421:1: (lv_serviceMethods_3_0= ruleENamedServiceQuery )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1421:1: (lv_serviceMethods_3_0= ruleENamedServiceQuery )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1422:3: lv_serviceMethods_3_0= ruleENamedServiceQuery
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getERestServiceMappingAccess().getServiceMethodsENamedServiceQueryParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleENamedServiceQuery_in_ruleERestServiceMapping2789);
                    	    lv_serviceMethods_3_0=ruleENamedServiceQuery();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getERestServiceMappingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"serviceMethods",
                    	              		lv_serviceMethods_3_0, 
                    	              		"ENamedServiceQuery");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleERestServiceMapping2802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getERestServiceMappingAccess().getRightCurlyBracketKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1442:3: ( (lv_rest_5_0= 'rest' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1443:1: (lv_rest_5_0= 'rest' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1443:1: (lv_rest_5_0= 'rest' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1444:3: lv_rest_5_0= 'rest'
            {
            lv_rest_5_0=(Token)match(input,33,FOLLOW_33_in_ruleERestServiceMapping2822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_rest_5_0, grammarAccess.getERestServiceMappingAccess().getRestRestKeyword_3_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getERestServiceMappingRule());
              	        }
                     		setWithLastConsumed(current, "rest", true, "rest");
              	    
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
    // $ANTLR end "ruleERestServiceMapping"


    // $ANTLR start "entryRuleENamedServiceQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1465:1: entryRuleENamedServiceQuery returns [EObject current=null] : iv_ruleENamedServiceQuery= ruleENamedServiceQuery EOF ;
    public final EObject entryRuleENamedServiceQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedServiceQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1466:2: (iv_ruleENamedServiceQuery= ruleENamedServiceQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1467:2: iv_ruleENamedServiceQuery= ruleENamedServiceQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedServiceQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedServiceQuery_in_entryRuleENamedServiceQuery2871);
            iv_ruleENamedServiceQuery=ruleENamedServiceQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedServiceQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedServiceQuery2881); if (state.failed) return current;

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
    // $ANTLR end "entryRuleENamedServiceQuery"


    // $ANTLR start "ruleENamedServiceQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1474:1: ruleENamedServiceQuery returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )? ) ;
    public final EObject ruleENamedServiceQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_parameters_5_0 = null;

        EObject lv_greedyAttributePathList_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1477:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1478:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1478:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1478:2: ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1478:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1479:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1479:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1480:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getENamedServiceQueryRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedServiceQueryAccess().getQueryENamedQueryCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleENamedServiceQuery2929);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleENamedServiceQuery2941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getENamedServiceQueryAccess().getAsKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1497:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1498:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1498:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1499:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleENamedServiceQuery2958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getENamedServiceQueryAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getENamedServiceQueryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1515:2: ( (lv_path_3_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1516:1: (lv_path_3_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1516:1: (lv_path_3_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1517:3: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleENamedServiceQuery2980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_path_3_0, grammarAccess.getENamedServiceQueryAccess().getPathSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getENamedServiceQueryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"path",
                      		lv_path_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1533:2: (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==13) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1533:4: otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleENamedServiceQuery2998); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getENamedServiceQueryAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1537:1: ( (lv_parameters_5_0= ruleEServiceParam ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==36||LA37_0==38) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1538:1: (lv_parameters_5_0= ruleEServiceParam )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1538:1: (lv_parameters_5_0= ruleEServiceParam )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1539:3: lv_parameters_5_0= ruleEServiceParam
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getENamedServiceQueryAccess().getParametersEServiceParamParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEServiceParam_in_ruleENamedServiceQuery3019);
                    	    lv_parameters_5_0=ruleEServiceParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getENamedServiceQueryRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"EServiceParam");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1555:3: (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==35) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1555:5: otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}'
                            {
                            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleENamedServiceQuery3033); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getENamedServiceQueryAccess().getGreedyKeyword_4_2_0());
                                  
                            }
                            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleENamedServiceQuery3045); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getENamedServiceQueryAccess().getLeftCurlyBracketKeyword_4_2_1());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1563:1: ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+
                            int cnt38=0;
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==RULE_ID) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1564:1: (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1564:1: (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1565:3: lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedServiceQueryAccess().getGreedyAttributePathListEGreedyAttributePathParserRuleCall_4_2_2_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEGreedyAttributePath_in_ruleENamedServiceQuery3066);
                            	    lv_greedyAttributePathList_8_0=ruleEGreedyAttributePath();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getENamedServiceQueryRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"greedyAttributePathList",
                            	              		lv_greedyAttributePathList_8_0, 
                            	              		"EGreedyAttributePath");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt38 >= 1 ) break loop38;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(38, input);
                                        throw eee;
                                }
                                cnt38++;
                            } while (true);

                            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleENamedServiceQuery3079); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getENamedServiceQueryAccess().getRightCurlyBracketKeyword_4_2_3());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleENamedServiceQuery3093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getENamedServiceQueryAccess().getRightCurlyBracketKeyword_4_3());
                          
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
    // $ANTLR end "ruleENamedServiceQuery"


    // $ANTLR start "entryRuleEGreedyAttributePath"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1597:1: entryRuleEGreedyAttributePath returns [EObject current=null] : iv_ruleEGreedyAttributePath= ruleEGreedyAttributePath EOF ;
    public final EObject entryRuleEGreedyAttributePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreedyAttributePath = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1598:2: (iv_ruleEGreedyAttributePath= ruleEGreedyAttributePath EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1599:2: iv_ruleEGreedyAttributePath= ruleEGreedyAttributePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEGreedyAttributePathRule()); 
            }
            pushFollow(FOLLOW_ruleEGreedyAttributePath_in_entryRuleEGreedyAttributePath3131);
            iv_ruleEGreedyAttributePath=ruleEGreedyAttributePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEGreedyAttributePath; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEGreedyAttributePath3141); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEGreedyAttributePath"


    // $ANTLR start "ruleEGreedyAttributePath"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1606:1: ruleEGreedyAttributePath returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )? ) ;
    public final EObject ruleEGreedyAttributePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_subPathList_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1609:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1610:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1610:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1610:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1610:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1611:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1611:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1612:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEGreedyAttributePathRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEGreedyAttributePathAccess().getGreedyAttributeEAttributeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEGreedyAttributePath3189);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1625:2: (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==13) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1625:4: otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEGreedyAttributePath3202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEGreedyAttributePathAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1629:1: ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ID) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1630:1: (lv_subPathList_2_0= ruleEGreedyAttributePath )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1630:1: (lv_subPathList_2_0= ruleEGreedyAttributePath )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1631:3: lv_subPathList_2_0= ruleEGreedyAttributePath
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEGreedyAttributePathAccess().getSubPathListEGreedyAttributePathParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEGreedyAttributePath_in_ruleEGreedyAttributePath3223);
                    	    lv_subPathList_2_0=ruleEGreedyAttributePath();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEGreedyAttributePathRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subPathList",
                    	              		lv_subPathList_2_0, 
                    	              		"EGreedyAttributePath");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);

                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleEGreedyAttributePath3236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEGreedyAttributePathAccess().getRightCurlyBracketKeyword_1_2());
                          
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
    // $ANTLR end "ruleEGreedyAttributePath"


    // $ANTLR start "entryRuleEServiceParam"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1659:1: entryRuleEServiceParam returns [EObject current=null] : iv_ruleEServiceParam= ruleEServiceParam EOF ;
    public final EObject entryRuleEServiceParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEServiceParam = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1660:2: (iv_ruleEServiceParam= ruleEServiceParam EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1661:2: iv_ruleEServiceParam= ruleEServiceParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEServiceParamRule()); 
            }
            pushFollow(FOLLOW_ruleEServiceParam_in_entryRuleEServiceParam3274);
            iv_ruleEServiceParam=ruleEServiceParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEServiceParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEServiceParam3284); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEServiceParam"


    // $ANTLR start "ruleEServiceParam"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1668:1: ruleEServiceParam returns [EObject current=null] : (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam ) ;
    public final EObject ruleEServiceParam() throws RecognitionException {
        EObject current = null;

        EObject this_EPathParam_0 = null;

        EObject this_EQueryParam_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1671:28: ( (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1672:1: (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1672:1: (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            else if ( (LA43_0==38) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1673:5: this_EPathParam_0= ruleEPathParam
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEServiceParamAccess().getEPathParamParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEPathParam_in_ruleEServiceParam3331);
                    this_EPathParam_0=ruleEPathParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EPathParam_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1683:5: this_EQueryParam_1= ruleEQueryParam
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEServiceParamAccess().getEQueryParamParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEQueryParam_in_ruleEServiceParam3358);
                    this_EQueryParam_1=ruleEQueryParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EQueryParam_1; 
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
    // $ANTLR end "ruleEServiceParam"


    // $ANTLR start "entryRuleEPathParam"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1699:1: entryRuleEPathParam returns [EObject current=null] : iv_ruleEPathParam= ruleEPathParam EOF ;
    public final EObject entryRuleEPathParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPathParam = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1700:2: (iv_ruleEPathParam= ruleEPathParam EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1701:2: iv_ruleEPathParam= ruleEPathParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPathParamRule()); 
            }
            pushFollow(FOLLOW_ruleEPathParam_in_entryRuleEPathParam3393);
            iv_ruleEPathParam=ruleEPathParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPathParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPathParam3403); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEPathParam"


    // $ANTLR start "ruleEPathParam"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1708:1: ruleEPathParam returns [EObject current=null] : (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEPathParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1711:28: ( (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1712:1: (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1712:1: (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1712:3: otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleEPathParam3440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEPathParamAccess().getPathParamKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1716:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1717:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1717:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1718:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEPathParamRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEPathParamAccess().getParamEParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEPathParam3463);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1731:2: (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1731:4: otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleEPathParam3476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEPathParamAccess().getNamedKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1735:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1736:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1736:1: (lv_name_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1737:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEPathParam3493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getEPathParamAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEPathParamRule());
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
    // $ANTLR end "ruleEPathParam"


    // $ANTLR start "entryRuleEQueryParam"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1761:1: entryRuleEQueryParam returns [EObject current=null] : iv_ruleEQueryParam= ruleEQueryParam EOF ;
    public final EObject entryRuleEQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQueryParam = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1762:2: (iv_ruleEQueryParam= ruleEQueryParam EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1763:2: iv_ruleEQueryParam= ruleEQueryParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQueryParamRule()); 
            }
            pushFollow(FOLLOW_ruleEQueryParam_in_entryRuleEQueryParam3536);
            iv_ruleEQueryParam=ruleEQueryParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQueryParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQueryParam3546); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEQueryParam"


    // $ANTLR start "ruleEQueryParam"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1770:1: ruleEQueryParam returns [EObject current=null] : (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEQueryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1773:28: ( (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1774:1: (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1774:1: (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1774:3: otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleEQueryParam3583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEQueryParamAccess().getQueryParamKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1778:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1779:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1779:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1780:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEQueryParamRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEQueryParamAccess().getParamEParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEQueryParam3606);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1793:2: (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1793:4: otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleEQueryParam3619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEQueryParamAccess().getNamedKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1797:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1798:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1798:1: (lv_name_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1799:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEQueryParam3636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getEQueryParamAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEQueryParamRule());
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
    // $ANTLR end "ruleEQueryParam"


    // $ANTLR start "entryRuleEMappingEntityDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1823:1: entryRuleEMappingEntityDef returns [EObject current=null] : iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF ;
    public final EObject entryRuleEMappingEntityDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingEntityDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1824:2: (iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1825:2: iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingEntityDefRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntityDef_in_entryRuleEMappingEntityDef3679);
            iv_ruleEMappingEntityDef=ruleEMappingEntityDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingEntityDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingEntityDef3689); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1832:1: ruleEMappingEntityDef returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) ) ;
    public final EObject ruleEMappingEntityDef() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_entity_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1835:28: ( ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1836:1: ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1836:1: ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1836:2: ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1836:2: ( (lv_package_0_0= rulePackageDeclaration ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1837:1: (lv_package_0_0= rulePackageDeclaration )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1837:1: (lv_package_0_0= rulePackageDeclaration )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1838:3: lv_package_0_0= rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_ruleEMappingEntityDef3735);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1854:2: ( (lv_imports_1_0= ruleImport ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==39) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1855:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1855:1: (lv_imports_1_0= ruleImport )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1856:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleEMappingEntityDef3756);
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
            	    break loop46;
                }
            } while (true);

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1872:3: ( (lv_entity_2_0= ruleEMappingEntity ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1873:1: (lv_entity_2_0= ruleEMappingEntity )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1873:1: (lv_entity_2_0= ruleEMappingEntity )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1874:3: lv_entity_2_0= ruleEMappingEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getEntityEMappingEntityParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_ruleEMappingEntityDef3778);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1898:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1899:2: (iv_ruleImport= ruleImport EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1900:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport3814);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport3824); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1907:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1910:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1911:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1911:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1911:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleImport3861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1915:1: ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1916:1: ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1916:1: ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1917:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1917:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1918:3: lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport3884);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1933:8: lv_importedNamespace_1_2= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport3903);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1959:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1960:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1961:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration3942);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration3952); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1968:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1971:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1972:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1972:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1972:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_rulePackageDeclaration3989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1976:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1977:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1977:1: (lv_name_1_0= ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1978:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration4010);
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

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_rulePackageDeclaration4022); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2006:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2007:2: (iv_ruleFQN= ruleFQN EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2008:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4059);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4070); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2015:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2018:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2019:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2019:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2019:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2026:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==42) && (synpred1_InternalEMap())) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2026:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2026:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2026:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleFQN4138); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4154); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2049:1: entryRuleEMappingEntity returns [EObject current=null] : iv_ruleEMappingEntity= ruleEMappingEntity EOF ;
    public final EObject entryRuleEMappingEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingEntity = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2050:2: (iv_ruleEMappingEntity= ruleEMappingEntity EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2051:2: iv_ruleEMappingEntity= ruleEMappingEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_entryRuleEMappingEntity4201);
            iv_ruleEMappingEntity=ruleEMappingEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingEntity4211); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2058:1: ruleEMappingEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2061:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2062:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2062:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2062:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2062:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==43) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2063:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2063:1: (lv_abstract_0_0= 'abstract' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2064:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,43,FOLLOW_43_in_ruleEMappingEntity4254); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleEMappingEntity4280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEMappingEntityAccess().getEntityKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2081:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2082:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2082:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2083:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity4297); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2099:2: ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==12||LA51_0==45) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2099:3: ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2099:3: ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2100:1: ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2100:1: ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2101:1: (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2101:1: (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==12) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==45) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2102:3: lv_extensionType_3_1= 'extends'
                            {
                            lv_extensionType_3_1=(Token)match(input,12,FOLLOW_12_in_ruleEMappingEntity4323); if (state.failed) return current;
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
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2114:8: lv_extensionType_3_2= 'derived'
                            {
                            lv_extensionType_3_2=(Token)match(input,45,FOLLOW_45_in_ruleEMappingEntity4352); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2129:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2130:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2130:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2131:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingEntity4391);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEMappingEntity4405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2148:1: ( (lv_etype_6_0= ruleEType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2149:1: (lv_etype_6_0= ruleEType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2149:1: (lv_etype_6_0= ruleEType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2150:3: lv_etype_6_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getEtypeETypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEType_in_ruleEMappingEntity4426);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2166:2: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==46) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2166:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleEMappingEntity4439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleEMappingEntity4451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_6_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2174:1: ( (lv_attributes_9_0= ruleEAttribute ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2175:1: (lv_attributes_9_0= ruleEAttribute )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2175:1: (lv_attributes_9_0= ruleEAttribute )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2176:3: lv_attributes_9_0= ruleEAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEAttribute_in_ruleEMappingEntity4472);
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2192:2: (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==15) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2192:4: otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEMappingEntity4485); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getEMappingEntityAccess().getCommaKeyword_6_3_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2196:1: ( (lv_attributes_11_0= ruleEAttribute ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2197:1: (lv_attributes_11_0= ruleEAttribute )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2197:1: (lv_attributes_11_0= ruleEAttribute )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2198:3: lv_attributes_11_0= ruleEAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEAttribute_in_ruleEMappingEntity4506);
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
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleEMappingEntity4520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2218:3: (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==47) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2218:5: otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}'
                    {
                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleEMappingEntity4535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEMappingEntityAccess().getQueriesKeyword_7_0());
                          
                    }
                    otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleEMappingEntity4547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2226:1: ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) )
                    int alt54=2;
                    switch ( input.LA(1) ) {
                    case 79:
                    case 80:
                        {
                        alt54=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA54_2 = input.LA(2);

                        if ( (LA54_2==13||LA54_2==25) ) {
                            alt54=1;
                        }
                        else if ( (LA54_2==RULE_ID||LA54_2==42) ) {
                            alt54=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 54, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 66:
                    case 72:
                        {
                        alt54=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2226:2: ( (lv_namedQueries_15_0= ruleENamedQuery ) )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2226:2: ( (lv_namedQueries_15_0= ruleENamedQuery ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2227:1: (lv_namedQueries_15_0= ruleENamedQuery )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2227:1: (lv_namedQueries_15_0= ruleENamedQuery )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2228:3: lv_namedQueries_15_0= ruleENamedQuery
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleENamedQuery_in_ruleEMappingEntity4569);
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
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2245:6: ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2245:6: ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2246:1: (lv_namedCustomQueries_16_0= ruleENamedCustomQuery )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2246:1: (lv_namedCustomQueries_16_0= ruleENamedCustomQuery )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2247:3: lv_namedCustomQueries_16_0= ruleENamedCustomQuery
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedCustomQueriesENamedCustomQueryParserRuleCall_7_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity4596);
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2263:3: (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2263:5: otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleEMappingEntity4610); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_17, grammarAccess.getEMappingEntityAccess().getCommaKeyword_7_3_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2267:1: ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) )
                    	    int alt55=2;
                    	    switch ( input.LA(1) ) {
                    	    case 79:
                    	    case 80:
                    	        {
                    	        alt55=1;
                    	        }
                    	        break;
                    	    case RULE_ID:
                    	        {
                    	        int LA55_2 = input.LA(2);

                    	        if ( (LA55_2==13||LA55_2==25) ) {
                    	            alt55=1;
                    	        }
                    	        else if ( (LA55_2==RULE_ID||LA55_2==42) ) {
                    	            alt55=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 55, 2, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 58:
                    	    case 59:
                    	    case 60:
                    	    case 61:
                    	    case 62:
                    	    case 63:
                    	    case 64:
                    	    case 66:
                    	    case 72:
                    	        {
                    	        alt55=2;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 55, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt55) {
                    	        case 1 :
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2267:2: ( (lv_namedQueries_18_0= ruleENamedQuery ) )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2267:2: ( (lv_namedQueries_18_0= ruleENamedQuery ) )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2268:1: (lv_namedQueries_18_0= ruleENamedQuery )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2268:1: (lv_namedQueries_18_0= ruleENamedQuery )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2269:3: lv_namedQueries_18_0= ruleENamedQuery
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_3_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleENamedQuery_in_ruleEMappingEntity4632);
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
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2286:6: ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2286:6: ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2287:1: (lv_namedCustomQueries_19_0= ruleENamedCustomQuery )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2287:1: (lv_namedCustomQueries_19_0= ruleENamedCustomQuery )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2288:3: lv_namedCustomQueries_19_0= ruleENamedCustomQuery
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedCustomQueriesENamedCustomQueryParserRuleCall_7_3_1_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity4659);
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
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleEMappingEntity4674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleEMappingEntity4688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_8());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2312:1: (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==34) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2312:3: otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) )
                    {
                    otherlv_22=(Token)match(input,34,FOLLOW_34_in_ruleEMappingEntity4701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getEMappingEntityAccess().getAsKeyword_9_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2316:1: ( (lv_tableName_23_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2317:1: (lv_tableName_23_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2317:1: (lv_tableName_23_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2318:3: lv_tableName_23_0= RULE_ID
                    {
                    lv_tableName_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity4718); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2334:4: (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==48) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2334:6: otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) )
                    {
                    otherlv_24=(Token)match(input,48,FOLLOW_48_in_ruleEMappingEntity4738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getEMappingEntityAccess().getDescriminatedbyKeyword_10_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2338:1: ( (lv_descriminationColumn_25_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2339:1: (lv_descriminationColumn_25_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2339:1: (lv_descriminationColumn_25_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2340:3: lv_descriminationColumn_25_0= RULE_ID
                    {
                    lv_descriminationColumn_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity4755); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2364:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2365:2: (iv_ruleEAttribute= ruleEAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2366:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_entryRuleEAttribute4798);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttribute4808); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2373:1: ruleEAttribute returns [EObject current=null] : ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? ) ;
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
        Token otherlv_21=null;
        Token lv_size_22_0=null;
        EObject lv_valueGenerators_7_0 = null;

        EObject lv_valueGenerators_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2376:28: ( ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2377:1: ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2377:1: ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2377:2: ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2377:2: ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||LA61_0==49) ) {
                alt61=1;
            }
            else if ( (LA61_0==50) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2377:3: ( (lv_pk_0_0= 'primarykey' ) )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2377:3: ( (lv_pk_0_0= 'primarykey' ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==49) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2378:1: (lv_pk_0_0= 'primarykey' )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2378:1: (lv_pk_0_0= 'primarykey' )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2379:3: lv_pk_0_0= 'primarykey'
                            {
                            lv_pk_0_0=(Token)match(input,49,FOLLOW_49_in_ruleEAttribute4852); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2393:6: ( (lv_forcedFk_1_0= 'forced-fk' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2393:6: ( (lv_forcedFk_1_0= 'forced-fk' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2394:1: (lv_forcedFk_1_0= 'forced-fk' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2394:1: (lv_forcedFk_1_0= 'forced-fk' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2395:3: lv_forcedFk_1_0= 'forced-fk'
                    {
                    lv_forcedFk_1_0=(Token)match(input,50,FOLLOW_50_in_ruleEAttribute4890); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2408:3: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2409:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2409:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2410:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute4921); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleEAttribute4938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2430:1: ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            else if ( (LA66_0==53) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2430:2: ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2430:2: ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2430:3: ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2430:3: ( (lv_columnName_4_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2431:1: (lv_columnName_4_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2431:1: (lv_columnName_4_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2432:3: lv_columnName_4_0= RULE_ID
                    {
                    lv_columnName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute4957); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2448:2: (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==52) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2448:4: otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}'
                            {
                            otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleEAttribute4975); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getEAttributeAccess().getGeneratedbyKeyword_3_0_1_0());
                                  
                            }
                            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleEAttribute4987); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_3_0_1_1());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2456:1: ( (lv_valueGenerators_7_0= ruleEValueGenerator ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2457:1: (lv_valueGenerators_7_0= ruleEValueGenerator )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2457:1: (lv_valueGenerators_7_0= ruleEValueGenerator )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2458:3: lv_valueGenerators_7_0= ruleEValueGenerator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEValueGenerator_in_ruleEAttribute5008);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2474:2: (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==15) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2474:4: otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEAttribute5021); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getCommaKeyword_3_0_1_3_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2478:1: ( (lv_valueGenerators_9_0= ruleEValueGenerator ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2479:1: (lv_valueGenerators_9_0= ruleEValueGenerator )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2479:1: (lv_valueGenerators_9_0= ruleEValueGenerator )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2480:3: lv_valueGenerators_9_0= ruleEValueGenerator
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEValueGenerator_in_ruleEAttribute5042);
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
                            	    break loop62;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleEAttribute5056); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2501:6: ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2501:6: ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2501:7: ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2501:7: ( (lv_resolved_11_0= 'resolve' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2502:1: (lv_resolved_11_0= 'resolve' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2502:1: (lv_resolved_11_0= 'resolve' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2503:3: lv_resolved_11_0= 'resolve'
                    {
                    lv_resolved_11_0=(Token)match(input,53,FOLLOW_53_in_ruleEAttribute5084); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2516:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2517:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2517:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2518:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEAttribute5120);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleEAttribute5132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2535:1: ( (lv_parameters_14_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2536:1: (lv_parameters_14_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2536:1: (lv_parameters_14_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2537:3: lv_parameters_14_0= RULE_ID
                    {
                    lv_parameters_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute5149); if (state.failed) return current;
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

                    otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleEAttribute5166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2557:1: ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_ID) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2557:2: ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )?
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2557:2: ( ( ruleQualifiedName ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2558:1: ( ruleQualifiedName )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2558:1: ( ruleQualifiedName )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2559:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getEAttributeRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getOppositeEAttributeCrossReference_3_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEAttribute5190);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_17=(Token)match(input,54,FOLLOW_54_in_ruleEAttribute5202); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getOnKeyword_3_1_5_1());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2576:1: ( (lv_relationTable_18_0= RULE_ID ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2577:1: (lv_relationTable_18_0= RULE_ID )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2577:1: (lv_relationTable_18_0= RULE_ID )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2578:3: lv_relationTable_18_0= RULE_ID
                            {
                            lv_relationTable_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute5219); if (state.failed) return current;
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2594:2: (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==42) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2594:4: otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) )
                                    {
                                    otherlv_19=(Token)match(input,42,FOLLOW_42_in_ruleEAttribute5237); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getFullStopKeyword_3_1_5_3_0());
                                          
                                    }
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2598:1: ( (lv_relationColumn_20_0= RULE_ID ) )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2599:1: (lv_relationColumn_20_0= RULE_ID )
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2599:1: (lv_relationColumn_20_0= RULE_ID )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2600:3: lv_relationColumn_20_0= RULE_ID
                                    {
                                    lv_relationColumn_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute5254); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2616:8: (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==31) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2616:10: otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_31_in_ruleEAttribute5278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getSizeKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2620:1: ( (lv_size_22_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2621:1: (lv_size_22_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2621:1: (lv_size_22_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2622:3: lv_size_22_0= RULE_STRING
                    {
                    lv_size_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEAttribute5295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_size_22_0, grammarAccess.getEAttributeAccess().getSizeSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"size",
                              		lv_size_22_0, 
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
    // $ANTLR end "ruleEAttribute"


    // $ANTLR start "entryRuleEValueGenerator"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2646:1: entryRuleEValueGenerator returns [EObject current=null] : iv_ruleEValueGenerator= ruleEValueGenerator EOF ;
    public final EObject entryRuleEValueGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueGenerator = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2647:2: (iv_ruleEValueGenerator= ruleEValueGenerator EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2648:2: iv_ruleEValueGenerator= ruleEValueGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEValueGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator5338);
            iv_ruleEValueGenerator=ruleEValueGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEValueGenerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEValueGenerator5348); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2655:1: ruleEValueGenerator returns [EObject current=null] : ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2658:28: ( ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2659:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2659:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2659:2: ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2659:2: ( (lv_dbType_0_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2660:1: (lv_dbType_0_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2660:1: (lv_dbType_0_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2661:3: lv_dbType_0_0= RULE_STRING
            {
            lv_dbType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator5390); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2677:2: ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt68=1;
                }
                break;
            case 56:
                {
                alt68=2;
                }
                break;
            case 57:
                {
                alt68=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2677:3: ( (lv_autokey_1_0= 'autokey' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2677:3: ( (lv_autokey_1_0= 'autokey' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2678:1: (lv_autokey_1_0= 'autokey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2678:1: (lv_autokey_1_0= 'autokey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2679:3: lv_autokey_1_0= 'autokey'
                    {
                    lv_autokey_1_0=(Token)match(input,55,FOLLOW_55_in_ruleEValueGenerator5414); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2693:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2693:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2693:8: otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleEValueGenerator5446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEValueGeneratorAccess().getQueryKeyword_1_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2697:1: ( (lv_query_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2698:1: (lv_query_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2698:1: (lv_query_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2699:3: lv_query_3_0= RULE_STRING
                    {
                    lv_query_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator5463); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2716:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2716:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2716:8: otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleEValueGenerator5488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEValueGeneratorAccess().getSeqnextKeyword_1_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2720:1: ( (lv_sequence_5_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2721:1: (lv_sequence_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2721:1: (lv_sequence_5_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2722:3: lv_sequence_5_0= RULE_STRING
                    {
                    lv_sequence_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator5505); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2746:1: entryRuleENamedQuery returns [EObject current=null] : iv_ruleENamedQuery= ruleENamedQuery EOF ;
    public final EObject entryRuleENamedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2747:2: (iv_ruleENamedQuery= ruleENamedQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2748:2: iv_ruleENamedQuery= ruleENamedQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery5548);
            iv_ruleENamedQuery=ruleENamedQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedQuery5558); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2755:1: ruleENamedQuery returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2758:28: ( ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2759:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2759:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2759:2: ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2759:2: ( (lv_returnType_0_0= ruleReturnType ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=79 && LA69_0<=80)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2760:1: (lv_returnType_0_0= ruleReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2760:1: (lv_returnType_0_0= ruleReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2761:3: lv_returnType_0_0= ruleReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getReturnTypeReturnTypeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnType_in_ruleENamedQuery5604);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2777:3: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2778:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2778:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2779:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleENamedQuery5622); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2795:2: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==25) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2795:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleENamedQuery5640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2799:1: ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_ID||LA71_0==49||(LA71_0>=58 && LA71_0<=62)||LA71_0==64) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2799:2: ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2799:2: ( (lv_parameters_3_0= ruleEParameter ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2800:1: (lv_parameters_3_0= ruleEParameter )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2800:1: (lv_parameters_3_0= ruleEParameter )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2801:3: lv_parameters_3_0= ruleEParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEParameter_in_ruleENamedQuery5662);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2817:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==15) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2817:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleENamedQuery5675); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getENamedQueryAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2821:1: ( (lv_parameters_5_0= ruleEParameter ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2822:1: (lv_parameters_5_0= ruleEParameter )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2822:1: (lv_parameters_5_0= ruleEParameter )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2823:3: lv_parameters_5_0= ruleEParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEParameter_in_ruleENamedQuery5696);
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
                            	    break loop70;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleENamedQuery5712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleENamedQuery5726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2847:1: ( (lv_queries_8_0= ruleEQuery ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2848:1: (lv_queries_8_0= ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2848:1: (lv_queries_8_0= ruleEQuery )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2849:3: lv_queries_8_0= ruleEQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEQuery_in_ruleENamedQuery5747);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2865:2: (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==15) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2865:4: otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleENamedQuery5760); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getENamedQueryAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2869:1: ( (lv_queries_10_0= ruleEQuery ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2870:1: (lv_queries_10_0= ruleEQuery )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2870:1: (lv_queries_10_0= ruleEQuery )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2871:3: lv_queries_10_0= ruleEQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQuery_in_ruleENamedQuery5781);
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
            	    break loop73;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleENamedQuery5795); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2899:1: entryRuleEPrimtiveType returns [String current=null] : iv_ruleEPrimtiveType= ruleEPrimtiveType EOF ;
    public final String entryRuleEPrimtiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEPrimtiveType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2900:2: (iv_ruleEPrimtiveType= ruleEPrimtiveType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2901:2: iv_ruleEPrimtiveType= ruleEPrimtiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPrimtiveTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEPrimtiveType_in_entryRuleEPrimtiveType5832);
            iv_ruleEPrimtiveType=ruleEPrimtiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPrimtiveType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPrimtiveType5843); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2908:1: ruleEPrimtiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleEPrimtiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_5 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2911:28: ( (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2912:1: (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2912:1: (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN )
            int alt74=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt74=1;
                }
                break;
            case 59:
                {
                alt74=2;
                }
                break;
            case 60:
                {
                alt74=3;
                }
                break;
            case 61:
                {
                alt74=4;
                }
                break;
            case 62:
                {
                alt74=5;
                }
                break;
            case RULE_ID:
                {
                alt74=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2913:2: kw= 'int'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleEPrimtiveType5881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getIntKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2920:2: kw= 'long'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleEPrimtiveType5900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getLongKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2927:2: kw= 'double'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleEPrimtiveType5919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getDoubleKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2934:2: kw= 'float'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleEPrimtiveType5938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getFloatKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2941:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleEPrimtiveType5957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getBooleanKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2948:5: this_FQN_5= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEPrimtiveTypeAccess().getFQNParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEPrimtiveType5985);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2966:1: entryRuleEMapType returns [String current=null] : iv_ruleEMapType= ruleEMapType EOF ;
    public final String entryRuleEMapType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMapType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2967:2: (iv_ruleEMapType= ruleEMapType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2968:2: iv_ruleEMapType= ruleEMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMapTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEMapType_in_entryRuleEMapType6031);
            iv_ruleEMapType=ruleEMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMapType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMapType6042); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2975:1: ruleEMapType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'map' ;
    public final AntlrDatatypeRuleToken ruleEMapType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2978:28: (kw= 'map' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2980:2: kw= 'map'
            {
            kw=(Token)match(input,63,FOLLOW_63_in_ruleEMapType6079); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2993:1: entryRuleENamedCustomQuery returns [EObject current=null] : iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF ;
    public final EObject entryRuleENamedCustomQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedCustomQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2994:2: (iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2995:2: iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedCustomQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedCustomQuery_in_entryRuleENamedCustomQuery6118);
            iv_ruleENamedCustomQuery=ruleENamedCustomQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedCustomQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedCustomQuery6128); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3002:1: ruleENamedCustomQuery returns [EObject current=null] : ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' ) ;
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
        Token otherlv_14=null;
        EObject lv_returnType_0_0 = null;

        EObject lv_returnType_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_queries_11_0 = null;

        EObject lv_queries_13_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3005:28: ( ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3006:1: ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3006:1: ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3006:2: ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3006:2: ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID||(LA75_0>=58 && LA75_0<=63)||LA75_0==66||LA75_0==72) ) {
                alt75=1;
            }
            else if ( (LA75_0==64) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3006:3: ( (lv_returnType_0_0= ruleEReturnType ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3006:3: ( (lv_returnType_0_0= ruleEReturnType ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3007:1: (lv_returnType_0_0= ruleEReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3007:1: (lv_returnType_0_0= ruleEReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3008:3: lv_returnType_0_0= ruleEReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getReturnTypeEReturnTypeParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery6175);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3025:6: ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3025:6: ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3025:7: ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3025:7: ( (lv_list_1_0= '[' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3026:1: (lv_list_1_0= '[' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3026:1: (lv_list_1_0= '[' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3027:3: lv_list_1_0= '['
                    {
                    lv_list_1_0=(Token)match(input,64,FOLLOW_64_in_ruleENamedCustomQuery6200); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3040:2: ( (lv_returnType_2_0= ruleEReturnType ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3041:1: (lv_returnType_2_0= ruleEReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3041:1: (lv_returnType_2_0= ruleEReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3042:3: lv_returnType_2_0= ruleEReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getReturnTypeEReturnTypeParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery6234);
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

                    otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleENamedCustomQuery6246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getENamedCustomQueryAccess().getRightSquareBracketKeyword_0_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3062:3: ( (lv_name_4_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3063:1: (lv_name_4_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3063:1: (lv_name_4_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3064:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleENamedCustomQuery6265); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3080:2: (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==25) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3080:4: otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleENamedCustomQuery6283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getENamedCustomQueryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3084:1: ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_ID||LA77_0==49||(LA77_0>=58 && LA77_0<=62)||LA77_0==64) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3084:2: ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3084:2: ( (lv_parameters_6_0= ruleEParameter ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3085:1: (lv_parameters_6_0= ruleEParameter )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3085:1: (lv_parameters_6_0= ruleEParameter )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3086:3: lv_parameters_6_0= ruleEParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getParametersEParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEParameter_in_ruleENamedCustomQuery6305);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3102:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )*
                            loop76:
                            do {
                                int alt76=2;
                                int LA76_0 = input.LA(1);

                                if ( (LA76_0==15) ) {
                                    alt76=1;
                                }


                                switch (alt76) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3102:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) )
                            	    {
                            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleENamedCustomQuery6318); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_7, grammarAccess.getENamedCustomQueryAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3106:1: ( (lv_parameters_8_0= ruleEParameter ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3107:1: (lv_parameters_8_0= ruleEParameter )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3107:1: (lv_parameters_8_0= ruleEParameter )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3108:3: lv_parameters_8_0= ruleEParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getParametersEParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEParameter_in_ruleENamedCustomQuery6339);
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
                            	    break loop76;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleENamedCustomQuery6355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getENamedCustomQueryAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleENamedCustomQuery6369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getENamedCustomQueryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3132:1: ( (lv_queries_11_0= ruleECustomQuery ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3133:1: (lv_queries_11_0= ruleECustomQuery )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3133:1: (lv_queries_11_0= ruleECustomQuery )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3134:3: lv_queries_11_0= ruleECustomQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getQueriesECustomQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleECustomQuery_in_ruleENamedCustomQuery6390);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3150:2: (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==15) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3150:4: otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleENamedCustomQuery6403); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getENamedCustomQueryAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3154:1: ( (lv_queries_13_0= ruleECustomQuery ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3155:1: (lv_queries_13_0= ruleECustomQuery )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3155:1: (lv_queries_13_0= ruleECustomQuery )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3156:3: lv_queries_13_0= ruleECustomQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getQueriesECustomQueryParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleECustomQuery_in_ruleENamedCustomQuery6424);
            	    lv_queries_13_0=ruleECustomQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getENamedCustomQueryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"queries",
            	              		lv_queries_13_0, 
            	              		"ECustomQuery");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleENamedCustomQuery6438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getENamedCustomQueryAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3184:1: entryRuleEReturnType returns [EObject current=null] : iv_ruleEReturnType= ruleEReturnType EOF ;
    public final EObject entryRuleEReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReturnType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3185:2: (iv_ruleEReturnType= ruleEReturnType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3186:2: iv_ruleEReturnType= ruleEReturnType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEReturnTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEReturnType_in_entryRuleEReturnType6474);
            iv_ruleEReturnType=ruleEReturnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEReturnType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEReturnType6484); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3193:1: ruleEReturnType returns [EObject current=null] : (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef ) ;
    public final EObject ruleEReturnType() throws RecognitionException {
        EObject current = null;

        EObject this_EPredefinedType_0 = null;

        EObject this_ETypeDef_1 = null;

        EObject this_EModelTypeDef_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3196:28: ( (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3197:1: (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3197:1: (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef )
            int alt80=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt80=1;
                }
                break;
            case 66:
                {
                alt80=2;
                }
                break;
            case 72:
                {
                alt80=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3198:5: this_EPredefinedType_0= ruleEPredefinedType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getEPredefinedTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEPredefinedType_in_ruleEReturnType6531);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3208:5: this_ETypeDef_1= ruleETypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getETypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleETypeDef_in_ruleEReturnType6558);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3218:5: this_EModelTypeDef_2= ruleEModelTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getEModelTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEModelTypeDef_in_ruleEReturnType6585);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3234:1: entryRuleEPredefinedType returns [EObject current=null] : iv_ruleEPredefinedType= ruleEPredefinedType EOF ;
    public final EObject entryRuleEPredefinedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPredefinedType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3235:2: (iv_ruleEPredefinedType= ruleEPredefinedType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3236:2: iv_ruleEPredefinedType= ruleEPredefinedType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPredefinedTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEPredefinedType_in_entryRuleEPredefinedType6620);
            iv_ruleEPredefinedType=ruleEPredefinedType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPredefinedType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPredefinedType6630); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3243:1: ruleEPredefinedType returns [EObject current=null] : ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) ) ;
    public final EObject ruleEPredefinedType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ref_0_1 = null;

        AntlrDatatypeRuleToken lv_ref_0_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3246:28: ( ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3247:1: ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3247:1: ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3248:1: ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3248:1: ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3249:1: (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3249:1: (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==63) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_ID||(LA81_0>=58 && LA81_0<=62)) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3250:3: lv_ref_0_1= ruleEMapType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEPredefinedTypeAccess().getRefEMapTypeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEMapType_in_ruleEPredefinedType6677);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3265:8: lv_ref_0_2= ruleEPrimtiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEPredefinedTypeAccess().getRefEPrimtiveTypeParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEPredefinedType6696);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3291:1: entryRuleETypeDef returns [EObject current=null] : iv_ruleETypeDef= ruleETypeDef EOF ;
    public final EObject entryRuleETypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3292:2: (iv_ruleETypeDef= ruleETypeDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3293:2: iv_ruleETypeDef= ruleETypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleETypeDef_in_entryRuleETypeDef6734);
            iv_ruleETypeDef=ruleETypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleETypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleETypeDef6744); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3300:1: ruleETypeDef returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3303:28: ( (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3304:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3304:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3304:3: otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleETypeDef6781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getETypeDefAccess().getTypedefKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3308:1: ( (lv_name_1_0= ruleFQN ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3309:1: (lv_name_1_0= ruleFQN )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3309:1: (lv_name_1_0= ruleFQN )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3310:3: lv_name_1_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getETypeDefAccess().getNameFQNParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleETypeDef6802);
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleETypeDef6814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getETypeDefAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3330:1: ( (lv_types_3_0= ruleEValueTypeAttribute ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3331:1: (lv_types_3_0= ruleEValueTypeAttribute )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3331:1: (lv_types_3_0= ruleEValueTypeAttribute )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3332:3: lv_types_3_0= ruleEValueTypeAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getETypeDefAccess().getTypesEValueTypeAttributeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef6835);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3348:2: (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==15) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3348:4: otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleETypeDef6848); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getETypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3352:1: ( (lv_types_5_0= ruleEValueTypeAttribute ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3353:1: (lv_types_5_0= ruleEValueTypeAttribute )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3353:1: (lv_types_5_0= ruleEValueTypeAttribute )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3354:3: lv_types_5_0= ruleEValueTypeAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getETypeDefAccess().getTypesEValueTypeAttributeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef6869);
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
            	    break loop82;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleETypeDef6883); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3382:1: entryRuleEModelTypeDef returns [EObject current=null] : iv_ruleEModelTypeDef= ruleEModelTypeDef EOF ;
    public final EObject entryRuleEModelTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelTypeDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3383:2: (iv_ruleEModelTypeDef= ruleEModelTypeDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3384:2: iv_ruleEModelTypeDef= ruleEModelTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEModelTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleEModelTypeDef_in_entryRuleEModelTypeDef6919);
            iv_ruleEModelTypeDef=ruleEModelTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEModelTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEModelTypeDef6929); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3391:1: ruleEModelTypeDef returns [EObject current=null] : ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3394:28: ( ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3395:1: ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3395:1: ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3395:2: ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3395:2: ( (lv_eclassDef_0_0= ruleEType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3396:1: (lv_eclassDef_0_0= ruleEType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3396:1: (lv_eclassDef_0_0= ruleEType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3397:3: lv_eclassDef_0_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getEclassDefETypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEType_in_ruleEModelTypeDef6975);
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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEModelTypeDef6987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEModelTypeDefAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3417:1: ( (lv_attributes_2_0= ruleEModelTypeAttribute ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3418:1: (lv_attributes_2_0= ruleEModelTypeAttribute )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3418:1: (lv_attributes_2_0= ruleEModelTypeAttribute )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3419:3: lv_attributes_2_0= ruleEModelTypeAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getAttributesEModelTypeAttributeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef7008);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3435:2: (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==15) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3435:4: otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEModelTypeDef7021); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEModelTypeDefAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3439:1: ( (lv_attributes_4_0= ruleEModelTypeAttribute ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3440:1: (lv_attributes_4_0= ruleEModelTypeAttribute )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3440:1: (lv_attributes_4_0= ruleEModelTypeAttribute )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3441:3: lv_attributes_4_0= ruleEModelTypeAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getAttributesEModelTypeAttributeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef7042);
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
            	    break loop83;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEModelTypeDef7056); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3469:1: entryRuleEModelTypeAttribute returns [EObject current=null] : iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF ;
    public final EObject entryRuleEModelTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelTypeAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3470:2: (iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3471:2: iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEModelTypeAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEModelTypeAttribute_in_entryRuleEModelTypeAttribute7092);
            iv_ruleEModelTypeAttribute=ruleEModelTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEModelTypeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEModelTypeAttribute7102); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3478:1: ruleEModelTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3481:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3482:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3482:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3482:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3482:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3483:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3483:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3484:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute7144); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3500:2: (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==53) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3500:4: otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )?
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleEModelTypeAttribute7162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEModelTypeAttributeAccess().getResolveKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3504:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3505:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3505:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3506:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEModelTypeAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEModelTypeAttributeAccess().getQueryENamedCustomQueryCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEModelTypeAttribute7185);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3519:2: (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==25) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3519:4: otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')'
                            {
                            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleEModelTypeAttribute7198); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getEModelTypeAttributeAccess().getLeftParenthesisKeyword_1_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3523:1: ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )?
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==RULE_ID) ) {
                                alt85=1;
                            }
                            switch (alt85) {
                                case 1 :
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3523:2: ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3523:2: ( (lv_parameters_4_0= RULE_ID ) )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3524:1: (lv_parameters_4_0= RULE_ID )
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3524:1: (lv_parameters_4_0= RULE_ID )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3525:3: lv_parameters_4_0= RULE_ID
                                    {
                                    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute7216); if (state.failed) return current;
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

                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3541:2: (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
                                    loop84:
                                    do {
                                        int alt84=2;
                                        int LA84_0 = input.LA(1);

                                        if ( (LA84_0==15) ) {
                                            alt84=1;
                                        }


                                        switch (alt84) {
                                    	case 1 :
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3541:4: otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) )
                                    	    {
                                    	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEModelTypeAttribute7234); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_5, grammarAccess.getEModelTypeAttributeAccess().getCommaKeyword_1_2_1_1_0());
                                    	          
                                    	    }
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3545:1: ( (lv_parameters_6_0= RULE_ID ) )
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3546:1: (lv_parameters_6_0= RULE_ID )
                                    	    {
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3546:1: (lv_parameters_6_0= RULE_ID )
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3547:3: lv_parameters_6_0= RULE_ID
                                    	    {
                                    	    lv_parameters_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute7251); if (state.failed) return current;
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
                                    	    break loop84;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleEModelTypeAttribute7272); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getEModelTypeAttributeAccess().getRightParenthesisKeyword_1_2_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3567:3: ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==67) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3567:4: ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )?
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3567:4: ( (lv_cached_8_0= 'cached' ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3568:1: (lv_cached_8_0= 'cached' )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3568:1: (lv_cached_8_0= 'cached' )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3569:3: lv_cached_8_0= 'cached'
                            {
                            lv_cached_8_0=(Token)match(input,67,FOLLOW_67_in_ruleEModelTypeAttribute7293); if (state.failed) return current;
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3582:2: ( (lv_cacheName_9_0= RULE_ID ) )?
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==RULE_ID) ) {
                                alt87=1;
                            }
                            switch (alt87) {
                                case 1 :
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3583:1: (lv_cacheName_9_0= RULE_ID )
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3583:1: (lv_cacheName_9_0= RULE_ID )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3584:3: lv_cacheName_9_0= RULE_ID
                                    {
                                    lv_cacheName_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute7323); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3608:1: entryRuleEValueTypeAttribute returns [EObject current=null] : iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF ;
    public final EObject entryRuleEValueTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueTypeAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3609:2: (iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3610:2: iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEValueTypeAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEValueTypeAttribute_in_entryRuleEValueTypeAttribute7369);
            iv_ruleEValueTypeAttribute=ruleEValueTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEValueTypeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEValueTypeAttribute7379); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3617:1: ruleEValueTypeAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEValueTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3620:28: ( ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3621:1: ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3621:1: ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3621:2: ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3621:2: ( (lv_type_0_0= ruleEPrimtiveType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3622:1: (lv_type_0_0= ruleEPrimtiveType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3622:1: (lv_type_0_0= ruleEPrimtiveType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3623:3: lv_type_0_0= ruleEPrimtiveType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEValueTypeAttributeAccess().getTypeEPrimtiveTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEValueTypeAttribute7425);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3639:2: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3640:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3640:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3641:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEValueTypeAttribute7442); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3665:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3666:2: (iv_ruleEParameter= ruleEParameter EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3667:2: iv_ruleEParameter= ruleEParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEParameterRule()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_entryRuleEParameter7483);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEParameter7493); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3674:1: ruleEParameter returns [EObject current=null] : ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_list_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3677:28: ( ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3678:1: ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3678:1: ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3678:2: ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3678:2: ( (lv_id_0_0= 'primarykey' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==49) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3679:1: (lv_id_0_0= 'primarykey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3679:1: (lv_id_0_0= 'primarykey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3680:3: lv_id_0_0= 'primarykey'
                    {
                    lv_id_0_0=(Token)match(input,49,FOLLOW_49_in_ruleEParameter7536); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3693:3: ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_ID||(LA91_0>=58 && LA91_0<=62)) ) {
                alt91=1;
            }
            else if ( (LA91_0==64) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3693:4: ( (lv_type_1_0= ruleEPrimtiveType ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3693:4: ( (lv_type_1_0= ruleEPrimtiveType ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3694:1: (lv_type_1_0= ruleEPrimtiveType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3694:1: (lv_type_1_0= ruleEPrimtiveType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3695:3: lv_type_1_0= ruleEPrimtiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEParameterAccess().getTypeEPrimtiveTypeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEParameter7572);
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


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3712:6: ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3712:6: ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3712:7: ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3712:7: ( (lv_list_2_0= '[' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3713:1: (lv_list_2_0= '[' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3713:1: (lv_list_2_0= '[' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3714:3: lv_list_2_0= '['
                    {
                    lv_list_2_0=(Token)match(input,64,FOLLOW_64_in_ruleEParameter7597); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_list_2_0, grammarAccess.getEParameterAccess().getListLeftSquareBracketKeyword_1_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEParameterRule());
                      	        }
                             		setWithLastConsumed(current, "list", true, "[");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3727:2: ( (lv_type_3_0= ruleEPrimtiveType ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3728:1: (lv_type_3_0= ruleEPrimtiveType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3728:1: (lv_type_3_0= ruleEPrimtiveType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3729:3: lv_type_3_0= ruleEPrimtiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEParameterAccess().getTypeEPrimtiveTypeParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEParameter7631);
                    lv_type_3_0=ruleEPrimtiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"EPrimtiveType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleEParameter7643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getRightSquareBracketKeyword_1_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3749:3: ( (lv_name_5_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3750:1: (lv_name_5_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3750:1: (lv_name_5_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3751:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEParameter7662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3775:1: entryRuleEQuery returns [EObject current=null] : iv_ruleEQuery= ruleEQuery EOF ;
    public final EObject entryRuleEQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3776:2: (iv_ruleEQuery= ruleEQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3777:2: iv_ruleEQuery= ruleEQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQueryRule()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_entryRuleEQuery7703);
            iv_ruleEQuery=ruleEQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQuery7713); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3784:1: ruleEQuery returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3787:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3788:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3788:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3788:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3788:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3789:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3789:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3790:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3790:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==30) ) {
                alt92=1;
            }
            else if ( (LA92_0==RULE_STRING) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3791:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,30,FOLLOW_30_in_ruleEQuery7758); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3803:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7786); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3821:2: ( (lv_mapping_1_0= ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3822:1: (lv_mapping_1_0= ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3822:1: (lv_mapping_1_0= ruleEObjectSection )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3823:3: lv_mapping_1_0= ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_ruleEQuery7815);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3839:2: ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==68) ) {
                alt96=1;
            }
            else if ( (LA96_0==RULE_STRING) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3839:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3839:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3839:5: otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleEQuery7829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3843:1: ( (lv_from_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3844:1: (lv_from_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3844:1: (lv_from_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3845:3: lv_from_3_0= RULE_STRING
                    {
                    lv_from_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7846); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3861:2: (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==69) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3861:4: otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleEQuery7864); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3865:1: ( (lv_where_5_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3866:1: (lv_where_5_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3866:1: (lv_where_5_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3867:3: lv_where_5_0= RULE_STRING
                            {
                            lv_where_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7881); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3883:4: (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==70) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3883:6: otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,70,FOLLOW_70_in_ruleEQuery7901); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3887:1: ( (lv_groupBy_7_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3888:1: (lv_groupBy_7_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3888:1: (lv_groupBy_7_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3889:3: lv_groupBy_7_0= RULE_STRING
                            {
                            lv_groupBy_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7918); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3905:4: (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==71) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3905:6: otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,71,FOLLOW_71_in_ruleEQuery7938); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3909:1: ( (lv_orderby_9_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3910:1: (lv_orderby_9_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3910:1: (lv_orderby_9_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3911:3: lv_orderby_9_0= RULE_STRING
                            {
                            lv_orderby_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7955); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3928:6: ( (lv_all_10_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3928:6: ( (lv_all_10_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3929:1: (lv_all_10_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3929:1: (lv_all_10_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3930:3: lv_all_10_0= RULE_STRING
                    {
                    lv_all_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7986); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3954:1: entryRuleECustomQuery returns [EObject current=null] : iv_ruleECustomQuery= ruleECustomQuery EOF ;
    public final EObject entryRuleECustomQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECustomQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3955:2: (iv_ruleECustomQuery= ruleECustomQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3956:2: iv_ruleECustomQuery= ruleECustomQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECustomQueryRule()); 
            }
            pushFollow(FOLLOW_ruleECustomQuery_in_entryRuleECustomQuery8028);
            iv_ruleECustomQuery=ruleECustomQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECustomQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECustomQuery8038); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3963:1: ruleECustomQuery returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3966:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3967:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3967:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3967:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3967:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3968:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3968:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3969:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3969:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==30) ) {
                alt97=1;
            }
            else if ( (LA97_0==RULE_STRING) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3970:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,30,FOLLOW_30_in_ruleECustomQuery8083); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3982:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery8111); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4000:2: ( (lv_columns_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4001:1: (lv_columns_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4001:1: (lv_columns_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4002:3: lv_columns_1_0= RULE_STRING
            {
            lv_columns_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery8136); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4018:2: ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==68) ) {
                alt101=1;
            }
            else if ( (LA101_0==RULE_STRING) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4018:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4018:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4018:5: otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleECustomQuery8155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getECustomQueryAccess().getFROMKeyword_2_0_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4022:1: ( (lv_from_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4023:1: (lv_from_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4023:1: (lv_from_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4024:3: lv_from_3_0= RULE_STRING
                    {
                    lv_from_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery8172); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4040:2: (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==69) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4040:4: otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleECustomQuery8190); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getECustomQueryAccess().getWHEREKeyword_2_0_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4044:1: ( (lv_where_5_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4045:1: (lv_where_5_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4045:1: (lv_where_5_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4046:3: lv_where_5_0= RULE_STRING
                            {
                            lv_where_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery8207); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4062:4: (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==70) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4062:6: otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,70,FOLLOW_70_in_ruleECustomQuery8227); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getECustomQueryAccess().getGROUPBYKeyword_2_0_3_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4066:1: ( (lv_groupBy_7_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4067:1: (lv_groupBy_7_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4067:1: (lv_groupBy_7_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4068:3: lv_groupBy_7_0= RULE_STRING
                            {
                            lv_groupBy_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery8244); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4084:4: (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==71) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4084:6: otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,71,FOLLOW_71_in_ruleECustomQuery8264); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getECustomQueryAccess().getORDERBYKeyword_2_0_4_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4088:1: ( (lv_orderby_9_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4089:1: (lv_orderby_9_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4089:1: (lv_orderby_9_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4090:3: lv_orderby_9_0= RULE_STRING
                            {
                            lv_orderby_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery8281); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4107:6: ( (lv_all_10_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4107:6: ( (lv_all_10_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4108:1: (lv_all_10_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4108:1: (lv_all_10_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4109:3: lv_all_10_0= RULE_STRING
                    {
                    lv_all_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery8312); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4133:1: entryRuleEObjectSection returns [EObject current=null] : iv_ruleEObjectSection= ruleEObjectSection EOF ;
    public final EObject entryRuleEObjectSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectSection = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4134:2: (iv_ruleEObjectSection= ruleEObjectSection EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4135:2: iv_ruleEObjectSection= ruleEObjectSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEObjectSectionRule()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection8354);
            iv_ruleEObjectSection=ruleEObjectSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEObjectSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEObjectSection8364); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4142:1: ruleEObjectSection returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4145:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4146:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4146:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4146:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4146:2: ( (otherlv_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4147:1: (otherlv_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4147:1: (otherlv_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4148:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEObjectSectionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection8409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
              	
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4159:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==25) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4159:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEObjectSection8422); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEObjectSectionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4163:1: ( (otherlv_2= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4164:1: (otherlv_2= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4164:1: (otherlv_2= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4165:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection8442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4176:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+
                    int cnt102=0;
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==15) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4176:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEObjectSection8455); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4180:1: ( (otherlv_4= RULE_ID ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4181:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4181:1: (otherlv_4= RULE_ID )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4182:3: otherlv_4= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection8475); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_4, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt102 >= 1 ) break loop102;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(102, input);
                                throw eee;
                        }
                        cnt102++;
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEObjectSection8489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEObjectSectionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4197:3: ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_ID) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4197:4: ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4197:4: ( (lv_prefix_6_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4198:1: (lv_prefix_6_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4198:1: (lv_prefix_6_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4199:3: lv_prefix_6_0= RULE_ID
                    {
                    lv_prefix_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection8509); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4215:2: (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==13) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4215:4: otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}'
                            {
                            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleEObjectSection8527); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_2_1_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4219:1: ( (lv_attributes_8_0= ruleEMappingAttribute ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4220:1: (lv_attributes_8_0= ruleEMappingAttribute )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4220:1: (lv_attributes_8_0= ruleEMappingAttribute )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4221:3: lv_attributes_8_0= ruleEMappingAttribute
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection8548);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4237:2: (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )*
                            loop104:
                            do {
                                int alt104=2;
                                int LA104_0 = input.LA(1);

                                if ( (LA104_0==15) ) {
                                    alt104=1;
                                }


                                switch (alt104) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4237:4: otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            	    {
                            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleEObjectSection8561); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getEObjectSectionAccess().getCommaKeyword_2_1_2_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4241:1: ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4242:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4242:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4243:3: lv_attributes_10_0= ruleEMappingAttribute
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection8582);
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
                            	    break loop104;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleEObjectSection8596); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4271:1: entryRuleEMappingAttribute returns [EObject current=null] : iv_ruleEMappingAttribute= ruleEMappingAttribute EOF ;
    public final EObject entryRuleEMappingAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4272:2: (iv_ruleEMappingAttribute= ruleEMappingAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4273:2: iv_ruleEMappingAttribute= ruleEMappingAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute8636);
            iv_ruleEMappingAttribute=ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingAttribute8646); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4280:1: ruleEMappingAttribute returns [EObject current=null] : ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4283:28: ( ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4284:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4284:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4284:2: ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4284:2: ( (lv_pk_0_0= 'primarykey' ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==49) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4285:1: (lv_pk_0_0= 'primarykey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4285:1: (lv_pk_0_0= 'primarykey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4286:3: lv_pk_0_0= 'primarykey'
                    {
                    lv_pk_0_0=(Token)match(input,49,FOLLOW_49_in_ruleEMappingAttribute8689); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4299:3: ( (lv_property_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4300:1: (lv_property_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4300:1: (lv_property_1_0= ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4301:3: lv_property_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute8724);
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

            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleEMappingAttribute8736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4321:1: ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            int alt108=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt108=1;
                }
                break;
            case 53:
                {
                alt108=2;
                }
                break;
            case 63:
                {
                alt108=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4321:2: ( (lv_columnName_3_0= RULE_ID ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4321:2: ( (lv_columnName_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4322:1: (lv_columnName_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4322:1: (lv_columnName_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4323:3: lv_columnName_3_0= RULE_ID
                    {
                    lv_columnName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingAttribute8754); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4340:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4340:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4340:7: ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4340:7: ( (lv_resolved_4_0= 'resolve' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4341:1: (lv_resolved_4_0= 'resolve' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4341:1: (lv_resolved_4_0= 'resolve' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4342:3: lv_resolved_4_0= 'resolve'
                    {
                    lv_resolved_4_0=(Token)match(input,53,FOLLOW_53_in_ruleEMappingAttribute8784); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4355:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4356:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4356:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4357:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute8820);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleEMappingAttribute8832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4374:1: ( (lv_parameters_7_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4375:1: (lv_parameters_7_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4375:1: (lv_parameters_7_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4376:3: lv_parameters_7_0= RULE_ID
                    {
                    lv_parameters_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingAttribute8849); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleEMappingAttribute8866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4397:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4397:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4397:7: ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4397:7: ( (lv_mapped_9_0= 'map' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4398:1: (lv_mapped_9_0= 'map' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4398:1: (lv_mapped_9_0= 'map' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4399:3: lv_mapped_9_0= 'map'
                    {
                    lv_mapped_9_0=(Token)match(input,63,FOLLOW_63_in_ruleEMappingAttribute8892); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4412:2: ( (lv_map_10_0= ruleEObjectSection ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4413:1: (lv_map_10_0= ruleEObjectSection )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4413:1: (lv_map_10_0= ruleEObjectSection )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4414:3: lv_map_10_0= ruleEObjectSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEObjectSection_in_ruleEMappingAttribute8926);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4438:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4439:2: (iv_ruleEType= ruleEType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4440:2: iv_ruleEType= ruleEType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETypeRule()); 
            }
            pushFollow(FOLLOW_ruleEType_in_entryRuleEType8964);
            iv_ruleEType=ruleEType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEType8974); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4447:1: ruleEType returns [EObject current=null] : (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4450:28: ( (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4451:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4451:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4451:3: otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleEType9011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getEtypeKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4455:1: ( (lv_url_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4456:1: (lv_url_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4456:1: (lv_url_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4457:3: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEType9028); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleEType9045); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getETypeAccess().getNumberSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4477:1: ( (lv_name_3_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4478:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4478:1: (lv_name_3_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4479:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEType9062); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4503:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4504:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4505:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9104);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9115); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4512:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4515:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4516:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4516:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4516:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4523:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==42) ) {
                    int LA109_2 = input.LA(2);

                    if ( (LA109_2==RULE_ID) && (synpred2_InternalEMap())) {
                        alt109=1;
                    }


                }


                switch (alt109) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4523:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4523:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4523:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifiedName9183); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9199); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop109;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4546:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4547:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4548:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9247);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9258); if (state.failed) return current;

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4555:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4558:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4559:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4559:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4560:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9305);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifiedNameWithWildcard9323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,74,FOLLOW_74_in_ruleQualifiedNameWithWildcard9336); if (state.failed) return current;
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


    // $ANTLR start "ruleColSort"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4590:1: ruleColSort returns [Enumerator current=null] : ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) ) ;
    public final Enumerator ruleColSort() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4592:28: ( ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4593:1: ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4593:1: ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) )
            int alt110=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt110=1;
                }
                break;
            case 76:
                {
                alt110=2;
                }
                break;
            case 77:
                {
                alt110=3;
                }
                break;
            case 78:
                {
                alt110=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4593:2: (enumLiteral_0= 'EMAP' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4593:2: (enumLiteral_0= 'EMAP' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4593:4: enumLiteral_0= 'EMAP'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleColSort9390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColSortAccess().getEMAPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColSortAccess().getEMAPEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4599:6: (enumLiteral_1= 'ECORE' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4599:6: (enumLiteral_1= 'ECORE' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4599:8: enumLiteral_1= 'ECORE'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleColSort9407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColSortAccess().getECOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColSortAccess().getECOREEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4605:6: (enumLiteral_2= 'ECORE_REVERSED' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4605:6: (enumLiteral_2= 'ECORE_REVERSED' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4605:8: enumLiteral_2= 'ECORE_REVERSED'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_77_in_ruleColSort9424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColSortAccess().getECORE_REVERSEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColSortAccess().getECORE_REVERSEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4611:6: (enumLiteral_3= 'ALPHABETIC' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4611:6: (enumLiteral_3= 'ALPHABETIC' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4611:8: enumLiteral_3= 'ALPHABETIC'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_78_in_ruleColSort9441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColSortAccess().getALPHABETICEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColSortAccess().getALPHABETICEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleColSort"


    // $ANTLR start "ruleReturnType"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4621:1: ruleReturnType returns [Enumerator current=null] : ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) ;
    public final Enumerator ruleReturnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4623:28: ( ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4624:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4624:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==79) ) {
                alt111=1;
            }
            else if ( (LA111_0==80) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4624:2: (enumLiteral_0= 'list' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4624:2: (enumLiteral_0= 'list' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4624:4: enumLiteral_0= 'list'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_79_in_ruleReturnType9486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4630:6: (enumLiteral_1= 'single' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4630:6: (enumLiteral_1= 'single' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4630:8: enumLiteral_1= 'single'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_80_in_ruleReturnType9503); if (state.failed) return current;
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
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2026:3: ( '.' )
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2027:2: '.'
        {
        match(input,42,FOLLOW_42_in_synpred1_InternalEMap4129); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEMap

    // $ANTLR start synpred2_InternalEMap
    public final void synpred2_InternalEMap_fragment() throws RecognitionException {   
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4523:3: ( '.' )
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4524:2: '.'
        {
        match(input,42,FOLLOW_42_in_synpred2_InternalEMap9174); if (state.failed) return ;

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


    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA47_eotS =
        "\6\uffff";
    static final String DFA47_eofS =
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA47_minS =
        "\1\4\1\13\1\4\2\uffff\1\13";
    static final String DFA47_maxS =
        "\1\4\1\54\1\112\2\uffff\1\54";
    static final String DFA47_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA47_specialS =
        "\6\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\1",
            "\1\3\33\uffff\1\3\2\uffff\1\2\2\3",
            "\1\5\105\uffff\1\4",
            "",
            "",
            "\1\3\33\uffff\1\3\2\uffff\1\2\2\3"
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "1917:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )";
        }
    }
 

    public static final BitSet FOLLOW_ruleEMapping_in_entryRuleEMapping75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMapping85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingBundle_in_ruleEMapping132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntityDef_in_ruleEMapping151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingBundle_in_entryRuleEMappingBundle189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingBundle199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleEMappingBundle245 = new BitSet(new long[]{0x0000008000000800L});
    public static final BitSet FOLLOW_11_in_ruleEMappingBundle258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingBundle275 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingBundle293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingBundle316 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingBundle330 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleEMappingBundle343 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingBundle355 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_ruleEPredef_in_ruleEMappingBundle376 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleEMappingBundle389 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_ruleEPredef_in_ruleEMappingBundle410 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleEMappingBundle424 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleEBundleEntity_in_ruleEMappingBundle447 = new BitSet(new long[]{0x0000000020038000L});
    public static final BitSet FOLLOW_15_in_ruleEMappingBundle460 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleEBundleEntity_in_ruleEMappingBundle481 = new BitSet(new long[]{0x0000000020038000L});
    public static final BitSet FOLLOW_ruleESQLTypeDef_in_ruleEMappingBundle504 = new BitSet(new long[]{0x0000000020030000L});
    public static final BitSet FOLLOW_17_in_ruleEMappingBundle518 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingBundle530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEGeneratorDef_in_ruleEMappingBundle551 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEMappingBundle564 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEMappingBundle578 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleEMappingBundle591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEMappingBundle608 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_15_in_ruleEMappingBundle626 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEMappingBundle643 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_19_in_ruleEMappingBundle665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_ruleColSort_in_ruleEMappingBundle686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPredef_in_entryRuleEPredef724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPredef734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEPredef781 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEPredef798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEPredef832 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEPredef849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEGeneratorDef_in_entryRuleEGeneratorDef891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEGeneratorDef901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEGeneratorDef943 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEGeneratorDef961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEGeneratorConfigValue_in_ruleEGeneratorDef982 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEGeneratorDef995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEGeneratorConfigValue_in_entryRuleEGeneratorConfigValue1033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEGeneratorConfigValue1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEGeneratorConfigValue1085 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEGeneratorConfigValue1102 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEGeneratorConfigValue1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEGeneratorConfigValue1144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEGeneratorConfigValue_in_ruleEGeneratorConfigValue1165 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEGeneratorConfigValue1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBundleEntity_in_entryRuleEBundleEntity1216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBundleEntity1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEBundleEntity1271 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEBundleEntity1284 = new BitSet(new long[]{0x0000000139810000L});
    public static final BitSet FOLLOW_23_in_ruleEBundleEntity1297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEBundleEntity1314 = new BitSet(new long[]{0x0000000139010000L});
    public static final BitSet FOLLOW_ruleEFkConstraint_in_ruleEBundleEntity1343 = new BitSet(new long[]{0x0000000131018000L});
    public static final BitSet FOLLOW_15_in_ruleEBundleEntity1356 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleEFkConstraint_in_ruleEBundleEntity1377 = new BitSet(new long[]{0x0000000131018000L});
    public static final BitSet FOLLOW_ruleEUniqueConstraint_in_ruleEBundleEntity1403 = new BitSet(new long[]{0x0000000121018000L});
    public static final BitSet FOLLOW_15_in_ruleEBundleEntity1416 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleEUniqueConstraint_in_ruleEBundleEntity1437 = new BitSet(new long[]{0x0000000121018000L});
    public static final BitSet FOLLOW_ruleEIndex_in_ruleEBundleEntity1463 = new BitSet(new long[]{0x0000000120018000L});
    public static final BitSet FOLLOW_15_in_ruleEBundleEntity1476 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleEIndex_in_ruleEBundleEntity1497 = new BitSet(new long[]{0x0000000120018000L});
    public static final BitSet FOLLOW_ruleESQLAttTypeDef_in_ruleEBundleEntity1523 = new BitSet(new long[]{0x0000000100018000L});
    public static final BitSet FOLLOW_15_in_ruleEBundleEntity1536 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleESQLAttTypeDef_in_ruleEBundleEntity1557 = new BitSet(new long[]{0x0000000100018000L});
    public static final BitSet FOLLOW_ruleERestServiceMapping_in_ruleEBundleEntity1582 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEBundleEntity1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIndex_in_entryRuleEIndex1633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIndex1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEIndex1680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEIndex1697 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEIndex1714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEIndex1737 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleEIndex1750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEIndex1773 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleEIndex1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFkConstraint_in_entryRuleEFkConstraint1823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFkConstraint1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEFkConstraint1870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEFkConstraint1893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEFkConstraint1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEUniqueConstraint_in_entryRuleEUniqueConstraint1951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEUniqueConstraint1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEUniqueConstraint1998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEUniqueConstraint2015 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEUniqueConstraint2032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEUniqueConstraint2055 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleEUniqueConstraint2068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEUniqueConstraint2091 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleEUniqueConstraint2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleESQLAttTypeDef_in_entryRuleESQLAttTypeDef2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleESQLAttTypeDef2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleESQLAttTypeDef2188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleESQLAttTypeDef2211 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleESQLAttTypeDef2223 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleESQLDbType_in_ruleESQLAttTypeDef2244 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleESQLAttTypeDef2257 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleESQLDbType_in_ruleESQLAttTypeDef2278 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleESQLAttTypeDef2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleESQLTypeDef_in_entryRuleESQLTypeDef2328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleESQLTypeDef2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleESQLTypeDef2375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleEType_in_ruleESQLTypeDef2396 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleESQLTypeDef2408 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleESQLDbType_in_ruleESQLTypeDef2429 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleESQLTypeDef2442 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleESQLDbType_in_ruleESQLTypeDef2463 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleESQLTypeDef2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleESQLDbType_in_entryRuleESQLDbType2513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleESQLDbType2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleESQLDbType2568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleESQLDbType2596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleESQLDbType2621 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleESQLDbType2639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleESQLDbType2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleERestServiceMapping_in_entryRuleERestServiceMapping2699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleERestServiceMapping2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleERestServiceMapping2746 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_13_in_ruleERestServiceMapping2768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleENamedServiceQuery_in_ruleERestServiceMapping2789 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleERestServiceMapping2802 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleERestServiceMapping2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedServiceQuery_in_entryRuleENamedServiceQuery2871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedServiceQuery2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleENamedServiceQuery2929 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleENamedServiceQuery2941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleENamedServiceQuery2958 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleENamedServiceQuery2980 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleENamedServiceQuery2998 = new BitSet(new long[]{0x0000005800010000L});
    public static final BitSet FOLLOW_ruleEServiceParam_in_ruleENamedServiceQuery3019 = new BitSet(new long[]{0x0000005800010000L});
    public static final BitSet FOLLOW_35_in_ruleENamedServiceQuery3033 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleENamedServiceQuery3045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEGreedyAttributePath_in_ruleENamedServiceQuery3066 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleENamedServiceQuery3079 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleENamedServiceQuery3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEGreedyAttributePath_in_entryRuleEGreedyAttributePath3131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEGreedyAttributePath3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEGreedyAttributePath3189 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEGreedyAttributePath3202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEGreedyAttributePath_in_ruleEGreedyAttributePath3223 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEGreedyAttributePath3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEServiceParam_in_entryRuleEServiceParam3274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEServiceParam3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPathParam_in_ruleEServiceParam3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQueryParam_in_ruleEServiceParam3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPathParam_in_entryRuleEPathParam3393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPathParam3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEPathParam3440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEPathParam3463 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleEPathParam3476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEPathParam3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQueryParam_in_entryRuleEQueryParam3536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQueryParam3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEQueryParam3583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEQueryParam3606 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleEQueryParam3619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEQueryParam3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntityDef_in_entryRuleEMappingEntityDef3679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingEntityDef3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleEMappingEntityDef3735 = new BitSet(new long[]{0x0000188000000800L});
    public static final BitSet FOLLOW_ruleImport_in_ruleEMappingEntityDef3756 = new BitSet(new long[]{0x0000188000000800L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_ruleEMappingEntityDef3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport3814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleImport3861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration3942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePackageDeclaration3989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration4010 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePackageDeclaration4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4110 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleFQN4138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4154 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_entryRuleEMappingEntity4201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingEntity4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEMappingEntity4254 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleEMappingEntity4280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity4297 = new BitSet(new long[]{0x0000200000003000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity4323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45_in_ruleEMappingEntity4352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingEntity4391 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingEntity4405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleEType_in_ruleEMappingEntity4426 = new BitSet(new long[]{0x0000C00000010000L});
    public static final BitSet FOLLOW_46_in_ruleEMappingEntity4439 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingEntity4451 = new BitSet(new long[]{0x0006000000000010L});
    public static final BitSet FOLLOW_ruleEAttribute_in_ruleEMappingEntity4472 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleEMappingEntity4485 = new BitSet(new long[]{0x0006000000000010L});
    public static final BitSet FOLLOW_ruleEAttribute_in_ruleEMappingEntity4506 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleEMappingEntity4520 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_47_in_ruleEMappingEntity4535 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEMappingEntity4547 = new BitSet(new long[]{0xFC00000000000010L,0x0000000000018105L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_ruleEMappingEntity4569 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity4596 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleEMappingEntity4610 = new BitSet(new long[]{0xFC00000000000010L,0x0000000000018105L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_ruleEMappingEntity4632 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity4659 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleEMappingEntity4674 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEMappingEntity4688 = new BitSet(new long[]{0x0001000400000002L});
    public static final BitSet FOLLOW_34_in_ruleEMappingEntity4701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity4718 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEMappingEntity4738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_entryRuleEAttribute4798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttribute4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEAttribute4852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_50_in_ruleEAttribute4890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute4921 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleEAttribute4938 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute4957 = new BitSet(new long[]{0x0010000080000002L});
    public static final BitSet FOLLOW_52_in_ruleEAttribute4975 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEAttribute4987 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_ruleEAttribute5008 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleEAttribute5021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_ruleEAttribute5042 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleEAttribute5056 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_53_in_ruleEAttribute5084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEAttribute5120 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEAttribute5132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute5149 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEAttribute5166 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEAttribute5190 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleEAttribute5202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute5219 = new BitSet(new long[]{0x0000040080000002L});
    public static final BitSet FOLLOW_42_in_ruleEAttribute5237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute5254 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleEAttribute5278 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEAttribute5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator5338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEValueGenerator5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator5390 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_55_in_ruleEValueGenerator5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEValueGenerator5446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEValueGenerator5488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery5548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedQuery5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleENamedQuery5604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleENamedQuery5622 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_25_in_ruleENamedQuery5640 = new BitSet(new long[]{0xFC02000004000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedQuery5662 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleENamedQuery5675 = new BitSet(new long[]{0xFC02000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedQuery5696 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleENamedQuery5712 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleENamedQuery5726 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleEQuery_in_ruleENamedQuery5747 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleENamedQuery5760 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleEQuery_in_ruleENamedQuery5781 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleENamedQuery5795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_entryRuleEPrimtiveType5832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPrimtiveType5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEPrimtiveType5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEPrimtiveType5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEPrimtiveType5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEPrimtiveType5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleEPrimtiveType5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEPrimtiveType5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMapType_in_entryRuleEMapType6031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMapType6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleEMapType6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedCustomQuery_in_entryRuleENamedCustomQuery6118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedCustomQuery6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery6175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_64_in_ruleENamedCustomQuery6200 = new BitSet(new long[]{0xFC00000000000010L,0x0000000000000104L});
    public static final BitSet FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery6234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleENamedCustomQuery6246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleENamedCustomQuery6265 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_25_in_ruleENamedCustomQuery6283 = new BitSet(new long[]{0xFC02000004000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedCustomQuery6305 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleENamedCustomQuery6318 = new BitSet(new long[]{0xFC02000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedCustomQuery6339 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleENamedCustomQuery6355 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleENamedCustomQuery6369 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleECustomQuery_in_ruleENamedCustomQuery6390 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleENamedCustomQuery6403 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleECustomQuery_in_ruleENamedCustomQuery6424 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleENamedCustomQuery6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReturnType_in_entryRuleEReturnType6474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEReturnType6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPredefinedType_in_ruleEReturnType6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETypeDef_in_ruleEReturnType6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEModelTypeDef_in_ruleEReturnType6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPredefinedType_in_entryRuleEPredefinedType6620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPredefinedType6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMapType_in_ruleEPredefinedType6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEPredefinedType6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETypeDef_in_entryRuleETypeDef6734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETypeDef6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleETypeDef6781 = new BitSet(new long[]{0xFC00000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleETypeDef6802 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleETypeDef6814 = new BitSet(new long[]{0xFC00000000000010L});
    public static final BitSet FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef6835 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleETypeDef6848 = new BitSet(new long[]{0xFC00000000000010L});
    public static final BitSet FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef6869 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleETypeDef6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEModelTypeDef_in_entryRuleEModelTypeDef6919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEModelTypeDef6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_ruleEModelTypeDef6975 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEModelTypeDef6987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef7008 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleEModelTypeDef7021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef7042 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleEModelTypeDef7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEModelTypeAttribute_in_entryRuleEModelTypeAttribute7092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEModelTypeAttribute7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute7144 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEModelTypeAttribute7162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEModelTypeAttribute7185 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_25_in_ruleEModelTypeAttribute7198 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute7216 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleEModelTypeAttribute7234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute7251 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleEModelTypeAttribute7272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleEModelTypeAttribute7293 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute7323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueTypeAttribute_in_entryRuleEValueTypeAttribute7369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEValueTypeAttribute7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEValueTypeAttribute7425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEValueTypeAttribute7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_entryRuleEParameter7483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEParameter7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEParameter7536 = new BitSet(new long[]{0xFC00000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEParameter7572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_64_in_ruleEParameter7597 = new BitSet(new long[]{0xFC00000000000010L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEParameter7631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleEParameter7643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEParameter7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_entryRuleEQuery7703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQuery7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEQuery7758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_ruleEQuery7815 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleEQuery7829 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7846 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleEQuery7864 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7881 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_ruleEQuery7901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7918 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleEQuery7938 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECustomQuery_in_entryRuleECustomQuery8028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECustomQuery8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleECustomQuery8083 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery8111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery8136 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleECustomQuery8155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery8172 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleECustomQuery8190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery8207 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_ruleECustomQuery8227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery8244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleECustomQuery8264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery8281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery8312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection8354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEObjectSection8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection8409 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_25_in_ruleEObjectSection8422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection8442 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEObjectSection8455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection8475 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleEObjectSection8489 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection8509 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEObjectSection8527 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection8548 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleEObjectSection8561 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection8582 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleEObjectSection8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute8636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingAttribute8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEMappingAttribute8689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute8724 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleEMappingAttribute8736 = new BitSet(new long[]{0x8020000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingAttribute8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEMappingAttribute8784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute8820 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEMappingAttribute8832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingAttribute8849 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEMappingAttribute8866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleEMappingAttribute8892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_ruleEMappingAttribute8926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_entryRuleEType8964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEType8974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleEType9011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEType9028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleEType9045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEType9062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9155 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleQualifiedName9183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9199 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9305 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleQualifiedNameWithWildcard9323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleQualifiedNameWithWildcard9336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleColSort9390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleColSort9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleColSort9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleColSort9441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleReturnType9486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleReturnType9503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred1_InternalEMap4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred2_InternalEMap9174 = new BitSet(new long[]{0x0000000000000002L});

}