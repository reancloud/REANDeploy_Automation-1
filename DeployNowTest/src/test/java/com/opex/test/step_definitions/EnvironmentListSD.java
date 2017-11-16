package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.EnvironmentListPageAction;
import com.opex.test.pageobjects.AWSEBSVolumePageObject;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.pageobjects.ConnectionPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.EnvironmentListPageObject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnvironmentListSD extends SuperUsedDefinition{

	public EnvironmentListSD()
	{
		super();
	}
	
	@When("^User click on the dropdown for Environment list$")
	public void user_click_on_the_dropdown_for_Environment_list() throws Throwable{
		PageFactory.initElements(driver, EnvironmentListPageObject.class);
		PageFactory.initElements(driver, CommonPage.class);
		EnvironmentListPageAction.Execute(driver);
		
	}
	
	@Then("^User create the required environment for Environment_List$")
	public void user_create_the_required_environment_for_Environment_List() throws Throwable{
		PageFactory.initElements(driver, EnvironmentListPageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, dnEnvListAttributes.getNewEnv());
	}
	
	@Then("^User delete the environment for Environment_List$")
	public void user_delete_the_environment_for_Environment_List() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.deleteEnvironment(driver,dnEnvListAttributes.getNewEnv());
	}
	
	@When("^User click on the share environment button$")
	public void user_click_on_the_share_environment_button() throws Throwable{
		PageFactory.initElements(driver,EnvironmentListPageObject.class);
		EnvironmentListPageAction.clickShareEnv(driver, dnEnvListAttributes.getNewEnv());
	}
	
	@Then("^User click on the share environment yes button$")
	public void user_click_on_the_share_environment_yes_button() throws Throwable{

		PageFactory.initElements(driver,EnvironmentListPageObject.class);
		EnvironmentListPageAction.clickYesBtnEnvList(driver);
	}
	
	@Then("^User click on the share environment no button$")
	public void user_click_on_the_share_environment_no_button() throws Throwable{
		
		PageFactory.initElements(driver,EnvironmentListPageObject.class);
		EnvironmentListPageAction.clickNoBtnEnvList(driver);
	}
	
	@When("^User click on the deploy now logo$")
	public void user_click_on_the_deploy_now_logo() throws Throwable{
		
		PageFactory.initElements(driver,EnvironmentListPageObject.class);
		EnvironmentListPageAction.clickOnDeployNowLogo(driver);
	}
	
	@Then("^User enter environment in search bar$")
	public void user_enter_environment_in_search_bar() throws Throwable{
		
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,EnvironmentListPageObject.class);
		EnvironmentListPageAction.searchOnEnvList(driver,dnEnvListAttributes.getNewEnv());
	}
	

}
