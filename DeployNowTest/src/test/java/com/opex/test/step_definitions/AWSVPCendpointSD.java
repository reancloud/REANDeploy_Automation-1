package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.modules.AWSVPCEndpointPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSVPCEndpointPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSVPCendpointSD extends SuperUsedDefinition {

	public AWSVPCendpointSD(){
		super();
	}
	
	@Then("^User search or create environment for VPCendpoint and see message as environment created successfully$")
	public void user_search_or_create_environment_for_VPCendpoint_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSVPCEndpointPageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		String className = AWSVPCendpointSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}
	@Then("^User delete VPCendpoint environment and see message environment deleted sucessfully$")
	public void user_delete_VPCendpoint_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		String className = AWSVPCendpointSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}	
	@Then("^User dragdrop vpc and enter attribute for VPCendpoint$")
	public void User_dragdrop_vpc_and_enter_attribute_for_VPCendpoint() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVpcendpoint.getvpcEndpoint_vpc_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver,dnVpcendpoint.getvpcEndpoint_vpc_rname());
		AWSVpcPageAction.vpcCidrBlock(driver,dnVpcendpoint.getvpcEndpoint_vpc_cidrblock());
	}

	@When("^User click VPCendpoint resource and drag on the dashboard$")
	public void user_click_VPCendpoint_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVPCEndpointPageObject.resource_vpcendpoint);
	}

	@And("^User enter VPCendpoint resource name$")
	public void user_enter_VPCendpoint_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSVPCEndpointPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVpcendpoint.getVpcendpoint_rname());
	}

	@When("^User click on VPCendpoint resource$")
	public void user_click_on_VPCendpoint_resource() throws Throwable {
		PageFactory.initElements(driver, AWSVPCEndpointPageObject.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnVpcendpoint.getVpcendpoint_rname());
	}

	@And("^User enter service name for VPCendpoint$")
	public void user_enter_service_name_for_VPCendpoint() throws Throwable {
		PageFactory.initElements(driver, AWSVPCEndpointPageObject.class);
		AWSVPCEndpointPageAction.enterVpcEndpointServiceName(driver,dnVpcendpoint.getVpcendpoint_ServiceName());
	}

	@And("^User enter vpc id for VPCendpoint$")
	public void user_enter_vpc_id_for_VPCendpoint() throws Throwable {
		PageFactory.initElements(driver, AWSVPCEndpointPageObject.class);
		AWSVPCEndpointPageAction.enterVpcEndpointVpcId(driver,dnVpcendpoint.getvpcEndpoint_VpcID());
	}

	@And("^User enter dependson for VPCendpoint$")
	public void user_enter_dependson_for_VPCendpoint() throws Throwable {
		PageFactory.initElements(driver, AWSVPCEndpointPageObject.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVpcendpoint.getvpcEndpoint_DependsOn());
	}
	
	@Then("^User set connection for VPCendpoint$")
	public void user_set_connection_for_VPCendpoint() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver,dnVpcendpoint.getvpcEndpoint_Connection());
		
	}

	@And("^User enter policyText for VPCendpoint$")
	public void user_enter_policyText_for_VPCendpoint() throws Throwable {
		PageFactory.initElements(driver, AWSVPCEndpointPageObject.class);
		AWSVPCEndpointPageAction.enterVpcEndpointPolicyText(driver,dnVpcendpoint.getvpcEndpoint_policy());
	}

	@And("^User enter routetableId for VPCendpoint$")
	public void user_enter_routetableId_for_VPCendpoint() throws Throwable {
		PageFactory.initElements(driver, AWSVPCEndpointPageObject.class);
		AWSVPCEndpointPageAction.enterVpcEndpointRTId(driver, dnVpcendpoint.getvpcEndpoint_RouteTableID());
	}

	
}
