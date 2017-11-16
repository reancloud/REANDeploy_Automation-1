/*package com.opex.test.step_definitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.modules.AWS_Ecs_Task_Def_pageaction;
import com.opex.test.modules.AWS_IAM_Group_PageAction;
import com.opex.test.modules.AWS_Instance_PageAction;
import com.opex.test.modules.AWS_Route53_Record_PageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWS_ECS_Task_Def_Page;
import com.opex.test.pageobjects.AWS_IAM_Group_PageObject;
import com.opex.test.pageobjects.AWS_Instance_PageObject;
import com.opex.test.pageobjects.AWS_Route53_Record_Page;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWS_ECS_Task_def_SD extends SuperUsedDefinition  {
	
	  public AWS_ECS_Task_def_SD()
	  {
		  super();
	  }
	  @Then("^I create or search an environment for ECS Task Def$")
		public void i_create_or_search_an_environment_for_ECS_Task_Def() throws Throwable{
			String className = AWS_ECS_Task_def_SD.class.getSimpleName();
			String env_name = dnowEnv.getEnv_name()+className;		
			PageFactory.initElements(driver,EnvironmentPage.class);
			EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);

		}
	 
	
	@When("^I select Ecs Task def resource to the environment$")
		public void i_select_Ecs_Task_def_resource_to_the_environment() throws Throwable{
			PageFactory.initElements(driver,AWS_ECS_Task_Def_Page.class);
			AWS_Ecs_Task_Def_pageaction.dragdropecstask_def(driver);
		}
	  @Then("^i enter resource name of Ecs Task def$")
		public void i_enter_resource_name_of_Ecs_Task_def() throws Throwable {
			PageFactory.initElements(driver, AWS_ECS_Task_Def_Page.class);
			PageFactory.initElements(driver, CommonFunctionalityPage.class);
			AWS_Ecs_Task_Def_pageaction.enterEcsTaskDef(driver);  
		}
	  @Then("^i click on Ecs Task def resource$")
		public void i_click_on_Ecs_Task_def_resource() throws Throwable {
			PageFactory.initElements(driver,  AWS_ECS_Task_Def_Page.class);
			AWS_Ecs_Task_Def_pageaction.clickEcsTaskdef(driver);
		}
	  @Then("^i delete the created environment for Ecs Task def$")
		public void i_delete_the_created_environment_for_Ecs_Task_def() throws Throwable {
			String className =  AWS_ECS_Task_def_SD.class.getSimpleName();
			String env_name = dnowEnv.getEnv_name()+className;
			PageFactory.initElements(driver,EnvironmentPage.class);
			EnvironmentPageAction.environmentDropdown(driver);
			EnvironmentPageAction.deleteEnvironment(driver,env_name);
		}
	  
	  @Then("^I fill the attributes as blank under Ecs Task def resource section$")
		public void i_fill_the_attributes_as_blank_under_Ecs_Task_def_resource_section() throws Throwable{

			PageFactory.initElements(driver,  AWS_ECS_Task_Def_Page.class);

			AWS_Ecs_Task_Def_pageaction.resourceAttributesBlank(driver);

		}
	  @Then("^i enter container definition for Ecs Task def$")
		public void i_enter_container_definition_for_Ecs_Task_def() throws Throwable {
			PageFactory.initElements(driver,  AWS_ECS_Task_Def_Page.class);
			AWS_Ecs_Task_Def_pageaction.Resourcecontainerdefinition(driver,ecstaskdef.getContainer_details());
		}
	  @Then("^i enter family for Ecs Task def$")
		public void i_enter_family_for_Ecs_Task_def() throws Throwable {
			PageFactory.initElements(driver,  AWS_ECS_Task_Def_Page.class);
			AWS_Ecs_Task_Def_pageaction.Resourcefamily(driver,ecstaskdef.getfamily());
		}
	  @Then("^I enter the blank Ecs Task def resource name$")
		public void i_enter_the_blank_Ecs_Task_def_resource_name() throws Throwable{
			PageFactory.initElements(driver,AWS_ECS_Task_Def_Page.class);
			AWS_Ecs_Task_Def_pageaction.enterEcsTaskBlankName(driver);
		}
	  @Then("^User click on the Ecs Task def resource name link$")
		public void user_click_on_the_Ecs_Task_def_resource_name_link_for_Instnace() throws Throwable{

			PageFactory.initElements(driver, AWS_ECS_Task_Def_Page.class);
			AWS_Ecs_Task_Def_pageaction.resourceNameLinkEcsTaskDef(driver);

		}
	  @And("^I dont delete the Ecs Task def resource by clicking the cross button on resource$")
		public void i_dont_delete_the_Ecs_Task_def_resource_by_clicking_the_cross_button_on_resource() throws Throwable {
			PageFactory.initElements(driver,CommonFunctionalityPage.class);
			AWS_Ecs_Task_Def_pageaction.resourceCrossBtnPleaseDontDeleteEcsTaskDef(driver);
		}
	  @When("^I  delete the Ecs Task def resource by clicking the cross button on resource$")
		public void i_delete_the_Ecs_Task_def_resource_by_clicking_the_cross_button_on_resource() throws Throwable {
			PageFactory.initElements(driver,AWS_ECS_Task_Def_Page.class);
			AWS_Ecs_Task_Def_pageaction.resourceCrossBtnPleaseDeleteEcsTaskDef(driver);
		}
}

*/