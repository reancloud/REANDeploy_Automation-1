package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.PlanButtonPageAction;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.Then;

public class PlanbuttonSD extends SuperUsedDefinition {
	
	
	public PlanbuttonSD()
	{
		super();
	}
	@Then("^I create or search an environment for plan button$")
	public void i_create_or_search_an_environment_for_plan_button() throws Throwable{
		String className = PlanbuttonSD .class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);

	}
	@Then("^User click plan button on dash board$")
	public void User_click_plan_button_on_dash_board() throws Throwable{
		PageFactory.initElements(driver,EnvironmentPage.class);
		 PlanButtonPageAction.clickPlanButton(driver);
		
	}
	 @Then("^i delete the created environment for plan button$")
		public void i_delete_the_created_environment_for_plan_button() throws Throwable {
		String className = PlanbuttonSD .class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;		
		PageFactory.initElements(driver,EnvironmentPage.class);
			EnvironmentPageAction.environmentDropdown(driver);
			EnvironmentPageAction.deleteEnvironment(driver,env_name);
		}
	 
	 @Then("^User click the cross button on pop up window$")
		public void User_click_the_cross_button_on_pop_up_window() throws Throwable {
		 
		 PageFactory.initElements(driver,EnvironmentPage.class);
		 PlanButtonPageAction.clickCrossPlanButton(driver);
		
		}
	 @Then("^User click the close button on pop up window$")
		public void User_click_the_close_button_on_pop_up_window() throws Throwable {
		 
		 PageFactory.initElements(driver,EnvironmentPage.class);
		 PlanButtonPageAction.clickClosePlanButton(driver);
		
		}


}