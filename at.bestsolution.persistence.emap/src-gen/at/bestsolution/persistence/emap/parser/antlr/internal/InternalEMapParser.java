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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bundle'", "'extends'", "'{'", "'predefined'", "','", "'}'", "'generator'", "'databases'", "'colsort'", "'sequence'", "'table'", "':'", "'pk-constraint'", "'index'", "'('", "')'", "'fk-constraint'", "'unique-constraint'", "'sql-type-def'", "'default'", "'size'", "'webservice'", "'rest'", "'as'", "'greedy'", "'custom'", "'path-param'", "'named'", "'query-param'", "'import'", "'package'", "';'", "'.'", "'abstract'", "'entity'", "'derived'", "'attributes'", "'queries'", "'descriminatedby'", "'primarykey'", "'forced-fk'", "'=>'", "'generatedby'", "'resolve'", "'on'", "'autokey'", "'query'", "'seqnext'", "'int'", "'long'", "'double'", "'float'", "'boolean'", "'map'", "'['", "']'", "'typedef'", "'cached'", "'FROM'", "'WHERE'", "'GROUP BY'", "'ORDER BY'", "'etype'", "'#'", "'*'", "'EMAP'", "'ECORE'", "'ECORE_REVERSED'", "'ALPHABETIC'", "'list'", "'single'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEMapParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEMapParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEMapParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEMap.g"; }



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
    // InternalEMap.g:68:1: entryRuleEMapping returns [EObject current=null] : iv_ruleEMapping= ruleEMapping EOF ;
    public final EObject entryRuleEMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMapping = null;


        try {
            // InternalEMap.g:69:2: (iv_ruleEMapping= ruleEMapping EOF )
            // InternalEMap.g:70:2: iv_ruleEMapping= ruleEMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEMapping=ruleEMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMapping; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:77:1: ruleEMapping returns [EObject current=null] : ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) ) ) ;
    public final EObject ruleEMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_root_0_1 = null;

        EObject lv_root_0_2 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:80:28: ( ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) ) ) )
            // InternalEMap.g:81:1: ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) ) )
            {
            // InternalEMap.g:81:1: ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) ) )
            // InternalEMap.g:82:1: ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) )
            {
            // InternalEMap.g:82:1: ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef ) )
            // InternalEMap.g:83:1: (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef )
            {
            // InternalEMap.g:83:1: (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11||LA1_0==40) ) {
                alt1=1;
            }
            else if ( (LA1_0==41) ) {
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
                    // InternalEMap.g:84:3: lv_root_0_1= ruleEMappingBundle
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAccess().getRootEMappingBundleParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.persistence.emap.EMap.EMappingBundle");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalEMap.g:99:8: lv_root_0_2= ruleEMappingEntityDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAccess().getRootEMappingEntityDefParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.persistence.emap.EMap.EMappingEntityDef");
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
    // InternalEMap.g:125:1: entryRuleEMappingBundle returns [EObject current=null] : iv_ruleEMappingBundle= ruleEMappingBundle EOF ;
    public final EObject entryRuleEMappingBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingBundle = null;


        try {
            // InternalEMap.g:126:2: (iv_ruleEMappingBundle= ruleEMappingBundle EOF )
            // InternalEMap.g:127:2: iv_ruleEMappingBundle= ruleEMappingBundle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingBundleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEMappingBundle=ruleEMappingBundle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingBundle; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:134:1: ruleEMappingBundle returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )? ( (lv_entities_12_0= ruleEBundleEntity ) ) (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )* (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )? otherlv_20= '}' (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )? (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )? ) ;
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
            // InternalEMap.g:137:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )? ( (lv_entities_12_0= ruleEBundleEntity ) ) (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )* (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )? otherlv_20= '}' (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )? (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )? ) )
            // InternalEMap.g:138:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )? ( (lv_entities_12_0= ruleEBundleEntity ) ) (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )* (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )? otherlv_20= '}' (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )? (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )? )
            {
            // InternalEMap.g:138:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )? ( (lv_entities_12_0= ruleEBundleEntity ) ) (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )* (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )? otherlv_20= '}' (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )? (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )? )
            // InternalEMap.g:138:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )? ( (lv_entities_12_0= ruleEBundleEntity ) ) (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )* (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )? otherlv_20= '}' (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )? (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )?
            {
            // InternalEMap.g:138:2: ( (lv_imports_0_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==40) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEMap.g:139:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalEMap.g:139:1: (lv_imports_0_0= ruleImport )
            	    // InternalEMap.g:140:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
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
            	              		"at.bestsolution.persistence.emap.EMap.Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEMappingBundleAccess().getBundleKeyword_1());
                  
            }
            // InternalEMap.g:160:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalEMap.g:161:1: (lv_name_2_0= RULE_ID )
            {
            // InternalEMap.g:161:1: (lv_name_2_0= RULE_ID )
            // InternalEMap.g:162:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalEMap.g:178:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEMap.g:178:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEMappingBundleAccess().getExtendsKeyword_3_0());
                          
                    }
                    // InternalEMap.g:182:1: ( ( ruleQualifiedName ) )
                    // InternalEMap.g:183:1: ( ruleQualifiedName )
                    {
                    // InternalEMap.g:183:1: ( ruleQualifiedName )
                    // InternalEMap.g:184:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingBundleRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getParentBundleEMappingBundleCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
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

            otherlv_5=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalEMap.g:201:1: (otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEMap.g:201:3: otherlv_6= 'predefined' otherlv_7= '{' ( (lv_predef_8_0= ruleEPredef ) ) (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEMappingBundleAccess().getPredefinedKeyword_5_0());
                          
                    }
                    otherlv_7=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // InternalEMap.g:209:1: ( (lv_predef_8_0= ruleEPredef ) )
                    // InternalEMap.g:210:1: (lv_predef_8_0= ruleEPredef )
                    {
                    // InternalEMap.g:210:1: (lv_predef_8_0= ruleEPredef )
                    // InternalEMap.g:211:3: lv_predef_8_0= ruleEPredef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getPredefEPredefParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_9);
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
                              		"at.bestsolution.persistence.emap.EMap.EPredef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalEMap.g:227:2: (otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalEMap.g:227:4: otherlv_9= ',' ( (lv_predef_10_0= ruleEPredef ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getEMappingBundleAccess().getCommaKeyword_5_3_0());
                    	          
                    	    }
                    	    // InternalEMap.g:231:1: ( (lv_predef_10_0= ruleEPredef ) )
                    	    // InternalEMap.g:232:1: (lv_predef_10_0= ruleEPredef )
                    	    {
                    	    // InternalEMap.g:232:1: (lv_predef_10_0= ruleEPredef )
                    	    // InternalEMap.g:233:3: lv_predef_10_0= ruleEPredef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getPredefEPredefParserRuleCall_5_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_9);
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
                    	              		"at.bestsolution.persistence.emap.EMap.EPredef");
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

                    otherlv_11=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_5_4());
                          
                    }

                    }
                    break;

            }

            // InternalEMap.g:253:3: ( (lv_entities_12_0= ruleEBundleEntity ) )
            // InternalEMap.g:254:1: (lv_entities_12_0= ruleEBundleEntity )
            {
            // InternalEMap.g:254:1: (lv_entities_12_0= ruleEBundleEntity )
            // InternalEMap.g:255:3: lv_entities_12_0= ruleEBundleEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getEntitiesEBundleEntityParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_10);
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
                      		"at.bestsolution.persistence.emap.EMap.EBundleEntity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:271:2: (otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEMap.g:271:4: otherlv_13= ',' ( (lv_entities_14_0= ruleEBundleEntity ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getEMappingBundleAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalEMap.g:275:1: ( (lv_entities_14_0= ruleEBundleEntity ) )
            	    // InternalEMap.g:276:1: (lv_entities_14_0= ruleEBundleEntity )
            	    {
            	    // InternalEMap.g:276:1: (lv_entities_14_0= ruleEBundleEntity )
            	    // InternalEMap.g:277:3: lv_entities_14_0= ruleEBundleEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getEntitiesEBundleEntityParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
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
            	              		"at.bestsolution.persistence.emap.EMap.EBundleEntity");
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

            // InternalEMap.g:293:4: ( (lv_typeDefs_15_0= ruleESQLTypeDef ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEMap.g:294:1: (lv_typeDefs_15_0= ruleESQLTypeDef )
            	    {
            	    // InternalEMap.g:294:1: (lv_typeDefs_15_0= ruleESQLTypeDef )
            	    // InternalEMap.g:295:3: lv_typeDefs_15_0= ruleESQLTypeDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getTypeDefsESQLTypeDefParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_11);
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
            	              		"at.bestsolution.persistence.emap.EMap.ESQLTypeDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalEMap.g:311:3: (otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEMap.g:311:5: otherlv_16= 'generator' otherlv_17= '{' ( (lv_generators_18_0= ruleEGeneratorDef ) )+ otherlv_19= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getEMappingBundleAccess().getGeneratorKeyword_9_0());
                          
                    }
                    otherlv_17=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_9_1());
                          
                    }
                    // InternalEMap.g:319:1: ( (lv_generators_18_0= ruleEGeneratorDef ) )+
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
                    	    // InternalEMap.g:320:1: (lv_generators_18_0= ruleEGeneratorDef )
                    	    {
                    	    // InternalEMap.g:320:1: (lv_generators_18_0= ruleEGeneratorDef )
                    	    // InternalEMap.g:321:3: lv_generators_18_0= ruleEGeneratorDef
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getGeneratorsEGeneratorDefParserRuleCall_9_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
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
                    	              		"at.bestsolution.persistence.emap.EMap.EGeneratorDef");
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

                    otherlv_19=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_9_3());
                          
                    }

                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_10());
                  
            }
            // InternalEMap.g:345:1: (otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEMap.g:345:3: otherlv_21= 'databases' ( (lv_databases_22_0= RULE_STRING ) ) (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )*
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getEMappingBundleAccess().getDatabasesKeyword_11_0());
                          
                    }
                    // InternalEMap.g:349:1: ( (lv_databases_22_0= RULE_STRING ) )
                    // InternalEMap.g:350:1: (lv_databases_22_0= RULE_STRING )
                    {
                    // InternalEMap.g:350:1: (lv_databases_22_0= RULE_STRING )
                    // InternalEMap.g:351:3: lv_databases_22_0= RULE_STRING
                    {
                    lv_databases_22_0=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    // InternalEMap.g:367:2: (otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEMap.g:367:4: otherlv_23= ',' ( (lv_databases_24_0= RULE_STRING ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_23, grammarAccess.getEMappingBundleAccess().getCommaKeyword_11_2_0());
                    	          
                    	    }
                    	    // InternalEMap.g:371:1: ( (lv_databases_24_0= RULE_STRING ) )
                    	    // InternalEMap.g:372:1: (lv_databases_24_0= RULE_STRING )
                    	    {
                    	    // InternalEMap.g:372:1: (lv_databases_24_0= RULE_STRING )
                    	    // InternalEMap.g:373:3: lv_databases_24_0= RULE_STRING
                    	    {
                    	    lv_databases_24_0=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
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
                    	              		"org.eclipse.xtext.common.Terminals.STRING");
                    	      	    
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

            // InternalEMap.g:389:6: (otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEMap.g:389:8: otherlv_25= 'colsort' ( (lv_colSort_26_0= ruleColSort ) )
                    {
                    otherlv_25=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getEMappingBundleAccess().getColsortKeyword_12_0());
                          
                    }
                    // InternalEMap.g:393:1: ( (lv_colSort_26_0= ruleColSort ) )
                    // InternalEMap.g:394:1: (lv_colSort_26_0= ruleColSort )
                    {
                    // InternalEMap.g:394:1: (lv_colSort_26_0= ruleColSort )
                    // InternalEMap.g:395:3: lv_colSort_26_0= ruleColSort
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getColSortColSortEnumRuleCall_12_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.persistence.emap.EMap.ColSort");
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
    // InternalEMap.g:419:1: entryRuleEPredef returns [EObject current=null] : iv_ruleEPredef= ruleEPredef EOF ;
    public final EObject entryRuleEPredef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPredef = null;


        try {
            // InternalEMap.g:420:2: (iv_ruleEPredef= ruleEPredef EOF )
            // InternalEMap.g:421:2: iv_ruleEPredef= ruleEPredef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPredefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEPredef=ruleEPredef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPredef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:428:1: ruleEPredef returns [EObject current=null] : ( ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleEPredef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:431:28: ( ( ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) ) ) )
            // InternalEMap.g:432:1: ( ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) ) )
            {
            // InternalEMap.g:432:1: ( ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ) | ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) ) )
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
                    // InternalEMap.g:432:2: ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) )
                    {
                    // InternalEMap.g:432:2: ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) )
                    // InternalEMap.g:432:3: () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    // InternalEMap.g:432:3: ()
                    // InternalEMap.g:433:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getEPredefAccess().getEPredefSequenceAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEPredefAccess().getSequenceKeyword_0_1());
                          
                    }
                    // InternalEMap.g:442:1: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalEMap.g:443:1: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalEMap.g:443:1: (lv_name_2_0= RULE_STRING )
                    // InternalEMap.g:444:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEMap.g:461:6: ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) )
                    {
                    // InternalEMap.g:461:6: ( () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) ) )
                    // InternalEMap.g:461:7: () otherlv_4= 'table' ( (lv_name_5_0= RULE_STRING ) )
                    {
                    // InternalEMap.g:461:7: ()
                    // InternalEMap.g:462:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getEPredefAccess().getEPredefTableAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEPredefAccess().getTableKeyword_1_1());
                          
                    }
                    // InternalEMap.g:471:1: ( (lv_name_5_0= RULE_STRING ) )
                    // InternalEMap.g:472:1: (lv_name_5_0= RULE_STRING )
                    {
                    // InternalEMap.g:472:1: (lv_name_5_0= RULE_STRING )
                    // InternalEMap.g:473:3: lv_name_5_0= RULE_STRING
                    {
                    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
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
    // InternalEMap.g:497:1: entryRuleEGeneratorDef returns [EObject current=null] : iv_ruleEGeneratorDef= ruleEGeneratorDef EOF ;
    public final EObject entryRuleEGeneratorDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGeneratorDef = null;


        try {
            // InternalEMap.g:498:2: (iv_ruleEGeneratorDef= ruleEGeneratorDef EOF )
            // InternalEMap.g:499:2: iv_ruleEGeneratorDef= ruleEGeneratorDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEGeneratorDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEGeneratorDef=ruleEGeneratorDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEGeneratorDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:506:1: ruleEGeneratorDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )? ) ;
    public final EObject ruleEGeneratorDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:509:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )? ) )
            // InternalEMap.g:510:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )? )
            {
            // InternalEMap.g:510:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )? )
            // InternalEMap.g:510:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )?
            {
            // InternalEMap.g:510:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEMap.g:511:1: (lv_name_0_0= RULE_ID )
            {
            // InternalEMap.g:511:1: (lv_name_0_0= RULE_ID )
            // InternalEMap.g:512:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalEMap.g:528:2: (otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEMap.g:528:4: otherlv_1= '{' ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+ otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEGeneratorDefAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // InternalEMap.g:532:1: ( (lv_parameters_2_0= ruleEGeneratorConfigValue ) )+
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
                    	    // InternalEMap.g:533:1: (lv_parameters_2_0= ruleEGeneratorConfigValue )
                    	    {
                    	    // InternalEMap.g:533:1: (lv_parameters_2_0= ruleEGeneratorConfigValue )
                    	    // InternalEMap.g:534:3: lv_parameters_2_0= ruleEGeneratorConfigValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEGeneratorDefAccess().getParametersEGeneratorConfigValueParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
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
                    	              		"at.bestsolution.persistence.emap.EMap.EGeneratorConfigValue");
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

                    otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:562:1: entryRuleEGeneratorConfigValue returns [EObject current=null] : iv_ruleEGeneratorConfigValue= ruleEGeneratorConfigValue EOF ;
    public final EObject entryRuleEGeneratorConfigValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGeneratorConfigValue = null;


        try {
            // InternalEMap.g:563:2: (iv_ruleEGeneratorConfigValue= ruleEGeneratorConfigValue EOF )
            // InternalEMap.g:564:2: iv_ruleEGeneratorConfigValue= ruleEGeneratorConfigValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEGeneratorConfigValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEGeneratorConfigValue=ruleEGeneratorConfigValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEGeneratorConfigValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:571:1: ruleEGeneratorConfigValue returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) ) ) ;
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
            // InternalEMap.g:574:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) ) ) )
            // InternalEMap.g:575:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) ) )
            {
            // InternalEMap.g:575:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) ) )
            // InternalEMap.g:575:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) )
            {
            // InternalEMap.g:575:2: ( (lv_key_0_0= RULE_ID ) )
            // InternalEMap.g:576:1: (lv_key_0_0= RULE_ID )
            {
            // InternalEMap.g:576:1: (lv_key_0_0= RULE_ID )
            // InternalEMap.g:577:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEGeneratorConfigValueAccess().getColonKeyword_1());
                  
            }
            // InternalEMap.g:597:1: ( ( (lv_simpleValue_2_0= RULE_STRING ) ) | (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' ) )
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
                    // InternalEMap.g:597:2: ( (lv_simpleValue_2_0= RULE_STRING ) )
                    {
                    // InternalEMap.g:597:2: ( (lv_simpleValue_2_0= RULE_STRING ) )
                    // InternalEMap.g:598:1: (lv_simpleValue_2_0= RULE_STRING )
                    {
                    // InternalEMap.g:598:1: (lv_simpleValue_2_0= RULE_STRING )
                    // InternalEMap.g:599:3: lv_simpleValue_2_0= RULE_STRING
                    {
                    lv_simpleValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEMap.g:616:6: (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' )
                    {
                    // InternalEMap.g:616:6: (otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}' )
                    // InternalEMap.g:616:8: otherlv_3= '{' ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEGeneratorConfigValueAccess().getLeftCurlyBracketKeyword_2_1_0());
                          
                    }
                    // InternalEMap.g:620:1: ( (lv_children_4_0= ruleEGeneratorConfigValue ) )+
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
                    	    // InternalEMap.g:621:1: (lv_children_4_0= ruleEGeneratorConfigValue )
                    	    {
                    	    // InternalEMap.g:621:1: (lv_children_4_0= ruleEGeneratorConfigValue )
                    	    // InternalEMap.g:622:3: lv_children_4_0= ruleEGeneratorConfigValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEGeneratorConfigValueAccess().getChildrenEGeneratorConfigValueParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
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
                    	              		"at.bestsolution.persistence.emap.EMap.EGeneratorConfigValue");
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

                    otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:650:1: entryRuleEBundleEntity returns [EObject current=null] : iv_ruleEBundleEntity= ruleEBundleEntity EOF ;
    public final EObject entryRuleEBundleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBundleEntity = null;


        try {
            // InternalEMap.g:651:2: (iv_ruleEBundleEntity= ruleEBundleEntity EOF )
            // InternalEMap.g:652:2: iv_ruleEBundleEntity= ruleEBundleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBundleEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBundleEntity=ruleEBundleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBundleEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:659:1: ruleEBundleEntity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )? ) ;
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
            // InternalEMap.g:662:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )? ) )
            // InternalEMap.g:663:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )? )
            {
            // InternalEMap.g:663:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )? )
            // InternalEMap.g:663:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )?
            {
            // InternalEMap.g:663:2: ( (otherlv_0= RULE_ID ) )
            // InternalEMap.g:664:1: (otherlv_0= RULE_ID )
            {
            // InternalEMap.g:664:1: (otherlv_0= RULE_ID )
            // InternalEMap.g:665:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEBundleEntityRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEBundleEntityAccess().getEntityEMappingEntityCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalEMap.g:676:2: (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEMap.g:676:4: otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? ( (lv_rest_16_0= ruleERestServiceMapping ) )? otherlv_17= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEBundleEntityAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // InternalEMap.g:680:1: (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==23) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalEMap.g:680:3: otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) )
                            {
                            otherlv_2=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getEBundleEntityAccess().getPkConstraintKeyword_1_1_0());
                                  
                            }
                            // InternalEMap.g:684:1: ( (lv_pkConstraintName_3_0= RULE_STRING ) )
                            // InternalEMap.g:685:1: (lv_pkConstraintName_3_0= RULE_STRING )
                            {
                            // InternalEMap.g:685:1: (lv_pkConstraintName_3_0= RULE_STRING )
                            // InternalEMap.g:686:3: lv_pkConstraintName_3_0= RULE_STRING
                            {
                            lv_pkConstraintName_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); if (state.failed) return current;
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
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalEMap.g:702:4: ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==27) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalEMap.g:702:5: ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )*
                            {
                            // InternalEMap.g:702:5: ( (lv_fkConstraints_4_0= ruleEFkConstraint ) )
                            // InternalEMap.g:703:1: (lv_fkConstraints_4_0= ruleEFkConstraint )
                            {
                            // InternalEMap.g:703:1: (lv_fkConstraints_4_0= ruleEFkConstraint )
                            // InternalEMap.g:704:3: lv_fkConstraints_4_0= ruleEFkConstraint
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getFkConstraintsEFkConstraintParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_23);
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
                                      		"at.bestsolution.persistence.emap.EMap.EFkConstraint");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalEMap.g:720:2: (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==15) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalEMap.g:720:4: otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) )
                            	    {
                            	    otherlv_5=(Token)match(input,15,FOLLOW_24); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_2_1_0());
                            	          
                            	    }
                            	    // InternalEMap.g:724:1: ( (lv_fkConstraints_6_0= ruleEFkConstraint ) )
                            	    // InternalEMap.g:725:1: (lv_fkConstraints_6_0= ruleEFkConstraint )
                            	    {
                            	    // InternalEMap.g:725:1: (lv_fkConstraints_6_0= ruleEFkConstraint )
                            	    // InternalEMap.g:726:3: lv_fkConstraints_6_0= ruleEFkConstraint
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getFkConstraintsEFkConstraintParserRuleCall_1_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_23);
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
                            	              		"at.bestsolution.persistence.emap.EMap.EFkConstraint");
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

                    // InternalEMap.g:742:6: ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==28) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalEMap.g:742:7: ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )*
                            {
                            // InternalEMap.g:742:7: ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) )
                            // InternalEMap.g:743:1: (lv_uniqueContraints_7_0= ruleEUniqueConstraint )
                            {
                            // InternalEMap.g:743:1: (lv_uniqueContraints_7_0= ruleEUniqueConstraint )
                            // InternalEMap.g:744:3: lv_uniqueContraints_7_0= ruleEUniqueConstraint
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getUniqueContraintsEUniqueConstraintParserRuleCall_1_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_25);
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
                                      		"at.bestsolution.persistence.emap.EMap.EUniqueConstraint");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalEMap.g:760:2: (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==15) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // InternalEMap.g:760:4: otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_26); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_3_1_0());
                            	          
                            	    }
                            	    // InternalEMap.g:764:1: ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) )
                            	    // InternalEMap.g:765:1: (lv_uniqueContraints_9_0= ruleEUniqueConstraint )
                            	    {
                            	    // InternalEMap.g:765:1: (lv_uniqueContraints_9_0= ruleEUniqueConstraint )
                            	    // InternalEMap.g:766:3: lv_uniqueContraints_9_0= ruleEUniqueConstraint
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getUniqueContraintsEUniqueConstraintParserRuleCall_1_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_25);
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
                            	              		"at.bestsolution.persistence.emap.EMap.EUniqueConstraint");
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

                    // InternalEMap.g:782:6: ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==24) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalEMap.g:782:7: ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )*
                            {
                            // InternalEMap.g:782:7: ( (lv_indices_10_0= ruleEIndex ) )
                            // InternalEMap.g:783:1: (lv_indices_10_0= ruleEIndex )
                            {
                            // InternalEMap.g:783:1: (lv_indices_10_0= ruleEIndex )
                            // InternalEMap.g:784:3: lv_indices_10_0= ruleEIndex
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getIndicesEIndexParserRuleCall_1_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_27);
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
                                      		"at.bestsolution.persistence.emap.EMap.EIndex");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalEMap.g:800:2: (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==15) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalEMap.g:800:4: otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) )
                            	    {
                            	    otherlv_11=(Token)match(input,15,FOLLOW_28); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_4_1_0());
                            	          
                            	    }
                            	    // InternalEMap.g:804:1: ( (lv_indices_12_0= ruleEIndex ) )
                            	    // InternalEMap.g:805:1: (lv_indices_12_0= ruleEIndex )
                            	    {
                            	    // InternalEMap.g:805:1: (lv_indices_12_0= ruleEIndex )
                            	    // InternalEMap.g:806:3: lv_indices_12_0= ruleEIndex
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getIndicesEIndexParserRuleCall_1_4_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_27);
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
                            	              		"at.bestsolution.persistence.emap.EMap.EIndex");
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

                    // InternalEMap.g:822:6: ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==29) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalEMap.g:822:7: ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )*
                            {
                            // InternalEMap.g:822:7: ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) )
                            // InternalEMap.g:823:1: (lv_typeDefs_13_0= ruleESQLAttTypeDef )
                            {
                            // InternalEMap.g:823:1: (lv_typeDefs_13_0= ruleESQLAttTypeDef )
                            // InternalEMap.g:824:3: lv_typeDefs_13_0= ruleESQLAttTypeDef
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getTypeDefsESQLAttTypeDefParserRuleCall_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_29);
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
                                      		"at.bestsolution.persistence.emap.EMap.ESQLAttTypeDef");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalEMap.g:840:2: (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==15) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalEMap.g:840:4: otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) )
                            	    {
                            	    otherlv_14=(Token)match(input,15,FOLLOW_30); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_5_1_0());
                            	          
                            	    }
                            	    // InternalEMap.g:844:1: ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) )
                            	    // InternalEMap.g:845:1: (lv_typeDefs_15_0= ruleESQLAttTypeDef )
                            	    {
                            	    // InternalEMap.g:845:1: (lv_typeDefs_15_0= ruleESQLAttTypeDef )
                            	    // InternalEMap.g:846:3: lv_typeDefs_15_0= ruleESQLAttTypeDef
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getTypeDefsESQLAttTypeDefParserRuleCall_1_5_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_29);
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
                            	              		"at.bestsolution.persistence.emap.EMap.ESQLAttTypeDef");
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

                    // InternalEMap.g:862:6: ( (lv_rest_16_0= ruleERestServiceMapping ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==32) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalEMap.g:863:1: (lv_rest_16_0= ruleERestServiceMapping )
                            {
                            // InternalEMap.g:863:1: (lv_rest_16_0= ruleERestServiceMapping )
                            // InternalEMap.g:864:3: lv_rest_16_0= ruleERestServiceMapping
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getRestERestServiceMappingParserRuleCall_1_6_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_13);
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
                                      		"at.bestsolution.persistence.emap.EMap.ERestServiceMapping");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:892:1: entryRuleEIndex returns [EObject current=null] : iv_ruleEIndex= ruleEIndex EOF ;
    public final EObject entryRuleEIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIndex = null;


        try {
            // InternalEMap.g:893:2: (iv_ruleEIndex= ruleEIndex EOF )
            // InternalEMap.g:894:2: iv_ruleEIndex= ruleEIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEIndex=ruleEIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEIndex; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:901:1: ruleEIndex returns [EObject current=null] : (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:904:28: ( (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) )
            // InternalEMap.g:905:1: (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            {
            // InternalEMap.g:905:1: (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            // InternalEMap.g:905:3: otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEIndexAccess().getIndexKeyword_0());
                  
            }
            // InternalEMap.g:909:1: ( (lv_name_1_0= RULE_STRING ) )
            // InternalEMap.g:910:1: (lv_name_1_0= RULE_STRING )
            {
            // InternalEMap.g:910:1: (lv_name_1_0= RULE_STRING )
            // InternalEMap.g:911:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_31); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEIndexAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalEMap.g:931:1: ( ( ruleQualifiedName ) )
            // InternalEMap.g:932:1: ( ruleQualifiedName )
            {
            // InternalEMap.g:932:1: ( ruleQualifiedName )
            // InternalEMap.g:933:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEIndexRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEIndexAccess().getAttributesEAttributeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_32);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:946:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEMap.g:946:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEIndexAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalEMap.g:950:1: ( ( ruleQualifiedName ) )
            	    // InternalEMap.g:951:1: ( ruleQualifiedName )
            	    {
            	    // InternalEMap.g:951:1: ( ruleQualifiedName )
            	    // InternalEMap.g:952:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEIndexRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEIndexAccess().getAttributesEAttributeCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_32);
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

            otherlv_6=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:977:1: entryRuleEFkConstraint returns [EObject current=null] : iv_ruleEFkConstraint= ruleEFkConstraint EOF ;
    public final EObject entryRuleEFkConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFkConstraint = null;


        try {
            // InternalEMap.g:978:2: (iv_ruleEFkConstraint= ruleEFkConstraint EOF )
            // InternalEMap.g:979:2: iv_ruleEFkConstraint= ruleEFkConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFkConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFkConstraint=ruleEFkConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFkConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:986:1: ruleEFkConstraint returns [EObject current=null] : (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEFkConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:989:28: ( (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalEMap.g:990:1: (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalEMap.g:990:1: (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalEMap.g:990:3: otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEFkConstraintAccess().getFkConstraintKeyword_0());
                  
            }
            // InternalEMap.g:994:1: ( ( ruleQualifiedName ) )
            // InternalEMap.g:995:1: ( ruleQualifiedName )
            {
            // InternalEMap.g:995:1: ( ruleQualifiedName )
            // InternalEMap.g:996:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEFkConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEFkConstraintAccess().getAttributeEAttributeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:1009:2: ( (lv_name_2_0= RULE_STRING ) )
            // InternalEMap.g:1010:1: (lv_name_2_0= RULE_STRING )
            {
            // InternalEMap.g:1010:1: (lv_name_2_0= RULE_STRING )
            // InternalEMap.g:1011:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // InternalEMap.g:1035:1: entryRuleEUniqueConstraint returns [EObject current=null] : iv_ruleEUniqueConstraint= ruleEUniqueConstraint EOF ;
    public final EObject entryRuleEUniqueConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUniqueConstraint = null;


        try {
            // InternalEMap.g:1036:2: (iv_ruleEUniqueConstraint= ruleEUniqueConstraint EOF )
            // InternalEMap.g:1037:2: iv_ruleEUniqueConstraint= ruleEUniqueConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEUniqueConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEUniqueConstraint=ruleEUniqueConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEUniqueConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1044:1: ruleEUniqueConstraint returns [EObject current=null] : (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEUniqueConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:1047:28: ( (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) )
            // InternalEMap.g:1048:1: (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            {
            // InternalEMap.g:1048:1: (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            // InternalEMap.g:1048:3: otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEUniqueConstraintAccess().getUniqueConstraintKeyword_0());
                  
            }
            // InternalEMap.g:1052:1: ( (lv_name_1_0= RULE_STRING ) )
            // InternalEMap.g:1053:1: (lv_name_1_0= RULE_STRING )
            {
            // InternalEMap.g:1053:1: (lv_name_1_0= RULE_STRING )
            // InternalEMap.g:1054:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_31); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEUniqueConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalEMap.g:1074:1: ( ( ruleQualifiedName ) )
            // InternalEMap.g:1075:1: ( ruleQualifiedName )
            {
            // InternalEMap.g:1075:1: ( ruleQualifiedName )
            // InternalEMap.g:1076:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEUniqueConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEUniqueConstraintAccess().getAttributesEAttributeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_32);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:1089:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEMap.g:1089:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEUniqueConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalEMap.g:1093:1: ( ( ruleQualifiedName ) )
            	    // InternalEMap.g:1094:1: ( ruleQualifiedName )
            	    {
            	    // InternalEMap.g:1094:1: ( ruleQualifiedName )
            	    // InternalEMap.g:1095:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEUniqueConstraintRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEUniqueConstraintAccess().getAttributesEAttributeCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_32);
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

            otherlv_6=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:1120:1: entryRuleESQLAttTypeDef returns [EObject current=null] : iv_ruleESQLAttTypeDef= ruleESQLAttTypeDef EOF ;
    public final EObject entryRuleESQLAttTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESQLAttTypeDef = null;


        try {
            // InternalEMap.g:1121:2: (iv_ruleESQLAttTypeDef= ruleESQLAttTypeDef EOF )
            // InternalEMap.g:1122:2: iv_ruleESQLAttTypeDef= ruleESQLAttTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getESQLAttTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleESQLAttTypeDef=ruleESQLAttTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleESQLAttTypeDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1129:1: ruleESQLAttTypeDef returns [EObject current=null] : (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) ;
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
            // InternalEMap.g:1132:28: ( (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) )
            // InternalEMap.g:1133:1: (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            {
            // InternalEMap.g:1133:1: (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            // InternalEMap.g:1133:3: otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getESQLAttTypeDefAccess().getSqlTypeDefKeyword_0());
                  
            }
            // InternalEMap.g:1137:1: ( ( ruleQualifiedName ) )
            // InternalEMap.g:1138:1: ( ruleQualifiedName )
            {
            // InternalEMap.g:1138:1: ( ruleQualifiedName )
            // InternalEMap.g:1139:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getESQLAttTypeDefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLAttTypeDefAccess().getAttributeEAttributeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_6);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getESQLAttTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalEMap.g:1156:1: ( (lv_dbTypes_3_0= ruleESQLDbType ) )
            // InternalEMap.g:1157:1: (lv_dbTypes_3_0= ruleESQLDbType )
            {
            // InternalEMap.g:1157:1: (lv_dbTypes_3_0= ruleESQLDbType )
            // InternalEMap.g:1158:3: lv_dbTypes_3_0= ruleESQLDbType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLAttTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
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
                      		"at.bestsolution.persistence.emap.EMap.ESQLDbType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:1174:2: (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEMap.g:1174:4: otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getESQLAttTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalEMap.g:1178:1: ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    // InternalEMap.g:1179:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    {
            	    // InternalEMap.g:1179:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    // InternalEMap.g:1180:3: lv_dbTypes_5_0= ruleESQLDbType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getESQLAttTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
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
            	              		"at.bestsolution.persistence.emap.EMap.ESQLDbType");
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:1208:1: entryRuleESQLTypeDef returns [EObject current=null] : iv_ruleESQLTypeDef= ruleESQLTypeDef EOF ;
    public final EObject entryRuleESQLTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESQLTypeDef = null;


        try {
            // InternalEMap.g:1209:2: (iv_ruleESQLTypeDef= ruleESQLTypeDef EOF )
            // InternalEMap.g:1210:2: iv_ruleESQLTypeDef= ruleESQLTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getESQLTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleESQLTypeDef=ruleESQLTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleESQLTypeDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1217:1: ruleESQLTypeDef returns [EObject current=null] : (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) ;
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
            // InternalEMap.g:1220:28: ( (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) )
            // InternalEMap.g:1221:1: (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            {
            // InternalEMap.g:1221:1: (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            // InternalEMap.g:1221:3: otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getESQLTypeDefAccess().getSqlTypeDefKeyword_0());
                  
            }
            // InternalEMap.g:1225:1: ( (lv_etype_1_0= ruleEType ) )
            // InternalEMap.g:1226:1: (lv_etype_1_0= ruleEType )
            {
            // InternalEMap.g:1226:1: (lv_etype_1_0= ruleEType )
            // InternalEMap.g:1227:3: lv_etype_1_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLTypeDefAccess().getEtypeETypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_6);
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
                      		"at.bestsolution.persistence.emap.EMap.EType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getESQLTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalEMap.g:1247:1: ( (lv_dbTypes_3_0= ruleESQLDbType ) )
            // InternalEMap.g:1248:1: (lv_dbTypes_3_0= ruleESQLDbType )
            {
            // InternalEMap.g:1248:1: (lv_dbTypes_3_0= ruleESQLDbType )
            // InternalEMap.g:1249:3: lv_dbTypes_3_0= ruleESQLDbType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
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
                      		"at.bestsolution.persistence.emap.EMap.ESQLDbType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:1265:2: (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEMap.g:1265:4: otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getESQLTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalEMap.g:1269:1: ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    // InternalEMap.g:1270:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    {
            	    // InternalEMap.g:1270:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    // InternalEMap.g:1271:3: lv_dbTypes_5_0= ruleESQLDbType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getESQLTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
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
            	              		"at.bestsolution.persistence.emap.EMap.ESQLDbType");
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:1299:1: entryRuleESQLDbType returns [EObject current=null] : iv_ruleESQLDbType= ruleESQLDbType EOF ;
    public final EObject entryRuleESQLDbType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESQLDbType = null;


        try {
            // InternalEMap.g:1300:2: (iv_ruleESQLDbType= ruleESQLDbType EOF )
            // InternalEMap.g:1301:2: iv_ruleESQLDbType= ruleESQLDbType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getESQLDbTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleESQLDbType=ruleESQLDbType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleESQLDbType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1308:1: ruleESQLDbType returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleESQLDbType() throws RecognitionException {
        EObject current = null;

        Token lv_dbType_0_1=null;
        Token lv_dbType_0_2=null;
        Token lv_sqlTypeDef_1_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:1311:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? ) )
            // InternalEMap.g:1312:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? )
            {
            // InternalEMap.g:1312:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? )
            // InternalEMap.g:1312:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )?
            {
            // InternalEMap.g:1312:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // InternalEMap.g:1313:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // InternalEMap.g:1313:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // InternalEMap.g:1314:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // InternalEMap.g:1314:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
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
                    // InternalEMap.g:1315:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
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
                    // InternalEMap.g:1327:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_15); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalEMap.g:1345:2: ( (lv_sqlTypeDef_1_0= RULE_STRING ) )
            // InternalEMap.g:1346:1: (lv_sqlTypeDef_1_0= RULE_STRING )
            {
            // InternalEMap.g:1346:1: (lv_sqlTypeDef_1_0= RULE_STRING )
            // InternalEMap.g:1347:3: lv_sqlTypeDef_1_0= RULE_STRING
            {
            lv_sqlTypeDef_1_0=(Token)match(input,RULE_STRING,FOLLOW_35); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalEMap.g:1363:2: (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEMap.g:1363:4: otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getESQLDbTypeAccess().getSizeKeyword_2_0());
                          
                    }
                    // InternalEMap.g:1367:1: ( (lv_size_3_0= RULE_STRING ) )
                    // InternalEMap.g:1368:1: (lv_size_3_0= RULE_STRING )
                    {
                    // InternalEMap.g:1368:1: (lv_size_3_0= RULE_STRING )
                    // InternalEMap.g:1369:3: lv_size_3_0= RULE_STRING
                    {
                    lv_size_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
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
    // InternalEMap.g:1393:1: entryRuleERestServiceMapping returns [EObject current=null] : iv_ruleERestServiceMapping= ruleERestServiceMapping EOF ;
    public final EObject entryRuleERestServiceMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERestServiceMapping = null;


        try {
            // InternalEMap.g:1394:2: (iv_ruleERestServiceMapping= ruleERestServiceMapping EOF )
            // InternalEMap.g:1395:2: iv_ruleERestServiceMapping= ruleERestServiceMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getERestServiceMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleERestServiceMapping=ruleERestServiceMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleERestServiceMapping; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1402:1: ruleERestServiceMapping returns [EObject current=null] : (otherlv_0= 'webservice' () (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )* ( (lv_customServiceMethods_4_0= ruleECustomServiceMethods ) )* otherlv_5= '}' )? ( (lv_rest_6_0= 'rest' ) ) ) ;
    public final EObject ruleERestServiceMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_rest_6_0=null;
        EObject lv_serviceMethods_3_0 = null;

        EObject lv_customServiceMethods_4_0 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:1405:28: ( (otherlv_0= 'webservice' () (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )* ( (lv_customServiceMethods_4_0= ruleECustomServiceMethods ) )* otherlv_5= '}' )? ( (lv_rest_6_0= 'rest' ) ) ) )
            // InternalEMap.g:1406:1: (otherlv_0= 'webservice' () (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )* ( (lv_customServiceMethods_4_0= ruleECustomServiceMethods ) )* otherlv_5= '}' )? ( (lv_rest_6_0= 'rest' ) ) )
            {
            // InternalEMap.g:1406:1: (otherlv_0= 'webservice' () (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )* ( (lv_customServiceMethods_4_0= ruleECustomServiceMethods ) )* otherlv_5= '}' )? ( (lv_rest_6_0= 'rest' ) ) )
            // InternalEMap.g:1406:3: otherlv_0= 'webservice' () (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )* ( (lv_customServiceMethods_4_0= ruleECustomServiceMethods ) )* otherlv_5= '}' )? ( (lv_rest_6_0= 'rest' ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getERestServiceMappingAccess().getWebserviceKeyword_0());
                  
            }
            // InternalEMap.g:1410:1: ()
            // InternalEMap.g:1411:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getERestServiceMappingAccess().getERestServiceMappingAction_1(),
                          current);
                  
            }

            }

            // InternalEMap.g:1416:2: (otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )* ( (lv_customServiceMethods_4_0= ruleECustomServiceMethods ) )* otherlv_5= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEMap.g:1416:4: otherlv_2= '{' ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )* ( (lv_customServiceMethods_4_0= ruleECustomServiceMethods ) )* otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getERestServiceMappingAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // InternalEMap.g:1420:1: ( (lv_serviceMethods_3_0= ruleENamedServiceQuery ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalEMap.g:1421:1: (lv_serviceMethods_3_0= ruleENamedServiceQuery )
                    	    {
                    	    // InternalEMap.g:1421:1: (lv_serviceMethods_3_0= ruleENamedServiceQuery )
                    	    // InternalEMap.g:1422:3: lv_serviceMethods_3_0= ruleENamedServiceQuery
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getERestServiceMappingAccess().getServiceMethodsENamedServiceQueryParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_37);
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
                    	              		"at.bestsolution.persistence.emap.EMap.ENamedServiceQuery");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // InternalEMap.g:1438:3: ( (lv_customServiceMethods_4_0= ruleECustomServiceMethods ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==36) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalEMap.g:1439:1: (lv_customServiceMethods_4_0= ruleECustomServiceMethods )
                    	    {
                    	    // InternalEMap.g:1439:1: (lv_customServiceMethods_4_0= ruleECustomServiceMethods )
                    	    // InternalEMap.g:1440:3: lv_customServiceMethods_4_0= ruleECustomServiceMethods
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getERestServiceMappingAccess().getCustomServiceMethodsECustomServiceMethodsParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_38);
                    	    lv_customServiceMethods_4_0=ruleECustomServiceMethods();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getERestServiceMappingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"customServiceMethods",
                    	              		lv_customServiceMethods_4_0, 
                    	              		"at.bestsolution.persistence.emap.EMap.ECustomServiceMethods");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getERestServiceMappingAccess().getRightCurlyBracketKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // InternalEMap.g:1460:3: ( (lv_rest_6_0= 'rest' ) )
            // InternalEMap.g:1461:1: (lv_rest_6_0= 'rest' )
            {
            // InternalEMap.g:1461:1: (lv_rest_6_0= 'rest' )
            // InternalEMap.g:1462:3: lv_rest_6_0= 'rest'
            {
            lv_rest_6_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_rest_6_0, grammarAccess.getERestServiceMappingAccess().getRestRestKeyword_3_0());
                  
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
    // InternalEMap.g:1483:1: entryRuleENamedServiceQuery returns [EObject current=null] : iv_ruleENamedServiceQuery= ruleENamedServiceQuery EOF ;
    public final EObject entryRuleENamedServiceQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedServiceQuery = null;


        try {
            // InternalEMap.g:1484:2: (iv_ruleENamedServiceQuery= ruleENamedServiceQuery EOF )
            // InternalEMap.g:1485:2: iv_ruleENamedServiceQuery= ruleENamedServiceQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedServiceQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleENamedServiceQuery=ruleENamedServiceQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedServiceQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1492:1: ruleENamedServiceQuery returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )? ) ;
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
            // InternalEMap.g:1495:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )? ) )
            // InternalEMap.g:1496:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )? )
            {
            // InternalEMap.g:1496:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )? )
            // InternalEMap.g:1496:2: ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )?
            {
            // InternalEMap.g:1496:2: ( ( ruleQualifiedName ) )
            // InternalEMap.g:1497:1: ( ruleQualifiedName )
            {
            // InternalEMap.g:1497:1: ( ruleQualifiedName )
            // InternalEMap.g:1498:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getENamedServiceQueryRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedServiceQueryAccess().getQueryENamedQueryCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_40);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getENamedServiceQueryAccess().getAsKeyword_1());
                  
            }
            // InternalEMap.g:1515:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalEMap.g:1516:1: (lv_name_2_0= RULE_ID )
            {
            // InternalEMap.g:1516:1: (lv_name_2_0= RULE_ID )
            // InternalEMap.g:1517:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalEMap.g:1533:2: ( (lv_path_3_0= RULE_STRING ) )
            // InternalEMap.g:1534:1: (lv_path_3_0= RULE_STRING )
            {
            // InternalEMap.g:1534:1: (lv_path_3_0= RULE_STRING )
            // InternalEMap.g:1535:3: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalEMap.g:1551:2: (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==13) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEMap.g:1551:4: otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )? otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getENamedServiceQueryAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // InternalEMap.g:1555:1: ( (lv_parameters_5_0= ruleEServiceParam ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==37||LA38_0==39) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalEMap.g:1556:1: (lv_parameters_5_0= ruleEServiceParam )
                    	    {
                    	    // InternalEMap.g:1556:1: (lv_parameters_5_0= ruleEServiceParam )
                    	    // InternalEMap.g:1557:3: lv_parameters_5_0= ruleEServiceParam
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getENamedServiceQueryAccess().getParametersEServiceParamParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_41);
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
                    	              		"at.bestsolution.persistence.emap.EMap.EServiceParam");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    // InternalEMap.g:1573:3: (otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==35) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalEMap.g:1573:5: otherlv_6= 'greedy' otherlv_7= '{' ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+ otherlv_9= '}'
                            {
                            otherlv_6=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getENamedServiceQueryAccess().getGreedyKeyword_4_2_0());
                                  
                            }
                            otherlv_7=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getENamedServiceQueryAccess().getLeftCurlyBracketKeyword_4_2_1());
                                  
                            }
                            // InternalEMap.g:1581:1: ( (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath ) )+
                            int cnt39=0;
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==RULE_ID) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // InternalEMap.g:1582:1: (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath )
                            	    {
                            	    // InternalEMap.g:1582:1: (lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath )
                            	    // InternalEMap.g:1583:3: lv_greedyAttributePathList_8_0= ruleEGreedyAttributePath
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedServiceQueryAccess().getGreedyAttributePathListEGreedyAttributePathParserRuleCall_4_2_2_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_12);
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
                            	              		"at.bestsolution.persistence.emap.EMap.EGreedyAttributePath");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt39 >= 1 ) break loop39;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(39, input);
                                        throw eee;
                                }
                                cnt39++;
                            } while (true);

                            otherlv_9=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getENamedServiceQueryAccess().getRightCurlyBracketKeyword_4_2_3());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleECustomServiceMethods"
    // InternalEMap.g:1615:1: entryRuleECustomServiceMethods returns [EObject current=null] : iv_ruleECustomServiceMethods= ruleECustomServiceMethods EOF ;
    public final EObject entryRuleECustomServiceMethods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECustomServiceMethods = null;


        try {
            // InternalEMap.g:1616:2: (iv_ruleECustomServiceMethods= ruleECustomServiceMethods EOF )
            // InternalEMap.g:1617:2: iv_ruleECustomServiceMethods= ruleECustomServiceMethods EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECustomServiceMethodsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleECustomServiceMethods=ruleECustomServiceMethods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECustomServiceMethods; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECustomServiceMethods"


    // $ANTLR start "ruleECustomServiceMethods"
    // InternalEMap.g:1624:1: ruleECustomServiceMethods returns [EObject current=null] : (otherlv_0= 'custom' otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleECustomServiceMethods() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:1627:28: ( (otherlv_0= 'custom' otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* otherlv_6= '}' )? ) )
            // InternalEMap.g:1628:1: (otherlv_0= 'custom' otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* otherlv_6= '}' )? )
            {
            // InternalEMap.g:1628:1: (otherlv_0= 'custom' otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* otherlv_6= '}' )? )
            // InternalEMap.g:1628:3: otherlv_0= 'custom' otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getECustomServiceMethodsAccess().getCustomKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getECustomServiceMethodsAccess().getAsKeyword_1());
                  
            }
            // InternalEMap.g:1636:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalEMap.g:1637:1: (lv_name_2_0= RULE_ID )
            {
            // InternalEMap.g:1637:1: (lv_name_2_0= RULE_ID )
            // InternalEMap.g:1638:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getECustomServiceMethodsAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECustomServiceMethodsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalEMap.g:1654:2: ( (lv_path_3_0= RULE_STRING ) )
            // InternalEMap.g:1655:1: (lv_path_3_0= RULE_STRING )
            {
            // InternalEMap.g:1655:1: (lv_path_3_0= RULE_STRING )
            // InternalEMap.g:1656:3: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_path_3_0, grammarAccess.getECustomServiceMethodsAccess().getPathSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECustomServiceMethodsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"path",
                      		lv_path_3_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalEMap.g:1672:2: (otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* otherlv_6= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalEMap.g:1672:4: otherlv_4= '{' ( (lv_parameters_5_0= ruleEServiceParam ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getECustomServiceMethodsAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // InternalEMap.g:1676:1: ( (lv_parameters_5_0= ruleEServiceParam ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==37||LA42_0==39) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalEMap.g:1677:1: (lv_parameters_5_0= ruleEServiceParam )
                    	    {
                    	    // InternalEMap.g:1677:1: (lv_parameters_5_0= ruleEServiceParam )
                    	    // InternalEMap.g:1678:3: lv_parameters_5_0= ruleEServiceParam
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getECustomServiceMethodsAccess().getParametersEServiceParamParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    lv_parameters_5_0=ruleEServiceParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getECustomServiceMethodsRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"at.bestsolution.persistence.emap.EMap.EServiceParam");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getECustomServiceMethodsAccess().getRightCurlyBracketKeyword_4_2());
                          
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
    // $ANTLR end "ruleECustomServiceMethods"


    // $ANTLR start "entryRuleEGreedyAttributePath"
    // InternalEMap.g:1706:1: entryRuleEGreedyAttributePath returns [EObject current=null] : iv_ruleEGreedyAttributePath= ruleEGreedyAttributePath EOF ;
    public final EObject entryRuleEGreedyAttributePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreedyAttributePath = null;


        try {
            // InternalEMap.g:1707:2: (iv_ruleEGreedyAttributePath= ruleEGreedyAttributePath EOF )
            // InternalEMap.g:1708:2: iv_ruleEGreedyAttributePath= ruleEGreedyAttributePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEGreedyAttributePathRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEGreedyAttributePath=ruleEGreedyAttributePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEGreedyAttributePath; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1715:1: ruleEGreedyAttributePath returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )? ) ;
    public final EObject ruleEGreedyAttributePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_subPathList_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:1718:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )? ) )
            // InternalEMap.g:1719:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )? )
            {
            // InternalEMap.g:1719:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )? )
            // InternalEMap.g:1719:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )?
            {
            // InternalEMap.g:1719:2: ( ( ruleQualifiedName ) )
            // InternalEMap.g:1720:1: ( ruleQualifiedName )
            {
            // InternalEMap.g:1720:1: ( ruleQualifiedName )
            // InternalEMap.g:1721:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEGreedyAttributePathRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEGreedyAttributePathAccess().getGreedyAttributeEAttributeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:1734:2: (otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==13) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalEMap.g:1734:4: otherlv_1= '{' ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+ otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEGreedyAttributePathAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // InternalEMap.g:1738:1: ( (lv_subPathList_2_0= ruleEGreedyAttributePath ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_ID) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalEMap.g:1739:1: (lv_subPathList_2_0= ruleEGreedyAttributePath )
                    	    {
                    	    // InternalEMap.g:1739:1: (lv_subPathList_2_0= ruleEGreedyAttributePath )
                    	    // InternalEMap.g:1740:3: lv_subPathList_2_0= ruleEGreedyAttributePath
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEGreedyAttributePathAccess().getSubPathListEGreedyAttributePathParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_12);
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
                    	              		"at.bestsolution.persistence.emap.EMap.EGreedyAttributePath");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt44 >= 1 ) break loop44;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);

                    otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:1768:1: entryRuleEServiceParam returns [EObject current=null] : iv_ruleEServiceParam= ruleEServiceParam EOF ;
    public final EObject entryRuleEServiceParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEServiceParam = null;


        try {
            // InternalEMap.g:1769:2: (iv_ruleEServiceParam= ruleEServiceParam EOF )
            // InternalEMap.g:1770:2: iv_ruleEServiceParam= ruleEServiceParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEServiceParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEServiceParam=ruleEServiceParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEServiceParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1777:1: ruleEServiceParam returns [EObject current=null] : (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam ) ;
    public final EObject ruleEServiceParam() throws RecognitionException {
        EObject current = null;

        EObject this_EPathParam_0 = null;

        EObject this_EQueryParam_1 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:1780:28: ( (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam ) )
            // InternalEMap.g:1781:1: (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam )
            {
            // InternalEMap.g:1781:1: (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            else if ( (LA46_0==39) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalEMap.g:1782:5: this_EPathParam_0= ruleEPathParam
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEServiceParamAccess().getEPathParamParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEMap.g:1792:5: this_EQueryParam_1= ruleEQueryParam
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEServiceParamAccess().getEQueryParamParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalEMap.g:1808:1: entryRuleEPathParam returns [EObject current=null] : iv_ruleEPathParam= ruleEPathParam EOF ;
    public final EObject entryRuleEPathParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPathParam = null;


        try {
            // InternalEMap.g:1809:2: (iv_ruleEPathParam= ruleEPathParam EOF )
            // InternalEMap.g:1810:2: iv_ruleEPathParam= ruleEPathParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPathParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEPathParam=ruleEPathParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPathParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1817:1: ruleEPathParam returns [EObject current=null] : (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEPathParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:1820:28: ( (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // InternalEMap.g:1821:1: (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // InternalEMap.g:1821:1: (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            // InternalEMap.g:1821:3: otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEPathParamAccess().getPathParamKeyword_0());
                  
            }
            // InternalEMap.g:1825:1: ( ( ruleQualifiedName ) )
            // InternalEMap.g:1826:1: ( ruleQualifiedName )
            {
            // InternalEMap.g:1826:1: ( ruleQualifiedName )
            // InternalEMap.g:1827:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEPathParamRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEPathParamAccess().getParamEParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_43);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:1840:2: (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalEMap.g:1840:4: otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEPathParamAccess().getNamedKeyword_2_0());
                          
                    }
                    // InternalEMap.g:1844:1: ( (lv_name_3_0= RULE_ID ) )
                    // InternalEMap.g:1845:1: (lv_name_3_0= RULE_ID )
                    {
                    // InternalEMap.g:1845:1: (lv_name_3_0= RULE_ID )
                    // InternalEMap.g:1846:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
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
    // InternalEMap.g:1870:1: entryRuleEQueryParam returns [EObject current=null] : iv_ruleEQueryParam= ruleEQueryParam EOF ;
    public final EObject entryRuleEQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQueryParam = null;


        try {
            // InternalEMap.g:1871:2: (iv_ruleEQueryParam= ruleEQueryParam EOF )
            // InternalEMap.g:1872:2: iv_ruleEQueryParam= ruleEQueryParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQueryParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEQueryParam=ruleEQueryParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQueryParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1879:1: ruleEQueryParam returns [EObject current=null] : (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEQueryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:1882:28: ( (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // InternalEMap.g:1883:1: (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // InternalEMap.g:1883:1: (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            // InternalEMap.g:1883:3: otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEQueryParamAccess().getQueryParamKeyword_0());
                  
            }
            // InternalEMap.g:1887:1: ( ( ruleQualifiedName ) )
            // InternalEMap.g:1888:1: ( ruleQualifiedName )
            {
            // InternalEMap.g:1888:1: ( ruleQualifiedName )
            // InternalEMap.g:1889:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEQueryParamRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEQueryParamAccess().getParamEParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_43);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:1902:2: (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEMap.g:1902:4: otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEQueryParamAccess().getNamedKeyword_2_0());
                          
                    }
                    // InternalEMap.g:1906:1: ( (lv_name_3_0= RULE_ID ) )
                    // InternalEMap.g:1907:1: (lv_name_3_0= RULE_ID )
                    {
                    // InternalEMap.g:1907:1: (lv_name_3_0= RULE_ID )
                    // InternalEMap.g:1908:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
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
    // InternalEMap.g:1932:1: entryRuleEMappingEntityDef returns [EObject current=null] : iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF ;
    public final EObject entryRuleEMappingEntityDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingEntityDef = null;


        try {
            // InternalEMap.g:1933:2: (iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF )
            // InternalEMap.g:1934:2: iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingEntityDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEMappingEntityDef=ruleEMappingEntityDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingEntityDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:1941:1: ruleEMappingEntityDef returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) ) ;
    public final EObject ruleEMappingEntityDef() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_entity_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:1944:28: ( ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) ) )
            // InternalEMap.g:1945:1: ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) )
            {
            // InternalEMap.g:1945:1: ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) )
            // InternalEMap.g:1945:2: ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) )
            {
            // InternalEMap.g:1945:2: ( (lv_package_0_0= rulePackageDeclaration ) )
            // InternalEMap.g:1946:1: (lv_package_0_0= rulePackageDeclaration )
            {
            // InternalEMap.g:1946:1: (lv_package_0_0= rulePackageDeclaration )
            // InternalEMap.g:1947:3: lv_package_0_0= rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_44);
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
                      		"at.bestsolution.persistence.emap.EMap.PackageDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:1963:2: ( (lv_imports_1_0= ruleImport ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==40) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalEMap.g:1964:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalEMap.g:1964:1: (lv_imports_1_0= ruleImport )
            	    // InternalEMap.g:1965:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_44);
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
            	              		"at.bestsolution.persistence.emap.EMap.Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalEMap.g:1981:3: ( (lv_entity_2_0= ruleEMappingEntity ) )
            // InternalEMap.g:1982:1: (lv_entity_2_0= ruleEMappingEntity )
            {
            // InternalEMap.g:1982:1: (lv_entity_2_0= ruleEMappingEntity )
            // InternalEMap.g:1983:3: lv_entity_2_0= ruleEMappingEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getEntityEMappingEntityParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"at.bestsolution.persistence.emap.EMap.EMappingEntity");
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
    // InternalEMap.g:2007:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEMap.g:2008:2: (iv_ruleImport= ruleImport EOF )
            // InternalEMap.g:2009:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:2016:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:2019:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) ) )
            // InternalEMap.g:2020:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) )
            {
            // InternalEMap.g:2020:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) )
            // InternalEMap.g:2020:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // InternalEMap.g:2024:1: ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) )
            // InternalEMap.g:2025:1: ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) )
            {
            // InternalEMap.g:2025:1: ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) )
            // InternalEMap.g:2026:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )
            {
            // InternalEMap.g:2026:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalEMap.g:2027:3: lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.persistence.emap.EMap.QualifiedNameWithWildcard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalEMap.g:2042:8: lv_importedNamespace_1_2= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.persistence.emap.EMap.QualifiedName");
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
    // InternalEMap.g:2068:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalEMap.g:2069:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalEMap.g:2070:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:2077:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:2080:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) )
            // InternalEMap.g:2081:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            {
            // InternalEMap.g:2081:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            // InternalEMap.g:2081:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // InternalEMap.g:2085:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalEMap.g:2086:1: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalEMap.g:2086:1: (lv_name_1_0= ruleQualifiedName )
            // InternalEMap.g:2087:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_45);
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
                      		"at.bestsolution.persistence.emap.EMap.QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:2115:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalEMap.g:2116:2: (iv_ruleFQN= ruleFQN EOF )
            // InternalEMap.g:2117:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:2124:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:2127:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalEMap.g:2128:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalEMap.g:2128:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalEMap.g:2128:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalEMap.g:2135:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==43) && (synpred1_InternalEMap())) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalEMap.g:2135:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalEMap.g:2135:2: ( ( '.' )=>kw= '.' )
            	    // InternalEMap.g:2135:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalEMap.g:2158:1: entryRuleEMappingEntity returns [EObject current=null] : iv_ruleEMappingEntity= ruleEMappingEntity EOF ;
    public final EObject entryRuleEMappingEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingEntity = null;


        try {
            // InternalEMap.g:2159:2: (iv_ruleEMappingEntity= ruleEMappingEntity EOF )
            // InternalEMap.g:2160:2: iv_ruleEMappingEntity= ruleEMappingEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEMappingEntity=ruleEMappingEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:2167:1: ruleEMappingEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? ) ;
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
            // InternalEMap.g:2170:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? ) )
            // InternalEMap.g:2171:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? )
            {
            // InternalEMap.g:2171:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? )
            // InternalEMap.g:2171:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )?
            {
            // InternalEMap.g:2171:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==44) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalEMap.g:2172:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalEMap.g:2172:1: (lv_abstract_0_0= 'abstract' )
                    // InternalEMap.g:2173:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,44,FOLLOW_47); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEMappingEntityAccess().getEntityKeyword_1());
                  
            }
            // InternalEMap.g:2190:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalEMap.g:2191:1: (lv_name_2_0= RULE_ID )
            {
            // InternalEMap.g:2191:1: (lv_name_2_0= RULE_ID )
            // InternalEMap.g:2192:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalEMap.g:2208:2: ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==12||LA54_0==46) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEMap.g:2208:3: ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalEMap.g:2208:3: ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) )
                    // InternalEMap.g:2209:1: ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) )
                    {
                    // InternalEMap.g:2209:1: ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) )
                    // InternalEMap.g:2210:1: (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' )
                    {
                    // InternalEMap.g:2210:1: (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==12) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==46) ) {
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
                            // InternalEMap.g:2211:3: lv_extensionType_3_1= 'extends'
                            {
                            lv_extensionType_3_1=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
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
                            // InternalEMap.g:2223:8: lv_extensionType_3_2= 'derived'
                            {
                            lv_extensionType_3_2=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
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

                    // InternalEMap.g:2238:2: ( ( ruleQualifiedName ) )
                    // InternalEMap.g:2239:1: ( ruleQualifiedName )
                    {
                    // InternalEMap.g:2239:1: ( ruleQualifiedName )
                    // InternalEMap.g:2240:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
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

            otherlv_5=(Token)match(input,13,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalEMap.g:2257:1: ( (lv_etype_6_0= ruleEType ) )
            // InternalEMap.g:2258:1: (lv_etype_6_0= ruleEType )
            {
            // InternalEMap.g:2258:1: (lv_etype_6_0= ruleEType )
            // InternalEMap.g:2259:3: lv_etype_6_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getEtypeETypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_49);
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
                      		"at.bestsolution.persistence.emap.EMap.EType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:2275:2: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==47) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalEMap.g:2275:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,47,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,13,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_6_1());
                          
                    }
                    // InternalEMap.g:2283:1: ( (lv_attributes_9_0= ruleEAttribute ) )
                    // InternalEMap.g:2284:1: (lv_attributes_9_0= ruleEAttribute )
                    {
                    // InternalEMap.g:2284:1: (lv_attributes_9_0= ruleEAttribute )
                    // InternalEMap.g:2285:3: lv_attributes_9_0= ruleEAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_9);
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
                              		"at.bestsolution.persistence.emap.EMap.EAttribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalEMap.g:2301:2: (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==15) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalEMap.g:2301:4: otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_50); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getEMappingEntityAccess().getCommaKeyword_6_3_0());
                    	          
                    	    }
                    	    // InternalEMap.g:2305:1: ( (lv_attributes_11_0= ruleEAttribute ) )
                    	    // InternalEMap.g:2306:1: (lv_attributes_11_0= ruleEAttribute )
                    	    {
                    	    // InternalEMap.g:2306:1: (lv_attributes_11_0= ruleEAttribute )
                    	    // InternalEMap.g:2307:3: lv_attributes_11_0= ruleEAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_9);
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
                    	              		"at.bestsolution.persistence.emap.EMap.EAttribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // InternalEMap.g:2327:3: (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==48) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalEMap.g:2327:5: otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}'
                    {
                    otherlv_13=(Token)match(input,48,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEMappingEntityAccess().getQueriesKeyword_7_0());
                          
                    }
                    otherlv_14=(Token)match(input,13,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7_1());
                          
                    }
                    // InternalEMap.g:2335:1: ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) )
                    int alt57=2;
                    switch ( input.LA(1) ) {
                    case 80:
                    case 81:
                        {
                        alt57=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA57_2 = input.LA(2);

                        if ( (LA57_2==RULE_ID||LA57_2==43) ) {
                            alt57=2;
                        }
                        else if ( (LA57_2==13||LA57_2==25) ) {
                            alt57=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 67:
                    case 73:
                        {
                        alt57=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }

                    switch (alt57) {
                        case 1 :
                            // InternalEMap.g:2335:2: ( (lv_namedQueries_15_0= ruleENamedQuery ) )
                            {
                            // InternalEMap.g:2335:2: ( (lv_namedQueries_15_0= ruleENamedQuery ) )
                            // InternalEMap.g:2336:1: (lv_namedQueries_15_0= ruleENamedQuery )
                            {
                            // InternalEMap.g:2336:1: (lv_namedQueries_15_0= ruleENamedQuery )
                            // InternalEMap.g:2337:3: lv_namedQueries_15_0= ruleENamedQuery
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_9);
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
                                      		"at.bestsolution.persistence.emap.EMap.ENamedQuery");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalEMap.g:2354:6: ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) )
                            {
                            // InternalEMap.g:2354:6: ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) )
                            // InternalEMap.g:2355:1: (lv_namedCustomQueries_16_0= ruleENamedCustomQuery )
                            {
                            // InternalEMap.g:2355:1: (lv_namedCustomQueries_16_0= ruleENamedCustomQuery )
                            // InternalEMap.g:2356:3: lv_namedCustomQueries_16_0= ruleENamedCustomQuery
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedCustomQueriesENamedCustomQueryParserRuleCall_7_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_9);
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
                                      		"at.bestsolution.persistence.emap.EMap.ENamedCustomQuery");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalEMap.g:2372:3: (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==15) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalEMap.g:2372:5: otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_52); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_17, grammarAccess.getEMappingEntityAccess().getCommaKeyword_7_3_0());
                    	          
                    	    }
                    	    // InternalEMap.g:2376:1: ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) )
                    	    int alt58=2;
                    	    switch ( input.LA(1) ) {
                    	    case 80:
                    	    case 81:
                    	        {
                    	        alt58=1;
                    	        }
                    	        break;
                    	    case RULE_ID:
                    	        {
                    	        int LA58_2 = input.LA(2);

                    	        if ( (LA58_2==RULE_ID||LA58_2==43) ) {
                    	            alt58=2;
                    	        }
                    	        else if ( (LA58_2==13||LA58_2==25) ) {
                    	            alt58=1;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 58, 2, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 59:
                    	    case 60:
                    	    case 61:
                    	    case 62:
                    	    case 63:
                    	    case 64:
                    	    case 65:
                    	    case 67:
                    	    case 73:
                    	        {
                    	        alt58=2;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 58, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt58) {
                    	        case 1 :
                    	            // InternalEMap.g:2376:2: ( (lv_namedQueries_18_0= ruleENamedQuery ) )
                    	            {
                    	            // InternalEMap.g:2376:2: ( (lv_namedQueries_18_0= ruleENamedQuery ) )
                    	            // InternalEMap.g:2377:1: (lv_namedQueries_18_0= ruleENamedQuery )
                    	            {
                    	            // InternalEMap.g:2377:1: (lv_namedQueries_18_0= ruleENamedQuery )
                    	            // InternalEMap.g:2378:3: lv_namedQueries_18_0= ruleENamedQuery
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_3_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_9);
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
                    	                      		"at.bestsolution.persistence.emap.EMap.ENamedQuery");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalEMap.g:2395:6: ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) )
                    	            {
                    	            // InternalEMap.g:2395:6: ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) )
                    	            // InternalEMap.g:2396:1: (lv_namedCustomQueries_19_0= ruleENamedCustomQuery )
                    	            {
                    	            // InternalEMap.g:2396:1: (lv_namedCustomQueries_19_0= ruleENamedCustomQuery )
                    	            // InternalEMap.g:2397:3: lv_namedCustomQueries_19_0= ruleENamedCustomQuery
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedCustomQueriesENamedCustomQueryParserRuleCall_7_3_1_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_9);
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
                    	                      		"at.bestsolution.persistence.emap.EMap.ENamedCustomQuery");
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_8());
                  
            }
            // InternalEMap.g:2421:1: (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==34) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalEMap.g:2421:3: otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) )
                    {
                    otherlv_22=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getEMappingEntityAccess().getAsKeyword_9_0());
                          
                    }
                    // InternalEMap.g:2425:1: ( (lv_tableName_23_0= RULE_ID ) )
                    // InternalEMap.g:2426:1: (lv_tableName_23_0= RULE_ID )
                    {
                    // InternalEMap.g:2426:1: (lv_tableName_23_0= RULE_ID )
                    // InternalEMap.g:2427:3: lv_tableName_23_0= RULE_ID
                    {
                    lv_tableName_23_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalEMap.g:2443:4: (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==49) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalEMap.g:2443:6: otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) )
                    {
                    otherlv_24=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getEMappingEntityAccess().getDescriminatedbyKeyword_10_0());
                          
                    }
                    // InternalEMap.g:2447:1: ( (lv_descriminationColumn_25_0= RULE_ID ) )
                    // InternalEMap.g:2448:1: (lv_descriminationColumn_25_0= RULE_ID )
                    {
                    // InternalEMap.g:2448:1: (lv_descriminationColumn_25_0= RULE_ID )
                    // InternalEMap.g:2449:3: lv_descriminationColumn_25_0= RULE_ID
                    {
                    lv_descriminationColumn_25_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
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
    // InternalEMap.g:2473:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // InternalEMap.g:2474:2: (iv_ruleEAttribute= ruleEAttribute EOF )
            // InternalEMap.g:2475:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:2482:1: ruleEAttribute returns [EObject current=null] : ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? ) ;
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
            // InternalEMap.g:2485:28: ( ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? ) )
            // InternalEMap.g:2486:1: ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? )
            {
            // InternalEMap.g:2486:1: ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? )
            // InternalEMap.g:2486:2: ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )?
            {
            // InternalEMap.g:2486:2: ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID||LA64_0==50) ) {
                alt64=1;
            }
            else if ( (LA64_0==51) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalEMap.g:2486:3: ( (lv_pk_0_0= 'primarykey' ) )?
                    {
                    // InternalEMap.g:2486:3: ( (lv_pk_0_0= 'primarykey' ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==50) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalEMap.g:2487:1: (lv_pk_0_0= 'primarykey' )
                            {
                            // InternalEMap.g:2487:1: (lv_pk_0_0= 'primarykey' )
                            // InternalEMap.g:2488:3: lv_pk_0_0= 'primarykey'
                            {
                            lv_pk_0_0=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
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
                    // InternalEMap.g:2502:6: ( (lv_forcedFk_1_0= 'forced-fk' ) )
                    {
                    // InternalEMap.g:2502:6: ( (lv_forcedFk_1_0= 'forced-fk' ) )
                    // InternalEMap.g:2503:1: (lv_forcedFk_1_0= 'forced-fk' )
                    {
                    // InternalEMap.g:2503:1: (lv_forcedFk_1_0= 'forced-fk' )
                    // InternalEMap.g:2504:3: lv_forcedFk_1_0= 'forced-fk'
                    {
                    lv_forcedFk_1_0=(Token)match(input,51,FOLLOW_4); if (state.failed) return current;
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

            // InternalEMap.g:2517:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEMap.g:2518:1: (lv_name_2_0= RULE_ID )
            {
            // InternalEMap.g:2518:1: (lv_name_2_0= RULE_ID )
            // InternalEMap.g:2519:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,52,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // InternalEMap.g:2539:1: ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            else if ( (LA69_0==54) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalEMap.g:2539:2: ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? )
                    {
                    // InternalEMap.g:2539:2: ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? )
                    // InternalEMap.g:2539:3: ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )?
                    {
                    // InternalEMap.g:2539:3: ( (lv_columnName_4_0= RULE_ID ) )
                    // InternalEMap.g:2540:1: (lv_columnName_4_0= RULE_ID )
                    {
                    // InternalEMap.g:2540:1: (lv_columnName_4_0= RULE_ID )
                    // InternalEMap.g:2541:3: lv_columnName_4_0= RULE_ID
                    {
                    lv_columnName_4_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalEMap.g:2557:2: (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==53) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalEMap.g:2557:4: otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}'
                            {
                            otherlv_5=(Token)match(input,53,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getEAttributeAccess().getGeneratedbyKeyword_3_0_1_0());
                                  
                            }
                            otherlv_6=(Token)match(input,13,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_3_0_1_1());
                                  
                            }
                            // InternalEMap.g:2565:1: ( (lv_valueGenerators_7_0= ruleEValueGenerator ) )
                            // InternalEMap.g:2566:1: (lv_valueGenerators_7_0= ruleEValueGenerator )
                            {
                            // InternalEMap.g:2566:1: (lv_valueGenerators_7_0= ruleEValueGenerator )
                            // InternalEMap.g:2567:3: lv_valueGenerators_7_0= ruleEValueGenerator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_9);
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
                                      		"at.bestsolution.persistence.emap.EMap.EValueGenerator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalEMap.g:2583:2: (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==15) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // InternalEMap.g:2583:4: otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getCommaKeyword_3_0_1_3_0());
                            	          
                            	    }
                            	    // InternalEMap.g:2587:1: ( (lv_valueGenerators_9_0= ruleEValueGenerator ) )
                            	    // InternalEMap.g:2588:1: (lv_valueGenerators_9_0= ruleEValueGenerator )
                            	    {
                            	    // InternalEMap.g:2588:1: (lv_valueGenerators_9_0= ruleEValueGenerator )
                            	    // InternalEMap.g:2589:3: lv_valueGenerators_9_0= ruleEValueGenerator
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_9);
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
                            	              		"at.bestsolution.persistence.emap.EMap.EValueGenerator");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop65;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,16,FOLLOW_35); if (state.failed) return current;
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
                    // InternalEMap.g:2610:6: ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? )
                    {
                    // InternalEMap.g:2610:6: ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? )
                    // InternalEMap.g:2610:7: ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )?
                    {
                    // InternalEMap.g:2610:7: ( (lv_resolved_11_0= 'resolve' ) )
                    // InternalEMap.g:2611:1: (lv_resolved_11_0= 'resolve' )
                    {
                    // InternalEMap.g:2611:1: (lv_resolved_11_0= 'resolve' )
                    // InternalEMap.g:2612:3: lv_resolved_11_0= 'resolve'
                    {
                    lv_resolved_11_0=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
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

                    // InternalEMap.g:2625:2: ( ( ruleQualifiedName ) )
                    // InternalEMap.g:2626:1: ( ruleQualifiedName )
                    {
                    // InternalEMap.g:2626:1: ( ruleQualifiedName )
                    // InternalEMap.g:2627:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_31);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // InternalEMap.g:2644:1: ( (lv_parameters_14_0= RULE_ID ) )
                    // InternalEMap.g:2645:1: (lv_parameters_14_0= RULE_ID )
                    {
                    // InternalEMap.g:2645:1: (lv_parameters_14_0= RULE_ID )
                    // InternalEMap.g:2646:3: lv_parameters_14_0= RULE_ID
                    {
                    lv_parameters_14_0=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,26,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }
                    // InternalEMap.g:2666:1: ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_ID) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalEMap.g:2666:2: ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )?
                            {
                            // InternalEMap.g:2666:2: ( ( ruleQualifiedName ) )
                            // InternalEMap.g:2667:1: ( ruleQualifiedName )
                            {
                            // InternalEMap.g:2667:1: ( ruleQualifiedName )
                            // InternalEMap.g:2668:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getEAttributeRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getOppositeEAttributeCrossReference_3_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_60);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_17=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getOnKeyword_3_1_5_1());
                                  
                            }
                            // InternalEMap.g:2685:1: ( (lv_relationTable_18_0= RULE_ID ) )
                            // InternalEMap.g:2686:1: (lv_relationTable_18_0= RULE_ID )
                            {
                            // InternalEMap.g:2686:1: (lv_relationTable_18_0= RULE_ID )
                            // InternalEMap.g:2687:3: lv_relationTable_18_0= RULE_ID
                            {
                            lv_relationTable_18_0=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
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
                                      		"org.eclipse.xtext.common.Terminals.ID");
                              	    
                            }

                            }


                            }

                            // InternalEMap.g:2703:2: (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==43) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // InternalEMap.g:2703:4: otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) )
                                    {
                                    otherlv_19=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getFullStopKeyword_3_1_5_3_0());
                                          
                                    }
                                    // InternalEMap.g:2707:1: ( (lv_relationColumn_20_0= RULE_ID ) )
                                    // InternalEMap.g:2708:1: (lv_relationColumn_20_0= RULE_ID )
                                    {
                                    // InternalEMap.g:2708:1: (lv_relationColumn_20_0= RULE_ID )
                                    // InternalEMap.g:2709:3: lv_relationColumn_20_0= RULE_ID
                                    {
                                    lv_relationColumn_20_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
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
                                              		"org.eclipse.xtext.common.Terminals.ID");
                                      	    
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

            // InternalEMap.g:2725:8: (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==31) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalEMap.g:2725:10: otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getSizeKeyword_4_0());
                          
                    }
                    // InternalEMap.g:2729:1: ( (lv_size_22_0= RULE_STRING ) )
                    // InternalEMap.g:2730:1: (lv_size_22_0= RULE_STRING )
                    {
                    // InternalEMap.g:2730:1: (lv_size_22_0= RULE_STRING )
                    // InternalEMap.g:2731:3: lv_size_22_0= RULE_STRING
                    {
                    lv_size_22_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
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
    // InternalEMap.g:2755:1: entryRuleEValueGenerator returns [EObject current=null] : iv_ruleEValueGenerator= ruleEValueGenerator EOF ;
    public final EObject entryRuleEValueGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueGenerator = null;


        try {
            // InternalEMap.g:2756:2: (iv_ruleEValueGenerator= ruleEValueGenerator EOF )
            // InternalEMap.g:2757:2: iv_ruleEValueGenerator= ruleEValueGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEValueGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEValueGenerator=ruleEValueGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEValueGenerator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:2764:1: ruleEValueGenerator returns [EObject current=null] : ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) ;
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
            // InternalEMap.g:2767:28: ( ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) )
            // InternalEMap.g:2768:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            {
            // InternalEMap.g:2768:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            // InternalEMap.g:2768:2: ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            {
            // InternalEMap.g:2768:2: ( (lv_dbType_0_0= RULE_STRING ) )
            // InternalEMap.g:2769:1: (lv_dbType_0_0= RULE_STRING )
            {
            // InternalEMap.g:2769:1: (lv_dbType_0_0= RULE_STRING )
            // InternalEMap.g:2770:3: lv_dbType_0_0= RULE_STRING
            {
            lv_dbType_0_0=(Token)match(input,RULE_STRING,FOLLOW_62); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalEMap.g:2786:2: ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt71=1;
                }
                break;
            case 57:
                {
                alt71=2;
                }
                break;
            case 58:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalEMap.g:2786:3: ( (lv_autokey_1_0= 'autokey' ) )
                    {
                    // InternalEMap.g:2786:3: ( (lv_autokey_1_0= 'autokey' ) )
                    // InternalEMap.g:2787:1: (lv_autokey_1_0= 'autokey' )
                    {
                    // InternalEMap.g:2787:1: (lv_autokey_1_0= 'autokey' )
                    // InternalEMap.g:2788:3: lv_autokey_1_0= 'autokey'
                    {
                    lv_autokey_1_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
                    // InternalEMap.g:2802:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    {
                    // InternalEMap.g:2802:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    // InternalEMap.g:2802:8: otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEValueGeneratorAccess().getQueryKeyword_1_1_0());
                          
                    }
                    // InternalEMap.g:2806:1: ( (lv_query_3_0= RULE_STRING ) )
                    // InternalEMap.g:2807:1: (lv_query_3_0= RULE_STRING )
                    {
                    // InternalEMap.g:2807:1: (lv_query_3_0= RULE_STRING )
                    // InternalEMap.g:2808:3: lv_query_3_0= RULE_STRING
                    {
                    lv_query_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEMap.g:2825:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    {
                    // InternalEMap.g:2825:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    // InternalEMap.g:2825:8: otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEValueGeneratorAccess().getSeqnextKeyword_1_2_0());
                          
                    }
                    // InternalEMap.g:2829:1: ( (lv_sequence_5_0= RULE_STRING ) )
                    // InternalEMap.g:2830:1: (lv_sequence_5_0= RULE_STRING )
                    {
                    // InternalEMap.g:2830:1: (lv_sequence_5_0= RULE_STRING )
                    // InternalEMap.g:2831:3: lv_sequence_5_0= RULE_STRING
                    {
                    lv_sequence_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
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
    // InternalEMap.g:2855:1: entryRuleENamedQuery returns [EObject current=null] : iv_ruleENamedQuery= ruleENamedQuery EOF ;
    public final EObject entryRuleENamedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedQuery = null;


        try {
            // InternalEMap.g:2856:2: (iv_ruleENamedQuery= ruleENamedQuery EOF )
            // InternalEMap.g:2857:2: iv_ruleENamedQuery= ruleENamedQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleENamedQuery=ruleENamedQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:2864:1: ruleENamedQuery returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' ) ;
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
            // InternalEMap.g:2867:28: ( ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' ) )
            // InternalEMap.g:2868:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' )
            {
            // InternalEMap.g:2868:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' )
            // InternalEMap.g:2868:2: ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}'
            {
            // InternalEMap.g:2868:2: ( (lv_returnType_0_0= ruleReturnType ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=80 && LA72_0<=81)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalEMap.g:2869:1: (lv_returnType_0_0= ruleReturnType )
                    {
                    // InternalEMap.g:2869:1: (lv_returnType_0_0= ruleReturnType )
                    // InternalEMap.g:2870:3: lv_returnType_0_0= ruleReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getReturnTypeReturnTypeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_4);
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
                              		"at.bestsolution.persistence.emap.EMap.ReturnType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalEMap.g:2886:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEMap.g:2887:1: (lv_name_1_0= RULE_ID )
            {
            // InternalEMap.g:2887:1: (lv_name_1_0= RULE_ID )
            // InternalEMap.g:2888:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalEMap.g:2904:2: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==25) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalEMap.g:2904:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalEMap.g:2908:1: ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_ID||LA74_0==50||(LA74_0>=59 && LA74_0<=63)||LA74_0==65) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalEMap.g:2908:2: ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )*
                            {
                            // InternalEMap.g:2908:2: ( (lv_parameters_3_0= ruleEParameter ) )
                            // InternalEMap.g:2909:1: (lv_parameters_3_0= ruleEParameter )
                            {
                            // InternalEMap.g:2909:1: (lv_parameters_3_0= ruleEParameter )
                            // InternalEMap.g:2910:3: lv_parameters_3_0= ruleEParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_32);
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
                                      		"at.bestsolution.persistence.emap.EMap.EParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalEMap.g:2926:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )*
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==15) ) {
                                    alt73=1;
                                }


                                switch (alt73) {
                            	case 1 :
                            	    // InternalEMap.g:2926:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FOLLOW_65); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getENamedQueryAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // InternalEMap.g:2930:1: ( (lv_parameters_5_0= ruleEParameter ) )
                            	    // InternalEMap.g:2931:1: (lv_parameters_5_0= ruleEParameter )
                            	    {
                            	    // InternalEMap.g:2931:1: (lv_parameters_5_0= ruleEParameter )
                            	    // InternalEMap.g:2932:3: lv_parameters_5_0= ruleEParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_32);
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
                            	              		"at.bestsolution.persistence.emap.EMap.EParameter");
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


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalEMap.g:2956:1: ( (lv_queries_8_0= ruleEQuery ) )
            // InternalEMap.g:2957:1: (lv_queries_8_0= ruleEQuery )
            {
            // InternalEMap.g:2957:1: (lv_queries_8_0= ruleEQuery )
            // InternalEMap.g:2958:3: lv_queries_8_0= ruleEQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
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
                      		"at.bestsolution.persistence.emap.EMap.EQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:2974:2: (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==15) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalEMap.g:2974:4: otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getENamedQueryAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // InternalEMap.g:2978:1: ( (lv_queries_10_0= ruleEQuery ) )
            	    // InternalEMap.g:2979:1: (lv_queries_10_0= ruleEQuery )
            	    {
            	    // InternalEMap.g:2979:1: (lv_queries_10_0= ruleEQuery )
            	    // InternalEMap.g:2980:3: lv_queries_10_0= ruleEQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
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
            	              		"at.bestsolution.persistence.emap.EMap.EQuery");
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

            otherlv_11=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:3008:1: entryRuleEPrimtiveType returns [String current=null] : iv_ruleEPrimtiveType= ruleEPrimtiveType EOF ;
    public final String entryRuleEPrimtiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEPrimtiveType = null;


        try {
            // InternalEMap.g:3009:2: (iv_ruleEPrimtiveType= ruleEPrimtiveType EOF )
            // InternalEMap.g:3010:2: iv_ruleEPrimtiveType= ruleEPrimtiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPrimtiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEPrimtiveType=ruleEPrimtiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPrimtiveType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3017:1: ruleEPrimtiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleEPrimtiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_5 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:3020:28: ( (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN ) )
            // InternalEMap.g:3021:1: (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN )
            {
            // InternalEMap.g:3021:1: (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN )
            int alt77=6;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt77=1;
                }
                break;
            case 60:
                {
                alt77=2;
                }
                break;
            case 61:
                {
                alt77=3;
                }
                break;
            case 62:
                {
                alt77=4;
                }
                break;
            case 63:
                {
                alt77=5;
                }
                break;
            case RULE_ID:
                {
                alt77=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalEMap.g:3022:2: kw= 'int'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getIntKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalEMap.g:3029:2: kw= 'long'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getLongKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalEMap.g:3036:2: kw= 'double'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getDoubleKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalEMap.g:3043:2: kw= 'float'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getFloatKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalEMap.g:3050:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getBooleanKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalEMap.g:3057:5: this_FQN_5= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEPrimtiveTypeAccess().getFQNParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalEMap.g:3075:1: entryRuleEMapType returns [String current=null] : iv_ruleEMapType= ruleEMapType EOF ;
    public final String entryRuleEMapType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMapType = null;


        try {
            // InternalEMap.g:3076:2: (iv_ruleEMapType= ruleEMapType EOF )
            // InternalEMap.g:3077:2: iv_ruleEMapType= ruleEMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMapTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEMapType=ruleEMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMapType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3084:1: ruleEMapType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'map' ;
    public final AntlrDatatypeRuleToken ruleEMapType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:3087:28: (kw= 'map' )
            // InternalEMap.g:3089:2: kw= 'map'
            {
            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:3102:1: entryRuleENamedCustomQuery returns [EObject current=null] : iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF ;
    public final EObject entryRuleENamedCustomQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedCustomQuery = null;


        try {
            // InternalEMap.g:3103:2: (iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF )
            // InternalEMap.g:3104:2: iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedCustomQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleENamedCustomQuery=ruleENamedCustomQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedCustomQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3111:1: ruleENamedCustomQuery returns [EObject current=null] : ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' ) ;
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
            // InternalEMap.g:3114:28: ( ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' ) )
            // InternalEMap.g:3115:1: ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' )
            {
            // InternalEMap.g:3115:1: ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' )
            // InternalEMap.g:3115:2: ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}'
            {
            // InternalEMap.g:3115:2: ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID||(LA78_0>=59 && LA78_0<=64)||LA78_0==67||LA78_0==73) ) {
                alt78=1;
            }
            else if ( (LA78_0==65) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalEMap.g:3115:3: ( (lv_returnType_0_0= ruleEReturnType ) )
                    {
                    // InternalEMap.g:3115:3: ( (lv_returnType_0_0= ruleEReturnType ) )
                    // InternalEMap.g:3116:1: (lv_returnType_0_0= ruleEReturnType )
                    {
                    // InternalEMap.g:3116:1: (lv_returnType_0_0= ruleEReturnType )
                    // InternalEMap.g:3117:3: lv_returnType_0_0= ruleEReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getReturnTypeEReturnTypeParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_4);
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
                              		"at.bestsolution.persistence.emap.EMap.EReturnType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEMap.g:3134:6: ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' )
                    {
                    // InternalEMap.g:3134:6: ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' )
                    // InternalEMap.g:3134:7: ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']'
                    {
                    // InternalEMap.g:3134:7: ( (lv_list_1_0= '[' ) )
                    // InternalEMap.g:3135:1: (lv_list_1_0= '[' )
                    {
                    // InternalEMap.g:3135:1: (lv_list_1_0= '[' )
                    // InternalEMap.g:3136:3: lv_list_1_0= '['
                    {
                    lv_list_1_0=(Token)match(input,65,FOLLOW_66); if (state.failed) return current;
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

                    // InternalEMap.g:3149:2: ( (lv_returnType_2_0= ruleEReturnType ) )
                    // InternalEMap.g:3150:1: (lv_returnType_2_0= ruleEReturnType )
                    {
                    // InternalEMap.g:3150:1: (lv_returnType_2_0= ruleEReturnType )
                    // InternalEMap.g:3151:3: lv_returnType_2_0= ruleEReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getReturnTypeEReturnTypeParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_67);
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
                              		"at.bestsolution.persistence.emap.EMap.EReturnType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getENamedCustomQueryAccess().getRightSquareBracketKeyword_0_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalEMap.g:3171:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalEMap.g:3172:1: (lv_name_4_0= RULE_ID )
            {
            // InternalEMap.g:3172:1: (lv_name_4_0= RULE_ID )
            // InternalEMap.g:3173:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalEMap.g:3189:2: (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==25) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalEMap.g:3189:4: otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getENamedCustomQueryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalEMap.g:3193:1: ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_ID||LA80_0==50||(LA80_0>=59 && LA80_0<=63)||LA80_0==65) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalEMap.g:3193:2: ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )*
                            {
                            // InternalEMap.g:3193:2: ( (lv_parameters_6_0= ruleEParameter ) )
                            // InternalEMap.g:3194:1: (lv_parameters_6_0= ruleEParameter )
                            {
                            // InternalEMap.g:3194:1: (lv_parameters_6_0= ruleEParameter )
                            // InternalEMap.g:3195:3: lv_parameters_6_0= ruleEParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getParametersEParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_32);
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
                                      		"at.bestsolution.persistence.emap.EMap.EParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalEMap.g:3211:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==15) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // InternalEMap.g:3211:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) )
                            	    {
                            	    otherlv_7=(Token)match(input,15,FOLLOW_65); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_7, grammarAccess.getENamedCustomQueryAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // InternalEMap.g:3215:1: ( (lv_parameters_8_0= ruleEParameter ) )
                            	    // InternalEMap.g:3216:1: (lv_parameters_8_0= ruleEParameter )
                            	    {
                            	    // InternalEMap.g:3216:1: (lv_parameters_8_0= ruleEParameter )
                            	    // InternalEMap.g:3217:3: lv_parameters_8_0= ruleEParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getParametersEParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_32);
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
                            	              		"at.bestsolution.persistence.emap.EMap.EParameter");
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


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getENamedCustomQueryAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getENamedCustomQueryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalEMap.g:3241:1: ( (lv_queries_11_0= ruleECustomQuery ) )
            // InternalEMap.g:3242:1: (lv_queries_11_0= ruleECustomQuery )
            {
            // InternalEMap.g:3242:1: (lv_queries_11_0= ruleECustomQuery )
            // InternalEMap.g:3243:3: lv_queries_11_0= ruleECustomQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getQueriesECustomQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
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
                      		"at.bestsolution.persistence.emap.EMap.ECustomQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:3259:2: (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==15) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalEMap.g:3259:4: otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getENamedCustomQueryAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // InternalEMap.g:3263:1: ( (lv_queries_13_0= ruleECustomQuery ) )
            	    // InternalEMap.g:3264:1: (lv_queries_13_0= ruleECustomQuery )
            	    {
            	    // InternalEMap.g:3264:1: (lv_queries_13_0= ruleECustomQuery )
            	    // InternalEMap.g:3265:3: lv_queries_13_0= ruleECustomQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getQueriesECustomQueryParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
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
            	              		"at.bestsolution.persistence.emap.EMap.ECustomQuery");
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

            otherlv_14=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:3293:1: entryRuleEReturnType returns [EObject current=null] : iv_ruleEReturnType= ruleEReturnType EOF ;
    public final EObject entryRuleEReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReturnType = null;


        try {
            // InternalEMap.g:3294:2: (iv_ruleEReturnType= ruleEReturnType EOF )
            // InternalEMap.g:3295:2: iv_ruleEReturnType= ruleEReturnType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEReturnTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEReturnType=ruleEReturnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEReturnType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3302:1: ruleEReturnType returns [EObject current=null] : (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef ) ;
    public final EObject ruleEReturnType() throws RecognitionException {
        EObject current = null;

        EObject this_EPredefinedType_0 = null;

        EObject this_ETypeDef_1 = null;

        EObject this_EModelTypeDef_2 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:3305:28: ( (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef ) )
            // InternalEMap.g:3306:1: (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef )
            {
            // InternalEMap.g:3306:1: (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef )
            int alt83=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt83=1;
                }
                break;
            case 67:
                {
                alt83=2;
                }
                break;
            case 73:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalEMap.g:3307:5: this_EPredefinedType_0= ruleEPredefinedType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getEPredefinedTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEMap.g:3317:5: this_ETypeDef_1= ruleETypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getETypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEMap.g:3327:5: this_EModelTypeDef_2= ruleEModelTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getEModelTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalEMap.g:3343:1: entryRuleEPredefinedType returns [EObject current=null] : iv_ruleEPredefinedType= ruleEPredefinedType EOF ;
    public final EObject entryRuleEPredefinedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPredefinedType = null;


        try {
            // InternalEMap.g:3344:2: (iv_ruleEPredefinedType= ruleEPredefinedType EOF )
            // InternalEMap.g:3345:2: iv_ruleEPredefinedType= ruleEPredefinedType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPredefinedTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEPredefinedType=ruleEPredefinedType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPredefinedType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3352:1: ruleEPredefinedType returns [EObject current=null] : ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) ) ;
    public final EObject ruleEPredefinedType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ref_0_1 = null;

        AntlrDatatypeRuleToken lv_ref_0_2 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:3355:28: ( ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) ) )
            // InternalEMap.g:3356:1: ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) )
            {
            // InternalEMap.g:3356:1: ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) )
            // InternalEMap.g:3357:1: ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) )
            {
            // InternalEMap.g:3357:1: ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) )
            // InternalEMap.g:3358:1: (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType )
            {
            // InternalEMap.g:3358:1: (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==64) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_ID||(LA84_0>=59 && LA84_0<=63)) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalEMap.g:3359:3: lv_ref_0_1= ruleEMapType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEPredefinedTypeAccess().getRefEMapTypeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.persistence.emap.EMap.EMapType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalEMap.g:3374:8: lv_ref_0_2= ruleEPrimtiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEPredefinedTypeAccess().getRefEPrimtiveTypeParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.persistence.emap.EMap.EPrimtiveType");
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
    // InternalEMap.g:3400:1: entryRuleETypeDef returns [EObject current=null] : iv_ruleETypeDef= ruleETypeDef EOF ;
    public final EObject entryRuleETypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeDef = null;


        try {
            // InternalEMap.g:3401:2: (iv_ruleETypeDef= ruleETypeDef EOF )
            // InternalEMap.g:3402:2: iv_ruleETypeDef= ruleETypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleETypeDef=ruleETypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleETypeDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3409:1: ruleETypeDef returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' ) ;
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
            // InternalEMap.g:3412:28: ( (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' ) )
            // InternalEMap.g:3413:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' )
            {
            // InternalEMap.g:3413:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' )
            // InternalEMap.g:3413:3: otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getETypeDefAccess().getTypedefKeyword_0());
                  
            }
            // InternalEMap.g:3417:1: ( (lv_name_1_0= ruleFQN ) )
            // InternalEMap.g:3418:1: (lv_name_1_0= ruleFQN )
            {
            // InternalEMap.g:3418:1: (lv_name_1_0= ruleFQN )
            // InternalEMap.g:3419:3: lv_name_1_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getETypeDefAccess().getNameFQNParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_31);
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
                      		"at.bestsolution.persistence.emap.EMap.FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getETypeDefAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalEMap.g:3439:1: ( (lv_types_3_0= ruleEValueTypeAttribute ) )
            // InternalEMap.g:3440:1: (lv_types_3_0= ruleEValueTypeAttribute )
            {
            // InternalEMap.g:3440:1: (lv_types_3_0= ruleEValueTypeAttribute )
            // InternalEMap.g:3441:3: lv_types_3_0= ruleEValueTypeAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getETypeDefAccess().getTypesEValueTypeAttributeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_32);
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
                      		"at.bestsolution.persistence.emap.EMap.EValueTypeAttribute");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:3457:2: (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==15) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalEMap.g:3457:4: otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_68); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getETypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalEMap.g:3461:1: ( (lv_types_5_0= ruleEValueTypeAttribute ) )
            	    // InternalEMap.g:3462:1: (lv_types_5_0= ruleEValueTypeAttribute )
            	    {
            	    // InternalEMap.g:3462:1: (lv_types_5_0= ruleEValueTypeAttribute )
            	    // InternalEMap.g:3463:3: lv_types_5_0= ruleEValueTypeAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getETypeDefAccess().getTypesEValueTypeAttributeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_32);
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
            	              		"at.bestsolution.persistence.emap.EMap.EValueTypeAttribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:3491:1: entryRuleEModelTypeDef returns [EObject current=null] : iv_ruleEModelTypeDef= ruleEModelTypeDef EOF ;
    public final EObject entryRuleEModelTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelTypeDef = null;


        try {
            // InternalEMap.g:3492:2: (iv_ruleEModelTypeDef= ruleEModelTypeDef EOF )
            // InternalEMap.g:3493:2: iv_ruleEModelTypeDef= ruleEModelTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEModelTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEModelTypeDef=ruleEModelTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEModelTypeDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3500:1: ruleEModelTypeDef returns [EObject current=null] : ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' ) ;
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
            // InternalEMap.g:3503:28: ( ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' ) )
            // InternalEMap.g:3504:1: ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' )
            {
            // InternalEMap.g:3504:1: ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' )
            // InternalEMap.g:3504:2: ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')'
            {
            // InternalEMap.g:3504:2: ( (lv_eclassDef_0_0= ruleEType ) )
            // InternalEMap.g:3505:1: (lv_eclassDef_0_0= ruleEType )
            {
            // InternalEMap.g:3505:1: (lv_eclassDef_0_0= ruleEType )
            // InternalEMap.g:3506:3: lv_eclassDef_0_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getEclassDefETypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_31);
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
                      		"at.bestsolution.persistence.emap.EMap.EType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEModelTypeDefAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalEMap.g:3526:1: ( (lv_attributes_2_0= ruleEModelTypeAttribute ) )
            // InternalEMap.g:3527:1: (lv_attributes_2_0= ruleEModelTypeAttribute )
            {
            // InternalEMap.g:3527:1: (lv_attributes_2_0= ruleEModelTypeAttribute )
            // InternalEMap.g:3528:3: lv_attributes_2_0= ruleEModelTypeAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getAttributesEModelTypeAttributeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_32);
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
                      		"at.bestsolution.persistence.emap.EMap.EModelTypeAttribute");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:3544:2: (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==15) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalEMap.g:3544:4: otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEModelTypeDefAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalEMap.g:3548:1: ( (lv_attributes_4_0= ruleEModelTypeAttribute ) )
            	    // InternalEMap.g:3549:1: (lv_attributes_4_0= ruleEModelTypeAttribute )
            	    {
            	    // InternalEMap.g:3549:1: (lv_attributes_4_0= ruleEModelTypeAttribute )
            	    // InternalEMap.g:3550:3: lv_attributes_4_0= ruleEModelTypeAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getAttributesEModelTypeAttributeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_32);
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
            	              		"at.bestsolution.persistence.emap.EMap.EModelTypeAttribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:3578:1: entryRuleEModelTypeAttribute returns [EObject current=null] : iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF ;
    public final EObject entryRuleEModelTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelTypeAttribute = null;


        try {
            // InternalEMap.g:3579:2: (iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF )
            // InternalEMap.g:3580:2: iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEModelTypeAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEModelTypeAttribute=ruleEModelTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEModelTypeAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3587:1: ruleEModelTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? ) ;
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
            // InternalEMap.g:3590:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? ) )
            // InternalEMap.g:3591:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? )
            {
            // InternalEMap.g:3591:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? )
            // InternalEMap.g:3591:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )?
            {
            // InternalEMap.g:3591:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEMap.g:3592:1: (lv_name_0_0= RULE_ID )
            {
            // InternalEMap.g:3592:1: (lv_name_0_0= RULE_ID )
            // InternalEMap.g:3593:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_69); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalEMap.g:3609:2: (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==54) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalEMap.g:3609:4: otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )?
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEModelTypeAttributeAccess().getResolveKeyword_1_0());
                          
                    }
                    // InternalEMap.g:3613:1: ( ( ruleQualifiedName ) )
                    // InternalEMap.g:3614:1: ( ruleQualifiedName )
                    {
                    // InternalEMap.g:3614:1: ( ruleQualifiedName )
                    // InternalEMap.g:3615:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEModelTypeAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEModelTypeAttributeAccess().getQueryENamedCustomQueryCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_70);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalEMap.g:3628:2: (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==25) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalEMap.g:3628:4: otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')'
                            {
                            otherlv_3=(Token)match(input,25,FOLLOW_71); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getEModelTypeAttributeAccess().getLeftParenthesisKeyword_1_2_0());
                                  
                            }
                            // InternalEMap.g:3632:1: ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )?
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==RULE_ID) ) {
                                alt88=1;
                            }
                            switch (alt88) {
                                case 1 :
                                    // InternalEMap.g:3632:2: ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
                                    {
                                    // InternalEMap.g:3632:2: ( (lv_parameters_4_0= RULE_ID ) )
                                    // InternalEMap.g:3633:1: (lv_parameters_4_0= RULE_ID )
                                    {
                                    // InternalEMap.g:3633:1: (lv_parameters_4_0= RULE_ID )
                                    // InternalEMap.g:3634:3: lv_parameters_4_0= RULE_ID
                                    {
                                    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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
                                              		"org.eclipse.xtext.common.Terminals.ID");
                                      	    
                                    }

                                    }


                                    }

                                    // InternalEMap.g:3650:2: (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
                                    loop87:
                                    do {
                                        int alt87=2;
                                        int LA87_0 = input.LA(1);

                                        if ( (LA87_0==15) ) {
                                            alt87=1;
                                        }


                                        switch (alt87) {
                                    	case 1 :
                                    	    // InternalEMap.g:3650:4: otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) )
                                    	    {
                                    	    otherlv_5=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_5, grammarAccess.getEModelTypeAttributeAccess().getCommaKeyword_1_2_1_1_0());
                                    	          
                                    	    }
                                    	    // InternalEMap.g:3654:1: ( (lv_parameters_6_0= RULE_ID ) )
                                    	    // InternalEMap.g:3655:1: (lv_parameters_6_0= RULE_ID )
                                    	    {
                                    	    // InternalEMap.g:3655:1: (lv_parameters_6_0= RULE_ID )
                                    	    // InternalEMap.g:3656:3: lv_parameters_6_0= RULE_ID
                                    	    {
                                    	    lv_parameters_6_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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
                                    	              		"org.eclipse.xtext.common.Terminals.ID");
                                    	      	    
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop87;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_7=(Token)match(input,26,FOLLOW_72); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getEModelTypeAttributeAccess().getRightParenthesisKeyword_1_2_2());
                                  
                            }

                            }
                            break;

                    }

                    // InternalEMap.g:3676:3: ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==68) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalEMap.g:3676:4: ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )?
                            {
                            // InternalEMap.g:3676:4: ( (lv_cached_8_0= 'cached' ) )
                            // InternalEMap.g:3677:1: (lv_cached_8_0= 'cached' )
                            {
                            // InternalEMap.g:3677:1: (lv_cached_8_0= 'cached' )
                            // InternalEMap.g:3678:3: lv_cached_8_0= 'cached'
                            {
                            lv_cached_8_0=(Token)match(input,68,FOLLOW_73); if (state.failed) return current;
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

                            // InternalEMap.g:3691:2: ( (lv_cacheName_9_0= RULE_ID ) )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==RULE_ID) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // InternalEMap.g:3692:1: (lv_cacheName_9_0= RULE_ID )
                                    {
                                    // InternalEMap.g:3692:1: (lv_cacheName_9_0= RULE_ID )
                                    // InternalEMap.g:3693:3: lv_cacheName_9_0= RULE_ID
                                    {
                                    lv_cacheName_9_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                                              		"org.eclipse.xtext.common.Terminals.ID");
                                      	    
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
    // InternalEMap.g:3717:1: entryRuleEValueTypeAttribute returns [EObject current=null] : iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF ;
    public final EObject entryRuleEValueTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueTypeAttribute = null;


        try {
            // InternalEMap.g:3718:2: (iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF )
            // InternalEMap.g:3719:2: iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEValueTypeAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEValueTypeAttribute=ruleEValueTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEValueTypeAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3726:1: ruleEValueTypeAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEValueTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:3729:28: ( ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEMap.g:3730:1: ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEMap.g:3730:1: ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEMap.g:3730:2: ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalEMap.g:3730:2: ( (lv_type_0_0= ruleEPrimtiveType ) )
            // InternalEMap.g:3731:1: (lv_type_0_0= ruleEPrimtiveType )
            {
            // InternalEMap.g:3731:1: (lv_type_0_0= ruleEPrimtiveType )
            // InternalEMap.g:3732:3: lv_type_0_0= ruleEPrimtiveType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEValueTypeAttributeAccess().getTypeEPrimtiveTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
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
                      		"at.bestsolution.persistence.emap.EMap.EPrimtiveType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:3748:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalEMap.g:3749:1: (lv_name_1_0= RULE_ID )
            {
            // InternalEMap.g:3749:1: (lv_name_1_0= RULE_ID )
            // InternalEMap.g:3750:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
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
    // InternalEMap.g:3774:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalEMap.g:3775:2: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalEMap.g:3776:2: iv_ruleEParameter= ruleEParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3783:1: ruleEParameter returns [EObject current=null] : ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) ) ;
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
            // InternalEMap.g:3786:28: ( ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) ) )
            // InternalEMap.g:3787:1: ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) )
            {
            // InternalEMap.g:3787:1: ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) )
            // InternalEMap.g:3787:2: ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) )
            {
            // InternalEMap.g:3787:2: ( (lv_id_0_0= 'primarykey' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==50) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalEMap.g:3788:1: (lv_id_0_0= 'primarykey' )
                    {
                    // InternalEMap.g:3788:1: (lv_id_0_0= 'primarykey' )
                    // InternalEMap.g:3789:3: lv_id_0_0= 'primarykey'
                    {
                    lv_id_0_0=(Token)match(input,50,FOLLOW_74); if (state.failed) return current;
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

            // InternalEMap.g:3802:3: ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID||(LA94_0>=59 && LA94_0<=63)) ) {
                alt94=1;
            }
            else if ( (LA94_0==65) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalEMap.g:3802:4: ( (lv_type_1_0= ruleEPrimtiveType ) )
                    {
                    // InternalEMap.g:3802:4: ( (lv_type_1_0= ruleEPrimtiveType ) )
                    // InternalEMap.g:3803:1: (lv_type_1_0= ruleEPrimtiveType )
                    {
                    // InternalEMap.g:3803:1: (lv_type_1_0= ruleEPrimtiveType )
                    // InternalEMap.g:3804:3: lv_type_1_0= ruleEPrimtiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEParameterAccess().getTypeEPrimtiveTypeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_4);
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
                              		"at.bestsolution.persistence.emap.EMap.EPrimtiveType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEMap.g:3821:6: ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' )
                    {
                    // InternalEMap.g:3821:6: ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' )
                    // InternalEMap.g:3821:7: ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']'
                    {
                    // InternalEMap.g:3821:7: ( (lv_list_2_0= '[' ) )
                    // InternalEMap.g:3822:1: (lv_list_2_0= '[' )
                    {
                    // InternalEMap.g:3822:1: (lv_list_2_0= '[' )
                    // InternalEMap.g:3823:3: lv_list_2_0= '['
                    {
                    lv_list_2_0=(Token)match(input,65,FOLLOW_68); if (state.failed) return current;
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

                    // InternalEMap.g:3836:2: ( (lv_type_3_0= ruleEPrimtiveType ) )
                    // InternalEMap.g:3837:1: (lv_type_3_0= ruleEPrimtiveType )
                    {
                    // InternalEMap.g:3837:1: (lv_type_3_0= ruleEPrimtiveType )
                    // InternalEMap.g:3838:3: lv_type_3_0= ruleEPrimtiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEParameterAccess().getTypeEPrimtiveTypeParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_67);
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
                              		"at.bestsolution.persistence.emap.EMap.EPrimtiveType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getRightSquareBracketKeyword_1_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalEMap.g:3858:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalEMap.g:3859:1: (lv_name_5_0= RULE_ID )
            {
            // InternalEMap.g:3859:1: (lv_name_5_0= RULE_ID )
            // InternalEMap.g:3860:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
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
    // InternalEMap.g:3884:1: entryRuleEQuery returns [EObject current=null] : iv_ruleEQuery= ruleEQuery EOF ;
    public final EObject entryRuleEQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQuery = null;


        try {
            // InternalEMap.g:3885:2: (iv_ruleEQuery= ruleEQuery EOF )
            // InternalEMap.g:3886:2: iv_ruleEQuery= ruleEQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEQuery=ruleEQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:3893:1: ruleEQuery returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) ;
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
            // InternalEMap.g:3896:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) )
            // InternalEMap.g:3897:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            {
            // InternalEMap.g:3897:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            // InternalEMap.g:3897:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            {
            // InternalEMap.g:3897:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // InternalEMap.g:3898:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // InternalEMap.g:3898:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // InternalEMap.g:3899:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // InternalEMap.g:3899:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==30) ) {
                alt95=1;
            }
            else if ( (LA95_0==RULE_STRING) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalEMap.g:3900:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
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
                    // InternalEMap.g:3912:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_4); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalEMap.g:3930:2: ( (lv_mapping_1_0= ruleEObjectSection ) )
            // InternalEMap.g:3931:1: (lv_mapping_1_0= ruleEObjectSection )
            {
            // InternalEMap.g:3931:1: (lv_mapping_1_0= ruleEObjectSection )
            // InternalEMap.g:3932:3: lv_mapping_1_0= ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_75);
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
                      		"at.bestsolution.persistence.emap.EMap.EObjectSection");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalEMap.g:3948:2: ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==69) ) {
                alt99=1;
            }
            else if ( (LA99_0==RULE_STRING) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalEMap.g:3948:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    {
                    // InternalEMap.g:3948:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    // InternalEMap.g:3948:5: otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0());
                          
                    }
                    // InternalEMap.g:3952:1: ( (lv_from_3_0= RULE_STRING ) )
                    // InternalEMap.g:3953:1: (lv_from_3_0= RULE_STRING )
                    {
                    // InternalEMap.g:3953:1: (lv_from_3_0= RULE_STRING )
                    // InternalEMap.g:3954:3: lv_from_3_0= RULE_STRING
                    {
                    lv_from_3_0=(Token)match(input,RULE_STRING,FOLLOW_76); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    // InternalEMap.g:3970:2: (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==70) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalEMap.g:3970:4: otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,70,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0());
                                  
                            }
                            // InternalEMap.g:3974:1: ( (lv_where_5_0= RULE_STRING ) )
                            // InternalEMap.g:3975:1: (lv_where_5_0= RULE_STRING )
                            {
                            // InternalEMap.g:3975:1: (lv_where_5_0= RULE_STRING )
                            // InternalEMap.g:3976:3: lv_where_5_0= RULE_STRING
                            {
                            lv_where_5_0=(Token)match(input,RULE_STRING,FOLLOW_77); if (state.failed) return current;
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
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalEMap.g:3992:4: (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==71) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalEMap.g:3992:6: otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,71,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0());
                                  
                            }
                            // InternalEMap.g:3996:1: ( (lv_groupBy_7_0= RULE_STRING ) )
                            // InternalEMap.g:3997:1: (lv_groupBy_7_0= RULE_STRING )
                            {
                            // InternalEMap.g:3997:1: (lv_groupBy_7_0= RULE_STRING )
                            // InternalEMap.g:3998:3: lv_groupBy_7_0= RULE_STRING
                            {
                            lv_groupBy_7_0=(Token)match(input,RULE_STRING,FOLLOW_78); if (state.failed) return current;
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
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalEMap.g:4014:4: (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==72) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalEMap.g:4014:6: otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,72,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0());
                                  
                            }
                            // InternalEMap.g:4018:1: ( (lv_orderby_9_0= RULE_STRING ) )
                            // InternalEMap.g:4019:1: (lv_orderby_9_0= RULE_STRING )
                            {
                            // InternalEMap.g:4019:1: (lv_orderby_9_0= RULE_STRING )
                            // InternalEMap.g:4020:3: lv_orderby_9_0= RULE_STRING
                            {
                            lv_orderby_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
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
                    // InternalEMap.g:4037:6: ( (lv_all_10_0= RULE_STRING ) )
                    {
                    // InternalEMap.g:4037:6: ( (lv_all_10_0= RULE_STRING ) )
                    // InternalEMap.g:4038:1: (lv_all_10_0= RULE_STRING )
                    {
                    // InternalEMap.g:4038:1: (lv_all_10_0= RULE_STRING )
                    // InternalEMap.g:4039:3: lv_all_10_0= RULE_STRING
                    {
                    lv_all_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
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
    // InternalEMap.g:4063:1: entryRuleECustomQuery returns [EObject current=null] : iv_ruleECustomQuery= ruleECustomQuery EOF ;
    public final EObject entryRuleECustomQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECustomQuery = null;


        try {
            // InternalEMap.g:4064:2: (iv_ruleECustomQuery= ruleECustomQuery EOF )
            // InternalEMap.g:4065:2: iv_ruleECustomQuery= ruleECustomQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECustomQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleECustomQuery=ruleECustomQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECustomQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:4072:1: ruleECustomQuery returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) ;
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
            // InternalEMap.g:4075:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) )
            // InternalEMap.g:4076:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            {
            // InternalEMap.g:4076:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            // InternalEMap.g:4076:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            {
            // InternalEMap.g:4076:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // InternalEMap.g:4077:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // InternalEMap.g:4077:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // InternalEMap.g:4078:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // InternalEMap.g:4078:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==30) ) {
                alt100=1;
            }
            else if ( (LA100_0==RULE_STRING) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalEMap.g:4079:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
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
                    // InternalEMap.g:4091:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_15); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalEMap.g:4109:2: ( (lv_columns_1_0= RULE_STRING ) )
            // InternalEMap.g:4110:1: (lv_columns_1_0= RULE_STRING )
            {
            // InternalEMap.g:4110:1: (lv_columns_1_0= RULE_STRING )
            // InternalEMap.g:4111:3: lv_columns_1_0= RULE_STRING
            {
            lv_columns_1_0=(Token)match(input,RULE_STRING,FOLLOW_75); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalEMap.g:4127:2: ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==69) ) {
                alt104=1;
            }
            else if ( (LA104_0==RULE_STRING) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalEMap.g:4127:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    {
                    // InternalEMap.g:4127:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    // InternalEMap.g:4127:5: otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getECustomQueryAccess().getFROMKeyword_2_0_0());
                          
                    }
                    // InternalEMap.g:4131:1: ( (lv_from_3_0= RULE_STRING ) )
                    // InternalEMap.g:4132:1: (lv_from_3_0= RULE_STRING )
                    {
                    // InternalEMap.g:4132:1: (lv_from_3_0= RULE_STRING )
                    // InternalEMap.g:4133:3: lv_from_3_0= RULE_STRING
                    {
                    lv_from_3_0=(Token)match(input,RULE_STRING,FOLLOW_76); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }

                    // InternalEMap.g:4149:2: (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==70) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalEMap.g:4149:4: otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,70,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getECustomQueryAccess().getWHEREKeyword_2_0_2_0());
                                  
                            }
                            // InternalEMap.g:4153:1: ( (lv_where_5_0= RULE_STRING ) )
                            // InternalEMap.g:4154:1: (lv_where_5_0= RULE_STRING )
                            {
                            // InternalEMap.g:4154:1: (lv_where_5_0= RULE_STRING )
                            // InternalEMap.g:4155:3: lv_where_5_0= RULE_STRING
                            {
                            lv_where_5_0=(Token)match(input,RULE_STRING,FOLLOW_77); if (state.failed) return current;
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
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalEMap.g:4171:4: (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==71) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalEMap.g:4171:6: otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,71,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getECustomQueryAccess().getGROUPBYKeyword_2_0_3_0());
                                  
                            }
                            // InternalEMap.g:4175:1: ( (lv_groupBy_7_0= RULE_STRING ) )
                            // InternalEMap.g:4176:1: (lv_groupBy_7_0= RULE_STRING )
                            {
                            // InternalEMap.g:4176:1: (lv_groupBy_7_0= RULE_STRING )
                            // InternalEMap.g:4177:3: lv_groupBy_7_0= RULE_STRING
                            {
                            lv_groupBy_7_0=(Token)match(input,RULE_STRING,FOLLOW_78); if (state.failed) return current;
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
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalEMap.g:4193:4: (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==72) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalEMap.g:4193:6: otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,72,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getECustomQueryAccess().getORDERBYKeyword_2_0_4_0());
                                  
                            }
                            // InternalEMap.g:4197:1: ( (lv_orderby_9_0= RULE_STRING ) )
                            // InternalEMap.g:4198:1: (lv_orderby_9_0= RULE_STRING )
                            {
                            // InternalEMap.g:4198:1: (lv_orderby_9_0= RULE_STRING )
                            // InternalEMap.g:4199:3: lv_orderby_9_0= RULE_STRING
                            {
                            lv_orderby_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                                      		"org.eclipse.xtext.common.Terminals.STRING");
                              	    
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
                    // InternalEMap.g:4216:6: ( (lv_all_10_0= RULE_STRING ) )
                    {
                    // InternalEMap.g:4216:6: ( (lv_all_10_0= RULE_STRING ) )
                    // InternalEMap.g:4217:1: (lv_all_10_0= RULE_STRING )
                    {
                    // InternalEMap.g:4217:1: (lv_all_10_0= RULE_STRING )
                    // InternalEMap.g:4218:3: lv_all_10_0= RULE_STRING
                    {
                    lv_all_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
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
    // InternalEMap.g:4242:1: entryRuleEObjectSection returns [EObject current=null] : iv_ruleEObjectSection= ruleEObjectSection EOF ;
    public final EObject entryRuleEObjectSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectSection = null;


        try {
            // InternalEMap.g:4243:2: (iv_ruleEObjectSection= ruleEObjectSection EOF )
            // InternalEMap.g:4244:2: iv_ruleEObjectSection= ruleEObjectSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEObjectSectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEObjectSection=ruleEObjectSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEObjectSection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:4251:1: ruleEObjectSection returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? ) ;
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
            // InternalEMap.g:4254:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? ) )
            // InternalEMap.g:4255:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? )
            {
            // InternalEMap.g:4255:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? )
            // InternalEMap.g:4255:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )?
            {
            // InternalEMap.g:4255:2: ( (otherlv_0= RULE_ID ) )
            // InternalEMap.g:4256:1: (otherlv_0= RULE_ID )
            {
            // InternalEMap.g:4256:1: (otherlv_0= RULE_ID )
            // InternalEMap.g:4257:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEObjectSectionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalEMap.g:4268:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==25) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalEMap.g:4268:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEObjectSectionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalEMap.g:4272:1: ( (otherlv_2= RULE_ID ) )
                    // InternalEMap.g:4273:1: (otherlv_2= RULE_ID )
                    {
                    // InternalEMap.g:4273:1: (otherlv_2= RULE_ID )
                    // InternalEMap.g:4274:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }

                    // InternalEMap.g:4285:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+
                    int cnt105=0;
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==15) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalEMap.g:4285:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalEMap.g:4289:1: ( (otherlv_4= RULE_ID ) )
                    	    // InternalEMap.g:4290:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalEMap.g:4290:1: (otherlv_4= RULE_ID )
                    	    // InternalEMap.g:4291:3: otherlv_4= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_4, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt105 >= 1 ) break loop105;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(105, input);
                                throw eee;
                        }
                        cnt105++;
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEObjectSectionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // InternalEMap.g:4306:3: ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_ID) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalEMap.g:4306:4: ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )?
                    {
                    // InternalEMap.g:4306:4: ( (lv_prefix_6_0= RULE_ID ) )
                    // InternalEMap.g:4307:1: (lv_prefix_6_0= RULE_ID )
                    {
                    // InternalEMap.g:4307:1: (lv_prefix_6_0= RULE_ID )
                    // InternalEMap.g:4308:3: lv_prefix_6_0= RULE_ID
                    {
                    lv_prefix_6_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalEMap.g:4324:2: (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==13) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalEMap.g:4324:4: otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}'
                            {
                            otherlv_7=(Token)match(input,13,FOLLOW_81); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_2_1_0());
                                  
                            }
                            // InternalEMap.g:4328:1: ( (lv_attributes_8_0= ruleEMappingAttribute ) )
                            // InternalEMap.g:4329:1: (lv_attributes_8_0= ruleEMappingAttribute )
                            {
                            // InternalEMap.g:4329:1: (lv_attributes_8_0= ruleEMappingAttribute )
                            // InternalEMap.g:4330:3: lv_attributes_8_0= ruleEMappingAttribute
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_9);
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
                                      		"at.bestsolution.persistence.emap.EMap.EMappingAttribute");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalEMap.g:4346:2: (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )*
                            loop107:
                            do {
                                int alt107=2;
                                int LA107_0 = input.LA(1);

                                if ( (LA107_0==15) ) {
                                    alt107=1;
                                }


                                switch (alt107) {
                            	case 1 :
                            	    // InternalEMap.g:4346:4: otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            	    {
                            	    otherlv_9=(Token)match(input,15,FOLLOW_81); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getEObjectSectionAccess().getCommaKeyword_2_1_2_0());
                            	          
                            	    }
                            	    // InternalEMap.g:4350:1: ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            	    // InternalEMap.g:4351:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            	    {
                            	    // InternalEMap.g:4351:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            	    // InternalEMap.g:4352:3: lv_attributes_10_0= ruleEMappingAttribute
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_9);
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
                            	              		"at.bestsolution.persistence.emap.EMap.EMappingAttribute");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop107;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:4380:1: entryRuleEMappingAttribute returns [EObject current=null] : iv_ruleEMappingAttribute= ruleEMappingAttribute EOF ;
    public final EObject entryRuleEMappingAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingAttribute = null;


        try {
            // InternalEMap.g:4381:2: (iv_ruleEMappingAttribute= ruleEMappingAttribute EOF )
            // InternalEMap.g:4382:2: iv_ruleEMappingAttribute= ruleEMappingAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEMappingAttribute=ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:4389:1: ruleEMappingAttribute returns [EObject current=null] : ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) ;
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
            // InternalEMap.g:4392:28: ( ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) )
            // InternalEMap.g:4393:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            {
            // InternalEMap.g:4393:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            // InternalEMap.g:4393:2: ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            {
            // InternalEMap.g:4393:2: ( (lv_pk_0_0= 'primarykey' ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==50) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalEMap.g:4394:1: (lv_pk_0_0= 'primarykey' )
                    {
                    // InternalEMap.g:4394:1: (lv_pk_0_0= 'primarykey' )
                    // InternalEMap.g:4395:3: lv_pk_0_0= 'primarykey'
                    {
                    lv_pk_0_0=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
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

            // InternalEMap.g:4408:3: ( (lv_property_1_0= ruleQualifiedName ) )
            // InternalEMap.g:4409:1: (lv_property_1_0= ruleQualifiedName )
            {
            // InternalEMap.g:4409:1: (lv_property_1_0= ruleQualifiedName )
            // InternalEMap.g:4410:3: lv_property_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_55);
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
                      		"at.bestsolution.persistence.emap.EMap.QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // InternalEMap.g:4430:1: ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt111=1;
                }
                break;
            case 54:
                {
                alt111=2;
                }
                break;
            case 64:
                {
                alt111=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalEMap.g:4430:2: ( (lv_columnName_3_0= RULE_ID ) )
                    {
                    // InternalEMap.g:4430:2: ( (lv_columnName_3_0= RULE_ID ) )
                    // InternalEMap.g:4431:1: (lv_columnName_3_0= RULE_ID )
                    {
                    // InternalEMap.g:4431:1: (lv_columnName_3_0= RULE_ID )
                    // InternalEMap.g:4432:3: lv_columnName_3_0= RULE_ID
                    {
                    lv_columnName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEMap.g:4449:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    {
                    // InternalEMap.g:4449:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    // InternalEMap.g:4449:7: ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')'
                    {
                    // InternalEMap.g:4449:7: ( (lv_resolved_4_0= 'resolve' ) )
                    // InternalEMap.g:4450:1: (lv_resolved_4_0= 'resolve' )
                    {
                    // InternalEMap.g:4450:1: (lv_resolved_4_0= 'resolve' )
                    // InternalEMap.g:4451:3: lv_resolved_4_0= 'resolve'
                    {
                    lv_resolved_4_0=(Token)match(input,54,FOLLOW_4); if (state.failed) return current;
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

                    // InternalEMap.g:4464:2: ( ( ruleQualifiedName ) )
                    // InternalEMap.g:4465:1: ( ruleQualifiedName )
                    {
                    // InternalEMap.g:4465:1: ( ruleQualifiedName )
                    // InternalEMap.g:4466:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_31);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // InternalEMap.g:4483:1: ( (lv_parameters_7_0= RULE_ID ) )
                    // InternalEMap.g:4484:1: (lv_parameters_7_0= RULE_ID )
                    {
                    // InternalEMap.g:4484:1: (lv_parameters_7_0= RULE_ID )
                    // InternalEMap.g:4485:3: lv_parameters_7_0= RULE_ID
                    {
                    lv_parameters_7_0=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEMap.g:4506:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    {
                    // InternalEMap.g:4506:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    // InternalEMap.g:4506:7: ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) )
                    {
                    // InternalEMap.g:4506:7: ( (lv_mapped_9_0= 'map' ) )
                    // InternalEMap.g:4507:1: (lv_mapped_9_0= 'map' )
                    {
                    // InternalEMap.g:4507:1: (lv_mapped_9_0= 'map' )
                    // InternalEMap.g:4508:3: lv_mapped_9_0= 'map'
                    {
                    lv_mapped_9_0=(Token)match(input,64,FOLLOW_4); if (state.failed) return current;
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

                    // InternalEMap.g:4521:2: ( (lv_map_10_0= ruleEObjectSection ) )
                    // InternalEMap.g:4522:1: (lv_map_10_0= ruleEObjectSection )
                    {
                    // InternalEMap.g:4522:1: (lv_map_10_0= ruleEObjectSection )
                    // InternalEMap.g:4523:3: lv_map_10_0= ruleEObjectSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"at.bestsolution.persistence.emap.EMap.EObjectSection");
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
    // InternalEMap.g:4547:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // InternalEMap.g:4548:2: (iv_ruleEType= ruleEType EOF )
            // InternalEMap.g:4549:2: iv_ruleEType= ruleEType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEType=ruleEType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:4556:1: ruleEType returns [EObject current=null] : (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:4559:28: ( (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalEMap.g:4560:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalEMap.g:4560:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalEMap.g:4560:3: otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getEtypeKeyword_0());
                  
            }
            // InternalEMap.g:4564:1: ( (lv_url_1_0= RULE_STRING ) )
            // InternalEMap.g:4565:1: (lv_url_1_0= RULE_STRING )
            {
            // InternalEMap.g:4565:1: (lv_url_1_0= RULE_STRING )
            // InternalEMap.g:4566:3: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_83); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,74,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getETypeAccess().getNumberSignKeyword_2());
                  
            }
            // InternalEMap.g:4586:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalEMap.g:4587:1: (lv_name_3_0= RULE_ID )
            {
            // InternalEMap.g:4587:1: (lv_name_3_0= RULE_ID )
            // InternalEMap.g:4588:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
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
    // InternalEMap.g:4612:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEMap.g:4613:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEMap.g:4614:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:4621:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalEMap.g:4624:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalEMap.g:4625:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalEMap.g:4625:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalEMap.g:4625:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalEMap.g:4632:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==43) ) {
                    int LA112_2 = input.LA(2);

                    if ( (LA112_2==RULE_ID) && (synpred2_InternalEMap())) {
                        alt112=1;
                    }


                }


                switch (alt112) {
            	case 1 :
            	    // InternalEMap.g:4632:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalEMap.g:4632:2: ( ( '.' )=>kw= '.' )
            	    // InternalEMap.g:4632:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop112;
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
    // InternalEMap.g:4655:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalEMap.g:4656:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalEMap.g:4657:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEMap.g:4664:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalEMap.g:4667:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalEMap.g:4668:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalEMap.g:4668:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalEMap.g:4669:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_84);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,43,FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:4699:1: ruleColSort returns [Enumerator current=null] : ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) ) ;
    public final Enumerator ruleColSort() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalEMap.g:4701:28: ( ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) ) )
            // InternalEMap.g:4702:1: ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) )
            {
            // InternalEMap.g:4702:1: ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) )
            int alt113=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt113=1;
                }
                break;
            case 77:
                {
                alt113=2;
                }
                break;
            case 78:
                {
                alt113=3;
                }
                break;
            case 79:
                {
                alt113=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalEMap.g:4702:2: (enumLiteral_0= 'EMAP' )
                    {
                    // InternalEMap.g:4702:2: (enumLiteral_0= 'EMAP' )
                    // InternalEMap.g:4702:4: enumLiteral_0= 'EMAP'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColSortAccess().getEMAPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColSortAccess().getEMAPEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEMap.g:4708:6: (enumLiteral_1= 'ECORE' )
                    {
                    // InternalEMap.g:4708:6: (enumLiteral_1= 'ECORE' )
                    // InternalEMap.g:4708:8: enumLiteral_1= 'ECORE'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColSortAccess().getECOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColSortAccess().getECOREEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEMap.g:4714:6: (enumLiteral_2= 'ECORE_REVERSED' )
                    {
                    // InternalEMap.g:4714:6: (enumLiteral_2= 'ECORE_REVERSED' )
                    // InternalEMap.g:4714:8: enumLiteral_2= 'ECORE_REVERSED'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColSortAccess().getECORE_REVERSEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColSortAccess().getECORE_REVERSEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEMap.g:4720:6: (enumLiteral_3= 'ALPHABETIC' )
                    {
                    // InternalEMap.g:4720:6: (enumLiteral_3= 'ALPHABETIC' )
                    // InternalEMap.g:4720:8: enumLiteral_3= 'ALPHABETIC'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
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
    // InternalEMap.g:4730:1: ruleReturnType returns [Enumerator current=null] : ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) ;
    public final Enumerator ruleReturnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalEMap.g:4732:28: ( ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) )
            // InternalEMap.g:4733:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            {
            // InternalEMap.g:4733:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==80) ) {
                alt114=1;
            }
            else if ( (LA114_0==81) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // InternalEMap.g:4733:2: (enumLiteral_0= 'list' )
                    {
                    // InternalEMap.g:4733:2: (enumLiteral_0= 'list' )
                    // InternalEMap.g:4733:4: enumLiteral_0= 'list'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEMap.g:4739:6: (enumLiteral_1= 'single' )
                    {
                    // InternalEMap.g:4739:6: (enumLiteral_1= 'single' )
                    // InternalEMap.g:4739:8: enumLiteral_1= 'single'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
        // InternalEMap.g:2135:3: ( '.' )
        // InternalEMap.g:2136:2: '.'
        {
        match(input,43,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEMap

    // $ANTLR start synpred2_InternalEMap
    public final void synpred2_InternalEMap_fragment() throws RecognitionException {   
        // InternalEMap.g:4632:3: ( '.' )
        // InternalEMap.g:4633:2: '.'
        {
        match(input,43,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalEMap

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


    protected DFA50 dfa50 = new DFA50(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\uffff\1\3\2\uffff\1\3\1\uffff";
    static final String dfa_3s = "\1\4\1\13\1\4\1\uffff\1\13\1\uffff";
    static final String dfa_4s = "\1\4\1\55\1\113\1\uffff\1\55\1\uffff";
    static final String dfa_5s = "\3\uffff\1\2\1\uffff\1\1";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\3\34\uffff\1\3\2\uffff\1\2\2\3",
            "\1\4\106\uffff\1\5",
            "",
            "\1\3\34\uffff\1\3\2\uffff\1\2\2\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2026:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020038000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000139810000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000139010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000131018000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000121018000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000120018000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100018000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000010010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000A800010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000A000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000310000000800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000003000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001800000010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000C000000000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000010000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xF800000000000010L,0x000000000003020BL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000400000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0020000080000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000080080000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xF804000004000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xF804000000000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xF800000000000010L,0x0000000000000209L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0xF800000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0xF800000000000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0040000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});

}