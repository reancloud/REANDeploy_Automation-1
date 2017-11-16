package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSIAMSCertificatePageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AwsS3BucketPageAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSIAMSCertificatePage;
import com.opex.test.pageobjects.AWSRDSPageObject;
import com.opex.test.pageobjects.AWSS3BucketPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSIAMSCertificateSD extends SuperUsedDefinition  {
	
	public AWSIAMSCertificateSD()
    {
		super();  	
    }
	@Then("^User search or create environment for IAM server certificate and see message as environment created successfully$")
	public void User_search_or_create_environment_for_IAM_server_certificate_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSIAMSCertificateSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);  
	}

	@When("^User click IAM server certificate resource and drag on the dashboard$")
	public void User_click_IAM_server_certificate_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		AWSIAMSCertificatePageAction.dragdropCertificate_resource(driver);
	}

	@And("^User enter resource name for IAM server certificate resource$")
	public void user_enter_resource_name_for_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dncertificate.getIAM_s_certificate_rname());
	}

	@When("^User click on IAM server certificate resource$")
	public void User_click_on_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dncertificate.getIAM_s_certificate_rname());
	}

	@And("^User enter certificate body for IAM server certificate resource$")
	public void user_enter_certificate_body_for_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		AWSIAMSCertificatePageAction.enterCertificateBody(driver,dncertificate.getIAM_s_certificate_certificatebody());
	}

	@And("^User enter private key for IAM server certificate resource$")
	public void user_enter_private_key_for_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		AWSIAMSCertificatePageAction.enterPrivatekey(driver,dncertificate.getIAM_s_certificate_private_key());
	}

	@And("^User enter depends on for IAM server certificate resource$")
	public void user_enter_depends_on_for_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dncertificate.getIAM_s_certificate_depends_on());
	}

	@And("^User enter connection for IAM server certificate resource$")
	public void user_enter_connection_for_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver, dncertificate.getIAM_s_certificate_connection());
	}

	@And("^User enter certificate chain for IAM server certificate resource$")
	public void user_enter_certificate_chain_for_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSIAMSCertificatePageAction.enterCertificatechain(driver,dncertificate.getIAM_s_certificate_certificatechain());
	}

	@And("^User enter name for IAM server certificate resource$")
	public void user_enter_name_for_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		AWSIAMSCertificatePageAction.enterName(driver,dncertificate.getIAM_s_certificate_name());
	}

	@And("^User enter name prefix for IAM server certificate resource$")
	public void user_enter_name_prefix_for_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		AWSIAMSCertificatePageAction.enterName_prefix(driver,dncertificate.getIAM_s_certificate_name_prefix());
	}

	@And("^User enter path for IAM server certificate resource$")
	public void user_enter_path_for_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		AWSIAMSCertificatePageAction.enterPath(driver,dncertificate.getIAM_s_certificate_path());
	}
	@And("^User put all the values blank for IAM server certificate resource$")
	public void user_put_all_the_values_blank_for_IAM_server_certificate_resource() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		AWSIAMSCertificatePageAction.enterCertificateBody(driver,"");
		AWSIAMSCertificatePageAction.enterPrivatekey(driver,"");
	}
	@Then("^User delete IAM server certificate resource$")
	public void User_delete_IAM_server_certificate_resource() throws Throwable{		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dncertificate.getIAM_s_certificate_rname());
		
	}
	@Then("^User not delete IAM server certificate resource$")
	public void we_click_on_please_dont_delete_it_resource_cross_button_popup_for_RDS() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dncertificate.getIAM_s_certificate_rname());
	}
	@Then("^User delete IAM server certificate environment and see message environment deleted sucessfully$")
	public void User_delete_IAM_server_certificate_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSIAMSCertificatePage.class);
		String className = AWSIAMSCertificateSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
}
