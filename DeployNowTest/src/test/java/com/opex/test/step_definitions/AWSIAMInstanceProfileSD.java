package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;
import com.opex.test.entity.IAMInstanceProfileAttributes;
import com.opex.test.helpers.DataHelper;
import com.opex.test.modules.AWSELBPageAction;
import com.opex.test.modules.AWSIAMInstanceProfilePageAction;
import com.opex.test.modules.AWSIAMRolePageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSRoute53ZonePageAction;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSIAMInstanceProfilePage;
import com.opex.test.pageobjects.AWSIAMRolePage;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSRoute53ZonePageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSIAMInstanceProfileSD extends SuperUsedDefinition{

	public  AWSIAMInstanceProfileSD(){
		super();
	}
	@Then("^User search or create environment for IAMInstanceProfile and see message as environment created successfully$")
	public void user_search_or_create_environment_for_IAMInstanceProfile_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, AWSIAMInstanceProfilePage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String env_name = dnowEnv.getEnv_name()+"IMIP";
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}
	
	@Then("^User delete IAMInstanceProfile environment and see message environment deleted sucessfully$")
	public void user_delete_IAMInstanceProfile_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		String env_name = dnowEnv.getEnv_name()+"IMIP";
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
		
	@Then("^User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile$")
	public void user_drag_iamrole_resource_and_enter_mandatory_attributes_for_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
    	PageFactory.initElements(driver,CommonFunctionalityPage.class);
    	PageFactory.initElements(driver, AWSIAMRolePage.class);
    	CommonFunctionalityPageAction.resourceDragDrop(driver,AWSIAMRolePage.resource_iamrole);
    	CommonFunctionalityPageAction.enterResourceName(driver, dnIamRole.getIamRole_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver, dnIamRole.getIamRole_rname());
		AWSIAMRolePageAction.enterAssumeRolePolicy(driver, dnIamRole.getIamRole_assume_role_policy());
	}

	@When("^User click IAMInstanceProfile resource and drag on the dashboard$")
	public void User_click_IAMInstanceProfile_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSIAMInstanceProfilePage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSIAMInstanceProfilePage.resource_IMIP); 

	}
	@Then("^User click on deploy button and check deployment status without providing mandatory fields")
	public void User_click_on_deploy_button_and_check_deployment_status() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSIAMInstanceProfilePageAction.deployfail(driver);
		}
	
	@And("^User enter IAMInstanceProfile resource name$")
	public void User_enter_IAMInstanceProfile_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSIAMInstanceProfilePage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnIMIP.getIAMInstanceProfile_rname());
		}
	

	@And("^User enter blank IAMInstanceProfile resource name$")
	public void User_enter_blank_IAMInstanceProfile_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSIAMInstanceProfilePage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,"");
		}


	@When("^User click on resource IAMInstanceProfile$")
	public void User_click_on_resource_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver, AWSIAMInstanceProfilePage.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnIMIP.getIAMInstanceProfile_rname());
		}
	
	@And("^User enter role for IAMInstanceProfile$")
	public void User_enter_role_for_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver, AWSIAMInstanceProfilePage.class); 
		AWSIAMInstanceProfilePageAction.enterRole(driver,dnIMIP.getIAMInstanceProfile_role());
	}
	@And("^User enter blank role for IAMInstanceProfile$")
	public void User_enter_blank_role_for_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver, AWSIAMInstanceProfilePage.class); 
		AWSIAMInstanceProfilePageAction.enterRole(driver,"null");
	}
	@Then("^User enter dependsOn for IAMInstanceProfile$")
	public void user_enter_dependsOn_for_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnIMIP.getIAMInstanceProfile_dependsOn());
	}

	@Then("^User enter connection for IAMInstanceProfile$")
	public void user_enter_connection_for_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver, dnIMIP.getIAMInstanceProfile_connection());
	}

	@Then("^User enter name for IAMInstanceProfile$")
	public void user_enter_name_for_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver, AWSIAMInstanceProfilePage.class); 
		AWSIAMInstanceProfilePageAction.enterName(driver, dnIMIP.getIAMInstanceProfile_name());
	}

	@Then("^User enter name prifix for IAMInstanceProfile$")
	public void user_enter_name_prifix_for_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver, AWSIAMInstanceProfilePage.class); 
		AWSIAMInstanceProfilePageAction.enterNamePrifix(driver, dnIMIP.getIAMInstanceProfile_name_prifix());
	}

	@Then("^User enter path for IAMInstanceProfile$")
	public void user_enter_path_for_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver, AWSIAMInstanceProfilePage.class); 
		AWSIAMInstanceProfilePageAction.enterNamePrifix(driver, dnIMIP.getIAMInstanceProfile_path());
	}

	@And("^User click on please delete it resource cross button popup for IAMInstanceProfile$")
	public void User_click_on_please_delete_it_resource_cross_button_popup_for_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dnIMIP.getIAMInstanceProfile_rname());
	}

	@And("^User click on please dont delete it resource cross button popup for IAMInstanceProfile$")
	public void User_click_on_please_dont_delete_it_resource_cross_button_popup_for_IAMInstanceProfile() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver, dnIMIP.getIAMInstanceProfile_rname());
	}
	
	
}