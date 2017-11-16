package com.opex.test.step_definitions;
import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSIAMPolicyPageAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSIAMPolicyPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSIAMPolicySD extends SuperUsedDefinition{

	public AWSIAMPolicySD()
	{
		super();
	}
	
	
	@Then("^User create or search an environment for IAM policy and see message as environment created successfully$")
	public void user_create_or_search_an_environment_for_IAM_policy() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);	
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,dnIamPolicy.getIamPolicy_envname());
	
	}
	
	@When("^User click IAM policy resource and drag on the dashboard$")
	public void user_select_IAM_policy_resource_to_the_environment() throws Throwable{
		
		PageFactory.initElements(driver,AWSIAMPolicyPageObject.class);
		AWSIAMPolicyPageAction.selectIAMpolicy(driver);
	}

	@Then("^User enter the IAM policy resource name as blank$")
	public void user_enter_the_IAM_policy_resource_name_as_blank() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnIamPolicy.getIamPolicy_blankData() );
	}
	
	@And("^User enter the resource name for IAM Policy$")
	public void user_enter_the_resource_name_for_IAM_Policy() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnIamPolicy.getIamPolicy_rname() );
	}
	
	@When("^User click on IAM policy resource$")
	public void user_click_on_IAM_policy_resource_to_fill_the_attributes() throws Throwable{

		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnIamPolicy.getIamPolicy_rname());
	}
	
	@And("^User delete the resource by clicking the cross button on resource for IAM policy$")
	public void user_delete_the_resource_by_clicking_the_cross_button_on_resource_for_IAM_policy() throws Throwable {
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver, dnIamPolicy.getIamPolicy_rname());
	}
	
	@When("^User dont delete the resource by clicking the cross button on resource for IAM policy$")
	public void user_dont_delete_the_resource_by_clicking_the_cross_button_on_resource_for_IAM_policy() throws Throwable {
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnIamPolicy.getIamPolicy_rname());
	}
	
	@And("^User fill the connection for IAM policy$")
	public void user_fill_the_connection_for_IAM_policy()throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver,dnIamPolicy.getIamPolicy_con());
	}
	@And("^User fill the dependsOn for IAM policy$")
	public void user_fill_the_dependsOn_for_IAM_policy()throws Throwable{

		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnIamPolicy.getIamPolicy_depends_on());
	}

	@And("^User fill the policy for IAM policy$")
	public void user_fill_the_Json_for_IAM_policy()throws Throwable{

		PageFactory.initElements(driver, AWSIAMPolicyPageObject.class);
		AWSIAMPolicyPageAction.enterIAMPolicyAttributePolicy(driver, dnIamPolicy.getIamPolicy_policy());
	}
	
	@And("^User fill the description for IAM policy$")
	public void user_fill_the_description_for_IAM_policy()throws Throwable{

		PageFactory.initElements(driver, AWSIAMPolicyPageObject.class);
		AWSIAMPolicyPageAction.enterIAMPolicyAttributeDescription(driver,dnIamPolicy.getIamPolicy_description());
	}
	@And("^User fill the path for IAM policy$")
	public void user_fill_the_path_for_IAM_policy()throws Throwable{

		PageFactory.initElements(driver, AWSIAMPolicyPageObject.class);
		AWSIAMPolicyPageAction.enterIAMPolicyAttributePath(driver,dnIamPolicy.getIamPolicy_path());
	}

		
	@And("User fill the mandatory fields as blank for IAM policy")
	public void user_fill_the_mandatory_fields_as_blank_for_IAM_policy()throws Throwable{

		PageFactory.initElements(driver,AWSIAMPolicyPageObject.class);
		AWSIAMPolicyPageAction.enterIAMPolicyAttributePolicy(driver,dnIamPolicy.getIamPolicy_con());
		
	}
	
	@Then("^User search for attributes in the resource details \"(.*)\" for IAM policy$")
	public void user_search_for_attributes_in_the_resource_details_for_IAM_policy(String value) throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDetailsAttributeSeachBar(driver,value);
	}
	@Then("^User search for attributes in the resource section \"(.*)\" for IAM policy$")
	public void user_search_for_attributes_in_the_resource_section_for_IAM_policy(String value) throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceAttributeSearchBar(driver, value);
	}

	@Then("^User delete the environment for IAM Policy and see message environment deleted successfully$")
	public void user_delete_the_environment_for_IAM_Policy() throws Throwable {
		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,dnIamPolicy.getIamPolicy_envname());
	}

}