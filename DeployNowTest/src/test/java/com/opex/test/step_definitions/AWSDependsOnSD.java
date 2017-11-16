package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSDependsOnPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSOutputPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.pageobjects.AWSDependsOnPageObject;
import com.opex.test.pageobjects.AWSKeyPairPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSOutputPage;
import com.opex.test.pageobjects.AWSVpcPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSDependsOnSD extends SuperUsedDefinition{

	public AWSDependsOnSD()
	{
		super();
	}


	@Then("^User create or search an environment of vpc for Depends On and see message as environment created successfully$")
	public void user_search_n_select_vpc_environment_for_Depends_On() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, dnDependsOn.getDependson_Vpc_Env());
	}

	@Then("^User click VPC resource and drag on the dashboard for Depends On$")
	public void user_create_a_vpc_for_Depends_On() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		CommonFunctionalityPageAction.enterResourceName(driver,dnDependsOn.getDependson_vpc_resourceName());
		//CommonFunctionalityPageAction.resourceCreateBtn(driver);
		
	}
	@And("^User fill the cidr of vpc for Depends On$")
	public void user_fill_the_cidr_of_vpc_for_Depends_On() throws Throwable {
		
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnDependsOn.getDependson_vpc_resourceName() );
		AWSVpcPageAction.vpcCidrBlock(driver, dnDependsOn.getDependson_vpc_cidr());
	}

	@When("^User click output resource and drag on the dashboard for Depends On$")
	public void user_create_a_output_for_Depends_On() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSOutputPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSOutputPage.resource_output);

	}

	@And("^User fill output json for Depends On$")
	public void user_fill_output_json_for_Depends_On() throws Throwable {
		
		PageFactory.initElements(driver, AWSOutputPage.class);
		AWSOutputPageAction.enterOutputJson(driver,dnDependsOn.getDependson_output_json());
	}

	@When("User click on the environment dropdown for Depends On$")
	public void user_click_on_the_environment_dropdown_for_Depends_On() throws Throwable {
		
		PageFactory.initElements(driver,EnvironmentPage.class);
		AWSDependsOnPageAction.clickOnDropdownOfEnv(driver);

	}

	@Then("^User create or search an environment of subnet for Depends On and see message as environment created successfully$")
	public void user_search_n_select_subnet_environment_for_Depends_On() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,dnDependsOn.getDependson_Env());
	}

	@When("^User click subnet resource and drag on the dashboard for Depends On$")
	public void user_create_a_subnet_for_Depends_On() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnDependsOn.getDependson_subnet_resourceName());
		//CommonFunctionalityPageAction.resourceCreateBtn(driver);
		//CommonFunctionalityPageAction.clickOnResource(driver,dnDependsOn.getDependson_subnet_resourceName());
	}

	@And("^User fill cidr and vpc id of Subnet for Depends On")
	public void user_fill_cidr_and_vpc_id_of_Subnet_for_Depends_On() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnDependsOn.getDependson_subnet_resourceName());
		PageFactory.initElements(driver,AWSSubnetPageObject.class);
		AWSDependsOnPageAction.enterAttributesForSubnet(driver, dnDependsOn.getDependson_subnet_cidr(),dnDependsOn.getDependson_subnet_vpcid());
	}

	@When("^User click depends on resource and drag on the dashboard$")
	public void user_drag_and_drop_the_depends_on_resource() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSDependsOnPageObject.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSDependsOnPageObject.dependsOn_resource);

	}
	@And("^User enter the name of depends on resource$")
	public void user_enter_the_name_of_depends_on_resource() throws Throwable {
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnDependsOn.getDependson_rname());
	}
	@When("^User click the depends on resource$")
	public void user_click_the_depends_on_resource() throws Throwable {
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnDependsOn.getDependson_rname());
	}
	@And("^User fill the invalid depends on attribute$")
	public void user_fill_the_invalid_depends_on_attribute() throws Throwable{
		PageFactory.initElements(driver,AWSKeyPairPageObject.class);
		AWSDependsOnPageAction.enterInvalidDependsOnAttribute(driver,dnKeyPair.getInvalidPublic_key());
	}
	@And("^User fill the depends on attribute for Depends On$")
	public void user_fill_the_depends_on_attribute_for_Depends_On() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		AWSDependsOnPageAction.enterDependsOnAttribute(driver, dnDependsOn.getDependson_Vpc_Env());
	}
	@Then("^User delete the environment for subnet and see message environment deleted successfully for Depends On$")
	public void user_delete_the_environment_for_subnet_and_see_message_environment_deleted_successfully_for_Depends_On() throws Throwable {
		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,dnDependsOn.getDependson_Env());
	}
	
	@Then("^User search for environment and select environment$")
	public void user_search_for_environment_and_select_environment_for_VPCDepends_On() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		CommonFunctionalityPageAction.refreshPage(driver);
		//EnvironmentPageAction.environmentDropdown(driver);
		AWSDependsOnPageAction.searchEnvironmentVPCDependson(driver,dnDependsOn.getDependson_Vpc_Env());
	}
	
	@Then("^User delete the environment for vpc and see message environment deleted successfully for Depends On$")
	public void user_delete_the_environment_for_vpc_and_see_message_environment_deleted_successfully_for_Depends_On() throws Throwable {
		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,dnDependsOn.getDependson_Vpc_Env());
	}
}
