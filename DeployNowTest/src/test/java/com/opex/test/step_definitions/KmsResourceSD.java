package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSCloudtrailPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.KmsResourcePageAction;
import com.opex.test.modules.SleepFunctionality;
import com.opex.test.pageobjects.AWSCloudwatchLogGroupPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.KmsResourcePageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KmsResourceSD  extends SuperUsedDefinition {
	
	
	public KmsResourceSD ()
	{
		super();
	}
	@When("^User search or create environment for Kms resource and see message as environment created successfully$")
	public void User_search__or_create_environment_for_Kms_resource_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = KmsResourceSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name);
	}
	@Then("^User click kmskey resource and drag on the dashboard$")
	public void User_click__kmskey_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, KmsResourcePageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,KmsResourcePageObject.KMS_key);
	}
	@And("^User enter resource name for kmskey resource$")
	public void User_enter_resource_name_for_kmskey_resource() throws Throwable {
		PageFactory.initElements(driver, KmsResourcePageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,kmsattributes.getkms_key_name());
	}
	@And("^User enter resource name for kmsalias resource$")
	public void User_enter_resource_name_for_kmsalias_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String name=kmsattributes.getkms_alias_name();
		System.out.println(name);
	   	CommonFunctionalityPageAction.enterResourceName(driver,name);
	}
	@Then("^User click kmsAlias resource and drag on the dashboard$")
	public void User_click__kmsAlias_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, KmsResourcePageObject.class);
	   	 PageFactory.initElements(driver, EnvironmentPage.class);
	   	KmsResourcePageAction.ResourceSelectKmsAlias(driver);
	}
	@When("^User click on kmsalias resource$")
	public void User_click_on_kmsalias_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, kmsattributes.getkms_alias_name());
	}
	@And("^enter the targetkeyid of kmsalias resource$")
	public void enter_the_targetkeyid_of_kmsalias_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String targetid=kmsattributes.gettarget_key_id();
		KmsResourcePageAction.entertargerid(driver, targetid);
	}
	@And("^enter name of the kmsalias resource$")
	public void enter_name_of_the_kmsalias_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String name=kmsattributes.getname();
		
		KmsResourcePageAction.enterAliasName(driver, name);
	}
	
	@Then("^User delete Kms environment and see message environment deleted sucessfully$")
	public void user_delete_Kms_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = KmsResourceSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	@And("^User delete the resource by clicking the cross button on Kms Resource$")
	public void user_delete_the_resource_by_clicking_the_cross_button_on_kms_resource() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,kmsattributes.getkms_alias_name() );
		
	}
	@And("^User dont delete the resource by clicking the cross button on Kms Resource$")
	public void user_dont_delete_the_resource_by_clicking_the_cross_button_on_kms_resource() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver, kmsattributes.getkms_alias_name());
		
	}

}


