/*package com.opex.test.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWS_EcsService_PageAction;
import com.opex.test.modules.AWS_Ecs_Task_Def_pageaction;
import com.opex.test.modules.AWS_Instance_PageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.SignInAction;
import com.opex.test.modules.SignoutAction;
import com.opex.test.pageobjects.AWS_ECS_Task_Def_Page;
import com.opex.test.pageobjects.AWS_EcsService_PageObject;
import com.opex.test.pageobjects.AWS_Instance_PageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.LogoutPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWS_EcsService_SD extends SuperUsedDefinition{
	

	  public AWS_EcsService_SD ()
	  {
		  super();
	  }
	  @Then("^I create or search an environment for ECS Service$")
		public void i_create_or_search_an_environment_for_ECS_Service() throws Throwable{
			String className = AWS_EcsService_SD .class.getSimpleName();
			String env_name = dnowEnv.getEnv_name()+className;		
			PageFactory.initElements(driver,EnvironmentPage.class);
			EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);

		}
	 
	
	@When("^I select Ecs Service resource to the environment$")
		public void i_select_Ecs_Service_resource_to_the_environment() throws Throwable{
			PageFactory.initElements(driver,AWS_EcsService_PageObject.class);
			AWS_EcsService_PageAction.dragdropecsservice(driver);
		}
	  @Then("^i enter resource name of Ecs Service$")
		public void i_enter_resource_name_of_Ecs_Service() throws Throwable {
			PageFactory.initElements(driver, AWS_EcsService_PageObject.class);
			String resourceName=ecsservice.getecs_name();
		     System.out.println(resourceName);
			AWS_EcsService_PageAction.resourceNameEnter(driver,resourceName);
		}
	  @Then("^i click on Ecs Service resource$")
		public void i_click_on_Ecs_Service_resource() throws Throwable {
			PageFactory.initElements(driver,  AWS_EcsService_PageObject.class);
			AWS_EcsService_PageAction.clickEcsService(driver);
		}
	  @Then("^i delete the created environment for Ecs Service$")
		public void i_delete_the_created_environment_for_Ecs_Service() throws Throwable {
			String className =  AWS_EcsService_SD.class.getSimpleName();
			String env_name = dnowEnv.getEnv_name()+className;
			PageFactory.initElements(driver,EnvironmentPage.class);
			EnvironmentPageAction.environmentDropdown(driver);
			EnvironmentPageAction.deleteEnvironment(driver,env_name);
		}
	  
	  @Then("^I fill the attributes as blank under Ecs Service resource section$")
		public void i_fill_the_attributes_as_blank_under_Ecs_Service_resource_section() throws Throwable{

			PageFactory.initElements(driver,  AWS_EcsService_PageObject.class);

			AWS_EcsService_PageAction.resourceAttributesBlank(driver);

		}
	  @Then("^i enter desired count for Ecs Service$")
		public void i_enter_desired_count_for_Ecs_Service() throws Throwable {
			PageFactory.initElements(driver,  AWS_EcsService_PageObject.class);
			AWS_EcsService_PageAction.Resourcedesiredcount(driver,ecsservice.getdesired_count() );
		}
	  @Then("^i enter task definition for Ecs Service$")
		public void i_enter_task_definition_for_Ecs_Service() throws Throwable {
			PageFactory.initElements(driver,   AWS_EcsService_PageObject.class);
			AWS_EcsService_PageAction.Resourcetaskdefinition(driver, ecsservice.gettask_definition());
		}
	  @Then("^I enter the blank Ecs Service resource name$")
		public void i_enter_the_blank_Ecs_Service_resource_name() throws Throwable{
			PageFactory.initElements(driver,AWS_EcsService_PageObject.class);
			AWS_EcsService_PageAction.enterEcsServiceBlankName(driver);
		}
	  @Then("^User click on the Ecs Service resource name link$")
		public void user_click_on_the_Ecs_Service_resource_name_link() throws Throwable{

			PageFactory.initElements(driver, AWS_EcsService_PageObject.class);
			AWS_EcsService_PageAction.resourceNameLinkEcsService(driver);

		}
	  @And("^I dont delete the Ecs Service resource by clicking the cross button on resource$")
		public void i_dont_delete_the_Ecs_Service_resource_by_clicking_the_cross_button_on_resource() throws Throwable {
			PageFactory.initElements(driver,CommonFunctionalityPage.class);
			AWS_EcsService_PageAction.resourceCrossBtnPleaseDontDeleteEcsService(driver);
		}
	  @When("^I  delete the Ecs Service resource by clicking the cross button on resource$")
		public void i_delete_the_Ecs_Service_resource_by_clicking_the_cross_button_on_resource() throws Throwable {
			PageFactory.initElements(driver,AWS_EcsService_PageObject.class);
			AWS_EcsService_PageAction.resourceCrossBtnPleaseDeleteEcsService(driver);
		}
}

*/