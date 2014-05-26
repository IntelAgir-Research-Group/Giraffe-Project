package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'{'", "'}'", "'many'", "'initialMachines'", "':'", "'initialIncrement'", "'vMachine'", "'virtualMachine'", "'vM'", "'Linux1-CloudTest'", "'Small'", "'cloudProvider'", "'cloudType'", "'G5000'", "'AmazonEC2'", "'Google'", "'VirtualBox'", "'newMachinesScript'", "'geoZone'", "'cloudMgmAddress'", "'cloudCredential'", "'cloudUser'", "'cloudPassword'", "'deploy'", "'deployApp'", "'deployType'", "'range'", "'class'", "'deployMasterMethod'", "'deploySlaveMethod'", "'monitor'", "'monitoringType'", "'reactive'", "'predictive'", "'stress'", "'stressClass'", "'stressMethod'", "'action'", "'method'"
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel75);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleDomainModel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (lv_elements_0_0= ruleType ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_elements_0_0= ruleType ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==19||LA1_0==23||(LA1_0>=35 && LA1_0<=37)||LA1_0==42||LA1_0==46||LA1_0==49) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_elements_0_0= ruleType )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_elements_0_0= ruleType )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:3: lv_elements_0_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getElementsTypeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleDomainModel130);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:106:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:107:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType166);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: ruleType returns [EObject current=null] : (this_Create_0= ruleCreate | this_VirtualMachine_1= ruleVirtualMachine | this_CloudProvider_2= ruleCloudProvider | this_Deploy_3= ruleDeploy | this_DeployType_4= ruleDeployType | this_DeployApp_5= ruleDeployApp | this_Monitor_6= ruleMonitor | this_Stress_7= ruleStress | this_Action_8= ruleAction ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_VirtualMachine_1 = null;

        EObject this_CloudProvider_2 = null;

        EObject this_Deploy_3 = null;

        EObject this_DeployType_4 = null;

        EObject this_DeployApp_5 = null;

        EObject this_Monitor_6 = null;

        EObject this_Stress_7 = null;

        EObject this_Action_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:28: ( (this_Create_0= ruleCreate | this_VirtualMachine_1= ruleVirtualMachine | this_CloudProvider_2= ruleCloudProvider | this_Deploy_3= ruleDeploy | this_DeployType_4= ruleDeployType | this_DeployApp_5= ruleDeployApp | this_Monitor_6= ruleMonitor | this_Stress_7= ruleStress | this_Action_8= ruleAction ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: (this_Create_0= ruleCreate | this_VirtualMachine_1= ruleVirtualMachine | this_CloudProvider_2= ruleCloudProvider | this_Deploy_3= ruleDeploy | this_DeployType_4= ruleDeployType | this_DeployApp_5= ruleDeployApp | this_Monitor_6= ruleMonitor | this_Stress_7= ruleStress | this_Action_8= ruleAction )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: (this_Create_0= ruleCreate | this_VirtualMachine_1= ruleVirtualMachine | this_CloudProvider_2= ruleCloudProvider | this_Deploy_3= ruleDeploy | this_DeployType_4= ruleDeployType | this_DeployApp_5= ruleDeployApp | this_Monitor_6= ruleMonitor | this_Stress_7= ruleStress | this_Action_8= ruleAction )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 37:
                {
                alt2=5;
                }
                break;
            case 36:
                {
                alt2=6;
                }
                break;
            case 42:
                {
                alt2=7;
                }
                break;
            case 46:
                {
                alt2=8;
                }
                break;
            case 49:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:5: this_Create_0= ruleCreate
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCreateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCreate_in_ruleType223);
                    this_Create_0=ruleCreate();

                    state._fsp--;

                     
                            current = this_Create_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:130:5: this_VirtualMachine_1= ruleVirtualMachine
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getVirtualMachineParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVirtualMachine_in_ruleType250);
                    this_VirtualMachine_1=ruleVirtualMachine();

                    state._fsp--;

                     
                            current = this_VirtualMachine_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:140:5: this_CloudProvider_2= ruleCloudProvider
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCloudProviderParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCloudProvider_in_ruleType277);
                    this_CloudProvider_2=ruleCloudProvider();

                    state._fsp--;

                     
                            current = this_CloudProvider_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:150:5: this_Deploy_3= ruleDeploy
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDeployParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDeploy_in_ruleType304);
                    this_Deploy_3=ruleDeploy();

                    state._fsp--;

                     
                            current = this_Deploy_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:5: this_DeployType_4= ruleDeployType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDeployTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDeployType_in_ruleType331);
                    this_DeployType_4=ruleDeployType();

                    state._fsp--;

                     
                            current = this_DeployType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:170:5: this_DeployApp_5= ruleDeployApp
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDeployAppParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDeployApp_in_ruleType358);
                    this_DeployApp_5=ruleDeployApp();

                    state._fsp--;

                     
                            current = this_DeployApp_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:5: this_Monitor_6= ruleMonitor
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMonitorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleMonitor_in_ruleType385);
                    this_Monitor_6=ruleMonitor();

                    state._fsp--;

                     
                            current = this_Monitor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:190:5: this_Stress_7= ruleStress
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStressParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleStress_in_ruleType412);
                    this_Stress_7=ruleStress();

                    state._fsp--;

                     
                            current = this_Stress_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:200:5: this_Action_8= ruleAction
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getActionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleAction_in_ruleType439);
                    this_Action_8=ruleAction();

                    state._fsp--;

                     
                            current = this_Action_8; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCreate"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:216:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:217:2: (iv_ruleCreate= ruleCreate EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:2: iv_ruleCreate= ruleCreate EOF
            {
             newCompositeNode(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_ruleCreate_in_entryRuleCreate474);
            iv_ruleCreate=ruleCreate();

            state._fsp--;

             current =iv_ruleCreate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreate484); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:225:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'create' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_vMachine_3_0= ruleVirtualMachineFeature ) ) ( (lv_initMachines_4_0= ruleInitMachinesFeature ) ) ( (lv_initIncrement_5_0= ruleInitIncrementFeature ) ) otherlv_6= '}' ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_vMachine_3_0 = null;

        EObject lv_initMachines_4_0 = null;

        EObject lv_initIncrement_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:228:28: ( (otherlv_0= 'create' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_vMachine_3_0= ruleVirtualMachineFeature ) ) ( (lv_initMachines_4_0= ruleInitMachinesFeature ) ) ( (lv_initIncrement_5_0= ruleInitIncrementFeature ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:1: (otherlv_0= 'create' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_vMachine_3_0= ruleVirtualMachineFeature ) ) ( (lv_initMachines_4_0= ruleInitMachinesFeature ) ) ( (lv_initIncrement_5_0= ruleInitIncrementFeature ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:1: (otherlv_0= 'create' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_vMachine_3_0= ruleVirtualMachineFeature ) ) ( (lv_initMachines_4_0= ruleInitMachinesFeature ) ) ( (lv_initIncrement_5_0= ruleInitIncrementFeature ) ) otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:3: otherlv_0= 'create' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_vMachine_3_0= ruleVirtualMachineFeature ) ) ( (lv_initMachines_4_0= ruleInitMachinesFeature ) ) ( (lv_initIncrement_5_0= ruleInitIncrementFeature ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCreate521); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCreateKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreate538); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCreateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCreate555); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:255:1: ( (lv_vMachine_3_0= ruleVirtualMachineFeature ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:256:1: (lv_vMachine_3_0= ruleVirtualMachineFeature )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:256:1: (lv_vMachine_3_0= ruleVirtualMachineFeature )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:3: lv_vMachine_3_0= ruleVirtualMachineFeature
            {
             
            	        newCompositeNode(grammarAccess.getCreateAccess().getVMachineVirtualMachineFeatureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVirtualMachineFeature_in_ruleCreate576);
            lv_vMachine_3_0=ruleVirtualMachineFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCreateRule());
            	        }
                   		add(
                   			current, 
                   			"vMachine",
                    		lv_vMachine_3_0, 
                    		"VirtualMachineFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:2: ( (lv_initMachines_4_0= ruleInitMachinesFeature ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:274:1: (lv_initMachines_4_0= ruleInitMachinesFeature )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:274:1: (lv_initMachines_4_0= ruleInitMachinesFeature )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:3: lv_initMachines_4_0= ruleInitMachinesFeature
            {
             
            	        newCompositeNode(grammarAccess.getCreateAccess().getInitMachinesInitMachinesFeatureParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInitMachinesFeature_in_ruleCreate597);
            lv_initMachines_4_0=ruleInitMachinesFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCreateRule());
            	        }
                   		add(
                   			current, 
                   			"initMachines",
                    		lv_initMachines_4_0, 
                    		"InitMachinesFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:291:2: ( (lv_initIncrement_5_0= ruleInitIncrementFeature ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:292:1: (lv_initIncrement_5_0= ruleInitIncrementFeature )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:292:1: (lv_initIncrement_5_0= ruleInitIncrementFeature )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:293:3: lv_initIncrement_5_0= ruleInitIncrementFeature
            {
             
            	        newCompositeNode(grammarAccess.getCreateAccess().getInitIncrementInitIncrementFeatureParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleInitIncrementFeature_in_ruleCreate618);
            lv_initIncrement_5_0=ruleInitIncrementFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCreateRule());
            	        }
                   		add(
                   			current, 
                   			"initIncrement",
                    		lv_initIncrement_5_0, 
                    		"InitIncrementFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleCreate630); 

                	newLeafNode(otherlv_6, grammarAccess.getCreateAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleInitMachinesFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:321:1: entryRuleInitMachinesFeature returns [EObject current=null] : iv_ruleInitMachinesFeature= ruleInitMachinesFeature EOF ;
    public final EObject entryRuleInitMachinesFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitMachinesFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:322:2: (iv_ruleInitMachinesFeature= ruleInitMachinesFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:323:2: iv_ruleInitMachinesFeature= ruleInitMachinesFeature EOF
            {
             newCompositeNode(grammarAccess.getInitMachinesFeatureRule()); 
            pushFollow(FOLLOW_ruleInitMachinesFeature_in_entryRuleInitMachinesFeature666);
            iv_ruleInitMachinesFeature=ruleInitMachinesFeature();

            state._fsp--;

             current =iv_ruleInitMachinesFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitMachinesFeature676); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitMachinesFeature"


    // $ANTLR start "ruleInitMachinesFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:330:1: ruleInitMachinesFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'initialMachines' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_INT ) ) ) ;
    public final EObject ruleInitMachinesFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'initialMachines' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_INT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'initialMachines' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'initialMachines' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_INT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'initialMachines' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_INT ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:2: ( (lv_many_0_0= 'many' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:336:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleInitMachinesFeature719); 

                            newLeafNode(lv_many_0_0, grammarAccess.getInitMachinesFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInitMachinesFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:349:3: ( (lv_name_1_0= 'initialMachines' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: (lv_name_1_0= 'initialMachines' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: (lv_name_1_0= 'initialMachines' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:3: lv_name_1_0= 'initialMachines'
            {
            lv_name_1_0=(Token)match(input,15,FOLLOW_15_in_ruleInitMachinesFeature751); 

                    newLeafNode(lv_name_1_0, grammarAccess.getInitMachinesFeatureAccess().getNameInitialMachinesKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitMachinesFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "initialMachines");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleInitMachinesFeature776); 

                	newLeafNode(otherlv_2, grammarAccess.getInitMachinesFeatureAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:1: ( (lv_type_3_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:1: (lv_type_3_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:1: (lv_type_3_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:370:3: lv_type_3_0= RULE_INT
            {
            lv_type_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitMachinesFeature793); 

            			newLeafNode(lv_type_3_0, grammarAccess.getInitMachinesFeatureAccess().getTypeINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitMachinesFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
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
    // $ANTLR end "ruleInitMachinesFeature"


    // $ANTLR start "entryRuleInitIncrementFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:1: entryRuleInitIncrementFeature returns [EObject current=null] : iv_ruleInitIncrementFeature= ruleInitIncrementFeature EOF ;
    public final EObject entryRuleInitIncrementFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitIncrementFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:2: (iv_ruleInitIncrementFeature= ruleInitIncrementFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:2: iv_ruleInitIncrementFeature= ruleInitIncrementFeature EOF
            {
             newCompositeNode(grammarAccess.getInitIncrementFeatureRule()); 
            pushFollow(FOLLOW_ruleInitIncrementFeature_in_entryRuleInitIncrementFeature834);
            iv_ruleInitIncrementFeature=ruleInitIncrementFeature();

            state._fsp--;

             current =iv_ruleInitIncrementFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitIncrementFeature844); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitIncrementFeature"


    // $ANTLR start "ruleInitIncrementFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:403:1: ruleInitIncrementFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'initialIncrement' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_INT ) ) ) ;
    public final EObject ruleInitIncrementFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:406:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'initialIncrement' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_INT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'initialIncrement' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'initialIncrement' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_INT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'initialIncrement' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_INT ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:2: ( (lv_many_0_0= 'many' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleInitIncrementFeature887); 

                            newLeafNode(lv_many_0_0, grammarAccess.getInitIncrementFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInitIncrementFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:3: ( (lv_name_1_0= 'initialIncrement' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:423:1: (lv_name_1_0= 'initialIncrement' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:423:1: (lv_name_1_0= 'initialIncrement' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:3: lv_name_1_0= 'initialIncrement'
            {
            lv_name_1_0=(Token)match(input,17,FOLLOW_17_in_ruleInitIncrementFeature919); 

                    newLeafNode(lv_name_1_0, grammarAccess.getInitIncrementFeatureAccess().getNameInitialIncrementKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitIncrementFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "initialIncrement");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleInitIncrementFeature944); 

                	newLeafNode(otherlv_2, grammarAccess.getInitIncrementFeatureAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:441:1: ( (lv_type_3_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:442:1: (lv_type_3_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:442:1: (lv_type_3_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:3: lv_type_3_0= RULE_INT
            {
            lv_type_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitIncrementFeature961); 

            			newLeafNode(lv_type_3_0, grammarAccess.getInitIncrementFeatureAccess().getTypeINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitIncrementFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
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
    // $ANTLR end "ruleInitIncrementFeature"


    // $ANTLR start "entryRuleVirtualMachineFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:467:1: entryRuleVirtualMachineFeature returns [EObject current=null] : iv_ruleVirtualMachineFeature= ruleVirtualMachineFeature EOF ;
    public final EObject entryRuleVirtualMachineFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualMachineFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:468:2: (iv_ruleVirtualMachineFeature= ruleVirtualMachineFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:469:2: iv_ruleVirtualMachineFeature= ruleVirtualMachineFeature EOF
            {
             newCompositeNode(grammarAccess.getVirtualMachineFeatureRule()); 
            pushFollow(FOLLOW_ruleVirtualMachineFeature_in_entryRuleVirtualMachineFeature1002);
            iv_ruleVirtualMachineFeature=ruleVirtualMachineFeature();

            state._fsp--;

             current =iv_ruleVirtualMachineFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualMachineFeature1012); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVirtualMachineFeature"


    // $ANTLR start "ruleVirtualMachineFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:1: ruleVirtualMachineFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'vMachine' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleVirtualMachineFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'vMachine' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'vMachine' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'vMachine' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'vMachine' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:2: ( (lv_many_0_0= 'many' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:481:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:481:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleVirtualMachineFeature1055); 

                            newLeafNode(lv_many_0_0, grammarAccess.getVirtualMachineFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVirtualMachineFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:495:3: ( (lv_name_1_0= 'vMachine' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:1: (lv_name_1_0= 'vMachine' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:1: (lv_name_1_0= 'vMachine' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:3: lv_name_1_0= 'vMachine'
            {
            lv_name_1_0=(Token)match(input,18,FOLLOW_18_in_ruleVirtualMachineFeature1087); 

                    newLeafNode(lv_name_1_0, grammarAccess.getVirtualMachineFeatureAccess().getNameVMachineKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVirtualMachineFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "vMachine");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleVirtualMachineFeature1112); 

                	newLeafNode(otherlv_2, grammarAccess.getVirtualMachineFeatureAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:516:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVirtualMachineFeatureRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVirtualMachineFeature1132); 

            		newLeafNode(otherlv_3, grammarAccess.getVirtualMachineFeatureAccess().getTypeVirtualMachineCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleVirtualMachineFeature"


    // $ANTLR start "entryRuleVirtualMachine"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:535:1: entryRuleVirtualMachine returns [EObject current=null] : iv_ruleVirtualMachine= ruleVirtualMachine EOF ;
    public final EObject entryRuleVirtualMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualMachine = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:536:2: (iv_ruleVirtualMachine= ruleVirtualMachine EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:537:2: iv_ruleVirtualMachine= ruleVirtualMachine EOF
            {
             newCompositeNode(grammarAccess.getVirtualMachineRule()); 
            pushFollow(FOLLOW_ruleVirtualMachine_in_entryRuleVirtualMachine1168);
            iv_ruleVirtualMachine=ruleVirtualMachine();

            state._fsp--;

             current =iv_ruleVirtualMachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualMachine1178); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:1: ruleVirtualMachine returns [EObject current=null] : (otherlv_0= 'virtualMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_vM_3_0= ruleVirtualMachineTypeFeature ) ) ( (lv_cloudProvider_4_0= ruleCloudProviderType ) ) otherlv_5= '}' ) ;
    public final EObject ruleVirtualMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_vM_3_0 = null;

        EObject lv_cloudProvider_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:547:28: ( (otherlv_0= 'virtualMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_vM_3_0= ruleVirtualMachineTypeFeature ) ) ( (lv_cloudProvider_4_0= ruleCloudProviderType ) ) otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:548:1: (otherlv_0= 'virtualMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_vM_3_0= ruleVirtualMachineTypeFeature ) ) ( (lv_cloudProvider_4_0= ruleCloudProviderType ) ) otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:548:1: (otherlv_0= 'virtualMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_vM_3_0= ruleVirtualMachineTypeFeature ) ) ( (lv_cloudProvider_4_0= ruleCloudProviderType ) ) otherlv_5= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:548:3: otherlv_0= 'virtualMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_vM_3_0= ruleVirtualMachineTypeFeature ) ) ( (lv_cloudProvider_4_0= ruleCloudProviderType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleVirtualMachine1215); 

                	newLeafNode(otherlv_0, grammarAccess.getVirtualMachineAccess().getVirtualMachineKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:552:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:553:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:553:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:554:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVirtualMachine1232); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVirtualMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVirtualMachineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleVirtualMachine1249); 

                	newLeafNode(otherlv_2, grammarAccess.getVirtualMachineAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:574:1: ( (lv_vM_3_0= ruleVirtualMachineTypeFeature ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:575:1: (lv_vM_3_0= ruleVirtualMachineTypeFeature )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:575:1: (lv_vM_3_0= ruleVirtualMachineTypeFeature )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:3: lv_vM_3_0= ruleVirtualMachineTypeFeature
            {
             
            	        newCompositeNode(grammarAccess.getVirtualMachineAccess().getVMVirtualMachineTypeFeatureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVirtualMachineTypeFeature_in_ruleVirtualMachine1270);
            lv_vM_3_0=ruleVirtualMachineTypeFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVirtualMachineRule());
            	        }
                   		add(
                   			current, 
                   			"vM",
                    		lv_vM_3_0, 
                    		"VirtualMachineTypeFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:2: ( (lv_cloudProvider_4_0= ruleCloudProviderType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:1: (lv_cloudProvider_4_0= ruleCloudProviderType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:1: (lv_cloudProvider_4_0= ruleCloudProviderType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:3: lv_cloudProvider_4_0= ruleCloudProviderType
            {
             
            	        newCompositeNode(grammarAccess.getVirtualMachineAccess().getCloudProviderCloudProviderTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleCloudProviderType_in_ruleVirtualMachine1291);
            lv_cloudProvider_4_0=ruleCloudProviderType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVirtualMachineRule());
            	        }
                   		add(
                   			current, 
                   			"cloudProvider",
                    		lv_cloudProvider_4_0, 
                    		"CloudProviderType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleVirtualMachine1303); 

                	newLeafNode(otherlv_5, grammarAccess.getVirtualMachineAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleVirtualMachineTypeFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:622:1: entryRuleVirtualMachineTypeFeature returns [EObject current=null] : iv_ruleVirtualMachineTypeFeature= ruleVirtualMachineTypeFeature EOF ;
    public final EObject entryRuleVirtualMachineTypeFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualMachineTypeFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:623:2: (iv_ruleVirtualMachineTypeFeature= ruleVirtualMachineTypeFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:2: iv_ruleVirtualMachineTypeFeature= ruleVirtualMachineTypeFeature EOF
            {
             newCompositeNode(grammarAccess.getVirtualMachineTypeFeatureRule()); 
            pushFollow(FOLLOW_ruleVirtualMachineTypeFeature_in_entryRuleVirtualMachineTypeFeature1339);
            iv_ruleVirtualMachineTypeFeature=ruleVirtualMachineTypeFeature();

            state._fsp--;

             current =iv_ruleVirtualMachineTypeFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualMachineTypeFeature1349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVirtualMachineTypeFeature"


    // $ANTLR start "ruleVirtualMachineTypeFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:631:1: ruleVirtualMachineTypeFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'vM' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'Linux1-CloudTest' | lv_type_3_2= 'Small' ) ) ) ) ;
    public final EObject ruleVirtualMachineTypeFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'vM' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'Linux1-CloudTest' | lv_type_3_2= 'Small' ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'vM' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'Linux1-CloudTest' | lv_type_3_2= 'Small' ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'vM' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'Linux1-CloudTest' | lv_type_3_2= 'Small' ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'vM' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'Linux1-CloudTest' | lv_type_3_2= 'Small' ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:2: ( (lv_many_0_0= 'many' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleVirtualMachineTypeFeature1392); 

                            newLeafNode(lv_many_0_0, grammarAccess.getVirtualMachineTypeFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVirtualMachineTypeFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:3: ( (lv_name_1_0= 'vM' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:651:1: (lv_name_1_0= 'vM' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:651:1: (lv_name_1_0= 'vM' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:652:3: lv_name_1_0= 'vM'
            {
            lv_name_1_0=(Token)match(input,20,FOLLOW_20_in_ruleVirtualMachineTypeFeature1424); 

                    newLeafNode(lv_name_1_0, grammarAccess.getVirtualMachineTypeFeatureAccess().getNameVMKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVirtualMachineTypeFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "vM");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleVirtualMachineTypeFeature1449); 

                	newLeafNode(otherlv_2, grammarAccess.getVirtualMachineTypeFeatureAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:669:1: ( ( (lv_type_3_1= 'Linux1-CloudTest' | lv_type_3_2= 'Small' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:1: ( (lv_type_3_1= 'Linux1-CloudTest' | lv_type_3_2= 'Small' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:1: ( (lv_type_3_1= 'Linux1-CloudTest' | lv_type_3_2= 'Small' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:1: (lv_type_3_1= 'Linux1-CloudTest' | lv_type_3_2= 'Small' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:1: (lv_type_3_1= 'Linux1-CloudTest' | lv_type_3_2= 'Small' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:672:3: lv_type_3_1= 'Linux1-CloudTest'
                    {
                    lv_type_3_1=(Token)match(input,21,FOLLOW_21_in_ruleVirtualMachineTypeFeature1469); 

                            newLeafNode(lv_type_3_1, grammarAccess.getVirtualMachineTypeFeatureAccess().getTypeLinux1CloudTestKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVirtualMachineTypeFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:684:8: lv_type_3_2= 'Small'
                    {
                    lv_type_3_2=(Token)match(input,22,FOLLOW_22_in_ruleVirtualMachineTypeFeature1498); 

                            newLeafNode(lv_type_3_2, grammarAccess.getVirtualMachineTypeFeatureAccess().getTypeSmallKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVirtualMachineTypeFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleVirtualMachineTypeFeature"


    // $ANTLR start "entryRuleCloudProviderType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:707:1: entryRuleCloudProviderType returns [EObject current=null] : iv_ruleCloudProviderType= ruleCloudProviderType EOF ;
    public final EObject entryRuleCloudProviderType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloudProviderType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:708:2: (iv_ruleCloudProviderType= ruleCloudProviderType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:2: iv_ruleCloudProviderType= ruleCloudProviderType EOF
            {
             newCompositeNode(grammarAccess.getCloudProviderTypeRule()); 
            pushFollow(FOLLOW_ruleCloudProviderType_in_entryRuleCloudProviderType1550);
            iv_ruleCloudProviderType=ruleCloudProviderType();

            state._fsp--;

             current =iv_ruleCloudProviderType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloudProviderType1560); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloudProviderType"


    // $ANTLR start "ruleCloudProviderType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:716:1: ruleCloudProviderType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudProvider' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCloudProviderType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:719:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudProvider' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudProvider' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudProvider' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudProvider' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:2: ( (lv_many_0_0= 'many' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:722:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleCloudProviderType1603); 

                            newLeafNode(lv_many_0_0, grammarAccess.getCloudProviderTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCloudProviderTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:3: ( (lv_name_1_0= 'cloudProvider' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:1: (lv_name_1_0= 'cloudProvider' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:1: (lv_name_1_0= 'cloudProvider' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:3: lv_name_1_0= 'cloudProvider'
            {
            lv_name_1_0=(Token)match(input,23,FOLLOW_23_in_ruleCloudProviderType1635); 

                    newLeafNode(lv_name_1_0, grammarAccess.getCloudProviderTypeAccess().getNameCloudProviderKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudProviderTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "cloudProvider");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCloudProviderType1660); 

                	newLeafNode(otherlv_2, grammarAccess.getCloudProviderTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudProviderTypeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCloudProviderType1680); 

            		newLeafNode(otherlv_3, grammarAccess.getCloudProviderTypeAccess().getTypeCloudProviderCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleCloudProviderType"


    // $ANTLR start "entryRuleCloudProvider"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:775:1: entryRuleCloudProvider returns [EObject current=null] : iv_ruleCloudProvider= ruleCloudProvider EOF ;
    public final EObject entryRuleCloudProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloudProvider = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:2: (iv_ruleCloudProvider= ruleCloudProvider EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:2: iv_ruleCloudProvider= ruleCloudProvider EOF
            {
             newCompositeNode(grammarAccess.getCloudProviderRule()); 
            pushFollow(FOLLOW_ruleCloudProvider_in_entryRuleCloudProvider1716);
            iv_ruleCloudProvider=ruleCloudProvider();

            state._fsp--;

             current =iv_ruleCloudProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloudProvider1726); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloudProvider"


    // $ANTLR start "ruleCloudProvider"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:1: ruleCloudProvider returns [EObject current=null] : (otherlv_0= 'cloudProvider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cloudType_3_0= ruleCloudType ) ) ( (lv_cloudAddress_4_0= ruleMgmAddressType ) ) ( (lv_cloudCredential_5_0= ruleCloudCredentialType ) ) ( (lv_cloudOptionalTypes_6_0= ruleCloudOptionalTypes ) )* otherlv_7= '}' ) ;
    public final EObject ruleCloudProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_cloudType_3_0 = null;

        EObject lv_cloudAddress_4_0 = null;

        EObject lv_cloudCredential_5_0 = null;

        EObject lv_cloudOptionalTypes_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:787:28: ( (otherlv_0= 'cloudProvider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cloudType_3_0= ruleCloudType ) ) ( (lv_cloudAddress_4_0= ruleMgmAddressType ) ) ( (lv_cloudCredential_5_0= ruleCloudCredentialType ) ) ( (lv_cloudOptionalTypes_6_0= ruleCloudOptionalTypes ) )* otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:1: (otherlv_0= 'cloudProvider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cloudType_3_0= ruleCloudType ) ) ( (lv_cloudAddress_4_0= ruleMgmAddressType ) ) ( (lv_cloudCredential_5_0= ruleCloudCredentialType ) ) ( (lv_cloudOptionalTypes_6_0= ruleCloudOptionalTypes ) )* otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:1: (otherlv_0= 'cloudProvider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cloudType_3_0= ruleCloudType ) ) ( (lv_cloudAddress_4_0= ruleMgmAddressType ) ) ( (lv_cloudCredential_5_0= ruleCloudCredentialType ) ) ( (lv_cloudOptionalTypes_6_0= ruleCloudOptionalTypes ) )* otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:3: otherlv_0= 'cloudProvider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cloudType_3_0= ruleCloudType ) ) ( (lv_cloudAddress_4_0= ruleMgmAddressType ) ) ( (lv_cloudCredential_5_0= ruleCloudCredentialType ) ) ( (lv_cloudOptionalTypes_6_0= ruleCloudOptionalTypes ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleCloudProvider1763); 

                	newLeafNode(otherlv_0, grammarAccess.getCloudProviderAccess().getCloudProviderKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:792:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:793:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:793:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:794:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCloudProvider1780); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCloudProviderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudProviderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCloudProvider1797); 

                	newLeafNode(otherlv_2, grammarAccess.getCloudProviderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:1: ( (lv_cloudType_3_0= ruleCloudType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:815:1: (lv_cloudType_3_0= ruleCloudType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:815:1: (lv_cloudType_3_0= ruleCloudType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:816:3: lv_cloudType_3_0= ruleCloudType
            {
             
            	        newCompositeNode(grammarAccess.getCloudProviderAccess().getCloudTypeCloudTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCloudType_in_ruleCloudProvider1818);
            lv_cloudType_3_0=ruleCloudType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCloudProviderRule());
            	        }
                   		add(
                   			current, 
                   			"cloudType",
                    		lv_cloudType_3_0, 
                    		"CloudType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:2: ( (lv_cloudAddress_4_0= ruleMgmAddressType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:1: (lv_cloudAddress_4_0= ruleMgmAddressType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:1: (lv_cloudAddress_4_0= ruleMgmAddressType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:3: lv_cloudAddress_4_0= ruleMgmAddressType
            {
             
            	        newCompositeNode(grammarAccess.getCloudProviderAccess().getCloudAddressMgmAddressTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMgmAddressType_in_ruleCloudProvider1839);
            lv_cloudAddress_4_0=ruleMgmAddressType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCloudProviderRule());
            	        }
                   		add(
                   			current, 
                   			"cloudAddress",
                    		lv_cloudAddress_4_0, 
                    		"MgmAddressType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:2: ( (lv_cloudCredential_5_0= ruleCloudCredentialType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:1: (lv_cloudCredential_5_0= ruleCloudCredentialType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:1: (lv_cloudCredential_5_0= ruleCloudCredentialType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:3: lv_cloudCredential_5_0= ruleCloudCredentialType
            {
             
            	        newCompositeNode(grammarAccess.getCloudProviderAccess().getCloudCredentialCloudCredentialTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleCloudCredentialType_in_ruleCloudProvider1860);
            lv_cloudCredential_5_0=ruleCloudCredentialType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCloudProviderRule());
            	        }
                   		add(
                   			current, 
                   			"cloudCredential",
                    		lv_cloudCredential_5_0, 
                    		"CloudCredentialType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:868:2: ( (lv_cloudOptionalTypes_6_0= ruleCloudOptionalTypes ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14||(LA9_0>=29 && LA9_0<=30)||(LA9_0>=33 && LA9_0<=34)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:869:1: (lv_cloudOptionalTypes_6_0= ruleCloudOptionalTypes )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:869:1: (lv_cloudOptionalTypes_6_0= ruleCloudOptionalTypes )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:870:3: lv_cloudOptionalTypes_6_0= ruleCloudOptionalTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCloudProviderAccess().getCloudOptionalTypesCloudOptionalTypesParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCloudOptionalTypes_in_ruleCloudProvider1881);
            	    lv_cloudOptionalTypes_6_0=ruleCloudOptionalTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCloudProviderRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cloudOptionalTypes",
            	            		lv_cloudOptionalTypes_6_0, 
            	            		"CloudOptionalTypes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleCloudProvider1894); 

                	newLeafNode(otherlv_7, grammarAccess.getCloudProviderAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleCloudProvider"


    // $ANTLR start "entryRuleCloudOptionalTypes"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:898:1: entryRuleCloudOptionalTypes returns [EObject current=null] : iv_ruleCloudOptionalTypes= ruleCloudOptionalTypes EOF ;
    public final EObject entryRuleCloudOptionalTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloudOptionalTypes = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:899:2: (iv_ruleCloudOptionalTypes= ruleCloudOptionalTypes EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:900:2: iv_ruleCloudOptionalTypes= ruleCloudOptionalTypes EOF
            {
             newCompositeNode(grammarAccess.getCloudOptionalTypesRule()); 
            pushFollow(FOLLOW_ruleCloudOptionalTypes_in_entryRuleCloudOptionalTypes1930);
            iv_ruleCloudOptionalTypes=ruleCloudOptionalTypes();

            state._fsp--;

             current =iv_ruleCloudOptionalTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloudOptionalTypes1940); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloudOptionalTypes"


    // $ANTLR start "ruleCloudOptionalTypes"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:907:1: ruleCloudOptionalTypes returns [EObject current=null] : (this_ScriptType_0= ruleScriptType | this_GeoZoneType_1= ruleGeoZoneType | this_CloudUserType_2= ruleCloudUserType | this_CloudPasswordType_3= ruleCloudPasswordType ) ;
    public final EObject ruleCloudOptionalTypes() throws RecognitionException {
        EObject current = null;

        EObject this_ScriptType_0 = null;

        EObject this_GeoZoneType_1 = null;

        EObject this_CloudUserType_2 = null;

        EObject this_CloudPasswordType_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:910:28: ( (this_ScriptType_0= ruleScriptType | this_GeoZoneType_1= ruleGeoZoneType | this_CloudUserType_2= ruleCloudUserType | this_CloudPasswordType_3= ruleCloudPasswordType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:1: (this_ScriptType_0= ruleScriptType | this_GeoZoneType_1= ruleGeoZoneType | this_CloudUserType_2= ruleCloudUserType | this_CloudPasswordType_3= ruleCloudPasswordType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:1: (this_ScriptType_0= ruleScriptType | this_GeoZoneType_1= ruleGeoZoneType | this_CloudUserType_2= ruleCloudUserType | this_CloudPasswordType_3= ruleCloudPasswordType )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt10=1;
                    }
                    break;
                case 34:
                    {
                    alt10=4;
                    }
                    break;
                case 30:
                    {
                    alt10=2;
                    }
                    break;
                case 33:
                    {
                    alt10=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:5: this_ScriptType_0= ruleScriptType
                    {
                     
                            newCompositeNode(grammarAccess.getCloudOptionalTypesAccess().getScriptTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleScriptType_in_ruleCloudOptionalTypes1987);
                    this_ScriptType_0=ruleScriptType();

                    state._fsp--;

                     
                            current = this_ScriptType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:5: this_GeoZoneType_1= ruleGeoZoneType
                    {
                     
                            newCompositeNode(grammarAccess.getCloudOptionalTypesAccess().getGeoZoneTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGeoZoneType_in_ruleCloudOptionalTypes2014);
                    this_GeoZoneType_1=ruleGeoZoneType();

                    state._fsp--;

                     
                            current = this_GeoZoneType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:932:5: this_CloudUserType_2= ruleCloudUserType
                    {
                     
                            newCompositeNode(grammarAccess.getCloudOptionalTypesAccess().getCloudUserTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCloudUserType_in_ruleCloudOptionalTypes2041);
                    this_CloudUserType_2=ruleCloudUserType();

                    state._fsp--;

                     
                            current = this_CloudUserType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:942:5: this_CloudPasswordType_3= ruleCloudPasswordType
                    {
                     
                            newCompositeNode(grammarAccess.getCloudOptionalTypesAccess().getCloudPasswordTypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCloudPasswordType_in_ruleCloudOptionalTypes2068);
                    this_CloudPasswordType_3=ruleCloudPasswordType();

                    state._fsp--;

                     
                            current = this_CloudPasswordType_3; 
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
    // $ANTLR end "ruleCloudOptionalTypes"


    // $ANTLR start "entryRuleCloudType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:958:1: entryRuleCloudType returns [EObject current=null] : iv_ruleCloudType= ruleCloudType EOF ;
    public final EObject entryRuleCloudType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloudType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:959:2: (iv_ruleCloudType= ruleCloudType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:2: iv_ruleCloudType= ruleCloudType EOF
            {
             newCompositeNode(grammarAccess.getCloudTypeRule()); 
            pushFollow(FOLLOW_ruleCloudType_in_entryRuleCloudType2103);
            iv_ruleCloudType=ruleCloudType();

            state._fsp--;

             current =iv_ruleCloudType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloudType2113); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloudType"


    // $ANTLR start "ruleCloudType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:1: ruleCloudType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudType' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'G5000' | lv_type_3_2= 'AmazonEC2' | lv_type_3_3= 'Google' | lv_type_3_4= 'VirtualBox' ) ) ) ) ;
    public final EObject ruleCloudType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token lv_type_3_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:970:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudType' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'G5000' | lv_type_3_2= 'AmazonEC2' | lv_type_3_3= 'Google' | lv_type_3_4= 'VirtualBox' ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:971:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudType' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'G5000' | lv_type_3_2= 'AmazonEC2' | lv_type_3_3= 'Google' | lv_type_3_4= 'VirtualBox' ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:971:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudType' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'G5000' | lv_type_3_2= 'AmazonEC2' | lv_type_3_3= 'Google' | lv_type_3_4= 'VirtualBox' ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:971:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudType' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'G5000' | lv_type_3_2= 'AmazonEC2' | lv_type_3_3= 'Google' | lv_type_3_4= 'VirtualBox' ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:971:2: ( (lv_many_0_0= 'many' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:973:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleCloudType2156); 

                            newLeafNode(lv_many_0_0, grammarAccess.getCloudTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCloudTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:986:3: ( (lv_name_1_0= 'cloudType' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:987:1: (lv_name_1_0= 'cloudType' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:987:1: (lv_name_1_0= 'cloudType' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:3: lv_name_1_0= 'cloudType'
            {
            lv_name_1_0=(Token)match(input,24,FOLLOW_24_in_ruleCloudType2188); 

                    newLeafNode(lv_name_1_0, grammarAccess.getCloudTypeAccess().getNameCloudTypeKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "cloudType");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCloudType2213); 

                	newLeafNode(otherlv_2, grammarAccess.getCloudTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1005:1: ( ( (lv_type_3_1= 'G5000' | lv_type_3_2= 'AmazonEC2' | lv_type_3_3= 'Google' | lv_type_3_4= 'VirtualBox' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:1: ( (lv_type_3_1= 'G5000' | lv_type_3_2= 'AmazonEC2' | lv_type_3_3= 'Google' | lv_type_3_4= 'VirtualBox' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:1: ( (lv_type_3_1= 'G5000' | lv_type_3_2= 'AmazonEC2' | lv_type_3_3= 'Google' | lv_type_3_4= 'VirtualBox' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1007:1: (lv_type_3_1= 'G5000' | lv_type_3_2= 'AmazonEC2' | lv_type_3_3= 'Google' | lv_type_3_4= 'VirtualBox' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1007:1: (lv_type_3_1= 'G5000' | lv_type_3_2= 'AmazonEC2' | lv_type_3_3= 'Google' | lv_type_3_4= 'VirtualBox' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1008:3: lv_type_3_1= 'G5000'
                    {
                    lv_type_3_1=(Token)match(input,25,FOLLOW_25_in_ruleCloudType2233); 

                            newLeafNode(lv_type_3_1, grammarAccess.getCloudTypeAccess().getTypeG5000Keyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCloudTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1020:8: lv_type_3_2= 'AmazonEC2'
                    {
                    lv_type_3_2=(Token)match(input,26,FOLLOW_26_in_ruleCloudType2262); 

                            newLeafNode(lv_type_3_2, grammarAccess.getCloudTypeAccess().getTypeAmazonEC2Keyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCloudTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1032:8: lv_type_3_3= 'Google'
                    {
                    lv_type_3_3=(Token)match(input,27,FOLLOW_27_in_ruleCloudType2291); 

                            newLeafNode(lv_type_3_3, grammarAccess.getCloudTypeAccess().getTypeGoogleKeyword_3_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCloudTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1044:8: lv_type_3_4= 'VirtualBox'
                    {
                    lv_type_3_4=(Token)match(input,28,FOLLOW_28_in_ruleCloudType2320); 

                            newLeafNode(lv_type_3_4, grammarAccess.getCloudTypeAccess().getTypeVirtualBoxKeyword_3_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCloudTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_4, null);
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleCloudType"


    // $ANTLR start "entryRuleScriptType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:1: entryRuleScriptType returns [EObject current=null] : iv_ruleScriptType= ruleScriptType EOF ;
    public final EObject entryRuleScriptType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1068:2: (iv_ruleScriptType= ruleScriptType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1069:2: iv_ruleScriptType= ruleScriptType EOF
            {
             newCompositeNode(grammarAccess.getScriptTypeRule()); 
            pushFollow(FOLLOW_ruleScriptType_in_entryRuleScriptType2372);
            iv_ruleScriptType=ruleScriptType();

            state._fsp--;

             current =iv_ruleScriptType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptType2382); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScriptType"


    // $ANTLR start "ruleScriptType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:1: ruleScriptType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'newMachinesScript' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleScriptType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'newMachinesScript' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1080:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'newMachinesScript' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1080:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'newMachinesScript' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1080:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'newMachinesScript' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1080:2: ( (lv_many_0_0= 'many' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleScriptType2425); 

                            newLeafNode(lv_many_0_0, grammarAccess.getScriptTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScriptTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:3: ( (lv_name_1_0= 'newMachinesScript' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1096:1: (lv_name_1_0= 'newMachinesScript' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1096:1: (lv_name_1_0= 'newMachinesScript' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1097:3: lv_name_1_0= 'newMachinesScript'
            {
            lv_name_1_0=(Token)match(input,29,FOLLOW_29_in_ruleScriptType2457); 

                    newLeafNode(lv_name_1_0, grammarAccess.getScriptTypeAccess().getNameNewMachinesScriptKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "newMachinesScript");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleScriptType2482); 

                	newLeafNode(otherlv_2, grammarAccess.getScriptTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1116:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScriptType2499); 

            			newLeafNode(lv_type_3_0, grammarAccess.getScriptTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleScriptType"


    // $ANTLR start "entryRuleGeoZoneType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1140:1: entryRuleGeoZoneType returns [EObject current=null] : iv_ruleGeoZoneType= ruleGeoZoneType EOF ;
    public final EObject entryRuleGeoZoneType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeoZoneType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1141:2: (iv_ruleGeoZoneType= ruleGeoZoneType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1142:2: iv_ruleGeoZoneType= ruleGeoZoneType EOF
            {
             newCompositeNode(grammarAccess.getGeoZoneTypeRule()); 
            pushFollow(FOLLOW_ruleGeoZoneType_in_entryRuleGeoZoneType2540);
            iv_ruleGeoZoneType=ruleGeoZoneType();

            state._fsp--;

             current =iv_ruleGeoZoneType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeoZoneType2550); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeoZoneType"


    // $ANTLR start "ruleGeoZoneType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:1: ruleGeoZoneType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'geoZone' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleGeoZoneType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1152:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'geoZone' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'geoZone' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'geoZone' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'geoZone' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:2: ( (lv_many_0_0= 'many' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1154:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1154:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1155:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleGeoZoneType2593); 

                            newLeafNode(lv_many_0_0, grammarAccess.getGeoZoneTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeoZoneTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1168:3: ( (lv_name_1_0= 'geoZone' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: (lv_name_1_0= 'geoZone' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: (lv_name_1_0= 'geoZone' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:3: lv_name_1_0= 'geoZone'
            {
            lv_name_1_0=(Token)match(input,30,FOLLOW_30_in_ruleGeoZoneType2625); 

                    newLeafNode(lv_name_1_0, grammarAccess.getGeoZoneTypeAccess().getNameGeoZoneKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeoZoneTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "geoZone");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleGeoZoneType2650); 

                	newLeafNode(otherlv_2, grammarAccess.getGeoZoneTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1187:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1189:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGeoZoneType2667); 

            			newLeafNode(lv_type_3_0, grammarAccess.getGeoZoneTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeoZoneTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleGeoZoneType"


    // $ANTLR start "entryRuleMgmAddressType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1213:1: entryRuleMgmAddressType returns [EObject current=null] : iv_ruleMgmAddressType= ruleMgmAddressType EOF ;
    public final EObject entryRuleMgmAddressType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMgmAddressType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:2: (iv_ruleMgmAddressType= ruleMgmAddressType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1215:2: iv_ruleMgmAddressType= ruleMgmAddressType EOF
            {
             newCompositeNode(grammarAccess.getMgmAddressTypeRule()); 
            pushFollow(FOLLOW_ruleMgmAddressType_in_entryRuleMgmAddressType2708);
            iv_ruleMgmAddressType=ruleMgmAddressType();

            state._fsp--;

             current =iv_ruleMgmAddressType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMgmAddressType2718); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMgmAddressType"


    // $ANTLR start "ruleMgmAddressType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1222:1: ruleMgmAddressType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudMgmAddress' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleMgmAddressType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1225:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudMgmAddress' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudMgmAddress' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudMgmAddress' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudMgmAddress' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:2: ( (lv_many_0_0= 'many' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1227:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1227:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1228:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleMgmAddressType2761); 

                            newLeafNode(lv_many_0_0, grammarAccess.getMgmAddressTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMgmAddressTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:3: ( (lv_name_1_0= 'cloudMgmAddress' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:1: (lv_name_1_0= 'cloudMgmAddress' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:1: (lv_name_1_0= 'cloudMgmAddress' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:3: lv_name_1_0= 'cloudMgmAddress'
            {
            lv_name_1_0=(Token)match(input,31,FOLLOW_31_in_ruleMgmAddressType2793); 

                    newLeafNode(lv_name_1_0, grammarAccess.getMgmAddressTypeAccess().getNameCloudMgmAddressKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMgmAddressTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "cloudMgmAddress");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleMgmAddressType2818); 

                	newLeafNode(otherlv_2, grammarAccess.getMgmAddressTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1261:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1261:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMgmAddressType2835); 

            			newLeafNode(lv_type_3_0, grammarAccess.getMgmAddressTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMgmAddressTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleMgmAddressType"


    // $ANTLR start "entryRuleCloudCredentialType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1286:1: entryRuleCloudCredentialType returns [EObject current=null] : iv_ruleCloudCredentialType= ruleCloudCredentialType EOF ;
    public final EObject entryRuleCloudCredentialType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloudCredentialType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1287:2: (iv_ruleCloudCredentialType= ruleCloudCredentialType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1288:2: iv_ruleCloudCredentialType= ruleCloudCredentialType EOF
            {
             newCompositeNode(grammarAccess.getCloudCredentialTypeRule()); 
            pushFollow(FOLLOW_ruleCloudCredentialType_in_entryRuleCloudCredentialType2876);
            iv_ruleCloudCredentialType=ruleCloudCredentialType();

            state._fsp--;

             current =iv_ruleCloudCredentialType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloudCredentialType2886); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloudCredentialType"


    // $ANTLR start "ruleCloudCredentialType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1295:1: ruleCloudCredentialType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudCredential' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCloudCredentialType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1298:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudCredential' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1299:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudCredential' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1299:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudCredential' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1299:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudCredential' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1299:2: ( (lv_many_0_0= 'many' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1300:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1300:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1301:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleCloudCredentialType2929); 

                            newLeafNode(lv_many_0_0, grammarAccess.getCloudCredentialTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCloudCredentialTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:3: ( (lv_name_1_0= 'cloudCredential' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1315:1: (lv_name_1_0= 'cloudCredential' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1315:1: (lv_name_1_0= 'cloudCredential' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1316:3: lv_name_1_0= 'cloudCredential'
            {
            lv_name_1_0=(Token)match(input,32,FOLLOW_32_in_ruleCloudCredentialType2961); 

                    newLeafNode(lv_name_1_0, grammarAccess.getCloudCredentialTypeAccess().getNameCloudCredentialKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudCredentialTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "cloudCredential");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCloudCredentialType2986); 

                	newLeafNode(otherlv_2, grammarAccess.getCloudCredentialTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1333:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1334:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1334:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1335:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCloudCredentialType3003); 

            			newLeafNode(lv_type_3_0, grammarAccess.getCloudCredentialTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudCredentialTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleCloudCredentialType"


    // $ANTLR start "entryRuleCloudUserType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:1: entryRuleCloudUserType returns [EObject current=null] : iv_ruleCloudUserType= ruleCloudUserType EOF ;
    public final EObject entryRuleCloudUserType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloudUserType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1360:2: (iv_ruleCloudUserType= ruleCloudUserType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1361:2: iv_ruleCloudUserType= ruleCloudUserType EOF
            {
             newCompositeNode(grammarAccess.getCloudUserTypeRule()); 
            pushFollow(FOLLOW_ruleCloudUserType_in_entryRuleCloudUserType3044);
            iv_ruleCloudUserType=ruleCloudUserType();

            state._fsp--;

             current =iv_ruleCloudUserType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloudUserType3054); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloudUserType"


    // $ANTLR start "ruleCloudUserType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1368:1: ruleCloudUserType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudUser' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCloudUserType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1371:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudUser' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudUser' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudUser' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudUser' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:2: ( (lv_many_0_0= 'many' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1374:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleCloudUserType3097); 

                            newLeafNode(lv_many_0_0, grammarAccess.getCloudUserTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCloudUserTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1387:3: ( (lv_name_1_0= 'cloudUser' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1388:1: (lv_name_1_0= 'cloudUser' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1388:1: (lv_name_1_0= 'cloudUser' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1389:3: lv_name_1_0= 'cloudUser'
            {
            lv_name_1_0=(Token)match(input,33,FOLLOW_33_in_ruleCloudUserType3129); 

                    newLeafNode(lv_name_1_0, grammarAccess.getCloudUserTypeAccess().getNameCloudUserKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudUserTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "cloudUser");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCloudUserType3154); 

                	newLeafNode(otherlv_2, grammarAccess.getCloudUserTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1407:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1407:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1408:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCloudUserType3171); 

            			newLeafNode(lv_type_3_0, grammarAccess.getCloudUserTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudUserTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleCloudUserType"


    // $ANTLR start "entryRuleCloudPasswordType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:1: entryRuleCloudPasswordType returns [EObject current=null] : iv_ruleCloudPasswordType= ruleCloudPasswordType EOF ;
    public final EObject entryRuleCloudPasswordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloudPasswordType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:2: (iv_ruleCloudPasswordType= ruleCloudPasswordType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1434:2: iv_ruleCloudPasswordType= ruleCloudPasswordType EOF
            {
             newCompositeNode(grammarAccess.getCloudPasswordTypeRule()); 
            pushFollow(FOLLOW_ruleCloudPasswordType_in_entryRuleCloudPasswordType3212);
            iv_ruleCloudPasswordType=ruleCloudPasswordType();

            state._fsp--;

             current =iv_ruleCloudPasswordType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloudPasswordType3222); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloudPasswordType"


    // $ANTLR start "ruleCloudPasswordType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1441:1: ruleCloudPasswordType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudPassword' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCloudPasswordType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudPassword' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1445:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudPassword' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1445:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudPassword' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1445:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'cloudPassword' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1445:2: ( (lv_many_0_0= 'many' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1446:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1446:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleCloudPasswordType3265); 

                            newLeafNode(lv_many_0_0, grammarAccess.getCloudPasswordTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCloudPasswordTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1460:3: ( (lv_name_1_0= 'cloudPassword' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1461:1: (lv_name_1_0= 'cloudPassword' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1461:1: (lv_name_1_0= 'cloudPassword' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1462:3: lv_name_1_0= 'cloudPassword'
            {
            lv_name_1_0=(Token)match(input,34,FOLLOW_34_in_ruleCloudPasswordType3297); 

                    newLeafNode(lv_name_1_0, grammarAccess.getCloudPasswordTypeAccess().getNameCloudPasswordKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudPasswordTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "cloudPassword");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCloudPasswordType3322); 

                	newLeafNode(otherlv_2, grammarAccess.getCloudPasswordTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1479:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1480:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1480:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1481:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCloudPasswordType3339); 

            			newLeafNode(lv_type_3_0, grammarAccess.getCloudPasswordTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCloudPasswordTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleCloudPasswordType"


    // $ANTLR start "entryRuleDeploy"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1505:1: entryRuleDeploy returns [EObject current=null] : iv_ruleDeploy= ruleDeploy EOF ;
    public final EObject entryRuleDeploy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploy = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:2: (iv_ruleDeploy= ruleDeploy EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1507:2: iv_ruleDeploy= ruleDeploy EOF
            {
             newCompositeNode(grammarAccess.getDeployRule()); 
            pushFollow(FOLLOW_ruleDeploy_in_entryRuleDeploy3380);
            iv_ruleDeploy=ruleDeploy();

            state._fsp--;

             current =iv_ruleDeploy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeploy3390); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1514:1: ruleDeploy returns [EObject current=null] : (otherlv_0= 'deploy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployOne_3_0= ruleDeployAppFeature ) ) ( (lv_deployTwo_4_0= ruleDeployTypeFeature ) )? otherlv_5= '}' ) ;
    public final EObject ruleDeploy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_deployOne_3_0 = null;

        EObject lv_deployTwo_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1517:28: ( (otherlv_0= 'deploy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployOne_3_0= ruleDeployAppFeature ) ) ( (lv_deployTwo_4_0= ruleDeployTypeFeature ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:1: (otherlv_0= 'deploy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployOne_3_0= ruleDeployAppFeature ) ) ( (lv_deployTwo_4_0= ruleDeployTypeFeature ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:1: (otherlv_0= 'deploy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployOne_3_0= ruleDeployAppFeature ) ) ( (lv_deployTwo_4_0= ruleDeployTypeFeature ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:3: otherlv_0= 'deploy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployOne_3_0= ruleDeployAppFeature ) ) ( (lv_deployTwo_4_0= ruleDeployTypeFeature ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleDeploy3427); 

                	newLeafNode(otherlv_0, grammarAccess.getDeployAccess().getDeployKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1522:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeploy3444); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeployAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDeploy3461); 

                	newLeafNode(otherlv_2, grammarAccess.getDeployAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:1: ( (lv_deployOne_3_0= ruleDeployAppFeature ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1545:1: (lv_deployOne_3_0= ruleDeployAppFeature )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1545:1: (lv_deployOne_3_0= ruleDeployAppFeature )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1546:3: lv_deployOne_3_0= ruleDeployAppFeature
            {
             
            	        newCompositeNode(grammarAccess.getDeployAccess().getDeployOneDeployAppFeatureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDeployAppFeature_in_ruleDeploy3482);
            lv_deployOne_3_0=ruleDeployAppFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeployRule());
            	        }
                   		add(
                   			current, 
                   			"deployOne",
                    		lv_deployOne_3_0, 
                    		"DeployAppFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:2: ( (lv_deployTwo_4_0= ruleDeployTypeFeature ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14||LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1563:1: (lv_deployTwo_4_0= ruleDeployTypeFeature )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1563:1: (lv_deployTwo_4_0= ruleDeployTypeFeature )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1564:3: lv_deployTwo_4_0= ruleDeployTypeFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeployAccess().getDeployTwoDeployTypeFeatureParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDeployTypeFeature_in_ruleDeploy3503);
                    lv_deployTwo_4_0=ruleDeployTypeFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeployRule());
                    	        }
                           		add(
                           			current, 
                           			"deployTwo",
                            		lv_deployTwo_4_0, 
                            		"DeployTypeFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDeploy3516); 

                	newLeafNode(otherlv_5, grammarAccess.getDeployAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleDeployAppFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1592:1: entryRuleDeployAppFeature returns [EObject current=null] : iv_ruleDeployAppFeature= ruleDeployAppFeature EOF ;
    public final EObject entryRuleDeployAppFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployAppFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1593:2: (iv_ruleDeployAppFeature= ruleDeployAppFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1594:2: iv_ruleDeployAppFeature= ruleDeployAppFeature EOF
            {
             newCompositeNode(grammarAccess.getDeployAppFeatureRule()); 
            pushFollow(FOLLOW_ruleDeployAppFeature_in_entryRuleDeployAppFeature3552);
            iv_ruleDeployAppFeature=ruleDeployAppFeature();

            state._fsp--;

             current =iv_ruleDeployAppFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeployAppFeature3562); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployAppFeature"


    // $ANTLR start "ruleDeployAppFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1601:1: ruleDeployAppFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployApp' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDeployAppFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1604:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployApp' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1605:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployApp' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1605:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployApp' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1605:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployApp' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1605:2: ( (lv_many_0_0= 'many' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1606:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1606:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1607:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleDeployAppFeature3605); 

                            newLeafNode(lv_many_0_0, grammarAccess.getDeployAppFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeployAppFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1620:3: ( (lv_name_1_0= 'deployApp' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1621:1: (lv_name_1_0= 'deployApp' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1621:1: (lv_name_1_0= 'deployApp' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1622:3: lv_name_1_0= 'deployApp'
            {
            lv_name_1_0=(Token)match(input,36,FOLLOW_36_in_ruleDeployAppFeature3637); 

                    newLeafNode(lv_name_1_0, grammarAccess.getDeployAppFeatureAccess().getNameDeployAppKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployAppFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "deployApp");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDeployAppFeature3662); 

                	newLeafNode(otherlv_2, grammarAccess.getDeployAppFeatureAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1639:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1641:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployAppFeatureRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeployAppFeature3682); 

            		newLeafNode(otherlv_3, grammarAccess.getDeployAppFeatureAccess().getTypeDeployAppCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleDeployAppFeature"


    // $ANTLR start "entryRuleDeployTypeFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1660:1: entryRuleDeployTypeFeature returns [EObject current=null] : iv_ruleDeployTypeFeature= ruleDeployTypeFeature EOF ;
    public final EObject entryRuleDeployTypeFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployTypeFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1661:2: (iv_ruleDeployTypeFeature= ruleDeployTypeFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1662:2: iv_ruleDeployTypeFeature= ruleDeployTypeFeature EOF
            {
             newCompositeNode(grammarAccess.getDeployTypeFeatureRule()); 
            pushFollow(FOLLOW_ruleDeployTypeFeature_in_entryRuleDeployTypeFeature3718);
            iv_ruleDeployTypeFeature=ruleDeployTypeFeature();

            state._fsp--;

             current =iv_ruleDeployTypeFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeployTypeFeature3728); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployTypeFeature"


    // $ANTLR start "ruleDeployTypeFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1669:1: ruleDeployTypeFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployType' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDeployTypeFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1672:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployType' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1673:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployType' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1673:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployType' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1673:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployType' ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1673:2: ( (lv_many_0_0= 'many' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1674:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1674:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1675:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleDeployTypeFeature3771); 

                            newLeafNode(lv_many_0_0, grammarAccess.getDeployTypeFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeployTypeFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1688:3: ( (lv_name_1_0= 'deployType' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:1: (lv_name_1_0= 'deployType' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:1: (lv_name_1_0= 'deployType' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1690:3: lv_name_1_0= 'deployType'
            {
            lv_name_1_0=(Token)match(input,37,FOLLOW_37_in_ruleDeployTypeFeature3803); 

                    newLeafNode(lv_name_1_0, grammarAccess.getDeployTypeFeatureAccess().getNameDeployTypeKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployTypeFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "deployType");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDeployTypeFeature3828); 

                	newLeafNode(otherlv_2, grammarAccess.getDeployTypeFeatureAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1707:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployTypeFeatureRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeployTypeFeature3848); 

            		newLeafNode(otherlv_3, grammarAccess.getDeployTypeFeatureAccess().getTypeDeployTypeCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleDeployTypeFeature"


    // $ANTLR start "entryRuleDeployType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1728:1: entryRuleDeployType returns [EObject current=null] : iv_ruleDeployType= ruleDeployType EOF ;
    public final EObject entryRuleDeployType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1729:2: (iv_ruleDeployType= ruleDeployType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1730:2: iv_ruleDeployType= ruleDeployType EOF
            {
             newCompositeNode(grammarAccess.getDeployTypeRule()); 
            pushFollow(FOLLOW_ruleDeployType_in_entryRuleDeployType3884);
            iv_ruleDeployType=ruleDeployType();

            state._fsp--;

             current =iv_ruleDeployType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeployType3894); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployType"


    // $ANTLR start "ruleDeployType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1737:1: ruleDeployType returns [EObject current=null] : (otherlv_0= 'deployType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleDeployRangeType ) ) otherlv_4= '}' ) ;
    public final EObject ruleDeployType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_range_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1740:28: ( (otherlv_0= 'deployType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleDeployRangeType ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:1: (otherlv_0= 'deployType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleDeployRangeType ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:1: (otherlv_0= 'deployType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleDeployRangeType ) ) otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:3: otherlv_0= 'deployType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleDeployRangeType ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleDeployType3931); 

                	newLeafNode(otherlv_0, grammarAccess.getDeployTypeAccess().getDeployTypeKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1745:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1746:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1746:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeployType3948); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeployTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDeployType3965); 

                	newLeafNode(otherlv_2, grammarAccess.getDeployTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1767:1: ( (lv_range_3_0= ruleDeployRangeType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:1: (lv_range_3_0= ruleDeployRangeType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:1: (lv_range_3_0= ruleDeployRangeType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1769:3: lv_range_3_0= ruleDeployRangeType
            {
             
            	        newCompositeNode(grammarAccess.getDeployTypeAccess().getRangeDeployRangeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDeployRangeType_in_ruleDeployType3986);
            lv_range_3_0=ruleDeployRangeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeployTypeRule());
            	        }
                   		add(
                   			current, 
                   			"range",
                    		lv_range_3_0, 
                    		"DeployRangeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDeployType3998); 

                	newLeafNode(otherlv_4, grammarAccess.getDeployTypeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleDeployType"


    // $ANTLR start "entryRuleDeployRangeType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1797:1: entryRuleDeployRangeType returns [EObject current=null] : iv_ruleDeployRangeType= ruleDeployRangeType EOF ;
    public final EObject entryRuleDeployRangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployRangeType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:2: (iv_ruleDeployRangeType= ruleDeployRangeType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:2: iv_ruleDeployRangeType= ruleDeployRangeType EOF
            {
             newCompositeNode(grammarAccess.getDeployRangeTypeRule()); 
            pushFollow(FOLLOW_ruleDeployRangeType_in_entryRuleDeployRangeType4034);
            iv_ruleDeployRangeType=ruleDeployRangeType();

            state._fsp--;

             current =iv_ruleDeployRangeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeployRangeType4044); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployRangeType"


    // $ANTLR start "ruleDeployRangeType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1806:1: ruleDeployRangeType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeployRangeType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1809:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:2: ( (lv_many_0_0= 'many' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1812:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleDeployRangeType4087); 

                            newLeafNode(lv_many_0_0, grammarAccess.getDeployRangeTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeployRangeTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1825:3: ( (lv_name_1_0= 'range' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1826:1: (lv_name_1_0= 'range' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1826:1: (lv_name_1_0= 'range' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1827:3: lv_name_1_0= 'range'
            {
            lv_name_1_0=(Token)match(input,38,FOLLOW_38_in_ruleDeployRangeType4119); 

                    newLeafNode(lv_name_1_0, grammarAccess.getDeployRangeTypeAccess().getNameRangeKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployRangeTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "range");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDeployRangeType4144); 

                	newLeafNode(otherlv_2, grammarAccess.getDeployRangeTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1844:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1845:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1845:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1846:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeployRangeType4161); 

            			newLeafNode(lv_type_3_0, grammarAccess.getDeployRangeTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployRangeTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleDeployRangeType"


    // $ANTLR start "entryRuleDeployApp"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1870:1: entryRuleDeployApp returns [EObject current=null] : iv_ruleDeployApp= ruleDeployApp EOF ;
    public final EObject entryRuleDeployApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployApp = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1871:2: (iv_ruleDeployApp= ruleDeployApp EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1872:2: iv_ruleDeployApp= ruleDeployApp EOF
            {
             newCompositeNode(grammarAccess.getDeployAppRule()); 
            pushFollow(FOLLOW_ruleDeployApp_in_entryRuleDeployApp4202);
            iv_ruleDeployApp=ruleDeployApp();

            state._fsp--;

             current =iv_ruleDeployApp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeployApp4212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployApp"


    // $ANTLR start "ruleDeployApp"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1879:1: ruleDeployApp returns [EObject current=null] : (otherlv_0= 'deployApp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_class_3_0= ruleDeployAppClassType ) ) ( (lv_deployMasterMethod_4_0= ruleDeployAppMasterMethodType ) )* ( (lv_deploySlaveMethod_5_0= ruleDeployAppSlaveMethodType ) )* otherlv_6= '}' ) ;
    public final EObject ruleDeployApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_class_3_0 = null;

        EObject lv_deployMasterMethod_4_0 = null;

        EObject lv_deploySlaveMethod_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1882:28: ( (otherlv_0= 'deployApp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_class_3_0= ruleDeployAppClassType ) ) ( (lv_deployMasterMethod_4_0= ruleDeployAppMasterMethodType ) )* ( (lv_deploySlaveMethod_5_0= ruleDeployAppSlaveMethodType ) )* otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:1: (otherlv_0= 'deployApp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_class_3_0= ruleDeployAppClassType ) ) ( (lv_deployMasterMethod_4_0= ruleDeployAppMasterMethodType ) )* ( (lv_deploySlaveMethod_5_0= ruleDeployAppSlaveMethodType ) )* otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:1: (otherlv_0= 'deployApp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_class_3_0= ruleDeployAppClassType ) ) ( (lv_deployMasterMethod_4_0= ruleDeployAppMasterMethodType ) )* ( (lv_deploySlaveMethod_5_0= ruleDeployAppSlaveMethodType ) )* otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:3: otherlv_0= 'deployApp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_class_3_0= ruleDeployAppClassType ) ) ( (lv_deployMasterMethod_4_0= ruleDeployAppMasterMethodType ) )* ( (lv_deploySlaveMethod_5_0= ruleDeployAppSlaveMethodType ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleDeployApp4249); 

                	newLeafNode(otherlv_0, grammarAccess.getDeployAppAccess().getDeployAppKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1887:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1888:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1888:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1889:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeployApp4266); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeployAppAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployAppRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDeployApp4283); 

                	newLeafNode(otherlv_2, grammarAccess.getDeployAppAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1909:1: ( (lv_class_3_0= ruleDeployAppClassType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1910:1: (lv_class_3_0= ruleDeployAppClassType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1910:1: (lv_class_3_0= ruleDeployAppClassType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1911:3: lv_class_3_0= ruleDeployAppClassType
            {
             
            	        newCompositeNode(grammarAccess.getDeployAppAccess().getClassDeployAppClassTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDeployAppClassType_in_ruleDeployApp4304);
            lv_class_3_0=ruleDeployAppClassType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeployAppRule());
            	        }
                   		add(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"DeployAppClassType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:2: ( (lv_deployMasterMethod_4_0= ruleDeployAppMasterMethodType ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==40) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1928:1: (lv_deployMasterMethod_4_0= ruleDeployAppMasterMethodType )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1928:1: (lv_deployMasterMethod_4_0= ruleDeployAppMasterMethodType )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1929:3: lv_deployMasterMethod_4_0= ruleDeployAppMasterMethodType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeployAppAccess().getDeployMasterMethodDeployAppMasterMethodTypeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeployAppMasterMethodType_in_ruleDeployApp4325);
            	    lv_deployMasterMethod_4_0=ruleDeployAppMasterMethodType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeployAppRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"deployMasterMethod",
            	            		lv_deployMasterMethod_4_0, 
            	            		"DeployAppMasterMethodType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1945:3: ( (lv_deploySlaveMethod_5_0= ruleDeployAppSlaveMethodType ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14||LA24_0==41) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1946:1: (lv_deploySlaveMethod_5_0= ruleDeployAppSlaveMethodType )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1946:1: (lv_deploySlaveMethod_5_0= ruleDeployAppSlaveMethodType )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1947:3: lv_deploySlaveMethod_5_0= ruleDeployAppSlaveMethodType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeployAppAccess().getDeploySlaveMethodDeployAppSlaveMethodTypeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeployAppSlaveMethodType_in_ruleDeployApp4347);
            	    lv_deploySlaveMethod_5_0=ruleDeployAppSlaveMethodType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeployAppRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"deploySlaveMethod",
            	            		lv_deploySlaveMethod_5_0, 
            	            		"DeployAppSlaveMethodType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleDeployApp4360); 

                	newLeafNode(otherlv_6, grammarAccess.getDeployAppAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleDeployApp"


    // $ANTLR start "entryRuleDeployAppClassType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:1: entryRuleDeployAppClassType returns [EObject current=null] : iv_ruleDeployAppClassType= ruleDeployAppClassType EOF ;
    public final EObject entryRuleDeployAppClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployAppClassType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1976:2: (iv_ruleDeployAppClassType= ruleDeployAppClassType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1977:2: iv_ruleDeployAppClassType= ruleDeployAppClassType EOF
            {
             newCompositeNode(grammarAccess.getDeployAppClassTypeRule()); 
            pushFollow(FOLLOW_ruleDeployAppClassType_in_entryRuleDeployAppClassType4396);
            iv_ruleDeployAppClassType=ruleDeployAppClassType();

            state._fsp--;

             current =iv_ruleDeployAppClassType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeployAppClassType4406); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployAppClassType"


    // $ANTLR start "ruleDeployAppClassType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1984:1: ruleDeployAppClassType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'class' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeployAppClassType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1987:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'class' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1988:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'class' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1988:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'class' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1988:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'class' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1988:2: ( (lv_many_0_0= 'many' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1989:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1989:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1990:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleDeployAppClassType4449); 

                            newLeafNode(lv_many_0_0, grammarAccess.getDeployAppClassTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeployAppClassTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2003:3: ( (lv_name_1_0= 'class' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2004:1: (lv_name_1_0= 'class' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2004:1: (lv_name_1_0= 'class' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2005:3: lv_name_1_0= 'class'
            {
            lv_name_1_0=(Token)match(input,39,FOLLOW_39_in_ruleDeployAppClassType4481); 

                    newLeafNode(lv_name_1_0, grammarAccess.getDeployAppClassTypeAccess().getNameClassKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployAppClassTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "class");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDeployAppClassType4506); 

                	newLeafNode(otherlv_2, grammarAccess.getDeployAppClassTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2022:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2023:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2023:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2024:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeployAppClassType4523); 

            			newLeafNode(lv_type_3_0, grammarAccess.getDeployAppClassTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployAppClassTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleDeployAppClassType"


    // $ANTLR start "entryRuleDeployAppMasterMethodType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2048:1: entryRuleDeployAppMasterMethodType returns [EObject current=null] : iv_ruleDeployAppMasterMethodType= ruleDeployAppMasterMethodType EOF ;
    public final EObject entryRuleDeployAppMasterMethodType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployAppMasterMethodType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:2: (iv_ruleDeployAppMasterMethodType= ruleDeployAppMasterMethodType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2050:2: iv_ruleDeployAppMasterMethodType= ruleDeployAppMasterMethodType EOF
            {
             newCompositeNode(grammarAccess.getDeployAppMasterMethodTypeRule()); 
            pushFollow(FOLLOW_ruleDeployAppMasterMethodType_in_entryRuleDeployAppMasterMethodType4564);
            iv_ruleDeployAppMasterMethodType=ruleDeployAppMasterMethodType();

            state._fsp--;

             current =iv_ruleDeployAppMasterMethodType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeployAppMasterMethodType4574); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployAppMasterMethodType"


    // $ANTLR start "ruleDeployAppMasterMethodType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2057:1: ruleDeployAppMasterMethodType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployMasterMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeployAppMasterMethodType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2060:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployMasterMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2061:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployMasterMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2061:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployMasterMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2061:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deployMasterMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2061:2: ( (lv_many_0_0= 'many' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2062:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2062:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleDeployAppMasterMethodType4617); 

                            newLeafNode(lv_many_0_0, grammarAccess.getDeployAppMasterMethodTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeployAppMasterMethodTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2076:3: ( (lv_name_1_0= 'deployMasterMethod' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:1: (lv_name_1_0= 'deployMasterMethod' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:1: (lv_name_1_0= 'deployMasterMethod' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2078:3: lv_name_1_0= 'deployMasterMethod'
            {
            lv_name_1_0=(Token)match(input,40,FOLLOW_40_in_ruleDeployAppMasterMethodType4649); 

                    newLeafNode(lv_name_1_0, grammarAccess.getDeployAppMasterMethodTypeAccess().getNameDeployMasterMethodKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployAppMasterMethodTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "deployMasterMethod");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDeployAppMasterMethodType4674); 

                	newLeafNode(otherlv_2, grammarAccess.getDeployAppMasterMethodTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2095:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2096:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2096:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2097:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeployAppMasterMethodType4691); 

            			newLeafNode(lv_type_3_0, grammarAccess.getDeployAppMasterMethodTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployAppMasterMethodTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleDeployAppMasterMethodType"


    // $ANTLR start "entryRuleDeployAppSlaveMethodType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2121:1: entryRuleDeployAppSlaveMethodType returns [EObject current=null] : iv_ruleDeployAppSlaveMethodType= ruleDeployAppSlaveMethodType EOF ;
    public final EObject entryRuleDeployAppSlaveMethodType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployAppSlaveMethodType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2122:2: (iv_ruleDeployAppSlaveMethodType= ruleDeployAppSlaveMethodType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2123:2: iv_ruleDeployAppSlaveMethodType= ruleDeployAppSlaveMethodType EOF
            {
             newCompositeNode(grammarAccess.getDeployAppSlaveMethodTypeRule()); 
            pushFollow(FOLLOW_ruleDeployAppSlaveMethodType_in_entryRuleDeployAppSlaveMethodType4732);
            iv_ruleDeployAppSlaveMethodType=ruleDeployAppSlaveMethodType();

            state._fsp--;

             current =iv_ruleDeployAppSlaveMethodType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeployAppSlaveMethodType4742); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployAppSlaveMethodType"


    // $ANTLR start "ruleDeployAppSlaveMethodType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2130:1: ruleDeployAppSlaveMethodType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deploySlaveMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeployAppSlaveMethodType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2133:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deploySlaveMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2134:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deploySlaveMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2134:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deploySlaveMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2134:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'deploySlaveMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2134:2: ( (lv_many_0_0= 'many' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2135:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2135:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2136:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleDeployAppSlaveMethodType4785); 

                            newLeafNode(lv_many_0_0, grammarAccess.getDeployAppSlaveMethodTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeployAppSlaveMethodTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:3: ( (lv_name_1_0= 'deploySlaveMethod' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2150:1: (lv_name_1_0= 'deploySlaveMethod' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2150:1: (lv_name_1_0= 'deploySlaveMethod' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2151:3: lv_name_1_0= 'deploySlaveMethod'
            {
            lv_name_1_0=(Token)match(input,41,FOLLOW_41_in_ruleDeployAppSlaveMethodType4817); 

                    newLeafNode(lv_name_1_0, grammarAccess.getDeployAppSlaveMethodTypeAccess().getNameDeploySlaveMethodKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployAppSlaveMethodTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "deploySlaveMethod");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDeployAppSlaveMethodType4842); 

                	newLeafNode(otherlv_2, grammarAccess.getDeployAppSlaveMethodTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2168:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2169:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2169:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2170:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeployAppSlaveMethodType4859); 

            			newLeafNode(lv_type_3_0, grammarAccess.getDeployAppSlaveMethodTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeployAppSlaveMethodTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleDeployAppSlaveMethodType"


    // $ANTLR start "entryRuleMonitor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2194:1: entryRuleMonitor returns [EObject current=null] : iv_ruleMonitor= ruleMonitor EOF ;
    public final EObject entryRuleMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitor = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2195:2: (iv_ruleMonitor= ruleMonitor EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:2: iv_ruleMonitor= ruleMonitor EOF
            {
             newCompositeNode(grammarAccess.getMonitorRule()); 
            pushFollow(FOLLOW_ruleMonitor_in_entryRuleMonitor4900);
            iv_ruleMonitor=ruleMonitor();

            state._fsp--;

             current =iv_ruleMonitor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonitor4910); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitor"


    // $ANTLR start "ruleMonitor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2203:1: ruleMonitor returns [EObject current=null] : (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleMonitorRangeType ) ) ( (lv_monitoringType_4_0= ruleMonitoringType ) )? otherlv_5= '}' ) ;
    public final EObject ruleMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_range_3_0 = null;

        EObject lv_monitoringType_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2206:28: ( (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleMonitorRangeType ) ) ( (lv_monitoringType_4_0= ruleMonitoringType ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2207:1: (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleMonitorRangeType ) ) ( (lv_monitoringType_4_0= ruleMonitoringType ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2207:1: (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleMonitorRangeType ) ) ( (lv_monitoringType_4_0= ruleMonitoringType ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2207:3: otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleMonitorRangeType ) ) ( (lv_monitoringType_4_0= ruleMonitoringType ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleMonitor4947); 

                	newLeafNode(otherlv_0, grammarAccess.getMonitorAccess().getMonitorKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2211:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2212:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2212:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2213:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMonitor4964); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMonitorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMonitorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMonitor4981); 

                	newLeafNode(otherlv_2, grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2233:1: ( (lv_range_3_0= ruleMonitorRangeType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2234:1: (lv_range_3_0= ruleMonitorRangeType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2234:1: (lv_range_3_0= ruleMonitorRangeType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2235:3: lv_range_3_0= ruleMonitorRangeType
            {
             
            	        newCompositeNode(grammarAccess.getMonitorAccess().getRangeMonitorRangeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMonitorRangeType_in_ruleMonitor5002);
            lv_range_3_0=ruleMonitorRangeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMonitorRule());
            	        }
                   		add(
                   			current, 
                   			"range",
                    		lv_range_3_0, 
                    		"MonitorRangeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2251:2: ( (lv_monitoringType_4_0= ruleMonitoringType ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14||LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2252:1: (lv_monitoringType_4_0= ruleMonitoringType )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2252:1: (lv_monitoringType_4_0= ruleMonitoringType )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2253:3: lv_monitoringType_4_0= ruleMonitoringType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMonitorAccess().getMonitoringTypeMonitoringTypeParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMonitoringType_in_ruleMonitor5023);
                    lv_monitoringType_4_0=ruleMonitoringType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMonitorRule());
                    	        }
                           		add(
                           			current, 
                           			"monitoringType",
                            		lv_monitoringType_4_0, 
                            		"MonitoringType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMonitor5036); 

                	newLeafNode(otherlv_5, grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleMonitor"


    // $ANTLR start "entryRuleMonitorRangeType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2281:1: entryRuleMonitorRangeType returns [EObject current=null] : iv_ruleMonitorRangeType= ruleMonitorRangeType EOF ;
    public final EObject entryRuleMonitorRangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorRangeType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2282:2: (iv_ruleMonitorRangeType= ruleMonitorRangeType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2283:2: iv_ruleMonitorRangeType= ruleMonitorRangeType EOF
            {
             newCompositeNode(grammarAccess.getMonitorRangeTypeRule()); 
            pushFollow(FOLLOW_ruleMonitorRangeType_in_entryRuleMonitorRangeType5072);
            iv_ruleMonitorRangeType=ruleMonitorRangeType();

            state._fsp--;

             current =iv_ruleMonitorRangeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonitorRangeType5082); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitorRangeType"


    // $ANTLR start "ruleMonitorRangeType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2290:1: ruleMonitorRangeType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleMonitorRangeType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2293:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2294:2: ( (lv_many_0_0= 'many' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2295:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2295:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2296:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleMonitorRangeType5125); 

                            newLeafNode(lv_many_0_0, grammarAccess.getMonitorRangeTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonitorRangeTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2309:3: ( (lv_name_1_0= 'range' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2310:1: (lv_name_1_0= 'range' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2310:1: (lv_name_1_0= 'range' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2311:3: lv_name_1_0= 'range'
            {
            lv_name_1_0=(Token)match(input,38,FOLLOW_38_in_ruleMonitorRangeType5157); 

                    newLeafNode(lv_name_1_0, grammarAccess.getMonitorRangeTypeAccess().getNameRangeKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMonitorRangeTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "range");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleMonitorRangeType5182); 

                	newLeafNode(otherlv_2, grammarAccess.getMonitorRangeTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2328:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2329:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2329:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2330:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMonitorRangeType5199); 

            			newLeafNode(lv_type_3_0, grammarAccess.getMonitorRangeTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMonitorRangeTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleMonitorRangeType"


    // $ANTLR start "entryRuleMonitoringType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2354:1: entryRuleMonitoringType returns [EObject current=null] : iv_ruleMonitoringType= ruleMonitoringType EOF ;
    public final EObject entryRuleMonitoringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2355:2: (iv_ruleMonitoringType= ruleMonitoringType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2356:2: iv_ruleMonitoringType= ruleMonitoringType EOF
            {
             newCompositeNode(grammarAccess.getMonitoringTypeRule()); 
            pushFollow(FOLLOW_ruleMonitoringType_in_entryRuleMonitoringType5240);
            iv_ruleMonitoringType=ruleMonitoringType();

            state._fsp--;

             current =iv_ruleMonitoringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonitoringType5250); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitoringType"


    // $ANTLR start "ruleMonitoringType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2363:1: ruleMonitoringType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'monitoringType' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'reactive' | lv_type_3_2= 'predictive' ) ) ) ) ;
    public final EObject ruleMonitoringType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2366:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'monitoringType' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'reactive' | lv_type_3_2= 'predictive' ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2367:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'monitoringType' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'reactive' | lv_type_3_2= 'predictive' ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2367:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'monitoringType' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'reactive' | lv_type_3_2= 'predictive' ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2367:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'monitoringType' ) ) otherlv_2= ':' ( ( (lv_type_3_1= 'reactive' | lv_type_3_2= 'predictive' ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2367:2: ( (lv_many_0_0= 'many' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2368:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2368:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2369:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleMonitoringType5293); 

                            newLeafNode(lv_many_0_0, grammarAccess.getMonitoringTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonitoringTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2382:3: ( (lv_name_1_0= 'monitoringType' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2383:1: (lv_name_1_0= 'monitoringType' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2383:1: (lv_name_1_0= 'monitoringType' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2384:3: lv_name_1_0= 'monitoringType'
            {
            lv_name_1_0=(Token)match(input,43,FOLLOW_43_in_ruleMonitoringType5325); 

                    newLeafNode(lv_name_1_0, grammarAccess.getMonitoringTypeAccess().getNameMonitoringTypeKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMonitoringTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "monitoringType");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleMonitoringType5350); 

                	newLeafNode(otherlv_2, grammarAccess.getMonitoringTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2401:1: ( ( (lv_type_3_1= 'reactive' | lv_type_3_2= 'predictive' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2402:1: ( (lv_type_3_1= 'reactive' | lv_type_3_2= 'predictive' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2402:1: ( (lv_type_3_1= 'reactive' | lv_type_3_2= 'predictive' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2403:1: (lv_type_3_1= 'reactive' | lv_type_3_2= 'predictive' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2403:1: (lv_type_3_1= 'reactive' | lv_type_3_2= 'predictive' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            else if ( (LA31_0==45) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2404:3: lv_type_3_1= 'reactive'
                    {
                    lv_type_3_1=(Token)match(input,44,FOLLOW_44_in_ruleMonitoringType5370); 

                            newLeafNode(lv_type_3_1, grammarAccess.getMonitoringTypeAccess().getTypeReactiveKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonitoringTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2416:8: lv_type_3_2= 'predictive'
                    {
                    lv_type_3_2=(Token)match(input,45,FOLLOW_45_in_ruleMonitoringType5399); 

                            newLeafNode(lv_type_3_2, grammarAccess.getMonitoringTypeAccess().getTypePredictiveKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonitoringTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleMonitoringType"


    // $ANTLR start "entryRuleStress"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2439:1: entryRuleStress returns [EObject current=null] : iv_ruleStress= ruleStress EOF ;
    public final EObject entryRuleStress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStress = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2440:2: (iv_ruleStress= ruleStress EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2441:2: iv_ruleStress= ruleStress EOF
            {
             newCompositeNode(grammarAccess.getStressRule()); 
            pushFollow(FOLLOW_ruleStress_in_entryRuleStress5451);
            iv_ruleStress=ruleStress();

            state._fsp--;

             current =iv_ruleStress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStress5461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStress"


    // $ANTLR start "ruleStress"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2448:1: ruleStress returns [EObject current=null] : (otherlv_0= 'stress' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleStressRangeType ) ) ( (lv_stressClass_4_0= ruleStressClassType ) )* ( (lv_stressMethod_5_0= ruleStressMethodType ) )* otherlv_6= '}' ) ;
    public final EObject ruleStress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_range_3_0 = null;

        EObject lv_stressClass_4_0 = null;

        EObject lv_stressMethod_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2451:28: ( (otherlv_0= 'stress' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleStressRangeType ) ) ( (lv_stressClass_4_0= ruleStressClassType ) )* ( (lv_stressMethod_5_0= ruleStressMethodType ) )* otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2452:1: (otherlv_0= 'stress' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleStressRangeType ) ) ( (lv_stressClass_4_0= ruleStressClassType ) )* ( (lv_stressMethod_5_0= ruleStressMethodType ) )* otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2452:1: (otherlv_0= 'stress' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleStressRangeType ) ) ( (lv_stressClass_4_0= ruleStressClassType ) )* ( (lv_stressMethod_5_0= ruleStressMethodType ) )* otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2452:3: otherlv_0= 'stress' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleStressRangeType ) ) ( (lv_stressClass_4_0= ruleStressClassType ) )* ( (lv_stressMethod_5_0= ruleStressMethodType ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleStress5498); 

                	newLeafNode(otherlv_0, grammarAccess.getStressAccess().getStressKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2456:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2457:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2457:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2458:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStress5515); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStressAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStressRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStress5532); 

                	newLeafNode(otherlv_2, grammarAccess.getStressAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2478:1: ( (lv_range_3_0= ruleStressRangeType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2479:1: (lv_range_3_0= ruleStressRangeType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2479:1: (lv_range_3_0= ruleStressRangeType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2480:3: lv_range_3_0= ruleStressRangeType
            {
             
            	        newCompositeNode(grammarAccess.getStressAccess().getRangeStressRangeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStressRangeType_in_ruleStress5553);
            lv_range_3_0=ruleStressRangeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStressRule());
            	        }
                   		add(
                   			current, 
                   			"range",
                    		lv_range_3_0, 
                    		"StressRangeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2496:2: ( (lv_stressClass_4_0= ruleStressClassType ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==14) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==47) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2497:1: (lv_stressClass_4_0= ruleStressClassType )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2497:1: (lv_stressClass_4_0= ruleStressClassType )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2498:3: lv_stressClass_4_0= ruleStressClassType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStressAccess().getStressClassStressClassTypeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStressClassType_in_ruleStress5574);
            	    lv_stressClass_4_0=ruleStressClassType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStressRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stressClass",
            	            		lv_stressClass_4_0, 
            	            		"StressClassType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2514:3: ( (lv_stressMethod_5_0= ruleStressMethodType ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==14||LA33_0==48) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2515:1: (lv_stressMethod_5_0= ruleStressMethodType )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2515:1: (lv_stressMethod_5_0= ruleStressMethodType )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2516:3: lv_stressMethod_5_0= ruleStressMethodType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStressAccess().getStressMethodStressMethodTypeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStressMethodType_in_ruleStress5596);
            	    lv_stressMethod_5_0=ruleStressMethodType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStressRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stressMethod",
            	            		lv_stressMethod_5_0, 
            	            		"StressMethodType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleStress5609); 

                	newLeafNode(otherlv_6, grammarAccess.getStressAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleStress"


    // $ANTLR start "entryRuleStressRangeType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2544:1: entryRuleStressRangeType returns [EObject current=null] : iv_ruleStressRangeType= ruleStressRangeType EOF ;
    public final EObject entryRuleStressRangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStressRangeType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2545:2: (iv_ruleStressRangeType= ruleStressRangeType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2546:2: iv_ruleStressRangeType= ruleStressRangeType EOF
            {
             newCompositeNode(grammarAccess.getStressRangeTypeRule()); 
            pushFollow(FOLLOW_ruleStressRangeType_in_entryRuleStressRangeType5645);
            iv_ruleStressRangeType=ruleStressRangeType();

            state._fsp--;

             current =iv_ruleStressRangeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStressRangeType5655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStressRangeType"


    // $ANTLR start "ruleStressRangeType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2553:1: ruleStressRangeType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStressRangeType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2556:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:2: ( (lv_many_0_0= 'many' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==14) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2558:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2558:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2559:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleStressRangeType5698); 

                            newLeafNode(lv_many_0_0, grammarAccess.getStressRangeTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStressRangeTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2572:3: ( (lv_name_1_0= 'range' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2573:1: (lv_name_1_0= 'range' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2573:1: (lv_name_1_0= 'range' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2574:3: lv_name_1_0= 'range'
            {
            lv_name_1_0=(Token)match(input,38,FOLLOW_38_in_ruleStressRangeType5730); 

                    newLeafNode(lv_name_1_0, grammarAccess.getStressRangeTypeAccess().getNameRangeKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStressRangeTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "range");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleStressRangeType5755); 

                	newLeafNode(otherlv_2, grammarAccess.getStressRangeTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2591:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2592:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2592:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2593:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStressRangeType5772); 

            			newLeafNode(lv_type_3_0, grammarAccess.getStressRangeTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStressRangeTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStressRangeType"


    // $ANTLR start "entryRuleStressClassType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2617:1: entryRuleStressClassType returns [EObject current=null] : iv_ruleStressClassType= ruleStressClassType EOF ;
    public final EObject entryRuleStressClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStressClassType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2618:2: (iv_ruleStressClassType= ruleStressClassType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2619:2: iv_ruleStressClassType= ruleStressClassType EOF
            {
             newCompositeNode(grammarAccess.getStressClassTypeRule()); 
            pushFollow(FOLLOW_ruleStressClassType_in_entryRuleStressClassType5813);
            iv_ruleStressClassType=ruleStressClassType();

            state._fsp--;

             current =iv_ruleStressClassType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStressClassType5823); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStressClassType"


    // $ANTLR start "ruleStressClassType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2626:1: ruleStressClassType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'stressClass' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStressClassType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2629:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'stressClass' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2630:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'stressClass' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2630:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'stressClass' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2630:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'stressClass' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2630:2: ( (lv_many_0_0= 'many' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2631:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2631:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2632:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleStressClassType5866); 

                            newLeafNode(lv_many_0_0, grammarAccess.getStressClassTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStressClassTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2645:3: ( (lv_name_1_0= 'stressClass' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2646:1: (lv_name_1_0= 'stressClass' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2646:1: (lv_name_1_0= 'stressClass' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2647:3: lv_name_1_0= 'stressClass'
            {
            lv_name_1_0=(Token)match(input,47,FOLLOW_47_in_ruleStressClassType5898); 

                    newLeafNode(lv_name_1_0, grammarAccess.getStressClassTypeAccess().getNameStressClassKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStressClassTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "stressClass");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleStressClassType5923); 

                	newLeafNode(otherlv_2, grammarAccess.getStressClassTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2664:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2665:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2665:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2666:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStressClassType5940); 

            			newLeafNode(lv_type_3_0, grammarAccess.getStressClassTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStressClassTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStressClassType"


    // $ANTLR start "entryRuleStressMethodType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2690:1: entryRuleStressMethodType returns [EObject current=null] : iv_ruleStressMethodType= ruleStressMethodType EOF ;
    public final EObject entryRuleStressMethodType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStressMethodType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2691:2: (iv_ruleStressMethodType= ruleStressMethodType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2692:2: iv_ruleStressMethodType= ruleStressMethodType EOF
            {
             newCompositeNode(grammarAccess.getStressMethodTypeRule()); 
            pushFollow(FOLLOW_ruleStressMethodType_in_entryRuleStressMethodType5981);
            iv_ruleStressMethodType=ruleStressMethodType();

            state._fsp--;

             current =iv_ruleStressMethodType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStressMethodType5991); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStressMethodType"


    // $ANTLR start "ruleStressMethodType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2699:1: ruleStressMethodType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'stressMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleStressMethodType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2702:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'stressMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2703:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'stressMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2703:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'stressMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2703:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'stressMethod' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2703:2: ( (lv_many_0_0= 'many' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2704:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2704:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2705:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleStressMethodType6034); 

                            newLeafNode(lv_many_0_0, grammarAccess.getStressMethodTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStressMethodTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2718:3: ( (lv_name_1_0= 'stressMethod' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2719:1: (lv_name_1_0= 'stressMethod' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2719:1: (lv_name_1_0= 'stressMethod' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2720:3: lv_name_1_0= 'stressMethod'
            {
            lv_name_1_0=(Token)match(input,48,FOLLOW_48_in_ruleStressMethodType6066); 

                    newLeafNode(lv_name_1_0, grammarAccess.getStressMethodTypeAccess().getNameStressMethodKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStressMethodTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "stressMethod");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleStressMethodType6091); 

                	newLeafNode(otherlv_2, grammarAccess.getStressMethodTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2737:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2738:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2738:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2739:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStressMethodType6108); 

            			newLeafNode(lv_type_3_0, grammarAccess.getStressMethodTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStressMethodTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStressMethodType"


    // $ANTLR start "entryRuleAction"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2763:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2764:2: (iv_ruleAction= ruleAction EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2765:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction6149);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction6159); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleActionRangeType ) ) ( (lv_class_4_0= ruleActionClassType ) ) ( (lv_method_5_0= ruleActionMethodType ) ) otherlv_6= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_range_3_0 = null;

        EObject lv_class_4_0 = null;

        EObject lv_method_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2775:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleActionRangeType ) ) ( (lv_class_4_0= ruleActionClassType ) ) ( (lv_method_5_0= ruleActionMethodType ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2776:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleActionRangeType ) ) ( (lv_class_4_0= ruleActionClassType ) ) ( (lv_method_5_0= ruleActionMethodType ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2776:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleActionRangeType ) ) ( (lv_class_4_0= ruleActionClassType ) ) ( (lv_method_5_0= ruleActionMethodType ) ) otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2776:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_range_3_0= ruleActionRangeType ) ) ( (lv_class_4_0= ruleActionClassType ) ) ( (lv_method_5_0= ruleActionMethodType ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleAction6196); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2780:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2781:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2781:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2782:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction6213); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAction6230); 

                	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2802:1: ( (lv_range_3_0= ruleActionRangeType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2803:1: (lv_range_3_0= ruleActionRangeType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2803:1: (lv_range_3_0= ruleActionRangeType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2804:3: lv_range_3_0= ruleActionRangeType
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getRangeActionRangeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleActionRangeType_in_ruleAction6251);
            lv_range_3_0=ruleActionRangeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		add(
                   			current, 
                   			"range",
                    		lv_range_3_0, 
                    		"ActionRangeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2820:2: ( (lv_class_4_0= ruleActionClassType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2821:1: (lv_class_4_0= ruleActionClassType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2821:1: (lv_class_4_0= ruleActionClassType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2822:3: lv_class_4_0= ruleActionClassType
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getClassActionClassTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleActionClassType_in_ruleAction6272);
            lv_class_4_0=ruleActionClassType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		add(
                   			current, 
                   			"class",
                    		lv_class_4_0, 
                    		"ActionClassType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2838:2: ( (lv_method_5_0= ruleActionMethodType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2839:1: (lv_method_5_0= ruleActionMethodType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2839:1: (lv_method_5_0= ruleActionMethodType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2840:3: lv_method_5_0= ruleActionMethodType
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getMethodActionMethodTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleActionMethodType_in_ruleAction6293);
            lv_method_5_0=ruleActionMethodType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		add(
                   			current, 
                   			"method",
                    		lv_method_5_0, 
                    		"ActionMethodType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleAction6305); 

                	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionRangeType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:1: entryRuleActionRangeType returns [EObject current=null] : iv_ruleActionRangeType= ruleActionRangeType EOF ;
    public final EObject entryRuleActionRangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionRangeType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2869:2: (iv_ruleActionRangeType= ruleActionRangeType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2870:2: iv_ruleActionRangeType= ruleActionRangeType EOF
            {
             newCompositeNode(grammarAccess.getActionRangeTypeRule()); 
            pushFollow(FOLLOW_ruleActionRangeType_in_entryRuleActionRangeType6341);
            iv_ruleActionRangeType=ruleActionRangeType();

            state._fsp--;

             current =iv_ruleActionRangeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionRangeType6351); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionRangeType"


    // $ANTLR start "ruleActionRangeType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2877:1: ruleActionRangeType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleActionRangeType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2880:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2881:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2881:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2881:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'range' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2881:2: ( (lv_many_0_0= 'many' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2882:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2882:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2883:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleActionRangeType6394); 

                            newLeafNode(lv_many_0_0, grammarAccess.getActionRangeTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRangeTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2896:3: ( (lv_name_1_0= 'range' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2897:1: (lv_name_1_0= 'range' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2897:1: (lv_name_1_0= 'range' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2898:3: lv_name_1_0= 'range'
            {
            lv_name_1_0=(Token)match(input,38,FOLLOW_38_in_ruleActionRangeType6426); 

                    newLeafNode(lv_name_1_0, grammarAccess.getActionRangeTypeAccess().getNameRangeKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRangeTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "range");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleActionRangeType6451); 

                	newLeafNode(otherlv_2, grammarAccess.getActionRangeTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2915:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2916:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2916:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2917:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActionRangeType6468); 

            			newLeafNode(lv_type_3_0, grammarAccess.getActionRangeTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRangeTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleActionRangeType"


    // $ANTLR start "entryRuleActionClassType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2941:1: entryRuleActionClassType returns [EObject current=null] : iv_ruleActionClassType= ruleActionClassType EOF ;
    public final EObject entryRuleActionClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClassType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2942:2: (iv_ruleActionClassType= ruleActionClassType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2943:2: iv_ruleActionClassType= ruleActionClassType EOF
            {
             newCompositeNode(grammarAccess.getActionClassTypeRule()); 
            pushFollow(FOLLOW_ruleActionClassType_in_entryRuleActionClassType6509);
            iv_ruleActionClassType=ruleActionClassType();

            state._fsp--;

             current =iv_ruleActionClassType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionClassType6519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionClassType"


    // $ANTLR start "ruleActionClassType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2950:1: ruleActionClassType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'class' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleActionClassType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2953:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'class' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'class' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'class' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'class' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2954:2: ( (lv_many_0_0= 'many' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==14) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2955:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2955:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2956:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleActionClassType6562); 

                            newLeafNode(lv_many_0_0, grammarAccess.getActionClassTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionClassTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2969:3: ( (lv_name_1_0= 'class' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2970:1: (lv_name_1_0= 'class' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2970:1: (lv_name_1_0= 'class' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2971:3: lv_name_1_0= 'class'
            {
            lv_name_1_0=(Token)match(input,39,FOLLOW_39_in_ruleActionClassType6594); 

                    newLeafNode(lv_name_1_0, grammarAccess.getActionClassTypeAccess().getNameClassKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionClassTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "class");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleActionClassType6619); 

                	newLeafNode(otherlv_2, grammarAccess.getActionClassTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2988:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2989:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2989:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2990:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActionClassType6636); 

            			newLeafNode(lv_type_3_0, grammarAccess.getActionClassTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionClassTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleActionClassType"


    // $ANTLR start "entryRuleActionMethodType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3014:1: entryRuleActionMethodType returns [EObject current=null] : iv_ruleActionMethodType= ruleActionMethodType EOF ;
    public final EObject entryRuleActionMethodType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionMethodType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3015:2: (iv_ruleActionMethodType= ruleActionMethodType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3016:2: iv_ruleActionMethodType= ruleActionMethodType EOF
            {
             newCompositeNode(grammarAccess.getActionMethodTypeRule()); 
            pushFollow(FOLLOW_ruleActionMethodType_in_entryRuleActionMethodType6677);
            iv_ruleActionMethodType=ruleActionMethodType();

            state._fsp--;

             current =iv_ruleActionMethodType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionMethodType6687); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionMethodType"


    // $ANTLR start "ruleActionMethodType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3023:1: ruleActionMethodType returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'method' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleActionMethodType() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3026:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'method' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3027:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'method' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3027:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'method' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3027:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= 'method' ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3027:2: ( (lv_many_0_0= 'many' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3028:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3028:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3029:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_14_in_ruleActionMethodType6730); 

                            newLeafNode(lv_many_0_0, grammarAccess.getActionMethodTypeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionMethodTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_0_0, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3042:3: ( (lv_name_1_0= 'method' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3043:1: (lv_name_1_0= 'method' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3043:1: (lv_name_1_0= 'method' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3044:3: lv_name_1_0= 'method'
            {
            lv_name_1_0=(Token)match(input,50,FOLLOW_50_in_ruleActionMethodType6762); 

                    newLeafNode(lv_name_1_0, grammarAccess.getActionMethodTypeAccess().getNameMethodKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionMethodTypeRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "method");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleActionMethodType6787); 

                	newLeafNode(otherlv_2, grammarAccess.getActionMethodTypeAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3061:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3062:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3062:1: (lv_type_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3063:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActionMethodType6804); 

            			newLeafNode(lv_type_3_0, grammarAccess.getActionMethodTypeAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionMethodTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleActionMethodType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleDomainModel130 = new BitSet(new long[]{0x0002443800880802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_ruleType223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualMachine_in_ruleType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloudProvider_in_ruleType277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploy_in_ruleType304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployType_in_ruleType331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployApp_in_ruleType358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonitor_in_ruleType385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStress_in_ruleType412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleType439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_entryRuleCreate474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreate484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCreate521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreate538 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCreate555 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_ruleVirtualMachineFeature_in_ruleCreate576 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleInitMachinesFeature_in_ruleCreate597 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleInitIncrementFeature_in_ruleCreate618 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCreate630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitMachinesFeature_in_entryRuleInitMachinesFeature666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitMachinesFeature676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleInitMachinesFeature719 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInitMachinesFeature751 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInitMachinesFeature776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitMachinesFeature793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitIncrementFeature_in_entryRuleInitIncrementFeature834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitIncrementFeature844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleInitIncrementFeature887 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInitIncrementFeature919 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInitIncrementFeature944 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitIncrementFeature961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualMachineFeature_in_entryRuleVirtualMachineFeature1002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualMachineFeature1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVirtualMachineFeature1055 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVirtualMachineFeature1087 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVirtualMachineFeature1112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVirtualMachineFeature1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualMachine_in_entryRuleVirtualMachine1168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualMachine1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVirtualMachine1215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVirtualMachine1232 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVirtualMachine1249 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_ruleVirtualMachineTypeFeature_in_ruleVirtualMachine1270 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_ruleCloudProviderType_in_ruleVirtualMachine1291 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVirtualMachine1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualMachineTypeFeature_in_entryRuleVirtualMachineTypeFeature1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualMachineTypeFeature1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVirtualMachineTypeFeature1392 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVirtualMachineTypeFeature1424 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVirtualMachineTypeFeature1449 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleVirtualMachineTypeFeature1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVirtualMachineTypeFeature1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloudProviderType_in_entryRuleCloudProviderType1550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloudProviderType1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCloudProviderType1603 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCloudProviderType1635 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCloudProviderType1660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCloudProviderType1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloudProvider_in_entryRuleCloudProvider1716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloudProvider1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCloudProvider1763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCloudProvider1780 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCloudProvider1797 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_ruleCloudType_in_ruleCloudProvider1818 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_ruleMgmAddressType_in_ruleCloudProvider1839 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_ruleCloudCredentialType_in_ruleCloudProvider1860 = new BitSet(new long[]{0x0000000660006000L});
    public static final BitSet FOLLOW_ruleCloudOptionalTypes_in_ruleCloudProvider1881 = new BitSet(new long[]{0x0000000660006000L});
    public static final BitSet FOLLOW_13_in_ruleCloudProvider1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloudOptionalTypes_in_entryRuleCloudOptionalTypes1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloudOptionalTypes1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptType_in_ruleCloudOptionalTypes1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeoZoneType_in_ruleCloudOptionalTypes2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloudUserType_in_ruleCloudOptionalTypes2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloudPasswordType_in_ruleCloudOptionalTypes2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloudType_in_entryRuleCloudType2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloudType2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCloudType2156 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCloudType2188 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCloudType2213 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_25_in_ruleCloudType2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCloudType2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCloudType2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCloudType2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptType_in_entryRuleScriptType2372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptType2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleScriptType2425 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleScriptType2457 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleScriptType2482 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScriptType2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeoZoneType_in_entryRuleGeoZoneType2540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeoZoneType2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGeoZoneType2593 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleGeoZoneType2625 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGeoZoneType2650 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGeoZoneType2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMgmAddressType_in_entryRuleMgmAddressType2708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMgmAddressType2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMgmAddressType2761 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMgmAddressType2793 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMgmAddressType2818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMgmAddressType2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloudCredentialType_in_entryRuleCloudCredentialType2876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloudCredentialType2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCloudCredentialType2929 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCloudCredentialType2961 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCloudCredentialType2986 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCloudCredentialType3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloudUserType_in_entryRuleCloudUserType3044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloudUserType3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCloudUserType3097 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCloudUserType3129 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCloudUserType3154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCloudUserType3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloudPasswordType_in_entryRuleCloudPasswordType3212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloudPasswordType3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCloudPasswordType3265 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCloudPasswordType3297 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCloudPasswordType3322 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCloudPasswordType3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeploy_in_entryRuleDeploy3380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeploy3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDeploy3427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeploy3444 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeploy3461 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_ruleDeployAppFeature_in_ruleDeploy3482 = new BitSet(new long[]{0x0000002000006000L});
    public static final BitSet FOLLOW_ruleDeployTypeFeature_in_ruleDeploy3503 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeploy3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployAppFeature_in_entryRuleDeployAppFeature3552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeployAppFeature3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeployAppFeature3605 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDeployAppFeature3637 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeployAppFeature3662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeployAppFeature3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployTypeFeature_in_entryRuleDeployTypeFeature3718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeployTypeFeature3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeployTypeFeature3771 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDeployTypeFeature3803 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeployTypeFeature3828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeployTypeFeature3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployType_in_entryRuleDeployType3884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeployType3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDeployType3931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeployType3948 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeployType3965 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_ruleDeployRangeType_in_ruleDeployType3986 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeployType3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployRangeType_in_entryRuleDeployRangeType4034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeployRangeType4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeployRangeType4087 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleDeployRangeType4119 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeployRangeType4144 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeployRangeType4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployApp_in_entryRuleDeployApp4202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeployApp4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDeployApp4249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeployApp4266 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeployApp4283 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_ruleDeployAppClassType_in_ruleDeployApp4304 = new BitSet(new long[]{0x0000030000006000L});
    public static final BitSet FOLLOW_ruleDeployAppMasterMethodType_in_ruleDeployApp4325 = new BitSet(new long[]{0x0000030000006000L});
    public static final BitSet FOLLOW_ruleDeployAppSlaveMethodType_in_ruleDeployApp4347 = new BitSet(new long[]{0x0000020000006000L});
    public static final BitSet FOLLOW_13_in_ruleDeployApp4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployAppClassType_in_entryRuleDeployAppClassType4396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeployAppClassType4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeployAppClassType4449 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDeployAppClassType4481 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeployAppClassType4506 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeployAppClassType4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployAppMasterMethodType_in_entryRuleDeployAppMasterMethodType4564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeployAppMasterMethodType4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeployAppMasterMethodType4617 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleDeployAppMasterMethodType4649 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeployAppMasterMethodType4674 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeployAppMasterMethodType4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeployAppSlaveMethodType_in_entryRuleDeployAppSlaveMethodType4732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeployAppSlaveMethodType4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeployAppSlaveMethodType4785 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleDeployAppSlaveMethodType4817 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeployAppSlaveMethodType4842 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeployAppSlaveMethodType4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonitor_in_entryRuleMonitor4900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonitor4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleMonitor4947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMonitor4964 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMonitor4981 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_ruleMonitorRangeType_in_ruleMonitor5002 = new BitSet(new long[]{0x0000080000006000L});
    public static final BitSet FOLLOW_ruleMonitoringType_in_ruleMonitor5023 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMonitor5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonitorRangeType_in_entryRuleMonitorRangeType5072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonitorRangeType5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMonitorRangeType5125 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMonitorRangeType5157 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMonitorRangeType5182 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMonitorRangeType5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonitoringType_in_entryRuleMonitoringType5240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonitoringType5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMonitoringType5293 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleMonitoringType5325 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMonitoringType5350 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_ruleMonitoringType5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMonitoringType5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStress_in_entryRuleStress5451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStress5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleStress5498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStress5515 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStress5532 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_ruleStressRangeType_in_ruleStress5553 = new BitSet(new long[]{0x0001800000006000L});
    public static final BitSet FOLLOW_ruleStressClassType_in_ruleStress5574 = new BitSet(new long[]{0x0001800000006000L});
    public static final BitSet FOLLOW_ruleStressMethodType_in_ruleStress5596 = new BitSet(new long[]{0x0001000000006000L});
    public static final BitSet FOLLOW_13_in_ruleStress5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStressRangeType_in_entryRuleStressRangeType5645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStressRangeType5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStressRangeType5698 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleStressRangeType5730 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStressRangeType5755 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStressRangeType5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStressClassType_in_entryRuleStressClassType5813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStressClassType5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStressClassType5866 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleStressClassType5898 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStressClassType5923 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStressClassType5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStressMethodType_in_entryRuleStressMethodType5981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStressMethodType5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStressMethodType6034 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleStressMethodType6066 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStressMethodType6091 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStressMethodType6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction6149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAction6196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction6213 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAction6230 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_ruleActionRangeType_in_ruleAction6251 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_ruleActionClassType_in_ruleAction6272 = new BitSet(new long[]{0x0004000000004000L});
    public static final BitSet FOLLOW_ruleActionMethodType_in_ruleAction6293 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAction6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionRangeType_in_entryRuleActionRangeType6341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionRangeType6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActionRangeType6394 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleActionRangeType6426 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActionRangeType6451 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActionRangeType6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionClassType_in_entryRuleActionClassType6509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionClassType6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActionClassType6562 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleActionClassType6594 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActionClassType6619 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActionClassType6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionMethodType_in_entryRuleActionMethodType6677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionMethodType6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActionMethodType6730 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleActionMethodType6762 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActionMethodType6787 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActionMethodType6804 = new BitSet(new long[]{0x0000000000000002L});

}