package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSInternetGatewayPageAction;
import com.opex.test.modules.AWSRouteTablePageAction;
import com.opex.test.modules.AWSRoutePageAction;
import com.opex.test.modules.AWSVpcpeeringPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSRouteTableAssnPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.AWSRoutePageObject;
import com.opex.test.pageobjects.AWSVpcPeeringPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSRouteTableAssnPageObject;
import com.opex.test.pageobjects.AWSVpcPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSVpcpeeringSD extends SuperUsedDefinition{

	public AWSVpcpeeringSD(){
		super();
	}
	@Then("^User search or create environment for Vpcpeering and see message as environment created successfully$")
	public void user_search_or_create_environment_for_Vpcpeering_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, AWSVpcPeeringPageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSVpcpeeringSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}

	@Then("^User delete Vpcpeering environment and see message environment deleted sucessfully$")
	public void user_delete_Vpcpeering_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		PageFactory.initElements(driver, AWSVpcPeeringPageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		String className = AWSVpcpeeringSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}

	@When("^User click Vpcpeering resource and drag on the dashboard$")
	public void User_click_Vpcpeering_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPeeringPageObject.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPeeringPageObject.resource_vpcPeering);
	}

	@And("^User enter Vpcpeering resource name$")
	public void User_enter_Vpcpeering_resource_name() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,"vpc-test");
		}  

	@When("^User click on Vpcpeering resource$")
	public void User_click_on_Vpcpeering_resource() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnVPeering.getVpcPeering_Rname());
	}
	
	@And("^User enter peerOwnerID attributes of Vpcpeering$")
	public void User_enter_peerOwnerID_attributes_of_Vpcpeering() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		AWSVpcpeeringPageAction.enterPeerOwnerId(driver,dnVPeering.getVpcPeering_peer_owner_id());
	}
	

	@And("^User enter peerVpcId attributes of Vpcpeering$")
	public void User_enter_peerVpcId_attributes_of_Vpcpeering() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		AWSVpcpeeringPageAction.enterPeerVpcID(driver,dnVPeering.getVpcPeering_peer_vpc_id());
	}
	
	@And("^User enter VpcId attributes of Vpcpeering$")
	public void User_enter_VpcId_attributes_of_Vpcpeering() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		AWSVpcpeeringPageAction.enterVpcID(driver, dnVPeering.getVpcPeering_vpc_id());
	}
	
	@And("^User enter dependsOn attributes of Vpcpeering$")
	public void User_enter_dependsOn_attributes_of_Vpcpeering() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_dependson());
		
	}
	
	@And("^User enter connection attributes of Vpcpeering$")
	public void User_enter_connection_attributes_of_Vpcpeering() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		CommonFunctionalityPageAction.selectConnection(driver,dnVPeering.getVpcPeering_connection());
		
	}
	
	@And("^User enter acceptor attributes of Vpcpeering$")
	public void User_enter_acceptor_attributes_of_Vpcpeering() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		AWSVpcpeeringPageAction.enterAcceptor(driver,dnVPeering.getVpcPeering_acceptor());
	}
	
	@And("^User enter autoAccept attributes of Vpcpeering$")
	public void User_enter_autoAccept_attributes_of_Vpcpeering() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		AWSVpcpeeringPageAction.enterAutoAccept(driver,dnVPeering.getVpcPeering_auto_accept());
	}
	
	@And("^User enter requestor attributes of Vpcpeering$")
	public void User_enter_requestor_attributes_of_Vpcpeering() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		AWSVpcpeeringPageAction.enterRequestor(driver,dnVPeering.getVpcPeering_requestor());
	}
	
	@And("^User enter tags attributes of Vpcpeering$")
	public void User_enter_tags_attributes_of_Vpcpeering() throws Throwable {
		PageFactory.initElements(driver,AWSVpcPeeringPageObject.class);
		AWSVpcpeeringPageAction.enterTag(driver,dnVPeering.getVpcPeering_tag());
	}

	@And("^User dragdrop route1 and enter attribute for vpcPeering$")
	public void User_dragdrop_route1_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSRoutePageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRoutePageObject.route_resource);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_route1_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRoutePageAction.enterDestn_cidr(driver,dnVPeering.getVpcPeering_route1_destination_cidr_block());
		AWSRoutePageAction.enterRouteTableId(driver,dnVPeering.getVpcPeering_route1_table_id());
		AWSVpcPeeringPageObject.route_vpcpeeringConnectionId.sendKeys(dnVPeering.getVpcPeering_route1_vpc_peering_connection_id());
	}

	@And("^User dragdrop vpc1 and enter attribute for vpcPeering$")
	public void User_dragdrop_vpc1_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_vpc1_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver,dnVPeering.getVpcPeering_vpc1_Rname());
		AWSVpcPageAction.vpcCidrBlock(driver,dnVPeering.getVpcPeering_vpc1_cidrblock());
		AWSVpcPageAction.selectEnableDnsHostnamesValue(driver,dnVPeering.getVpcPeering_vpc1_enable_dns_hostnames());
		AWSVpcPageAction.selectEnableDnsSupportValue(driver,dnVPeering.getVpcPeering_vpc1_enable_dns_support());
	}

	@And("^User dragdrop igw1 and enter attribute for vpcPeering$")
	public void User_dragdrop_igw1_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSInternetGatewayPageAction.selectIGW(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_igw1_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver,dnVPeering.getVpcPeering_igw1_vpc_id());
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_igw1_dependson());
	}

	@And("^User dragdrop subnet1 and enter attribute for vpcPeering$")
	public void User_dragdrop_subnet1_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_subnet1_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnVPeering.getVpcPeering_subnet1_cidr_block(),dnVPeering.getVpcPeering_subnet1_vpc_id(),dnVPeering.getVpcPeering_subnet1_dependson(),"",dnVPeering.getVpcPeering_subnet1_availability_zone());
	}

	@And("^User dragdrop routetable1 and enter attribute for vpcPeering$")
	public void User_dragdrop_routetable1_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_routetable1_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver,dnVPeering.getVpcPeering_routetable1_vpc_id());
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_routetable1_dependson());
		AWSRouteTablePageAction.enterRouteJson(driver,dnVPeering.getVpcPeering_routetable1_route());
	}


	@And("^User dragdrop RTA1 and enter attribute for vpcPeering$")
	public void User_dragdrop_RTA1_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_rta1_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnVPeering.getVpcPeering_rta1_route_table_id());
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnVPeering.getVpcPeering_rta1_subnet_id());
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_rta1_dependson());

	}

	@And("^User dragdrop vpc2 and enter attribute for vpcPeering$")
	public void User_dragdrop_vpc2_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_vpc2_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSVpcPageAction.vpcCidrBlock(driver,dnVPeering.getVpcPeering_vpc2_cidrblock());
		AWSVpcPageAction.selectEnableDnsHostnamesValue(driver, dnVPeering.getVpcPeering_vpc2_enable_dns_hostnames());
		AWSVpcPageAction.selectEnableDnsSupportValue(driver,dnVPeering.getVpcPeering_vpc2_enable_dns_support());
	}

	@And("^User dragdrop igw2 and enter attribute for vpcPeering$")
	public void User_dragdrop_igw2_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSInternetGatewayPageAction.selectIGW(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_igw2_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver,dnVPeering.getVpcPeering_igw2_vpc_id());
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_igw2_dependson());
	}

	@And("^User dragdrop subnet2 and enter attribute for vpcPeering$")
	public void User_dragdrop_subnet2_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_subnet2_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnVPeering.getVpcPeering_subnet2_cidr_block(),dnVPeering.getVpcPeering_subnet2_vpc_id(),dnVPeering.getVpcPeering_subnet2_dependson(),"",dnVPeering.getVpcPeering_subnet2_availability_zone());
	}

	@And("^User dragdrop routetable2 and enter attribute for vpcPeering$")
	public void User_dragdrop_routetable2_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_routetable2_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver,dnVPeering.getVpcPeering_routetable2_vpc_id());
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_routetable2_dependson());
		AWSRouteTablePageAction.enterRouteJson(driver,dnVPeering.getVpcPeering_routetable2_route());
	}


	@And("^User dragdrop RTA2 and enter attribute for vpcPeering$")
	public void User_dragdrop_RTA2_and_enter_attribute_for_vpcPeering() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnVPeering.getVpcPeering_rta2_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnVPeering.getVpcPeering_rta2_route_table_id());
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnVPeering.getVpcPeering_rta2_subnet_id());
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_rta2_dependson());

	}



}
