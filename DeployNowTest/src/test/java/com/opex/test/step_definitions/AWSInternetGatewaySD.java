package com.opex.test.step_definitions;



import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSInternetGatewayPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.SleepFunctionality;
import com.opex.test.modules.AWSVpcPageAction;

import com.opex.test.pageobjects.AWSIAMGroupPageObject;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;


import com.opex.test.pageobjects.AWSVpcPage;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSInternetGatewaySD extends SuperUsedDefinition{

	public AWSInternetGatewaySD()
	{
		super();
	}
	
	@Then("^User create or search an environment for Internet Gateway and see message as environment created successfully$")
	public void user_create_or_search_an_environment_for_Internet_Gateway() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, dnIGW.getIgw_envname());
	}
	@When("^User click Internet Gateway resource and drag on the dashboard for Internet Gateway$")
	public void user_click_Internet_Gateway_resource_and_drag_on_the_dashboard_for_Internet_Gateway() throws Throwable {
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		AWSInternetGatewayPageAction.selectIGW(driver);
		
	}

	@And("^User enter the Internet Gateway resource name as blank$")
	public void user_enter_the_IAM_policy_resource_name_as_blank() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnIGW.getIgw_blankdata());	
	}
	
	@When("^User click VPC resource and drag on the dashboard for Internet Gateway$")
	public void user_click_VPC_resource_and_drag_on_the_dashboard_for_Internet_Gateway() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
        PageFactory.initElements(driver, AWSVpcPage.class);
        //CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
        AWSInternetGatewayPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
	}

	@And("^User fill connection for Internet Gateway$")
	public void user_fill_connection_for_Internet_Gateway() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
  	   	CommonFunctionalityPageAction.selectConnection(driver, dnIGW.getIgw_connection());
	}

	@Then("^User delete the environment for Internet Gateway and see message environment deleted successfully$")
	public void user_delete_the_environment_for_Internet_Gateway_and_see_message_environment_deleted_successfully() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,dnIGW.getIgw_envname());
	}
	@And("^User enter the resource name for Internet Gateway$")
	public void user_enter_the_resource_name_for_Internet_Gateway() throws Throwable {
		
	   		PageFactory.initElements(driver, CommonFunctionalityPage.class);
	  	   	CommonFunctionalityPageAction.enterResourceName(driver,dnIGW.getIgw_rname());
	    }
				
	
	@And("^User enter VPC resource name for Internet Gateway$")
    public void user_enter_VPC_resource_name_for_Internet_Gateway() throws Throwable {
   	 
 	PageFactory.initElements(driver, CommonFunctionalityPage.class);
   	CommonFunctionalityPageAction.enterResourceName(driver,dnIGW.getIgw_vpc_rname());
    }
	
	@When("^User click on VPC resource for Internet Gateway$")
    public void user_click_on_VPC_resource_for_Internet_Gateway() throws Throwable {
   	PageFactory.initElements(driver, AWSVpcPage.class);
 	PageFactory.initElements(driver, CommonFunctionalityPage.class);
   	CommonFunctionalityPageAction.clickOnResource(driver, dnIGW.getIgw_vpc_rname());
    }
	@And("User enter VPC resource cidr block for Internet Gateway$")
	public void user_enter_VPC_resource_cidr_block_for_Internet_Gatewaythrows() throws Throwable {
	   	 PageFactory.initElements(driver, AWSVpcPage.class);
	   	 AWSVpcPageAction.vpcCidrBlock(driver, dnIGW.getIgw_vpc_cidr_block());
	}

	@And("^User fill the vpc id attribute for Internet Gateway$")
	public void user_fill_the_vpc_id_attribute_for_Internet_Gateway()throws Throwable{

		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver, dnIGW.getIgw_vpc_id());
		
	}
	
	@And("^User fill the depends on for Internet Gateway$")
	public void user_fill_the_depends_on_for_Internet_Gateway() throws Throwable {
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
  	   	CommonFunctionalityPageAction.enterDependsOnValue(driver,dnIGW.getIgw_DependsOn());
	}
	
	

	
	@And("^User delete the resource by clicking the cross button on resource for Internet Gateway$")
	public void user_delete_the_resource_by_clicking_the_cross_button_on_resource_for_Internet_Gateway() throws Throwable {
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
  	   	CommonFunctionalityPageAction.resource_pleasedelete(driver, dnIGW.getIgw_rname());
	}



	@And("^User dont delete the resource by clicking the cross button on resource for Internet Gateway$")
	public void user_dont_delete_the_resource_by_clicking_the_cross_button_on_resource_for_Internet_Gateway() throws Throwable {
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
  	   	CommonFunctionalityPageAction.resourcecross_dntdelete(driver, dnIGW.getIgw_rname());
	}
	
	
	@And("^User fill the attribute as blank for Internet Gateway$")
	public void user_fill_the_attributes_as_blank_under_resource_section_for_Internet_Gateway() throws Exception{
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver,dnIGW.getIgw_connection());
	}
		
	@When("^User click on IGW resource$")
	public void user_click_on_IGW_resource_to_fill_the_attributes() throws Throwable {
	   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
	   	CommonFunctionalityPageAction.clickOnResource(driver, dnIGW.getIgw_rname());
	}

	

}
	