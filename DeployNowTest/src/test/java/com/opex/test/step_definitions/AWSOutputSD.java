package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSOutputPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.SleepFunctionality;
import com.opex.test.pageobjects.AWSOutputPage;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSOutputSD extends SuperUsedDefinition{

	public AWSOutputSD()
	{
		super();
	} 

	@Then("^User search or create environment for output and see message as environment created successfully$")
	public void user_search_or_create_environment_for_output_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, AWSOutputPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSOutputSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}
	@Then("^User delete output environment and see message environment deleted sucessfully$")
	public void user_delete_output_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSOutputSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
	@And("^User drag vpc resource and enter mandatory attributes for output$")
	public void user_drag_output_resource_and_enter_mandatory_attributes_for_output() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		SleepFunctionality.sleepTime(3000);
		CommonFunctionalityPageAction.enterResourceName(driver,dnOutput.getOutput_vpc_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		SleepFunctionality.sleepTime(3000);
		CommonFunctionalityPageAction.clickOnResource(driver,dnOutput.getOutput_vpc_Rname());
		AWSVpcPageAction.vpcCidrBlock(driver,dnOutput.getOutput_vpc_cidr());
	}


	@When("^User click output resource and drag on the dashboard$")
	public void user_click_output_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSOutputPage.class);
		AWSOutputPageAction.resourceDragDrop(driver,AWSOutputPage.resource_output);
	}

	@Then("^User click on output resource$")
	public void user_click_on_output_resource() throws Throwable {
		PageFactory.initElements(driver, AWSOutputPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSOutputPageAction.clickResource(driver);
	}

	@And("^User enter dependson for Output$")
	public void user_enter_dependson_for_Output() throws Throwable {
		PageFactory.initElements(driver, AWSOutputPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnOutput.getOutput_dependsOn());
	}

	@And("^User select connection from output$")
	public void we_select_connection_from_output() throws Throwable {
		PageFactory.initElements(driver, AWSOutputPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver, dnOutput.getOutput_connection());
	}

	@And("^User set json for Output resource$")
	public void User_set_json_for_Output_resource() throws Throwable {
		PageFactory.initElements(driver, AWSOutputPage.class);
		AWSOutputPageAction.enterOutputJson(driver, dnOutput.getOutput_outputJson());
	}

	@And("^User set invalid json for Output resource$")
	public void User_set_invalid_json_for_Output_resource() throws Throwable {
		PageFactory.initElements(driver, AWSOutputPage.class);
		AWSOutputPageAction.enterOutputJson(driver,dnOutput.getOutput_outputJson_invalid());

	}

	@And("^User click on please delete it resource cross button popup for output$")
	public void User_click_on_please_delete_it_resource_cross_button_popup_for_output() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSOutputPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dnOutput.getOutput_resourceName());;

	}

	@And("^User click on please dont delete it resource cross button popup for output$")
	public void User_click_on_please_dont_delete_it_resource_cross_button_popup_for_output() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSOutputPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnOutput.getOutput_resourceName());;
	}


}
