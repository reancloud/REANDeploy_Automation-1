package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.modules.AWSNATGatewayPageAction;
import com.opex.test.modules.AWSRoute53RecordPageAction;
import com.opex.test.modules.AWSRouteTablePageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSRouteTableAssnPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.pageobjects.AWSIAMInstanceProfilePage;
import com.opex.test.pageobjects.AWSNATgatewayPageObject;
import com.opex.test.pageobjects.AWSRoute53RecordPageObject;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.AWSEipPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSRouteTableAssnPageObject;
import com.opex.test.pageobjects.AWSVpcPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSNATgatewaySD extends SuperUsedDefinition{

	public AWSNATgatewaySD()
	{
		super();
	}
	@Then("^User search or create environment for NAT Gateway and see message as environment created successfully$")
	public void User_search_or_create_environment_for_NAT_Gateway_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSNATgatewaySD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name);
	}

	@Then("^User click on VPC resource and entered all the attribute values for natgateway$")
	public void User_click_on_VPC_resource_and_entered_all_the_attribute_values_for_natgateway() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		AWSNATGatewayPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		//CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
        CommonFunctionalityPageAction.enterResourceName(driver,dnNatgateway.getnatgateway_vpc_rname());
        CommonFunctionalityPageAction.resourceCreateBtn(driver);
        CommonFunctionalityPageAction.clickOnResource(driver, dnNatgateway.getnatgateway_vpc_rname());
        AWSVpcPageAction.vpcCidrBlock(driver,dnNatgateway.getnatgateway_vpc_cidrblock()) ;
		}

	@Then("^User click on subnet resource and entered all the attribute values for natgateway$")
	public void User_click_on_subnet_resource_and_entered_all_the_attribute_values_for_natgateway() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		AWSNATGatewayPageAction.resourceDragDrop(driver,AWSSubnetPageObject.resource_subnet);
		//AWSSubnetPageAction.ResourceSelectsubnet(driver);
        CommonFunctionalityPageAction.enterResourceName(driver,dnNatgateway.getnatgateway_subnet1_rname());
        CommonFunctionalityPageAction.resourceCreateBtn(driver);
        AWSSubnetPageAction. ResourcePassvariable(driver,dnNatgateway.getnatgateway_subnet1_cidr(),dnNatgateway.getnatgateway_subnet1_vpcid(),"","","");
	}
	@Then("^User again click on subnet resource and entered all the attribute values for natgateway$")
	public void User_again_click_on_subnet_resource_and_entered_all_the_attribute_values_for_natgateway() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		//AWSSubnetPageAction.ResourceSelectsubnet(driver);
		AWSNATGatewayPageAction.resourceDragDrop(driver,AWSSubnetPageObject.resource_subnet);
        CommonFunctionalityPageAction.enterResourceName(driver,dnNatgateway.getnatgateway_subnet2_rname());
        CommonFunctionalityPageAction.resourceCreateBtn(driver);
        AWSSubnetPageAction. ResourcePassvariable(driver,dnNatgateway.getnatgateway_subnet2_cidr(),dnNatgateway.getnatgateway_subnet2_vpcid(),"","","");

	}
	@And("^User enter route table resource name for NAT Gateway$")
	public void User_enter_route_table_resource_name_for_NAT_Gateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
        CommonFunctionalityPageAction.enterResourceName(driver,dnNatgateway.getnatgateway_Rtable1_rname());
	
	}
	@And("^User enter route table vpc id for natgateway$")
	public void User_enter_route_table_vpc_id_for_natgateway() throws Throwable {

		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver,dnNatgateway.getnatgateway_Rtable1_vpcid());

	}
	@And("^User set json for route for natgateway$")
	public void User_set_json_for_route_for_natgateway() throws Throwable {
		Log.info("Enter route table json value");
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSNATGatewayPageAction.clickRouteTableJson(driver,dnNatgateway.getnatgateway_Rtable1_json());    	    	
	}
	@And("^User again enter route table resource name for NAT Gateway$")
	public void User_again_enter_route_table_resource_name_for_NAT_Gateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnNatgateway.getnatgateway_Rtable2_rname());	
	}
	@And("^User again enter route table vpc id for natgateway$")
	public void User_again_enter_route_table_vpc_id_for_natgateway() throws Throwable {

		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver,dnNatgateway.getnatgateway_Rtable2_vpcid());

	}
	@And("^User again set json for route for natgateway$")
	public void User_again_set_json_for_route_for_natgateway() throws Throwable {
		Log.info("Enter route table json value");
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSNATGatewayPageAction.clickRTableJson(driver,dnNatgateway.getnatgateway_Rtable2_json());    	    	
	}

	@When("^User click on route table resource$")
	public void User_click_on_route_table_resource() throws Throwable {
		Log.info("Enter route table json value");
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnNatgateway.getnatgateway_Rtable1_rname());
	}

	
	@And("^User enter internet gateway resource name for NAT Gateway$")
	public void User_enter_internet_gateway_resource_name_for_NAT_Gateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnNatgateway.getnatgateway_IGW_rname());	
	}
	@When("^User click route table resource and drag on the dashboard for natgateway$")
	public void User_click_route_table_resource_and_drag_on_the_dashboard_for_natgateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		AWSNATGatewayPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
		//CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
	}
	@When("^User click EIP resource and drag on the dashboard for natgateway$")
	public void User_click_EIP_resource_and_drag_on_the_dashboard_for_natgateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSEipPage.class);
		AWSNATGatewayPageAction.resourceDragDrop(driver,AWSEipPage.resource_eip);
		//CommonFunctionalityPageAction.resourceDragDrop(driver,AWSEipPage.resource_eip);
	}
	@And("^User enter EIP resource name for NAT Gateway$")
	public void User_enter_EIP_resource_name_for_NAT_Gateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnNatgateway.getnatgateway_EIP_rname());
	}
	@And("^User enter RTA resource name for NAT Gateway$")
	public void User_enter_RTA_resource_name_for_NAT_Gateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnNatgateway.getnatgateway_RTA_rname());	
	}
	@And("^User enter route table id of Route table Association for natgateway$")
	public void User_enter_route_table_id_of_Route_table_Association_for_natgateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnNatgateway.getnatgateway_RTA_routetable_id());
	}
	@And("^User enter subnet id of Route table Association for natgateway$")
	public void User_enter_subnet_id_of_Route_table_Association_for_natgateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnNatgateway.getnatgateway_RTA_subnetid());
	}
	@When("^User click NAT Gateway resource and drag on the dashboard$")
	public void User_click_NAT_Gateway_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSNATGatewayPageAction.clickNATResourceAndDrop(driver);	
	}

	@And("^User enter allocation id for NAT gateway resource$")
	public void User_enter_allocation_id_for_NAT_gateway_resource() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSNATGatewayPageAction.enterallocation_id(driver,dnNatgateway.getNatgateway_allocationId());	
	}
	@When("^User click on internet gateway resource for NAT gateway$")
	public void User_click_on_Subnet_resource_for_NAT_gateway() throws Throwable {

		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnNatgateway.getnatgateway_IGW_rname());

	}
	@When("^User click on RTA resource for NAT gateway$")
	public void User_click_on_RTA_resource_for_NAT_gateway() throws Throwable {

		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnNatgateway.getnatgateway_RTA_rname());

	}
	@When("^User click on NAT Gateway resource$")
	public void User_click_on_NAT_Gateway_resource() throws Throwable {

		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnNatgateway.getnatgateway_rname());

	}
	@Then("^User enter NAT Gateway resource name for NAT Gateway$")
	public void User_enter_NAT_Gateway_resource_name_for_NAT_Gateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnNatgateway.getnatgateway_rname());

	}

	@Then("^User enter blank resource name for NAT gateway resource$")
	public void User_enter_blank_resource_name_for_NAT_gateway_resource() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, "");
	}

	@Then("^User click on please delete it button if resource need to be deleted for Natgateway$")
	public void User_click_on_please_delete_it_button_if_resource_need_to_be_deleted_for_Natgateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dnNatgateway.getnatgateway_rname());
	}
	@Then("^User click on dont delete it button if resource need to be deleted for Natgateway$")
	public void User_click_on_dont_delete_it_button_if_resource_need_to_be_deleted_for_Natgateway() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnNatgateway.getnatgateway_rname());
	}

	@And("^User enter natgateway dependson value$")
	public void User_enter_natgateway_dependson_value() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnNatgateway.getNatgateway_dependsOn());
	}
	
	@And("^User enter natgateway networkinterfaceID value$")
	public void User_enter_networkinterfaceID_value() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		AWSNATGatewayPageAction.enterNetworkInterfaceId(driver, dnNatgateway.getNatgateway_networkInterfaceId());
	}
	
	@And("^User enter natgateway privateIp value$")
	public void User_enter_natgateway_privateIp_value() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		AWSNATGatewayPageAction.enterPrivateip(driver,dnNatgateway.getNatgateway_privateIp());
	}
	@And("^User enter natgateway publicIp value$")
	public void User_enter_publicIp_value() throws Throwable {
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		AWSNATGatewayPageAction.enterPublicip(driver,dnNatgateway.getNatgateway_publicIp());
	}

	@Then("^User delete NAT Gateway environment and see message environment deleted sucessfully$")
	public void User_delete_NAT_Gateway_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSNATgatewaySD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}

	@When("^User click RTA resource and drag on the dashboard for natgateway$")
	public void User_click_RTA_resource_and_drag_on_the_dashboard_for_natgateway() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSNATGatewayPageAction.resourceDragDrop(driver,AWSRouteTableAssnPageObject.resource_RTA);
	}

}