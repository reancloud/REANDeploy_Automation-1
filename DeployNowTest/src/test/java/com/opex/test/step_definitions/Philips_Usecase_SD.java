package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.google.common.io.PatternFilenameFilter;
import com.opex.test.modules.*;
import com.opex.test.pageobjects.*;
import com.opex.test.entity.Philips_Usecase_Attributes;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

public class Philips_Usecase_SD extends SuperUsedDefinition {
	
	public Philips_Usecase_SD(){
		super();
		
	}
	
	@Then("^User search or create Philips Usescase environment and see message as environment created successfully$")
	public void User_search_or_create_Philips_Usescase_environment_and_see_message_as_environment_created_successfully() throws Exception{
			PageFactory.initElements(driver,Philips_Usecase_PageObject.class);
		    PageFactory.initElements(driver,EnvironmentPage.class);
			PageFactory.initElements(driver,CommonFunctionalityPage.class);
			String className = Philips_Usecase_SD.class.getSimpleName();
			String env_name = dnowEnv.getEnv_name()+className;
			EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
			
		
	}
	
	@Then("^User delete Philips Usescase environment and see message environment deleted successfully$")
	public void user_delete_Philips_Usescase_environment_and_see_message_environment_deleted_successfully() throws Throwable {
		String className = Philips_Usecase_SD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
		
	}
	
	@Then("^User dragdrop vpc and enter attribute for PU$")
	   public void User_dragdrop_vpc_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_vpc1_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		
		CommonFunctionalityPageAction.clickOnResource(driver,dnPU.getPU_vpc1_rname());
		AWSVpcPageAction.vpcCidrBlock(driver,dnPU.getPU_vpc1_cidrblock());
		AWSVpcPageAction.selectEnableDnsHostnamesValue(driver, dnVpc.getVpc_enableHostname());
		AWSVpcPageAction.selectEnableDnsSupportValue(driver, dnVpc.getVpc_enableDnssupport());
		AWSVpcPageAction.enterInstanceTenancyValue(driver, "default");
		////
		
	}
	
	@And("^User dragdrop vpc2 and enter attribute for PU$")
	   public void User_dragdrop_vpc2_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_vpc2_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickCanvas(driver);
		CommonFunctionalityPageAction.clickOnResource(driver,dnPU.getPU_vpc2_rname());
		AWSVpcPageAction.vpcCidrBlock(driver,dnPU.getPU_vpc2_cidrblock());
	//	AWSVpcPageAction.selectEnableDnsHostnamesValue(driver, dnVpc.getVpc_enableHostname());
	//	AWSVpcPageAction.selectEnableDnsSupportValue(driver, dnVpc.getVpc_enableDnssupport());
	
		//
	}
	 
	@And("^User dragdrop subnet1 and enter attribute for PU$")
	public void User_dragdrop_subnet1_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_subnet1_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnPU.getPU_subnet1_cidr(),dnPU.getPU_subnet1_vpcid(),"","","us-west-2a","true");
		
		////
	}
	
	@And("^User dragdrop subnet2 and enter attribute for PU$")
	public void User_dragdrop_subnet2_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_subnet2_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnPU.getPU_subnet2_cidr(),dnPU.getPU_subnet2_vpcid(),"Vpc","","us-west-2b");
	//	//
	}
	
	@And("^User dragdrop subnet3 and enter attribute for PU$")
	public void User_dragdrop_subnet3_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_subnet3_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnPU.getPU_subnet3_cidr(),dnPU.getPU_subnet3_vpcid(),"","","us-west-2a");
		////
	}
	
	
	@And("^User dragdrop subnet4 and enter attribute for PU$")
	public void User_dragdrop_subnet4_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_subnet4_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnPU.getPU_subnet4_cidr(),dnPU.getPU_subnet4_vpcid(),"Vpc","","us-west-2b");
		////
	}
	
	@And("^User dragdrop subnet5 and enter attribute for PU$")
	public void User_dragdrop_subnet5_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_subnet5_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnPU.getPU_subnet5_cidr(),dnPU.getPU_subnet5_vpcid(),"","","us-west-2a");
		////
	}
	
	@And("^User dragdrop subnet6 and enter attribute for PU$")
	public void User_dragdrop_subnet6_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_subnet6_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnPU.getPU_subnet6_cidr(),dnPU.getPU_subnet6_vpcid(),"Vpc","","us-west-2b");
		//
	}
	
	@And("^User dragdrop igw1 and enter attribute for PU$")
	public void User_dragdrop_igw1_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSInternetGatewayPageAction.selectIGW(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_IGW1_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver,dnPU.getPU_IGW1_vpc_id());
		//CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_igw1_dependson());
		////
	}
	
	@And("^User dragdrop igw2 and enter attribute for PU$")
	public void User_dragdrop_igw2_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSInternetGatewayPageAction.selectIGW(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_IGW2_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver,dnPU.getPU_IGW2_vpc_id());
		//CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_igw1_dependson());
		//
	}
	
	@And("^User dragdrop VpcPeering and enter the attribute for PU$") 
	public void user_dragdrop_vpcPeering_and_enter_the_attribute_for_PU()throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSVpcPeeringPageObject.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSVpcPeeringPageObject.resource_vpcPeering);
		CommonFunctionalityPageAction.enterResourceName(driver, dnPU.getPU_vpcPeering_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSVpcpeeringPageAction.enterPeerOwnerId(driver, dnPU.getPU_vpcPeering_peer_owner_id());
		AWSVpcpeeringPageAction.enterPeerVpcID(driver, dnPU.getPU_vpcPeering_peer_vpc_id());
		AWSVpcpeeringPageAction.enterVpcID(driver, dnPU.getPU_vpcPeering_vpc_id());
		//
	}
	
	@And("^User dragdrop routetable1 and enter attribute for PU$")
	public void User_dragdrop_routetable1_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_public_Rt_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver,dnPU.getPU_public_Rt_vpcid());
		//CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_routetable1_dependson());
		AWSRouteTablePageAction.enterRouteJson(driver,dnPU.getPU_public_Rt_json());
		////
	}
	
	@And("^User dragdrop routetable2 and enter attribute for PU$")
	public void User_dragdrop_routetable2_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_private_Rt_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver,dnPU.getPU_private_Rt_vpcid());
		//CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_routetable1_dependson());
		AWSRouteTablePageAction.enterRouteJson(driver,dnPU.getPU_private_Rt_json());
		////
	}
	
	@And("^User dragdrop routetable3 and enter attribute for PU$")
	public void User_dragdrop_routetable3_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_IGW2_Rt1_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver,dnPU.getPU_IGW2_Rt1_vpcid());
		//CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_routetable1_dependson());
		AWSRouteTablePageAction.enterRouteJson(driver,dnPU.getPU_IGW2_Rt1_json());
		////
	}
	 
	@And("^User dragdrop routetable4 and enter attribute for PU$")
	public void User_dragdrop_routetable4_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_IGW2_Rt2_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver,dnPU.getPU_IGW2_Rt2_vpcid());
		//CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVPeering.getVpcPeering_routetable1_dependson());
		AWSRouteTablePageAction.enterRouteJson(driver,dnPU.getPU_IGW2_Rt2_json());
		//
	}
	
	@And("^User dragdrop route1 and enter attribute for PU$")
	public void User_dragdrop_route1_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSRoutePageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRoutePageObject.route_resource);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_admin_route_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRoutePageAction.enterDestn_cidr(driver,dnPU.getPU_admin_route_destn_cidr());
		AWSRoutePageAction.enterRouteTableId(driver,dnPU.getPU_admin_routeTable_id());
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnPU.getPU_admin_route_depends_on());
		AWSRoutePageAction.entervpcpeering(driver,dnPU.getPU_admin_route_vpc_peering_conn_id());
		//
	}

	@And("^User dragdrop Nat RTA1 and enter attribute for PU$")
	public void User_dragdrop_Nat_RTA1_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_nat_RTA1_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnPU.getPU_nat_RTA1_routetable_id());
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnPU.getPU_nat_RTA1_subnetid());
		////
	}
	
	@And("^User dragdrop Nat RTA2 and enter attribute for PU$")
	public void User_dragdrop_Nat_RTA2_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_nat_RTA2_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		String rt_id=dnPU.getPU_nat_RTA2_routetable_id();
		System.out.println(rt_id);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnPU.getPU_nat_RTA2_routetable_id());
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnPU.getPU_nat_RTA2_subnetid());
		////
	}
	
	@And("^User dragdrop Public RTA1 and enter attribute for PU$")
	public void User_dragdrop_Public_RTA1_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_public_RTA1_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnPU.getPU_public_RTA1_routetable_id());
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnPU.getPU_public_RTA1_subnetid());
		////
	}
	
	@And("^User dragdrop Public RTA2 and enter attribute for PU$")
	public void User_dragdrop_Public_RTA2_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_public_RTA2_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnPU.getPU_public_RTA2_routetable_id());
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnPU.getPU_public_RTA2_subnetid());
		////
	}
	
	@And("^User dragdrop private RTA1 and enter attribute for PU$")
	public void User_dragdrop_private_RTA1_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_private_RTA1_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnPU.getPU_private_RTA1_routetable_id());
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnPU.getPU_private_RTA1_subnetid());
		////
	}
	
	@And("^User dragdrop private RTA2 and enter attribute for PU$")
	public void User_dragdrop_private_RTA2_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_private_RTA2_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnPU.getPU_private_RTA2_routetable_id());
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnPU.getPU_private_RTA2_subnetid());
		//
	}
	
	@And("^User dragdrop Eip resource and enter attribute for PU$")
	public void User_dragdrop_Eip_resource_and_enter_attribute_for_PU() throws Throwable{
		PageFactory.initElements(driver, AWSEipPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSEipPage.resource_eip);
		CommonFunctionalityPageAction.enterResourceName(driver, dnPU.getPU_EIP_rnam());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSEipPageAction.enterEIPAttributes(driver, dnPU.getPU_EIP_DependsOn(),"","","","",dnPU.getPU_EIP_vpc());
		////
		//Philips_Usecase_PageAction.saveResource(driver);
	}
	
	@And("^User dragdrop Natgateway and enter attribute for PU$")
	public void User_dragdrop_Natgateway_and_enter_attribute_for_PU() throws Throwable{
		PageFactory.initElements(driver, Philips_Usecase_PageObject.class);
		PageFactory.initElements(driver, AWSNATgatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSNATGatewayPageAction.clickNATResourceAndDrop(driver);
		CommonFunctionalityPageAction.enterResourceName(driver, dnPU.getPU_natgateway_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSNATGatewayPageAction.enterallocation_id(driver, dnPU.getPU_natgateway_allocationId());
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnPU.getPU_natgateway_dependsOn());
		Philips_Usecase_PageAction.enterSubnetId(driver, dnPU.getPU_natgateway_subnetId());
		////
	}
	
	@Then("^User should see message environment saved successfully for PU$")
	public void User_should_see_message_environment_saved_successfully_for_PU() throws Throwable{
		PageFactory.initElements(driver, Philips_Usecase_PageObject.class);
		Philips_Usecase_PageAction.saveResource(driver);
		
	}
	
	@And("^User dragdrop elb security group and enter attribute for PU$")
	public void User_dragdrop_elb_security_group_and_enter_attribute_for_PU() throws Throwable {
		
		PageFactory.initElements(driver,AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		PageFactory.initElements(driver,AWSNetworkACLPageObject.class);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_elb_sg_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		Philips_Usecase_PageAction.enterIngressForSG(driver);
		AWSSecurityGroupPageAction.security_vpc_id(driver, dnPU.getPU_elb_sg_vpcid());
		
		////
	}
	
	@And("^User dragdrop security group and enter attribute for PU$")
	public void User_dragdrop_security_group_and_enter_attribute_for_PU() throws Throwable {
		
		PageFactory.initElements(driver,AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,Philips_Usecase_PageObject.class);
		PageFactory.initElements(driver,AWSNetworkACLPageObject.class);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_sg_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		Philips_Usecase_PageAction.enterJson(driver, dnPU.getPU_sg_ingress());
		AWSSecurityGroupPageAction.security_vpc_id(driver, dnPU.getPU_sg_vpcid());
		////
	}
	
	@And("^User dragdrop node1 security group and enter attribute for PU$")
	public void User_dragdrop_node1_security_group_and_enter_attribute_for_PU() throws Throwable {
		
		PageFactory.initElements(driver,AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,Philips_Usecase_PageObject.class);
		PageFactory.initElements(driver,AWSNetworkACLPageObject.class);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_node1_sg_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickCanvas(driver);
		CommonFunctionalityPageAction.clickOnResource(driver, dnPU.getPU_node1_sg_rname());
		Philips_Usecase_PageAction.enterJson(driver, dnPU.getPU_node1_sg_ingress());
		AWSSecurityGroupPageAction.security_vpc_id(driver, dnPU.getPU_node1_sg_vpcid());
		//Philips_Usecase_PageAction.security_vpc_id(driver, dnPU.getPU_node1_sg_vpcid());
		
	}
	
	@And("^User dragdrop node2 security group and enter attribute for PU$")
	public void User_dragdrop_node2_security_group_and_enter_attribute_for_PU() throws Throwable {
		
		PageFactory.initElements(driver,AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,Philips_Usecase_PageObject.class);
		PageFactory.initElements(driver,AWSNetworkACLPageObject.class);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_node2_sg_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickCanvas(driver);
		CommonFunctionalityPageAction.clickOnResource(driver, dnPU.getPU_node2_sg_rname());
		Philips_Usecase_PageAction.enterJson(driver, dnPU.getPU_node2_sg_ingress());
		AWSSecurityGroupPageAction.security_vpc_id(driver, dnPU.getPU_node2_sg_vpcid());
		////
	}
	
	@And("^User dragdrop node3 security group and enter attribute for PU$")
	public void User_dragdrop_node3_security_group_and_enter_attribute_for_PU() throws Throwable {
		
		PageFactory.initElements(driver,AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, Philips_Usecase_PageObject.class);
		PageFactory.initElements(driver,AWSNetworkACLPageObject.class);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_node3_sg_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		Philips_Usecase_PageAction.enterJson(driver, dnPU.getPU_node3_sg_ingress());
		AWSSecurityGroupPageAction.security_vpc_id(driver, dnPU.getPU_node3_sg_vpcid());
		////
	}
	
	@And("^User dragdrop node4 security group and enter attribute for PU$")
	public void User_dragdrop_node4_security_group_and_enter_attribute_for_PU() throws Throwable {
		
		PageFactory.initElements(driver,AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, Philips_Usecase_PageObject.class);
		PageFactory.initElements(driver,AWSNetworkACLPageObject.class);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_node4_sg_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		Philips_Usecase_PageAction.enterJson(driver, dnPU.getPU_node3_sg_ingress());
		AWSSecurityGroupPageAction.security_vpc_id(driver, dnPU.getPU_node4_sg_vpcid());
		
		////
	}
	
	@And("^User dragdrop Output resource and enter attribute for PU$")
	public void User_dragdrop_Output_resource_and_enter_attribute_for_PU() throws Exception{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, Philips_Usecase_PageObject.class);
		PageFactory.initElements(driver, AWSOutputPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSOutputPage.resource_output);
		CommonFunctionalityPageAction.clickCanvas(driver);
		Philips_Usecase_PageAction.clickOutputResource(driver);
		//AWSOutputPageAction.clickResource(driver);
		//String demo=dnPU.getPU_output_outputJson();
		//System.out.println(demo);
		Philips_Usecase_PageAction.enterOutputJson(driver,dnPU.getPU_output_outputJson());
		////
	}
	
	@And("^User dragdrop route2 and enter attribute for PU$")
	public void User_dragdrop_route2_and_enter_attribute_for_PU() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSRoutePageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRoutePageObject.route_resource);
		CommonFunctionalityPageAction.enterResourceName(driver,dnPU.getPU_dmz_route_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRoutePageAction.enterDestn_cidr(driver,dnPU.getPU_dmz_route_destn_cidr());
		AWSRoutePageAction.enterRouteTableId(driver,dnPU.getPU_dmz_routeTable_id());
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnPU.getPU_dmz_route_depends_on());
		AWSRoutePageAction.entervpcpeering(driver,dnPU.getPU_dmz_route_vpc_peering_conn_id());
		//
	}
	
}
