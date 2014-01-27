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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'extends'", "'derived'", "'default'", "'list'", "'single'", "'bundle'", "'{'", "'}'", "','", "'databases'", "'import'", "'package'", "';'", "'entity'", "'attributes'", "'queries'", "'as'", "'descriminatedby'", "'=>'", "'generatedby'", "'('", "')'", "'on'", "'query'", "'seqnext'", "'FROM'", "'WHERE'", "'GROUP BY'", "'ORDER BY'", "'etype'", "'#'", "'.'", "'*'", "'abstract'", "'primarykey'", "'resolve'", "'autokey'", "'map'"
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


    // $ANTLR start "entryRuleEValueGenerator"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:257:1: entryRuleEValueGenerator : ruleEValueGenerator EOF ;
    public final void entryRuleEValueGenerator() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:258:1: ( ruleEValueGenerator EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:259:1: ruleEValueGenerator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator487);
            ruleEValueGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEValueGenerator494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEValueGenerator"


    // $ANTLR start "ruleEValueGenerator"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:266:1: ruleEValueGenerator : ( ( rule__EValueGenerator__Group__0 ) ) ;
    public final void ruleEValueGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:270:2: ( ( ( rule__EValueGenerator__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:271:1: ( ( rule__EValueGenerator__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:271:1: ( ( rule__EValueGenerator__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:272:1: ( rule__EValueGenerator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:273:1: ( rule__EValueGenerator__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:273:2: rule__EValueGenerator__Group__0
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group__0_in_ruleEValueGenerator520);
            rule__EValueGenerator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEValueGenerator"


    // $ANTLR start "entryRuleENamedQuery"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:285:1: entryRuleENamedQuery : ruleENamedQuery EOF ;
    public final void entryRuleENamedQuery() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:286:1: ( ruleENamedQuery EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:287:1: ruleENamedQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryRule()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery547);
            ruleENamedQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleENamedQuery554); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:294:1: ruleENamedQuery : ( ( rule__ENamedQuery__Group__0 ) ) ;
    public final void ruleENamedQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:298:2: ( ( ( rule__ENamedQuery__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:299:1: ( ( rule__ENamedQuery__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:299:1: ( ( rule__ENamedQuery__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:300:1: ( rule__ENamedQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:301:1: ( rule__ENamedQuery__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:301:2: rule__ENamedQuery__Group__0
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__0_in_ruleENamedQuery580);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:313:1: entryRuleEParameter : ruleEParameter EOF ;
    public final void entryRuleEParameter() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:314:1: ( ruleEParameter EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:315:1: ruleEParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterRule()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_entryRuleEParameter607);
            ruleEParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEParameter614); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:322:1: ruleEParameter : ( ( rule__EParameter__Group__0 ) ) ;
    public final void ruleEParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:326:2: ( ( ( rule__EParameter__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:327:1: ( ( rule__EParameter__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:327:1: ( ( rule__EParameter__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:328:1: ( rule__EParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:329:1: ( rule__EParameter__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:329:2: rule__EParameter__Group__0
            {
            pushFollow(FOLLOW_rule__EParameter__Group__0_in_ruleEParameter640);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:341:1: entryRuleEQuery : ruleEQuery EOF ;
    public final void entryRuleEQuery() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:342:1: ( ruleEQuery EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:343:1: ruleEQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryRule()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_entryRuleEQuery667);
            ruleEQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQuery674); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:350:1: ruleEQuery : ( ( rule__EQuery__Group__0 ) ) ;
    public final void ruleEQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:354:2: ( ( ( rule__EQuery__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:355:1: ( ( rule__EQuery__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:355:1: ( ( rule__EQuery__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:356:1: ( rule__EQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:357:1: ( rule__EQuery__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:357:2: rule__EQuery__Group__0
            {
            pushFollow(FOLLOW_rule__EQuery__Group__0_in_ruleEQuery700);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:369:1: entryRuleEObjectSection : ruleEObjectSection EOF ;
    public final void entryRuleEObjectSection() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:370:1: ( ruleEObjectSection EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:371:1: ruleEObjectSection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionRule()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection727);
            ruleEObjectSection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEObjectSection734); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:378:1: ruleEObjectSection : ( ( rule__EObjectSection__Group__0 ) ) ;
    public final void ruleEObjectSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:382:2: ( ( ( rule__EObjectSection__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:383:1: ( ( rule__EObjectSection__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:383:1: ( ( rule__EObjectSection__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:384:1: ( rule__EObjectSection__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:385:1: ( rule__EObjectSection__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:385:2: rule__EObjectSection__Group__0
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__0_in_ruleEObjectSection760);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:397:1: entryRuleEMappingAttribute : ruleEMappingAttribute EOF ;
    public final void entryRuleEMappingAttribute() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:398:1: ( ruleEMappingAttribute EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:399:1: ruleEMappingAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute787);
            ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMappingAttribute794); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:406:1: ruleEMappingAttribute : ( ( rule__EMappingAttribute__Group__0 ) ) ;
    public final void ruleEMappingAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:410:2: ( ( ( rule__EMappingAttribute__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:411:1: ( ( rule__EMappingAttribute__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:411:1: ( ( rule__EMappingAttribute__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:412:1: ( rule__EMappingAttribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:413:1: ( rule__EMappingAttribute__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:413:2: rule__EMappingAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__0_in_ruleEMappingAttribute820);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:425:1: entryRuleEType : ruleEType EOF ;
    public final void entryRuleEType() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:426:1: ( ruleEType EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:427:1: ruleEType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeRule()); 
            }
            pushFollow(FOLLOW_ruleEType_in_entryRuleEType847);
            ruleEType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getETypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEType854); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:434:1: ruleEType : ( ( rule__EType__Group__0 ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:438:2: ( ( ( rule__EType__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:439:1: ( ( rule__EType__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:439:1: ( ( rule__EType__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:440:1: ( rule__EType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:441:1: ( rule__EType__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:441:2: rule__EType__Group__0
            {
            pushFollow(FOLLOW_rule__EType__Group__0_in_ruleEType880);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:453:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:454:1: ( ruleQualifiedName EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:455:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName907);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName914); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:462:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:466:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:467:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:467:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:468:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:469:1: ( rule__QualifiedName__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:469:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName940);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:481:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:482:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:483:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard967);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard974); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:490:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:494:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:495:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:495:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:496:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:497:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:497:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1000);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:510:1: ruleReturnType : ( ( rule__ReturnType__Alternatives ) ) ;
    public final void ruleReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:514:1: ( ( ( rule__ReturnType__Alternatives ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:515:1: ( ( rule__ReturnType__Alternatives ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:515:1: ( ( rule__ReturnType__Alternatives ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:516:1: ( rule__ReturnType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnTypeAccess().getAlternatives()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:517:1: ( rule__ReturnType__Alternatives )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:517:2: rule__ReturnType__Alternatives
            {
            pushFollow(FOLLOW_rule__ReturnType__Alternatives_in_ruleReturnType1037);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:528:1: rule__EMapping__RootAlternatives_0 : ( ( ruleEMappingBundle ) | ( ruleEMappingEntityDef ) );
    public final void rule__EMapping__RootAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:532:1: ( ( ruleEMappingBundle ) | ( ruleEMappingEntityDef ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16||LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:533:1: ( ruleEMappingBundle )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:533:1: ( ruleEMappingBundle )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:534:1: ruleEMappingBundle
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAccess().getRootEMappingBundleParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleEMappingBundle_in_rule__EMapping__RootAlternatives_01072);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:539:6: ( ruleEMappingEntityDef )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:539:6: ( ruleEMappingEntityDef )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:540:1: ruleEMappingEntityDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAccess().getRootEMappingEntityDefParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleEMappingEntityDef_in_rule__EMapping__RootAlternatives_01089);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:550:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) );
    public final void rule__Import__ImportedNamespaceAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:554:1: ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:555:1: ( ruleQualifiedNameWithWildcard )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:555:1: ( ruleQualifiedNameWithWildcard )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:556:1: ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01121);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:561:6: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:561:6: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:562:1: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAlternatives_1_01138);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:572:1: rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 : ( ( 'extends' ) | ( 'derived' ) );
    public final void rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:576:1: ( ( 'extends' ) | ( 'derived' ) )
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:577:1: ( 'extends' )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:577:1: ( 'extends' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:578:1: 'extends'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingEntityAccess().getExtensionTypeExtendsKeyword_3_0_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01171); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEMappingEntityAccess().getExtensionTypeExtendsKeyword_3_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:585:6: ( 'derived' )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:585:6: ( 'derived' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:586:1: 'derived'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingEntityAccess().getExtensionTypeDerivedKeyword_3_0_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01191); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:598:1: rule__EAttribute__Alternatives_3 : ( ( ( rule__EAttribute__Group_3_0__0 ) ) | ( ( rule__EAttribute__Group_3_1__0 ) ) );
    public final void rule__EAttribute__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:602:1: ( ( ( rule__EAttribute__Group_3_0__0 ) ) | ( ( rule__EAttribute__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==46) ) {
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:603:1: ( ( rule__EAttribute__Group_3_0__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:603:1: ( ( rule__EAttribute__Group_3_0__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:604:1: ( rule__EAttribute__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEAttributeAccess().getGroup_3_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:605:1: ( rule__EAttribute__Group_3_0__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:605:2: rule__EAttribute__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_0__0_in_rule__EAttribute__Alternatives_31225);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:609:6: ( ( rule__EAttribute__Group_3_1__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:609:6: ( ( rule__EAttribute__Group_3_1__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:610:1: ( rule__EAttribute__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEAttributeAccess().getGroup_3_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:611:1: ( rule__EAttribute__Group_3_1__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:611:2: rule__EAttribute__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_1__0_in_rule__EAttribute__Alternatives_31243);
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


    // $ANTLR start "rule__EValueGenerator__Alternatives_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:620:1: rule__EValueGenerator__Alternatives_1 : ( ( ( rule__EValueGenerator__AutokeyAssignment_1_0 ) ) | ( ( rule__EValueGenerator__Group_1_1__0 ) ) | ( ( rule__EValueGenerator__Group_1_2__0 ) ) );
    public final void rule__EValueGenerator__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:624:1: ( ( ( rule__EValueGenerator__AutokeyAssignment_1_0 ) ) | ( ( rule__EValueGenerator__Group_1_1__0 ) ) | ( ( rule__EValueGenerator__Group_1_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case 35:
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:625:1: ( ( rule__EValueGenerator__AutokeyAssignment_1_0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:625:1: ( ( rule__EValueGenerator__AutokeyAssignment_1_0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:626:1: ( rule__EValueGenerator__AutokeyAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEValueGeneratorAccess().getAutokeyAssignment_1_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:627:1: ( rule__EValueGenerator__AutokeyAssignment_1_0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:627:2: rule__EValueGenerator__AutokeyAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__EValueGenerator__AutokeyAssignment_1_0_in_rule__EValueGenerator__Alternatives_11276);
                    rule__EValueGenerator__AutokeyAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEValueGeneratorAccess().getAutokeyAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:631:6: ( ( rule__EValueGenerator__Group_1_1__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:631:6: ( ( rule__EValueGenerator__Group_1_1__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:632:1: ( rule__EValueGenerator__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEValueGeneratorAccess().getGroup_1_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:633:1: ( rule__EValueGenerator__Group_1_1__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:633:2: rule__EValueGenerator__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__EValueGenerator__Group_1_1__0_in_rule__EValueGenerator__Alternatives_11294);
                    rule__EValueGenerator__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEValueGeneratorAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:637:6: ( ( rule__EValueGenerator__Group_1_2__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:637:6: ( ( rule__EValueGenerator__Group_1_2__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:638:1: ( rule__EValueGenerator__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEValueGeneratorAccess().getGroup_1_2()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:639:1: ( rule__EValueGenerator__Group_1_2__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:639:2: rule__EValueGenerator__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__EValueGenerator__Group_1_2__0_in_rule__EValueGenerator__Alternatives_11312);
                    rule__EValueGenerator__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEValueGeneratorAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__EValueGenerator__Alternatives_1"


    // $ANTLR start "rule__EQuery__DbTypeAlternatives_0_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:648:1: rule__EQuery__DbTypeAlternatives_0_0 : ( ( 'default' ) | ( RULE_STRING ) );
    public final void rule__EQuery__DbTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:652:1: ( ( 'default' ) | ( RULE_STRING ) )
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:653:1: ( 'default' )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:653:1: ( 'default' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:654:1: 'default'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getDbTypeDefaultKeyword_0_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__EQuery__DbTypeAlternatives_0_01346); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEQueryAccess().getDbTypeDefaultKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:661:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:661:6: ( RULE_STRING )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:662:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getDbTypeSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__DbTypeAlternatives_0_01365); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:672:1: rule__EQuery__Alternatives_2 : ( ( ( rule__EQuery__Group_2_0__0 ) ) | ( ( rule__EQuery__AllAssignment_2_1 ) ) );
    public final void rule__EQuery__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:676:1: ( ( ( rule__EQuery__Group_2_0__0 ) ) | ( ( rule__EQuery__AllAssignment_2_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:677:1: ( ( rule__EQuery__Group_2_0__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:677:1: ( ( rule__EQuery__Group_2_0__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:678:1: ( rule__EQuery__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getGroup_2_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:679:1: ( rule__EQuery__Group_2_0__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:679:2: rule__EQuery__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0__0_in_rule__EQuery__Alternatives_21397);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:683:6: ( ( rule__EQuery__AllAssignment_2_1 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:683:6: ( ( rule__EQuery__AllAssignment_2_1 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:684:1: ( rule__EQuery__AllAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getAllAssignment_2_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:685:1: ( rule__EQuery__AllAssignment_2_1 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:685:2: rule__EQuery__AllAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__EQuery__AllAssignment_2_1_in_rule__EQuery__Alternatives_21415);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:694:1: rule__EMappingAttribute__Alternatives_3 : ( ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) ) | ( ( rule__EMappingAttribute__Group_3_1__0 ) ) | ( ( rule__EMappingAttribute__Group_3_2__0 ) ) );
    public final void rule__EMappingAttribute__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:698:1: ( ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) ) | ( ( rule__EMappingAttribute__Group_3_1__0 ) ) | ( ( rule__EMappingAttribute__Group_3_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 46:
                {
                alt8=2;
                }
                break;
            case 48:
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:699:1: ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:699:1: ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:700:1: ( rule__EMappingAttribute__ColumnNameAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAttributeAccess().getColumnNameAssignment_3_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:701:1: ( rule__EMappingAttribute__ColumnNameAssignment_3_0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:701:2: rule__EMappingAttribute__ColumnNameAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__ColumnNameAssignment_3_0_in_rule__EMappingAttribute__Alternatives_31448);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:705:6: ( ( rule__EMappingAttribute__Group_3_1__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:705:6: ( ( rule__EMappingAttribute__Group_3_1__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:706:1: ( rule__EMappingAttribute__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAttributeAccess().getGroup_3_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:707:1: ( rule__EMappingAttribute__Group_3_1__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:707:2: rule__EMappingAttribute__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__0_in_rule__EMappingAttribute__Alternatives_31466);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:711:6: ( ( rule__EMappingAttribute__Group_3_2__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:711:6: ( ( rule__EMappingAttribute__Group_3_2__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:712:1: ( rule__EMappingAttribute__Group_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAttributeAccess().getGroup_3_2()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:713:1: ( rule__EMappingAttribute__Group_3_2__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:713:2: rule__EMappingAttribute__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__0_in_rule__EMappingAttribute__Alternatives_31484);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:722:1: rule__ReturnType__Alternatives : ( ( ( 'list' ) ) | ( ( 'single' ) ) );
    public final void rule__ReturnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:726:1: ( ( ( 'list' ) ) | ( ( 'single' ) ) )
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:727:1: ( ( 'list' ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:727:1: ( ( 'list' ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:728:1: ( 'list' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:729:1: ( 'list' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:729:3: 'list'
                    {
                    match(input,14,FOLLOW_14_in_rule__ReturnType__Alternatives1518); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReturnTypeAccess().getListEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:734:6: ( ( 'single' ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:734:6: ( ( 'single' ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:735:1: ( 'single' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReturnTypeAccess().getSingleEnumLiteralDeclaration_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:736:1: ( 'single' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:736:3: 'single'
                    {
                    match(input,15,FOLLOW_15_in_rule__ReturnType__Alternatives1539); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:748:1: rule__EMappingBundle__Group__0 : rule__EMappingBundle__Group__0__Impl rule__EMappingBundle__Group__1 ;
    public final void rule__EMappingBundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:752:1: ( rule__EMappingBundle__Group__0__Impl rule__EMappingBundle__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:753:2: rule__EMappingBundle__Group__0__Impl rule__EMappingBundle__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__0__Impl_in_rule__EMappingBundle__Group__01572);
            rule__EMappingBundle__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__1_in_rule__EMappingBundle__Group__01575);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:760:1: rule__EMappingBundle__Group__0__Impl : ( ( rule__EMappingBundle__ImportsAssignment_0 )* ) ;
    public final void rule__EMappingBundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:764:1: ( ( ( rule__EMappingBundle__ImportsAssignment_0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:765:1: ( ( rule__EMappingBundle__ImportsAssignment_0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:765:1: ( ( rule__EMappingBundle__ImportsAssignment_0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:766:1: ( rule__EMappingBundle__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getImportsAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:767:1: ( rule__EMappingBundle__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:767:2: rule__EMappingBundle__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingBundle__ImportsAssignment_0_in_rule__EMappingBundle__Group__0__Impl1602);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:777:1: rule__EMappingBundle__Group__1 : rule__EMappingBundle__Group__1__Impl rule__EMappingBundle__Group__2 ;
    public final void rule__EMappingBundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:781:1: ( rule__EMappingBundle__Group__1__Impl rule__EMappingBundle__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:782:2: rule__EMappingBundle__Group__1__Impl rule__EMappingBundle__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__1__Impl_in_rule__EMappingBundle__Group__11633);
            rule__EMappingBundle__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__2_in_rule__EMappingBundle__Group__11636);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:789:1: rule__EMappingBundle__Group__1__Impl : ( 'bundle' ) ;
    public final void rule__EMappingBundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:793:1: ( ( 'bundle' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:794:1: ( 'bundle' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:794:1: ( 'bundle' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:795:1: 'bundle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getBundleKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__EMappingBundle__Group__1__Impl1664); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:808:1: rule__EMappingBundle__Group__2 : rule__EMappingBundle__Group__2__Impl rule__EMappingBundle__Group__3 ;
    public final void rule__EMappingBundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:812:1: ( rule__EMappingBundle__Group__2__Impl rule__EMappingBundle__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:813:2: rule__EMappingBundle__Group__2__Impl rule__EMappingBundle__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__2__Impl_in_rule__EMappingBundle__Group__21695);
            rule__EMappingBundle__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__3_in_rule__EMappingBundle__Group__21698);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:820:1: rule__EMappingBundle__Group__2__Impl : ( ( rule__EMappingBundle__NameAssignment_2 ) ) ;
    public final void rule__EMappingBundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:824:1: ( ( ( rule__EMappingBundle__NameAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:825:1: ( ( rule__EMappingBundle__NameAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:825:1: ( ( rule__EMappingBundle__NameAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:826:1: ( rule__EMappingBundle__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:827:1: ( rule__EMappingBundle__NameAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:827:2: rule__EMappingBundle__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingBundle__NameAssignment_2_in_rule__EMappingBundle__Group__2__Impl1725);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:837:1: rule__EMappingBundle__Group__3 : rule__EMappingBundle__Group__3__Impl rule__EMappingBundle__Group__4 ;
    public final void rule__EMappingBundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:841:1: ( rule__EMappingBundle__Group__3__Impl rule__EMappingBundle__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:842:2: rule__EMappingBundle__Group__3__Impl rule__EMappingBundle__Group__4
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__3__Impl_in_rule__EMappingBundle__Group__31755);
            rule__EMappingBundle__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__4_in_rule__EMappingBundle__Group__31758);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:849:1: rule__EMappingBundle__Group__3__Impl : ( '{' ) ;
    public final void rule__EMappingBundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:853:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:854:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:854:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:855:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingBundle__Group__3__Impl1786); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:868:1: rule__EMappingBundle__Group__4 : rule__EMappingBundle__Group__4__Impl rule__EMappingBundle__Group__5 ;
    public final void rule__EMappingBundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:872:1: ( rule__EMappingBundle__Group__4__Impl rule__EMappingBundle__Group__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:873:2: rule__EMappingBundle__Group__4__Impl rule__EMappingBundle__Group__5
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__4__Impl_in_rule__EMappingBundle__Group__41817);
            rule__EMappingBundle__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__5_in_rule__EMappingBundle__Group__41820);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:880:1: rule__EMappingBundle__Group__4__Impl : ( ( rule__EMappingBundle__EntitiesAssignment_4 ) ) ;
    public final void rule__EMappingBundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:884:1: ( ( ( rule__EMappingBundle__EntitiesAssignment_4 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:885:1: ( ( rule__EMappingBundle__EntitiesAssignment_4 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:885:1: ( ( rule__EMappingBundle__EntitiesAssignment_4 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:886:1: ( rule__EMappingBundle__EntitiesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_4()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:887:1: ( rule__EMappingBundle__EntitiesAssignment_4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:887:2: rule__EMappingBundle__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_rule__EMappingBundle__EntitiesAssignment_4_in_rule__EMappingBundle__Group__4__Impl1847);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:897:1: rule__EMappingBundle__Group__5 : rule__EMappingBundle__Group__5__Impl rule__EMappingBundle__Group__6 ;
    public final void rule__EMappingBundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:901:1: ( rule__EMappingBundle__Group__5__Impl rule__EMappingBundle__Group__6 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:902:2: rule__EMappingBundle__Group__5__Impl rule__EMappingBundle__Group__6
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__5__Impl_in_rule__EMappingBundle__Group__51877);
            rule__EMappingBundle__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__6_in_rule__EMappingBundle__Group__51880);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:909:1: rule__EMappingBundle__Group__5__Impl : ( ( rule__EMappingBundle__Group_5__0 )* ) ;
    public final void rule__EMappingBundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:913:1: ( ( ( rule__EMappingBundle__Group_5__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:914:1: ( ( rule__EMappingBundle__Group_5__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:914:1: ( ( rule__EMappingBundle__Group_5__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:915:1: ( rule__EMappingBundle__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getGroup_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:916:1: ( rule__EMappingBundle__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:916:2: rule__EMappingBundle__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingBundle__Group_5__0_in_rule__EMappingBundle__Group__5__Impl1907);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:926:1: rule__EMappingBundle__Group__6 : rule__EMappingBundle__Group__6__Impl rule__EMappingBundle__Group__7 ;
    public final void rule__EMappingBundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:930:1: ( rule__EMappingBundle__Group__6__Impl rule__EMappingBundle__Group__7 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:931:2: rule__EMappingBundle__Group__6__Impl rule__EMappingBundle__Group__7
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__6__Impl_in_rule__EMappingBundle__Group__61938);
            rule__EMappingBundle__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__7_in_rule__EMappingBundle__Group__61941);
            rule__EMappingBundle__Group__7();

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:938:1: rule__EMappingBundle__Group__6__Impl : ( '}' ) ;
    public final void rule__EMappingBundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:942:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:943:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:943:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:944:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingBundle__Group__6__Impl1969); if (state.failed) return ;
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


    // $ANTLR start "rule__EMappingBundle__Group__7"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:957:1: rule__EMappingBundle__Group__7 : rule__EMappingBundle__Group__7__Impl ;
    public final void rule__EMappingBundle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:961:1: ( rule__EMappingBundle__Group__7__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:962:2: rule__EMappingBundle__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__7__Impl_in_rule__EMappingBundle__Group__72000);
            rule__EMappingBundle__Group__7__Impl();

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
    // $ANTLR end "rule__EMappingBundle__Group__7"


    // $ANTLR start "rule__EMappingBundle__Group__7__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:968:1: rule__EMappingBundle__Group__7__Impl : ( ( rule__EMappingBundle__Group_7__0 )? ) ;
    public final void rule__EMappingBundle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:972:1: ( ( ( rule__EMappingBundle__Group_7__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:973:1: ( ( rule__EMappingBundle__Group_7__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:973:1: ( ( rule__EMappingBundle__Group_7__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:974:1: ( rule__EMappingBundle__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getGroup_7()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:975:1: ( rule__EMappingBundle__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:975:2: rule__EMappingBundle__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__EMappingBundle__Group_7__0_in_rule__EMappingBundle__Group__7__Impl2027);
                    rule__EMappingBundle__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingBundle__Group__7__Impl"


    // $ANTLR start "rule__EMappingBundle__Group_5__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1001:1: rule__EMappingBundle__Group_5__0 : rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1 ;
    public final void rule__EMappingBundle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1005:1: ( rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1006:2: rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__0__Impl_in_rule__EMappingBundle__Group_5__02074);
            rule__EMappingBundle__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__1_in_rule__EMappingBundle__Group_5__02077);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1013:1: rule__EMappingBundle__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EMappingBundle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1017:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1018:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1018:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1019:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getCommaKeyword_5_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EMappingBundle__Group_5__0__Impl2105); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1032:1: rule__EMappingBundle__Group_5__1 : rule__EMappingBundle__Group_5__1__Impl ;
    public final void rule__EMappingBundle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1036:1: ( rule__EMappingBundle__Group_5__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1037:2: rule__EMappingBundle__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__1__Impl_in_rule__EMappingBundle__Group_5__12136);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1043:1: rule__EMappingBundle__Group_5__1__Impl : ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) ) ;
    public final void rule__EMappingBundle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1047:1: ( ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1048:1: ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1048:1: ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1049:1: ( rule__EMappingBundle__EntitiesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_5_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1050:1: ( rule__EMappingBundle__EntitiesAssignment_5_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1050:2: rule__EMappingBundle__EntitiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__EntitiesAssignment_5_1_in_rule__EMappingBundle__Group_5__1__Impl2163);
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


    // $ANTLR start "rule__EMappingBundle__Group_7__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1064:1: rule__EMappingBundle__Group_7__0 : rule__EMappingBundle__Group_7__0__Impl rule__EMappingBundle__Group_7__1 ;
    public final void rule__EMappingBundle__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1068:1: ( rule__EMappingBundle__Group_7__0__Impl rule__EMappingBundle__Group_7__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1069:2: rule__EMappingBundle__Group_7__0__Impl rule__EMappingBundle__Group_7__1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_7__0__Impl_in_rule__EMappingBundle__Group_7__02197);
            rule__EMappingBundle__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group_7__1_in_rule__EMappingBundle__Group_7__02200);
            rule__EMappingBundle__Group_7__1();

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
    // $ANTLR end "rule__EMappingBundle__Group_7__0"


    // $ANTLR start "rule__EMappingBundle__Group_7__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1076:1: rule__EMappingBundle__Group_7__0__Impl : ( 'databases' ) ;
    public final void rule__EMappingBundle__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1080:1: ( ( 'databases' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1081:1: ( 'databases' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1081:1: ( 'databases' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1082:1: 'databases'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getDatabasesKeyword_7_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__EMappingBundle__Group_7__0__Impl2228); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getDatabasesKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingBundle__Group_7__0__Impl"


    // $ANTLR start "rule__EMappingBundle__Group_7__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1095:1: rule__EMappingBundle__Group_7__1 : rule__EMappingBundle__Group_7__1__Impl rule__EMappingBundle__Group_7__2 ;
    public final void rule__EMappingBundle__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1099:1: ( rule__EMappingBundle__Group_7__1__Impl rule__EMappingBundle__Group_7__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1100:2: rule__EMappingBundle__Group_7__1__Impl rule__EMappingBundle__Group_7__2
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_7__1__Impl_in_rule__EMappingBundle__Group_7__12259);
            rule__EMappingBundle__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group_7__2_in_rule__EMappingBundle__Group_7__12262);
            rule__EMappingBundle__Group_7__2();

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
    // $ANTLR end "rule__EMappingBundle__Group_7__1"


    // $ANTLR start "rule__EMappingBundle__Group_7__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1107:1: rule__EMappingBundle__Group_7__1__Impl : ( ( rule__EMappingBundle__DatabasesAssignment_7_1 ) ) ;
    public final void rule__EMappingBundle__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1111:1: ( ( ( rule__EMappingBundle__DatabasesAssignment_7_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1112:1: ( ( rule__EMappingBundle__DatabasesAssignment_7_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1112:1: ( ( rule__EMappingBundle__DatabasesAssignment_7_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1113:1: ( rule__EMappingBundle__DatabasesAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getDatabasesAssignment_7_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1114:1: ( rule__EMappingBundle__DatabasesAssignment_7_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1114:2: rule__EMappingBundle__DatabasesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__DatabasesAssignment_7_1_in_rule__EMappingBundle__Group_7__1__Impl2289);
            rule__EMappingBundle__DatabasesAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getDatabasesAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingBundle__Group_7__1__Impl"


    // $ANTLR start "rule__EMappingBundle__Group_7__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1124:1: rule__EMappingBundle__Group_7__2 : rule__EMappingBundle__Group_7__2__Impl ;
    public final void rule__EMappingBundle__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1128:1: ( rule__EMappingBundle__Group_7__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1129:2: rule__EMappingBundle__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_7__2__Impl_in_rule__EMappingBundle__Group_7__22319);
            rule__EMappingBundle__Group_7__2__Impl();

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
    // $ANTLR end "rule__EMappingBundle__Group_7__2"


    // $ANTLR start "rule__EMappingBundle__Group_7__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1135:1: rule__EMappingBundle__Group_7__2__Impl : ( ( rule__EMappingBundle__Group_7_2__0 )* ) ;
    public final void rule__EMappingBundle__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1139:1: ( ( ( rule__EMappingBundle__Group_7_2__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1140:1: ( ( rule__EMappingBundle__Group_7_2__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1140:1: ( ( rule__EMappingBundle__Group_7_2__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1141:1: ( rule__EMappingBundle__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getGroup_7_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1142:1: ( rule__EMappingBundle__Group_7_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1142:2: rule__EMappingBundle__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingBundle__Group_7_2__0_in_rule__EMappingBundle__Group_7__2__Impl2346);
            	    rule__EMappingBundle__Group_7_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getGroup_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingBundle__Group_7__2__Impl"


    // $ANTLR start "rule__EMappingBundle__Group_7_2__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1158:1: rule__EMappingBundle__Group_7_2__0 : rule__EMappingBundle__Group_7_2__0__Impl rule__EMappingBundle__Group_7_2__1 ;
    public final void rule__EMappingBundle__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1162:1: ( rule__EMappingBundle__Group_7_2__0__Impl rule__EMappingBundle__Group_7_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1163:2: rule__EMappingBundle__Group_7_2__0__Impl rule__EMappingBundle__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_7_2__0__Impl_in_rule__EMappingBundle__Group_7_2__02383);
            rule__EMappingBundle__Group_7_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group_7_2__1_in_rule__EMappingBundle__Group_7_2__02386);
            rule__EMappingBundle__Group_7_2__1();

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
    // $ANTLR end "rule__EMappingBundle__Group_7_2__0"


    // $ANTLR start "rule__EMappingBundle__Group_7_2__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1170:1: rule__EMappingBundle__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__EMappingBundle__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1174:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1175:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1175:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1176:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getCommaKeyword_7_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EMappingBundle__Group_7_2__0__Impl2414); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getCommaKeyword_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingBundle__Group_7_2__0__Impl"


    // $ANTLR start "rule__EMappingBundle__Group_7_2__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1189:1: rule__EMappingBundle__Group_7_2__1 : rule__EMappingBundle__Group_7_2__1__Impl ;
    public final void rule__EMappingBundle__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1193:1: ( rule__EMappingBundle__Group_7_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1194:2: rule__EMappingBundle__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_7_2__1__Impl_in_rule__EMappingBundle__Group_7_2__12445);
            rule__EMappingBundle__Group_7_2__1__Impl();

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
    // $ANTLR end "rule__EMappingBundle__Group_7_2__1"


    // $ANTLR start "rule__EMappingBundle__Group_7_2__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1200:1: rule__EMappingBundle__Group_7_2__1__Impl : ( ( rule__EMappingBundle__DatabasesAssignment_7_2_1 ) ) ;
    public final void rule__EMappingBundle__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1204:1: ( ( ( rule__EMappingBundle__DatabasesAssignment_7_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1205:1: ( ( rule__EMappingBundle__DatabasesAssignment_7_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1205:1: ( ( rule__EMappingBundle__DatabasesAssignment_7_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1206:1: ( rule__EMappingBundle__DatabasesAssignment_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getDatabasesAssignment_7_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1207:1: ( rule__EMappingBundle__DatabasesAssignment_7_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1207:2: rule__EMappingBundle__DatabasesAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__DatabasesAssignment_7_2_1_in_rule__EMappingBundle__Group_7_2__1__Impl2472);
            rule__EMappingBundle__DatabasesAssignment_7_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getDatabasesAssignment_7_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingBundle__Group_7_2__1__Impl"


    // $ANTLR start "rule__EMappingEntityDef__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1221:1: rule__EMappingEntityDef__Group__0 : rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1 ;
    public final void rule__EMappingEntityDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1225:1: ( rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1226:2: rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__0__Impl_in_rule__EMappingEntityDef__Group__02506);
            rule__EMappingEntityDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__1_in_rule__EMappingEntityDef__Group__02509);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1233:1: rule__EMappingEntityDef__Group__0__Impl : ( ( rule__EMappingEntityDef__PackageAssignment_0 ) ) ;
    public final void rule__EMappingEntityDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1237:1: ( ( ( rule__EMappingEntityDef__PackageAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1238:1: ( ( rule__EMappingEntityDef__PackageAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1238:1: ( ( rule__EMappingEntityDef__PackageAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1239:1: ( rule__EMappingEntityDef__PackageAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getPackageAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1240:1: ( rule__EMappingEntityDef__PackageAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1240:2: rule__EMappingEntityDef__PackageAssignment_0
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__PackageAssignment_0_in_rule__EMappingEntityDef__Group__0__Impl2536);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1250:1: rule__EMappingEntityDef__Group__1 : rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2 ;
    public final void rule__EMappingEntityDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1254:1: ( rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1255:2: rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__1__Impl_in_rule__EMappingEntityDef__Group__12566);
            rule__EMappingEntityDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__2_in_rule__EMappingEntityDef__Group__12569);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1262:1: rule__EMappingEntityDef__Group__1__Impl : ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* ) ;
    public final void rule__EMappingEntityDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1266:1: ( ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1267:1: ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1267:1: ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1268:1: ( rule__EMappingEntityDef__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getImportsAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1269:1: ( rule__EMappingEntityDef__ImportsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1269:2: rule__EMappingEntityDef__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntityDef__ImportsAssignment_1_in_rule__EMappingEntityDef__Group__1__Impl2596);
            	    rule__EMappingEntityDef__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1279:1: rule__EMappingEntityDef__Group__2 : rule__EMappingEntityDef__Group__2__Impl ;
    public final void rule__EMappingEntityDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1283:1: ( rule__EMappingEntityDef__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1284:2: rule__EMappingEntityDef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__2__Impl_in_rule__EMappingEntityDef__Group__22627);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1290:1: rule__EMappingEntityDef__Group__2__Impl : ( ( rule__EMappingEntityDef__EntityAssignment_2 ) ) ;
    public final void rule__EMappingEntityDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1294:1: ( ( ( rule__EMappingEntityDef__EntityAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1295:1: ( ( rule__EMappingEntityDef__EntityAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1295:1: ( ( rule__EMappingEntityDef__EntityAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1296:1: ( rule__EMappingEntityDef__EntityAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getEntityAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1297:1: ( rule__EMappingEntityDef__EntityAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1297:2: rule__EMappingEntityDef__EntityAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__EntityAssignment_2_in_rule__EMappingEntityDef__Group__2__Impl2654);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1313:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1317:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1318:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02690);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02693);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1325:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1329:1: ( ( 'import' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1330:1: ( 'import' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1330:1: ( 'import' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1331:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Import__Group__0__Impl2721); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1344:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1348:1: ( rule__Import__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1349:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12752);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1355:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1359:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1360:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1360:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1361:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1362:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1362:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2779);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1376:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1380:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1381:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02813);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02816);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1388:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1392:1: ( ( 'package' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1393:1: ( 'package' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1393:1: ( 'package' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1394:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group__0__Impl2844); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1407:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1411:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1412:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12875);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12878);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1419:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1423:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1424:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1424:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1425:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1426:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1426:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2905);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1436:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1440:1: ( rule__PackageDeclaration__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1441:2: rule__PackageDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22935);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1447:1: rule__PackageDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1451:1: ( ( ';' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1452:1: ( ';' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1452:1: ( ';' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1453:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__PackageDeclaration__Group__2__Impl2963); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1472:1: rule__EMappingEntity__Group__0 : rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1 ;
    public final void rule__EMappingEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1476:1: ( rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1477:2: rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__0__Impl_in_rule__EMappingEntity__Group__03000);
            rule__EMappingEntity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__1_in_rule__EMappingEntity__Group__03003);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1484:1: rule__EMappingEntity__Group__0__Impl : ( ( rule__EMappingEntity__AbstractAssignment_0 )? ) ;
    public final void rule__EMappingEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1488:1: ( ( ( rule__EMappingEntity__AbstractAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1489:1: ( ( rule__EMappingEntity__AbstractAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1489:1: ( ( rule__EMappingEntity__AbstractAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1490:1: ( rule__EMappingEntity__AbstractAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1491:1: ( rule__EMappingEntity__AbstractAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1491:2: rule__EMappingEntity__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__AbstractAssignment_0_in_rule__EMappingEntity__Group__0__Impl3030);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1501:1: rule__EMappingEntity__Group__1 : rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2 ;
    public final void rule__EMappingEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1505:1: ( rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1506:2: rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__1__Impl_in_rule__EMappingEntity__Group__13061);
            rule__EMappingEntity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__2_in_rule__EMappingEntity__Group__13064);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1513:1: rule__EMappingEntity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__EMappingEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1517:1: ( ( 'entity' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1518:1: ( 'entity' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1518:1: ( 'entity' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1519:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEntityKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__EMappingEntity__Group__1__Impl3092); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1532:1: rule__EMappingEntity__Group__2 : rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3 ;
    public final void rule__EMappingEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1536:1: ( rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1537:2: rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__2__Impl_in_rule__EMappingEntity__Group__23123);
            rule__EMappingEntity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__3_in_rule__EMappingEntity__Group__23126);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1544:1: rule__EMappingEntity__Group__2__Impl : ( ( rule__EMappingEntity__NameAssignment_2 ) ) ;
    public final void rule__EMappingEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1548:1: ( ( ( rule__EMappingEntity__NameAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1549:1: ( ( rule__EMappingEntity__NameAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1549:1: ( ( rule__EMappingEntity__NameAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1550:1: ( rule__EMappingEntity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1551:1: ( rule__EMappingEntity__NameAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1551:2: rule__EMappingEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NameAssignment_2_in_rule__EMappingEntity__Group__2__Impl3153);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1561:1: rule__EMappingEntity__Group__3 : rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4 ;
    public final void rule__EMappingEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1565:1: ( rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1566:2: rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__3__Impl_in_rule__EMappingEntity__Group__33183);
            rule__EMappingEntity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__4_in_rule__EMappingEntity__Group__33186);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1573:1: rule__EMappingEntity__Group__3__Impl : ( ( rule__EMappingEntity__Group_3__0 )? ) ;
    public final void rule__EMappingEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1577:1: ( ( ( rule__EMappingEntity__Group_3__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1578:1: ( ( rule__EMappingEntity__Group_3__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1578:1: ( ( rule__EMappingEntity__Group_3__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1579:1: ( rule__EMappingEntity__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1580:1: ( rule__EMappingEntity__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=11 && LA16_0<=12)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1580:2: rule__EMappingEntity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_3__0_in_rule__EMappingEntity__Group__3__Impl3213);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1590:1: rule__EMappingEntity__Group__4 : rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5 ;
    public final void rule__EMappingEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1594:1: ( rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1595:2: rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__4__Impl_in_rule__EMappingEntity__Group__43244);
            rule__EMappingEntity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__5_in_rule__EMappingEntity__Group__43247);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1602:1: rule__EMappingEntity__Group__4__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1606:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1607:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1607:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1608:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group__4__Impl3275); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1621:1: rule__EMappingEntity__Group__5 : rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6 ;
    public final void rule__EMappingEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1625:1: ( rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1626:2: rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__5__Impl_in_rule__EMappingEntity__Group__53306);
            rule__EMappingEntity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__6_in_rule__EMappingEntity__Group__53309);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1633:1: rule__EMappingEntity__Group__5__Impl : ( ( rule__EMappingEntity__EtypeAssignment_5 ) ) ;
    public final void rule__EMappingEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1637:1: ( ( ( rule__EMappingEntity__EtypeAssignment_5 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1638:1: ( ( rule__EMappingEntity__EtypeAssignment_5 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1638:1: ( ( rule__EMappingEntity__EtypeAssignment_5 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1639:1: ( rule__EMappingEntity__EtypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEtypeAssignment_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1640:1: ( rule__EMappingEntity__EtypeAssignment_5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1640:2: rule__EMappingEntity__EtypeAssignment_5
            {
            pushFollow(FOLLOW_rule__EMappingEntity__EtypeAssignment_5_in_rule__EMappingEntity__Group__5__Impl3336);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1650:1: rule__EMappingEntity__Group__6 : rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7 ;
    public final void rule__EMappingEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1654:1: ( rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1655:2: rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__6__Impl_in_rule__EMappingEntity__Group__63366);
            rule__EMappingEntity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__7_in_rule__EMappingEntity__Group__63369);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1662:1: rule__EMappingEntity__Group__6__Impl : ( ( rule__EMappingEntity__Group_6__0 )? ) ;
    public final void rule__EMappingEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1666:1: ( ( ( rule__EMappingEntity__Group_6__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1667:1: ( ( rule__EMappingEntity__Group_6__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1667:1: ( ( rule__EMappingEntity__Group_6__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1668:1: ( rule__EMappingEntity__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_6()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1669:1: ( rule__EMappingEntity__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1669:2: rule__EMappingEntity__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_6__0_in_rule__EMappingEntity__Group__6__Impl3396);
                    rule__EMappingEntity__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup_6()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1679:1: rule__EMappingEntity__Group__7 : rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8 ;
    public final void rule__EMappingEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1683:1: ( rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1684:2: rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__7__Impl_in_rule__EMappingEntity__Group__73427);
            rule__EMappingEntity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__8_in_rule__EMappingEntity__Group__73430);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1691:1: rule__EMappingEntity__Group__7__Impl : ( ( rule__EMappingEntity__Group_7__0 )? ) ;
    public final void rule__EMappingEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1695:1: ( ( ( rule__EMappingEntity__Group_7__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1696:1: ( ( rule__EMappingEntity__Group_7__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1696:1: ( ( rule__EMappingEntity__Group_7__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1697:1: ( rule__EMappingEntity__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_7()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1698:1: ( rule__EMappingEntity__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1698:2: rule__EMappingEntity__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_7__0_in_rule__EMappingEntity__Group__7__Impl3457);
                    rule__EMappingEntity__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup_7()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1708:1: rule__EMappingEntity__Group__8 : rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9 ;
    public final void rule__EMappingEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1712:1: ( rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1713:2: rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__8__Impl_in_rule__EMappingEntity__Group__83488);
            rule__EMappingEntity__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__9_in_rule__EMappingEntity__Group__83491);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1720:1: rule__EMappingEntity__Group__8__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1724:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1725:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1725:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1726:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingEntity__Group__8__Impl3519); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1739:1: rule__EMappingEntity__Group__9 : rule__EMappingEntity__Group__9__Impl rule__EMappingEntity__Group__10 ;
    public final void rule__EMappingEntity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1743:1: ( rule__EMappingEntity__Group__9__Impl rule__EMappingEntity__Group__10 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1744:2: rule__EMappingEntity__Group__9__Impl rule__EMappingEntity__Group__10
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__9__Impl_in_rule__EMappingEntity__Group__93550);
            rule__EMappingEntity__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__10_in_rule__EMappingEntity__Group__93553);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1751:1: rule__EMappingEntity__Group__9__Impl : ( ( rule__EMappingEntity__Group_9__0 )? ) ;
    public final void rule__EMappingEntity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1755:1: ( ( ( rule__EMappingEntity__Group_9__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1756:1: ( ( rule__EMappingEntity__Group_9__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1756:1: ( ( rule__EMappingEntity__Group_9__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1757:1: ( rule__EMappingEntity__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_9()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1758:1: ( rule__EMappingEntity__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1758:2: rule__EMappingEntity__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_9__0_in_rule__EMappingEntity__Group__9__Impl3580);
                    rule__EMappingEntity__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1768:1: rule__EMappingEntity__Group__10 : rule__EMappingEntity__Group__10__Impl ;
    public final void rule__EMappingEntity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1772:1: ( rule__EMappingEntity__Group__10__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1773:2: rule__EMappingEntity__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__10__Impl_in_rule__EMappingEntity__Group__103611);
            rule__EMappingEntity__Group__10__Impl();

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1779:1: rule__EMappingEntity__Group__10__Impl : ( ( rule__EMappingEntity__Group_10__0 )? ) ;
    public final void rule__EMappingEntity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1783:1: ( ( ( rule__EMappingEntity__Group_10__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1784:1: ( ( rule__EMappingEntity__Group_10__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1784:1: ( ( rule__EMappingEntity__Group_10__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1785:1: ( rule__EMappingEntity__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_10()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1786:1: ( rule__EMappingEntity__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1786:2: rule__EMappingEntity__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_10__0_in_rule__EMappingEntity__Group__10__Impl3638);
                    rule__EMappingEntity__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup_10()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EMappingEntity__Group_3__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1818:1: rule__EMappingEntity__Group_3__0 : rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1 ;
    public final void rule__EMappingEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1822:1: ( rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1823:2: rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__0__Impl_in_rule__EMappingEntity__Group_3__03691);
            rule__EMappingEntity__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__1_in_rule__EMappingEntity__Group_3__03694);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1830:1: rule__EMappingEntity__Group_3__0__Impl : ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) ) ;
    public final void rule__EMappingEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1834:1: ( ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1835:1: ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1835:1: ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1836:1: ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getExtensionTypeAssignment_3_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1837:1: ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1837:2: rule__EMappingEntity__ExtensionTypeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ExtensionTypeAssignment_3_0_in_rule__EMappingEntity__Group_3__0__Impl3721);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1847:1: rule__EMappingEntity__Group_3__1 : rule__EMappingEntity__Group_3__1__Impl ;
    public final void rule__EMappingEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1851:1: ( rule__EMappingEntity__Group_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1852:2: rule__EMappingEntity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__1__Impl_in_rule__EMappingEntity__Group_3__13751);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1858:1: rule__EMappingEntity__Group_3__1__Impl : ( ( rule__EMappingEntity__ParentAssignment_3_1 ) ) ;
    public final void rule__EMappingEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1862:1: ( ( ( rule__EMappingEntity__ParentAssignment_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1863:1: ( ( rule__EMappingEntity__ParentAssignment_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1863:1: ( ( rule__EMappingEntity__ParentAssignment_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1864:1: ( rule__EMappingEntity__ParentAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentAssignment_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1865:1: ( rule__EMappingEntity__ParentAssignment_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1865:2: rule__EMappingEntity__ParentAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ParentAssignment_3_1_in_rule__EMappingEntity__Group_3__1__Impl3778);
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


    // $ANTLR start "rule__EMappingEntity__Group_6__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1879:1: rule__EMappingEntity__Group_6__0 : rule__EMappingEntity__Group_6__0__Impl rule__EMappingEntity__Group_6__1 ;
    public final void rule__EMappingEntity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1883:1: ( rule__EMappingEntity__Group_6__0__Impl rule__EMappingEntity__Group_6__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1884:2: rule__EMappingEntity__Group_6__0__Impl rule__EMappingEntity__Group_6__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__0__Impl_in_rule__EMappingEntity__Group_6__03812);
            rule__EMappingEntity__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__1_in_rule__EMappingEntity__Group_6__03815);
            rule__EMappingEntity__Group_6__1();

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
    // $ANTLR end "rule__EMappingEntity__Group_6__0"


    // $ANTLR start "rule__EMappingEntity__Group_6__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1891:1: rule__EMappingEntity__Group_6__0__Impl : ( 'attributes' ) ;
    public final void rule__EMappingEntity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1895:1: ( ( 'attributes' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1896:1: ( 'attributes' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1896:1: ( 'attributes' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1897:1: 'attributes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__EMappingEntity__Group_6__0__Impl3843); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_6__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_6__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1910:1: rule__EMappingEntity__Group_6__1 : rule__EMappingEntity__Group_6__1__Impl rule__EMappingEntity__Group_6__2 ;
    public final void rule__EMappingEntity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1914:1: ( rule__EMappingEntity__Group_6__1__Impl rule__EMappingEntity__Group_6__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1915:2: rule__EMappingEntity__Group_6__1__Impl rule__EMappingEntity__Group_6__2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__1__Impl_in_rule__EMappingEntity__Group_6__13874);
            rule__EMappingEntity__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__2_in_rule__EMappingEntity__Group_6__13877);
            rule__EMappingEntity__Group_6__2();

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
    // $ANTLR end "rule__EMappingEntity__Group_6__1"


    // $ANTLR start "rule__EMappingEntity__Group_6__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1922:1: rule__EMappingEntity__Group_6__1__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1926:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1927:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1927:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1928:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_6_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group_6__1__Impl3905); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_6__1__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_6__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1941:1: rule__EMappingEntity__Group_6__2 : rule__EMappingEntity__Group_6__2__Impl rule__EMappingEntity__Group_6__3 ;
    public final void rule__EMappingEntity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1945:1: ( rule__EMappingEntity__Group_6__2__Impl rule__EMappingEntity__Group_6__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1946:2: rule__EMappingEntity__Group_6__2__Impl rule__EMappingEntity__Group_6__3
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__2__Impl_in_rule__EMappingEntity__Group_6__23936);
            rule__EMappingEntity__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__3_in_rule__EMappingEntity__Group_6__23939);
            rule__EMappingEntity__Group_6__3();

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
    // $ANTLR end "rule__EMappingEntity__Group_6__2"


    // $ANTLR start "rule__EMappingEntity__Group_6__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1953:1: rule__EMappingEntity__Group_6__2__Impl : ( ( rule__EMappingEntity__AttributesAssignment_6_2 ) ) ;
    public final void rule__EMappingEntity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1957:1: ( ( ( rule__EMappingEntity__AttributesAssignment_6_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1958:1: ( ( rule__EMappingEntity__AttributesAssignment_6_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1958:1: ( ( rule__EMappingEntity__AttributesAssignment_6_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1959:1: ( rule__EMappingEntity__AttributesAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_6_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1960:1: ( rule__EMappingEntity__AttributesAssignment_6_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1960:2: rule__EMappingEntity__AttributesAssignment_6_2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__AttributesAssignment_6_2_in_rule__EMappingEntity__Group_6__2__Impl3966);
            rule__EMappingEntity__AttributesAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_6__2__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_6__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1970:1: rule__EMappingEntity__Group_6__3 : rule__EMappingEntity__Group_6__3__Impl rule__EMappingEntity__Group_6__4 ;
    public final void rule__EMappingEntity__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1974:1: ( rule__EMappingEntity__Group_6__3__Impl rule__EMappingEntity__Group_6__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1975:2: rule__EMappingEntity__Group_6__3__Impl rule__EMappingEntity__Group_6__4
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__3__Impl_in_rule__EMappingEntity__Group_6__33996);
            rule__EMappingEntity__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__4_in_rule__EMappingEntity__Group_6__33999);
            rule__EMappingEntity__Group_6__4();

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
    // $ANTLR end "rule__EMappingEntity__Group_6__3"


    // $ANTLR start "rule__EMappingEntity__Group_6__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1982:1: rule__EMappingEntity__Group_6__3__Impl : ( ( rule__EMappingEntity__Group_6_3__0 )* ) ;
    public final void rule__EMappingEntity__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1986:1: ( ( ( rule__EMappingEntity__Group_6_3__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1987:1: ( ( rule__EMappingEntity__Group_6_3__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1987:1: ( ( rule__EMappingEntity__Group_6_3__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1988:1: ( rule__EMappingEntity__Group_6_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_6_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1989:1: ( rule__EMappingEntity__Group_6_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1989:2: rule__EMappingEntity__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntity__Group_6_3__0_in_rule__EMappingEntity__Group_6__3__Impl4026);
            	    rule__EMappingEntity__Group_6_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_6__3__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_6__4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1999:1: rule__EMappingEntity__Group_6__4 : rule__EMappingEntity__Group_6__4__Impl ;
    public final void rule__EMappingEntity__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2003:1: ( rule__EMappingEntity__Group_6__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2004:2: rule__EMappingEntity__Group_6__4__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__4__Impl_in_rule__EMappingEntity__Group_6__44057);
            rule__EMappingEntity__Group_6__4__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group_6__4"


    // $ANTLR start "rule__EMappingEntity__Group_6__4__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2010:1: rule__EMappingEntity__Group_6__4__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2014:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2015:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2015:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2016:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_6_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingEntity__Group_6__4__Impl4085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_6_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_6__4__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_6_3__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2039:1: rule__EMappingEntity__Group_6_3__0 : rule__EMappingEntity__Group_6_3__0__Impl rule__EMappingEntity__Group_6_3__1 ;
    public final void rule__EMappingEntity__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2043:1: ( rule__EMappingEntity__Group_6_3__0__Impl rule__EMappingEntity__Group_6_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2044:2: rule__EMappingEntity__Group_6_3__0__Impl rule__EMappingEntity__Group_6_3__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6_3__0__Impl_in_rule__EMappingEntity__Group_6_3__04126);
            rule__EMappingEntity__Group_6_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6_3__1_in_rule__EMappingEntity__Group_6_3__04129);
            rule__EMappingEntity__Group_6_3__1();

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
    // $ANTLR end "rule__EMappingEntity__Group_6_3__0"


    // $ANTLR start "rule__EMappingEntity__Group_6_3__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2051:1: rule__EMappingEntity__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__EMappingEntity__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2055:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2056:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2056:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2057:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getCommaKeyword_6_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EMappingEntity__Group_6_3__0__Impl4157); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getCommaKeyword_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_6_3__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_6_3__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2070:1: rule__EMappingEntity__Group_6_3__1 : rule__EMappingEntity__Group_6_3__1__Impl ;
    public final void rule__EMappingEntity__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2074:1: ( rule__EMappingEntity__Group_6_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2075:2: rule__EMappingEntity__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6_3__1__Impl_in_rule__EMappingEntity__Group_6_3__14188);
            rule__EMappingEntity__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group_6_3__1"


    // $ANTLR start "rule__EMappingEntity__Group_6_3__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2081:1: rule__EMappingEntity__Group_6_3__1__Impl : ( ( rule__EMappingEntity__AttributesAssignment_6_3_1 ) ) ;
    public final void rule__EMappingEntity__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2085:1: ( ( ( rule__EMappingEntity__AttributesAssignment_6_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2086:1: ( ( rule__EMappingEntity__AttributesAssignment_6_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2086:1: ( ( rule__EMappingEntity__AttributesAssignment_6_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2087:1: ( rule__EMappingEntity__AttributesAssignment_6_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_6_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2088:1: ( rule__EMappingEntity__AttributesAssignment_6_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2088:2: rule__EMappingEntity__AttributesAssignment_6_3_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__AttributesAssignment_6_3_1_in_rule__EMappingEntity__Group_6_3__1__Impl4215);
            rule__EMappingEntity__AttributesAssignment_6_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_6_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_6_3__1__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_7__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2102:1: rule__EMappingEntity__Group_7__0 : rule__EMappingEntity__Group_7__0__Impl rule__EMappingEntity__Group_7__1 ;
    public final void rule__EMappingEntity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2106:1: ( rule__EMappingEntity__Group_7__0__Impl rule__EMappingEntity__Group_7__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2107:2: rule__EMappingEntity__Group_7__0__Impl rule__EMappingEntity__Group_7__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__0__Impl_in_rule__EMappingEntity__Group_7__04249);
            rule__EMappingEntity__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__1_in_rule__EMappingEntity__Group_7__04252);
            rule__EMappingEntity__Group_7__1();

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
    // $ANTLR end "rule__EMappingEntity__Group_7__0"


    // $ANTLR start "rule__EMappingEntity__Group_7__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2114:1: rule__EMappingEntity__Group_7__0__Impl : ( 'queries' ) ;
    public final void rule__EMappingEntity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2118:1: ( ( 'queries' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2119:1: ( 'queries' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2119:1: ( 'queries' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2120:1: 'queries'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getQueriesKeyword_7_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__EMappingEntity__Group_7__0__Impl4280); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getQueriesKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_7__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_7__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2133:1: rule__EMappingEntity__Group_7__1 : rule__EMappingEntity__Group_7__1__Impl rule__EMappingEntity__Group_7__2 ;
    public final void rule__EMappingEntity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2137:1: ( rule__EMappingEntity__Group_7__1__Impl rule__EMappingEntity__Group_7__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2138:2: rule__EMappingEntity__Group_7__1__Impl rule__EMappingEntity__Group_7__2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__1__Impl_in_rule__EMappingEntity__Group_7__14311);
            rule__EMappingEntity__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__2_in_rule__EMappingEntity__Group_7__14314);
            rule__EMappingEntity__Group_7__2();

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
    // $ANTLR end "rule__EMappingEntity__Group_7__1"


    // $ANTLR start "rule__EMappingEntity__Group_7__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2145:1: rule__EMappingEntity__Group_7__1__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2149:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2150:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2150:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2151:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group_7__1__Impl4342); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_7__1__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_7__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2164:1: rule__EMappingEntity__Group_7__2 : rule__EMappingEntity__Group_7__2__Impl rule__EMappingEntity__Group_7__3 ;
    public final void rule__EMappingEntity__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2168:1: ( rule__EMappingEntity__Group_7__2__Impl rule__EMappingEntity__Group_7__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2169:2: rule__EMappingEntity__Group_7__2__Impl rule__EMappingEntity__Group_7__3
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__2__Impl_in_rule__EMappingEntity__Group_7__24373);
            rule__EMappingEntity__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__3_in_rule__EMappingEntity__Group_7__24376);
            rule__EMappingEntity__Group_7__3();

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
    // $ANTLR end "rule__EMappingEntity__Group_7__2"


    // $ANTLR start "rule__EMappingEntity__Group_7__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2176:1: rule__EMappingEntity__Group_7__2__Impl : ( ( rule__EMappingEntity__NamedQueriesAssignment_7_2 ) ) ;
    public final void rule__EMappingEntity__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2180:1: ( ( ( rule__EMappingEntity__NamedQueriesAssignment_7_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2181:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_7_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2181:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_7_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2182:1: ( rule__EMappingEntity__NamedQueriesAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_7_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2183:1: ( rule__EMappingEntity__NamedQueriesAssignment_7_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2183:2: rule__EMappingEntity__NamedQueriesAssignment_7_2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_7_2_in_rule__EMappingEntity__Group_7__2__Impl4403);
            rule__EMappingEntity__NamedQueriesAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_7__2__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_7__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2193:1: rule__EMappingEntity__Group_7__3 : rule__EMappingEntity__Group_7__3__Impl rule__EMappingEntity__Group_7__4 ;
    public final void rule__EMappingEntity__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2197:1: ( rule__EMappingEntity__Group_7__3__Impl rule__EMappingEntity__Group_7__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2198:2: rule__EMappingEntity__Group_7__3__Impl rule__EMappingEntity__Group_7__4
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__3__Impl_in_rule__EMappingEntity__Group_7__34433);
            rule__EMappingEntity__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__4_in_rule__EMappingEntity__Group_7__34436);
            rule__EMappingEntity__Group_7__4();

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
    // $ANTLR end "rule__EMappingEntity__Group_7__3"


    // $ANTLR start "rule__EMappingEntity__Group_7__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2205:1: rule__EMappingEntity__Group_7__3__Impl : ( ( rule__EMappingEntity__Group_7_3__0 )* ) ;
    public final void rule__EMappingEntity__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2209:1: ( ( ( rule__EMappingEntity__Group_7_3__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2210:1: ( ( rule__EMappingEntity__Group_7_3__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2210:1: ( ( rule__EMappingEntity__Group_7_3__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2211:1: ( rule__EMappingEntity__Group_7_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_7_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2212:1: ( rule__EMappingEntity__Group_7_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2212:2: rule__EMappingEntity__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntity__Group_7_3__0_in_rule__EMappingEntity__Group_7__3__Impl4463);
            	    rule__EMappingEntity__Group_7_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getGroup_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_7__3__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_7__4"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2222:1: rule__EMappingEntity__Group_7__4 : rule__EMappingEntity__Group_7__4__Impl ;
    public final void rule__EMappingEntity__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2226:1: ( rule__EMappingEntity__Group_7__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2227:2: rule__EMappingEntity__Group_7__4__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__4__Impl_in_rule__EMappingEntity__Group_7__44494);
            rule__EMappingEntity__Group_7__4__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group_7__4"


    // $ANTLR start "rule__EMappingEntity__Group_7__4__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2233:1: rule__EMappingEntity__Group_7__4__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2237:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2238:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2238:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2239:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_7_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingEntity__Group_7__4__Impl4522); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_7_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_7__4__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_7_3__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2262:1: rule__EMappingEntity__Group_7_3__0 : rule__EMappingEntity__Group_7_3__0__Impl rule__EMappingEntity__Group_7_3__1 ;
    public final void rule__EMappingEntity__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2266:1: ( rule__EMappingEntity__Group_7_3__0__Impl rule__EMappingEntity__Group_7_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2267:2: rule__EMappingEntity__Group_7_3__0__Impl rule__EMappingEntity__Group_7_3__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7_3__0__Impl_in_rule__EMappingEntity__Group_7_3__04563);
            rule__EMappingEntity__Group_7_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7_3__1_in_rule__EMappingEntity__Group_7_3__04566);
            rule__EMappingEntity__Group_7_3__1();

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
    // $ANTLR end "rule__EMappingEntity__Group_7_3__0"


    // $ANTLR start "rule__EMappingEntity__Group_7_3__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2274:1: rule__EMappingEntity__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__EMappingEntity__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2278:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2279:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2279:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2280:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getCommaKeyword_7_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EMappingEntity__Group_7_3__0__Impl4594); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getCommaKeyword_7_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_7_3__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_7_3__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2293:1: rule__EMappingEntity__Group_7_3__1 : rule__EMappingEntity__Group_7_3__1__Impl ;
    public final void rule__EMappingEntity__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2297:1: ( rule__EMappingEntity__Group_7_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2298:2: rule__EMappingEntity__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7_3__1__Impl_in_rule__EMappingEntity__Group_7_3__14625);
            rule__EMappingEntity__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group_7_3__1"


    // $ANTLR start "rule__EMappingEntity__Group_7_3__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2304:1: rule__EMappingEntity__Group_7_3__1__Impl : ( ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 ) ) ;
    public final void rule__EMappingEntity__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2308:1: ( ( ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2309:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2309:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2310:1: ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_7_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2311:1: ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2311:2: rule__EMappingEntity__NamedQueriesAssignment_7_3_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_7_3_1_in_rule__EMappingEntity__Group_7_3__1__Impl4652);
            rule__EMappingEntity__NamedQueriesAssignment_7_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_7_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_7_3__1__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_9__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2325:1: rule__EMappingEntity__Group_9__0 : rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1 ;
    public final void rule__EMappingEntity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2329:1: ( rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2330:2: rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__0__Impl_in_rule__EMappingEntity__Group_9__04686);
            rule__EMappingEntity__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__1_in_rule__EMappingEntity__Group_9__04689);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2337:1: rule__EMappingEntity__Group_9__0__Impl : ( 'as' ) ;
    public final void rule__EMappingEntity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2341:1: ( ( 'as' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2342:1: ( 'as' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2342:1: ( 'as' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2343:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAsKeyword_9_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__EMappingEntity__Group_9__0__Impl4717); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAsKeyword_9_0()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2356:1: rule__EMappingEntity__Group_9__1 : rule__EMappingEntity__Group_9__1__Impl ;
    public final void rule__EMappingEntity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2360:1: ( rule__EMappingEntity__Group_9__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2361:2: rule__EMappingEntity__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__1__Impl_in_rule__EMappingEntity__Group_9__14748);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2367:1: rule__EMappingEntity__Group_9__1__Impl : ( ( rule__EMappingEntity__TableNameAssignment_9_1 ) ) ;
    public final void rule__EMappingEntity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2371:1: ( ( ( rule__EMappingEntity__TableNameAssignment_9_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2372:1: ( ( rule__EMappingEntity__TableNameAssignment_9_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2372:1: ( ( rule__EMappingEntity__TableNameAssignment_9_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2373:1: ( rule__EMappingEntity__TableNameAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getTableNameAssignment_9_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2374:1: ( rule__EMappingEntity__TableNameAssignment_9_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2374:2: rule__EMappingEntity__TableNameAssignment_9_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__TableNameAssignment_9_1_in_rule__EMappingEntity__Group_9__1__Impl4775);
            rule__EMappingEntity__TableNameAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getTableNameAssignment_9_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EMappingEntity__Group_10__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2388:1: rule__EMappingEntity__Group_10__0 : rule__EMappingEntity__Group_10__0__Impl rule__EMappingEntity__Group_10__1 ;
    public final void rule__EMappingEntity__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2392:1: ( rule__EMappingEntity__Group_10__0__Impl rule__EMappingEntity__Group_10__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2393:2: rule__EMappingEntity__Group_10__0__Impl rule__EMappingEntity__Group_10__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_10__0__Impl_in_rule__EMappingEntity__Group_10__04809);
            rule__EMappingEntity__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_10__1_in_rule__EMappingEntity__Group_10__04812);
            rule__EMappingEntity__Group_10__1();

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
    // $ANTLR end "rule__EMappingEntity__Group_10__0"


    // $ANTLR start "rule__EMappingEntity__Group_10__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2400:1: rule__EMappingEntity__Group_10__0__Impl : ( 'descriminatedby' ) ;
    public final void rule__EMappingEntity__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2404:1: ( ( 'descriminatedby' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2405:1: ( 'descriminatedby' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2405:1: ( 'descriminatedby' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2406:1: 'descriminatedby'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getDescriminatedbyKeyword_10_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__EMappingEntity__Group_10__0__Impl4840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getDescriminatedbyKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_10__0__Impl"


    // $ANTLR start "rule__EMappingEntity__Group_10__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2419:1: rule__EMappingEntity__Group_10__1 : rule__EMappingEntity__Group_10__1__Impl ;
    public final void rule__EMappingEntity__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2423:1: ( rule__EMappingEntity__Group_10__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2424:2: rule__EMappingEntity__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_10__1__Impl_in_rule__EMappingEntity__Group_10__14871);
            rule__EMappingEntity__Group_10__1__Impl();

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
    // $ANTLR end "rule__EMappingEntity__Group_10__1"


    // $ANTLR start "rule__EMappingEntity__Group_10__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2430:1: rule__EMappingEntity__Group_10__1__Impl : ( ( rule__EMappingEntity__DescriminationColumnAssignment_10_1 ) ) ;
    public final void rule__EMappingEntity__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2434:1: ( ( ( rule__EMappingEntity__DescriminationColumnAssignment_10_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2435:1: ( ( rule__EMappingEntity__DescriminationColumnAssignment_10_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2435:1: ( ( rule__EMappingEntity__DescriminationColumnAssignment_10_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2436:1: ( rule__EMappingEntity__DescriminationColumnAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getDescriminationColumnAssignment_10_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2437:1: ( rule__EMappingEntity__DescriminationColumnAssignment_10_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2437:2: rule__EMappingEntity__DescriminationColumnAssignment_10_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__DescriminationColumnAssignment_10_1_in_rule__EMappingEntity__Group_10__1__Impl4898);
            rule__EMappingEntity__DescriminationColumnAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getDescriminationColumnAssignment_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__Group_10__1__Impl"


    // $ANTLR start "rule__EAttribute__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2451:1: rule__EAttribute__Group__0 : rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1 ;
    public final void rule__EAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2455:1: ( rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2456:2: rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__0__Impl_in_rule__EAttribute__Group__04932);
            rule__EAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__1_in_rule__EAttribute__Group__04935);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2463:1: rule__EAttribute__Group__0__Impl : ( ( rule__EAttribute__PkAssignment_0 )? ) ;
    public final void rule__EAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2467:1: ( ( ( rule__EAttribute__PkAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2468:1: ( ( rule__EAttribute__PkAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2468:1: ( ( rule__EAttribute__PkAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2469:1: ( rule__EAttribute__PkAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2470:1: ( rule__EAttribute__PkAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2470:2: rule__EAttribute__PkAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__PkAssignment_0_in_rule__EAttribute__Group__0__Impl4962);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2480:1: rule__EAttribute__Group__1 : rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2 ;
    public final void rule__EAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2484:1: ( rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2485:2: rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__1__Impl_in_rule__EAttribute__Group__14993);
            rule__EAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__2_in_rule__EAttribute__Group__14996);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2492:1: rule__EAttribute__Group__1__Impl : ( ( rule__EAttribute__NameAssignment_1 ) ) ;
    public final void rule__EAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2496:1: ( ( ( rule__EAttribute__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2497:1: ( ( rule__EAttribute__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2497:1: ( ( rule__EAttribute__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2498:1: ( rule__EAttribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2499:1: ( rule__EAttribute__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2499:2: rule__EAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EAttribute__NameAssignment_1_in_rule__EAttribute__Group__1__Impl5023);
            rule__EAttribute__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2509:1: rule__EAttribute__Group__2 : rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3 ;
    public final void rule__EAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2513:1: ( rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2514:2: rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__2__Impl_in_rule__EAttribute__Group__25053);
            rule__EAttribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__3_in_rule__EAttribute__Group__25056);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2521:1: rule__EAttribute__Group__2__Impl : ( '=>' ) ;
    public final void rule__EAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2525:1: ( ( '=>' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2526:1: ( '=>' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2526:1: ( '=>' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2527:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__EAttribute__Group__2__Impl5084); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2540:1: rule__EAttribute__Group__3 : rule__EAttribute__Group__3__Impl ;
    public final void rule__EAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2544:1: ( rule__EAttribute__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2545:2: rule__EAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__3__Impl_in_rule__EAttribute__Group__35115);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2551:1: rule__EAttribute__Group__3__Impl : ( ( rule__EAttribute__Alternatives_3 ) ) ;
    public final void rule__EAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2555:1: ( ( ( rule__EAttribute__Alternatives_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2556:1: ( ( rule__EAttribute__Alternatives_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2556:1: ( ( rule__EAttribute__Alternatives_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2557:1: ( rule__EAttribute__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2558:1: ( rule__EAttribute__Alternatives_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2558:2: rule__EAttribute__Alternatives_3
            {
            pushFollow(FOLLOW_rule__EAttribute__Alternatives_3_in_rule__EAttribute__Group__3__Impl5142);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2576:1: rule__EAttribute__Group_3_0__0 : rule__EAttribute__Group_3_0__0__Impl rule__EAttribute__Group_3_0__1 ;
    public final void rule__EAttribute__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2580:1: ( rule__EAttribute__Group_3_0__0__Impl rule__EAttribute__Group_3_0__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2581:2: rule__EAttribute__Group_3_0__0__Impl rule__EAttribute__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0__0__Impl_in_rule__EAttribute__Group_3_0__05180);
            rule__EAttribute__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0__1_in_rule__EAttribute__Group_3_0__05183);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2588:1: rule__EAttribute__Group_3_0__0__Impl : ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) ) ;
    public final void rule__EAttribute__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2592:1: ( ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2593:1: ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2593:1: ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2594:1: ( rule__EAttribute__ColumnNameAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getColumnNameAssignment_3_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2595:1: ( rule__EAttribute__ColumnNameAssignment_3_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2595:2: rule__EAttribute__ColumnNameAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__EAttribute__ColumnNameAssignment_3_0_0_in_rule__EAttribute__Group_3_0__0__Impl5210);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2605:1: rule__EAttribute__Group_3_0__1 : rule__EAttribute__Group_3_0__1__Impl ;
    public final void rule__EAttribute__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2609:1: ( rule__EAttribute__Group_3_0__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2610:2: rule__EAttribute__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0__1__Impl_in_rule__EAttribute__Group_3_0__15240);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2616:1: rule__EAttribute__Group_3_0__1__Impl : ( ( rule__EAttribute__Group_3_0_1__0 )? ) ;
    public final void rule__EAttribute__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2620:1: ( ( ( rule__EAttribute__Group_3_0_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2621:1: ( ( rule__EAttribute__Group_3_0_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2621:1: ( ( rule__EAttribute__Group_3_0_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2622:1: ( rule__EAttribute__Group_3_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getGroup_3_0_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2623:1: ( rule__EAttribute__Group_3_0_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2623:2: rule__EAttribute__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__0_in_rule__EAttribute__Group_3_0__1__Impl5267);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2637:1: rule__EAttribute__Group_3_0_1__0 : rule__EAttribute__Group_3_0_1__0__Impl rule__EAttribute__Group_3_0_1__1 ;
    public final void rule__EAttribute__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2641:1: ( rule__EAttribute__Group_3_0_1__0__Impl rule__EAttribute__Group_3_0_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2642:2: rule__EAttribute__Group_3_0_1__0__Impl rule__EAttribute__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__0__Impl_in_rule__EAttribute__Group_3_0_1__05302);
            rule__EAttribute__Group_3_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__1_in_rule__EAttribute__Group_3_0_1__05305);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2649:1: rule__EAttribute__Group_3_0_1__0__Impl : ( 'generatedby' ) ;
    public final void rule__EAttribute__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2653:1: ( ( 'generatedby' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2654:1: ( 'generatedby' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2654:1: ( 'generatedby' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2655:1: 'generatedby'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getGeneratedbyKeyword_3_0_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__EAttribute__Group_3_0_1__0__Impl5333); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getGeneratedbyKeyword_3_0_1_0()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2668:1: rule__EAttribute__Group_3_0_1__1 : rule__EAttribute__Group_3_0_1__1__Impl rule__EAttribute__Group_3_0_1__2 ;
    public final void rule__EAttribute__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2672:1: ( rule__EAttribute__Group_3_0_1__1__Impl rule__EAttribute__Group_3_0_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2673:2: rule__EAttribute__Group_3_0_1__1__Impl rule__EAttribute__Group_3_0_1__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__1__Impl_in_rule__EAttribute__Group_3_0_1__15364);
            rule__EAttribute__Group_3_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__2_in_rule__EAttribute__Group_3_0_1__15367);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2680:1: rule__EAttribute__Group_3_0_1__1__Impl : ( '{' ) ;
    public final void rule__EAttribute__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2684:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2685:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2685:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2686:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_3_0_1_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__EAttribute__Group_3_0_1__1__Impl5395); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2699:1: rule__EAttribute__Group_3_0_1__2 : rule__EAttribute__Group_3_0_1__2__Impl rule__EAttribute__Group_3_0_1__3 ;
    public final void rule__EAttribute__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2703:1: ( rule__EAttribute__Group_3_0_1__2__Impl rule__EAttribute__Group_3_0_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2704:2: rule__EAttribute__Group_3_0_1__2__Impl rule__EAttribute__Group_3_0_1__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__2__Impl_in_rule__EAttribute__Group_3_0_1__25426);
            rule__EAttribute__Group_3_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__3_in_rule__EAttribute__Group_3_0_1__25429);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2711:1: rule__EAttribute__Group_3_0_1__2__Impl : ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 ) ) ;
    public final void rule__EAttribute__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2715:1: ( ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2716:1: ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2716:1: ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2717:1: ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getValueGeneratorsAssignment_3_0_1_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2718:1: ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2718:2: rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2
            {
            pushFollow(FOLLOW_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2_in_rule__EAttribute__Group_3_0_1__2__Impl5456);
            rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getValueGeneratorsAssignment_3_0_1_2()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2728:1: rule__EAttribute__Group_3_0_1__3 : rule__EAttribute__Group_3_0_1__3__Impl rule__EAttribute__Group_3_0_1__4 ;
    public final void rule__EAttribute__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2732:1: ( rule__EAttribute__Group_3_0_1__3__Impl rule__EAttribute__Group_3_0_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2733:2: rule__EAttribute__Group_3_0_1__3__Impl rule__EAttribute__Group_3_0_1__4
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__3__Impl_in_rule__EAttribute__Group_3_0_1__35486);
            rule__EAttribute__Group_3_0_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__4_in_rule__EAttribute__Group_3_0_1__35489);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2740:1: rule__EAttribute__Group_3_0_1__3__Impl : ( ( rule__EAttribute__Group_3_0_1_3__0 )* ) ;
    public final void rule__EAttribute__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2744:1: ( ( ( rule__EAttribute__Group_3_0_1_3__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2745:1: ( ( rule__EAttribute__Group_3_0_1_3__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2745:1: ( ( rule__EAttribute__Group_3_0_1_3__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2746:1: ( rule__EAttribute__Group_3_0_1_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getGroup_3_0_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2747:1: ( rule__EAttribute__Group_3_0_1_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2747:2: rule__EAttribute__Group_3_0_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3__0_in_rule__EAttribute__Group_3_0_1__3__Impl5516);
            	    rule__EAttribute__Group_3_0_1_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getGroup_3_0_1_3()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2757:1: rule__EAttribute__Group_3_0_1__4 : rule__EAttribute__Group_3_0_1__4__Impl ;
    public final void rule__EAttribute__Group_3_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2761:1: ( rule__EAttribute__Group_3_0_1__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2762:2: rule__EAttribute__Group_3_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__4__Impl_in_rule__EAttribute__Group_3_0_1__45547);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2768:1: rule__EAttribute__Group_3_0_1__4__Impl : ( '}' ) ;
    public final void rule__EAttribute__Group_3_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2772:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2773:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2773:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2774:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_3_0_1_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__EAttribute__Group_3_0_1__4__Impl5575); if (state.failed) return ;
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


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2797:1: rule__EAttribute__Group_3_0_1_3__0 : rule__EAttribute__Group_3_0_1_3__0__Impl rule__EAttribute__Group_3_0_1_3__1 ;
    public final void rule__EAttribute__Group_3_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2801:1: ( rule__EAttribute__Group_3_0_1_3__0__Impl rule__EAttribute__Group_3_0_1_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2802:2: rule__EAttribute__Group_3_0_1_3__0__Impl rule__EAttribute__Group_3_0_1_3__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3__0__Impl_in_rule__EAttribute__Group_3_0_1_3__05616);
            rule__EAttribute__Group_3_0_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3__1_in_rule__EAttribute__Group_3_0_1_3__05619);
            rule__EAttribute__Group_3_0_1_3__1();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3__0"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2809:1: rule__EAttribute__Group_3_0_1_3__0__Impl : ( ',' ) ;
    public final void rule__EAttribute__Group_3_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2813:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2814:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2814:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2815:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getCommaKeyword_3_0_1_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EAttribute__Group_3_0_1_3__0__Impl5647); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getCommaKeyword_3_0_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3__0__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2828:1: rule__EAttribute__Group_3_0_1_3__1 : rule__EAttribute__Group_3_0_1_3__1__Impl ;
    public final void rule__EAttribute__Group_3_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2832:1: ( rule__EAttribute__Group_3_0_1_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2833:2: rule__EAttribute__Group_3_0_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3__1__Impl_in_rule__EAttribute__Group_3_0_1_3__15678);
            rule__EAttribute__Group_3_0_1_3__1__Impl();

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
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3__1"


    // $ANTLR start "rule__EAttribute__Group_3_0_1_3__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2839:1: rule__EAttribute__Group_3_0_1_3__1__Impl : ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 ) ) ;
    public final void rule__EAttribute__Group_3_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2843:1: ( ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2844:1: ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2844:1: ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2845:1: ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getValueGeneratorsAssignment_3_0_1_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2846:1: ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2846:2: rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1
            {
            pushFollow(FOLLOW_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1_in_rule__EAttribute__Group_3_0_1_3__1__Impl5705);
            rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getValueGeneratorsAssignment_3_0_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__Group_3_0_1_3__1__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2860:1: rule__EAttribute__Group_3_1__0 : rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1 ;
    public final void rule__EAttribute__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2864:1: ( rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2865:2: rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__0__Impl_in_rule__EAttribute__Group_3_1__05739);
            rule__EAttribute__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__1_in_rule__EAttribute__Group_3_1__05742);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2872:1: rule__EAttribute__Group_3_1__0__Impl : ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) ) ;
    public final void rule__EAttribute__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2876:1: ( ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2877:1: ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2877:1: ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2878:1: ( rule__EAttribute__ResolvedAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedAssignment_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2879:1: ( rule__EAttribute__ResolvedAssignment_3_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2879:2: rule__EAttribute__ResolvedAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__EAttribute__ResolvedAssignment_3_1_0_in_rule__EAttribute__Group_3_1__0__Impl5769);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2889:1: rule__EAttribute__Group_3_1__1 : rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2 ;
    public final void rule__EAttribute__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2893:1: ( rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2894:2: rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__1__Impl_in_rule__EAttribute__Group_3_1__15799);
            rule__EAttribute__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__2_in_rule__EAttribute__Group_3_1__15802);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2901:1: rule__EAttribute__Group_3_1__1__Impl : ( ( rule__EAttribute__QueryAssignment_3_1_1 ) ) ;
    public final void rule__EAttribute__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2905:1: ( ( ( rule__EAttribute__QueryAssignment_3_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2906:1: ( ( rule__EAttribute__QueryAssignment_3_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2906:1: ( ( rule__EAttribute__QueryAssignment_3_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2907:1: ( rule__EAttribute__QueryAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryAssignment_3_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2908:1: ( rule__EAttribute__QueryAssignment_3_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2908:2: rule__EAttribute__QueryAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EAttribute__QueryAssignment_3_1_1_in_rule__EAttribute__Group_3_1__1__Impl5829);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2918:1: rule__EAttribute__Group_3_1__2 : rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3 ;
    public final void rule__EAttribute__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2922:1: ( rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2923:2: rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__2__Impl_in_rule__EAttribute__Group_3_1__25859);
            rule__EAttribute__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__3_in_rule__EAttribute__Group_3_1__25862);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2930:1: rule__EAttribute__Group_3_1__2__Impl : ( '(' ) ;
    public final void rule__EAttribute__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2934:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2935:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2935:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2936:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__EAttribute__Group_3_1__2__Impl5890); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2949:1: rule__EAttribute__Group_3_1__3 : rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4 ;
    public final void rule__EAttribute__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2953:1: ( rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2954:2: rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__3__Impl_in_rule__EAttribute__Group_3_1__35921);
            rule__EAttribute__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__4_in_rule__EAttribute__Group_3_1__35924);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2961:1: rule__EAttribute__Group_3_1__3__Impl : ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) ) ;
    public final void rule__EAttribute__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2965:1: ( ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2966:1: ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2966:1: ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2967:1: ( rule__EAttribute__ParametersAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getParametersAssignment_3_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2968:1: ( rule__EAttribute__ParametersAssignment_3_1_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2968:2: rule__EAttribute__ParametersAssignment_3_1_3
            {
            pushFollow(FOLLOW_rule__EAttribute__ParametersAssignment_3_1_3_in_rule__EAttribute__Group_3_1__3__Impl5951);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2978:1: rule__EAttribute__Group_3_1__4 : rule__EAttribute__Group_3_1__4__Impl rule__EAttribute__Group_3_1__5 ;
    public final void rule__EAttribute__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2982:1: ( rule__EAttribute__Group_3_1__4__Impl rule__EAttribute__Group_3_1__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2983:2: rule__EAttribute__Group_3_1__4__Impl rule__EAttribute__Group_3_1__5
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__4__Impl_in_rule__EAttribute__Group_3_1__45981);
            rule__EAttribute__Group_3_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__5_in_rule__EAttribute__Group_3_1__45984);
            rule__EAttribute__Group_3_1__5();

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2990:1: rule__EAttribute__Group_3_1__4__Impl : ( ')' ) ;
    public final void rule__EAttribute__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2994:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2995:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2995:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2996:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4()); 
            }
            match(input,32,FOLLOW_32_in_rule__EAttribute__Group_3_1__4__Impl6012); if (state.failed) return ;
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


    // $ANTLR start "rule__EAttribute__Group_3_1__5"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3009:1: rule__EAttribute__Group_3_1__5 : rule__EAttribute__Group_3_1__5__Impl ;
    public final void rule__EAttribute__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3013:1: ( rule__EAttribute__Group_3_1__5__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3014:2: rule__EAttribute__Group_3_1__5__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__5__Impl_in_rule__EAttribute__Group_3_1__56043);
            rule__EAttribute__Group_3_1__5__Impl();

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
    // $ANTLR end "rule__EAttribute__Group_3_1__5"


    // $ANTLR start "rule__EAttribute__Group_3_1__5__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3020:1: rule__EAttribute__Group_3_1__5__Impl : ( ( rule__EAttribute__Group_3_1_5__0 )? ) ;
    public final void rule__EAttribute__Group_3_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3024:1: ( ( ( rule__EAttribute__Group_3_1_5__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3025:1: ( ( rule__EAttribute__Group_3_1_5__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3025:1: ( ( rule__EAttribute__Group_3_1_5__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3026:1: ( rule__EAttribute__Group_3_1_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getGroup_3_1_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3027:1: ( rule__EAttribute__Group_3_1_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3027:2: rule__EAttribute__Group_3_1_5__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_1_5__0_in_rule__EAttribute__Group_3_1__5__Impl6070);
                    rule__EAttribute__Group_3_1_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getGroup_3_1_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__Group_3_1__5__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_1_5__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3049:1: rule__EAttribute__Group_3_1_5__0 : rule__EAttribute__Group_3_1_5__0__Impl rule__EAttribute__Group_3_1_5__1 ;
    public final void rule__EAttribute__Group_3_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3053:1: ( rule__EAttribute__Group_3_1_5__0__Impl rule__EAttribute__Group_3_1_5__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3054:2: rule__EAttribute__Group_3_1_5__0__Impl rule__EAttribute__Group_3_1_5__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1_5__0__Impl_in_rule__EAttribute__Group_3_1_5__06113);
            rule__EAttribute__Group_3_1_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1_5__1_in_rule__EAttribute__Group_3_1_5__06116);
            rule__EAttribute__Group_3_1_5__1();

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
    // $ANTLR end "rule__EAttribute__Group_3_1_5__0"


    // $ANTLR start "rule__EAttribute__Group_3_1_5__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3061:1: rule__EAttribute__Group_3_1_5__0__Impl : ( ( rule__EAttribute__OppositeAssignment_3_1_5_0 ) ) ;
    public final void rule__EAttribute__Group_3_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3065:1: ( ( ( rule__EAttribute__OppositeAssignment_3_1_5_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3066:1: ( ( rule__EAttribute__OppositeAssignment_3_1_5_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3066:1: ( ( rule__EAttribute__OppositeAssignment_3_1_5_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3067:1: ( rule__EAttribute__OppositeAssignment_3_1_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getOppositeAssignment_3_1_5_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3068:1: ( rule__EAttribute__OppositeAssignment_3_1_5_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3068:2: rule__EAttribute__OppositeAssignment_3_1_5_0
            {
            pushFollow(FOLLOW_rule__EAttribute__OppositeAssignment_3_1_5_0_in_rule__EAttribute__Group_3_1_5__0__Impl6143);
            rule__EAttribute__OppositeAssignment_3_1_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getOppositeAssignment_3_1_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__Group_3_1_5__0__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_1_5__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3078:1: rule__EAttribute__Group_3_1_5__1 : rule__EAttribute__Group_3_1_5__1__Impl rule__EAttribute__Group_3_1_5__2 ;
    public final void rule__EAttribute__Group_3_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3082:1: ( rule__EAttribute__Group_3_1_5__1__Impl rule__EAttribute__Group_3_1_5__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3083:2: rule__EAttribute__Group_3_1_5__1__Impl rule__EAttribute__Group_3_1_5__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1_5__1__Impl_in_rule__EAttribute__Group_3_1_5__16173);
            rule__EAttribute__Group_3_1_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1_5__2_in_rule__EAttribute__Group_3_1_5__16176);
            rule__EAttribute__Group_3_1_5__2();

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
    // $ANTLR end "rule__EAttribute__Group_3_1_5__1"


    // $ANTLR start "rule__EAttribute__Group_3_1_5__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3090:1: rule__EAttribute__Group_3_1_5__1__Impl : ( 'on' ) ;
    public final void rule__EAttribute__Group_3_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3094:1: ( ( 'on' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3095:1: ( 'on' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3095:1: ( 'on' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3096:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getOnKeyword_3_1_5_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__EAttribute__Group_3_1_5__1__Impl6204); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getOnKeyword_3_1_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__Group_3_1_5__1__Impl"


    // $ANTLR start "rule__EAttribute__Group_3_1_5__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3109:1: rule__EAttribute__Group_3_1_5__2 : rule__EAttribute__Group_3_1_5__2__Impl ;
    public final void rule__EAttribute__Group_3_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3113:1: ( rule__EAttribute__Group_3_1_5__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3114:2: rule__EAttribute__Group_3_1_5__2__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1_5__2__Impl_in_rule__EAttribute__Group_3_1_5__26235);
            rule__EAttribute__Group_3_1_5__2__Impl();

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
    // $ANTLR end "rule__EAttribute__Group_3_1_5__2"


    // $ANTLR start "rule__EAttribute__Group_3_1_5__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3120:1: rule__EAttribute__Group_3_1_5__2__Impl : ( ( rule__EAttribute__RelationTableAssignment_3_1_5_2 ) ) ;
    public final void rule__EAttribute__Group_3_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3124:1: ( ( ( rule__EAttribute__RelationTableAssignment_3_1_5_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3125:1: ( ( rule__EAttribute__RelationTableAssignment_3_1_5_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3125:1: ( ( rule__EAttribute__RelationTableAssignment_3_1_5_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3126:1: ( rule__EAttribute__RelationTableAssignment_3_1_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getRelationTableAssignment_3_1_5_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3127:1: ( rule__EAttribute__RelationTableAssignment_3_1_5_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3127:2: rule__EAttribute__RelationTableAssignment_3_1_5_2
            {
            pushFollow(FOLLOW_rule__EAttribute__RelationTableAssignment_3_1_5_2_in_rule__EAttribute__Group_3_1_5__2__Impl6262);
            rule__EAttribute__RelationTableAssignment_3_1_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getRelationTableAssignment_3_1_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__Group_3_1_5__2__Impl"


    // $ANTLR start "rule__EValueGenerator__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3143:1: rule__EValueGenerator__Group__0 : rule__EValueGenerator__Group__0__Impl rule__EValueGenerator__Group__1 ;
    public final void rule__EValueGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3147:1: ( rule__EValueGenerator__Group__0__Impl rule__EValueGenerator__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3148:2: rule__EValueGenerator__Group__0__Impl rule__EValueGenerator__Group__1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group__0__Impl_in_rule__EValueGenerator__Group__06298);
            rule__EValueGenerator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EValueGenerator__Group__1_in_rule__EValueGenerator__Group__06301);
            rule__EValueGenerator__Group__1();

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
    // $ANTLR end "rule__EValueGenerator__Group__0"


    // $ANTLR start "rule__EValueGenerator__Group__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3155:1: rule__EValueGenerator__Group__0__Impl : ( ( rule__EValueGenerator__DbTypeAssignment_0 ) ) ;
    public final void rule__EValueGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3159:1: ( ( ( rule__EValueGenerator__DbTypeAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3160:1: ( ( rule__EValueGenerator__DbTypeAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3160:1: ( ( rule__EValueGenerator__DbTypeAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3161:1: ( rule__EValueGenerator__DbTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getDbTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3162:1: ( rule__EValueGenerator__DbTypeAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3162:2: rule__EValueGenerator__DbTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EValueGenerator__DbTypeAssignment_0_in_rule__EValueGenerator__Group__0__Impl6328);
            rule__EValueGenerator__DbTypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getDbTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EValueGenerator__Group__0__Impl"


    // $ANTLR start "rule__EValueGenerator__Group__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3172:1: rule__EValueGenerator__Group__1 : rule__EValueGenerator__Group__1__Impl ;
    public final void rule__EValueGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3176:1: ( rule__EValueGenerator__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3177:2: rule__EValueGenerator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group__1__Impl_in_rule__EValueGenerator__Group__16358);
            rule__EValueGenerator__Group__1__Impl();

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
    // $ANTLR end "rule__EValueGenerator__Group__1"


    // $ANTLR start "rule__EValueGenerator__Group__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3183:1: rule__EValueGenerator__Group__1__Impl : ( ( rule__EValueGenerator__Alternatives_1 ) ) ;
    public final void rule__EValueGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3187:1: ( ( ( rule__EValueGenerator__Alternatives_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3188:1: ( ( rule__EValueGenerator__Alternatives_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3188:1: ( ( rule__EValueGenerator__Alternatives_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3189:1: ( rule__EValueGenerator__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getAlternatives_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3190:1: ( rule__EValueGenerator__Alternatives_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3190:2: rule__EValueGenerator__Alternatives_1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Alternatives_1_in_rule__EValueGenerator__Group__1__Impl6385);
            rule__EValueGenerator__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EValueGenerator__Group__1__Impl"


    // $ANTLR start "rule__EValueGenerator__Group_1_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3204:1: rule__EValueGenerator__Group_1_1__0 : rule__EValueGenerator__Group_1_1__0__Impl rule__EValueGenerator__Group_1_1__1 ;
    public final void rule__EValueGenerator__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3208:1: ( rule__EValueGenerator__Group_1_1__0__Impl rule__EValueGenerator__Group_1_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3209:2: rule__EValueGenerator__Group_1_1__0__Impl rule__EValueGenerator__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_1__0__Impl_in_rule__EValueGenerator__Group_1_1__06419);
            rule__EValueGenerator__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_1__1_in_rule__EValueGenerator__Group_1_1__06422);
            rule__EValueGenerator__Group_1_1__1();

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
    // $ANTLR end "rule__EValueGenerator__Group_1_1__0"


    // $ANTLR start "rule__EValueGenerator__Group_1_1__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3216:1: rule__EValueGenerator__Group_1_1__0__Impl : ( 'query' ) ;
    public final void rule__EValueGenerator__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3220:1: ( ( 'query' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3221:1: ( 'query' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3221:1: ( 'query' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3222:1: 'query'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getQueryKeyword_1_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__EValueGenerator__Group_1_1__0__Impl6450); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getQueryKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EValueGenerator__Group_1_1__0__Impl"


    // $ANTLR start "rule__EValueGenerator__Group_1_1__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3235:1: rule__EValueGenerator__Group_1_1__1 : rule__EValueGenerator__Group_1_1__1__Impl ;
    public final void rule__EValueGenerator__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3239:1: ( rule__EValueGenerator__Group_1_1__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3240:2: rule__EValueGenerator__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_1__1__Impl_in_rule__EValueGenerator__Group_1_1__16481);
            rule__EValueGenerator__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__EValueGenerator__Group_1_1__1"


    // $ANTLR start "rule__EValueGenerator__Group_1_1__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3246:1: rule__EValueGenerator__Group_1_1__1__Impl : ( ( rule__EValueGenerator__QueryAssignment_1_1_1 ) ) ;
    public final void rule__EValueGenerator__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3250:1: ( ( ( rule__EValueGenerator__QueryAssignment_1_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3251:1: ( ( rule__EValueGenerator__QueryAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3251:1: ( ( rule__EValueGenerator__QueryAssignment_1_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3252:1: ( rule__EValueGenerator__QueryAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getQueryAssignment_1_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3253:1: ( rule__EValueGenerator__QueryAssignment_1_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3253:2: rule__EValueGenerator__QueryAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__QueryAssignment_1_1_1_in_rule__EValueGenerator__Group_1_1__1__Impl6508);
            rule__EValueGenerator__QueryAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getQueryAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EValueGenerator__Group_1_1__1__Impl"


    // $ANTLR start "rule__EValueGenerator__Group_1_2__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3267:1: rule__EValueGenerator__Group_1_2__0 : rule__EValueGenerator__Group_1_2__0__Impl rule__EValueGenerator__Group_1_2__1 ;
    public final void rule__EValueGenerator__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3271:1: ( rule__EValueGenerator__Group_1_2__0__Impl rule__EValueGenerator__Group_1_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3272:2: rule__EValueGenerator__Group_1_2__0__Impl rule__EValueGenerator__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_2__0__Impl_in_rule__EValueGenerator__Group_1_2__06542);
            rule__EValueGenerator__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_2__1_in_rule__EValueGenerator__Group_1_2__06545);
            rule__EValueGenerator__Group_1_2__1();

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
    // $ANTLR end "rule__EValueGenerator__Group_1_2__0"


    // $ANTLR start "rule__EValueGenerator__Group_1_2__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3279:1: rule__EValueGenerator__Group_1_2__0__Impl : ( 'seqnext' ) ;
    public final void rule__EValueGenerator__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3283:1: ( ( 'seqnext' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3284:1: ( 'seqnext' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3284:1: ( 'seqnext' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3285:1: 'seqnext'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getSeqnextKeyword_1_2_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__EValueGenerator__Group_1_2__0__Impl6573); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getSeqnextKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EValueGenerator__Group_1_2__0__Impl"


    // $ANTLR start "rule__EValueGenerator__Group_1_2__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3298:1: rule__EValueGenerator__Group_1_2__1 : rule__EValueGenerator__Group_1_2__1__Impl ;
    public final void rule__EValueGenerator__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3302:1: ( rule__EValueGenerator__Group_1_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3303:2: rule__EValueGenerator__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_2__1__Impl_in_rule__EValueGenerator__Group_1_2__16604);
            rule__EValueGenerator__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__EValueGenerator__Group_1_2__1"


    // $ANTLR start "rule__EValueGenerator__Group_1_2__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3309:1: rule__EValueGenerator__Group_1_2__1__Impl : ( ( rule__EValueGenerator__SequenceAssignment_1_2_1 ) ) ;
    public final void rule__EValueGenerator__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3313:1: ( ( ( rule__EValueGenerator__SequenceAssignment_1_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3314:1: ( ( rule__EValueGenerator__SequenceAssignment_1_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3314:1: ( ( rule__EValueGenerator__SequenceAssignment_1_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3315:1: ( rule__EValueGenerator__SequenceAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getSequenceAssignment_1_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3316:1: ( rule__EValueGenerator__SequenceAssignment_1_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3316:2: rule__EValueGenerator__SequenceAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__SequenceAssignment_1_2_1_in_rule__EValueGenerator__Group_1_2__1__Impl6631);
            rule__EValueGenerator__SequenceAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getSequenceAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EValueGenerator__Group_1_2__1__Impl"


    // $ANTLR start "rule__ENamedQuery__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3330:1: rule__ENamedQuery__Group__0 : rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1 ;
    public final void rule__ENamedQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3334:1: ( rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3335:2: rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__0__Impl_in_rule__ENamedQuery__Group__06665);
            rule__ENamedQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__1_in_rule__ENamedQuery__Group__06668);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3342:1: rule__ENamedQuery__Group__0__Impl : ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? ) ;
    public final void rule__ENamedQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3346:1: ( ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3347:1: ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3347:1: ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3348:1: ( rule__ENamedQuery__ReturnTypeAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getReturnTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3349:1: ( rule__ENamedQuery__ReturnTypeAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=14 && LA27_0<=15)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3349:2: rule__ENamedQuery__ReturnTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ENamedQuery__ReturnTypeAssignment_0_in_rule__ENamedQuery__Group__0__Impl6695);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3359:1: rule__ENamedQuery__Group__1 : rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2 ;
    public final void rule__ENamedQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3363:1: ( rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3364:2: rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__1__Impl_in_rule__ENamedQuery__Group__16726);
            rule__ENamedQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__2_in_rule__ENamedQuery__Group__16729);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3371:1: rule__ENamedQuery__Group__1__Impl : ( ( rule__ENamedQuery__NameAssignment_1 ) ) ;
    public final void rule__ENamedQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3375:1: ( ( ( rule__ENamedQuery__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3376:1: ( ( rule__ENamedQuery__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3376:1: ( ( rule__ENamedQuery__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3377:1: ( rule__ENamedQuery__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3378:1: ( rule__ENamedQuery__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3378:2: rule__ENamedQuery__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__NameAssignment_1_in_rule__ENamedQuery__Group__1__Impl6756);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3388:1: rule__ENamedQuery__Group__2 : rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3 ;
    public final void rule__ENamedQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3392:1: ( rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3393:2: rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__2__Impl_in_rule__ENamedQuery__Group__26786);
            rule__ENamedQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__3_in_rule__ENamedQuery__Group__26789);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3400:1: rule__ENamedQuery__Group__2__Impl : ( ( rule__ENamedQuery__Group_2__0 )? ) ;
    public final void rule__ENamedQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3404:1: ( ( ( rule__ENamedQuery__Group_2__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3405:1: ( ( rule__ENamedQuery__Group_2__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3405:1: ( ( rule__ENamedQuery__Group_2__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3406:1: ( rule__ENamedQuery__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getGroup_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3407:1: ( rule__ENamedQuery__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3407:2: rule__ENamedQuery__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ENamedQuery__Group_2__0_in_rule__ENamedQuery__Group__2__Impl6816);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3417:1: rule__ENamedQuery__Group__3 : rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4 ;
    public final void rule__ENamedQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3421:1: ( rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3422:2: rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__3__Impl_in_rule__ENamedQuery__Group__36847);
            rule__ENamedQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__4_in_rule__ENamedQuery__Group__36850);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3429:1: rule__ENamedQuery__Group__3__Impl : ( '{' ) ;
    public final void rule__ENamedQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3433:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3434:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3434:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3435:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,17,FOLLOW_17_in_rule__ENamedQuery__Group__3__Impl6878); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3448:1: rule__ENamedQuery__Group__4 : rule__ENamedQuery__Group__4__Impl rule__ENamedQuery__Group__5 ;
    public final void rule__ENamedQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3452:1: ( rule__ENamedQuery__Group__4__Impl rule__ENamedQuery__Group__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3453:2: rule__ENamedQuery__Group__4__Impl rule__ENamedQuery__Group__5
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__4__Impl_in_rule__ENamedQuery__Group__46909);
            rule__ENamedQuery__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__5_in_rule__ENamedQuery__Group__46912);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3460:1: rule__ENamedQuery__Group__4__Impl : ( ( rule__ENamedQuery__QueriesAssignment_4 ) ) ;
    public final void rule__ENamedQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3464:1: ( ( ( rule__ENamedQuery__QueriesAssignment_4 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3465:1: ( ( rule__ENamedQuery__QueriesAssignment_4 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3465:1: ( ( rule__ENamedQuery__QueriesAssignment_4 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3466:1: ( rule__ENamedQuery__QueriesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesAssignment_4()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3467:1: ( rule__ENamedQuery__QueriesAssignment_4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3467:2: rule__ENamedQuery__QueriesAssignment_4
            {
            pushFollow(FOLLOW_rule__ENamedQuery__QueriesAssignment_4_in_rule__ENamedQuery__Group__4__Impl6939);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3477:1: rule__ENamedQuery__Group__5 : rule__ENamedQuery__Group__5__Impl rule__ENamedQuery__Group__6 ;
    public final void rule__ENamedQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3481:1: ( rule__ENamedQuery__Group__5__Impl rule__ENamedQuery__Group__6 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3482:2: rule__ENamedQuery__Group__5__Impl rule__ENamedQuery__Group__6
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__5__Impl_in_rule__ENamedQuery__Group__56969);
            rule__ENamedQuery__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__6_in_rule__ENamedQuery__Group__56972);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3489:1: rule__ENamedQuery__Group__5__Impl : ( ( rule__ENamedQuery__Group_5__0 )* ) ;
    public final void rule__ENamedQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3493:1: ( ( ( rule__ENamedQuery__Group_5__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3494:1: ( ( rule__ENamedQuery__Group_5__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3494:1: ( ( rule__ENamedQuery__Group_5__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3495:1: ( rule__ENamedQuery__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getGroup_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3496:1: ( rule__ENamedQuery__Group_5__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==19) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3496:2: rule__ENamedQuery__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ENamedQuery__Group_5__0_in_rule__ENamedQuery__Group__5__Impl6999);
            	    rule__ENamedQuery__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3506:1: rule__ENamedQuery__Group__6 : rule__ENamedQuery__Group__6__Impl ;
    public final void rule__ENamedQuery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3510:1: ( rule__ENamedQuery__Group__6__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3511:2: rule__ENamedQuery__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__6__Impl_in_rule__ENamedQuery__Group__67030);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3517:1: rule__ENamedQuery__Group__6__Impl : ( '}' ) ;
    public final void rule__ENamedQuery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3521:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3522:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3522:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3523:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,18,FOLLOW_18_in_rule__ENamedQuery__Group__6__Impl7058); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3550:1: rule__ENamedQuery__Group_2__0 : rule__ENamedQuery__Group_2__0__Impl rule__ENamedQuery__Group_2__1 ;
    public final void rule__ENamedQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3554:1: ( rule__ENamedQuery__Group_2__0__Impl rule__ENamedQuery__Group_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3555:2: rule__ENamedQuery__Group_2__0__Impl rule__ENamedQuery__Group_2__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__0__Impl_in_rule__ENamedQuery__Group_2__07103);
            rule__ENamedQuery__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__1_in_rule__ENamedQuery__Group_2__07106);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3562:1: rule__ENamedQuery__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ENamedQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3566:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3567:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3567:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3568:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ENamedQuery__Group_2__0__Impl7134); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3581:1: rule__ENamedQuery__Group_2__1 : rule__ENamedQuery__Group_2__1__Impl rule__ENamedQuery__Group_2__2 ;
    public final void rule__ENamedQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3585:1: ( rule__ENamedQuery__Group_2__1__Impl rule__ENamedQuery__Group_2__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3586:2: rule__ENamedQuery__Group_2__1__Impl rule__ENamedQuery__Group_2__2
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__1__Impl_in_rule__ENamedQuery__Group_2__17165);
            rule__ENamedQuery__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__2_in_rule__ENamedQuery__Group_2__17168);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3593:1: rule__ENamedQuery__Group_2__1__Impl : ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* ) ;
    public final void rule__ENamedQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3597:1: ( ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3598:1: ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3598:1: ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3599:1: ( rule__ENamedQuery__ParametersAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getParametersAssignment_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3600:1: ( rule__ENamedQuery__ParametersAssignment_2_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3600:2: rule__ENamedQuery__ParametersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__ENamedQuery__ParametersAssignment_2_1_in_rule__ENamedQuery__Group_2__1__Impl7195);
            	    rule__ENamedQuery__ParametersAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3610:1: rule__ENamedQuery__Group_2__2 : rule__ENamedQuery__Group_2__2__Impl ;
    public final void rule__ENamedQuery__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3614:1: ( rule__ENamedQuery__Group_2__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3615:2: rule__ENamedQuery__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__2__Impl_in_rule__ENamedQuery__Group_2__27226);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3621:1: rule__ENamedQuery__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ENamedQuery__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3625:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3626:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3626:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3627:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ENamedQuery__Group_2__2__Impl7254); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3646:1: rule__ENamedQuery__Group_5__0 : rule__ENamedQuery__Group_5__0__Impl rule__ENamedQuery__Group_5__1 ;
    public final void rule__ENamedQuery__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3650:1: ( rule__ENamedQuery__Group_5__0__Impl rule__ENamedQuery__Group_5__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3651:2: rule__ENamedQuery__Group_5__0__Impl rule__ENamedQuery__Group_5__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_5__0__Impl_in_rule__ENamedQuery__Group_5__07291);
            rule__ENamedQuery__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_5__1_in_rule__ENamedQuery__Group_5__07294);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3658:1: rule__ENamedQuery__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ENamedQuery__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3662:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3663:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3663:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3664:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getCommaKeyword_5_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__ENamedQuery__Group_5__0__Impl7322); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3677:1: rule__ENamedQuery__Group_5__1 : rule__ENamedQuery__Group_5__1__Impl ;
    public final void rule__ENamedQuery__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3681:1: ( rule__ENamedQuery__Group_5__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3682:2: rule__ENamedQuery__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_5__1__Impl_in_rule__ENamedQuery__Group_5__17353);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3688:1: rule__ENamedQuery__Group_5__1__Impl : ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) ) ;
    public final void rule__ENamedQuery__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3692:1: ( ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3693:1: ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3693:1: ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3694:1: ( rule__ENamedQuery__QueriesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesAssignment_5_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3695:1: ( rule__ENamedQuery__QueriesAssignment_5_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3695:2: rule__ENamedQuery__QueriesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__QueriesAssignment_5_1_in_rule__ENamedQuery__Group_5__1__Impl7380);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3709:1: rule__EParameter__Group__0 : rule__EParameter__Group__0__Impl rule__EParameter__Group__1 ;
    public final void rule__EParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3713:1: ( rule__EParameter__Group__0__Impl rule__EParameter__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3714:2: rule__EParameter__Group__0__Impl rule__EParameter__Group__1
            {
            pushFollow(FOLLOW_rule__EParameter__Group__0__Impl_in_rule__EParameter__Group__07414);
            rule__EParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EParameter__Group__1_in_rule__EParameter__Group__07417);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3721:1: rule__EParameter__Group__0__Impl : ( ( rule__EParameter__TypeAssignment_0 ) ) ;
    public final void rule__EParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3725:1: ( ( ( rule__EParameter__TypeAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3726:1: ( ( rule__EParameter__TypeAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3726:1: ( ( rule__EParameter__TypeAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3727:1: ( rule__EParameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3728:1: ( rule__EParameter__TypeAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3728:2: rule__EParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EParameter__TypeAssignment_0_in_rule__EParameter__Group__0__Impl7444);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3738:1: rule__EParameter__Group__1 : rule__EParameter__Group__1__Impl ;
    public final void rule__EParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3742:1: ( rule__EParameter__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3743:2: rule__EParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EParameter__Group__1__Impl_in_rule__EParameter__Group__17474);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3749:1: rule__EParameter__Group__1__Impl : ( ( rule__EParameter__NameAssignment_1 ) ) ;
    public final void rule__EParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3753:1: ( ( ( rule__EParameter__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3754:1: ( ( rule__EParameter__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3754:1: ( ( rule__EParameter__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3755:1: ( rule__EParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3756:1: ( rule__EParameter__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3756:2: rule__EParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EParameter__NameAssignment_1_in_rule__EParameter__Group__1__Impl7501);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3770:1: rule__EQuery__Group__0 : rule__EQuery__Group__0__Impl rule__EQuery__Group__1 ;
    public final void rule__EQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3774:1: ( rule__EQuery__Group__0__Impl rule__EQuery__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3775:2: rule__EQuery__Group__0__Impl rule__EQuery__Group__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group__0__Impl_in_rule__EQuery__Group__07535);
            rule__EQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group__1_in_rule__EQuery__Group__07538);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3782:1: rule__EQuery__Group__0__Impl : ( ( rule__EQuery__DbTypeAssignment_0 ) ) ;
    public final void rule__EQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3786:1: ( ( ( rule__EQuery__DbTypeAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3787:1: ( ( rule__EQuery__DbTypeAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3787:1: ( ( rule__EQuery__DbTypeAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3788:1: ( rule__EQuery__DbTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getDbTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3789:1: ( rule__EQuery__DbTypeAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3789:2: rule__EQuery__DbTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EQuery__DbTypeAssignment_0_in_rule__EQuery__Group__0__Impl7565);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3799:1: rule__EQuery__Group__1 : rule__EQuery__Group__1__Impl rule__EQuery__Group__2 ;
    public final void rule__EQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3803:1: ( rule__EQuery__Group__1__Impl rule__EQuery__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3804:2: rule__EQuery__Group__1__Impl rule__EQuery__Group__2
            {
            pushFollow(FOLLOW_rule__EQuery__Group__1__Impl_in_rule__EQuery__Group__17595);
            rule__EQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group__2_in_rule__EQuery__Group__17598);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3811:1: rule__EQuery__Group__1__Impl : ( ( rule__EQuery__MappingAssignment_1 ) ) ;
    public final void rule__EQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3815:1: ( ( ( rule__EQuery__MappingAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3816:1: ( ( rule__EQuery__MappingAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3816:1: ( ( rule__EQuery__MappingAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3817:1: ( rule__EQuery__MappingAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getMappingAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3818:1: ( rule__EQuery__MappingAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3818:2: rule__EQuery__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__EQuery__MappingAssignment_1_in_rule__EQuery__Group__1__Impl7625);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3828:1: rule__EQuery__Group__2 : rule__EQuery__Group__2__Impl ;
    public final void rule__EQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3832:1: ( rule__EQuery__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3833:2: rule__EQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group__2__Impl_in_rule__EQuery__Group__27655);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3839:1: rule__EQuery__Group__2__Impl : ( ( rule__EQuery__Alternatives_2 ) ) ;
    public final void rule__EQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3843:1: ( ( ( rule__EQuery__Alternatives_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3844:1: ( ( rule__EQuery__Alternatives_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3844:1: ( ( rule__EQuery__Alternatives_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3845:1: ( rule__EQuery__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getAlternatives_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3846:1: ( rule__EQuery__Alternatives_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3846:2: rule__EQuery__Alternatives_2
            {
            pushFollow(FOLLOW_rule__EQuery__Alternatives_2_in_rule__EQuery__Group__2__Impl7682);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3862:1: rule__EQuery__Group_2_0__0 : rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1 ;
    public final void rule__EQuery__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3866:1: ( rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3867:2: rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__0__Impl_in_rule__EQuery__Group_2_0__07718);
            rule__EQuery__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__1_in_rule__EQuery__Group_2_0__07721);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3874:1: rule__EQuery__Group_2_0__0__Impl : ( 'FROM' ) ;
    public final void rule__EQuery__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3878:1: ( ( 'FROM' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3879:1: ( 'FROM' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3879:1: ( 'FROM' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3880:1: 'FROM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__EQuery__Group_2_0__0__Impl7749); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3893:1: rule__EQuery__Group_2_0__1 : rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2 ;
    public final void rule__EQuery__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3897:1: ( rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3898:2: rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__1__Impl_in_rule__EQuery__Group_2_0__17780);
            rule__EQuery__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__2_in_rule__EQuery__Group_2_0__17783);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3905:1: rule__EQuery__Group_2_0__1__Impl : ( ( rule__EQuery__FromAssignment_2_0_1 ) ) ;
    public final void rule__EQuery__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3909:1: ( ( ( rule__EQuery__FromAssignment_2_0_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3910:1: ( ( rule__EQuery__FromAssignment_2_0_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3910:1: ( ( rule__EQuery__FromAssignment_2_0_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3911:1: ( rule__EQuery__FromAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFromAssignment_2_0_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3912:1: ( rule__EQuery__FromAssignment_2_0_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3912:2: rule__EQuery__FromAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__EQuery__FromAssignment_2_0_1_in_rule__EQuery__Group_2_0__1__Impl7810);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3922:1: rule__EQuery__Group_2_0__2 : rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3 ;
    public final void rule__EQuery__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3926:1: ( rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3927:2: rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__2__Impl_in_rule__EQuery__Group_2_0__27840);
            rule__EQuery__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__3_in_rule__EQuery__Group_2_0__27843);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3934:1: rule__EQuery__Group_2_0__2__Impl : ( ( rule__EQuery__Group_2_0_2__0 )? ) ;
    public final void rule__EQuery__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3938:1: ( ( ( rule__EQuery__Group_2_0_2__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3939:1: ( ( rule__EQuery__Group_2_0_2__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3939:1: ( ( rule__EQuery__Group_2_0_2__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3940:1: ( rule__EQuery__Group_2_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3941:1: ( rule__EQuery__Group_2_0_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3941:2: rule__EQuery__Group_2_0_2__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__0_in_rule__EQuery__Group_2_0__2__Impl7870);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3951:1: rule__EQuery__Group_2_0__3 : rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4 ;
    public final void rule__EQuery__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3955:1: ( rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3956:2: rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__3__Impl_in_rule__EQuery__Group_2_0__37901);
            rule__EQuery__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__4_in_rule__EQuery__Group_2_0__37904);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3963:1: rule__EQuery__Group_2_0__3__Impl : ( ( rule__EQuery__Group_2_0_3__0 )? ) ;
    public final void rule__EQuery__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3967:1: ( ( ( rule__EQuery__Group_2_0_3__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3968:1: ( ( rule__EQuery__Group_2_0_3__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3968:1: ( ( rule__EQuery__Group_2_0_3__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3969:1: ( rule__EQuery__Group_2_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3970:1: ( rule__EQuery__Group_2_0_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3970:2: rule__EQuery__Group_2_0_3__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__0_in_rule__EQuery__Group_2_0__3__Impl7931);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3980:1: rule__EQuery__Group_2_0__4 : rule__EQuery__Group_2_0__4__Impl ;
    public final void rule__EQuery__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3984:1: ( rule__EQuery__Group_2_0__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3985:2: rule__EQuery__Group_2_0__4__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__4__Impl_in_rule__EQuery__Group_2_0__47962);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3991:1: rule__EQuery__Group_2_0__4__Impl : ( ( rule__EQuery__Group_2_0_4__0 )? ) ;
    public final void rule__EQuery__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3995:1: ( ( ( rule__EQuery__Group_2_0_4__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3996:1: ( ( rule__EQuery__Group_2_0_4__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3996:1: ( ( rule__EQuery__Group_2_0_4__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3997:1: ( rule__EQuery__Group_2_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_4()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3998:1: ( rule__EQuery__Group_2_0_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3998:2: rule__EQuery__Group_2_0_4__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__0_in_rule__EQuery__Group_2_0__4__Impl7989);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4018:1: rule__EQuery__Group_2_0_2__0 : rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1 ;
    public final void rule__EQuery__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4022:1: ( rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4023:2: rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__0__Impl_in_rule__EQuery__Group_2_0_2__08030);
            rule__EQuery__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__1_in_rule__EQuery__Group_2_0_2__08033);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4030:1: rule__EQuery__Group_2_0_2__0__Impl : ( 'WHERE' ) ;
    public final void rule__EQuery__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4034:1: ( ( 'WHERE' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4035:1: ( 'WHERE' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4035:1: ( 'WHERE' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4036:1: 'WHERE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__EQuery__Group_2_0_2__0__Impl8061); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4049:1: rule__EQuery__Group_2_0_2__1 : rule__EQuery__Group_2_0_2__1__Impl ;
    public final void rule__EQuery__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4053:1: ( rule__EQuery__Group_2_0_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4054:2: rule__EQuery__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__1__Impl_in_rule__EQuery__Group_2_0_2__18092);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4060:1: rule__EQuery__Group_2_0_2__1__Impl : ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) ) ;
    public final void rule__EQuery__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4064:1: ( ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4065:1: ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4065:1: ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4066:1: ( rule__EQuery__WhereAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWhereAssignment_2_0_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4067:1: ( rule__EQuery__WhereAssignment_2_0_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4067:2: rule__EQuery__WhereAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_rule__EQuery__WhereAssignment_2_0_2_1_in_rule__EQuery__Group_2_0_2__1__Impl8119);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4081:1: rule__EQuery__Group_2_0_3__0 : rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1 ;
    public final void rule__EQuery__Group_2_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4085:1: ( rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4086:2: rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__0__Impl_in_rule__EQuery__Group_2_0_3__08153);
            rule__EQuery__Group_2_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__1_in_rule__EQuery__Group_2_0_3__08156);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4093:1: rule__EQuery__Group_2_0_3__0__Impl : ( 'GROUP BY' ) ;
    public final void rule__EQuery__Group_2_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4097:1: ( ( 'GROUP BY' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4098:1: ( 'GROUP BY' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4098:1: ( 'GROUP BY' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4099:1: 'GROUP BY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EQuery__Group_2_0_3__0__Impl8184); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4112:1: rule__EQuery__Group_2_0_3__1 : rule__EQuery__Group_2_0_3__1__Impl ;
    public final void rule__EQuery__Group_2_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4116:1: ( rule__EQuery__Group_2_0_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4117:2: rule__EQuery__Group_2_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__1__Impl_in_rule__EQuery__Group_2_0_3__18215);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4123:1: rule__EQuery__Group_2_0_3__1__Impl : ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) ) ;
    public final void rule__EQuery__Group_2_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4127:1: ( ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4128:1: ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4128:1: ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4129:1: ( rule__EQuery__GroupByAssignment_2_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroupByAssignment_2_0_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4130:1: ( rule__EQuery__GroupByAssignment_2_0_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4130:2: rule__EQuery__GroupByAssignment_2_0_3_1
            {
            pushFollow(FOLLOW_rule__EQuery__GroupByAssignment_2_0_3_1_in_rule__EQuery__Group_2_0_3__1__Impl8242);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4144:1: rule__EQuery__Group_2_0_4__0 : rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1 ;
    public final void rule__EQuery__Group_2_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4148:1: ( rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4149:2: rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__0__Impl_in_rule__EQuery__Group_2_0_4__08276);
            rule__EQuery__Group_2_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__1_in_rule__EQuery__Group_2_0_4__08279);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4156:1: rule__EQuery__Group_2_0_4__0__Impl : ( 'ORDER BY' ) ;
    public final void rule__EQuery__Group_2_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4160:1: ( ( 'ORDER BY' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4161:1: ( 'ORDER BY' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4161:1: ( 'ORDER BY' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4162:1: 'ORDER BY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__EQuery__Group_2_0_4__0__Impl8307); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4175:1: rule__EQuery__Group_2_0_4__1 : rule__EQuery__Group_2_0_4__1__Impl ;
    public final void rule__EQuery__Group_2_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4179:1: ( rule__EQuery__Group_2_0_4__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4180:2: rule__EQuery__Group_2_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__1__Impl_in_rule__EQuery__Group_2_0_4__18338);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4186:1: rule__EQuery__Group_2_0_4__1__Impl : ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) ) ;
    public final void rule__EQuery__Group_2_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4190:1: ( ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4191:1: ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4191:1: ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4192:1: ( rule__EQuery__OrderbyAssignment_2_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getOrderbyAssignment_2_0_4_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4193:1: ( rule__EQuery__OrderbyAssignment_2_0_4_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4193:2: rule__EQuery__OrderbyAssignment_2_0_4_1
            {
            pushFollow(FOLLOW_rule__EQuery__OrderbyAssignment_2_0_4_1_in_rule__EQuery__Group_2_0_4__1__Impl8365);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4207:1: rule__EObjectSection__Group__0 : rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1 ;
    public final void rule__EObjectSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4211:1: ( rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4212:2: rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__0__Impl_in_rule__EObjectSection__Group__08399);
            rule__EObjectSection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group__1_in_rule__EObjectSection__Group__08402);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4219:1: rule__EObjectSection__Group__0__Impl : ( ( rule__EObjectSection__EntityAssignment_0 ) ) ;
    public final void rule__EObjectSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4223:1: ( ( ( rule__EObjectSection__EntityAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4224:1: ( ( rule__EObjectSection__EntityAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4224:1: ( ( rule__EObjectSection__EntityAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4225:1: ( rule__EObjectSection__EntityAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4226:1: ( rule__EObjectSection__EntityAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4226:2: rule__EObjectSection__EntityAssignment_0
            {
            pushFollow(FOLLOW_rule__EObjectSection__EntityAssignment_0_in_rule__EObjectSection__Group__0__Impl8429);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4236:1: rule__EObjectSection__Group__1 : rule__EObjectSection__Group__1__Impl rule__EObjectSection__Group__2 ;
    public final void rule__EObjectSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4240:1: ( rule__EObjectSection__Group__1__Impl rule__EObjectSection__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4241:2: rule__EObjectSection__Group__1__Impl rule__EObjectSection__Group__2
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__1__Impl_in_rule__EObjectSection__Group__18459);
            rule__EObjectSection__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group__2_in_rule__EObjectSection__Group__18462);
            rule__EObjectSection__Group__2();

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4248:1: rule__EObjectSection__Group__1__Impl : ( ( rule__EObjectSection__Group_1__0 )? ) ;
    public final void rule__EObjectSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4252:1: ( ( ( rule__EObjectSection__Group_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4253:1: ( ( rule__EObjectSection__Group_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4253:1: ( ( rule__EObjectSection__Group_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4254:1: ( rule__EObjectSection__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4255:1: ( rule__EObjectSection__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4255:2: rule__EObjectSection__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EObjectSection__Group_1__0_in_rule__EObjectSection__Group__1__Impl8489);
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


    // $ANTLR start "rule__EObjectSection__Group__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4265:1: rule__EObjectSection__Group__2 : rule__EObjectSection__Group__2__Impl ;
    public final void rule__EObjectSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4269:1: ( rule__EObjectSection__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4270:2: rule__EObjectSection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__2__Impl_in_rule__EObjectSection__Group__28520);
            rule__EObjectSection__Group__2__Impl();

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
    // $ANTLR end "rule__EObjectSection__Group__2"


    // $ANTLR start "rule__EObjectSection__Group__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4276:1: rule__EObjectSection__Group__2__Impl : ( ( rule__EObjectSection__Group_2__0 )? ) ;
    public final void rule__EObjectSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4280:1: ( ( ( rule__EObjectSection__Group_2__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4281:1: ( ( rule__EObjectSection__Group_2__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4281:1: ( ( rule__EObjectSection__Group_2__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4282:1: ( rule__EObjectSection__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4283:1: ( rule__EObjectSection__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4283:2: rule__EObjectSection__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EObjectSection__Group_2__0_in_rule__EObjectSection__Group__2__Impl8547);
                    rule__EObjectSection__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group__2__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4299:1: rule__EObjectSection__Group_1__0 : rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1 ;
    public final void rule__EObjectSection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4303:1: ( rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4304:2: rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__0__Impl_in_rule__EObjectSection__Group_1__08584);
            rule__EObjectSection__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__1_in_rule__EObjectSection__Group_1__08587);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4311:1: rule__EObjectSection__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EObjectSection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4315:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4316:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4316:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4317:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__EObjectSection__Group_1__0__Impl8615); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4330:1: rule__EObjectSection__Group_1__1 : rule__EObjectSection__Group_1__1__Impl rule__EObjectSection__Group_1__2 ;
    public final void rule__EObjectSection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4334:1: ( rule__EObjectSection__Group_1__1__Impl rule__EObjectSection__Group_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4335:2: rule__EObjectSection__Group_1__1__Impl rule__EObjectSection__Group_1__2
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__1__Impl_in_rule__EObjectSection__Group_1__18646);
            rule__EObjectSection__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__2_in_rule__EObjectSection__Group_1__18649);
            rule__EObjectSection__Group_1__2();

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4342:1: rule__EObjectSection__Group_1__1__Impl : ( ( rule__EObjectSection__DescriminatedTypesAssignment_1_1 ) ) ;
    public final void rule__EObjectSection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4346:1: ( ( ( rule__EObjectSection__DescriminatedTypesAssignment_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4347:1: ( ( rule__EObjectSection__DescriminatedTypesAssignment_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4347:1: ( ( rule__EObjectSection__DescriminatedTypesAssignment_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4348:1: ( rule__EObjectSection__DescriminatedTypesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesAssignment_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4349:1: ( rule__EObjectSection__DescriminatedTypesAssignment_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4349:2: rule__EObjectSection__DescriminatedTypesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EObjectSection__DescriminatedTypesAssignment_1_1_in_rule__EObjectSection__Group_1__1__Impl8676);
            rule__EObjectSection__DescriminatedTypesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesAssignment_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EObjectSection__Group_1__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4359:1: rule__EObjectSection__Group_1__2 : rule__EObjectSection__Group_1__2__Impl rule__EObjectSection__Group_1__3 ;
    public final void rule__EObjectSection__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4363:1: ( rule__EObjectSection__Group_1__2__Impl rule__EObjectSection__Group_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4364:2: rule__EObjectSection__Group_1__2__Impl rule__EObjectSection__Group_1__3
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__2__Impl_in_rule__EObjectSection__Group_1__28706);
            rule__EObjectSection__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__3_in_rule__EObjectSection__Group_1__28709);
            rule__EObjectSection__Group_1__3();

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
    // $ANTLR end "rule__EObjectSection__Group_1__2"


    // $ANTLR start "rule__EObjectSection__Group_1__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4371:1: rule__EObjectSection__Group_1__2__Impl : ( ( ( rule__EObjectSection__Group_1_2__0 ) ) ( ( rule__EObjectSection__Group_1_2__0 )* ) ) ;
    public final void rule__EObjectSection__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4375:1: ( ( ( ( rule__EObjectSection__Group_1_2__0 ) ) ( ( rule__EObjectSection__Group_1_2__0 )* ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4376:1: ( ( ( rule__EObjectSection__Group_1_2__0 ) ) ( ( rule__EObjectSection__Group_1_2__0 )* ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4376:1: ( ( ( rule__EObjectSection__Group_1_2__0 ) ) ( ( rule__EObjectSection__Group_1_2__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4377:1: ( ( rule__EObjectSection__Group_1_2__0 ) ) ( ( rule__EObjectSection__Group_1_2__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4377:1: ( ( rule__EObjectSection__Group_1_2__0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4378:1: ( rule__EObjectSection__Group_1_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4379:1: ( rule__EObjectSection__Group_1_2__0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4379:2: rule__EObjectSection__Group_1_2__0
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_2__0_in_rule__EObjectSection__Group_1__2__Impl8738);
            rule__EObjectSection__Group_1_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getGroup_1_2()); 
            }

            }

            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4382:1: ( ( rule__EObjectSection__Group_1_2__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4383:1: ( rule__EObjectSection__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4384:1: ( rule__EObjectSection__Group_1_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==19) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4384:2: rule__EObjectSection__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EObjectSection__Group_1_2__0_in_rule__EObjectSection__Group_1__2__Impl8750);
            	    rule__EObjectSection__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__EObjectSection__Group_1__2__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4395:1: rule__EObjectSection__Group_1__3 : rule__EObjectSection__Group_1__3__Impl ;
    public final void rule__EObjectSection__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4399:1: ( rule__EObjectSection__Group_1__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4400:2: rule__EObjectSection__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__3__Impl_in_rule__EObjectSection__Group_1__38783);
            rule__EObjectSection__Group_1__3__Impl();

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
    // $ANTLR end "rule__EObjectSection__Group_1__3"


    // $ANTLR start "rule__EObjectSection__Group_1__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4406:1: rule__EObjectSection__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EObjectSection__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4410:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4411:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4411:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4412:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__EObjectSection__Group_1__3__Impl8811); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getRightParenthesisKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_1__3__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1_2__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4433:1: rule__EObjectSection__Group_1_2__0 : rule__EObjectSection__Group_1_2__0__Impl rule__EObjectSection__Group_1_2__1 ;
    public final void rule__EObjectSection__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4437:1: ( rule__EObjectSection__Group_1_2__0__Impl rule__EObjectSection__Group_1_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4438:2: rule__EObjectSection__Group_1_2__0__Impl rule__EObjectSection__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_2__0__Impl_in_rule__EObjectSection__Group_1_2__08850);
            rule__EObjectSection__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_2__1_in_rule__EObjectSection__Group_1_2__08853);
            rule__EObjectSection__Group_1_2__1();

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
    // $ANTLR end "rule__EObjectSection__Group_1_2__0"


    // $ANTLR start "rule__EObjectSection__Group_1_2__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4445:1: rule__EObjectSection__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__EObjectSection__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4449:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4450:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4450:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4451:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EObjectSection__Group_1_2__0__Impl8881); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_1_2__0__Impl"


    // $ANTLR start "rule__EObjectSection__Group_1_2__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4464:1: rule__EObjectSection__Group_1_2__1 : rule__EObjectSection__Group_1_2__1__Impl ;
    public final void rule__EObjectSection__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4468:1: ( rule__EObjectSection__Group_1_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4469:2: rule__EObjectSection__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_2__1__Impl_in_rule__EObjectSection__Group_1_2__18912);
            rule__EObjectSection__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__EObjectSection__Group_1_2__1"


    // $ANTLR start "rule__EObjectSection__Group_1_2__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4475:1: rule__EObjectSection__Group_1_2__1__Impl : ( ( rule__EObjectSection__DescriminatedTypesAssignment_1_2_1 ) ) ;
    public final void rule__EObjectSection__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4479:1: ( ( ( rule__EObjectSection__DescriminatedTypesAssignment_1_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4480:1: ( ( rule__EObjectSection__DescriminatedTypesAssignment_1_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4480:1: ( ( rule__EObjectSection__DescriminatedTypesAssignment_1_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4481:1: ( rule__EObjectSection__DescriminatedTypesAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesAssignment_1_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4482:1: ( rule__EObjectSection__DescriminatedTypesAssignment_1_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4482:2: rule__EObjectSection__DescriminatedTypesAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__EObjectSection__DescriminatedTypesAssignment_1_2_1_in_rule__EObjectSection__Group_1_2__1__Impl8939);
            rule__EObjectSection__DescriminatedTypesAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_1_2__1__Impl"


    // $ANTLR start "rule__EObjectSection__Group_2__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4496:1: rule__EObjectSection__Group_2__0 : rule__EObjectSection__Group_2__0__Impl rule__EObjectSection__Group_2__1 ;
    public final void rule__EObjectSection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4500:1: ( rule__EObjectSection__Group_2__0__Impl rule__EObjectSection__Group_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4501:2: rule__EObjectSection__Group_2__0__Impl rule__EObjectSection__Group_2__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_2__0__Impl_in_rule__EObjectSection__Group_2__08973);
            rule__EObjectSection__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_2__1_in_rule__EObjectSection__Group_2__08976);
            rule__EObjectSection__Group_2__1();

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
    // $ANTLR end "rule__EObjectSection__Group_2__0"


    // $ANTLR start "rule__EObjectSection__Group_2__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4508:1: rule__EObjectSection__Group_2__0__Impl : ( ( rule__EObjectSection__PrefixAssignment_2_0 ) ) ;
    public final void rule__EObjectSection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4512:1: ( ( ( rule__EObjectSection__PrefixAssignment_2_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4513:1: ( ( rule__EObjectSection__PrefixAssignment_2_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4513:1: ( ( rule__EObjectSection__PrefixAssignment_2_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4514:1: ( rule__EObjectSection__PrefixAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getPrefixAssignment_2_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4515:1: ( rule__EObjectSection__PrefixAssignment_2_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4515:2: rule__EObjectSection__PrefixAssignment_2_0
            {
            pushFollow(FOLLOW_rule__EObjectSection__PrefixAssignment_2_0_in_rule__EObjectSection__Group_2__0__Impl9003);
            rule__EObjectSection__PrefixAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getPrefixAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_2__0__Impl"


    // $ANTLR start "rule__EObjectSection__Group_2__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4525:1: rule__EObjectSection__Group_2__1 : rule__EObjectSection__Group_2__1__Impl ;
    public final void rule__EObjectSection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4529:1: ( rule__EObjectSection__Group_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4530:2: rule__EObjectSection__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_2__1__Impl_in_rule__EObjectSection__Group_2__19033);
            rule__EObjectSection__Group_2__1__Impl();

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
    // $ANTLR end "rule__EObjectSection__Group_2__1"


    // $ANTLR start "rule__EObjectSection__Group_2__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4536:1: rule__EObjectSection__Group_2__1__Impl : ( ( rule__EObjectSection__Group_2_1__0 )? ) ;
    public final void rule__EObjectSection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4540:1: ( ( ( rule__EObjectSection__Group_2_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4541:1: ( ( rule__EObjectSection__Group_2_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4541:1: ( ( rule__EObjectSection__Group_2_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4542:1: ( rule__EObjectSection__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4543:1: ( rule__EObjectSection__Group_2_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4543:2: rule__EObjectSection__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__EObjectSection__Group_2_1__0_in_rule__EObjectSection__Group_2__1__Impl9060);
                    rule__EObjectSection__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_2__1__Impl"


    // $ANTLR start "rule__EObjectSection__Group_2_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4557:1: rule__EObjectSection__Group_2_1__0 : rule__EObjectSection__Group_2_1__0__Impl rule__EObjectSection__Group_2_1__1 ;
    public final void rule__EObjectSection__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4561:1: ( rule__EObjectSection__Group_2_1__0__Impl rule__EObjectSection__Group_2_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4562:2: rule__EObjectSection__Group_2_1__0__Impl rule__EObjectSection__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_2_1__0__Impl_in_rule__EObjectSection__Group_2_1__09095);
            rule__EObjectSection__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_2_1__1_in_rule__EObjectSection__Group_2_1__09098);
            rule__EObjectSection__Group_2_1__1();

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
    // $ANTLR end "rule__EObjectSection__Group_2_1__0"


    // $ANTLR start "rule__EObjectSection__Group_2_1__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4569:1: rule__EObjectSection__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__EObjectSection__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4573:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4574:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4574:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4575:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__EObjectSection__Group_2_1__0__Impl9126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_2_1__0__Impl"


    // $ANTLR start "rule__EObjectSection__Group_2_1__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4588:1: rule__EObjectSection__Group_2_1__1 : rule__EObjectSection__Group_2_1__1__Impl rule__EObjectSection__Group_2_1__2 ;
    public final void rule__EObjectSection__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4592:1: ( rule__EObjectSection__Group_2_1__1__Impl rule__EObjectSection__Group_2_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4593:2: rule__EObjectSection__Group_2_1__1__Impl rule__EObjectSection__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_2_1__1__Impl_in_rule__EObjectSection__Group_2_1__19157);
            rule__EObjectSection__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_2_1__2_in_rule__EObjectSection__Group_2_1__19160);
            rule__EObjectSection__Group_2_1__2();

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
    // $ANTLR end "rule__EObjectSection__Group_2_1__1"


    // $ANTLR start "rule__EObjectSection__Group_2_1__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4600:1: rule__EObjectSection__Group_2_1__1__Impl : ( ( rule__EObjectSection__AttributesAssignment_2_1_1 ) ) ;
    public final void rule__EObjectSection__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4604:1: ( ( ( rule__EObjectSection__AttributesAssignment_2_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4605:1: ( ( rule__EObjectSection__AttributesAssignment_2_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4605:1: ( ( rule__EObjectSection__AttributesAssignment_2_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4606:1: ( rule__EObjectSection__AttributesAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_2_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4607:1: ( rule__EObjectSection__AttributesAssignment_2_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4607:2: rule__EObjectSection__AttributesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__EObjectSection__AttributesAssignment_2_1_1_in_rule__EObjectSection__Group_2_1__1__Impl9187);
            rule__EObjectSection__AttributesAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_2_1__1__Impl"


    // $ANTLR start "rule__EObjectSection__Group_2_1__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4617:1: rule__EObjectSection__Group_2_1__2 : rule__EObjectSection__Group_2_1__2__Impl rule__EObjectSection__Group_2_1__3 ;
    public final void rule__EObjectSection__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4621:1: ( rule__EObjectSection__Group_2_1__2__Impl rule__EObjectSection__Group_2_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4622:2: rule__EObjectSection__Group_2_1__2__Impl rule__EObjectSection__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_2_1__2__Impl_in_rule__EObjectSection__Group_2_1__29217);
            rule__EObjectSection__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_2_1__3_in_rule__EObjectSection__Group_2_1__29220);
            rule__EObjectSection__Group_2_1__3();

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
    // $ANTLR end "rule__EObjectSection__Group_2_1__2"


    // $ANTLR start "rule__EObjectSection__Group_2_1__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4629:1: rule__EObjectSection__Group_2_1__2__Impl : ( ( rule__EObjectSection__Group_2_1_2__0 )* ) ;
    public final void rule__EObjectSection__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4633:1: ( ( ( rule__EObjectSection__Group_2_1_2__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4634:1: ( ( rule__EObjectSection__Group_2_1_2__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4634:1: ( ( rule__EObjectSection__Group_2_1_2__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4635:1: ( rule__EObjectSection__Group_2_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_2_1_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4636:1: ( rule__EObjectSection__Group_2_1_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==19) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4636:2: rule__EObjectSection__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EObjectSection__Group_2_1_2__0_in_rule__EObjectSection__Group_2_1__2__Impl9247);
            	    rule__EObjectSection__Group_2_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getGroup_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_2_1__2__Impl"


    // $ANTLR start "rule__EObjectSection__Group_2_1__3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4646:1: rule__EObjectSection__Group_2_1__3 : rule__EObjectSection__Group_2_1__3__Impl ;
    public final void rule__EObjectSection__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4650:1: ( rule__EObjectSection__Group_2_1__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4651:2: rule__EObjectSection__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_2_1__3__Impl_in_rule__EObjectSection__Group_2_1__39278);
            rule__EObjectSection__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__EObjectSection__Group_2_1__3"


    // $ANTLR start "rule__EObjectSection__Group_2_1__3__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4657:1: rule__EObjectSection__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__EObjectSection__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4661:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4662:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4662:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4663:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getRightCurlyBracketKeyword_2_1_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__EObjectSection__Group_2_1__3__Impl9306); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getRightCurlyBracketKeyword_2_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_2_1__3__Impl"


    // $ANTLR start "rule__EObjectSection__Group_2_1_2__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4684:1: rule__EObjectSection__Group_2_1_2__0 : rule__EObjectSection__Group_2_1_2__0__Impl rule__EObjectSection__Group_2_1_2__1 ;
    public final void rule__EObjectSection__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4688:1: ( rule__EObjectSection__Group_2_1_2__0__Impl rule__EObjectSection__Group_2_1_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4689:2: rule__EObjectSection__Group_2_1_2__0__Impl rule__EObjectSection__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_2_1_2__0__Impl_in_rule__EObjectSection__Group_2_1_2__09345);
            rule__EObjectSection__Group_2_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_2_1_2__1_in_rule__EObjectSection__Group_2_1_2__09348);
            rule__EObjectSection__Group_2_1_2__1();

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
    // $ANTLR end "rule__EObjectSection__Group_2_1_2__0"


    // $ANTLR start "rule__EObjectSection__Group_2_1_2__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4696:1: rule__EObjectSection__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__EObjectSection__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4700:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4701:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4701:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4702:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getCommaKeyword_2_1_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EObjectSection__Group_2_1_2__0__Impl9376); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getCommaKeyword_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__EObjectSection__Group_2_1_2__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4715:1: rule__EObjectSection__Group_2_1_2__1 : rule__EObjectSection__Group_2_1_2__1__Impl ;
    public final void rule__EObjectSection__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4719:1: ( rule__EObjectSection__Group_2_1_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4720:2: rule__EObjectSection__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_2_1_2__1__Impl_in_rule__EObjectSection__Group_2_1_2__19407);
            rule__EObjectSection__Group_2_1_2__1__Impl();

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
    // $ANTLR end "rule__EObjectSection__Group_2_1_2__1"


    // $ANTLR start "rule__EObjectSection__Group_2_1_2__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4726:1: rule__EObjectSection__Group_2_1_2__1__Impl : ( ( rule__EObjectSection__AttributesAssignment_2_1_2_1 ) ) ;
    public final void rule__EObjectSection__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4730:1: ( ( ( rule__EObjectSection__AttributesAssignment_2_1_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4731:1: ( ( rule__EObjectSection__AttributesAssignment_2_1_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4731:1: ( ( rule__EObjectSection__AttributesAssignment_2_1_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4732:1: ( rule__EObjectSection__AttributesAssignment_2_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_2_1_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4733:1: ( rule__EObjectSection__AttributesAssignment_2_1_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4733:2: rule__EObjectSection__AttributesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__EObjectSection__AttributesAssignment_2_1_2_1_in_rule__EObjectSection__Group_2_1_2__1__Impl9434);
            rule__EObjectSection__AttributesAssignment_2_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_2_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__EMappingAttribute__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4747:1: rule__EMappingAttribute__Group__0 : rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1 ;
    public final void rule__EMappingAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4751:1: ( rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4752:2: rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__0__Impl_in_rule__EMappingAttribute__Group__09468);
            rule__EMappingAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__1_in_rule__EMappingAttribute__Group__09471);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4759:1: rule__EMappingAttribute__Group__0__Impl : ( ( rule__EMappingAttribute__PkAssignment_0 )? ) ;
    public final void rule__EMappingAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4763:1: ( ( ( rule__EMappingAttribute__PkAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4764:1: ( ( rule__EMappingAttribute__PkAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4764:1: ( ( rule__EMappingAttribute__PkAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4765:1: ( rule__EMappingAttribute__PkAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4766:1: ( rule__EMappingAttribute__PkAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4766:2: rule__EMappingAttribute__PkAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__PkAssignment_0_in_rule__EMappingAttribute__Group__0__Impl9498);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4776:1: rule__EMappingAttribute__Group__1 : rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2 ;
    public final void rule__EMappingAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4780:1: ( rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4781:2: rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__1__Impl_in_rule__EMappingAttribute__Group__19529);
            rule__EMappingAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__2_in_rule__EMappingAttribute__Group__19532);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4788:1: rule__EMappingAttribute__Group__1__Impl : ( ( rule__EMappingAttribute__PropertyAssignment_1 ) ) ;
    public final void rule__EMappingAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4792:1: ( ( ( rule__EMappingAttribute__PropertyAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4793:1: ( ( rule__EMappingAttribute__PropertyAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4793:1: ( ( rule__EMappingAttribute__PropertyAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4794:1: ( rule__EMappingAttribute__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPropertyAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4795:1: ( rule__EMappingAttribute__PropertyAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4795:2: rule__EMappingAttribute__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__PropertyAssignment_1_in_rule__EMappingAttribute__Group__1__Impl9559);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4805:1: rule__EMappingAttribute__Group__2 : rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3 ;
    public final void rule__EMappingAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4809:1: ( rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4810:2: rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__2__Impl_in_rule__EMappingAttribute__Group__29589);
            rule__EMappingAttribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__3_in_rule__EMappingAttribute__Group__29592);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4817:1: rule__EMappingAttribute__Group__2__Impl : ( '=>' ) ;
    public final void rule__EMappingAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4821:1: ( ( '=>' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4822:1: ( '=>' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4822:1: ( '=>' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4823:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__EMappingAttribute__Group__2__Impl9620); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4836:1: rule__EMappingAttribute__Group__3 : rule__EMappingAttribute__Group__3__Impl ;
    public final void rule__EMappingAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4840:1: ( rule__EMappingAttribute__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4841:2: rule__EMappingAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__3__Impl_in_rule__EMappingAttribute__Group__39651);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4847:1: rule__EMappingAttribute__Group__3__Impl : ( ( rule__EMappingAttribute__Alternatives_3 ) ) ;
    public final void rule__EMappingAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4851:1: ( ( ( rule__EMappingAttribute__Alternatives_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4852:1: ( ( rule__EMappingAttribute__Alternatives_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4852:1: ( ( rule__EMappingAttribute__Alternatives_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4853:1: ( rule__EMappingAttribute__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4854:1: ( rule__EMappingAttribute__Alternatives_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4854:2: rule__EMappingAttribute__Alternatives_3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Alternatives_3_in_rule__EMappingAttribute__Group__3__Impl9678);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4872:1: rule__EMappingAttribute__Group_3_1__0 : rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1 ;
    public final void rule__EMappingAttribute__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4876:1: ( rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4877:2: rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__0__Impl_in_rule__EMappingAttribute__Group_3_1__09716);
            rule__EMappingAttribute__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__1_in_rule__EMappingAttribute__Group_3_1__09719);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4884:1: rule__EMappingAttribute__Group_3_1__0__Impl : ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4888:1: ( ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4889:1: ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4889:1: ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4890:1: ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getResolvedAssignment_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4891:1: ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4891:2: rule__EMappingAttribute__ResolvedAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__ResolvedAssignment_3_1_0_in_rule__EMappingAttribute__Group_3_1__0__Impl9746);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4901:1: rule__EMappingAttribute__Group_3_1__1 : rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2 ;
    public final void rule__EMappingAttribute__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4905:1: ( rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4906:2: rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__1__Impl_in_rule__EMappingAttribute__Group_3_1__19776);
            rule__EMappingAttribute__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__2_in_rule__EMappingAttribute__Group_3_1__19779);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4913:1: rule__EMappingAttribute__Group_3_1__1__Impl : ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4917:1: ( ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4918:1: ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4918:1: ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4919:1: ( rule__EMappingAttribute__QueryAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getQueryAssignment_3_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4920:1: ( rule__EMappingAttribute__QueryAssignment_3_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4920:2: rule__EMappingAttribute__QueryAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__QueryAssignment_3_1_1_in_rule__EMappingAttribute__Group_3_1__1__Impl9806);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4930:1: rule__EMappingAttribute__Group_3_1__2 : rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3 ;
    public final void rule__EMappingAttribute__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4934:1: ( rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4935:2: rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__2__Impl_in_rule__EMappingAttribute__Group_3_1__29836);
            rule__EMappingAttribute__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__3_in_rule__EMappingAttribute__Group_3_1__29839);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4942:1: rule__EMappingAttribute__Group_3_1__2__Impl : ( '(' ) ;
    public final void rule__EMappingAttribute__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4946:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4947:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4947:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4948:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__EMappingAttribute__Group_3_1__2__Impl9867); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4961:1: rule__EMappingAttribute__Group_3_1__3 : rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4 ;
    public final void rule__EMappingAttribute__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4965:1: ( rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4966:2: rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__3__Impl_in_rule__EMappingAttribute__Group_3_1__39898);
            rule__EMappingAttribute__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__4_in_rule__EMappingAttribute__Group_3_1__39901);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4973:1: rule__EMappingAttribute__Group_3_1__3__Impl : ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4977:1: ( ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4978:1: ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4978:1: ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4979:1: ( rule__EMappingAttribute__ParametersAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getParametersAssignment_3_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4980:1: ( rule__EMappingAttribute__ParametersAssignment_3_1_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4980:2: rule__EMappingAttribute__ParametersAssignment_3_1_3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__ParametersAssignment_3_1_3_in_rule__EMappingAttribute__Group_3_1__3__Impl9928);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4990:1: rule__EMappingAttribute__Group_3_1__4 : rule__EMappingAttribute__Group_3_1__4__Impl ;
    public final void rule__EMappingAttribute__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4994:1: ( rule__EMappingAttribute__Group_3_1__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4995:2: rule__EMappingAttribute__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__4__Impl_in_rule__EMappingAttribute__Group_3_1__49958);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5001:1: rule__EMappingAttribute__Group_3_1__4__Impl : ( ')' ) ;
    public final void rule__EMappingAttribute__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5005:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5006:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5006:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5007:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4()); 
            }
            match(input,32,FOLLOW_32_in_rule__EMappingAttribute__Group_3_1__4__Impl9986); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5030:1: rule__EMappingAttribute__Group_3_2__0 : rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1 ;
    public final void rule__EMappingAttribute__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5034:1: ( rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5035:2: rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__0__Impl_in_rule__EMappingAttribute__Group_3_2__010027);
            rule__EMappingAttribute__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__1_in_rule__EMappingAttribute__Group_3_2__010030);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5042:1: rule__EMappingAttribute__Group_3_2__0__Impl : ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) ) ;
    public final void rule__EMappingAttribute__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5046:1: ( ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5047:1: ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5047:1: ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5048:1: ( rule__EMappingAttribute__MappedAssignment_3_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMappedAssignment_3_2_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5049:1: ( rule__EMappingAttribute__MappedAssignment_3_2_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5049:2: rule__EMappingAttribute__MappedAssignment_3_2_0
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__MappedAssignment_3_2_0_in_rule__EMappingAttribute__Group_3_2__0__Impl10057);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5059:1: rule__EMappingAttribute__Group_3_2__1 : rule__EMappingAttribute__Group_3_2__1__Impl ;
    public final void rule__EMappingAttribute__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5063:1: ( rule__EMappingAttribute__Group_3_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5064:2: rule__EMappingAttribute__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__1__Impl_in_rule__EMappingAttribute__Group_3_2__110087);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5070:1: rule__EMappingAttribute__Group_3_2__1__Impl : ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) ) ;
    public final void rule__EMappingAttribute__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5074:1: ( ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5075:1: ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5075:1: ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5076:1: ( rule__EMappingAttribute__MapAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMapAssignment_3_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5077:1: ( rule__EMappingAttribute__MapAssignment_3_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5077:2: rule__EMappingAttribute__MapAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__MapAssignment_3_2_1_in_rule__EMappingAttribute__Group_3_2__1__Impl10114);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5091:1: rule__EType__Group__0 : rule__EType__Group__0__Impl rule__EType__Group__1 ;
    public final void rule__EType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5095:1: ( rule__EType__Group__0__Impl rule__EType__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5096:2: rule__EType__Group__0__Impl rule__EType__Group__1
            {
            pushFollow(FOLLOW_rule__EType__Group__0__Impl_in_rule__EType__Group__010148);
            rule__EType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__1_in_rule__EType__Group__010151);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5103:1: rule__EType__Group__0__Impl : ( 'etype' ) ;
    public final void rule__EType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5107:1: ( ( 'etype' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5108:1: ( 'etype' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5108:1: ( 'etype' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5109:1: 'etype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getEtypeKeyword_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__EType__Group__0__Impl10179); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5122:1: rule__EType__Group__1 : rule__EType__Group__1__Impl rule__EType__Group__2 ;
    public final void rule__EType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5126:1: ( rule__EType__Group__1__Impl rule__EType__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5127:2: rule__EType__Group__1__Impl rule__EType__Group__2
            {
            pushFollow(FOLLOW_rule__EType__Group__1__Impl_in_rule__EType__Group__110210);
            rule__EType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__2_in_rule__EType__Group__110213);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5134:1: rule__EType__Group__1__Impl : ( ( rule__EType__UrlAssignment_1 ) ) ;
    public final void rule__EType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5138:1: ( ( ( rule__EType__UrlAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5139:1: ( ( rule__EType__UrlAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5139:1: ( ( rule__EType__UrlAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5140:1: ( rule__EType__UrlAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getUrlAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5141:1: ( rule__EType__UrlAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5141:2: rule__EType__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__EType__UrlAssignment_1_in_rule__EType__Group__1__Impl10240);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5151:1: rule__EType__Group__2 : rule__EType__Group__2__Impl rule__EType__Group__3 ;
    public final void rule__EType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5155:1: ( rule__EType__Group__2__Impl rule__EType__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5156:2: rule__EType__Group__2__Impl rule__EType__Group__3
            {
            pushFollow(FOLLOW_rule__EType__Group__2__Impl_in_rule__EType__Group__210270);
            rule__EType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__3_in_rule__EType__Group__210273);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5163:1: rule__EType__Group__2__Impl : ( '#' ) ;
    public final void rule__EType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5167:1: ( ( '#' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5168:1: ( '#' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5168:1: ( '#' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5169:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNumberSignKeyword_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__EType__Group__2__Impl10301); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5182:1: rule__EType__Group__3 : rule__EType__Group__3__Impl ;
    public final void rule__EType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5186:1: ( rule__EType__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5187:2: rule__EType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EType__Group__3__Impl_in_rule__EType__Group__310332);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5193:1: rule__EType__Group__3__Impl : ( ( rule__EType__NameAssignment_3 ) ) ;
    public final void rule__EType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5197:1: ( ( ( rule__EType__NameAssignment_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5198:1: ( ( rule__EType__NameAssignment_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5198:1: ( ( rule__EType__NameAssignment_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5199:1: ( rule__EType__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNameAssignment_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5200:1: ( rule__EType__NameAssignment_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5200:2: rule__EType__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__EType__NameAssignment_3_in_rule__EType__Group__3__Impl10359);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5218:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5222:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5223:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010397);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010400);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5230:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5234:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5235:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5235:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5236:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10427); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5247:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5251:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5252:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110456);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5258:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5262:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5263:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5263:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5264:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5265:1: ( rule__QualifiedName__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==42) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_ID) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5265:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10483);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5279:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5283:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5284:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010518);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010521);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5291:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5295:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5296:1: ( ( '.' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5296:1: ( ( '.' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5297:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5298:1: ( '.' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5299:2: '.'
            {
            match(input,42,FOLLOW_42_in_rule__QualifiedName__Group_1__0__Impl10550); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5310:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5314:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5315:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110582);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5321:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5325:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5326:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5326:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5327:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10609); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5342:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5346:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5347:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__010642);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__010645);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5354:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5358:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5359:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5359:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5360:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl10672);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5371:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5375:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5376:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__110701);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__110704);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5383:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5387:1: ( ( '.' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5388:1: ( '.' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5388:1: ( '.' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5389:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__QualifiedNameWithWildcard__Group__1__Impl10732); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5402:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5406:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5407:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__210763);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5413:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5417:1: ( ( '*' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5418:1: ( '*' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5418:1: ( '*' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5419:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__QualifiedNameWithWildcard__Group__2__Impl10791); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5439:1: rule__EMapping__RootAssignment : ( ( rule__EMapping__RootAlternatives_0 ) ) ;
    public final void rule__EMapping__RootAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5443:1: ( ( ( rule__EMapping__RootAlternatives_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5444:1: ( ( rule__EMapping__RootAlternatives_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5444:1: ( ( rule__EMapping__RootAlternatives_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5445:1: ( rule__EMapping__RootAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAccess().getRootAlternatives_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5446:1: ( rule__EMapping__RootAlternatives_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5446:2: rule__EMapping__RootAlternatives_0
            {
            pushFollow(FOLLOW_rule__EMapping__RootAlternatives_0_in_rule__EMapping__RootAssignment10833);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5455:1: rule__EMappingBundle__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__EMappingBundle__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5459:1: ( ( ruleImport ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5460:1: ( ruleImport )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5460:1: ( ruleImport )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5461:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__EMappingBundle__ImportsAssignment_010866);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5470:1: rule__EMappingBundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EMappingBundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5474:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5475:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5475:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5476:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__NameAssignment_210897); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5485:1: rule__EMappingBundle__EntitiesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EMappingBundle__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5489:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5490:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5490:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5491:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_4_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5492:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5493:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_410932); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5504:1: rule__EMappingBundle__EntitiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__EMappingBundle__EntitiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5508:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5509:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5509:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5510:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_5_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5511:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5512:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_5_110971); if (state.failed) return ;
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


    // $ANTLR start "rule__EMappingBundle__DatabasesAssignment_7_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5523:1: rule__EMappingBundle__DatabasesAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__EMappingBundle__DatabasesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5527:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5528:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5528:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5529:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getDatabasesSTRINGTerminalRuleCall_7_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EMappingBundle__DatabasesAssignment_7_111006); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getDatabasesSTRINGTerminalRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingBundle__DatabasesAssignment_7_1"


    // $ANTLR start "rule__EMappingBundle__DatabasesAssignment_7_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5538:1: rule__EMappingBundle__DatabasesAssignment_7_2_1 : ( RULE_STRING ) ;
    public final void rule__EMappingBundle__DatabasesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5542:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5543:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5543:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5544:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getDatabasesSTRINGTerminalRuleCall_7_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EMappingBundle__DatabasesAssignment_7_2_111037); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingBundleAccess().getDatabasesSTRINGTerminalRuleCall_7_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingBundle__DatabasesAssignment_7_2_1"


    // $ANTLR start "rule__EMappingEntityDef__PackageAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5553:1: rule__EMappingEntityDef__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__EMappingEntityDef__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5557:1: ( ( rulePackageDeclaration ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5558:1: ( rulePackageDeclaration )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5558:1: ( rulePackageDeclaration )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5559:1: rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__EMappingEntityDef__PackageAssignment_011068);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5568:1: rule__EMappingEntityDef__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__EMappingEntityDef__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5572:1: ( ( ruleImport ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5573:1: ( ruleImport )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5573:1: ( ruleImport )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5574:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__EMappingEntityDef__ImportsAssignment_111099);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5583:1: rule__EMappingEntityDef__EntityAssignment_2 : ( ruleEMappingEntity ) ;
    public final void rule__EMappingEntityDef__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5587:1: ( ( ruleEMappingEntity ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5588:1: ( ruleEMappingEntity )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5588:1: ( ruleEMappingEntity )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5589:1: ruleEMappingEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getEntityEMappingEntityParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_rule__EMappingEntityDef__EntityAssignment_211130);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5598:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5602:1: ( ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5603:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5603:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5604:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5605:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5605:2: rule__Import__ImportedNamespaceAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_111161);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5614:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5618:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5619:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5619:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5620:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_111194);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5629:1: rule__EMappingEntity__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__EMappingEntity__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5633:1: ( ( ( 'abstract' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5634:1: ( ( 'abstract' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5634:1: ( ( 'abstract' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5635:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5636:1: ( 'abstract' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5637:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__EMappingEntity__AbstractAssignment_011230); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5652:1: rule__EMappingEntity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EMappingEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5656:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5657:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5657:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5658:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingEntity__NameAssignment_211269); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5667:1: rule__EMappingEntity__ExtensionTypeAssignment_3_0 : ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) ) ;
    public final void rule__EMappingEntity__ExtensionTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5671:1: ( ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5672:1: ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5672:1: ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5673:1: ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getExtensionTypeAlternatives_3_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5674:1: ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5674:2: rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0_in_rule__EMappingEntity__ExtensionTypeAssignment_3_011300);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5683:1: rule__EMappingEntity__ParentAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EMappingEntity__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5687:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5688:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5688:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5689:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityCrossReference_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5690:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5691:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingEntity__ParentAssignment_3_111337);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5702:1: rule__EMappingEntity__EtypeAssignment_5 : ( ruleEType ) ;
    public final void rule__EMappingEntity__EtypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5706:1: ( ( ruleEType ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5707:1: ( ruleEType )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5707:1: ( ruleEType )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5708:1: ruleEType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEtypeETypeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleEType_in_rule__EMappingEntity__EtypeAssignment_511372);
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


    // $ANTLR start "rule__EMappingEntity__AttributesAssignment_6_2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5717:1: rule__EMappingEntity__AttributesAssignment_6_2 : ( ruleEAttribute ) ;
    public final void rule__EMappingEntity__AttributesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5721:1: ( ( ruleEAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5722:1: ( ruleEAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5722:1: ( ruleEAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5723:1: ruleEAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_6_211403);
            ruleEAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__AttributesAssignment_6_2"


    // $ANTLR start "rule__EMappingEntity__AttributesAssignment_6_3_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5732:1: rule__EMappingEntity__AttributesAssignment_6_3_1 : ( ruleEAttribute ) ;
    public final void rule__EMappingEntity__AttributesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5736:1: ( ( ruleEAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5737:1: ( ruleEAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5737:1: ( ruleEAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5738:1: ruleEAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_6_3_111434);
            ruleEAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__AttributesAssignment_6_3_1"


    // $ANTLR start "rule__EMappingEntity__NamedQueriesAssignment_7_2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5747:1: rule__EMappingEntity__NamedQueriesAssignment_7_2 : ( ruleENamedQuery ) ;
    public final void rule__EMappingEntity__NamedQueriesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5751:1: ( ( ruleENamedQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5752:1: ( ruleENamedQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5752:1: ( ruleENamedQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5753:1: ruleENamedQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_2_0()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_7_211465);
            ruleENamedQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__NamedQueriesAssignment_7_2"


    // $ANTLR start "rule__EMappingEntity__NamedQueriesAssignment_7_3_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5762:1: rule__EMappingEntity__NamedQueriesAssignment_7_3_1 : ( ruleENamedQuery ) ;
    public final void rule__EMappingEntity__NamedQueriesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5766:1: ( ( ruleENamedQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5767:1: ( ruleENamedQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5767:1: ( ruleENamedQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5768:1: ruleENamedQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_7_3_111496);
            ruleENamedQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__NamedQueriesAssignment_7_3_1"


    // $ANTLR start "rule__EMappingEntity__TableNameAssignment_9_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5777:1: rule__EMappingEntity__TableNameAssignment_9_1 : ( RULE_ID ) ;
    public final void rule__EMappingEntity__TableNameAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5781:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5782:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5782:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5783:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getTableNameIDTerminalRuleCall_9_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingEntity__TableNameAssignment_9_111527); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getTableNameIDTerminalRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__TableNameAssignment_9_1"


    // $ANTLR start "rule__EMappingEntity__DescriminationColumnAssignment_10_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5792:1: rule__EMappingEntity__DescriminationColumnAssignment_10_1 : ( RULE_ID ) ;
    public final void rule__EMappingEntity__DescriminationColumnAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5796:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5797:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5797:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5798:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getDescriminationColumnIDTerminalRuleCall_10_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingEntity__DescriminationColumnAssignment_10_111558); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingEntityAccess().getDescriminationColumnIDTerminalRuleCall_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingEntity__DescriminationColumnAssignment_10_1"


    // $ANTLR start "rule__EAttribute__PkAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5807:1: rule__EAttribute__PkAssignment_0 : ( ( 'primarykey' ) ) ;
    public final void rule__EAttribute__PkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5811:1: ( ( ( 'primarykey' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5812:1: ( ( 'primarykey' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5812:1: ( ( 'primarykey' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5813:1: ( 'primarykey' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5814:1: ( 'primarykey' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5815:1: 'primarykey'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__EAttribute__PkAssignment_011594); if (state.failed) return ;
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


    // $ANTLR start "rule__EAttribute__NameAssignment_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5830:1: rule__EAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5834:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5835:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5835:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5836:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__NameAssignment_111633); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__NameAssignment_1"


    // $ANTLR start "rule__EAttribute__ColumnNameAssignment_3_0_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5845:1: rule__EAttribute__ColumnNameAssignment_3_0_0 : ( RULE_ID ) ;
    public final void rule__EAttribute__ColumnNameAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5849:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5850:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5850:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5851:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__ColumnNameAssignment_3_0_011664); if (state.failed) return ;
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


    // $ANTLR start "rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5860:1: rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 : ( ruleEValueGenerator ) ;
    public final void rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5864:1: ( ( ruleEValueGenerator ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5865:1: ( ruleEValueGenerator )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5865:1: ( ruleEValueGenerator )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5866:1: ruleEValueGenerator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleEValueGenerator_in_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_211695);
            ruleEValueGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2"


    // $ANTLR start "rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5875:1: rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 : ( ruleEValueGenerator ) ;
    public final void rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5879:1: ( ( ruleEValueGenerator ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5880:1: ( ruleEValueGenerator )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5880:1: ( ruleEValueGenerator )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5881:1: ruleEValueGenerator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEValueGenerator_in_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_111726);
            ruleEValueGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1"


    // $ANTLR start "rule__EAttribute__ResolvedAssignment_3_1_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5890:1: rule__EAttribute__ResolvedAssignment_3_1_0 : ( ( 'resolve' ) ) ;
    public final void rule__EAttribute__ResolvedAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5894:1: ( ( ( 'resolve' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5895:1: ( ( 'resolve' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5895:1: ( ( 'resolve' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5896:1: ( 'resolve' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5897:1: ( 'resolve' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5898:1: 'resolve'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__EAttribute__ResolvedAssignment_3_1_011762); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5913:1: rule__EAttribute__QueryAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EAttribute__QueryAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5917:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5918:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5918:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5919:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5920:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5921:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EAttribute__QueryAssignment_3_1_111805);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5932:1: rule__EAttribute__ParametersAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__EAttribute__ParametersAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5936:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5937:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5937:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5938:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__ParametersAssignment_3_1_311840); if (state.failed) return ;
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


    // $ANTLR start "rule__EAttribute__OppositeAssignment_3_1_5_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5947:1: rule__EAttribute__OppositeAssignment_3_1_5_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EAttribute__OppositeAssignment_3_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5951:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5952:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5952:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5953:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getOppositeEAttributeCrossReference_3_1_5_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5954:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5955:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getOppositeEAttributeQualifiedNameParserRuleCall_3_1_5_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EAttribute__OppositeAssignment_3_1_5_011875);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getOppositeEAttributeQualifiedNameParserRuleCall_3_1_5_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getOppositeEAttributeCrossReference_3_1_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__OppositeAssignment_3_1_5_0"


    // $ANTLR start "rule__EAttribute__RelationTableAssignment_3_1_5_2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5966:1: rule__EAttribute__RelationTableAssignment_3_1_5_2 : ( RULE_ID ) ;
    public final void rule__EAttribute__RelationTableAssignment_3_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5970:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5971:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5971:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5972:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getRelationTableIDTerminalRuleCall_3_1_5_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__RelationTableAssignment_3_1_5_211910); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getRelationTableIDTerminalRuleCall_3_1_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__RelationTableAssignment_3_1_5_2"


    // $ANTLR start "rule__EValueGenerator__DbTypeAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5981:1: rule__EValueGenerator__DbTypeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EValueGenerator__DbTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5985:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5986:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5986:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5987:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getDbTypeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EValueGenerator__DbTypeAssignment_011941); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getDbTypeSTRINGTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EValueGenerator__DbTypeAssignment_0"


    // $ANTLR start "rule__EValueGenerator__AutokeyAssignment_1_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5996:1: rule__EValueGenerator__AutokeyAssignment_1_0 : ( ( 'autokey' ) ) ;
    public final void rule__EValueGenerator__AutokeyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6000:1: ( ( ( 'autokey' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6001:1: ( ( 'autokey' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6001:1: ( ( 'autokey' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6002:1: ( 'autokey' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getAutokeyAutokeyKeyword_1_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6003:1: ( 'autokey' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6004:1: 'autokey'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getAutokeyAutokeyKeyword_1_0_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__EValueGenerator__AutokeyAssignment_1_011977); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getAutokeyAutokeyKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getAutokeyAutokeyKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EValueGenerator__AutokeyAssignment_1_0"


    // $ANTLR start "rule__EValueGenerator__QueryAssignment_1_1_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6019:1: rule__EValueGenerator__QueryAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__EValueGenerator__QueryAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6023:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6024:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6024:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6025:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getQuerySTRINGTerminalRuleCall_1_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EValueGenerator__QueryAssignment_1_1_112016); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getQuerySTRINGTerminalRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EValueGenerator__QueryAssignment_1_1_1"


    // $ANTLR start "rule__EValueGenerator__SequenceAssignment_1_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6034:1: rule__EValueGenerator__SequenceAssignment_1_2_1 : ( RULE_STRING ) ;
    public final void rule__EValueGenerator__SequenceAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6038:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6039:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6039:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6040:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getSequenceSTRINGTerminalRuleCall_1_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EValueGenerator__SequenceAssignment_1_2_112047); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEValueGeneratorAccess().getSequenceSTRINGTerminalRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EValueGenerator__SequenceAssignment_1_2_1"


    // $ANTLR start "rule__ENamedQuery__ReturnTypeAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6049:1: rule__ENamedQuery__ReturnTypeAssignment_0 : ( ruleReturnType ) ;
    public final void rule__ENamedQuery__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6053:1: ( ( ruleReturnType ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6054:1: ( ruleReturnType )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6054:1: ( ruleReturnType )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6055:1: ruleReturnType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getReturnTypeReturnTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleReturnType_in_rule__ENamedQuery__ReturnTypeAssignment_012078);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6064:1: rule__ENamedQuery__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ENamedQuery__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6068:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6069:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6069:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6070:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ENamedQuery__NameAssignment_112109); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6079:1: rule__ENamedQuery__ParametersAssignment_2_1 : ( ruleEParameter ) ;
    public final void rule__ENamedQuery__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6083:1: ( ( ruleEParameter ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6084:1: ( ruleEParameter )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6084:1: ( ruleEParameter )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6085:1: ruleEParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_rule__ENamedQuery__ParametersAssignment_2_112140);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6094:1: rule__ENamedQuery__QueriesAssignment_4 : ( ruleEQuery ) ;
    public final void rule__ENamedQuery__QueriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6098:1: ( ( ruleEQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6099:1: ( ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6099:1: ( ruleEQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6100:1: ruleEQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_412171);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6109:1: rule__ENamedQuery__QueriesAssignment_5_1 : ( ruleEQuery ) ;
    public final void rule__ENamedQuery__QueriesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6113:1: ( ( ruleEQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6114:1: ( ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6114:1: ( ruleEQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6115:1: ruleEQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_5_112202);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6124:1: rule__EParameter__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__EParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6128:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6129:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6129:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6130:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getTypeIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EParameter__TypeAssignment_012233); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6139:1: rule__EParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6143:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6144:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6144:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6145:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EParameter__NameAssignment_112264); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6154:1: rule__EQuery__DbTypeAssignment_0 : ( ( rule__EQuery__DbTypeAlternatives_0_0 ) ) ;
    public final void rule__EQuery__DbTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6158:1: ( ( ( rule__EQuery__DbTypeAlternatives_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6159:1: ( ( rule__EQuery__DbTypeAlternatives_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6159:1: ( ( rule__EQuery__DbTypeAlternatives_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6160:1: ( rule__EQuery__DbTypeAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getDbTypeAlternatives_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6161:1: ( rule__EQuery__DbTypeAlternatives_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6161:2: rule__EQuery__DbTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__EQuery__DbTypeAlternatives_0_0_in_rule__EQuery__DbTypeAssignment_012295);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6170:1: rule__EQuery__MappingAssignment_1 : ( ruleEObjectSection ) ;
    public final void rule__EQuery__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6174:1: ( ( ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6175:1: ( ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6175:1: ( ruleEObjectSection )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6176:1: ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_rule__EQuery__MappingAssignment_112328);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6185:1: rule__EQuery__FromAssignment_2_0_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__FromAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6189:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6190:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6190:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6191:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFromSTRINGTerminalRuleCall_2_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__FromAssignment_2_0_112359); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6200:1: rule__EQuery__WhereAssignment_2_0_2_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__WhereAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6204:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6205:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6205:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6206:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWhereSTRINGTerminalRuleCall_2_0_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__WhereAssignment_2_0_2_112390); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6215:1: rule__EQuery__GroupByAssignment_2_0_3_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__GroupByAssignment_2_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6219:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6220:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6220:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6221:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroupBySTRINGTerminalRuleCall_2_0_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__GroupByAssignment_2_0_3_112421); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6230:1: rule__EQuery__OrderbyAssignment_2_0_4_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__OrderbyAssignment_2_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6234:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6235:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6235:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6236:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getOrderbySTRINGTerminalRuleCall_2_0_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__OrderbyAssignment_2_0_4_112452); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6245:1: rule__EQuery__AllAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__AllAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6249:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6250:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6250:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6251:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getAllSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__AllAssignment_2_112483); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6260:1: rule__EObjectSection__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EObjectSection__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6264:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6265:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6265:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6266:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6267:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6268:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EObjectSection__EntityAssignment_012518); if (state.failed) return ;
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


    // $ANTLR start "rule__EObjectSection__DescriminatedTypesAssignment_1_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6279:1: rule__EObjectSection__DescriminatedTypesAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__EObjectSection__DescriminatedTypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6283:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6284:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6284:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6285:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6286:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6287:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EObjectSection__DescriminatedTypesAssignment_1_112557); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__DescriminatedTypesAssignment_1_1"


    // $ANTLR start "rule__EObjectSection__DescriminatedTypesAssignment_1_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6298:1: rule__EObjectSection__DescriminatedTypesAssignment_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EObjectSection__DescriminatedTypesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6302:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6303:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6303:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6304:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_2_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6305:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6306:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityIDTerminalRuleCall_1_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EObjectSection__DescriminatedTypesAssignment_1_2_112596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityIDTerminalRuleCall_1_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getDescriminatedTypesEMappingEntityCrossReference_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__DescriminatedTypesAssignment_1_2_1"


    // $ANTLR start "rule__EObjectSection__PrefixAssignment_2_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6317:1: rule__EObjectSection__PrefixAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__EObjectSection__PrefixAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6321:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6322:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6322:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6323:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getPrefixIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EObjectSection__PrefixAssignment_2_012631); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getPrefixIDTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__PrefixAssignment_2_0"


    // $ANTLR start "rule__EObjectSection__AttributesAssignment_2_1_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6332:1: rule__EObjectSection__AttributesAssignment_2_1_1 : ( ruleEMappingAttribute ) ;
    public final void rule__EObjectSection__AttributesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6336:1: ( ( ruleEMappingAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6337:1: ( ruleEMappingAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6337:1: ( ruleEMappingAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6338:1: ruleEMappingAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_2_1_112662);
            ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__AttributesAssignment_2_1_1"


    // $ANTLR start "rule__EObjectSection__AttributesAssignment_2_1_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6347:1: rule__EObjectSection__AttributesAssignment_2_1_2_1 : ( ruleEMappingAttribute ) ;
    public final void rule__EObjectSection__AttributesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6351:1: ( ( ruleEMappingAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6352:1: ( ruleEMappingAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6352:1: ( ruleEMappingAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6353:1: ruleEMappingAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_2_1_2_112693);
            ruleEMappingAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_2_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectSection__AttributesAssignment_2_1_2_1"


    // $ANTLR start "rule__EMappingAttribute__PkAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6362:1: rule__EMappingAttribute__PkAssignment_0 : ( ( 'primarykey' ) ) ;
    public final void rule__EMappingAttribute__PkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6366:1: ( ( ( 'primarykey' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6367:1: ( ( 'primarykey' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6367:1: ( ( 'primarykey' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6368:1: ( 'primarykey' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6369:1: ( 'primarykey' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6370:1: 'primarykey'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__EMappingAttribute__PkAssignment_012729); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6385:1: rule__EMappingAttribute__PropertyAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__EMappingAttribute__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6389:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6390:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6390:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6391:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__PropertyAssignment_112768);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6400:1: rule__EMappingAttribute__ColumnNameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__EMappingAttribute__ColumnNameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6404:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6405:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6405:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6406:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingAttribute__ColumnNameAssignment_3_012799); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6415:1: rule__EMappingAttribute__ResolvedAssignment_3_1_0 : ( ( 'resolve' ) ) ;
    public final void rule__EMappingAttribute__ResolvedAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6419:1: ( ( ( 'resolve' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6420:1: ( ( 'resolve' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6420:1: ( ( 'resolve' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6421:1: ( 'resolve' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6422:1: ( 'resolve' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6423:1: 'resolve'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__EMappingAttribute__ResolvedAssignment_3_1_012835); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6438:1: rule__EMappingAttribute__QueryAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EMappingAttribute__QueryAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6442:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6443:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6443:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6444:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6445:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6446:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__QueryAssignment_3_1_112878);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6457:1: rule__EMappingAttribute__ParametersAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__EMappingAttribute__ParametersAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6461:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6462:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6462:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6463:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingAttribute__ParametersAssignment_3_1_312913); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6472:1: rule__EMappingAttribute__MappedAssignment_3_2_0 : ( ( 'map' ) ) ;
    public final void rule__EMappingAttribute__MappedAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6476:1: ( ( ( 'map' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6477:1: ( ( 'map' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6477:1: ( ( 'map' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6478:1: ( 'map' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMappedMapKeyword_3_2_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6479:1: ( 'map' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6480:1: 'map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMappedMapKeyword_3_2_0_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__EMappingAttribute__MappedAssignment_3_2_012949); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6495:1: rule__EMappingAttribute__MapAssignment_3_2_1 : ( ruleEObjectSection ) ;
    public final void rule__EMappingAttribute__MapAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6499:1: ( ( ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6500:1: ( ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6500:1: ( ruleEObjectSection )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6501:1: ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_rule__EMappingAttribute__MapAssignment_3_2_112988);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6510:1: rule__EType__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EType__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6514:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6515:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6515:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6516:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EType__UrlAssignment_113019); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6525:1: rule__EType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__EType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6529:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6530:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6530:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:6531:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EType__NameAssignment_313050); if (state.failed) return ;
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
        "\1\5\1\54\1\53\1\uffff\1\54\1\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\1\uffff\1\1";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\4\uffff\1\3\2\uffff\1\3\21\uffff\1\2\1\uffff\1\3",
            "\1\4\45\uffff\1\5",
            "",
            "\1\3\4\uffff\1\3\2\uffff\1\3\21\uffff\1\2\1\uffff\1\3",
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
            return "550:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) );";
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
    public static final BitSet FOLLOW_ruleEValueGenerator_in_entryRuleEValueGenerator487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEValueGenerator494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group__0_in_ruleEValueGenerator520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_entryRuleENamedQuery547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENamedQuery554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__0_in_ruleENamedQuery580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_entryRuleEParameter607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEParameter614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__Group__0_in_ruleEParameter640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_entryRuleEQuery667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQuery674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__0_in_ruleEQuery700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_entryRuleEObjectSection727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEObjectSection734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__0_in_ruleEObjectSection760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_entryRuleEMappingAttribute787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMappingAttribute794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__0_in_ruleEMappingAttribute820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_entryRuleEType847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEType854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__0_in_ruleEType880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnType__Alternatives_in_ruleReturnType1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingBundle_in_rule__EMapping__RootAlternatives_01072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntityDef_in_rule__EMapping__RootAlternatives_01089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAlternatives_1_01138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__0_in_rule__EAttribute__Alternatives_31225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__0_in_rule__EAttribute__Alternatives_31243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__AutokeyAssignment_1_0_in_rule__EValueGenerator__Alternatives_11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_1__0_in_rule__EValueGenerator__Alternatives_11294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_2__0_in_rule__EValueGenerator__Alternatives_11312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EQuery__DbTypeAlternatives_0_01346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__DbTypeAlternatives_0_01365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__0_in_rule__EQuery__Alternatives_21397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__AllAssignment_2_1_in_rule__EQuery__Alternatives_21415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__ColumnNameAssignment_3_0_in_rule__EMappingAttribute__Alternatives_31448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__0_in_rule__EMappingAttribute__Alternatives_31466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__0_in_rule__EMappingAttribute__Alternatives_31484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ReturnType__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ReturnType__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__0__Impl_in_rule__EMappingBundle__Group__01572 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__1_in_rule__EMappingBundle__Group__01575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__ImportsAssignment_0_in_rule__EMappingBundle__Group__0__Impl1602 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__1__Impl_in_rule__EMappingBundle__Group__11633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__2_in_rule__EMappingBundle__Group__11636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EMappingBundle__Group__1__Impl1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__2__Impl_in_rule__EMappingBundle__Group__21695 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__3_in_rule__EMappingBundle__Group__21698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__NameAssignment_2_in_rule__EMappingBundle__Group__2__Impl1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__3__Impl_in_rule__EMappingBundle__Group__31755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__4_in_rule__EMappingBundle__Group__31758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingBundle__Group__3__Impl1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__4__Impl_in_rule__EMappingBundle__Group__41817 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__5_in_rule__EMappingBundle__Group__41820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__EntitiesAssignment_4_in_rule__EMappingBundle__Group__4__Impl1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__5__Impl_in_rule__EMappingBundle__Group__51877 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__6_in_rule__EMappingBundle__Group__51880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__0_in_rule__EMappingBundle__Group__5__Impl1907 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__6__Impl_in_rule__EMappingBundle__Group__61938 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__7_in_rule__EMappingBundle__Group__61941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingBundle__Group__6__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__7__Impl_in_rule__EMappingBundle__Group__72000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_7__0_in_rule__EMappingBundle__Group__7__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__0__Impl_in_rule__EMappingBundle__Group_5__02074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__1_in_rule__EMappingBundle__Group_5__02077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EMappingBundle__Group_5__0__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__1__Impl_in_rule__EMappingBundle__Group_5__12136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__EntitiesAssignment_5_1_in_rule__EMappingBundle__Group_5__1__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_7__0__Impl_in_rule__EMappingBundle__Group_7__02197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_7__1_in_rule__EMappingBundle__Group_7__02200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EMappingBundle__Group_7__0__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_7__1__Impl_in_rule__EMappingBundle__Group_7__12259 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_7__2_in_rule__EMappingBundle__Group_7__12262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__DatabasesAssignment_7_1_in_rule__EMappingBundle__Group_7__1__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_7__2__Impl_in_rule__EMappingBundle__Group_7__22319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_7_2__0_in_rule__EMappingBundle__Group_7__2__Impl2346 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_7_2__0__Impl_in_rule__EMappingBundle__Group_7_2__02383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_7_2__1_in_rule__EMappingBundle__Group_7_2__02386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EMappingBundle__Group_7_2__0__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_7_2__1__Impl_in_rule__EMappingBundle__Group_7_2__12445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__DatabasesAssignment_7_2_1_in_rule__EMappingBundle__Group_7_2__1__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__0__Impl_in_rule__EMappingEntityDef__Group__02506 = new BitSet(new long[]{0x0000100001200000L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__1_in_rule__EMappingEntityDef__Group__02509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__PackageAssignment_0_in_rule__EMappingEntityDef__Group__0__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__1__Impl_in_rule__EMappingEntityDef__Group__12566 = new BitSet(new long[]{0x0000100001200000L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__2_in_rule__EMappingEntityDef__Group__12569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__ImportsAssignment_1_in_rule__EMappingEntityDef__Group__1__Impl2596 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__2__Impl_in_rule__EMappingEntityDef__Group__22627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__EntityAssignment_2_in_rule__EMappingEntityDef__Group__2__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Import__Group__0__Impl2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02813 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group__0__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12875 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PackageDeclaration__Group__2__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__0__Impl_in_rule__EMappingEntity__Group__03000 = new BitSet(new long[]{0x0000100001200000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__1_in_rule__EMappingEntity__Group__03003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AbstractAssignment_0_in_rule__EMappingEntity__Group__0__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__1__Impl_in_rule__EMappingEntity__Group__13061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__2_in_rule__EMappingEntity__Group__13064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EMappingEntity__Group__1__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__2__Impl_in_rule__EMappingEntity__Group__23123 = new BitSet(new long[]{0x0000000000021800L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__3_in_rule__EMappingEntity__Group__23126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NameAssignment_2_in_rule__EMappingEntity__Group__2__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__3__Impl_in_rule__EMappingEntity__Group__33183 = new BitSet(new long[]{0x0000000000021800L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__4_in_rule__EMappingEntity__Group__33186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__0_in_rule__EMappingEntity__Group__3__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__4__Impl_in_rule__EMappingEntity__Group__43244 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__5_in_rule__EMappingEntity__Group__43247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group__4__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__5__Impl_in_rule__EMappingEntity__Group__53306 = new BitSet(new long[]{0x0000000006040000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__6_in_rule__EMappingEntity__Group__53309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__EtypeAssignment_5_in_rule__EMappingEntity__Group__5__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__6__Impl_in_rule__EMappingEntity__Group__63366 = new BitSet(new long[]{0x0000000006040000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__7_in_rule__EMappingEntity__Group__63369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__0_in_rule__EMappingEntity__Group__6__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__7__Impl_in_rule__EMappingEntity__Group__73427 = new BitSet(new long[]{0x0000000006040000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__8_in_rule__EMappingEntity__Group__73430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__0_in_rule__EMappingEntity__Group__7__Impl3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__8__Impl_in_rule__EMappingEntity__Group__83488 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__9_in_rule__EMappingEntity__Group__83491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingEntity__Group__8__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__9__Impl_in_rule__EMappingEntity__Group__93550 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__10_in_rule__EMappingEntity__Group__93553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__0_in_rule__EMappingEntity__Group__9__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__10__Impl_in_rule__EMappingEntity__Group__103611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_10__0_in_rule__EMappingEntity__Group__10__Impl3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__0__Impl_in_rule__EMappingEntity__Group_3__03691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__1_in_rule__EMappingEntity__Group_3__03694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ExtensionTypeAssignment_3_0_in_rule__EMappingEntity__Group_3__0__Impl3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__1__Impl_in_rule__EMappingEntity__Group_3__13751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ParentAssignment_3_1_in_rule__EMappingEntity__Group_3__1__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__0__Impl_in_rule__EMappingEntity__Group_6__03812 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__1_in_rule__EMappingEntity__Group_6__03815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EMappingEntity__Group_6__0__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__1__Impl_in_rule__EMappingEntity__Group_6__13874 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__2_in_rule__EMappingEntity__Group_6__13877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group_6__1__Impl3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__2__Impl_in_rule__EMappingEntity__Group_6__23936 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__3_in_rule__EMappingEntity__Group_6__23939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AttributesAssignment_6_2_in_rule__EMappingEntity__Group_6__2__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__3__Impl_in_rule__EMappingEntity__Group_6__33996 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__4_in_rule__EMappingEntity__Group_6__33999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6_3__0_in_rule__EMappingEntity__Group_6__3__Impl4026 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__4__Impl_in_rule__EMappingEntity__Group_6__44057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingEntity__Group_6__4__Impl4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6_3__0__Impl_in_rule__EMappingEntity__Group_6_3__04126 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6_3__1_in_rule__EMappingEntity__Group_6_3__04129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EMappingEntity__Group_6_3__0__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6_3__1__Impl_in_rule__EMappingEntity__Group_6_3__14188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AttributesAssignment_6_3_1_in_rule__EMappingEntity__Group_6_3__1__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__0__Impl_in_rule__EMappingEntity__Group_7__04249 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__1_in_rule__EMappingEntity__Group_7__04252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EMappingEntity__Group_7__0__Impl4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__1__Impl_in_rule__EMappingEntity__Group_7__14311 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__2_in_rule__EMappingEntity__Group_7__14314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group_7__1__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__2__Impl_in_rule__EMappingEntity__Group_7__24373 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__3_in_rule__EMappingEntity__Group_7__24376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_7_2_in_rule__EMappingEntity__Group_7__2__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__3__Impl_in_rule__EMappingEntity__Group_7__34433 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__4_in_rule__EMappingEntity__Group_7__34436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7_3__0_in_rule__EMappingEntity__Group_7__3__Impl4463 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__4__Impl_in_rule__EMappingEntity__Group_7__44494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingEntity__Group_7__4__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7_3__0__Impl_in_rule__EMappingEntity__Group_7_3__04563 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7_3__1_in_rule__EMappingEntity__Group_7_3__04566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EMappingEntity__Group_7_3__0__Impl4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7_3__1__Impl_in_rule__EMappingEntity__Group_7_3__14625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_7_3_1_in_rule__EMappingEntity__Group_7_3__1__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__0__Impl_in_rule__EMappingEntity__Group_9__04686 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__1_in_rule__EMappingEntity__Group_9__04689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EMappingEntity__Group_9__0__Impl4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__1__Impl_in_rule__EMappingEntity__Group_9__14748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__TableNameAssignment_9_1_in_rule__EMappingEntity__Group_9__1__Impl4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_10__0__Impl_in_rule__EMappingEntity__Group_10__04809 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_10__1_in_rule__EMappingEntity__Group_10__04812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EMappingEntity__Group_10__0__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_10__1__Impl_in_rule__EMappingEntity__Group_10__14871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__DescriminationColumnAssignment_10_1_in_rule__EMappingEntity__Group_10__1__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__0__Impl_in_rule__EAttribute__Group__04932 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__1_in_rule__EAttribute__Group__04935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__PkAssignment_0_in_rule__EAttribute__Group__0__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__1__Impl_in_rule__EAttribute__Group__14993 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__2_in_rule__EAttribute__Group__14996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__NameAssignment_1_in_rule__EAttribute__Group__1__Impl5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__2__Impl_in_rule__EAttribute__Group__25053 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__3_in_rule__EAttribute__Group__25056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EAttribute__Group__2__Impl5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__3__Impl_in_rule__EAttribute__Group__35115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Alternatives_3_in_rule__EAttribute__Group__3__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__0__Impl_in_rule__EAttribute__Group_3_0__05180 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__1_in_rule__EAttribute__Group_3_0__05183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ColumnNameAssignment_3_0_0_in_rule__EAttribute__Group_3_0__0__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__1__Impl_in_rule__EAttribute__Group_3_0__15240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__0_in_rule__EAttribute__Group_3_0__1__Impl5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__0__Impl_in_rule__EAttribute__Group_3_0_1__05302 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__1_in_rule__EAttribute__Group_3_0_1__05305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EAttribute__Group_3_0_1__0__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__1__Impl_in_rule__EAttribute__Group_3_0_1__15364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__2_in_rule__EAttribute__Group_3_0_1__15367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EAttribute__Group_3_0_1__1__Impl5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__2__Impl_in_rule__EAttribute__Group_3_0_1__25426 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__3_in_rule__EAttribute__Group_3_0_1__25429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2_in_rule__EAttribute__Group_3_0_1__2__Impl5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__3__Impl_in_rule__EAttribute__Group_3_0_1__35486 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__4_in_rule__EAttribute__Group_3_0_1__35489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3__0_in_rule__EAttribute__Group_3_0_1__3__Impl5516 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__4__Impl_in_rule__EAttribute__Group_3_0_1__45547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EAttribute__Group_3_0_1__4__Impl5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3__0__Impl_in_rule__EAttribute__Group_3_0_1_3__05616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3__1_in_rule__EAttribute__Group_3_0_1_3__05619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EAttribute__Group_3_0_1_3__0__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3__1__Impl_in_rule__EAttribute__Group_3_0_1_3__15678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1_in_rule__EAttribute__Group_3_0_1_3__1__Impl5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__0__Impl_in_rule__EAttribute__Group_3_1__05739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__1_in_rule__EAttribute__Group_3_1__05742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ResolvedAssignment_3_1_0_in_rule__EAttribute__Group_3_1__0__Impl5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__1__Impl_in_rule__EAttribute__Group_3_1__15799 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__2_in_rule__EAttribute__Group_3_1__15802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__QueryAssignment_3_1_1_in_rule__EAttribute__Group_3_1__1__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__2__Impl_in_rule__EAttribute__Group_3_1__25859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__3_in_rule__EAttribute__Group_3_1__25862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EAttribute__Group_3_1__2__Impl5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__3__Impl_in_rule__EAttribute__Group_3_1__35921 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__4_in_rule__EAttribute__Group_3_1__35924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ParametersAssignment_3_1_3_in_rule__EAttribute__Group_3_1__3__Impl5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__4__Impl_in_rule__EAttribute__Group_3_1__45981 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__5_in_rule__EAttribute__Group_3_1__45984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EAttribute__Group_3_1__4__Impl6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__5__Impl_in_rule__EAttribute__Group_3_1__56043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1_5__0_in_rule__EAttribute__Group_3_1__5__Impl6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1_5__0__Impl_in_rule__EAttribute__Group_3_1_5__06113 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1_5__1_in_rule__EAttribute__Group_3_1_5__06116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__OppositeAssignment_3_1_5_0_in_rule__EAttribute__Group_3_1_5__0__Impl6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1_5__1__Impl_in_rule__EAttribute__Group_3_1_5__16173 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1_5__2_in_rule__EAttribute__Group_3_1_5__16176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EAttribute__Group_3_1_5__1__Impl6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1_5__2__Impl_in_rule__EAttribute__Group_3_1_5__26235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__RelationTableAssignment_3_1_5_2_in_rule__EAttribute__Group_3_1_5__2__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group__0__Impl_in_rule__EValueGenerator__Group__06298 = new BitSet(new long[]{0x0000800C00000000L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group__1_in_rule__EValueGenerator__Group__06301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__DbTypeAssignment_0_in_rule__EValueGenerator__Group__0__Impl6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group__1__Impl_in_rule__EValueGenerator__Group__16358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Alternatives_1_in_rule__EValueGenerator__Group__1__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_1__0__Impl_in_rule__EValueGenerator__Group_1_1__06419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_1__1_in_rule__EValueGenerator__Group_1_1__06422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EValueGenerator__Group_1_1__0__Impl6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_1__1__Impl_in_rule__EValueGenerator__Group_1_1__16481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__QueryAssignment_1_1_1_in_rule__EValueGenerator__Group_1_1__1__Impl6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_2__0__Impl_in_rule__EValueGenerator__Group_1_2__06542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_2__1_in_rule__EValueGenerator__Group_1_2__06545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EValueGenerator__Group_1_2__0__Impl6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_2__1__Impl_in_rule__EValueGenerator__Group_1_2__16604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__SequenceAssignment_1_2_1_in_rule__EValueGenerator__Group_1_2__1__Impl6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__0__Impl_in_rule__ENamedQuery__Group__06665 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__1_in_rule__ENamedQuery__Group__06668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__ReturnTypeAssignment_0_in_rule__ENamedQuery__Group__0__Impl6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__1__Impl_in_rule__ENamedQuery__Group__16726 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__2_in_rule__ENamedQuery__Group__16729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__NameAssignment_1_in_rule__ENamedQuery__Group__1__Impl6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__2__Impl_in_rule__ENamedQuery__Group__26786 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__3_in_rule__ENamedQuery__Group__26789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__0_in_rule__ENamedQuery__Group__2__Impl6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__3__Impl_in_rule__ENamedQuery__Group__36847 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__4_in_rule__ENamedQuery__Group__36850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ENamedQuery__Group__3__Impl6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__4__Impl_in_rule__ENamedQuery__Group__46909 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__5_in_rule__ENamedQuery__Group__46912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__QueriesAssignment_4_in_rule__ENamedQuery__Group__4__Impl6939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__5__Impl_in_rule__ENamedQuery__Group__56969 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__6_in_rule__ENamedQuery__Group__56972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__0_in_rule__ENamedQuery__Group__5__Impl6999 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__6__Impl_in_rule__ENamedQuery__Group__67030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ENamedQuery__Group__6__Impl7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__0__Impl_in_rule__ENamedQuery__Group_2__07103 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__1_in_rule__ENamedQuery__Group_2__07106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ENamedQuery__Group_2__0__Impl7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__1__Impl_in_rule__ENamedQuery__Group_2__17165 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__2_in_rule__ENamedQuery__Group_2__17168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__ParametersAssignment_2_1_in_rule__ENamedQuery__Group_2__1__Impl7195 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__2__Impl_in_rule__ENamedQuery__Group_2__27226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ENamedQuery__Group_2__2__Impl7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__0__Impl_in_rule__ENamedQuery__Group_5__07291 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__1_in_rule__ENamedQuery__Group_5__07294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ENamedQuery__Group_5__0__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__1__Impl_in_rule__ENamedQuery__Group_5__17353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__QueriesAssignment_5_1_in_rule__ENamedQuery__Group_5__1__Impl7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__Group__0__Impl_in_rule__EParameter__Group__07414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EParameter__Group__1_in_rule__EParameter__Group__07417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__TypeAssignment_0_in_rule__EParameter__Group__0__Impl7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__Group__1__Impl_in_rule__EParameter__Group__17474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__NameAssignment_1_in_rule__EParameter__Group__1__Impl7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__0__Impl_in_rule__EQuery__Group__07535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EQuery__Group__1_in_rule__EQuery__Group__07538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__DbTypeAssignment_0_in_rule__EQuery__Group__0__Impl7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__1__Impl_in_rule__EQuery__Group__17595 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group__2_in_rule__EQuery__Group__17598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__MappingAssignment_1_in_rule__EQuery__Group__1__Impl7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__2__Impl_in_rule__EQuery__Group__27655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Alternatives_2_in_rule__EQuery__Group__2__Impl7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__0__Impl_in_rule__EQuery__Group_2_0__07718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__1_in_rule__EQuery__Group_2_0__07721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EQuery__Group_2_0__0__Impl7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__1__Impl_in_rule__EQuery__Group_2_0__17780 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__2_in_rule__EQuery__Group_2_0__17783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__FromAssignment_2_0_1_in_rule__EQuery__Group_2_0__1__Impl7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__2__Impl_in_rule__EQuery__Group_2_0__27840 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__3_in_rule__EQuery__Group_2_0__27843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__0_in_rule__EQuery__Group_2_0__2__Impl7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__3__Impl_in_rule__EQuery__Group_2_0__37901 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__4_in_rule__EQuery__Group_2_0__37904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__0_in_rule__EQuery__Group_2_0__3__Impl7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__4__Impl_in_rule__EQuery__Group_2_0__47962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__0_in_rule__EQuery__Group_2_0__4__Impl7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__0__Impl_in_rule__EQuery__Group_2_0_2__08030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__1_in_rule__EQuery__Group_2_0_2__08033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EQuery__Group_2_0_2__0__Impl8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__1__Impl_in_rule__EQuery__Group_2_0_2__18092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__WhereAssignment_2_0_2_1_in_rule__EQuery__Group_2_0_2__1__Impl8119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__0__Impl_in_rule__EQuery__Group_2_0_3__08153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__1_in_rule__EQuery__Group_2_0_3__08156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EQuery__Group_2_0_3__0__Impl8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__1__Impl_in_rule__EQuery__Group_2_0_3__18215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__GroupByAssignment_2_0_3_1_in_rule__EQuery__Group_2_0_3__1__Impl8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__0__Impl_in_rule__EQuery__Group_2_0_4__08276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__1_in_rule__EQuery__Group_2_0_4__08279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EQuery__Group_2_0_4__0__Impl8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__1__Impl_in_rule__EQuery__Group_2_0_4__18338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__OrderbyAssignment_2_0_4_1_in_rule__EQuery__Group_2_0_4__1__Impl8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__0__Impl_in_rule__EObjectSection__Group__08399 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__1_in_rule__EObjectSection__Group__08402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__EntityAssignment_0_in_rule__EObjectSection__Group__0__Impl8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__1__Impl_in_rule__EObjectSection__Group__18459 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__2_in_rule__EObjectSection__Group__18462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__0_in_rule__EObjectSection__Group__1__Impl8489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__2__Impl_in_rule__EObjectSection__Group__28520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2__0_in_rule__EObjectSection__Group__2__Impl8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__0__Impl_in_rule__EObjectSection__Group_1__08584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__1_in_rule__EObjectSection__Group_1__08587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EObjectSection__Group_1__0__Impl8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__1__Impl_in_rule__EObjectSection__Group_1__18646 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__2_in_rule__EObjectSection__Group_1__18649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__DescriminatedTypesAssignment_1_1_in_rule__EObjectSection__Group_1__1__Impl8676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__2__Impl_in_rule__EObjectSection__Group_1__28706 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__3_in_rule__EObjectSection__Group_1__28709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_2__0_in_rule__EObjectSection__Group_1__2__Impl8738 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_2__0_in_rule__EObjectSection__Group_1__2__Impl8750 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__3__Impl_in_rule__EObjectSection__Group_1__38783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EObjectSection__Group_1__3__Impl8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_2__0__Impl_in_rule__EObjectSection__Group_1_2__08850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_2__1_in_rule__EObjectSection__Group_1_2__08853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EObjectSection__Group_1_2__0__Impl8881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_2__1__Impl_in_rule__EObjectSection__Group_1_2__18912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__DescriminatedTypesAssignment_1_2_1_in_rule__EObjectSection__Group_1_2__1__Impl8939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2__0__Impl_in_rule__EObjectSection__Group_2__08973 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2__1_in_rule__EObjectSection__Group_2__08976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__PrefixAssignment_2_0_in_rule__EObjectSection__Group_2__0__Impl9003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2__1__Impl_in_rule__EObjectSection__Group_2__19033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1__0_in_rule__EObjectSection__Group_2__1__Impl9060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1__0__Impl_in_rule__EObjectSection__Group_2_1__09095 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1__1_in_rule__EObjectSection__Group_2_1__09098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EObjectSection__Group_2_1__0__Impl9126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1__1__Impl_in_rule__EObjectSection__Group_2_1__19157 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1__2_in_rule__EObjectSection__Group_2_1__19160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__AttributesAssignment_2_1_1_in_rule__EObjectSection__Group_2_1__1__Impl9187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1__2__Impl_in_rule__EObjectSection__Group_2_1__29217 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1__3_in_rule__EObjectSection__Group_2_1__29220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1_2__0_in_rule__EObjectSection__Group_2_1__2__Impl9247 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1__3__Impl_in_rule__EObjectSection__Group_2_1__39278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EObjectSection__Group_2_1__3__Impl9306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1_2__0__Impl_in_rule__EObjectSection__Group_2_1_2__09345 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1_2__1_in_rule__EObjectSection__Group_2_1_2__09348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EObjectSection__Group_2_1_2__0__Impl9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_2_1_2__1__Impl_in_rule__EObjectSection__Group_2_1_2__19407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__AttributesAssignment_2_1_2_1_in_rule__EObjectSection__Group_2_1_2__1__Impl9434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__0__Impl_in_rule__EMappingAttribute__Group__09468 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__1_in_rule__EMappingAttribute__Group__09471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__PkAssignment_0_in_rule__EMappingAttribute__Group__0__Impl9498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__1__Impl_in_rule__EMappingAttribute__Group__19529 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__2_in_rule__EMappingAttribute__Group__19532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__PropertyAssignment_1_in_rule__EMappingAttribute__Group__1__Impl9559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__2__Impl_in_rule__EMappingAttribute__Group__29589 = new BitSet(new long[]{0x0001400000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__3_in_rule__EMappingAttribute__Group__29592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EMappingAttribute__Group__2__Impl9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__3__Impl_in_rule__EMappingAttribute__Group__39651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Alternatives_3_in_rule__EMappingAttribute__Group__3__Impl9678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__0__Impl_in_rule__EMappingAttribute__Group_3_1__09716 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__1_in_rule__EMappingAttribute__Group_3_1__09719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__ResolvedAssignment_3_1_0_in_rule__EMappingAttribute__Group_3_1__0__Impl9746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__1__Impl_in_rule__EMappingAttribute__Group_3_1__19776 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__2_in_rule__EMappingAttribute__Group_3_1__19779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__QueryAssignment_3_1_1_in_rule__EMappingAttribute__Group_3_1__1__Impl9806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__2__Impl_in_rule__EMappingAttribute__Group_3_1__29836 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__3_in_rule__EMappingAttribute__Group_3_1__29839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EMappingAttribute__Group_3_1__2__Impl9867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__3__Impl_in_rule__EMappingAttribute__Group_3_1__39898 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__4_in_rule__EMappingAttribute__Group_3_1__39901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__ParametersAssignment_3_1_3_in_rule__EMappingAttribute__Group_3_1__3__Impl9928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__4__Impl_in_rule__EMappingAttribute__Group_3_1__49958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EMappingAttribute__Group_3_1__4__Impl9986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__0__Impl_in_rule__EMappingAttribute__Group_3_2__010027 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__1_in_rule__EMappingAttribute__Group_3_2__010030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__MappedAssignment_3_2_0_in_rule__EMappingAttribute__Group_3_2__0__Impl10057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__1__Impl_in_rule__EMappingAttribute__Group_3_2__110087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__MapAssignment_3_2_1_in_rule__EMappingAttribute__Group_3_2__1__Impl10114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__0__Impl_in_rule__EType__Group__010148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EType__Group__1_in_rule__EType__Group__010151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EType__Group__0__Impl10179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__1__Impl_in_rule__EType__Group__110210 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EType__Group__2_in_rule__EType__Group__110213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__UrlAssignment_1_in_rule__EType__Group__1__Impl10240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__2__Impl_in_rule__EType__Group__210270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EType__Group__3_in_rule__EType__Group__210273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EType__Group__2__Impl10301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__3__Impl_in_rule__EType__Group__310332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__NameAssignment_3_in_rule__EType__Group__3__Impl10359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010397 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10483 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010518 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__QualifiedName__Group_1__0__Impl10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__010642 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__010645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__110701 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__110704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__QualifiedNameWithWildcard__Group__1__Impl10732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__210763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__QualifiedNameWithWildcard__Group__2__Impl10791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMapping__RootAlternatives_0_in_rule__EMapping__RootAssignment10833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__EMappingBundle__ImportsAssignment_010866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__NameAssignment_210897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_410932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_5_110971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EMappingBundle__DatabasesAssignment_7_111006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EMappingBundle__DatabasesAssignment_7_2_111037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__EMappingEntityDef__PackageAssignment_011068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__EMappingEntityDef__ImportsAssignment_111099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_rule__EMappingEntityDef__EntityAssignment_211130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_111161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_111194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EMappingEntity__AbstractAssignment_011230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingEntity__NameAssignment_211269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0_in_rule__EMappingEntity__ExtensionTypeAssignment_3_011300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingEntity__ParentAssignment_3_111337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_rule__EMappingEntity__EtypeAssignment_511372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_6_211403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_6_3_111434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_7_211465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_7_3_111496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingEntity__TableNameAssignment_9_111527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingEntity__DescriminationColumnAssignment_10_111558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EAttribute__PkAssignment_011594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__NameAssignment_111633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__ColumnNameAssignment_3_0_011664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_211695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_111726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EAttribute__ResolvedAssignment_3_1_011762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EAttribute__QueryAssignment_3_1_111805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__ParametersAssignment_3_1_311840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EAttribute__OppositeAssignment_3_1_5_011875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__RelationTableAssignment_3_1_5_211910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EValueGenerator__DbTypeAssignment_011941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EValueGenerator__AutokeyAssignment_1_011977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EValueGenerator__QueryAssignment_1_1_112016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EValueGenerator__SequenceAssignment_1_2_112047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_rule__ENamedQuery__ReturnTypeAssignment_012078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ENamedQuery__NameAssignment_112109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_rule__ENamedQuery__ParametersAssignment_2_112140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_412171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_5_112202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EParameter__TypeAssignment_012233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EParameter__NameAssignment_112264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__DbTypeAlternatives_0_0_in_rule__EQuery__DbTypeAssignment_012295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_rule__EQuery__MappingAssignment_112328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__FromAssignment_2_0_112359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__WhereAssignment_2_0_2_112390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__GroupByAssignment_2_0_3_112421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__OrderbyAssignment_2_0_4_112452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__AllAssignment_2_112483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EObjectSection__EntityAssignment_012518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EObjectSection__DescriminatedTypesAssignment_1_112557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EObjectSection__DescriminatedTypesAssignment_1_2_112596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EObjectSection__PrefixAssignment_2_012631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_2_1_112662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_2_1_2_112693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EMappingAttribute__PkAssignment_012729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__PropertyAssignment_112768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingAttribute__ColumnNameAssignment_3_012799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EMappingAttribute__ResolvedAssignment_3_1_012835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__QueryAssignment_3_1_112878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingAttribute__ParametersAssignment_3_1_312913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EMappingAttribute__MappedAssignment_3_2_012949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_rule__EMappingAttribute__MapAssignment_3_2_112988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EType__UrlAssignment_113019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EType__NameAssignment_313050 = new BitSet(new long[]{0x0000000000000002L});

}