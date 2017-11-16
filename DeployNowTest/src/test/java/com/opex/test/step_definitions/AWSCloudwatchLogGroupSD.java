package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSCloudwatchLogGroupPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.pageobjects.AWSCloudwatchLogGroupPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSCloudwatchLogGroupSD extends SuperUsedDefinition{
    
	public AWSCloudwatchLogGroupSD()
	{
   	 super(); 	 
	}
	
	@Then("^User search or create environment for Cloudwatch log group and see message as environment created successfully$")
	public void User_search_or_create_environment_for_Cloudwatch_log_group_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSCloudwatchLogGroupSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name);
	}

	@When("^User click Cloudwatch log group resource and drag on the dashboard$")
	public void User_click_Cloudwatch_log_group_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, AWSCloudwatchLogGroupPageObject.class);
	   	 PageFactory.initElements(driver, EnvironmentPage.class);
	   	AWSCloudwatchLogGroupPageAction.ResourceSelectCloud(driver);
	}

	@And("^User enter resource name for Cloudwatch log group resource$")
	public void User_enter_resource_name_for_Cloudwatch_log_group_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
	   	CommonFunctionalityPageAction.enterResourceName(driver,dncloud.getcloud_name() );
	}

	@When("^User click on Cloudwatch log group resource$")
	public void User_click_on_Cloudwatch_log_group_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dncloud.getcloud_name());
	}
	@And("^User enter name of Cloudwatch log group resource$")
	public void User_enter_name_of_Cloudwatch_log_group_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSCloudwatchLogGroupPageAction.enterName(driver,dncloud.getcloud_name());
	}
	@And("^User enter depends on for Cloudwatch log group resource$")
	public void User_enter_depends_on_for_Cloudwatch_log_group_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dncloud.getcloud_depends_on());
	}

	@And("^User enter retention_in_days for Cloudwatch log group resource$")
	public void User_enter_retention_in_days_for_Cloudwatch_log_group_resource() throws Throwable {
		PageFactory.initElements(driver, AWSCloudwatchLogGroupPageObject.class);
	   	AWSCloudwatchLogGroupPageAction.Enter_retention_in_days(driver,dncloud.getcloud_retention_in_days());
	}
	@Then("^User delete Cloudwatch log group environment and see message environment deleted sucessfully$")
    public void User_delete_Cloudwatch_log_group_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
    	String className = AWSCloudwatchLogGroupSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
    }

}
