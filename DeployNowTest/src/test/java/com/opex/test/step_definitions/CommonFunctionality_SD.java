package com.opex.test.step_definitions;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.SignInAction;
import com.opex.test.modules.SignoutAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.LogoutPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Class which implements all the steps.
public class CommonFunctionality_SD extends SuperUsedDefinition{

	public CommonFunctionality_SD()
	{
		super();
	}
	
	
	@Given("^User direct to deploy now application$")
	public void user_direct_to_deploy_now_application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("url >"+url);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@When("^User log in$")
	public void user_log_in() throws Throwable {
		
		PageFactory.initElements(driver, LoginPage.class);
		SignInAction.execute(driver,datamap.get(0));
	}

	//This will be available for a few resources for which terraform import supports
	@And("^User checks the checkbox resource already Exists$")
	public void user_checks_resource_exists() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickResourceExists(driver);
	}

	@Then("^Login sucessfully should display$")
	public void Login_sucessfully_should_display() throws Throwable {
		
		PageFactory.initElements(driver, LoginPage.class);
		SignInAction.signinValidation(driver);
	}
	@Then("^User log out$")
	public void user_log_out()throws Throwable{
		PageFactory.initElements(driver, LogoutPage.class);
		SignoutAction.Execute(driver);
	}
	@Then("^Message should display resource created successfully$")
	public void  Message_should_display_resource_created_successfully() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceCreateBtn(driver);	
	}

	@Then("^User should see message environment saved successfully$")
	public void User_should_see_message_environment_saved_successfull() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.saveResource(driver);

	}

	@Then("^User click deploy button and should see message environment deployed successfully$")
	public void User_click_deploy_button_and_should_see_message_environment_deployed_successfully() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.deploy(driver);

	}

	@Then("^User should see environment status as deployed$")
	public void User_should_see_environment_status_deployed() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.verifyDeployStatusSuccess(driver);

	}

	@Then("^User should see environment status as failed$")
	public void User_should_see_environment_status_failed() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.verifyDeployStatusFailed(driver);

	}

	@Then("^User click deploy button and should see environment status as failed$")
	public void User_click_deploy_button_and_should_see_message_environment_failed() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.deployFails(driver);

	}

	@Then("^User click on deploy button and check deployment status$")
	public void User_click_on_deploy_button_and_check_deployment_status() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.deployfail(driver);

	}
	@Then("^User click redeploy button and should see message environment deployed successfully$")
	public void User_click_redeploy_button_and_should_see_message_environment_deployed_successfully() throws Throwable{

		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.Redeploy_button(driver);

	}
	
	
	
	@When("^User click the name text box to edit resource name \"(.*)\"$")
	public void user_click_the_name_text_box_to_edit_resource_name(String value) throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceNameEditTextBox(driver,value);
	}

	@Then("^User click on the cross close button when user drags the resource from resource section$")
	public void user_click_on_the_cross_close_button_when_user_drags_the_resource_from_resource_section() throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragCrossBtn(driver);
	}
	
	@Then("^User click on the close button when user drags the resource from resource section$")
	public void User_click_on_the_close_button_when_user_drags_the_resource_from_resource_section() throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceNameCloseBtn(driver);
	}
	
	@When("^User click on logs button on dash board$")
	public void user_click_on_logs_button() throws Throwable{
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceLogsButton(driver);
	}
	@And("^User click on close button on logs window$")
	public void user_click_on_close_button_on_logs_window() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceLogCloseButton(driver);
	}
	@And("^User click on cross close button on logs window$")
	public void user_click_on_cross_close_button_on_logs_window() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceLogCrossButton(driver);
	}
	@And("^User click on refresh button on logs window$")
	public void user_click_on_refresh_button_on_logs_window() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceLogRefreshButton(driver);
	}
	
	@When("^User click on canvas$")
	public void user_click_on_canvas() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickCanvas(driver);
	}
	
	@And("User refresh the page")
	public void user_refresh_the_page() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.refreshPage(driver);
	}
	
	@When("^User click on destroy button$")
	public void user_click_on_destroy_button() throws Throwable{
        PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDestroyButton(driver);
	}
	@Then("^User should see message environment destroyed sucessfully$")
	public void user_should_see_message_environment_destroyed_sucessfully() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceYesDestroyButton(driver);
	}

	
	@Then("^User click on dont destroy button$")
	public void user_click_on_dont_destroy_button() throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDontDestroyButton(driver);
	}
	
	@And("^User click on stop button$")
	public void user_click_on_stop_button() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceStopButton(driver);
	}
	@Then("^User click on yes stop it button$")
	public void user_click_on_yes_stop_it_button() throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceYesStopButton(driver);
	}
	@Then("^User click on dont stop button$")
	public void user_click_on_dont_stop_button() throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDontStopButton(driver);
	}
	
	@And("^User click on force stop button$")
	public void user_click_on_force_stop_button() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceForceStopButton(driver);
	}

	@Then("^User click on yes force stop it button$")
	public void user_click_on_yes_force_stop_it_button() throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceYesForceStopButton(driver);
	}
	@Then("^User click on dont force stop button$")
	public void user_click_on_dont_force_stop_button() throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDontForceStopButton(driver);
	}
	
	
	@And("^User click on resource details link on the attribute section$")
	public void user_click_on_resource_details_link_on_the_attribute_section() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDetailsAttributeLink(driver);
	}
	@And("^User click on resource link on the attribute section$")
	public void User_click_on_resource_link_on_the_attribute_section() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceAttributeLink(driver);
	}
	
	@When("^User click save button on pop up of resource name link$")
	public void user_click_save_button_on_pop_up_for_IAM_policy_resource() throws Throwable {

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceNameEditSaveBtn(driver);

	}
	
	@Then("^User click cross button on pop up of resource name link$")
	public void user_click_cross_button_on_pop_up_of_resource_link() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceNameEditCrossBtn(driver);
	}

	@Then("^User click close button on pop up of resource name link$")
	public void user_click_close_button_on_pop_up_for_IAM_policy_resource() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceNameEditCloseBtn(driver);
	}

	@Then("^User search for attributes in the resource details \"(.*)\"$")
	public void user_search_for_attributes_in_the_resource_details(String value) throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDetailsAttributeSeachBar(driver,value);
	}
	@Then("^User search for attributes in the resource section \"(.*)\"$")
	public void user_search_for_attributes_in_the_resource(String value) throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceAttributeSearchBar(driver, value);
	}
	@Then("^User select connection from dropdown")
	public void User_select_connection_from_dropdown() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver,dncon.getCon_name());
	}
	
@When("^User click on Package link")
	public void User_click_on_Package_link() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickonPackageLink(driver);
	}
	
	@Then("^User select Package link on rightsidebar")
	public void User_select_Package_link_on_rightsidebar() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickonPackageLinkRighsidebar(driver);
	}
	
	@And("^User double refresh the page$")
	public void User_double_refresh_the_page() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.doubleRefreshPage(driver);
	}
	
	@Then("^User click on resource name on rightsidebar")
	public void User_click_on_resource_name_on_rightsidebar() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceEditRnameclick(driver);
	}
	
}