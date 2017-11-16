package com.opex.test.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSDependsOnPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.ConnectionPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.ProviderPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnvironmentSD extends SuperUsedDefinition{
	
	public EnvironmentSD()
	{
		super();
	}
    
	@And("^User create connection for environment$")
	public void User_create_connection_for_environment() throws Throwable{
		PageFactory.initElements(driver, ConnectionPage.class);
		PageFactory.initElements(driver, EnvironmentPage.class); 
		EnvironmentPageAction.createsshconnection(driver);
	}
	
	@And("^User create provider for environment$")
	public void User_create_provider_for_environment() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		PageFactory.initElements(driver, ProviderPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
      	EnvironmentPageAction.createawsprovider(driver);
	}
	@And("^User enter details in environment window for AWS provider SSH connection$")
	public void User_enter_details_in_environment_window_for_aws_provider_SSH_connection() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class);
		String className = EnvironmentSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name);

	}
	
	@Then("^User click on copy button in environment page$")
	public void User_click_on_copy_button_in_environment_page() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class);
		EnvironmentPageAction.clickonCopybutton(driver); 
		
	}
	@And("^User enter name to be copied$")
	public void User_enter_name_to_be_copied() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class);
		EnvironmentPageAction.entercopyName(driver,dnowEnv.getEnv_copy_name()); 
	
	}
	@And("^User enter descrption to be copied$")
	public void User_enter_descrption_to_be_copied() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class);
		EnvironmentPageAction.entercopyDescription(driver,dnowEnv.getEnv_copy_description()); 
		
	}
	@And("^User select connection to be copied$")
	public void User_select_connection_to_be_copied() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class);
		EnvironmentPageAction.selectconnection(driver,dncon.getCon_name()); 
		
	}
	@And("^User select provider to be copied$")
	public void User_select_provider_to_be_copied() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class);
		EnvironmentPageAction.selectprovider(driver,dnProvider.getprovider_AWSname()); 
		
	}
	@Then("^User deleted copy environment$")
	public void User_deleted_copy_environment() throws Throwable{
		PageFactory.initElements(driver,EnvironmentPage.class);
		String className = EnvironmentSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_copy_name()+className;
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
	@Then("^User delete \"([^\"]*)\" environment$")
	public void User_delete_environment(String envName) throws Throwable{
		PageFactory.initElements(driver,EnvironmentPage.class);
		String className = EnvironmentSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.environmentDropdown(driver);
		if(envName.equalsIgnoreCase("Edit")){
		EnvironmentPageAction.deleteEnvironment1(driver,dnowEnv.getEnv_edit_name());
		}
		if(envName.equalsIgnoreCase("Kms")){
			String providername = dnProvider.getprovider_AWSname();
		    env_name = dnowEnv.getEnv_name()+providername;
		    EnvironmentPageAction.deleteEnvironment1(driver,env_name);
			}
		else
			EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	@And("^User search and copy environment for AWS provider SSH connection$")
	public void User_search_and_copy_environment_for_AWS_provider_SSH_connection() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = EnvironmentSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchCopyEnvironment(driver,env_name); 
		
	}
	@Then("^User create winrm connection for environment$")
	public void User_create_winrm_connection_for_environment() throws Throwable{
		PageFactory.initElements(driver, ConnectionPage.class);
		PageFactory.initElements(driver, EnvironmentPage.class); 
		EnvironmentPageAction.createwinrmconnection(driver);
	}
	@And("^User create digitalocean provider for environment$")
	public void User_create_digitalocean_provider_for_environment() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		PageFactory.initElements(driver, ProviderPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
        EnvironmentPageAction.create_digitaloceanprovider(driver);
		
	}
	@And("^User create Vsphere provider for environment$")
	public void User_create_Vsphere_provider_for_environment() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		PageFactory.initElements(driver, ProviderPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		EnvironmentPageAction.create_vSphereprovider(driver);
		
		
	}
	@And("^User create Azure provider for environment$")
	public void User_create_Azure_provider_for_environment() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		PageFactory.initElements(driver, ProviderPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		EnvironmentPageAction.create_Azureprovider(driver);
		
	}
	@And("^User create Docker provider for environment$")
	public void User_create_Docker_provider_for_environment() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		PageFactory.initElements(driver, ProviderPage.class);
		//PageFactory.initElements(driver, ConnectionPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		EnvironmentPageAction.create_Dockerprovider(driver);
		
	}
	 @When("^Validate title and URL of the page$")
	    public void validate_title_and_URL_of_the_page() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	
	    	//assertEquals("DeployNow",driver.getTitle());
	    	//System.out.println("title name >> "+driver.getTitle());
	    	//assertEquals(" https://35.163.126.245",driver.getCurrentUrl());
	        //assertEquals("http://35.160.226.255:8080/#/welcome",driver.getCurrentUrl());
	        System.out.println("url name >> "+driver.getCurrentUrl());
	       }

	@Then("^User click the drop down in environment page$")
	public void User_click_the_drop_down_in_environment_page() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
	
		}
	@Then("^User click on create button in environment page$")
	public void User_click_on_create_button_in_environment_page() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.Execute(driver);

	}

	@When("^User verify on create environment page$")
	public void User_verify_on_create_environment_page() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		EnvironmentPageAction.verifyCreatePage(driver);

	}
	@Then("^User click on create environment button on the pop up$")
	public void User_click_on_create_environment_button_on_the_pop_up() throws Throwable {
		/*PageFactory.initElements(driver, EnvironmentPage.class);
		EnvironmentPageAction.createNewEnvironmentButton(driver);*/
		PageFactory.initElements(driver, EnvironmentPage.class);
        PageFactory.initElements(driver, CommonFunctionalityPage.class);
        EnvironmentPageAction.createNewEnvironmentButton(driver);
        EnvironmentPageAction.deleteEnvironment1(driver,dnowEnv.getEnv_copy_name());
        EnvironmentPageAction.deleteEnvironment1(driver,dnowEnv.getEnv_name());
	}

	@Then("^User click on close on the pop up$") 
	public void User_click_on_close_on_the_pop_up() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.closeCreateEnvironmentPage(driver);
	}


	@Then("^User search for environment$")
	public void User_search_for_environment() throws Throwable{
	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class); 
		EnvironmentPageAction.searchEnvironment(driver);

	}	

	@When("^User select environment$") 
	public void User_select_environment() throws Throwable{
		System.out.println("I select environment-step definition");
	
		PageFactory.initElements(driver, EnvironmentPage.class); 
	EnvironmentPageAction.selectSearchedEnvironment(driver);
	
	}

	@When("^User enter blank details in the environment field$")
	public void User_enter_blank_details_in_the_environment_field() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver, " "," ", " ", " ");;	
		//EnvironmentPageAction.createNewEnvironmentButton(driver);
		}


	@When("^User enter only name in environment pop up$")
	public void User_enter_only_name_in_environment_pop_up() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		String className = EnvironmentSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.environmentOnlyName(driver,env_name);
	}

	@When("^User enter name description in environment pop up$")
	public void User_enter_name_description_in_environment_pop_up() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		String className = EnvironmentSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.environmentNameDescription(driver,env_name,dnowEnv.getEnv_description());
		
	}
	@When("^User enter name description connection in environment pop up$")
	public void User_enter_name_description_connection_in_environment_pop_up() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		String className = EnvironmentSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.environmentNameDescriptionConnection(driver,env_name,dnowEnv.getEnv_description(),dncon.getCon_name());
		
	}

	@And("^User enter details in environment window for AWS provider And region And SSH connection$")
	public void user_enters_details_for_SSH_conn_and_aws_provider_and_region() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		String providername = dnProvider.getprovider_AWSname();
		String env_name = dnowEnv.getEnv_name()+providername;
		EnvironmentPageAction.fillingNewEnvironmentDetailsForSSHAndAWSWithRegion(driver,env_name,dnowEnv.getEnv_description(), dnowEnv.getEnv_region());
		EnvironmentPageAction.createNewEnvironmentButton(driver);
	}

	@Then("^User checks arn of kms key for environment region$")
	public void user_checks_arn_of_kms_key_for_region() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickCanvas(driver);
		CommonFunctionalityPageAction.clickOnResource(driver, kmsattributes.getkms_key_name());
		CommonFunctionalityPageAction.resourceDetailsAttributeLink(driver);
		String kms_arn = CommonFunctionalityPage.resource_details_arn.getAttribute("value");
		Assert.assertTrue(kms_arn.contains(dnowEnv.getEnv_region()));
	}

	@Then("^User checks arn of kms key for AWS provider region$")
	public void user_checks_arn_of_kms_key_for_provider_region() throws Throwable {
		PageFactory.initElements(driver,ProviderPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickCanvas(driver);
		CommonFunctionalityPageAction.clickOnResource(driver, kmsattributes.getkms_key_name());
		CommonFunctionalityPageAction.resourceDetailsAttributeLink(driver);
		String kms_arn = CommonFunctionalityPage.resource_details_arn.getAttribute("value");
		Assert.assertTrue(kms_arn.contains(dnProvider.getProvider_AWSregion()));
	}

	@When("^User enter details in environment window for azure provider SSH connection$")
	public void User_enter_details_in_environment_window_for_azure_provider_SSH_connection() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		String providername = dnProvider.getprovider_Azurename();
		String env_name = dnowEnv.getEnv_name()+providername;
        EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver,env_name,dnowEnv.getEnv_description(),dncon.getCon_name(),dnProvider.getprovider_Azurename());
		EnvironmentPageAction.createNewEnvironmentButton(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);

	}
	@When("^User enter details in environment window for Docker provider SSH connection$")
	public void User_enter_details_in_environment_window_for_Docker_provider_SSH_connection() throws Throwable{
		String providername = dnProvider.getprovider_Dockername();
		String env_name = dnowEnv.getEnv_name()+providername;
        EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver,env_name,dnowEnv.getEnv_description(),dncon.getCon_name(),dnProvider.getprovider_Dockername());
		EnvironmentPageAction.createNewEnvironmentButton(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
		
	}
	
	@Then("^User again create environment$")
	public void User_again_create_environment() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, ProviderPage.class);
		String className = EnvironmentSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver, env_name,dnowEnv.getEnv_description(), dncon.getCon_name(), dnProvider.getprovider_AWSname());		
		EnvironmentPageAction.createNewEnvironmentButton(driver);
		EnvironmentPageAction.createNewEnvironmentButton(driver);
	}
	
	@Then("^User again create environment to verify duplicate on create environment dropdown$")
	public void User_again_create_environment_verify() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, ProviderPage.class);
		String className = EnvironmentSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver, env_name,dnowEnv.getEnv_description(), dncon.getCon_name(), dnProvider.getprovider_AWSname());		
		EnvironmentPageAction.createNewEnvironmentButton1(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
		//EnvironmentPageAction.createNewEnvironmentButton(driver);
	}
	@When("^User enter details in environment window for Digital Ocean provider SSH connection$")
	public void User_enter_details_in_environment_window_for_Digital_Ocean_provider_SSH_connection() throws Throwable{
		String providername = dnProvider.getprovider_Dockername();
		String env_name = dnowEnv.getEnv_name()+providername;
        EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver,env_name,dnowEnv.getEnv_description(),dncon.getCon_name(),dnProvider.getprovider_DegitalOceanname());
		EnvironmentPageAction.createNewEnvironmentButton(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);	
	}
	@When("^User enter details in environment window for V sphere provider SSH connection$")
	public void User_enter_details_in_environment_window_for_V_sphere_provider_SSH_connection() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		String providername = dnProvider.getprovider_vSpherename();
		String env_name = dnowEnv.getEnv_name()+providername;
        EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver,env_name,dnowEnv.getEnv_description(),dncon.getCon_name(),dnProvider.getprovider_vSpherename());
		EnvironmentPageAction.createNewEnvironmentButton(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	@When("^User enter details in environment window for azure provider WinRM connection$")
	public void User_enter_details_in_environment_window_for_azure_provider_WinRM_connection() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		String env_name = "PX_WinRM_Azure";
		EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver,env_name, dnowEnv.getEnv_description(),dncon.getCon_name_winrm(),dnProvider.getprovider_Azurename());
		EnvironmentPageAction.createNewEnvironmentButton(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	@When("^User enter details in environment window for Docker provider WinRM connection$")
	public void User_enter_details_in_environment_window_for_Docker_provider_WinRM_connection() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		String env_name = "PX_WinRM_Docker";
		EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver,env_name, dnowEnv.getEnv_description(),dncon.getCon_name_winrm(),dnProvider.getprovider_Dockername());
		EnvironmentPageAction.createNewEnvironmentButton(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	@When("^User enter details in environment window for AWS provider WinRM connection$")
	public void User_enter_details_in_environment_window_for_aws_provider_WinRM_connection() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		String env_name = "PX_WinRM_AWS";
		EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver,env_name, dnowEnv.getEnv_description(),dncon.getCon_name_winrm(),dnProvider.getprovider_AWSname());
		EnvironmentPageAction.createNewEnvironmentButton(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	@When("^User enter details in environment window for Digital Ocean provider WinRM connection$")
	public void User_enter_details_in_environment_window_for_Digital_Ocean_provider_WinRM_connection() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		String env_name = "PX_WinRM_DigitalOcean";
		EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver,env_name, dnowEnv.getEnv_description(),dncon.getCon_name_winrm(),dnProvider.getprovider_DegitalOceanname());
		EnvironmentPageAction.createNewEnvironmentButton(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	@When("^User enter details in environment window for V sphere provider WinRM connection$")
	public void User_enter_details_in_environment_window_for_V_sphere_provider_WinRM_connection() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class); 
		String env_name = "PX_WinRM_vSphere";
		EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver,env_name, dnowEnv.getEnv_description(),dncon.getCon_name_winrm(),dnProvider.getprovider_vSpherename());
		EnvironmentPageAction.createNewEnvironmentButton(driver);	
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	
	@Then("^User search or create environment for export test$")
	public void user_search_or_create_vpc_environment_for_export_test() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, dnowEnv.getEnv_export_rname());  
	}
	
	@Then("^User delete Export Test environment and see message environment deleted sucessfully$")
	public void user_delete_VPC_Export_Test_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver, dnowEnv.getEnv_export_rname());
	}
	
	@Then("^User click on export button$")
	public void user_click_on_export_button() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		//EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.exportFile(driver, dnowEnv.getEnv_export_rname());
		}
	
	@Then("^User click on export file yes button$")
	public void user_click_on_export_file_yes_button() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		EnvironmentPageAction.exportFileYes(driver);
	}
	
	@Then("^User click on export file no button$")
	public void user_click_on_export_file_no_button() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		EnvironmentPageAction.exportFileNo(driver);
	}
	
	@Then("^User click on export as blueprint no button$")
	public void user_click_on_export_as_blueprint_no_button() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		EnvironmentPageAction.exportFileAsBluePrintNo(driver);
	}
	
	@Then("^User click on export as blueprint yes button$")
	public void user_click_on_export_as_blueprint_yes_button() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		EnvironmentPageAction.exportFileAsBluePrintYes(driver);
		
		
	}

	@When("^User click on edit button$")
	public void user_click_on_edit_button() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.editClick(driver); 
	}

	@Then("^User click on cross button on edit popup$")
	public void user_click_on_cross_button_on_edit_popup() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.editCrossBtn(driver);
	}

	@Then("^User click on cancel button on edit popup$")
	public void user_click_on_cancel_button_on_edit_popup() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.editCancelBtn(driver);
	}

	@Then("^User should not see provider in edit popup$")
	public void user_should_not_see_proivder_in_edit_popup() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		EnvironmentPageAction.validateInvisiblityOfProivder(driver);
	}

	@Then("^User enters environment name for edit$")
	public void user_updates_env_name() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.enterEditName(driver,dnowEnv.getEnv_edit_name());
	}

	@Then("^User enters environment description for edit$")
	public void user_updates_env_description() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.enterEditDescription(driver, dnowEnv.getEnv_edit_description());
	}

	@Then("^User selects another ssh connection for edit$")
	public void user_updates_another_ssh_connection() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.selectConnectionForEdit(driver, dncon.getAnother_con_name());
	}

	@Then("^User selects another aws provider for edit$")
	public void user_updates_another_aws_provider() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.selectProviderForEdit(driver, dnProvider.getProvider_AWS_another_name());
	}

	@Then("^User selects Digital Ocean provider for edit$")
	public void user_selects_digital_ocean_provider() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.selectProviderForEdit(driver, dnProvider.getprovider_DegitalOceanname());
	}

	@And("^User click on update button on edit popup$")
	public void user_click_on_update_button_on_edit_popup() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.editUpdateBtn(driver);
	}


	@Then("^User should see message environment updated successfully$")
	public void user_sees_message_updated_successfully() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.validateSuccessMessageForEnvUpdate(driver);
	}

	@Then("^User should see message environment can not be updated$")
	public void user_sees_message_environment_not_be_updated() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.validateErrorMessageForEnvUpdate(driver);
	}
	
	@When("^User click on import button$")
	public void user_click_on_import_button() throws Throwable {
	String className = dnowEnv.getEnv_import_name().substring(0);
	int index1 = className.indexOf('.');
	String envName = className.substring(1,index1);
	System.out.println(""+envName);
	PageFactory.initElements(driver,EnvironmentPage.class);
	EnvironmentPageAction.importFile(driver,envName); 
	}

	@Then("^User click on cross button on import popup$")
	public void user_click_on_cross_button_on_import_popup() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.importCrossBtn(driver);
	}

	@Then("^User click on cancel button on import popup$")
	public void user_click_on_cancel_button_on_import_popup() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.importCancelBtn(driver);
	}

	@Then("^User click on upload button on import popup$")
	public void user_click_on_upload_button_on_import_popup() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.importChooseFile(driver, dnowEnv.getEnv_import_name());
		EnvironmentPageAction.importUploadBtn(driver);
		}

	@And("^User click on start import button$")
	public void user_click_on_start_import_button() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,ProviderPage.class);
		PageFactory.initElements(driver,ConnectionPage.class);
		PageFactory.initElements(driver,EnvironmentPageAction.class);
		String className = dnowEnv.getEnv_import_name().substring(0);
		int index1 = className.indexOf('.');
		String envName = className.substring(1,index1);
		System.out.println(""+envName);
		EnvironmentPageAction.importStartImportBtn(driver, 	dncon.getCon_name(),dnProvider.getprovider_AWSname(),envName);
	}  
	@And("^user search and delete copy enviornment$")
	public void user_search_and_delete_copy_enviornment() throws Throwable {
	PageFactory.initElements(driver,EnvironmentPage.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	AWSDependsOnPageAction.searchEnvironmentVPCDependson(driver,dnowEnv.getEnv_copy_name());
	EnvironmentPageAction.environmentDropdown(driver);
	EnvironmentPageAction.deleteEnvironment1(driver,dnowEnv.getEnv_copy_name());
 }
	
}  
