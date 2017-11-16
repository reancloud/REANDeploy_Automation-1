package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.AWSIAMRolePageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSIAMRolePage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSIAMRoleSD extends SuperUsedDefinition {

	public AWSIAMRoleSD()
	{
		super();
	}

	@Then("^User search or create environment for iamrole and see message as environment created successfully$")
	public void User_search_or_create_environment_for_IAMRole_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, AWSIAMRolePage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		String className = AWSIAMRoleSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}
	
	@Then("^User delete iamrole environment and see message environment deleted sucessfully$")
	public void user_delete_iamrole_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSIAMRoleSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}

	@When("^User click iamrole resource and drag on the dashboard$")
	public void User_click_iamrole_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSIAMRolePage.resource_iamrole);
	}

	@And("^User enter iamrole resource name$")
	public void User_enter_iamrole_resource_name() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnIamRole.getIamRole_rname());
	}

	@When("^User enter blank resource name for iamrole$") 
	public void User_enter_blank_resource_name_for_iamrole() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		//CommonFunctionalityPageAction.enterResourceName(driver, dnIamRole.getIamRole_blankData());	
		CommonFunctionalityPageAction.enterResourceName(driver,"");
	}

	@When("^User click on iamrole resource$")
	public void User_click_on_iamrole_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnIamRole.getIamRole_rname());
	}

	@And("^User set assume_role_policy for iamrole$")
	public void User_set_assume_role_policy_for_iamrole() throws Throwable {
		PageFactory.initElements(driver, AWSIAMRolePage.class);
		AWSIAMRolePageAction.enterAssumeRolePolicy(driver, dnIamRole.getIamRole_assume_role_policy());
	}

	@And("^User set wrong assume_role_policy for iamrole$")
	public void User_set_wrong_assume_role_policy_for_iamrole() throws Throwable {
		PageFactory.initElements(driver, AWSIAMRolePage.class);
		AWSIAMRolePageAction.enterAssumeRolePolicy(driver,dnIamRole.getIamRole_con());
	}
	
	@And("^User enter name for iamrole$")
	public void User_enter_name_for_iamrole() throws Throwable{
		PageFactory.initElements(driver, AWSIAMRolePage.class);
		AWSIAMRolePageAction.enterNameAttributeIamRole(driver, dnIamRole.getIamRole_rname());
	}
	
	@And("^User enter dependson for iamrole$")
	public void User_enter_dependson_for_iamrole() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnIamRole.getIamRole_depends_on());
	}

	@And("^User select connection for iamrole$")
	public void User_select_connection_for_iamrole() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver, dnIamRole.getIamRole_con());
	}

	@And("^User enter nameprefix for iamrole$")
	public void User_enter_nameprefix_for_iamrole() throws Throwable {
		PageFactory.initElements(driver, AWSIAMRolePage.class);
		AWSIAMRolePageAction.enterNamePrefixIamRole(driver,dnIamRole.getIamRole_name_prefix());
	}

	@And("^User enter path for iamrole$")
	public void User_enter_path_for_iamrole() throws Throwable {
		PageFactory.initElements(driver, AWSIAMRolePage.class);
		AWSIAMRolePageAction.enterPathIamrole(driver,dnIamRole.getIamRole_path());
	}

	@And("^User click on please delete it resource cross button popup for iamrole$")
	public void User_click_on_please_delete_it_resource_cross_button_popup_for_iamrole() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver, dnIamRole.getIamRole_rname());
	}

	@And("^User click on please dont delete it resource cross button popup for iamrole$")
	public void User_click_on_please_dont_delete_it_resource_cross_button_popup_for_iamrole() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver, dnIamRole.getIamRole_rname());
	}
		
	
	
}