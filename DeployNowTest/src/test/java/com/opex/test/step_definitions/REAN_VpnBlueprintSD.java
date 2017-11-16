package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.EnvironmentPageAction;

import com.opex.test.modules.REAN_VpnBlueprintPageAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.ConnectionPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.ProviderPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class REAN_VpnBlueprintSD extends SuperUsedDefinition{

	public REAN_VpnBlueprintSD()
	{
		super();
	}

	@When("^User click on import button for REAN-VPN Vpn blueprint$")
	public void user_click_on_import_button_for_REAN_Vpn_blueprint() throws Throwable{
		
		String filename = "/REAN-VPN-between-VPCs-Blueprint-Final.json";
		String className = filename.substring(0);
		int index1 = className.indexOf('.');
		String envName = className.substring(1,index1);
		System.out.println(""+envName);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.importFile(driver,envName); 
	}

	@Then("^User click on upload button on import pop up for REAN-VPN blueprint$")
	public void user_click_on_upload_button_on_import_pop_up_for_APP_blueprint() throws Throwable{
		
		String filename = "/REAN-VPN-between-VPCs-Blueprint-Final.json";
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.importChooseFile(driver, filename);
		EnvironmentPageAction.importUploadBtn(driver);

	}
	@And("^User click on start import button for REAN-VPN blueprint$")
	public void user_click_on_start_import_button_for_REAN_VPN_blueprint() throws Throwable{
	
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,ProviderPage.class);
		PageFactory.initElements(driver,ConnectionPage.class);
		PageFactory.initElements(driver,EnvironmentPageAction.class);
		PageFactory.initElements(driver,REAN_VpnBlueprintPageAction.class);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		REAN_VpnBlueprintPageAction.importStartImportBtnREAN_Vpn(driver);
		PageFactory.initElements(driver,REAN_VpnBlueprintPageAction.class);
		
	
	}
	
	@When("^User search for APP-IAM environment for REAN-VPN blueprint$")
	public void user_search_for_APPIAM_environment_for_REAN_VPN_blueprint()throws Throwable{
		

		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,ProviderPage.class);
		PageFactory.initElements(driver,ConnectionPage.class);
		PageFactory.initElements(driver,EnvironmentPageAction.class);
		PageFactory.initElements(driver,REAN_VpnBlueprintPageAction.class);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		REAN_VpnBlueprintPageAction.searchREANVpnBlueprintEnvsAndDeploy(driver);
	}
	
	@When("^User create a ec2 user connection$")
	public void user_create_a_ec2_user_connection() throws Throwable{
		
		PageFactory.initElements(driver,REAN_VpnBlueprintPageAction.class);
		PageFactory.initElements(driver,ConnectionPage.class);
		REAN_VpnBlueprintPageAction.createConnectionREAN_Vpn(driver);
		
	}
}