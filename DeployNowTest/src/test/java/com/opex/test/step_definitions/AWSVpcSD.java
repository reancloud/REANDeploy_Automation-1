package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.SleepFunctionality;
import com.opex.test.modules.AWSSubnetGroupPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSVpcPage;
import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSVpcSD extends SuperUsedDefinition{

	public AWSVpcSD()
	{
		super();
	}

	@Then("^User search or create environment for VPC and see message as environment created successfully$")
	public void User_search_or_create_environment_for_VPC_and_see_message_as_environment_created_successfully() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		CommonFunctionalityPage.deploynow_logo.click();
		String className = AWSVpcSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);

	}
	@Then("^User delete vpc environment and see message environment deleted sucessfully$")
	public void user_delete_vpc_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSVpcSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	
	@Then("^User click deploy button without providing the mandatory fields for VPC$")
	public void User_click_deploy_button_without_providing_the_mandatory_fields_for_VPC() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSVpcPageAction.deploy(driver);
	}

	@When("^User click VPC resource and drag on the dashboard$")
	public void user_click_VPC_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		AWSVpcPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		SleepFunctionality.sleepTime(1000);
		
	}
	
	@And("^User enter vpc resource name$")
	public void User_enter_vpc_resource_name() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		SleepFunctionality.sleepTime(3000);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVpc.getVpc_Rname());
	}
	
	@When("^User enter vpc resource name blank$")
	public void User_enter_vpc_resource_name_blank() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVpc.getVpc_Rname());
	}

	@When("^User click on Vpc resource$")
	public void User_click_on_Vpc_resource() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		SleepFunctionality.sleepTime(3000);
		CommonFunctionalityPageAction.clickOnResource(driver,dnVpc.getVpc_Rname());
	}


	@And("^User enter cidr block for vpc$")
	public void User_enter_cidr_block_for_vpc() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		AWSVpcPageAction.vpcCidrBlock(driver, dnVpc.getVpc_Cidrblock());
		
	}
	@And("^User enter blank cidr_block for vpc$")
	public void User_enter_blank_cidr_block_for_vpc() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		AWSVpcPageAction.vpcCidrBlock(driver,"");
		
	}
	@And("^User enter invalid cidr_block for vpc$")
	public void User_enter_invalid_cidr_block_for_vpc() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		AWSVpcPageAction.vpcCidrBlock(driver,"10.0.0.0/8");

	}

	@And("^User select connection for vpc$")	
	public void User_select_connection_for_vpc() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver,dnVpc.getVpc_connection());

	}
	@And("^User enter dependson for vpc$")
	public void User_enter_dependson_for_vpc() throws Throwable {
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVpc.getVpc_dependsOn());
	}


	@And("^User enter instance_tenancy for vpc$")
	public void User_enter_instance_tenancy_for_vpc() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		AWSVpcPageAction.enterInstanceTenancyValue(driver, dnVpc.getVpc_instancetenancy());
	} 
	@And("^User enter enable_classiclink for vpc$")
	public void User_enter_enable_classiclink_for_vpc() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		AWSVpcPageAction.selectEnableClasssicLink(driver, dnVpc.getVpc_enableClassicLink());
	}
	
	@And("^User enter enable_dns_support for vpc$")
	public void User_enter_enable_dns_support_for_vpc() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		AWSVpcPageAction.selectEnableDnsSupportValue(driver,dnVpc.getVpc_enableDnssupport());	
	}

	@And("^User enter enable_dns_hostnames for vpc$")
	public void User_enter_enable_dns_hostnames_for_vpc() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		AWSVpcPageAction.selectEnableDnsHostnamesValue(driver, dnVpc.getVpc_enableHostname());
	}

	
	@And("^User click on please delete it on resource cross button popup$")
	public void User_click_on_please_delete_it_on_resource_cross_button_popup() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dnVpc.getVpc_Rname());
	}

	@And("^User click on please dont delete it on resource cross button popup$")
	public void User_click_on_dont_delete_it_on_resource_cross_button_popup() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnVpc.getVpc_Rname());
		}


}