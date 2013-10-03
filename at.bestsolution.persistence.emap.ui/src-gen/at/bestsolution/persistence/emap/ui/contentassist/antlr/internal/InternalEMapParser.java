package at.bestsolution.persistence.emap.ui.contentassist.antlr.internal; 

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
import at.bestsolution.persistence.emap.services.EMapGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEMapParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'extends'", "'derived'", "'default'", "'list'", "'single'", "'bundle'", "'{'", "'}'", "','", "'import'", "'package'", "';'", "'entity'", "'attributes'", "'queries'", "'as'", "'=>'", "'keygen'", "'query'", "'seq'", "'('", "')'", "'FROM'", "'WHERE'", "'GROUP BY'", "'ORDER BY'", "'etype'", "'#'", "'.'", "'*'", "'abstract'", "'primarykey'", "'auto'", "'resolve'", "'map'"
    };
    public static final int RULE_ID=5;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g"; }


     
     	private EMapGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EMapGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEMapping"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:61:1: entryRuleEMapping : ruleEMapping EOF ;
    public final void entryRuleEMapping() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:62:1: ( ruleEMapping EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:63:1: ruleEMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingRule()); 
            }
            pushFollow(FOLLOW_ruleEMapping_in_entryRuleEMapping67);
            ruleEMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMapping74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEMapping"


    // $ANTLR start "ruleEMapping"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:70:1: ruleEMapping : ( ( rule__EMapping__RootAssignment ) ) ;
    public final void ruleEMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:74:2: ( ( ( rule__EMapping__RootAssignment ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:75:1: ( ( rule__EMapping__RootAssignment ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:75:1: ( ( rule__EMapping__RootAssignment ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:76:1: ( rule__EMapping__RootAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAccess().getRootAssignment()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:77:1: ( rule__EMapping__RootAssignment )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:77:2: rule__EMapping__RootAssignment
            {
            pushFollow(FOLLOW_rule__EMapping__RootAssignment_in_ruleEMapping100);
            rule__EMapping__RootAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAccess().getRootAssignment()); 
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
    // $ANTLR end "ruleEMapping"


    // $ANTLR start "entryRuleEMappingBundle"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:89:1: entryRuleEMappingBundle : ruleEMappingBundle EOF ;
    public final void entryRuleEMappingBundle() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:90:1: ( ruleEMappingBundle EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:91:1: ruleEMappingBundle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingBundle_in_entryRuleEMappingBundle127);
            ruleEMappingBundle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingBundle134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEMappingBundle"


    // $ANTLR start "ruleEMappingBundle"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:98:1: ruleEMappingBundle : ( ( rule__EMappingBundle__Group__0 ) ) ;
    public final void ruleEMappingBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:102:2: ( ( ( rule__EMappingBundle__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:103:1: ( ( rule__EMappingBundle__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:103:1: ( ( rule__EMappingBundle__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:104:1: ( rule__EMappingBundle__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:105:1: ( rule__EMappingBundle__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:105:2: rule__EMappingBundle__Group__0
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__0_in_ruleEMappingBundle160);
            rule__EMappingBundle__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getGroup()); 
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
    // $ANTLR end "ruleEMappingBundle"


    // $ANTLR start "entryRuleEMappingEntityDef"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:117:1: entryRuleEMappingEntityDef : ruleEMappingEntityDef EOF ;
    public final void entryRuleEMappingEntityDef() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:118:1: ( ruleEMappingEntityDef EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:119:1: ruleEMappingEntityDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntityDef_in_entryRuleEMappingEntityDef187);
            ruleEMappingEntityDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityDefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingEntityDef194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEMappingEntityDef"


    // $ANTLR start "ruleEMappingEntityDef"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:126:1: ruleEMappingEntityDef : ( ( rule__EMappingEntityDef__Group__0 ) ) ;
    public final void ruleEMappingEntityDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:130:2: ( ( ( rule__EMappingEntityDef__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:131:1: ( ( rule__EMappingEntityDef__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:131:1: ( ( rule__EMappingEntityDef__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:132:1: ( rule__EMappingEntityDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:133:1: ( rule__EMappingEntityDef__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:133:2: rule__EMappingEntityDef__Group__0
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__0_in_ruleEMappingEntityDef220);
            rule__EMappingEntityDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityDefAccess().getGroup()); 
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
    // $ANTLR end "ruleEMappingEntityDef"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:145:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:146:1: ( ruleImport EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:147:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport247);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:154:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:158:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:159:1: ( ( rule__Import__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:159:1: ( ( rule__Import__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:160:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:161:1: ( rule__Import__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:161:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport280);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:173:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:174:1: ( rulePackageDeclaration EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:175:1: rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration307);
            rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration314); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:182:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:186:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:187:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:187:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:188:1: ( rule__PackageDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:189:1: ( rule__PackageDeclaration__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:189:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration340);
            rule__PackageDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getGroup()); 
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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleEMappingEntity"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:201:1: entryRuleEMappingEntity : ruleEMappingEntity EOF ;
    public final void entryRuleEMappingEntity() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:202:1: ( ruleEMappingEntity EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:203:1: ruleEMappingEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_entryRuleEMappingEntity367);
            ruleEMappingEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingEntity374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEMappingEntity"


    // $ANTLR start "ruleEMappingEntity"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:210:1: ruleEMappingEntity : ( ( rule__EMappingEntity__Group__0 ) ) ;
    public final void ruleEMappingEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:214:2: ( ( ( rule__EMappingEntity__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:215:1: ( ( rule__EMappingEntity__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:215:1: ( ( rule__EMappingEntity__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:216:1: ( rule__EMappingEntity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:217:1: ( rule__EMappingEntity__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:217:2: rule__EMappingEntity__Group__0
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__0_in_ruleEMappingEntity400);
            rule__EMappingEntity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup()); 
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
    // $ANTLR end "ruleEMappingEntity"


    // $ANTLR start "entryRuleEAttribute"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:229:1: entryRuleEAttribute : ruleEAttribute EOF ;
    public final void entryRuleEAttribute() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:230:1: ( ruleEAttribute EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:231:1: ruleEAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_entryRuleEAttribute427);
            ruleEAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEAttribute434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEAttribute"


    // $ANTLR start "ruleEAttribute"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:238:1: ruleEAttribute : ( ( rule__EAttribute__Group__0 ) ) ;
    public final void ruleEAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:242:2: ( ( ( rule__EAttribute__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:243:1: ( ( rule__EAttribute__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:243:1: ( ( rule__EAttribute__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:244:1: ( rule__EAttribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:245:1: ( rule__EAttribute__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:245:2: rule__EAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__0_in_ruleEAttribute460);
            rule__EAttribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getGroup()); 
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
    // $ANTLR end "ruleEAttribute"


    // $ANTLR start "entryRuleENamedQuery"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:257:1: entryRuleENamedQuery : ruleENamedQuery EOF ;
    public final void entryRuleENamedQuery() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:258:1: ( ruleENamedQuery EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:259:1: ruleENamedQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery487);
            ruleENamedQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedQuery494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleENamedQuery"


    // $ANTLR start "ruleENamedQuery"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:266:1: ruleENamedQuery : ( ( rule__ENamedQuery__Group__0 ) ) ;
    public final void ruleENamedQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:270:2: ( ( ( rule__ENamedQuery__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:271:1: ( ( rule__ENamedQuery__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:271:1: ( ( rule__ENamedQuery__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:272:1: ( rule__ENamedQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:273:1: ( rule__ENamedQuery__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:273:2: rule__ENamedQuery__Group__0
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__0_in_ruleENamedQuery520);
            rule__ENamedQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getGroup()); 
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
    // $ANTLR end "ruleENamedQuery"


    // $ANTLR start "entryRuleEParameter"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:285:1: entryRuleEParameter : ruleEParameter EOF ;
    public final void entryRuleEParameter() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:286:1: ( ruleEParameter EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:287:1: ruleEParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterRule()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_entryRuleEParameter547);
            ruleEParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEParameter554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEParameter"


    // $ANTLR start "ruleEParameter"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:294:1: ruleEParameter : ( ( rule__EParameter__Group__0 ) ) ;
    public final void ruleEParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:298:2: ( ( ( rule__EParameter__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:299:1: ( ( rule__EParameter__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:299:1: ( ( rule__EParameter__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:300:1: ( rule__EParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:301:1: ( rule__EParameter__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:301:2: rule__EParameter__Group__0
            {
            pushFollow(FOLLOW_rule__EParameter__Group__0_in_ruleEParameter580);
            rule__EParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEParameterAccess().getGroup()); 
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
    // $ANTLR end "ruleEParameter"


    // $ANTLR start "entryRuleEQuery"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:313:1: entryRuleEQuery : ruleEQuery EOF ;
    public final void entryRuleEQuery() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:314:1: ( ruleEQuery EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:315:1: ruleEQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryRule()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_entryRuleEQuery607);
            ruleEQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQuery614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEQuery"


    // $ANTLR start "ruleEQuery"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:322:1: ruleEQuery : ( ( rule__EQuery__Group__0 ) ) ;
    public final void ruleEQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:326:2: ( ( ( rule__EQuery__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:327:1: ( ( rule__EQuery__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:327:1: ( ( rule__EQuery__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:328:1: ( rule__EQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:329:1: ( rule__EQuery__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:329:2: rule__EQuery__Group__0
            {
            pushFollow(FOLLOW_rule__EQuery__Group__0_in_ruleEQuery640);
            rule__EQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getGroup()); 
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
    // $ANTLR end "ruleEQuery"


    // $ANTLR start "entryRuleEObjectSection"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:341:1: entryRuleEObjectSection : ruleEObjectSection EOF ;
    public final void entryRuleEObjectSection() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:342:1: ( ruleEObjectSection EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:343:1: ruleEObjectSection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionRule()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection667);
            ruleEObjectSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEObjectSection674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEObjectSection"


    // $ANTLR start "ruleEObjectSection"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:350:1: ruleEObjectSection : ( ( rule__EObjectSection__Group__0 ) ) ;
    public final void ruleEObjectSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:354:2: ( ( ( rule__EObjectSection__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:355:1: ( ( rule__EObjectSection__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:355:1: ( ( rule__EObjectSection__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:356:1: ( rule__EObjectSection__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:357:1: ( rule__EObjectSection__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:357:2: rule__EObjectSection__Group__0
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__0_in_ruleEObjectSection700);
            rule__EObjectSection__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getGroup()); 
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
    // $ANTLR end "ruleEObjectSection"


    // $ANTLR start "entryRuleEMappingAttribute"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:369:1: entryRuleEMappingAttribute : ruleEMappingAttribute EOF ;
    public final void entryRuleEMappingAttribute() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:370:1: ( ruleEMappingAttribute EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:371:1: ruleEMappingAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute727);
            ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingAttribute734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEMappingAttribute"


    // $ANTLR start "ruleEMappingAttribute"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:378:1: ruleEMappingAttribute : ( ( rule__EMappingAttribute__Group__0 ) ) ;
    public final void ruleEMappingAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:382:2: ( ( ( rule__EMappingAttribute__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:383:1: ( ( rule__EMappingAttribute__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:383:1: ( ( rule__EMappingAttribute__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:384:1: ( rule__EMappingAttribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:385:1: ( rule__EMappingAttribute__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:385:2: rule__EMappingAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__0_in_ruleEMappingAttribute760);
            rule__EMappingAttribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getGroup()); 
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
    // $ANTLR end "ruleEMappingAttribute"


    // $ANTLR start "entryRuleEType"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:397:1: entryRuleEType : ruleEType EOF ;
    public final void entryRuleEType() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:398:1: ( ruleEType EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:399:1: ruleEType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeRule()); 
            }
            pushFollow(FOLLOW_ruleEType_in_entryRuleEType787);
            ruleEType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getETypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEType794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEType"


    // $ANTLR start "ruleEType"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:406:1: ruleEType : ( ( rule__EType__Group__0 ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:410:2: ( ( ( rule__EType__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:411:1: ( ( rule__EType__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:411:1: ( ( rule__EType__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:412:1: ( rule__EType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:413:1: ( rule__EType__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:413:2: rule__EType__Group__0
            {
            pushFollow(FOLLOW_rule__EType__Group__0_in_ruleEType820);
            rule__EType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getETypeAccess().getGroup()); 
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
    // $ANTLR end "ruleEType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:425:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:426:1: ( ruleQualifiedName EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:427:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName847);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName854); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:434:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:438:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:439:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:439:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:440:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:441:1: ( rule__QualifiedName__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:441:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName880);
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:453:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:454:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:455:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard907);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:462:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:466:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:467:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:467:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:468:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:469:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:469:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard940);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleReturnType"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:482:1: ruleReturnType : ( ( rule__ReturnType__Alternatives ) ) ;
    public final void ruleReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:486:1: ( ( ( rule__ReturnType__Alternatives ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:487:1: ( ( rule__ReturnType__Alternatives ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:487:1: ( ( rule__ReturnType__Alternatives ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:488:1: ( rule__ReturnType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnTypeAccess().getAlternatives()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:489:1: ( rule__ReturnType__Alternatives )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:489:2: rule__ReturnType__Alternatives
            {
            pushFollow(FOLLOW_rule__ReturnType__Alternatives_in_ruleReturnType977);
            rule__ReturnType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "rule__EMapping__RootAlternatives_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:500:1: rule__EMapping__RootAlternatives_0 : ( ( ruleEMappingBundle ) | ( ruleEMappingEntityDef ) );
    public final void rule__EMapping__RootAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:504:1: ( ( ruleEMappingBundle ) | ( ruleEMappingEntityDef ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16||LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:505:1: ( ruleEMappingBundle )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:505:1: ( ruleEMappingBundle )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:506:1: ruleEMappingBundle
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAccess().getRootEMappingBundleParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleEMappingBundle_in_rule__EMapping__RootAlternatives_01012);
                    ruleEMappingBundle();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEMappingAccess().getRootEMappingBundleParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:511:6: ( ruleEMappingEntityDef )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:511:6: ( ruleEMappingEntityDef )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:512:1: ruleEMappingEntityDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAccess().getRootEMappingEntityDefParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleEMappingEntityDef_in_rule__EMapping__RootAlternatives_01029);
                    ruleEMappingEntityDef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEMappingAccess().getRootEMappingEntityDefParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__EMapping__RootAlternatives_0"


    // $ANTLR start "rule__Import__ImportedNamespaceAlternatives_1_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:522:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) );
    public final void rule__Import__ImportedNamespaceAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:526:1: ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:527:1: ( ruleQualifiedNameWithWildcard )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:527:1: ( ruleQualifiedNameWithWildcard )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:528:1: ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01061);
                    ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:533:6: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:533:6: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:534:1: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAlternatives_1_01078);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 
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
    // $ANTLR end "rule__Import__ImportedNamespaceAlternatives_1_0"


    // $ANTLR start "rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:544:1: rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 : ( ( 'extends' ) | ( 'derived' ) );
    public final void rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:548:1: ( ( 'extends' ) | ( 'derived' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:549:1: ( 'extends' )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:549:1: ( 'extends' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:550:1: 'extends'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingEntityAccess().getExtensionTypeExtendsKeyword_3_0_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01111); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEMappingEntityAccess().getExtensionTypeExtendsKeyword_3_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:557:6: ( 'derived' )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:557:6: ( 'derived' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:558:1: 'derived'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingEntityAccess().getExtensionTypeDerivedKeyword_3_0_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01131); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEMappingEntityAccess().getExtensionTypeDerivedKeyword_3_0_0_1()); 
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
    // $ANTLR end "rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0"


    // $ANTLR start "rule__EAttribute__Alternatives_3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:570:1: rule__EAttribute__Alternatives_3 : ( ( ( rule__EAttribute__Group_3_0__0 ) ) | ( ( rule__EAttribute__Group_3_1__0 ) ) );
    public final void rule__EAttribute__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:574:1: ( ( ( rule__EAttribute__Group_3_0__0 ) ) | ( ( rule__EAttribute__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==44) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:575:1: ( ( rule__EAttribute__Group_3_0__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:575:1: ( ( rule__EAttribute__Group_3_0__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:576:1: ( rule__EAttribute__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEAttributeAccess().getGroup_3_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:577:1: ( rule__EAttribute__Group_3_0__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:577:2: rule__EAttribute__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_0__0_in_rule__EAttribute__Alternatives_31165);
                    rule__EAttribute__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEAttributeAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:581:6: ( ( rule__EAttribute__Group_3_1__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:581:6: ( ( rule__EAttribute__Group_3_1__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:582:1: ( rule__EAttribute__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEAttributeAccess().getGroup_3_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:583:1: ( rule__EAttribute__Group_3_1__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:583:2: rule__EAttribute__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_1__0_in_rule__EAttribute__Alternatives_31183);
                    rule__EAttribute__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEAttributeAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__EAttribute__Alternatives_3"


    // $ANTLR start "rule__EAttribute__Alternatives_3_0_1_3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:592:1: rule__EAttribute__Alternatives_3_0_1_3 : ( ( ( rule__EAttribute__AutoAssignment_3_0_1_3_0 ) ) | ( ( rule__EAttribute__Group_3_0_1_3_1__0 ) ) | ( ( rule__EAttribute__Group_3_0_1_3_2__0 ) ) );
    public final void rule__EAttribute__Alternatives_3_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:596:1: ( ( ( rule__EAttribute__AutoAssignment_3_0_1_3_0 ) ) | ( ( rule__EAttribute__Group_3_0_1_3_1__0 ) ) | ( ( rule__EAttribute__Group_3_0_1_3_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:597:1: ( ( rule__EAttribute__AutoAssignment_3_0_1_3_0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:597:1: ( ( rule__EAttribute__AutoAssignment_3_0_1_3_0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:598:1: ( rule__EAttribute__AutoAssignment_3_0_1_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEAttributeAccess().getAutoAssignment_3_0_1_3_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:599:1: ( rule__EAttribute__AutoAssignment_3_0_1_3_0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:599:2: rule__EAttribute__AutoAssignment_3_0_1_3_0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__AutoAssignment_3_0_1_3_0_in_rule__EAttribute__Alternatives_3_0_1_31216);
                    rule__EAttribute__AutoAssignment_3_0_1_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEAttributeAccess().getAutoAssignment_3_0_1_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:603:6: ( ( rule__EAttribute__Group_3_0_1_3_1__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:603:6: ( ( rule__EAttribute__Group_3_0_1_3_1__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:604:1: ( rule__EAttribute__Group_3_0_1_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEAttributeAccess().getGroup_3_0_1_3_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:605:1: ( rule__EAttribute__Group_3_0_1_3_1__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:605:2: rule__EAttribute__Group_3_0_1_3_1__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3_1__0_in_rule__EAttribute__Alternatives_3_0_1_31234);
                    rule__EAttribute__Group_3_0_1_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEAttributeAccess().getGroup_3_0_1_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:609:6: ( ( rule__EAttribute__Group_3_0_1_3_2__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:609:6: ( ( rule__EAttribute__Group_3_0_1_3_2__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:610:1: ( rule__EAttribute__Group_3_0_1_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEAttributeAccess().getGroup_3_0_1_3_2()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:611:1: ( rule__EAttribute__Group_3_0_1_3_2__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:611:2: rule__EAttribute__Group_3_0_1_3_2__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3_2__0_in_rule__EAttribute__Alternatives_3_0_1_31252);
                    rule__EAttribute__Group_3_0_1_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEAttributeAccess().getGroup_3_0_1_3_2()); 
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
    // $ANTLR end "rule__EAttribute__Alternatives_3_0_1_3"


    // $ANTLR start "rule__EQuery__DbTypeAlternatives_0_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:620:1: rule__EQuery__DbTypeAlternatives_0_0 : ( ( 'default' ) | ( RULE_STRING ) );
    public final void rule__EQuery__DbTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:624:1: ( ( 'default' ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:625:1: ( 'default' )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:625:1: ( 'default' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:626:1: 'default'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getDbTypeDefaultKeyword_0_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__EQuery__DbTypeAlternatives_0_01286); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEQueryAccess().getDbTypeDefaultKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:633:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:633:6: ( RULE_STRING )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:634:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getDbTypeSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__DbTypeAlternatives_0_01305); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEQueryAccess().getDbTypeSTRINGTerminalRuleCall_0_0_1()); 
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
    // $ANTLR end "rule__EQuery__DbTypeAlternatives_0_0"


    // $ANTLR start "rule__EQuery__Alternatives_2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:644:1: rule__EQuery__Alternatives_2 : ( ( ( rule__EQuery__Group_2_0__0 ) ) | ( ( rule__EQuery__AllAssignment_2_1 ) ) );
    public final void rule__EQuery__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:648:1: ( ( ( rule__EQuery__Group_2_0__0 ) ) | ( ( rule__EQuery__AllAssignment_2_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:649:1: ( ( rule__EQuery__Group_2_0__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:649:1: ( ( rule__EQuery__Group_2_0__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:650:1: ( rule__EQuery__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getGroup_2_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:651:1: ( rule__EQuery__Group_2_0__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:651:2: rule__EQuery__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0__0_in_rule__EQuery__Alternatives_21337);
                    rule__EQuery__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEQueryAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:655:6: ( ( rule__EQuery__AllAssignment_2_1 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:655:6: ( ( rule__EQuery__AllAssignment_2_1 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:656:1: ( rule__EQuery__AllAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getAllAssignment_2_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:657:1: ( rule__EQuery__AllAssignment_2_1 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:657:2: rule__EQuery__AllAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__EQuery__AllAssignment_2_1_in_rule__EQuery__Alternatives_21355);
                    rule__EQuery__AllAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEQueryAccess().getAllAssignment_2_1()); 
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
    // $ANTLR end "rule__EQuery__Alternatives_2"


    // $ANTLR start "rule__EMappingAttribute__Alternatives_3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:666:1: rule__EMappingAttribute__Alternatives_3 : ( ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) ) | ( ( rule__EMappingAttribute__Group_3_1__0 ) ) | ( ( rule__EMappingAttribute__Group_3_2__0 ) ) );
    public final void rule__EMappingAttribute__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:670:1: ( ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) ) | ( ( rule__EMappingAttribute__Group_3_1__0 ) ) | ( ( rule__EMappingAttribute__Group_3_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 44:
                {
                alt8=2;
                }
                break;
            case 45:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:671:1: ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:671:1: ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:672:1: ( rule__EMappingAttribute__ColumnNameAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAttributeAccess().getColumnNameAssignment_3_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:673:1: ( rule__EMappingAttribute__ColumnNameAssignment_3_0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:673:2: rule__EMappingAttribute__ColumnNameAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__ColumnNameAssignment_3_0_in_rule__EMappingAttribute__Alternatives_31388);
                    rule__EMappingAttribute__ColumnNameAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEMappingAttributeAccess().getColumnNameAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:677:6: ( ( rule__EMappingAttribute__Group_3_1__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:677:6: ( ( rule__EMappingAttribute__Group_3_1__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:678:1: ( rule__EMappingAttribute__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAttributeAccess().getGroup_3_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:679:1: ( rule__EMappingAttribute__Group_3_1__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:679:2: rule__EMappingAttribute__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__0_in_rule__EMappingAttribute__Alternatives_31406);
                    rule__EMappingAttribute__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEMappingAttributeAccess().getGroup_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:683:6: ( ( rule__EMappingAttribute__Group_3_2__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:683:6: ( ( rule__EMappingAttribute__Group_3_2__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:684:1: ( rule__EMappingAttribute__Group_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAttributeAccess().getGroup_3_2()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:685:1: ( rule__EMappingAttribute__Group_3_2__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:685:2: rule__EMappingAttribute__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__0_in_rule__EMappingAttribute__Alternatives_31424);
                    rule__EMappingAttribute__Group_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEMappingAttributeAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__EMappingAttribute__Alternatives_3"


    // $ANTLR start "rule__ReturnType__Alternatives"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:694:1: rule__ReturnType__Alternatives : ( ( ( 'list' ) ) | ( ( 'single' ) ) );
    public final void rule__ReturnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:698:1: ( ( ( 'list' ) ) | ( ( 'single' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:699:1: ( ( 'list' ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:699:1: ( ( 'list' ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:700:1: ( 'list' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:701:1: ( 'list' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:701:3: 'list'
                    {
                    match(input,14,FOLLOW_14_in_rule__ReturnType__Alternatives1458); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:706:6: ( ( 'single' ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:706:6: ( ( 'single' ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:707:1: ( 'single' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReturnTypeAccess().getSingleEnumLiteralDeclaration_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:708:1: ( 'single' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:708:3: 'single'
                    {
                    match(input,15,FOLLOW_15_in_rule__ReturnType__Alternatives1479); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReturnTypeAccess().getSingleEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__ReturnType__Alternatives"


    // $ANTLR start "rule__EMappingBundle__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:720:1: rule__EMappingBundle__Group__0 : rule__EMappingBundle__Group__0__Impl rule__EMappingBundle__Group__1 ;
    public final void rule__EMappingBundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:724:1: ( rule__EMappingBundle__Group__0__Impl rule__EMappingBundle__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:725:2: rule__EMappingBundle__Group__0__Impl rule__EMappingBundle__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__0__Impl_in_rule__EMappingBundle__Group__01512);
            rule__EMappingBundle__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__1_in_rule__EMappingBundle__Group__01515);
            rule__EMappingBundle__Group__1();

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
    // $ANTLR end "rule__EMappingBundle__Group__0"


    // $ANTLR start "rule__EMappingBundle__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:732:1: rule__EMappingBundle__Group__0__Impl : ( ( rule__EMappingBundle__ImportsAssignment_0 )* ) ;
    public final void rule__EMappingBundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:736:1: ( ( ( rule__EMappingBundle__ImportsAssignment_0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:737:1: ( ( rule__EMappingBundle__ImportsAssignment_0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:737:1: ( ( rule__EMappingBundle__ImportsAssignment_0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:738:1: ( rule__EMappingBundle__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getImportsAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:739:1: ( rule__EMappingBundle__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:739:2: rule__EMappingBundle__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingBundle__ImportsAssignment_0_in_rule__EMappingBundle__Group__0__Impl1542);
            	    rule__EMappingBundle__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__EMappingBundle__Group__0__Impl"


    // $ANTLR start "rule__EMappingBundle__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:749:1: rule__EMappingBundle__Group__1 : rule__EMappingBundle__Group__1__Impl rule__EMappingBundle__Group__2 ;
    public final void rule__EMappingBundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:753:1: ( rule__EMappingBundle__Group__1__Impl rule__EMappingBundle__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:754:2: rule__EMappingBundle__Group__1__Impl rule__EMappingBundle__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__1__Impl_in_rule__EMappingBundle__Group__11573);
            rule__EMappingBundle__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__2_in_rule__EMappingBundle__Group__11576);
            rule__EMappingBundle__Group__2();

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
    // $ANTLR end "rule__EMappingBundle__Group__1"


    // $ANTLR start "rule__EMappingBundle__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:761:1: rule__EMappingBundle__Group__1__Impl : ( 'bundle' ) ;
    public final void rule__EMappingBundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:765:1: ( ( 'bundle' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:766:1: ( 'bundle' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:766:1: ( 'bundle' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:767:1: 'bundle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getBundleKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__EMappingBundle__Group__1__Impl1604); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getBundleKeyword_1()); 
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
    // $ANTLR end "rule__EMappingBundle__Group__1__Impl"


    // $ANTLR start "rule__EMappingBundle__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:780:1: rule__EMappingBundle__Group__2 : rule__EMappingBundle__Group__2__Impl rule__EMappingBundle__Group__3 ;
    public final void rule__EMappingBundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:784:1: ( rule__EMappingBundle__Group__2__Impl rule__EMappingBundle__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:785:2: rule__EMappingBundle__Group__2__Impl rule__EMappingBundle__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__2__Impl_in_rule__EMappingBundle__Group__21635);
            rule__EMappingBundle__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__3_in_rule__EMappingBundle__Group__21638);
            rule__EMappingBundle__Group__3();

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
    // $ANTLR end "rule__EMappingBundle__Group__2"


    // $ANTLR start "rule__EMappingBundle__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:792:1: rule__EMappingBundle__Group__2__Impl : ( ( rule__EMappingBundle__NameAssignment_2 ) ) ;
    public final void rule__EMappingBundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:796:1: ( ( ( rule__EMappingBundle__NameAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:797:1: ( ( rule__EMappingBundle__NameAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:797:1: ( ( rule__EMappingBundle__NameAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:798:1: ( rule__EMappingBundle__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:799:1: ( rule__EMappingBundle__NameAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:799:2: rule__EMappingBundle__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingBundle__NameAssignment_2_in_rule__EMappingBundle__Group__2__Impl1665);
            rule__EMappingBundle__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__EMappingBundle__Group__2__Impl"


    // $ANTLR start "rule__EMappingBundle__Group__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:809:1: rule__EMappingBundle__Group__3 : rule__EMappingBundle__Group__3__Impl rule__EMappingBundle__Group__4 ;
    public final void rule__EMappingBundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:813:1: ( rule__EMappingBundle__Group__3__Impl rule__EMappingBundle__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:814:2: rule__EMappingBundle__Group__3__Impl rule__EMappingBundle__Group__4
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__3__Impl_in_rule__EMappingBundle__Group__31695);
            rule__EMappingBundle__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__4_in_rule__EMappingBundle__Group__31698);
            rule__EMappingBundle__Group__4();

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
    // $ANTLR end "rule__EMappingBundle__Group__3"


    // $ANTLR start "rule__EMappingBundle__Group__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:821:1: rule__EMappingBundle__Group__3__Impl : ( '{' ) ;
    public final void rule__EMappingBundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:825:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:826:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:826:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:827:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingBundle__Group__3__Impl1726); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__EMappingBundle__Group__3__Impl"


    // $ANTLR start "rule__EMappingBundle__Group__4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:840:1: rule__EMappingBundle__Group__4 : rule__EMappingBundle__Group__4__Impl rule__EMappingBundle__Group__5 ;
    public final void rule__EMappingBundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:844:1: ( rule__EMappingBundle__Group__4__Impl rule__EMappingBundle__Group__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:845:2: rule__EMappingBundle__Group__4__Impl rule__EMappingBundle__Group__5
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__4__Impl_in_rule__EMappingBundle__Group__41757);
            rule__EMappingBundle__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__5_in_rule__EMappingBundle__Group__41760);
            rule__EMappingBundle__Group__5();

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
    // $ANTLR end "rule__EMappingBundle__Group__4"


    // $ANTLR start "rule__EMappingBundle__Group__4__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:852:1: rule__EMappingBundle__Group__4__Impl : ( ( rule__EMappingBundle__EntitiesAssignment_4 ) ) ;
    public final void rule__EMappingBundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:856:1: ( ( ( rule__EMappingBundle__EntitiesAssignment_4 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:857:1: ( ( rule__EMappingBundle__EntitiesAssignment_4 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:857:1: ( ( rule__EMappingBundle__EntitiesAssignment_4 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:858:1: ( rule__EMappingBundle__EntitiesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_4()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:859:1: ( rule__EMappingBundle__EntitiesAssignment_4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:859:2: rule__EMappingBundle__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_rule__EMappingBundle__EntitiesAssignment_4_in_rule__EMappingBundle__Group__4__Impl1787);
            rule__EMappingBundle__EntitiesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_4()); 
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
    // $ANTLR end "rule__EMappingBundle__Group__4__Impl"


    // $ANTLR start "rule__EMappingBundle__Group__5"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:869:1: rule__EMappingBundle__Group__5 : rule__EMappingBundle__Group__5__Impl rule__EMappingBundle__Group__6 ;
    public final void rule__EMappingBundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:873:1: ( rule__EMappingBundle__Group__5__Impl rule__EMappingBundle__Group__6 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:874:2: rule__EMappingBundle__Group__5__Impl rule__EMappingBundle__Group__6
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__5__Impl_in_rule__EMappingBundle__Group__51817);
            rule__EMappingBundle__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__6_in_rule__EMappingBundle__Group__51820);
            rule__EMappingBundle__Group__6();

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
    // $ANTLR end "rule__EMappingBundle__Group__5"


    // $ANTLR start "rule__EMappingBundle__Group__5__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:881:1: rule__EMappingBundle__Group__5__Impl : ( ( rule__EMappingBundle__Group_5__0 )* ) ;
    public final void rule__EMappingBundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:885:1: ( ( ( rule__EMappingBundle__Group_5__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:886:1: ( ( rule__EMappingBundle__Group_5__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:886:1: ( ( rule__EMappingBundle__Group_5__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:887:1: ( rule__EMappingBundle__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getGroup_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:888:1: ( rule__EMappingBundle__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:888:2: rule__EMappingBundle__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingBundle__Group_5__0_in_rule__EMappingBundle__Group__5__Impl1847);
            	    rule__EMappingBundle__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getGroup_5()); 
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
    // $ANTLR end "rule__EMappingBundle__Group__5__Impl"


    // $ANTLR start "rule__EMappingBundle__Group__6"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:898:1: rule__EMappingBundle__Group__6 : rule__EMappingBundle__Group__6__Impl ;
    public final void rule__EMappingBundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:902:1: ( rule__EMappingBundle__Group__6__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:903:2: rule__EMappingBundle__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__6__Impl_in_rule__EMappingBundle__Group__61878);
            rule__EMappingBundle__Group__6__Impl();

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
    // $ANTLR end "rule__EMappingBundle__Group__6"


    // $ANTLR start "rule__EMappingBundle__Group__6__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:909:1: rule__EMappingBundle__Group__6__Impl : ( '}' ) ;
    public final void rule__EMappingBundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:913:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:914:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:914:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:915:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingBundle__Group__6__Impl1906); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__EMappingBundle__Group__6__Impl"


    // $ANTLR start "rule__EMappingBundle__Group_5__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:942:1: rule__EMappingBundle__Group_5__0 : rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1 ;
    public final void rule__EMappingBundle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:946:1: ( rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:947:2: rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__0__Impl_in_rule__EMappingBundle__Group_5__01951);
            rule__EMappingBundle__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__1_in_rule__EMappingBundle__Group_5__01954);
            rule__EMappingBundle__Group_5__1();

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
    // $ANTLR end "rule__EMappingBundle__Group_5__0"


    // $ANTLR start "rule__EMappingBundle__Group_5__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:954:1: rule__EMappingBundle__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EMappingBundle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:958:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:959:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:959:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:960:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getCommaKeyword_5_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EMappingBundle__Group_5__0__Impl1982); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getCommaKeyword_5_0()); 
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
    // $ANTLR end "rule__EMappingBundle__Group_5__0__Impl"


    // $ANTLR start "rule__EMappingBundle__Group_5__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:973:1: rule__EMappingBundle__Group_5__1 : rule__EMappingBundle__Group_5__1__Impl ;
    public final void rule__EMappingBundle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:977:1: ( rule__EMappingBundle__Group_5__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:978:2: rule__EMappingBundle__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__1__Impl_in_rule__EMappingBundle__Group_5__12013);
            rule__EMappingBundle__Group_5__1__Impl();

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
    // $ANTLR end "rule__EMappingBundle__Group_5__1"


    // $ANTLR start "rule__EMappingBundle__Group_5__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:984:1: rule__EMappingBundle__Group_5__1__Impl : ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) ) ;
    public final void rule__EMappingBundle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:988:1: ( ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:989:1: ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:989:1: ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:990:1: ( rule__EMappingBundle__EntitiesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_5_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:991:1: ( rule__EMappingBundle__EntitiesAssignment_5_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:991:2: rule__EMappingBundle__EntitiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__EntitiesAssignment_5_1_in_rule__EMappingBundle__Group_5__1__Impl2040);
            rule__EMappingBundle__EntitiesAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_5_1()); 
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
    // $ANTLR end "rule__EMappingBundle__Group_5__1__Impl"


    // $ANTLR start "rule__EMappingEntityDef__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1005:1: rule__EMappingEntityDef__Group__0 : rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1 ;
    public final void rule__EMappingEntityDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1009:1: ( rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1010:2: rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__0__Impl_in_rule__EMappingEntityDef__Group__02074);
            rule__EMappingEntityDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__1_in_rule__EMappingEntityDef__Group__02077);
            rule__EMappingEntityDef__Group__1();

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
    // $ANTLR end "rule__EMappingEntityDef__Group__0"


    // $ANTLR start "rule__EMappingEntityDef__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1017:1: rule__EMappingEntityDef__Group__0__Impl : ( ( rule__EMappingEntityDef__PackageAssignment_0 ) ) ;
    public final void rule__EMappingEntityDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1021:1: ( ( ( rule__EMappingEntityDef__PackageAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1022:1: ( ( rule__EMappingEntityDef__PackageAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1022:1: ( ( rule__EMappingEntityDef__PackageAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1023:1: ( rule__EMappingEntityDef__PackageAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getPackageAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1024:1: ( rule__EMappingEntityDef__PackageAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1024:2: rule__EMappingEntityDef__PackageAssignment_0
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__PackageAssignment_0_in_rule__EMappingEntityDef__Group__0__Impl2104);
            rule__EMappingEntityDef__PackageAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityDefAccess().getPackageAssignment_0()); 
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
    // $ANTLR end "rule__EMappingEntityDef__Group__0__Impl"


    // $ANTLR start "rule__EMappingEntityDef__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1034:1: rule__EMappingEntityDef__Group__1 : rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2 ;
    public final void rule__EMappingEntityDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1038:1: ( rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1039:2: rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__1__Impl_in_rule__EMappingEntityDef__Group__12134);
            rule__EMappingEntityDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__2_in_rule__EMappingEntityDef__Group__12137);
            rule__EMappingEntityDef__Group__2();

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
    // $ANTLR end "rule__EMappingEntityDef__Group__1"


    // $ANTLR start "rule__EMappingEntityDef__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1046:1: rule__EMappingEntityDef__Group__1__Impl : ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* ) ;
    public final void rule__EMappingEntityDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1050:1: ( ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1051:1: ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1051:1: ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1052:1: ( rule__EMappingEntityDef__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getImportsAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1053:1: ( rule__EMappingEntityDef__ImportsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1053:2: rule__EMappingEntityDef__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntityDef__ImportsAssignment_1_in_rule__EMappingEntityDef__Group__1__Impl2164);
            	    rule__EMappingEntityDef__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityDefAccess().getImportsAssignment_1()); 
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
    // $ANTLR end "rule__EMappingEntityDef__Group__1__Impl"


    // $ANTLR start "rule__EMappingEntityDef__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1063:1: rule__EMappingEntityDef__Group__2 : rule__EMappingEntityDef__Group__2__Impl ;
    public final void rule__EMappingEntityDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1067:1: ( rule__EMappingEntityDef__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1068:2: rule__EMappingEntityDef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__2__Impl_in_rule__EMappingEntityDef__Group__22195);
            rule__EMappingEntityDef__Group__2__Impl();

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
    // $ANTLR end "rule__EMappingEntityDef__Group__2"


    // $ANTLR start "rule__EMappingEntityDef__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1074:1: rule__EMappingEntityDef__Group__2__Impl : ( ( rule__EMappingEntityDef__EntityAssignment_2 ) ) ;
    public final void rule__EMappingEntityDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1078:1: ( ( ( rule__EMappingEntityDef__EntityAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1079:1: ( ( rule__EMappingEntityDef__EntityAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1079:1: ( ( rule__EMappingEntityDef__EntityAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1080:1: ( rule__EMappingEntityDef__EntityAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getEntityAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1081:1: ( rule__EMappingEntityDef__EntityAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1081:2: rule__EMappingEntityDef__EntityAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__EntityAssignment_2_in_rule__EMappingEntityDef__Group__2__Impl2222);
            rule__EMappingEntityDef__EntityAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityDefAccess().getEntityAssignment_2()); 
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
    // $ANTLR end "rule__EMappingEntityDef__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1097:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1101:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1102:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02258);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02261);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1109:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1113:1: ( ( 'import' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1114:1: ( 'import' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1114:1: ( 'import' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1115:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Import__Group__0__Impl2289); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1128:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1132:1: ( rule__Import__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1133:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12320);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1139:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1143:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1144:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1144:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1145:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1146:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1146:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2347);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1160:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1164:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1165:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02381);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02384);
            rule__PackageDeclaration__Group__1();

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
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1172:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1176:1: ( ( 'package' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1177:1: ( 'package' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1177:1: ( 'package' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1178:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__PackageDeclaration__Group__0__Impl2412); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1191:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1195:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1196:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12443);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12446);
            rule__PackageDeclaration__Group__2();

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
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1203:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1207:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1208:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1208:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1209:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1210:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1210:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2473);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1220:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1224:1: ( rule__PackageDeclaration__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1225:2: rule__PackageDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22503);
            rule__PackageDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1231:1: rule__PackageDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1235:1: ( ( ';' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1236:1: ( ';' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1236:1: ( ';' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1237:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group__2__Impl2531); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1256:1: rule__EMappingEntity__Group__0 : rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1 ;
    public final void rule__EMappingEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1260:1: ( rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1261:2: rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__0__Impl_in_rule__EMappingEntity__Group__02568);
            rule__EMappingEntity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__1_in_rule__EMappingEntity__Group__02571);
            rule__EMappingEntity__Group__1();

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
    // $ANTLR end "rule__EMappingEntity__Group__0"


    // $ANTLR start "rule__EMappingEntity__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1268:1: rule__EMappingEntity__Group__0__Impl : ( ( rule__EMappingEntity__AbstractAssignment_0 )? ) ;
    public final void rule__EMappingEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1272:1: ( ( ( rule__EMappingEntity__AbstractAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1273:1: ( ( rule__EMappingEntity__AbstractAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1273:1: ( ( rule__EMappingEntity__AbstractAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1274:1: ( rule__EMappingEntity__AbstractAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1275:1: ( rule__EMappingEntity__AbstractAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1275:2: rule__EMappingEntity__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__AbstractAssignment_0_in_rule__EMappingEntity__Group__0__Impl2598);
                    rule__EMappingEntity__AbstractAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAbstractAssignment_0()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1285:1: rule__EMappingEntity__Group__1 : rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2 ;
    public final void rule__EMappingEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1289:1: ( rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1290:2: rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__1__Impl_in_rule__EMappingEntity__Group__12629);
            rule__EMappingEntity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__2_in_rule__EMappingEntity__Group__12632);
            rule__EMappingEntity__Group__2();

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
    // $ANTLR end "rule__EMappingEntity__Group__1"


    // $ANTLR start "rule__EMappingEntity__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1297:1: rule__EMappingEntity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__EMappingEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1301:1: ( ( 'entity' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1302:1: ( 'entity' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1302:1: ( 'entity' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1303:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEntityKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__EMappingEntity__Group__1__Impl2660); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getEntityKeyword_1()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__1__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1316:1: rule__EMappingEntity__Group__2 : rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3 ;
    public final void rule__EMappingEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1320:1: ( rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1321:2: rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__2__Impl_in_rule__EMappingEntity__Group__22691);
            rule__EMappingEntity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__3_in_rule__EMappingEntity__Group__22694);
            rule__EMappingEntity__Group__3();

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
    // $ANTLR end "rule__EMappingEntity__Group__2"


    // $ANTLR start "rule__EMappingEntity__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1328:1: rule__EMappingEntity__Group__2__Impl : ( ( rule__EMappingEntity__NameAssignment_2 ) ) ;
    public final void rule__EMappingEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1332:1: ( ( ( rule__EMappingEntity__NameAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1333:1: ( ( rule__EMappingEntity__NameAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1333:1: ( ( rule__EMappingEntity__NameAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1334:1: ( rule__EMappingEntity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1335:1: ( rule__EMappingEntity__NameAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1335:2: rule__EMappingEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NameAssignment_2_in_rule__EMappingEntity__Group__2__Impl2721);
            rule__EMappingEntity__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__2__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1345:1: rule__EMappingEntity__Group__3 : rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4 ;
    public final void rule__EMappingEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1349:1: ( rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1350:2: rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__3__Impl_in_rule__EMappingEntity__Group__32751);
            rule__EMappingEntity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__4_in_rule__EMappingEntity__Group__32754);
            rule__EMappingEntity__Group__4();

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
    // $ANTLR end "rule__EMappingEntity__Group__3"


    // $ANTLR start "rule__EMappingEntity__Group__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1357:1: rule__EMappingEntity__Group__3__Impl : ( ( rule__EMappingEntity__Group_3__0 )? ) ;
    public final void rule__EMappingEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1361:1: ( ( ( rule__EMappingEntity__Group_3__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1362:1: ( ( rule__EMappingEntity__Group_3__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1362:1: ( ( rule__EMappingEntity__Group_3__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1363:1: ( rule__EMappingEntity__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1364:1: ( rule__EMappingEntity__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=12)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1364:2: rule__EMappingEntity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_3__0_in_rule__EMappingEntity__Group__3__Impl2781);
                    rule__EMappingEntity__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup_3()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__3__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1374:1: rule__EMappingEntity__Group__4 : rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5 ;
    public final void rule__EMappingEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1378:1: ( rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1379:2: rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__4__Impl_in_rule__EMappingEntity__Group__42812);
            rule__EMappingEntity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__5_in_rule__EMappingEntity__Group__42815);
            rule__EMappingEntity__Group__5();

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
    // $ANTLR end "rule__EMappingEntity__Group__4"


    // $ANTLR start "rule__EMappingEntity__Group__4__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1386:1: rule__EMappingEntity__Group__4__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1390:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1391:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1391:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1392:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group__4__Impl2843); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__4__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__5"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1405:1: rule__EMappingEntity__Group__5 : rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6 ;
    public final void rule__EMappingEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1409:1: ( rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1410:2: rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__5__Impl_in_rule__EMappingEntity__Group__52874);
            rule__EMappingEntity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__6_in_rule__EMappingEntity__Group__52877);
            rule__EMappingEntity__Group__6();

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
    // $ANTLR end "rule__EMappingEntity__Group__5"


    // $ANTLR start "rule__EMappingEntity__Group__5__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1417:1: rule__EMappingEntity__Group__5__Impl : ( ( rule__EMappingEntity__EtypeAssignment_5 ) ) ;
    public final void rule__EMappingEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1421:1: ( ( ( rule__EMappingEntity__EtypeAssignment_5 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1422:1: ( ( rule__EMappingEntity__EtypeAssignment_5 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1422:1: ( ( rule__EMappingEntity__EtypeAssignment_5 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1423:1: ( rule__EMappingEntity__EtypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEtypeAssignment_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1424:1: ( rule__EMappingEntity__EtypeAssignment_5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1424:2: rule__EMappingEntity__EtypeAssignment_5
            {
            pushFollow(FOLLOW_rule__EMappingEntity__EtypeAssignment_5_in_rule__EMappingEntity__Group__5__Impl2904);
            rule__EMappingEntity__EtypeAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getEtypeAssignment_5()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__5__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__6"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1434:1: rule__EMappingEntity__Group__6 : rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7 ;
    public final void rule__EMappingEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1438:1: ( rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1439:2: rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__6__Impl_in_rule__EMappingEntity__Group__62934);
            rule__EMappingEntity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__7_in_rule__EMappingEntity__Group__62937);
            rule__EMappingEntity__Group__7();

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
    // $ANTLR end "rule__EMappingEntity__Group__6"


    // $ANTLR start "rule__EMappingEntity__Group__6__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1446:1: rule__EMappingEntity__Group__6__Impl : ( 'attributes' ) ;
    public final void rule__EMappingEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1450:1: ( ( 'attributes' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1451:1: ( 'attributes' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1451:1: ( 'attributes' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1452:1: 'attributes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6()); 
            }
            match(input,24,FOLLOW_24_in_rule__EMappingEntity__Group__6__Impl2965); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__6__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__7"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1465:1: rule__EMappingEntity__Group__7 : rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8 ;
    public final void rule__EMappingEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1469:1: ( rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1470:2: rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__7__Impl_in_rule__EMappingEntity__Group__72996);
            rule__EMappingEntity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__8_in_rule__EMappingEntity__Group__72999);
            rule__EMappingEntity__Group__8();

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
    // $ANTLR end "rule__EMappingEntity__Group__7"


    // $ANTLR start "rule__EMappingEntity__Group__7__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1477:1: rule__EMappingEntity__Group__7__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1481:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1482:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1482:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1483:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group__7__Impl3027); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__7__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__8"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1496:1: rule__EMappingEntity__Group__8 : rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9 ;
    public final void rule__EMappingEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1500:1: ( rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1501:2: rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__8__Impl_in_rule__EMappingEntity__Group__83058);
            rule__EMappingEntity__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__9_in_rule__EMappingEntity__Group__83061);
            rule__EMappingEntity__Group__9();

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
    // $ANTLR end "rule__EMappingEntity__Group__8"


    // $ANTLR start "rule__EMappingEntity__Group__8__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1508:1: rule__EMappingEntity__Group__8__Impl : ( ( rule__EMappingEntity__AttributesAssignment_8 ) ) ;
    public final void rule__EMappingEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1512:1: ( ( ( rule__EMappingEntity__AttributesAssignment_8 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1513:1: ( ( rule__EMappingEntity__AttributesAssignment_8 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1513:1: ( ( rule__EMappingEntity__AttributesAssignment_8 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1514:1: ( rule__EMappingEntity__AttributesAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_8()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1515:1: ( rule__EMappingEntity__AttributesAssignment_8 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1515:2: rule__EMappingEntity__AttributesAssignment_8
            {
            pushFollow(FOLLOW_rule__EMappingEntity__AttributesAssignment_8_in_rule__EMappingEntity__Group__8__Impl3088);
            rule__EMappingEntity__AttributesAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_8()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__8__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__9"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1525:1: rule__EMappingEntity__Group__9 : rule__EMappingEntity__Group__9__Impl rule__EMappingEntity__Group__10 ;
    public final void rule__EMappingEntity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1529:1: ( rule__EMappingEntity__Group__9__Impl rule__EMappingEntity__Group__10 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1530:2: rule__EMappingEntity__Group__9__Impl rule__EMappingEntity__Group__10
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__9__Impl_in_rule__EMappingEntity__Group__93118);
            rule__EMappingEntity__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__10_in_rule__EMappingEntity__Group__93121);
            rule__EMappingEntity__Group__10();

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
    // $ANTLR end "rule__EMappingEntity__Group__9"


    // $ANTLR start "rule__EMappingEntity__Group__9__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1537:1: rule__EMappingEntity__Group__9__Impl : ( ( rule__EMappingEntity__Group_9__0 )* ) ;
    public final void rule__EMappingEntity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1541:1: ( ( ( rule__EMappingEntity__Group_9__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1542:1: ( ( rule__EMappingEntity__Group_9__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1542:1: ( ( rule__EMappingEntity__Group_9__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1543:1: ( rule__EMappingEntity__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_9()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1544:1: ( rule__EMappingEntity__Group_9__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1544:2: rule__EMappingEntity__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntity__Group_9__0_in_rule__EMappingEntity__Group__9__Impl3148);
            	    rule__EMappingEntity__Group_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup_9()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__9__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__10"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1554:1: rule__EMappingEntity__Group__10 : rule__EMappingEntity__Group__10__Impl rule__EMappingEntity__Group__11 ;
    public final void rule__EMappingEntity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1558:1: ( rule__EMappingEntity__Group__10__Impl rule__EMappingEntity__Group__11 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1559:2: rule__EMappingEntity__Group__10__Impl rule__EMappingEntity__Group__11
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__10__Impl_in_rule__EMappingEntity__Group__103179);
            rule__EMappingEntity__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__11_in_rule__EMappingEntity__Group__103182);
            rule__EMappingEntity__Group__11();

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
    // $ANTLR end "rule__EMappingEntity__Group__10"


    // $ANTLR start "rule__EMappingEntity__Group__10__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1566:1: rule__EMappingEntity__Group__10__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1570:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1571:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1571:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1572:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingEntity__Group__10__Impl3210); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_10()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__10__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__11"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1585:1: rule__EMappingEntity__Group__11 : rule__EMappingEntity__Group__11__Impl rule__EMappingEntity__Group__12 ;
    public final void rule__EMappingEntity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1589:1: ( rule__EMappingEntity__Group__11__Impl rule__EMappingEntity__Group__12 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1590:2: rule__EMappingEntity__Group__11__Impl rule__EMappingEntity__Group__12
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__11__Impl_in_rule__EMappingEntity__Group__113241);
            rule__EMappingEntity__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__12_in_rule__EMappingEntity__Group__113244);
            rule__EMappingEntity__Group__12();

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
    // $ANTLR end "rule__EMappingEntity__Group__11"


    // $ANTLR start "rule__EMappingEntity__Group__11__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1597:1: rule__EMappingEntity__Group__11__Impl : ( ( rule__EMappingEntity__Group_11__0 )? ) ;
    public final void rule__EMappingEntity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1601:1: ( ( ( rule__EMappingEntity__Group_11__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1602:1: ( ( rule__EMappingEntity__Group_11__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1602:1: ( ( rule__EMappingEntity__Group_11__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1603:1: ( rule__EMappingEntity__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_11()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1604:1: ( rule__EMappingEntity__Group_11__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1604:2: rule__EMappingEntity__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_11__0_in_rule__EMappingEntity__Group__11__Impl3271);
                    rule__EMappingEntity__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup_11()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__11__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__12"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1614:1: rule__EMappingEntity__Group__12 : rule__EMappingEntity__Group__12__Impl rule__EMappingEntity__Group__13 ;
    public final void rule__EMappingEntity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1618:1: ( rule__EMappingEntity__Group__12__Impl rule__EMappingEntity__Group__13 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1619:2: rule__EMappingEntity__Group__12__Impl rule__EMappingEntity__Group__13
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__12__Impl_in_rule__EMappingEntity__Group__123302);
            rule__EMappingEntity__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__13_in_rule__EMappingEntity__Group__123305);
            rule__EMappingEntity__Group__13();

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
    // $ANTLR end "rule__EMappingEntity__Group__12"


    // $ANTLR start "rule__EMappingEntity__Group__12__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1626:1: rule__EMappingEntity__Group__12__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1630:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1631:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1631:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1632:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingEntity__Group__12__Impl3333); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_12()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__12__Impl"


    // $ANTLR start "rule__EMappingEntity__Group__13"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1645:1: rule__EMappingEntity__Group__13 : rule__EMappingEntity__Group__13__Impl ;
    public final void rule__EMappingEntity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1649:1: ( rule__EMappingEntity__Group__13__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1650:2: rule__EMappingEntity__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__13__Impl_in_rule__EMappingEntity__Group__133364);
            rule__EMappingEntity__Group__13__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group__13"


    // $ANTLR start "rule__EMappingEntity__Group__13__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1656:1: rule__EMappingEntity__Group__13__Impl : ( ( rule__EMappingEntity__Group_13__0 )? ) ;
    public final void rule__EMappingEntity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1660:1: ( ( ( rule__EMappingEntity__Group_13__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1661:1: ( ( rule__EMappingEntity__Group_13__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1661:1: ( ( rule__EMappingEntity__Group_13__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1662:1: ( rule__EMappingEntity__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_13()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1663:1: ( rule__EMappingEntity__Group_13__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1663:2: rule__EMappingEntity__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_13__0_in_rule__EMappingEntity__Group__13__Impl3391);
                    rule__EMappingEntity__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup_13()); 
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
    // $ANTLR end "rule__EMappingEntity__Group__13__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_3__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1701:1: rule__EMappingEntity__Group_3__0 : rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1 ;
    public final void rule__EMappingEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1705:1: ( rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1706:2: rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__0__Impl_in_rule__EMappingEntity__Group_3__03450);
            rule__EMappingEntity__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__1_in_rule__EMappingEntity__Group_3__03453);
            rule__EMappingEntity__Group_3__1();

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
    // $ANTLR end "rule__EMappingEntity__Group_3__0"


    // $ANTLR start "rule__EMappingEntity__Group_3__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1713:1: rule__EMappingEntity__Group_3__0__Impl : ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) ) ;
    public final void rule__EMappingEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1717:1: ( ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1718:1: ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1718:1: ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1719:1: ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getExtensionTypeAssignment_3_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1720:1: ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1720:2: rule__EMappingEntity__ExtensionTypeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ExtensionTypeAssignment_3_0_in_rule__EMappingEntity__Group_3__0__Impl3480);
            rule__EMappingEntity__ExtensionTypeAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getExtensionTypeAssignment_3_0()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_3__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_3__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1730:1: rule__EMappingEntity__Group_3__1 : rule__EMappingEntity__Group_3__1__Impl ;
    public final void rule__EMappingEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1734:1: ( rule__EMappingEntity__Group_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1735:2: rule__EMappingEntity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__1__Impl_in_rule__EMappingEntity__Group_3__13510);
            rule__EMappingEntity__Group_3__1__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group_3__1"


    // $ANTLR start "rule__EMappingEntity__Group_3__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1741:1: rule__EMappingEntity__Group_3__1__Impl : ( ( rule__EMappingEntity__ParentAssignment_3_1 ) ) ;
    public final void rule__EMappingEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1745:1: ( ( ( rule__EMappingEntity__ParentAssignment_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1746:1: ( ( rule__EMappingEntity__ParentAssignment_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1746:1: ( ( rule__EMappingEntity__ParentAssignment_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1747:1: ( rule__EMappingEntity__ParentAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentAssignment_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1748:1: ( rule__EMappingEntity__ParentAssignment_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1748:2: rule__EMappingEntity__ParentAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ParentAssignment_3_1_in_rule__EMappingEntity__Group_3__1__Impl3537);
            rule__EMappingEntity__ParentAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getParentAssignment_3_1()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_3__1__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_9__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1762:1: rule__EMappingEntity__Group_9__0 : rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1 ;
    public final void rule__EMappingEntity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1766:1: ( rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1767:2: rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__0__Impl_in_rule__EMappingEntity__Group_9__03571);
            rule__EMappingEntity__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__1_in_rule__EMappingEntity__Group_9__03574);
            rule__EMappingEntity__Group_9__1();

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
    // $ANTLR end "rule__EMappingEntity__Group_9__0"


    // $ANTLR start "rule__EMappingEntity__Group_9__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1774:1: rule__EMappingEntity__Group_9__0__Impl : ( ',' ) ;
    public final void rule__EMappingEntity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1778:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1779:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1779:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1780:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getCommaKeyword_9_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EMappingEntity__Group_9__0__Impl3602); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getCommaKeyword_9_0()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_9__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_9__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1793:1: rule__EMappingEntity__Group_9__1 : rule__EMappingEntity__Group_9__1__Impl ;
    public final void rule__EMappingEntity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1797:1: ( rule__EMappingEntity__Group_9__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1798:2: rule__EMappingEntity__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__1__Impl_in_rule__EMappingEntity__Group_9__13633);
            rule__EMappingEntity__Group_9__1__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group_9__1"


    // $ANTLR start "rule__EMappingEntity__Group_9__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1804:1: rule__EMappingEntity__Group_9__1__Impl : ( ( rule__EMappingEntity__AttributesAssignment_9_1 ) ) ;
    public final void rule__EMappingEntity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1808:1: ( ( ( rule__EMappingEntity__AttributesAssignment_9_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1809:1: ( ( rule__EMappingEntity__AttributesAssignment_9_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1809:1: ( ( rule__EMappingEntity__AttributesAssignment_9_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1810:1: ( rule__EMappingEntity__AttributesAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_9_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1811:1: ( rule__EMappingEntity__AttributesAssignment_9_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1811:2: rule__EMappingEntity__AttributesAssignment_9_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__AttributesAssignment_9_1_in_rule__EMappingEntity__Group_9__1__Impl3660);
            rule__EMappingEntity__AttributesAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_9_1()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_9__1__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_11__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1825:1: rule__EMappingEntity__Group_11__0 : rule__EMappingEntity__Group_11__0__Impl rule__EMappingEntity__Group_11__1 ;
    public final void rule__EMappingEntity__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1829:1: ( rule__EMappingEntity__Group_11__0__Impl rule__EMappingEntity__Group_11__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1830:2: rule__EMappingEntity__Group_11__0__Impl rule__EMappingEntity__Group_11__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__0__Impl_in_rule__EMappingEntity__Group_11__03694);
            rule__EMappingEntity__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__1_in_rule__EMappingEntity__Group_11__03697);
            rule__EMappingEntity__Group_11__1();

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
    // $ANTLR end "rule__EMappingEntity__Group_11__0"


    // $ANTLR start "rule__EMappingEntity__Group_11__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1837:1: rule__EMappingEntity__Group_11__0__Impl : ( 'queries' ) ;
    public final void rule__EMappingEntity__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1841:1: ( ( 'queries' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1842:1: ( 'queries' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1842:1: ( 'queries' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1843:1: 'queries'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getQueriesKeyword_11_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__EMappingEntity__Group_11__0__Impl3725); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getQueriesKeyword_11_0()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_11__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_11__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1856:1: rule__EMappingEntity__Group_11__1 : rule__EMappingEntity__Group_11__1__Impl rule__EMappingEntity__Group_11__2 ;
    public final void rule__EMappingEntity__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1860:1: ( rule__EMappingEntity__Group_11__1__Impl rule__EMappingEntity__Group_11__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1861:2: rule__EMappingEntity__Group_11__1__Impl rule__EMappingEntity__Group_11__2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__1__Impl_in_rule__EMappingEntity__Group_11__13756);
            rule__EMappingEntity__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__2_in_rule__EMappingEntity__Group_11__13759);
            rule__EMappingEntity__Group_11__2();

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
    // $ANTLR end "rule__EMappingEntity__Group_11__1"


    // $ANTLR start "rule__EMappingEntity__Group_11__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1868:1: rule__EMappingEntity__Group_11__1__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1872:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1873:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1873:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1874:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_11_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group_11__1__Impl3787); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_11_1()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_11__1__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_11__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1887:1: rule__EMappingEntity__Group_11__2 : rule__EMappingEntity__Group_11__2__Impl rule__EMappingEntity__Group_11__3 ;
    public final void rule__EMappingEntity__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1891:1: ( rule__EMappingEntity__Group_11__2__Impl rule__EMappingEntity__Group_11__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1892:2: rule__EMappingEntity__Group_11__2__Impl rule__EMappingEntity__Group_11__3
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__2__Impl_in_rule__EMappingEntity__Group_11__23818);
            rule__EMappingEntity__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__3_in_rule__EMappingEntity__Group_11__23821);
            rule__EMappingEntity__Group_11__3();

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
    // $ANTLR end "rule__EMappingEntity__Group_11__2"


    // $ANTLR start "rule__EMappingEntity__Group_11__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1899:1: rule__EMappingEntity__Group_11__2__Impl : ( ( rule__EMappingEntity__NamedQueriesAssignment_11_2 ) ) ;
    public final void rule__EMappingEntity__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1903:1: ( ( ( rule__EMappingEntity__NamedQueriesAssignment_11_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1904:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_11_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1904:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_11_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1905:1: ( rule__EMappingEntity__NamedQueriesAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_11_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1906:1: ( rule__EMappingEntity__NamedQueriesAssignment_11_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1906:2: rule__EMappingEntity__NamedQueriesAssignment_11_2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_11_2_in_rule__EMappingEntity__Group_11__2__Impl3848);
            rule__EMappingEntity__NamedQueriesAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_11_2()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_11__2__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_11__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1916:1: rule__EMappingEntity__Group_11__3 : rule__EMappingEntity__Group_11__3__Impl rule__EMappingEntity__Group_11__4 ;
    public final void rule__EMappingEntity__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1920:1: ( rule__EMappingEntity__Group_11__3__Impl rule__EMappingEntity__Group_11__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1921:2: rule__EMappingEntity__Group_11__3__Impl rule__EMappingEntity__Group_11__4
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__3__Impl_in_rule__EMappingEntity__Group_11__33878);
            rule__EMappingEntity__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__4_in_rule__EMappingEntity__Group_11__33881);
            rule__EMappingEntity__Group_11__4();

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
    // $ANTLR end "rule__EMappingEntity__Group_11__3"


    // $ANTLR start "rule__EMappingEntity__Group_11__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1928:1: rule__EMappingEntity__Group_11__3__Impl : ( ( rule__EMappingEntity__Group_11_3__0 )* ) ;
    public final void rule__EMappingEntity__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1932:1: ( ( ( rule__EMappingEntity__Group_11_3__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1933:1: ( ( rule__EMappingEntity__Group_11_3__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1933:1: ( ( rule__EMappingEntity__Group_11_3__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1934:1: ( rule__EMappingEntity__Group_11_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_11_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1935:1: ( rule__EMappingEntity__Group_11_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1935:2: rule__EMappingEntity__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntity__Group_11_3__0_in_rule__EMappingEntity__Group_11__3__Impl3908);
            	    rule__EMappingEntity__Group_11_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup_11_3()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_11__3__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_11__4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1945:1: rule__EMappingEntity__Group_11__4 : rule__EMappingEntity__Group_11__4__Impl ;
    public final void rule__EMappingEntity__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1949:1: ( rule__EMappingEntity__Group_11__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1950:2: rule__EMappingEntity__Group_11__4__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__4__Impl_in_rule__EMappingEntity__Group_11__43939);
            rule__EMappingEntity__Group_11__4__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group_11__4"


    // $ANTLR start "rule__EMappingEntity__Group_11__4__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1956:1: rule__EMappingEntity__Group_11__4__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1960:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1961:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1961:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1962:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_11_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingEntity__Group_11__4__Impl3967); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_11_4()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_11__4__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_11_3__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1985:1: rule__EMappingEntity__Group_11_3__0 : rule__EMappingEntity__Group_11_3__0__Impl rule__EMappingEntity__Group_11_3__1 ;
    public final void rule__EMappingEntity__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1989:1: ( rule__EMappingEntity__Group_11_3__0__Impl rule__EMappingEntity__Group_11_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1990:2: rule__EMappingEntity__Group_11_3__0__Impl rule__EMappingEntity__Group_11_3__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11_3__0__Impl_in_rule__EMappingEntity__Group_11_3__04008);
            rule__EMappingEntity__Group_11_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11_3__1_in_rule__EMappingEntity__Group_11_3__04011);
            rule__EMappingEntity__Group_11_3__1();

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
    // $ANTLR end "rule__EMappingEntity__Group_11_3__0"


    // $ANTLR start "rule__EMappingEntity__Group_11_3__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1997:1: rule__EMappingEntity__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__EMappingEntity__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2001:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2002:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2002:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2003:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getCommaKeyword_11_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EMappingEntity__Group_11_3__0__Impl4039); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getCommaKeyword_11_3_0()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_11_3__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_11_3__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2016:1: rule__EMappingEntity__Group_11_3__1 : rule__EMappingEntity__Group_11_3__1__Impl ;
    public final void rule__EMappingEntity__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2020:1: ( rule__EMappingEntity__Group_11_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2021:2: rule__EMappingEntity__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11_3__1__Impl_in_rule__EMappingEntity__Group_11_3__14070);
            rule__EMappingEntity__Group_11_3__1__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group_11_3__1"


    // $ANTLR start "rule__EMappingEntity__Group_11_3__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2027:1: rule__EMappingEntity__Group_11_3__1__Impl : ( ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 ) ) ;
    public final void rule__EMappingEntity__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2031:1: ( ( ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2032:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2032:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2033:1: ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_11_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2034:1: ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2034:2: rule__EMappingEntity__NamedQueriesAssignment_11_3_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_11_3_1_in_rule__EMappingEntity__Group_11_3__1__Impl4097);
            rule__EMappingEntity__NamedQueriesAssignment_11_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_11_3_1()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_11_3__1__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_13__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2048:1: rule__EMappingEntity__Group_13__0 : rule__EMappingEntity__Group_13__0__Impl rule__EMappingEntity__Group_13__1 ;
    public final void rule__EMappingEntity__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2052:1: ( rule__EMappingEntity__Group_13__0__Impl rule__EMappingEntity__Group_13__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2053:2: rule__EMappingEntity__Group_13__0__Impl rule__EMappingEntity__Group_13__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_13__0__Impl_in_rule__EMappingEntity__Group_13__04131);
            rule__EMappingEntity__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_13__1_in_rule__EMappingEntity__Group_13__04134);
            rule__EMappingEntity__Group_13__1();

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
    // $ANTLR end "rule__EMappingEntity__Group_13__0"


    // $ANTLR start "rule__EMappingEntity__Group_13__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2060:1: rule__EMappingEntity__Group_13__0__Impl : ( 'as' ) ;
    public final void rule__EMappingEntity__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2064:1: ( ( 'as' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2065:1: ( 'as' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2065:1: ( 'as' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2066:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAsKeyword_13_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__EMappingEntity__Group_13__0__Impl4162); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAsKeyword_13_0()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_13__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_13__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2079:1: rule__EMappingEntity__Group_13__1 : rule__EMappingEntity__Group_13__1__Impl ;
    public final void rule__EMappingEntity__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2083:1: ( rule__EMappingEntity__Group_13__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2084:2: rule__EMappingEntity__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_13__1__Impl_in_rule__EMappingEntity__Group_13__14193);
            rule__EMappingEntity__Group_13__1__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group_13__1"


    // $ANTLR start "rule__EMappingEntity__Group_13__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2090:1: rule__EMappingEntity__Group_13__1__Impl : ( ( rule__EMappingEntity__TableNameAssignment_13_1 ) ) ;
    public final void rule__EMappingEntity__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2094:1: ( ( ( rule__EMappingEntity__TableNameAssignment_13_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2095:1: ( ( rule__EMappingEntity__TableNameAssignment_13_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2095:1: ( ( rule__EMappingEntity__TableNameAssignment_13_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2096:1: ( rule__EMappingEntity__TableNameAssignment_13_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getTableNameAssignment_13_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2097:1: ( rule__EMappingEntity__TableNameAssignment_13_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2097:2: rule__EMappingEntity__TableNameAssignment_13_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__TableNameAssignment_13_1_in_rule__EMappingEntity__Group_13__1__Impl4220);
            rule__EMappingEntity__TableNameAssignment_13_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getTableNameAssignment_13_1()); 
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
    // $ANTLR end "rule__EMappingEntity__Group_13__1__Impl"


    // $ANTLR start "rule__EAttribute__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2111:1: rule__EAttribute__Group__0 : rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1 ;
    public final void rule__EAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2115:1: ( rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2116:2: rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__0__Impl_in_rule__EAttribute__Group__04254);
            rule__EAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__1_in_rule__EAttribute__Group__04257);
            rule__EAttribute__Group__1();

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
    // $ANTLR end "rule__EAttribute__Group__0"


    // $ANTLR start "rule__EAttribute__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2123:1: rule__EAttribute__Group__0__Impl : ( ( rule__EAttribute__PkAssignment_0 )? ) ;
    public final void rule__EAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2127:1: ( ( ( rule__EAttribute__PkAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2128:1: ( ( rule__EAttribute__PkAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2128:1: ( ( rule__EAttribute__PkAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2129:1: ( rule__EAttribute__PkAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2130:1: ( rule__EAttribute__PkAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2130:2: rule__EAttribute__PkAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__PkAssignment_0_in_rule__EAttribute__Group__0__Impl4284);
                    rule__EAttribute__PkAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getPkAssignment_0()); 
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
    // $ANTLR end "rule__EAttribute__Group__0__Impl"


    // $ANTLR start "rule__EAttribute__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2140:1: rule__EAttribute__Group__1 : rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2 ;
    public final void rule__EAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2144:1: ( rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2145:2: rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__1__Impl_in_rule__EAttribute__Group__14315);
            rule__EAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__2_in_rule__EAttribute__Group__14318);
            rule__EAttribute__Group__2();

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
    // $ANTLR end "rule__EAttribute__Group__1"


    // $ANTLR start "rule__EAttribute__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2152:1: rule__EAttribute__Group__1__Impl : ( ( rule__EAttribute__PropertyAssignment_1 ) ) ;
    public final void rule__EAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2156:1: ( ( ( rule__EAttribute__PropertyAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2157:1: ( ( rule__EAttribute__PropertyAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2157:1: ( ( rule__EAttribute__PropertyAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2158:1: ( rule__EAttribute__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPropertyAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2159:1: ( rule__EAttribute__PropertyAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2159:2: rule__EAttribute__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__EAttribute__PropertyAssignment_1_in_rule__EAttribute__Group__1__Impl4345);
            rule__EAttribute__PropertyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getPropertyAssignment_1()); 
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
    // $ANTLR end "rule__EAttribute__Group__1__Impl"


    // $ANTLR start "rule__EAttribute__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2169:1: rule__EAttribute__Group__2 : rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3 ;
    public final void rule__EAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2173:1: ( rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2174:2: rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__2__Impl_in_rule__EAttribute__Group__24375);
            rule__EAttribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__3_in_rule__EAttribute__Group__24378);
            rule__EAttribute__Group__3();

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
    // $ANTLR end "rule__EAttribute__Group__2"


    // $ANTLR start "rule__EAttribute__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2181:1: rule__EAttribute__Group__2__Impl : ( '=>' ) ;
    public final void rule__EAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2185:1: ( ( '=>' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2186:1: ( '=>' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2186:1: ( '=>' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2187:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__EAttribute__Group__2__Impl4406); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__EAttribute__Group__2__Impl"


    // $ANTLR start "rule__EAttribute__Group__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2200:1: rule__EAttribute__Group__3 : rule__EAttribute__Group__3__Impl ;
    public final void rule__EAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2204:1: ( rule__EAttribute__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2205:2: rule__EAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__3__Impl_in_rule__EAttribute__Group__34437);
            rule__EAttribute__Group__3__Impl();

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
    // $ANTLR end "rule__EAttribute__Group__3"


    // $ANTLR start "rule__EAttribute__Group__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2211:1: rule__EAttribute__Group__3__Impl : ( ( rule__EAttribute__Alternatives_3 ) ) ;
    public final void rule__EAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2215:1: ( ( ( rule__EAttribute__Alternatives_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2216:1: ( ( rule__EAttribute__Alternatives_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2216:1: ( ( rule__EAttribute__Alternatives_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2217:1: ( rule__EAttribute__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2218:1: ( rule__EAttribute__Alternatives_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2218:2: rule__EAttribute__Alternatives_3
            {
            pushFollow(FOLLOW_rule__EAttribute__Alternatives_3_in_rule__EAttribute__Group__3__Impl4464);
            rule__EAttribute__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__EAttribute__Group__3__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2236:1: rule__EAttribute__Group_3_0__0 : rule__EAttribute__Group_3_0__0__Impl rule__EAttribute__Group_3_0__1 ;
    public final void rule__EAttribute__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2240:1: ( rule__EAttribute__Group_3_0__0__Impl rule__EAttribute__Group_3_0__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2241:2: rule__EAttribute__Group_3_0__0__Impl rule__EAttribute__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0__0__Impl_in_rule__EAttribute__Group_3_0__04502);
            rule__EAttribute__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0__1_in_rule__EAttribute__Group_3_0__04505);
            rule__EAttribute__Group_3_0__1();

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
    // $ANTLR end "rule__EAttribute__Group_3_0__0"


    // $ANTLR start "rule__EAttribute__Group_3_0__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2248:1: rule__EAttribute__Group_3_0__0__Impl : ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) ) ;
    public final void rule__EAttribute__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2252:1: ( ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2253:1: ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2253:1: ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2254:1: ( rule__EAttribute__ColumnNameAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getColumnNameAssignment_3_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2255:1: ( rule__EAttribute__ColumnNameAssignment_3_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2255:2: rule__EAttribute__ColumnNameAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__EAttribute__ColumnNameAssignment_3_0_0_in_rule__EAttribute__Group_3_0__0__Impl4532);
            rule__EAttribute__ColumnNameAssignment_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getColumnNameAssignment_3_0_0()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0__0__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2265:1: rule__EAttribute__Group_3_0__1 : rule__EAttribute__Group_3_0__1__Impl ;
    public final void rule__EAttribute__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2269:1: ( rule__EAttribute__Group_3_0__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2270:2: rule__EAttribute__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0__1__Impl_in_rule__EAttribute__Group_3_0__14562);
            rule__EAttribute__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__EAttribute__Group_3_0__1"


    // $ANTLR start "rule__EAttribute__Group_3_0__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2276:1: rule__EAttribute__Group_3_0__1__Impl : ( ( rule__EAttribute__Group_3_0_1__0 )? ) ;
    public final void rule__EAttribute__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2280:1: ( ( ( rule__EAttribute__Group_3_0_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2281:1: ( ( rule__EAttribute__Group_3_0_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2281:1: ( ( rule__EAttribute__Group_3_0_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2282:1: ( rule__EAttribute__Group_3_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getGroup_3_0_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2283:1: ( rule__EAttribute__Group_3_0_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2283:2: rule__EAttribute__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__0_in_rule__EAttribute__Group_3_0__1__Impl4589);
                    rule__EAttribute__Group_3_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getGroup_3_0_1()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0__1__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2297:1: rule__EAttribute__Group_3_0_1__0 : rule__EAttribute__Group_3_0_1__0__Impl rule__EAttribute__Group_3_0_1__1 ;
    public final void rule__EAttribute__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2301:1: ( rule__EAttribute__Group_3_0_1__0__Impl rule__EAttribute__Group_3_0_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2302:2: rule__EAttribute__Group_3_0_1__0__Impl rule__EAttribute__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__0__Impl_in_rule__EAttribute__Group_3_0_1__04624);
            rule__EAttribute__Group_3_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__1_in_rule__EAttribute__Group_3_0_1__04627);
            rule__EAttribute__Group_3_0_1__1();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1__0"


    // $ANTLR start "rule__EAttribute__Group_3_0_1__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2309:1: rule__EAttribute__Group_3_0_1__0__Impl : ( 'keygen' ) ;
    public final void rule__EAttribute__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2313:1: ( ( 'keygen' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2314:1: ( 'keygen' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2314:1: ( 'keygen' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2315:1: 'keygen'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getKeygenKeyword_3_0_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__EAttribute__Group_3_0_1__0__Impl4655); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getKeygenKeyword_3_0_1_0()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0_1__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2328:1: rule__EAttribute__Group_3_0_1__1 : rule__EAttribute__Group_3_0_1__1__Impl rule__EAttribute__Group_3_0_1__2 ;
    public final void rule__EAttribute__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2332:1: ( rule__EAttribute__Group_3_0_1__1__Impl rule__EAttribute__Group_3_0_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2333:2: rule__EAttribute__Group_3_0_1__1__Impl rule__EAttribute__Group_3_0_1__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__1__Impl_in_rule__EAttribute__Group_3_0_1__14686);
            rule__EAttribute__Group_3_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__2_in_rule__EAttribute__Group_3_0_1__14689);
            rule__EAttribute__Group_3_0_1__2();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1__1"


    // $ANTLR start "rule__EAttribute__Group_3_0_1__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2340:1: rule__EAttribute__Group_3_0_1__1__Impl : ( '{' ) ;
    public final void rule__EAttribute__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2344:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2345:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2345:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2346:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_3_0_1_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__EAttribute__Group_3_0_1__1__Impl4717); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_3_0_1_1()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0_1__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2359:1: rule__EAttribute__Group_3_0_1__2 : rule__EAttribute__Group_3_0_1__2__Impl rule__EAttribute__Group_3_0_1__3 ;
    public final void rule__EAttribute__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2363:1: ( rule__EAttribute__Group_3_0_1__2__Impl rule__EAttribute__Group_3_0_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2364:2: rule__EAttribute__Group_3_0_1__2__Impl rule__EAttribute__Group_3_0_1__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__2__Impl_in_rule__EAttribute__Group_3_0_1__24748);
            rule__EAttribute__Group_3_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__3_in_rule__EAttribute__Group_3_0_1__24751);
            rule__EAttribute__Group_3_0_1__3();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1__2"


    // $ANTLR start "rule__EAttribute__Group_3_0_1__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2371:1: rule__EAttribute__Group_3_0_1__2__Impl : ( ( rule__EAttribute__DbTypeAssignment_3_0_1_2 ) ) ;
    public final void rule__EAttribute__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2375:1: ( ( ( rule__EAttribute__DbTypeAssignment_3_0_1_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2376:1: ( ( rule__EAttribute__DbTypeAssignment_3_0_1_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2376:1: ( ( rule__EAttribute__DbTypeAssignment_3_0_1_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2377:1: ( rule__EAttribute__DbTypeAssignment_3_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getDbTypeAssignment_3_0_1_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2378:1: ( rule__EAttribute__DbTypeAssignment_3_0_1_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2378:2: rule__EAttribute__DbTypeAssignment_3_0_1_2
            {
            pushFollow(FOLLOW_rule__EAttribute__DbTypeAssignment_3_0_1_2_in_rule__EAttribute__Group_3_0_1__2__Impl4778);
            rule__EAttribute__DbTypeAssignment_3_0_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getDbTypeAssignment_3_0_1_2()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0_1__2__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0_1__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2388:1: rule__EAttribute__Group_3_0_1__3 : rule__EAttribute__Group_3_0_1__3__Impl rule__EAttribute__Group_3_0_1__4 ;
    public final void rule__EAttribute__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2392:1: ( rule__EAttribute__Group_3_0_1__3__Impl rule__EAttribute__Group_3_0_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2393:2: rule__EAttribute__Group_3_0_1__3__Impl rule__EAttribute__Group_3_0_1__4
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__3__Impl_in_rule__EAttribute__Group_3_0_1__34808);
            rule__EAttribute__Group_3_0_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__4_in_rule__EAttribute__Group_3_0_1__34811);
            rule__EAttribute__Group_3_0_1__4();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1__3"


    // $ANTLR start "rule__EAttribute__Group_3_0_1__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2400:1: rule__EAttribute__Group_3_0_1__3__Impl : ( ( rule__EAttribute__Alternatives_3_0_1_3 ) ) ;
    public final void rule__EAttribute__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2404:1: ( ( ( rule__EAttribute__Alternatives_3_0_1_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2405:1: ( ( rule__EAttribute__Alternatives_3_0_1_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2405:1: ( ( rule__EAttribute__Alternatives_3_0_1_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2406:1: ( rule__EAttribute__Alternatives_3_0_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getAlternatives_3_0_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2407:1: ( rule__EAttribute__Alternatives_3_0_1_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2407:2: rule__EAttribute__Alternatives_3_0_1_3
            {
            pushFollow(FOLLOW_rule__EAttribute__Alternatives_3_0_1_3_in_rule__EAttribute__Group_3_0_1__3__Impl4838);
            rule__EAttribute__Alternatives_3_0_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getAlternatives_3_0_1_3()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0_1__3__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0_1__4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2417:1: rule__EAttribute__Group_3_0_1__4 : rule__EAttribute__Group_3_0_1__4__Impl ;
    public final void rule__EAttribute__Group_3_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2421:1: ( rule__EAttribute__Group_3_0_1__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2422:2: rule__EAttribute__Group_3_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__4__Impl_in_rule__EAttribute__Group_3_0_1__44868);
            rule__EAttribute__Group_3_0_1__4__Impl();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1__4"


    // $ANTLR start "rule__EAttribute__Group_3_0_1__4__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2428:1: rule__EAttribute__Group_3_0_1__4__Impl : ( '}' ) ;
    public final void rule__EAttribute__Group_3_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2432:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2433:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2433:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2434:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_3_0_1_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__EAttribute__Group_3_0_1__4__Impl4896); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_3_0_1_4()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0_1__4__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2457:1: rule__EAttribute__Group_3_0_1_3_1__0 : rule__EAttribute__Group_3_0_1_3_1__0__Impl rule__EAttribute__Group_3_0_1_3_1__1 ;
    public final void rule__EAttribute__Group_3_0_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2461:1: ( rule__EAttribute__Group_3_0_1_3_1__0__Impl rule__EAttribute__Group_3_0_1_3_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2462:2: rule__EAttribute__Group_3_0_1_3_1__0__Impl rule__EAttribute__Group_3_0_1_3_1__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3_1__0__Impl_in_rule__EAttribute__Group_3_0_1_3_1__04937);
            rule__EAttribute__Group_3_0_1_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3_1__1_in_rule__EAttribute__Group_3_0_1_3_1__04940);
            rule__EAttribute__Group_3_0_1_3_1__1();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3_1__0"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3_1__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2469:1: rule__EAttribute__Group_3_0_1_3_1__0__Impl : ( 'query' ) ;
    public final void rule__EAttribute__Group_3_0_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2473:1: ( ( 'query' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2474:1: ( 'query' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2474:1: ( 'query' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2475:1: 'query'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryKeyword_3_0_1_3_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__EAttribute__Group_3_0_1_3_1__0__Impl4968); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getQueryKeyword_3_0_1_3_1_0()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3_1__0__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3_1__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2488:1: rule__EAttribute__Group_3_0_1_3_1__1 : rule__EAttribute__Group_3_0_1_3_1__1__Impl ;
    public final void rule__EAttribute__Group_3_0_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2492:1: ( rule__EAttribute__Group_3_0_1_3_1__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2493:2: rule__EAttribute__Group_3_0_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3_1__1__Impl_in_rule__EAttribute__Group_3_0_1_3_1__14999);
            rule__EAttribute__Group_3_0_1_3_1__1__Impl();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3_1__1"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3_1__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2499:1: rule__EAttribute__Group_3_0_1_3_1__1__Impl : ( ( rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1 ) ) ;
    public final void rule__EAttribute__Group_3_0_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2503:1: ( ( ( rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2504:1: ( ( rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2504:1: ( ( rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2505:1: ( rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getKeygenqueryAssignment_3_0_1_3_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2506:1: ( rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2506:2: rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1
            {
            pushFollow(FOLLOW_rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1_in_rule__EAttribute__Group_3_0_1_3_1__1__Impl5026);
            rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getKeygenqueryAssignment_3_0_1_3_1_1()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3_1__1__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3_2__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2520:1: rule__EAttribute__Group_3_0_1_3_2__0 : rule__EAttribute__Group_3_0_1_3_2__0__Impl rule__EAttribute__Group_3_0_1_3_2__1 ;
    public final void rule__EAttribute__Group_3_0_1_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2524:1: ( rule__EAttribute__Group_3_0_1_3_2__0__Impl rule__EAttribute__Group_3_0_1_3_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2525:2: rule__EAttribute__Group_3_0_1_3_2__0__Impl rule__EAttribute__Group_3_0_1_3_2__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3_2__0__Impl_in_rule__EAttribute__Group_3_0_1_3_2__05060);
            rule__EAttribute__Group_3_0_1_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3_2__1_in_rule__EAttribute__Group_3_0_1_3_2__05063);
            rule__EAttribute__Group_3_0_1_3_2__1();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3_2__0"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3_2__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2532:1: rule__EAttribute__Group_3_0_1_3_2__0__Impl : ( 'seq' ) ;
    public final void rule__EAttribute__Group_3_0_1_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2536:1: ( ( 'seq' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2537:1: ( 'seq' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2537:1: ( 'seq' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2538:1: 'seq'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getSeqKeyword_3_0_1_3_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__EAttribute__Group_3_0_1_3_2__0__Impl5091); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getSeqKeyword_3_0_1_3_2_0()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3_2__0__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3_2__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2551:1: rule__EAttribute__Group_3_0_1_3_2__1 : rule__EAttribute__Group_3_0_1_3_2__1__Impl ;
    public final void rule__EAttribute__Group_3_0_1_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2555:1: ( rule__EAttribute__Group_3_0_1_3_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2556:2: rule__EAttribute__Group_3_0_1_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3_2__1__Impl_in_rule__EAttribute__Group_3_0_1_3_2__15122);
            rule__EAttribute__Group_3_0_1_3_2__1__Impl();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3_2__1"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3_2__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2562:1: rule__EAttribute__Group_3_0_1_3_2__1__Impl : ( ( rule__EAttribute__SequenceAssignment_3_0_1_3_2_1 ) ) ;
    public final void rule__EAttribute__Group_3_0_1_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2566:1: ( ( ( rule__EAttribute__SequenceAssignment_3_0_1_3_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2567:1: ( ( rule__EAttribute__SequenceAssignment_3_0_1_3_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2567:1: ( ( rule__EAttribute__SequenceAssignment_3_0_1_3_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2568:1: ( rule__EAttribute__SequenceAssignment_3_0_1_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getSequenceAssignment_3_0_1_3_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2569:1: ( rule__EAttribute__SequenceAssignment_3_0_1_3_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2569:2: rule__EAttribute__SequenceAssignment_3_0_1_3_2_1
            {
            pushFollow(FOLLOW_rule__EAttribute__SequenceAssignment_3_0_1_3_2_1_in_rule__EAttribute__Group_3_0_1_3_2__1__Impl5149);
            rule__EAttribute__SequenceAssignment_3_0_1_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getSequenceAssignment_3_0_1_3_2_1()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3_2__1__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2583:1: rule__EAttribute__Group_3_1__0 : rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1 ;
    public final void rule__EAttribute__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2587:1: ( rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2588:2: rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__0__Impl_in_rule__EAttribute__Group_3_1__05183);
            rule__EAttribute__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__1_in_rule__EAttribute__Group_3_1__05186);
            rule__EAttribute__Group_3_1__1();

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
    // $ANTLR end "rule__EAttribute__Group_3_1__0"


    // $ANTLR start "rule__EAttribute__Group_3_1__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2595:1: rule__EAttribute__Group_3_1__0__Impl : ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) ) ;
    public final void rule__EAttribute__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2599:1: ( ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2600:1: ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2600:1: ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2601:1: ( rule__EAttribute__ResolvedAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedAssignment_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2602:1: ( rule__EAttribute__ResolvedAssignment_3_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2602:2: rule__EAttribute__ResolvedAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__EAttribute__ResolvedAssignment_3_1_0_in_rule__EAttribute__Group_3_1__0__Impl5213);
            rule__EAttribute__ResolvedAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getResolvedAssignment_3_1_0()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_1__0__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_1__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2612:1: rule__EAttribute__Group_3_1__1 : rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2 ;
    public final void rule__EAttribute__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2616:1: ( rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2617:2: rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__1__Impl_in_rule__EAttribute__Group_3_1__15243);
            rule__EAttribute__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__2_in_rule__EAttribute__Group_3_1__15246);
            rule__EAttribute__Group_3_1__2();

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
    // $ANTLR end "rule__EAttribute__Group_3_1__1"


    // $ANTLR start "rule__EAttribute__Group_3_1__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2624:1: rule__EAttribute__Group_3_1__1__Impl : ( ( rule__EAttribute__QueryAssignment_3_1_1 ) ) ;
    public final void rule__EAttribute__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2628:1: ( ( ( rule__EAttribute__QueryAssignment_3_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2629:1: ( ( rule__EAttribute__QueryAssignment_3_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2629:1: ( ( rule__EAttribute__QueryAssignment_3_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2630:1: ( rule__EAttribute__QueryAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryAssignment_3_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2631:1: ( rule__EAttribute__QueryAssignment_3_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2631:2: rule__EAttribute__QueryAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EAttribute__QueryAssignment_3_1_1_in_rule__EAttribute__Group_3_1__1__Impl5273);
            rule__EAttribute__QueryAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getQueryAssignment_3_1_1()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_1__1__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_1__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2641:1: rule__EAttribute__Group_3_1__2 : rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3 ;
    public final void rule__EAttribute__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2645:1: ( rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2646:2: rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__2__Impl_in_rule__EAttribute__Group_3_1__25303);
            rule__EAttribute__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__3_in_rule__EAttribute__Group_3_1__25306);
            rule__EAttribute__Group_3_1__3();

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
    // $ANTLR end "rule__EAttribute__Group_3_1__2"


    // $ANTLR start "rule__EAttribute__Group_3_1__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2653:1: rule__EAttribute__Group_3_1__2__Impl : ( '(' ) ;
    public final void rule__EAttribute__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2657:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2658:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2658:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2659:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__EAttribute__Group_3_1__2__Impl5334); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_1__2__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_1__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2672:1: rule__EAttribute__Group_3_1__3 : rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4 ;
    public final void rule__EAttribute__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2676:1: ( rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2677:2: rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__3__Impl_in_rule__EAttribute__Group_3_1__35365);
            rule__EAttribute__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__4_in_rule__EAttribute__Group_3_1__35368);
            rule__EAttribute__Group_3_1__4();

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
    // $ANTLR end "rule__EAttribute__Group_3_1__3"


    // $ANTLR start "rule__EAttribute__Group_3_1__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2684:1: rule__EAttribute__Group_3_1__3__Impl : ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) ) ;
    public final void rule__EAttribute__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2688:1: ( ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2689:1: ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2689:1: ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2690:1: ( rule__EAttribute__ParametersAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getParametersAssignment_3_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2691:1: ( rule__EAttribute__ParametersAssignment_3_1_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2691:2: rule__EAttribute__ParametersAssignment_3_1_3
            {
            pushFollow(FOLLOW_rule__EAttribute__ParametersAssignment_3_1_3_in_rule__EAttribute__Group_3_1__3__Impl5395);
            rule__EAttribute__ParametersAssignment_3_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getParametersAssignment_3_1_3()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_1__3__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_1__4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2701:1: rule__EAttribute__Group_3_1__4 : rule__EAttribute__Group_3_1__4__Impl ;
    public final void rule__EAttribute__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2705:1: ( rule__EAttribute__Group_3_1__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2706:2: rule__EAttribute__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__4__Impl_in_rule__EAttribute__Group_3_1__45425);
            rule__EAttribute__Group_3_1__4__Impl();

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
    // $ANTLR end "rule__EAttribute__Group_3_1__4"


    // $ANTLR start "rule__EAttribute__Group_3_1__4__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2712:1: rule__EAttribute__Group_3_1__4__Impl : ( ')' ) ;
    public final void rule__EAttribute__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2716:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2717:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2717:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2718:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4()); 
            }
            match(input,32,FOLLOW_32_in_rule__EAttribute__Group_3_1__4__Impl5453); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4()); 
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
    // $ANTLR end "rule__EAttribute__Group_3_1__4__Impl"


    // $ANTLR start "rule__ENamedQuery__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2741:1: rule__ENamedQuery__Group__0 : rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1 ;
    public final void rule__ENamedQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2745:1: ( rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2746:2: rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__0__Impl_in_rule__ENamedQuery__Group__05494);
            rule__ENamedQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__1_in_rule__ENamedQuery__Group__05497);
            rule__ENamedQuery__Group__1();

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
    // $ANTLR end "rule__ENamedQuery__Group__0"


    // $ANTLR start "rule__ENamedQuery__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2753:1: rule__ENamedQuery__Group__0__Impl : ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? ) ;
    public final void rule__ENamedQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2757:1: ( ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2758:1: ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2758:1: ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2759:1: ( rule__ENamedQuery__ReturnTypeAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getReturnTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2760:1: ( rule__ENamedQuery__ReturnTypeAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=14 && LA21_0<=15)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2760:2: rule__ENamedQuery__ReturnTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ENamedQuery__ReturnTypeAssignment_0_in_rule__ENamedQuery__Group__0__Impl5524);
                    rule__ENamedQuery__ReturnTypeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getReturnTypeAssignment_0()); 
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
    // $ANTLR end "rule__ENamedQuery__Group__0__Impl"


    // $ANTLR start "rule__ENamedQuery__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2770:1: rule__ENamedQuery__Group__1 : rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2 ;
    public final void rule__ENamedQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2774:1: ( rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2775:2: rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__1__Impl_in_rule__ENamedQuery__Group__15555);
            rule__ENamedQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__2_in_rule__ENamedQuery__Group__15558);
            rule__ENamedQuery__Group__2();

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
    // $ANTLR end "rule__ENamedQuery__Group__1"


    // $ANTLR start "rule__ENamedQuery__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2782:1: rule__ENamedQuery__Group__1__Impl : ( ( rule__ENamedQuery__NameAssignment_1 ) ) ;
    public final void rule__ENamedQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2786:1: ( ( ( rule__ENamedQuery__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2787:1: ( ( rule__ENamedQuery__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2787:1: ( ( rule__ENamedQuery__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2788:1: ( rule__ENamedQuery__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2789:1: ( rule__ENamedQuery__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2789:2: rule__ENamedQuery__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__NameAssignment_1_in_rule__ENamedQuery__Group__1__Impl5585);
            rule__ENamedQuery__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ENamedQuery__Group__1__Impl"


    // $ANTLR start "rule__ENamedQuery__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2799:1: rule__ENamedQuery__Group__2 : rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3 ;
    public final void rule__ENamedQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2803:1: ( rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2804:2: rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__2__Impl_in_rule__ENamedQuery__Group__25615);
            rule__ENamedQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__3_in_rule__ENamedQuery__Group__25618);
            rule__ENamedQuery__Group__3();

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
    // $ANTLR end "rule__ENamedQuery__Group__2"


    // $ANTLR start "rule__ENamedQuery__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2811:1: rule__ENamedQuery__Group__2__Impl : ( ( rule__ENamedQuery__Group_2__0 )? ) ;
    public final void rule__ENamedQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2815:1: ( ( ( rule__ENamedQuery__Group_2__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2816:1: ( ( rule__ENamedQuery__Group_2__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2816:1: ( ( rule__ENamedQuery__Group_2__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2817:1: ( rule__ENamedQuery__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getGroup_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2818:1: ( rule__ENamedQuery__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2818:2: rule__ENamedQuery__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ENamedQuery__Group_2__0_in_rule__ENamedQuery__Group__2__Impl5645);
                    rule__ENamedQuery__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ENamedQuery__Group__2__Impl"


    // $ANTLR start "rule__ENamedQuery__Group__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2828:1: rule__ENamedQuery__Group__3 : rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4 ;
    public final void rule__ENamedQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2832:1: ( rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2833:2: rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__3__Impl_in_rule__ENamedQuery__Group__35676);
            rule__ENamedQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__4_in_rule__ENamedQuery__Group__35679);
            rule__ENamedQuery__Group__4();

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
    // $ANTLR end "rule__ENamedQuery__Group__3"


    // $ANTLR start "rule__ENamedQuery__Group__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2840:1: rule__ENamedQuery__Group__3__Impl : ( '{' ) ;
    public final void rule__ENamedQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2844:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2845:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2845:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2846:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,17,FOLLOW_17_in_rule__ENamedQuery__Group__3__Impl5707); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__ENamedQuery__Group__3__Impl"


    // $ANTLR start "rule__ENamedQuery__Group__4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2859:1: rule__ENamedQuery__Group__4 : rule__ENamedQuery__Group__4__Impl rule__ENamedQuery__Group__5 ;
    public final void rule__ENamedQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2863:1: ( rule__ENamedQuery__Group__4__Impl rule__ENamedQuery__Group__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2864:2: rule__ENamedQuery__Group__4__Impl rule__ENamedQuery__Group__5
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__4__Impl_in_rule__ENamedQuery__Group__45738);
            rule__ENamedQuery__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__5_in_rule__ENamedQuery__Group__45741);
            rule__ENamedQuery__Group__5();

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
    // $ANTLR end "rule__ENamedQuery__Group__4"


    // $ANTLR start "rule__ENamedQuery__Group__4__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2871:1: rule__ENamedQuery__Group__4__Impl : ( ( rule__ENamedQuery__QueriesAssignment_4 ) ) ;
    public final void rule__ENamedQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2875:1: ( ( ( rule__ENamedQuery__QueriesAssignment_4 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2876:1: ( ( rule__ENamedQuery__QueriesAssignment_4 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2876:1: ( ( rule__ENamedQuery__QueriesAssignment_4 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2877:1: ( rule__ENamedQuery__QueriesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesAssignment_4()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2878:1: ( rule__ENamedQuery__QueriesAssignment_4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2878:2: rule__ENamedQuery__QueriesAssignment_4
            {
            pushFollow(FOLLOW_rule__ENamedQuery__QueriesAssignment_4_in_rule__ENamedQuery__Group__4__Impl5768);
            rule__ENamedQuery__QueriesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getQueriesAssignment_4()); 
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
    // $ANTLR end "rule__ENamedQuery__Group__4__Impl"


    // $ANTLR start "rule__ENamedQuery__Group__5"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2888:1: rule__ENamedQuery__Group__5 : rule__ENamedQuery__Group__5__Impl rule__ENamedQuery__Group__6 ;
    public final void rule__ENamedQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2892:1: ( rule__ENamedQuery__Group__5__Impl rule__ENamedQuery__Group__6 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2893:2: rule__ENamedQuery__Group__5__Impl rule__ENamedQuery__Group__6
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__5__Impl_in_rule__ENamedQuery__Group__55798);
            rule__ENamedQuery__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__6_in_rule__ENamedQuery__Group__55801);
            rule__ENamedQuery__Group__6();

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
    // $ANTLR end "rule__ENamedQuery__Group__5"


    // $ANTLR start "rule__ENamedQuery__Group__5__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2900:1: rule__ENamedQuery__Group__5__Impl : ( ( rule__ENamedQuery__Group_5__0 )* ) ;
    public final void rule__ENamedQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2904:1: ( ( ( rule__ENamedQuery__Group_5__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2905:1: ( ( rule__ENamedQuery__Group_5__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2905:1: ( ( rule__ENamedQuery__Group_5__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2906:1: ( rule__ENamedQuery__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getGroup_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2907:1: ( rule__ENamedQuery__Group_5__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2907:2: rule__ENamedQuery__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ENamedQuery__Group_5__0_in_rule__ENamedQuery__Group__5__Impl5828);
            	    rule__ENamedQuery__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getGroup_5()); 
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
    // $ANTLR end "rule__ENamedQuery__Group__5__Impl"


    // $ANTLR start "rule__ENamedQuery__Group__6"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2917:1: rule__ENamedQuery__Group__6 : rule__ENamedQuery__Group__6__Impl ;
    public final void rule__ENamedQuery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2921:1: ( rule__ENamedQuery__Group__6__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2922:2: rule__ENamedQuery__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__6__Impl_in_rule__ENamedQuery__Group__65859);
            rule__ENamedQuery__Group__6__Impl();

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
    // $ANTLR end "rule__ENamedQuery__Group__6"


    // $ANTLR start "rule__ENamedQuery__Group__6__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2928:1: rule__ENamedQuery__Group__6__Impl : ( '}' ) ;
    public final void rule__ENamedQuery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2932:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2933:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2933:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2934:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,18,FOLLOW_18_in_rule__ENamedQuery__Group__6__Impl5887); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__ENamedQuery__Group__6__Impl"


    // $ANTLR start "rule__ENamedQuery__Group_2__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2961:1: rule__ENamedQuery__Group_2__0 : rule__ENamedQuery__Group_2__0__Impl rule__ENamedQuery__Group_2__1 ;
    public final void rule__ENamedQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2965:1: ( rule__ENamedQuery__Group_2__0__Impl rule__ENamedQuery__Group_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2966:2: rule__ENamedQuery__Group_2__0__Impl rule__ENamedQuery__Group_2__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__0__Impl_in_rule__ENamedQuery__Group_2__05932);
            rule__ENamedQuery__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__1_in_rule__ENamedQuery__Group_2__05935);
            rule__ENamedQuery__Group_2__1();

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
    // $ANTLR end "rule__ENamedQuery__Group_2__0"


    // $ANTLR start "rule__ENamedQuery__Group_2__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2973:1: rule__ENamedQuery__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ENamedQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2977:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2978:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2978:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2979:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ENamedQuery__Group_2__0__Impl5963); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__ENamedQuery__Group_2__0__Impl"


    // $ANTLR start "rule__ENamedQuery__Group_2__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2992:1: rule__ENamedQuery__Group_2__1 : rule__ENamedQuery__Group_2__1__Impl rule__ENamedQuery__Group_2__2 ;
    public final void rule__ENamedQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2996:1: ( rule__ENamedQuery__Group_2__1__Impl rule__ENamedQuery__Group_2__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2997:2: rule__ENamedQuery__Group_2__1__Impl rule__ENamedQuery__Group_2__2
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__1__Impl_in_rule__ENamedQuery__Group_2__15994);
            rule__ENamedQuery__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__2_in_rule__ENamedQuery__Group_2__15997);
            rule__ENamedQuery__Group_2__2();

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
    // $ANTLR end "rule__ENamedQuery__Group_2__1"


    // $ANTLR start "rule__ENamedQuery__Group_2__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3004:1: rule__ENamedQuery__Group_2__1__Impl : ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* ) ;
    public final void rule__ENamedQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3008:1: ( ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3009:1: ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3009:1: ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3010:1: ( rule__ENamedQuery__ParametersAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getParametersAssignment_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3011:1: ( rule__ENamedQuery__ParametersAssignment_2_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3011:2: rule__ENamedQuery__ParametersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__ENamedQuery__ParametersAssignment_2_1_in_rule__ENamedQuery__Group_2__1__Impl6024);
            	    rule__ENamedQuery__ParametersAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getParametersAssignment_2_1()); 
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
    // $ANTLR end "rule__ENamedQuery__Group_2__1__Impl"


    // $ANTLR start "rule__ENamedQuery__Group_2__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3021:1: rule__ENamedQuery__Group_2__2 : rule__ENamedQuery__Group_2__2__Impl ;
    public final void rule__ENamedQuery__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3025:1: ( rule__ENamedQuery__Group_2__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3026:2: rule__ENamedQuery__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__2__Impl_in_rule__ENamedQuery__Group_2__26055);
            rule__ENamedQuery__Group_2__2__Impl();

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
    // $ANTLR end "rule__ENamedQuery__Group_2__2"


    // $ANTLR start "rule__ENamedQuery__Group_2__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3032:1: rule__ENamedQuery__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ENamedQuery__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3036:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3037:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3037:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3038:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ENamedQuery__Group_2__2__Impl6083); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__ENamedQuery__Group_2__2__Impl"


    // $ANTLR start "rule__ENamedQuery__Group_5__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3057:1: rule__ENamedQuery__Group_5__0 : rule__ENamedQuery__Group_5__0__Impl rule__ENamedQuery__Group_5__1 ;
    public final void rule__ENamedQuery__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3061:1: ( rule__ENamedQuery__Group_5__0__Impl rule__ENamedQuery__Group_5__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3062:2: rule__ENamedQuery__Group_5__0__Impl rule__ENamedQuery__Group_5__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_5__0__Impl_in_rule__ENamedQuery__Group_5__06120);
            rule__ENamedQuery__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_5__1_in_rule__ENamedQuery__Group_5__06123);
            rule__ENamedQuery__Group_5__1();

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
    // $ANTLR end "rule__ENamedQuery__Group_5__0"


    // $ANTLR start "rule__ENamedQuery__Group_5__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3069:1: rule__ENamedQuery__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ENamedQuery__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3073:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3074:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3074:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3075:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getCommaKeyword_5_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__ENamedQuery__Group_5__0__Impl6151); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getCommaKeyword_5_0()); 
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
    // $ANTLR end "rule__ENamedQuery__Group_5__0__Impl"


    // $ANTLR start "rule__ENamedQuery__Group_5__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3088:1: rule__ENamedQuery__Group_5__1 : rule__ENamedQuery__Group_5__1__Impl ;
    public final void rule__ENamedQuery__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3092:1: ( rule__ENamedQuery__Group_5__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3093:2: rule__ENamedQuery__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_5__1__Impl_in_rule__ENamedQuery__Group_5__16182);
            rule__ENamedQuery__Group_5__1__Impl();

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
    // $ANTLR end "rule__ENamedQuery__Group_5__1"


    // $ANTLR start "rule__ENamedQuery__Group_5__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3099:1: rule__ENamedQuery__Group_5__1__Impl : ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) ) ;
    public final void rule__ENamedQuery__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3103:1: ( ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3104:1: ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3104:1: ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3105:1: ( rule__ENamedQuery__QueriesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesAssignment_5_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3106:1: ( rule__ENamedQuery__QueriesAssignment_5_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3106:2: rule__ENamedQuery__QueriesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__QueriesAssignment_5_1_in_rule__ENamedQuery__Group_5__1__Impl6209);
            rule__ENamedQuery__QueriesAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getQueriesAssignment_5_1()); 
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
    // $ANTLR end "rule__ENamedQuery__Group_5__1__Impl"


    // $ANTLR start "rule__EParameter__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3120:1: rule__EParameter__Group__0 : rule__EParameter__Group__0__Impl rule__EParameter__Group__1 ;
    public final void rule__EParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3124:1: ( rule__EParameter__Group__0__Impl rule__EParameter__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3125:2: rule__EParameter__Group__0__Impl rule__EParameter__Group__1
            {
            pushFollow(FOLLOW_rule__EParameter__Group__0__Impl_in_rule__EParameter__Group__06243);
            rule__EParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EParameter__Group__1_in_rule__EParameter__Group__06246);
            rule__EParameter__Group__1();

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
    // $ANTLR end "rule__EParameter__Group__0"


    // $ANTLR start "rule__EParameter__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3132:1: rule__EParameter__Group__0__Impl : ( ( rule__EParameter__TypeAssignment_0 ) ) ;
    public final void rule__EParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3136:1: ( ( ( rule__EParameter__TypeAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3137:1: ( ( rule__EParameter__TypeAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3137:1: ( ( rule__EParameter__TypeAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3138:1: ( rule__EParameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3139:1: ( rule__EParameter__TypeAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3139:2: rule__EParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EParameter__TypeAssignment_0_in_rule__EParameter__Group__0__Impl6273);
            rule__EParameter__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEParameterAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__EParameter__Group__0__Impl"


    // $ANTLR start "rule__EParameter__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3149:1: rule__EParameter__Group__1 : rule__EParameter__Group__1__Impl ;
    public final void rule__EParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3153:1: ( rule__EParameter__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3154:2: rule__EParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EParameter__Group__1__Impl_in_rule__EParameter__Group__16303);
            rule__EParameter__Group__1__Impl();

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
    // $ANTLR end "rule__EParameter__Group__1"


    // $ANTLR start "rule__EParameter__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3160:1: rule__EParameter__Group__1__Impl : ( ( rule__EParameter__NameAssignment_1 ) ) ;
    public final void rule__EParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3164:1: ( ( ( rule__EParameter__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3165:1: ( ( rule__EParameter__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3165:1: ( ( rule__EParameter__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3166:1: ( rule__EParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3167:1: ( rule__EParameter__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3167:2: rule__EParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EParameter__NameAssignment_1_in_rule__EParameter__Group__1__Impl6330);
            rule__EParameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEParameterAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__EParameter__Group__1__Impl"


    // $ANTLR start "rule__EQuery__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3181:1: rule__EQuery__Group__0 : rule__EQuery__Group__0__Impl rule__EQuery__Group__1 ;
    public final void rule__EQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3185:1: ( rule__EQuery__Group__0__Impl rule__EQuery__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3186:2: rule__EQuery__Group__0__Impl rule__EQuery__Group__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group__0__Impl_in_rule__EQuery__Group__06364);
            rule__EQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group__1_in_rule__EQuery__Group__06367);
            rule__EQuery__Group__1();

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
    // $ANTLR end "rule__EQuery__Group__0"


    // $ANTLR start "rule__EQuery__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3193:1: rule__EQuery__Group__0__Impl : ( ( rule__EQuery__DbTypeAssignment_0 ) ) ;
    public final void rule__EQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3197:1: ( ( ( rule__EQuery__DbTypeAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3198:1: ( ( rule__EQuery__DbTypeAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3198:1: ( ( rule__EQuery__DbTypeAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3199:1: ( rule__EQuery__DbTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getDbTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3200:1: ( rule__EQuery__DbTypeAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3200:2: rule__EQuery__DbTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EQuery__DbTypeAssignment_0_in_rule__EQuery__Group__0__Impl6394);
            rule__EQuery__DbTypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getDbTypeAssignment_0()); 
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
    // $ANTLR end "rule__EQuery__Group__0__Impl"


    // $ANTLR start "rule__EQuery__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3210:1: rule__EQuery__Group__1 : rule__EQuery__Group__1__Impl rule__EQuery__Group__2 ;
    public final void rule__EQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3214:1: ( rule__EQuery__Group__1__Impl rule__EQuery__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3215:2: rule__EQuery__Group__1__Impl rule__EQuery__Group__2
            {
            pushFollow(FOLLOW_rule__EQuery__Group__1__Impl_in_rule__EQuery__Group__16424);
            rule__EQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group__2_in_rule__EQuery__Group__16427);
            rule__EQuery__Group__2();

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
    // $ANTLR end "rule__EQuery__Group__1"


    // $ANTLR start "rule__EQuery__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3222:1: rule__EQuery__Group__1__Impl : ( ( rule__EQuery__MappingAssignment_1 ) ) ;
    public final void rule__EQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3226:1: ( ( ( rule__EQuery__MappingAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3227:1: ( ( rule__EQuery__MappingAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3227:1: ( ( rule__EQuery__MappingAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3228:1: ( rule__EQuery__MappingAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getMappingAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3229:1: ( rule__EQuery__MappingAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3229:2: rule__EQuery__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__EQuery__MappingAssignment_1_in_rule__EQuery__Group__1__Impl6454);
            rule__EQuery__MappingAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getMappingAssignment_1()); 
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
    // $ANTLR end "rule__EQuery__Group__1__Impl"


    // $ANTLR start "rule__EQuery__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3239:1: rule__EQuery__Group__2 : rule__EQuery__Group__2__Impl ;
    public final void rule__EQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3243:1: ( rule__EQuery__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3244:2: rule__EQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group__2__Impl_in_rule__EQuery__Group__26484);
            rule__EQuery__Group__2__Impl();

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
    // $ANTLR end "rule__EQuery__Group__2"


    // $ANTLR start "rule__EQuery__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3250:1: rule__EQuery__Group__2__Impl : ( ( rule__EQuery__Alternatives_2 ) ) ;
    public final void rule__EQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3254:1: ( ( ( rule__EQuery__Alternatives_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3255:1: ( ( rule__EQuery__Alternatives_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3255:1: ( ( rule__EQuery__Alternatives_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3256:1: ( rule__EQuery__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getAlternatives_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3257:1: ( rule__EQuery__Alternatives_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3257:2: rule__EQuery__Alternatives_2
            {
            pushFollow(FOLLOW_rule__EQuery__Alternatives_2_in_rule__EQuery__Group__2__Impl6511);
            rule__EQuery__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__EQuery__Group__2__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3273:1: rule__EQuery__Group_2_0__0 : rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1 ;
    public final void rule__EQuery__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3277:1: ( rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3278:2: rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__0__Impl_in_rule__EQuery__Group_2_0__06547);
            rule__EQuery__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__1_in_rule__EQuery__Group_2_0__06550);
            rule__EQuery__Group_2_0__1();

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
    // $ANTLR end "rule__EQuery__Group_2_0__0"


    // $ANTLR start "rule__EQuery__Group_2_0__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3285:1: rule__EQuery__Group_2_0__0__Impl : ( 'FROM' ) ;
    public final void rule__EQuery__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3289:1: ( ( 'FROM' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3290:1: ( 'FROM' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3290:1: ( 'FROM' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3291:1: 'FROM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__EQuery__Group_2_0__0__Impl6578); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0__0__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3304:1: rule__EQuery__Group_2_0__1 : rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2 ;
    public final void rule__EQuery__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3308:1: ( rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3309:2: rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__1__Impl_in_rule__EQuery__Group_2_0__16609);
            rule__EQuery__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__2_in_rule__EQuery__Group_2_0__16612);
            rule__EQuery__Group_2_0__2();

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
    // $ANTLR end "rule__EQuery__Group_2_0__1"


    // $ANTLR start "rule__EQuery__Group_2_0__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3316:1: rule__EQuery__Group_2_0__1__Impl : ( ( rule__EQuery__FromAssignment_2_0_1 ) ) ;
    public final void rule__EQuery__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3320:1: ( ( ( rule__EQuery__FromAssignment_2_0_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3321:1: ( ( rule__EQuery__FromAssignment_2_0_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3321:1: ( ( rule__EQuery__FromAssignment_2_0_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3322:1: ( rule__EQuery__FromAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFromAssignment_2_0_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3323:1: ( rule__EQuery__FromAssignment_2_0_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3323:2: rule__EQuery__FromAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__EQuery__FromAssignment_2_0_1_in_rule__EQuery__Group_2_0__1__Impl6639);
            rule__EQuery__FromAssignment_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getFromAssignment_2_0_1()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0__1__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3333:1: rule__EQuery__Group_2_0__2 : rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3 ;
    public final void rule__EQuery__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3337:1: ( rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3338:2: rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__2__Impl_in_rule__EQuery__Group_2_0__26669);
            rule__EQuery__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__3_in_rule__EQuery__Group_2_0__26672);
            rule__EQuery__Group_2_0__3();

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
    // $ANTLR end "rule__EQuery__Group_2_0__2"


    // $ANTLR start "rule__EQuery__Group_2_0__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3345:1: rule__EQuery__Group_2_0__2__Impl : ( ( rule__EQuery__Group_2_0_2__0 )? ) ;
    public final void rule__EQuery__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3349:1: ( ( ( rule__EQuery__Group_2_0_2__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3350:1: ( ( rule__EQuery__Group_2_0_2__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3350:1: ( ( rule__EQuery__Group_2_0_2__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3351:1: ( rule__EQuery__Group_2_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3352:1: ( rule__EQuery__Group_2_0_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3352:2: rule__EQuery__Group_2_0_2__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__0_in_rule__EQuery__Group_2_0__2__Impl6699);
                    rule__EQuery__Group_2_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getGroup_2_0_2()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0__2__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3362:1: rule__EQuery__Group_2_0__3 : rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4 ;
    public final void rule__EQuery__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3366:1: ( rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3367:2: rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__3__Impl_in_rule__EQuery__Group_2_0__36730);
            rule__EQuery__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__4_in_rule__EQuery__Group_2_0__36733);
            rule__EQuery__Group_2_0__4();

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
    // $ANTLR end "rule__EQuery__Group_2_0__3"


    // $ANTLR start "rule__EQuery__Group_2_0__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3374:1: rule__EQuery__Group_2_0__3__Impl : ( ( rule__EQuery__Group_2_0_3__0 )? ) ;
    public final void rule__EQuery__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3378:1: ( ( ( rule__EQuery__Group_2_0_3__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3379:1: ( ( rule__EQuery__Group_2_0_3__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3379:1: ( ( rule__EQuery__Group_2_0_3__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3380:1: ( rule__EQuery__Group_2_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3381:1: ( rule__EQuery__Group_2_0_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3381:2: rule__EQuery__Group_2_0_3__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__0_in_rule__EQuery__Group_2_0__3__Impl6760);
                    rule__EQuery__Group_2_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getGroup_2_0_3()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0__3__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0__4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3391:1: rule__EQuery__Group_2_0__4 : rule__EQuery__Group_2_0__4__Impl ;
    public final void rule__EQuery__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3395:1: ( rule__EQuery__Group_2_0__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3396:2: rule__EQuery__Group_2_0__4__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__4__Impl_in_rule__EQuery__Group_2_0__46791);
            rule__EQuery__Group_2_0__4__Impl();

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
    // $ANTLR end "rule__EQuery__Group_2_0__4"


    // $ANTLR start "rule__EQuery__Group_2_0__4__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3402:1: rule__EQuery__Group_2_0__4__Impl : ( ( rule__EQuery__Group_2_0_4__0 )? ) ;
    public final void rule__EQuery__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3406:1: ( ( ( rule__EQuery__Group_2_0_4__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3407:1: ( ( rule__EQuery__Group_2_0_4__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3407:1: ( ( rule__EQuery__Group_2_0_4__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3408:1: ( rule__EQuery__Group_2_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_4()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3409:1: ( rule__EQuery__Group_2_0_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3409:2: rule__EQuery__Group_2_0_4__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__0_in_rule__EQuery__Group_2_0__4__Impl6818);
                    rule__EQuery__Group_2_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getGroup_2_0_4()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0__4__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0_2__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3429:1: rule__EQuery__Group_2_0_2__0 : rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1 ;
    public final void rule__EQuery__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3433:1: ( rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3434:2: rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__0__Impl_in_rule__EQuery__Group_2_0_2__06859);
            rule__EQuery__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__1_in_rule__EQuery__Group_2_0_2__06862);
            rule__EQuery__Group_2_0_2__1();

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
    // $ANTLR end "rule__EQuery__Group_2_0_2__0"


    // $ANTLR start "rule__EQuery__Group_2_0_2__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3441:1: rule__EQuery__Group_2_0_2__0__Impl : ( 'WHERE' ) ;
    public final void rule__EQuery__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3445:1: ( ( 'WHERE' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3446:1: ( 'WHERE' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3446:1: ( 'WHERE' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3447:1: 'WHERE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__EQuery__Group_2_0_2__0__Impl6890); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0_2__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3460:1: rule__EQuery__Group_2_0_2__1 : rule__EQuery__Group_2_0_2__1__Impl ;
    public final void rule__EQuery__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3464:1: ( rule__EQuery__Group_2_0_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3465:2: rule__EQuery__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__1__Impl_in_rule__EQuery__Group_2_0_2__16921);
            rule__EQuery__Group_2_0_2__1__Impl();

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
    // $ANTLR end "rule__EQuery__Group_2_0_2__1"


    // $ANTLR start "rule__EQuery__Group_2_0_2__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3471:1: rule__EQuery__Group_2_0_2__1__Impl : ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) ) ;
    public final void rule__EQuery__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3475:1: ( ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3476:1: ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3476:1: ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3477:1: ( rule__EQuery__WhereAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWhereAssignment_2_0_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3478:1: ( rule__EQuery__WhereAssignment_2_0_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3478:2: rule__EQuery__WhereAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_rule__EQuery__WhereAssignment_2_0_2_1_in_rule__EQuery__Group_2_0_2__1__Impl6948);
            rule__EQuery__WhereAssignment_2_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getWhereAssignment_2_0_2_1()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0_3__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3492:1: rule__EQuery__Group_2_0_3__0 : rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1 ;
    public final void rule__EQuery__Group_2_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3496:1: ( rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3497:2: rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__0__Impl_in_rule__EQuery__Group_2_0_3__06982);
            rule__EQuery__Group_2_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__1_in_rule__EQuery__Group_2_0_3__06985);
            rule__EQuery__Group_2_0_3__1();

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
    // $ANTLR end "rule__EQuery__Group_2_0_3__0"


    // $ANTLR start "rule__EQuery__Group_2_0_3__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3504:1: rule__EQuery__Group_2_0_3__0__Impl : ( 'GROUP BY' ) ;
    public final void rule__EQuery__Group_2_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3508:1: ( ( 'GROUP BY' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3509:1: ( 'GROUP BY' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3509:1: ( 'GROUP BY' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3510:1: 'GROUP BY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__EQuery__Group_2_0_3__0__Impl7013); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0_3__0__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0_3__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3523:1: rule__EQuery__Group_2_0_3__1 : rule__EQuery__Group_2_0_3__1__Impl ;
    public final void rule__EQuery__Group_2_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3527:1: ( rule__EQuery__Group_2_0_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3528:2: rule__EQuery__Group_2_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__1__Impl_in_rule__EQuery__Group_2_0_3__17044);
            rule__EQuery__Group_2_0_3__1__Impl();

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
    // $ANTLR end "rule__EQuery__Group_2_0_3__1"


    // $ANTLR start "rule__EQuery__Group_2_0_3__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3534:1: rule__EQuery__Group_2_0_3__1__Impl : ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) ) ;
    public final void rule__EQuery__Group_2_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3538:1: ( ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3539:1: ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3539:1: ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3540:1: ( rule__EQuery__GroupByAssignment_2_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroupByAssignment_2_0_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3541:1: ( rule__EQuery__GroupByAssignment_2_0_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3541:2: rule__EQuery__GroupByAssignment_2_0_3_1
            {
            pushFollow(FOLLOW_rule__EQuery__GroupByAssignment_2_0_3_1_in_rule__EQuery__Group_2_0_3__1__Impl7071);
            rule__EQuery__GroupByAssignment_2_0_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getGroupByAssignment_2_0_3_1()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0_3__1__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0_4__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3555:1: rule__EQuery__Group_2_0_4__0 : rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1 ;
    public final void rule__EQuery__Group_2_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3559:1: ( rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3560:2: rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__0__Impl_in_rule__EQuery__Group_2_0_4__07105);
            rule__EQuery__Group_2_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__1_in_rule__EQuery__Group_2_0_4__07108);
            rule__EQuery__Group_2_0_4__1();

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
    // $ANTLR end "rule__EQuery__Group_2_0_4__0"


    // $ANTLR start "rule__EQuery__Group_2_0_4__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3567:1: rule__EQuery__Group_2_0_4__0__Impl : ( 'ORDER BY' ) ;
    public final void rule__EQuery__Group_2_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3571:1: ( ( 'ORDER BY' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3572:1: ( 'ORDER BY' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3572:1: ( 'ORDER BY' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3573:1: 'ORDER BY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__EQuery__Group_2_0_4__0__Impl7136); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0_4__0__Impl"


    // $ANTLR start "rule__EQuery__Group_2_0_4__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3586:1: rule__EQuery__Group_2_0_4__1 : rule__EQuery__Group_2_0_4__1__Impl ;
    public final void rule__EQuery__Group_2_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3590:1: ( rule__EQuery__Group_2_0_4__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3591:2: rule__EQuery__Group_2_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__1__Impl_in_rule__EQuery__Group_2_0_4__17167);
            rule__EQuery__Group_2_0_4__1__Impl();

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
    // $ANTLR end "rule__EQuery__Group_2_0_4__1"


    // $ANTLR start "rule__EQuery__Group_2_0_4__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3597:1: rule__EQuery__Group_2_0_4__1__Impl : ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) ) ;
    public final void rule__EQuery__Group_2_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3601:1: ( ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3602:1: ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3602:1: ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3603:1: ( rule__EQuery__OrderbyAssignment_2_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getOrderbyAssignment_2_0_4_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3604:1: ( rule__EQuery__OrderbyAssignment_2_0_4_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3604:2: rule__EQuery__OrderbyAssignment_2_0_4_1
            {
            pushFollow(FOLLOW_rule__EQuery__OrderbyAssignment_2_0_4_1_in_rule__EQuery__Group_2_0_4__1__Impl7194);
            rule__EQuery__OrderbyAssignment_2_0_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getOrderbyAssignment_2_0_4_1()); 
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
    // $ANTLR end "rule__EQuery__Group_2_0_4__1__Impl"


    // $ANTLR start "rule__EObjectSection__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3618:1: rule__EObjectSection__Group__0 : rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1 ;
    public final void rule__EObjectSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3622:1: ( rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3623:2: rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__0__Impl_in_rule__EObjectSection__Group__07228);
            rule__EObjectSection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group__1_in_rule__EObjectSection__Group__07231);
            rule__EObjectSection__Group__1();

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
    // $ANTLR end "rule__EObjectSection__Group__0"


    // $ANTLR start "rule__EObjectSection__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3630:1: rule__EObjectSection__Group__0__Impl : ( ( rule__EObjectSection__EntityAssignment_0 ) ) ;
    public final void rule__EObjectSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3634:1: ( ( ( rule__EObjectSection__EntityAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3635:1: ( ( rule__EObjectSection__EntityAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3635:1: ( ( rule__EObjectSection__EntityAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3636:1: ( rule__EObjectSection__EntityAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3637:1: ( rule__EObjectSection__EntityAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3637:2: rule__EObjectSection__EntityAssignment_0
            {
            pushFollow(FOLLOW_rule__EObjectSection__EntityAssignment_0_in_rule__EObjectSection__Group__0__Impl7258);
            rule__EObjectSection__EntityAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getEntityAssignment_0()); 
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
    // $ANTLR end "rule__EObjectSection__Group__0__Impl"


    // $ANTLR start "rule__EObjectSection__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3647:1: rule__EObjectSection__Group__1 : rule__EObjectSection__Group__1__Impl ;
    public final void rule__EObjectSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3651:1: ( rule__EObjectSection__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3652:2: rule__EObjectSection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__1__Impl_in_rule__EObjectSection__Group__17288);
            rule__EObjectSection__Group__1__Impl();

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
    // $ANTLR end "rule__EObjectSection__Group__1"


    // $ANTLR start "rule__EObjectSection__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3658:1: rule__EObjectSection__Group__1__Impl : ( ( rule__EObjectSection__Group_1__0 )? ) ;
    public final void rule__EObjectSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3662:1: ( ( ( rule__EObjectSection__Group_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3663:1: ( ( rule__EObjectSection__Group_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3663:1: ( ( rule__EObjectSection__Group_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3664:1: ( rule__EObjectSection__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3665:1: ( rule__EObjectSection__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3665:2: rule__EObjectSection__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EObjectSection__Group_1__0_in_rule__EObjectSection__Group__1__Impl7315);
                    rule__EObjectSection__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__EObjectSection__Group__1__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3679:1: rule__EObjectSection__Group_1__0 : rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1 ;
    public final void rule__EObjectSection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3683:1: ( rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3684:2: rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__0__Impl_in_rule__EObjectSection__Group_1__07350);
            rule__EObjectSection__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__1_in_rule__EObjectSection__Group_1__07353);
            rule__EObjectSection__Group_1__1();

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
    // $ANTLR end "rule__EObjectSection__Group_1__0"


    // $ANTLR start "rule__EObjectSection__Group_1__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3691:1: rule__EObjectSection__Group_1__0__Impl : ( ( rule__EObjectSection__PrefixAssignment_1_0 ) ) ;
    public final void rule__EObjectSection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3695:1: ( ( ( rule__EObjectSection__PrefixAssignment_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3696:1: ( ( rule__EObjectSection__PrefixAssignment_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3696:1: ( ( rule__EObjectSection__PrefixAssignment_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3697:1: ( rule__EObjectSection__PrefixAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getPrefixAssignment_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3698:1: ( rule__EObjectSection__PrefixAssignment_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3698:2: rule__EObjectSection__PrefixAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EObjectSection__PrefixAssignment_1_0_in_rule__EObjectSection__Group_1__0__Impl7380);
            rule__EObjectSection__PrefixAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getPrefixAssignment_1_0()); 
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
    // $ANTLR end "rule__EObjectSection__Group_1__0__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3708:1: rule__EObjectSection__Group_1__1 : rule__EObjectSection__Group_1__1__Impl ;
    public final void rule__EObjectSection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3712:1: ( rule__EObjectSection__Group_1__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3713:2: rule__EObjectSection__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__1__Impl_in_rule__EObjectSection__Group_1__17410);
            rule__EObjectSection__Group_1__1__Impl();

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
    // $ANTLR end "rule__EObjectSection__Group_1__1"


    // $ANTLR start "rule__EObjectSection__Group_1__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3719:1: rule__EObjectSection__Group_1__1__Impl : ( ( rule__EObjectSection__Group_1_1__0 )? ) ;
    public final void rule__EObjectSection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3723:1: ( ( ( rule__EObjectSection__Group_1_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3724:1: ( ( rule__EObjectSection__Group_1_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3724:1: ( ( rule__EObjectSection__Group_1_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3725:1: ( rule__EObjectSection__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3726:1: ( rule__EObjectSection__Group_1_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3726:2: rule__EObjectSection__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__0_in_rule__EObjectSection__Group_1__1__Impl7437);
                    rule__EObjectSection__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__EObjectSection__Group_1__1__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3740:1: rule__EObjectSection__Group_1_1__0 : rule__EObjectSection__Group_1_1__0__Impl rule__EObjectSection__Group_1_1__1 ;
    public final void rule__EObjectSection__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3744:1: ( rule__EObjectSection__Group_1_1__0__Impl rule__EObjectSection__Group_1_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3745:2: rule__EObjectSection__Group_1_1__0__Impl rule__EObjectSection__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__0__Impl_in_rule__EObjectSection__Group_1_1__07472);
            rule__EObjectSection__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__1_in_rule__EObjectSection__Group_1_1__07475);
            rule__EObjectSection__Group_1_1__1();

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
    // $ANTLR end "rule__EObjectSection__Group_1_1__0"


    // $ANTLR start "rule__EObjectSection__Group_1_1__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3752:1: rule__EObjectSection__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__EObjectSection__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3756:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3757:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3757:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3758:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__EObjectSection__Group_1_1__0__Impl7503); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_1_1_0()); 
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
    // $ANTLR end "rule__EObjectSection__Group_1_1__0__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1_1__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3771:1: rule__EObjectSection__Group_1_1__1 : rule__EObjectSection__Group_1_1__1__Impl rule__EObjectSection__Group_1_1__2 ;
    public final void rule__EObjectSection__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3775:1: ( rule__EObjectSection__Group_1_1__1__Impl rule__EObjectSection__Group_1_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3776:2: rule__EObjectSection__Group_1_1__1__Impl rule__EObjectSection__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__1__Impl_in_rule__EObjectSection__Group_1_1__17534);
            rule__EObjectSection__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__2_in_rule__EObjectSection__Group_1_1__17537);
            rule__EObjectSection__Group_1_1__2();

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
    // $ANTLR end "rule__EObjectSection__Group_1_1__1"


    // $ANTLR start "rule__EObjectSection__Group_1_1__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3783:1: rule__EObjectSection__Group_1_1__1__Impl : ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) ) ;
    public final void rule__EObjectSection__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3787:1: ( ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3788:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3788:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3789:1: ( rule__EObjectSection__AttributesAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_1_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3790:1: ( rule__EObjectSection__AttributesAssignment_1_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3790:2: rule__EObjectSection__AttributesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_1_in_rule__EObjectSection__Group_1_1__1__Impl7564);
            rule__EObjectSection__AttributesAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_1_1_1()); 
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
    // $ANTLR end "rule__EObjectSection__Group_1_1__1__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1_1__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3800:1: rule__EObjectSection__Group_1_1__2 : rule__EObjectSection__Group_1_1__2__Impl rule__EObjectSection__Group_1_1__3 ;
    public final void rule__EObjectSection__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3804:1: ( rule__EObjectSection__Group_1_1__2__Impl rule__EObjectSection__Group_1_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3805:2: rule__EObjectSection__Group_1_1__2__Impl rule__EObjectSection__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__2__Impl_in_rule__EObjectSection__Group_1_1__27594);
            rule__EObjectSection__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__3_in_rule__EObjectSection__Group_1_1__27597);
            rule__EObjectSection__Group_1_1__3();

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
    // $ANTLR end "rule__EObjectSection__Group_1_1__2"


    // $ANTLR start "rule__EObjectSection__Group_1_1__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3812:1: rule__EObjectSection__Group_1_1__2__Impl : ( ( rule__EObjectSection__Group_1_1_2__0 )* ) ;
    public final void rule__EObjectSection__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3816:1: ( ( ( rule__EObjectSection__Group_1_1_2__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3817:1: ( ( rule__EObjectSection__Group_1_1_2__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3817:1: ( ( rule__EObjectSection__Group_1_1_2__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3818:1: ( rule__EObjectSection__Group_1_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1_1_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3819:1: ( rule__EObjectSection__Group_1_1_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==19) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3819:2: rule__EObjectSection__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__0_in_rule__EObjectSection__Group_1_1__2__Impl7624);
            	    rule__EObjectSection__Group_1_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getGroup_1_1_2()); 
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
    // $ANTLR end "rule__EObjectSection__Group_1_1__2__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1_1__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3829:1: rule__EObjectSection__Group_1_1__3 : rule__EObjectSection__Group_1_1__3__Impl ;
    public final void rule__EObjectSection__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3833:1: ( rule__EObjectSection__Group_1_1__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3834:2: rule__EObjectSection__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__3__Impl_in_rule__EObjectSection__Group_1_1__37655);
            rule__EObjectSection__Group_1_1__3__Impl();

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
    // $ANTLR end "rule__EObjectSection__Group_1_1__3"


    // $ANTLR start "rule__EObjectSection__Group_1_1__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3840:1: rule__EObjectSection__Group_1_1__3__Impl : ( '}' ) ;
    public final void rule__EObjectSection__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3844:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3845:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3845:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3846:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getRightCurlyBracketKeyword_1_1_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__EObjectSection__Group_1_1__3__Impl7683); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getRightCurlyBracketKeyword_1_1_3()); 
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
    // $ANTLR end "rule__EObjectSection__Group_1_1__3__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1_1_2__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3867:1: rule__EObjectSection__Group_1_1_2__0 : rule__EObjectSection__Group_1_1_2__0__Impl rule__EObjectSection__Group_1_1_2__1 ;
    public final void rule__EObjectSection__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3871:1: ( rule__EObjectSection__Group_1_1_2__0__Impl rule__EObjectSection__Group_1_1_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3872:2: rule__EObjectSection__Group_1_1_2__0__Impl rule__EObjectSection__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__0__Impl_in_rule__EObjectSection__Group_1_1_2__07722);
            rule__EObjectSection__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__1_in_rule__EObjectSection__Group_1_1_2__07725);
            rule__EObjectSection__Group_1_1_2__1();

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
    // $ANTLR end "rule__EObjectSection__Group_1_1_2__0"


    // $ANTLR start "rule__EObjectSection__Group_1_1_2__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3879:1: rule__EObjectSection__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__EObjectSection__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3883:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3884:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3884:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3885:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_1_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EObjectSection__Group_1_1_2__0__Impl7753); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_1_2_0()); 
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
    // $ANTLR end "rule__EObjectSection__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1_1_2__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3898:1: rule__EObjectSection__Group_1_1_2__1 : rule__EObjectSection__Group_1_1_2__1__Impl ;
    public final void rule__EObjectSection__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3902:1: ( rule__EObjectSection__Group_1_1_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3903:2: rule__EObjectSection__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__1__Impl_in_rule__EObjectSection__Group_1_1_2__17784);
            rule__EObjectSection__Group_1_1_2__1__Impl();

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
    // $ANTLR end "rule__EObjectSection__Group_1_1_2__1"


    // $ANTLR start "rule__EObjectSection__Group_1_1_2__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3909:1: rule__EObjectSection__Group_1_1_2__1__Impl : ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) ) ;
    public final void rule__EObjectSection__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3913:1: ( ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3914:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3914:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3915:1: ( rule__EObjectSection__AttributesAssignment_1_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_1_1_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3916:1: ( rule__EObjectSection__AttributesAssignment_1_1_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3916:2: rule__EObjectSection__AttributesAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_2_1_in_rule__EObjectSection__Group_1_1_2__1__Impl7811);
            rule__EObjectSection__AttributesAssignment_1_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_1_1_2_1()); 
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
    // $ANTLR end "rule__EObjectSection__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3930:1: rule__EMappingAttribute__Group__0 : rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1 ;
    public final void rule__EMappingAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3934:1: ( rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3935:2: rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__0__Impl_in_rule__EMappingAttribute__Group__07845);
            rule__EMappingAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__1_in_rule__EMappingAttribute__Group__07848);
            rule__EMappingAttribute__Group__1();

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
    // $ANTLR end "rule__EMappingAttribute__Group__0"


    // $ANTLR start "rule__EMappingAttribute__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3942:1: rule__EMappingAttribute__Group__0__Impl : ( ( rule__EMappingAttribute__PkAssignment_0 )? ) ;
    public final void rule__EMappingAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3946:1: ( ( ( rule__EMappingAttribute__PkAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3947:1: ( ( rule__EMappingAttribute__PkAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3947:1: ( ( rule__EMappingAttribute__PkAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3948:1: ( rule__EMappingAttribute__PkAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3949:1: ( rule__EMappingAttribute__PkAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3949:2: rule__EMappingAttribute__PkAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__PkAssignment_0_in_rule__EMappingAttribute__Group__0__Impl7875);
                    rule__EMappingAttribute__PkAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getPkAssignment_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group__0__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3959:1: rule__EMappingAttribute__Group__1 : rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2 ;
    public final void rule__EMappingAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3963:1: ( rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3964:2: rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__1__Impl_in_rule__EMappingAttribute__Group__17906);
            rule__EMappingAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__2_in_rule__EMappingAttribute__Group__17909);
            rule__EMappingAttribute__Group__2();

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
    // $ANTLR end "rule__EMappingAttribute__Group__1"


    // $ANTLR start "rule__EMappingAttribute__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3971:1: rule__EMappingAttribute__Group__1__Impl : ( ( rule__EMappingAttribute__PropertyAssignment_1 ) ) ;
    public final void rule__EMappingAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3975:1: ( ( ( rule__EMappingAttribute__PropertyAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3976:1: ( ( rule__EMappingAttribute__PropertyAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3976:1: ( ( rule__EMappingAttribute__PropertyAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3977:1: ( rule__EMappingAttribute__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPropertyAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3978:1: ( rule__EMappingAttribute__PropertyAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3978:2: rule__EMappingAttribute__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__PropertyAssignment_1_in_rule__EMappingAttribute__Group__1__Impl7936);
            rule__EMappingAttribute__PropertyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getPropertyAssignment_1()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group__1__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3988:1: rule__EMappingAttribute__Group__2 : rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3 ;
    public final void rule__EMappingAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3992:1: ( rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3993:2: rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__2__Impl_in_rule__EMappingAttribute__Group__27966);
            rule__EMappingAttribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__3_in_rule__EMappingAttribute__Group__27969);
            rule__EMappingAttribute__Group__3();

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
    // $ANTLR end "rule__EMappingAttribute__Group__2"


    // $ANTLR start "rule__EMappingAttribute__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4000:1: rule__EMappingAttribute__Group__2__Impl : ( '=>' ) ;
    public final void rule__EMappingAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4004:1: ( ( '=>' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4005:1: ( '=>' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4005:1: ( '=>' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4006:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__EMappingAttribute__Group__2__Impl7997); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group__2__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4019:1: rule__EMappingAttribute__Group__3 : rule__EMappingAttribute__Group__3__Impl ;
    public final void rule__EMappingAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4023:1: ( rule__EMappingAttribute__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4024:2: rule__EMappingAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__3__Impl_in_rule__EMappingAttribute__Group__38028);
            rule__EMappingAttribute__Group__3__Impl();

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
    // $ANTLR end "rule__EMappingAttribute__Group__3"


    // $ANTLR start "rule__EMappingAttribute__Group__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4030:1: rule__EMappingAttribute__Group__3__Impl : ( ( rule__EMappingAttribute__Alternatives_3 ) ) ;
    public final void rule__EMappingAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4034:1: ( ( ( rule__EMappingAttribute__Alternatives_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4035:1: ( ( rule__EMappingAttribute__Alternatives_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4035:1: ( ( rule__EMappingAttribute__Alternatives_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4036:1: ( rule__EMappingAttribute__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4037:1: ( rule__EMappingAttribute__Alternatives_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4037:2: rule__EMappingAttribute__Alternatives_3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Alternatives_3_in_rule__EMappingAttribute__Group__3__Impl8055);
            rule__EMappingAttribute__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group__3__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group_3_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4055:1: rule__EMappingAttribute__Group_3_1__0 : rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1 ;
    public final void rule__EMappingAttribute__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4059:1: ( rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4060:2: rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__0__Impl_in_rule__EMappingAttribute__Group_3_1__08093);
            rule__EMappingAttribute__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__1_in_rule__EMappingAttribute__Group_3_1__08096);
            rule__EMappingAttribute__Group_3_1__1();

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
    // $ANTLR end "rule__EMappingAttribute__Group_3_1__0"


    // $ANTLR start "rule__EMappingAttribute__Group_3_1__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4067:1: rule__EMappingAttribute__Group_3_1__0__Impl : ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4071:1: ( ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4072:1: ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4072:1: ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4073:1: ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getResolvedAssignment_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4074:1: ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4074:2: rule__EMappingAttribute__ResolvedAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__ResolvedAssignment_3_1_0_in_rule__EMappingAttribute__Group_3_1__0__Impl8123);
            rule__EMappingAttribute__ResolvedAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getResolvedAssignment_3_1_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group_3_1__0__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group_3_1__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4084:1: rule__EMappingAttribute__Group_3_1__1 : rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2 ;
    public final void rule__EMappingAttribute__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4088:1: ( rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4089:2: rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__1__Impl_in_rule__EMappingAttribute__Group_3_1__18153);
            rule__EMappingAttribute__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__2_in_rule__EMappingAttribute__Group_3_1__18156);
            rule__EMappingAttribute__Group_3_1__2();

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
    // $ANTLR end "rule__EMappingAttribute__Group_3_1__1"


    // $ANTLR start "rule__EMappingAttribute__Group_3_1__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4096:1: rule__EMappingAttribute__Group_3_1__1__Impl : ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4100:1: ( ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4101:1: ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4101:1: ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4102:1: ( rule__EMappingAttribute__QueryAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getQueryAssignment_3_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4103:1: ( rule__EMappingAttribute__QueryAssignment_3_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4103:2: rule__EMappingAttribute__QueryAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__QueryAssignment_3_1_1_in_rule__EMappingAttribute__Group_3_1__1__Impl8183);
            rule__EMappingAttribute__QueryAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getQueryAssignment_3_1_1()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group_3_1__1__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group_3_1__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4113:1: rule__EMappingAttribute__Group_3_1__2 : rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3 ;
    public final void rule__EMappingAttribute__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4117:1: ( rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4118:2: rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__2__Impl_in_rule__EMappingAttribute__Group_3_1__28213);
            rule__EMappingAttribute__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__3_in_rule__EMappingAttribute__Group_3_1__28216);
            rule__EMappingAttribute__Group_3_1__3();

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
    // $ANTLR end "rule__EMappingAttribute__Group_3_1__2"


    // $ANTLR start "rule__EMappingAttribute__Group_3_1__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4125:1: rule__EMappingAttribute__Group_3_1__2__Impl : ( '(' ) ;
    public final void rule__EMappingAttribute__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4129:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4130:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4130:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4131:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__EMappingAttribute__Group_3_1__2__Impl8244); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group_3_1__2__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group_3_1__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4144:1: rule__EMappingAttribute__Group_3_1__3 : rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4 ;
    public final void rule__EMappingAttribute__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4148:1: ( rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4149:2: rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__3__Impl_in_rule__EMappingAttribute__Group_3_1__38275);
            rule__EMappingAttribute__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__4_in_rule__EMappingAttribute__Group_3_1__38278);
            rule__EMappingAttribute__Group_3_1__4();

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
    // $ANTLR end "rule__EMappingAttribute__Group_3_1__3"


    // $ANTLR start "rule__EMappingAttribute__Group_3_1__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4156:1: rule__EMappingAttribute__Group_3_1__3__Impl : ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4160:1: ( ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4161:1: ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4161:1: ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4162:1: ( rule__EMappingAttribute__ParametersAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getParametersAssignment_3_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4163:1: ( rule__EMappingAttribute__ParametersAssignment_3_1_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4163:2: rule__EMappingAttribute__ParametersAssignment_3_1_3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__ParametersAssignment_3_1_3_in_rule__EMappingAttribute__Group_3_1__3__Impl8305);
            rule__EMappingAttribute__ParametersAssignment_3_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getParametersAssignment_3_1_3()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group_3_1__3__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group_3_1__4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4173:1: rule__EMappingAttribute__Group_3_1__4 : rule__EMappingAttribute__Group_3_1__4__Impl ;
    public final void rule__EMappingAttribute__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4177:1: ( rule__EMappingAttribute__Group_3_1__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4178:2: rule__EMappingAttribute__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__4__Impl_in_rule__EMappingAttribute__Group_3_1__48335);
            rule__EMappingAttribute__Group_3_1__4__Impl();

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
    // $ANTLR end "rule__EMappingAttribute__Group_3_1__4"


    // $ANTLR start "rule__EMappingAttribute__Group_3_1__4__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4184:1: rule__EMappingAttribute__Group_3_1__4__Impl : ( ')' ) ;
    public final void rule__EMappingAttribute__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4188:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4189:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4189:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4190:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4()); 
            }
            match(input,32,FOLLOW_32_in_rule__EMappingAttribute__Group_3_1__4__Impl8363); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group_3_1__4__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group_3_2__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4213:1: rule__EMappingAttribute__Group_3_2__0 : rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1 ;
    public final void rule__EMappingAttribute__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4217:1: ( rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4218:2: rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__0__Impl_in_rule__EMappingAttribute__Group_3_2__08404);
            rule__EMappingAttribute__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__1_in_rule__EMappingAttribute__Group_3_2__08407);
            rule__EMappingAttribute__Group_3_2__1();

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
    // $ANTLR end "rule__EMappingAttribute__Group_3_2__0"


    // $ANTLR start "rule__EMappingAttribute__Group_3_2__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4225:1: rule__EMappingAttribute__Group_3_2__0__Impl : ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) ) ;
    public final void rule__EMappingAttribute__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4229:1: ( ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4230:1: ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4230:1: ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4231:1: ( rule__EMappingAttribute__MappedAssignment_3_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMappedAssignment_3_2_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4232:1: ( rule__EMappingAttribute__MappedAssignment_3_2_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4232:2: rule__EMappingAttribute__MappedAssignment_3_2_0
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__MappedAssignment_3_2_0_in_rule__EMappingAttribute__Group_3_2__0__Impl8434);
            rule__EMappingAttribute__MappedAssignment_3_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getMappedAssignment_3_2_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group_3_2__0__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group_3_2__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4242:1: rule__EMappingAttribute__Group_3_2__1 : rule__EMappingAttribute__Group_3_2__1__Impl ;
    public final void rule__EMappingAttribute__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4246:1: ( rule__EMappingAttribute__Group_3_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4247:2: rule__EMappingAttribute__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__1__Impl_in_rule__EMappingAttribute__Group_3_2__18464);
            rule__EMappingAttribute__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__EMappingAttribute__Group_3_2__1"


    // $ANTLR start "rule__EMappingAttribute__Group_3_2__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4253:1: rule__EMappingAttribute__Group_3_2__1__Impl : ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) ) ;
    public final void rule__EMappingAttribute__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4257:1: ( ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4258:1: ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4258:1: ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4259:1: ( rule__EMappingAttribute__MapAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMapAssignment_3_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4260:1: ( rule__EMappingAttribute__MapAssignment_3_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4260:2: rule__EMappingAttribute__MapAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__MapAssignment_3_2_1_in_rule__EMappingAttribute__Group_3_2__1__Impl8491);
            rule__EMappingAttribute__MapAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getMapAssignment_3_2_1()); 
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
    // $ANTLR end "rule__EMappingAttribute__Group_3_2__1__Impl"


    // $ANTLR start "rule__EType__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4274:1: rule__EType__Group__0 : rule__EType__Group__0__Impl rule__EType__Group__1 ;
    public final void rule__EType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4278:1: ( rule__EType__Group__0__Impl rule__EType__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4279:2: rule__EType__Group__0__Impl rule__EType__Group__1
            {
            pushFollow(FOLLOW_rule__EType__Group__0__Impl_in_rule__EType__Group__08525);
            rule__EType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__1_in_rule__EType__Group__08528);
            rule__EType__Group__1();

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
    // $ANTLR end "rule__EType__Group__0"


    // $ANTLR start "rule__EType__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4286:1: rule__EType__Group__0__Impl : ( 'etype' ) ;
    public final void rule__EType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4290:1: ( ( 'etype' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4291:1: ( 'etype' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4291:1: ( 'etype' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4292:1: 'etype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getEtypeKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__EType__Group__0__Impl8556); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getETypeAccess().getEtypeKeyword_0()); 
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
    // $ANTLR end "rule__EType__Group__0__Impl"


    // $ANTLR start "rule__EType__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4305:1: rule__EType__Group__1 : rule__EType__Group__1__Impl rule__EType__Group__2 ;
    public final void rule__EType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4309:1: ( rule__EType__Group__1__Impl rule__EType__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4310:2: rule__EType__Group__1__Impl rule__EType__Group__2
            {
            pushFollow(FOLLOW_rule__EType__Group__1__Impl_in_rule__EType__Group__18587);
            rule__EType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__2_in_rule__EType__Group__18590);
            rule__EType__Group__2();

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
    // $ANTLR end "rule__EType__Group__1"


    // $ANTLR start "rule__EType__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4317:1: rule__EType__Group__1__Impl : ( ( rule__EType__UrlAssignment_1 ) ) ;
    public final void rule__EType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4321:1: ( ( ( rule__EType__UrlAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4322:1: ( ( rule__EType__UrlAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4322:1: ( ( rule__EType__UrlAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4323:1: ( rule__EType__UrlAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getUrlAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4324:1: ( rule__EType__UrlAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4324:2: rule__EType__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__EType__UrlAssignment_1_in_rule__EType__Group__1__Impl8617);
            rule__EType__UrlAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getETypeAccess().getUrlAssignment_1()); 
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
    // $ANTLR end "rule__EType__Group__1__Impl"


    // $ANTLR start "rule__EType__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4334:1: rule__EType__Group__2 : rule__EType__Group__2__Impl rule__EType__Group__3 ;
    public final void rule__EType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4338:1: ( rule__EType__Group__2__Impl rule__EType__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4339:2: rule__EType__Group__2__Impl rule__EType__Group__3
            {
            pushFollow(FOLLOW_rule__EType__Group__2__Impl_in_rule__EType__Group__28647);
            rule__EType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__3_in_rule__EType__Group__28650);
            rule__EType__Group__3();

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
    // $ANTLR end "rule__EType__Group__2"


    // $ANTLR start "rule__EType__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4346:1: rule__EType__Group__2__Impl : ( '#' ) ;
    public final void rule__EType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4350:1: ( ( '#' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4351:1: ( '#' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4351:1: ( '#' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4352:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNumberSignKeyword_2()); 
            }
            match(input,38,FOLLOW_38_in_rule__EType__Group__2__Impl8678); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getETypeAccess().getNumberSignKeyword_2()); 
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
    // $ANTLR end "rule__EType__Group__2__Impl"


    // $ANTLR start "rule__EType__Group__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4365:1: rule__EType__Group__3 : rule__EType__Group__3__Impl ;
    public final void rule__EType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4369:1: ( rule__EType__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4370:2: rule__EType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EType__Group__3__Impl_in_rule__EType__Group__38709);
            rule__EType__Group__3__Impl();

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
    // $ANTLR end "rule__EType__Group__3"


    // $ANTLR start "rule__EType__Group__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4376:1: rule__EType__Group__3__Impl : ( ( rule__EType__NameAssignment_3 ) ) ;
    public final void rule__EType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4380:1: ( ( ( rule__EType__NameAssignment_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4381:1: ( ( rule__EType__NameAssignment_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4381:1: ( ( rule__EType__NameAssignment_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4382:1: ( rule__EType__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNameAssignment_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4383:1: ( rule__EType__NameAssignment_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4383:2: rule__EType__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__EType__NameAssignment_3_in_rule__EType__Group__3__Impl8736);
            rule__EType__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getETypeAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__EType__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4401:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4405:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4406:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08774);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08777);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4413:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4417:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4418:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4418:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4419:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8804); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4430:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4434:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4435:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18833);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4441:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4445:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4446:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4446:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4447:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4448:1: ( rule__QualifiedName__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==39) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_ID) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4448:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8860);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4462:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4466:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4467:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08895);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08898);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4474:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4478:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4479:1: ( ( '.' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4479:1: ( ( '.' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4480:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4481:1: ( '.' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4482:2: '.'
            {
            match(input,39,FOLLOW_39_in_rule__QualifiedName__Group_1__0__Impl8927); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4493:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4497:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4498:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18959);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4504:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4508:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4509:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4509:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4510:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8986); if (state.failed) return ;
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


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4525:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4529:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4530:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__09019);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__09022);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4537:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4541:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4542:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4542:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4543:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl9049);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4554:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4558:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4559:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__19078);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__19081);
            rule__QualifiedNameWithWildcard__Group__2();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4566:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4570:1: ( ( '.' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4571:1: ( '.' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4571:1: ( '.' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4572:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__QualifiedNameWithWildcard__Group__1__Impl9109); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4585:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4589:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4590:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__29140);
            rule__QualifiedNameWithWildcard__Group__2__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4596:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4600:1: ( ( '*' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4601:1: ( '*' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4601:1: ( '*' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4602:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__QualifiedNameWithWildcard__Group__2__Impl9168); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2__Impl"


    // $ANTLR start "rule__EMapping__RootAssignment"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4622:1: rule__EMapping__RootAssignment : ( ( rule__EMapping__RootAlternatives_0 ) ) ;
    public final void rule__EMapping__RootAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4626:1: ( ( ( rule__EMapping__RootAlternatives_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4627:1: ( ( rule__EMapping__RootAlternatives_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4627:1: ( ( rule__EMapping__RootAlternatives_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4628:1: ( rule__EMapping__RootAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAccess().getRootAlternatives_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4629:1: ( rule__EMapping__RootAlternatives_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4629:2: rule__EMapping__RootAlternatives_0
            {
            pushFollow(FOLLOW_rule__EMapping__RootAlternatives_0_in_rule__EMapping__RootAssignment9210);
            rule__EMapping__RootAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAccess().getRootAlternatives_0()); 
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
    // $ANTLR end "rule__EMapping__RootAssignment"


    // $ANTLR start "rule__EMappingBundle__ImportsAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4638:1: rule__EMappingBundle__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__EMappingBundle__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4642:1: ( ( ruleImport ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4643:1: ( ruleImport )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4643:1: ( ruleImport )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4644:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__EMappingBundle__ImportsAssignment_09243);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__EMappingBundle__ImportsAssignment_0"


    // $ANTLR start "rule__EMappingBundle__NameAssignment_2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4653:1: rule__EMappingBundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EMappingBundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4657:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4658:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4658:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4659:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__NameAssignment_29274); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__EMappingBundle__NameAssignment_2"


    // $ANTLR start "rule__EMappingBundle__EntitiesAssignment_4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4668:1: rule__EMappingBundle__EntitiesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EMappingBundle__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4672:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4673:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4673:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4674:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_4_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4675:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4676:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_49309); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_4_0()); 
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
    // $ANTLR end "rule__EMappingBundle__EntitiesAssignment_4"


    // $ANTLR start "rule__EMappingBundle__EntitiesAssignment_5_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4687:1: rule__EMappingBundle__EntitiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__EMappingBundle__EntitiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4691:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4692:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4692:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4693:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_5_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4694:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4695:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_5_19348); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_5_1_0()); 
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
    // $ANTLR end "rule__EMappingBundle__EntitiesAssignment_5_1"


    // $ANTLR start "rule__EMappingEntityDef__PackageAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4706:1: rule__EMappingEntityDef__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__EMappingEntityDef__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4710:1: ( ( rulePackageDeclaration ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4711:1: ( rulePackageDeclaration )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4711:1: ( rulePackageDeclaration )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4712:1: rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__EMappingEntityDef__PackageAssignment_09383);
            rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityDefAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__EMappingEntityDef__PackageAssignment_0"


    // $ANTLR start "rule__EMappingEntityDef__ImportsAssignment_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4721:1: rule__EMappingEntityDef__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__EMappingEntityDef__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4725:1: ( ( ruleImport ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4726:1: ( ruleImport )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4726:1: ( ruleImport )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4727:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__EMappingEntityDef__ImportsAssignment_19414);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityDefAccess().getImportsImportParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__EMappingEntityDef__ImportsAssignment_1"


    // $ANTLR start "rule__EMappingEntityDef__EntityAssignment_2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4736:1: rule__EMappingEntityDef__EntityAssignment_2 : ( ruleEMappingEntity ) ;
    public final void rule__EMappingEntityDef__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4740:1: ( ( ruleEMappingEntity ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4741:1: ( ruleEMappingEntity )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4741:1: ( ruleEMappingEntity )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4742:1: ruleEMappingEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getEntityEMappingEntityParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_rule__EMappingEntityDef__EntityAssignment_29445);
            ruleEMappingEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityDefAccess().getEntityEMappingEntityParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__EMappingEntityDef__EntityAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4751:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4755:1: ( ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4756:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4756:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4757:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4758:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4758:2: rule__Import__ImportedNamespaceAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_19476);
            rule__Import__ImportedNamespaceAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 
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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4767:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4771:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4772:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4772:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4773:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19509);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__EMappingEntity__AbstractAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4782:1: rule__EMappingEntity__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__EMappingEntity__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4786:1: ( ( ( 'abstract' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4787:1: ( ( 'abstract' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4787:1: ( ( 'abstract' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4788:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4789:1: ( 'abstract' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4790:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__EMappingEntity__AbstractAssignment_09545); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0()); 
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
    // $ANTLR end "rule__EMappingEntity__AbstractAssignment_0"


    // $ANTLR start "rule__EMappingEntity__NameAssignment_2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4805:1: rule__EMappingEntity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EMappingEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4809:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4810:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4810:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4811:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingEntity__NameAssignment_29584); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__EMappingEntity__NameAssignment_2"


    // $ANTLR start "rule__EMappingEntity__ExtensionTypeAssignment_3_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4820:1: rule__EMappingEntity__ExtensionTypeAssignment_3_0 : ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) ) ;
    public final void rule__EMappingEntity__ExtensionTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4824:1: ( ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4825:1: ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4825:1: ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4826:1: ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getExtensionTypeAlternatives_3_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4827:1: ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4827:2: rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0_in_rule__EMappingEntity__ExtensionTypeAssignment_3_09615);
            rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getExtensionTypeAlternatives_3_0_0()); 
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
    // $ANTLR end "rule__EMappingEntity__ExtensionTypeAssignment_3_0"


    // $ANTLR start "rule__EMappingEntity__ParentAssignment_3_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4836:1: rule__EMappingEntity__ParentAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EMappingEntity__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4840:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4841:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4841:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4842:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityCrossReference_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4843:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4844:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingEntity__ParentAssignment_3_19652);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__EMappingEntity__ParentAssignment_3_1"


    // $ANTLR start "rule__EMappingEntity__EtypeAssignment_5"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4855:1: rule__EMappingEntity__EtypeAssignment_5 : ( ruleEType ) ;
    public final void rule__EMappingEntity__EtypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4859:1: ( ( ruleEType ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4860:1: ( ruleEType )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4860:1: ( ruleEType )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4861:1: ruleEType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEtypeETypeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleEType_in_rule__EMappingEntity__EtypeAssignment_59687);
            ruleEType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getEtypeETypeParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__EMappingEntity__EtypeAssignment_5"


    // $ANTLR start "rule__EMappingEntity__AttributesAssignment_8"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4870:1: rule__EMappingEntity__AttributesAssignment_8 : ( ruleEAttribute ) ;
    public final void rule__EMappingEntity__AttributesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4874:1: ( ( ruleEAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4875:1: ( ruleEAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4875:1: ( ruleEAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4876:1: ruleEAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_89718);
            ruleEAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__EMappingEntity__AttributesAssignment_8"


    // $ANTLR start "rule__EMappingEntity__AttributesAssignment_9_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4885:1: rule__EMappingEntity__AttributesAssignment_9_1 : ( ruleEAttribute ) ;
    public final void rule__EMappingEntity__AttributesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4889:1: ( ( ruleEAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4890:1: ( ruleEAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4890:1: ( ruleEAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4891:1: ruleEAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_9_19749);
            ruleEAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_9_1_0()); 
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
    // $ANTLR end "rule__EMappingEntity__AttributesAssignment_9_1"


    // $ANTLR start "rule__EMappingEntity__NamedQueriesAssignment_11_2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4900:1: rule__EMappingEntity__NamedQueriesAssignment_11_2 : ( ruleENamedQuery ) ;
    public final void rule__EMappingEntity__NamedQueriesAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4904:1: ( ( ruleENamedQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4905:1: ( ruleENamedQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4905:1: ( ruleENamedQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4906:1: ruleENamedQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_11_2_0()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_11_29780);
            ruleENamedQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_11_2_0()); 
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
    // $ANTLR end "rule__EMappingEntity__NamedQueriesAssignment_11_2"


    // $ANTLR start "rule__EMappingEntity__NamedQueriesAssignment_11_3_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4915:1: rule__EMappingEntity__NamedQueriesAssignment_11_3_1 : ( ruleENamedQuery ) ;
    public final void rule__EMappingEntity__NamedQueriesAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4919:1: ( ( ruleENamedQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4920:1: ( ruleENamedQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4920:1: ( ruleENamedQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4921:1: ruleENamedQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_11_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_11_3_19811);
            ruleENamedQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_11_3_1_0()); 
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
    // $ANTLR end "rule__EMappingEntity__NamedQueriesAssignment_11_3_1"


    // $ANTLR start "rule__EMappingEntity__TableNameAssignment_13_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4930:1: rule__EMappingEntity__TableNameAssignment_13_1 : ( RULE_ID ) ;
    public final void rule__EMappingEntity__TableNameAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4934:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4935:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4935:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4936:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getTableNameIDTerminalRuleCall_13_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingEntity__TableNameAssignment_13_19842); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getTableNameIDTerminalRuleCall_13_1_0()); 
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
    // $ANTLR end "rule__EMappingEntity__TableNameAssignment_13_1"


    // $ANTLR start "rule__EAttribute__PkAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4945:1: rule__EAttribute__PkAssignment_0 : ( ( 'primarykey' ) ) ;
    public final void rule__EAttribute__PkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4949:1: ( ( ( 'primarykey' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4950:1: ( ( 'primarykey' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4950:1: ( ( 'primarykey' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4951:1: ( 'primarykey' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4952:1: ( 'primarykey' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4953:1: 'primarykey'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__EAttribute__PkAssignment_09878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
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
    // $ANTLR end "rule__EAttribute__PkAssignment_0"


    // $ANTLR start "rule__EAttribute__PropertyAssignment_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4968:1: rule__EAttribute__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__EAttribute__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4972:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4973:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4973:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4974:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPropertyIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__PropertyAssignment_19917); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getPropertyIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__EAttribute__PropertyAssignment_1"


    // $ANTLR start "rule__EAttribute__ColumnNameAssignment_3_0_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4983:1: rule__EAttribute__ColumnNameAssignment_3_0_0 : ( RULE_ID ) ;
    public final void rule__EAttribute__ColumnNameAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4987:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4988:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4988:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4989:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__ColumnNameAssignment_3_0_09948); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0_0()); 
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
    // $ANTLR end "rule__EAttribute__ColumnNameAssignment_3_0_0"


    // $ANTLR start "rule__EAttribute__DbTypeAssignment_3_0_1_2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4998:1: rule__EAttribute__DbTypeAssignment_3_0_1_2 : ( RULE_STRING ) ;
    public final void rule__EAttribute__DbTypeAssignment_3_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5002:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5003:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5003:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5004:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getDbTypeSTRINGTerminalRuleCall_3_0_1_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EAttribute__DbTypeAssignment_3_0_1_29979); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getDbTypeSTRINGTerminalRuleCall_3_0_1_2_0()); 
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
    // $ANTLR end "rule__EAttribute__DbTypeAssignment_3_0_1_2"


    // $ANTLR start "rule__EAttribute__AutoAssignment_3_0_1_3_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5013:1: rule__EAttribute__AutoAssignment_3_0_1_3_0 : ( ( 'auto' ) ) ;
    public final void rule__EAttribute__AutoAssignment_3_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5017:1: ( ( ( 'auto' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5018:1: ( ( 'auto' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5018:1: ( ( 'auto' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5019:1: ( 'auto' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getAutoAutoKeyword_3_0_1_3_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5020:1: ( 'auto' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5021:1: 'auto'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getAutoAutoKeyword_3_0_1_3_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__EAttribute__AutoAssignment_3_0_1_3_010015); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getAutoAutoKeyword_3_0_1_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getAutoAutoKeyword_3_0_1_3_0_0()); 
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
    // $ANTLR end "rule__EAttribute__AutoAssignment_3_0_1_3_0"


    // $ANTLR start "rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5036:1: rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1 : ( RULE_STRING ) ;
    public final void rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5040:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5041:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5041:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5042:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getKeygenquerySTRINGTerminalRuleCall_3_0_1_3_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_110054); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getKeygenquerySTRINGTerminalRuleCall_3_0_1_3_1_1_0()); 
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
    // $ANTLR end "rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1"


    // $ANTLR start "rule__EAttribute__SequenceAssignment_3_0_1_3_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5051:1: rule__EAttribute__SequenceAssignment_3_0_1_3_2_1 : ( RULE_STRING ) ;
    public final void rule__EAttribute__SequenceAssignment_3_0_1_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5055:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5056:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5056:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5057:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getSequenceSTRINGTerminalRuleCall_3_0_1_3_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EAttribute__SequenceAssignment_3_0_1_3_2_110085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getSequenceSTRINGTerminalRuleCall_3_0_1_3_2_1_0()); 
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
    // $ANTLR end "rule__EAttribute__SequenceAssignment_3_0_1_3_2_1"


    // $ANTLR start "rule__EAttribute__ResolvedAssignment_3_1_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5066:1: rule__EAttribute__ResolvedAssignment_3_1_0 : ( ( 'resolve' ) ) ;
    public final void rule__EAttribute__ResolvedAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5070:1: ( ( ( 'resolve' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5071:1: ( ( 'resolve' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5071:1: ( ( 'resolve' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5072:1: ( 'resolve' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5073:1: ( 'resolve' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5074:1: 'resolve'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__EAttribute__ResolvedAssignment_3_1_010121); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
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
    // $ANTLR end "rule__EAttribute__ResolvedAssignment_3_1_0"


    // $ANTLR start "rule__EAttribute__QueryAssignment_3_1_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5089:1: rule__EAttribute__QueryAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EAttribute__QueryAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5093:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5094:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5094:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5095:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5096:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5097:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EAttribute__QueryAssignment_3_1_110164);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getQueryENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
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
    // $ANTLR end "rule__EAttribute__QueryAssignment_3_1_1"


    // $ANTLR start "rule__EAttribute__ParametersAssignment_3_1_3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5108:1: rule__EAttribute__ParametersAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__EAttribute__ParametersAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5112:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5113:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5113:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5114:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__ParametersAssignment_3_1_310199); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
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
    // $ANTLR end "rule__EAttribute__ParametersAssignment_3_1_3"


    // $ANTLR start "rule__ENamedQuery__ReturnTypeAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5123:1: rule__ENamedQuery__ReturnTypeAssignment_0 : ( ruleReturnType ) ;
    public final void rule__ENamedQuery__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5127:1: ( ( ruleReturnType ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5128:1: ( ruleReturnType )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5128:1: ( ruleReturnType )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5129:1: ruleReturnType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getReturnTypeReturnTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleReturnType_in_rule__ENamedQuery__ReturnTypeAssignment_010230);
            ruleReturnType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getReturnTypeReturnTypeEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__ENamedQuery__ReturnTypeAssignment_0"


    // $ANTLR start "rule__ENamedQuery__NameAssignment_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5138:1: rule__ENamedQuery__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ENamedQuery__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5142:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5143:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5143:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5144:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ENamedQuery__NameAssignment_110261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ENamedQuery__NameAssignment_1"


    // $ANTLR start "rule__ENamedQuery__ParametersAssignment_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5153:1: rule__ENamedQuery__ParametersAssignment_2_1 : ( ruleEParameter ) ;
    public final void rule__ENamedQuery__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5157:1: ( ( ruleEParameter ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5158:1: ( ruleEParameter )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5158:1: ( ruleEParameter )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5159:1: ruleEParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_rule__ENamedQuery__ParametersAssignment_2_110292);
            ruleEParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__ENamedQuery__ParametersAssignment_2_1"


    // $ANTLR start "rule__ENamedQuery__QueriesAssignment_4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5168:1: rule__ENamedQuery__QueriesAssignment_4 : ( ruleEQuery ) ;
    public final void rule__ENamedQuery__QueriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5172:1: ( ( ruleEQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5173:1: ( ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5173:1: ( ruleEQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5174:1: ruleEQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_410323);
            ruleEQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__ENamedQuery__QueriesAssignment_4"


    // $ANTLR start "rule__ENamedQuery__QueriesAssignment_5_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5183:1: rule__ENamedQuery__QueriesAssignment_5_1 : ( ruleEQuery ) ;
    public final void rule__ENamedQuery__QueriesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5187:1: ( ( ruleEQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5188:1: ( ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5188:1: ( ruleEQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5189:1: ruleEQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_5_110354);
            ruleEQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__ENamedQuery__QueriesAssignment_5_1"


    // $ANTLR start "rule__EParameter__TypeAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5198:1: rule__EParameter__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__EParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5202:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5203:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5203:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5204:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getTypeIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EParameter__TypeAssignment_010385); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEParameterAccess().getTypeIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__EParameter__TypeAssignment_0"


    // $ANTLR start "rule__EParameter__NameAssignment_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5213:1: rule__EParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5217:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5218:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5218:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5219:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EParameter__NameAssignment_110416); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__EParameter__NameAssignment_1"


    // $ANTLR start "rule__EQuery__DbTypeAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5228:1: rule__EQuery__DbTypeAssignment_0 : ( ( rule__EQuery__DbTypeAlternatives_0_0 ) ) ;
    public final void rule__EQuery__DbTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5232:1: ( ( ( rule__EQuery__DbTypeAlternatives_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5233:1: ( ( rule__EQuery__DbTypeAlternatives_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5233:1: ( ( rule__EQuery__DbTypeAlternatives_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5234:1: ( rule__EQuery__DbTypeAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getDbTypeAlternatives_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5235:1: ( rule__EQuery__DbTypeAlternatives_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5235:2: rule__EQuery__DbTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__EQuery__DbTypeAlternatives_0_0_in_rule__EQuery__DbTypeAssignment_010447);
            rule__EQuery__DbTypeAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getDbTypeAlternatives_0_0()); 
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
    // $ANTLR end "rule__EQuery__DbTypeAssignment_0"


    // $ANTLR start "rule__EQuery__MappingAssignment_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5244:1: rule__EQuery__MappingAssignment_1 : ( ruleEObjectSection ) ;
    public final void rule__EQuery__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5248:1: ( ( ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5249:1: ( ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5249:1: ( ruleEObjectSection )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5250:1: ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_rule__EQuery__MappingAssignment_110480);
            ruleEObjectSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__EQuery__MappingAssignment_1"


    // $ANTLR start "rule__EQuery__FromAssignment_2_0_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5259:1: rule__EQuery__FromAssignment_2_0_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__FromAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5263:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5264:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5264:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5265:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFromSTRINGTerminalRuleCall_2_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__FromAssignment_2_0_110511); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getFromSTRINGTerminalRuleCall_2_0_1_0()); 
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
    // $ANTLR end "rule__EQuery__FromAssignment_2_0_1"


    // $ANTLR start "rule__EQuery__WhereAssignment_2_0_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5274:1: rule__EQuery__WhereAssignment_2_0_2_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__WhereAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5278:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5279:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5279:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5280:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWhereSTRINGTerminalRuleCall_2_0_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__WhereAssignment_2_0_2_110542); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getWhereSTRINGTerminalRuleCall_2_0_2_1_0()); 
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
    // $ANTLR end "rule__EQuery__WhereAssignment_2_0_2_1"


    // $ANTLR start "rule__EQuery__GroupByAssignment_2_0_3_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5289:1: rule__EQuery__GroupByAssignment_2_0_3_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__GroupByAssignment_2_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5293:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5294:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5294:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5295:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroupBySTRINGTerminalRuleCall_2_0_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__GroupByAssignment_2_0_3_110573); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getGroupBySTRINGTerminalRuleCall_2_0_3_1_0()); 
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
    // $ANTLR end "rule__EQuery__GroupByAssignment_2_0_3_1"


    // $ANTLR start "rule__EQuery__OrderbyAssignment_2_0_4_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5304:1: rule__EQuery__OrderbyAssignment_2_0_4_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__OrderbyAssignment_2_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5308:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5309:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5309:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5310:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getOrderbySTRINGTerminalRuleCall_2_0_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__OrderbyAssignment_2_0_4_110604); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getOrderbySTRINGTerminalRuleCall_2_0_4_1_0()); 
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
    // $ANTLR end "rule__EQuery__OrderbyAssignment_2_0_4_1"


    // $ANTLR start "rule__EQuery__AllAssignment_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5319:1: rule__EQuery__AllAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__AllAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5323:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5324:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5324:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5325:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getAllSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__AllAssignment_2_110635); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryAccess().getAllSTRINGTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__EQuery__AllAssignment_2_1"


    // $ANTLR start "rule__EObjectSection__EntityAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5334:1: rule__EObjectSection__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EObjectSection__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5338:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5339:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5339:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5340:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5341:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5342:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EObjectSection__EntityAssignment_010670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
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
    // $ANTLR end "rule__EObjectSection__EntityAssignment_0"


    // $ANTLR start "rule__EObjectSection__PrefixAssignment_1_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5353:1: rule__EObjectSection__PrefixAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__EObjectSection__PrefixAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5357:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5358:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5358:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5359:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getPrefixIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EObjectSection__PrefixAssignment_1_010705); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getPrefixIDTerminalRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__EObjectSection__PrefixAssignment_1_0"


    // $ANTLR start "rule__EObjectSection__AttributesAssignment_1_1_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5368:1: rule__EObjectSection__AttributesAssignment_1_1_1 : ( ruleEMappingAttribute ) ;
    public final void rule__EObjectSection__AttributesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5372:1: ( ( ruleEMappingAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5373:1: ( ruleEMappingAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5373:1: ( ruleEMappingAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5374:1: ruleEMappingAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_110736);
            ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__EObjectSection__AttributesAssignment_1_1_1"


    // $ANTLR start "rule__EObjectSection__AttributesAssignment_1_1_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5383:1: rule__EObjectSection__AttributesAssignment_1_1_2_1 : ( ruleEMappingAttribute ) ;
    public final void rule__EObjectSection__AttributesAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5387:1: ( ( ruleEMappingAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5388:1: ( ruleEMappingAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5388:1: ( ruleEMappingAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5389:1: ruleEMappingAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_1_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_2_110767);
            ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_1_1_2_1_0()); 
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
    // $ANTLR end "rule__EObjectSection__AttributesAssignment_1_1_2_1"


    // $ANTLR start "rule__EMappingAttribute__PkAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5398:1: rule__EMappingAttribute__PkAssignment_0 : ( ( 'primarykey' ) ) ;
    public final void rule__EMappingAttribute__PkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5402:1: ( ( ( 'primarykey' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5403:1: ( ( 'primarykey' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5403:1: ( ( 'primarykey' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5404:1: ( 'primarykey' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5405:1: ( 'primarykey' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5406:1: 'primarykey'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__EMappingAttribute__PkAssignment_010803); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__PkAssignment_0"


    // $ANTLR start "rule__EMappingAttribute__PropertyAssignment_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5421:1: rule__EMappingAttribute__PropertyAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__EMappingAttribute__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5425:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5426:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5426:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5427:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__PropertyAssignment_110842);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__PropertyAssignment_1"


    // $ANTLR start "rule__EMappingAttribute__ColumnNameAssignment_3_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5436:1: rule__EMappingAttribute__ColumnNameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__EMappingAttribute__ColumnNameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5440:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5441:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5441:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5442:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingAttribute__ColumnNameAssignment_3_010873); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__ColumnNameAssignment_3_0"


    // $ANTLR start "rule__EMappingAttribute__ResolvedAssignment_3_1_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5451:1: rule__EMappingAttribute__ResolvedAssignment_3_1_0 : ( ( 'resolve' ) ) ;
    public final void rule__EMappingAttribute__ResolvedAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5455:1: ( ( ( 'resolve' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5456:1: ( ( 'resolve' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5456:1: ( ( 'resolve' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5457:1: ( 'resolve' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5458:1: ( 'resolve' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5459:1: 'resolve'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__EMappingAttribute__ResolvedAssignment_3_1_010909); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__ResolvedAssignment_3_1_0"


    // $ANTLR start "rule__EMappingAttribute__QueryAssignment_3_1_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5474:1: rule__EMappingAttribute__QueryAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EMappingAttribute__QueryAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5478:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5479:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5479:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5480:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5481:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5482:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__QueryAssignment_3_1_110952);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__QueryAssignment_3_1_1"


    // $ANTLR start "rule__EMappingAttribute__ParametersAssignment_3_1_3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5493:1: rule__EMappingAttribute__ParametersAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__EMappingAttribute__ParametersAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5497:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5498:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5498:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5499:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingAttribute__ParametersAssignment_3_1_310987); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__ParametersAssignment_3_1_3"


    // $ANTLR start "rule__EMappingAttribute__MappedAssignment_3_2_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5508:1: rule__EMappingAttribute__MappedAssignment_3_2_0 : ( ( 'map' ) ) ;
    public final void rule__EMappingAttribute__MappedAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5512:1: ( ( ( 'map' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5513:1: ( ( 'map' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5513:1: ( ( 'map' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5514:1: ( 'map' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMappedMapKeyword_3_2_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5515:1: ( 'map' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5516:1: 'map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMappedMapKeyword_3_2_0_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__EMappingAttribute__MappedAssignment_3_2_011023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getMappedMapKeyword_3_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getMappedMapKeyword_3_2_0_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__MappedAssignment_3_2_0"


    // $ANTLR start "rule__EMappingAttribute__MapAssignment_3_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5531:1: rule__EMappingAttribute__MapAssignment_3_2_1 : ( ruleEObjectSection ) ;
    public final void rule__EMappingAttribute__MapAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5535:1: ( ( ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5536:1: ( ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5536:1: ( ruleEObjectSection )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5537:1: ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_rule__EMappingAttribute__MapAssignment_3_2_111062);
            ruleEObjectSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
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
    // $ANTLR end "rule__EMappingAttribute__MapAssignment_3_2_1"


    // $ANTLR start "rule__EType__UrlAssignment_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5546:1: rule__EType__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EType__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5550:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5551:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5551:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5552:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EType__UrlAssignment_111093); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getETypeAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__EType__UrlAssignment_1"


    // $ANTLR start "rule__EType__NameAssignment_3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5561:1: rule__EType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__EType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5565:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5566:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5566:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5567:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EType__NameAssignment_311124); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getETypeAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__EType__NameAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\6\uffff";
    static final String DFA2_eofS =
        "\1\uffff\1\3\2\uffff\1\3\1\uffff";
    static final String DFA2_minS =
        "\1\5\1\20\1\5\1\uffff\1\20\1\uffff";
    static final String DFA2_maxS =
        "\1\5\1\51\1\50\1\uffff\1\51\1\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\1\uffff\1\1";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\3\uffff\1\3\2\uffff\1\3\17\uffff\1\2\1\uffff\1\3",
            "\1\4\42\uffff\1\5",
            "",
            "\1\3\3\uffff\1\3\2\uffff\1\3\17\uffff\1\2\1\uffff\1\3",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "522:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleEMapping_in_entryRuleEMapping67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMapping74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMapping__RootAssignment_in_ruleEMapping100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingBundle_in_entryRuleEMappingBundle127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingBundle134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__0_in_ruleEMappingBundle160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntityDef_in_entryRuleEMappingEntityDef187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingEntityDef194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__0_in_ruleEMappingEntityDef220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_entryRuleEMappingEntity367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingEntity374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__0_in_ruleEMappingEntity400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_entryRuleEAttribute427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEAttribute434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__0_in_ruleEAttribute460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedQuery494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__0_in_ruleENamedQuery520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_entryRuleEParameter547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEParameter554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__Group__0_in_ruleEParameter580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_entryRuleEQuery607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQuery614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__0_in_ruleEQuery640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEObjectSection674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__0_in_ruleEObjectSection700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingAttribute734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__0_in_ruleEMappingAttribute760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_entryRuleEType787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEType794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__0_in_ruleEType820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnType__Alternatives_in_ruleReturnType977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingBundle_in_rule__EMapping__RootAlternatives_01012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntityDef_in_rule__EMapping__RootAlternatives_01029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAlternatives_1_01078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__0_in_rule__EAttribute__Alternatives_31165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__0_in_rule__EAttribute__Alternatives_31183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__AutoAssignment_3_0_1_3_0_in_rule__EAttribute__Alternatives_3_0_1_31216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3_1__0_in_rule__EAttribute__Alternatives_3_0_1_31234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3_2__0_in_rule__EAttribute__Alternatives_3_0_1_31252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EQuery__DbTypeAlternatives_0_01286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__DbTypeAlternatives_0_01305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__0_in_rule__EQuery__Alternatives_21337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__AllAssignment_2_1_in_rule__EQuery__Alternatives_21355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__ColumnNameAssignment_3_0_in_rule__EMappingAttribute__Alternatives_31388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__0_in_rule__EMappingAttribute__Alternatives_31406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__0_in_rule__EMappingAttribute__Alternatives_31424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ReturnType__Alternatives1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ReturnType__Alternatives1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__0__Impl_in_rule__EMappingBundle__Group__01512 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__1_in_rule__EMappingBundle__Group__01515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__ImportsAssignment_0_in_rule__EMappingBundle__Group__0__Impl1542 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__1__Impl_in_rule__EMappingBundle__Group__11573 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__2_in_rule__EMappingBundle__Group__11576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EMappingBundle__Group__1__Impl1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__2__Impl_in_rule__EMappingBundle__Group__21635 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__3_in_rule__EMappingBundle__Group__21638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__NameAssignment_2_in_rule__EMappingBundle__Group__2__Impl1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__3__Impl_in_rule__EMappingBundle__Group__31695 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__4_in_rule__EMappingBundle__Group__31698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingBundle__Group__3__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__4__Impl_in_rule__EMappingBundle__Group__41757 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__5_in_rule__EMappingBundle__Group__41760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__EntitiesAssignment_4_in_rule__EMappingBundle__Group__4__Impl1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__5__Impl_in_rule__EMappingBundle__Group__51817 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__6_in_rule__EMappingBundle__Group__51820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__0_in_rule__EMappingBundle__Group__5__Impl1847 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__6__Impl_in_rule__EMappingBundle__Group__61878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingBundle__Group__6__Impl1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__0__Impl_in_rule__EMappingBundle__Group_5__01951 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__1_in_rule__EMappingBundle__Group_5__01954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EMappingBundle__Group_5__0__Impl1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__1__Impl_in_rule__EMappingBundle__Group_5__12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__EntitiesAssignment_5_1_in_rule__EMappingBundle__Group_5__1__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__0__Impl_in_rule__EMappingEntityDef__Group__02074 = new BitSet(new long[]{0x0000020000900000L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__1_in_rule__EMappingEntityDef__Group__02077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__PackageAssignment_0_in_rule__EMappingEntityDef__Group__0__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__1__Impl_in_rule__EMappingEntityDef__Group__12134 = new BitSet(new long[]{0x0000020000900000L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__2_in_rule__EMappingEntityDef__Group__12137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__ImportsAssignment_1_in_rule__EMappingEntityDef__Group__1__Impl2164 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__2__Impl_in_rule__EMappingEntityDef__Group__22195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__EntityAssignment_2_in_rule__EMappingEntityDef__Group__2__Impl2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Import__Group__0__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDeclaration__Group__0__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12443 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group__2__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__0__Impl_in_rule__EMappingEntity__Group__02568 = new BitSet(new long[]{0x0000020000900000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__1_in_rule__EMappingEntity__Group__02571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AbstractAssignment_0_in_rule__EMappingEntity__Group__0__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__1__Impl_in_rule__EMappingEntity__Group__12629 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__2_in_rule__EMappingEntity__Group__12632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EMappingEntity__Group__1__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__2__Impl_in_rule__EMappingEntity__Group__22691 = new BitSet(new long[]{0x0000000000021800L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__3_in_rule__EMappingEntity__Group__22694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NameAssignment_2_in_rule__EMappingEntity__Group__2__Impl2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__3__Impl_in_rule__EMappingEntity__Group__32751 = new BitSet(new long[]{0x0000000000021800L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__4_in_rule__EMappingEntity__Group__32754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__0_in_rule__EMappingEntity__Group__3__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__4__Impl_in_rule__EMappingEntity__Group__42812 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__5_in_rule__EMappingEntity__Group__42815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group__4__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__5__Impl_in_rule__EMappingEntity__Group__52874 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__6_in_rule__EMappingEntity__Group__52877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__EtypeAssignment_5_in_rule__EMappingEntity__Group__5__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__6__Impl_in_rule__EMappingEntity__Group__62934 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__7_in_rule__EMappingEntity__Group__62937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EMappingEntity__Group__6__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__7__Impl_in_rule__EMappingEntity__Group__72996 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__8_in_rule__EMappingEntity__Group__72999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group__7__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__8__Impl_in_rule__EMappingEntity__Group__83058 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__9_in_rule__EMappingEntity__Group__83061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AttributesAssignment_8_in_rule__EMappingEntity__Group__8__Impl3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__9__Impl_in_rule__EMappingEntity__Group__93118 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__10_in_rule__EMappingEntity__Group__93121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__0_in_rule__EMappingEntity__Group__9__Impl3148 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__10__Impl_in_rule__EMappingEntity__Group__103179 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__11_in_rule__EMappingEntity__Group__103182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingEntity__Group__10__Impl3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__11__Impl_in_rule__EMappingEntity__Group__113241 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__12_in_rule__EMappingEntity__Group__113244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__0_in_rule__EMappingEntity__Group__11__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__12__Impl_in_rule__EMappingEntity__Group__123302 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__13_in_rule__EMappingEntity__Group__123305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingEntity__Group__12__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__13__Impl_in_rule__EMappingEntity__Group__133364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_13__0_in_rule__EMappingEntity__Group__13__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__0__Impl_in_rule__EMappingEntity__Group_3__03450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__1_in_rule__EMappingEntity__Group_3__03453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ExtensionTypeAssignment_3_0_in_rule__EMappingEntity__Group_3__0__Impl3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__1__Impl_in_rule__EMappingEntity__Group_3__13510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ParentAssignment_3_1_in_rule__EMappingEntity__Group_3__1__Impl3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__0__Impl_in_rule__EMappingEntity__Group_9__03571 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__1_in_rule__EMappingEntity__Group_9__03574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EMappingEntity__Group_9__0__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__1__Impl_in_rule__EMappingEntity__Group_9__13633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AttributesAssignment_9_1_in_rule__EMappingEntity__Group_9__1__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__0__Impl_in_rule__EMappingEntity__Group_11__03694 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__1_in_rule__EMappingEntity__Group_11__03697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EMappingEntity__Group_11__0__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__1__Impl_in_rule__EMappingEntity__Group_11__13756 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__2_in_rule__EMappingEntity__Group_11__13759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group_11__1__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__2__Impl_in_rule__EMappingEntity__Group_11__23818 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__3_in_rule__EMappingEntity__Group_11__23821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_11_2_in_rule__EMappingEntity__Group_11__2__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__3__Impl_in_rule__EMappingEntity__Group_11__33878 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__4_in_rule__EMappingEntity__Group_11__33881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11_3__0_in_rule__EMappingEntity__Group_11__3__Impl3908 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__4__Impl_in_rule__EMappingEntity__Group_11__43939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingEntity__Group_11__4__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11_3__0__Impl_in_rule__EMappingEntity__Group_11_3__04008 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11_3__1_in_rule__EMappingEntity__Group_11_3__04011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EMappingEntity__Group_11_3__0__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11_3__1__Impl_in_rule__EMappingEntity__Group_11_3__14070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_11_3_1_in_rule__EMappingEntity__Group_11_3__1__Impl4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_13__0__Impl_in_rule__EMappingEntity__Group_13__04131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_13__1_in_rule__EMappingEntity__Group_13__04134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EMappingEntity__Group_13__0__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_13__1__Impl_in_rule__EMappingEntity__Group_13__14193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__TableNameAssignment_13_1_in_rule__EMappingEntity__Group_13__1__Impl4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__0__Impl_in_rule__EAttribute__Group__04254 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__1_in_rule__EAttribute__Group__04257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__PkAssignment_0_in_rule__EAttribute__Group__0__Impl4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__1__Impl_in_rule__EAttribute__Group__14315 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__2_in_rule__EAttribute__Group__14318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__PropertyAssignment_1_in_rule__EAttribute__Group__1__Impl4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__2__Impl_in_rule__EAttribute__Group__24375 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__3_in_rule__EAttribute__Group__24378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EAttribute__Group__2__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__3__Impl_in_rule__EAttribute__Group__34437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Alternatives_3_in_rule__EAttribute__Group__3__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__0__Impl_in_rule__EAttribute__Group_3_0__04502 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__1_in_rule__EAttribute__Group_3_0__04505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ColumnNameAssignment_3_0_0_in_rule__EAttribute__Group_3_0__0__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__1__Impl_in_rule__EAttribute__Group_3_0__14562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__0_in_rule__EAttribute__Group_3_0__1__Impl4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__0__Impl_in_rule__EAttribute__Group_3_0_1__04624 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__1_in_rule__EAttribute__Group_3_0_1__04627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EAttribute__Group_3_0_1__0__Impl4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__1__Impl_in_rule__EAttribute__Group_3_0_1__14686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__2_in_rule__EAttribute__Group_3_0_1__14689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EAttribute__Group_3_0_1__1__Impl4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__2__Impl_in_rule__EAttribute__Group_3_0_1__24748 = new BitSet(new long[]{0x0000080060000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__3_in_rule__EAttribute__Group_3_0_1__24751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__DbTypeAssignment_3_0_1_2_in_rule__EAttribute__Group_3_0_1__2__Impl4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__3__Impl_in_rule__EAttribute__Group_3_0_1__34808 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__4_in_rule__EAttribute__Group_3_0_1__34811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Alternatives_3_0_1_3_in_rule__EAttribute__Group_3_0_1__3__Impl4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__4__Impl_in_rule__EAttribute__Group_3_0_1__44868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EAttribute__Group_3_0_1__4__Impl4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3_1__0__Impl_in_rule__EAttribute__Group_3_0_1_3_1__04937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3_1__1_in_rule__EAttribute__Group_3_0_1_3_1__04940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EAttribute__Group_3_0_1_3_1__0__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3_1__1__Impl_in_rule__EAttribute__Group_3_0_1_3_1__14999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_1_in_rule__EAttribute__Group_3_0_1_3_1__1__Impl5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3_2__0__Impl_in_rule__EAttribute__Group_3_0_1_3_2__05060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3_2__1_in_rule__EAttribute__Group_3_0_1_3_2__05063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EAttribute__Group_3_0_1_3_2__0__Impl5091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3_2__1__Impl_in_rule__EAttribute__Group_3_0_1_3_2__15122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__SequenceAssignment_3_0_1_3_2_1_in_rule__EAttribute__Group_3_0_1_3_2__1__Impl5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__0__Impl_in_rule__EAttribute__Group_3_1__05183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__1_in_rule__EAttribute__Group_3_1__05186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ResolvedAssignment_3_1_0_in_rule__EAttribute__Group_3_1__0__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__1__Impl_in_rule__EAttribute__Group_3_1__15243 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__2_in_rule__EAttribute__Group_3_1__15246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__QueryAssignment_3_1_1_in_rule__EAttribute__Group_3_1__1__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__2__Impl_in_rule__EAttribute__Group_3_1__25303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__3_in_rule__EAttribute__Group_3_1__25306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EAttribute__Group_3_1__2__Impl5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__3__Impl_in_rule__EAttribute__Group_3_1__35365 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__4_in_rule__EAttribute__Group_3_1__35368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ParametersAssignment_3_1_3_in_rule__EAttribute__Group_3_1__3__Impl5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__4__Impl_in_rule__EAttribute__Group_3_1__45425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EAttribute__Group_3_1__4__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__0__Impl_in_rule__ENamedQuery__Group__05494 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__1_in_rule__ENamedQuery__Group__05497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__ReturnTypeAssignment_0_in_rule__ENamedQuery__Group__0__Impl5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__1__Impl_in_rule__ENamedQuery__Group__15555 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__2_in_rule__ENamedQuery__Group__15558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__NameAssignment_1_in_rule__ENamedQuery__Group__1__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__2__Impl_in_rule__ENamedQuery__Group__25615 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__3_in_rule__ENamedQuery__Group__25618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__0_in_rule__ENamedQuery__Group__2__Impl5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__3__Impl_in_rule__ENamedQuery__Group__35676 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__4_in_rule__ENamedQuery__Group__35679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ENamedQuery__Group__3__Impl5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__4__Impl_in_rule__ENamedQuery__Group__45738 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__5_in_rule__ENamedQuery__Group__45741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__QueriesAssignment_4_in_rule__ENamedQuery__Group__4__Impl5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__5__Impl_in_rule__ENamedQuery__Group__55798 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__6_in_rule__ENamedQuery__Group__55801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__0_in_rule__ENamedQuery__Group__5__Impl5828 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__6__Impl_in_rule__ENamedQuery__Group__65859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ENamedQuery__Group__6__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__0__Impl_in_rule__ENamedQuery__Group_2__05932 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__1_in_rule__ENamedQuery__Group_2__05935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ENamedQuery__Group_2__0__Impl5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__1__Impl_in_rule__ENamedQuery__Group_2__15994 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__2_in_rule__ENamedQuery__Group_2__15997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__ParametersAssignment_2_1_in_rule__ENamedQuery__Group_2__1__Impl6024 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__2__Impl_in_rule__ENamedQuery__Group_2__26055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ENamedQuery__Group_2__2__Impl6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__0__Impl_in_rule__ENamedQuery__Group_5__06120 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__1_in_rule__ENamedQuery__Group_5__06123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ENamedQuery__Group_5__0__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__1__Impl_in_rule__ENamedQuery__Group_5__16182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__QueriesAssignment_5_1_in_rule__ENamedQuery__Group_5__1__Impl6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__Group__0__Impl_in_rule__EParameter__Group__06243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EParameter__Group__1_in_rule__EParameter__Group__06246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__TypeAssignment_0_in_rule__EParameter__Group__0__Impl6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__Group__1__Impl_in_rule__EParameter__Group__16303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__NameAssignment_1_in_rule__EParameter__Group__1__Impl6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__0__Impl_in_rule__EQuery__Group__06364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EQuery__Group__1_in_rule__EQuery__Group__06367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__DbTypeAssignment_0_in_rule__EQuery__Group__0__Impl6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__1__Impl_in_rule__EQuery__Group__16424 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group__2_in_rule__EQuery__Group__16427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__MappingAssignment_1_in_rule__EQuery__Group__1__Impl6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__2__Impl_in_rule__EQuery__Group__26484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Alternatives_2_in_rule__EQuery__Group__2__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__0__Impl_in_rule__EQuery__Group_2_0__06547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__1_in_rule__EQuery__Group_2_0__06550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EQuery__Group_2_0__0__Impl6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__1__Impl_in_rule__EQuery__Group_2_0__16609 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__2_in_rule__EQuery__Group_2_0__16612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__FromAssignment_2_0_1_in_rule__EQuery__Group_2_0__1__Impl6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__2__Impl_in_rule__EQuery__Group_2_0__26669 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__3_in_rule__EQuery__Group_2_0__26672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__0_in_rule__EQuery__Group_2_0__2__Impl6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__3__Impl_in_rule__EQuery__Group_2_0__36730 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__4_in_rule__EQuery__Group_2_0__36733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__0_in_rule__EQuery__Group_2_0__3__Impl6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__4__Impl_in_rule__EQuery__Group_2_0__46791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__0_in_rule__EQuery__Group_2_0__4__Impl6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__0__Impl_in_rule__EQuery__Group_2_0_2__06859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__1_in_rule__EQuery__Group_2_0_2__06862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EQuery__Group_2_0_2__0__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__1__Impl_in_rule__EQuery__Group_2_0_2__16921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__WhereAssignment_2_0_2_1_in_rule__EQuery__Group_2_0_2__1__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__0__Impl_in_rule__EQuery__Group_2_0_3__06982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__1_in_rule__EQuery__Group_2_0_3__06985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EQuery__Group_2_0_3__0__Impl7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__1__Impl_in_rule__EQuery__Group_2_0_3__17044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__GroupByAssignment_2_0_3_1_in_rule__EQuery__Group_2_0_3__1__Impl7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__0__Impl_in_rule__EQuery__Group_2_0_4__07105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__1_in_rule__EQuery__Group_2_0_4__07108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EQuery__Group_2_0_4__0__Impl7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__1__Impl_in_rule__EQuery__Group_2_0_4__17167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__OrderbyAssignment_2_0_4_1_in_rule__EQuery__Group_2_0_4__1__Impl7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__0__Impl_in_rule__EObjectSection__Group__07228 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__1_in_rule__EObjectSection__Group__07231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__EntityAssignment_0_in_rule__EObjectSection__Group__0__Impl7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__1__Impl_in_rule__EObjectSection__Group__17288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__0_in_rule__EObjectSection__Group__1__Impl7315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__0__Impl_in_rule__EObjectSection__Group_1__07350 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__1_in_rule__EObjectSection__Group_1__07353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__PrefixAssignment_1_0_in_rule__EObjectSection__Group_1__0__Impl7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__1__Impl_in_rule__EObjectSection__Group_1__17410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__0_in_rule__EObjectSection__Group_1__1__Impl7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__0__Impl_in_rule__EObjectSection__Group_1_1__07472 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__1_in_rule__EObjectSection__Group_1_1__07475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EObjectSection__Group_1_1__0__Impl7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__1__Impl_in_rule__EObjectSection__Group_1_1__17534 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__2_in_rule__EObjectSection__Group_1_1__17537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_1_in_rule__EObjectSection__Group_1_1__1__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__2__Impl_in_rule__EObjectSection__Group_1_1__27594 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__3_in_rule__EObjectSection__Group_1_1__27597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__0_in_rule__EObjectSection__Group_1_1__2__Impl7624 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__3__Impl_in_rule__EObjectSection__Group_1_1__37655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EObjectSection__Group_1_1__3__Impl7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__0__Impl_in_rule__EObjectSection__Group_1_1_2__07722 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__1_in_rule__EObjectSection__Group_1_1_2__07725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EObjectSection__Group_1_1_2__0__Impl7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__1__Impl_in_rule__EObjectSection__Group_1_1_2__17784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_2_1_in_rule__EObjectSection__Group_1_1_2__1__Impl7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__0__Impl_in_rule__EMappingAttribute__Group__07845 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__1_in_rule__EMappingAttribute__Group__07848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__PkAssignment_0_in_rule__EMappingAttribute__Group__0__Impl7875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__1__Impl_in_rule__EMappingAttribute__Group__17906 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__2_in_rule__EMappingAttribute__Group__17909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__PropertyAssignment_1_in_rule__EMappingAttribute__Group__1__Impl7936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__2__Impl_in_rule__EMappingAttribute__Group__27966 = new BitSet(new long[]{0x0000300000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__3_in_rule__EMappingAttribute__Group__27969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EMappingAttribute__Group__2__Impl7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__3__Impl_in_rule__EMappingAttribute__Group__38028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Alternatives_3_in_rule__EMappingAttribute__Group__3__Impl8055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__0__Impl_in_rule__EMappingAttribute__Group_3_1__08093 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__1_in_rule__EMappingAttribute__Group_3_1__08096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__ResolvedAssignment_3_1_0_in_rule__EMappingAttribute__Group_3_1__0__Impl8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__1__Impl_in_rule__EMappingAttribute__Group_3_1__18153 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__2_in_rule__EMappingAttribute__Group_3_1__18156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__QueryAssignment_3_1_1_in_rule__EMappingAttribute__Group_3_1__1__Impl8183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__2__Impl_in_rule__EMappingAttribute__Group_3_1__28213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__3_in_rule__EMappingAttribute__Group_3_1__28216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EMappingAttribute__Group_3_1__2__Impl8244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__3__Impl_in_rule__EMappingAttribute__Group_3_1__38275 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__4_in_rule__EMappingAttribute__Group_3_1__38278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__ParametersAssignment_3_1_3_in_rule__EMappingAttribute__Group_3_1__3__Impl8305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__4__Impl_in_rule__EMappingAttribute__Group_3_1__48335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EMappingAttribute__Group_3_1__4__Impl8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__0__Impl_in_rule__EMappingAttribute__Group_3_2__08404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__1_in_rule__EMappingAttribute__Group_3_2__08407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__MappedAssignment_3_2_0_in_rule__EMappingAttribute__Group_3_2__0__Impl8434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__1__Impl_in_rule__EMappingAttribute__Group_3_2__18464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__MapAssignment_3_2_1_in_rule__EMappingAttribute__Group_3_2__1__Impl8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__0__Impl_in_rule__EType__Group__08525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EType__Group__1_in_rule__EType__Group__08528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EType__Group__0__Impl8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__1__Impl_in_rule__EType__Group__18587 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EType__Group__2_in_rule__EType__Group__18590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__UrlAssignment_1_in_rule__EType__Group__1__Impl8617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__2__Impl_in_rule__EType__Group__28647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EType__Group__3_in_rule__EType__Group__28650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EType__Group__2__Impl8678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__3__Impl_in_rule__EType__Group__38709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__NameAssignment_3_in_rule__EType__Group__3__Impl8736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08774 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8860 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08895 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QualifiedName__Group_1__0__Impl8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__09019 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__09022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__19078 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__19081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QualifiedNameWithWildcard__Group__1__Impl9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__29140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__QualifiedNameWithWildcard__Group__2__Impl9168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMapping__RootAlternatives_0_in_rule__EMapping__RootAssignment9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__EMappingBundle__ImportsAssignment_09243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__NameAssignment_29274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_49309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_5_19348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__EMappingEntityDef__PackageAssignment_09383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__EMappingEntityDef__ImportsAssignment_19414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_rule__EMappingEntityDef__EntityAssignment_29445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_19476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EMappingEntity__AbstractAssignment_09545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingEntity__NameAssignment_29584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0_in_rule__EMappingEntity__ExtensionTypeAssignment_3_09615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingEntity__ParentAssignment_3_19652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_rule__EMappingEntity__EtypeAssignment_59687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_89718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_9_19749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_11_29780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_11_3_19811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingEntity__TableNameAssignment_13_19842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EAttribute__PkAssignment_09878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__PropertyAssignment_19917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__ColumnNameAssignment_3_0_09948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EAttribute__DbTypeAssignment_3_0_1_29979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EAttribute__AutoAssignment_3_0_1_3_010015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EAttribute__KeygenqueryAssignment_3_0_1_3_1_110054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EAttribute__SequenceAssignment_3_0_1_3_2_110085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EAttribute__ResolvedAssignment_3_1_010121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EAttribute__QueryAssignment_3_1_110164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__ParametersAssignment_3_1_310199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_rule__ENamedQuery__ReturnTypeAssignment_010230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ENamedQuery__NameAssignment_110261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_rule__ENamedQuery__ParametersAssignment_2_110292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_410323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_5_110354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EParameter__TypeAssignment_010385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EParameter__NameAssignment_110416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__DbTypeAlternatives_0_0_in_rule__EQuery__DbTypeAssignment_010447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_rule__EQuery__MappingAssignment_110480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__FromAssignment_2_0_110511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__WhereAssignment_2_0_2_110542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__GroupByAssignment_2_0_3_110573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__OrderbyAssignment_2_0_4_110604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__AllAssignment_2_110635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EObjectSection__EntityAssignment_010670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EObjectSection__PrefixAssignment_1_010705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_110736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_2_110767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EMappingAttribute__PkAssignment_010803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__PropertyAssignment_110842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingAttribute__ColumnNameAssignment_3_010873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EMappingAttribute__ResolvedAssignment_3_1_010909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__QueryAssignment_3_1_110952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingAttribute__ParametersAssignment_3_1_310987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EMappingAttribute__MappedAssignment_3_2_011023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_rule__EMappingAttribute__MapAssignment_3_2_111062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EType__UrlAssignment_111093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EType__NameAssignment_311124 = new BitSet(new long[]{0x0000000000000002L});

}