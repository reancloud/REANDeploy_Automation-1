package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.AWSInputVariablePageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSInputVariablePageObject;
import com.opex.test.pageobjects.AWSVpcPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class  AWSInputVariableSD extends SuperUsedDefinition{

	public AWSInputVariableSD()
	{
		super();
	}


	@Then("^User search or create an environment for Input Variable and see message as environment created successfully$")
	public void user_search_or_create_an_environment_for_Input_Variable() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, dnInputVariables.getInputVariablesEnvname());
	}

	@When("^User click VPC resource and drag on the dashboard for Input Variable$")
	public void user_click_VPC_resource_and_drag_on_the_dashboard_for_Internet_Gateway() throws Throwable {
		
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		CommonFunctionalityPageAction.enterResourceName(driver, dnInputVariables.getInputVariable_vpc_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver, dnInputVariables.getInputVariable_vpc_rname());
		AWSVpcPageAction.vpcCidrBlock(driver, dnInputVariables.getInputVariable_vpc_cidr());
		CommonFunctionalityPageAction.saveResource(driver);
	}

	@When("^User click Input Variable resource and drag on the dashboard$")
	public void user_select_Input_Variable_resource_to_the_environment() throws Throwable{

		PageFactory.initElements(driver,AWSInputVariablePageObject.class);
		AWSInputVariablePageAction.selectInputVar(driver);
	}

	@When("^User click on Input Variable resource$")
	public void user_click_on_Input_Variable_resource_to_fill_the_attributes() throws Throwable{
		PageFactory.initElements(driver,AWSInputVariablePageObject.class);
		AWSInputVariablePageAction.clickResourceInputVar(driver);
	}



	@When("^User click the name text box for Input Variable to edit resource name \"(.*)\"$")
	public void user_click_the_name_text_box_to_edit_resource_name_for_input_variable(String value) throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceNameEditTextBox(driver,value);
	}


	@Then("^User delete the environment for Input Variable and see message environment deleted successfully$")
	public void user_delete_the_environment_for_Input_Variable() throws Throwable{

		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,dnInputVariables.getInputVariablesEnvname());
	}


	@And("^User enter input variables attribute for Input Variable$")
	public void user_enter_input_variables_attribute_for_Input_Variable() throws Throwable {

		PageFactory.initElements(driver,AWSInputVariablePageObject.class);
		AWSInputVariablePageAction.enterJsonInputVar(driver,dnInputVariables.getInputVariablesAttribute());

	}

	@And("^User enter input variables attribute as invalid for Input Variable$")
	public void user_enter_input_variables_attribute_as_invalid_for_Input_Variable() throws Throwable {

		PageFactory.initElements(driver,AWSInputVariablePageObject.class);
		AWSInputVariablePageAction.enterJsonInputVar(driver," ");
	}



	@Then("^User search for attributes in the resource details \"(.*)\" for Input Variable$")
	public void user_search_for_attributes_in_the_resource_details_for_Input_variable(String value) throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDetailsAttributeSeachBar(driver,value);
	}

	@Then("^User search for attributes in the resource section \"(.*)\" for Input Variable$")
	public void user_search_for_attributes_in_the_resource_section_for_Input_variable(String value) throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceAttributeSearchBar(driver,value);
	}

	@And("^User delete the resource by clicking the cross button on resource for Input Variable$")
	public void user_delete_the_resource_by_clicking_the_cross_button_on_resource_for_Input_Variable() throws Throwable {
		PageFactory.initElements(driver,AWSInputVariablePageObject.class);
		AWSInputVariablePageAction.resourceCrossBtnPleaseDeleteInputVar(driver);
	}

	@And("^User dont delete the resource by clicking the cross button on resource for Input Variable$")
	public void user_dont_delete_the_resource_by_clicking_the_cross_button_on_resource_for_Input_Variable() throws Throwable {
		PageFactory.initElements(driver,AWSInputVariablePageObject.class);
		AWSInputVariablePageAction.resourceCrossBtnPleaseDontDeleteInputVar(driver);
	}
}