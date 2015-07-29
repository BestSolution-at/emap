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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rest'", "'{'", "'list'", "'default'", "'get'", "'update'", "'insert'", "'delete'", "'}'", "'as'", "'path-param'", "'named'", "'query-param'", "'bundle'", "'extends'", "','", "'databases'", "'colsort'", "'pk-constraint'", "'index'", "'('", "')'", "'fk-constraint'", "'unique-constraint'", "'sql-type-def'", "'size'", "'import'", "'package'", "';'", "'.'", "'abstract'", "'entity'", "'derived'", "'attributes'", "'queries'", "'descriminatedby'", "'primarykey'", "'forced-fk'", "'=>'", "'generatedby'", "'resolve'", "'on'", "'autokey'", "'query'", "'seqnext'", "'int'", "'long'", "'double'", "'float'", "'boolean'", "'map'", "'['", "']'", "'typedef'", "'cached'", "'FROM'", "'WHERE'", "'GROUP BY'", "'ORDER BY'", "'etype'", "'#'", "'*'", "'EMAP'", "'ECORE'", "'ECORE_REVERSED'", "'ALPHABETIC'", "'single'"
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:77:1: ruleEMapping returns [EObject current=null] : ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef | lv_root_0_3= ruleEServiceMapping ) ) ) ;
    public final EObject ruleEMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_root_0_1 = null;

        EObject lv_root_0_2 = null;

        EObject lv_root_0_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:80:28: ( ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef | lv_root_0_3= ruleEServiceMapping ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:81:1: ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef | lv_root_0_3= ruleEServiceMapping ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:81:1: ( ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef | lv_root_0_3= ruleEServiceMapping ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:82:1: ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef | lv_root_0_3= ruleEServiceMapping ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:82:1: ( (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef | lv_root_0_3= ruleEServiceMapping ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:83:1: (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef | lv_root_0_3= ruleEServiceMapping )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:83:1: (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef | lv_root_0_3= ruleEServiceMapping )
            int alt1=3;
            alt1 = dfa1.predict(input);
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
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:114:8: lv_root_0_3= ruleEServiceMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAccess().getRootEServiceMappingParserRuleCall_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEServiceMapping_in_ruleEMapping170);
                    lv_root_0_3=ruleEServiceMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"root",
                              		lv_root_0_3, 
                              		"EServiceMapping");
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


    // $ANTLR start "entryRuleEServiceMapping"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:140:1: entryRuleEServiceMapping returns [EObject current=null] : iv_ruleEServiceMapping= ruleEServiceMapping EOF ;
    public final EObject entryRuleEServiceMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEServiceMapping = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:141:2: (iv_ruleEServiceMapping= ruleEServiceMapping EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:142:2: iv_ruleEServiceMapping= ruleEServiceMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEServiceMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEServiceMapping_in_entryRuleEServiceMapping208);
            iv_ruleEServiceMapping=ruleEServiceMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEServiceMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEServiceMapping218); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEServiceMapping"


    // $ANTLR start "ruleEServiceMapping"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:149:1: ruleEServiceMapping returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclaration ) ) otherlv_1= 'rest' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( ( (lv_list_4_0= 'list' ) ) (otherlv_5= 'default' | ( (otherlv_6= RULE_ID ) ) ) )? ( ( (lv_get_7_0= 'get' ) ) (otherlv_8= 'default' | ( (otherlv_9= RULE_ID ) ) ) )? ( ( (lv_update_10_0= 'update' ) ) otherlv_11= 'default' )? ( ( (lv_insert_12_0= 'insert' ) ) otherlv_13= 'default' )? ( ( (lv_delete_14_0= 'delete' ) ) otherlv_15= 'default' )? ( (lv_serviceMethods_16_0= ruleENamedServiceQuery ) )* otherlv_17= '}' ) ;
    public final EObject ruleEServiceMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_list_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_get_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_update_10_0=null;
        Token otherlv_11=null;
        Token lv_insert_12_0=null;
        Token otherlv_13=null;
        Token lv_delete_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_package_0_0 = null;

        EObject lv_serviceMethods_16_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:152:28: ( ( ( (lv_package_0_0= rulePackageDeclaration ) ) otherlv_1= 'rest' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( ( (lv_list_4_0= 'list' ) ) (otherlv_5= 'default' | ( (otherlv_6= RULE_ID ) ) ) )? ( ( (lv_get_7_0= 'get' ) ) (otherlv_8= 'default' | ( (otherlv_9= RULE_ID ) ) ) )? ( ( (lv_update_10_0= 'update' ) ) otherlv_11= 'default' )? ( ( (lv_insert_12_0= 'insert' ) ) otherlv_13= 'default' )? ( ( (lv_delete_14_0= 'delete' ) ) otherlv_15= 'default' )? ( (lv_serviceMethods_16_0= ruleENamedServiceQuery ) )* otherlv_17= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:153:1: ( ( (lv_package_0_0= rulePackageDeclaration ) ) otherlv_1= 'rest' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( ( (lv_list_4_0= 'list' ) ) (otherlv_5= 'default' | ( (otherlv_6= RULE_ID ) ) ) )? ( ( (lv_get_7_0= 'get' ) ) (otherlv_8= 'default' | ( (otherlv_9= RULE_ID ) ) ) )? ( ( (lv_update_10_0= 'update' ) ) otherlv_11= 'default' )? ( ( (lv_insert_12_0= 'insert' ) ) otherlv_13= 'default' )? ( ( (lv_delete_14_0= 'delete' ) ) otherlv_15= 'default' )? ( (lv_serviceMethods_16_0= ruleENamedServiceQuery ) )* otherlv_17= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:153:1: ( ( (lv_package_0_0= rulePackageDeclaration ) ) otherlv_1= 'rest' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( ( (lv_list_4_0= 'list' ) ) (otherlv_5= 'default' | ( (otherlv_6= RULE_ID ) ) ) )? ( ( (lv_get_7_0= 'get' ) ) (otherlv_8= 'default' | ( (otherlv_9= RULE_ID ) ) ) )? ( ( (lv_update_10_0= 'update' ) ) otherlv_11= 'default' )? ( ( (lv_insert_12_0= 'insert' ) ) otherlv_13= 'default' )? ( ( (lv_delete_14_0= 'delete' ) ) otherlv_15= 'default' )? ( (lv_serviceMethods_16_0= ruleENamedServiceQuery ) )* otherlv_17= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:153:2: ( (lv_package_0_0= rulePackageDeclaration ) ) otherlv_1= 'rest' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( ( (lv_list_4_0= 'list' ) ) (otherlv_5= 'default' | ( (otherlv_6= RULE_ID ) ) ) )? ( ( (lv_get_7_0= 'get' ) ) (otherlv_8= 'default' | ( (otherlv_9= RULE_ID ) ) ) )? ( ( (lv_update_10_0= 'update' ) ) otherlv_11= 'default' )? ( ( (lv_insert_12_0= 'insert' ) ) otherlv_13= 'default' )? ( ( (lv_delete_14_0= 'delete' ) ) otherlv_15= 'default' )? ( (lv_serviceMethods_16_0= ruleENamedServiceQuery ) )* otherlv_17= '}'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:153:2: ( (lv_package_0_0= rulePackageDeclaration ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:154:1: (lv_package_0_0= rulePackageDeclaration )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:154:1: (lv_package_0_0= rulePackageDeclaration )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:155:3: lv_package_0_0= rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEServiceMappingAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_ruleEServiceMapping264);
            lv_package_0_0=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEServiceMappingRule());
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

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleEServiceMapping276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEServiceMappingAccess().getRestKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:175:1: ( (otherlv_2= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:176:1: (otherlv_2= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:176:1: (otherlv_2= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:177:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEServiceMappingRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEServiceMapping296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getEServiceMappingAccess().getEntityEMappingEntityCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleEServiceMapping308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEServiceMappingAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:192:1: ( ( (lv_list_4_0= 'list' ) ) (otherlv_5= 'default' | ( (otherlv_6= RULE_ID ) ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:192:2: ( (lv_list_4_0= 'list' ) ) (otherlv_5= 'default' | ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:192:2: ( (lv_list_4_0= 'list' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:193:1: (lv_list_4_0= 'list' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:193:1: (lv_list_4_0= 'list' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:194:3: lv_list_4_0= 'list'
                    {
                    lv_list_4_0=(Token)match(input,13,FOLLOW_13_in_ruleEServiceMapping327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_list_4_0, grammarAccess.getEServiceMappingAccess().getListListKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEServiceMappingRule());
                      	        }
                             		setWithLastConsumed(current, "list", true, "list");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:207:2: (otherlv_5= 'default' | ( (otherlv_6= RULE_ID ) ) )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==RULE_ID) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:207:4: otherlv_5= 'default'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEServiceMapping353); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getEServiceMappingAccess().getDefaultKeyword_4_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:212:6: ( (otherlv_6= RULE_ID ) )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:212:6: ( (otherlv_6= RULE_ID ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:213:1: (otherlv_6= RULE_ID )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:213:1: (otherlv_6= RULE_ID )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:214:3: otherlv_6= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getEServiceMappingRule());
                              	        }
                                      
                            }
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEServiceMapping379); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_6, grammarAccess.getEServiceMappingAccess().getListQueryENamedQueryCrossReference_4_1_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:225:5: ( ( (lv_get_7_0= 'get' ) ) (otherlv_8= 'default' | ( (otherlv_9= RULE_ID ) ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:225:6: ( (lv_get_7_0= 'get' ) ) (otherlv_8= 'default' | ( (otherlv_9= RULE_ID ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:225:6: ( (lv_get_7_0= 'get' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:226:1: (lv_get_7_0= 'get' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:226:1: (lv_get_7_0= 'get' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:227:3: lv_get_7_0= 'get'
                    {
                    lv_get_7_0=(Token)match(input,15,FOLLOW_15_in_ruleEServiceMapping401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_get_7_0, grammarAccess.getEServiceMappingAccess().getGetGetKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEServiceMappingRule());
                      	        }
                             		setWithLastConsumed(current, "get", true, "get");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:240:2: (otherlv_8= 'default' | ( (otherlv_9= RULE_ID ) ) )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_ID) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:240:4: otherlv_8= 'default'
                            {
                            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleEServiceMapping427); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getEServiceMappingAccess().getDefaultKeyword_5_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:245:6: ( (otherlv_9= RULE_ID ) )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:245:6: ( (otherlv_9= RULE_ID ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:246:1: (otherlv_9= RULE_ID )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:246:1: (otherlv_9= RULE_ID )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:247:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getEServiceMappingRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEServiceMapping453); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getEServiceMappingAccess().getGetQueryENamedQueryCrossReference_5_1_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:258:5: ( ( (lv_update_10_0= 'update' ) ) otherlv_11= 'default' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:258:6: ( (lv_update_10_0= 'update' ) ) otherlv_11= 'default'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:258:6: ( (lv_update_10_0= 'update' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:259:1: (lv_update_10_0= 'update' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:259:1: (lv_update_10_0= 'update' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:260:3: lv_update_10_0= 'update'
                    {
                    lv_update_10_0=(Token)match(input,16,FOLLOW_16_in_ruleEServiceMapping475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_update_10_0, grammarAccess.getEServiceMappingAccess().getUpdateUpdateKeyword_6_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEServiceMappingRule());
                      	        }
                             		setWithLastConsumed(current, "update", true, "update");
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleEServiceMapping500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getEServiceMappingAccess().getDefaultKeyword_6_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:277:3: ( ( (lv_insert_12_0= 'insert' ) ) otherlv_13= 'default' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:277:4: ( (lv_insert_12_0= 'insert' ) ) otherlv_13= 'default'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:277:4: ( (lv_insert_12_0= 'insert' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:278:1: (lv_insert_12_0= 'insert' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:278:1: (lv_insert_12_0= 'insert' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:279:3: lv_insert_12_0= 'insert'
                    {
                    lv_insert_12_0=(Token)match(input,17,FOLLOW_17_in_ruleEServiceMapping521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_insert_12_0, grammarAccess.getEServiceMappingAccess().getInsertInsertKeyword_7_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEServiceMappingRule());
                      	        }
                             		setWithLastConsumed(current, "insert", true, "insert");
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleEServiceMapping546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEServiceMappingAccess().getDefaultKeyword_7_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:296:3: ( ( (lv_delete_14_0= 'delete' ) ) otherlv_15= 'default' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:296:4: ( (lv_delete_14_0= 'delete' ) ) otherlv_15= 'default'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:296:4: ( (lv_delete_14_0= 'delete' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:297:1: (lv_delete_14_0= 'delete' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:297:1: (lv_delete_14_0= 'delete' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:298:3: lv_delete_14_0= 'delete'
                    {
                    lv_delete_14_0=(Token)match(input,18,FOLLOW_18_in_ruleEServiceMapping567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_delete_14_0, grammarAccess.getEServiceMappingAccess().getDeleteDeleteKeyword_8_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEServiceMappingRule());
                      	        }
                             		setWithLastConsumed(current, "delete", true, "delete");
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleEServiceMapping592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getEServiceMappingAccess().getDefaultKeyword_8_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:315:3: ( (lv_serviceMethods_16_0= ruleENamedServiceQuery ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:316:1: (lv_serviceMethods_16_0= ruleENamedServiceQuery )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:316:1: (lv_serviceMethods_16_0= ruleENamedServiceQuery )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:317:3: lv_serviceMethods_16_0= ruleENamedServiceQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEServiceMappingAccess().getServiceMethodsENamedServiceQueryParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleENamedServiceQuery_in_ruleEServiceMapping615);
            	    lv_serviceMethods_16_0=ruleENamedServiceQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEServiceMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"serviceMethods",
            	              		lv_serviceMethods_16_0, 
            	              		"ENamedServiceQuery");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleEServiceMapping628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getEServiceMappingAccess().getRightCurlyBracketKeyword_10());
                  
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
    // $ANTLR end "ruleEServiceMapping"


    // $ANTLR start "entryRuleENamedServiceQuery"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:345:1: entryRuleENamedServiceQuery returns [EObject current=null] : iv_ruleENamedServiceQuery= ruleENamedServiceQuery EOF ;
    public final EObject entryRuleENamedServiceQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedServiceQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:346:2: (iv_ruleENamedServiceQuery= ruleENamedServiceQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:347:2: iv_ruleENamedServiceQuery= ruleENamedServiceQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedServiceQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedServiceQuery_in_entryRuleENamedServiceQuery664);
            iv_ruleENamedServiceQuery=ruleENamedServiceQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedServiceQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedServiceQuery674); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:354:1: ruleENamedServiceQuery returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_parameters_4_0= ruleEServiceParam ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleENamedServiceQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:357:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_parameters_4_0= ruleEServiceParam ) )* otherlv_5= '}' )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:358:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_parameters_4_0= ruleEServiceParam ) )* otherlv_5= '}' )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:358:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_parameters_4_0= ruleEServiceParam ) )* otherlv_5= '}' )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:358:2: ( ( ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_parameters_4_0= ruleEServiceParam ) )* otherlv_5= '}' )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:358:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:359:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:359:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:360:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getENamedServiceQueryRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedServiceQueryAccess().getQueryENamedQueryCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleENamedServiceQuery722);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleENamedServiceQuery734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getENamedServiceQueryAccess().getAsKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:377:1: ( (lv_path_2_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:378:1: (lv_path_2_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:378:1: (lv_path_2_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:379:3: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleENamedServiceQuery751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_path_2_0, grammarAccess.getENamedServiceQueryAccess().getPathSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getENamedServiceQueryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"path",
                      		lv_path_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:395:2: (otherlv_3= '{' ( (lv_parameters_4_0= ruleEServiceParam ) )* otherlv_5= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:395:4: otherlv_3= '{' ( (lv_parameters_4_0= ruleEServiceParam ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleENamedServiceQuery769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getENamedServiceQueryAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:399:1: ( (lv_parameters_4_0= ruleEServiceParam ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21||LA10_0==23) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:400:1: (lv_parameters_4_0= ruleEServiceParam )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:400:1: (lv_parameters_4_0= ruleEServiceParam )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:401:3: lv_parameters_4_0= ruleEServiceParam
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getENamedServiceQueryAccess().getParametersEServiceParamParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEServiceParam_in_ruleENamedServiceQuery790);
                    	    lv_parameters_4_0=ruleEServiceParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getENamedServiceQueryRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_4_0, 
                    	              		"EServiceParam");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleENamedServiceQuery803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getENamedServiceQueryAccess().getRightCurlyBracketKeyword_3_2());
                          
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


    // $ANTLR start "entryRuleEServiceParam"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:429:1: entryRuleEServiceParam returns [EObject current=null] : iv_ruleEServiceParam= ruleEServiceParam EOF ;
    public final EObject entryRuleEServiceParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEServiceParam = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:430:2: (iv_ruleEServiceParam= ruleEServiceParam EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:431:2: iv_ruleEServiceParam= ruleEServiceParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEServiceParamRule()); 
            }
            pushFollow(FOLLOW_ruleEServiceParam_in_entryRuleEServiceParam841);
            iv_ruleEServiceParam=ruleEServiceParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEServiceParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEServiceParam851); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:438:1: ruleEServiceParam returns [EObject current=null] : (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam ) ;
    public final EObject ruleEServiceParam() throws RecognitionException {
        EObject current = null;

        EObject this_EPathParam_0 = null;

        EObject this_EQueryParam_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:441:28: ( (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:442:1: (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:442:1: (this_EPathParam_0= ruleEPathParam | this_EQueryParam_1= ruleEQueryParam )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:443:5: this_EPathParam_0= ruleEPathParam
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEServiceParamAccess().getEPathParamParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEPathParam_in_ruleEServiceParam898);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:453:5: this_EQueryParam_1= ruleEQueryParam
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEServiceParamAccess().getEQueryParamParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEQueryParam_in_ruleEServiceParam925);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:469:1: entryRuleEPathParam returns [EObject current=null] : iv_ruleEPathParam= ruleEPathParam EOF ;
    public final EObject entryRuleEPathParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPathParam = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:470:2: (iv_ruleEPathParam= ruleEPathParam EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:471:2: iv_ruleEPathParam= ruleEPathParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPathParamRule()); 
            }
            pushFollow(FOLLOW_ruleEPathParam_in_entryRuleEPathParam960);
            iv_ruleEPathParam=ruleEPathParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPathParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPathParam970); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:478:1: ruleEPathParam returns [EObject current=null] : (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEPathParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:481:28: ( (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:482:1: (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:482:1: (otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:482:3: otherlv_0= 'path-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleEPathParam1007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEPathParamAccess().getPathParamKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:486:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:487:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:487:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:488:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEPathParamRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEPathParamAccess().getParamEParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEPathParam1030);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:501:2: (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:501:4: otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleEPathParam1043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEPathParamAccess().getNamedKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:505:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:506:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:506:1: (lv_name_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:507:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEPathParam1060); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:531:1: entryRuleEQueryParam returns [EObject current=null] : iv_ruleEQueryParam= ruleEQueryParam EOF ;
    public final EObject entryRuleEQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQueryParam = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:532:2: (iv_ruleEQueryParam= ruleEQueryParam EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:533:2: iv_ruleEQueryParam= ruleEQueryParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQueryParamRule()); 
            }
            pushFollow(FOLLOW_ruleEQueryParam_in_entryRuleEQueryParam1103);
            iv_ruleEQueryParam=ruleEQueryParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQueryParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQueryParam1113); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:540:1: ruleEQueryParam returns [EObject current=null] : (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEQueryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:543:28: ( (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:544:1: (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:544:1: (otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:544:3: otherlv_0= 'query-param' ( ( ruleQualifiedName ) ) (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleEQueryParam1150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEQueryParamAccess().getQueryParamKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:548:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:549:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:549:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:550:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEQueryParamRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEQueryParamAccess().getParamEParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEQueryParam1173);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:563:2: (otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:563:4: otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleEQueryParam1186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEQueryParamAccess().getNamedKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:567:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:568:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:568:1: (lv_name_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:569:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEQueryParam1203); if (state.failed) return current;
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


    // $ANTLR start "entryRuleEMappingBundle"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:593:1: entryRuleEMappingBundle returns [EObject current=null] : iv_ruleEMappingBundle= ruleEMappingBundle EOF ;
    public final EObject entryRuleEMappingBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingBundle = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:594:2: (iv_ruleEMappingBundle= ruleEMappingBundle EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:595:2: iv_ruleEMappingBundle= ruleEMappingBundle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingBundleRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingBundle_in_entryRuleEMappingBundle1246);
            iv_ruleEMappingBundle=ruleEMappingBundle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingBundle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingBundle1256); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:602:1: ruleEMappingBundle returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_entities_6_0= ruleEBundleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_9_0= ruleESQLTypeDef ) )* otherlv_10= '}' (otherlv_11= 'databases' ( (lv_databases_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_databases_14_0= RULE_STRING ) ) )* )? (otherlv_15= 'colsort' ( (lv_colSort_16_0= ruleColSort ) ) )? ) ;
    public final EObject ruleEMappingBundle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_databases_12_0=null;
        Token otherlv_13=null;
        Token lv_databases_14_0=null;
        Token otherlv_15=null;
        EObject lv_imports_0_0 = null;

        EObject lv_entities_6_0 = null;

        EObject lv_entities_8_0 = null;

        EObject lv_typeDefs_9_0 = null;

        Enumerator lv_colSort_16_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:605:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_entities_6_0= ruleEBundleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_9_0= ruleESQLTypeDef ) )* otherlv_10= '}' (otherlv_11= 'databases' ( (lv_databases_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_databases_14_0= RULE_STRING ) ) )* )? (otherlv_15= 'colsort' ( (lv_colSort_16_0= ruleColSort ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:606:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_entities_6_0= ruleEBundleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_9_0= ruleESQLTypeDef ) )* otherlv_10= '}' (otherlv_11= 'databases' ( (lv_databases_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_databases_14_0= RULE_STRING ) ) )* )? (otherlv_15= 'colsort' ( (lv_colSort_16_0= ruleColSort ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:606:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_entities_6_0= ruleEBundleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_9_0= ruleESQLTypeDef ) )* otherlv_10= '}' (otherlv_11= 'databases' ( (lv_databases_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_databases_14_0= RULE_STRING ) ) )* )? (otherlv_15= 'colsort' ( (lv_colSort_16_0= ruleColSort ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:606:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'bundle' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_entities_6_0= ruleEBundleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEBundleEntity ) ) )* ( (lv_typeDefs_9_0= ruleESQLTypeDef ) )* otherlv_10= '}' (otherlv_11= 'databases' ( (lv_databases_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_databases_14_0= RULE_STRING ) ) )* )? (otherlv_15= 'colsort' ( (lv_colSort_16_0= ruleColSort ) ) )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:606:2: ( (lv_imports_0_0= ruleImport ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:607:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:607:1: (lv_imports_0_0= ruleImport )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:608:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleEMappingBundle1302);
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
            	    break loop15;
                }
            } while (true);

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEMappingBundle1315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEMappingBundleAccess().getBundleKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:628:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:629:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:629:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:630:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingBundle1332); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:646:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:646:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleEMappingBundle1350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEMappingBundleAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:650:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:651:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:651:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:652:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingBundleRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getParentBundleEMappingBundleCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingBundle1373);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleEMappingBundle1387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:669:1: ( (lv_entities_6_0= ruleEBundleEntity ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:670:1: (lv_entities_6_0= ruleEBundleEntity )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:670:1: (lv_entities_6_0= ruleEBundleEntity )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:671:3: lv_entities_6_0= ruleEBundleEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getEntitiesEBundleEntityParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEBundleEntity_in_ruleEMappingBundle1408);
            lv_entities_6_0=ruleEBundleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
              	        }
                     		add(
                     			current, 
                     			"entities",
                      		lv_entities_6_0, 
                      		"EBundleEntity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:687:2: (otherlv_7= ',' ( (lv_entities_8_0= ruleEBundleEntity ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:687:4: otherlv_7= ',' ( (lv_entities_8_0= ruleEBundleEntity ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleEMappingBundle1421); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getEMappingBundleAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:691:1: ( (lv_entities_8_0= ruleEBundleEntity ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:692:1: (lv_entities_8_0= ruleEBundleEntity )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:692:1: (lv_entities_8_0= ruleEBundleEntity )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:693:3: lv_entities_8_0= ruleEBundleEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getEntitiesEBundleEntityParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEBundleEntity_in_ruleEMappingBundle1442);
            	    lv_entities_8_0=ruleEBundleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_8_0, 
            	              		"EBundleEntity");
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:709:4: ( (lv_typeDefs_9_0= ruleESQLTypeDef ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:710:1: (lv_typeDefs_9_0= ruleESQLTypeDef )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:710:1: (lv_typeDefs_9_0= ruleESQLTypeDef )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:711:3: lv_typeDefs_9_0= ruleESQLTypeDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getTypeDefsESQLTypeDefParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleESQLTypeDef_in_ruleEMappingBundle1465);
            	    lv_typeDefs_9_0=ruleESQLTypeDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeDefs",
            	              		lv_typeDefs_9_0, 
            	              		"ESQLTypeDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleEMappingBundle1478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_8());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:731:1: (otherlv_11= 'databases' ( (lv_databases_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_databases_14_0= RULE_STRING ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:731:3: otherlv_11= 'databases' ( (lv_databases_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_databases_14_0= RULE_STRING ) ) )*
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleEMappingBundle1491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getEMappingBundleAccess().getDatabasesKeyword_9_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:735:1: ( (lv_databases_12_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:736:1: (lv_databases_12_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:736:1: (lv_databases_12_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:737:3: lv_databases_12_0= RULE_STRING
                    {
                    lv_databases_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEMappingBundle1508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_databases_12_0, grammarAccess.getEMappingBundleAccess().getDatabasesSTRINGTerminalRuleCall_9_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingBundleRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"databases",
                              		lv_databases_12_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:753:2: (otherlv_13= ',' ( (lv_databases_14_0= RULE_STRING ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==26) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:753:4: otherlv_13= ',' ( (lv_databases_14_0= RULE_STRING ) )
                    	    {
                    	    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleEMappingBundle1526); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getEMappingBundleAccess().getCommaKeyword_9_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:757:1: ( (lv_databases_14_0= RULE_STRING ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:758:1: (lv_databases_14_0= RULE_STRING )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:758:1: (lv_databases_14_0= RULE_STRING )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:759:3: lv_databases_14_0= RULE_STRING
                    	    {
                    	    lv_databases_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEMappingBundle1543); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_databases_14_0, grammarAccess.getEMappingBundleAccess().getDatabasesSTRINGTerminalRuleCall_9_2_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEMappingBundleRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"databases",
                    	              		lv_databases_14_0, 
                    	              		"STRING");
                    	      	    
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:775:6: (otherlv_15= 'colsort' ( (lv_colSort_16_0= ruleColSort ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:775:8: otherlv_15= 'colsort' ( (lv_colSort_16_0= ruleColSort ) )
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_28_in_ruleEMappingBundle1565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getEMappingBundleAccess().getColsortKeyword_10_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:779:1: ( (lv_colSort_16_0= ruleColSort ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:780:1: (lv_colSort_16_0= ruleColSort )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:780:1: (lv_colSort_16_0= ruleColSort )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:781:3: lv_colSort_16_0= ruleColSort
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingBundleAccess().getColSortColSortEnumRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColSort_in_ruleEMappingBundle1586);
                    lv_colSort_16_0=ruleColSort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEMappingBundleRule());
                      	        }
                             		set(
                             			current, 
                             			"colSort",
                              		lv_colSort_16_0, 
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


    // $ANTLR start "entryRuleEBundleEntity"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:805:1: entryRuleEBundleEntity returns [EObject current=null] : iv_ruleEBundleEntity= ruleEBundleEntity EOF ;
    public final EObject entryRuleEBundleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBundleEntity = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:806:2: (iv_ruleEBundleEntity= ruleEBundleEntity EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:807:2: iv_ruleEBundleEntity= ruleEBundleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBundleEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEBundleEntity_in_entryRuleEBundleEntity1624);
            iv_ruleEBundleEntity=ruleEBundleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBundleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBundleEntity1634); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:814:1: ruleEBundleEntity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? otherlv_16= '}' )? ) ;
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
        Token otherlv_16=null;
        EObject lv_fkConstraints_4_0 = null;

        EObject lv_fkConstraints_6_0 = null;

        EObject lv_uniqueContraints_7_0 = null;

        EObject lv_uniqueContraints_9_0 = null;

        EObject lv_indices_10_0 = null;

        EObject lv_indices_12_0 = null;

        EObject lv_typeDefs_13_0 = null;

        EObject lv_typeDefs_15_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:817:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? otherlv_16= '}' )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:818:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? otherlv_16= '}' )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:818:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? otherlv_16= '}' )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:818:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? otherlv_16= '}' )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:818:2: ( (otherlv_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:819:1: (otherlv_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:819:1: (otherlv_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:820:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEBundleEntityRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEBundleEntity1679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEBundleEntityAccess().getEntityEMappingEntityCrossReference_0_0()); 
              	
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:831:2: (otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? otherlv_16= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==12) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:831:4: otherlv_1= '{' (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )? ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )? ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )? ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )? ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )? otherlv_16= '}'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleEBundleEntity1692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEBundleEntityAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:835:1: (otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==29) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:835:3: otherlv_2= 'pk-constraint' ( (lv_pkConstraintName_3_0= RULE_STRING ) )
                            {
                            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleEBundleEntity1705); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getEBundleEntityAccess().getPkConstraintKeyword_1_1_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:839:1: ( (lv_pkConstraintName_3_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:840:1: (lv_pkConstraintName_3_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:840:1: (lv_pkConstraintName_3_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:841:3: lv_pkConstraintName_3_0= RULE_STRING
                            {
                            lv_pkConstraintName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEBundleEntity1722); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:857:4: ( ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==33) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:857:5: ( (lv_fkConstraints_4_0= ruleEFkConstraint ) ) (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:857:5: ( (lv_fkConstraints_4_0= ruleEFkConstraint ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:858:1: (lv_fkConstraints_4_0= ruleEFkConstraint )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:858:1: (lv_fkConstraints_4_0= ruleEFkConstraint )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:859:3: lv_fkConstraints_4_0= ruleEFkConstraint
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getFkConstraintsEFkConstraintParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEFkConstraint_in_ruleEBundleEntity1751);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:875:2: (otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==26) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:875:4: otherlv_5= ',' ( (lv_fkConstraints_6_0= ruleEFkConstraint ) )
                            	    {
                            	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEBundleEntity1764); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_2_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:879:1: ( (lv_fkConstraints_6_0= ruleEFkConstraint ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:880:1: (lv_fkConstraints_6_0= ruleEFkConstraint )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:880:1: (lv_fkConstraints_6_0= ruleEFkConstraint )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:881:3: lv_fkConstraints_6_0= ruleEFkConstraint
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getFkConstraintsEFkConstraintParserRuleCall_1_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEFkConstraint_in_ruleEBundleEntity1785);
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
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:897:6: ( ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==34) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:897:7: ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) ) (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:897:7: ( (lv_uniqueContraints_7_0= ruleEUniqueConstraint ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:898:1: (lv_uniqueContraints_7_0= ruleEUniqueConstraint )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:898:1: (lv_uniqueContraints_7_0= ruleEUniqueConstraint )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:899:3: lv_uniqueContraints_7_0= ruleEUniqueConstraint
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getUniqueContraintsEUniqueConstraintParserRuleCall_1_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEUniqueConstraint_in_ruleEBundleEntity1811);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:915:2: (otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==26) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:915:4: otherlv_8= ',' ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) )
                            	    {
                            	    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleEBundleEntity1824); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_3_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:919:1: ( (lv_uniqueContraints_9_0= ruleEUniqueConstraint ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:920:1: (lv_uniqueContraints_9_0= ruleEUniqueConstraint )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:920:1: (lv_uniqueContraints_9_0= ruleEUniqueConstraint )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:921:3: lv_uniqueContraints_9_0= ruleEUniqueConstraint
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getUniqueContraintsEUniqueConstraintParserRuleCall_1_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEUniqueConstraint_in_ruleEBundleEntity1845);
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
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:937:6: ( ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==30) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:937:7: ( (lv_indices_10_0= ruleEIndex ) ) (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:937:7: ( (lv_indices_10_0= ruleEIndex ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:938:1: (lv_indices_10_0= ruleEIndex )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:938:1: (lv_indices_10_0= ruleEIndex )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:939:3: lv_indices_10_0= ruleEIndex
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getIndicesEIndexParserRuleCall_1_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEIndex_in_ruleEBundleEntity1871);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:955:2: (otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==26) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:955:4: otherlv_11= ',' ( (lv_indices_12_0= ruleEIndex ) )
                            	    {
                            	    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleEBundleEntity1884); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_4_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:959:1: ( (lv_indices_12_0= ruleEIndex ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:960:1: (lv_indices_12_0= ruleEIndex )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:960:1: (lv_indices_12_0= ruleEIndex )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:961:3: lv_indices_12_0= ruleEIndex
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getIndicesEIndexParserRuleCall_1_4_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEIndex_in_ruleEBundleEntity1905);
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
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:977:6: ( ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==35) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:977:7: ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) ) (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:977:7: ( (lv_typeDefs_13_0= ruleESQLAttTypeDef ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:978:1: (lv_typeDefs_13_0= ruleESQLAttTypeDef )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:978:1: (lv_typeDefs_13_0= ruleESQLAttTypeDef )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:979:3: lv_typeDefs_13_0= ruleESQLAttTypeDef
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getTypeDefsESQLAttTypeDefParserRuleCall_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleESQLAttTypeDef_in_ruleEBundleEntity1931);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:995:2: (otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==26) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:995:4: otherlv_14= ',' ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) )
                            	    {
                            	    otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleEBundleEntity1944); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getEBundleEntityAccess().getCommaKeyword_1_5_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:999:1: ( (lv_typeDefs_15_0= ruleESQLAttTypeDef ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1000:1: (lv_typeDefs_15_0= ruleESQLAttTypeDef )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1000:1: (lv_typeDefs_15_0= ruleESQLAttTypeDef )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1001:3: lv_typeDefs_15_0= ruleESQLAttTypeDef
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEBundleEntityAccess().getTypeDefsESQLAttTypeDefParserRuleCall_1_5_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleESQLAttTypeDef_in_ruleEBundleEntity1965);
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
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleEBundleEntity1981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getEBundleEntityAccess().getRightCurlyBracketKeyword_1_6());
                          
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1029:1: entryRuleEIndex returns [EObject current=null] : iv_ruleEIndex= ruleEIndex EOF ;
    public final EObject entryRuleEIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIndex = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1030:2: (iv_ruleEIndex= ruleEIndex EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1031:2: iv_ruleEIndex= ruleEIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIndexRule()); 
            }
            pushFollow(FOLLOW_ruleEIndex_in_entryRuleEIndex2019);
            iv_ruleEIndex=ruleEIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEIndex; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIndex2029); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1038:1: ruleEIndex returns [EObject current=null] : (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1041:28: ( (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1042:1: (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1042:1: (otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1042:3: otherlv_0= 'index' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleEIndex2066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEIndexAccess().getIndexKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1046:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1047:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1047:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1048:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEIndex2083); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleEIndex2100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEIndexAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1068:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1069:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1069:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1070:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEIndexRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEIndexAccess().getAttributesEAttributeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEIndex2123);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1083:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1083:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleEIndex2136); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEIndexAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1087:1: ( ( ruleQualifiedName ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1088:1: ( ruleQualifiedName )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1088:1: ( ruleQualifiedName )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1089:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEIndexRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEIndexAccess().getAttributesEAttributeCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEIndex2159);
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
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleEIndex2173); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1114:1: entryRuleEFkConstraint returns [EObject current=null] : iv_ruleEFkConstraint= ruleEFkConstraint EOF ;
    public final EObject entryRuleEFkConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFkConstraint = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1115:2: (iv_ruleEFkConstraint= ruleEFkConstraint EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1116:2: iv_ruleEFkConstraint= ruleEFkConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFkConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleEFkConstraint_in_entryRuleEFkConstraint2209);
            iv_ruleEFkConstraint=ruleEFkConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFkConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFkConstraint2219); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1123:1: ruleEFkConstraint returns [EObject current=null] : (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEFkConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1126:28: ( (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1127:1: (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1127:1: (otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1127:3: otherlv_0= 'fk-constraint' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleEFkConstraint2256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEFkConstraintAccess().getFkConstraintKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1131:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1132:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1132:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1133:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEFkConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEFkConstraintAccess().getAttributeEAttributeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEFkConstraint2279);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1146:2: ( (lv_name_2_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1147:1: (lv_name_2_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1147:1: (lv_name_2_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1148:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEFkConstraint2296); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1172:1: entryRuleEUniqueConstraint returns [EObject current=null] : iv_ruleEUniqueConstraint= ruleEUniqueConstraint EOF ;
    public final EObject entryRuleEUniqueConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUniqueConstraint = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1173:2: (iv_ruleEUniqueConstraint= ruleEUniqueConstraint EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1174:2: iv_ruleEUniqueConstraint= ruleEUniqueConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEUniqueConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleEUniqueConstraint_in_entryRuleEUniqueConstraint2337);
            iv_ruleEUniqueConstraint=ruleEUniqueConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEUniqueConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEUniqueConstraint2347); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1181:1: ruleEUniqueConstraint returns [EObject current=null] : (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEUniqueConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1184:28: ( (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1185:1: (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1185:1: (otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1185:3: otherlv_0= 'unique-constraint' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleEUniqueConstraint2384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEUniqueConstraintAccess().getUniqueConstraintKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1189:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1190:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1190:1: (lv_name_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1191:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEUniqueConstraint2401); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleEUniqueConstraint2418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEUniqueConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1211:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1212:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1212:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1213:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEUniqueConstraintRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEUniqueConstraintAccess().getAttributesEAttributeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEUniqueConstraint2441);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1226:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1226:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleEUniqueConstraint2454); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEUniqueConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1230:1: ( ( ruleQualifiedName ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1231:1: ( ruleQualifiedName )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1231:1: ( ruleQualifiedName )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1232:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEUniqueConstraintRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEUniqueConstraintAccess().getAttributesEAttributeCrossReference_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEUniqueConstraint2477);
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
            	    break loop33;
                }
            } while (true);

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleEUniqueConstraint2491); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1257:1: entryRuleESQLAttTypeDef returns [EObject current=null] : iv_ruleESQLAttTypeDef= ruleESQLAttTypeDef EOF ;
    public final EObject entryRuleESQLAttTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESQLAttTypeDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1258:2: (iv_ruleESQLAttTypeDef= ruleESQLAttTypeDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1259:2: iv_ruleESQLAttTypeDef= ruleESQLAttTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getESQLAttTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleESQLAttTypeDef_in_entryRuleESQLAttTypeDef2527);
            iv_ruleESQLAttTypeDef=ruleESQLAttTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleESQLAttTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleESQLAttTypeDef2537); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1266:1: ruleESQLAttTypeDef returns [EObject current=null] : (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1269:28: ( (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1270:1: (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1270:1: (otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1270:3: otherlv_0= 'sql-type-def' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleESQLAttTypeDef2574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getESQLAttTypeDefAccess().getSqlTypeDefKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1274:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1275:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1275:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1276:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getESQLAttTypeDefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLAttTypeDefAccess().getAttributeEAttributeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleESQLAttTypeDef2597);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleESQLAttTypeDef2609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getESQLAttTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1293:1: ( (lv_dbTypes_3_0= ruleESQLDbType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1294:1: (lv_dbTypes_3_0= ruleESQLDbType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1294:1: (lv_dbTypes_3_0= ruleESQLDbType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1295:3: lv_dbTypes_3_0= ruleESQLDbType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLAttTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleESQLDbType_in_ruleESQLAttTypeDef2630);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1311:2: (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==26) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1311:4: otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleESQLAttTypeDef2643); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getESQLAttTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1315:1: ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1316:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1316:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1317:3: lv_dbTypes_5_0= ruleESQLDbType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getESQLAttTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleESQLDbType_in_ruleESQLAttTypeDef2664);
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
            	    break loop34;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleESQLAttTypeDef2678); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1345:1: entryRuleESQLTypeDef returns [EObject current=null] : iv_ruleESQLTypeDef= ruleESQLTypeDef EOF ;
    public final EObject entryRuleESQLTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESQLTypeDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1346:2: (iv_ruleESQLTypeDef= ruleESQLTypeDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1347:2: iv_ruleESQLTypeDef= ruleESQLTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getESQLTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleESQLTypeDef_in_entryRuleESQLTypeDef2714);
            iv_ruleESQLTypeDef=ruleESQLTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleESQLTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleESQLTypeDef2724); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1354:1: ruleESQLTypeDef returns [EObject current=null] : (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1357:28: ( (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1358:1: (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1358:1: (otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1358:3: otherlv_0= 'sql-type-def' ( (lv_etype_1_0= ruleEType ) ) otherlv_2= '{' ( (lv_dbTypes_3_0= ruleESQLDbType ) ) (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleESQLTypeDef2761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getESQLTypeDefAccess().getSqlTypeDefKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1362:1: ( (lv_etype_1_0= ruleEType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1363:1: (lv_etype_1_0= ruleEType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1363:1: (lv_etype_1_0= ruleEType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1364:3: lv_etype_1_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLTypeDefAccess().getEtypeETypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEType_in_ruleESQLTypeDef2782);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleESQLTypeDef2794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getESQLTypeDefAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1384:1: ( (lv_dbTypes_3_0= ruleESQLDbType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1385:1: (lv_dbTypes_3_0= ruleESQLDbType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1385:1: (lv_dbTypes_3_0= ruleESQLDbType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1386:3: lv_dbTypes_3_0= ruleESQLDbType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getESQLTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleESQLDbType_in_ruleESQLTypeDef2815);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1402:2: (otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==26) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1402:4: otherlv_4= ',' ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleESQLTypeDef2828); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getESQLTypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1406:1: ( (lv_dbTypes_5_0= ruleESQLDbType ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1407:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1407:1: (lv_dbTypes_5_0= ruleESQLDbType )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1408:3: lv_dbTypes_5_0= ruleESQLDbType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getESQLTypeDefAccess().getDbTypesESQLDbTypeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleESQLDbType_in_ruleESQLTypeDef2849);
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
            	    break loop35;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleESQLTypeDef2863); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1436:1: entryRuleESQLDbType returns [EObject current=null] : iv_ruleESQLDbType= ruleESQLDbType EOF ;
    public final EObject entryRuleESQLDbType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESQLDbType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1437:2: (iv_ruleESQLDbType= ruleESQLDbType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1438:2: iv_ruleESQLDbType= ruleESQLDbType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getESQLDbTypeRule()); 
            }
            pushFollow(FOLLOW_ruleESQLDbType_in_entryRuleESQLDbType2899);
            iv_ruleESQLDbType=ruleESQLDbType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleESQLDbType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleESQLDbType2909); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1445:1: ruleESQLDbType returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleESQLDbType() throws RecognitionException {
        EObject current = null;

        Token lv_dbType_0_1=null;
        Token lv_dbType_0_2=null;
        Token lv_sqlTypeDef_1_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1448:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1449:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1449:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1449:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_sqlTypeDef_1_0= RULE_STRING ) ) (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1449:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1450:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1450:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1451:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1451:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_STRING) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1452:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,14,FOLLOW_14_in_ruleESQLDbType2954); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1464:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleESQLDbType2982); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1482:2: ( (lv_sqlTypeDef_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1483:1: (lv_sqlTypeDef_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1483:1: (lv_sqlTypeDef_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1484:3: lv_sqlTypeDef_1_0= RULE_STRING
            {
            lv_sqlTypeDef_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleESQLDbType3007); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1500:2: (otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1500:4: otherlv_2= 'size' ( (lv_size_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleESQLDbType3025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getESQLDbTypeAccess().getSizeKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1504:1: ( (lv_size_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1505:1: (lv_size_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1505:1: (lv_size_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1506:3: lv_size_3_0= RULE_STRING
                    {
                    lv_size_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleESQLDbType3042); if (state.failed) return current;
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


    // $ANTLR start "entryRuleEMappingEntityDef"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1530:1: entryRuleEMappingEntityDef returns [EObject current=null] : iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF ;
    public final EObject entryRuleEMappingEntityDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingEntityDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1531:2: (iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1532:2: iv_ruleEMappingEntityDef= ruleEMappingEntityDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingEntityDefRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntityDef_in_entryRuleEMappingEntityDef3085);
            iv_ruleEMappingEntityDef=ruleEMappingEntityDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingEntityDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingEntityDef3095); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1539:1: ruleEMappingEntityDef returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) ) ;
    public final EObject ruleEMappingEntityDef() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_entity_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1542:28: ( ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1543:1: ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1543:1: ( ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1543:2: ( (lv_package_0_0= rulePackageDeclaration ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_entity_2_0= ruleEMappingEntity ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1543:2: ( (lv_package_0_0= rulePackageDeclaration ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1544:1: (lv_package_0_0= rulePackageDeclaration )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1544:1: (lv_package_0_0= rulePackageDeclaration )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1545:3: lv_package_0_0= rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_ruleEMappingEntityDef3141);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1561:2: ( (lv_imports_1_0= ruleImport ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==37) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1562:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1562:1: (lv_imports_1_0= ruleImport )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1563:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleEMappingEntityDef3162);
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
            	    break loop38;
                }
            } while (true);

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1579:3: ( (lv_entity_2_0= ruleEMappingEntity ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1580:1: (lv_entity_2_0= ruleEMappingEntity )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1580:1: (lv_entity_2_0= ruleEMappingEntity )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1581:3: lv_entity_2_0= ruleEMappingEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityDefAccess().getEntityEMappingEntityParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_ruleEMappingEntityDef3184);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1605:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1606:2: (iv_ruleImport= ruleImport EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1607:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport3220);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport3230); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1614:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1617:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1618:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1618:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1618:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleImport3267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1622:1: ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1623:1: ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1623:1: ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1624:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1624:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1625:3: lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport3290);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1640:8: lv_importedNamespace_1_2= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport3309);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1666:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1667:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1668:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration3348);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration3358); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1675:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1678:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1679:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1679:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1679:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulePackageDeclaration3395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1683:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1684:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1684:1: (lv_name_1_0= ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1685:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration3416);
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

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_rulePackageDeclaration3428); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1713:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1714:2: (iv_ruleFQN= ruleFQN EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1715:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3465);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3476); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1722:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1725:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1726:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1726:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1726:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1733:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==40) && (synpred1_InternalEMap())) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1733:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1733:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1733:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleFQN3544); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3560); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEMappingEntity"
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1756:1: entryRuleEMappingEntity returns [EObject current=null] : iv_ruleEMappingEntity= ruleEMappingEntity EOF ;
    public final EObject entryRuleEMappingEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingEntity = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1757:2: (iv_ruleEMappingEntity= ruleEMappingEntity EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1758:2: iv_ruleEMappingEntity= ruleEMappingEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_entryRuleEMappingEntity3607);
            iv_ruleEMappingEntity=ruleEMappingEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingEntity3617); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1765:1: ruleEMappingEntity returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1768:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1769:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1769:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1769:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_etype_6_0= ruleEType ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )? otherlv_21= '}' (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )? (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1769:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1770:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1770:1: (lv_abstract_0_0= 'abstract' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1771:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,41,FOLLOW_41_in_ruleEMappingEntity3660); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleEMappingEntity3686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEMappingEntityAccess().getEntityKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1788:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1789:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1789:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1790:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity3703); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1806:2: ( ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25||LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1806:3: ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) ) ( ( ruleQualifiedName ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1806:3: ( ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1807:1: ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1807:1: ( (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1808:1: (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1808:1: (lv_extensionType_3_1= 'extends' | lv_extensionType_3_2= 'derived' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==25) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==43) ) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1809:3: lv_extensionType_3_1= 'extends'
                            {
                            lv_extensionType_3_1=(Token)match(input,25,FOLLOW_25_in_ruleEMappingEntity3729); if (state.failed) return current;
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
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1821:8: lv_extensionType_3_2= 'derived'
                            {
                            lv_extensionType_3_2=(Token)match(input,43,FOLLOW_43_in_ruleEMappingEntity3758); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1836:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1837:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1837:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1838:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingEntityRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingEntity3797);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleEMappingEntity3811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1855:1: ( (lv_etype_6_0= ruleEType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1856:1: (lv_etype_6_0= ruleEType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1856:1: (lv_etype_6_0= ruleEType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1857:3: lv_etype_6_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getEtypeETypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEType_in_ruleEMappingEntity3832);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1873:2: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1873:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleEAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleEMappingEntity3845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleEMappingEntity3857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_6_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1881:1: ( (lv_attributes_9_0= ruleEAttribute ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1882:1: (lv_attributes_9_0= ruleEAttribute )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1882:1: (lv_attributes_9_0= ruleEAttribute )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1883:3: lv_attributes_9_0= ruleEAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEAttribute_in_ruleEMappingEntity3878);
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1899:2: (otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==26) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1899:4: otherlv_10= ',' ( (lv_attributes_11_0= ruleEAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleEMappingEntity3891); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getEMappingEntityAccess().getCommaKeyword_6_3_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1903:1: ( (lv_attributes_11_0= ruleEAttribute ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1904:1: (lv_attributes_11_0= ruleEAttribute )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1904:1: (lv_attributes_11_0= ruleEAttribute )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1905:3: lv_attributes_11_0= ruleEAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEAttribute_in_ruleEMappingEntity3912);
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
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleEMappingEntity3926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1925:3: (otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1925:5: otherlv_13= 'queries' otherlv_14= '{' ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) ) (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )* otherlv_20= '}'
                    {
                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleEMappingEntity3941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEMappingEntityAccess().getQueriesKeyword_7_0());
                          
                    }
                    otherlv_14=(Token)match(input,12,FOLLOW_12_in_ruleEMappingEntity3953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7_1());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1933:1: ( ( (lv_namedQueries_15_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) ) )
                    int alt46=2;
                    switch ( input.LA(1) ) {
                    case 13:
                    case 77:
                        {
                        alt46=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA46_2 = input.LA(2);

                        if ( (LA46_2==RULE_ID||LA46_2==40) ) {
                            alt46=2;
                        }
                        else if ( (LA46_2==12||LA46_2==31) ) {
                            alt46=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 46, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 64:
                    case 70:
                        {
                        alt46=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }

                    switch (alt46) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1933:2: ( (lv_namedQueries_15_0= ruleENamedQuery ) )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1933:2: ( (lv_namedQueries_15_0= ruleENamedQuery ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1934:1: (lv_namedQueries_15_0= ruleENamedQuery )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1934:1: (lv_namedQueries_15_0= ruleENamedQuery )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1935:3: lv_namedQueries_15_0= ruleENamedQuery
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleENamedQuery_in_ruleEMappingEntity3975);
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
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1952:6: ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1952:6: ( (lv_namedCustomQueries_16_0= ruleENamedCustomQuery ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1953:1: (lv_namedCustomQueries_16_0= ruleENamedCustomQuery )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1953:1: (lv_namedCustomQueries_16_0= ruleENamedCustomQuery )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1954:3: lv_namedCustomQueries_16_0= ruleENamedCustomQuery
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedCustomQueriesENamedCustomQueryParserRuleCall_7_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity4002);
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1970:3: (otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==26) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1970:5: otherlv_17= ',' ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) )
                    	    {
                    	    otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleEMappingEntity4016); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_17, grammarAccess.getEMappingEntityAccess().getCommaKeyword_7_3_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1974:1: ( ( (lv_namedQueries_18_0= ruleENamedQuery ) ) | ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) ) )
                    	    int alt47=2;
                    	    switch ( input.LA(1) ) {
                    	    case 13:
                    	    case 77:
                    	        {
                    	        alt47=1;
                    	        }
                    	        break;
                    	    case RULE_ID:
                    	        {
                    	        int LA47_2 = input.LA(2);

                    	        if ( (LA47_2==12||LA47_2==31) ) {
                    	            alt47=1;
                    	        }
                    	        else if ( (LA47_2==RULE_ID||LA47_2==40) ) {
                    	            alt47=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return current;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 47, 2, input);

                    	            throw nvae;
                    	        }
                    	        }
                    	        break;
                    	    case 56:
                    	    case 57:
                    	    case 58:
                    	    case 59:
                    	    case 60:
                    	    case 61:
                    	    case 62:
                    	    case 64:
                    	    case 70:
                    	        {
                    	        alt47=2;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 47, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt47) {
                    	        case 1 :
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1974:2: ( (lv_namedQueries_18_0= ruleENamedQuery ) )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1974:2: ( (lv_namedQueries_18_0= ruleENamedQuery ) )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1975:1: (lv_namedQueries_18_0= ruleENamedQuery )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1975:1: (lv_namedQueries_18_0= ruleENamedQuery )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1976:3: lv_namedQueries_18_0= ruleENamedQuery
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_3_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleENamedQuery_in_ruleEMappingEntity4038);
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
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1993:6: ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1993:6: ( (lv_namedCustomQueries_19_0= ruleENamedCustomQuery ) )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1994:1: (lv_namedCustomQueries_19_0= ruleENamedCustomQuery )
                    	            {
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1994:1: (lv_namedCustomQueries_19_0= ruleENamedCustomQuery )
                    	            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1995:3: lv_namedCustomQueries_19_0= ruleENamedCustomQuery
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getEMappingEntityAccess().getNamedCustomQueriesENamedCustomQueryParserRuleCall_7_3_1_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity4065);
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
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleEMappingEntity4080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FOLLOW_19_in_ruleEMappingEntity4094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_8());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2019:1: (otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==20) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2019:3: otherlv_22= 'as' ( (lv_tableName_23_0= RULE_ID ) )
                    {
                    otherlv_22=(Token)match(input,20,FOLLOW_20_in_ruleEMappingEntity4107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getEMappingEntityAccess().getAsKeyword_9_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2023:1: ( (lv_tableName_23_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2024:1: (lv_tableName_23_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2024:1: (lv_tableName_23_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2025:3: lv_tableName_23_0= RULE_ID
                    {
                    lv_tableName_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity4124); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2041:4: (otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2041:6: otherlv_24= 'descriminatedby' ( (lv_descriminationColumn_25_0= RULE_ID ) )
                    {
                    otherlv_24=(Token)match(input,46,FOLLOW_46_in_ruleEMappingEntity4144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getEMappingEntityAccess().getDescriminatedbyKeyword_10_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2045:1: ( (lv_descriminationColumn_25_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2046:1: (lv_descriminationColumn_25_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2046:1: (lv_descriminationColumn_25_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2047:3: lv_descriminationColumn_25_0= RULE_ID
                    {
                    lv_descriminationColumn_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingEntity4161); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2071:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2072:2: (iv_ruleEAttribute= ruleEAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2073:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_entryRuleEAttribute4204);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttribute4214); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2080:1: ruleEAttribute returns [EObject current=null] : ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2083:28: ( ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2084:1: ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2084:1: ( ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2084:2: ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=>' ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) ) (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2084:2: ( ( (lv_pk_0_0= 'primarykey' ) )? | ( (lv_forcedFk_1_0= 'forced-fk' ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||LA53_0==47) ) {
                alt53=1;
            }
            else if ( (LA53_0==48) ) {
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2084:3: ( (lv_pk_0_0= 'primarykey' ) )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2084:3: ( (lv_pk_0_0= 'primarykey' ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==47) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2085:1: (lv_pk_0_0= 'primarykey' )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2085:1: (lv_pk_0_0= 'primarykey' )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2086:3: lv_pk_0_0= 'primarykey'
                            {
                            lv_pk_0_0=(Token)match(input,47,FOLLOW_47_in_ruleEAttribute4258); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2100:6: ( (lv_forcedFk_1_0= 'forced-fk' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2100:6: ( (lv_forcedFk_1_0= 'forced-fk' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2101:1: (lv_forcedFk_1_0= 'forced-fk' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2101:1: (lv_forcedFk_1_0= 'forced-fk' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2102:3: lv_forcedFk_1_0= 'forced-fk'
                    {
                    lv_forcedFk_1_0=(Token)match(input,48,FOLLOW_48_in_ruleEAttribute4296); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2115:3: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2116:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2116:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2117:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute4327); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleEAttribute4344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2137:1: ( ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? ) | ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            else if ( (LA58_0==51) ) {
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2137:2: ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2137:2: ( ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2137:3: ( (lv_columnName_4_0= RULE_ID ) ) (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2137:3: ( (lv_columnName_4_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2138:1: (lv_columnName_4_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2138:1: (lv_columnName_4_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2139:3: lv_columnName_4_0= RULE_ID
                    {
                    lv_columnName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute4363); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2155:2: (otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==50) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2155:4: otherlv_5= 'generatedby' otherlv_6= '{' ( (lv_valueGenerators_7_0= ruleEValueGenerator ) ) (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )* otherlv_10= '}'
                            {
                            otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleEAttribute4381); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getEAttributeAccess().getGeneratedbyKeyword_3_0_1_0());
                                  
                            }
                            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleEAttribute4393); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_3_0_1_1());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2163:1: ( (lv_valueGenerators_7_0= ruleEValueGenerator ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2164:1: (lv_valueGenerators_7_0= ruleEValueGenerator )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2164:1: (lv_valueGenerators_7_0= ruleEValueGenerator )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2165:3: lv_valueGenerators_7_0= ruleEValueGenerator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEValueGenerator_in_ruleEAttribute4414);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2181:2: (otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==26) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2181:4: otherlv_8= ',' ( (lv_valueGenerators_9_0= ruleEValueGenerator ) )
                            	    {
                            	    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleEAttribute4427); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getCommaKeyword_3_0_1_3_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2185:1: ( (lv_valueGenerators_9_0= ruleEValueGenerator ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2186:1: (lv_valueGenerators_9_0= ruleEValueGenerator )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2186:1: (lv_valueGenerators_9_0= ruleEValueGenerator )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2187:3: lv_valueGenerators_9_0= ruleEValueGenerator
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEValueGenerator_in_ruleEAttribute4448);
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
                            	    break loop54;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleEAttribute4462); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2208:6: ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2208:6: ( ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2208:7: ( (lv_resolved_11_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_13= '(' ( (lv_parameters_14_0= RULE_ID ) ) otherlv_15= ')' ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2208:7: ( (lv_resolved_11_0= 'resolve' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2209:1: (lv_resolved_11_0= 'resolve' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2209:1: (lv_resolved_11_0= 'resolve' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2210:3: lv_resolved_11_0= 'resolve'
                    {
                    lv_resolved_11_0=(Token)match(input,51,FOLLOW_51_in_ruleEAttribute4490); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2223:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2224:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2224:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2225:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEAttribute4526);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_31_in_ruleEAttribute4538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2242:1: ( (lv_parameters_14_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2243:1: (lv_parameters_14_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2243:1: (lv_parameters_14_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2244:3: lv_parameters_14_0= RULE_ID
                    {
                    lv_parameters_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute4555); if (state.failed) return current;
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

                    otherlv_15=(Token)match(input,32,FOLLOW_32_in_ruleEAttribute4572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2264:1: ( ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )? )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_ID) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2264:2: ( ( ruleQualifiedName ) ) otherlv_17= 'on' ( (lv_relationTable_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )?
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2264:2: ( ( ruleQualifiedName ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2265:1: ( ruleQualifiedName )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2265:1: ( ruleQualifiedName )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2266:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getEAttributeRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEAttributeAccess().getOppositeEAttributeCrossReference_3_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEAttribute4596);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_17=(Token)match(input,52,FOLLOW_52_in_ruleEAttribute4608); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getOnKeyword_3_1_5_1());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2283:1: ( (lv_relationTable_18_0= RULE_ID ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2284:1: (lv_relationTable_18_0= RULE_ID )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2284:1: (lv_relationTable_18_0= RULE_ID )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2285:3: lv_relationTable_18_0= RULE_ID
                            {
                            lv_relationTable_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute4625); if (state.failed) return current;
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2301:2: (otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) ) )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==40) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2301:4: otherlv_19= '.' ( (lv_relationColumn_20_0= RULE_ID ) )
                                    {
                                    otherlv_19=(Token)match(input,40,FOLLOW_40_in_ruleEAttribute4643); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getFullStopKeyword_3_1_5_3_0());
                                          
                                    }
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2305:1: ( (lv_relationColumn_20_0= RULE_ID ) )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2306:1: (lv_relationColumn_20_0= RULE_ID )
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2306:1: (lv_relationColumn_20_0= RULE_ID )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2307:3: lv_relationColumn_20_0= RULE_ID
                                    {
                                    lv_relationColumn_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEAttribute4660); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2323:8: (otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==36) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2323:10: otherlv_21= 'size' ( (lv_size_22_0= RULE_STRING ) )
                    {
                    otherlv_21=(Token)match(input,36,FOLLOW_36_in_ruleEAttribute4684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getSizeKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2327:1: ( (lv_size_22_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2328:1: (lv_size_22_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2328:1: (lv_size_22_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2329:3: lv_size_22_0= RULE_STRING
                    {
                    lv_size_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEAttribute4701); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2353:1: entryRuleEValueGenerator returns [EObject current=null] : iv_ruleEValueGenerator= ruleEValueGenerator EOF ;
    public final EObject entryRuleEValueGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueGenerator = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2354:2: (iv_ruleEValueGenerator= ruleEValueGenerator EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2355:2: iv_ruleEValueGenerator= ruleEValueGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEValueGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator4744);
            iv_ruleEValueGenerator=ruleEValueGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEValueGenerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEValueGenerator4754); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2362:1: ruleEValueGenerator returns [EObject current=null] : ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2365:28: ( ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2366:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2366:1: ( ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2366:2: ( (lv_dbType_0_0= RULE_STRING ) ) ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2366:2: ( (lv_dbType_0_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2367:1: (lv_dbType_0_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2367:1: (lv_dbType_0_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2368:3: lv_dbType_0_0= RULE_STRING
            {
            lv_dbType_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator4796); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2384:2: ( ( (lv_autokey_1_0= 'autokey' ) ) | (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) ) | (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt60=1;
                }
                break;
            case 54:
                {
                alt60=2;
                }
                break;
            case 55:
                {
                alt60=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2384:3: ( (lv_autokey_1_0= 'autokey' ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2384:3: ( (lv_autokey_1_0= 'autokey' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2385:1: (lv_autokey_1_0= 'autokey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2385:1: (lv_autokey_1_0= 'autokey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2386:3: lv_autokey_1_0= 'autokey'
                    {
                    lv_autokey_1_0=(Token)match(input,53,FOLLOW_53_in_ruleEValueGenerator4820); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2400:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2400:6: (otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2400:8: otherlv_2= 'query' ( (lv_query_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleEValueGenerator4852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEValueGeneratorAccess().getQueryKeyword_1_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2404:1: ( (lv_query_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2405:1: (lv_query_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2405:1: (lv_query_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2406:3: lv_query_3_0= RULE_STRING
                    {
                    lv_query_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator4869); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2423:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2423:6: (otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2423:8: otherlv_4= 'seqnext' ( (lv_sequence_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleEValueGenerator4894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEValueGeneratorAccess().getSeqnextKeyword_1_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2427:1: ( (lv_sequence_5_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2428:1: (lv_sequence_5_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2428:1: (lv_sequence_5_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2429:3: lv_sequence_5_0= RULE_STRING
                    {
                    lv_sequence_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEValueGenerator4911); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2453:1: entryRuleENamedQuery returns [EObject current=null] : iv_ruleENamedQuery= ruleENamedQuery EOF ;
    public final EObject entryRuleENamedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2454:2: (iv_ruleENamedQuery= ruleENamedQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2455:2: iv_ruleENamedQuery= ruleENamedQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery4954);
            iv_ruleENamedQuery=ruleENamedQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedQuery4964); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2462:1: ruleENamedQuery returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2465:28: ( ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2466:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2466:1: ( ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2466:2: ( (lv_returnType_0_0= ruleReturnType ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_queries_8_0= ruleEQuery ) ) (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )* otherlv_11= '}'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2466:2: ( (lv_returnType_0_0= ruleReturnType ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==13||LA61_0==77) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2467:1: (lv_returnType_0_0= ruleReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2467:1: (lv_returnType_0_0= ruleReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2468:3: lv_returnType_0_0= ruleReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getReturnTypeReturnTypeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnType_in_ruleENamedQuery5010);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2484:3: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2485:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2485:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2486:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleENamedQuery5028); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2502:2: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==31) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2502:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleENamedQuery5046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2506:1: ( ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )* )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID||LA63_0==47||(LA63_0>=56 && LA63_0<=60)||LA63_0==62) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2506:2: ( (lv_parameters_3_0= ruleEParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2506:2: ( (lv_parameters_3_0= ruleEParameter ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2507:1: (lv_parameters_3_0= ruleEParameter )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2507:1: (lv_parameters_3_0= ruleEParameter )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2508:3: lv_parameters_3_0= ruleEParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEParameter_in_ruleENamedQuery5068);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2524:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==26) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2524:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleEParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleENamedQuery5081); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getENamedQueryAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2528:1: ( (lv_parameters_5_0= ruleEParameter ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2529:1: (lv_parameters_5_0= ruleEParameter )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2529:1: (lv_parameters_5_0= ruleEParameter )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2530:3: lv_parameters_5_0= ruleEParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEParameter_in_ruleENamedQuery5102);
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
                            	    break loop62;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleENamedQuery5118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleENamedQuery5132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2554:1: ( (lv_queries_8_0= ruleEQuery ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2555:1: (lv_queries_8_0= ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2555:1: (lv_queries_8_0= ruleEQuery )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2556:3: lv_queries_8_0= ruleEQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEQuery_in_ruleENamedQuery5153);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2572:2: (otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==26) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2572:4: otherlv_9= ',' ( (lv_queries_10_0= ruleEQuery ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleENamedQuery5166); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getENamedQueryAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2576:1: ( (lv_queries_10_0= ruleEQuery ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2577:1: (lv_queries_10_0= ruleEQuery )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2577:1: (lv_queries_10_0= ruleEQuery )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2578:3: lv_queries_10_0= ruleEQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQuery_in_ruleENamedQuery5187);
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
            	    break loop65;
                }
            } while (true);

            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleENamedQuery5201); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2606:1: entryRuleEPrimtiveType returns [String current=null] : iv_ruleEPrimtiveType= ruleEPrimtiveType EOF ;
    public final String entryRuleEPrimtiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEPrimtiveType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2607:2: (iv_ruleEPrimtiveType= ruleEPrimtiveType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2608:2: iv_ruleEPrimtiveType= ruleEPrimtiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPrimtiveTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEPrimtiveType_in_entryRuleEPrimtiveType5238);
            iv_ruleEPrimtiveType=ruleEPrimtiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPrimtiveType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPrimtiveType5249); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2615:1: ruleEPrimtiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN ) ;
    public final AntlrDatatypeRuleToken ruleEPrimtiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_5 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2618:28: ( (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2619:1: (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2619:1: (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'boolean' | this_FQN_5= ruleFQN )
            int alt66=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt66=1;
                }
                break;
            case 57:
                {
                alt66=2;
                }
                break;
            case 58:
                {
                alt66=3;
                }
                break;
            case 59:
                {
                alt66=4;
                }
                break;
            case 60:
                {
                alt66=5;
                }
                break;
            case RULE_ID:
                {
                alt66=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2620:2: kw= 'int'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleEPrimtiveType5287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getIntKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2627:2: kw= 'long'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleEPrimtiveType5306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getLongKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2634:2: kw= 'double'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleEPrimtiveType5325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getDoubleKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2641:2: kw= 'float'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleEPrimtiveType5344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getFloatKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2648:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleEPrimtiveType5363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEPrimtiveTypeAccess().getBooleanKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2655:5: this_FQN_5= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEPrimtiveTypeAccess().getFQNParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEPrimtiveType5391);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2673:1: entryRuleEMapType returns [String current=null] : iv_ruleEMapType= ruleEMapType EOF ;
    public final String entryRuleEMapType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMapType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2674:2: (iv_ruleEMapType= ruleEMapType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2675:2: iv_ruleEMapType= ruleEMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMapTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEMapType_in_entryRuleEMapType5437);
            iv_ruleEMapType=ruleEMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMapType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMapType5448); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2682:1: ruleEMapType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'map' ;
    public final AntlrDatatypeRuleToken ruleEMapType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2685:28: (kw= 'map' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2687:2: kw= 'map'
            {
            kw=(Token)match(input,61,FOLLOW_61_in_ruleEMapType5485); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2700:1: entryRuleENamedCustomQuery returns [EObject current=null] : iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF ;
    public final EObject entryRuleENamedCustomQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENamedCustomQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2701:2: (iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2702:2: iv_ruleENamedCustomQuery= ruleENamedCustomQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENamedCustomQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedCustomQuery_in_entryRuleENamedCustomQuery5524);
            iv_ruleENamedCustomQuery=ruleENamedCustomQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENamedCustomQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedCustomQuery5534); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2709:1: ruleENamedCustomQuery returns [EObject current=null] : ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2712:28: ( ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2713:1: ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2713:1: ( ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2713:2: ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= '{' ( (lv_queries_11_0= ruleECustomQuery ) ) (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )* otherlv_14= '}'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2713:2: ( ( (lv_returnType_0_0= ruleEReturnType ) ) | ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID||(LA67_0>=56 && LA67_0<=61)||LA67_0==64||LA67_0==70) ) {
                alt67=1;
            }
            else if ( (LA67_0==62) ) {
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2713:3: ( (lv_returnType_0_0= ruleEReturnType ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2713:3: ( (lv_returnType_0_0= ruleEReturnType ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2714:1: (lv_returnType_0_0= ruleEReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2714:1: (lv_returnType_0_0= ruleEReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2715:3: lv_returnType_0_0= ruleEReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getReturnTypeEReturnTypeParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery5581);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2732:6: ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2732:6: ( ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2732:7: ( (lv_list_1_0= '[' ) ) ( (lv_returnType_2_0= ruleEReturnType ) ) otherlv_3= ']'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2732:7: ( (lv_list_1_0= '[' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2733:1: (lv_list_1_0= '[' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2733:1: (lv_list_1_0= '[' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2734:3: lv_list_1_0= '['
                    {
                    lv_list_1_0=(Token)match(input,62,FOLLOW_62_in_ruleENamedCustomQuery5606); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2747:2: ( (lv_returnType_2_0= ruleEReturnType ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2748:1: (lv_returnType_2_0= ruleEReturnType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2748:1: (lv_returnType_2_0= ruleEReturnType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2749:3: lv_returnType_2_0= ruleEReturnType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getReturnTypeEReturnTypeParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery5640);
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

                    otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleENamedCustomQuery5652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getENamedCustomQueryAccess().getRightSquareBracketKeyword_0_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2769:3: ( (lv_name_4_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2770:1: (lv_name_4_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2770:1: (lv_name_4_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2771:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleENamedCustomQuery5671); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2787:2: (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==31) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2787:4: otherlv_5= '(' ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )? otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleENamedCustomQuery5689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getENamedCustomQueryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2791:1: ( ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )* )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_ID||LA69_0==47||(LA69_0>=56 && LA69_0<=60)||LA69_0==62) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2791:2: ( (lv_parameters_6_0= ruleEParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )*
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2791:2: ( (lv_parameters_6_0= ruleEParameter ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2792:1: (lv_parameters_6_0= ruleEParameter )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2792:1: (lv_parameters_6_0= ruleEParameter )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2793:3: lv_parameters_6_0= ruleEParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getParametersEParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEParameter_in_ruleENamedCustomQuery5711);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2809:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) ) )*
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==26) ) {
                                    alt68=1;
                                }


                                switch (alt68) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2809:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleEParameter ) )
                            	    {
                            	    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleENamedCustomQuery5724); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_7, grammarAccess.getENamedCustomQueryAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2813:1: ( (lv_parameters_8_0= ruleEParameter ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2814:1: (lv_parameters_8_0= ruleEParameter )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2814:1: (lv_parameters_8_0= ruleEParameter )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2815:3: lv_parameters_8_0= ruleEParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getParametersEParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEParameter_in_ruleENamedCustomQuery5745);
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
                            	    break loop68;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleENamedCustomQuery5761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getENamedCustomQueryAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleENamedCustomQuery5775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getENamedCustomQueryAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2839:1: ( (lv_queries_11_0= ruleECustomQuery ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2840:1: (lv_queries_11_0= ruleECustomQuery )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2840:1: (lv_queries_11_0= ruleECustomQuery )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2841:3: lv_queries_11_0= ruleECustomQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getQueriesECustomQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleECustomQuery_in_ruleENamedCustomQuery5796);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2857:2: (otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==26) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2857:4: otherlv_12= ',' ( (lv_queries_13_0= ruleECustomQuery ) )
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleENamedCustomQuery5809); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getENamedCustomQueryAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2861:1: ( (lv_queries_13_0= ruleECustomQuery ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2862:1: (lv_queries_13_0= ruleECustomQuery )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2862:1: (lv_queries_13_0= ruleECustomQuery )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2863:3: lv_queries_13_0= ruleECustomQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getENamedCustomQueryAccess().getQueriesECustomQueryParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleECustomQuery_in_ruleENamedCustomQuery5830);
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
            	    break loop71;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleENamedCustomQuery5844); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2891:1: entryRuleEReturnType returns [EObject current=null] : iv_ruleEReturnType= ruleEReturnType EOF ;
    public final EObject entryRuleEReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReturnType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2892:2: (iv_ruleEReturnType= ruleEReturnType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2893:2: iv_ruleEReturnType= ruleEReturnType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEReturnTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEReturnType_in_entryRuleEReturnType5880);
            iv_ruleEReturnType=ruleEReturnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEReturnType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEReturnType5890); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2900:1: ruleEReturnType returns [EObject current=null] : (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef ) ;
    public final EObject ruleEReturnType() throws RecognitionException {
        EObject current = null;

        EObject this_EPredefinedType_0 = null;

        EObject this_ETypeDef_1 = null;

        EObject this_EModelTypeDef_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2903:28: ( (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2904:1: (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2904:1: (this_EPredefinedType_0= ruleEPredefinedType | this_ETypeDef_1= ruleETypeDef | this_EModelTypeDef_2= ruleEModelTypeDef )
            int alt72=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt72=1;
                }
                break;
            case 64:
                {
                alt72=2;
                }
                break;
            case 70:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2905:5: this_EPredefinedType_0= ruleEPredefinedType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getEPredefinedTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEPredefinedType_in_ruleEReturnType5937);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2915:5: this_ETypeDef_1= ruleETypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getETypeDefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleETypeDef_in_ruleEReturnType5964);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2925:5: this_EModelTypeDef_2= ruleEModelTypeDef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEReturnTypeAccess().getEModelTypeDefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEModelTypeDef_in_ruleEReturnType5991);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2941:1: entryRuleEPredefinedType returns [EObject current=null] : iv_ruleEPredefinedType= ruleEPredefinedType EOF ;
    public final EObject entryRuleEPredefinedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPredefinedType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2942:2: (iv_ruleEPredefinedType= ruleEPredefinedType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2943:2: iv_ruleEPredefinedType= ruleEPredefinedType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPredefinedTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEPredefinedType_in_entryRuleEPredefinedType6026);
            iv_ruleEPredefinedType=ruleEPredefinedType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPredefinedType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPredefinedType6036); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2950:1: ruleEPredefinedType returns [EObject current=null] : ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) ) ;
    public final EObject ruleEPredefinedType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ref_0_1 = null;

        AntlrDatatypeRuleToken lv_ref_0_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2953:28: ( ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2954:1: ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2954:1: ( ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2955:1: ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2955:1: ( (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2956:1: (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2956:1: (lv_ref_0_1= ruleEMapType | lv_ref_0_2= ruleEPrimtiveType )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==61) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_ID||(LA73_0>=56 && LA73_0<=60)) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2957:3: lv_ref_0_1= ruleEMapType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEPredefinedTypeAccess().getRefEMapTypeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEMapType_in_ruleEPredefinedType6083);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2972:8: lv_ref_0_2= ruleEPrimtiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEPredefinedTypeAccess().getRefEPrimtiveTypeParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEPredefinedType6102);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2998:1: entryRuleETypeDef returns [EObject current=null] : iv_ruleETypeDef= ruleETypeDef EOF ;
    public final EObject entryRuleETypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:2999:2: (iv_ruleETypeDef= ruleETypeDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3000:2: iv_ruleETypeDef= ruleETypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleETypeDef_in_entryRuleETypeDef6140);
            iv_ruleETypeDef=ruleETypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleETypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleETypeDef6150); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3007:1: ruleETypeDef returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3010:28: ( (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3011:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3011:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3011:3: otherlv_0= 'typedef' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '(' ( (lv_types_3_0= ruleEValueTypeAttribute ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleETypeDef6187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getETypeDefAccess().getTypedefKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3015:1: ( (lv_name_1_0= ruleFQN ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3016:1: (lv_name_1_0= ruleFQN )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3016:1: (lv_name_1_0= ruleFQN )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3017:3: lv_name_1_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getETypeDefAccess().getNameFQNParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleETypeDef6208);
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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleETypeDef6220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getETypeDefAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3037:1: ( (lv_types_3_0= ruleEValueTypeAttribute ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3038:1: (lv_types_3_0= ruleEValueTypeAttribute )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3038:1: (lv_types_3_0= ruleEValueTypeAttribute )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3039:3: lv_types_3_0= ruleEValueTypeAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getETypeDefAccess().getTypesEValueTypeAttributeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef6241);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3055:2: (otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==26) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3055:4: otherlv_4= ',' ( (lv_types_5_0= ruleEValueTypeAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleETypeDef6254); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getETypeDefAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3059:1: ( (lv_types_5_0= ruleEValueTypeAttribute ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3060:1: (lv_types_5_0= ruleEValueTypeAttribute )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3060:1: (lv_types_5_0= ruleEValueTypeAttribute )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3061:3: lv_types_5_0= ruleEValueTypeAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getETypeDefAccess().getTypesEValueTypeAttributeParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef6275);
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
            	    break loop74;
                }
            } while (true);

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleETypeDef6289); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3089:1: entryRuleEModelTypeDef returns [EObject current=null] : iv_ruleEModelTypeDef= ruleEModelTypeDef EOF ;
    public final EObject entryRuleEModelTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelTypeDef = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3090:2: (iv_ruleEModelTypeDef= ruleEModelTypeDef EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3091:2: iv_ruleEModelTypeDef= ruleEModelTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEModelTypeDefRule()); 
            }
            pushFollow(FOLLOW_ruleEModelTypeDef_in_entryRuleEModelTypeDef6325);
            iv_ruleEModelTypeDef=ruleEModelTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEModelTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEModelTypeDef6335); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3098:1: ruleEModelTypeDef returns [EObject current=null] : ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3101:28: ( ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3102:1: ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3102:1: ( ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3102:2: ( (lv_eclassDef_0_0= ruleEType ) ) otherlv_1= '(' ( (lv_attributes_2_0= ruleEModelTypeAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )* otherlv_5= ')'
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3102:2: ( (lv_eclassDef_0_0= ruleEType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3103:1: (lv_eclassDef_0_0= ruleEType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3103:1: (lv_eclassDef_0_0= ruleEType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3104:3: lv_eclassDef_0_0= ruleEType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getEclassDefETypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEType_in_ruleEModelTypeDef6381);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleEModelTypeDef6393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEModelTypeDefAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3124:1: ( (lv_attributes_2_0= ruleEModelTypeAttribute ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3125:1: (lv_attributes_2_0= ruleEModelTypeAttribute )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3125:1: (lv_attributes_2_0= ruleEModelTypeAttribute )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3126:3: lv_attributes_2_0= ruleEModelTypeAttribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getAttributesEModelTypeAttributeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef6414);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3142:2: (otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==26) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3142:4: otherlv_3= ',' ( (lv_attributes_4_0= ruleEModelTypeAttribute ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleEModelTypeDef6427); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEModelTypeDefAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3146:1: ( (lv_attributes_4_0= ruleEModelTypeAttribute ) )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3147:1: (lv_attributes_4_0= ruleEModelTypeAttribute )
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3147:1: (lv_attributes_4_0= ruleEModelTypeAttribute )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3148:3: lv_attributes_4_0= ruleEModelTypeAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEModelTypeDefAccess().getAttributesEModelTypeAttributeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef6448);
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
            	    break loop75;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleEModelTypeDef6462); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3176:1: entryRuleEModelTypeAttribute returns [EObject current=null] : iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF ;
    public final EObject entryRuleEModelTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModelTypeAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3177:2: (iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3178:2: iv_ruleEModelTypeAttribute= ruleEModelTypeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEModelTypeAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEModelTypeAttribute_in_entryRuleEModelTypeAttribute6498);
            iv_ruleEModelTypeAttribute=ruleEModelTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEModelTypeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEModelTypeAttribute6508); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3185:1: ruleEModelTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3188:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3189:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3189:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3189:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3189:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3190:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3190:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3191:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute6550); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3207:2: (otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )? )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==51) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3207:4: otherlv_1= 'resolve' ( ( ruleQualifiedName ) ) (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )? ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )?
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleEModelTypeAttribute6568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEModelTypeAttributeAccess().getResolveKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3211:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3212:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3212:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3213:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEModelTypeAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEModelTypeAttributeAccess().getQueryENamedCustomQueryCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEModelTypeAttribute6591);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3226:2: (otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')' )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==31) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3226:4: otherlv_3= '(' ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )? otherlv_7= ')'
                            {
                            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleEModelTypeAttribute6604); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getEModelTypeAttributeAccess().getLeftParenthesisKeyword_1_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3230:1: ( ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* )?
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==RULE_ID) ) {
                                alt77=1;
                            }
                            switch (alt77) {
                                case 1 :
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3230:2: ( (lv_parameters_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3230:2: ( (lv_parameters_4_0= RULE_ID ) )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3231:1: (lv_parameters_4_0= RULE_ID )
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3231:1: (lv_parameters_4_0= RULE_ID )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3232:3: lv_parameters_4_0= RULE_ID
                                    {
                                    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute6622); if (state.failed) return current;
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

                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3248:2: (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
                                    loop76:
                                    do {
                                        int alt76=2;
                                        int LA76_0 = input.LA(1);

                                        if ( (LA76_0==26) ) {
                                            alt76=1;
                                        }


                                        switch (alt76) {
                                    	case 1 :
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3248:4: otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) )
                                    	    {
                                    	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEModelTypeAttribute6640); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_5, grammarAccess.getEModelTypeAttributeAccess().getCommaKeyword_1_2_1_1_0());
                                    	          
                                    	    }
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3252:1: ( (lv_parameters_6_0= RULE_ID ) )
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3253:1: (lv_parameters_6_0= RULE_ID )
                                    	    {
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3253:1: (lv_parameters_6_0= RULE_ID )
                                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3254:3: lv_parameters_6_0= RULE_ID
                                    	    {
                                    	    lv_parameters_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute6657); if (state.failed) return current;
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
                                    	    break loop76;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleEModelTypeAttribute6678); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getEModelTypeAttributeAccess().getRightParenthesisKeyword_1_2_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3274:3: ( ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )? )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==65) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3274:4: ( (lv_cached_8_0= 'cached' ) ) ( (lv_cacheName_9_0= RULE_ID ) )?
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3274:4: ( (lv_cached_8_0= 'cached' ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3275:1: (lv_cached_8_0= 'cached' )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3275:1: (lv_cached_8_0= 'cached' )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3276:3: lv_cached_8_0= 'cached'
                            {
                            lv_cached_8_0=(Token)match(input,65,FOLLOW_65_in_ruleEModelTypeAttribute6699); if (state.failed) return current;
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3289:2: ( (lv_cacheName_9_0= RULE_ID ) )?
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==RULE_ID) ) {
                                alt79=1;
                            }
                            switch (alt79) {
                                case 1 :
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3290:1: (lv_cacheName_9_0= RULE_ID )
                                    {
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3290:1: (lv_cacheName_9_0= RULE_ID )
                                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3291:3: lv_cacheName_9_0= RULE_ID
                                    {
                                    lv_cacheName_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEModelTypeAttribute6729); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3315:1: entryRuleEValueTypeAttribute returns [EObject current=null] : iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF ;
    public final EObject entryRuleEValueTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueTypeAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3316:2: (iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3317:2: iv_ruleEValueTypeAttribute= ruleEValueTypeAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEValueTypeAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEValueTypeAttribute_in_entryRuleEValueTypeAttribute6775);
            iv_ruleEValueTypeAttribute=ruleEValueTypeAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEValueTypeAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEValueTypeAttribute6785); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3324:1: ruleEValueTypeAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEValueTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3327:28: ( ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3328:1: ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3328:1: ( ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3328:2: ( (lv_type_0_0= ruleEPrimtiveType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3328:2: ( (lv_type_0_0= ruleEPrimtiveType ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3329:1: (lv_type_0_0= ruleEPrimtiveType )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3329:1: (lv_type_0_0= ruleEPrimtiveType )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3330:3: lv_type_0_0= ruleEPrimtiveType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEValueTypeAttributeAccess().getTypeEPrimtiveTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEValueTypeAttribute6831);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3346:2: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3347:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3347:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3348:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEValueTypeAttribute6848); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3372:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3373:2: (iv_ruleEParameter= ruleEParameter EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3374:2: iv_ruleEParameter= ruleEParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEParameterRule()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_entryRuleEParameter6889);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEParameter6899); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3381:1: ruleEParameter returns [EObject current=null] : ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3384:28: ( ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3385:1: ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3385:1: ( ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3385:2: ( (lv_id_0_0= 'primarykey' ) )? ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) ) ( (lv_name_5_0= RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3385:2: ( (lv_id_0_0= 'primarykey' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==47) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3386:1: (lv_id_0_0= 'primarykey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3386:1: (lv_id_0_0= 'primarykey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3387:3: lv_id_0_0= 'primarykey'
                    {
                    lv_id_0_0=(Token)match(input,47,FOLLOW_47_in_ruleEParameter6942); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3400:3: ( ( (lv_type_1_0= ruleEPrimtiveType ) ) | ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID||(LA83_0>=56 && LA83_0<=60)) ) {
                alt83=1;
            }
            else if ( (LA83_0==62) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3400:4: ( (lv_type_1_0= ruleEPrimtiveType ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3400:4: ( (lv_type_1_0= ruleEPrimtiveType ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3401:1: (lv_type_1_0= ruleEPrimtiveType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3401:1: (lv_type_1_0= ruleEPrimtiveType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3402:3: lv_type_1_0= ruleEPrimtiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEParameterAccess().getTypeEPrimtiveTypeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEParameter6978);
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3419:6: ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3419:6: ( ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3419:7: ( (lv_list_2_0= '[' ) ) ( (lv_type_3_0= ruleEPrimtiveType ) ) otherlv_4= ']'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3419:7: ( (lv_list_2_0= '[' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3420:1: (lv_list_2_0= '[' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3420:1: (lv_list_2_0= '[' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3421:3: lv_list_2_0= '['
                    {
                    lv_list_2_0=(Token)match(input,62,FOLLOW_62_in_ruleEParameter7003); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3434:2: ( (lv_type_3_0= ruleEPrimtiveType ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3435:1: (lv_type_3_0= ruleEPrimtiveType )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3435:1: (lv_type_3_0= ruleEPrimtiveType )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3436:3: lv_type_3_0= ruleEPrimtiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEParameterAccess().getTypeEPrimtiveTypeParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEPrimtiveType_in_ruleEParameter7037);
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

                    otherlv_4=(Token)match(input,63,FOLLOW_63_in_ruleEParameter7049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getRightSquareBracketKeyword_1_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3456:3: ( (lv_name_5_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3457:1: (lv_name_5_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3457:1: (lv_name_5_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3458:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEParameter7068); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3482:1: entryRuleEQuery returns [EObject current=null] : iv_ruleEQuery= ruleEQuery EOF ;
    public final EObject entryRuleEQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3483:2: (iv_ruleEQuery= ruleEQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3484:2: iv_ruleEQuery= ruleEQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQueryRule()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_entryRuleEQuery7109);
            iv_ruleEQuery=ruleEQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQuery7119); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3491:1: ruleEQuery returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3494:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3495:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3495:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3495:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_mapping_1_0= ruleEObjectSection ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3495:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3496:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3496:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3497:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3497:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==14) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_STRING) ) {
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3498:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,14,FOLLOW_14_in_ruleEQuery7164); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3510:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7192); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3528:2: ( (lv_mapping_1_0= ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3529:1: (lv_mapping_1_0= ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3529:1: (lv_mapping_1_0= ruleEObjectSection )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3530:3: lv_mapping_1_0= ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_ruleEQuery7221);
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3546:2: ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==66) ) {
                alt88=1;
            }
            else if ( (LA88_0==RULE_STRING) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3546:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3546:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3546:5: otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleEQuery7235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3550:1: ( (lv_from_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3551:1: (lv_from_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3551:1: (lv_from_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3552:3: lv_from_3_0= RULE_STRING
                    {
                    lv_from_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7252); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3568:2: (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==67) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3568:4: otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleEQuery7270); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3572:1: ( (lv_where_5_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3573:1: (lv_where_5_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3573:1: (lv_where_5_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3574:3: lv_where_5_0= RULE_STRING
                            {
                            lv_where_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7287); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3590:4: (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==68) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3590:6: otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,68,FOLLOW_68_in_ruleEQuery7307); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3594:1: ( (lv_groupBy_7_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3595:1: (lv_groupBy_7_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3595:1: (lv_groupBy_7_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3596:3: lv_groupBy_7_0= RULE_STRING
                            {
                            lv_groupBy_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7324); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3612:4: (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==69) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3612:6: otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,69,FOLLOW_69_in_ruleEQuery7344); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3616:1: ( (lv_orderby_9_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3617:1: (lv_orderby_9_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3617:1: (lv_orderby_9_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3618:3: lv_orderby_9_0= RULE_STRING
                            {
                            lv_orderby_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7361); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3635:6: ( (lv_all_10_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3635:6: ( (lv_all_10_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3636:1: (lv_all_10_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3636:1: (lv_all_10_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3637:3: lv_all_10_0= RULE_STRING
                    {
                    lv_all_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEQuery7392); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3661:1: entryRuleECustomQuery returns [EObject current=null] : iv_ruleECustomQuery= ruleECustomQuery EOF ;
    public final EObject entryRuleECustomQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECustomQuery = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3662:2: (iv_ruleECustomQuery= ruleECustomQuery EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3663:2: iv_ruleECustomQuery= ruleECustomQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECustomQueryRule()); 
            }
            pushFollow(FOLLOW_ruleECustomQuery_in_entryRuleECustomQuery7434);
            iv_ruleECustomQuery=ruleECustomQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECustomQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECustomQuery7444); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3670:1: ruleECustomQuery returns [EObject current=null] : ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3673:28: ( ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3674:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3674:1: ( ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3674:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) ) ( (lv_columns_1_0= RULE_STRING ) ) ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3674:2: ( ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3675:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3675:1: ( (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3676:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3676:1: (lv_dbType_0_1= 'default' | lv_dbType_0_2= RULE_STRING )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==14) ) {
                alt89=1;
            }
            else if ( (LA89_0==RULE_STRING) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3677:3: lv_dbType_0_1= 'default'
                    {
                    lv_dbType_0_1=(Token)match(input,14,FOLLOW_14_in_ruleECustomQuery7489); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3689:8: lv_dbType_0_2= RULE_STRING
                    {
                    lv_dbType_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery7517); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3707:2: ( (lv_columns_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3708:1: (lv_columns_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3708:1: (lv_columns_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3709:3: lv_columns_1_0= RULE_STRING
            {
            lv_columns_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery7542); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3725:2: ( (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? ) | ( (lv_all_10_0= RULE_STRING ) ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==66) ) {
                alt93=1;
            }
            else if ( (LA93_0==RULE_STRING) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3725:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3725:3: (otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )? )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3725:5: otherlv_2= 'FROM' ( (lv_from_3_0= RULE_STRING ) ) (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )? (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )? (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleECustomQuery7561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getECustomQueryAccess().getFROMKeyword_2_0_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3729:1: ( (lv_from_3_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3730:1: (lv_from_3_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3730:1: (lv_from_3_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3731:3: lv_from_3_0= RULE_STRING
                    {
                    lv_from_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery7578); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3747:2: (otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==67) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3747:4: otherlv_4= 'WHERE' ( (lv_where_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleECustomQuery7596); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getECustomQueryAccess().getWHEREKeyword_2_0_2_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3751:1: ( (lv_where_5_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3752:1: (lv_where_5_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3752:1: (lv_where_5_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3753:3: lv_where_5_0= RULE_STRING
                            {
                            lv_where_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery7613); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3769:4: (otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==68) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3769:6: otherlv_6= 'GROUP BY' ( (lv_groupBy_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,68,FOLLOW_68_in_ruleECustomQuery7633); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getECustomQueryAccess().getGROUPBYKeyword_2_0_3_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3773:1: ( (lv_groupBy_7_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3774:1: (lv_groupBy_7_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3774:1: (lv_groupBy_7_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3775:3: lv_groupBy_7_0= RULE_STRING
                            {
                            lv_groupBy_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery7650); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3791:4: (otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) ) )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==69) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3791:6: otherlv_8= 'ORDER BY' ( (lv_orderby_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,69,FOLLOW_69_in_ruleECustomQuery7670); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getECustomQueryAccess().getORDERBYKeyword_2_0_4_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3795:1: ( (lv_orderby_9_0= RULE_STRING ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3796:1: (lv_orderby_9_0= RULE_STRING )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3796:1: (lv_orderby_9_0= RULE_STRING )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3797:3: lv_orderby_9_0= RULE_STRING
                            {
                            lv_orderby_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery7687); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3814:6: ( (lv_all_10_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3814:6: ( (lv_all_10_0= RULE_STRING ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3815:1: (lv_all_10_0= RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3815:1: (lv_all_10_0= RULE_STRING )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3816:3: lv_all_10_0= RULE_STRING
                    {
                    lv_all_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleECustomQuery7718); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3840:1: entryRuleEObjectSection returns [EObject current=null] : iv_ruleEObjectSection= ruleEObjectSection EOF ;
    public final EObject entryRuleEObjectSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectSection = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3841:2: (iv_ruleEObjectSection= ruleEObjectSection EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3842:2: iv_ruleEObjectSection= ruleEObjectSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEObjectSectionRule()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection7760);
            iv_ruleEObjectSection=ruleEObjectSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEObjectSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEObjectSection7770); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3849:1: ruleEObjectSection returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3852:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3853:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3853:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )? )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3853:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )? ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )?
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3853:2: ( (otherlv_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3854:1: (otherlv_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3854:1: (otherlv_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3855:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEObjectSectionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection7815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
              	
            }

            }


            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3866:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==31) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3866:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleEObjectSection7828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEObjectSectionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3870:1: ( (otherlv_2= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3871:1: (otherlv_2= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3871:1: (otherlv_2= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3872:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection7848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3883:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+
                    int cnt94=0;
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==26) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3883:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleEObjectSection7861); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3887:1: ( (otherlv_4= RULE_ID ) )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3888:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3888:1: (otherlv_4= RULE_ID )
                    	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3889:3: otherlv_4= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEObjectSectionRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection7881); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_4, grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt94 >= 1 ) break loop94;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(94, input);
                                throw eee;
                        }
                        cnt94++;
                    } while (true);

                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleEObjectSection7895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEObjectSectionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3904:3: ( ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )? )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ID) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3904:4: ( (lv_prefix_6_0= RULE_ID ) ) (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )?
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3904:4: ( (lv_prefix_6_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3905:1: (lv_prefix_6_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3905:1: (lv_prefix_6_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3906:3: lv_prefix_6_0= RULE_ID
                    {
                    lv_prefix_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEObjectSection7915); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3922:2: (otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}' )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==12) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3922:4: otherlv_7= '{' ( (lv_attributes_8_0= ruleEMappingAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )* otherlv_11= '}'
                            {
                            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleEObjectSection7933); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_2_1_0());
                                  
                            }
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3926:1: ( (lv_attributes_8_0= ruleEMappingAttribute ) )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3927:1: (lv_attributes_8_0= ruleEMappingAttribute )
                            {
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3927:1: (lv_attributes_8_0= ruleEMappingAttribute )
                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3928:3: lv_attributes_8_0= ruleEMappingAttribute
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection7954);
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

                            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3944:2: (otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) ) )*
                            loop96:
                            do {
                                int alt96=2;
                                int LA96_0 = input.LA(1);

                                if ( (LA96_0==26) ) {
                                    alt96=1;
                                }


                                switch (alt96) {
                            	case 1 :
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3944:4: otherlv_9= ',' ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            	    {
                            	    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleEObjectSection7967); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getEObjectSectionAccess().getCommaKeyword_2_1_2_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3948:1: ( (lv_attributes_10_0= ruleEMappingAttribute ) )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3949:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            	    {
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3949:1: (lv_attributes_10_0= ruleEMappingAttribute )
                            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3950:3: lv_attributes_10_0= ruleEMappingAttribute
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection7988);
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
                            	    break loop96;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleEObjectSection8002); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3978:1: entryRuleEMappingAttribute returns [EObject current=null] : iv_ruleEMappingAttribute= ruleEMappingAttribute EOF ;
    public final EObject entryRuleEMappingAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMappingAttribute = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3979:2: (iv_ruleEMappingAttribute= ruleEMappingAttribute EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3980:2: iv_ruleEMappingAttribute= ruleEMappingAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMappingAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute8042);
            iv_ruleEMappingAttribute=ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMappingAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingAttribute8052); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3987:1: ruleEMappingAttribute returns [EObject current=null] : ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) ;
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
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3990:28: ( ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3991:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3991:1: ( ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3991:2: ( (lv_pk_0_0= 'primarykey' ) )? ( (lv_property_1_0= ruleQualifiedName ) ) otherlv_2= '=>' ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3991:2: ( (lv_pk_0_0= 'primarykey' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==47) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3992:1: (lv_pk_0_0= 'primarykey' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3992:1: (lv_pk_0_0= 'primarykey' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:3993:3: lv_pk_0_0= 'primarykey'
                    {
                    lv_pk_0_0=(Token)match(input,47,FOLLOW_47_in_ruleEMappingAttribute8095); if (state.failed) return current;
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

            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4006:3: ( (lv_property_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4007:1: (lv_property_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4007:1: (lv_property_1_0= ruleQualifiedName )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4008:3: lv_property_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute8130);
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

            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleEMappingAttribute8142); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4028:1: ( ( (lv_columnName_3_0= RULE_ID ) ) | ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) ) )
            int alt100=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt100=1;
                }
                break;
            case 51:
                {
                alt100=2;
                }
                break;
            case 61:
                {
                alt100=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4028:2: ( (lv_columnName_3_0= RULE_ID ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4028:2: ( (lv_columnName_3_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4029:1: (lv_columnName_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4029:1: (lv_columnName_3_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4030:3: lv_columnName_3_0= RULE_ID
                    {
                    lv_columnName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingAttribute8160); if (state.failed) return current;
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
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4047:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4047:6: ( ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4047:7: ( (lv_resolved_4_0= 'resolve' ) ) ( ( ruleQualifiedName ) ) otherlv_6= '(' ( (lv_parameters_7_0= RULE_ID ) ) otherlv_8= ')'
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4047:7: ( (lv_resolved_4_0= 'resolve' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4048:1: (lv_resolved_4_0= 'resolve' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4048:1: (lv_resolved_4_0= 'resolve' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4049:3: lv_resolved_4_0= 'resolve'
                    {
                    lv_resolved_4_0=(Token)match(input,51,FOLLOW_51_in_ruleEMappingAttribute8190); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4062:2: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4063:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4063:1: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4064:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEMappingAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute8226);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEMappingAttribute8238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2());
                          
                    }
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4081:1: ( (lv_parameters_7_0= RULE_ID ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4082:1: (lv_parameters_7_0= RULE_ID )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4082:1: (lv_parameters_7_0= RULE_ID )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4083:3: lv_parameters_7_0= RULE_ID
                    {
                    lv_parameters_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEMappingAttribute8255); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleEMappingAttribute8272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4104:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4104:6: ( ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4104:7: ( (lv_mapped_9_0= 'map' ) ) ( (lv_map_10_0= ruleEObjectSection ) )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4104:7: ( (lv_mapped_9_0= 'map' ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4105:1: (lv_mapped_9_0= 'map' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4105:1: (lv_mapped_9_0= 'map' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4106:3: lv_mapped_9_0= 'map'
                    {
                    lv_mapped_9_0=(Token)match(input,61,FOLLOW_61_in_ruleEMappingAttribute8298); if (state.failed) return current;
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

                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4119:2: ( (lv_map_10_0= ruleEObjectSection ) )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4120:1: (lv_map_10_0= ruleEObjectSection )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4120:1: (lv_map_10_0= ruleEObjectSection )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4121:3: lv_map_10_0= ruleEObjectSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEObjectSection_in_ruleEMappingAttribute8332);
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4145:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4146:2: (iv_ruleEType= ruleEType EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4147:2: iv_ruleEType= ruleEType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETypeRule()); 
            }
            pushFollow(FOLLOW_ruleEType_in_entryRuleEType8370);
            iv_ruleEType=ruleEType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEType8380); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4154:1: ruleEType returns [EObject current=null] : (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4157:28: ( (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4158:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4158:1: (otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4158:3: otherlv_0= 'etype' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleEType8417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getEtypeKeyword_0());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4162:1: ( (lv_url_1_0= RULE_STRING ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4163:1: (lv_url_1_0= RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4163:1: (lv_url_1_0= RULE_STRING )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4164:3: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEType8434); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleEType8451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getETypeAccess().getNumberSignKeyword_2());
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4184:1: ( (lv_name_3_0= RULE_ID ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4185:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4185:1: (lv_name_3_0= RULE_ID )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4186:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEType8468); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4210:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4211:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4212:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8510);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName8521); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4219:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4222:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4223:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4223:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4223:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4230:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==40) ) {
                    int LA101_2 = input.LA(2);

                    if ( (LA101_2==RULE_ID) && (synpred2_InternalEMap())) {
                        alt101=1;
                    }


                }


                switch (alt101) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4230:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4230:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4230:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedName8589); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8605); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop101;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4253:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4254:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4255:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard8653);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard8664); if (state.failed) return current;

            }

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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4262:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4265:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4266:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4266:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4267:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8711);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedNameWithWildcard8729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,72,FOLLOW_72_in_ruleQualifiedNameWithWildcard8742); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4297:1: ruleColSort returns [Enumerator current=null] : ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) ) ;
    public final Enumerator ruleColSort() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4299:28: ( ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4300:1: ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4300:1: ( (enumLiteral_0= 'EMAP' ) | (enumLiteral_1= 'ECORE' ) | (enumLiteral_2= 'ECORE_REVERSED' ) | (enumLiteral_3= 'ALPHABETIC' ) )
            int alt102=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt102=1;
                }
                break;
            case 74:
                {
                alt102=2;
                }
                break;
            case 75:
                {
                alt102=3;
                }
                break;
            case 76:
                {
                alt102=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4300:2: (enumLiteral_0= 'EMAP' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4300:2: (enumLiteral_0= 'EMAP' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4300:4: enumLiteral_0= 'EMAP'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleColSort8796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColSortAccess().getEMAPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColSortAccess().getEMAPEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4306:6: (enumLiteral_1= 'ECORE' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4306:6: (enumLiteral_1= 'ECORE' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4306:8: enumLiteral_1= 'ECORE'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleColSort8813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColSortAccess().getECOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColSortAccess().getECOREEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4312:6: (enumLiteral_2= 'ECORE_REVERSED' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4312:6: (enumLiteral_2= 'ECORE_REVERSED' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4312:8: enumLiteral_2= 'ECORE_REVERSED'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_75_in_ruleColSort8830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColSortAccess().getECORE_REVERSEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColSortAccess().getECORE_REVERSEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4318:6: (enumLiteral_3= 'ALPHABETIC' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4318:6: (enumLiteral_3= 'ALPHABETIC' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4318:8: enumLiteral_3= 'ALPHABETIC'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_76_in_ruleColSort8847); if (state.failed) return current;
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
    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4328:1: ruleReturnType returns [Enumerator current=null] : ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) ;
    public final Enumerator ruleReturnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4330:28: ( ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) ) )
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4331:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            {
            // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4331:1: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'single' ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==13) ) {
                alt103=1;
            }
            else if ( (LA103_0==77) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4331:2: (enumLiteral_0= 'list' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4331:2: (enumLiteral_0= 'list' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4331:4: enumLiteral_0= 'list'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_13_in_ruleReturnType8892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4337:6: (enumLiteral_1= 'single' )
                    {
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4337:6: (enumLiteral_1= 'single' )
                    // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4337:8: enumLiteral_1= 'single'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleReturnType8909); if (state.failed) return current;
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
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1733:3: ( '.' )
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:1734:2: '.'
        {
        match(input,40,FOLLOW_40_in_synpred1_InternalEMap3535); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEMap

    // $ANTLR start synpred2_InternalEMap
    public final void synpred2_InternalEMap_fragment() throws RecognitionException {   
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4230:3: ( '.' )
        // ../at.bestsolution.persistence.emap/src-gen/at/bestsolution/persistence/emap/parser/antlr/internal/InternalEMap.g:4231:2: '.'
        {
        match(input,40,FOLLOW_40_in_synpred2_InternalEMap8580); if (state.failed) return ;

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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA1_eotS =
        "\11\uffff";
    static final String DFA1_eofS =
        "\11\uffff";
    static final String DFA1_minS =
        "\1\30\1\uffff\1\4\1\47\1\4\1\13\1\47\2\uffff";
    static final String DFA1_maxS =
        "\1\46\1\uffff\1\4\1\50\1\4\1\52\1\50\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\1\3";
    static final String DFA1_specialS =
        "\11\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\14\uffff\1\1\1\2",
            "",
            "\1\3",
            "\1\5\1\4",
            "\1\6",
            "\1\10\31\uffff\1\7\3\uffff\2\7",
            "\1\5\1\4",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "83:1: (lv_root_0_1= ruleEMappingBundle | lv_root_0_2= ruleEMappingEntityDef | lv_root_0_3= ruleEServiceMapping )";
        }
    }
    static final String DFA39_eotS =
        "\6\uffff";
    static final String DFA39_eofS =
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA39_minS =
        "\1\4\1\30\1\4\2\uffff\1\30";
    static final String DFA39_maxS =
        "\1\4\1\52\1\110\2\uffff\1\52";
    static final String DFA39_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA39_specialS =
        "\6\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1",
            "\1\3\14\uffff\1\3\2\uffff\1\2\2\3",
            "\1\5\103\uffff\1\4",
            "",
            "",
            "\1\3\14\uffff\1\3\2\uffff\1\2\2\3"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "1624:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )";
        }
    }
 

    public static final BitSet FOLLOW_ruleEMapping_in_entryRuleEMapping75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMapping85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingBundle_in_ruleEMapping132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntityDef_in_ruleEMapping151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEServiceMapping_in_ruleEMapping170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEServiceMapping_in_entryRuleEServiceMapping208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEServiceMapping218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleEServiceMapping264 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEServiceMapping276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEServiceMapping296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEServiceMapping308 = new BitSet(new long[]{0x00000000000FA010L});
    public static final BitSet FOLLOW_13_in_ruleEServiceMapping327 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleEServiceMapping353 = new BitSet(new long[]{0x00000000000F8010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEServiceMapping379 = new BitSet(new long[]{0x00000000000F8010L});
    public static final BitSet FOLLOW_15_in_ruleEServiceMapping401 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleEServiceMapping427 = new BitSet(new long[]{0x00000000000F0010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEServiceMapping453 = new BitSet(new long[]{0x00000000000F0010L});
    public static final BitSet FOLLOW_16_in_ruleEServiceMapping475 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEServiceMapping500 = new BitSet(new long[]{0x00000000000E0010L});
    public static final BitSet FOLLOW_17_in_ruleEServiceMapping521 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEServiceMapping546 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_18_in_ruleEServiceMapping567 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEServiceMapping592 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleENamedServiceQuery_in_ruleEServiceMapping615 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleEServiceMapping628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedServiceQuery_in_entryRuleENamedServiceQuery664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedServiceQuery674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleENamedServiceQuery722 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleENamedServiceQuery734 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleENamedServiceQuery751 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleENamedServiceQuery769 = new BitSet(new long[]{0x0000000000A80000L});
    public static final BitSet FOLLOW_ruleEServiceParam_in_ruleENamedServiceQuery790 = new BitSet(new long[]{0x0000000000A80000L});
    public static final BitSet FOLLOW_19_in_ruleENamedServiceQuery803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEServiceParam_in_entryRuleEServiceParam841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEServiceParam851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPathParam_in_ruleEServiceParam898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQueryParam_in_ruleEServiceParam925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPathParam_in_entryRuleEPathParam960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPathParam970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEPathParam1007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEPathParam1030 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleEPathParam1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEPathParam1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQueryParam_in_entryRuleEQueryParam1103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQueryParam1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEQueryParam1150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEQueryParam1173 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleEQueryParam1186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEQueryParam1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingBundle_in_entryRuleEMappingBundle1246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingBundle1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleEMappingBundle1302 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_24_in_ruleEMappingBundle1315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingBundle1332 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_25_in_ruleEMappingBundle1350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingBundle1373 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingBundle1387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEBundleEntity_in_ruleEMappingBundle1408 = new BitSet(new long[]{0x0000000804080000L});
    public static final BitSet FOLLOW_26_in_ruleEMappingBundle1421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEBundleEntity_in_ruleEMappingBundle1442 = new BitSet(new long[]{0x0000000804080000L});
    public static final BitSet FOLLOW_ruleESQLTypeDef_in_ruleEMappingBundle1465 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_19_in_ruleEMappingBundle1478 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_27_in_ruleEMappingBundle1491 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEMappingBundle1508 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_26_in_ruleEMappingBundle1526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEMappingBundle1543 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_28_in_ruleEMappingBundle1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleColSort_in_ruleEMappingBundle1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBundleEntity_in_entryRuleEBundleEntity1624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBundleEntity1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEBundleEntity1679 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleEBundleEntity1692 = new BitSet(new long[]{0x0000000E60080000L});
    public static final BitSet FOLLOW_29_in_ruleEBundleEntity1705 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEBundleEntity1722 = new BitSet(new long[]{0x0000000E40080000L});
    public static final BitSet FOLLOW_ruleEFkConstraint_in_ruleEBundleEntity1751 = new BitSet(new long[]{0x0000000C44080000L});
    public static final BitSet FOLLOW_26_in_ruleEBundleEntity1764 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleEFkConstraint_in_ruleEBundleEntity1785 = new BitSet(new long[]{0x0000000C44080000L});
    public static final BitSet FOLLOW_ruleEUniqueConstraint_in_ruleEBundleEntity1811 = new BitSet(new long[]{0x0000000844080000L});
    public static final BitSet FOLLOW_26_in_ruleEBundleEntity1824 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleEUniqueConstraint_in_ruleEBundleEntity1845 = new BitSet(new long[]{0x0000000844080000L});
    public static final BitSet FOLLOW_ruleEIndex_in_ruleEBundleEntity1871 = new BitSet(new long[]{0x0000000804080000L});
    public static final BitSet FOLLOW_26_in_ruleEBundleEntity1884 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleEIndex_in_ruleEBundleEntity1905 = new BitSet(new long[]{0x0000000804080000L});
    public static final BitSet FOLLOW_ruleESQLAttTypeDef_in_ruleEBundleEntity1931 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleEBundleEntity1944 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleESQLAttTypeDef_in_ruleEBundleEntity1965 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleEBundleEntity1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIndex_in_entryRuleEIndex2019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIndex2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEIndex2066 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEIndex2083 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEIndex2100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEIndex2123 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_26_in_ruleEIndex2136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEIndex2159 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_32_in_ruleEIndex2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFkConstraint_in_entryRuleEFkConstraint2209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFkConstraint2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEFkConstraint2256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEFkConstraint2279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEFkConstraint2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEUniqueConstraint_in_entryRuleEUniqueConstraint2337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEUniqueConstraint2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEUniqueConstraint2384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEUniqueConstraint2401 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEUniqueConstraint2418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEUniqueConstraint2441 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_26_in_ruleEUniqueConstraint2454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEUniqueConstraint2477 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_32_in_ruleEUniqueConstraint2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleESQLAttTypeDef_in_entryRuleESQLAttTypeDef2527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleESQLAttTypeDef2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleESQLAttTypeDef2574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleESQLAttTypeDef2597 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleESQLAttTypeDef2609 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleESQLDbType_in_ruleESQLAttTypeDef2630 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleESQLAttTypeDef2643 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleESQLDbType_in_ruleESQLAttTypeDef2664 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleESQLAttTypeDef2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleESQLTypeDef_in_entryRuleESQLTypeDef2714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleESQLTypeDef2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleESQLTypeDef2761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEType_in_ruleESQLTypeDef2782 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleESQLTypeDef2794 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleESQLDbType_in_ruleESQLTypeDef2815 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleESQLTypeDef2828 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleESQLDbType_in_ruleESQLTypeDef2849 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleESQLTypeDef2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleESQLDbType_in_entryRuleESQLDbType2899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleESQLDbType2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleESQLDbType2954 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleESQLDbType2982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleESQLDbType3007 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleESQLDbType3025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleESQLDbType3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntityDef_in_entryRuleEMappingEntityDef3085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingEntityDef3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleEMappingEntityDef3141 = new BitSet(new long[]{0x0000062001000000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleEMappingEntityDef3162 = new BitSet(new long[]{0x0000062001000000L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_ruleEMappingEntityDef3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport3220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleImport3267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration3348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePackageDeclaration3395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration3416 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePackageDeclaration3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3516 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleFQN3544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3560 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_entryRuleEMappingEntity3607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingEntity3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleEMappingEntity3660 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEMappingEntity3686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity3703 = new BitSet(new long[]{0x0000080002001000L});
    public static final BitSet FOLLOW_25_in_ruleEMappingEntity3729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_43_in_ruleEMappingEntity3758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingEntity3797 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity3811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEType_in_ruleEMappingEntity3832 = new BitSet(new long[]{0x0000300000080000L});
    public static final BitSet FOLLOW_44_in_ruleEMappingEntity3845 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity3857 = new BitSet(new long[]{0x0001800000000010L});
    public static final BitSet FOLLOW_ruleEAttribute_in_ruleEMappingEntity3878 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleEMappingEntity3891 = new BitSet(new long[]{0x0001800000000010L});
    public static final BitSet FOLLOW_ruleEAttribute_in_ruleEMappingEntity3912 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleEMappingEntity3926 = new BitSet(new long[]{0x0000200000080000L});
    public static final BitSet FOLLOW_45_in_ruleEMappingEntity3941 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEMappingEntity3953 = new BitSet(new long[]{0x7F00000000002010L,0x0000000000002041L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_ruleEMappingEntity3975 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity4002 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleEMappingEntity4016 = new BitSet(new long[]{0x7F00000000002010L,0x0000000000002041L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_ruleEMappingEntity4038 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_ruleENamedCustomQuery_in_ruleEMappingEntity4065 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleEMappingEntity4080 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEMappingEntity4094 = new BitSet(new long[]{0x0000400000100002L});
    public static final BitSet FOLLOW_20_in_ruleEMappingEntity4107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity4124 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleEMappingEntity4144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingEntity4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_entryRuleEAttribute4204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttribute4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEAttribute4258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_48_in_ruleEAttribute4296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute4327 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleEAttribute4344 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute4363 = new BitSet(new long[]{0x0004001000000002L});
    public static final BitSet FOLLOW_50_in_ruleEAttribute4381 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEAttribute4393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_ruleEAttribute4414 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleEAttribute4427 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_ruleEAttribute4448 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleEAttribute4462 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_51_in_ruleEAttribute4490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEAttribute4526 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEAttribute4538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute4555 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEAttribute4572 = new BitSet(new long[]{0x0000001000000012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEAttribute4596 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleEAttribute4608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute4625 = new BitSet(new long[]{0x0000011000000002L});
    public static final BitSet FOLLOW_40_in_ruleEAttribute4643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEAttribute4660 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleEAttribute4684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEAttribute4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator4744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEValueGenerator4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator4796 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_53_in_ruleEValueGenerator4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEValueGenerator4852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEValueGenerator4894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEValueGenerator4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery4954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedQuery4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleENamedQuery5010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleENamedQuery5028 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_31_in_ruleENamedQuery5046 = new BitSet(new long[]{0x7F00800100000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedQuery5068 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_26_in_ruleENamedQuery5081 = new BitSet(new long[]{0x7F00800000000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedQuery5102 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_32_in_ruleENamedQuery5118 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleENamedQuery5132 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleEQuery_in_ruleENamedQuery5153 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleENamedQuery5166 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleEQuery_in_ruleENamedQuery5187 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleENamedQuery5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_entryRuleEPrimtiveType5238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPrimtiveType5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEPrimtiveType5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEPrimtiveType5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEPrimtiveType5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEPrimtiveType5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEPrimtiveType5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEPrimtiveType5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMapType_in_entryRuleEMapType5437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMapType5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEMapType5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedCustomQuery_in_entryRuleENamedCustomQuery5524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedCustomQuery5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery5581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_62_in_ruleENamedCustomQuery5606 = new BitSet(new long[]{0x3F00000000000010L,0x0000000000000041L});
    public static final BitSet FOLLOW_ruleEReturnType_in_ruleENamedCustomQuery5640 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleENamedCustomQuery5652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleENamedCustomQuery5671 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_31_in_ruleENamedCustomQuery5689 = new BitSet(new long[]{0x7F00800100000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedCustomQuery5711 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_26_in_ruleENamedCustomQuery5724 = new BitSet(new long[]{0x7F00800000000010L});
    public static final BitSet FOLLOW_ruleEParameter_in_ruleENamedCustomQuery5745 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_32_in_ruleENamedCustomQuery5761 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleENamedCustomQuery5775 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleECustomQuery_in_ruleENamedCustomQuery5796 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleENamedCustomQuery5809 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleECustomQuery_in_ruleENamedCustomQuery5830 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleENamedCustomQuery5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEReturnType_in_entryRuleEReturnType5880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEReturnType5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPredefinedType_in_ruleEReturnType5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETypeDef_in_ruleEReturnType5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEModelTypeDef_in_ruleEReturnType5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPredefinedType_in_entryRuleEPredefinedType6026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPredefinedType6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMapType_in_ruleEPredefinedType6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEPredefinedType6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETypeDef_in_entryRuleETypeDef6140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETypeDef6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleETypeDef6187 = new BitSet(new long[]{0x3F00000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleETypeDef6208 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleETypeDef6220 = new BitSet(new long[]{0x3F00000000000010L});
    public static final BitSet FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef6241 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_26_in_ruleETypeDef6254 = new BitSet(new long[]{0x3F00000000000010L});
    public static final BitSet FOLLOW_ruleEValueTypeAttribute_in_ruleETypeDef6275 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_32_in_ruleETypeDef6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEModelTypeDef_in_entryRuleEModelTypeDef6325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEModelTypeDef6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_ruleEModelTypeDef6381 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEModelTypeDef6393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef6414 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_26_in_ruleEModelTypeDef6427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEModelTypeAttribute_in_ruleEModelTypeDef6448 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_32_in_ruleEModelTypeDef6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEModelTypeAttribute_in_entryRuleEModelTypeAttribute6498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEModelTypeAttribute6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute6550 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEModelTypeAttribute6568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEModelTypeAttribute6591 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEModelTypeAttribute6604 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute6622 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_26_in_ruleEModelTypeAttribute6640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute6657 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_32_in_ruleEModelTypeAttribute6678 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleEModelTypeAttribute6699 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEModelTypeAttribute6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueTypeAttribute_in_entryRuleEValueTypeAttribute6775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEValueTypeAttribute6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEValueTypeAttribute6831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEValueTypeAttribute6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_entryRuleEParameter6889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEParameter6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEParameter6942 = new BitSet(new long[]{0x7F00000000000010L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEParameter6978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_62_in_ruleEParameter7003 = new BitSet(new long[]{0x3F00000000000010L});
    public static final BitSet FOLLOW_ruleEPrimtiveType_in_ruleEParameter7037 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleEParameter7049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEParameter7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_entryRuleEQuery7109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQuery7119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEQuery7164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_ruleEQuery7221 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleEQuery7235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7252 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_67_in_ruleEQuery7270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7287 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleEQuery7307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7324 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleEQuery7344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEQuery7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECustomQuery_in_entryRuleECustomQuery7434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECustomQuery7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleECustomQuery7489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery7517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery7542 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleECustomQuery7561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery7578 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_67_in_ruleECustomQuery7596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery7613 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleECustomQuery7633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery7650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleECustomQuery7670 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleECustomQuery7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection7760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEObjectSection7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection7815 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_31_in_ruleEObjectSection7828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection7848 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEObjectSection7861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection7881 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_32_in_ruleEObjectSection7895 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEObjectSection7915 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleEObjectSection7933 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection7954 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleEObjectSection7967 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_ruleEObjectSection7988 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19_in_ruleEObjectSection8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute8042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingAttribute8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEMappingAttribute8095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute8130 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleEMappingAttribute8142 = new BitSet(new long[]{0x2008000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingAttribute8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEMappingAttribute8190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEMappingAttribute8226 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEMappingAttribute8238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEMappingAttribute8255 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEMappingAttribute8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEMappingAttribute8298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_ruleEMappingAttribute8332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_entryRuleEType8370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEType8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleEType8417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEType8434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleEType8451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEType8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8561 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedName8589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8605 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard8653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8711 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedNameWithWildcard8729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleQualifiedNameWithWildcard8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleColSort8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleColSort8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleColSort8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleColSort8847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleReturnType8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleReturnType8909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred1_InternalEMap3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred2_InternalEMap8580 = new BitSet(new long[]{0x0000000000000002L});

}