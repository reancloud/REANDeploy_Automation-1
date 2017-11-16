package com.opex.test.step_definitions;
import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.AWSIAMRolePolicyPageAction;
import com.opex.test.modules.AWSIAMRolePageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSIAMRolePolicyPageObject;
import com.opex.test.pageobjects.AWSIAMRolePage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSIAMRolePolicySD extends SuperUsedDefinition{

	public  AWSIAMRolePolicySD(){
		super();
	}

	@Then("^User search or create environment for IAMRolePolicy and see message as environment created successfully$")
	public void user_search_or_create_environment_for_IAMRolePolicy_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSIAMRolePolicySD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);  
	}
	
	@Then("^User delete IAMRolePolicy environment and see message environment deleted sucessfully$")
	public void user_delete_IAMRolePolicy_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSIAMRolePolicySD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
	
	@Then("^we dragdrop iamrole resource and enter attribute for IAMRolePolicy$")
	public void we_dragdrop_iamrole_resource_enter_attribute_for_IAMRolePolicy() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePage.class);
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class); 
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSIAMRolePage.resource_iamrole);
		CommonFunctionalityPageAction.enterResourceName(driver,dnIMRP.getIamRolePolicy_iamRole_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver,dnIMRP.getIamRolePolicy_iamRole_rname());
		AWSIAMRolePageAction.enterAssumeRolePolicy(driver,dnIMRP.getIamRolePolicy_iamRole_assume_role_policy());
	}

	@When("^User click IAMRolePolicy resource and drag on the dashboard$")
	public void user_click_IAMRolePolicy_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class); 
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSIAMRolePolicyPageObject.resource_IAMRole_Policy);
	}

	@When("^User enter IAMRolePolicy resource name$")
	public void user_enter_IAMRolePolicy_resource_name() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class);   
		CommonFunctionalityPageAction.enterResourceName(driver,dnIMRP.getIamRolePolicy_Rname());
	}

	@When("^User click on IAMRolePolicy resource$")
	public void user_click_on_IAMRolePolicy_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class);  
		CommonFunctionalityPageAction.clickOnResource(driver,dnIMRP.getIamRolePolicy_Rname());
	}
	
	@And("^User enter name for IAMRolePolicy$")
	public void user_enter_name_for_IAMRolePolicy() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class);   
		AWSIAMRolePolicyPageAction.enterName(driver,dnIMRP.getIamRolePolicy_name());
	}
	
	@And("^User set policy for IAMRolePolicy$")
	public void user_set_policy_for_IAMRolePolicy() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class);  
		AWSIAMRolePolicyPageAction.enterPolicy(driver,dnIMRP.getIamRolePolicy_policy());
			
	}
	
	@And("^User enter role for IAMRolePolicy$")
	public void user_enter_role_for_IAMRolePolicy() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class);  
		AWSIAMRolePolicyPageAction.enterRole(driver, dnIMRP.getIamRolePolicy_role());
	}

	@And("^User enter dependson for IAMRolePolicy$")
	public void user_enter_dependson_for_IAMRolePolicy() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class);  
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnIMRP.getIamRolePolicy_dependson());
	}

	@And("^User select connection for IAMRolePolicy$")
	public void user_select_connection_for_IAMRolePolicy() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class);  
		CommonFunctionalityPageAction.selectConnection(driver, dnIMRP.getIamRolePolicy_connection());
	}

	@And("^User enter attributes for IAMRolePolicy$")
	public void User_enter_attributes_for_IAMRolePolicy() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMRolePolicyPageObject.class);  
		AWSIAMRolePolicyPageAction.enterPolicy(driver,dnIMRP.getIamRolePolicy_policy());
		AWSIAMRolePolicyPageAction.enterRole(driver, dnIMRP.getIamRolePolicy_role());
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnIMRP.getIamRolePolicy_dependson());
		CommonFunctionalityPageAction.selectConnection(driver, dnIMRP.getIamRolePolicy_connection());
	}


}
