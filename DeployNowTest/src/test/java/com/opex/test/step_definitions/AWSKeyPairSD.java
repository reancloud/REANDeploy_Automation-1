package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSKeyPairPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSKeyPairPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSKeyPairSD extends SuperUsedDefinition{

	public AWSKeyPairSD()
	{
		super();
	}
	
	
	@Then("^User create or search an environment for Key Pair and see message as environment created successfully$")
	public void user_search_n_select_the_required_environment_for_Key_Pair() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, dnKeyPair.getKeypair_envname());
	}
	
	@Then("^User delete the environment for Key Pair and see message environment deleted successfully$")
	public void user_delete_the_environment_for_Key_Pair() throws Throwable {
		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,dnKeyPair.getKeypair_envname());
	}
	
	@When("^User click Key Pair resource and drag on the dashboard$")
	public void user_click_key_pair_resource_and_drag_on_the_dashboard() throws Throwable{
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,AWSKeyPairPageObject.class);
		AWSKeyPairPageAction.selectKeyPair(driver);
	}
	@And("^User enter the resource name for Key Pair$")
	public void user_enter_the_resource_name_for_key_Pair() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnKeyPair.getKeypair_rname());
	}
	@When("^User click on key pair resource$")
	public void user_click_on_the_key_pair_resource() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnKeyPair.getKeypair_rname());
		
	}

	@And("^User fill the key name for Key Pair$")
	public void user_fill_the_key_name_for_Key_pair() throws Throwable{
		PageFactory.initElements(driver,AWSKeyPairPageObject.class);
		AWSKeyPairPageAction.enterKeyName(driver,dnKeyPair.getKey_name());
	
	}
	
	@And("^User fill the public key for Key Pair$")
	public void user_fill_the_public_key_for_Key_pair() throws Throwable{
		PageFactory.initElements(driver,AWSKeyPairPageObject.class);
		AWSKeyPairPageAction.enterPublicKey(driver,dnKeyPair.getPublic_key());
	}
	@And("^User fill the connection for Key Pair")
	public void user_fill_the_connection_for_key_pair_resource() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver, dnKeyPair.getKeypair_blankdata());
		
	}
	
	@And("^User fill the invalid public key for Key Pair$")
	public void user_fill_the_invalid_public_key_for_Key_pair() throws Throwable{
		PageFactory.initElements(driver,AWSKeyPairPageObject.class);
		AWSKeyPairPageAction.enterInvalidPublicKey(driver,dnKeyPair.getInvalidPublic_key());
	}
	
	@Then("^User enter the resource name as blank for Key Pair$")
	public void user_enter_the_resource_name_as_blank_for_key_Pair() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnKeyPair.getKeypair_blankdata());
	}
	
	@Then("^User click on cross and click on please delete it button for KeyPair$")
	public void user_click_on_cross_and_click_on_please_delete_it_button_for_KeyPair() throws Throwable {
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver, dnKeyPair.getKeypair_rname());
	}

	@Then("^User click on cross and click on dont delete it button for Key Pair$")
	public void user_click_on_cross_and_click_on_dont_delete_it_button_for_KeyPair() throws Throwable {
	
	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnKeyPair.getKeypair_rname());
	}
}