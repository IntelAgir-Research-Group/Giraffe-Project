package fr.mines_nantes.atlanmod.giraffe.parser.antlr.internal; 

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
import fr.mines_nantes.atlanmod.giraffe.services.GiraffeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGiraffeDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'environment'", "'{'", "'}'", "'deployment-definitions'", "'deployment'", "'import'", "'.*'", "'.'", "'virtualmachine'", "':='", "','", "'provider'", "'other'", "'connection'", "'resources'", "'auth'", "'password'", "'key'", "'credential'", "'dependency'", "'install'", "'service'", "'file'", "'artifact'", "'config'", "'config-block'", "'code'", "'code-external'", "'script'", "'script-command'", "'script-block'", "'nodeset'", "'setup'", "'deploy'", "'in'", "'timeout'", "'exec'", "'-'", "'true'", "'false'", "'*'", "'amazon'", "'google'", "'g5000'", "'virtualbox'", "'linux'", "'ssh'", "'tomcat'", "'httpd'", "'ubuntu'", "'debian'", "'centos'", "'fedora'", "'start'", "'restart'", "'stop'", "'local'", "'remote'"
    };
    public static final int T__68=68;
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
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=6;
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


        public InternalGiraffeDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGiraffeDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGiraffeDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g"; }



     	private GiraffeDSLGrammarAccess grammarAccess;
     	
        public InternalGiraffeDSLParser(TokenStream input, GiraffeDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "GiraffeMetaModel";	
       	}
       	
       	@Override
       	protected GiraffeDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGiraffeMetaModel"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:68:1: entryRuleGiraffeMetaModel returns [EObject current=null] : iv_ruleGiraffeMetaModel= ruleGiraffeMetaModel EOF ;
    public final EObject entryRuleGiraffeMetaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiraffeMetaModel = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:69:2: (iv_ruleGiraffeMetaModel= ruleGiraffeMetaModel EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:70:2: iv_ruleGiraffeMetaModel= ruleGiraffeMetaModel EOF
            {
             newCompositeNode(grammarAccess.getGiraffeMetaModelRule()); 
            pushFollow(FOLLOW_ruleGiraffeMetaModel_in_entryRuleGiraffeMetaModel75);
            iv_ruleGiraffeMetaModel=ruleGiraffeMetaModel();

            state._fsp--;

             current =iv_ruleGiraffeMetaModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGiraffeMetaModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGiraffeMetaModel"


    // $ANTLR start "ruleGiraffeMetaModel"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:77:1: ruleGiraffeMetaModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_environment_1_0= ruleEnvironment ) ) ( (lv_deploymentdefinitions_2_0= ruleDeploymentDefinitions ) ) ( (lv_deployment_3_0= ruleDeployment ) ) ) ;
    public final EObject ruleGiraffeMetaModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_environment_1_0 = null;

        EObject lv_deploymentdefinitions_2_0 = null;

        EObject lv_deployment_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_environment_1_0= ruleEnvironment ) ) ( (lv_deploymentdefinitions_2_0= ruleDeploymentDefinitions ) ) ( (lv_deployment_3_0= ruleDeployment ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_environment_1_0= ruleEnvironment ) ) ( (lv_deploymentdefinitions_2_0= ruleDeploymentDefinitions ) ) ( (lv_deployment_3_0= ruleDeployment ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_environment_1_0= ruleEnvironment ) ) ( (lv_deploymentdefinitions_2_0= ruleDeploymentDefinitions ) ) ( (lv_deployment_3_0= ruleDeployment ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_environment_1_0= ruleEnvironment ) ) ( (lv_deploymentdefinitions_2_0= ruleDeploymentDefinitions ) ) ( (lv_deployment_3_0= ruleDeployment ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGiraffeMetaModelAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleGiraffeMetaModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGiraffeMetaModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:99:3: ( (lv_environment_1_0= ruleEnvironment ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:100:1: (lv_environment_1_0= ruleEnvironment )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:100:1: (lv_environment_1_0= ruleEnvironment )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:101:3: lv_environment_1_0= ruleEnvironment
            {
             
            	        newCompositeNode(grammarAccess.getGiraffeMetaModelAccess().getEnvironmentEnvironmentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEnvironment_in_ruleGiraffeMetaModel153);
            lv_environment_1_0=ruleEnvironment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGiraffeMetaModelRule());
            	        }
                   		set(
                   			current, 
                   			"environment",
                    		lv_environment_1_0, 
                    		"Environment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:117:2: ( (lv_deploymentdefinitions_2_0= ruleDeploymentDefinitions ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:118:1: (lv_deploymentdefinitions_2_0= ruleDeploymentDefinitions )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:118:1: (lv_deploymentdefinitions_2_0= ruleDeploymentDefinitions )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:119:3: lv_deploymentdefinitions_2_0= ruleDeploymentDefinitions
            {
             
            	        newCompositeNode(grammarAccess.getGiraffeMetaModelAccess().getDeploymentdefinitionsDeploymentDefinitionsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploymentDefinitions_in_ruleGiraffeMetaModel174);
            lv_deploymentdefinitions_2_0=ruleDeploymentDefinitions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGiraffeMetaModelRule());
            	        }
                   		set(
                   			current, 
                   			"deploymentdefinitions",
                    		lv_deploymentdefinitions_2_0, 
                    		"DeploymentDefinitions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:135:2: ( (lv_deployment_3_0= ruleDeployment ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:136:1: (lv_deployment_3_0= ruleDeployment )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:136:1: (lv_deployment_3_0= ruleDeployment )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:137:3: lv_deployment_3_0= ruleDeployment
            {
             
            	        newCompositeNode(grammarAccess.getGiraffeMetaModelAccess().getDeploymentDeploymentParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDeployment_in_ruleGiraffeMetaModel195);
            lv_deployment_3_0=ruleDeployment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGiraffeMetaModelRule());
            	        }
                   		set(
                   			current, 
                   			"deployment",
                    		lv_deployment_3_0, 
                    		"Deployment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGiraffeMetaModel"


    // $ANTLR start "entryRuleEnvironment"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:161:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:162:2: (iv_ruleEnvironment= ruleEnvironment EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:163:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_ruleEnvironment_in_entryRuleEnvironment231);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironment241); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:170:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'environment' otherlv_2= '{' ( (lv_auths_3_0= ruleAuth ) )* ( (lv_resources_4_0= ruleResource ) )* ( (lv_dependencies_5_0= ruleDependency ) )* ( (lv_virtualmachines_6_0= ruleVirtualMachine ) )* ( (lv_providers_7_0= ruleProviders ) )* otherlv_8= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_auths_3_0 = null;

        EObject lv_resources_4_0 = null;

        EObject lv_dependencies_5_0 = null;

        EObject lv_virtualmachines_6_0 = null;

        EObject lv_providers_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:173:28: ( ( () otherlv_1= 'environment' otherlv_2= '{' ( (lv_auths_3_0= ruleAuth ) )* ( (lv_resources_4_0= ruleResource ) )* ( (lv_dependencies_5_0= ruleDependency ) )* ( (lv_virtualmachines_6_0= ruleVirtualMachine ) )* ( (lv_providers_7_0= ruleProviders ) )* otherlv_8= '}' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:174:1: ( () otherlv_1= 'environment' otherlv_2= '{' ( (lv_auths_3_0= ruleAuth ) )* ( (lv_resources_4_0= ruleResource ) )* ( (lv_dependencies_5_0= ruleDependency ) )* ( (lv_virtualmachines_6_0= ruleVirtualMachine ) )* ( (lv_providers_7_0= ruleProviders ) )* otherlv_8= '}' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:174:1: ( () otherlv_1= 'environment' otherlv_2= '{' ( (lv_auths_3_0= ruleAuth ) )* ( (lv_resources_4_0= ruleResource ) )* ( (lv_dependencies_5_0= ruleDependency ) )* ( (lv_virtualmachines_6_0= ruleVirtualMachine ) )* ( (lv_providers_7_0= ruleProviders ) )* otherlv_8= '}' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:174:2: () otherlv_1= 'environment' otherlv_2= '{' ( (lv_auths_3_0= ruleAuth ) )* ( (lv_resources_4_0= ruleResource ) )* ( (lv_dependencies_5_0= ruleDependency ) )* ( (lv_virtualmachines_6_0= ruleVirtualMachine ) )* ( (lv_providers_7_0= ruleProviders ) )* otherlv_8= '}'
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:174:2: ()
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:175:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleEnvironment287); 

                	newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnvironment299); 

                	newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:188:1: ( (lv_auths_3_0= ruleAuth ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:189:1: (lv_auths_3_0= ruleAuth )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:189:1: (lv_auths_3_0= ruleAuth )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:190:3: lv_auths_3_0= ruleAuth
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnvironmentAccess().getAuthsAuthParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAuth_in_ruleEnvironment320);
            	    lv_auths_3_0=ruleAuth();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"auths",
            	            		lv_auths_3_0, 
            	            		"Auth");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:206:3: ( (lv_resources_4_0= ruleResource ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:207:1: (lv_resources_4_0= ruleResource )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:207:1: (lv_resources_4_0= ruleResource )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:208:3: lv_resources_4_0= ruleResource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnvironmentAccess().getResourcesResourceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResource_in_ruleEnvironment342);
            	    lv_resources_4_0=ruleResource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_4_0, 
            	            		"Resource");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:224:3: ( (lv_dependencies_5_0= ruleDependency ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:225:1: (lv_dependencies_5_0= ruleDependency )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:225:1: (lv_dependencies_5_0= ruleDependency )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:226:3: lv_dependencies_5_0= ruleDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnvironmentAccess().getDependenciesDependencyParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependency_in_ruleEnvironment364);
            	    lv_dependencies_5_0=ruleDependency();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dependencies",
            	            		lv_dependencies_5_0, 
            	            		"Dependency");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:242:3: ( (lv_virtualmachines_6_0= ruleVirtualMachine ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:243:1: (lv_virtualmachines_6_0= ruleVirtualMachine )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:243:1: (lv_virtualmachines_6_0= ruleVirtualMachine )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:244:3: lv_virtualmachines_6_0= ruleVirtualMachine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnvironmentAccess().getVirtualmachinesVirtualMachineParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVirtualMachine_in_ruleEnvironment386);
            	    lv_virtualmachines_6_0=ruleVirtualMachine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"virtualmachines",
            	            		lv_virtualmachines_6_0, 
            	            		"VirtualMachine");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:260:3: ( (lv_providers_7_0= ruleProviders ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:261:1: (lv_providers_7_0= ruleProviders )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:261:1: (lv_providers_7_0= ruleProviders )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:262:3: lv_providers_7_0= ruleProviders
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnvironmentAccess().getProvidersProvidersParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProviders_in_ruleEnvironment408);
            	    lv_providers_7_0=ruleProviders();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providers",
            	            		lv_providers_7_0, 
            	            		"Providers");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleEnvironment421); 

                	newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleDeploymentDefinitions"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:290:1: entryRuleDeploymentDefinitions returns [EObject current=null] : iv_ruleDeploymentDefinitions= ruleDeploymentDefinitions EOF ;
    public final EObject entryRuleDeploymentDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentDefinitions = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:291:2: (iv_ruleDeploymentDefinitions= ruleDeploymentDefinitions EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:292:2: iv_ruleDeploymentDefinitions= ruleDeploymentDefinitions EOF
            {
             newCompositeNode(grammarAccess.getDeploymentDefinitionsRule()); 
            pushFollow(FOLLOW_ruleDeploymentDefinitions_in_entryRuleDeploymentDefinitions457);
            iv_ruleDeploymentDefinitions=ruleDeploymentDefinitions();

            state._fsp--;

             current =iv_ruleDeploymentDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploymentDefinitions467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeploymentDefinitions"


    // $ANTLR start "ruleDeploymentDefinitions"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:299:1: ruleDeploymentDefinitions returns [EObject current=null] : ( () otherlv_1= 'deployment-definitions' otherlv_2= '{' ( ( (lv_artifacts_3_1= ruleArtifact | lv_artifacts_3_2= ruleConfArtifact ) ) )* ( (lv_nodesets_4_0= ruleNodeset ) )* otherlv_5= '}' ) ;
    public final EObject ruleDeploymentDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_artifacts_3_1 = null;

        EObject lv_artifacts_3_2 = null;

        EObject lv_nodesets_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:302:28: ( ( () otherlv_1= 'deployment-definitions' otherlv_2= '{' ( ( (lv_artifacts_3_1= ruleArtifact | lv_artifacts_3_2= ruleConfArtifact ) ) )* ( (lv_nodesets_4_0= ruleNodeset ) )* otherlv_5= '}' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:303:1: ( () otherlv_1= 'deployment-definitions' otherlv_2= '{' ( ( (lv_artifacts_3_1= ruleArtifact | lv_artifacts_3_2= ruleConfArtifact ) ) )* ( (lv_nodesets_4_0= ruleNodeset ) )* otherlv_5= '}' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:303:1: ( () otherlv_1= 'deployment-definitions' otherlv_2= '{' ( ( (lv_artifacts_3_1= ruleArtifact | lv_artifacts_3_2= ruleConfArtifact ) ) )* ( (lv_nodesets_4_0= ruleNodeset ) )* otherlv_5= '}' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:303:2: () otherlv_1= 'deployment-definitions' otherlv_2= '{' ( ( (lv_artifacts_3_1= ruleArtifact | lv_artifacts_3_2= ruleConfArtifact ) ) )* ( (lv_nodesets_4_0= ruleNodeset ) )* otherlv_5= '}'
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:303:2: ()
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:304:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeploymentDefinitionsAccess().getDeploymentDefinitionsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDeploymentDefinitions513); 

                	newLeafNode(otherlv_1, grammarAccess.getDeploymentDefinitionsAccess().getDeploymentDefinitionsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDeploymentDefinitions525); 

                	newLeafNode(otherlv_2, grammarAccess.getDeploymentDefinitionsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:317:1: ( ( (lv_artifacts_3_1= ruleArtifact | lv_artifacts_3_2= ruleConfArtifact ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:318:1: ( (lv_artifacts_3_1= ruleArtifact | lv_artifacts_3_2= ruleConfArtifact ) )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:318:1: ( (lv_artifacts_3_1= ruleArtifact | lv_artifacts_3_2= ruleConfArtifact ) )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:319:1: (lv_artifacts_3_1= ruleArtifact | lv_artifacts_3_2= ruleConfArtifact )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:319:1: (lv_artifacts_3_1= ruleArtifact | lv_artifacts_3_2= ruleConfArtifact )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==34) ) {
            	        int LA7_1 = input.LA(2);

            	        if ( ((LA7_1>=37 && LA7_1<=41)) ) {
            	            alt7=1;
            	        }
            	        else if ( ((LA7_1>=35 && LA7_1<=36)) ) {
            	            alt7=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 7, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:320:3: lv_artifacts_3_1= ruleArtifact
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDeploymentDefinitionsAccess().getArtifactsArtifactParserRuleCall_3_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleArtifact_in_ruleDeploymentDefinitions548);
            	            lv_artifacts_3_1=ruleArtifact();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getDeploymentDefinitionsRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"artifacts",
            	                    		lv_artifacts_3_1, 
            	                    		"Artifact");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:335:8: lv_artifacts_3_2= ruleConfArtifact
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDeploymentDefinitionsAccess().getArtifactsConfArtifactParserRuleCall_3_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleConfArtifact_in_ruleDeploymentDefinitions567);
            	            lv_artifacts_3_2=ruleConfArtifact();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getDeploymentDefinitionsRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"artifacts",
            	                    		lv_artifacts_3_2, 
            	                    		"ConfArtifact");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:353:3: ( (lv_nodesets_4_0= ruleNodeset ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==42) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:354:1: (lv_nodesets_4_0= ruleNodeset )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:354:1: (lv_nodesets_4_0= ruleNodeset )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:355:3: lv_nodesets_4_0= ruleNodeset
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeploymentDefinitionsAccess().getNodesetsNodesetParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeset_in_ruleDeploymentDefinitions592);
            	    lv_nodesets_4_0=ruleNodeset();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeploymentDefinitionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodesets",
            	            		lv_nodesets_4_0, 
            	            		"Nodeset");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDeploymentDefinitions605); 

                	newLeafNode(otherlv_5, grammarAccess.getDeploymentDefinitionsAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeploymentDefinitions"


    // $ANTLR start "entryRuleDeployment"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:383:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:384:2: (iv_ruleDeployment= ruleDeployment EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:385:2: iv_ruleDeployment= ruleDeployment EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_ruleDeployment_in_entryRuleDeployment641);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;

             current =iv_ruleDeployment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeployment651); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:392:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'deployment' otherlv_1= '{' ( (lv_setups_2_0= ruleSetup ) ) ( (lv_deploys_3_0= ruleDeploy ) ) otherlv_4= '}' ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_setups_2_0 = null;

        EObject lv_deploys_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:395:28: ( (otherlv_0= 'deployment' otherlv_1= '{' ( (lv_setups_2_0= ruleSetup ) ) ( (lv_deploys_3_0= ruleDeploy ) ) otherlv_4= '}' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:396:1: (otherlv_0= 'deployment' otherlv_1= '{' ( (lv_setups_2_0= ruleSetup ) ) ( (lv_deploys_3_0= ruleDeploy ) ) otherlv_4= '}' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:396:1: (otherlv_0= 'deployment' otherlv_1= '{' ( (lv_setups_2_0= ruleSetup ) ) ( (lv_deploys_3_0= ruleDeploy ) ) otherlv_4= '}' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:396:3: otherlv_0= 'deployment' otherlv_1= '{' ( (lv_setups_2_0= ruleSetup ) ) ( (lv_deploys_3_0= ruleDeploy ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDeployment688); 

                	newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleDeployment700); 

                	newLeafNode(otherlv_1, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:404:1: ( (lv_setups_2_0= ruleSetup ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:405:1: (lv_setups_2_0= ruleSetup )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:405:1: (lv_setups_2_0= ruleSetup )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:406:3: lv_setups_2_0= ruleSetup
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentAccess().getSetupsSetupParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSetup_in_ruleDeployment721);
            lv_setups_2_0=ruleSetup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	        }
                   		set(
                   			current, 
                   			"setups",
                    		lv_setups_2_0, 
                    		"Setup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:422:2: ( (lv_deploys_3_0= ruleDeploy ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:423:1: (lv_deploys_3_0= ruleDeploy )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:423:1: (lv_deploys_3_0= ruleDeploy )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:424:3: lv_deploys_3_0= ruleDeploy
            {
             
            	        newCompositeNode(grammarAccess.getDeploymentAccess().getDeploysDeployParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDeploy_in_ruleDeployment742);
            lv_deploys_3_0=ruleDeploy();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	        }
                   		set(
                   			current, 
                   			"deploys",
                    		lv_deploys_3_0, 
                    		"Deploy");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDeployment754); 

                	newLeafNode(otherlv_4, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleImport"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:452:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:453:2: (iv_ruleImport= ruleImport EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:454:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport790);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport800); 

            }

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
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:461:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:464:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:465:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:465:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:465:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport837); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:469:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:470:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:470:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:471:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport858);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:495:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:496:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:497:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard895);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard906); 

            }

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
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:504:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:507:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:508:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:508:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:509:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard953);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:519:1: (kw= '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:520:2: kw= '.*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildcard972); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:533:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:534:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:535:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1015);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1026); 

            }

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
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:542:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:545:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:546:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:546:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:546:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1066); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:553:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:554:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedName1085); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1100); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleVirtualMachine"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:574:1: entryRuleVirtualMachine returns [EObject current=null] : iv_ruleVirtualMachine= ruleVirtualMachine EOF ;
    public final EObject entryRuleVirtualMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualMachine = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:575:2: (iv_ruleVirtualMachine= ruleVirtualMachine EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:576:2: iv_ruleVirtualMachine= ruleVirtualMachine EOF
            {
             newCompositeNode(grammarAccess.getVirtualMachineRule()); 
            pushFollow(FOLLOW_ruleVirtualMachine_in_entryRuleVirtualMachine1147);
            iv_ruleVirtualMachine=ruleVirtualMachine();

            state._fsp--;

             current =iv_ruleVirtualMachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualMachine1157); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVirtualMachine"


    // $ANTLR start "ruleVirtualMachine"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:583:1: ruleVirtualMachine returns [EObject current=null] : (otherlv_0= 'virtualmachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( ( (lv_so_3_0= ruleNativeSO ) ) ( (lv_distribution_4_0= ruleNativeDistribution ) ) ( (lv_version_5_0= ruleEFloat ) ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) )? otherlv_8= ',' ( (otherlv_9= RULE_ID ) )* ) ;
    public final EObject ruleVirtualMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_so_3_0 = null;

        Enumerator lv_distribution_4_0 = null;

        AntlrDatatypeRuleToken lv_version_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:586:28: ( (otherlv_0= 'virtualmachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( ( (lv_so_3_0= ruleNativeSO ) ) ( (lv_distribution_4_0= ruleNativeDistribution ) ) ( (lv_version_5_0= ruleEFloat ) ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) )? otherlv_8= ',' ( (otherlv_9= RULE_ID ) )* ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:587:1: (otherlv_0= 'virtualmachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( ( (lv_so_3_0= ruleNativeSO ) ) ( (lv_distribution_4_0= ruleNativeDistribution ) ) ( (lv_version_5_0= ruleEFloat ) ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) )? otherlv_8= ',' ( (otherlv_9= RULE_ID ) )* )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:587:1: (otherlv_0= 'virtualmachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( ( (lv_so_3_0= ruleNativeSO ) ) ( (lv_distribution_4_0= ruleNativeDistribution ) ) ( (lv_version_5_0= ruleEFloat ) ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) )? otherlv_8= ',' ( (otherlv_9= RULE_ID ) )* )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:587:3: otherlv_0= 'virtualmachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( ( (lv_so_3_0= ruleNativeSO ) ) ( (lv_distribution_4_0= ruleNativeDistribution ) ) ( (lv_version_5_0= ruleEFloat ) ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) )? otherlv_8= ',' ( (otherlv_9= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleVirtualMachine1194); 

                	newLeafNode(otherlv_0, grammarAccess.getVirtualMachineAccess().getVirtualmachineKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:591:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:592:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:592:1: (lv_name_1_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:593:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVirtualMachineAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleVirtualMachine1215);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVirtualMachineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleVirtualMachine1227); 

                	newLeafNode(otherlv_2, grammarAccess.getVirtualMachineAccess().getColonEqualsSignKeyword_2());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:613:1: ( ( (lv_so_3_0= ruleNativeSO ) ) ( (lv_distribution_4_0= ruleNativeDistribution ) ) ( (lv_version_5_0= ruleEFloat ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:613:2: ( (lv_so_3_0= ruleNativeSO ) ) ( (lv_distribution_4_0= ruleNativeDistribution ) ) ( (lv_version_5_0= ruleEFloat ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:613:2: ( (lv_so_3_0= ruleNativeSO ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:614:1: (lv_so_3_0= ruleNativeSO )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:614:1: (lv_so_3_0= ruleNativeSO )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:615:3: lv_so_3_0= ruleNativeSO
            {
             
            	        newCompositeNode(grammarAccess.getVirtualMachineAccess().getSoNativeSOEnumRuleCall_3_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNativeSO_in_ruleVirtualMachine1249);
            lv_so_3_0=ruleNativeSO();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVirtualMachineRule());
            	        }
                   		set(
                   			current, 
                   			"so",
                    		lv_so_3_0, 
                    		"NativeSO");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:631:2: ( (lv_distribution_4_0= ruleNativeDistribution ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:632:1: (lv_distribution_4_0= ruleNativeDistribution )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:632:1: (lv_distribution_4_0= ruleNativeDistribution )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:633:3: lv_distribution_4_0= ruleNativeDistribution
            {
             
            	        newCompositeNode(grammarAccess.getVirtualMachineAccess().getDistributionNativeDistributionEnumRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNativeDistribution_in_ruleVirtualMachine1270);
            lv_distribution_4_0=ruleNativeDistribution();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVirtualMachineRule());
            	        }
                   		set(
                   			current, 
                   			"distribution",
                    		lv_distribution_4_0, 
                    		"NativeDistribution");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:649:2: ( (lv_version_5_0= ruleEFloat ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:650:1: (lv_version_5_0= ruleEFloat )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:650:1: (lv_version_5_0= ruleEFloat )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:651:3: lv_version_5_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getVirtualMachineAccess().getVersionEFloatParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloat_in_ruleVirtualMachine1291);
            lv_version_5_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVirtualMachineRule());
            	        }
                   		set(
                   			current, 
                   			"version",
                    		lv_version_5_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleVirtualMachine1304); 

                	newLeafNode(otherlv_6, grammarAccess.getVirtualMachineAccess().getCommaKeyword_4());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:671:1: ( (otherlv_7= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:672:1: (otherlv_7= RULE_ID )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:672:1: (otherlv_7= RULE_ID )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:673:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVirtualMachineRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVirtualMachine1324); 

                    		newLeafNode(otherlv_7, grammarAccess.getVirtualMachineAccess().getAuthAuthCrossReference_5_0()); 
                    	

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleVirtualMachine1337); 

                	newLeafNode(otherlv_8, grammarAccess.getVirtualMachineAccess().getCommaKeyword_6());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:688:1: ( (otherlv_9= RULE_ID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:689:1: (otherlv_9= RULE_ID )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:689:1: (otherlv_9= RULE_ID )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:690:3: otherlv_9= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVirtualMachineRule());
            	    	        }
            	            
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVirtualMachine1357); 

            	    		newLeafNode(otherlv_9, grammarAccess.getVirtualMachineAccess().getDepDependencyCrossReference_7_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVirtualMachine"


    // $ANTLR start "entryRuleProviders"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:711:1: entryRuleProviders returns [EObject current=null] : iv_ruleProviders= ruleProviders EOF ;
    public final EObject entryRuleProviders() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviders = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:712:2: (iv_ruleProviders= ruleProviders EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:713:2: iv_ruleProviders= ruleProviders EOF
            {
             newCompositeNode(grammarAccess.getProvidersRule()); 
            pushFollow(FOLLOW_ruleProviders_in_entryRuleProviders1396);
            iv_ruleProviders=ruleProviders();

            state._fsp--;

             current =iv_ruleProviders; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviders1406); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProviders"


    // $ANTLR start "ruleProviders"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:720:1: ruleProviders returns [EObject current=null] : (this_Provider_0= ruleProvider | this_OtherProvider_1= ruleOtherProvider ) ;
    public final EObject ruleProviders() throws RecognitionException {
        EObject current = null;

        EObject this_Provider_0 = null;

        EObject this_OtherProvider_1 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:723:28: ( (this_Provider_0= ruleProvider | this_OtherProvider_1= ruleOtherProvider ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:724:1: (this_Provider_0= ruleProvider | this_OtherProvider_1= ruleOtherProvider )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:724:1: (this_Provider_0= ruleProvider | this_OtherProvider_1= ruleOtherProvider )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=52 && LA14_1<=55)) ) {
                    alt14=1;
                }
                else if ( (LA14_1==23) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:725:5: this_Provider_0= ruleProvider
                    {
                     
                            newCompositeNode(grammarAccess.getProvidersAccess().getProviderParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProvider_in_ruleProviders1453);
                    this_Provider_0=ruleProvider();

                    state._fsp--;

                     
                            current = this_Provider_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:735:5: this_OtherProvider_1= ruleOtherProvider
                    {
                     
                            newCompositeNode(grammarAccess.getProvidersAccess().getOtherProviderParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOtherProvider_in_ruleProviders1480);
                    this_OtherProvider_1=ruleOtherProvider();

                    state._fsp--;

                     
                            current = this_OtherProvider_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProviders"


    // $ANTLR start "entryRuleProvider"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:751:1: entryRuleProvider returns [EObject current=null] : iv_ruleProvider= ruleProvider EOF ;
    public final EObject entryRuleProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvider = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:752:2: (iv_ruleProvider= ruleProvider EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:753:2: iv_ruleProvider= ruleProvider EOF
            {
             newCompositeNode(grammarAccess.getProviderRule()); 
            pushFollow(FOLLOW_ruleProvider_in_entryRuleProvider1515);
            iv_ruleProvider=ruleProvider();

            state._fsp--;

             current =iv_ruleProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvider1525); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvider"


    // $ANTLR start "ruleProvider"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:760:1: ruleProvider returns [EObject current=null] : (otherlv_0= 'provider' ( (lv_type_1_0= ruleNativeProvType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( (lv_host_10_0= ruleEString ) ) ) ;
    public final EObject ruleProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_host_10_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:763:28: ( (otherlv_0= 'provider' ( (lv_type_1_0= ruleNativeProvType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( (lv_host_10_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:764:1: (otherlv_0= 'provider' ( (lv_type_1_0= ruleNativeProvType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( (lv_host_10_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:764:1: (otherlv_0= 'provider' ( (lv_type_1_0= ruleNativeProvType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( (lv_host_10_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:764:3: otherlv_0= 'provider' ( (lv_type_1_0= ruleNativeProvType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( (lv_host_10_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleProvider1562); 

                	newLeafNode(otherlv_0, grammarAccess.getProviderAccess().getProviderKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:768:1: ( (lv_type_1_0= ruleNativeProvType ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:769:1: (lv_type_1_0= ruleNativeProvType )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:769:1: (lv_type_1_0= ruleNativeProvType )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:770:3: lv_type_1_0= ruleNativeProvType
            {
             
            	        newCompositeNode(grammarAccess.getProviderAccess().getTypeNativeProvTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNativeProvType_in_ruleProvider1583);
            lv_type_1_0=ruleNativeProvType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProviderRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"NativeProvType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:786:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:787:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:787:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:788:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProviderAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleProvider1604);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProviderRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleProvider1616); 

                	newLeafNode(otherlv_3, grammarAccess.getProviderAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:808:1: ( (otherlv_4= RULE_ID ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:809:1: (otherlv_4= RULE_ID )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:809:1: (otherlv_4= RULE_ID )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:810:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProviderRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvider1636); 

            		newLeafNode(otherlv_4, grammarAccess.getProviderAccess().getAuthMethodAuthCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleProvider1648); 

                	newLeafNode(otherlv_5, grammarAccess.getProviderAccess().getCommaKeyword_5());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:825:1: ( (otherlv_6= RULE_ID ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:826:1: (otherlv_6= RULE_ID )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:826:1: (otherlv_6= RULE_ID )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:827:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProviderRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvider1668); 

            		newLeafNode(otherlv_6, grammarAccess.getProviderAccess().getResourcesResourceCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleProvider1680); 

                	newLeafNode(otherlv_7, grammarAccess.getProviderAccess().getCommaKeyword_7());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:842:1: ( (otherlv_8= RULE_ID ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:843:1: (otherlv_8= RULE_ID )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:843:1: (otherlv_8= RULE_ID )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:844:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProviderRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvider1700); 

            		newLeafNode(otherlv_8, grammarAccess.getProviderAccess().getVmVirtualMachineCrossReference_8_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleProvider1712); 

                	newLeafNode(otherlv_9, grammarAccess.getProviderAccess().getCommaKeyword_9());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:859:1: ( (lv_host_10_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:860:1: (lv_host_10_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:860:1: (lv_host_10_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:861:3: lv_host_10_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProviderAccess().getHostEStringParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleProvider1733);
            lv_host_10_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProviderRule());
            	        }
                   		set(
                   			current, 
                   			"host",
                    		lv_host_10_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleOtherProvider"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:885:1: entryRuleOtherProvider returns [EObject current=null] : iv_ruleOtherProvider= ruleOtherProvider EOF ;
    public final EObject entryRuleOtherProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherProvider = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:886:2: (iv_ruleOtherProvider= ruleOtherProvider EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:887:2: iv_ruleOtherProvider= ruleOtherProvider EOF
            {
             newCompositeNode(grammarAccess.getOtherProviderRule()); 
            pushFollow(FOLLOW_ruleOtherProvider_in_entryRuleOtherProvider1769);
            iv_ruleOtherProvider=ruleOtherProvider();

            state._fsp--;

             current =iv_ruleOtherProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherProvider1779); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOtherProvider"


    // $ANTLR start "ruleOtherProvider"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:894:1: ruleOtherProvider returns [EObject current=null] : (otherlv_0= 'provider' ( (lv_type_1_0= 'other' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( (lv_host_10_0= ruleEString ) ) otherlv_11= '{' ( (lv_imports_12_0= ruleImport ) )* otherlv_13= 'connection' otherlv_14= '{' otherlv_15= '}' otherlv_16= 'resources' otherlv_17= '{' otherlv_18= '}' otherlv_19= 'virtualmachine' otherlv_20= '{' otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleOtherProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_host_10_0 = null;

        EObject lv_imports_12_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:897:28: ( (otherlv_0= 'provider' ( (lv_type_1_0= 'other' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( (lv_host_10_0= ruleEString ) ) otherlv_11= '{' ( (lv_imports_12_0= ruleImport ) )* otherlv_13= 'connection' otherlv_14= '{' otherlv_15= '}' otherlv_16= 'resources' otherlv_17= '{' otherlv_18= '}' otherlv_19= 'virtualmachine' otherlv_20= '{' otherlv_21= '}' otherlv_22= '}' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:898:1: (otherlv_0= 'provider' ( (lv_type_1_0= 'other' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( (lv_host_10_0= ruleEString ) ) otherlv_11= '{' ( (lv_imports_12_0= ruleImport ) )* otherlv_13= 'connection' otherlv_14= '{' otherlv_15= '}' otherlv_16= 'resources' otherlv_17= '{' otherlv_18= '}' otherlv_19= 'virtualmachine' otherlv_20= '{' otherlv_21= '}' otherlv_22= '}' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:898:1: (otherlv_0= 'provider' ( (lv_type_1_0= 'other' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( (lv_host_10_0= ruleEString ) ) otherlv_11= '{' ( (lv_imports_12_0= ruleImport ) )* otherlv_13= 'connection' otherlv_14= '{' otherlv_15= '}' otherlv_16= 'resources' otherlv_17= '{' otherlv_18= '}' otherlv_19= 'virtualmachine' otherlv_20= '{' otherlv_21= '}' otherlv_22= '}' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:898:3: otherlv_0= 'provider' ( (lv_type_1_0= 'other' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( (lv_host_10_0= ruleEString ) ) otherlv_11= '{' ( (lv_imports_12_0= ruleImport ) )* otherlv_13= 'connection' otherlv_14= '{' otherlv_15= '}' otherlv_16= 'resources' otherlv_17= '{' otherlv_18= '}' otherlv_19= 'virtualmachine' otherlv_20= '{' otherlv_21= '}' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleOtherProvider1816); 

                	newLeafNode(otherlv_0, grammarAccess.getOtherProviderAccess().getProviderKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:902:1: ( (lv_type_1_0= 'other' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:903:1: (lv_type_1_0= 'other' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:903:1: (lv_type_1_0= 'other' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:904:3: lv_type_1_0= 'other'
            {
            lv_type_1_0=(Token)match(input,23,FOLLOW_23_in_ruleOtherProvider1834); 

                    newLeafNode(lv_type_1_0, grammarAccess.getOtherProviderAccess().getTypeOtherKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOtherProviderRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "other");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:917:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:918:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:918:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:919:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOtherProviderAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOtherProvider1868);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOtherProviderRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleOtherProvider1880); 

                	newLeafNode(otherlv_3, grammarAccess.getOtherProviderAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:939:1: ( (otherlv_4= RULE_ID ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:940:1: (otherlv_4= RULE_ID )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:940:1: (otherlv_4= RULE_ID )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:941:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOtherProviderRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOtherProvider1900); 

            		newLeafNode(otherlv_4, grammarAccess.getOtherProviderAccess().getAuthMethodAuthCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleOtherProvider1912); 

                	newLeafNode(otherlv_5, grammarAccess.getOtherProviderAccess().getCommaKeyword_5());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:956:1: ( (otherlv_6= RULE_ID ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:957:1: (otherlv_6= RULE_ID )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:957:1: (otherlv_6= RULE_ID )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:958:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOtherProviderRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOtherProvider1932); 

            		newLeafNode(otherlv_6, grammarAccess.getOtherProviderAccess().getResourcesResourceCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleOtherProvider1944); 

                	newLeafNode(otherlv_7, grammarAccess.getOtherProviderAccess().getCommaKeyword_7());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:973:1: ( (otherlv_8= RULE_ID ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:974:1: (otherlv_8= RULE_ID )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:974:1: (otherlv_8= RULE_ID )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:975:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOtherProviderRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOtherProvider1964); 

            		newLeafNode(otherlv_8, grammarAccess.getOtherProviderAccess().getVmVirtualMachineCrossReference_8_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleOtherProvider1976); 

                	newLeafNode(otherlv_9, grammarAccess.getOtherProviderAccess().getCommaKeyword_9());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:990:1: ( (lv_host_10_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:991:1: (lv_host_10_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:991:1: (lv_host_10_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:992:3: lv_host_10_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOtherProviderAccess().getHostEStringParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOtherProvider1997);
            lv_host_10_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOtherProviderRule());
            	        }
                   		set(
                   			current, 
                   			"host",
                    		lv_host_10_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,12,FOLLOW_12_in_ruleOtherProvider2009); 

                	newLeafNode(otherlv_11, grammarAccess.getOtherProviderAccess().getLeftCurlyBracketKeyword_11());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1012:1: ( (lv_imports_12_0= ruleImport ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1013:1: (lv_imports_12_0= ruleImport )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1013:1: (lv_imports_12_0= ruleImport )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1014:3: lv_imports_12_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOtherProviderAccess().getImportsImportParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleOtherProvider2030);
            	    lv_imports_12_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOtherProviderRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_12_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleOtherProvider2043); 

                	newLeafNode(otherlv_13, grammarAccess.getOtherProviderAccess().getConnectionKeyword_13());
                
            otherlv_14=(Token)match(input,12,FOLLOW_12_in_ruleOtherProvider2055); 

                	newLeafNode(otherlv_14, grammarAccess.getOtherProviderAccess().getLeftCurlyBracketKeyword_14());
                
            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleOtherProvider2067); 

                	newLeafNode(otherlv_15, grammarAccess.getOtherProviderAccess().getRightCurlyBracketKeyword_15());
                
            otherlv_16=(Token)match(input,25,FOLLOW_25_in_ruleOtherProvider2079); 

                	newLeafNode(otherlv_16, grammarAccess.getOtherProviderAccess().getResourcesKeyword_16());
                
            otherlv_17=(Token)match(input,12,FOLLOW_12_in_ruleOtherProvider2091); 

                	newLeafNode(otherlv_17, grammarAccess.getOtherProviderAccess().getLeftCurlyBracketKeyword_17());
                
            otherlv_18=(Token)match(input,13,FOLLOW_13_in_ruleOtherProvider2103); 

                	newLeafNode(otherlv_18, grammarAccess.getOtherProviderAccess().getRightCurlyBracketKeyword_18());
                
            otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleOtherProvider2115); 

                	newLeafNode(otherlv_19, grammarAccess.getOtherProviderAccess().getVirtualmachineKeyword_19());
                
            otherlv_20=(Token)match(input,12,FOLLOW_12_in_ruleOtherProvider2127); 

                	newLeafNode(otherlv_20, grammarAccess.getOtherProviderAccess().getLeftCurlyBracketKeyword_20());
                
            otherlv_21=(Token)match(input,13,FOLLOW_13_in_ruleOtherProvider2139); 

                	newLeafNode(otherlv_21, grammarAccess.getOtherProviderAccess().getRightCurlyBracketKeyword_21());
                
            otherlv_22=(Token)match(input,13,FOLLOW_13_in_ruleOtherProvider2151); 

                	newLeafNode(otherlv_22, grammarAccess.getOtherProviderAccess().getRightCurlyBracketKeyword_22());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOtherProvider"


    // $ANTLR start "entryRuleAuth"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1078:1: entryRuleAuth returns [EObject current=null] : iv_ruleAuth= ruleAuth EOF ;
    public final EObject entryRuleAuth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuth = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1079:2: (iv_ruleAuth= ruleAuth EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1080:2: iv_ruleAuth= ruleAuth EOF
            {
             newCompositeNode(grammarAccess.getAuthRule()); 
            pushFollow(FOLLOW_ruleAuth_in_entryRuleAuth2187);
            iv_ruleAuth=ruleAuth();

            state._fsp--;

             current =iv_ruleAuth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuth2197); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuth"


    // $ANTLR start "ruleAuth"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1087:1: ruleAuth returns [EObject current=null] : (this_Password_0= rulePassword | this_Key_1= ruleKey | this_Credential_2= ruleCredential ) ;
    public final EObject ruleAuth() throws RecognitionException {
        EObject current = null;

        EObject this_Password_0 = null;

        EObject this_Key_1 = null;

        EObject this_Credential_2 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1090:28: ( (this_Password_0= rulePassword | this_Key_1= ruleKey | this_Credential_2= ruleCredential ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1091:1: (this_Password_0= rulePassword | this_Key_1= ruleKey | this_Credential_2= ruleCredential )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1091:1: (this_Password_0= rulePassword | this_Key_1= ruleKey | this_Credential_2= ruleCredential )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt16=1;
                    }
                    break;
                case 29:
                    {
                    alt16=3;
                    }
                    break;
                case 28:
                    {
                    alt16=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1092:5: this_Password_0= rulePassword
                    {
                     
                            newCompositeNode(grammarAccess.getAuthAccess().getPasswordParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePassword_in_ruleAuth2244);
                    this_Password_0=rulePassword();

                    state._fsp--;

                     
                            current = this_Password_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1102:5: this_Key_1= ruleKey
                    {
                     
                            newCompositeNode(grammarAccess.getAuthAccess().getKeyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleKey_in_ruleAuth2271);
                    this_Key_1=ruleKey();

                    state._fsp--;

                     
                            current = this_Key_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1112:5: this_Credential_2= ruleCredential
                    {
                     
                            newCompositeNode(grammarAccess.getAuthAccess().getCredentialParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCredential_in_ruleAuth2298);
                    this_Credential_2=ruleCredential();

                    state._fsp--;

                     
                            current = this_Credential_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuth"


    // $ANTLR start "entryRulePassword"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1128:1: entryRulePassword returns [EObject current=null] : iv_rulePassword= rulePassword EOF ;
    public final EObject entryRulePassword() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassword = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1129:2: (iv_rulePassword= rulePassword EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1130:2: iv_rulePassword= rulePassword EOF
            {
             newCompositeNode(grammarAccess.getPasswordRule()); 
            pushFollow(FOLLOW_rulePassword_in_entryRulePassword2333);
            iv_rulePassword=rulePassword();

            state._fsp--;

             current =iv_rulePassword; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePassword2343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePassword"


    // $ANTLR start "rulePassword"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1137:1: rulePassword returns [EObject current=null] : (otherlv_0= 'auth' ( (lv_type_1_0= 'password' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_username_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_password_6_0= ruleEString ) ) ) ;
    public final EObject rulePassword() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_username_4_0 = null;

        AntlrDatatypeRuleToken lv_password_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1140:28: ( (otherlv_0= 'auth' ( (lv_type_1_0= 'password' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_username_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_password_6_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1141:1: (otherlv_0= 'auth' ( (lv_type_1_0= 'password' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_username_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_password_6_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1141:1: (otherlv_0= 'auth' ( (lv_type_1_0= 'password' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_username_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_password_6_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1141:3: otherlv_0= 'auth' ( (lv_type_1_0= 'password' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_username_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_password_6_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulePassword2380); 

                	newLeafNode(otherlv_0, grammarAccess.getPasswordAccess().getAuthKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1145:1: ( (lv_type_1_0= 'password' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1146:1: (lv_type_1_0= 'password' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1146:1: (lv_type_1_0= 'password' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1147:3: lv_type_1_0= 'password'
            {
            lv_type_1_0=(Token)match(input,27,FOLLOW_27_in_rulePassword2398); 

                    newLeafNode(lv_type_1_0, grammarAccess.getPasswordAccess().getTypePasswordKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPasswordRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "password");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1160:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1161:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1161:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1162:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPasswordAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_rulePassword2432);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPasswordRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulePassword2444); 

                	newLeafNode(otherlv_3, grammarAccess.getPasswordAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1182:1: ( (lv_username_4_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1183:1: (lv_username_4_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1183:1: (lv_username_4_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1184:3: lv_username_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPasswordAccess().getUsernameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_rulePassword2465);
            lv_username_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPasswordRule());
            	        }
                   		set(
                   			current, 
                   			"username",
                    		lv_username_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_rulePassword2477); 

                	newLeafNode(otherlv_5, grammarAccess.getPasswordAccess().getCommaKeyword_5());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1204:1: ( (lv_password_6_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1205:1: (lv_password_6_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1205:1: (lv_password_6_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1206:3: lv_password_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPasswordAccess().getPasswordEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_rulePassword2498);
            lv_password_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPasswordRule());
            	        }
                   		set(
                   			current, 
                   			"password",
                    		lv_password_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePassword"


    // $ANTLR start "entryRuleKey"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1230:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1231:2: (iv_ruleKey= ruleKey EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1232:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey2534);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey2544); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1239:1: ruleKey returns [EObject current=null] : (otherlv_0= 'auth' ( (lv_type_1_0= 'key' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_keyFile_4_0= ruleEString ) ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_keyFile_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1242:28: ( (otherlv_0= 'auth' ( (lv_type_1_0= 'key' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_keyFile_4_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1243:1: (otherlv_0= 'auth' ( (lv_type_1_0= 'key' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_keyFile_4_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1243:1: (otherlv_0= 'auth' ( (lv_type_1_0= 'key' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_keyFile_4_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1243:3: otherlv_0= 'auth' ( (lv_type_1_0= 'key' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_keyFile_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleKey2581); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyAccess().getAuthKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1247:1: ( (lv_type_1_0= 'key' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1248:1: (lv_type_1_0= 'key' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1248:1: (lv_type_1_0= 'key' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1249:3: lv_type_1_0= 'key'
            {
            lv_type_1_0=(Token)match(input,28,FOLLOW_28_in_ruleKey2599); 

                    newLeafNode(lv_type_1_0, grammarAccess.getKeyAccess().getTypeKeyKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKeyRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "key");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1262:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1263:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1263:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1264:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getKeyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleKey2633);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleKey2645); 

                	newLeafNode(otherlv_3, grammarAccess.getKeyAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1284:1: ( (lv_keyFile_4_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1285:1: (lv_keyFile_4_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1285:1: (lv_keyFile_4_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1286:3: lv_keyFile_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getKeyAccess().getKeyFileEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleKey2666);
            lv_keyFile_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeyRule());
            	        }
                   		set(
                   			current, 
                   			"keyFile",
                    		lv_keyFile_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleCredential"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1310:1: entryRuleCredential returns [EObject current=null] : iv_ruleCredential= ruleCredential EOF ;
    public final EObject entryRuleCredential() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCredential = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1311:2: (iv_ruleCredential= ruleCredential EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1312:2: iv_ruleCredential= ruleCredential EOF
            {
             newCompositeNode(grammarAccess.getCredentialRule()); 
            pushFollow(FOLLOW_ruleCredential_in_entryRuleCredential2702);
            iv_ruleCredential=ruleCredential();

            state._fsp--;

             current =iv_ruleCredential; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCredential2712); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCredential"


    // $ANTLR start "ruleCredential"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1319:1: ruleCredential returns [EObject current=null] : (otherlv_0= 'auth' ( (lv_type_1_0= 'credential' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_credentialFile_4_0= ruleEString ) ) ) ;
    public final EObject ruleCredential() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_credentialFile_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1322:28: ( (otherlv_0= 'auth' ( (lv_type_1_0= 'credential' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_credentialFile_4_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1323:1: (otherlv_0= 'auth' ( (lv_type_1_0= 'credential' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_credentialFile_4_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1323:1: (otherlv_0= 'auth' ( (lv_type_1_0= 'credential' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_credentialFile_4_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1323:3: otherlv_0= 'auth' ( (lv_type_1_0= 'credential' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_credentialFile_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleCredential2749); 

                	newLeafNode(otherlv_0, grammarAccess.getCredentialAccess().getAuthKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1327:1: ( (lv_type_1_0= 'credential' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1328:1: (lv_type_1_0= 'credential' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1328:1: (lv_type_1_0= 'credential' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1329:3: lv_type_1_0= 'credential'
            {
            lv_type_1_0=(Token)match(input,29,FOLLOW_29_in_ruleCredential2767); 

                    newLeafNode(lv_type_1_0, grammarAccess.getCredentialAccess().getTypeCredentialKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCredentialRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "credential");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1342:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1343:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1343:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1344:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCredentialAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleCredential2801);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCredentialRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCredential2813); 

                	newLeafNode(otherlv_3, grammarAccess.getCredentialAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1364:1: ( (lv_credentialFile_4_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1365:1: (lv_credentialFile_4_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1365:1: (lv_credentialFile_4_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1366:3: lv_credentialFile_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCredentialAccess().getCredentialFileEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleCredential2834);
            lv_credentialFile_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCredentialRule());
            	        }
                   		set(
                   			current, 
                   			"credentialFile",
                    		lv_credentialFile_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCredential"


    // $ANTLR start "entryRuleResource"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1390:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1391:2: (iv_ruleResource= ruleResource EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1392:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource2870);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource2880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1399:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resources' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (lv_cpu_3_0= ruleCPU ) ) otherlv_4= ',' ( (lv_memory_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_disk_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_relax_9_0= RULE_INT ) ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_memory_5_0=null;
        Token otherlv_6=null;
        Token lv_disk_7_0=null;
        Token otherlv_8=null;
        Token lv_relax_9_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_cpu_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1402:28: ( (otherlv_0= 'resources' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (lv_cpu_3_0= ruleCPU ) ) otherlv_4= ',' ( (lv_memory_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_disk_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_relax_9_0= RULE_INT ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1403:1: (otherlv_0= 'resources' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (lv_cpu_3_0= ruleCPU ) ) otherlv_4= ',' ( (lv_memory_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_disk_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_relax_9_0= RULE_INT ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1403:1: (otherlv_0= 'resources' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (lv_cpu_3_0= ruleCPU ) ) otherlv_4= ',' ( (lv_memory_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_disk_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_relax_9_0= RULE_INT ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1403:3: otherlv_0= 'resources' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (lv_cpu_3_0= ruleCPU ) ) otherlv_4= ',' ( (lv_memory_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_disk_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_relax_9_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleResource2917); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourcesKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1407:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1408:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1408:1: (lv_name_1_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1409:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleResource2938);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleResource2950); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getColonEqualsSignKeyword_2());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1429:1: ( (lv_cpu_3_0= ruleCPU ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1430:1: (lv_cpu_3_0= ruleCPU )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1430:1: (lv_cpu_3_0= ruleCPU )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1431:3: lv_cpu_3_0= ruleCPU
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getCpuCPUParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCPU_in_ruleResource2971);
            lv_cpu_3_0=ruleCPU();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"cpu",
                    		lv_cpu_3_0, 
                    		"CPU");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleResource2983); 

                	newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getCommaKeyword_4());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1451:1: ( (lv_memory_5_0= RULE_INT ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1452:1: (lv_memory_5_0= RULE_INT )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1452:1: (lv_memory_5_0= RULE_INT )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1453:3: lv_memory_5_0= RULE_INT
            {
            lv_memory_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResource3000); 

            			newLeafNode(lv_memory_5_0, grammarAccess.getResourceAccess().getMemoryINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"memory",
                    		lv_memory_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleResource3017); 

                	newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getCommaKeyword_6());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1473:1: ( (lv_disk_7_0= RULE_INT ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1474:1: (lv_disk_7_0= RULE_INT )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1474:1: (lv_disk_7_0= RULE_INT )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1475:3: lv_disk_7_0= RULE_INT
            {
            lv_disk_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResource3034); 

            			newLeafNode(lv_disk_7_0, grammarAccess.getResourceAccess().getDiskINTTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"disk",
                    		lv_disk_7_0, 
                    		"INT");
            	    

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleResource3051); 

                	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getCommaKeyword_8());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1495:1: ( (lv_relax_9_0= RULE_INT ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1496:1: (lv_relax_9_0= RULE_INT )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1496:1: (lv_relax_9_0= RULE_INT )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1497:3: lv_relax_9_0= RULE_INT
            {
            lv_relax_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResource3068); 

            			newLeafNode(lv_relax_9_0, grammarAccess.getResourceAccess().getRelaxINTTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"relax",
                    		lv_relax_9_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleDependency"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1521:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1522:2: (iv_ruleDependency= ruleDependency EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1523:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency3109);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency3119); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1530:1: ruleDependency returns [EObject current=null] : (this_Install_0= ruleInstall | this_Service_1= ruleService | this_File_2= ruleFile ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_Install_0 = null;

        EObject this_Service_1 = null;

        EObject this_File_2 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1533:28: ( (this_Install_0= ruleInstall | this_Service_1= ruleService | this_File_2= ruleFile ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1534:1: (this_Install_0= ruleInstall | this_Service_1= ruleService | this_File_2= ruleFile )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1534:1: (this_Install_0= ruleInstall | this_Service_1= ruleService | this_File_2= ruleFile )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt17=2;
                    }
                    break;
                case 33:
                    {
                    alt17=3;
                    }
                    break;
                case 31:
                    {
                    alt17=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1535:5: this_Install_0= ruleInstall
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getInstallParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInstall_in_ruleDependency3166);
                    this_Install_0=ruleInstall();

                    state._fsp--;

                     
                            current = this_Install_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1545:5: this_Service_1= ruleService
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getServiceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleService_in_ruleDependency3193);
                    this_Service_1=ruleService();

                    state._fsp--;

                     
                            current = this_Service_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1555:5: this_File_2= ruleFile
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getFileParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFile_in_ruleDependency3220);
                    this_File_2=ruleFile();

                    state._fsp--;

                     
                            current = this_File_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleInstall"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1571:1: entryRuleInstall returns [EObject current=null] : iv_ruleInstall= ruleInstall EOF ;
    public final EObject entryRuleInstall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstall = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1572:2: (iv_ruleInstall= ruleInstall EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1573:2: iv_ruleInstall= ruleInstall EOF
            {
             newCompositeNode(grammarAccess.getInstallRule()); 
            pushFollow(FOLLOW_ruleInstall_in_entryRuleInstall3255);
            iv_ruleInstall=ruleInstall();

            state._fsp--;

             current =iv_ruleInstall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstall3265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstall"


    // $ANTLR start "ruleInstall"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1580:1: ruleInstall returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_type_1_0= 'install' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_depName_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_depVersion_6_0= ruleEFloat ) ) ) ;
    public final EObject ruleInstall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_depName_4_0 = null;

        AntlrDatatypeRuleToken lv_depVersion_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1583:28: ( (otherlv_0= 'dependency' ( (lv_type_1_0= 'install' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_depName_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_depVersion_6_0= ruleEFloat ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1584:1: (otherlv_0= 'dependency' ( (lv_type_1_0= 'install' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_depName_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_depVersion_6_0= ruleEFloat ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1584:1: (otherlv_0= 'dependency' ( (lv_type_1_0= 'install' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_depName_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_depVersion_6_0= ruleEFloat ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1584:3: otherlv_0= 'dependency' ( (lv_type_1_0= 'install' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_depName_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_depVersion_6_0= ruleEFloat ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleInstall3302); 

                	newLeafNode(otherlv_0, grammarAccess.getInstallAccess().getDependencyKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1588:1: ( (lv_type_1_0= 'install' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1589:1: (lv_type_1_0= 'install' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1589:1: (lv_type_1_0= 'install' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1590:3: lv_type_1_0= 'install'
            {
            lv_type_1_0=(Token)match(input,31,FOLLOW_31_in_ruleInstall3320); 

                    newLeafNode(lv_type_1_0, grammarAccess.getInstallAccess().getTypeInstallKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstallRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "install");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1603:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1604:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1604:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1605:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInstallAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleInstall3354);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstallRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInstall3366); 

                	newLeafNode(otherlv_3, grammarAccess.getInstallAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1625:1: ( (lv_depName_4_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1626:1: (lv_depName_4_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1626:1: (lv_depName_4_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1627:3: lv_depName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInstallAccess().getDepNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleInstall3387);
            lv_depName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstallRule());
            	        }
                   		set(
                   			current, 
                   			"depName",
                    		lv_depName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleInstall3399); 

                	newLeafNode(otherlv_5, grammarAccess.getInstallAccess().getCommaKeyword_5());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1647:1: ( (lv_depVersion_6_0= ruleEFloat ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1648:1: (lv_depVersion_6_0= ruleEFloat )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1648:1: (lv_depVersion_6_0= ruleEFloat )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1649:3: lv_depVersion_6_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getInstallAccess().getDepVersionEFloatParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloat_in_ruleInstall3420);
            lv_depVersion_6_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstallRule());
            	        }
                   		set(
                   			current, 
                   			"depVersion",
                    		lv_depVersion_6_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstall"


    // $ANTLR start "entryRuleService"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1673:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1674:2: (iv_ruleService= ruleService EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1675:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService3456);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService3466); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1682:1: ruleService returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_type_1_0= 'service' ) ) ( (lv_srvAction_2_0= ruleSrvSignal ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':=' ( (lv_serviceName_5_0= ruleEString ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_4=null;
        Enumerator lv_srvAction_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_serviceName_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1685:28: ( (otherlv_0= 'dependency' ( (lv_type_1_0= 'service' ) ) ( (lv_srvAction_2_0= ruleSrvSignal ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':=' ( (lv_serviceName_5_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1686:1: (otherlv_0= 'dependency' ( (lv_type_1_0= 'service' ) ) ( (lv_srvAction_2_0= ruleSrvSignal ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':=' ( (lv_serviceName_5_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1686:1: (otherlv_0= 'dependency' ( (lv_type_1_0= 'service' ) ) ( (lv_srvAction_2_0= ruleSrvSignal ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':=' ( (lv_serviceName_5_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1686:3: otherlv_0= 'dependency' ( (lv_type_1_0= 'service' ) ) ( (lv_srvAction_2_0= ruleSrvSignal ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':=' ( (lv_serviceName_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleService3503); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getDependencyKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1690:1: ( (lv_type_1_0= 'service' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1691:1: (lv_type_1_0= 'service' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1691:1: (lv_type_1_0= 'service' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1692:3: lv_type_1_0= 'service'
            {
            lv_type_1_0=(Token)match(input,32,FOLLOW_32_in_ruleService3521); 

                    newLeafNode(lv_type_1_0, grammarAccess.getServiceAccess().getTypeServiceKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "service");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1705:2: ( (lv_srvAction_2_0= ruleSrvSignal ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1706:1: (lv_srvAction_2_0= ruleSrvSignal )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1706:1: (lv_srvAction_2_0= ruleSrvSignal )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1707:3: lv_srvAction_2_0= ruleSrvSignal
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getSrvActionSrvSignalEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSrvSignal_in_ruleService3555);
            lv_srvAction_2_0=ruleSrvSignal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"srvAction",
                    		lv_srvAction_2_0, 
                    		"SrvSignal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1723:2: ( (lv_name_3_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1724:1: (lv_name_3_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1724:1: (lv_name_3_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1725:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleService3576);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleService3588); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getColonEqualsSignKeyword_4());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1745:1: ( (lv_serviceName_5_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1746:1: (lv_serviceName_5_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1746:1: (lv_serviceName_5_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1747:3: lv_serviceName_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getServiceNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleService3609);
            lv_serviceName_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"serviceName",
                    		lv_serviceName_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleFile"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1771:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1772:2: (iv_ruleFile= ruleFile EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1773:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile3645);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile3655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1780:1: ruleFile returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_type_1_0= 'file' ) ) ( (lv_fileType_2_0= ruleFileType ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':=' ( (lv_location_5_0= ruleEString ) ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_4=null;
        Enumerator lv_fileType_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_location_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1783:28: ( (otherlv_0= 'dependency' ( (lv_type_1_0= 'file' ) ) ( (lv_fileType_2_0= ruleFileType ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':=' ( (lv_location_5_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1784:1: (otherlv_0= 'dependency' ( (lv_type_1_0= 'file' ) ) ( (lv_fileType_2_0= ruleFileType ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':=' ( (lv_location_5_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1784:1: (otherlv_0= 'dependency' ( (lv_type_1_0= 'file' ) ) ( (lv_fileType_2_0= ruleFileType ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':=' ( (lv_location_5_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1784:3: otherlv_0= 'dependency' ( (lv_type_1_0= 'file' ) ) ( (lv_fileType_2_0= ruleFileType ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':=' ( (lv_location_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleFile3692); 

                	newLeafNode(otherlv_0, grammarAccess.getFileAccess().getDependencyKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1788:1: ( (lv_type_1_0= 'file' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1789:1: (lv_type_1_0= 'file' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1789:1: (lv_type_1_0= 'file' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1790:3: lv_type_1_0= 'file'
            {
            lv_type_1_0=(Token)match(input,33,FOLLOW_33_in_ruleFile3710); 

                    newLeafNode(lv_type_1_0, grammarAccess.getFileAccess().getTypeFileKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFileRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "file");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1803:2: ( (lv_fileType_2_0= ruleFileType ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1804:1: (lv_fileType_2_0= ruleFileType )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1804:1: (lv_fileType_2_0= ruleFileType )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1805:3: lv_fileType_2_0= ruleFileType
            {
             
            	        newCompositeNode(grammarAccess.getFileAccess().getFileTypeFileTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFileType_in_ruleFile3744);
            lv_fileType_2_0=ruleFileType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFileRule());
            	        }
                   		set(
                   			current, 
                   			"fileType",
                    		lv_fileType_2_0, 
                    		"FileType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1821:2: ( (lv_name_3_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1822:1: (lv_name_3_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1822:1: (lv_name_3_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1823:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFileAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleFile3765);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleFile3777); 

                	newLeafNode(otherlv_4, grammarAccess.getFileAccess().getColonEqualsSignKeyword_4());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1843:1: ( (lv_location_5_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1844:1: (lv_location_5_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1844:1: (lv_location_5_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1845:3: lv_location_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFileAccess().getLocationEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleFile3798);
            lv_location_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFileRule());
            	        }
                   		set(
                   			current, 
                   			"location",
                    		lv_location_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleArtifact"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1869:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1870:2: (iv_ruleArtifact= ruleArtifact EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1871:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_ruleArtifact_in_entryRuleArtifact3834);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifact3844); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1878:1: ruleArtifact returns [EObject current=null] : (this_Code_0= ruleCode | this_CodeExternal_1= ruleCodeExternal | this_Script_2= ruleScript | this_ScriptCommand_3= ruleScriptCommand | this_ScriptBlock_4= ruleScriptBlock ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        EObject this_Code_0 = null;

        EObject this_CodeExternal_1 = null;

        EObject this_Script_2 = null;

        EObject this_ScriptCommand_3 = null;

        EObject this_ScriptBlock_4 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1881:28: ( (this_Code_0= ruleCode | this_CodeExternal_1= ruleCodeExternal | this_Script_2= ruleScript | this_ScriptCommand_3= ruleScriptCommand | this_ScriptBlock_4= ruleScriptBlock ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1882:1: (this_Code_0= ruleCode | this_CodeExternal_1= ruleCodeExternal | this_Script_2= ruleScript | this_ScriptCommand_3= ruleScriptCommand | this_ScriptBlock_4= ruleScriptBlock )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1882:1: (this_Code_0= ruleCode | this_CodeExternal_1= ruleCodeExternal | this_Script_2= ruleScript | this_ScriptCommand_3= ruleScriptCommand | this_ScriptBlock_4= ruleScriptBlock )
            int alt18=5;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt18=1;
                    }
                    break;
                case 38:
                    {
                    alt18=2;
                    }
                    break;
                case 41:
                    {
                    alt18=5;
                    }
                    break;
                case 40:
                    {
                    alt18=4;
                    }
                    break;
                case 39:
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1883:5: this_Code_0= ruleCode
                    {
                     
                            newCompositeNode(grammarAccess.getArtifactAccess().getCodeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCode_in_ruleArtifact3891);
                    this_Code_0=ruleCode();

                    state._fsp--;

                     
                            current = this_Code_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1893:5: this_CodeExternal_1= ruleCodeExternal
                    {
                     
                            newCompositeNode(grammarAccess.getArtifactAccess().getCodeExternalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCodeExternal_in_ruleArtifact3918);
                    this_CodeExternal_1=ruleCodeExternal();

                    state._fsp--;

                     
                            current = this_CodeExternal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1903:5: this_Script_2= ruleScript
                    {
                     
                            newCompositeNode(grammarAccess.getArtifactAccess().getScriptParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleScript_in_ruleArtifact3945);
                    this_Script_2=ruleScript();

                    state._fsp--;

                     
                            current = this_Script_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1913:5: this_ScriptCommand_3= ruleScriptCommand
                    {
                     
                            newCompositeNode(grammarAccess.getArtifactAccess().getScriptCommandParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleScriptCommand_in_ruleArtifact3972);
                    this_ScriptCommand_3=ruleScriptCommand();

                    state._fsp--;

                     
                            current = this_ScriptCommand_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1923:5: this_ScriptBlock_4= ruleScriptBlock
                    {
                     
                            newCompositeNode(grammarAccess.getArtifactAccess().getScriptBlockParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleScriptBlock_in_ruleArtifact3999);
                    this_ScriptBlock_4=ruleScriptBlock();

                    state._fsp--;

                     
                            current = this_ScriptBlock_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleConfArtifact"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1939:1: entryRuleConfArtifact returns [EObject current=null] : iv_ruleConfArtifact= ruleConfArtifact EOF ;
    public final EObject entryRuleConfArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfArtifact = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1940:2: (iv_ruleConfArtifact= ruleConfArtifact EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1941:2: iv_ruleConfArtifact= ruleConfArtifact EOF
            {
             newCompositeNode(grammarAccess.getConfArtifactRule()); 
            pushFollow(FOLLOW_ruleConfArtifact_in_entryRuleConfArtifact4034);
            iv_ruleConfArtifact=ruleConfArtifact();

            state._fsp--;

             current =iv_ruleConfArtifact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfArtifact4044); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfArtifact"


    // $ANTLR start "ruleConfArtifact"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1948:1: ruleConfArtifact returns [EObject current=null] : (this_Config_0= ruleConfig | this_ConfigBlock_1= ruleConfigBlock ) ;
    public final EObject ruleConfArtifact() throws RecognitionException {
        EObject current = null;

        EObject this_Config_0 = null;

        EObject this_ConfigBlock_1 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1951:28: ( (this_Config_0= ruleConfig | this_ConfigBlock_1= ruleConfigBlock ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1952:1: (this_Config_0= ruleConfig | this_ConfigBlock_1= ruleConfigBlock )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1952:1: (this_Config_0= ruleConfig | this_ConfigBlock_1= ruleConfigBlock )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==35) ) {
                    alt19=1;
                }
                else if ( (LA19_1==36) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1953:5: this_Config_0= ruleConfig
                    {
                     
                            newCompositeNode(grammarAccess.getConfArtifactAccess().getConfigParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConfig_in_ruleConfArtifact4091);
                    this_Config_0=ruleConfig();

                    state._fsp--;

                     
                            current = this_Config_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1963:5: this_ConfigBlock_1= ruleConfigBlock
                    {
                     
                            newCompositeNode(grammarAccess.getConfArtifactAccess().getConfigBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConfigBlock_in_ruleConfArtifact4118);
                    this_ConfigBlock_1=ruleConfigBlock();

                    state._fsp--;

                     
                            current = this_ConfigBlock_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfArtifact"


    // $ANTLR start "entryRuleConfig"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1979:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1980:2: (iv_ruleConfig= ruleConfig EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1981:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig4153);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig4163); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1988:1: ruleConfig returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_type_1_0= 'config' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_localFile_4_0= ruleEString ) ) ( (lv_destFile_5_0= ruleEString ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_localFile_4_0 = null;

        AntlrDatatypeRuleToken lv_destFile_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1991:28: ( (otherlv_0= 'artifact' ( (lv_type_1_0= 'config' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_localFile_4_0= ruleEString ) ) ( (lv_destFile_5_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1992:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'config' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_localFile_4_0= ruleEString ) ) ( (lv_destFile_5_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1992:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'config' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_localFile_4_0= ruleEString ) ) ( (lv_destFile_5_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1992:3: otherlv_0= 'artifact' ( (lv_type_1_0= 'config' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_localFile_4_0= ruleEString ) ) ( (lv_destFile_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleConfig4200); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getArtifactKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1996:1: ( (lv_type_1_0= 'config' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1997:1: (lv_type_1_0= 'config' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1997:1: (lv_type_1_0= 'config' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:1998:3: lv_type_1_0= 'config'
            {
            lv_type_1_0=(Token)match(input,35,FOLLOW_35_in_ruleConfig4218); 

                    newLeafNode(lv_type_1_0, grammarAccess.getConfigAccess().getTypeConfigKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "config");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2011:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2012:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2012:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2013:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConfigAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleConfig4252);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleConfig4264); 

                	newLeafNode(otherlv_3, grammarAccess.getConfigAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2033:1: ( (lv_localFile_4_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2034:1: (lv_localFile_4_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2034:1: (lv_localFile_4_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2035:3: lv_localFile_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConfigAccess().getLocalFileEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleConfig4285);
            lv_localFile_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigRule());
            	        }
                   		set(
                   			current, 
                   			"localFile",
                    		lv_localFile_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2051:2: ( (lv_destFile_5_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2052:1: (lv_destFile_5_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2052:1: (lv_destFile_5_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2053:3: lv_destFile_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConfigAccess().getDestFileEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleConfig4306);
            lv_destFile_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigRule());
            	        }
                   		set(
                   			current, 
                   			"destFile",
                    		lv_destFile_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleConfigBlock"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2077:1: entryRuleConfigBlock returns [EObject current=null] : iv_ruleConfigBlock= ruleConfigBlock EOF ;
    public final EObject entryRuleConfigBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigBlock = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2078:2: (iv_ruleConfigBlock= ruleConfigBlock EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2079:2: iv_ruleConfigBlock= ruleConfigBlock EOF
            {
             newCompositeNode(grammarAccess.getConfigBlockRule()); 
            pushFollow(FOLLOW_ruleConfigBlock_in_entryRuleConfigBlock4342);
            iv_ruleConfigBlock=ruleConfigBlock();

            state._fsp--;

             current =iv_ruleConfigBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigBlock4352); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigBlock"


    // $ANTLR start "ruleConfigBlock"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2086:1: ruleConfigBlock returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_type_1_0= 'config-block' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_destFile_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_config_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleConfigBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_destFile_4_0 = null;

        AntlrDatatypeRuleToken lv_config_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2089:28: ( (otherlv_0= 'artifact' ( (lv_type_1_0= 'config-block' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_destFile_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_config_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2090:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'config-block' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_destFile_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_config_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2090:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'config-block' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_destFile_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_config_6_0= ruleEString ) ) otherlv_7= '}' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2090:3: otherlv_0= 'artifact' ( (lv_type_1_0= 'config-block' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_destFile_4_0= ruleEString ) ) otherlv_5= '{' ( (lv_config_6_0= ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleConfigBlock4389); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigBlockAccess().getArtifactKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2094:1: ( (lv_type_1_0= 'config-block' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2095:1: (lv_type_1_0= 'config-block' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2095:1: (lv_type_1_0= 'config-block' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2096:3: lv_type_1_0= 'config-block'
            {
            lv_type_1_0=(Token)match(input,36,FOLLOW_36_in_ruleConfigBlock4407); 

                    newLeafNode(lv_type_1_0, grammarAccess.getConfigBlockAccess().getTypeConfigBlockKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigBlockRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "config-block");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2109:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2110:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2110:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2111:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConfigBlockAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleConfigBlock4441);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigBlockRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleConfigBlock4453); 

                	newLeafNode(otherlv_3, grammarAccess.getConfigBlockAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2131:1: ( (lv_destFile_4_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2132:1: (lv_destFile_4_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2132:1: (lv_destFile_4_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2133:3: lv_destFile_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConfigBlockAccess().getDestFileEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleConfigBlock4474);
            lv_destFile_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigBlockRule());
            	        }
                   		set(
                   			current, 
                   			"destFile",
                    		lv_destFile_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleConfigBlock4486); 

                	newLeafNode(otherlv_5, grammarAccess.getConfigBlockAccess().getLeftCurlyBracketKeyword_5());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2153:1: ( (lv_config_6_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2154:1: (lv_config_6_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2154:1: (lv_config_6_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2155:3: lv_config_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConfigBlockAccess().getConfigEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleConfigBlock4507);
            lv_config_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigBlockRule());
            	        }
                   		set(
                   			current, 
                   			"config",
                    		lv_config_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleConfigBlock4519); 

                	newLeafNode(otherlv_7, grammarAccess.getConfigBlockAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigBlock"


    // $ANTLR start "entryRuleCode"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2183:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2184:2: (iv_ruleCode= ruleCode EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2185:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode4555);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode4565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2192:1: ruleCode returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_type_1_0= 'code' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' otherlv_4= '{' ( (lv_code_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_code_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2195:28: ( (otherlv_0= 'artifact' ( (lv_type_1_0= 'code' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' otherlv_4= '{' ( (lv_code_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2196:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'code' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' otherlv_4= '{' ( (lv_code_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2196:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'code' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' otherlv_4= '{' ( (lv_code_5_0= ruleEString ) ) otherlv_6= '}' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2196:3: otherlv_0= 'artifact' ( (lv_type_1_0= 'code' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' otherlv_4= '{' ( (lv_code_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleCode4602); 

                	newLeafNode(otherlv_0, grammarAccess.getCodeAccess().getArtifactKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2200:1: ( (lv_type_1_0= 'code' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2201:1: (lv_type_1_0= 'code' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2201:1: (lv_type_1_0= 'code' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2202:3: lv_type_1_0= 'code'
            {
            lv_type_1_0=(Token)match(input,37,FOLLOW_37_in_ruleCode4620); 

                    newLeafNode(lv_type_1_0, grammarAccess.getCodeAccess().getTypeCodeKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCodeRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "code");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2215:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2216:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2216:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2217:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCodeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleCode4654);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCode4666); 

                	newLeafNode(otherlv_3, grammarAccess.getCodeAccess().getColonEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleCode4678); 

                	newLeafNode(otherlv_4, grammarAccess.getCodeAccess().getLeftCurlyBracketKeyword_4());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2241:1: ( (lv_code_5_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2242:1: (lv_code_5_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2242:1: (lv_code_5_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2243:3: lv_code_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCodeAccess().getCodeEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleCode4699);
            lv_code_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	        }
                   		set(
                   			current, 
                   			"code",
                    		lv_code_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleCode4711); 

                	newLeafNode(otherlv_6, grammarAccess.getCodeAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleCodeExternal"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2271:1: entryRuleCodeExternal returns [EObject current=null] : iv_ruleCodeExternal= ruleCodeExternal EOF ;
    public final EObject entryRuleCodeExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeExternal = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2272:2: (iv_ruleCodeExternal= ruleCodeExternal EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2273:2: iv_ruleCodeExternal= ruleCodeExternal EOF
            {
             newCompositeNode(grammarAccess.getCodeExternalRule()); 
            pushFollow(FOLLOW_ruleCodeExternal_in_entryRuleCodeExternal4747);
            iv_ruleCodeExternal=ruleCodeExternal();

            state._fsp--;

             current =iv_ruleCodeExternal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeExternal4757); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeExternal"


    // $ANTLR start "ruleCodeExternal"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2280:1: ruleCodeExternal returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_type_1_0= 'code-external' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_class_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_method_6_0= ruleEString ) ) ) ;
    public final EObject ruleCodeExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_class_4_0 = null;

        AntlrDatatypeRuleToken lv_method_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2283:28: ( (otherlv_0= 'artifact' ( (lv_type_1_0= 'code-external' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_class_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_method_6_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2284:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'code-external' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_class_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_method_6_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2284:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'code-external' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_class_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_method_6_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2284:3: otherlv_0= 'artifact' ( (lv_type_1_0= 'code-external' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_class_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_method_6_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleCodeExternal4794); 

                	newLeafNode(otherlv_0, grammarAccess.getCodeExternalAccess().getArtifactKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2288:1: ( (lv_type_1_0= 'code-external' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2289:1: (lv_type_1_0= 'code-external' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2289:1: (lv_type_1_0= 'code-external' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2290:3: lv_type_1_0= 'code-external'
            {
            lv_type_1_0=(Token)match(input,38,FOLLOW_38_in_ruleCodeExternal4812); 

                    newLeafNode(lv_type_1_0, grammarAccess.getCodeExternalAccess().getTypeCodeExternalKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCodeExternalRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "code-external");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2303:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2304:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2304:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2305:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCodeExternalAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleCodeExternal4846);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodeExternalRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCodeExternal4858); 

                	newLeafNode(otherlv_3, grammarAccess.getCodeExternalAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2325:1: ( (lv_class_4_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2326:1: (lv_class_4_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2326:1: (lv_class_4_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2327:3: lv_class_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCodeExternalAccess().getClassEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleCodeExternal4879);
            lv_class_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodeExternalRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleCodeExternal4891); 

                	newLeafNode(otherlv_5, grammarAccess.getCodeExternalAccess().getCommaKeyword_5());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2347:1: ( (lv_method_6_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2348:1: (lv_method_6_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2348:1: (lv_method_6_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2349:3: lv_method_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCodeExternalAccess().getMethodEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleCodeExternal4912);
            lv_method_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodeExternalRule());
            	        }
                   		set(
                   			current, 
                   			"method",
                    		lv_method_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeExternal"


    // $ANTLR start "entryRuleScript"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2373:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2374:2: (iv_ruleScript= ruleScript EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2375:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript4948);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript4958); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2382:1: ruleScript returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_type_1_0= 'script' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_scriptFile_4_0= ruleEString ) ) ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_scriptFile_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2385:28: ( (otherlv_0= 'artifact' ( (lv_type_1_0= 'script' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_scriptFile_4_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2386:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'script' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_scriptFile_4_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2386:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'script' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_scriptFile_4_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2386:3: otherlv_0= 'artifact' ( (lv_type_1_0= 'script' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_scriptFile_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleScript4995); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getArtifactKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2390:1: ( (lv_type_1_0= 'script' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2391:1: (lv_type_1_0= 'script' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2391:1: (lv_type_1_0= 'script' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2392:3: lv_type_1_0= 'script'
            {
            lv_type_1_0=(Token)match(input,39,FOLLOW_39_in_ruleScript5013); 

                    newLeafNode(lv_type_1_0, grammarAccess.getScriptAccess().getTypeScriptKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "script");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2405:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2406:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2406:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2407:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getScriptAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleScript5047);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleScript5059); 

                	newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2427:1: ( (lv_scriptFile_4_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2428:1: (lv_scriptFile_4_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2428:1: (lv_scriptFile_4_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2429:3: lv_scriptFile_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getScriptAccess().getScriptFileEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleScript5080);
            lv_scriptFile_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	        }
                   		set(
                   			current, 
                   			"scriptFile",
                    		lv_scriptFile_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleScriptCommand"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2453:1: entryRuleScriptCommand returns [EObject current=null] : iv_ruleScriptCommand= ruleScriptCommand EOF ;
    public final EObject entryRuleScriptCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptCommand = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2454:2: (iv_ruleScriptCommand= ruleScriptCommand EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2455:2: iv_ruleScriptCommand= ruleScriptCommand EOF
            {
             newCompositeNode(grammarAccess.getScriptCommandRule()); 
            pushFollow(FOLLOW_ruleScriptCommand_in_entryRuleScriptCommand5116);
            iv_ruleScriptCommand=ruleScriptCommand();

            state._fsp--;

             current =iv_ruleScriptCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptCommand5126); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScriptCommand"


    // $ANTLR start "ruleScriptCommand"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2462:1: ruleScriptCommand returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_type_1_0= 'script-command' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_scriptCommand_4_0= ruleEString ) ) ) ;
    public final EObject ruleScriptCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_scriptCommand_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2465:28: ( (otherlv_0= 'artifact' ( (lv_type_1_0= 'script-command' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_scriptCommand_4_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2466:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'script-command' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_scriptCommand_4_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2466:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'script-command' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_scriptCommand_4_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2466:3: otherlv_0= 'artifact' ( (lv_type_1_0= 'script-command' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_scriptCommand_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleScriptCommand5163); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptCommandAccess().getArtifactKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2470:1: ( (lv_type_1_0= 'script-command' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2471:1: (lv_type_1_0= 'script-command' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2471:1: (lv_type_1_0= 'script-command' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2472:3: lv_type_1_0= 'script-command'
            {
            lv_type_1_0=(Token)match(input,40,FOLLOW_40_in_ruleScriptCommand5181); 

                    newLeafNode(lv_type_1_0, grammarAccess.getScriptCommandAccess().getTypeScriptCommandKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptCommandRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "script-command");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2485:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2486:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2486:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2487:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getScriptCommandAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleScriptCommand5215);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptCommandRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleScriptCommand5227); 

                	newLeafNode(otherlv_3, grammarAccess.getScriptCommandAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2507:1: ( (lv_scriptCommand_4_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2508:1: (lv_scriptCommand_4_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2508:1: (lv_scriptCommand_4_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2509:3: lv_scriptCommand_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getScriptCommandAccess().getScriptCommandEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleScriptCommand5248);
            lv_scriptCommand_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptCommandRule());
            	        }
                   		set(
                   			current, 
                   			"scriptCommand",
                    		lv_scriptCommand_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScriptCommand"


    // $ANTLR start "entryRuleScriptBlock"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2533:1: entryRuleScriptBlock returns [EObject current=null] : iv_ruleScriptBlock= ruleScriptBlock EOF ;
    public final EObject entryRuleScriptBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptBlock = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2534:2: (iv_ruleScriptBlock= ruleScriptBlock EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2535:2: iv_ruleScriptBlock= ruleScriptBlock EOF
            {
             newCompositeNode(grammarAccess.getScriptBlockRule()); 
            pushFollow(FOLLOW_ruleScriptBlock_in_entryRuleScriptBlock5284);
            iv_ruleScriptBlock=ruleScriptBlock();

            state._fsp--;

             current =iv_ruleScriptBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptBlock5294); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScriptBlock"


    // $ANTLR start "ruleScriptBlock"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2542:1: ruleScriptBlock returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_type_1_0= 'script-block' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' otherlv_4= '{' ( (lv_block_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleScriptBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_block_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2545:28: ( (otherlv_0= 'artifact' ( (lv_type_1_0= 'script-block' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' otherlv_4= '{' ( (lv_block_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2546:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'script-block' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' otherlv_4= '{' ( (lv_block_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2546:1: (otherlv_0= 'artifact' ( (lv_type_1_0= 'script-block' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' otherlv_4= '{' ( (lv_block_5_0= ruleEString ) ) otherlv_6= '}' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2546:3: otherlv_0= 'artifact' ( (lv_type_1_0= 'script-block' ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' otherlv_4= '{' ( (lv_block_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleScriptBlock5331); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptBlockAccess().getArtifactKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2550:1: ( (lv_type_1_0= 'script-block' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2551:1: (lv_type_1_0= 'script-block' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2551:1: (lv_type_1_0= 'script-block' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2552:3: lv_type_1_0= 'script-block'
            {
            lv_type_1_0=(Token)match(input,41,FOLLOW_41_in_ruleScriptBlock5349); 

                    newLeafNode(lv_type_1_0, grammarAccess.getScriptBlockAccess().getTypeScriptBlockKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptBlockRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "script-block");
            	    

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2565:2: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2566:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2566:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2567:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getScriptBlockAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleScriptBlock5383);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptBlockRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleScriptBlock5395); 

                	newLeafNode(otherlv_3, grammarAccess.getScriptBlockAccess().getColonEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleScriptBlock5407); 

                	newLeafNode(otherlv_4, grammarAccess.getScriptBlockAccess().getLeftCurlyBracketKeyword_4());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2591:1: ( (lv_block_5_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2592:1: (lv_block_5_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2592:1: (lv_block_5_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2593:3: lv_block_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getScriptBlockAccess().getBlockEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleScriptBlock5428);
            lv_block_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptBlockRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleScriptBlock5440); 

                	newLeafNode(otherlv_6, grammarAccess.getScriptBlockAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScriptBlock"


    // $ANTLR start "entryRuleNodeset"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2621:1: entryRuleNodeset returns [EObject current=null] : iv_ruleNodeset= ruleNodeset EOF ;
    public final EObject entryRuleNodeset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeset = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2622:2: (iv_ruleNodeset= ruleNodeset EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2623:2: iv_ruleNodeset= ruleNodeset EOF
            {
             newCompositeNode(grammarAccess.getNodesetRule()); 
            pushFollow(FOLLOW_ruleNodeset_in_entryRuleNodeset5476);
            iv_ruleNodeset=ruleNodeset();

            state._fsp--;

             current =iv_ruleNodeset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeset5486); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeset"


    // $ANTLR start "ruleNodeset"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2630:1: ruleNodeset returns [EObject current=null] : (otherlv_0= 'nodeset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (lv_range_3_0= ruleEString ) ) ) ;
    public final EObject ruleNodeset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_range_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2633:28: ( (otherlv_0= 'nodeset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (lv_range_3_0= ruleEString ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2634:1: (otherlv_0= 'nodeset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (lv_range_3_0= ruleEString ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2634:1: (otherlv_0= 'nodeset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (lv_range_3_0= ruleEString ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2634:3: otherlv_0= 'nodeset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (lv_range_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleNodeset5523); 

                	newLeafNode(otherlv_0, grammarAccess.getNodesetAccess().getNodesetKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2638:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2639:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2639:1: (lv_name_1_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2640:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getNodesetAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleNodeset5544);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodesetRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleNodeset5556); 

                	newLeafNode(otherlv_2, grammarAccess.getNodesetAccess().getColonEqualsSignKeyword_2());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2660:1: ( (lv_range_3_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2661:1: (lv_range_3_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2661:1: (lv_range_3_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2662:3: lv_range_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getNodesetAccess().getRangeEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleNodeset5577);
            lv_range_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodesetRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeset"


    // $ANTLR start "entryRuleSetup"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2686:1: entryRuleSetup returns [EObject current=null] : iv_ruleSetup= ruleSetup EOF ;
    public final EObject entryRuleSetup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetup = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2687:2: (iv_ruleSetup= ruleSetup EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2688:2: iv_ruleSetup= ruleSetup EOF
            {
             newCompositeNode(grammarAccess.getSetupRule()); 
            pushFollow(FOLLOW_ruleSetup_in_entryRuleSetup5613);
            iv_ruleSetup=ruleSetup();

            state._fsp--;

             current =iv_ruleSetup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetup5623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetup"


    // $ANTLR start "ruleSetup"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2695:1: ruleSetup returns [EObject current=null] : ( () otherlv_1= 'setup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_numberMachines_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_autoscale_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_predictive_10_0= ruleEBoolean ) ) ) ;
    public final EObject ruleSetup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_numberMachines_6_0 = null;

        AntlrDatatypeRuleToken lv_autoscale_8_0 = null;

        AntlrDatatypeRuleToken lv_predictive_10_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2698:28: ( ( () otherlv_1= 'setup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_numberMachines_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_autoscale_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_predictive_10_0= ruleEBoolean ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2699:1: ( () otherlv_1= 'setup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_numberMachines_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_autoscale_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_predictive_10_0= ruleEBoolean ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2699:1: ( () otherlv_1= 'setup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_numberMachines_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_autoscale_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_predictive_10_0= ruleEBoolean ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2699:2: () otherlv_1= 'setup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_numberMachines_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_autoscale_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_predictive_10_0= ruleEBoolean ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2699:2: ()
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2700:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSetupAccess().getSetupAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleSetup5669); 

                	newLeafNode(otherlv_1, grammarAccess.getSetupAccess().getSetupKeyword_1());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2709:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2710:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2710:1: (lv_name_2_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2711:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSetupAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleSetup5690);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetupRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSetup5702); 

                	newLeafNode(otherlv_3, grammarAccess.getSetupAccess().getColonEqualsSignKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2731:1: ( (otherlv_4= RULE_ID ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2732:1: (otherlv_4= RULE_ID )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2732:1: (otherlv_4= RULE_ID )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2733:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSetupRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetup5722); 

            		newLeafNode(otherlv_4, grammarAccess.getSetupAccess().getProviderProvidersCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleSetup5734); 

                	newLeafNode(otherlv_5, grammarAccess.getSetupAccess().getCommaKeyword_5());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2748:1: ( (lv_numberMachines_6_0= ruleEInt ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2749:1: (lv_numberMachines_6_0= ruleEInt )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2749:1: (lv_numberMachines_6_0= ruleEInt )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2750:3: lv_numberMachines_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSetupAccess().getNumberMachinesEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEInt_in_ruleSetup5755);
            lv_numberMachines_6_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetupRule());
            	        }
                   		set(
                   			current, 
                   			"numberMachines",
                    		lv_numberMachines_6_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleSetup5767); 

                	newLeafNode(otherlv_7, grammarAccess.getSetupAccess().getCommaKeyword_7());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2770:1: ( (lv_autoscale_8_0= ruleEBoolean ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2771:1: (lv_autoscale_8_0= ruleEBoolean )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2771:1: (lv_autoscale_8_0= ruleEBoolean )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2772:3: lv_autoscale_8_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getSetupAccess().getAutoscaleEBooleanParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleEBoolean_in_ruleSetup5788);
            lv_autoscale_8_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetupRule());
            	        }
                   		set(
                   			current, 
                   			"autoscale",
                    		lv_autoscale_8_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleSetup5800); 

                	newLeafNode(otherlv_9, grammarAccess.getSetupAccess().getCommaKeyword_9());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2792:1: ( (lv_predictive_10_0= ruleEBoolean ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2793:1: (lv_predictive_10_0= ruleEBoolean )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2793:1: (lv_predictive_10_0= ruleEBoolean )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2794:3: lv_predictive_10_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getSetupAccess().getPredictiveEBooleanParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleEBoolean_in_ruleSetup5821);
            lv_predictive_10_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetupRule());
            	        }
                   		set(
                   			current, 
                   			"predictive",
                    		lv_predictive_10_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetup"


    // $ANTLR start "entryRuleDeploy"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2818:1: entryRuleDeploy returns [EObject current=null] : iv_ruleDeploy= ruleDeploy EOF ;
    public final EObject entryRuleDeploy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploy = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2819:2: (iv_ruleDeploy= ruleDeploy EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2820:2: iv_ruleDeploy= ruleDeploy EOF
            {
             newCompositeNode(grammarAccess.getDeployRule()); 
            pushFollow(FOLLOW_ruleDeploy_in_entryRuleDeploy5857);
            iv_ruleDeploy=ruleDeploy();

            state._fsp--;

             current =iv_ruleDeploy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploy5867); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeploy"


    // $ANTLR start "ruleDeploy"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2827:1: ruleDeploy returns [EObject current=null] : (otherlv_0= 'deploy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' otherlv_3= 'in' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'timeout' ( (lv_timeout_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_executions_8_0= ruleExecution ) )* otherlv_9= '}' ) ;
    public final EObject ruleDeploy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_timeout_6_0 = null;

        EObject lv_executions_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2830:28: ( (otherlv_0= 'deploy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' otherlv_3= 'in' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'timeout' ( (lv_timeout_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_executions_8_0= ruleExecution ) )* otherlv_9= '}' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2831:1: (otherlv_0= 'deploy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' otherlv_3= 'in' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'timeout' ( (lv_timeout_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_executions_8_0= ruleExecution ) )* otherlv_9= '}' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2831:1: (otherlv_0= 'deploy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' otherlv_3= 'in' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'timeout' ( (lv_timeout_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_executions_8_0= ruleExecution ) )* otherlv_9= '}' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2831:3: otherlv_0= 'deploy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' otherlv_3= 'in' ( (otherlv_4= RULE_ID ) )* otherlv_5= 'timeout' ( (lv_timeout_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_executions_8_0= ruleExecution ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleDeploy5904); 

                	newLeafNode(otherlv_0, grammarAccess.getDeployAccess().getDeployKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2835:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2836:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2836:1: (lv_name_1_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2837:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeployAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleDeploy5925);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeployRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDeploy5937); 

                	newLeafNode(otherlv_2, grammarAccess.getDeployAccess().getColonEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleDeploy5949); 

                	newLeafNode(otherlv_3, grammarAccess.getDeployAccess().getInKeyword_3());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2861:1: ( (otherlv_4= RULE_ID ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2862:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2862:1: (otherlv_4= RULE_ID )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2863:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeployRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeploy5969); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDeployAccess().getSetupsSetupCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleDeploy5982); 

                	newLeafNode(otherlv_5, grammarAccess.getDeployAccess().getTimeoutKeyword_5());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2878:1: ( (lv_timeout_6_0= ruleEInt ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2879:1: (lv_timeout_6_0= ruleEInt )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2879:1: (lv_timeout_6_0= ruleEInt )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2880:3: lv_timeout_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDeployAccess().getTimeoutEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEInt_in_ruleDeploy6003);
            lv_timeout_6_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeployRule());
            	        }
                   		set(
                   			current, 
                   			"timeout",
                    		lv_timeout_6_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleDeploy6015); 

                	newLeafNode(otherlv_7, grammarAccess.getDeployAccess().getLeftCurlyBracketKeyword_7());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2900:1: ( (lv_executions_8_0= ruleExecution ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==47) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2901:1: (lv_executions_8_0= ruleExecution )
            	    {
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2901:1: (lv_executions_8_0= ruleExecution )
            	    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2902:3: lv_executions_8_0= ruleExecution
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeployAccess().getExecutionsExecutionParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExecution_in_ruleDeploy6036);
            	    lv_executions_8_0=ruleExecution();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeployRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"executions",
            	            		lv_executions_8_0, 
            	            		"Execution");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleDeploy6049); 

                	newLeafNode(otherlv_9, grammarAccess.getDeployAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeploy"


    // $ANTLR start "entryRuleExecution"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2930:1: entryRuleExecution returns [EObject current=null] : iv_ruleExecution= ruleExecution EOF ;
    public final EObject entryRuleExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecution = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2931:2: (iv_ruleExecution= ruleExecution EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2932:2: iv_ruleExecution= ruleExecution EOF
            {
             newCompositeNode(grammarAccess.getExecutionRule()); 
            pushFollow(FOLLOW_ruleExecution_in_entryRuleExecution6085);
            iv_ruleExecution=ruleExecution();

            state._fsp--;

             current =iv_ruleExecution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecution6095); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExecution"


    // $ANTLR start "ruleExecution"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2939:1: ruleExecution returns [EObject current=null] : (otherlv_0= 'exec' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (lv_seq_9_0= ruleEInt ) ) ) ;
    public final EObject ruleExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_seq_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2942:28: ( (otherlv_0= 'exec' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (lv_seq_9_0= ruleEInt ) ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2943:1: (otherlv_0= 'exec' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (lv_seq_9_0= ruleEInt ) ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2943:1: (otherlv_0= 'exec' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (lv_seq_9_0= ruleEInt ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2943:3: otherlv_0= 'exec' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (lv_seq_9_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleExecution6132); 

                	newLeafNode(otherlv_0, grammarAccess.getExecutionAccess().getExecKeyword_0());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2947:1: ( (lv_name_1_0= ruleEString ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2948:1: (lv_name_1_0= ruleEString )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2948:1: (lv_name_1_0= ruleEString )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2949:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExecutionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleExecution6153);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExecutionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleExecution6165); 

                	newLeafNode(otherlv_2, grammarAccess.getExecutionAccess().getColonEqualsSignKeyword_2());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2969:1: ( (otherlv_3= RULE_ID ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2970:1: (otherlv_3= RULE_ID )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2970:1: (otherlv_3= RULE_ID )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2971:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExecutionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecution6185); 

            		newLeafNode(otherlv_3, grammarAccess.getExecutionAccess().getCodeArtifactCrossReference_3_0()); 
            	

            }


            }

            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2982:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_ID) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==21) ) {
                        int LA22_3 = input.LA(4);

                        if ( (LA22_3==RULE_ID) ) {
                            alt22=1;
                        }
                    }
                }
            }
            switch (alt22) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2982:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleExecution6198); 

                        	newLeafNode(otherlv_4, grammarAccess.getExecutionAccess().getCommaKeyword_4_0());
                        
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2986:1: ( (otherlv_5= RULE_ID ) )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2987:1: (otherlv_5= RULE_ID )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2987:1: (otherlv_5= RULE_ID )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:2988:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExecutionRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecution6218); 

                    		newLeafNode(otherlv_5, grammarAccess.getExecutionAccess().getConfigConfArtifactCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleExecution6232); 

                	newLeafNode(otherlv_6, grammarAccess.getExecutionAccess().getCommaKeyword_5());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3003:1: ( (otherlv_7= RULE_ID ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3004:1: (otherlv_7= RULE_ID )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3004:1: (otherlv_7= RULE_ID )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3005:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExecutionRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecution6252); 

            		newLeafNode(otherlv_7, grammarAccess.getExecutionAccess().getNodesNodesetCrossReference_6_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleExecution6264); 

                	newLeafNode(otherlv_8, grammarAccess.getExecutionAccess().getCommaKeyword_7());
                
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3020:1: ( (lv_seq_9_0= ruleEInt ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3021:1: (lv_seq_9_0= ruleEInt )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3021:1: (lv_seq_9_0= ruleEInt )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3022:3: lv_seq_9_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getExecutionAccess().getSeqEIntParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleEInt_in_ruleExecution6285);
            lv_seq_9_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExecutionRule());
            	        }
                   		set(
                   			current, 
                   			"seq",
                    		lv_seq_9_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecution"


    // $ANTLR start "entryRuleEString"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3046:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3047:2: (iv_ruleEString= ruleEString EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3048:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString6322);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString6333); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3055:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3058:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3059:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3059:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3059:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString6373); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3067:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString6399); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEFloat"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3082:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3083:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3084:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_ruleEFloat_in_entryRuleEFloat6445);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloat6456); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3091:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3094:28: ( ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3095:1: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3095:1: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==EOF||LA24_1==13||LA24_1==19||(LA24_1>=21 && LA24_1<=22)||LA24_1==30) ) {
                    alt24=2;
                }
                else if ( (LA24_1==18) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3095:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3095:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3095:7: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloat6497); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0_0()); 
                        
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleEFloat6515); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_0_1()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloat6530); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3116:10: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloat6557); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEInt"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3131:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3132:2: (iv_ruleEInt= ruleEInt EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3133:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt6603);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt6614); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3140:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3143:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3144:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3144:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3144:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3144:2: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==48) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3145:2: kw= '-'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleEInt6653); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt6670); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3165:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3166:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3167:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean6716);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean6727); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3174:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3177:28: ( (kw= 'true' | kw= 'false' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3178:1: (kw= 'true' | kw= 'false' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3178:1: (kw= 'true' | kw= 'false' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            else if ( (LA26_0==50) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3179:2: kw= 'true'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleEBoolean6765); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3186:2: kw= 'false'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleEBoolean6784); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleCPU"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3199:1: entryRuleCPU returns [String current=null] : iv_ruleCPU= ruleCPU EOF ;
    public final String entryRuleCPU() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCPU = null;


        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3200:2: (iv_ruleCPU= ruleCPU EOF )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3201:2: iv_ruleCPU= ruleCPU EOF
            {
             newCompositeNode(grammarAccess.getCPURule()); 
            pushFollow(FOLLOW_ruleCPU_in_entryRuleCPU6825);
            iv_ruleCPU=ruleCPU();

            state._fsp--;

             current =iv_ruleCPU.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCPU6836); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCPU"


    // $ANTLR start "ruleCPU"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3208:1: ruleCPU returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '*' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCPU() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3211:28: ( (this_INT_0= RULE_INT kw= '*' this_INT_2= RULE_INT ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3212:1: (this_INT_0= RULE_INT kw= '*' this_INT_2= RULE_INT )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3212:1: (this_INT_0= RULE_INT kw= '*' this_INT_2= RULE_INT )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3212:6: this_INT_0= RULE_INT kw= '*' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCPU6876); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getCPUAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,51,FOLLOW_51_in_ruleCPU6894); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCPUAccess().getAsteriskKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCPU6909); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getCPUAccess().getINTTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCPU"


    // $ANTLR start "ruleNativeProvType"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3240:1: ruleNativeProvType returns [Enumerator current=null] : ( (enumLiteral_0= 'amazon' ) | (enumLiteral_1= 'google' ) | (enumLiteral_2= 'g5000' ) | (enumLiteral_3= 'virtualbox' ) ) ;
    public final Enumerator ruleNativeProvType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3242:28: ( ( (enumLiteral_0= 'amazon' ) | (enumLiteral_1= 'google' ) | (enumLiteral_2= 'g5000' ) | (enumLiteral_3= 'virtualbox' ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3243:1: ( (enumLiteral_0= 'amazon' ) | (enumLiteral_1= 'google' ) | (enumLiteral_2= 'g5000' ) | (enumLiteral_3= 'virtualbox' ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3243:1: ( (enumLiteral_0= 'amazon' ) | (enumLiteral_1= 'google' ) | (enumLiteral_2= 'g5000' ) | (enumLiteral_3= 'virtualbox' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt27=1;
                }
                break;
            case 53:
                {
                alt27=2;
                }
                break;
            case 54:
                {
                alt27=3;
                }
                break;
            case 55:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3243:2: (enumLiteral_0= 'amazon' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3243:2: (enumLiteral_0= 'amazon' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3243:4: enumLiteral_0= 'amazon'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleNativeProvType6968); 

                            current = grammarAccess.getNativeProvTypeAccess().getAmazonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNativeProvTypeAccess().getAmazonEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3249:6: (enumLiteral_1= 'google' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3249:6: (enumLiteral_1= 'google' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3249:8: enumLiteral_1= 'google'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleNativeProvType6985); 

                            current = grammarAccess.getNativeProvTypeAccess().getGoogleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNativeProvTypeAccess().getGoogleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3255:6: (enumLiteral_2= 'g5000' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3255:6: (enumLiteral_2= 'g5000' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3255:8: enumLiteral_2= 'g5000'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleNativeProvType7002); 

                            current = grammarAccess.getNativeProvTypeAccess().getG5000EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getNativeProvTypeAccess().getG5000EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3261:6: (enumLiteral_3= 'virtualbox' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3261:6: (enumLiteral_3= 'virtualbox' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3261:8: enumLiteral_3= 'virtualbox'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_55_in_ruleNativeProvType7019); 

                            current = grammarAccess.getNativeProvTypeAccess().getVirtualboxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getNativeProvTypeAccess().getVirtualboxEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNativeProvType"


    // $ANTLR start "ruleNativeSO"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3271:1: ruleNativeSO returns [Enumerator current=null] : (enumLiteral_0= 'linux' ) ;
    public final Enumerator ruleNativeSO() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3273:28: ( (enumLiteral_0= 'linux' ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3274:1: (enumLiteral_0= 'linux' )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3274:1: (enumLiteral_0= 'linux' )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3274:3: enumLiteral_0= 'linux'
            {
            enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleNativeSO7063); 

                    current = grammarAccess.getNativeSOAccess().getLinuxEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getNativeSOAccess().getLinuxEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNativeSO"


    // $ANTLR start "ruleNativeRequirement"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3284:1: ruleNativeRequirement returns [Enumerator current=null] : ( (enumLiteral_0= 'ssh' ) | (enumLiteral_1= 'tomcat' ) | (enumLiteral_2= 'httpd' ) ) ;
    public final Enumerator ruleNativeRequirement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3286:28: ( ( (enumLiteral_0= 'ssh' ) | (enumLiteral_1= 'tomcat' ) | (enumLiteral_2= 'httpd' ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3287:1: ( (enumLiteral_0= 'ssh' ) | (enumLiteral_1= 'tomcat' ) | (enumLiteral_2= 'httpd' ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3287:1: ( (enumLiteral_0= 'ssh' ) | (enumLiteral_1= 'tomcat' ) | (enumLiteral_2= 'httpd' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt28=1;
                }
                break;
            case 58:
                {
                alt28=2;
                }
                break;
            case 59:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3287:2: (enumLiteral_0= 'ssh' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3287:2: (enumLiteral_0= 'ssh' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3287:4: enumLiteral_0= 'ssh'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleNativeRequirement7107); 

                            current = grammarAccess.getNativeRequirementAccess().getSshEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNativeRequirementAccess().getSshEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3293:6: (enumLiteral_1= 'tomcat' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3293:6: (enumLiteral_1= 'tomcat' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3293:8: enumLiteral_1= 'tomcat'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleNativeRequirement7124); 

                            current = grammarAccess.getNativeRequirementAccess().getTomcatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNativeRequirementAccess().getTomcatEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3299:6: (enumLiteral_2= 'httpd' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3299:6: (enumLiteral_2= 'httpd' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3299:8: enumLiteral_2= 'httpd'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleNativeRequirement7141); 

                            current = grammarAccess.getNativeRequirementAccess().getApacheEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getNativeRequirementAccess().getApacheEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNativeRequirement"


    // $ANTLR start "ruleNativeDistribution"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3309:1: ruleNativeDistribution returns [Enumerator current=null] : ( (enumLiteral_0= 'ubuntu' ) | (enumLiteral_1= 'debian' ) | (enumLiteral_2= 'centos' ) | (enumLiteral_3= 'fedora' ) ) ;
    public final Enumerator ruleNativeDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3311:28: ( ( (enumLiteral_0= 'ubuntu' ) | (enumLiteral_1= 'debian' ) | (enumLiteral_2= 'centos' ) | (enumLiteral_3= 'fedora' ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3312:1: ( (enumLiteral_0= 'ubuntu' ) | (enumLiteral_1= 'debian' ) | (enumLiteral_2= 'centos' ) | (enumLiteral_3= 'fedora' ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3312:1: ( (enumLiteral_0= 'ubuntu' ) | (enumLiteral_1= 'debian' ) | (enumLiteral_2= 'centos' ) | (enumLiteral_3= 'fedora' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt29=1;
                }
                break;
            case 61:
                {
                alt29=2;
                }
                break;
            case 62:
                {
                alt29=3;
                }
                break;
            case 63:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3312:2: (enumLiteral_0= 'ubuntu' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3312:2: (enumLiteral_0= 'ubuntu' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3312:4: enumLiteral_0= 'ubuntu'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleNativeDistribution7186); 

                            current = grammarAccess.getNativeDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNativeDistributionAccess().getUbuntuEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3318:6: (enumLiteral_1= 'debian' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3318:6: (enumLiteral_1= 'debian' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3318:8: enumLiteral_1= 'debian'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleNativeDistribution7203); 

                            current = grammarAccess.getNativeDistributionAccess().getDebianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNativeDistributionAccess().getDebianEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3324:6: (enumLiteral_2= 'centos' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3324:6: (enumLiteral_2= 'centos' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3324:8: enumLiteral_2= 'centos'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleNativeDistribution7220); 

                            current = grammarAccess.getNativeDistributionAccess().getCentosEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getNativeDistributionAccess().getCentosEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3330:6: (enumLiteral_3= 'fedora' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3330:6: (enumLiteral_3= 'fedora' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3330:8: enumLiteral_3= 'fedora'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_63_in_ruleNativeDistribution7237); 

                            current = grammarAccess.getNativeDistributionAccess().getFedoraEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getNativeDistributionAccess().getFedoraEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNativeDistribution"


    // $ANTLR start "ruleSrvSignal"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3340:1: ruleSrvSignal returns [Enumerator current=null] : ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'restart' ) | (enumLiteral_2= 'stop' ) ) ;
    public final Enumerator ruleSrvSignal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3342:28: ( ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'restart' ) | (enumLiteral_2= 'stop' ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3343:1: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'restart' ) | (enumLiteral_2= 'stop' ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3343:1: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'restart' ) | (enumLiteral_2= 'stop' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt30=1;
                }
                break;
            case 65:
                {
                alt30=2;
                }
                break;
            case 66:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3343:2: (enumLiteral_0= 'start' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3343:2: (enumLiteral_0= 'start' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3343:4: enumLiteral_0= 'start'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleSrvSignal7282); 

                            current = grammarAccess.getSrvSignalAccess().getStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSrvSignalAccess().getStartEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3349:6: (enumLiteral_1= 'restart' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3349:6: (enumLiteral_1= 'restart' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3349:8: enumLiteral_1= 'restart'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleSrvSignal7299); 

                            current = grammarAccess.getSrvSignalAccess().getRestartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSrvSignalAccess().getRestartEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3355:6: (enumLiteral_2= 'stop' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3355:6: (enumLiteral_2= 'stop' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3355:8: enumLiteral_2= 'stop'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleSrvSignal7316); 

                            current = grammarAccess.getSrvSignalAccess().getStopEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSrvSignalAccess().getStopEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSrvSignal"


    // $ANTLR start "ruleFileType"
    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3365:1: ruleFileType returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'remote' ) ) ;
    public final Enumerator ruleFileType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3367:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'remote' ) ) )
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3368:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'remote' ) )
            {
            // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3368:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'remote' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            else if ( (LA31_0==68) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3368:2: (enumLiteral_0= 'local' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3368:2: (enumLiteral_0= 'local' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3368:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleFileType7361); 

                            current = grammarAccess.getFileTypeAccess().getLocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFileTypeAccess().getLocalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3374:6: (enumLiteral_1= 'remote' )
                    {
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3374:6: (enumLiteral_1= 'remote' )
                    // ../fr.mines_nantes.atlanmod.giraffe.GiraffeDSL/src-gen/fr/mines_nantes/atlanmod/giraffe/parser/antlr/internal/InternalGiraffeDSL.g:3374:8: enumLiteral_1= 'remote'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleFileType7378); 

                            current = grammarAccess.getFileTypeAccess().getRemoteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFileTypeAccess().getRemoteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGiraffeMetaModel_in_entryRuleGiraffeMetaModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGiraffeMetaModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleGiraffeMetaModel131 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_ruleEnvironment_in_ruleGiraffeMetaModel153 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDeploymentDefinitions_in_ruleGiraffeMetaModel174 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleDeployment_in_ruleGiraffeMetaModel195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_entryRuleEnvironment231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironment241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEnvironment287 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnvironment299 = new BitSet(new long[]{0x0000000046482000L});
    public static final BitSet FOLLOW_ruleAuth_in_ruleEnvironment320 = new BitSet(new long[]{0x0000000046482000L});
    public static final BitSet FOLLOW_ruleResource_in_ruleEnvironment342 = new BitSet(new long[]{0x0000000042482000L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleEnvironment364 = new BitSet(new long[]{0x0000000040482000L});
    public static final BitSet FOLLOW_ruleVirtualMachine_in_ruleEnvironment386 = new BitSet(new long[]{0x0000000000482000L});
    public static final BitSet FOLLOW_ruleProviders_in_ruleEnvironment408 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleEnvironment421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploymentDefinitions_in_entryRuleDeploymentDefinitions457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploymentDefinitions467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeploymentDefinitions513 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeploymentDefinitions525 = new BitSet(new long[]{0x0000040400002000L});
    public static final BitSet FOLLOW_ruleArtifact_in_ruleDeploymentDefinitions548 = new BitSet(new long[]{0x0000040400002000L});
    public static final BitSet FOLLOW_ruleConfArtifact_in_ruleDeploymentDefinitions567 = new BitSet(new long[]{0x0000040400002000L});
    public static final BitSet FOLLOW_ruleNodeset_in_ruleDeploymentDefinitions592 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeploymentDefinitions605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployment_in_entryRuleDeployment641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeployment651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDeployment688 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeployment700 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleSetup_in_ruleDeployment721 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleDeploy_in_ruleDeployment742 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeployment754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard953 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildcard972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1066 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedName1085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1100 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleVirtualMachine_in_entryRuleVirtualMachine1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualMachine1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVirtualMachine1194 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleVirtualMachine1215 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVirtualMachine1227 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleNativeSO_in_ruleVirtualMachine1249 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_ruleNativeDistribution_in_ruleVirtualMachine1270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEFloat_in_ruleVirtualMachine1291 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVirtualMachine1304 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVirtualMachine1324 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVirtualMachine1337 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVirtualMachine1357 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleProviders_in_entryRuleProviders1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviders1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvider_in_ruleProviders1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherProvider_in_ruleProviders1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvider_in_entryRuleProvider1515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvider1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleProvider1562 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleNativeProvType_in_ruleProvider1583 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleProvider1604 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleProvider1616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvider1636 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProvider1648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvider1668 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProvider1680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvider1700 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProvider1712 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleProvider1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherProvider_in_entryRuleOtherProvider1769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherProvider1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOtherProvider1816 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOtherProvider1834 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOtherProvider1868 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOtherProvider1880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOtherProvider1900 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOtherProvider1912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOtherProvider1932 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOtherProvider1944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOtherProvider1964 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOtherProvider1976 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOtherProvider1997 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOtherProvider2009 = new BitSet(new long[]{0x0000000001010800L});
    public static final BitSet FOLLOW_ruleImport_in_ruleOtherProvider2030 = new BitSet(new long[]{0x0000000001010800L});
    public static final BitSet FOLLOW_24_in_ruleOtherProvider2043 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOtherProvider2055 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOtherProvider2067 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOtherProvider2079 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOtherProvider2091 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOtherProvider2103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOtherProvider2115 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOtherProvider2127 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOtherProvider2139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOtherProvider2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuth_in_entryRuleAuth2187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuth2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassword_in_ruleAuth2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_ruleAuth2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCredential_in_ruleAuth2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassword_in_entryRulePassword2333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePassword2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePassword2380 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePassword2398 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_rulePassword2432 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePassword2444 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_rulePassword2465 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePassword2477 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_rulePassword2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey2534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleKey2581 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleKey2599 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKey2633 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleKey2645 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKey2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCredential_in_entryRuleCredential2702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCredential2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCredential2749 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCredential2767 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCredential2801 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCredential2813 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCredential2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource2870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleResource2917 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleResource2938 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleResource2950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCPU_in_ruleResource2971 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResource2983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResource3000 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResource3017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResource3034 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResource3051 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResource3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency3109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstall_in_ruleDependency3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleDependency3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_ruleDependency3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstall_in_entryRuleInstall3255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstall3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInstall3302 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleInstall3320 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleInstall3354 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInstall3366 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleInstall3387 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInstall3399 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEFloat_in_ruleInstall3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService3456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleService3503 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleService3521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleSrvSignal_in_ruleService3555 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleService3576 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService3588 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleService3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile3645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFile3692 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFile3710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleFileType_in_ruleFile3744 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleFile3765 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFile3777 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleFile3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact3834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifact3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_ruleArtifact3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeExternal_in_ruleArtifact3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_ruleArtifact3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptCommand_in_ruleArtifact3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptBlock_in_ruleArtifact3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfArtifact_in_entryRuleConfArtifact4034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfArtifact4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_ruleConfArtifact4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigBlock_in_ruleConfArtifact4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig4153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleConfig4200 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleConfig4218 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleConfig4252 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConfig4264 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleConfig4285 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleConfig4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigBlock_in_entryRuleConfigBlock4342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigBlock4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleConfigBlock4389 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleConfigBlock4407 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleConfigBlock4441 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConfigBlock4453 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleConfigBlock4474 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConfigBlock4486 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleConfigBlock4507 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConfigBlock4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode4555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCode4602 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCode4620 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCode4654 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCode4666 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCode4678 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCode4699 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCode4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeExternal_in_entryRuleCodeExternal4747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeExternal4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCodeExternal4794 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCodeExternal4812 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCodeExternal4846 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCodeExternal4858 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCodeExternal4879 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCodeExternal4891 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCodeExternal4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript4948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleScript4995 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleScript5013 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleScript5047 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleScript5059 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleScript5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptCommand_in_entryRuleScriptCommand5116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptCommand5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleScriptCommand5163 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleScriptCommand5181 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleScriptCommand5215 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleScriptCommand5227 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleScriptCommand5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptBlock_in_entryRuleScriptBlock5284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptBlock5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleScriptBlock5331 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleScriptBlock5349 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleScriptBlock5383 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleScriptBlock5395 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleScriptBlock5407 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleScriptBlock5428 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleScriptBlock5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeset_in_entryRuleNodeset5476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeset5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNodeset5523 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleNodeset5544 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNodeset5556 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleNodeset5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetup_in_entryRuleSetup5613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetup5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSetup5669 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSetup5690 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSetup5702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetup5722 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSetup5734 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleSetup5755 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSetup5767 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleSetup5788 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSetup5800 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleSetup5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploy_in_entryRuleDeploy5857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploy5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDeploy5904 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleDeploy5925 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDeploy5937 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDeploy5949 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeploy5969 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleDeploy5982 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleDeploy6003 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeploy6015 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_ruleExecution_in_ruleDeploy6036 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeploy6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecution_in_entryRuleExecution6085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecution6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleExecution6132 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEString_in_ruleExecution6153 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExecution6165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecution6185 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecution6198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecution6218 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecution6232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecution6252 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecution6264 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleExecution6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat6445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloat6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat6497 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEFloat6515 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt6603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEInt6653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean6716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEBoolean6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEBoolean6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCPU_in_entryRuleCPU6825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCPU6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCPU6876 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleCPU6894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCPU6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNativeProvType6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNativeProvType6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNativeProvType7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNativeProvType7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNativeSO7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNativeRequirement7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNativeRequirement7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNativeRequirement7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNativeDistribution7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNativeDistribution7203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleNativeDistribution7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleNativeDistribution7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSrvSignal7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSrvSignal7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSrvSignal7316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFileType7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleFileType7378 = new BitSet(new long[]{0x0000000000000002L});

}