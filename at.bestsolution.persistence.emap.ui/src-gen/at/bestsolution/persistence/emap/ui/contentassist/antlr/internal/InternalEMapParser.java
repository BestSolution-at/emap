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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'extends'", "'derived'", "'default'", "'bundle'", "'{'", "'}'", "','", "'import'", "'package'", "';'", "'entity'", "'attributes'", "'queries'", "'as'", "'=>'", "'('", "')'", "'FROM'", "'WHERE'", "'GROUP BY'", "'ORDER BY'", "'resolve'", "'map'", "'etype'", "'#'", "'.'", "'*'", "'abstract'", "'primarykey'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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


    // $ANTLR start "rule__EMapping__RootAlternatives_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:481:1: rule__EMapping__RootAlternatives_0 : ( ( ruleEMappingBundle ) | ( ruleEMappingEntityDef ) );
    public final void rule__EMapping__RootAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:485:1: ( ( ruleEMappingBundle ) | ( ruleEMappingEntityDef ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14||LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:486:1: ( ruleEMappingBundle )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:486:1: ( ruleEMappingBundle )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:487:1: ruleEMappingBundle
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAccess().getRootEMappingBundleParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleEMappingBundle_in_rule__EMapping__RootAlternatives_0976);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:492:6: ( ruleEMappingEntityDef )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:492:6: ( ruleEMappingEntityDef )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:493:1: ruleEMappingEntityDef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAccess().getRootEMappingEntityDefParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleEMappingEntityDef_in_rule__EMapping__RootAlternatives_0993);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:503:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) );
    public final void rule__Import__ImportedNamespaceAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:507:1: ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:508:1: ( ruleQualifiedNameWithWildcard )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:508:1: ( ruleQualifiedNameWithWildcard )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:509:1: ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01025);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:514:6: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:514:6: ( ruleQualifiedName )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:515:1: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAlternatives_1_01042);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:525:1: rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 : ( ( 'extends' ) | ( 'derived' ) );
    public final void rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:529:1: ( ( 'extends' ) | ( 'derived' ) )
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:530:1: ( 'extends' )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:530:1: ( 'extends' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:531:1: 'extends'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingEntityAccess().getExtensionTypeExtendsKeyword_3_0_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01075); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEMappingEntityAccess().getExtensionTypeExtendsKeyword_3_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:538:6: ( 'derived' )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:538:6: ( 'derived' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:539:1: 'derived'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingEntityAccess().getExtensionTypeDerivedKeyword_3_0_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01095); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:551:1: rule__EAttribute__Alternatives_3 : ( ( ( rule__EAttribute__ColumnNameAssignment_3_0 ) ) | ( ( rule__EAttribute__Group_3_1__0 ) ) );
    public final void rule__EAttribute__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:555:1: ( ( ( rule__EAttribute__ColumnNameAssignment_3_0 ) ) | ( ( rule__EAttribute__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:556:1: ( ( rule__EAttribute__ColumnNameAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:556:1: ( ( rule__EAttribute__ColumnNameAssignment_3_0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:557:1: ( rule__EAttribute__ColumnNameAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEAttributeAccess().getColumnNameAssignment_3_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:558:1: ( rule__EAttribute__ColumnNameAssignment_3_0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:558:2: rule__EAttribute__ColumnNameAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__ColumnNameAssignment_3_0_in_rule__EAttribute__Alternatives_31129);
                    rule__EAttribute__ColumnNameAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEAttributeAccess().getColumnNameAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:562:6: ( ( rule__EAttribute__Group_3_1__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:562:6: ( ( rule__EAttribute__Group_3_1__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:563:1: ( rule__EAttribute__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEAttributeAccess().getGroup_3_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:564:1: ( rule__EAttribute__Group_3_1__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:564:2: rule__EAttribute__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__Group_3_1__0_in_rule__EAttribute__Alternatives_31147);
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


    // $ANTLR start "rule__EQuery__DbTypeAlternatives_0_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:573:1: rule__EQuery__DbTypeAlternatives_0_0 : ( ( 'default' ) | ( RULE_STRING ) );
    public final void rule__EQuery__DbTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:577:1: ( ( 'default' ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:578:1: ( 'default' )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:578:1: ( 'default' )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:579:1: 'default'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getDbTypeDefaultKeyword_0_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__EQuery__DbTypeAlternatives_0_01181); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEQueryAccess().getDbTypeDefaultKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:586:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:586:6: ( RULE_STRING )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:587:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getDbTypeSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__DbTypeAlternatives_0_01200); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:597:1: rule__EQuery__Alternatives_2 : ( ( ( rule__EQuery__Group_2_0__0 ) ) | ( ( rule__EQuery__AllAssignment_2_1 ) ) );
    public final void rule__EQuery__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:601:1: ( ( ( rule__EQuery__Group_2_0__0 ) ) | ( ( rule__EQuery__AllAssignment_2_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:602:1: ( ( rule__EQuery__Group_2_0__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:602:1: ( ( rule__EQuery__Group_2_0__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:603:1: ( rule__EQuery__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getGroup_2_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:604:1: ( rule__EQuery__Group_2_0__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:604:2: rule__EQuery__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0__0_in_rule__EQuery__Alternatives_21232);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:608:6: ( ( rule__EQuery__AllAssignment_2_1 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:608:6: ( ( rule__EQuery__AllAssignment_2_1 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:609:1: ( rule__EQuery__AllAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEQueryAccess().getAllAssignment_2_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:610:1: ( rule__EQuery__AllAssignment_2_1 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:610:2: rule__EQuery__AllAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__EQuery__AllAssignment_2_1_in_rule__EQuery__Alternatives_21250);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:619:1: rule__EMappingAttribute__Alternatives_3 : ( ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) ) | ( ( rule__EMappingAttribute__Group_3_1__0 ) ) | ( ( rule__EMappingAttribute__Group_3_2__0 ) ) );
    public final void rule__EMappingAttribute__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:623:1: ( ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) ) | ( ( rule__EMappingAttribute__Group_3_1__0 ) ) | ( ( rule__EMappingAttribute__Group_3_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:624:1: ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:624:1: ( ( rule__EMappingAttribute__ColumnNameAssignment_3_0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:625:1: ( rule__EMappingAttribute__ColumnNameAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAttributeAccess().getColumnNameAssignment_3_0()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:626:1: ( rule__EMappingAttribute__ColumnNameAssignment_3_0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:626:2: rule__EMappingAttribute__ColumnNameAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__ColumnNameAssignment_3_0_in_rule__EMappingAttribute__Alternatives_31283);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:630:6: ( ( rule__EMappingAttribute__Group_3_1__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:630:6: ( ( rule__EMappingAttribute__Group_3_1__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:631:1: ( rule__EMappingAttribute__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAttributeAccess().getGroup_3_1()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:632:1: ( rule__EMappingAttribute__Group_3_1__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:632:2: rule__EMappingAttribute__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__0_in_rule__EMappingAttribute__Alternatives_31301);
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
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:636:6: ( ( rule__EMappingAttribute__Group_3_2__0 ) )
                    {
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:636:6: ( ( rule__EMappingAttribute__Group_3_2__0 ) )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:637:1: ( rule__EMappingAttribute__Group_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEMappingAttributeAccess().getGroup_3_2()); 
                    }
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:638:1: ( rule__EMappingAttribute__Group_3_2__0 )
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:638:2: rule__EMappingAttribute__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__0_in_rule__EMappingAttribute__Alternatives_31319);
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


    // $ANTLR start "rule__EMappingBundle__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:649:1: rule__EMappingBundle__Group__0 : rule__EMappingBundle__Group__0__Impl rule__EMappingBundle__Group__1 ;
    public final void rule__EMappingBundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:653:1: ( rule__EMappingBundle__Group__0__Impl rule__EMappingBundle__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:654:2: rule__EMappingBundle__Group__0__Impl rule__EMappingBundle__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__0__Impl_in_rule__EMappingBundle__Group__01350);
            rule__EMappingBundle__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__1_in_rule__EMappingBundle__Group__01353);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:661:1: rule__EMappingBundle__Group__0__Impl : ( ( rule__EMappingBundle__ImportsAssignment_0 )* ) ;
    public final void rule__EMappingBundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:665:1: ( ( ( rule__EMappingBundle__ImportsAssignment_0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:666:1: ( ( rule__EMappingBundle__ImportsAssignment_0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:666:1: ( ( rule__EMappingBundle__ImportsAssignment_0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:667:1: ( rule__EMappingBundle__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getImportsAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:668:1: ( rule__EMappingBundle__ImportsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:668:2: rule__EMappingBundle__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingBundle__ImportsAssignment_0_in_rule__EMappingBundle__Group__0__Impl1380);
            	    rule__EMappingBundle__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:678:1: rule__EMappingBundle__Group__1 : rule__EMappingBundle__Group__1__Impl rule__EMappingBundle__Group__2 ;
    public final void rule__EMappingBundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:682:1: ( rule__EMappingBundle__Group__1__Impl rule__EMappingBundle__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:683:2: rule__EMappingBundle__Group__1__Impl rule__EMappingBundle__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__1__Impl_in_rule__EMappingBundle__Group__11411);
            rule__EMappingBundle__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__2_in_rule__EMappingBundle__Group__11414);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:690:1: rule__EMappingBundle__Group__1__Impl : ( 'bundle' ) ;
    public final void rule__EMappingBundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:694:1: ( ( 'bundle' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:695:1: ( 'bundle' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:695:1: ( 'bundle' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:696:1: 'bundle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getBundleKeyword_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__EMappingBundle__Group__1__Impl1442); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:709:1: rule__EMappingBundle__Group__2 : rule__EMappingBundle__Group__2__Impl rule__EMappingBundle__Group__3 ;
    public final void rule__EMappingBundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:713:1: ( rule__EMappingBundle__Group__2__Impl rule__EMappingBundle__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:714:2: rule__EMappingBundle__Group__2__Impl rule__EMappingBundle__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__2__Impl_in_rule__EMappingBundle__Group__21473);
            rule__EMappingBundle__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__3_in_rule__EMappingBundle__Group__21476);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:721:1: rule__EMappingBundle__Group__2__Impl : ( ( rule__EMappingBundle__NameAssignment_2 ) ) ;
    public final void rule__EMappingBundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:725:1: ( ( ( rule__EMappingBundle__NameAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:726:1: ( ( rule__EMappingBundle__NameAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:726:1: ( ( rule__EMappingBundle__NameAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:727:1: ( rule__EMappingBundle__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:728:1: ( rule__EMappingBundle__NameAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:728:2: rule__EMappingBundle__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingBundle__NameAssignment_2_in_rule__EMappingBundle__Group__2__Impl1503);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:738:1: rule__EMappingBundle__Group__3 : rule__EMappingBundle__Group__3__Impl rule__EMappingBundle__Group__4 ;
    public final void rule__EMappingBundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:742:1: ( rule__EMappingBundle__Group__3__Impl rule__EMappingBundle__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:743:2: rule__EMappingBundle__Group__3__Impl rule__EMappingBundle__Group__4
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__3__Impl_in_rule__EMappingBundle__Group__31533);
            rule__EMappingBundle__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__4_in_rule__EMappingBundle__Group__31536);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:750:1: rule__EMappingBundle__Group__3__Impl : ( '{' ) ;
    public final void rule__EMappingBundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:754:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:755:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:755:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:756:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__EMappingBundle__Group__3__Impl1564); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:769:1: rule__EMappingBundle__Group__4 : rule__EMappingBundle__Group__4__Impl rule__EMappingBundle__Group__5 ;
    public final void rule__EMappingBundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:773:1: ( rule__EMappingBundle__Group__4__Impl rule__EMappingBundle__Group__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:774:2: rule__EMappingBundle__Group__4__Impl rule__EMappingBundle__Group__5
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__4__Impl_in_rule__EMappingBundle__Group__41595);
            rule__EMappingBundle__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__5_in_rule__EMappingBundle__Group__41598);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:781:1: rule__EMappingBundle__Group__4__Impl : ( ( rule__EMappingBundle__EntitiesAssignment_4 ) ) ;
    public final void rule__EMappingBundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:785:1: ( ( ( rule__EMappingBundle__EntitiesAssignment_4 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:786:1: ( ( rule__EMappingBundle__EntitiesAssignment_4 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:786:1: ( ( rule__EMappingBundle__EntitiesAssignment_4 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:787:1: ( rule__EMappingBundle__EntitiesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_4()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:788:1: ( rule__EMappingBundle__EntitiesAssignment_4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:788:2: rule__EMappingBundle__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_rule__EMappingBundle__EntitiesAssignment_4_in_rule__EMappingBundle__Group__4__Impl1625);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:798:1: rule__EMappingBundle__Group__5 : rule__EMappingBundle__Group__5__Impl rule__EMappingBundle__Group__6 ;
    public final void rule__EMappingBundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:802:1: ( rule__EMappingBundle__Group__5__Impl rule__EMappingBundle__Group__6 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:803:2: rule__EMappingBundle__Group__5__Impl rule__EMappingBundle__Group__6
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__5__Impl_in_rule__EMappingBundle__Group__51655);
            rule__EMappingBundle__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group__6_in_rule__EMappingBundle__Group__51658);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:810:1: rule__EMappingBundle__Group__5__Impl : ( ( rule__EMappingBundle__Group_5__0 )* ) ;
    public final void rule__EMappingBundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:814:1: ( ( ( rule__EMappingBundle__Group_5__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:815:1: ( ( rule__EMappingBundle__Group_5__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:815:1: ( ( rule__EMappingBundle__Group_5__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:816:1: ( rule__EMappingBundle__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getGroup_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:817:1: ( rule__EMappingBundle__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:817:2: rule__EMappingBundle__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingBundle__Group_5__0_in_rule__EMappingBundle__Group__5__Impl1685);
            	    rule__EMappingBundle__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:827:1: rule__EMappingBundle__Group__6 : rule__EMappingBundle__Group__6__Impl ;
    public final void rule__EMappingBundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:831:1: ( rule__EMappingBundle__Group__6__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:832:2: rule__EMappingBundle__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group__6__Impl_in_rule__EMappingBundle__Group__61716);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:838:1: rule__EMappingBundle__Group__6__Impl : ( '}' ) ;
    public final void rule__EMappingBundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:842:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:843:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:843:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:844:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,16,FOLLOW_16_in_rule__EMappingBundle__Group__6__Impl1744); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:871:1: rule__EMappingBundle__Group_5__0 : rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1 ;
    public final void rule__EMappingBundle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:875:1: ( rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:876:2: rule__EMappingBundle__Group_5__0__Impl rule__EMappingBundle__Group_5__1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__0__Impl_in_rule__EMappingBundle__Group_5__01789);
            rule__EMappingBundle__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__1_in_rule__EMappingBundle__Group_5__01792);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:883:1: rule__EMappingBundle__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EMappingBundle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:887:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:888:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:888:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:889:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getCommaKeyword_5_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingBundle__Group_5__0__Impl1820); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:902:1: rule__EMappingBundle__Group_5__1 : rule__EMappingBundle__Group_5__1__Impl ;
    public final void rule__EMappingBundle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:906:1: ( rule__EMappingBundle__Group_5__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:907:2: rule__EMappingBundle__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingBundle__Group_5__1__Impl_in_rule__EMappingBundle__Group_5__11851);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:913:1: rule__EMappingBundle__Group_5__1__Impl : ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) ) ;
    public final void rule__EMappingBundle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:917:1: ( ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:918:1: ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:918:1: ( ( rule__EMappingBundle__EntitiesAssignment_5_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:919:1: ( rule__EMappingBundle__EntitiesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesAssignment_5_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:920:1: ( rule__EMappingBundle__EntitiesAssignment_5_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:920:2: rule__EMappingBundle__EntitiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EMappingBundle__EntitiesAssignment_5_1_in_rule__EMappingBundle__Group_5__1__Impl1878);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:934:1: rule__EMappingEntityDef__Group__0 : rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1 ;
    public final void rule__EMappingEntityDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:938:1: ( rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:939:2: rule__EMappingEntityDef__Group__0__Impl rule__EMappingEntityDef__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__0__Impl_in_rule__EMappingEntityDef__Group__01912);
            rule__EMappingEntityDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__1_in_rule__EMappingEntityDef__Group__01915);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:946:1: rule__EMappingEntityDef__Group__0__Impl : ( ( rule__EMappingEntityDef__PackageAssignment_0 ) ) ;
    public final void rule__EMappingEntityDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:950:1: ( ( ( rule__EMappingEntityDef__PackageAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:951:1: ( ( rule__EMappingEntityDef__PackageAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:951:1: ( ( rule__EMappingEntityDef__PackageAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:952:1: ( rule__EMappingEntityDef__PackageAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getPackageAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:953:1: ( rule__EMappingEntityDef__PackageAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:953:2: rule__EMappingEntityDef__PackageAssignment_0
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__PackageAssignment_0_in_rule__EMappingEntityDef__Group__0__Impl1942);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:963:1: rule__EMappingEntityDef__Group__1 : rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2 ;
    public final void rule__EMappingEntityDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:967:1: ( rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:968:2: rule__EMappingEntityDef__Group__1__Impl rule__EMappingEntityDef__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__1__Impl_in_rule__EMappingEntityDef__Group__11972);
            rule__EMappingEntityDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__2_in_rule__EMappingEntityDef__Group__11975);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:975:1: rule__EMappingEntityDef__Group__1__Impl : ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* ) ;
    public final void rule__EMappingEntityDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:979:1: ( ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:980:1: ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:980:1: ( ( rule__EMappingEntityDef__ImportsAssignment_1 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:981:1: ( rule__EMappingEntityDef__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getImportsAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:982:1: ( rule__EMappingEntityDef__ImportsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:982:2: rule__EMappingEntityDef__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntityDef__ImportsAssignment_1_in_rule__EMappingEntityDef__Group__1__Impl2002);
            	    rule__EMappingEntityDef__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:992:1: rule__EMappingEntityDef__Group__2 : rule__EMappingEntityDef__Group__2__Impl ;
    public final void rule__EMappingEntityDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:996:1: ( rule__EMappingEntityDef__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:997:2: rule__EMappingEntityDef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__Group__2__Impl_in_rule__EMappingEntityDef__Group__22033);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1003:1: rule__EMappingEntityDef__Group__2__Impl : ( ( rule__EMappingEntityDef__EntityAssignment_2 ) ) ;
    public final void rule__EMappingEntityDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1007:1: ( ( ( rule__EMappingEntityDef__EntityAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1008:1: ( ( rule__EMappingEntityDef__EntityAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1008:1: ( ( rule__EMappingEntityDef__EntityAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1009:1: ( rule__EMappingEntityDef__EntityAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getEntityAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1010:1: ( rule__EMappingEntityDef__EntityAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1010:2: rule__EMappingEntityDef__EntityAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingEntityDef__EntityAssignment_2_in_rule__EMappingEntityDef__Group__2__Impl2060);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1026:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1030:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1031:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02096);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02099);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1038:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1042:1: ( ( 'import' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1043:1: ( 'import' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1043:1: ( 'import' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1044:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Import__Group__0__Impl2127); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1057:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1061:1: ( rule__Import__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1062:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12158);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1068:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1072:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1073:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1073:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1074:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1075:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1075:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2185);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1089:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1093:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1094:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02219);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02222);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1101:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1105:1: ( ( 'package' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1106:1: ( 'package' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1106:1: ( 'package' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1107:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__PackageDeclaration__Group__0__Impl2250); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1120:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1124:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1125:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12281);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12284);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1132:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1136:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1137:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1137:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1138:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1139:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1139:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2311);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1149:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1153:1: ( rule__PackageDeclaration__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1154:2: rule__PackageDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22341);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1160:1: rule__PackageDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1164:1: ( ( ';' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1165:1: ( ';' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1165:1: ( ';' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1166:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__PackageDeclaration__Group__2__Impl2369); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1185:1: rule__EMappingEntity__Group__0 : rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1 ;
    public final void rule__EMappingEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1189:1: ( rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1190:2: rule__EMappingEntity__Group__0__Impl rule__EMappingEntity__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__0__Impl_in_rule__EMappingEntity__Group__02406);
            rule__EMappingEntity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__1_in_rule__EMappingEntity__Group__02409);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1197:1: rule__EMappingEntity__Group__0__Impl : ( ( rule__EMappingEntity__AbstractAssignment_0 )? ) ;
    public final void rule__EMappingEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1201:1: ( ( ( rule__EMappingEntity__AbstractAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1202:1: ( ( rule__EMappingEntity__AbstractAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1202:1: ( ( rule__EMappingEntity__AbstractAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1203:1: ( rule__EMappingEntity__AbstractAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1204:1: ( rule__EMappingEntity__AbstractAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1204:2: rule__EMappingEntity__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__AbstractAssignment_0_in_rule__EMappingEntity__Group__0__Impl2436);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1214:1: rule__EMappingEntity__Group__1 : rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2 ;
    public final void rule__EMappingEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1218:1: ( rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1219:2: rule__EMappingEntity__Group__1__Impl rule__EMappingEntity__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__1__Impl_in_rule__EMappingEntity__Group__12467);
            rule__EMappingEntity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__2_in_rule__EMappingEntity__Group__12470);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1226:1: rule__EMappingEntity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__EMappingEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1230:1: ( ( 'entity' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1231:1: ( 'entity' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1231:1: ( 'entity' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1232:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEntityKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__EMappingEntity__Group__1__Impl2498); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1245:1: rule__EMappingEntity__Group__2 : rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3 ;
    public final void rule__EMappingEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1249:1: ( rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1250:2: rule__EMappingEntity__Group__2__Impl rule__EMappingEntity__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__2__Impl_in_rule__EMappingEntity__Group__22529);
            rule__EMappingEntity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__3_in_rule__EMappingEntity__Group__22532);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1257:1: rule__EMappingEntity__Group__2__Impl : ( ( rule__EMappingEntity__NameAssignment_2 ) ) ;
    public final void rule__EMappingEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1261:1: ( ( ( rule__EMappingEntity__NameAssignment_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1262:1: ( ( rule__EMappingEntity__NameAssignment_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1262:1: ( ( rule__EMappingEntity__NameAssignment_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1263:1: ( rule__EMappingEntity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1264:1: ( rule__EMappingEntity__NameAssignment_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1264:2: rule__EMappingEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NameAssignment_2_in_rule__EMappingEntity__Group__2__Impl2559);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1274:1: rule__EMappingEntity__Group__3 : rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4 ;
    public final void rule__EMappingEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1278:1: ( rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1279:2: rule__EMappingEntity__Group__3__Impl rule__EMappingEntity__Group__4
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__3__Impl_in_rule__EMappingEntity__Group__32589);
            rule__EMappingEntity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__4_in_rule__EMappingEntity__Group__32592);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1286:1: rule__EMappingEntity__Group__3__Impl : ( ( rule__EMappingEntity__Group_3__0 )? ) ;
    public final void rule__EMappingEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1290:1: ( ( ( rule__EMappingEntity__Group_3__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1291:1: ( ( rule__EMappingEntity__Group_3__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1291:1: ( ( rule__EMappingEntity__Group_3__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1292:1: ( rule__EMappingEntity__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1293:1: ( rule__EMappingEntity__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1293:2: rule__EMappingEntity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_3__0_in_rule__EMappingEntity__Group__3__Impl2619);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1303:1: rule__EMappingEntity__Group__4 : rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5 ;
    public final void rule__EMappingEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1307:1: ( rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1308:2: rule__EMappingEntity__Group__4__Impl rule__EMappingEntity__Group__5
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__4__Impl_in_rule__EMappingEntity__Group__42650);
            rule__EMappingEntity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__5_in_rule__EMappingEntity__Group__42653);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1315:1: rule__EMappingEntity__Group__4__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1319:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1320:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1320:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1321:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_15_in_rule__EMappingEntity__Group__4__Impl2681); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1334:1: rule__EMappingEntity__Group__5 : rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6 ;
    public final void rule__EMappingEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1338:1: ( rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1339:2: rule__EMappingEntity__Group__5__Impl rule__EMappingEntity__Group__6
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__5__Impl_in_rule__EMappingEntity__Group__52712);
            rule__EMappingEntity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__6_in_rule__EMappingEntity__Group__52715);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1346:1: rule__EMappingEntity__Group__5__Impl : ( ( rule__EMappingEntity__EtypeAssignment_5 ) ) ;
    public final void rule__EMappingEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1350:1: ( ( ( rule__EMappingEntity__EtypeAssignment_5 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1351:1: ( ( rule__EMappingEntity__EtypeAssignment_5 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1351:1: ( ( rule__EMappingEntity__EtypeAssignment_5 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1352:1: ( rule__EMappingEntity__EtypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEtypeAssignment_5()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1353:1: ( rule__EMappingEntity__EtypeAssignment_5 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1353:2: rule__EMappingEntity__EtypeAssignment_5
            {
            pushFollow(FOLLOW_rule__EMappingEntity__EtypeAssignment_5_in_rule__EMappingEntity__Group__5__Impl2742);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1363:1: rule__EMappingEntity__Group__6 : rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7 ;
    public final void rule__EMappingEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1367:1: ( rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1368:2: rule__EMappingEntity__Group__6__Impl rule__EMappingEntity__Group__7
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__6__Impl_in_rule__EMappingEntity__Group__62772);
            rule__EMappingEntity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__7_in_rule__EMappingEntity__Group__62775);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1375:1: rule__EMappingEntity__Group__6__Impl : ( 'attributes' ) ;
    public final void rule__EMappingEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1379:1: ( ( 'attributes' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1380:1: ( 'attributes' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1380:1: ( 'attributes' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1381:1: 'attributes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesKeyword_6()); 
            }
            match(input,22,FOLLOW_22_in_rule__EMappingEntity__Group__6__Impl2803); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1394:1: rule__EMappingEntity__Group__7 : rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8 ;
    public final void rule__EMappingEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1398:1: ( rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1399:2: rule__EMappingEntity__Group__7__Impl rule__EMappingEntity__Group__8
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__7__Impl_in_rule__EMappingEntity__Group__72834);
            rule__EMappingEntity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__8_in_rule__EMappingEntity__Group__72837);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1406:1: rule__EMappingEntity__Group__7__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1410:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1411:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1411:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1412:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_7()); 
            }
            match(input,15,FOLLOW_15_in_rule__EMappingEntity__Group__7__Impl2865); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1425:1: rule__EMappingEntity__Group__8 : rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9 ;
    public final void rule__EMappingEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1429:1: ( rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1430:2: rule__EMappingEntity__Group__8__Impl rule__EMappingEntity__Group__9
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__8__Impl_in_rule__EMappingEntity__Group__82896);
            rule__EMappingEntity__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__9_in_rule__EMappingEntity__Group__82899);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1437:1: rule__EMappingEntity__Group__8__Impl : ( ( rule__EMappingEntity__AttributesAssignment_8 ) ) ;
    public final void rule__EMappingEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1441:1: ( ( ( rule__EMappingEntity__AttributesAssignment_8 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1442:1: ( ( rule__EMappingEntity__AttributesAssignment_8 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1442:1: ( ( rule__EMappingEntity__AttributesAssignment_8 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1443:1: ( rule__EMappingEntity__AttributesAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_8()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1444:1: ( rule__EMappingEntity__AttributesAssignment_8 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1444:2: rule__EMappingEntity__AttributesAssignment_8
            {
            pushFollow(FOLLOW_rule__EMappingEntity__AttributesAssignment_8_in_rule__EMappingEntity__Group__8__Impl2926);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1454:1: rule__EMappingEntity__Group__9 : rule__EMappingEntity__Group__9__Impl rule__EMappingEntity__Group__10 ;
    public final void rule__EMappingEntity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1458:1: ( rule__EMappingEntity__Group__9__Impl rule__EMappingEntity__Group__10 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1459:2: rule__EMappingEntity__Group__9__Impl rule__EMappingEntity__Group__10
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__9__Impl_in_rule__EMappingEntity__Group__92956);
            rule__EMappingEntity__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__10_in_rule__EMappingEntity__Group__92959);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1466:1: rule__EMappingEntity__Group__9__Impl : ( ( rule__EMappingEntity__Group_9__0 )* ) ;
    public final void rule__EMappingEntity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1470:1: ( ( ( rule__EMappingEntity__Group_9__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1471:1: ( ( rule__EMappingEntity__Group_9__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1471:1: ( ( rule__EMappingEntity__Group_9__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1472:1: ( rule__EMappingEntity__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_9()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1473:1: ( rule__EMappingEntity__Group_9__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1473:2: rule__EMappingEntity__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntity__Group_9__0_in_rule__EMappingEntity__Group__9__Impl2986);
            	    rule__EMappingEntity__Group_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1483:1: rule__EMappingEntity__Group__10 : rule__EMappingEntity__Group__10__Impl rule__EMappingEntity__Group__11 ;
    public final void rule__EMappingEntity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1487:1: ( rule__EMappingEntity__Group__10__Impl rule__EMappingEntity__Group__11 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1488:2: rule__EMappingEntity__Group__10__Impl rule__EMappingEntity__Group__11
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__10__Impl_in_rule__EMappingEntity__Group__103017);
            rule__EMappingEntity__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__11_in_rule__EMappingEntity__Group__103020);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1495:1: rule__EMappingEntity__Group__10__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1499:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1500:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1500:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1501:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,16,FOLLOW_16_in_rule__EMappingEntity__Group__10__Impl3048); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1514:1: rule__EMappingEntity__Group__11 : rule__EMappingEntity__Group__11__Impl rule__EMappingEntity__Group__12 ;
    public final void rule__EMappingEntity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1518:1: ( rule__EMappingEntity__Group__11__Impl rule__EMappingEntity__Group__12 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1519:2: rule__EMappingEntity__Group__11__Impl rule__EMappingEntity__Group__12
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__11__Impl_in_rule__EMappingEntity__Group__113079);
            rule__EMappingEntity__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__12_in_rule__EMappingEntity__Group__113082);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1526:1: rule__EMappingEntity__Group__11__Impl : ( ( rule__EMappingEntity__Group_11__0 )? ) ;
    public final void rule__EMappingEntity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1530:1: ( ( ( rule__EMappingEntity__Group_11__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1531:1: ( ( rule__EMappingEntity__Group_11__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1531:1: ( ( rule__EMappingEntity__Group_11__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1532:1: ( rule__EMappingEntity__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_11()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1533:1: ( rule__EMappingEntity__Group_11__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1533:2: rule__EMappingEntity__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_11__0_in_rule__EMappingEntity__Group__11__Impl3109);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1543:1: rule__EMappingEntity__Group__12 : rule__EMappingEntity__Group__12__Impl rule__EMappingEntity__Group__13 ;
    public final void rule__EMappingEntity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1547:1: ( rule__EMappingEntity__Group__12__Impl rule__EMappingEntity__Group__13 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1548:2: rule__EMappingEntity__Group__12__Impl rule__EMappingEntity__Group__13
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__12__Impl_in_rule__EMappingEntity__Group__123140);
            rule__EMappingEntity__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group__13_in_rule__EMappingEntity__Group__123143);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1555:1: rule__EMappingEntity__Group__12__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1559:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1560:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1560:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1561:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,16,FOLLOW_16_in_rule__EMappingEntity__Group__12__Impl3171); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1574:1: rule__EMappingEntity__Group__13 : rule__EMappingEntity__Group__13__Impl ;
    public final void rule__EMappingEntity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1578:1: ( rule__EMappingEntity__Group__13__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1579:2: rule__EMappingEntity__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group__13__Impl_in_rule__EMappingEntity__Group__133202);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1585:1: rule__EMappingEntity__Group__13__Impl : ( ( rule__EMappingEntity__Group_13__0 )? ) ;
    public final void rule__EMappingEntity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1589:1: ( ( ( rule__EMappingEntity__Group_13__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1590:1: ( ( rule__EMappingEntity__Group_13__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1590:1: ( ( rule__EMappingEntity__Group_13__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1591:1: ( rule__EMappingEntity__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_13()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1592:1: ( rule__EMappingEntity__Group_13__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1592:2: rule__EMappingEntity__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__EMappingEntity__Group_13__0_in_rule__EMappingEntity__Group__13__Impl3229);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1630:1: rule__EMappingEntity__Group_3__0 : rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1 ;
    public final void rule__EMappingEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1634:1: ( rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1635:2: rule__EMappingEntity__Group_3__0__Impl rule__EMappingEntity__Group_3__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__0__Impl_in_rule__EMappingEntity__Group_3__03288);
            rule__EMappingEntity__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__1_in_rule__EMappingEntity__Group_3__03291);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1642:1: rule__EMappingEntity__Group_3__0__Impl : ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) ) ;
    public final void rule__EMappingEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1646:1: ( ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1647:1: ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1647:1: ( ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1648:1: ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getExtensionTypeAssignment_3_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1649:1: ( rule__EMappingEntity__ExtensionTypeAssignment_3_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1649:2: rule__EMappingEntity__ExtensionTypeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ExtensionTypeAssignment_3_0_in_rule__EMappingEntity__Group_3__0__Impl3318);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1659:1: rule__EMappingEntity__Group_3__1 : rule__EMappingEntity__Group_3__1__Impl ;
    public final void rule__EMappingEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1663:1: ( rule__EMappingEntity__Group_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1664:2: rule__EMappingEntity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_3__1__Impl_in_rule__EMappingEntity__Group_3__13348);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1670:1: rule__EMappingEntity__Group_3__1__Impl : ( ( rule__EMappingEntity__ParentAssignment_3_1 ) ) ;
    public final void rule__EMappingEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1674:1: ( ( ( rule__EMappingEntity__ParentAssignment_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1675:1: ( ( rule__EMappingEntity__ParentAssignment_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1675:1: ( ( rule__EMappingEntity__ParentAssignment_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1676:1: ( rule__EMappingEntity__ParentAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentAssignment_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1677:1: ( rule__EMappingEntity__ParentAssignment_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1677:2: rule__EMappingEntity__ParentAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ParentAssignment_3_1_in_rule__EMappingEntity__Group_3__1__Impl3375);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1691:1: rule__EMappingEntity__Group_9__0 : rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1 ;
    public final void rule__EMappingEntity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1695:1: ( rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1696:2: rule__EMappingEntity__Group_9__0__Impl rule__EMappingEntity__Group_9__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__0__Impl_in_rule__EMappingEntity__Group_9__03409);
            rule__EMappingEntity__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__1_in_rule__EMappingEntity__Group_9__03412);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1703:1: rule__EMappingEntity__Group_9__0__Impl : ( ',' ) ;
    public final void rule__EMappingEntity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1707:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1708:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1708:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1709:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getCommaKeyword_9_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group_9__0__Impl3440); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1722:1: rule__EMappingEntity__Group_9__1 : rule__EMappingEntity__Group_9__1__Impl ;
    public final void rule__EMappingEntity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1726:1: ( rule__EMappingEntity__Group_9__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1727:2: rule__EMappingEntity__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_9__1__Impl_in_rule__EMappingEntity__Group_9__13471);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1733:1: rule__EMappingEntity__Group_9__1__Impl : ( ( rule__EMappingEntity__AttributesAssignment_9_1 ) ) ;
    public final void rule__EMappingEntity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1737:1: ( ( ( rule__EMappingEntity__AttributesAssignment_9_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1738:1: ( ( rule__EMappingEntity__AttributesAssignment_9_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1738:1: ( ( rule__EMappingEntity__AttributesAssignment_9_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1739:1: ( rule__EMappingEntity__AttributesAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesAssignment_9_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1740:1: ( rule__EMappingEntity__AttributesAssignment_9_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1740:2: rule__EMappingEntity__AttributesAssignment_9_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__AttributesAssignment_9_1_in_rule__EMappingEntity__Group_9__1__Impl3498);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1754:1: rule__EMappingEntity__Group_11__0 : rule__EMappingEntity__Group_11__0__Impl rule__EMappingEntity__Group_11__1 ;
    public final void rule__EMappingEntity__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1758:1: ( rule__EMappingEntity__Group_11__0__Impl rule__EMappingEntity__Group_11__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1759:2: rule__EMappingEntity__Group_11__0__Impl rule__EMappingEntity__Group_11__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__0__Impl_in_rule__EMappingEntity__Group_11__03532);
            rule__EMappingEntity__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__1_in_rule__EMappingEntity__Group_11__03535);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1766:1: rule__EMappingEntity__Group_11__0__Impl : ( 'queries' ) ;
    public final void rule__EMappingEntity__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1770:1: ( ( 'queries' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1771:1: ( 'queries' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1771:1: ( 'queries' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1772:1: 'queries'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getQueriesKeyword_11_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__EMappingEntity__Group_11__0__Impl3563); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1785:1: rule__EMappingEntity__Group_11__1 : rule__EMappingEntity__Group_11__1__Impl rule__EMappingEntity__Group_11__2 ;
    public final void rule__EMappingEntity__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1789:1: ( rule__EMappingEntity__Group_11__1__Impl rule__EMappingEntity__Group_11__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1790:2: rule__EMappingEntity__Group_11__1__Impl rule__EMappingEntity__Group_11__2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__1__Impl_in_rule__EMappingEntity__Group_11__13594);
            rule__EMappingEntity__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__2_in_rule__EMappingEntity__Group_11__13597);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1797:1: rule__EMappingEntity__Group_11__1__Impl : ( '{' ) ;
    public final void rule__EMappingEntity__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1801:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1802:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1802:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1803:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getLeftCurlyBracketKeyword_11_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__EMappingEntity__Group_11__1__Impl3625); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1816:1: rule__EMappingEntity__Group_11__2 : rule__EMappingEntity__Group_11__2__Impl rule__EMappingEntity__Group_11__3 ;
    public final void rule__EMappingEntity__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1820:1: ( rule__EMappingEntity__Group_11__2__Impl rule__EMappingEntity__Group_11__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1821:2: rule__EMappingEntity__Group_11__2__Impl rule__EMappingEntity__Group_11__3
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__2__Impl_in_rule__EMappingEntity__Group_11__23656);
            rule__EMappingEntity__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__3_in_rule__EMappingEntity__Group_11__23659);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1828:1: rule__EMappingEntity__Group_11__2__Impl : ( ( rule__EMappingEntity__NamedQueriesAssignment_11_2 ) ) ;
    public final void rule__EMappingEntity__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1832:1: ( ( ( rule__EMappingEntity__NamedQueriesAssignment_11_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1833:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_11_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1833:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_11_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1834:1: ( rule__EMappingEntity__NamedQueriesAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_11_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1835:1: ( rule__EMappingEntity__NamedQueriesAssignment_11_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1835:2: rule__EMappingEntity__NamedQueriesAssignment_11_2
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_11_2_in_rule__EMappingEntity__Group_11__2__Impl3686);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1845:1: rule__EMappingEntity__Group_11__3 : rule__EMappingEntity__Group_11__3__Impl rule__EMappingEntity__Group_11__4 ;
    public final void rule__EMappingEntity__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1849:1: ( rule__EMappingEntity__Group_11__3__Impl rule__EMappingEntity__Group_11__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1850:2: rule__EMappingEntity__Group_11__3__Impl rule__EMappingEntity__Group_11__4
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__3__Impl_in_rule__EMappingEntity__Group_11__33716);
            rule__EMappingEntity__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__4_in_rule__EMappingEntity__Group_11__33719);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1857:1: rule__EMappingEntity__Group_11__3__Impl : ( ( rule__EMappingEntity__Group_11_3__0 )* ) ;
    public final void rule__EMappingEntity__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1861:1: ( ( ( rule__EMappingEntity__Group_11_3__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1862:1: ( ( rule__EMappingEntity__Group_11_3__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1862:1: ( ( rule__EMappingEntity__Group_11_3__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1863:1: ( rule__EMappingEntity__Group_11_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getGroup_11_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1864:1: ( rule__EMappingEntity__Group_11_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1864:2: rule__EMappingEntity__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_rule__EMappingEntity__Group_11_3__0_in_rule__EMappingEntity__Group_11__3__Impl3746);
            	    rule__EMappingEntity__Group_11_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1874:1: rule__EMappingEntity__Group_11__4 : rule__EMappingEntity__Group_11__4__Impl ;
    public final void rule__EMappingEntity__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1878:1: ( rule__EMappingEntity__Group_11__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1879:2: rule__EMappingEntity__Group_11__4__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11__4__Impl_in_rule__EMappingEntity__Group_11__43777);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1885:1: rule__EMappingEntity__Group_11__4__Impl : ( '}' ) ;
    public final void rule__EMappingEntity__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1889:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1890:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1890:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1891:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getRightCurlyBracketKeyword_11_4()); 
            }
            match(input,16,FOLLOW_16_in_rule__EMappingEntity__Group_11__4__Impl3805); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1914:1: rule__EMappingEntity__Group_11_3__0 : rule__EMappingEntity__Group_11_3__0__Impl rule__EMappingEntity__Group_11_3__1 ;
    public final void rule__EMappingEntity__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1918:1: ( rule__EMappingEntity__Group_11_3__0__Impl rule__EMappingEntity__Group_11_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1919:2: rule__EMappingEntity__Group_11_3__0__Impl rule__EMappingEntity__Group_11_3__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11_3__0__Impl_in_rule__EMappingEntity__Group_11_3__03846);
            rule__EMappingEntity__Group_11_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11_3__1_in_rule__EMappingEntity__Group_11_3__03849);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1926:1: rule__EMappingEntity__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__EMappingEntity__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1930:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1931:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1931:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1932:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getCommaKeyword_11_3_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__EMappingEntity__Group_11_3__0__Impl3877); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1945:1: rule__EMappingEntity__Group_11_3__1 : rule__EMappingEntity__Group_11_3__1__Impl ;
    public final void rule__EMappingEntity__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1949:1: ( rule__EMappingEntity__Group_11_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1950:2: rule__EMappingEntity__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_11_3__1__Impl_in_rule__EMappingEntity__Group_11_3__13908);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1956:1: rule__EMappingEntity__Group_11_3__1__Impl : ( ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 ) ) ;
    public final void rule__EMappingEntity__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1960:1: ( ( ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1961:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1961:1: ( ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1962:1: ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesAssignment_11_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1963:1: ( rule__EMappingEntity__NamedQueriesAssignment_11_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1963:2: rule__EMappingEntity__NamedQueriesAssignment_11_3_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_11_3_1_in_rule__EMappingEntity__Group_11_3__1__Impl3935);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1977:1: rule__EMappingEntity__Group_13__0 : rule__EMappingEntity__Group_13__0__Impl rule__EMappingEntity__Group_13__1 ;
    public final void rule__EMappingEntity__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1981:1: ( rule__EMappingEntity__Group_13__0__Impl rule__EMappingEntity__Group_13__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1982:2: rule__EMappingEntity__Group_13__0__Impl rule__EMappingEntity__Group_13__1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_13__0__Impl_in_rule__EMappingEntity__Group_13__03969);
            rule__EMappingEntity__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingEntity__Group_13__1_in_rule__EMappingEntity__Group_13__03972);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1989:1: rule__EMappingEntity__Group_13__0__Impl : ( 'as' ) ;
    public final void rule__EMappingEntity__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1993:1: ( ( 'as' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1994:1: ( 'as' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1994:1: ( 'as' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:1995:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAsKeyword_13_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__EMappingEntity__Group_13__0__Impl4000); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2008:1: rule__EMappingEntity__Group_13__1 : rule__EMappingEntity__Group_13__1__Impl ;
    public final void rule__EMappingEntity__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2012:1: ( rule__EMappingEntity__Group_13__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2013:2: rule__EMappingEntity__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingEntity__Group_13__1__Impl_in_rule__EMappingEntity__Group_13__14031);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2019:1: rule__EMappingEntity__Group_13__1__Impl : ( ( rule__EMappingEntity__TableNameAssignment_13_1 ) ) ;
    public final void rule__EMappingEntity__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2023:1: ( ( ( rule__EMappingEntity__TableNameAssignment_13_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2024:1: ( ( rule__EMappingEntity__TableNameAssignment_13_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2024:1: ( ( rule__EMappingEntity__TableNameAssignment_13_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2025:1: ( rule__EMappingEntity__TableNameAssignment_13_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getTableNameAssignment_13_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2026:1: ( rule__EMappingEntity__TableNameAssignment_13_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2026:2: rule__EMappingEntity__TableNameAssignment_13_1
            {
            pushFollow(FOLLOW_rule__EMappingEntity__TableNameAssignment_13_1_in_rule__EMappingEntity__Group_13__1__Impl4058);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2040:1: rule__EAttribute__Group__0 : rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1 ;
    public final void rule__EAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2044:1: ( rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2045:2: rule__EAttribute__Group__0__Impl rule__EAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__0__Impl_in_rule__EAttribute__Group__04092);
            rule__EAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__1_in_rule__EAttribute__Group__04095);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2052:1: rule__EAttribute__Group__0__Impl : ( ( rule__EAttribute__PkAssignment_0 )? ) ;
    public final void rule__EAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2056:1: ( ( ( rule__EAttribute__PkAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2057:1: ( ( rule__EAttribute__PkAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2057:1: ( ( rule__EAttribute__PkAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2058:1: ( rule__EAttribute__PkAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2059:1: ( rule__EAttribute__PkAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2059:2: rule__EAttribute__PkAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EAttribute__PkAssignment_0_in_rule__EAttribute__Group__0__Impl4122);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2069:1: rule__EAttribute__Group__1 : rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2 ;
    public final void rule__EAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2073:1: ( rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2074:2: rule__EAttribute__Group__1__Impl rule__EAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__1__Impl_in_rule__EAttribute__Group__14153);
            rule__EAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__2_in_rule__EAttribute__Group__14156);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2081:1: rule__EAttribute__Group__1__Impl : ( ( rule__EAttribute__PropertyAssignment_1 ) ) ;
    public final void rule__EAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2085:1: ( ( ( rule__EAttribute__PropertyAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2086:1: ( ( rule__EAttribute__PropertyAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2086:1: ( ( rule__EAttribute__PropertyAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2087:1: ( rule__EAttribute__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPropertyAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2088:1: ( rule__EAttribute__PropertyAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2088:2: rule__EAttribute__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__EAttribute__PropertyAssignment_1_in_rule__EAttribute__Group__1__Impl4183);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2098:1: rule__EAttribute__Group__2 : rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3 ;
    public final void rule__EAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2102:1: ( rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2103:2: rule__EAttribute__Group__2__Impl rule__EAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__2__Impl_in_rule__EAttribute__Group__24213);
            rule__EAttribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group__3_in_rule__EAttribute__Group__24216);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2110:1: rule__EAttribute__Group__2__Impl : ( '=>' ) ;
    public final void rule__EAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2114:1: ( ( '=>' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2115:1: ( '=>' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2115:1: ( '=>' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2116:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__EAttribute__Group__2__Impl4244); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2129:1: rule__EAttribute__Group__3 : rule__EAttribute__Group__3__Impl ;
    public final void rule__EAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2133:1: ( rule__EAttribute__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2134:2: rule__EAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group__3__Impl_in_rule__EAttribute__Group__34275);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2140:1: rule__EAttribute__Group__3__Impl : ( ( rule__EAttribute__Alternatives_3 ) ) ;
    public final void rule__EAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2144:1: ( ( ( rule__EAttribute__Alternatives_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2145:1: ( ( rule__EAttribute__Alternatives_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2145:1: ( ( rule__EAttribute__Alternatives_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2146:1: ( rule__EAttribute__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2147:1: ( rule__EAttribute__Alternatives_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2147:2: rule__EAttribute__Alternatives_3
            {
            pushFollow(FOLLOW_rule__EAttribute__Alternatives_3_in_rule__EAttribute__Group__3__Impl4302);
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


    // $ANTLR start "rule__EAttribute__Group_3_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2165:1: rule__EAttribute__Group_3_1__0 : rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1 ;
    public final void rule__EAttribute__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2169:1: ( rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2170:2: rule__EAttribute__Group_3_1__0__Impl rule__EAttribute__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__0__Impl_in_rule__EAttribute__Group_3_1__04340);
            rule__EAttribute__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__1_in_rule__EAttribute__Group_3_1__04343);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2177:1: rule__EAttribute__Group_3_1__0__Impl : ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) ) ;
    public final void rule__EAttribute__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2181:1: ( ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2182:1: ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2182:1: ( ( rule__EAttribute__ResolvedAssignment_3_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2183:1: ( rule__EAttribute__ResolvedAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedAssignment_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2184:1: ( rule__EAttribute__ResolvedAssignment_3_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2184:2: rule__EAttribute__ResolvedAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__EAttribute__ResolvedAssignment_3_1_0_in_rule__EAttribute__Group_3_1__0__Impl4370);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2194:1: rule__EAttribute__Group_3_1__1 : rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2 ;
    public final void rule__EAttribute__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2198:1: ( rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2199:2: rule__EAttribute__Group_3_1__1__Impl rule__EAttribute__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__1__Impl_in_rule__EAttribute__Group_3_1__14400);
            rule__EAttribute__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__2_in_rule__EAttribute__Group_3_1__14403);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2206:1: rule__EAttribute__Group_3_1__1__Impl : ( ( rule__EAttribute__QueryAssignment_3_1_1 ) ) ;
    public final void rule__EAttribute__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2210:1: ( ( ( rule__EAttribute__QueryAssignment_3_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2211:1: ( ( rule__EAttribute__QueryAssignment_3_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2211:1: ( ( rule__EAttribute__QueryAssignment_3_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2212:1: ( rule__EAttribute__QueryAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryAssignment_3_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2213:1: ( rule__EAttribute__QueryAssignment_3_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2213:2: rule__EAttribute__QueryAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EAttribute__QueryAssignment_3_1_1_in_rule__EAttribute__Group_3_1__1__Impl4430);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2223:1: rule__EAttribute__Group_3_1__2 : rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3 ;
    public final void rule__EAttribute__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2227:1: ( rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2228:2: rule__EAttribute__Group_3_1__2__Impl rule__EAttribute__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__2__Impl_in_rule__EAttribute__Group_3_1__24460);
            rule__EAttribute__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__3_in_rule__EAttribute__Group_3_1__24463);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2235:1: rule__EAttribute__Group_3_1__2__Impl : ( '(' ) ;
    public final void rule__EAttribute__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2239:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2240:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2240:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2241:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getLeftParenthesisKeyword_3_1_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__EAttribute__Group_3_1__2__Impl4491); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2254:1: rule__EAttribute__Group_3_1__3 : rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4 ;
    public final void rule__EAttribute__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2258:1: ( rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2259:2: rule__EAttribute__Group_3_1__3__Impl rule__EAttribute__Group_3_1__4
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__3__Impl_in_rule__EAttribute__Group_3_1__34522);
            rule__EAttribute__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__4_in_rule__EAttribute__Group_3_1__34525);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2266:1: rule__EAttribute__Group_3_1__3__Impl : ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) ) ;
    public final void rule__EAttribute__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2270:1: ( ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2271:1: ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2271:1: ( ( rule__EAttribute__ParametersAssignment_3_1_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2272:1: ( rule__EAttribute__ParametersAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getParametersAssignment_3_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2273:1: ( rule__EAttribute__ParametersAssignment_3_1_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2273:2: rule__EAttribute__ParametersAssignment_3_1_3
            {
            pushFollow(FOLLOW_rule__EAttribute__ParametersAssignment_3_1_3_in_rule__EAttribute__Group_3_1__3__Impl4552);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2283:1: rule__EAttribute__Group_3_1__4 : rule__EAttribute__Group_3_1__4__Impl ;
    public final void rule__EAttribute__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2287:1: ( rule__EAttribute__Group_3_1__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2288:2: rule__EAttribute__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_rule__EAttribute__Group_3_1__4__Impl_in_rule__EAttribute__Group_3_1__44582);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2294:1: rule__EAttribute__Group_3_1__4__Impl : ( ')' ) ;
    public final void rule__EAttribute__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2298:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2299:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2299:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2300:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getRightParenthesisKeyword_3_1_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__EAttribute__Group_3_1__4__Impl4610); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2323:1: rule__ENamedQuery__Group__0 : rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1 ;
    public final void rule__ENamedQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2327:1: ( rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2328:2: rule__ENamedQuery__Group__0__Impl rule__ENamedQuery__Group__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__0__Impl_in_rule__ENamedQuery__Group__04651);
            rule__ENamedQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__1_in_rule__ENamedQuery__Group__04654);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2335:1: rule__ENamedQuery__Group__0__Impl : ( ( rule__ENamedQuery__NameAssignment_0 ) ) ;
    public final void rule__ENamedQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2339:1: ( ( ( rule__ENamedQuery__NameAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2340:1: ( ( rule__ENamedQuery__NameAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2340:1: ( ( rule__ENamedQuery__NameAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2341:1: ( rule__ENamedQuery__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getNameAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2342:1: ( rule__ENamedQuery__NameAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2342:2: rule__ENamedQuery__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ENamedQuery__NameAssignment_0_in_rule__ENamedQuery__Group__0__Impl4681);
            rule__ENamedQuery__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getNameAssignment_0()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2352:1: rule__ENamedQuery__Group__1 : rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2 ;
    public final void rule__ENamedQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2356:1: ( rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2357:2: rule__ENamedQuery__Group__1__Impl rule__ENamedQuery__Group__2
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__1__Impl_in_rule__ENamedQuery__Group__14711);
            rule__ENamedQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__2_in_rule__ENamedQuery__Group__14714);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2364:1: rule__ENamedQuery__Group__1__Impl : ( ( rule__ENamedQuery__Group_1__0 )? ) ;
    public final void rule__ENamedQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2368:1: ( ( ( rule__ENamedQuery__Group_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2369:1: ( ( rule__ENamedQuery__Group_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2369:1: ( ( rule__ENamedQuery__Group_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2370:1: ( rule__ENamedQuery__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getGroup_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2371:1: ( rule__ENamedQuery__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2371:2: rule__ENamedQuery__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ENamedQuery__Group_1__0_in_rule__ENamedQuery__Group__1__Impl4741);
                    rule__ENamedQuery__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2381:1: rule__ENamedQuery__Group__2 : rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3 ;
    public final void rule__ENamedQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2385:1: ( rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2386:2: rule__ENamedQuery__Group__2__Impl rule__ENamedQuery__Group__3
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__2__Impl_in_rule__ENamedQuery__Group__24772);
            rule__ENamedQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__3_in_rule__ENamedQuery__Group__24775);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2393:1: rule__ENamedQuery__Group__2__Impl : ( '{' ) ;
    public final void rule__ENamedQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2397:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2398:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2398:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2399:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__ENamedQuery__Group__2__Impl4803); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2412:1: rule__ENamedQuery__Group__3 : rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4 ;
    public final void rule__ENamedQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2416:1: ( rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2417:2: rule__ENamedQuery__Group__3__Impl rule__ENamedQuery__Group__4
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__3__Impl_in_rule__ENamedQuery__Group__34834);
            rule__ENamedQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group__4_in_rule__ENamedQuery__Group__34837);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2424:1: rule__ENamedQuery__Group__3__Impl : ( ( rule__ENamedQuery__QueriesAssignment_3 ) ) ;
    public final void rule__ENamedQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2428:1: ( ( ( rule__ENamedQuery__QueriesAssignment_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2429:1: ( ( rule__ENamedQuery__QueriesAssignment_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2429:1: ( ( rule__ENamedQuery__QueriesAssignment_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2430:1: ( rule__ENamedQuery__QueriesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesAssignment_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2431:1: ( rule__ENamedQuery__QueriesAssignment_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2431:2: rule__ENamedQuery__QueriesAssignment_3
            {
            pushFollow(FOLLOW_rule__ENamedQuery__QueriesAssignment_3_in_rule__ENamedQuery__Group__3__Impl4864);
            rule__ENamedQuery__QueriesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getQueriesAssignment_3()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2441:1: rule__ENamedQuery__Group__4 : rule__ENamedQuery__Group__4__Impl ;
    public final void rule__ENamedQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2445:1: ( rule__ENamedQuery__Group__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2446:2: rule__ENamedQuery__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group__4__Impl_in_rule__ENamedQuery__Group__44894);
            rule__ENamedQuery__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2452:1: rule__ENamedQuery__Group__4__Impl : ( '}' ) ;
    public final void rule__ENamedQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2456:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2457:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2457:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2458:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,16,FOLLOW_16_in_rule__ENamedQuery__Group__4__Impl4922); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ENamedQuery__Group_1__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2481:1: rule__ENamedQuery__Group_1__0 : rule__ENamedQuery__Group_1__0__Impl rule__ENamedQuery__Group_1__1 ;
    public final void rule__ENamedQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2485:1: ( rule__ENamedQuery__Group_1__0__Impl rule__ENamedQuery__Group_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2486:2: rule__ENamedQuery__Group_1__0__Impl rule__ENamedQuery__Group_1__1
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_1__0__Impl_in_rule__ENamedQuery__Group_1__04963);
            rule__ENamedQuery__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_1__1_in_rule__ENamedQuery__Group_1__04966);
            rule__ENamedQuery__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ENamedQuery__Group_1__0"


    // $ANTLR start "rule__ENamedQuery__Group_1__0__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2493:1: rule__ENamedQuery__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ENamedQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2497:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2498:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2498:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2499:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__ENamedQuery__Group_1__0__Impl4994); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ENamedQuery__Group_1__0__Impl"


    // $ANTLR start "rule__ENamedQuery__Group_1__1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2512:1: rule__ENamedQuery__Group_1__1 : rule__ENamedQuery__Group_1__1__Impl rule__ENamedQuery__Group_1__2 ;
    public final void rule__ENamedQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2516:1: ( rule__ENamedQuery__Group_1__1__Impl rule__ENamedQuery__Group_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2517:2: rule__ENamedQuery__Group_1__1__Impl rule__ENamedQuery__Group_1__2
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_1__1__Impl_in_rule__ENamedQuery__Group_1__15025);
            rule__ENamedQuery__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ENamedQuery__Group_1__2_in_rule__ENamedQuery__Group_1__15028);
            rule__ENamedQuery__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ENamedQuery__Group_1__1"


    // $ANTLR start "rule__ENamedQuery__Group_1__1__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2524:1: rule__ENamedQuery__Group_1__1__Impl : ( ( rule__ENamedQuery__ParametersAssignment_1_1 )* ) ;
    public final void rule__ENamedQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2528:1: ( ( ( rule__ENamedQuery__ParametersAssignment_1_1 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2529:1: ( ( rule__ENamedQuery__ParametersAssignment_1_1 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2529:1: ( ( rule__ENamedQuery__ParametersAssignment_1_1 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2530:1: ( rule__ENamedQuery__ParametersAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getParametersAssignment_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2531:1: ( rule__ENamedQuery__ParametersAssignment_1_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2531:2: rule__ENamedQuery__ParametersAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__ENamedQuery__ParametersAssignment_1_1_in_rule__ENamedQuery__Group_1__1__Impl5055);
            	    rule__ENamedQuery__ParametersAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getParametersAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ENamedQuery__Group_1__1__Impl"


    // $ANTLR start "rule__ENamedQuery__Group_1__2"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2541:1: rule__ENamedQuery__Group_1__2 : rule__ENamedQuery__Group_1__2__Impl ;
    public final void rule__ENamedQuery__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2545:1: ( rule__ENamedQuery__Group_1__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2546:2: rule__ENamedQuery__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ENamedQuery__Group_1__2__Impl_in_rule__ENamedQuery__Group_1__25086);
            rule__ENamedQuery__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ENamedQuery__Group_1__2"


    // $ANTLR start "rule__ENamedQuery__Group_1__2__Impl"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2552:1: rule__ENamedQuery__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ENamedQuery__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2556:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2557:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2557:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2558:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__ENamedQuery__Group_1__2__Impl5114); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ENamedQuery__Group_1__2__Impl"


    // $ANTLR start "rule__EParameter__Group__0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2577:1: rule__EParameter__Group__0 : rule__EParameter__Group__0__Impl rule__EParameter__Group__1 ;
    public final void rule__EParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2581:1: ( rule__EParameter__Group__0__Impl rule__EParameter__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2582:2: rule__EParameter__Group__0__Impl rule__EParameter__Group__1
            {
            pushFollow(FOLLOW_rule__EParameter__Group__0__Impl_in_rule__EParameter__Group__05151);
            rule__EParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EParameter__Group__1_in_rule__EParameter__Group__05154);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2589:1: rule__EParameter__Group__0__Impl : ( ( rule__EParameter__TypeAssignment_0 ) ) ;
    public final void rule__EParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2593:1: ( ( ( rule__EParameter__TypeAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2594:1: ( ( rule__EParameter__TypeAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2594:1: ( ( rule__EParameter__TypeAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2595:1: ( rule__EParameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2596:1: ( rule__EParameter__TypeAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2596:2: rule__EParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EParameter__TypeAssignment_0_in_rule__EParameter__Group__0__Impl5181);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2606:1: rule__EParameter__Group__1 : rule__EParameter__Group__1__Impl ;
    public final void rule__EParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2610:1: ( rule__EParameter__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2611:2: rule__EParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EParameter__Group__1__Impl_in_rule__EParameter__Group__15211);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2617:1: rule__EParameter__Group__1__Impl : ( ( rule__EParameter__NameAssignment_1 ) ) ;
    public final void rule__EParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2621:1: ( ( ( rule__EParameter__NameAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2622:1: ( ( rule__EParameter__NameAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2622:1: ( ( rule__EParameter__NameAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2623:1: ( rule__EParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2624:1: ( rule__EParameter__NameAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2624:2: rule__EParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EParameter__NameAssignment_1_in_rule__EParameter__Group__1__Impl5238);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2638:1: rule__EQuery__Group__0 : rule__EQuery__Group__0__Impl rule__EQuery__Group__1 ;
    public final void rule__EQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2642:1: ( rule__EQuery__Group__0__Impl rule__EQuery__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2643:2: rule__EQuery__Group__0__Impl rule__EQuery__Group__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group__0__Impl_in_rule__EQuery__Group__05272);
            rule__EQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group__1_in_rule__EQuery__Group__05275);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2650:1: rule__EQuery__Group__0__Impl : ( ( rule__EQuery__DbTypeAssignment_0 ) ) ;
    public final void rule__EQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2654:1: ( ( ( rule__EQuery__DbTypeAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2655:1: ( ( rule__EQuery__DbTypeAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2655:1: ( ( rule__EQuery__DbTypeAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2656:1: ( rule__EQuery__DbTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getDbTypeAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2657:1: ( rule__EQuery__DbTypeAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2657:2: rule__EQuery__DbTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__EQuery__DbTypeAssignment_0_in_rule__EQuery__Group__0__Impl5302);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2667:1: rule__EQuery__Group__1 : rule__EQuery__Group__1__Impl rule__EQuery__Group__2 ;
    public final void rule__EQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2671:1: ( rule__EQuery__Group__1__Impl rule__EQuery__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2672:2: rule__EQuery__Group__1__Impl rule__EQuery__Group__2
            {
            pushFollow(FOLLOW_rule__EQuery__Group__1__Impl_in_rule__EQuery__Group__15332);
            rule__EQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group__2_in_rule__EQuery__Group__15335);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2679:1: rule__EQuery__Group__1__Impl : ( ( rule__EQuery__MappingAssignment_1 ) ) ;
    public final void rule__EQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2683:1: ( ( ( rule__EQuery__MappingAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2684:1: ( ( rule__EQuery__MappingAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2684:1: ( ( rule__EQuery__MappingAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2685:1: ( rule__EQuery__MappingAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getMappingAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2686:1: ( rule__EQuery__MappingAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2686:2: rule__EQuery__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__EQuery__MappingAssignment_1_in_rule__EQuery__Group__1__Impl5362);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2696:1: rule__EQuery__Group__2 : rule__EQuery__Group__2__Impl ;
    public final void rule__EQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2700:1: ( rule__EQuery__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2701:2: rule__EQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group__2__Impl_in_rule__EQuery__Group__25392);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2707:1: rule__EQuery__Group__2__Impl : ( ( rule__EQuery__Alternatives_2 ) ) ;
    public final void rule__EQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2711:1: ( ( ( rule__EQuery__Alternatives_2 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2712:1: ( ( rule__EQuery__Alternatives_2 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2712:1: ( ( rule__EQuery__Alternatives_2 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2713:1: ( rule__EQuery__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getAlternatives_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2714:1: ( rule__EQuery__Alternatives_2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2714:2: rule__EQuery__Alternatives_2
            {
            pushFollow(FOLLOW_rule__EQuery__Alternatives_2_in_rule__EQuery__Group__2__Impl5419);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2730:1: rule__EQuery__Group_2_0__0 : rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1 ;
    public final void rule__EQuery__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2734:1: ( rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2735:2: rule__EQuery__Group_2_0__0__Impl rule__EQuery__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__0__Impl_in_rule__EQuery__Group_2_0__05455);
            rule__EQuery__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__1_in_rule__EQuery__Group_2_0__05458);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2742:1: rule__EQuery__Group_2_0__0__Impl : ( 'FROM' ) ;
    public final void rule__EQuery__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2746:1: ( ( 'FROM' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2747:1: ( 'FROM' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2747:1: ( 'FROM' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2748:1: 'FROM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFROMKeyword_2_0_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__EQuery__Group_2_0__0__Impl5486); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2761:1: rule__EQuery__Group_2_0__1 : rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2 ;
    public final void rule__EQuery__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2765:1: ( rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2766:2: rule__EQuery__Group_2_0__1__Impl rule__EQuery__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__1__Impl_in_rule__EQuery__Group_2_0__15517);
            rule__EQuery__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__2_in_rule__EQuery__Group_2_0__15520);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2773:1: rule__EQuery__Group_2_0__1__Impl : ( ( rule__EQuery__FromAssignment_2_0_1 ) ) ;
    public final void rule__EQuery__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2777:1: ( ( ( rule__EQuery__FromAssignment_2_0_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2778:1: ( ( rule__EQuery__FromAssignment_2_0_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2778:1: ( ( rule__EQuery__FromAssignment_2_0_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2779:1: ( rule__EQuery__FromAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFromAssignment_2_0_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2780:1: ( rule__EQuery__FromAssignment_2_0_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2780:2: rule__EQuery__FromAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__EQuery__FromAssignment_2_0_1_in_rule__EQuery__Group_2_0__1__Impl5547);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2790:1: rule__EQuery__Group_2_0__2 : rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3 ;
    public final void rule__EQuery__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2794:1: ( rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2795:2: rule__EQuery__Group_2_0__2__Impl rule__EQuery__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__2__Impl_in_rule__EQuery__Group_2_0__25577);
            rule__EQuery__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__3_in_rule__EQuery__Group_2_0__25580);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2802:1: rule__EQuery__Group_2_0__2__Impl : ( ( rule__EQuery__Group_2_0_2__0 )? ) ;
    public final void rule__EQuery__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2806:1: ( ( ( rule__EQuery__Group_2_0_2__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2807:1: ( ( rule__EQuery__Group_2_0_2__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2807:1: ( ( rule__EQuery__Group_2_0_2__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2808:1: ( rule__EQuery__Group_2_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2809:1: ( rule__EQuery__Group_2_0_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2809:2: rule__EQuery__Group_2_0_2__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__0_in_rule__EQuery__Group_2_0__2__Impl5607);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2819:1: rule__EQuery__Group_2_0__3 : rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4 ;
    public final void rule__EQuery__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2823:1: ( rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2824:2: rule__EQuery__Group_2_0__3__Impl rule__EQuery__Group_2_0__4
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__3__Impl_in_rule__EQuery__Group_2_0__35638);
            rule__EQuery__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__4_in_rule__EQuery__Group_2_0__35641);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2831:1: rule__EQuery__Group_2_0__3__Impl : ( ( rule__EQuery__Group_2_0_3__0 )? ) ;
    public final void rule__EQuery__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2835:1: ( ( ( rule__EQuery__Group_2_0_3__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2836:1: ( ( rule__EQuery__Group_2_0_3__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2836:1: ( ( rule__EQuery__Group_2_0_3__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2837:1: ( rule__EQuery__Group_2_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2838:1: ( rule__EQuery__Group_2_0_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2838:2: rule__EQuery__Group_2_0_3__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__0_in_rule__EQuery__Group_2_0__3__Impl5668);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2848:1: rule__EQuery__Group_2_0__4 : rule__EQuery__Group_2_0__4__Impl ;
    public final void rule__EQuery__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2852:1: ( rule__EQuery__Group_2_0__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2853:2: rule__EQuery__Group_2_0__4__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0__4__Impl_in_rule__EQuery__Group_2_0__45699);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2859:1: rule__EQuery__Group_2_0__4__Impl : ( ( rule__EQuery__Group_2_0_4__0 )? ) ;
    public final void rule__EQuery__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2863:1: ( ( ( rule__EQuery__Group_2_0_4__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2864:1: ( ( rule__EQuery__Group_2_0_4__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2864:1: ( ( rule__EQuery__Group_2_0_4__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2865:1: ( rule__EQuery__Group_2_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroup_2_0_4()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2866:1: ( rule__EQuery__Group_2_0_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2866:2: rule__EQuery__Group_2_0_4__0
                    {
                    pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__0_in_rule__EQuery__Group_2_0__4__Impl5726);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2886:1: rule__EQuery__Group_2_0_2__0 : rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1 ;
    public final void rule__EQuery__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2890:1: ( rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2891:2: rule__EQuery__Group_2_0_2__0__Impl rule__EQuery__Group_2_0_2__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__0__Impl_in_rule__EQuery__Group_2_0_2__05767);
            rule__EQuery__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__1_in_rule__EQuery__Group_2_0_2__05770);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2898:1: rule__EQuery__Group_2_0_2__0__Impl : ( 'WHERE' ) ;
    public final void rule__EQuery__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2902:1: ( ( 'WHERE' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2903:1: ( 'WHERE' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2903:1: ( 'WHERE' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2904:1: 'WHERE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWHEREKeyword_2_0_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__EQuery__Group_2_0_2__0__Impl5798); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2917:1: rule__EQuery__Group_2_0_2__1 : rule__EQuery__Group_2_0_2__1__Impl ;
    public final void rule__EQuery__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2921:1: ( rule__EQuery__Group_2_0_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2922:2: rule__EQuery__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_2__1__Impl_in_rule__EQuery__Group_2_0_2__15829);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2928:1: rule__EQuery__Group_2_0_2__1__Impl : ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) ) ;
    public final void rule__EQuery__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2932:1: ( ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2933:1: ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2933:1: ( ( rule__EQuery__WhereAssignment_2_0_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2934:1: ( rule__EQuery__WhereAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWhereAssignment_2_0_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2935:1: ( rule__EQuery__WhereAssignment_2_0_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2935:2: rule__EQuery__WhereAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_rule__EQuery__WhereAssignment_2_0_2_1_in_rule__EQuery__Group_2_0_2__1__Impl5856);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2949:1: rule__EQuery__Group_2_0_3__0 : rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1 ;
    public final void rule__EQuery__Group_2_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2953:1: ( rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2954:2: rule__EQuery__Group_2_0_3__0__Impl rule__EQuery__Group_2_0_3__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__0__Impl_in_rule__EQuery__Group_2_0_3__05890);
            rule__EQuery__Group_2_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__1_in_rule__EQuery__Group_2_0_3__05893);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2961:1: rule__EQuery__Group_2_0_3__0__Impl : ( 'GROUP BY' ) ;
    public final void rule__EQuery__Group_2_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2965:1: ( ( 'GROUP BY' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2966:1: ( 'GROUP BY' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2966:1: ( 'GROUP BY' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2967:1: 'GROUP BY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGROUPBYKeyword_2_0_3_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__EQuery__Group_2_0_3__0__Impl5921); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2980:1: rule__EQuery__Group_2_0_3__1 : rule__EQuery__Group_2_0_3__1__Impl ;
    public final void rule__EQuery__Group_2_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2984:1: ( rule__EQuery__Group_2_0_3__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2985:2: rule__EQuery__Group_2_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_3__1__Impl_in_rule__EQuery__Group_2_0_3__15952);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2991:1: rule__EQuery__Group_2_0_3__1__Impl : ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) ) ;
    public final void rule__EQuery__Group_2_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2995:1: ( ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2996:1: ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2996:1: ( ( rule__EQuery__GroupByAssignment_2_0_3_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2997:1: ( rule__EQuery__GroupByAssignment_2_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroupByAssignment_2_0_3_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2998:1: ( rule__EQuery__GroupByAssignment_2_0_3_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:2998:2: rule__EQuery__GroupByAssignment_2_0_3_1
            {
            pushFollow(FOLLOW_rule__EQuery__GroupByAssignment_2_0_3_1_in_rule__EQuery__Group_2_0_3__1__Impl5979);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3012:1: rule__EQuery__Group_2_0_4__0 : rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1 ;
    public final void rule__EQuery__Group_2_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3016:1: ( rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3017:2: rule__EQuery__Group_2_0_4__0__Impl rule__EQuery__Group_2_0_4__1
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__0__Impl_in_rule__EQuery__Group_2_0_4__06013);
            rule__EQuery__Group_2_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__1_in_rule__EQuery__Group_2_0_4__06016);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3024:1: rule__EQuery__Group_2_0_4__0__Impl : ( 'ORDER BY' ) ;
    public final void rule__EQuery__Group_2_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3028:1: ( ( 'ORDER BY' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3029:1: ( 'ORDER BY' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3029:1: ( 'ORDER BY' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3030:1: 'ORDER BY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getORDERBYKeyword_2_0_4_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__EQuery__Group_2_0_4__0__Impl6044); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3043:1: rule__EQuery__Group_2_0_4__1 : rule__EQuery__Group_2_0_4__1__Impl ;
    public final void rule__EQuery__Group_2_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3047:1: ( rule__EQuery__Group_2_0_4__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3048:2: rule__EQuery__Group_2_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EQuery__Group_2_0_4__1__Impl_in_rule__EQuery__Group_2_0_4__16075);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3054:1: rule__EQuery__Group_2_0_4__1__Impl : ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) ) ;
    public final void rule__EQuery__Group_2_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3058:1: ( ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3059:1: ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3059:1: ( ( rule__EQuery__OrderbyAssignment_2_0_4_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3060:1: ( rule__EQuery__OrderbyAssignment_2_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getOrderbyAssignment_2_0_4_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3061:1: ( rule__EQuery__OrderbyAssignment_2_0_4_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3061:2: rule__EQuery__OrderbyAssignment_2_0_4_1
            {
            pushFollow(FOLLOW_rule__EQuery__OrderbyAssignment_2_0_4_1_in_rule__EQuery__Group_2_0_4__1__Impl6102);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3075:1: rule__EObjectSection__Group__0 : rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1 ;
    public final void rule__EObjectSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3079:1: ( rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3080:2: rule__EObjectSection__Group__0__Impl rule__EObjectSection__Group__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__0__Impl_in_rule__EObjectSection__Group__06136);
            rule__EObjectSection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group__1_in_rule__EObjectSection__Group__06139);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3087:1: rule__EObjectSection__Group__0__Impl : ( ( rule__EObjectSection__EntityAssignment_0 ) ) ;
    public final void rule__EObjectSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3091:1: ( ( ( rule__EObjectSection__EntityAssignment_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3092:1: ( ( rule__EObjectSection__EntityAssignment_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3092:1: ( ( rule__EObjectSection__EntityAssignment_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3093:1: ( rule__EObjectSection__EntityAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3094:1: ( rule__EObjectSection__EntityAssignment_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3094:2: rule__EObjectSection__EntityAssignment_0
            {
            pushFollow(FOLLOW_rule__EObjectSection__EntityAssignment_0_in_rule__EObjectSection__Group__0__Impl6166);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3104:1: rule__EObjectSection__Group__1 : rule__EObjectSection__Group__1__Impl ;
    public final void rule__EObjectSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3108:1: ( rule__EObjectSection__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3109:2: rule__EObjectSection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group__1__Impl_in_rule__EObjectSection__Group__16196);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3115:1: rule__EObjectSection__Group__1__Impl : ( ( rule__EObjectSection__Group_1__0 )? ) ;
    public final void rule__EObjectSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3119:1: ( ( ( rule__EObjectSection__Group_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3120:1: ( ( rule__EObjectSection__Group_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3120:1: ( ( rule__EObjectSection__Group_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3121:1: ( rule__EObjectSection__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3122:1: ( rule__EObjectSection__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3122:2: rule__EObjectSection__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EObjectSection__Group_1__0_in_rule__EObjectSection__Group__1__Impl6223);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3136:1: rule__EObjectSection__Group_1__0 : rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1 ;
    public final void rule__EObjectSection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3140:1: ( rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3141:2: rule__EObjectSection__Group_1__0__Impl rule__EObjectSection__Group_1__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__0__Impl_in_rule__EObjectSection__Group_1__06258);
            rule__EObjectSection__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__1_in_rule__EObjectSection__Group_1__06261);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3148:1: rule__EObjectSection__Group_1__0__Impl : ( ( rule__EObjectSection__PrefixAssignment_1_0 ) ) ;
    public final void rule__EObjectSection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3152:1: ( ( ( rule__EObjectSection__PrefixAssignment_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3153:1: ( ( rule__EObjectSection__PrefixAssignment_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3153:1: ( ( rule__EObjectSection__PrefixAssignment_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3154:1: ( rule__EObjectSection__PrefixAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getPrefixAssignment_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3155:1: ( rule__EObjectSection__PrefixAssignment_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3155:2: rule__EObjectSection__PrefixAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EObjectSection__PrefixAssignment_1_0_in_rule__EObjectSection__Group_1__0__Impl6288);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3165:1: rule__EObjectSection__Group_1__1 : rule__EObjectSection__Group_1__1__Impl ;
    public final void rule__EObjectSection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3169:1: ( rule__EObjectSection__Group_1__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3170:2: rule__EObjectSection__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1__1__Impl_in_rule__EObjectSection__Group_1__16318);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3176:1: rule__EObjectSection__Group_1__1__Impl : ( ( rule__EObjectSection__Group_1_1__0 )? ) ;
    public final void rule__EObjectSection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3180:1: ( ( ( rule__EObjectSection__Group_1_1__0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3181:1: ( ( rule__EObjectSection__Group_1_1__0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3181:1: ( ( rule__EObjectSection__Group_1_1__0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3182:1: ( rule__EObjectSection__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3183:1: ( rule__EObjectSection__Group_1_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3183:2: rule__EObjectSection__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__0_in_rule__EObjectSection__Group_1__1__Impl6345);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3197:1: rule__EObjectSection__Group_1_1__0 : rule__EObjectSection__Group_1_1__0__Impl rule__EObjectSection__Group_1_1__1 ;
    public final void rule__EObjectSection__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3201:1: ( rule__EObjectSection__Group_1_1__0__Impl rule__EObjectSection__Group_1_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3202:2: rule__EObjectSection__Group_1_1__0__Impl rule__EObjectSection__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__0__Impl_in_rule__EObjectSection__Group_1_1__06380);
            rule__EObjectSection__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__1_in_rule__EObjectSection__Group_1_1__06383);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3209:1: rule__EObjectSection__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__EObjectSection__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3213:1: ( ( '{' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3214:1: ( '{' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3214:1: ( '{' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3215:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__EObjectSection__Group_1_1__0__Impl6411); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3228:1: rule__EObjectSection__Group_1_1__1 : rule__EObjectSection__Group_1_1__1__Impl rule__EObjectSection__Group_1_1__2 ;
    public final void rule__EObjectSection__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3232:1: ( rule__EObjectSection__Group_1_1__1__Impl rule__EObjectSection__Group_1_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3233:2: rule__EObjectSection__Group_1_1__1__Impl rule__EObjectSection__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__1__Impl_in_rule__EObjectSection__Group_1_1__16442);
            rule__EObjectSection__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__2_in_rule__EObjectSection__Group_1_1__16445);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3240:1: rule__EObjectSection__Group_1_1__1__Impl : ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) ) ;
    public final void rule__EObjectSection__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3244:1: ( ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3245:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3245:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3246:1: ( rule__EObjectSection__AttributesAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_1_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3247:1: ( rule__EObjectSection__AttributesAssignment_1_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3247:2: rule__EObjectSection__AttributesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_1_in_rule__EObjectSection__Group_1_1__1__Impl6472);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3257:1: rule__EObjectSection__Group_1_1__2 : rule__EObjectSection__Group_1_1__2__Impl rule__EObjectSection__Group_1_1__3 ;
    public final void rule__EObjectSection__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3261:1: ( rule__EObjectSection__Group_1_1__2__Impl rule__EObjectSection__Group_1_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3262:2: rule__EObjectSection__Group_1_1__2__Impl rule__EObjectSection__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__2__Impl_in_rule__EObjectSection__Group_1_1__26502);
            rule__EObjectSection__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__3_in_rule__EObjectSection__Group_1_1__26505);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3269:1: rule__EObjectSection__Group_1_1__2__Impl : ( ( rule__EObjectSection__Group_1_1_2__0 )* ) ;
    public final void rule__EObjectSection__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3273:1: ( ( ( rule__EObjectSection__Group_1_1_2__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3274:1: ( ( rule__EObjectSection__Group_1_1_2__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3274:1: ( ( rule__EObjectSection__Group_1_1_2__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3275:1: ( rule__EObjectSection__Group_1_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getGroup_1_1_2()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3276:1: ( rule__EObjectSection__Group_1_1_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3276:2: rule__EObjectSection__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__0_in_rule__EObjectSection__Group_1_1__2__Impl6532);
            	    rule__EObjectSection__Group_1_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3286:1: rule__EObjectSection__Group_1_1__3 : rule__EObjectSection__Group_1_1__3__Impl ;
    public final void rule__EObjectSection__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3290:1: ( rule__EObjectSection__Group_1_1__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3291:2: rule__EObjectSection__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1__3__Impl_in_rule__EObjectSection__Group_1_1__36563);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3297:1: rule__EObjectSection__Group_1_1__3__Impl : ( '}' ) ;
    public final void rule__EObjectSection__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3301:1: ( ( '}' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3302:1: ( '}' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3302:1: ( '}' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3303:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getRightCurlyBracketKeyword_1_1_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__EObjectSection__Group_1_1__3__Impl6591); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3324:1: rule__EObjectSection__Group_1_1_2__0 : rule__EObjectSection__Group_1_1_2__0__Impl rule__EObjectSection__Group_1_1_2__1 ;
    public final void rule__EObjectSection__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3328:1: ( rule__EObjectSection__Group_1_1_2__0__Impl rule__EObjectSection__Group_1_1_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3329:2: rule__EObjectSection__Group_1_1_2__0__Impl rule__EObjectSection__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__0__Impl_in_rule__EObjectSection__Group_1_1_2__06630);
            rule__EObjectSection__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__1_in_rule__EObjectSection__Group_1_1_2__06633);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3336:1: rule__EObjectSection__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__EObjectSection__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3340:1: ( ( ',' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3341:1: ( ',' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3341:1: ( ',' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3342:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getCommaKeyword_1_1_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__EObjectSection__Group_1_1_2__0__Impl6661); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3355:1: rule__EObjectSection__Group_1_1_2__1 : rule__EObjectSection__Group_1_1_2__1__Impl ;
    public final void rule__EObjectSection__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3359:1: ( rule__EObjectSection__Group_1_1_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3360:2: rule__EObjectSection__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EObjectSection__Group_1_1_2__1__Impl_in_rule__EObjectSection__Group_1_1_2__16692);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3366:1: rule__EObjectSection__Group_1_1_2__1__Impl : ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) ) ;
    public final void rule__EObjectSection__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3370:1: ( ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3371:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3371:1: ( ( rule__EObjectSection__AttributesAssignment_1_1_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3372:1: ( rule__EObjectSection__AttributesAssignment_1_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesAssignment_1_1_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3373:1: ( rule__EObjectSection__AttributesAssignment_1_1_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3373:2: rule__EObjectSection__AttributesAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_2_1_in_rule__EObjectSection__Group_1_1_2__1__Impl6719);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3387:1: rule__EMappingAttribute__Group__0 : rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1 ;
    public final void rule__EMappingAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3391:1: ( rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3392:2: rule__EMappingAttribute__Group__0__Impl rule__EMappingAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__0__Impl_in_rule__EMappingAttribute__Group__06753);
            rule__EMappingAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__1_in_rule__EMappingAttribute__Group__06756);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3399:1: rule__EMappingAttribute__Group__0__Impl : ( ( rule__EMappingAttribute__PkAssignment_0 )? ) ;
    public final void rule__EMappingAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3403:1: ( ( ( rule__EMappingAttribute__PkAssignment_0 )? ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3404:1: ( ( rule__EMappingAttribute__PkAssignment_0 )? )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3404:1: ( ( rule__EMappingAttribute__PkAssignment_0 )? )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3405:1: ( rule__EMappingAttribute__PkAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkAssignment_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3406:1: ( rule__EMappingAttribute__PkAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3406:2: rule__EMappingAttribute__PkAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EMappingAttribute__PkAssignment_0_in_rule__EMappingAttribute__Group__0__Impl6783);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3416:1: rule__EMappingAttribute__Group__1 : rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2 ;
    public final void rule__EMappingAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3420:1: ( rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3421:2: rule__EMappingAttribute__Group__1__Impl rule__EMappingAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__1__Impl_in_rule__EMappingAttribute__Group__16814);
            rule__EMappingAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__2_in_rule__EMappingAttribute__Group__16817);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3428:1: rule__EMappingAttribute__Group__1__Impl : ( ( rule__EMappingAttribute__PropertyAssignment_1 ) ) ;
    public final void rule__EMappingAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3432:1: ( ( ( rule__EMappingAttribute__PropertyAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3433:1: ( ( rule__EMappingAttribute__PropertyAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3433:1: ( ( rule__EMappingAttribute__PropertyAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3434:1: ( rule__EMappingAttribute__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPropertyAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3435:1: ( rule__EMappingAttribute__PropertyAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3435:2: rule__EMappingAttribute__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__PropertyAssignment_1_in_rule__EMappingAttribute__Group__1__Impl6844);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3445:1: rule__EMappingAttribute__Group__2 : rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3 ;
    public final void rule__EMappingAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3449:1: ( rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3450:2: rule__EMappingAttribute__Group__2__Impl rule__EMappingAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__2__Impl_in_rule__EMappingAttribute__Group__26874);
            rule__EMappingAttribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__3_in_rule__EMappingAttribute__Group__26877);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3457:1: rule__EMappingAttribute__Group__2__Impl : ( '=>' ) ;
    public final void rule__EMappingAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3461:1: ( ( '=>' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3462:1: ( '=>' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3462:1: ( '=>' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3463:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__EMappingAttribute__Group__2__Impl6905); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3476:1: rule__EMappingAttribute__Group__3 : rule__EMappingAttribute__Group__3__Impl ;
    public final void rule__EMappingAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3480:1: ( rule__EMappingAttribute__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3481:2: rule__EMappingAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group__3__Impl_in_rule__EMappingAttribute__Group__36936);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3487:1: rule__EMappingAttribute__Group__3__Impl : ( ( rule__EMappingAttribute__Alternatives_3 ) ) ;
    public final void rule__EMappingAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3491:1: ( ( ( rule__EMappingAttribute__Alternatives_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3492:1: ( ( rule__EMappingAttribute__Alternatives_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3492:1: ( ( rule__EMappingAttribute__Alternatives_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3493:1: ( rule__EMappingAttribute__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3494:1: ( rule__EMappingAttribute__Alternatives_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3494:2: rule__EMappingAttribute__Alternatives_3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Alternatives_3_in_rule__EMappingAttribute__Group__3__Impl6963);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3512:1: rule__EMappingAttribute__Group_3_1__0 : rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1 ;
    public final void rule__EMappingAttribute__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3516:1: ( rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3517:2: rule__EMappingAttribute__Group_3_1__0__Impl rule__EMappingAttribute__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__0__Impl_in_rule__EMappingAttribute__Group_3_1__07001);
            rule__EMappingAttribute__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__1_in_rule__EMappingAttribute__Group_3_1__07004);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3524:1: rule__EMappingAttribute__Group_3_1__0__Impl : ( 'resolve' ) ;
    public final void rule__EMappingAttribute__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3528:1: ( ( 'resolve' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3529:1: ( 'resolve' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3529:1: ( 'resolve' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3530:1: 'resolve'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getResolveKeyword_3_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__EMappingAttribute__Group_3_1__0__Impl7032); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getResolveKeyword_3_1_0()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3543:1: rule__EMappingAttribute__Group_3_1__1 : rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2 ;
    public final void rule__EMappingAttribute__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3547:1: ( rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3548:2: rule__EMappingAttribute__Group_3_1__1__Impl rule__EMappingAttribute__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__1__Impl_in_rule__EMappingAttribute__Group_3_1__17063);
            rule__EMappingAttribute__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__2_in_rule__EMappingAttribute__Group_3_1__17066);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3555:1: rule__EMappingAttribute__Group_3_1__1__Impl : ( ( rule__EMappingAttribute__EntityAssignment_3_1_1 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3559:1: ( ( ( rule__EMappingAttribute__EntityAssignment_3_1_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3560:1: ( ( rule__EMappingAttribute__EntityAssignment_3_1_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3560:1: ( ( rule__EMappingAttribute__EntityAssignment_3_1_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3561:1: ( rule__EMappingAttribute__EntityAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getEntityAssignment_3_1_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3562:1: ( rule__EMappingAttribute__EntityAssignment_3_1_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3562:2: rule__EMappingAttribute__EntityAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__EntityAssignment_3_1_1_in_rule__EMappingAttribute__Group_3_1__1__Impl7093);
            rule__EMappingAttribute__EntityAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getEntityAssignment_3_1_1()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3572:1: rule__EMappingAttribute__Group_3_1__2 : rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3 ;
    public final void rule__EMappingAttribute__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3576:1: ( rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3577:2: rule__EMappingAttribute__Group_3_1__2__Impl rule__EMappingAttribute__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__2__Impl_in_rule__EMappingAttribute__Group_3_1__27123);
            rule__EMappingAttribute__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__3_in_rule__EMappingAttribute__Group_3_1__27126);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3584:1: rule__EMappingAttribute__Group_3_1__2__Impl : ( '(' ) ;
    public final void rule__EMappingAttribute__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3588:1: ( ( '(' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3589:1: ( '(' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3589:1: ( '(' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3590:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getLeftParenthesisKeyword_3_1_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__EMappingAttribute__Group_3_1__2__Impl7154); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3603:1: rule__EMappingAttribute__Group_3_1__3 : rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4 ;
    public final void rule__EMappingAttribute__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3607:1: ( rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3608:2: rule__EMappingAttribute__Group_3_1__3__Impl rule__EMappingAttribute__Group_3_1__4
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__3__Impl_in_rule__EMappingAttribute__Group_3_1__37185);
            rule__EMappingAttribute__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__4_in_rule__EMappingAttribute__Group_3_1__37188);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3615:1: rule__EMappingAttribute__Group_3_1__3__Impl : ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) ) ;
    public final void rule__EMappingAttribute__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3619:1: ( ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3620:1: ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3620:1: ( ( rule__EMappingAttribute__ParametersAssignment_3_1_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3621:1: ( rule__EMappingAttribute__ParametersAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getParametersAssignment_3_1_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3622:1: ( rule__EMappingAttribute__ParametersAssignment_3_1_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3622:2: rule__EMappingAttribute__ParametersAssignment_3_1_3
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__ParametersAssignment_3_1_3_in_rule__EMappingAttribute__Group_3_1__3__Impl7215);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3632:1: rule__EMappingAttribute__Group_3_1__4 : rule__EMappingAttribute__Group_3_1__4__Impl ;
    public final void rule__EMappingAttribute__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3636:1: ( rule__EMappingAttribute__Group_3_1__4__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3637:2: rule__EMappingAttribute__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_1__4__Impl_in_rule__EMappingAttribute__Group_3_1__47245);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3643:1: rule__EMappingAttribute__Group_3_1__4__Impl : ( ')' ) ;
    public final void rule__EMappingAttribute__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3647:1: ( ( ')' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3648:1: ( ')' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3648:1: ( ')' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3649:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getRightParenthesisKeyword_3_1_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__EMappingAttribute__Group_3_1__4__Impl7273); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3672:1: rule__EMappingAttribute__Group_3_2__0 : rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1 ;
    public final void rule__EMappingAttribute__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3676:1: ( rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3677:2: rule__EMappingAttribute__Group_3_2__0__Impl rule__EMappingAttribute__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__0__Impl_in_rule__EMappingAttribute__Group_3_2__07314);
            rule__EMappingAttribute__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__1_in_rule__EMappingAttribute__Group_3_2__07317);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3684:1: rule__EMappingAttribute__Group_3_2__0__Impl : ( 'map' ) ;
    public final void rule__EMappingAttribute__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3688:1: ( ( 'map' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3689:1: ( 'map' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3689:1: ( 'map' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3690:1: 'map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMapKeyword_3_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__EMappingAttribute__Group_3_2__0__Impl7345); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getMapKeyword_3_2_0()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3703:1: rule__EMappingAttribute__Group_3_2__1 : rule__EMappingAttribute__Group_3_2__1__Impl ;
    public final void rule__EMappingAttribute__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3707:1: ( rule__EMappingAttribute__Group_3_2__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3708:2: rule__EMappingAttribute__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__Group_3_2__1__Impl_in_rule__EMappingAttribute__Group_3_2__17376);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3714:1: rule__EMappingAttribute__Group_3_2__1__Impl : ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) ) ;
    public final void rule__EMappingAttribute__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3718:1: ( ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3719:1: ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3719:1: ( ( rule__EMappingAttribute__MapAssignment_3_2_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3720:1: ( rule__EMappingAttribute__MapAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMapAssignment_3_2_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3721:1: ( rule__EMappingAttribute__MapAssignment_3_2_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3721:2: rule__EMappingAttribute__MapAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EMappingAttribute__MapAssignment_3_2_1_in_rule__EMappingAttribute__Group_3_2__1__Impl7403);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3735:1: rule__EType__Group__0 : rule__EType__Group__0__Impl rule__EType__Group__1 ;
    public final void rule__EType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3739:1: ( rule__EType__Group__0__Impl rule__EType__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3740:2: rule__EType__Group__0__Impl rule__EType__Group__1
            {
            pushFollow(FOLLOW_rule__EType__Group__0__Impl_in_rule__EType__Group__07437);
            rule__EType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__1_in_rule__EType__Group__07440);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3747:1: rule__EType__Group__0__Impl : ( 'etype' ) ;
    public final void rule__EType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3751:1: ( ( 'etype' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3752:1: ( 'etype' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3752:1: ( 'etype' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3753:1: 'etype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getEtypeKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__EType__Group__0__Impl7468); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3766:1: rule__EType__Group__1 : rule__EType__Group__1__Impl rule__EType__Group__2 ;
    public final void rule__EType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3770:1: ( rule__EType__Group__1__Impl rule__EType__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3771:2: rule__EType__Group__1__Impl rule__EType__Group__2
            {
            pushFollow(FOLLOW_rule__EType__Group__1__Impl_in_rule__EType__Group__17499);
            rule__EType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__2_in_rule__EType__Group__17502);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3778:1: rule__EType__Group__1__Impl : ( ( rule__EType__UrlAssignment_1 ) ) ;
    public final void rule__EType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3782:1: ( ( ( rule__EType__UrlAssignment_1 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3783:1: ( ( rule__EType__UrlAssignment_1 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3783:1: ( ( rule__EType__UrlAssignment_1 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3784:1: ( rule__EType__UrlAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getUrlAssignment_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3785:1: ( rule__EType__UrlAssignment_1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3785:2: rule__EType__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__EType__UrlAssignment_1_in_rule__EType__Group__1__Impl7529);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3795:1: rule__EType__Group__2 : rule__EType__Group__2__Impl rule__EType__Group__3 ;
    public final void rule__EType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3799:1: ( rule__EType__Group__2__Impl rule__EType__Group__3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3800:2: rule__EType__Group__2__Impl rule__EType__Group__3
            {
            pushFollow(FOLLOW_rule__EType__Group__2__Impl_in_rule__EType__Group__27559);
            rule__EType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EType__Group__3_in_rule__EType__Group__27562);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3807:1: rule__EType__Group__2__Impl : ( '#' ) ;
    public final void rule__EType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3811:1: ( ( '#' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3812:1: ( '#' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3812:1: ( '#' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3813:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNumberSignKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__EType__Group__2__Impl7590); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3826:1: rule__EType__Group__3 : rule__EType__Group__3__Impl ;
    public final void rule__EType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3830:1: ( rule__EType__Group__3__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3831:2: rule__EType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EType__Group__3__Impl_in_rule__EType__Group__37621);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3837:1: rule__EType__Group__3__Impl : ( ( rule__EType__NameAssignment_3 ) ) ;
    public final void rule__EType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3841:1: ( ( ( rule__EType__NameAssignment_3 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3842:1: ( ( rule__EType__NameAssignment_3 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3842:1: ( ( rule__EType__NameAssignment_3 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3843:1: ( rule__EType__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNameAssignment_3()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3844:1: ( rule__EType__NameAssignment_3 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3844:2: rule__EType__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__EType__NameAssignment_3_in_rule__EType__Group__3__Impl7648);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3862:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3866:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3867:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07686);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07689);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3874:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3878:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3879:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3879:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3880:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7716); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3891:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3895:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3896:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17745);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3902:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3906:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3907:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3907:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3908:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3909:1: ( rule__QualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_ID) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3909:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7772);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3923:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3927:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3928:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07807);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07810);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3935:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3939:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3940:1: ( ( '.' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3940:1: ( ( '.' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3941:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3942:1: ( '.' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3943:2: '.'
            {
            match(input,36,FOLLOW_36_in_rule__QualifiedName__Group_1__0__Impl7839); if (state.failed) return ;

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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3954:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3958:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3959:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17871);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3965:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3969:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3970:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3970:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3971:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7898); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3986:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3990:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3991:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__07931);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__07934);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:3998:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4002:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4003:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4003:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4004:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl7961);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4015:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4019:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4020:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__17990);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__17993);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4027:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4031:1: ( ( '.' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4032:1: ( '.' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4032:1: ( '.' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4033:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__QualifiedNameWithWildcard__Group__1__Impl8021); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4046:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4050:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4051:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__28052);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4057:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4061:1: ( ( '*' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4062:1: ( '*' )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4062:1: ( '*' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4063:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__QualifiedNameWithWildcard__Group__2__Impl8080); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4083:1: rule__EMapping__RootAssignment : ( ( rule__EMapping__RootAlternatives_0 ) ) ;
    public final void rule__EMapping__RootAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4087:1: ( ( ( rule__EMapping__RootAlternatives_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4088:1: ( ( rule__EMapping__RootAlternatives_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4088:1: ( ( rule__EMapping__RootAlternatives_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4089:1: ( rule__EMapping__RootAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAccess().getRootAlternatives_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4090:1: ( rule__EMapping__RootAlternatives_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4090:2: rule__EMapping__RootAlternatives_0
            {
            pushFollow(FOLLOW_rule__EMapping__RootAlternatives_0_in_rule__EMapping__RootAssignment8122);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4099:1: rule__EMappingBundle__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__EMappingBundle__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4103:1: ( ( ruleImport ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4104:1: ( ruleImport )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4104:1: ( ruleImport )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4105:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__EMappingBundle__ImportsAssignment_08155);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4114:1: rule__EMappingBundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EMappingBundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4118:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4119:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4119:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4120:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__NameAssignment_28186); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4129:1: rule__EMappingBundle__EntitiesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EMappingBundle__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4133:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4134:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4134:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4135:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_4_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4136:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4137:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_48221); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4148:1: rule__EMappingBundle__EntitiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__EMappingBundle__EntitiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4152:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4153:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4153:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4154:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityCrossReference_5_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4155:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4156:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingBundleAccess().getEntitiesEMappingEntityIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_5_18260); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4167:1: rule__EMappingEntityDef__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__EMappingEntityDef__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4171:1: ( ( rulePackageDeclaration ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4172:1: ( rulePackageDeclaration )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4172:1: ( rulePackageDeclaration )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4173:1: rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__EMappingEntityDef__PackageAssignment_08295);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4182:1: rule__EMappingEntityDef__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__EMappingEntityDef__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4186:1: ( ( ruleImport ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4187:1: ( ruleImport )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4187:1: ( ruleImport )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4188:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__EMappingEntityDef__ImportsAssignment_18326);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4197:1: rule__EMappingEntityDef__EntityAssignment_2 : ( ruleEMappingEntity ) ;
    public final void rule__EMappingEntityDef__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4201:1: ( ( ruleEMappingEntity ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4202:1: ( ruleEMappingEntity )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4202:1: ( ruleEMappingEntity )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4203:1: ruleEMappingEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityDefAccess().getEntityEMappingEntityParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingEntity_in_rule__EMappingEntityDef__EntityAssignment_28357);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4212:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4216:1: ( ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4217:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4217:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4218:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4219:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4219:2: rule__Import__ImportedNamespaceAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_18388);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4228:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4232:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4233:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4233:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4234:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_18421);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4243:1: rule__EMappingEntity__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__EMappingEntity__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4247:1: ( ( ( 'abstract' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4248:1: ( ( 'abstract' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4248:1: ( ( 'abstract' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4249:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4250:1: ( 'abstract' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4251:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAbstractAbstractKeyword_0_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EMappingEntity__AbstractAssignment_08457); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4266:1: rule__EMappingEntity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EMappingEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4270:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4271:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4271:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4272:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingEntity__NameAssignment_28496); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4281:1: rule__EMappingEntity__ExtensionTypeAssignment_3_0 : ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) ) ;
    public final void rule__EMappingEntity__ExtensionTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4285:1: ( ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4286:1: ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4286:1: ( ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4287:1: ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getExtensionTypeAlternatives_3_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4288:1: ( rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4288:2: rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0
            {
            pushFollow(FOLLOW_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0_in_rule__EMappingEntity__ExtensionTypeAssignment_3_08527);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4297:1: rule__EMappingEntity__ParentAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EMappingEntity__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4301:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4302:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4302:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4303:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityCrossReference_3_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4304:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4305:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getParentEMappingEntityQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingEntity__ParentAssignment_3_18564);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4316:1: rule__EMappingEntity__EtypeAssignment_5 : ( ruleEType ) ;
    public final void rule__EMappingEntity__EtypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4320:1: ( ( ruleEType ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4321:1: ( ruleEType )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4321:1: ( ruleEType )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4322:1: ruleEType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getEtypeETypeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleEType_in_rule__EMappingEntity__EtypeAssignment_58599);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4331:1: rule__EMappingEntity__AttributesAssignment_8 : ( ruleEAttribute ) ;
    public final void rule__EMappingEntity__AttributesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4335:1: ( ( ruleEAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4336:1: ( ruleEAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4336:1: ( ruleEAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4337:1: ruleEAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_88630);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4346:1: rule__EMappingEntity__AttributesAssignment_9_1 : ( ruleEAttribute ) ;
    public final void rule__EMappingEntity__AttributesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4350:1: ( ( ruleEAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4351:1: ( ruleEAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4351:1: ( ruleEAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4352:1: ruleEAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getAttributesEAttributeParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_9_18661);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4361:1: rule__EMappingEntity__NamedQueriesAssignment_11_2 : ( ruleENamedQuery ) ;
    public final void rule__EMappingEntity__NamedQueriesAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4365:1: ( ( ruleENamedQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4366:1: ( ruleENamedQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4366:1: ( ruleENamedQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4367:1: ruleENamedQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_11_2_0()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_11_28692);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4376:1: rule__EMappingEntity__NamedQueriesAssignment_11_3_1 : ( ruleENamedQuery ) ;
    public final void rule__EMappingEntity__NamedQueriesAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4380:1: ( ( ruleENamedQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4381:1: ( ruleENamedQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4381:1: ( ruleENamedQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4382:1: ruleENamedQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getNamedQueriesENamedQueryParserRuleCall_11_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_11_3_18723);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4391:1: rule__EMappingEntity__TableNameAssignment_13_1 : ( RULE_ID ) ;
    public final void rule__EMappingEntity__TableNameAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4395:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4396:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4396:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4397:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingEntityAccess().getTableNameIDTerminalRuleCall_13_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingEntity__TableNameAssignment_13_18754); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4406:1: rule__EAttribute__PkAssignment_0 : ( ( 'primarykey' ) ) ;
    public final void rule__EAttribute__PkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4410:1: ( ( ( 'primarykey' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4411:1: ( ( 'primarykey' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4411:1: ( ( 'primarykey' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4412:1: ( 'primarykey' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4413:1: ( 'primarykey' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4414:1: 'primarykey'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__EAttribute__PkAssignment_08790); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4429:1: rule__EAttribute__PropertyAssignment_1 : ( RULE_ID ) ;
    public final void rule__EAttribute__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4433:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4434:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4434:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4435:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getPropertyIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__PropertyAssignment_18829); if (state.failed) return ;
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


    // $ANTLR start "rule__EAttribute__ColumnNameAssignment_3_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4444:1: rule__EAttribute__ColumnNameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__EAttribute__ColumnNameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4448:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4449:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4449:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4450:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__ColumnNameAssignment_3_08860); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EAttribute__ColumnNameAssignment_3_0"


    // $ANTLR start "rule__EAttribute__ResolvedAssignment_3_1_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4459:1: rule__EAttribute__ResolvedAssignment_3_1_0 : ( ( 'resolve' ) ) ;
    public final void rule__EAttribute__ResolvedAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4463:1: ( ( ( 'resolve' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4464:1: ( ( 'resolve' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4464:1: ( ( 'resolve' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4465:1: ( 'resolve' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4466:1: ( 'resolve' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4467:1: 'resolve'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getResolvedResolveKeyword_3_1_0_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__EAttribute__ResolvedAssignment_3_1_08896); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4482:1: rule__EAttribute__QueryAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EAttribute__QueryAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4486:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4487:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4487:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4488:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryENamedQueryCrossReference_3_1_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4489:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4490:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getQueryENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EAttribute__QueryAssignment_3_1_18939);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4501:1: rule__EAttribute__ParametersAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__EAttribute__ParametersAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4505:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4506:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4506:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4507:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EAttribute__ParametersAssignment_3_1_38974); if (state.failed) return ;
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


    // $ANTLR start "rule__ENamedQuery__NameAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4516:1: rule__ENamedQuery__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ENamedQuery__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4520:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4521:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4521:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4522:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ENamedQuery__NameAssignment_09005); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ENamedQuery__NameAssignment_0"


    // $ANTLR start "rule__ENamedQuery__ParametersAssignment_1_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4531:1: rule__ENamedQuery__ParametersAssignment_1_1 : ( ruleEParameter ) ;
    public final void rule__ENamedQuery__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4535:1: ( ( ruleEParameter ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4536:1: ( ruleEParameter )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4536:1: ( ruleEParameter )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4537:1: ruleEParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEParameter_in_rule__ENamedQuery__ParametersAssignment_1_19036);
            ruleEParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getParametersEParameterParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ENamedQuery__ParametersAssignment_1_1"


    // $ANTLR start "rule__ENamedQuery__QueriesAssignment_3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4546:1: rule__ENamedQuery__QueriesAssignment_3 : ( ruleEQuery ) ;
    public final void rule__ENamedQuery__QueriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4550:1: ( ( ruleEQuery ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4551:1: ( ruleEQuery )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4551:1: ( ruleEQuery )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4552:1: ruleEQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_39067);
            ruleEQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENamedQueryAccess().getQueriesEQueryParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ENamedQuery__QueriesAssignment_3"


    // $ANTLR start "rule__EParameter__TypeAssignment_0"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4561:1: rule__EParameter__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__EParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4565:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4566:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4566:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4567:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getTypeIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EParameter__TypeAssignment_09098); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4576:1: rule__EParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4580:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4581:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4581:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4582:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EParameter__NameAssignment_19129); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4591:1: rule__EQuery__DbTypeAssignment_0 : ( ( rule__EQuery__DbTypeAlternatives_0_0 ) ) ;
    public final void rule__EQuery__DbTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4595:1: ( ( ( rule__EQuery__DbTypeAlternatives_0_0 ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4596:1: ( ( rule__EQuery__DbTypeAlternatives_0_0 ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4596:1: ( ( rule__EQuery__DbTypeAlternatives_0_0 ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4597:1: ( rule__EQuery__DbTypeAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getDbTypeAlternatives_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4598:1: ( rule__EQuery__DbTypeAlternatives_0_0 )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4598:2: rule__EQuery__DbTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__EQuery__DbTypeAlternatives_0_0_in_rule__EQuery__DbTypeAssignment_09160);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4607:1: rule__EQuery__MappingAssignment_1 : ( ruleEObjectSection ) ;
    public final void rule__EQuery__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4611:1: ( ( ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4612:1: ( ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4612:1: ( ruleEObjectSection )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4613:1: ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getMappingEObjectSectionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_rule__EQuery__MappingAssignment_19193);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4622:1: rule__EQuery__FromAssignment_2_0_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__FromAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4626:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4627:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4627:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4628:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getFromSTRINGTerminalRuleCall_2_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__FromAssignment_2_0_19224); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4637:1: rule__EQuery__WhereAssignment_2_0_2_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__WhereAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4641:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4642:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4642:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4643:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getWhereSTRINGTerminalRuleCall_2_0_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__WhereAssignment_2_0_2_19255); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4652:1: rule__EQuery__GroupByAssignment_2_0_3_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__GroupByAssignment_2_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4656:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4657:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4657:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4658:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getGroupBySTRINGTerminalRuleCall_2_0_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__GroupByAssignment_2_0_3_19286); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4667:1: rule__EQuery__OrderbyAssignment_2_0_4_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__OrderbyAssignment_2_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4671:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4672:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4672:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4673:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getOrderbySTRINGTerminalRuleCall_2_0_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__OrderbyAssignment_2_0_4_19317); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4682:1: rule__EQuery__AllAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EQuery__AllAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4686:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4687:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4687:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4688:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEQueryAccess().getAllSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EQuery__AllAssignment_2_19348); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4697:1: rule__EObjectSection__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EObjectSection__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4701:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4702:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4702:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4703:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityCrossReference_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4704:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4705:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getEntityEMappingEntityIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EObjectSection__EntityAssignment_09383); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4716:1: rule__EObjectSection__PrefixAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__EObjectSection__PrefixAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4720:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4721:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4721:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4722:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getPrefixIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EObjectSection__PrefixAssignment_1_09418); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4731:1: rule__EObjectSection__AttributesAssignment_1_1_1 : ( ruleEMappingAttribute ) ;
    public final void rule__EObjectSection__AttributesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4735:1: ( ( ruleEMappingAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4736:1: ( ruleEMappingAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4736:1: ( ruleEMappingAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4737:1: ruleEMappingAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_19449);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4746:1: rule__EObjectSection__AttributesAssignment_1_1_2_1 : ( ruleEMappingAttribute ) ;
    public final void rule__EObjectSection__AttributesAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4750:1: ( ( ruleEMappingAttribute ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4751:1: ( ruleEMappingAttribute )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4751:1: ( ruleEMappingAttribute )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4752:1: ruleEMappingAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEObjectSectionAccess().getAttributesEMappingAttributeParserRuleCall_1_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_2_19480);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4761:1: rule__EMappingAttribute__PkAssignment_0 : ( ( 'primarykey' ) ) ;
    public final void rule__EMappingAttribute__PkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4765:1: ( ( ( 'primarykey' ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4766:1: ( ( 'primarykey' ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4766:1: ( ( 'primarykey' ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4767:1: ( 'primarykey' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4768:1: ( 'primarykey' )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4769:1: 'primarykey'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPkPrimarykeyKeyword_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__EMappingAttribute__PkAssignment_09516); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4784:1: rule__EMappingAttribute__PropertyAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__EMappingAttribute__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4788:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4789:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4789:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4790:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getPropertyQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__PropertyAssignment_19555);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4799:1: rule__EMappingAttribute__ColumnNameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__EMappingAttribute__ColumnNameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4803:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4804:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4804:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4805:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getColumnNameIDTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingAttribute__ColumnNameAssignment_3_09586); if (state.failed) return ;
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


    // $ANTLR start "rule__EMappingAttribute__EntityAssignment_3_1_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4814:1: rule__EMappingAttribute__EntityAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EMappingAttribute__EntityAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4818:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4819:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4819:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4820:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getEntityENamedQueryCrossReference_3_1_1_0()); 
            }
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4821:1: ( ruleQualifiedName )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4822:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getEntityENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__EntityAssignment_3_1_19621);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getEntityENamedQueryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMappingAttributeAccess().getEntityENamedQueryCrossReference_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMappingAttribute__EntityAssignment_3_1_1"


    // $ANTLR start "rule__EMappingAttribute__ParametersAssignment_3_1_3"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4833:1: rule__EMappingAttribute__ParametersAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__EMappingAttribute__ParametersAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4837:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4838:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4838:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4839:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getParametersIDTerminalRuleCall_3_1_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EMappingAttribute__ParametersAssignment_3_1_39656); if (state.failed) return ;
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


    // $ANTLR start "rule__EMappingAttribute__MapAssignment_3_2_1"
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4848:1: rule__EMappingAttribute__MapAssignment_3_2_1 : ( ruleEObjectSection ) ;
    public final void rule__EMappingAttribute__MapAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4852:1: ( ( ruleEObjectSection ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4853:1: ( ruleEObjectSection )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4853:1: ( ruleEObjectSection )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4854:1: ruleEObjectSection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMappingAttributeAccess().getMapEObjectSectionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEObjectSection_in_rule__EMappingAttribute__MapAssignment_3_2_19687);
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4863:1: rule__EType__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EType__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4867:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4868:1: ( RULE_STRING )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4868:1: ( RULE_STRING )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4869:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EType__UrlAssignment_19718); if (state.failed) return ;
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
    // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4878:1: rule__EType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__EType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4882:1: ( ( RULE_ID ) )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4883:1: ( RULE_ID )
            {
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4883:1: ( RULE_ID )
            // ../at.bestsolution.persistence.emap.ui/src-gen/at/bestsolution/persistence/emap/ui/contentassist/antlr/internal/InternalEMap.g:4884:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getETypeAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EType__NameAssignment_39749); if (state.failed) return ;
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
        "\1\5\1\16\1\5\2\uffff\1\16";
    static final String DFA2_maxS =
        "\1\5\1\46\1\45\2\uffff\1\46";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\3\uffff\1\3\2\uffff\1\3\16\uffff\1\2\1\uffff\1\3",
            "\1\5\37\uffff\1\4",
            "",
            "",
            "\1\3\3\uffff\1\3\2\uffff\1\3\16\uffff\1\2\1\uffff\1\3"
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
            return "503:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) );";
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
    public static final BitSet FOLLOW_ruleEMappingBundle_in_rule__EMapping__RootAlternatives_0976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntityDef_in_rule__EMapping__RootAlternatives_0993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAlternatives_1_01042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_01095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ColumnNameAssignment_3_0_in_rule__EAttribute__Alternatives_31129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__0_in_rule__EAttribute__Alternatives_31147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EQuery__DbTypeAlternatives_0_01181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__DbTypeAlternatives_0_01200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__0_in_rule__EQuery__Alternatives_21232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__AllAssignment_2_1_in_rule__EQuery__Alternatives_21250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__ColumnNameAssignment_3_0_in_rule__EMappingAttribute__Alternatives_31283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__0_in_rule__EMappingAttribute__Alternatives_31301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__0_in_rule__EMappingAttribute__Alternatives_31319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__0__Impl_in_rule__EMappingBundle__Group__01350 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__1_in_rule__EMappingBundle__Group__01353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__ImportsAssignment_0_in_rule__EMappingBundle__Group__0__Impl1380 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__1__Impl_in_rule__EMappingBundle__Group__11411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__2_in_rule__EMappingBundle__Group__11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EMappingBundle__Group__1__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__2__Impl_in_rule__EMappingBundle__Group__21473 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__3_in_rule__EMappingBundle__Group__21476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__NameAssignment_2_in_rule__EMappingBundle__Group__2__Impl1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__3__Impl_in_rule__EMappingBundle__Group__31533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__4_in_rule__EMappingBundle__Group__31536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EMappingBundle__Group__3__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__4__Impl_in_rule__EMappingBundle__Group__41595 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__5_in_rule__EMappingBundle__Group__41598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__EntitiesAssignment_4_in_rule__EMappingBundle__Group__4__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__5__Impl_in_rule__EMappingBundle__Group__51655 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__6_in_rule__EMappingBundle__Group__51658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__0_in_rule__EMappingBundle__Group__5__Impl1685 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group__6__Impl_in_rule__EMappingBundle__Group__61716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EMappingBundle__Group__6__Impl1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__0__Impl_in_rule__EMappingBundle__Group_5__01789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__1_in_rule__EMappingBundle__Group_5__01792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingBundle__Group_5__0__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__Group_5__1__Impl_in_rule__EMappingBundle__Group_5__11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingBundle__EntitiesAssignment_5_1_in_rule__EMappingBundle__Group_5__1__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__0__Impl_in_rule__EMappingEntityDef__Group__01912 = new BitSet(new long[]{0x0000004000240000L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__1_in_rule__EMappingEntityDef__Group__01915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__PackageAssignment_0_in_rule__EMappingEntityDef__Group__0__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__1__Impl_in_rule__EMappingEntityDef__Group__11972 = new BitSet(new long[]{0x0000004000240000L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__2_in_rule__EMappingEntityDef__Group__11975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__ImportsAssignment_1_in_rule__EMappingEntityDef__Group__1__Impl2002 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__Group__2__Impl_in_rule__EMappingEntityDef__Group__22033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntityDef__EntityAssignment_2_in_rule__EMappingEntityDef__Group__2__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02096 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PackageDeclaration__Group__0__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12281 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PackageDeclaration__Group__2__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__0__Impl_in_rule__EMappingEntity__Group__02406 = new BitSet(new long[]{0x0000004000240000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__1_in_rule__EMappingEntity__Group__02409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AbstractAssignment_0_in_rule__EMappingEntity__Group__0__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__1__Impl_in_rule__EMappingEntity__Group__12467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__2_in_rule__EMappingEntity__Group__12470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EMappingEntity__Group__1__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__2__Impl_in_rule__EMappingEntity__Group__22529 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__3_in_rule__EMappingEntity__Group__22532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NameAssignment_2_in_rule__EMappingEntity__Group__2__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__3__Impl_in_rule__EMappingEntity__Group__32589 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__4_in_rule__EMappingEntity__Group__32592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__0_in_rule__EMappingEntity__Group__3__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__4__Impl_in_rule__EMappingEntity__Group__42650 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__5_in_rule__EMappingEntity__Group__42653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EMappingEntity__Group__4__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__5__Impl_in_rule__EMappingEntity__Group__52712 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__6_in_rule__EMappingEntity__Group__52715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__EtypeAssignment_5_in_rule__EMappingEntity__Group__5__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__6__Impl_in_rule__EMappingEntity__Group__62772 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__7_in_rule__EMappingEntity__Group__62775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EMappingEntity__Group__6__Impl2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__7__Impl_in_rule__EMappingEntity__Group__72834 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__8_in_rule__EMappingEntity__Group__72837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EMappingEntity__Group__7__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__8__Impl_in_rule__EMappingEntity__Group__82896 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__9_in_rule__EMappingEntity__Group__82899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AttributesAssignment_8_in_rule__EMappingEntity__Group__8__Impl2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__9__Impl_in_rule__EMappingEntity__Group__92956 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__10_in_rule__EMappingEntity__Group__92959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__0_in_rule__EMappingEntity__Group__9__Impl2986 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__10__Impl_in_rule__EMappingEntity__Group__103017 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__11_in_rule__EMappingEntity__Group__103020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EMappingEntity__Group__10__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__11__Impl_in_rule__EMappingEntity__Group__113079 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__12_in_rule__EMappingEntity__Group__113082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__0_in_rule__EMappingEntity__Group__11__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__12__Impl_in_rule__EMappingEntity__Group__123140 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__13_in_rule__EMappingEntity__Group__123143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EMappingEntity__Group__12__Impl3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group__13__Impl_in_rule__EMappingEntity__Group__133202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_13__0_in_rule__EMappingEntity__Group__13__Impl3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__0__Impl_in_rule__EMappingEntity__Group_3__03288 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__1_in_rule__EMappingEntity__Group_3__03291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ExtensionTypeAssignment_3_0_in_rule__EMappingEntity__Group_3__0__Impl3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_3__1__Impl_in_rule__EMappingEntity__Group_3__13348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ParentAssignment_3_1_in_rule__EMappingEntity__Group_3__1__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__0__Impl_in_rule__EMappingEntity__Group_9__03409 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__1_in_rule__EMappingEntity__Group_9__03412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group_9__0__Impl3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_9__1__Impl_in_rule__EMappingEntity__Group_9__13471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__AttributesAssignment_9_1_in_rule__EMappingEntity__Group_9__1__Impl3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__0__Impl_in_rule__EMappingEntity__Group_11__03532 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__1_in_rule__EMappingEntity__Group_11__03535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EMappingEntity__Group_11__0__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__1__Impl_in_rule__EMappingEntity__Group_11__13594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__2_in_rule__EMappingEntity__Group_11__13597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EMappingEntity__Group_11__1__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__2__Impl_in_rule__EMappingEntity__Group_11__23656 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__3_in_rule__EMappingEntity__Group_11__23659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_11_2_in_rule__EMappingEntity__Group_11__2__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__3__Impl_in_rule__EMappingEntity__Group_11__33716 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__4_in_rule__EMappingEntity__Group_11__33719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11_3__0_in_rule__EMappingEntity__Group_11__3__Impl3746 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11__4__Impl_in_rule__EMappingEntity__Group_11__43777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EMappingEntity__Group_11__4__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11_3__0__Impl_in_rule__EMappingEntity__Group_11_3__03846 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11_3__1_in_rule__EMappingEntity__Group_11_3__03849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EMappingEntity__Group_11_3__0__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_11_3__1__Impl_in_rule__EMappingEntity__Group_11_3__13908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__NamedQueriesAssignment_11_3_1_in_rule__EMappingEntity__Group_11_3__1__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_13__0__Impl_in_rule__EMappingEntity__Group_13__03969 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_13__1_in_rule__EMappingEntity__Group_13__03972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EMappingEntity__Group_13__0__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__Group_13__1__Impl_in_rule__EMappingEntity__Group_13__14031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__TableNameAssignment_13_1_in_rule__EMappingEntity__Group_13__1__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__0__Impl_in_rule__EAttribute__Group__04092 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__1_in_rule__EAttribute__Group__04095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__PkAssignment_0_in_rule__EAttribute__Group__0__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__1__Impl_in_rule__EAttribute__Group__14153 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__2_in_rule__EAttribute__Group__14156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__PropertyAssignment_1_in_rule__EAttribute__Group__1__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__2__Impl_in_rule__EAttribute__Group__24213 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__3_in_rule__EAttribute__Group__24216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EAttribute__Group__2__Impl4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group__3__Impl_in_rule__EAttribute__Group__34275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Alternatives_3_in_rule__EAttribute__Group__3__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__0__Impl_in_rule__EAttribute__Group_3_1__04340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__1_in_rule__EAttribute__Group_3_1__04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ResolvedAssignment_3_1_0_in_rule__EAttribute__Group_3_1__0__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__1__Impl_in_rule__EAttribute__Group_3_1__14400 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__2_in_rule__EAttribute__Group_3_1__14403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__QueryAssignment_3_1_1_in_rule__EAttribute__Group_3_1__1__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__2__Impl_in_rule__EAttribute__Group_3_1__24460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__3_in_rule__EAttribute__Group_3_1__24463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EAttribute__Group_3_1__2__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__3__Impl_in_rule__EAttribute__Group_3_1__34522 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__4_in_rule__EAttribute__Group_3_1__34525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__ParametersAssignment_3_1_3_in_rule__EAttribute__Group_3_1__3__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EAttribute__Group_3_1__4__Impl_in_rule__EAttribute__Group_3_1__44582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EAttribute__Group_3_1__4__Impl4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__0__Impl_in_rule__ENamedQuery__Group__04651 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__1_in_rule__ENamedQuery__Group__04654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__NameAssignment_0_in_rule__ENamedQuery__Group__0__Impl4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__1__Impl_in_rule__ENamedQuery__Group__14711 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__2_in_rule__ENamedQuery__Group__14714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_1__0_in_rule__ENamedQuery__Group__1__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__2__Impl_in_rule__ENamedQuery__Group__24772 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__3_in_rule__ENamedQuery__Group__24775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ENamedQuery__Group__2__Impl4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__3__Impl_in_rule__ENamedQuery__Group__34834 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__4_in_rule__ENamedQuery__Group__34837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__QueriesAssignment_3_in_rule__ENamedQuery__Group__3__Impl4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group__4__Impl_in_rule__ENamedQuery__Group__44894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ENamedQuery__Group__4__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_1__0__Impl_in_rule__ENamedQuery__Group_1__04963 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_1__1_in_rule__ENamedQuery__Group_1__04966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ENamedQuery__Group_1__0__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_1__1__Impl_in_rule__ENamedQuery__Group_1__15025 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_1__2_in_rule__ENamedQuery__Group_1__15028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENamedQuery__ParametersAssignment_1_1_in_rule__ENamedQuery__Group_1__1__Impl5055 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ENamedQuery__Group_1__2__Impl_in_rule__ENamedQuery__Group_1__25086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ENamedQuery__Group_1__2__Impl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__Group__0__Impl_in_rule__EParameter__Group__05151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EParameter__Group__1_in_rule__EParameter__Group__05154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__TypeAssignment_0_in_rule__EParameter__Group__0__Impl5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__Group__1__Impl_in_rule__EParameter__Group__15211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EParameter__NameAssignment_1_in_rule__EParameter__Group__1__Impl5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__0__Impl_in_rule__EQuery__Group__05272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EQuery__Group__1_in_rule__EQuery__Group__05275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__DbTypeAssignment_0_in_rule__EQuery__Group__0__Impl5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__1__Impl_in_rule__EQuery__Group__15332 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group__2_in_rule__EQuery__Group__15335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__MappingAssignment_1_in_rule__EQuery__Group__1__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group__2__Impl_in_rule__EQuery__Group__25392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Alternatives_2_in_rule__EQuery__Group__2__Impl5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__0__Impl_in_rule__EQuery__Group_2_0__05455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__1_in_rule__EQuery__Group_2_0__05458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EQuery__Group_2_0__0__Impl5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__1__Impl_in_rule__EQuery__Group_2_0__15517 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__2_in_rule__EQuery__Group_2_0__15520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__FromAssignment_2_0_1_in_rule__EQuery__Group_2_0__1__Impl5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__2__Impl_in_rule__EQuery__Group_2_0__25577 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__3_in_rule__EQuery__Group_2_0__25580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__0_in_rule__EQuery__Group_2_0__2__Impl5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__3__Impl_in_rule__EQuery__Group_2_0__35638 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__4_in_rule__EQuery__Group_2_0__35641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__0_in_rule__EQuery__Group_2_0__3__Impl5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0__4__Impl_in_rule__EQuery__Group_2_0__45699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__0_in_rule__EQuery__Group_2_0__4__Impl5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__0__Impl_in_rule__EQuery__Group_2_0_2__05767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__1_in_rule__EQuery__Group_2_0_2__05770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EQuery__Group_2_0_2__0__Impl5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_2__1__Impl_in_rule__EQuery__Group_2_0_2__15829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__WhereAssignment_2_0_2_1_in_rule__EQuery__Group_2_0_2__1__Impl5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__0__Impl_in_rule__EQuery__Group_2_0_3__05890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__1_in_rule__EQuery__Group_2_0_3__05893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EQuery__Group_2_0_3__0__Impl5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_3__1__Impl_in_rule__EQuery__Group_2_0_3__15952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__GroupByAssignment_2_0_3_1_in_rule__EQuery__Group_2_0_3__1__Impl5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__0__Impl_in_rule__EQuery__Group_2_0_4__06013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__1_in_rule__EQuery__Group_2_0_4__06016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EQuery__Group_2_0_4__0__Impl6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__Group_2_0_4__1__Impl_in_rule__EQuery__Group_2_0_4__16075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__OrderbyAssignment_2_0_4_1_in_rule__EQuery__Group_2_0_4__1__Impl6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__0__Impl_in_rule__EObjectSection__Group__06136 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__1_in_rule__EObjectSection__Group__06139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__EntityAssignment_0_in_rule__EObjectSection__Group__0__Impl6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group__1__Impl_in_rule__EObjectSection__Group__16196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__0_in_rule__EObjectSection__Group__1__Impl6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__0__Impl_in_rule__EObjectSection__Group_1__06258 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__1_in_rule__EObjectSection__Group_1__06261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__PrefixAssignment_1_0_in_rule__EObjectSection__Group_1__0__Impl6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1__1__Impl_in_rule__EObjectSection__Group_1__16318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__0_in_rule__EObjectSection__Group_1__1__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__0__Impl_in_rule__EObjectSection__Group_1_1__06380 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__1_in_rule__EObjectSection__Group_1_1__06383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EObjectSection__Group_1_1__0__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__1__Impl_in_rule__EObjectSection__Group_1_1__16442 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__2_in_rule__EObjectSection__Group_1_1__16445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_1_in_rule__EObjectSection__Group_1_1__1__Impl6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__2__Impl_in_rule__EObjectSection__Group_1_1__26502 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__3_in_rule__EObjectSection__Group_1_1__26505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__0_in_rule__EObjectSection__Group_1_1__2__Impl6532 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1__3__Impl_in_rule__EObjectSection__Group_1_1__36563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EObjectSection__Group_1_1__3__Impl6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__0__Impl_in_rule__EObjectSection__Group_1_1_2__06630 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__1_in_rule__EObjectSection__Group_1_1_2__06633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EObjectSection__Group_1_1_2__0__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__Group_1_1_2__1__Impl_in_rule__EObjectSection__Group_1_1_2__16692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectSection__AttributesAssignment_1_1_2_1_in_rule__EObjectSection__Group_1_1_2__1__Impl6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__0__Impl_in_rule__EMappingAttribute__Group__06753 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__1_in_rule__EMappingAttribute__Group__06756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__PkAssignment_0_in_rule__EMappingAttribute__Group__0__Impl6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__1__Impl_in_rule__EMappingAttribute__Group__16814 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__2_in_rule__EMappingAttribute__Group__16817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__PropertyAssignment_1_in_rule__EMappingAttribute__Group__1__Impl6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__2__Impl_in_rule__EMappingAttribute__Group__26874 = new BitSet(new long[]{0x0000000300000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__3_in_rule__EMappingAttribute__Group__26877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EMappingAttribute__Group__2__Impl6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group__3__Impl_in_rule__EMappingAttribute__Group__36936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Alternatives_3_in_rule__EMappingAttribute__Group__3__Impl6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__0__Impl_in_rule__EMappingAttribute__Group_3_1__07001 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__1_in_rule__EMappingAttribute__Group_3_1__07004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EMappingAttribute__Group_3_1__0__Impl7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__1__Impl_in_rule__EMappingAttribute__Group_3_1__17063 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__2_in_rule__EMappingAttribute__Group_3_1__17066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__EntityAssignment_3_1_1_in_rule__EMappingAttribute__Group_3_1__1__Impl7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__2__Impl_in_rule__EMappingAttribute__Group_3_1__27123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__3_in_rule__EMappingAttribute__Group_3_1__27126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EMappingAttribute__Group_3_1__2__Impl7154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__3__Impl_in_rule__EMappingAttribute__Group_3_1__37185 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__4_in_rule__EMappingAttribute__Group_3_1__37188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__ParametersAssignment_3_1_3_in_rule__EMappingAttribute__Group_3_1__3__Impl7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_1__4__Impl_in_rule__EMappingAttribute__Group_3_1__47245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EMappingAttribute__Group_3_1__4__Impl7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__0__Impl_in_rule__EMappingAttribute__Group_3_2__07314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__1_in_rule__EMappingAttribute__Group_3_2__07317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EMappingAttribute__Group_3_2__0__Impl7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__Group_3_2__1__Impl_in_rule__EMappingAttribute__Group_3_2__17376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingAttribute__MapAssignment_3_2_1_in_rule__EMappingAttribute__Group_3_2__1__Impl7403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__0__Impl_in_rule__EType__Group__07437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EType__Group__1_in_rule__EType__Group__07440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EType__Group__0__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__1__Impl_in_rule__EType__Group__17499 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EType__Group__2_in_rule__EType__Group__17502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__UrlAssignment_1_in_rule__EType__Group__1__Impl7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__2__Impl_in_rule__EType__Group__27559 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EType__Group__3_in_rule__EType__Group__27562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EType__Group__2__Impl7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__Group__3__Impl_in_rule__EType__Group__37621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EType__NameAssignment_3_in_rule__EType__Group__3__Impl7648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07686 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7772 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__QualifiedName__Group_1__0__Impl7839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__07931 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__07934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__17990 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__17993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__QualifiedNameWithWildcard__Group__1__Impl8021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__28052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__QualifiedNameWithWildcard__Group__2__Impl8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMapping__RootAlternatives_0_in_rule__EMapping__RootAssignment8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__EMappingBundle__ImportsAssignment_08155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__NameAssignment_28186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_48221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingBundle__EntitiesAssignment_5_18260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__EMappingEntityDef__PackageAssignment_08295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__EMappingEntityDef__ImportsAssignment_18326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingEntity_in_rule__EMappingEntityDef__EntityAssignment_28357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_18388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_18421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EMappingEntity__AbstractAssignment_08457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingEntity__NameAssignment_28496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMappingEntity__ExtensionTypeAlternatives_3_0_0_in_rule__EMappingEntity__ExtensionTypeAssignment_3_08527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingEntity__ParentAssignment_3_18564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEType_in_rule__EMappingEntity__EtypeAssignment_58599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_88630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEAttribute_in_rule__EMappingEntity__AttributesAssignment_9_18661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_11_28692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENamedQuery_in_rule__EMappingEntity__NamedQueriesAssignment_11_3_18723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingEntity__TableNameAssignment_13_18754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EAttribute__PkAssignment_08790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__PropertyAssignment_18829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__ColumnNameAssignment_3_08860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EAttribute__ResolvedAssignment_3_1_08896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EAttribute__QueryAssignment_3_1_18939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EAttribute__ParametersAssignment_3_1_38974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ENamedQuery__NameAssignment_09005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEParameter_in_rule__ENamedQuery__ParametersAssignment_1_19036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQuery_in_rule__ENamedQuery__QueriesAssignment_39067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EParameter__TypeAssignment_09098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EParameter__NameAssignment_19129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQuery__DbTypeAlternatives_0_0_in_rule__EQuery__DbTypeAssignment_09160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_rule__EQuery__MappingAssignment_19193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__FromAssignment_2_0_19224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__WhereAssignment_2_0_2_19255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__GroupByAssignment_2_0_3_19286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__OrderbyAssignment_2_0_4_19317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EQuery__AllAssignment_2_19348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EObjectSection__EntityAssignment_09383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EObjectSection__PrefixAssignment_1_09418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_19449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMappingAttribute_in_rule__EObjectSection__AttributesAssignment_1_1_2_19480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EMappingAttribute__PkAssignment_09516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__PropertyAssignment_19555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingAttribute__ColumnNameAssignment_3_09586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EMappingAttribute__EntityAssignment_3_1_19621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EMappingAttribute__ParametersAssignment_3_1_39656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectSection_in_rule__EMappingAttribute__MapAssignment_3_2_19687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EType__UrlAssignment_19718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EType__NameAssignment_39749 = new BitSet(new long[]{0x0000000000000002L});

}