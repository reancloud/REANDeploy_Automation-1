package com.opex.test.step_definitions;



import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSIAMGroupPageAction;

import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import com.opex.test.pageobjects.AWSIAMGroupPageObject;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSIAMGroupSD extends SuperUsedDefinition{

	public AWSIAMGroupSD()
	{
		super();
	}
	
	@Then("^User create or search an environment for IAM group and see message as environment created successfully$")
	public void user_create_or_search_an_environment_for_IAM_group() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, dnIamGroup.getIamGroup_envname());

	}
	
	@Then("^User delete the environment for IAM Group and see message environment deleted successfully$")
	public void user_delete_the_environment_for_IAM_Group() throws Throwable {
		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,dnIamGroup.getIamGroup_envname());
	}
	
	@When("^User click IAM group resource and drag on the dashboard$") 
	public void user_select_iam_group_resource_to_the_environment() throws Throwable{
		
		PageFactory.initElements(driver, AWSIAMGroupPageObject.class);
		AWSIAMGroupPageAction.selectIAMgroup(driver);
	}
	
	@And("^User enter IAM group resource name$")
	public void user_enter_IAM_group_resource_name() throws Throwable{

		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnIamGroup.getIamGroup_rname());
	

	}
	@When("^User click on IAM group resource$")
	public void user_click_on_IAM_group_resource_to_fill_the_attributes() throws Throwable{

		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnIamGroup.getIamGroup_rname());
	

	}
	
	@And("User enter the connection attribute for IAM group")
	public void user_enter_the_connection_attribute_for_IAM_group() throws Throwable{
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver, dnIamGroup.getIamGroup_con());
		
	}
	
	@And("User enter the depends on attribute for IAM group")
	public void user_enter_the_depends_on_attribute_for_IAM_group() throws Throwable{
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnIamGroup.getIamGroup_depends_on());
		
	}
	
	@And("User enter the path attribute for IAM group")
	public void user_enter_the_path_attribute_for_IAM_group() throws Throwable{
		
		PageFactory.initElements(driver, AWSIAMGroupPageObject.class);
		AWSIAMGroupPageAction.pathAttributeIamGroup(driver, dnIamGroup.getIamGroup_path());
		
	}
		
	@Then("^User fill the attributes as blank for IAM group$")
	public void user_fill_the_attributes_as_blank_for_IAM_group() throws Throwable{
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnIamGroup.getIamGroup_blankData());
		PageFactory.initElements(driver, AWSIAMGroupPageObject.class);
		AWSIAMGroupPageAction.pathAttributeIamGroup(driver, dnIamGroup.getIamGroup_blankData());
	}
	
	@And("^User delete the resource by clicking the cross button on IAM group$")
	public void user_delete_the_resource_by_clicking_the_cross_button_on_IAM_group() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver, dnIamGroup.getIamGroup_rname());
		
	}
	@And("^User dont delete the resource by clicking the cross button on IAM group$")
	public void user_dont_delete_the_resource_by_clicking_the_cross_button_on_IAM_group() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver, dnIamGroup.getIamGroup_rname());
		
	}
	
	@Then("^User enter the blank resource name for IAM group$")
	public void user_enter_IAM_group_resource_name_for_IAM_group() throws Throwable{

		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnIamGroup.getIamGroup_blankData());
	

	}
}