package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSRoute53RecordPageAction;
import com.opex.test.modules.AWSVPCDHCPPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSRoute53RecordPageObject;
import com.opex.test.pageobjects.AWSVPCDHCPPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSVPCDHCPSD extends SuperUsedDefinition  {
	
	public AWSVPCDHCPSD()
    {
		super();  	
    }
	
	@Then("^User search or create environment for VPCDHCP and see message as environment created successfully$")
	public void User_search_or_create_environment_for_VPCDHCP_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVPCDHCPPageObject.class);
		String className = AWSVPCDHCPSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name); 
	}

	@When("^User click VPCDHCP resource and drag on the dashboard$")
	public void User_click_VPCDHCP_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSVPCDHCPPageAction.dragdropVPCDHCP(driver);
	}

	@And("^User enter VPCDHCP resource name$")
	public void User_enter_VPCDHCP_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnowVPCDHCP.getVPCDHCP_name()); 
	}

	@When("^User click on VPCDHCP resource$")
	public void i_click_on_VPCDHCP_resource() throws Throwable {
		PageFactory.initElements(driver, AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnowVPCDHCP.getVPCDHCP_name());
	}

	@And("^User enter domain name for VPCDHCP$")
	public void User_enter_domain_name_for_VPCDHCP() throws Throwable {
		PageFactory.initElements(driver,  AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSVPCDHCPPageAction.Resourcedomain_name(driver,dnowVPCDHCP.getVPCDHCPdomain_name());
	}
	
	@And("^User enter domain name server for VPCDHCP$")
	public void User_enter_domain_name_server_for_VPCDHCP() throws Throwable {
		PageFactory.initElements(driver,  AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSVPCDHCPPageAction.Resourcedomain_name_server(driver,dnowVPCDHCP.getVPCDHCPdomain_name_server());
	}

	@Then("^User delete environment for VPCDHCP and see message environment deleted successfully$")
	public void User_delete_environment_for_VPCDHCP_and_see_message_environment_deleted_successfully() throws Throwable {
		String className = AWSVPCDHCPSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}

	@And("^User enter depends on for VPCDHCP$")
	public void user_enter_depends_on_for_VPCDHCP() throws Throwable {
		PageFactory.initElements(driver,  AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnowVPCDHCP.getVPCDHCP_dependson());
	}

	@And("^User select connection for VPCDHCP$")
	public void user_select_connection_for_VPCDHCP() throws Throwable {
		PageFactory.initElements(driver,  AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver, dnowVPCDHCP.getVPCDHCP_connection());
	}

	@And("^User enter netbios_name_servers for VPCDHCP$")
	public void user_enter_netbios_name_servers_for_VPCDHCP() throws Throwable {
		PageFactory.initElements(driver,  AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSVPCDHCPPageAction.netbiosNameServers(driver,dnowVPCDHCP.getVPCDHCP_netbios_name_servers());
	}

	@And("^User select netbios_node_typ for VPCDHCP$")
	public void user_select_netbios_node_typ_for_VPCDHCP() throws Throwable {
		PageFactory.initElements(driver,  AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSVPCDHCPPageAction.netbiosNodeType(driver,dnowVPCDHCP.getVPCDHCP_netbios_node_type());
	}

	@And("^User enter ntp_servers for VPCDHCP$")
	public void user_enter_ntp_servers_for_VPCDHCP() throws Throwable {
		PageFactory.initElements(driver,  AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSVPCDHCPPageAction.ntpServers(driver,dnowVPCDHCP.getVPCDHCP_ntp_servers());
	}

	@And("^User enter tags for VPCDHCP$")
	public void user_enter_tags_for_VPCDHCP() throws Throwable {
		PageFactory.initElements(driver,  AWSVPCDHCPPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSVPCDHCPPageAction.tags(driver,dnowVPCDHCP.getVPCDHCP_tags());
	}

}
