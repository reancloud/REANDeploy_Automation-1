
package com.opex.test.step_definitions;
import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.ProviderPageAction;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.pageobjects.ConnectionPage;
import com.opex.test.pageobjects.ProviderPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProviderSD extends SuperUsedDefinition{

	public ProviderSD()
	{
		super();
	}

	@When("^User click dropdown link on dashboard$")
	public void User_click_welcome_link_on_dashboard() throws Throwable{
		PageFactory.initElements(driver, ProviderPage.class);
		ProviderPageAction.Execute(driver);
	}

	@And("^User click provider link on welcome dropdown$")
	public void User_click_provider_link_on_welcome_dropdown() throws Throwable{
		ProviderPageAction.selectProvidersFromDropdown(driver);
	}

	@Then("^User should see provider page$")
	public void User_should_see_provider_page() throws Throwable{
		ProviderPageAction.assertProviderPage(driver);
	}
	@Then("^User click save button and validate messagebox on provider page$")
	public void User_click_save_button_on_provider_page() throws Throwable{
		ProviderPageAction.performSaveClick(driver);//,dnProvider.getprovider_AWSname());
	}
	@Then("^User click update button and validate messagebox on provider page$")
	public void User_click_update_button_on_provider_page() throws Throwable{
		ProviderPageAction.performupdateClick(driver);//,dnProvider.getprovider_AWSname());
	}
	
	@When("^User enter provider name$")
	public void User_enter_provider_name() throws Throwable{
		//ProviderPageAction1.providerNameDummy(driver);
		ProviderPageAction.providerName(driver, dnProvider.getprovider_AWSname());
	}

	@And("^User enter provider type aws$")
	public void user_enter_provider_type_aws() throws Throwable{
		ProviderPageAction.providerType(driver, dnProvider.getprovider_AWStype());
	}

	@Then("^User creates/sees another aws provider$")
	public void user_creates_or_finds_another_AWS_provider() throws Throwable {
		PageFactory.initElements(driver, ProviderPage.class);
		PageFactory.initElements(driver, CommonPage.class);
		ProviderPageAction.Execute(driver);
		ProviderPageAction.selectProvidersFromDropdown(driver);
		if(ProviderPageAction.findExistingProviderByName(driver, dnProvider.getProvider_AWS_another_name()) == null) {
			ProviderPageAction.newProviderButton(driver);
			ProviderPageAction.providerName(driver, dnProvider.getProvider_AWS_another_name());
			ProviderPageAction.providerType(driver, dnProvider.getprovider_AWStype());
			//ProviderPage.provider_details_textarea.clear();
			//ProviderPage.provider_details_textarea.sendKeys(dnProvider.getprovider_AWSdetails());;
			ProviderPageAction.performSaveClick(driver);
		}
	}

	@And("^User enter provider type azure$")
	public void User_enter_provider_type_azure() throws Throwable{
		ProviderPageAction.providerType(driver,dnProvider.getprovider_Azuretype());
	}

	@And("^User enter provider type docker$")
	public void User_enter_provider_type_docker() throws Throwable{
		ProviderPageAction.providerType(driver,dnProvider.getprovider_Dockertype());
	}

	@And("^User enter provider type digitalOcean$")
	public void User_enter_provider_type_digitalOcean() throws Throwable{
		ProviderPageAction.providerType(driver,dnProvider.getprovider_DegitalOceantype());
	}

	@And("^User enter provider type vsphere$")
	public void User_enter_provider_type_vsphere() throws Throwable{
		ProviderPageAction.providerType(driver,dnProvider.getprovider_vSpheretype());
	}

	@And("^User enter provider details$")
	public void User_enter_provider_details() throws Throwable{
		ProviderPageAction.editProviderDetails(driver,dnProvider.getprovider_AWSdetails());
	}


	@Then("^User validate format button on provider page$")
	public void User_validate_format_button_on_provider_page() throws Throwable{
		ProviderPageAction.providerDetailsFormatButton(driver);    	
	}

	@Then("^User validate compact button on provider page$")
	public void User_validate_compact_button_on_provider_page() throws Throwable{
		ProviderPageAction.providerDetailsCompactButton(driver);    	
	}


	@And("^User select tree mode$")
	public void User_select_tree_mode() throws Throwable{
		ProviderPageAction.providerEditorMode(driver,"Tree");
	}

	@And("^User select form mode$")
	public void User_select_form_mode() throws Throwable{
		ProviderPageAction.providerEditorMode(driver,"Form");
	}

	@And("^User select code mode$")
	public void User_select_code_mode() throws Throwable{
		ProviderPageAction.providerEditorMode(driver,"Code");
	}

	@And("^User select text mode$")
	public void User_select_text_mode() throws Throwable{
		ProviderPageAction.providerEditorMode(driver,"Text");
	}

	@Then("^User validate search box availability$") 
	public void User_validate_searchbox_search_box_availability() throws Throwable{
		ProviderPageAction.providerSearchBox(driver);
	}

	@Then("^User search value in provider details section$")
	public void User_search_value_in_provider_details_section() throws Throwable{
		ProviderPageAction.searchValueProviderDetails(driver);

	}
	@And("^User enter access key$")
	public void User_enter_access_key() throws Throwable{
		ProviderPageAction.providerDetailsAwsAccessKey(driver);
	}

	@And("^User enter secret key$")
	public void User_enter_secret_key() throws Throwable{
		ProviderPageAction.providerDetailsAwsSecretKey(driver);
	}

	@And("^User enter provider name aws$")
	public void User_enter_provider_name_aws() throws Throwable{
		ProviderPageAction.providerName(driver, dnProvider.getprovider_AWSname());

	}
	@And("^User enter provider name azure$")
	public void User_enter_provider_name_azure() throws Throwable{
		ProviderPageAction.providerName(driver, dnProvider.getprovider_Azurename());
	}

	@And("^User enter provider name docker$")
	public void User_enter_provider_name_docker() throws Throwable{
		ProviderPageAction.providerName(driver, dnProvider.getprovider_Dockername());

	}

	@And("^User enter provider name digitaOcean$")
	public void User_enter_provider_name_digitaOcean() throws Throwable{
		ProviderPageAction.providerName(driver, dnProvider.getprovider_DegitalOceanname());

	}

	@And("^User enter provider name vsphere$")
	public void User_enter_provider_name_vsphere() throws Throwable{
		ProviderPageAction.providerName(driver, dnProvider.getprovider_vSpherename());
	}

	@And("^User delete aws provider$")
	public void User_delete_aws_provider() throws Throwable{
		ProviderPageAction.deleteProvider(driver,dnProvider.getprovider_AWSname());
	}

	@And("^User delete azure provider$")
	public void User_delete_azure_provider() throws Throwable{
		ProviderPageAction.deleteProvider(driver,dnProvider.getprovider_Azurename());
	}

	@And("^User delete docker provider$")
	public void User_delete_docker_provider() throws Throwable{
		ProviderPageAction.deleteProvider(driver,dnProvider.getprovider_Dockername());
	}

	@And("^User delete digitalOcean provider$")
	public void User_delete_digitalOcean_provider() throws Throwable{
		ProviderPageAction.deleteProvider(driver,dnProvider.getprovider_DegitalOceanname());
	}

	@And("^User delete vsphere provider$")
	public void User_delete_vsphere_provider() throws Throwable{
		ProviderPageAction.deleteProvider(driver,dnProvider.getprovider_vSpherename());
	}

	@When("^User click on edit button on provider page$")
	public void User_click_on_edit_button_on_provider_page() throws Throwable{
		ProviderPageAction.providerEditButton(driver,dnProvider.getprovider_Azurename());
	}

	@And("^User edit provider name$")
	public void User_edit_provider_name() throws Throwable{	   	
		ProviderPageAction.providerName(driver,dnProvider.getprovider_Azurename());
	}
	@And("^User delete edited provider$")
	public void User_delete_edited_provider() throws Throwable{
		ProviderPageAction.deleteProvider(driver,dnProvider.getprovider_Azurename());
	}
	@Then("^User should see provider deleted sucessfully message on right top$")
	public void User_should_see_provider_deleted_sucessfully_message_on_right_top() throws Throwable{
		ProviderPageAction.assertProviderDeleteBtn(driver);
	}

	@And("^User edit provider type$") 
	public void User_edit_provider_type() throws Throwable{
		ProviderPageAction.providerType(driver,dnProvider.getprovider_Azuretype());
	}

	@And("^User edit provider details$")
	public void User_edit_provider_details() throws Throwable{
		ProviderPageAction.editProviderDetails(driver,dnProvider.getprovider_AWSdetails());

	}

	@And("^User click new button on provider page$")
	public void User_click_new_button_on_provider_page() throws Throwable{
		ProviderPageAction.newProviderButton(driver);

	}
	
	@Then("^User validate scroll bar on provider page$")
	public void User_validate_scroll_bar_on_provider_page() throws Throwable{
		ProviderPageAction.scrollProviderPage(driver);
	}


}