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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'extends'", "'derived'", "'default'", "'list'", "'single'", "'bundle'", "'{'", "'}'", "','", "'import'", "'package'", "';'", "'entity'", "'attributes'", "'queries'", "'as'", "'=>'", "'generatedby'", "'('", "')'", "'query'", "'seqnext'", "'FROM'", "'WHERE'", "'GROUP BY'", "'ORDER BY'", "'etype'", "'#'", "'.'", "'*'", "'abstract'", "'primarykey'", "'resolve'", "'autokey'", "'map'"
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
            else if ( (LA4_0==43) ) {
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
            case 44:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 32:
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
            case 43:
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

                if ( (LA10_0==20) ) {
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:926:1: rule__EMappingBundle__Group__6 : rule__EMappingBundle__Group__6__Impl ;
    public final void rule__EMappingBundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:930:1: ( rule__EMappingBundle__Group__6__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:931:2: rule__EMappingBundle__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__6__Impl_in_rule__EMappingBundle__Group__61938);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:937:1: rule__EMappingBundle__Group__6__Impl : ( '}' ) ;
    public final void rule__EMappingBundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:941:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:942:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:942:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:943:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingBundle__Group__6__Impl1966); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:970:1: rule__EMappingBundle__Group_5__0 : rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1 ;
    public final void rule__EMappingBundle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:974:1: ( rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:975:2: rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__0__Impl_in_rule__EMappingBundle__Group_5__02011);
            rule__EMappingBundle__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__1_in_rule__EMappingBundle__Group_5__02014);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:982:1: rule__EMappingBundle__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EMappingBundle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:986:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:987:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:987:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:988:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getCommaKeyword_5_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EMappingBundle__Group_5__0__Impl2042); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1001:1: rule__EMappingBundle__Group_5__1 : rule__EMappingBundle__Group_5__1__Impl ;
    public final void rule__EMappingBundle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1005:1: ( rule__EMappingBundle__Group_5__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1006:2: rule__EMappingBundle__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__1__Impl_in_rule__EMappingBundle__Group_5__12073);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1012:1: rule__EMappingBundle__Group_5__1__Impl : ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) ) ;
    public final void rule__EMappingBundle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1016:1: ( ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1017:1: ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1017:1: ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1018:1: ( rule__EMappingBundle__EntitiesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_5_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1019:1: ( rule__EMappingBundle__EntitiesAssignment_5_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1019:2: rule__EMappingBundle__EntitiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__EntitiesAssignment_5_1_in_rule__EMappingBundle__Group_5__1__Impl2100);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1033:1: rule__EMappingEntityDef__Group__0 : rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1 ;
    public final void rule__EMappingEntityDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1037:1: ( rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1038:2: rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__0__Impl_in_rule__EMappingEntityDef__Group__02134);
            rule__EMappingEntityDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__1_in_rule__EMappingEntityDef__Group__02137);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1045:1: rule__EMappingEntityDef__Group__0__Impl : ( ( rule__EMappingEntityDef__PackageAssignment_0 ) ) ;
    public final void rule__EMappingEntityDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1049:1: ( ( ( rule__EMappingEntityDef__PackageAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1050:1: ( ( rule__EMappingEntityDef__PackageAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1050:1: ( ( rule__EMappingEntityDef__PackageAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1051:1: ( rule__EMappingEntityDef__PackageAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getPackageAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1052:1: ( rule__EMappingEntityDef__PackageAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1052:2: rule__EMappingEntityDef__PackageAssignment_0
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__PackageAssignment_0_in_rule__EMappingEntityDef__Group__0__Impl2164);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1062:1: rule__EMappingEntityDef__Group__1 : rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2 ;
    public final void rule__EMappingEntityDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1066:1: ( rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1067:2: rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__1__Impl_in_rule__EMappingEntityDef__Group__12194);
            rule__EMappingEntityDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__2_in_rule__EMappingEntityDef__Group__12197);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1074:1: rule__EMappingEntityDef__Group__1__Impl : ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* ) ;
    public final void rule__EMappingEntityDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1078:1: ( ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1079:1: ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1079:1: ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1080:1: ( rule__EMappingEntityDef__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getImportsAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1081:1: ( rule__EMappingEntityDef__ImportsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1081:2: rule__EMappingEntityDef__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntityDef__ImportsAssignment_1_in_rule__EMappingEntityDef__Group__1__Impl2224);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1091:1: rule__EMappingEntityDef__Group__2 : rule__EMappingEntityDef__Group__2__Impl ;
    public final void rule__EMappingEntityDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1095:1: ( rule__EMappingEntityDef__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1096:2: rule__EMappingEntityDef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__2__Impl_in_rule__EMappingEntityDef__Group__22255);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1102:1: rule__EMappingEntityDef__Group__2__Impl : ( ( rule__EMappingEntityDef__EntityAssignment_2 ) ) ;
    public final void rule__EMappingEntityDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1106:1: ( ( ( rule__EMappingEntityDef__EntityAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1107:1: ( ( rule__EMappingEntityDef__EntityAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1107:1: ( ( rule__EMappingEntityDef__EntityAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1108:1: ( rule__EMappingEntityDef__EntityAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getEntityAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1109:1: ( rule__EMappingEntityDef__EntityAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1109:2: rule__EMappingEntityDef__EntityAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__EntityAssignment_2_in_rule__EMappingEntityDef__Group__2__Impl2282);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1125:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1129:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1130:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02318);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02321);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1137:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1141:1: ( ( 'import' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1142:1: ( 'import' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1142:1: ( 'import' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1143:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Import__Group__0__Impl2349); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1156:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1160:1: ( rule__Import__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1161:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12380);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1167:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1171:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1172:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1172:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1173:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1174:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1174:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2407);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1188:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1192:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1193:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02441);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02444);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1200:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1204:1: ( ( 'package' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1205:1: ( 'package' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1205:1: ( 'package' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1206:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__PackageDeclaration__Group__0__Impl2472); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1219:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1223:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1224:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12503);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12506);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1231:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1235:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1236:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1236:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1237:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1238:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1238:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2533);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1248:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1252:1: ( rule__PackageDeclaration__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1253:2: rule__PackageDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22563);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1259:1: rule__PackageDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1263:1: ( ( ';' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1264:1: ( ';' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1264:1: ( ';' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1265:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group__2__Impl2591); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1284:1: rule__EMappingEntity__Group__0 : rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1 ;
    public final void rule__EMappingEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1288:1: ( rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1289:2: rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__0__Impl_in_rule__EMappingEntity__Group__02628);
            rule__EMappingEntity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__1_in_rule__EMappingEntity__Group__02631);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1296:1: rule__EMappingEntity__Group__0__Impl : ( ( rule__EMappingEntity__AbstractAssignment_0 )? ) ;
    public final void rule__EMappingEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1300:1: ( ( ( rule__EMappingEntity__AbstractAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1301:1: ( ( rule__EMappingEntity__AbstractAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1301:1: ( ( rule__EMappingEntity__AbstractAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1302:1: ( rule__EMappingEntity__AbstractAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1303:1: ( rule__EMappingEntity__AbstractAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1303:2: rule__EMappingEntity__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__AbstractAssignment_0_in_rule__EMappingEntity__Group__0__Impl2658);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1313:1: rule__EMappingEntity__Group__1 : rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2 ;
    public final void rule__EMappingEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1317:1: ( rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1318:2: rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__1__Impl_in_rule__EMappingEntity__Group__12689);
            rule__EMappingEntity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__2_in_rule__EMappingEntity__Group__12692);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1325:1: rule__EMappingEntity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__EMappingEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1329:1: ( ( 'entity' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1330:1: ( 'entity' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1330:1: ( 'entity' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1331:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEntityKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__EMappingEntity__Group__1__Impl2720); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1344:1: rule__EMappingEntity__Group__2 : rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3 ;
    public final void rule__EMappingEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1348:1: ( rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1349:2: rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__2__Impl_in_rule__EMappingEntity__Group__22751);
            rule__EMappingEntity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__3_in_rule__EMappingEntity__Group__22754);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1356:1: rule__EMappingEntity__Group__2__Impl : ( ( rule__EMappingEntity__NameAssignment_2 ) ) ;
    public final void rule__EMappingEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1360:1: ( ( ( rule__EMappingEntity__NameAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1361:1: ( ( rule__EMappingEntity__NameAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1361:1: ( ( rule__EMappingEntity__NameAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1362:1: ( rule__EMappingEntity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1363:1: ( rule__EMappingEntity__NameAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1363:2: rule__EMappingEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NameAssignment_2_in_rule__EMappingEntity__Group__2__Impl2781);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1373:1: rule__EMappingEntity__Group__3 : rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4 ;
    public final void rule__EMappingEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1377:1: ( rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1378:2: rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__3__Impl_in_rule__EMappingEntity__Group__32811);
            rule__EMappingEntity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__4_in_rule__EMappingEntity__Group__32814);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1385:1: rule__EMappingEntity__Group__3__Impl : ( ( rule__EMappingEntity__Group_3__0 )? ) ;
    public final void rule__EMappingEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1389:1: ( ( ( rule__EMappingEntity__Group_3__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1390:1: ( ( rule__EMappingEntity__Group_3__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1390:1: ( ( rule__EMappingEntity__Group_3__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1391:1: ( rule__EMappingEntity__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1392:1: ( rule__EMappingEntity__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=12)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1392:2: rule__EMappingEntity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_3__0_in_rule__EMappingEntity__Group__3__Impl2841);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1402:1: rule__EMappingEntity__Group__4 : rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5 ;
    public final void rule__EMappingEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1406:1: ( rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1407:2: rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__4__Impl_in_rule__EMappingEntity__Group__42872);
            rule__EMappingEntity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__5_in_rule__EMappingEntity__Group__42875);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1414:1: rule__EMappingEntity__Group__4__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1418:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1419:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1419:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1420:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group__4__Impl2903); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1433:1: rule__EMappingEntity__Group__5 : rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6 ;
    public final void rule__EMappingEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1437:1: ( rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1438:2: rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__5__Impl_in_rule__EMappingEntity__Group__52934);
            rule__EMappingEntity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__6_in_rule__EMappingEntity__Group__52937);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1445:1: rule__EMappingEntity__Group__5__Impl : ( ( rule__EMappingEntity__EtypeAssignment_5 ) ) ;
    public final void rule__EMappingEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1449:1: ( ( ( rule__EMappingEntity__EtypeAssignment_5 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1450:1: ( ( rule__EMappingEntity__EtypeAssignment_5 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1450:1: ( ( rule__EMappingEntity__EtypeAssignment_5 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1451:1: ( rule__EMappingEntity__EtypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEtypeAssignment_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1452:1: ( rule__EMappingEntity__EtypeAssignment_5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1452:2: rule__EMappingEntity__EtypeAssignment_5
            {
            pushFollow(FOLLOW_rule__EMappingEntity__EtypeAssignment_5_in_rule__EMappingEntity__Group__5__Impl2964);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1462:1: rule__EMappingEntity__Group__6 : rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7 ;
    public final void rule__EMappingEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1466:1: ( rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1467:2: rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__6__Impl_in_rule__EMappingEntity__Group__62994);
            rule__EMappingEntity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__7_in_rule__EMappingEntity__Group__62997);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1474:1: rule__EMappingEntity__Group__6__Impl : ( ( rule__EMappingEntity__Group_6__0 )? ) ;
    public final void rule__EMappingEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1478:1: ( ( ( rule__EMappingEntity__Group_6__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1479:1: ( ( rule__EMappingEntity__Group_6__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1479:1: ( ( rule__EMappingEntity__Group_6__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1480:1: ( rule__EMappingEntity__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_6()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1481:1: ( rule__EMappingEntity__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1481:2: rule__EMappingEntity__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_6__0_in_rule__EMappingEntity__Group__6__Impl3024);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1491:1: rule__EMappingEntity__Group__7 : rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8 ;
    public final void rule__EMappingEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1495:1: ( rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1496:2: rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__7__Impl_in_rule__EMappingEntity__Group__73055);
            rule__EMappingEntity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__8_in_rule__EMappingEntity__Group__73058);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1503:1: rule__EMappingEntity__Group__7__Impl : ( ( rule__EMappingEntity__Group_7__0 )? ) ;
    public final void rule__EMappingEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1507:1: ( ( ( rule__EMappingEntity__Group_7__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1508:1: ( ( rule__EMappingEntity__Group_7__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1508:1: ( ( rule__EMappingEntity__Group_7__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1509:1: ( rule__EMappingEntity__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_7()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1510:1: ( rule__EMappingEntity__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1510:2: rule__EMappingEntity__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_7__0_in_rule__EMappingEntity__Group__7__Impl3085);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1520:1: rule__EMappingEntity__Group__8 : rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9 ;
    public final void rule__EMappingEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1524:1: ( rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1525:2: rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__8__Impl_in_rule__EMappingEntity__Group__83116);
            rule__EMappingEntity__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__9_in_rule__EMappingEntity__Group__83119);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1532:1: rule__EMappingEntity__Group__8__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1536:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1537:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1537:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1538:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingEntity__Group__8__Impl3147); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1551:1: rule__EMappingEntity__Group__9 : rule__EMappingEntity__Group__9__Impl ;
    public final void rule__EMappingEntity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1555:1: ( rule__EMappingEntity__Group__9__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1556:2: rule__EMappingEntity__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__9__Impl_in_rule__EMappingEntity__Group__93178);
            rule__EMappingEntity__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1562:1: rule__EMappingEntity__Group__9__Impl : ( ( rule__EMappingEntity__Group_9__0 )? ) ;
    public final void rule__EMappingEntity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1566:1: ( ( ( rule__EMappingEntity__Group_9__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1567:1: ( ( rule__EMappingEntity__Group_9__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1567:1: ( ( rule__EMappingEntity__Group_9__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1568:1: ( rule__EMappingEntity__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_9()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1569:1: ( rule__EMappingEntity__Group_9__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1569:2: rule__EMappingEntity__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_9__0_in_rule__EMappingEntity__Group__9__Impl3205);
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


    // $ANTLR start "rule__EMappingEntity__Group_3__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1599:1: rule__EMappingEntity__Group_3__0 : rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1 ;
    public final void rule__EMappingEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1603:1: ( rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1604:2: rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__0__Impl_in_rule__EMappingEntity__Group_3__03256);
            rule__EMappingEntity__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__1_in_rule__EMappingEntity__Group_3__03259);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1611:1: rule__EMappingEntity__Group_3__0__Impl : ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) ) ;
    public final void rule__EMappingEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1615:1: ( ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1616:1: ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1616:1: ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1617:1: ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getExtensionTypeAssignment_3_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1618:1: ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1618:2: rule__EMappingEntity__ExtensionTypeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ExtensionTypeAssignment_3_0_in_rule__EMappingEntity__Group_3__0__Impl3286);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1628:1: rule__EMappingEntity__Group_3__1 : rule__EMappingEntity__Group_3__1__Impl ;
    public final void rule__EMappingEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1632:1: ( rule__EMappingEntity__Group_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1633:2: rule__EMappingEntity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__1__Impl_in_rule__EMappingEntity__Group_3__13316);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1639:1: rule__EMappingEntity__Group_3__1__Impl : ( ( rule__EMappingEntity__ParentAssignment_3_1 ) ) ;
    public final void rule__EMappingEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1643:1: ( ( ( rule__EMappingEntity__ParentAssignment_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1644:1: ( ( rule__EMappingEntity__ParentAssignment_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1644:1: ( ( rule__EMappingEntity__ParentAssignment_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1645:1: ( rule__EMappingEntity__ParentAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentAssignment_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1646:1: ( rule__EMappingEntity__ParentAssignment_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1646:2: rule__EMappingEntity__ParentAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ParentAssignment_3_1_in_rule__EMappingEntity__Group_3__1__Impl3343);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1660:1: rule__EMappingEntity__Group_6__0 : rule__EMappingEntity__Group_6__0__Impl rule__EMappingEntity__Group_6__1 ;
    public final void rule__EMappingEntity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1664:1: ( rule__EMappingEntity__Group_6__0__Impl rule__EMappingEntity__Group_6__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1665:2: rule__EMappingEntity__Group_6__0__Impl rule__EMappingEntity__Group_6__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__0__Impl_in_rule__EMappingEntity__Group_6__03377);
            rule__EMappingEntity__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__1_in_rule__EMappingEntity__Group_6__03380);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1672:1: rule__EMappingEntity__Group_6__0__Impl : ( 'attributes' ) ;
    public final void rule__EMappingEntity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1676:1: ( ( 'attributes' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1677:1: ( 'attributes' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1677:1: ( 'attributes' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1678:1: 'attributes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__EMappingEntity__Group_6__0__Impl3408); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1691:1: rule__EMappingEntity__Group_6__1 : rule__EMappingEntity__Group_6__1__Impl rule__EMappingEntity__Group_6__2 ;
    public final void rule__EMappingEntity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1695:1: ( rule__EMappingEntity__Group_6__1__Impl rule__EMappingEntity__Group_6__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1696:2: rule__EMappingEntity__Group_6__1__Impl rule__EMappingEntity__Group_6__2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__1__Impl_in_rule__EMappingEntity__Group_6__13439);
            rule__EMappingEntity__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__2_in_rule__EMappingEntity__Group_6__13442);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1703:1: rule__EMappingEntity__Group_6__1__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1707:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1708:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1708:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1709:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_6_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group_6__1__Impl3470); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1722:1: rule__EMappingEntity__Group_6__2 : rule__EMappingEntity__Group_6__2__Impl rule__EMappingEntity__Group_6__3 ;
    public final void rule__EMappingEntity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1726:1: ( rule__EMappingEntity__Group_6__2__Impl rule__EMappingEntity__Group_6__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1727:2: rule__EMappingEntity__Group_6__2__Impl rule__EMappingEntity__Group_6__3
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__2__Impl_in_rule__EMappingEntity__Group_6__23501);
            rule__EMappingEntity__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__3_in_rule__EMappingEntity__Group_6__23504);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1734:1: rule__EMappingEntity__Group_6__2__Impl : ( ( rule__EMappingEntity__AttributesAssignment_6_2 ) ) ;
    public final void rule__EMappingEntity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1738:1: ( ( ( rule__EMappingEntity__AttributesAssignment_6_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1739:1: ( ( rule__EMappingEntity__AttributesAssignment_6_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1739:1: ( ( rule__EMappingEntity__AttributesAssignment_6_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1740:1: ( rule__EMappingEntity__AttributesAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_6_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1741:1: ( rule__EMappingEntity__AttributesAssignment_6_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1741:2: rule__EMappingEntity__AttributesAssignment_6_2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__AttributesAssignment_6_2_in_rule__EMappingEntity__Group_6__2__Impl3531);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1751:1: rule__EMappingEntity__Group_6__3 : rule__EMappingEntity__Group_6__3__Impl rule__EMappingEntity__Group_6__4 ;
    public final void rule__EMappingEntity__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1755:1: ( rule__EMappingEntity__Group_6__3__Impl rule__EMappingEntity__Group_6__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1756:2: rule__EMappingEntity__Group_6__3__Impl rule__EMappingEntity__Group_6__4
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__3__Impl_in_rule__EMappingEntity__Group_6__33561);
            rule__EMappingEntity__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__4_in_rule__EMappingEntity__Group_6__33564);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1763:1: rule__EMappingEntity__Group_6__3__Impl : ( ( rule__EMappingEntity__Group_6_3__0 )* ) ;
    public final void rule__EMappingEntity__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1767:1: ( ( ( rule__EMappingEntity__Group_6_3__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1768:1: ( ( rule__EMappingEntity__Group_6_3__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1768:1: ( ( rule__EMappingEntity__Group_6_3__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1769:1: ( rule__EMappingEntity__Group_6_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_6_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1770:1: ( rule__EMappingEntity__Group_6_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1770:2: rule__EMappingEntity__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntity__Group_6_3__0_in_rule__EMappingEntity__Group_6__3__Impl3591);
            	    rule__EMappingEntity__Group_6_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1780:1: rule__EMappingEntity__Group_6__4 : rule__EMappingEntity__Group_6__4__Impl ;
    public final void rule__EMappingEntity__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1784:1: ( rule__EMappingEntity__Group_6__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1785:2: rule__EMappingEntity__Group_6__4__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6__4__Impl_in_rule__EMappingEntity__Group_6__43622);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1791:1: rule__EMappingEntity__Group_6__4__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1795:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1796:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1796:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1797:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_6_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingEntity__Group_6__4__Impl3650); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1820:1: rule__EMappingEntity__Group_6_3__0 : rule__EMappingEntity__Group_6_3__0__Impl rule__EMappingEntity__Group_6_3__1 ;
    public final void rule__EMappingEntity__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1824:1: ( rule__EMappingEntity__Group_6_3__0__Impl rule__EMappingEntity__Group_6_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1825:2: rule__EMappingEntity__Group_6_3__0__Impl rule__EMappingEntity__Group_6_3__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6_3__0__Impl_in_rule__EMappingEntity__Group_6_3__03691);
            rule__EMappingEntity__Group_6_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6_3__1_in_rule__EMappingEntity__Group_6_3__03694);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1832:1: rule__EMappingEntity__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__EMappingEntity__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1836:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1837:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1837:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1838:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getCommaKeyword_6_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EMappingEntity__Group_6_3__0__Impl3722); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1851:1: rule__EMappingEntity__Group_6_3__1 : rule__EMappingEntity__Group_6_3__1__Impl ;
    public final void rule__EMappingEntity__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1855:1: ( rule__EMappingEntity__Group_6_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1856:2: rule__EMappingEntity__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_6_3__1__Impl_in_rule__EMappingEntity__Group_6_3__13753);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1862:1: rule__EMappingEntity__Group_6_3__1__Impl : ( ( rule__EMappingEntity__AttributesAssignment_6_3_1 ) ) ;
    public final void rule__EMappingEntity__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1866:1: ( ( ( rule__EMappingEntity__AttributesAssignment_6_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1867:1: ( ( rule__EMappingEntity__AttributesAssignment_6_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1867:1: ( ( rule__EMappingEntity__AttributesAssignment_6_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1868:1: ( rule__EMappingEntity__AttributesAssignment_6_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_6_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1869:1: ( rule__EMappingEntity__AttributesAssignment_6_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1869:2: rule__EMappingEntity__AttributesAssignment_6_3_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__AttributesAssignment_6_3_1_in_rule__EMappingEntity__Group_6_3__1__Impl3780);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1883:1: rule__EMappingEntity__Group_7__0 : rule__EMappingEntity__Group_7__0__Impl rule__EMappingEntity__Group_7__1 ;
    public final void rule__EMappingEntity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1887:1: ( rule__EMappingEntity__Group_7__0__Impl rule__EMappingEntity__Group_7__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1888:2: rule__EMappingEntity__Group_7__0__Impl rule__EMappingEntity__Group_7__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__0__Impl_in_rule__EMappingEntity__Group_7__03814);
            rule__EMappingEntity__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__1_in_rule__EMappingEntity__Group_7__03817);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1895:1: rule__EMappingEntity__Group_7__0__Impl : ( 'queries' ) ;
    public final void rule__EMappingEntity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1899:1: ( ( 'queries' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1900:1: ( 'queries' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1900:1: ( 'queries' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1901:1: 'queries'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getQueriesKeyword_7_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__EMappingEntity__Group_7__0__Impl3845); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1914:1: rule__EMappingEntity__Group_7__1 : rule__EMappingEntity__Group_7__1__Impl rule__EMappingEntity__Group_7__2 ;
    public final void rule__EMappingEntity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1918:1: ( rule__EMappingEntity__Group_7__1__Impl rule__EMappingEntity__Group_7__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1919:2: rule__EMappingEntity__Group_7__1__Impl rule__EMappingEntity__Group_7__2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__1__Impl_in_rule__EMappingEntity__Group_7__13876);
            rule__EMappingEntity__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__2_in_rule__EMappingEntity__Group_7__13879);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1926:1: rule__EMappingEntity__Group_7__1__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1930:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1931:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1931:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1932:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group_7__1__Impl3907); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1945:1: rule__EMappingEntity__Group_7__2 : rule__EMappingEntity__Group_7__2__Impl rule__EMappingEntity__Group_7__3 ;
    public final void rule__EMappingEntity__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1949:1: ( rule__EMappingEntity__Group_7__2__Impl rule__EMappingEntity__Group_7__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1950:2: rule__EMappingEntity__Group_7__2__Impl rule__EMappingEntity__Group_7__3
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__2__Impl_in_rule__EMappingEntity__Group_7__23938);
            rule__EMappingEntity__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__3_in_rule__EMappingEntity__Group_7__23941);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1957:1: rule__EMappingEntity__Group_7__2__Impl : ( ( rule__EMappingEntity__NamedQueriesAssignment_7_2 ) ) ;
    public final void rule__EMappingEntity__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1961:1: ( ( ( rule__EMappingEntity__NamedQueriesAssignment_7_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1962:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_7_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1962:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_7_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1963:1: ( rule__EMappingEntity__NamedQueriesAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_7_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1964:1: ( rule__EMappingEntity__NamedQueriesAssignment_7_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1964:2: rule__EMappingEntity__NamedQueriesAssignment_7_2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_7_2_in_rule__EMappingEntity__Group_7__2__Impl3968);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1974:1: rule__EMappingEntity__Group_7__3 : rule__EMappingEntity__Group_7__3__Impl rule__EMappingEntity__Group_7__4 ;
    public final void rule__EMappingEntity__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1978:1: ( rule__EMappingEntity__Group_7__3__Impl rule__EMappingEntity__Group_7__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1979:2: rule__EMappingEntity__Group_7__3__Impl rule__EMappingEntity__Group_7__4
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__3__Impl_in_rule__EMappingEntity__Group_7__33998);
            rule__EMappingEntity__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__4_in_rule__EMappingEntity__Group_7__34001);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1986:1: rule__EMappingEntity__Group_7__3__Impl : ( ( rule__EMappingEntity__Group_7_3__0 )* ) ;
    public final void rule__EMappingEntity__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1990:1: ( ( ( rule__EMappingEntity__Group_7_3__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1991:1: ( ( rule__EMappingEntity__Group_7_3__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1991:1: ( ( rule__EMappingEntity__Group_7_3__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1992:1: ( rule__EMappingEntity__Group_7_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_7_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1993:1: ( rule__EMappingEntity__Group_7_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1993:2: rule__EMappingEntity__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntity__Group_7_3__0_in_rule__EMappingEntity__Group_7__3__Impl4028);
            	    rule__EMappingEntity__Group_7_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2003:1: rule__EMappingEntity__Group_7__4 : rule__EMappingEntity__Group_7__4__Impl ;
    public final void rule__EMappingEntity__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2007:1: ( rule__EMappingEntity__Group_7__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2008:2: rule__EMappingEntity__Group_7__4__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7__4__Impl_in_rule__EMappingEntity__Group_7__44059);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2014:1: rule__EMappingEntity__Group_7__4__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2018:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2019:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2019:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2020:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_7_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__EMappingEntity__Group_7__4__Impl4087); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2043:1: rule__EMappingEntity__Group_7_3__0 : rule__EMappingEntity__Group_7_3__0__Impl rule__EMappingEntity__Group_7_3__1 ;
    public final void rule__EMappingEntity__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2047:1: ( rule__EMappingEntity__Group_7_3__0__Impl rule__EMappingEntity__Group_7_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2048:2: rule__EMappingEntity__Group_7_3__0__Impl rule__EMappingEntity__Group_7_3__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7_3__0__Impl_in_rule__EMappingEntity__Group_7_3__04128);
            rule__EMappingEntity__Group_7_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7_3__1_in_rule__EMappingEntity__Group_7_3__04131);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2055:1: rule__EMappingEntity__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__EMappingEntity__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2059:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2060:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2060:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2061:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getCommaKeyword_7_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EMappingEntity__Group_7_3__0__Impl4159); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2074:1: rule__EMappingEntity__Group_7_3__1 : rule__EMappingEntity__Group_7_3__1__Impl ;
    public final void rule__EMappingEntity__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2078:1: ( rule__EMappingEntity__Group_7_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2079:2: rule__EMappingEntity__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_7_3__1__Impl_in_rule__EMappingEntity__Group_7_3__14190);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2085:1: rule__EMappingEntity__Group_7_3__1__Impl : ( ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 ) ) ;
    public final void rule__EMappingEntity__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2089:1: ( ( ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2090:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2090:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2091:1: ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_7_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2092:1: ( rule__EMappingEntity__NamedQueriesAssignment_7_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2092:2: rule__EMappingEntity__NamedQueriesAssignment_7_3_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_7_3_1_in_rule__EMappingEntity__Group_7_3__1__Impl4217);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2106:1: rule__EMappingEntity__Group_9__0 : rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1 ;
    public final void rule__EMappingEntity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2110:1: ( rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2111:2: rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__0__Impl_in_rule__EMappingEntity__Group_9__04251);
            rule__EMappingEntity__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__1_in_rule__EMappingEntity__Group_9__04254);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2118:1: rule__EMappingEntity__Group_9__0__Impl : ( 'as' ) ;
    public final void rule__EMappingEntity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2122:1: ( ( 'as' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2123:1: ( 'as' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2123:1: ( 'as' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2124:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAsKeyword_9_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__EMappingEntity__Group_9__0__Impl4282); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2137:1: rule__EMappingEntity__Group_9__1 : rule__EMappingEntity__Group_9__1__Impl ;
    public final void rule__EMappingEntity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2141:1: ( rule__EMappingEntity__Group_9__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2142:2: rule__EMappingEntity__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__1__Impl_in_rule__EMappingEntity__Group_9__14313);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2148:1: rule__EMappingEntity__Group_9__1__Impl : ( ( rule__EMappingEntity__TableNameAssignment_9_1 ) ) ;
    public final void rule__EMappingEntity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2152:1: ( ( ( rule__EMappingEntity__TableNameAssignment_9_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2153:1: ( ( rule__EMappingEntity__TableNameAssignment_9_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2153:1: ( ( rule__EMappingEntity__TableNameAssignment_9_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2154:1: ( rule__EMappingEntity__TableNameAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getTableNameAssignment_9_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2155:1: ( rule__EMappingEntity__TableNameAssignment_9_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2155:2: rule__EMappingEntity__TableNameAssignment_9_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__TableNameAssignment_9_1_in_rule__EMappingEntity__Group_9__1__Impl4340);
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


    // $ANTLR start "rule__EAttribute__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2169:1: rule__EAttribute__Group__0 : rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1 ;
    public final void rule__EAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2173:1: ( rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2174:2: rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__0__Impl_in_rule__EAttribute__Group__04374);
            rule__EAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__1_in_rule__EAttribute__Group__04377);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2181:1: rule__EAttribute__Group__0__Impl : ( ( rule__EAttribute__PkAssignment_0 )? ) ;
    public final void rule__EAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2185:1: ( ( ( rule__EAttribute__PkAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2186:1: ( ( rule__EAttribute__PkAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2186:1: ( ( rule__EAttribute__PkAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2187:1: ( rule__EAttribute__PkAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2188:1: ( rule__EAttribute__PkAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2188:2: rule__EAttribute__PkAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__PkAssignment_0_in_rule__EAttribute__Group__0__Impl4404);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2198:1: rule__EAttribute__Group__1 : rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2 ;
    public final void rule__EAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2202:1: ( rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2203:2: rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__1__Impl_in_rule__EAttribute__Group__14435);
            rule__EAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__2_in_rule__EAttribute__Group__14438);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2210:1: rule__EAttribute__Group__1__Impl : ( ( rule__EAttribute__PropertyAssignment_1 ) ) ;
    public final void rule__EAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2214:1: ( ( ( rule__EAttribute__PropertyAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2215:1: ( ( rule__EAttribute__PropertyAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2215:1: ( ( rule__EAttribute__PropertyAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2216:1: ( rule__EAttribute__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPropertyAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2217:1: ( rule__EAttribute__PropertyAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2217:2: rule__EAttribute__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__EAttribute__PropertyAssignment_1_in_rule__EAttribute__Group__1__Impl4465);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2227:1: rule__EAttribute__Group__2 : rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3 ;
    public final void rule__EAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2231:1: ( rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2232:2: rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__2__Impl_in_rule__EAttribute__Group__24495);
            rule__EAttribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__3_in_rule__EAttribute__Group__24498);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2239:1: rule__EAttribute__Group__2__Impl : ( '=>' ) ;
    public final void rule__EAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2243:1: ( ( '=>' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2244:1: ( '=>' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2244:1: ( '=>' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2245:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__EAttribute__Group__2__Impl4526); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2258:1: rule__EAttribute__Group__3 : rule__EAttribute__Group__3__Impl ;
    public final void rule__EAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2262:1: ( rule__EAttribute__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2263:2: rule__EAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__3__Impl_in_rule__EAttribute__Group__34557);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2269:1: rule__EAttribute__Group__3__Impl : ( ( rule__EAttribute__Alternatives_3 ) ) ;
    public final void rule__EAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2273:1: ( ( ( rule__EAttribute__Alternatives_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2274:1: ( ( rule__EAttribute__Alternatives_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2274:1: ( ( rule__EAttribute__Alternatives_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2275:1: ( rule__EAttribute__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2276:1: ( rule__EAttribute__Alternatives_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2276:2: rule__EAttribute__Alternatives_3
            {
            pushFollow(FOLLOW_rule__EAttribute__Alternatives_3_in_rule__EAttribute__Group__3__Impl4584);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2294:1: rule__EAttribute__Group_3_0__0 : rule__EAttribute__Group_3_0__0__Impl rule__EAttribute__Group_3_0__1 ;
    public final void rule__EAttribute__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2298:1: ( rule__EAttribute__Group_3_0__0__Impl rule__EAttribute__Group_3_0__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2299:2: rule__EAttribute__Group_3_0__0__Impl rule__EAttribute__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0__0__Impl_in_rule__EAttribute__Group_3_0__04622);
            rule__EAttribute__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0__1_in_rule__EAttribute__Group_3_0__04625);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2306:1: rule__EAttribute__Group_3_0__0__Impl : ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) ) ;
    public final void rule__EAttribute__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2310:1: ( ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2311:1: ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2311:1: ( ( rule__EAttribute__ColumnNameAssignment_3_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2312:1: ( rule__EAttribute__ColumnNameAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getColumnNameAssignment_3_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2313:1: ( rule__EAttribute__ColumnNameAssignment_3_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2313:2: rule__EAttribute__ColumnNameAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__EAttribute__ColumnNameAssignment_3_0_0_in_rule__EAttribute__Group_3_0__0__Impl4652);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2323:1: rule__EAttribute__Group_3_0__1 : rule__EAttribute__Group_3_0__1__Impl ;
    public final void rule__EAttribute__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2327:1: ( rule__EAttribute__Group_3_0__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2328:2: rule__EAttribute__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0__1__Impl_in_rule__EAttribute__Group_3_0__14682);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2334:1: rule__EAttribute__Group_3_0__1__Impl : ( ( rule__EAttribute__Group_3_0_1__0 )? ) ;
    public final void rule__EAttribute__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2338:1: ( ( ( rule__EAttribute__Group_3_0_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2339:1: ( ( rule__EAttribute__Group_3_0_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2339:1: ( ( rule__EAttribute__Group_3_0_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2340:1: ( rule__EAttribute__Group_3_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getGroup_3_0_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2341:1: ( rule__EAttribute__Group_3_0_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2341:2: rule__EAttribute__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__0_in_rule__EAttribute__Group_3_0__1__Impl4709);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2355:1: rule__EAttribute__Group_3_0_1__0 : rule__EAttribute__Group_3_0_1__0__Impl rule__EAttribute__Group_3_0_1__1 ;
    public final void rule__EAttribute__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2359:1: ( rule__EAttribute__Group_3_0_1__0__Impl rule__EAttribute__Group_3_0_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2360:2: rule__EAttribute__Group_3_0_1__0__Impl rule__EAttribute__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__0__Impl_in_rule__EAttribute__Group_3_0_1__04744);
            rule__EAttribute__Group_3_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__1_in_rule__EAttribute__Group_3_0_1__04747);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2367:1: rule__EAttribute__Group_3_0_1__0__Impl : ( 'generatedby' ) ;
    public final void rule__EAttribute__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2371:1: ( ( 'generatedby' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2372:1: ( 'generatedby' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2372:1: ( 'generatedby' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2373:1: 'generatedby'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getGeneratedbyKeyword_3_0_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__EAttribute__Group_3_0_1__0__Impl4775); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2386:1: rule__EAttribute__Group_3_0_1__1 : rule__EAttribute__Group_3_0_1__1__Impl rule__EAttribute__Group_3_0_1__2 ;
    public final void rule__EAttribute__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2390:1: ( rule__EAttribute__Group_3_0_1__1__Impl rule__EAttribute__Group_3_0_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2391:2: rule__EAttribute__Group_3_0_1__1__Impl rule__EAttribute__Group_3_0_1__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__1__Impl_in_rule__EAttribute__Group_3_0_1__14806);
            rule__EAttribute__Group_3_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__2_in_rule__EAttribute__Group_3_0_1__14809);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2398:1: rule__EAttribute__Group_3_0_1__1__Impl : ( '{' ) ;
    public final void rule__EAttribute__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2402:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2403:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2403:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2404:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_3_0_1_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__EAttribute__Group_3_0_1__1__Impl4837); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2417:1: rule__EAttribute__Group_3_0_1__2 : rule__EAttribute__Group_3_0_1__2__Impl rule__EAttribute__Group_3_0_1__3 ;
    public final void rule__EAttribute__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2421:1: ( rule__EAttribute__Group_3_0_1__2__Impl rule__EAttribute__Group_3_0_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2422:2: rule__EAttribute__Group_3_0_1__2__Impl rule__EAttribute__Group_3_0_1__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__2__Impl_in_rule__EAttribute__Group_3_0_1__24868);
            rule__EAttribute__Group_3_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__3_in_rule__EAttribute__Group_3_0_1__24871);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2429:1: rule__EAttribute__Group_3_0_1__2__Impl : ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 ) ) ;
    public final void rule__EAttribute__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2433:1: ( ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2434:1: ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2434:1: ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2435:1: ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getValueGeneratorsAssignment_3_0_1_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2436:1: ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2436:2: rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2
            {
            pushFollow(FOLLOW_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2_in_rule__EAttribute__Group_3_0_1__2__Impl4898);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2446:1: rule__EAttribute__Group_3_0_1__3 : rule__EAttribute__Group_3_0_1__3__Impl rule__EAttribute__Group_3_0_1__4 ;
    public final void rule__EAttribute__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2450:1: ( rule__EAttribute__Group_3_0_1__3__Impl rule__EAttribute__Group_3_0_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2451:2: rule__EAttribute__Group_3_0_1__3__Impl rule__EAttribute__Group_3_0_1__4
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__3__Impl_in_rule__EAttribute__Group_3_0_1__34928);
            rule__EAttribute__Group_3_0_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__4_in_rule__EAttribute__Group_3_0_1__34931);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2458:1: rule__EAttribute__Group_3_0_1__3__Impl : ( ( rule__EAttribute__Group_3_0_1_3__0 )* ) ;
    public final void rule__EAttribute__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2462:1: ( ( ( rule__EAttribute__Group_3_0_1_3__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2463:1: ( ( rule__EAttribute__Group_3_0_1_3__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2463:1: ( ( rule__EAttribute__Group_3_0_1_3__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2464:1: ( rule__EAttribute__Group_3_0_1_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getGroup_3_0_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2465:1: ( rule__EAttribute__Group_3_0_1_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2465:2: rule__EAttribute__Group_3_0_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3__0_in_rule__EAttribute__Group_3_0_1__3__Impl4958);
            	    rule__EAttribute__Group_3_0_1_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2475:1: rule__EAttribute__Group_3_0_1__4 : rule__EAttribute__Group_3_0_1__4__Impl ;
    public final void rule__EAttribute__Group_3_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2479:1: ( rule__EAttribute__Group_3_0_1__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2480:2: rule__EAttribute__Group_3_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1__4__Impl_in_rule__EAttribute__Group_3_0_1__44989);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2486:1: rule__EAttribute__Group_3_0_1__4__Impl : ( '}' ) ;
    public final void rule__EAttribute__Group_3_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2490:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2491:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2491:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2492:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_3_0_1_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__EAttribute__Group_3_0_1__4__Impl5017); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2515:1: rule__EAttribute__Group_3_0_1_3__0 : rule__EAttribute__Group_3_0_1_3__0__Impl rule__EAttribute__Group_3_0_1_3__1 ;
    public final void rule__EAttribute__Group_3_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2519:1: ( rule__EAttribute__Group_3_0_1_3__0__Impl rule__EAttribute__Group_3_0_1_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2520:2: rule__EAttribute__Group_3_0_1_3__0__Impl rule__EAttribute__Group_3_0_1_3__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3__0__Impl_in_rule__EAttribute__Group_3_0_1_3__05058);
            rule__EAttribute__Group_3_0_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3__1_in_rule__EAttribute__Group_3_0_1_3__05061);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2527:1: rule__EAttribute__Group_3_0_1_3__0__Impl : ( ',' ) ;
    public final void rule__EAttribute__Group_3_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2531:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2532:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2532:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2533:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getCommaKeyword_3_0_1_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EAttribute__Group_3_0_1_3__0__Impl5089); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2546:1: rule__EAttribute__Group_3_0_1_3__1 : rule__EAttribute__Group_3_0_1_3__1__Impl ;
    public final void rule__EAttribute__Group_3_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2550:1: ( rule__EAttribute__Group_3_0_1_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2551:2: rule__EAttribute__Group_3_0_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_0_1_3__1__Impl_in_rule__EAttribute__Group_3_0_1_3__15120);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2557:1: rule__EAttribute__Group_3_0_1_3__1__Impl : ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 ) ) ;
    public final void rule__EAttribute__Group_3_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2561:1: ( ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2562:1: ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2562:1: ( ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2563:1: ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getValueGeneratorsAssignment_3_0_1_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2564:1: ( rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2564:2: rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1
            {
            pushFollow(FOLLOW_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1_in_rule__EAttribute__Group_3_0_1_3__1__Impl5147);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2578:1: rule__EAttribute__Group_3_1__0 : rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1 ;
    public final void rule__EAttribute__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2582:1: ( rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2583:2: rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__0__Impl_in_rule__EAttribute__Group_3_1__05181);
            rule__EAttribute__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__1_in_rule__EAttribute__Group_3_1__05184);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2590:1: rule__EAttribute__Group_3_1__0__Impl : ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) ) ;
    public final void rule__EAttribute__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2594:1: ( ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2595:1: ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2595:1: ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2596:1: ( rule__EAttribute__ResolvedAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedAssignment_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2597:1: ( rule__EAttribute__ResolvedAssignment_3_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2597:2: rule__EAttribute__ResolvedAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__EAttribute__ResolvedAssignment_3_1_0_in_rule__EAttribute__Group_3_1__0__Impl5211);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2607:1: rule__EAttribute__Group_3_1__1 : rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2 ;
    public final void rule__EAttribute__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2611:1: ( rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2612:2: rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__1__Impl_in_rule__EAttribute__Group_3_1__15241);
            rule__EAttribute__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__2_in_rule__EAttribute__Group_3_1__15244);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2619:1: rule__EAttribute__Group_3_1__1__Impl : ( ( rule__EAttribute__QueryAssignment_3_1_1 ) ) ;
    public final void rule__EAttribute__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2623:1: ( ( ( rule__EAttribute__QueryAssignment_3_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2624:1: ( ( rule__EAttribute__QueryAssignment_3_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2624:1: ( ( rule__EAttribute__QueryAssignment_3_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2625:1: ( rule__EAttribute__QueryAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryAssignment_3_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2626:1: ( rule__EAttribute__QueryAssignment_3_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2626:2: rule__EAttribute__QueryAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EAttribute__QueryAssignment_3_1_1_in_rule__EAttribute__Group_3_1__1__Impl5271);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2636:1: rule__EAttribute__Group_3_1__2 : rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3 ;
    public final void rule__EAttribute__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2640:1: ( rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2641:2: rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__2__Impl_in_rule__EAttribute__Group_3_1__25301);
            rule__EAttribute__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__3_in_rule__EAttribute__Group_3_1__25304);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2648:1: rule__EAttribute__Group_3_1__2__Impl : ( '(' ) ;
    public final void rule__EAttribute__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2652:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2653:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2653:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2654:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__EAttribute__Group_3_1__2__Impl5332); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2667:1: rule__EAttribute__Group_3_1__3 : rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4 ;
    public final void rule__EAttribute__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2671:1: ( rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2672:2: rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__3__Impl_in_rule__EAttribute__Group_3_1__35363);
            rule__EAttribute__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__4_in_rule__EAttribute__Group_3_1__35366);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2679:1: rule__EAttribute__Group_3_1__3__Impl : ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) ) ;
    public final void rule__EAttribute__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2683:1: ( ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2684:1: ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2684:1: ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2685:1: ( rule__EAttribute__ParametersAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getParametersAssignment_3_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2686:1: ( rule__EAttribute__ParametersAssignment_3_1_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2686:2: rule__EAttribute__ParametersAssignment_3_1_3
            {
            pushFollow(FOLLOW_rule__EAttribute__ParametersAssignment_3_1_3_in_rule__EAttribute__Group_3_1__3__Impl5393);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2696:1: rule__EAttribute__Group_3_1__4 : rule__EAttribute__Group_3_1__4__Impl ;
    public final void rule__EAttribute__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2700:1: ( rule__EAttribute__Group_3_1__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2701:2: rule__EAttribute__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__4__Impl_in_rule__EAttribute__Group_3_1__45423);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2707:1: rule__EAttribute__Group_3_1__4__Impl : ( ')' ) ;
    public final void rule__EAttribute__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2711:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2712:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2712:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2713:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4()); 
            }
            match(input,30,FOLLOW_30_in_rule__EAttribute__Group_3_1__4__Impl5451); if (state.failed) return ;
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


    // $ANTLR start "rule__EValueGenerator__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2736:1: rule__EValueGenerator__Group__0 : rule__EValueGenerator__Group__0__Impl rule__EValueGenerator__Group__1 ;
    public final void rule__EValueGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2740:1: ( rule__EValueGenerator__Group__0__Impl rule__EValueGenerator__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2741:2: rule__EValueGenerator__Group__0__Impl rule__EValueGenerator__Group__1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group__0__Impl_in_rule__EValueGenerator__Group__05492);
            rule__EValueGenerator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EValueGenerator__Group__1_in_rule__EValueGenerator__Group__05495);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2748:1: rule__EValueGenerator__Group__0__Impl : ( ( rule__EValueGenerator__DbTypeAssignment_0 ) ) ;
    public final void rule__EValueGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2752:1: ( ( ( rule__EValueGenerator__DbTypeAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2753:1: ( ( rule__EValueGenerator__DbTypeAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2753:1: ( ( rule__EValueGenerator__DbTypeAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2754:1: ( rule__EValueGenerator__DbTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getDbTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2755:1: ( rule__EValueGenerator__DbTypeAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2755:2: rule__EValueGenerator__DbTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EValueGenerator__DbTypeAssignment_0_in_rule__EValueGenerator__Group__0__Impl5522);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2765:1: rule__EValueGenerator__Group__1 : rule__EValueGenerator__Group__1__Impl ;
    public final void rule__EValueGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2769:1: ( rule__EValueGenerator__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2770:2: rule__EValueGenerator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group__1__Impl_in_rule__EValueGenerator__Group__15552);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2776:1: rule__EValueGenerator__Group__1__Impl : ( ( rule__EValueGenerator__Alternatives_1 ) ) ;
    public final void rule__EValueGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2780:1: ( ( ( rule__EValueGenerator__Alternatives_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2781:1: ( ( rule__EValueGenerator__Alternatives_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2781:1: ( ( rule__EValueGenerator__Alternatives_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2782:1: ( rule__EValueGenerator__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getAlternatives_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2783:1: ( rule__EValueGenerator__Alternatives_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2783:2: rule__EValueGenerator__Alternatives_1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Alternatives_1_in_rule__EValueGenerator__Group__1__Impl5579);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2797:1: rule__EValueGenerator__Group_1_1__0 : rule__EValueGenerator__Group_1_1__0__Impl rule__EValueGenerator__Group_1_1__1 ;
    public final void rule__EValueGenerator__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2801:1: ( rule__EValueGenerator__Group_1_1__0__Impl rule__EValueGenerator__Group_1_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2802:2: rule__EValueGenerator__Group_1_1__0__Impl rule__EValueGenerator__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_1__0__Impl_in_rule__EValueGenerator__Group_1_1__05613);
            rule__EValueGenerator__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_1__1_in_rule__EValueGenerator__Group_1_1__05616);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2809:1: rule__EValueGenerator__Group_1_1__0__Impl : ( 'query' ) ;
    public final void rule__EValueGenerator__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2813:1: ( ( 'query' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2814:1: ( 'query' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2814:1: ( 'query' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2815:1: 'query'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getQueryKeyword_1_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__EValueGenerator__Group_1_1__0__Impl5644); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2828:1: rule__EValueGenerator__Group_1_1__1 : rule__EValueGenerator__Group_1_1__1__Impl ;
    public final void rule__EValueGenerator__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2832:1: ( rule__EValueGenerator__Group_1_1__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2833:2: rule__EValueGenerator__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_1__1__Impl_in_rule__EValueGenerator__Group_1_1__15675);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2839:1: rule__EValueGenerator__Group_1_1__1__Impl : ( ( rule__EValueGenerator__QueryAssignment_1_1_1 ) ) ;
    public final void rule__EValueGenerator__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2843:1: ( ( ( rule__EValueGenerator__QueryAssignment_1_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2844:1: ( ( rule__EValueGenerator__QueryAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2844:1: ( ( rule__EValueGenerator__QueryAssignment_1_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2845:1: ( rule__EValueGenerator__QueryAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getQueryAssignment_1_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2846:1: ( rule__EValueGenerator__QueryAssignment_1_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2846:2: rule__EValueGenerator__QueryAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__QueryAssignment_1_1_1_in_rule__EValueGenerator__Group_1_1__1__Impl5702);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2860:1: rule__EValueGenerator__Group_1_2__0 : rule__EValueGenerator__Group_1_2__0__Impl rule__EValueGenerator__Group_1_2__1 ;
    public final void rule__EValueGenerator__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2864:1: ( rule__EValueGenerator__Group_1_2__0__Impl rule__EValueGenerator__Group_1_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2865:2: rule__EValueGenerator__Group_1_2__0__Impl rule__EValueGenerator__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_2__0__Impl_in_rule__EValueGenerator__Group_1_2__05736);
            rule__EValueGenerator__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_2__1_in_rule__EValueGenerator__Group_1_2__05739);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2872:1: rule__EValueGenerator__Group_1_2__0__Impl : ( 'seqnext' ) ;
    public final void rule__EValueGenerator__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2876:1: ( ( 'seqnext' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2877:1: ( 'seqnext' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2877:1: ( 'seqnext' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2878:1: 'seqnext'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getSeqnextKeyword_1_2_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__EValueGenerator__Group_1_2__0__Impl5767); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2891:1: rule__EValueGenerator__Group_1_2__1 : rule__EValueGenerator__Group_1_2__1__Impl ;
    public final void rule__EValueGenerator__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2895:1: ( rule__EValueGenerator__Group_1_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2896:2: rule__EValueGenerator__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EValueGenerator__Group_1_2__1__Impl_in_rule__EValueGenerator__Group_1_2__15798);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2902:1: rule__EValueGenerator__Group_1_2__1__Impl : ( ( rule__EValueGenerator__SequenceAssignment_1_2_1 ) ) ;
    public final void rule__EValueGenerator__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2906:1: ( ( ( rule__EValueGenerator__SequenceAssignment_1_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2907:1: ( ( rule__EValueGenerator__SequenceAssignment_1_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2907:1: ( ( rule__EValueGenerator__SequenceAssignment_1_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2908:1: ( rule__EValueGenerator__SequenceAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getSequenceAssignment_1_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2909:1: ( rule__EValueGenerator__SequenceAssignment_1_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2909:2: rule__EValueGenerator__SequenceAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__EValueGenerator__SequenceAssignment_1_2_1_in_rule__EValueGenerator__Group_1_2__1__Impl5825);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2923:1: rule__ENamedQuery__Group__0 : rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1 ;
    public final void rule__ENamedQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2927:1: ( rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2928:2: rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__0__Impl_in_rule__ENamedQuery__Group__05859);
            rule__ENamedQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__1_in_rule__ENamedQuery__Group__05862);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2935:1: rule__ENamedQuery__Group__0__Impl : ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? ) ;
    public final void rule__ENamedQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2939:1: ( ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2940:1: ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2940:1: ( ( rule__ENamedQuery__ReturnTypeAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2941:1: ( rule__ENamedQuery__ReturnTypeAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getReturnTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2942:1: ( rule__ENamedQuery__ReturnTypeAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=14 && LA23_0<=15)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2942:2: rule__ENamedQuery__ReturnTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ENamedQuery__ReturnTypeAssignment_0_in_rule__ENamedQuery__Group__0__Impl5889);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2952:1: rule__ENamedQuery__Group__1 : rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2 ;
    public final void rule__ENamedQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2956:1: ( rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2957:2: rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__1__Impl_in_rule__ENamedQuery__Group__15920);
            rule__ENamedQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__2_in_rule__ENamedQuery__Group__15923);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2964:1: rule__ENamedQuery__Group__1__Impl : ( ( rule__ENamedQuery__NameAssignment_1 ) ) ;
    public final void rule__ENamedQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2968:1: ( ( ( rule__ENamedQuery__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2969:1: ( ( rule__ENamedQuery__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2969:1: ( ( rule__ENamedQuery__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2970:1: ( rule__ENamedQuery__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2971:1: ( rule__ENamedQuery__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2971:2: rule__ENamedQuery__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__NameAssignment_1_in_rule__ENamedQuery__Group__1__Impl5950);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2981:1: rule__ENamedQuery__Group__2 : rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3 ;
    public final void rule__ENamedQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2985:1: ( rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2986:2: rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__2__Impl_in_rule__ENamedQuery__Group__25980);
            rule__ENamedQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__3_in_rule__ENamedQuery__Group__25983);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2993:1: rule__ENamedQuery__Group__2__Impl : ( ( rule__ENamedQuery__Group_2__0 )? ) ;
    public final void rule__ENamedQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2997:1: ( ( ( rule__ENamedQuery__Group_2__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2998:1: ( ( rule__ENamedQuery__Group_2__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2998:1: ( ( rule__ENamedQuery__Group_2__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2999:1: ( rule__ENamedQuery__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getGroup_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3000:1: ( rule__ENamedQuery__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3000:2: rule__ENamedQuery__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ENamedQuery__Group_2__0_in_rule__ENamedQuery__Group__2__Impl6010);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3010:1: rule__ENamedQuery__Group__3 : rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4 ;
    public final void rule__ENamedQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3014:1: ( rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3015:2: rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__3__Impl_in_rule__ENamedQuery__Group__36041);
            rule__ENamedQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__4_in_rule__ENamedQuery__Group__36044);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3022:1: rule__ENamedQuery__Group__3__Impl : ( '{' ) ;
    public final void rule__ENamedQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3026:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3027:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3027:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3028:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,17,FOLLOW_17_in_rule__ENamedQuery__Group__3__Impl6072); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3041:1: rule__ENamedQuery__Group__4 : rule__ENamedQuery__Group__4__Impl rule__ENamedQuery__Group__5 ;
    public final void rule__ENamedQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3045:1: ( rule__ENamedQuery__Group__4__Impl rule__ENamedQuery__Group__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3046:2: rule__ENamedQuery__Group__4__Impl rule__ENamedQuery__Group__5
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__4__Impl_in_rule__ENamedQuery__Group__46103);
            rule__ENamedQuery__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__5_in_rule__ENamedQuery__Group__46106);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3053:1: rule__ENamedQuery__Group__4__Impl : ( ( rule__ENamedQuery__QueriesAssignment_4 ) ) ;
    public final void rule__ENamedQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3057:1: ( ( ( rule__ENamedQuery__QueriesAssignment_4 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3058:1: ( ( rule__ENamedQuery__QueriesAssignment_4 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3058:1: ( ( rule__ENamedQuery__QueriesAssignment_4 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3059:1: ( rule__ENamedQuery__QueriesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesAssignment_4()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3060:1: ( rule__ENamedQuery__QueriesAssignment_4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3060:2: rule__ENamedQuery__QueriesAssignment_4
            {
            pushFollow(FOLLOW_rule__ENamedQuery__QueriesAssignment_4_in_rule__ENamedQuery__Group__4__Impl6133);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3070:1: rule__ENamedQuery__Group__5 : rule__ENamedQuery__Group__5__Impl rule__ENamedQuery__Group__6 ;
    public final void rule__ENamedQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3074:1: ( rule__ENamedQuery__Group__5__Impl rule__ENamedQuery__Group__6 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3075:2: rule__ENamedQuery__Group__5__Impl rule__ENamedQuery__Group__6
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__5__Impl_in_rule__ENamedQuery__Group__56163);
            rule__ENamedQuery__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__6_in_rule__ENamedQuery__Group__56166);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3082:1: rule__ENamedQuery__Group__5__Impl : ( ( rule__ENamedQuery__Group_5__0 )* ) ;
    public final void rule__ENamedQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3086:1: ( ( ( rule__ENamedQuery__Group_5__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3087:1: ( ( rule__ENamedQuery__Group_5__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3087:1: ( ( rule__ENamedQuery__Group_5__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3088:1: ( rule__ENamedQuery__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getGroup_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3089:1: ( rule__ENamedQuery__Group_5__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3089:2: rule__ENamedQuery__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ENamedQuery__Group_5__0_in_rule__ENamedQuery__Group__5__Impl6193);
            	    rule__ENamedQuery__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3099:1: rule__ENamedQuery__Group__6 : rule__ENamedQuery__Group__6__Impl ;
    public final void rule__ENamedQuery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3103:1: ( rule__ENamedQuery__Group__6__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3104:2: rule__ENamedQuery__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__6__Impl_in_rule__ENamedQuery__Group__66224);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3110:1: rule__ENamedQuery__Group__6__Impl : ( '}' ) ;
    public final void rule__ENamedQuery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3114:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3115:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3115:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3116:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,18,FOLLOW_18_in_rule__ENamedQuery__Group__6__Impl6252); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3143:1: rule__ENamedQuery__Group_2__0 : rule__ENamedQuery__Group_2__0__Impl rule__ENamedQuery__Group_2__1 ;
    public final void rule__ENamedQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3147:1: ( rule__ENamedQuery__Group_2__0__Impl rule__ENamedQuery__Group_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3148:2: rule__ENamedQuery__Group_2__0__Impl rule__ENamedQuery__Group_2__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__0__Impl_in_rule__ENamedQuery__Group_2__06297);
            rule__ENamedQuery__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__1_in_rule__ENamedQuery__Group_2__06300);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3155:1: rule__ENamedQuery__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ENamedQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3159:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3160:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3160:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3161:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ENamedQuery__Group_2__0__Impl6328); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3174:1: rule__ENamedQuery__Group_2__1 : rule__ENamedQuery__Group_2__1__Impl rule__ENamedQuery__Group_2__2 ;
    public final void rule__ENamedQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3178:1: ( rule__ENamedQuery__Group_2__1__Impl rule__ENamedQuery__Group_2__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3179:2: rule__ENamedQuery__Group_2__1__Impl rule__ENamedQuery__Group_2__2
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__1__Impl_in_rule__ENamedQuery__Group_2__16359);
            rule__ENamedQuery__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__2_in_rule__ENamedQuery__Group_2__16362);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3186:1: rule__ENamedQuery__Group_2__1__Impl : ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* ) ;
    public final void rule__ENamedQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3190:1: ( ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3191:1: ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3191:1: ( ( rule__ENamedQuery__ParametersAssignment_2_1 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3192:1: ( rule__ENamedQuery__ParametersAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getParametersAssignment_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3193:1: ( rule__ENamedQuery__ParametersAssignment_2_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3193:2: rule__ENamedQuery__ParametersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__ENamedQuery__ParametersAssignment_2_1_in_rule__ENamedQuery__Group_2__1__Impl6389);
            	    rule__ENamedQuery__ParametersAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3203:1: rule__ENamedQuery__Group_2__2 : rule__ENamedQuery__Group_2__2__Impl ;
    public final void rule__ENamedQuery__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3207:1: ( rule__ENamedQuery__Group_2__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3208:2: rule__ENamedQuery__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_2__2__Impl_in_rule__ENamedQuery__Group_2__26420);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3214:1: rule__ENamedQuery__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ENamedQuery__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3218:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3219:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3219:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3220:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__ENamedQuery__Group_2__2__Impl6448); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3239:1: rule__ENamedQuery__Group_5__0 : rule__ENamedQuery__Group_5__0__Impl rule__ENamedQuery__Group_5__1 ;
    public final void rule__ENamedQuery__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3243:1: ( rule__ENamedQuery__Group_5__0__Impl rule__ENamedQuery__Group_5__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3244:2: rule__ENamedQuery__Group_5__0__Impl rule__ENamedQuery__Group_5__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_5__0__Impl_in_rule__ENamedQuery__Group_5__06485);
            rule__ENamedQuery__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_5__1_in_rule__ENamedQuery__Group_5__06488);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3251:1: rule__ENamedQuery__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ENamedQuery__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3255:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3256:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3256:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3257:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getCommaKeyword_5_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__ENamedQuery__Group_5__0__Impl6516); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3270:1: rule__ENamedQuery__Group_5__1 : rule__ENamedQuery__Group_5__1__Impl ;
    public final void rule__ENamedQuery__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3274:1: ( rule__ENamedQuery__Group_5__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3275:2: rule__ENamedQuery__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_5__1__Impl_in_rule__ENamedQuery__Group_5__16547);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3281:1: rule__ENamedQuery__Group_5__1__Impl : ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) ) ;
    public final void rule__ENamedQuery__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3285:1: ( ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3286:1: ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3286:1: ( ( rule__ENamedQuery__QueriesAssignment_5_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3287:1: ( rule__ENamedQuery__QueriesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesAssignment_5_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3288:1: ( rule__ENamedQuery__QueriesAssignment_5_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3288:2: rule__ENamedQuery__QueriesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__QueriesAssignment_5_1_in_rule__ENamedQuery__Group_5__1__Impl6574);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3302:1: rule__EParameter__Group__0 : rule__EParameter__Group__0__Impl rule__EParameter__Group__1 ;
    public final void rule__EParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3306:1: ( rule__EParameter__Group__0__Impl rule__EParameter__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3307:2: rule__EParameter__Group__0__Impl rule__EParameter__Group__1
            {
            pushFollow(FOLLOW_rule__EParameter__Group__0__Impl_in_rule__EParameter__Group__06608);
            rule__EParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EParameter__Group__1_in_rule__EParameter__Group__06611);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3314:1: rule__EParameter__Group__0__Impl : ( ( rule__EParameter__TypeAssignment_0 ) ) ;
    public final void rule__EParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3318:1: ( ( ( rule__EParameter__TypeAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3319:1: ( ( rule__EParameter__TypeAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3319:1: ( ( rule__EParameter__TypeAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3320:1: ( rule__EParameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3321:1: ( rule__EParameter__TypeAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3321:2: rule__EParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EParameter__TypeAssignment_0_in_rule__EParameter__Group__0__Impl6638);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3331:1: rule__EParameter__Group__1 : rule__EParameter__Group__1__Impl ;
    public final void rule__EParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3335:1: ( rule__EParameter__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3336:2: rule__EParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EParameter__Group__1__Impl_in_rule__EParameter__Group__16668);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3342:1: rule__EParameter__Group__1__Impl : ( ( rule__EParameter__NameAssignment_1 ) ) ;
    public final void rule__EParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3346:1: ( ( ( rule__EParameter__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3347:1: ( ( rule__EParameter__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3347:1: ( ( rule__EParameter__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3348:1: ( rule__EParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3349:1: ( rule__EParameter__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3349:2: rule__EParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EParameter__NameAssignment_1_in_rule__EParameter__Group__1__Impl6695);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3363:1: rule__EQuery__Group__0 : rule__EQuery__Group__0__Impl rule__EQuery__Group__1 ;
    public final void rule__EQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3367:1: ( rule__EQuery__Group__0__Impl rule__EQuery__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3368:2: rule__EQuery__Group__0__Impl rule__EQuery__Group__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group__0__Impl_in_rule__EQuery__Group__06729);
            rule__EQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group__1_in_rule__EQuery__Group__06732);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3375:1: rule__EQuery__Group__0__Impl : ( ( rule__EQuery__DbTypeAssignment_0 ) ) ;
    public final void rule__EQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3379:1: ( ( ( rule__EQuery__DbTypeAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3380:1: ( ( rule__EQuery__DbTypeAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3380:1: ( ( rule__EQuery__DbTypeAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3381:1: ( rule__EQuery__DbTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getDbTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3382:1: ( rule__EQuery__DbTypeAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3382:2: rule__EQuery__DbTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EQuery__DbTypeAssignment_0_in_rule__EQuery__Group__0__Impl6759);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3392:1: rule__EQuery__Group__1 : rule__EQuery__Group__1__Impl rule__EQuery__Group__2 ;
    public final void rule__EQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3396:1: ( rule__EQuery__Group__1__Impl rule__EQuery__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3397:2: rule__EQuery__Group__1__Impl rule__EQuery__Group__2
            {
            pushFollow(FOLLOW_rule__EQuery__Group__1__Impl_in_rule__EQuery__Group__16789);
            rule__EQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group__2_in_rule__EQuery__Group__16792);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3404:1: rule__EQuery__Group__1__Impl : ( ( rule__EQuery__MappingAssignment_1 ) ) ;
    public final void rule__EQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3408:1: ( ( ( rule__EQuery__MappingAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3409:1: ( ( rule__EQuery__MappingAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3409:1: ( ( rule__EQuery__MappingAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3410:1: ( rule__EQuery__MappingAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getMappingAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3411:1: ( rule__EQuery__MappingAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3411:2: rule__EQuery__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__EQuery__MappingAssignment_1_in_rule__EQuery__Group__1__Impl6819);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3421:1: rule__EQuery__Group__2 : rule__EQuery__Group__2__Impl ;
    public final void rule__EQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3425:1: ( rule__EQuery__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3426:2: rule__EQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group__2__Impl_in_rule__EQuery__Group__26849);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3432:1: rule__EQuery__Group__2__Impl : ( ( rule__EQuery__Alternatives_2 ) ) ;
    public final void rule__EQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3436:1: ( ( ( rule__EQuery__Alternatives_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3437:1: ( ( rule__EQuery__Alternatives_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3437:1: ( ( rule__EQuery__Alternatives_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3438:1: ( rule__EQuery__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getAlternatives_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3439:1: ( rule__EQuery__Alternatives_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3439:2: rule__EQuery__Alternatives_2
            {
            pushFollow(FOLLOW_rule__EQuery__Alternatives_2_in_rule__EQuery__Group__2__Impl6876);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3455:1: rule__EQuery__Group_2_0__0 : rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1 ;
    public final void rule__EQuery__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3459:1: ( rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3460:2: rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__0__Impl_in_rule__EQuery__Group_2_0__06912);
            rule__EQuery__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__1_in_rule__EQuery__Group_2_0__06915);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3467:1: rule__EQuery__Group_2_0__0__Impl : ( 'FROM' ) ;
    public final void rule__EQuery__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3471:1: ( ( 'FROM' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3472:1: ( 'FROM' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3472:1: ( 'FROM' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3473:1: 'FROM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__EQuery__Group_2_0__0__Impl6943); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3486:1: rule__EQuery__Group_2_0__1 : rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2 ;
    public final void rule__EQuery__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3490:1: ( rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3491:2: rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__1__Impl_in_rule__EQuery__Group_2_0__16974);
            rule__EQuery__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__2_in_rule__EQuery__Group_2_0__16977);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3498:1: rule__EQuery__Group_2_0__1__Impl : ( ( rule__EQuery__FromAssignment_2_0_1 ) ) ;
    public final void rule__EQuery__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3502:1: ( ( ( rule__EQuery__FromAssignment_2_0_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3503:1: ( ( rule__EQuery__FromAssignment_2_0_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3503:1: ( ( rule__EQuery__FromAssignment_2_0_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3504:1: ( rule__EQuery__FromAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFromAssignment_2_0_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3505:1: ( rule__EQuery__FromAssignment_2_0_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3505:2: rule__EQuery__FromAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__EQuery__FromAssignment_2_0_1_in_rule__EQuery__Group_2_0__1__Impl7004);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3515:1: rule__EQuery__Group_2_0__2 : rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3 ;
    public final void rule__EQuery__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3519:1: ( rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3520:2: rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__2__Impl_in_rule__EQuery__Group_2_0__27034);
            rule__EQuery__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__3_in_rule__EQuery__Group_2_0__27037);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3527:1: rule__EQuery__Group_2_0__2__Impl : ( ( rule__EQuery__Group_2_0_2__0 )? ) ;
    public final void rule__EQuery__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3531:1: ( ( ( rule__EQuery__Group_2_0_2__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3532:1: ( ( rule__EQuery__Group_2_0_2__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3532:1: ( ( rule__EQuery__Group_2_0_2__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3533:1: ( rule__EQuery__Group_2_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3534:1: ( rule__EQuery__Group_2_0_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3534:2: rule__EQuery__Group_2_0_2__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__0_in_rule__EQuery__Group_2_0__2__Impl7064);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3544:1: rule__EQuery__Group_2_0__3 : rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4 ;
    public final void rule__EQuery__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3548:1: ( rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3549:2: rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__3__Impl_in_rule__EQuery__Group_2_0__37095);
            rule__EQuery__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__4_in_rule__EQuery__Group_2_0__37098);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3556:1: rule__EQuery__Group_2_0__3__Impl : ( ( rule__EQuery__Group_2_0_3__0 )? ) ;
    public final void rule__EQuery__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3560:1: ( ( ( rule__EQuery__Group_2_0_3__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3561:1: ( ( rule__EQuery__Group_2_0_3__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3561:1: ( ( rule__EQuery__Group_2_0_3__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3562:1: ( rule__EQuery__Group_2_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3563:1: ( rule__EQuery__Group_2_0_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3563:2: rule__EQuery__Group_2_0_3__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__0_in_rule__EQuery__Group_2_0__3__Impl7125);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3573:1: rule__EQuery__Group_2_0__4 : rule__EQuery__Group_2_0__4__Impl ;
    public final void rule__EQuery__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3577:1: ( rule__EQuery__Group_2_0__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3578:2: rule__EQuery__Group_2_0__4__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__4__Impl_in_rule__EQuery__Group_2_0__47156);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3584:1: rule__EQuery__Group_2_0__4__Impl : ( ( rule__EQuery__Group_2_0_4__0 )? ) ;
    public final void rule__EQuery__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3588:1: ( ( ( rule__EQuery__Group_2_0_4__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3589:1: ( ( rule__EQuery__Group_2_0_4__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3589:1: ( ( rule__EQuery__Group_2_0_4__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3590:1: ( rule__EQuery__Group_2_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_4()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3591:1: ( rule__EQuery__Group_2_0_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3591:2: rule__EQuery__Group_2_0_4__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__0_in_rule__EQuery__Group_2_0__4__Impl7183);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3611:1: rule__EQuery__Group_2_0_2__0 : rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1 ;
    public final void rule__EQuery__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3615:1: ( rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3616:2: rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__0__Impl_in_rule__EQuery__Group_2_0_2__07224);
            rule__EQuery__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__1_in_rule__EQuery__Group_2_0_2__07227);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3623:1: rule__EQuery__Group_2_0_2__0__Impl : ( 'WHERE' ) ;
    public final void rule__EQuery__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3627:1: ( ( 'WHERE' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3628:1: ( 'WHERE' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3628:1: ( 'WHERE' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3629:1: 'WHERE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__EQuery__Group_2_0_2__0__Impl7255); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3642:1: rule__EQuery__Group_2_0_2__1 : rule__EQuery__Group_2_0_2__1__Impl ;
    public final void rule__EQuery__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3646:1: ( rule__EQuery__Group_2_0_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3647:2: rule__EQuery__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__1__Impl_in_rule__EQuery__Group_2_0_2__17286);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3653:1: rule__EQuery__Group_2_0_2__1__Impl : ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) ) ;
    public final void rule__EQuery__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3657:1: ( ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3658:1: ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3658:1: ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3659:1: ( rule__EQuery__WhereAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWhereAssignment_2_0_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3660:1: ( rule__EQuery__WhereAssignment_2_0_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3660:2: rule__EQuery__WhereAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_rule__EQuery__WhereAssignment_2_0_2_1_in_rule__EQuery__Group_2_0_2__1__Impl7313);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3674:1: rule__EQuery__Group_2_0_3__0 : rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1 ;
    public final void rule__EQuery__Group_2_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3678:1: ( rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3679:2: rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__0__Impl_in_rule__EQuery__Group_2_0_3__07347);
            rule__EQuery__Group_2_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__1_in_rule__EQuery__Group_2_0_3__07350);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3686:1: rule__EQuery__Group_2_0_3__0__Impl : ( 'GROUP BY' ) ;
    public final void rule__EQuery__Group_2_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3690:1: ( ( 'GROUP BY' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3691:1: ( 'GROUP BY' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3691:1: ( 'GROUP BY' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3692:1: 'GROUP BY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__EQuery__Group_2_0_3__0__Impl7378); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3705:1: rule__EQuery__Group_2_0_3__1 : rule__EQuery__Group_2_0_3__1__Impl ;
    public final void rule__EQuery__Group_2_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3709:1: ( rule__EQuery__Group_2_0_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3710:2: rule__EQuery__Group_2_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__1__Impl_in_rule__EQuery__Group_2_0_3__17409);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3716:1: rule__EQuery__Group_2_0_3__1__Impl : ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) ) ;
    public final void rule__EQuery__Group_2_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3720:1: ( ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3721:1: ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3721:1: ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3722:1: ( rule__EQuery__GroupByAssignment_2_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroupByAssignment_2_0_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3723:1: ( rule__EQuery__GroupByAssignment_2_0_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3723:2: rule__EQuery__GroupByAssignment_2_0_3_1
            {
            pushFollow(FOLLOW_rule__EQuery__GroupByAssignment_2_0_3_1_in_rule__EQuery__Group_2_0_3__1__Impl7436);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3737:1: rule__EQuery__Group_2_0_4__0 : rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1 ;
    public final void rule__EQuery__Group_2_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3741:1: ( rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3742:2: rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__0__Impl_in_rule__EQuery__Group_2_0_4__07470);
            rule__EQuery__Group_2_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__1_in_rule__EQuery__Group_2_0_4__07473);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3749:1: rule__EQuery__Group_2_0_4__0__Impl : ( 'ORDER BY' ) ;
    public final void rule__EQuery__Group_2_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3753:1: ( ( 'ORDER BY' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3754:1: ( 'ORDER BY' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3754:1: ( 'ORDER BY' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3755:1: 'ORDER BY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__EQuery__Group_2_0_4__0__Impl7501); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3768:1: rule__EQuery__Group_2_0_4__1 : rule__EQuery__Group_2_0_4__1__Impl ;
    public final void rule__EQuery__Group_2_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3772:1: ( rule__EQuery__Group_2_0_4__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3773:2: rule__EQuery__Group_2_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__1__Impl_in_rule__EQuery__Group_2_0_4__17532);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3779:1: rule__EQuery__Group_2_0_4__1__Impl : ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) ) ;
    public final void rule__EQuery__Group_2_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3783:1: ( ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3784:1: ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3784:1: ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3785:1: ( rule__EQuery__OrderbyAssignment_2_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getOrderbyAssignment_2_0_4_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3786:1: ( rule__EQuery__OrderbyAssignment_2_0_4_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3786:2: rule__EQuery__OrderbyAssignment_2_0_4_1
            {
            pushFollow(FOLLOW_rule__EQuery__OrderbyAssignment_2_0_4_1_in_rule__EQuery__Group_2_0_4__1__Impl7559);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3800:1: rule__EObjectSection__Group__0 : rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1 ;
    public final void rule__EObjectSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3804:1: ( rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3805:2: rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__0__Impl_in_rule__EObjectSection__Group__07593);
            rule__EObjectSection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group__1_in_rule__EObjectSection__Group__07596);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3812:1: rule__EObjectSection__Group__0__Impl : ( ( rule__EObjectSection__EntityAssignment_0 ) ) ;
    public final void rule__EObjectSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3816:1: ( ( ( rule__EObjectSection__EntityAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3817:1: ( ( rule__EObjectSection__EntityAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3817:1: ( ( rule__EObjectSection__EntityAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3818:1: ( rule__EObjectSection__EntityAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3819:1: ( rule__EObjectSection__EntityAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3819:2: rule__EObjectSection__EntityAssignment_0
            {
            pushFollow(FOLLOW_rule__EObjectSection__EntityAssignment_0_in_rule__EObjectSection__Group__0__Impl7623);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3829:1: rule__EObjectSection__Group__1 : rule__EObjectSection__Group__1__Impl ;
    public final void rule__EObjectSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3833:1: ( rule__EObjectSection__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3834:2: rule__EObjectSection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__1__Impl_in_rule__EObjectSection__Group__17653);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3840:1: rule__EObjectSection__Group__1__Impl : ( ( rule__EObjectSection__Group_1__0 )? ) ;
    public final void rule__EObjectSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3844:1: ( ( ( rule__EObjectSection__Group_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3845:1: ( ( rule__EObjectSection__Group_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3845:1: ( ( rule__EObjectSection__Group_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3846:1: ( rule__EObjectSection__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3847:1: ( rule__EObjectSection__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3847:2: rule__EObjectSection__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EObjectSection__Group_1__0_in_rule__EObjectSection__Group__1__Impl7680);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3861:1: rule__EObjectSection__Group_1__0 : rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1 ;
    public final void rule__EObjectSection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3865:1: ( rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3866:2: rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__0__Impl_in_rule__EObjectSection__Group_1__07715);
            rule__EObjectSection__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__1_in_rule__EObjectSection__Group_1__07718);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3873:1: rule__EObjectSection__Group_1__0__Impl : ( ( rule__EObjectSection__PrefixAssignment_1_0 ) ) ;
    public final void rule__EObjectSection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3877:1: ( ( ( rule__EObjectSection__PrefixAssignment_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3878:1: ( ( rule__EObjectSection__PrefixAssignment_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3878:1: ( ( rule__EObjectSection__PrefixAssignment_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3879:1: ( rule__EObjectSection__PrefixAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getPrefixAssignment_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3880:1: ( rule__EObjectSection__PrefixAssignment_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3880:2: rule__EObjectSection__PrefixAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EObjectSection__PrefixAssignment_1_0_in_rule__EObjectSection__Group_1__0__Impl7745);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3890:1: rule__EObjectSection__Group_1__1 : rule__EObjectSection__Group_1__1__Impl ;
    public final void rule__EObjectSection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3894:1: ( rule__EObjectSection__Group_1__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3895:2: rule__EObjectSection__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__1__Impl_in_rule__EObjectSection__Group_1__17775);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3901:1: rule__EObjectSection__Group_1__1__Impl : ( ( rule__EObjectSection__Group_1_1__0 )? ) ;
    public final void rule__EObjectSection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3905:1: ( ( ( rule__EObjectSection__Group_1_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3906:1: ( ( rule__EObjectSection__Group_1_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3906:1: ( ( rule__EObjectSection__Group_1_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3907:1: ( rule__EObjectSection__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3908:1: ( rule__EObjectSection__Group_1_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3908:2: rule__EObjectSection__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__0_in_rule__EObjectSection__Group_1__1__Impl7802);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3922:1: rule__EObjectSection__Group_1_1__0 : rule__EObjectSection__Group_1_1__0__Impl rule__EObjectSection__Group_1_1__1 ;
    public final void rule__EObjectSection__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3926:1: ( rule__EObjectSection__Group_1_1__0__Impl rule__EObjectSection__Group_1_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3927:2: rule__EObjectSection__Group_1_1__0__Impl rule__EObjectSection__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__0__Impl_in_rule__EObjectSection__Group_1_1__07837);
            rule__EObjectSection__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__1_in_rule__EObjectSection__Group_1_1__07840);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3934:1: rule__EObjectSection__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__EObjectSection__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3938:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3939:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3939:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3940:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__EObjectSection__Group_1_1__0__Impl7868); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3953:1: rule__EObjectSection__Group_1_1__1 : rule__EObjectSection__Group_1_1__1__Impl rule__EObjectSection__Group_1_1__2 ;
    public final void rule__EObjectSection__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3957:1: ( rule__EObjectSection__Group_1_1__1__Impl rule__EObjectSection__Group_1_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3958:2: rule__EObjectSection__Group_1_1__1__Impl rule__EObjectSection__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__1__Impl_in_rule__EObjectSection__Group_1_1__17899);
            rule__EObjectSection__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__2_in_rule__EObjectSection__Group_1_1__17902);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3965:1: rule__EObjectSection__Group_1_1__1__Impl : ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) ) ;
    public final void rule__EObjectSection__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3969:1: ( ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3970:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3970:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3971:1: ( rule__EObjectSection__AttributesAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_1_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3972:1: ( rule__EObjectSection__AttributesAssignment_1_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3972:2: rule__EObjectSection__AttributesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_1_in_rule__EObjectSection__Group_1_1__1__Impl7929);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3982:1: rule__EObjectSection__Group_1_1__2 : rule__EObjectSection__Group_1_1__2__Impl rule__EObjectSection__Group_1_1__3 ;
    public final void rule__EObjectSection__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3986:1: ( rule__EObjectSection__Group_1_1__2__Impl rule__EObjectSection__Group_1_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3987:2: rule__EObjectSection__Group_1_1__2__Impl rule__EObjectSection__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__2__Impl_in_rule__EObjectSection__Group_1_1__27959);
            rule__EObjectSection__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__3_in_rule__EObjectSection__Group_1_1__27962);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3994:1: rule__EObjectSection__Group_1_1__2__Impl : ( ( rule__EObjectSection__Group_1_1_2__0 )* ) ;
    public final void rule__EObjectSection__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3998:1: ( ( ( rule__EObjectSection__Group_1_1_2__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3999:1: ( ( rule__EObjectSection__Group_1_1_2__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3999:1: ( ( rule__EObjectSection__Group_1_1_2__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4000:1: ( rule__EObjectSection__Group_1_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1_1_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4001:1: ( rule__EObjectSection__Group_1_1_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==19) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4001:2: rule__EObjectSection__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__0_in_rule__EObjectSection__Group_1_1__2__Impl7989);
            	    rule__EObjectSection__Group_1_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4011:1: rule__EObjectSection__Group_1_1__3 : rule__EObjectSection__Group_1_1__3__Impl ;
    public final void rule__EObjectSection__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4015:1: ( rule__EObjectSection__Group_1_1__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4016:2: rule__EObjectSection__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__3__Impl_in_rule__EObjectSection__Group_1_1__38020);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4022:1: rule__EObjectSection__Group_1_1__3__Impl : ( '}' ) ;
    public final void rule__EObjectSection__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4026:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4027:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4027:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4028:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getRightCurlyBracketKeyword_1_1_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__EObjectSection__Group_1_1__3__Impl8048); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4049:1: rule__EObjectSection__Group_1_1_2__0 : rule__EObjectSection__Group_1_1_2__0__Impl rule__EObjectSection__Group_1_1_2__1 ;
    public final void rule__EObjectSection__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4053:1: ( rule__EObjectSection__Group_1_1_2__0__Impl rule__EObjectSection__Group_1_1_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4054:2: rule__EObjectSection__Group_1_1_2__0__Impl rule__EObjectSection__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__0__Impl_in_rule__EObjectSection__Group_1_1_2__08087);
            rule__EObjectSection__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__1_in_rule__EObjectSection__Group_1_1_2__08090);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4061:1: rule__EObjectSection__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__EObjectSection__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4065:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4066:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4066:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4067:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_1_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EObjectSection__Group_1_1_2__0__Impl8118); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4080:1: rule__EObjectSection__Group_1_1_2__1 : rule__EObjectSection__Group_1_1_2__1__Impl ;
    public final void rule__EObjectSection__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4084:1: ( rule__EObjectSection__Group_1_1_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4085:2: rule__EObjectSection__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__1__Impl_in_rule__EObjectSection__Group_1_1_2__18149);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4091:1: rule__EObjectSection__Group_1_1_2__1__Impl : ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) ) ;
    public final void rule__EObjectSection__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4095:1: ( ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4096:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4096:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4097:1: ( rule__EObjectSection__AttributesAssignment_1_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_1_1_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4098:1: ( rule__EObjectSection__AttributesAssignment_1_1_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4098:2: rule__EObjectSection__AttributesAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_2_1_in_rule__EObjectSection__Group_1_1_2__1__Impl8176);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4112:1: rule__EMappingAttribute__Group__0 : rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1 ;
    public final void rule__EMappingAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4116:1: ( rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4117:2: rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__0__Impl_in_rule__EMappingAttribute__Group__08210);
            rule__EMappingAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__1_in_rule__EMappingAttribute__Group__08213);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4124:1: rule__EMappingAttribute__Group__0__Impl : ( ( rule__EMappingAttribute__PkAssignment_0 )? ) ;
    public final void rule__EMappingAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4128:1: ( ( ( rule__EMappingAttribute__PkAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4129:1: ( ( rule__EMappingAttribute__PkAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4129:1: ( ( rule__EMappingAttribute__PkAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4130:1: ( rule__EMappingAttribute__PkAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4131:1: ( rule__EMappingAttribute__PkAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4131:2: rule__EMappingAttribute__PkAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__PkAssignment_0_in_rule__EMappingAttribute__Group__0__Impl8240);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4141:1: rule__EMappingAttribute__Group__1 : rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2 ;
    public final void rule__EMappingAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4145:1: ( rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4146:2: rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__1__Impl_in_rule__EMappingAttribute__Group__18271);
            rule__EMappingAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__2_in_rule__EMappingAttribute__Group__18274);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4153:1: rule__EMappingAttribute__Group__1__Impl : ( ( rule__EMappingAttribute__PropertyAssignment_1 ) ) ;
    public final void rule__EMappingAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4157:1: ( ( ( rule__EMappingAttribute__PropertyAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4158:1: ( ( rule__EMappingAttribute__PropertyAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4158:1: ( ( rule__EMappingAttribute__PropertyAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4159:1: ( rule__EMappingAttribute__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPropertyAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4160:1: ( rule__EMappingAttribute__PropertyAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4160:2: rule__EMappingAttribute__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__PropertyAssignment_1_in_rule__EMappingAttribute__Group__1__Impl8301);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4170:1: rule__EMappingAttribute__Group__2 : rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3 ;
    public final void rule__EMappingAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4174:1: ( rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4175:2: rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__2__Impl_in_rule__EMappingAttribute__Group__28331);
            rule__EMappingAttribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__3_in_rule__EMappingAttribute__Group__28334);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4182:1: rule__EMappingAttribute__Group__2__Impl : ( '=>' ) ;
    public final void rule__EMappingAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4186:1: ( ( '=>' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4187:1: ( '=>' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4187:1: ( '=>' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4188:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__EMappingAttribute__Group__2__Impl8362); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4201:1: rule__EMappingAttribute__Group__3 : rule__EMappingAttribute__Group__3__Impl ;
    public final void rule__EMappingAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4205:1: ( rule__EMappingAttribute__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4206:2: rule__EMappingAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__3__Impl_in_rule__EMappingAttribute__Group__38393);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4212:1: rule__EMappingAttribute__Group__3__Impl : ( ( rule__EMappingAttribute__Alternatives_3 ) ) ;
    public final void rule__EMappingAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4216:1: ( ( ( rule__EMappingAttribute__Alternatives_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4217:1: ( ( rule__EMappingAttribute__Alternatives_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4217:1: ( ( rule__EMappingAttribute__Alternatives_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4218:1: ( rule__EMappingAttribute__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4219:1: ( rule__EMappingAttribute__Alternatives_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4219:2: rule__EMappingAttribute__Alternatives_3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Alternatives_3_in_rule__EMappingAttribute__Group__3__Impl8420);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4237:1: rule__EMappingAttribute__Group_3_1__0 : rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1 ;
    public final void rule__EMappingAttribute__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4241:1: ( rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4242:2: rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__0__Impl_in_rule__EMappingAttribute__Group_3_1__08458);
            rule__EMappingAttribute__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__1_in_rule__EMappingAttribute__Group_3_1__08461);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4249:1: rule__EMappingAttribute__Group_3_1__0__Impl : ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4253:1: ( ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4254:1: ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4254:1: ( ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4255:1: ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getResolvedAssignment_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4256:1: ( rule__EMappingAttribute__ResolvedAssignment_3_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4256:2: rule__EMappingAttribute__ResolvedAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__ResolvedAssignment_3_1_0_in_rule__EMappingAttribute__Group_3_1__0__Impl8488);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4266:1: rule__EMappingAttribute__Group_3_1__1 : rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2 ;
    public final void rule__EMappingAttribute__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4270:1: ( rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4271:2: rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__1__Impl_in_rule__EMappingAttribute__Group_3_1__18518);
            rule__EMappingAttribute__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__2_in_rule__EMappingAttribute__Group_3_1__18521);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4278:1: rule__EMappingAttribute__Group_3_1__1__Impl : ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4282:1: ( ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4283:1: ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4283:1: ( ( rule__EMappingAttribute__QueryAssignment_3_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4284:1: ( rule__EMappingAttribute__QueryAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getQueryAssignment_3_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4285:1: ( rule__EMappingAttribute__QueryAssignment_3_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4285:2: rule__EMappingAttribute__QueryAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__QueryAssignment_3_1_1_in_rule__EMappingAttribute__Group_3_1__1__Impl8548);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4295:1: rule__EMappingAttribute__Group_3_1__2 : rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3 ;
    public final void rule__EMappingAttribute__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4299:1: ( rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4300:2: rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__2__Impl_in_rule__EMappingAttribute__Group_3_1__28578);
            rule__EMappingAttribute__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__3_in_rule__EMappingAttribute__Group_3_1__28581);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4307:1: rule__EMappingAttribute__Group_3_1__2__Impl : ( '(' ) ;
    public final void rule__EMappingAttribute__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4311:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4312:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4312:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4313:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__EMappingAttribute__Group_3_1__2__Impl8609); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4326:1: rule__EMappingAttribute__Group_3_1__3 : rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4 ;
    public final void rule__EMappingAttribute__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4330:1: ( rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4331:2: rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__3__Impl_in_rule__EMappingAttribute__Group_3_1__38640);
            rule__EMappingAttribute__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__4_in_rule__EMappingAttribute__Group_3_1__38643);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4338:1: rule__EMappingAttribute__Group_3_1__3__Impl : ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4342:1: ( ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4343:1: ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4343:1: ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4344:1: ( rule__EMappingAttribute__ParametersAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getParametersAssignment_3_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4345:1: ( rule__EMappingAttribute__ParametersAssignment_3_1_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4345:2: rule__EMappingAttribute__ParametersAssignment_3_1_3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__ParametersAssignment_3_1_3_in_rule__EMappingAttribute__Group_3_1__3__Impl8670);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4355:1: rule__EMappingAttribute__Group_3_1__4 : rule__EMappingAttribute__Group_3_1__4__Impl ;
    public final void rule__EMappingAttribute__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4359:1: ( rule__EMappingAttribute__Group_3_1__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4360:2: rule__EMappingAttribute__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__4__Impl_in_rule__EMappingAttribute__Group_3_1__48700);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4366:1: rule__EMappingAttribute__Group_3_1__4__Impl : ( ')' ) ;
    public final void rule__EMappingAttribute__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4370:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4371:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4371:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4372:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4()); 
            }
            match(input,30,FOLLOW_30_in_rule__EMappingAttribute__Group_3_1__4__Impl8728); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4395:1: rule__EMappingAttribute__Group_3_2__0 : rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1 ;
    public final void rule__EMappingAttribute__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4399:1: ( rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4400:2: rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__0__Impl_in_rule__EMappingAttribute__Group_3_2__08769);
            rule__EMappingAttribute__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__1_in_rule__EMappingAttribute__Group_3_2__08772);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4407:1: rule__EMappingAttribute__Group_3_2__0__Impl : ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) ) ;
    public final void rule__EMappingAttribute__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4411:1: ( ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4412:1: ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4412:1: ( ( rule__EMappingAttribute__MappedAssignment_3_2_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4413:1: ( rule__EMappingAttribute__MappedAssignment_3_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMappedAssignment_3_2_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4414:1: ( rule__EMappingAttribute__MappedAssignment_3_2_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4414:2: rule__EMappingAttribute__MappedAssignment_3_2_0
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__MappedAssignment_3_2_0_in_rule__EMappingAttribute__Group_3_2__0__Impl8799);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4424:1: rule__EMappingAttribute__Group_3_2__1 : rule__EMappingAttribute__Group_3_2__1__Impl ;
    public final void rule__EMappingAttribute__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4428:1: ( rule__EMappingAttribute__Group_3_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4429:2: rule__EMappingAttribute__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__1__Impl_in_rule__EMappingAttribute__Group_3_2__18829);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4435:1: rule__EMappingAttribute__Group_3_2__1__Impl : ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) ) ;
    public final void rule__EMappingAttribute__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4439:1: ( ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4440:1: ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4440:1: ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4441:1: ( rule__EMappingAttribute__MapAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMapAssignment_3_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4442:1: ( rule__EMappingAttribute__MapAssignment_3_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4442:2: rule__EMappingAttribute__MapAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__MapAssignment_3_2_1_in_rule__EMappingAttribute__Group_3_2__1__Impl8856);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4456:1: rule__EType__Group__0 : rule__EType__Group__0__Impl rule__EType__Group__1 ;
    public final void rule__EType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4460:1: ( rule__EType__Group__0__Impl rule__EType__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4461:2: rule__EType__Group__0__Impl rule__EType__Group__1
            {
            pushFollow(FOLLOW_rule__EType__Group__0__Impl_in_rule__EType__Group__08890);
            rule__EType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__1_in_rule__EType__Group__08893);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4468:1: rule__EType__Group__0__Impl : ( 'etype' ) ;
    public final void rule__EType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4472:1: ( ( 'etype' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4473:1: ( 'etype' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4473:1: ( 'etype' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4474:1: 'etype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getEtypeKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__EType__Group__0__Impl8921); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4487:1: rule__EType__Group__1 : rule__EType__Group__1__Impl rule__EType__Group__2 ;
    public final void rule__EType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4491:1: ( rule__EType__Group__1__Impl rule__EType__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4492:2: rule__EType__Group__1__Impl rule__EType__Group__2
            {
            pushFollow(FOLLOW_rule__EType__Group__1__Impl_in_rule__EType__Group__18952);
            rule__EType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__2_in_rule__EType__Group__18955);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4499:1: rule__EType__Group__1__Impl : ( ( rule__EType__UrlAssignment_1 ) ) ;
    public final void rule__EType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4503:1: ( ( ( rule__EType__UrlAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4504:1: ( ( rule__EType__UrlAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4504:1: ( ( rule__EType__UrlAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4505:1: ( rule__EType__UrlAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getUrlAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4506:1: ( rule__EType__UrlAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4506:2: rule__EType__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__EType__UrlAssignment_1_in_rule__EType__Group__1__Impl8982);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4516:1: rule__EType__Group__2 : rule__EType__Group__2__Impl rule__EType__Group__3 ;
    public final void rule__EType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4520:1: ( rule__EType__Group__2__Impl rule__EType__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4521:2: rule__EType__Group__2__Impl rule__EType__Group__3
            {
            pushFollow(FOLLOW_rule__EType__Group__2__Impl_in_rule__EType__Group__29012);
            rule__EType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__3_in_rule__EType__Group__29015);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4528:1: rule__EType__Group__2__Impl : ( '#' ) ;
    public final void rule__EType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4532:1: ( ( '#' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4533:1: ( '#' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4533:1: ( '#' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4534:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNumberSignKeyword_2()); 
            }
            match(input,38,FOLLOW_38_in_rule__EType__Group__2__Impl9043); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4547:1: rule__EType__Group__3 : rule__EType__Group__3__Impl ;
    public final void rule__EType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4551:1: ( rule__EType__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4552:2: rule__EType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EType__Group__3__Impl_in_rule__EType__Group__39074);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4558:1: rule__EType__Group__3__Impl : ( ( rule__EType__NameAssignment_3 ) ) ;
    public final void rule__EType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4562:1: ( ( ( rule__EType__NameAssignment_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4563:1: ( ( rule__EType__NameAssignment_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4563:1: ( ( rule__EType__NameAssignment_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4564:1: ( rule__EType__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNameAssignment_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4565:1: ( rule__EType__NameAssignment_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4565:2: rule__EType__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__EType__NameAssignment_3_in_rule__EType__Group__3__Impl9101);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4583:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4587:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4588:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09139);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09142);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4595:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4599:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4600:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4600:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4601:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl9169); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4612:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4616:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4617:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19198);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4623:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4627:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4628:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4628:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4629:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4630:1: ( rule__QualifiedName__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==39) ) {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==RULE_ID) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4630:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9225);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4644:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4648:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4649:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09260);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09263);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4656:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4660:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4661:1: ( ( '.' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4661:1: ( ( '.' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4662:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4663:1: ( '.' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4664:2: '.'
            {
            match(input,39,FOLLOW_39_in_rule__QualifiedName__Group_1__0__Impl9292); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4675:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4679:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4680:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19324);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4686:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4690:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4691:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4691:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4692:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9351); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4707:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4711:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4712:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__09384);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__09387);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4719:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4723:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4724:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4724:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4725:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl9414);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4736:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4740:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4741:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__19443);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__19446);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4748:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4752:1: ( ( '.' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4753:1: ( '.' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4753:1: ( '.' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4754:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__QualifiedNameWithWildcard__Group__1__Impl9474); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4767:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4771:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4772:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__29505);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4778:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4782:1: ( ( '*' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4783:1: ( '*' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4783:1: ( '*' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4784:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__QualifiedNameWithWildcard__Group__2__Impl9533); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4804:1: rule__EMapping__RootAssignment : ( ( rule__EMapping__RootAlternatives_0 ) ) ;
    public final void rule__EMapping__RootAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4808:1: ( ( ( rule__EMapping__RootAlternatives_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4809:1: ( ( rule__EMapping__RootAlternatives_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4809:1: ( ( rule__EMapping__RootAlternatives_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4810:1: ( rule__EMapping__RootAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAccess().getRootAlternatives_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4811:1: ( rule__EMapping__RootAlternatives_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4811:2: rule__EMapping__RootAlternatives_0
            {
            pushFollow(FOLLOW_rule__EMapping__RootAlternatives_0_in_rule__EMapping__RootAssignment9575);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4820:1: rule__EMappingBundle__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__EMappingBundle__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4824:1: ( ( ruleImport ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4825:1: ( ruleImport )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4825:1: ( ruleImport )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4826:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__EMappingBundle__ImportsAssignment_09608);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4835:1: rule__EMappingBundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EMappingBundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4839:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4840:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4840:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4841:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__NameAssignment_29639); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4850:1: rule__EMappingBundle__EntitiesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EMappingBundle__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4854:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4855:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4855:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4856:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_4_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4857:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4858:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_49674); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4869:1: rule__EMappingBundle__EntitiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__EMappingBundle__EntitiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4873:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4874:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4874:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4875:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_5_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4876:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4877:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_5_19713); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4888:1: rule__EMappingEntityDef__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__EMappingEntityDef__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4892:1: ( ( rulePackageDeclaration ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4893:1: ( rulePackageDeclaration )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4893:1: ( rulePackageDeclaration )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4894:1: rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__EMappingEntityDef__PackageAssignment_09748);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4903:1: rule__EMappingEntityDef__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__EMappingEntityDef__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4907:1: ( ( ruleImport ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4908:1: ( ruleImport )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4908:1: ( ruleImport )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4909:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__EMappingEntityDef__ImportsAssignment_19779);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4918:1: rule__EMappingEntityDef__EntityAssignment_2 : ( ruleEMappingEntity ) ;
    public final void rule__EMappingEntityDef__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4922:1: ( ( ruleEMappingEntity ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4923:1: ( ruleEMappingEntity )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4923:1: ( ruleEMappingEntity )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4924:1: ruleEMappingEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getEntityEMappingEntityParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_rule__EMappingEntityDef__EntityAssignment_29810);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4933:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4937:1: ( ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4938:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4938:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4939:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4940:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4940:2: rule__Import__ImportedNamespaceAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_19841);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4949:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4953:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4954:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4954:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4955:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19874);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4964:1: rule__EMappingEntity__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__EMappingEntity__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4968:1: ( ( ( 'abstract' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4969:1: ( ( 'abstract' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4969:1: ( ( 'abstract' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4970:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4971:1: ( 'abstract' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4972:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__EMappingEntity__AbstractAssignment_09910); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4987:1: rule__EMappingEntity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EMappingEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4991:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4992:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4992:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4993:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingEntity__NameAssignment_29949); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5002:1: rule__EMappingEntity__ExtensionTypeAssignment_3_0 : ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) ) ;
    public final void rule__EMappingEntity__ExtensionTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5006:1: ( ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5007:1: ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5007:1: ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5008:1: ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getExtensionTypeAlternatives_3_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5009:1: ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5009:2: rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0_in_rule__EMappingEntity__ExtensionTypeAssignment_3_09980);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5018:1: rule__EMappingEntity__ParentAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EMappingEntity__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5022:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5023:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5023:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5024:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityCrossReference_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5025:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5026:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingEntity__ParentAssignment_3_110017);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5037:1: rule__EMappingEntity__EtypeAssignment_5 : ( ruleEType ) ;
    public final void rule__EMappingEntity__EtypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5041:1: ( ( ruleEType ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5042:1: ( ruleEType )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5042:1: ( ruleEType )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5043:1: ruleEType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEtypeETypeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleEType_in_rule__EMappingEntity__EtypeAssignment_510052);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5052:1: rule__EMappingEntity__AttributesAssignment_6_2 : ( ruleEAttribute ) ;
    public final void rule__EMappingEntity__AttributesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5056:1: ( ( ruleEAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5057:1: ( ruleEAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5057:1: ( ruleEAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5058:1: ruleEAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_6_210083);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5067:1: rule__EMappingEntity__AttributesAssignment_6_3_1 : ( ruleEAttribute ) ;
    public final void rule__EMappingEntity__AttributesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5071:1: ( ( ruleEAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5072:1: ( ruleEAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5072:1: ( ruleEAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5073:1: ruleEAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_6_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_6_3_110114);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5082:1: rule__EMappingEntity__NamedQueriesAssignment_7_2 : ( ruleENamedQuery ) ;
    public final void rule__EMappingEntity__NamedQueriesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5086:1: ( ( ruleENamedQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5087:1: ( ruleENamedQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5087:1: ( ruleENamedQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5088:1: ruleENamedQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_2_0()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_7_210145);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5097:1: rule__EMappingEntity__NamedQueriesAssignment_7_3_1 : ( ruleENamedQuery ) ;
    public final void rule__EMappingEntity__NamedQueriesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5101:1: ( ( ruleENamedQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5102:1: ( ruleENamedQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5102:1: ( ruleENamedQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5103:1: ruleENamedQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_7_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_7_3_110176);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5112:1: rule__EMappingEntity__TableNameAssignment_9_1 : ( RULE_ID ) ;
    public final void rule__EMappingEntity__TableNameAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5116:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5117:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5117:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5118:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getTableNameIDTerminalRuleCall_9_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingEntity__TableNameAssignment_9_110207); if (state.failed) return ;
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


    // $ANTLR start "rule__EAttribute__PkAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5127:1: rule__EAttribute__PkAssignment_0 : ( ( 'primarykey' ) ) ;
    public final void rule__EAttribute__PkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5131:1: ( ( ( 'primarykey' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5132:1: ( ( 'primarykey' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5132:1: ( ( 'primarykey' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5133:1: ( 'primarykey' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5134:1: ( 'primarykey' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5135:1: 'primarykey'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__EAttribute__PkAssignment_010243); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5150:1: rule__EAttribute__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__EAttribute__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5154:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5155:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5155:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5156:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPropertyIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__PropertyAssignment_110282); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5165:1: rule__EAttribute__ColumnNameAssignment_3_0_0 : ( RULE_ID ) ;
    public final void rule__EAttribute__ColumnNameAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5169:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5170:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5170:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5171:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__ColumnNameAssignment_3_0_010313); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5180:1: rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2 : ( ruleEValueGenerator ) ;
    public final void rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5184:1: ( ( ruleEValueGenerator ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5185:1: ( ruleEValueGenerator )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5185:1: ( ruleEValueGenerator )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5186:1: ruleEValueGenerator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleEValueGenerator_in_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_210344);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5195:1: rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1 : ( ruleEValueGenerator ) ;
    public final void rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5199:1: ( ( ruleEValueGenerator ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5200:1: ( ruleEValueGenerator )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5200:1: ( ruleEValueGenerator )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5201:1: ruleEValueGenerator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getValueGeneratorsEValueGeneratorParserRuleCall_3_0_1_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleEValueGenerator_in_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_110375);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5210:1: rule__EAttribute__ResolvedAssignment_3_1_0 : ( ( 'resolve' ) ) ;
    public final void rule__EAttribute__ResolvedAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5214:1: ( ( ( 'resolve' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5215:1: ( ( 'resolve' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5215:1: ( ( 'resolve' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5216:1: ( 'resolve' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5217:1: ( 'resolve' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5218:1: 'resolve'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__EAttribute__ResolvedAssignment_3_1_010411); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5233:1: rule__EAttribute__QueryAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EAttribute__QueryAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5237:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5238:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5238:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5239:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5240:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5241:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EAttribute__QueryAssignment_3_1_110454);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5252:1: rule__EAttribute__ParametersAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__EAttribute__ParametersAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5256:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5257:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5257:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5258:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__ParametersAssignment_3_1_310489); if (state.failed) return ;
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


    // $ANTLR start "rule__EValueGenerator__DbTypeAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5267:1: rule__EValueGenerator__DbTypeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EValueGenerator__DbTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5271:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5272:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5272:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5273:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getDbTypeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EValueGenerator__DbTypeAssignment_010520); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5282:1: rule__EValueGenerator__AutokeyAssignment_1_0 : ( ( 'autokey' ) ) ;
    public final void rule__EValueGenerator__AutokeyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5286:1: ( ( ( 'autokey' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5287:1: ( ( 'autokey' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5287:1: ( ( 'autokey' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5288:1: ( 'autokey' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getAutokeyAutokeyKeyword_1_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5289:1: ( 'autokey' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5290:1: 'autokey'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getAutokeyAutokeyKeyword_1_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__EValueGenerator__AutokeyAssignment_1_010556); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5305:1: rule__EValueGenerator__QueryAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__EValueGenerator__QueryAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5309:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5310:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5310:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5311:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getQuerySTRINGTerminalRuleCall_1_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EValueGenerator__QueryAssignment_1_1_110595); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5320:1: rule__EValueGenerator__SequenceAssignment_1_2_1 : ( RULE_STRING ) ;
    public final void rule__EValueGenerator__SequenceAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5324:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5325:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5325:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5326:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEValueGeneratorAccess().getSequenceSTRINGTerminalRuleCall_1_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EValueGenerator__SequenceAssignment_1_2_110626); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5335:1: rule__ENamedQuery__ReturnTypeAssignment_0 : ( ruleReturnType ) ;
    public final void rule__ENamedQuery__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5339:1: ( ( ruleReturnType ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5340:1: ( ruleReturnType )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5340:1: ( ruleReturnType )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5341:1: ruleReturnType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getReturnTypeReturnTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleReturnType_in_rule__ENamedQuery__ReturnTypeAssignment_010657);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5350:1: rule__ENamedQuery__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ENamedQuery__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5354:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5355:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5355:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5356:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ENamedQuery__NameAssignment_110688); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5365:1: rule__ENamedQuery__ParametersAssignment_2_1 : ( ruleEParameter ) ;
    public final void rule__ENamedQuery__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5369:1: ( ( ruleEParameter ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5370:1: ( ruleEParameter )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5370:1: ( ruleEParameter )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5371:1: ruleEParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_rule__ENamedQuery__ParametersAssignment_2_110719);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5380:1: rule__ENamedQuery__QueriesAssignment_4 : ( ruleEQuery ) ;
    public final void rule__ENamedQuery__QueriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5384:1: ( ( ruleEQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5385:1: ( ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5385:1: ( ruleEQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5386:1: ruleEQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_410750);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5395:1: rule__ENamedQuery__QueriesAssignment_5_1 : ( ruleEQuery ) ;
    public final void rule__ENamedQuery__QueriesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5399:1: ( ( ruleEQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5400:1: ( ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5400:1: ( ruleEQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5401:1: ruleEQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_5_110781);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5410:1: rule__EParameter__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__EParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5414:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5415:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5415:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5416:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getTypeIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EParameter__TypeAssignment_010812); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5425:1: rule__EParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5429:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5430:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5430:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5431:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EParameter__NameAssignment_110843); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5440:1: rule__EQuery__DbTypeAssignment_0 : ( ( rule__EQuery__DbTypeAlternatives_0_0 ) ) ;
    public final void rule__EQuery__DbTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5444:1: ( ( ( rule__EQuery__DbTypeAlternatives_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5445:1: ( ( rule__EQuery__DbTypeAlternatives_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5445:1: ( ( rule__EQuery__DbTypeAlternatives_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5446:1: ( rule__EQuery__DbTypeAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getDbTypeAlternatives_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5447:1: ( rule__EQuery__DbTypeAlternatives_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5447:2: rule__EQuery__DbTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__EQuery__DbTypeAlternatives_0_0_in_rule__EQuery__DbTypeAssignment_010874);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5456:1: rule__EQuery__MappingAssignment_1 : ( ruleEObjectSection ) ;
    public final void rule__EQuery__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5460:1: ( ( ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5461:1: ( ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5461:1: ( ruleEObjectSection )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5462:1: ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_rule__EQuery__MappingAssignment_110907);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5471:1: rule__EQuery__FromAssignment_2_0_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__FromAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5475:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5476:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5476:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5477:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFromSTRINGTerminalRuleCall_2_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__FromAssignment_2_0_110938); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5486:1: rule__EQuery__WhereAssignment_2_0_2_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__WhereAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5490:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5491:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5491:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5492:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWhereSTRINGTerminalRuleCall_2_0_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__WhereAssignment_2_0_2_110969); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5501:1: rule__EQuery__GroupByAssignment_2_0_3_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__GroupByAssignment_2_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5505:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5506:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5506:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5507:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroupBySTRINGTerminalRuleCall_2_0_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__GroupByAssignment_2_0_3_111000); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5516:1: rule__EQuery__OrderbyAssignment_2_0_4_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__OrderbyAssignment_2_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5520:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5521:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5521:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5522:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getOrderbySTRINGTerminalRuleCall_2_0_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__OrderbyAssignment_2_0_4_111031); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5531:1: rule__EQuery__AllAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__AllAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5535:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5536:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5536:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5537:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getAllSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__AllAssignment_2_111062); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5546:1: rule__EObjectSection__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EObjectSection__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5550:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5551:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5551:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5552:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5553:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5554:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EObjectSection__EntityAssignment_011097); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5565:1: rule__EObjectSection__PrefixAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__EObjectSection__PrefixAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5569:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5570:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5570:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5571:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getPrefixIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EObjectSection__PrefixAssignment_1_011132); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5580:1: rule__EObjectSection__AttributesAssignment_1_1_1 : ( ruleEMappingAttribute ) ;
    public final void rule__EObjectSection__AttributesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5584:1: ( ( ruleEMappingAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5585:1: ( ruleEMappingAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5585:1: ( ruleEMappingAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5586:1: ruleEMappingAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_111163);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5595:1: rule__EObjectSection__AttributesAssignment_1_1_2_1 : ( ruleEMappingAttribute ) ;
    public final void rule__EObjectSection__AttributesAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5599:1: ( ( ruleEMappingAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5600:1: ( ruleEMappingAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5600:1: ( ruleEMappingAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5601:1: ruleEMappingAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_1_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_2_111194);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5610:1: rule__EMappingAttribute__PkAssignment_0 : ( ( 'primarykey' ) ) ;
    public final void rule__EMappingAttribute__PkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5614:1: ( ( ( 'primarykey' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5615:1: ( ( 'primarykey' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5615:1: ( ( 'primarykey' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5616:1: ( 'primarykey' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5617:1: ( 'primarykey' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5618:1: 'primarykey'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__EMappingAttribute__PkAssignment_011230); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5633:1: rule__EMappingAttribute__PropertyAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__EMappingAttribute__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5637:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5638:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5638:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5639:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__PropertyAssignment_111269);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5648:1: rule__EMappingAttribute__ColumnNameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__EMappingAttribute__ColumnNameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5652:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5653:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5653:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5654:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingAttribute__ColumnNameAssignment_3_011300); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5663:1: rule__EMappingAttribute__ResolvedAssignment_3_1_0 : ( ( 'resolve' ) ) ;
    public final void rule__EMappingAttribute__ResolvedAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5667:1: ( ( ( 'resolve' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5668:1: ( ( 'resolve' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5668:1: ( ( 'resolve' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5669:1: ( 'resolve' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5670:1: ( 'resolve' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5671:1: 'resolve'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__EMappingAttribute__ResolvedAssignment_3_1_011336); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5686:1: rule__EMappingAttribute__QueryAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EMappingAttribute__QueryAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5690:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5691:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5691:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5692:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5693:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5694:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getQueryENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__QueryAssignment_3_1_111379);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5705:1: rule__EMappingAttribute__ParametersAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__EMappingAttribute__ParametersAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5709:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5710:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5710:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5711:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingAttribute__ParametersAssignment_3_1_311414); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5720:1: rule__EMappingAttribute__MappedAssignment_3_2_0 : ( ( 'map' ) ) ;
    public final void rule__EMappingAttribute__MappedAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5724:1: ( ( ( 'map' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5725:1: ( ( 'map' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5725:1: ( ( 'map' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5726:1: ( 'map' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMappedMapKeyword_3_2_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5727:1: ( 'map' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5728:1: 'map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMappedMapKeyword_3_2_0_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__EMappingAttribute__MappedAssignment_3_2_011450); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5743:1: rule__EMappingAttribute__MapAssignment_3_2_1 : ( ruleEObjectSection ) ;
    public final void rule__EMappingAttribute__MapAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5747:1: ( ( ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5748:1: ( ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5748:1: ( ruleEObjectSection )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5749:1: ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_rule__EMappingAttribute__MapAssignment_3_2_111489);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5758:1: rule__EType__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EType__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5762:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5763:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5763:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5764:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EType__UrlAssignment_111520); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5773:1: rule__EType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__EType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5777:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5778:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5778:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:5779:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EType__NameAssignment_311551); if (state.failed) return ;
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
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA2_minS =
        "\1\5\1\20\1\5\2\uffff\1\20";
    static final String DFA2_maxS =
        "\1\5\1\51\1\50\2\uffff\1\51";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\3\uffff\1\3\2\uffff\1\3\17\uffff\1\2\1\uffff\1\3",
            "\1\5\42\uffff\1\4",
            "",
            "",
            "\1\3\3\uffff\1\3\2\uffff\1\3\17\uffff\1\2\1\uffff\1\3"
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
    public static final BitSet FOLLOW_rule__EMappingBundle__ImportsAssignment_0_in_rule__EMappingBundle__Group__0__Impl1602 = new BitSet(new long[]{0x0000000000100002L});
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
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__6__Impl_in_rule__EMappingBundle__Group__61938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingBundle__Group__6__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__0__Impl_in_rule__EMappingBundle__Group_5__02011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__1_in_rule__EMappingBundle__Group_5__02014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EMappingBundle__Group_5__0__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__1__Impl_in_rule__EMappingBundle__Group_5__12073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__EntitiesAssignment_5_1_in_rule__EMappingBundle__Group_5__1__Impl2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__0__Impl_in_rule__EMappingEntityDef__Group__02134 = new BitSet(new long[]{0x0000020000900000L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__1_in_rule__EMappingEntityDef__Group__02137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__PackageAssignment_0_in_rule__EMappingEntityDef__Group__0__Impl2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__1__Impl_in_rule__EMappingEntityDef__Group__12194 = new BitSet(new long[]{0x0000020000900000L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__2_in_rule__EMappingEntityDef__Group__12197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__ImportsAssignment_1_in_rule__EMappingEntityDef__Group__1__Impl2224 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__2__Impl_in_rule__EMappingEntityDef__Group__22255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__EntityAssignment_2_in_rule__EMappingEntityDef__Group__2__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Import__Group__0__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDeclaration__Group__0__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12503 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group__2__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__0__Impl_in_rule__EMappingEntity__Group__02628 = new BitSet(new long[]{0x0000020000900000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__1_in_rule__EMappingEntity__Group__02631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AbstractAssignment_0_in_rule__EMappingEntity__Group__0__Impl2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__1__Impl_in_rule__EMappingEntity__Group__12689 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__2_in_rule__EMappingEntity__Group__12692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EMappingEntity__Group__1__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__2__Impl_in_rule__EMappingEntity__Group__22751 = new BitSet(new long[]{0x0000000000021800L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__3_in_rule__EMappingEntity__Group__22754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NameAssignment_2_in_rule__EMappingEntity__Group__2__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__3__Impl_in_rule__EMappingEntity__Group__32811 = new BitSet(new long[]{0x0000000000021800L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__4_in_rule__EMappingEntity__Group__32814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__0_in_rule__EMappingEntity__Group__3__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__4__Impl_in_rule__EMappingEntity__Group__42872 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__5_in_rule__EMappingEntity__Group__42875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group__4__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__5__Impl_in_rule__EMappingEntity__Group__52934 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__6_in_rule__EMappingEntity__Group__52937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__EtypeAssignment_5_in_rule__EMappingEntity__Group__5__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__6__Impl_in_rule__EMappingEntity__Group__62994 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__7_in_rule__EMappingEntity__Group__62997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__0_in_rule__EMappingEntity__Group__6__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__7__Impl_in_rule__EMappingEntity__Group__73055 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__8_in_rule__EMappingEntity__Group__73058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__0_in_rule__EMappingEntity__Group__7__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__8__Impl_in_rule__EMappingEntity__Group__83116 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__9_in_rule__EMappingEntity__Group__83119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingEntity__Group__8__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__9__Impl_in_rule__EMappingEntity__Group__93178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__0_in_rule__EMappingEntity__Group__9__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__0__Impl_in_rule__EMappingEntity__Group_3__03256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__1_in_rule__EMappingEntity__Group_3__03259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ExtensionTypeAssignment_3_0_in_rule__EMappingEntity__Group_3__0__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__1__Impl_in_rule__EMappingEntity__Group_3__13316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ParentAssignment_3_1_in_rule__EMappingEntity__Group_3__1__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__0__Impl_in_rule__EMappingEntity__Group_6__03377 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__1_in_rule__EMappingEntity__Group_6__03380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EMappingEntity__Group_6__0__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__1__Impl_in_rule__EMappingEntity__Group_6__13439 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__2_in_rule__EMappingEntity__Group_6__13442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group_6__1__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__2__Impl_in_rule__EMappingEntity__Group_6__23501 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__3_in_rule__EMappingEntity__Group_6__23504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AttributesAssignment_6_2_in_rule__EMappingEntity__Group_6__2__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__3__Impl_in_rule__EMappingEntity__Group_6__33561 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__4_in_rule__EMappingEntity__Group_6__33564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6_3__0_in_rule__EMappingEntity__Group_6__3__Impl3591 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6__4__Impl_in_rule__EMappingEntity__Group_6__43622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingEntity__Group_6__4__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6_3__0__Impl_in_rule__EMappingEntity__Group_6_3__03691 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6_3__1_in_rule__EMappingEntity__Group_6_3__03694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EMappingEntity__Group_6_3__0__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_6_3__1__Impl_in_rule__EMappingEntity__Group_6_3__13753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AttributesAssignment_6_3_1_in_rule__EMappingEntity__Group_6_3__1__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__0__Impl_in_rule__EMappingEntity__Group_7__03814 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__1_in_rule__EMappingEntity__Group_7__03817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EMappingEntity__Group_7__0__Impl3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__1__Impl_in_rule__EMappingEntity__Group_7__13876 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__2_in_rule__EMappingEntity__Group_7__13879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group_7__1__Impl3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__2__Impl_in_rule__EMappingEntity__Group_7__23938 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__3_in_rule__EMappingEntity__Group_7__23941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_7_2_in_rule__EMappingEntity__Group_7__2__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__3__Impl_in_rule__EMappingEntity__Group_7__33998 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__4_in_rule__EMappingEntity__Group_7__34001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7_3__0_in_rule__EMappingEntity__Group_7__3__Impl4028 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7__4__Impl_in_rule__EMappingEntity__Group_7__44059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EMappingEntity__Group_7__4__Impl4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7_3__0__Impl_in_rule__EMappingEntity__Group_7_3__04128 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7_3__1_in_rule__EMappingEntity__Group_7_3__04131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EMappingEntity__Group_7_3__0__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_7_3__1__Impl_in_rule__EMappingEntity__Group_7_3__14190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_7_3_1_in_rule__EMappingEntity__Group_7_3__1__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__0__Impl_in_rule__EMappingEntity__Group_9__04251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__1_in_rule__EMappingEntity__Group_9__04254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EMappingEntity__Group_9__0__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__1__Impl_in_rule__EMappingEntity__Group_9__14313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__TableNameAssignment_9_1_in_rule__EMappingEntity__Group_9__1__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__0__Impl_in_rule__EAttribute__Group__04374 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__1_in_rule__EAttribute__Group__04377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__PkAssignment_0_in_rule__EAttribute__Group__0__Impl4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__1__Impl_in_rule__EAttribute__Group__14435 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__2_in_rule__EAttribute__Group__14438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__PropertyAssignment_1_in_rule__EAttribute__Group__1__Impl4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__2__Impl_in_rule__EAttribute__Group__24495 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__3_in_rule__EAttribute__Group__24498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EAttribute__Group__2__Impl4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__3__Impl_in_rule__EAttribute__Group__34557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Alternatives_3_in_rule__EAttribute__Group__3__Impl4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__0__Impl_in_rule__EAttribute__Group_3_0__04622 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__1_in_rule__EAttribute__Group_3_0__04625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ColumnNameAssignment_3_0_0_in_rule__EAttribute__Group_3_0__0__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0__1__Impl_in_rule__EAttribute__Group_3_0__14682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__0_in_rule__EAttribute__Group_3_0__1__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__0__Impl_in_rule__EAttribute__Group_3_0_1__04744 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__1_in_rule__EAttribute__Group_3_0_1__04747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EAttribute__Group_3_0_1__0__Impl4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__1__Impl_in_rule__EAttribute__Group_3_0_1__14806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__2_in_rule__EAttribute__Group_3_0_1__14809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EAttribute__Group_3_0_1__1__Impl4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__2__Impl_in_rule__EAttribute__Group_3_0_1__24868 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__3_in_rule__EAttribute__Group_3_0_1__24871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_2_in_rule__EAttribute__Group_3_0_1__2__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__3__Impl_in_rule__EAttribute__Group_3_0_1__34928 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__4_in_rule__EAttribute__Group_3_0_1__34931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3__0_in_rule__EAttribute__Group_3_0_1__3__Impl4958 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1__4__Impl_in_rule__EAttribute__Group_3_0_1__44989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EAttribute__Group_3_0_1__4__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3__0__Impl_in_rule__EAttribute__Group_3_0_1_3__05058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3__1_in_rule__EAttribute__Group_3_0_1_3__05061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EAttribute__Group_3_0_1_3__0__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_0_1_3__1__Impl_in_rule__EAttribute__Group_3_0_1_3__15120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_1_in_rule__EAttribute__Group_3_0_1_3__1__Impl5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__0__Impl_in_rule__EAttribute__Group_3_1__05181 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__1_in_rule__EAttribute__Group_3_1__05184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ResolvedAssignment_3_1_0_in_rule__EAttribute__Group_3_1__0__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__1__Impl_in_rule__EAttribute__Group_3_1__15241 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__2_in_rule__EAttribute__Group_3_1__15244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__QueryAssignment_3_1_1_in_rule__EAttribute__Group_3_1__1__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__2__Impl_in_rule__EAttribute__Group_3_1__25301 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__3_in_rule__EAttribute__Group_3_1__25304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EAttribute__Group_3_1__2__Impl5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__3__Impl_in_rule__EAttribute__Group_3_1__35363 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__4_in_rule__EAttribute__Group_3_1__35366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ParametersAssignment_3_1_3_in_rule__EAttribute__Group_3_1__3__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__4__Impl_in_rule__EAttribute__Group_3_1__45423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EAttribute__Group_3_1__4__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group__0__Impl_in_rule__EValueGenerator__Group__05492 = new BitSet(new long[]{0x0000100180000000L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group__1_in_rule__EValueGenerator__Group__05495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__DbTypeAssignment_0_in_rule__EValueGenerator__Group__0__Impl5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group__1__Impl_in_rule__EValueGenerator__Group__15552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Alternatives_1_in_rule__EValueGenerator__Group__1__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_1__0__Impl_in_rule__EValueGenerator__Group_1_1__05613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_1__1_in_rule__EValueGenerator__Group_1_1__05616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EValueGenerator__Group_1_1__0__Impl5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_1__1__Impl_in_rule__EValueGenerator__Group_1_1__15675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__QueryAssignment_1_1_1_in_rule__EValueGenerator__Group_1_1__1__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_2__0__Impl_in_rule__EValueGenerator__Group_1_2__05736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_2__1_in_rule__EValueGenerator__Group_1_2__05739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EValueGenerator__Group_1_2__0__Impl5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__Group_1_2__1__Impl_in_rule__EValueGenerator__Group_1_2__15798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EValueGenerator__SequenceAssignment_1_2_1_in_rule__EValueGenerator__Group_1_2__1__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__0__Impl_in_rule__ENamedQuery__Group__05859 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__1_in_rule__ENamedQuery__Group__05862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__ReturnTypeAssignment_0_in_rule__ENamedQuery__Group__0__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__1__Impl_in_rule__ENamedQuery__Group__15920 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__2_in_rule__ENamedQuery__Group__15923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__NameAssignment_1_in_rule__ENamedQuery__Group__1__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__2__Impl_in_rule__ENamedQuery__Group__25980 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__3_in_rule__ENamedQuery__Group__25983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__0_in_rule__ENamedQuery__Group__2__Impl6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__3__Impl_in_rule__ENamedQuery__Group__36041 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__4_in_rule__ENamedQuery__Group__36044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ENamedQuery__Group__3__Impl6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__4__Impl_in_rule__ENamedQuery__Group__46103 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__5_in_rule__ENamedQuery__Group__46106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__QueriesAssignment_4_in_rule__ENamedQuery__Group__4__Impl6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__5__Impl_in_rule__ENamedQuery__Group__56163 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__6_in_rule__ENamedQuery__Group__56166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__0_in_rule__ENamedQuery__Group__5__Impl6193 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__6__Impl_in_rule__ENamedQuery__Group__66224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ENamedQuery__Group__6__Impl6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__0__Impl_in_rule__ENamedQuery__Group_2__06297 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__1_in_rule__ENamedQuery__Group_2__06300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ENamedQuery__Group_2__0__Impl6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__1__Impl_in_rule__ENamedQuery__Group_2__16359 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__2_in_rule__ENamedQuery__Group_2__16362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__ParametersAssignment_2_1_in_rule__ENamedQuery__Group_2__1__Impl6389 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_2__2__Impl_in_rule__ENamedQuery__Group_2__26420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ENamedQuery__Group_2__2__Impl6448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__0__Impl_in_rule__ENamedQuery__Group_5__06485 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__1_in_rule__ENamedQuery__Group_5__06488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ENamedQuery__Group_5__0__Impl6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_5__1__Impl_in_rule__ENamedQuery__Group_5__16547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__QueriesAssignment_5_1_in_rule__ENamedQuery__Group_5__1__Impl6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__Group__0__Impl_in_rule__EParameter__Group__06608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EParameter__Group__1_in_rule__EParameter__Group__06611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__TypeAssignment_0_in_rule__EParameter__Group__0__Impl6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__Group__1__Impl_in_rule__EParameter__Group__16668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__NameAssignment_1_in_rule__EParameter__Group__1__Impl6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__0__Impl_in_rule__EQuery__Group__06729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EQuery__Group__1_in_rule__EQuery__Group__06732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__DbTypeAssignment_0_in_rule__EQuery__Group__0__Impl6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__1__Impl_in_rule__EQuery__Group__16789 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group__2_in_rule__EQuery__Group__16792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__MappingAssignment_1_in_rule__EQuery__Group__1__Impl6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__2__Impl_in_rule__EQuery__Group__26849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Alternatives_2_in_rule__EQuery__Group__2__Impl6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__0__Impl_in_rule__EQuery__Group_2_0__06912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__1_in_rule__EQuery__Group_2_0__06915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EQuery__Group_2_0__0__Impl6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__1__Impl_in_rule__EQuery__Group_2_0__16974 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__2_in_rule__EQuery__Group_2_0__16977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__FromAssignment_2_0_1_in_rule__EQuery__Group_2_0__1__Impl7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__2__Impl_in_rule__EQuery__Group_2_0__27034 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__3_in_rule__EQuery__Group_2_0__27037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__0_in_rule__EQuery__Group_2_0__2__Impl7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__3__Impl_in_rule__EQuery__Group_2_0__37095 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__4_in_rule__EQuery__Group_2_0__37098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__0_in_rule__EQuery__Group_2_0__3__Impl7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__4__Impl_in_rule__EQuery__Group_2_0__47156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__0_in_rule__EQuery__Group_2_0__4__Impl7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__0__Impl_in_rule__EQuery__Group_2_0_2__07224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__1_in_rule__EQuery__Group_2_0_2__07227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EQuery__Group_2_0_2__0__Impl7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__1__Impl_in_rule__EQuery__Group_2_0_2__17286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__WhereAssignment_2_0_2_1_in_rule__EQuery__Group_2_0_2__1__Impl7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__0__Impl_in_rule__EQuery__Group_2_0_3__07347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__1_in_rule__EQuery__Group_2_0_3__07350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EQuery__Group_2_0_3__0__Impl7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__1__Impl_in_rule__EQuery__Group_2_0_3__17409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__GroupByAssignment_2_0_3_1_in_rule__EQuery__Group_2_0_3__1__Impl7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__0__Impl_in_rule__EQuery__Group_2_0_4__07470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__1_in_rule__EQuery__Group_2_0_4__07473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EQuery__Group_2_0_4__0__Impl7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__1__Impl_in_rule__EQuery__Group_2_0_4__17532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__OrderbyAssignment_2_0_4_1_in_rule__EQuery__Group_2_0_4__1__Impl7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__0__Impl_in_rule__EObjectSection__Group__07593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__1_in_rule__EObjectSection__Group__07596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__EntityAssignment_0_in_rule__EObjectSection__Group__0__Impl7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__1__Impl_in_rule__EObjectSection__Group__17653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__0_in_rule__EObjectSection__Group__1__Impl7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__0__Impl_in_rule__EObjectSection__Group_1__07715 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__1_in_rule__EObjectSection__Group_1__07718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__PrefixAssignment_1_0_in_rule__EObjectSection__Group_1__0__Impl7745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__1__Impl_in_rule__EObjectSection__Group_1__17775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__0_in_rule__EObjectSection__Group_1__1__Impl7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__0__Impl_in_rule__EObjectSection__Group_1_1__07837 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__1_in_rule__EObjectSection__Group_1_1__07840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EObjectSection__Group_1_1__0__Impl7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__1__Impl_in_rule__EObjectSection__Group_1_1__17899 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__2_in_rule__EObjectSection__Group_1_1__17902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_1_in_rule__EObjectSection__Group_1_1__1__Impl7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__2__Impl_in_rule__EObjectSection__Group_1_1__27959 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__3_in_rule__EObjectSection__Group_1_1__27962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__0_in_rule__EObjectSection__Group_1_1__2__Impl7989 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__3__Impl_in_rule__EObjectSection__Group_1_1__38020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EObjectSection__Group_1_1__3__Impl8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__0__Impl_in_rule__EObjectSection__Group_1_1_2__08087 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__1_in_rule__EObjectSection__Group_1_1_2__08090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EObjectSection__Group_1_1_2__0__Impl8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__1__Impl_in_rule__EObjectSection__Group_1_1_2__18149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_2_1_in_rule__EObjectSection__Group_1_1_2__1__Impl8176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__0__Impl_in_rule__EMappingAttribute__Group__08210 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__1_in_rule__EMappingAttribute__Group__08213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__PkAssignment_0_in_rule__EMappingAttribute__Group__0__Impl8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__1__Impl_in_rule__EMappingAttribute__Group__18271 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__2_in_rule__EMappingAttribute__Group__18274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__PropertyAssignment_1_in_rule__EMappingAttribute__Group__1__Impl8301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__2__Impl_in_rule__EMappingAttribute__Group__28331 = new BitSet(new long[]{0x0000280000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__3_in_rule__EMappingAttribute__Group__28334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EMappingAttribute__Group__2__Impl8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__3__Impl_in_rule__EMappingAttribute__Group__38393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Alternatives_3_in_rule__EMappingAttribute__Group__3__Impl8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__0__Impl_in_rule__EMappingAttribute__Group_3_1__08458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__1_in_rule__EMappingAttribute__Group_3_1__08461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__ResolvedAssignment_3_1_0_in_rule__EMappingAttribute__Group_3_1__0__Impl8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__1__Impl_in_rule__EMappingAttribute__Group_3_1__18518 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__2_in_rule__EMappingAttribute__Group_3_1__18521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__QueryAssignment_3_1_1_in_rule__EMappingAttribute__Group_3_1__1__Impl8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__2__Impl_in_rule__EMappingAttribute__Group_3_1__28578 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__3_in_rule__EMappingAttribute__Group_3_1__28581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EMappingAttribute__Group_3_1__2__Impl8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__3__Impl_in_rule__EMappingAttribute__Group_3_1__38640 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__4_in_rule__EMappingAttribute__Group_3_1__38643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__ParametersAssignment_3_1_3_in_rule__EMappingAttribute__Group_3_1__3__Impl8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__4__Impl_in_rule__EMappingAttribute__Group_3_1__48700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EMappingAttribute__Group_3_1__4__Impl8728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__0__Impl_in_rule__EMappingAttribute__Group_3_2__08769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__1_in_rule__EMappingAttribute__Group_3_2__08772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__MappedAssignment_3_2_0_in_rule__EMappingAttribute__Group_3_2__0__Impl8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__1__Impl_in_rule__EMappingAttribute__Group_3_2__18829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__MapAssignment_3_2_1_in_rule__EMappingAttribute__Group_3_2__1__Impl8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__0__Impl_in_rule__EType__Group__08890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EType__Group__1_in_rule__EType__Group__08893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EType__Group__0__Impl8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__1__Impl_in_rule__EType__Group__18952 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EType__Group__2_in_rule__EType__Group__18955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__UrlAssignment_1_in_rule__EType__Group__1__Impl8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__2__Impl_in_rule__EType__Group__29012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EType__Group__3_in_rule__EType__Group__29015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EType__Group__2__Impl9043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__3__Impl_in_rule__EType__Group__39074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__NameAssignment_3_in_rule__EType__Group__3__Impl9101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09139 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl9169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9225 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QualifiedName__Group_1__0__Impl9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__09384 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__09387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl9414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__19443 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__19446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QualifiedNameWithWildcard__Group__1__Impl9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__29505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__QualifiedNameWithWildcard__Group__2__Impl9533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMapping__RootAlternatives_0_in_rule__EMapping__RootAssignment9575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__EMappingBundle__ImportsAssignment_09608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__NameAssignment_29639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_49674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_5_19713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__EMappingEntityDef__PackageAssignment_09748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__EMappingEntityDef__ImportsAssignment_19779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_rule__EMappingEntityDef__EntityAssignment_29810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_19841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EMappingEntity__AbstractAssignment_09910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingEntity__NameAssignment_29949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0_in_rule__EMappingEntity__ExtensionTypeAssignment_3_09980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingEntity__ParentAssignment_3_110017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_rule__EMappingEntity__EtypeAssignment_510052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_6_210083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_6_3_110114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_7_210145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_7_3_110176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingEntity__TableNameAssignment_9_110207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EAttribute__PkAssignment_010243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__PropertyAssignment_110282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__ColumnNameAssignment_3_0_010313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_210344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEValueGenerator_in_rule__EAttribute__ValueGeneratorsAssignment_3_0_1_3_110375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EAttribute__ResolvedAssignment_3_1_010411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EAttribute__QueryAssignment_3_1_110454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__ParametersAssignment_3_1_310489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EValueGenerator__DbTypeAssignment_010520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EValueGenerator__AutokeyAssignment_1_010556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EValueGenerator__QueryAssignment_1_1_110595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EValueGenerator__SequenceAssignment_1_2_110626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_rule__ENamedQuery__ReturnTypeAssignment_010657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ENamedQuery__NameAssignment_110688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_rule__ENamedQuery__ParametersAssignment_2_110719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_410750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_5_110781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EParameter__TypeAssignment_010812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EParameter__NameAssignment_110843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__DbTypeAlternatives_0_0_in_rule__EQuery__DbTypeAssignment_010874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_rule__EQuery__MappingAssignment_110907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__FromAssignment_2_0_110938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__WhereAssignment_2_0_2_110969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__GroupByAssignment_2_0_3_111000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__OrderbyAssignment_2_0_4_111031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__AllAssignment_2_111062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EObjectSection__EntityAssignment_011097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EObjectSection__PrefixAssignment_1_011132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_111163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_2_111194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EMappingAttribute__PkAssignment_011230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__PropertyAssignment_111269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingAttribute__ColumnNameAssignment_3_011300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EMappingAttribute__ResolvedAssignment_3_1_011336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__QueryAssignment_3_1_111379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingAttribute__ParametersAssignment_3_1_311414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EMappingAttribute__MappedAssignment_3_2_011450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_rule__EMappingAttribute__MapAssignment_3_2_111489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EType__UrlAssignment_111520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EType__NameAssignment_311551 = new BitSet(new long[]{0x0000000000000002L});

}