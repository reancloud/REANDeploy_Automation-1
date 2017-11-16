package com.opex.test.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSNetworkACLPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.SignInAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSSubnetgroupPageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.AWSRoute53ZonePageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSNetworkACLSD extends SuperUsedDefinition  {
	
	public AWSNetworkACLSD()
    {
		super();  	
    }

	@Then("^User click on subnet resource and entered all the attribute values$")
	public void User_click_on_subnet_resource_and_entered_all_the_attribute_values() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnNetworkACL.getnetworkacl_subnet1_resourceName());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver, dnNetworkACL.getnetworkacl_subnet1_resourceName());
		AWSSubnetPageAction.ResourcePassvariable(driver,dnNetworkACL.getnetworkacl_subnet1_cidr(),dnNetworkACL.getnetworkacl_subnet1_vpcid(),"","","");
		
		
	}

	@Then("^User click on subnet2 resources and entered all the attribute values$")
	public void User_again_click_on_subnet_resource_and_entered_all_the_attribute_values() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnNetworkACL.getnetworkacl_subnet2_resourceName());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnNetworkACL.getnetworkacl_subnet2_cidr(),dnNetworkACL.getnetworkacl_subnet2_vpcid(),"","","");;
		
	}

	@Then("^User click on VPC resources and entered all attribute values$")
	public void User_click_on_VPC_resource_and_entered_all_the_attribute_values() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
        PageFactory.initElements(driver, AWSVpcPage.class);
        PageFactory.initElements(driver, CommonFunctionalityPage.class);
        CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
        CommonFunctionalityPageAction.enterResourceName(driver,dnNetworkACL.getnetworkacl_vpc_resourceName());
        CommonFunctionalityPageAction.resourceCreateBtn(driver);
        AWSVpcPageAction.vpcCidrBlock(driver,dnNetworkACL.getnetworkacl_vpc_cidr()) ;
	}

	
	@Then("^User search or create environment for NACL and see message as environment created successfully$")
	public void User_search_or_create_environment_for_NACL_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, AWSNetworkACLPageObject.class);
		String className = AWSNetworkACLSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name);
		
	}
	@Then("^User delete NetworkACL environment and see message environment deleted sucessfully$")
    public void User_delete_NetworkACL_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSNetworkACLSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
    }
	
	@When("^User click NetworkACL resource and drag on the dashboard$")
	public void User_click_NetworkACL_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, AWSNetworkACLPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSNetworkACLPageAction.dragdropNetworkACL(driver);
	    
	}

	@And("^User enter NetworkACL resource name$")
	public void User_enter_NetworkACL_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSNetworkACLPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		/*String className = AWS_Network_ACL_SD.class.getSimpleName();
		String Rname = className.replaceAll("AWS_", "").replaceAll("_SD", "");
		String Resource = dnowCommanfun.getResource_name()+Rname;*/
		CommonFunctionalityPageAction.enterResourceName(driver, dnNetworkACL.getnetworlacl_Rname());   
	}

	
	@Then("^User click on cross and click on please delete it button on NetworkACL$")
	public void User_click_on_cross_and_click_on_please_delete_it_button_on_NetworkACL() throws Throwable {
		PageFactory.initElements(driver, AWSNetworkACLPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dnNetworkACL.getnetworlacl_Rname());
	    
	}
	@Then("^User click on cross and click on please dont delete it button on NetworkACL$")
	public void User_click_on_cross_and_click_on_please_dont_delete_it_button_on_NetworkACL() throws Throwable {
		PageFactory.initElements(driver, AWSNetworkACLPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
	   	/*String className = AWS_Network_ACL_SD.class.getSimpleName();
		String Rname = className.replaceAll("AWS_", "").replaceAll("_SD", "");
		String Resource = dnowCommanfun.getResource_name()+Rname;*/
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnNetworkACL.getnetworlacl_Rname());
	    
	}
	@Then("^User enter blank NetworkACL resource name$")
    public void User_enter_blank_NetworkACL_resource_name() throws Throwable {
   	 PageFactory.initElements(driver, AWSNetworkACLPageObject.class);
   	 PageFactory.initElements(driver, CommonFunctionalityPage.class);
   	CommonFunctionalityPageAction.enterResourceName(driver," ");
    } 
	@When("^User click on NetworkACL resource$")
	public void User_click_on_NetworkACL_resource() throws Throwable {
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	/*String className = AWS_Network_ACL_SD.class.getSimpleName();
	String Rname = className.replaceAll("AWS_", "").replaceAll("_SD", "");
	String Resource = dnowCommanfun.getResource_name()+Rname;*/
	CommonFunctionalityPageAction.clickOnResource(driver,dnNetworkACL.getnetworlacl_Rname());
	}
	
	@And("^User click on egress on NetworkACL resource$")
	public void User_click_on_egress_on_NetworkACL_resource() throws Throwable {
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	AWSNetworkACLPageAction.clickonegress(driver,dnNetworkACL.getnetworlacl_egress()); 
	}

	@And("^User click on ingress on NetworkACL resource$")
	public void User_click_on_ingress_on_NetworkACL_resource() throws Throwable {
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	AWSNetworkACLPageAction.clickoningress(driver,dnNetworkACL.getnetworkacl_ingress());
	}

	@And("^User enter vpc_id on NetworkACL resource$")
	public void User_enter_vpc_id_on_NetworkACL_resource() throws Throwable {
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	AWSNetworkACLPageAction.enterNetworkACLvpc_id(driver,dnNetworkACL.getnetworkacl_vpcid());
	}

	@And("^User enter depends_on NetworkACL resource$")
	public void User_enter_depends_on_NetworkACL_resource() throws Throwable {
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	AWSNetworkACLPageAction.enterNetworkACLdepends_on(driver,dnNetworkACL.getnetworkacl_dependson());
	}

	@And("^User select connection on NetworkACL resource$")
	public void User_select_connection_on_NetworkACL_resource() throws Throwable {
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	CommonFunctionalityPageAction.selectConnection(driver,dnNetworkACL.getnetworkacl_connection());
	//R_Network_ACL_SSH_AWSPageAction.selectNetworkACLconnection(driver,dnNetworkACL.getnetworkacl_connection());
	}

	@And("^User click on subnet_id on NetworkACL resource$")
	public void User_click_on_subnet_id_on_NetworkACL_resource() throws Throwable {
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	//AWSNetworkACLPageAction.clickNetworkACLsubnet_id(driver,dnNetworkACL.getnetworkacl_subnetid());
	}
	
    @Then("^User enter blank attribute values under for NetworkACL$")
    public void User_enter_blank_attribute_values_under_for_NetworkACL() throws Throwable {
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	AWSNetworkACLPageAction.resourceAttributesPassingVariableNACL(driver);
    }
    
    @Then("^User click on deploy button without providing mandatory fields$")
    public void User_click_on_deploy_button_and_check_deployment_status() throws Throwable{
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
    	AWSNetworkACLPageAction.deployfail(driver);
		}
    
}
