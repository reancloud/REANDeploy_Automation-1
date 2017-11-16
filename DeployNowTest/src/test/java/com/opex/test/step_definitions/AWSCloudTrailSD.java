package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSAwsspecPageAction;
import com.opex.test.modules.AWSCloudwatchLogGroupPageAction;
import com.opex.test.modules.AWSIAMGroupPageAction;
import com.opex.test.modules.AWSInstancePageAction;
//import com.opex.test.modules.AwsEcsServicePageAction;
import com.opex.test.modules.AWSCloudtrailPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSAwsspecPageObject;
import com.opex.test.pageobjects.AWSCloudwatchLogGroupPageObject;
import com.opex.test.pageobjects.AWSIAMGroupPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
//import com.opex.test.pageobjects.AwsEcsServicePageObeject;
import com.opex.test.pageobjects.AWSCloudTrailPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSCloudTrailSD extends SuperUsedDefinition {
	
	public AWSCloudTrailSD()
	{
		super();
	}
	@Then("^User search or create environment for Cloudtrail resource and see message as environment created successfully$")
	public void User_search_or_create_environment_for_Cloudtrai_resource_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSCloudTrailSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name);
	}
	@When("^User click Cloudtrail resource and drag on the dashboard$")
	public void User_click__Cloudtrail_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, AWSCloudwatchLogGroupPageObject.class);
	   	 PageFactory.initElements(driver, EnvironmentPage.class);
	   	AWSCloudtrailPageAction.ResourceSelectCloudTrail(driver);
	}
	@And("^User enter resource name for Cloudtrail resource$")
	public void User_enter_resource_name_for_Cloudtrail_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
	   	CommonFunctionalityPageAction.enterResourceName(driver,dncloudtrailattributes.getCloud_trail_name());
	}
	@When("^User click on Cloudtrail resource$")
	public void User_click_on_Cloudtrail_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dncloudtrailattributes.getCloud_trail_name());
	}
	@And("^User enter name of s3 bucket name of cloudtrail resource")
	public void User_enter_name_of_s3_bucket_name_of_cloudtrail_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String name=dncloudtrailattributes.getS3_bucket_name();
		AWSCloudtrailPageAction.enterS3Name(driver, name);
	}
	@Then("^User delete cloudtrail environment and see message environment deleted sucessfully$")
    public void User_delete_cloudtrail_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
    	String className = AWSCloudTrailSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
    }
	
	@And("^User delete the resource by clicking the cross button on cloud trail$")
	public void user_delete_the_resource_by_clicking_the_cross_button_on_cloud_trail() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver, dncloudtrailattributes.getCloud_trail_name());
		
	}
	@And("^User dont delete the resource by clicking the cross button on cloud trail$")
	public void user_dont_delete_the_resource_by_clicking_the_cross_button_on_cloud_trail() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver, dncloudtrailattributes.getCloud_trail_name());
		
	}
	
	
	

}
