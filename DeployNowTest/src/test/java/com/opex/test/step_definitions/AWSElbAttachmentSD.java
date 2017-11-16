package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.entity.ELBAttachmentAttributes;
import com.opex.test.modules.AWSELBPageAction;
import com.opex.test.modules.AWSElbAttachmentPageAction;
import com.opex.test.modules.AWSInstancePageAction;
import com.opex.test.modules.AWSInternetGatewayPageAction;
import com.opex.test.modules.AWSRouteTableAssnPageAction;
import com.opex.test.modules.AWSRouteTablePageAction;
import com.opex.test.modules.AWSSecurityGroupPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSEipPage;
import com.opex.test.pageobjects.AWSElbAttachmentPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSRouteTableAssnPageObject;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.AWSSecuritygroupPageObject;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.commands.GetText;
import com.thoughtworks.selenium.webdriven.commands.SeleniumSelect;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSElbAttachmentSD extends SuperUsedDefinition{
	
	public AWSElbAttachmentSD(){
		super();
	}
	
	//to search or create environment
	
  @Then("^User search or create environment for elb Attachment and see message as environment created successfully$")
   public void user_search_or_create_environment_for_elb_Attachment_and_see_message_as_environment_created_successfully() throws Throwable {
    PageFactory.initElements(driver,AWSElbAttachmentPageObject.class);
    PageFactory.initElements(driver,EnvironmentPage.class);
	PageFactory.initElements(driver,CommonFunctionalityPage.class);
	String className = AWSElbAttachmentSD.class.getSimpleName();
	String env_name = dnowEnv.getEnv_name()+className;
	EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
   }
  
  //to delete ELBA environment
  @Then("^User delete elb Attachment environment and see message environment deleted successfully$")
	public void user_delete_elb_attachment_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSElbAttachmentSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
	
	
   @Then("^User dragdrop vpc and enter attribute for elbAttachment$")
   public void User_dragdrop_vpc_and_enter_attribute_for_elb() throws Throwable {
	PageFactory.initElements(driver,EnvironmentPage.class);
	PageFactory.initElements(driver, AWSVpcPage.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
	CommonFunctionalityPageAction.enterResourceName(driver,dnElbA.getElba_vpc_Rname());
	CommonFunctionalityPageAction.resourceCreateBtn(driver);
	CommonFunctionalityPageAction.clickOnResource(driver,dnElbA.getElba_vpc_Rname());
	AWSVpcPageAction.vpcCidrBlock(driver,dnElbA.getElba_vpc_cidrblock());
}
   
   @Then("^User dragdrop subnet and enter attribute for elbAttachment$")
   public void User_dragdrop_subnet_and_enter_attribute_for_elbAttachment() throws Throwable {
       PageFactory.initElements(driver, AWSSubnetPageObject.class);
       PageFactory.initElements(driver, EnvironmentPage.class);
       PageFactory.initElements(driver, CommonFunctionalityPage.class);
       CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
       CommonFunctionalityPageAction.enterResourceName(driver, dnElbA.getElba_subnet_Rname());
       CommonFunctionalityPageAction.resourceCreateBtn(driver);
       AWSSubnetPageAction.ResourcePassvariable(driver, dnElbA.getElba_subnet_cidrblock(), dnElbA.getElba_subnet_vpcId(),"","","");
       
   }
   
   @Then("^User dragdrop routetable and enter attribute for elbAttachment$")
	public void User_dragdrop_routetable_and_enter_attribute_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElbA.getElba_routetable_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver,dnElbA.getElba_routetable_vpcId());
		AWSRouteTablePageAction.enterRouteJson(driver, dnElbA.getElba_routetable_route());
	}
   
   @Then("^User dragdrop igw and enter attribute for elbAttachment$")
   public void user_dragdrop_igw_and_enter_attribute_for_elbAttachment() throws Throwable {
	    PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSInternetGatewayPageAction.selectIGW(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElbA.getElba_igw_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver,dnElbA.getElba_igw_vpcId());
   }

   @Then("^User dragdrop RTA and enter attribute for elbAttachment$")
   public void user_dragdrop_RTA_and_enter_attribute_for_elbAttachment() throws Throwable {
	    PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElbA.getElba_rta_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnElbA.getElba_rta_routetable_id());
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnElbA.getElba_rta_subnet_id());
   }
   

   @Then("^User dragdrop ELB and enter attribute for elbAttachment$")
   public void user_dragdrop_ELB_and_enter_attribute_for_elbAttachment() throws Throwable {
	PageFactory.initElements(driver, AWSELBPageObject.class);
	PageFactory.initElements(driver, EnvironmentPage.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	AWSELBPageAction.ResourceDragDrop(driver);
	CommonFunctionalityPageAction.enterResourceName(driver,dnElbA.getElba_elb_Rname());
	CommonFunctionalityPageAction.resourceCreateBtn(driver);
	AWSELBPageAction.enterListnerJson(driver, dnElbA.getElba_elb_listener());
	//for subnet array
	CommonFunctionalityPageAction.setArrayCommon(driver,dnElbA.getElba_elb_subnets(), AWSELBPageObject.click_subnets_setArray,CommonFunctionalityPage.select_text_area_for_propagation,CommonFunctionalityPage.array_set_value);
	AWSELBPageAction.enterAccessLog(driver, dnElbA.getElba_elb_access_logs());
	AWSELBPageAction.crossZoneLodBalancing(driver, dnElbA.getElba_elb_cross_zone_load_balancing());
	AWSELBPageAction.healthCheck(driver, dnElbA.getElba_elb_health_check());
	AWSELBPageAction.idleTimeout(driver, dnElbA.getElba_elb_idle_timeout());
	AWSELBPageAction.instances(driver, dnElbA.getElba_elb_instances());
	AWSELBPageAction.internal(driver, dnElbA.getElba_elb_internal());
	AWSELBPageAction.securityGroups(driver, dnElbA.getElba_elb_security_groups());
	AWSELBPageAction.tags(driver, dnElbA.getElba_elb_tags());
	
   }
   
   @And("^User dragdrop security group and enter attribute for Instance elbAttachment$")
	public void User_dragdrop_security_group_and_enter_attribute_for_Instance() throws Throwable {
		
		PageFactory.initElements(driver,AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		PageFactory.initElements(driver,AWSElbAttachmentPageObject.class);
		PageFactory.initElements(driver,AWSNetworkACLPageObject.class);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElbA.getElba_sg_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSElbAttachmentPageAction.enterIngressForSG(driver);
		AWSSecurityGroupPageAction.security_vpc_id(driver, dnElbA.getElba_sg_vpcid());
		CommonFunctionalityPageAction.saveResource(driver);
	}
   
   //to drag and drop instance resource
   @Then("^User dragdrop instance and enter attribute for elbAttachment$") 
   public void user_dragdrop_instance_and_enter_attribute_for_elbAttachment()throws Throwable{
	    PageFactory.initElements(driver, AWSInstancePageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSInstancePageAction.selectInstance(driver);
		CommonFunctionalityPageAction.enterResourceName(driver, dnElbA.getElba_instance_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInstancePageAction.enterAmi(driver, dnElbA.getElba_ami());
		AWSInstancePageAction.enterInstanceAttributeInstanceType(driver, dnElbA.getElba_instance_type());
		AWSInstancePageAction.enterAssociatePublicIpAddress(driver, dnElbA.getElba_instance_associate_public_ip_address());
		AWSInstancePageAction.enterDisableApiTermination(driver, dnElbA.getElba_instance_disable_api_termination());
		AWSInstancePageAction.enterEBSBlockDevice(driver, dnElbA.getElba_instance_ebs_block_device());
		AWSInstancePageAction.enterEphemeralBlockDevice(driver, dnElbA.getElba_instance_ephemeral_block_device());
		AWSInstancePageAction.enterMonitoring(driver, dnElbA.getElba_instance_monitoring());
		AWSInstancePageAction.enterSubnetIdForInstance(driver, dnElbA.getElba_instance_subnet_id());
   }

   @When("^User click elbAttachment resource and drag on the dashboard$")
	public void User_click_elbAttachment_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSElbAttachmentPageObject.class);
		AWSElbAttachmentPageAction.resrcDragDrop(driver);  
	}
   
   @And("^User enter elbAttachment resource name$")
	public void User_enter_elb_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSElbAttachmentPageObject.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElbA.getElbas_rname()); 
		
   }
    
   @Then("^User fill the elb attribute for elb Attachment Resource$")
   	public void user_fill_the_elb_attribute_for_elb_Attachment_Resource() throws Throwable {
        PageFactory.initElements(driver, AWSElbAttachmentPageObject.class);
        AWSElbAttachmentPageAction.enterElb(driver,dnElbA.getElbas_elb());
   	}

   @Then("^User fill the instance attribute for elb Attachment Resource$")
   	public void user_fill_the_instance_attribute_for_elb_Attachment_Resource() throws Throwable {	
	   	PageFactory.initElements(driver, AWSElbAttachmentPageObject.class);
	   	AWSElbAttachmentPageAction.enterInstance(driver, dnElbA.getElbas_instance());
   	}

   @Then("^User fill the Depends on attribute for elb Attachment Resource$")		
   	public void user_fill_the_Depends_on_attribute_for_elb_Attachment_Resource() throws Throwable {
	   PageFactory.initElements(driver, AWSElbAttachmentPageObject.class);
	   PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnElbA.getElbas_dependson());

   }

   @Then("^User fill the connection attribute for elb Attachment Resource$")
   	public void user_fill_the_coonection_attribute_for_elb_Attachment_Resource() throws Throwable {
	   PageFactory.initElements(driver, AWSElbAttachmentPageObject.class);
	   PageFactory.initElements(driver, CommonFunctionalityPage.class);
	   CommonFunctionalityPageAction.selectConnection(driver, dnElbA.getElbas_connection());
		
   }

   
   @When("^User click on elbAttachment resource$")
	public void User_click_on_elb_resource() throws Throwable {
		PageFactory.initElements(driver,AWSElbAttachmentPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		//AWSElbAttachmentPageAction.clickOnResource(driver,dnElbA.getElbas_rname());
		CommonFunctionalityPageAction.clickOnResource(driver,dnElbA.getElbas_rname());
	}
    
   //method to display error message as resource name cannot be empty or resource with same name
   @Then("^click on create btn and displays error message$")
   public void click_on_create_btn_and_displays_error_message() throws InterruptedException{
		PageFactory.initElements(driver, AWSElbAttachmentPageObject.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
        CommonFunctionalityPageAction.resourceCreateBtn(driver);
   }

   @Then("^User enters the elb attribute for elb Attachment Resource as empty$")
  	public void User_enters_the_elb_attribute_for_elb_Attachment_Resource_as_empty() throws Throwable {
       PageFactory.initElements(driver, AWSElbAttachmentPageObject.class);
       AWSElbAttachmentPageAction.enterElb(driver,dnElbA.getElbas_dependson());
  	}
   
   //enters resource name blank in create pop up
   @And("^User enter elbAttachment resource name as empty$")
	public void User_enter_elb_resource_name_as_empty() throws Throwable {
		PageFactory.initElements(driver, AWSElbAttachmentPageObject.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElbA.getElbas_dependson()); 
		
   }
   
   //enters resource name same as existing resource in create pop up
   @Then("^User enter elbAttachment resource name as existing resource name$")
 	public void User_enter_elbAttachment_resource_name_as_existing_resource() throws Throwable {
	   PageFactory.initElements(driver, AWSElbAttachmentPageObject.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElbA.getElba_elb_Rname()); 
		
 	}

   //displays error message  elb attribute cannot be empty for elb attachment resource
   @Then("^User click deploy button and should see popup error message$")
   public void User_click_deploy_button_and_should_see_popup_error_message()throws Throwable{
	   PageFactory.initElements(driver, CommonFunctionalityPage.class);
	   AWSElbAttachmentPageAction.deploy(driver);
   }

	
	@When("^User click on elb Attachment resource$")
	public void user_click_on_the_Instance_resource() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnElbA.getElbas_rname());
	}

	//renames the resource with name given in "" 
	@When("^User click the name text box to edit elbaresource name \"(.*)\"$")
	public void user_click_the_name_text_box_to_edit_resource_name(String value) throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSElbAttachmentPageObject.class);
		CommonFunctionalityPageAction.resourceNameEditTextBox(driver,value);
	}
	
	//please delete button
	@And("^User click on please delete if resource need to be deleted for elba$")
	public void User_click_on_please_delete_if_resource_need_to_be_deleted_for_eip() throws Throwable {
		PageFactory.initElements(driver, AWSElbAttachmentPageObject.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dnElbA.getElbas_rname());
	}
	
	//dnt delete button
	@And("^User click on dont delete if resource need to be deleted for elba$")
	public void User_click_on_dont_delete_if_resource_need_to_be_deleted_for_elba() throws Throwable{
		PageFactory.initElements(driver, AWSElbAttachmentPageObject.class); 
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver, dnElbA.getElbas_rname());
		
	}
	
	//enter attribute name to be searched
	@Then("^User search for ELBA attributes in the resource details \"(.*)\"$")
	public void user_search_for_attributes_in_the_resource_details(String value) throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSElbAttachmentPageObject.class);
		AWSElbAttachmentPageAction.resourceDetailsAttributeSeachBar(driver,value);
	}
}
