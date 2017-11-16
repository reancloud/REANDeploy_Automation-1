package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.AWSEipPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSEipPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSEipSD extends SuperUsedDefinition{

	public  AWSEipSD(){
		super();
	}
	@Then("^User search or create environment for Eip and see message as environment created successfully$")
	public void User_search_or_create_environment_for_Eip_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, AWSEipPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSEipSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}
	
	@Then("^User delete eip environment and see message environment deleted sucessfully$")
	public void User_delete_vpc_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		String className = AWSEipSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
	
	@When("^User click eip resource and drag on the dashboard$")
	public void User_click_eip_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSEipPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSEipPage.resource_eip);
	}

	@And("^User enter eip resource name$")
	public void User_enter_eip_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSEipPage.class);  
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnEip.getEIP_rname());
	}
	@And("^User enter blank resource name for eip$") 
	public void User_enter_blank_resource_name_for_eip() throws Throwable {
		PageFactory.initElements(driver, AWSEipPage.class);   
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,"");
	}

	@When("^User click on eip resource$")
	public void User_click_on_eip_resource() throws Throwable {
		PageFactory.initElements(driver, AWSEipPage.class);   
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnEip.getEIP_rname());
	}
	
	@And("^User enter attributes for eip$")
	public void User_enter_attributes_for_eip() throws Throwable {
		PageFactory.initElements(driver, AWSEipPage.class);   
		AWSEipPageAction.enterEIPAttributes(driver, dnEip.getEIP_dependsOn(), dnEip.getEIP_connection(), dnEip.getEIP_associateWithPrivateIp(), dnEip.getEIP_instance(), dnEip.getEIP_networkInterface(),dnEip.getEIP_vpc());
	}
	@And("^User click on please delete if resource need to be deleted for eip$")
	public void User_click_on_please_delete_if_resource_need_to_be_deleted_for_eip() throws Throwable {
		PageFactory.initElements(driver, AWSEipPage.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dnEip.getEIP_rname());
	}

	@And("^User click on dont delete if resource need to be deleted for eip$")
	public void User_click_on_dont_delete_if_resource_need_to_be_deleted_for_eip() throws Throwable {
		PageFactory.initElements(driver, AWSEipPage.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnEip.getEIP_rname());
	}


}
