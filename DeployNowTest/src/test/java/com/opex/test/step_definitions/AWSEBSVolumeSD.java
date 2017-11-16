package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSEBSVolumePageAction;
import com.opex.test.modules.AWSInstancePageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSEBSVolumePageObject;

import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSEBSVolumeSD extends SuperUsedDefinition{

	public AWSEBSVolumeSD()
	{
		super();
	}
	
	
	@Then("^User create or search an environment for EBS Volume and see message as environment created successfully$")
	public void user_search_n_select_the_required_environment_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver, AWSEBSVolumePageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSEBSVolumeSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}
	
	@Then("^User delete the environment for EBS Volume and see message environment deleted successfully$")
	public void user_delete_the_environment_for_EBS_Volume() throws Throwable {
		
		String className = AWSEBSVolumeSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	
//	@Then("^User delete the environment for EBS Volume$")
//	public void user_delete_the_environment_for_EBS_Volume() throws Throwable {
//		
//		String className = AWSEBSVolumeSD.class.getSimpleName();
//		String env_name = dnowEnv.getEnv_name()+className;
//		PageFactory.initElements(driver,EnvironmentPage.class);
//		EnvironmentPageAction.environmentDropdown(driver);
//		EnvironmentPageAction.deleteEnvironment(driver,env_name);
//	}
	
	@When("^User click EBS Volume resource and drag on the dashboard for EBS Volume$")
	public void user_select_EBS_Volume_resource_to_the_environment() throws Throwable{
		
		PageFactory.initElements(driver,AWSEBSVolumePageObject.class);
		AWSEBSVolumePageAction.selectEBSvolume(driver);
	}
	@And("^User enter the resource name for EBS Volume$")
	public void u_enter_the_resource_name_for_EBS_Volume() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnEbsVolume.getEbsVolume_rname());
		
	}
	
	@When("^User click on EBS Volume resource$")
	public void user_click_on_the_EBS_Volume_resource() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnEbsVolume.getEbsVolume_rname());
	}

	@And("^User fill the tags for EBS Volume$")
	public void user_fill_the_tags_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver,AWSEBSVolumePageObject.class);
		AWSEBSVolumePageAction.enterTagsJsonEBSvolume(driver,dnEbsVolume.getEbsVolume_tags());
	
	}

	@And("^User fill the invalid availability zone for EBS Volume$")
	public void user_fill_the_invalidAvailabilityZone_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver,AWSEBSVolumePageObject.class);
		AWSEBSVolumePageAction.enterAvailabilityZoneForEBSvolume(driver,dnEbsVolume.getEbsVolume_blankData());
	
	}
	@And("^User fill the valid availability zone for EBS Volume$")
	public void user_fill_the_validAvailabilityZone_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver,AWSEBSVolumePageObject.class);
		AWSEBSVolumePageAction.enterAvailabilityZoneForEBSvolume(driver,dnEbsVolume.getEbsVolume_availabilityZone());
	
	}
	@And("^User fill the connection for EBS Volume$")
	public void user_fill_the_connection_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver,dnEbsVolume.getEbsVolume_con());
	
	
	}
	
	@And("^User fill the size for EBS Volume$")
	public void user_fill_the_size_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver,AWSEBSVolumePageObject.class);
	AWSEBSVolumePageAction.enterSizeEBSvolume(driver,dnEbsVolume.getEbsVolume_size());
	
	}
	@And("^User fill the type for EBS Volume$")
	public void user_fill_the_type_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver,AWSEBSVolumePageObject.class);
		AWSEBSVolumePageAction.entertypeEBSvolume(driver,dnEbsVolume.getEbsVolume_type());
	}
	@And("^User fill the iops for EBS Volume$")
	public void user_fill_the_iops_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver,AWSEBSVolumePageObject.class);
		AWSEBSVolumePageAction.enterIopsEBSvolume(driver,dnEbsVolume.getEbsVolume_iops());
	
	}
	@And("^User fill the snapshot id for EBS Volume$")
	public void user_fill_the_snapshotId_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver,AWSEBSVolumePageObject.class);
	AWSEBSVolumePageAction.enterSnapshotIdEBSvolume(driver, dnEbsVolume.getEbsVolume_snapshotId());
	
	}
	@And("^User fill the kms key id for EBS Volume$")
	public void user_fill_the_kmsKeyId_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver,AWSEBSVolumePageObject.class);
		AWSEBSVolumePageAction.enterKmsKeyIdEBSvolume(driver,dnEbsVolume.getEbsVolume_kmsKeyId());
	}
	@And("^User fill the encrypted for EBS Volume$")
	public void user_fill_the_encrypted_for_EBS_Volume() throws Throwable{
		PageFactory.initElements(driver,AWSEBSVolumePageObject.class);
		AWSEBSVolumePageAction.enterEncryptedEBSvolume(driver,dnEbsVolume.getEbsVolume_encrypted());
	}
}