package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSKeyPairPageAction;
import com.opex.test.modules.AWSS3BucketObjectPageAction;
import com.opex.test.modules.AWSVPCDHCPPageAction;
import com.opex.test.modules.AwsS3BucketPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSKeyPairPageObject;
import com.opex.test.pageobjects.AWSS3BucketObjectPageObject;
import com.opex.test.pageobjects.AWSS3BucketPage;
import com.opex.test.pageobjects.AWSVPCDHCPPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSS3BucketObjectSD extends SuperUsedDefinition  {
	
	public AWSS3BucketObjectSD()
    {
		super();  	
    }
	
	@Then("^User create or search an environment for S3 Bucket Object and see message as environment created successfully$")
	public void user_create_or_search_an_environment_for_S3_Bucket_Object() throws Throwable{
		String className = AWSS3BucketObjectSD.class.getSimpleName();
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String env_name = dnowEnv.getEnv_name()+className;		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	
	}
	
	@Then("^User delete the environment for S3 Bucket Object and see message environment deleted successfully$")
	public void user_delete_the_environment_for_S3_Bucket_Object() throws Throwable {
		
		String className = AWSS3BucketObjectSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
	
	@When("^User click S3 Bucket and drag on the dashboard for s3 bucket object$")
	public void user_create_or_search_an_environment_for_S3_Bucket_for_s3_bucket_object() throws Throwable{
		
	PageFactory.initElements(driver,CommonFunctionalityPage.class);
	PageFactory.initElements(driver,EnvironmentPage.class);
	PageFactory.initElements(driver, AWSS3BucketPage.class);
	CommonFunctionalityPageAction.resourceDragDrop(driver,AWSS3BucketPage.resource_S3Bucket);
	CommonFunctionalityPageAction.enterResourceName(driver, dnS3BucketObject.getS3_bucket());
	CommonFunctionalityPageAction.resourceCreateBtn(driver);
	CommonFunctionalityPageAction.clickOnResource(driver,dnS3BucketObject.getS3_bucket());
	PageFactory.initElements(driver, AWSS3BucketPage.class);
	AwsS3BucketPageAction.enterBucketName(driver,dnS3BucketObject.getS3_bucket());
	CommonFunctionalityPageAction.saveResource(driver);
	
	}
	@When("^User click S3 Bucket Object and drag on the dashboard$")
	public void user_select_S3_Bucket_Object_resource_to_the_environment() throws Throwable {
		PageFactory.initElements(driver,AWSS3BucketObjectPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSS3BucketObjectPageAction.dragdropS3BucketObject(driver);
	}

	@And("^User enter the resource name for S3 Bucket Object$")
	public void user_enter_the_resource_name_for_S3_Bucket_Object() throws Throwable {
		PageFactory.initElements(driver, AWSS3BucketObjectPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSS3BucketObjectSD.class.getSimpleName();
		String Rname = className.replaceAll("AWS_", "").replaceAll("_SD", "");
		String Resource = dnowCommanfun.getResource_name()+Rname;
		AWSS3BucketObjectPageAction.S3_Bucket_Object_Rname(driver, Resource); 
	}
	
	
	@Then("^User click on S3 Bucket Object resource$")
	public void user_click_on_S3_Bucket_Object_resource() throws Throwable {
		PageFactory.initElements(driver,AWSS3BucketObjectPageObject.class);
		String className = AWSS3BucketObjectSD.class.getSimpleName();
		String Rname = className.replaceAll("AWS_", "").replaceAll("_SD", "");
		String Resource = dnowCommanfun.getResource_name()+Rname;
		AWSS3BucketObjectPageAction.ResourceClickS3BucketObject(driver,Resource);
	}
	
	@And("^User fill the key for S3 Bucket Object$")
	public void user_fill_the_key_for_S3_Bucket_Object() throws Throwable{
		PageFactory.initElements(driver,AWSS3BucketObjectPageObject.class);
		AWSS3BucketObjectPageAction.enterS3BucketObjectKey(driver, dnS3BucketObject.getS3_key());
	
	}
	
	@And("^User fill the bucket for S3 Bucket Object$")
	public void user_fill_the_bucket_for_S3_Bucket_Object() throws Throwable{
		PageFactory.initElements(driver,AWSS3BucketObjectPageObject.class);
		AWSS3BucketObjectPageAction.enterS3BucketObjectBucket(driver, dnS3BucketObject.getS3Object_bucket());
	
	}
	@And("^User fill the source for S3 Bucket Object$")
	public void user_fill_the_source_for_S3_Bucket_Object() throws Throwable{
		PageFactory.initElements(driver,AWSS3BucketObjectPageObject.class);
		AWSS3BucketObjectPageAction.enterS3BucketObjectSource(driver, dnS3BucketObject.getS3_source());
	
	}
	@And("^User fill the invalid source for S3 Bucket Object$")
	public void user_fill_the_invalid_source_for_S3_Bucket_Object() throws Throwable{
		PageFactory.initElements(driver,  AWSS3BucketObjectPageObject.class);
		AWSS3BucketObjectPageAction.enterInvalidS3BucketObjectSource(driver,dnKeyPair.getInvalidPublic_key());
	
	}
	

}
