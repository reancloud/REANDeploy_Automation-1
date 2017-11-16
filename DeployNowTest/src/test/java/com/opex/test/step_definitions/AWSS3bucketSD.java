package com.opex.test.step_definitions;
import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AwsS3BucketPageAction;
import com.opex.test.pageobjects.AWSOutputPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSS3BucketPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSS3bucketSD extends SuperUsedDefinition { 

	public  AWSS3bucketSD() {
		super();
	}	
	
	@Then("^User search or create environment for S3Bucket and see message as environment created successfully$")
	public void user_search_or_create_environment_for_S_Bucket_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		String className = AWSS3bucketSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);  
	}
	
	@Then("^User delete S3Bucket environment and see message environment deleted sucessfully$")
	public void user_delete_S3Bucket_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSS3bucketSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}

	@When("^User click S3Bucket resource and drag on the dashboard$")
	public void user_click_S3_Bucket_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSS3BucketPage.resource_S3Bucket);
	} 

	@When("^User enter S3Bucket resource name$")
	public void user_enter_S_Bucket_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dns3bucket.getS3bucket_Rname());
	}
	
	@When("^User enter blank resource name for S3Bucket$")
	public void user_enter_blank_resource_name_for_S3Bucket() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,"");
	}

	@When("^User click on S3Bucket resource$")
	public void user_click_on_S3Bucket_resource() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dns3bucket.getS3bucket_Rname());
	}

	@And("^User enter bucket name for S3Bucket$")
	public void user_enter_bucket_name_for_S3Bucket() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		AwsS3BucketPageAction.enterBucketName(driver,dns3bucket.getS3bucket_bucket());
	}
	
	
	@When("^User enter invalid bucket name for S3Bucket$")
	public void user_enter_invalid_bucket_name_for_S3Bucket() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		AwsS3BucketPageAction.enterBucketName(driver,"TESTBUCKET");
	}
	
	@And("^User select connection for S3Bucket$")
	public void user_select_connection_for_S3Bucket() throws Throwable {
		PageFactory.initElements(driver, AWSOutputPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver,dns3bucket.getS3bucket_connection());
	}

	@And("^User enter depends on value for S3Bucket$")
	public void user_enter_depends_on_value_for_S_Bucket() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dns3bucket.getS3bucket_depends_on());
	}

	@And("^User select acl value for S3Bucket$")
	public void user_select_acl_value_for_S3Bucket() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		AwsS3BucketPageAction.selectAclValueRSB(driver,dns3bucket.getS3bucket_acl());
	}

	@And("^User set cors rule for S3Bucket$")
	public void user_set_cors_rule_for_S3Bucket() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AwsS3BucketPageAction.setCorsRulesRSB(driver,dns3bucket.getS3bucket_core_rule());
	}

	@And("^User select force destroy value from dropdown for S3Bucket$")
	public void user_select_force_destroy_value_from_dropdown_for_S3Bucket() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		AwsS3BucketPageAction.selectForceDestroyRSB(driver,dns3bucket.getS3bucket_force_destroy());
	}

	@And("^User set lifecycle rule for S3Bucket$")
	public void user_set_lifecycle_rule_for_S3Bucket() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AwsS3BucketPageAction.setLifeCycleRuleRSB(driver,dns3bucket.getS3bucket_lifecycle_rule());
	}

	@And("^User set policy for S3Bucket$")
	public void user_set_policy_for_S3Bucket() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AwsS3BucketPageAction.setPolicyRSB(driver,dns3bucket.getS3bucket_policy());
	}

	@And("^User set tags for S3Bucket$")
	public void user_set_tags_for_S3Bucket() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AwsS3BucketPageAction.setTagsRSB(driver,dns3bucket.getS3bucket_tags());
	}
	@Then("^User click on please delete it resource cross button popup for S(\\d+)Bucket$")
	public void user_click_on_please_delete_it_resource_cross_button_popup_for_S_Bucket(int arg1) throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dns3bucket.getS3bucket_Rname());
	}

	@Then("^User click on please dont delete it resource cross button popup for S(\\d+)Bucket$")
	public void user_click_on_please_dont_delete_it_resource_cross_button_popup_for_S_Bucket(int arg1) throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dns3bucket.getS3bucket_Rname());
	}
	
	
	
	@And("^we enter bucket name1 for S3Bucket$")
	public void we_enter_bucket_name1_for_S3Bucket() throws Throwable{		
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		AwsS3BucketPageAction.enterBucketName(driver, "TESTBUCKET");
	}
	
	@Then("^we edit resource name in resource name edit popup for S3Bucket$")
	public void we_edit_resource_name_in_resource_name_edit_popup_for_S3Bucket() throws Throwable{		
		PageFactory.initElements(driver, AWSS3BucketPage.class);
		CommonFunctionalityPageAction.resourceNameEditTextBox(driver, "test-s3-dnow");
	}
		
	
}
