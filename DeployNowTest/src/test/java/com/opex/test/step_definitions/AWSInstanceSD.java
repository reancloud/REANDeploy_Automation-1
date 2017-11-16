package com.opex.test.step_definitions;



import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSInstancePageAction;
import com.opex.test.modules.AWSSecurityGroupPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;

import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSSecuritygroupPageObject;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSInstanceSD extends SuperUsedDefinition{

	public AWSInstanceSD()
	{
		super();
	}

	
	@Then("^User create or search an environment for Instance and see message as environment created successfully$")
	public void user_create_or_search_an_environment_for_Instance() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);	
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, dnInstance.getInstance_envname());
	
	}
	
	@Then("^User delete the environment for Instance and see message environment deleted successfully$")
	public void user_delete_the_environment_for_Instance() throws Throwable {
	
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,dnInstance.getInstance_envname());
	}

	@Then("^User search and delete environment for Instance$")
	public void user_search_destroy_and_delete_environment_for_Instance() throws Throwable {
		EnvironmentPageAction.resetEnvironment(driver, dnInstance.getInstance_envname(), false);
	}
	
	@When("^User click VPC resource and drag on the dashboard for Instance$")
	public void user_click_VPC_resource_and_drag_on_the_dashboard_for_Instance() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
        PageFactory.initElements(driver, AWSVpcPage.class);
        PageFactory.initElements(driver, CommonFunctionalityPage.class);
        CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
        CommonFunctionalityPageAction.enterResourceName(driver,dnInstance.getInstanceVpc_rname());
        CommonFunctionalityPageAction.resourceCreateBtn(driver);
        CommonFunctionalityPageAction.clickOnResource(driver, dnInstance.getInstanceVpc_rname());
        AWSVpcPageAction.vpcCidrBlock(driver, dnInstance.getInstanceVpc_cidr());
        CommonFunctionalityPageAction.saveResource(driver);
	}
	
	@When("^User dragdrop subnet and enter attribute for Instance$")
	public void User_dragdrop_subnet_and_enter_attribute_for_Instance() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
		CommonFunctionalityPageAction.enterResourceName(driver,dnInstance.getInstanceSubnet_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnInstance.getInstanceSubnet_cidr(),dnInstance.getInstanceSubnet_vpcid(),"","","");
		CommonFunctionalityPageAction.saveResource(driver);
	}
	@When("^User dragdrop security group and enter attribute for Instance$")
	public void User_dragdrop_security_group_and_enter_attribute_for_Instance() throws Throwable {
		
		PageFactory.initElements(driver,AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSInstancePageObject.class);
		PageFactory.initElements(driver,AWSNetworkACLPageObject.class);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnInstance.getInstanceSg_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInstancePageAction.enterIngressForSG(driver);
		AWSSecurityGroupPageAction.security_vpc_id(driver, dnInstance.getInstanceSg_vpcid());
		CommonFunctionalityPageAction.saveResource(driver);
	}
	
	@When("^User click Instance resource and drag on the dashboard$")
	public void user_select_Instance_resource_to_the_environment() throws Throwable{
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,AWSInstancePageObject.class);
		AWSInstancePageAction.selectInstance(driver);
	}

	
	@And("^User enter the resource name for Instance$")
	public void user_enter_the_resource_name_for_Instance() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnInstance.getInstance_rname());
	}
	/*@And("^User enter the resource name as a blank for Instance$")
	public void user_enter_the_resource_name_as_a_Blank_for_Instance() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceNameblank(driver,dnInstance.getInstance_rname());
	}*/
	
	@And("^User enter the Instance resource name as blank$")
	public void user_enter_the_Instance_resource_name_as_blank() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceNameblank(driver,dnInstance.getInstance_rname());
		
	}
	
	@When("^User delete the resource by clicking the cross button on resource for Instance$")
	public void user_delete_the_resource_by_clicking_the_cross_button_on_resource_for_Instance() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver, dnInstance.getInstance_rname());
		
	}



	@When("^User dont delete the resource by clicking the cross button on resource for Instance$")
	public void user_dont_delete_the_resource_by_clicking_the_cross_button_on_resource_for_Instance() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver, dnInstance.getInstance_rname());
		
	}
	
	
	
	@When("^User click on Instance resource$")
	public void user_click_on_the_Instance_resource() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnInstance.getInstance_rname());
	}

	@When("^User click the name text box to edit resource name \"(.*)\" for Instance$")
	public void user_click_the_name_text_box_to_edit_resource_name_for_Instance(String value) throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceNameEditTextBox(driver,value);
	}


	@And("^User fill connection from dropdown for Instance$")
	public void user_fill_connection_from_dropdown_for_Instance() throws Throwable{
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver, dnInstance.getInstance_connection());
	}
	
	@And("^User fill the ami attribute for Instance$")
	public void user_fill_the_ami_attribute_for_Instance()throws Throwable{

		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterAmi(driver,dnInstance.getAmi());
	}
	
	@And("^User fill the subnetid attribute for Instance$")
	public void user_fill_the_subnetid_attribute_for_Instance()throws Throwable{

		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterSubnetIdForInstance(driver, dnInstance.getInstanceSubnetId());
	}
	
	@And("^User fill the instance type attribute for Instance$")
	public void user_fill_the_instanceType_attribute_for_Instance()throws Throwable{

		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterInstanceAttributeInstanceType(driver,dnInstance.getInstance_type());
	}
	
	@And("^User fill the source dest check attribute for Instance$")
	public void user_fill_the_sourceDestCheck_attribute_for_Instance()throws Throwable{

		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterInstanceAttributeSourceDestCheck(driver,dnInstance.getResourceSourceDestCheck());
	}
	
	@And("^User fill the availability zone attribute for Instance$")
	public void user_fill_the_availability_zone_attribute_for_Instance()throws Throwable{

		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterAvailabilityZone(driver,dnInstance.getAvailabilityZone());
	}
	
	@And("^User fill the instance initiated attribute for Instance$")
	public void user_fill_the_instanceInitiated_attribute_for_Instance()throws Throwable{

		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterInstanceInitiated(driver,dnInstance.getInstanceInitiated());
	}
	
	@And("^User fill the vpc security group ids attribute for Instance$")
	public void user_fill_the_vpcSecurityGroupIds_attribute_for_Instance()throws Throwable{

		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterVpcSecurityGroupIds(driver,dnInstance.getVPCSecurityGroupsId());
	}
	
	@And("^User fill the security group attribute for Instance$")
	public void user_fill_the_SecurityGroup_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterSecurityGroups(driver, dnInstance.getSecurityGroups());
	}
	@And("^User fill the key name attribute for Instance$")
	public void user_fill_the_keyName_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterinstance_keyname(driver, dnInstance.getInstance_key_name());
				
	}
	
	@And("^User fill the associate public ip address for Instance$")
	public void user_fill_the_associate_public_ip_address_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterAssociatePublicIpAddress(driver, dnInstance.getInstanceAssociatePublicIp());
				
	}
	@And("^User fill the disable api termination attribute for Instance$")
	public void user_fill_the_disable_api_termination_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterDisableApiTermination(driver, dnInstance.getInstanceDisableApiTermination());
				
	}
	@And("^User fill the ebs block device attribute for Instance$")
	public void user_fill_the_ebs_block_device_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterEBSBlockDevice(driver, dnInstance.getEbsBlockService());
				
	}
	@And("^User fill the ebs optimized attribute for Instance$")
	public void user_fill_the_ebs_optimized_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterEbsOptimized(driver, dnInstance.getInstanceEbsOptimized());
				
	}
	@And("^User fill the ephemeral block device attribute for Instance$")
	public void user_fill_the_ephemeral_block_device_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterEphemeralBlockDevice(driver, dnInstance.getInstanceEphemeralBlockDevice());
				
	}
	@And("^User fill the iam instance profile attribute for Instance$")
	public void user_fill_iam_instance_profile_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterinstance_keyname(driver, dnInstance.getInstance_key_name());
				
	}
	@And("^User fill the monitoring attribute for Instance$")
	public void user_fill_the_monitoring_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterMonitoring(driver, dnInstance.getInstanceMonitoring());
				
	}
	@And("^User fill the placement group attribute for Instance$")
	public void user_fill_the_placement_group_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterPlacementGroup(driver, dnInstance.getInstancePlacementGroup());
				
	}
	@And("^User fill the private ip attribute for Instance$")
	public void user_fill_the_private_ip_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterPrivateIp(driver, dnInstance.getInstancePrivateIp());
				
	}
	@And("^User fill the root block device attribute for Instance$")
	public void user_fill_the_root_block_device_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterRootBlockDevice(driver, dnInstance.getInstanceRootBlockDevice());
				
	}
	@And("^User fill the tags attribute for Instance$")
	public void user_fill_the_tags_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterTags(driver, dnInstance.getInstanceTags());
				
	}
	@And("^User fill the tenancy attribute for Instance$")
	public void user_fill_the_tenancy_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterTenancy(driver, dnInstance.getInstanceTenancy());
				
	}
	@And("^User fill the user data attribute for Instance$")
	public void user_fill_the_user_data_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterUserData(driver, dnInstance.getInstanceUserData());
				
	}
	
	@And("^User fill the false ami attribute for Instance$")
	public void user_fill_the_false_ami_attribute_for_Instance()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterAmifalse(driver, dnInstance.getEbsBlockService());
				
	}
}

