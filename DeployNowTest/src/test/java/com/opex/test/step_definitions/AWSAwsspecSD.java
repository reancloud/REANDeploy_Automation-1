package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSExecutescriptpkgPageAction;
import com.opex.test.modules.AWSAwsspecPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSExecutescriptpkgPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSAwsspecPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSAwsspecSD extends SuperUsedDefinition{
	
	public AWSAwsspecSD(){
		super();
	}

	@When("^i search and click on environment which is created by using AWS provider for awsspec$")
	public void i_search_and_click_on_environment_which_is_created_by_using_AWS_provider_for_awsspec() throws Throwable {
		String className = AWSAwsspecSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}

	@Then("^i drag drop awsspec package on instance resource$")
	public void i_drag_drop_awsspec_package_on_instance_resource() throws Throwable {
		PageFactory.initElements(driver, AWSAwsspecPageObject.class);
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSAwsspecPageAction.awsDragDrop(driver);
	}
	@Then("^i enter the resource name for Instance for awsspec$")
	public void i_enter_the_resource_name_for_Instance_for_awsspec() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSAwsspecPageObject.class);
		AWSAwsspecPageAction.enterInstanceName(driver);
	}
	@Then("^i click on instance resource for awsspec$")
	public void i_click_on_instance_resource_for_awsspec() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSAwsspecPageObject.class);
		AWSAwsspecPageAction.clickResourceInstance(driver);
	}

	@Then("^i click on awsspec link for awsspec$")
	public void i_click_on_awsspec_link_for_awsspec() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSAwsspecPageObject.class);
		AWSAwsspecPageAction.clickawsspec(driver);
	}

	
	@Then("^i enter source_password for awsspec$")
	public void i_enter_source_password_for_awsspec() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSAwsspecPageObject.class);
		AWSAwsspecPageAction.entersource_unameawsspec(driver,dnowawspec.getAwspec_username());
	}

	

	@Then("^i enter source_url for awsspec$")
	public void i_enter_source_url_for_awsspec() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSAwsspecPageObject.class);
		AWSAwsspecPageAction.entersource_pwdawsspec(driver,dnowawspec.getAwspec_password());
	}

	@Then("^i enter source_username for awsspec$")
	public void i_enter_source_username_for_awsspec() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSAwsspecPageObject.class);
		AWSAwsspecPageAction.entersource_urlawsspec(driver,dnowawspec.getAwspec_url());
	}

	@Then("^i delete the created environment for awsspec$")
	public void i_delete_the_created_environment_for_awsspec() throws Throwable {
		String className = AWSAwsspecSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		//EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
}
