package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.MultilayerAPPBlueprintPageAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.ConnectionPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.ProviderPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultilayerAPPSD  extends SuperUsedDefinition{

	public MultilayerAPPSD()
	{
		super();
	}

	@When("^User click on import button for APP blueprint$")
	public void user_click_on_import_button_for_APP_blueprint() throws Throwable{
		
		String className = dnAppAttributes.getApp_file_name().substring(0);
		int index1 = className.indexOf('.');
		String envName = className.substring(1,index1);
		System.out.println(""+envName);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.importFile(driver,envName); 
	}

	@Then("^User click on upload button on import pop up for APP blueprint$")
	public void user_click_on_upload_button_on_import_pop_up_for_APP_blueprint() throws Throwable{
		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.importChooseFile(driver, dnAppAttributes.getApp_file_name());
		EnvironmentPageAction.importUploadBtn(driver);

	}
	@And("^User click on start import button for APP blueprint$")
	public void user_click_on_start_import_button_for_APP_blueprint() throws Throwable{
	
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,ProviderPage.class);
		PageFactory.initElements(driver,ConnectionPage.class);
		PageFactory.initElements(driver,EnvironmentPageAction.class);
		PageFactory.initElements(driver,MultilayerAPPBlueprintPageAction.class);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		MultilayerAPPBlueprintPageAction.importStartImportBtn(driver, dncon.getCon_name(),dnProvider.getprovider_AWSname());
		
	
	}
	
	@When("^User search for APP-IAM environment for APP blueprint$")
	public void user_search_for_APPIAM_environment_for_APP_blueprint()throws Throwable{
		

		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,ProviderPage.class);
		PageFactory.initElements(driver,ConnectionPage.class);
		PageFactory.initElements(driver,EnvironmentPageAction.class);
		PageFactory.initElements(driver,MultilayerAPPBlueprintPageAction.class);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		MultilayerAPPBlueprintPageAction.searchAPPIAMAndDeploy(driver);
	}
	/*Then User deploy the APP-IAM environment and verify it for APP blueprint
	When User search for APP-VPC environment for APP blueprint
	And User enter one vpc resource and enter the attributes for APP blueprint
	And User change the other attributes which are affected by adding the vpc to APP VPC 
	 */
}
