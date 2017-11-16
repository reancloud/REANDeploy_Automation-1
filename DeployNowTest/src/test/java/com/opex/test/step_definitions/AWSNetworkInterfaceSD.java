package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSEBSVolumePageAction;
import com.opex.test.modules.AWSNetworkInterfacePageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSEBSVolumePageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSNetworkInterfacePageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSNetworkInterfaceSD extends SuperUsedDefinition{

	public AWSNetworkInterfaceSD()
	{
		super();
	}
	
	@Then("^User create or search an environment for Network Interface and see message as environment created successfully$")
	public void user_create_or_search_an_environment_for_Network_Interface_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, AWSNetworkInterfaceSD.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSNetworkInterfaceSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}

	
	
	@Then("^User delete the environment for Network Interface and see message environment deleted successfully$")
	public void user_delete_the_environment_for_Network_Interface() throws Throwable {
		String className = AWSNetworkInterfaceSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
	
	@When("^User drag subnet resource and enter all the attribute values$")
	public void user_click_on_subnet_resource_and_enter_all_the_attribute_values() throws Throwable{
		
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnNetworkInterface.getNnetworkInterface_subnet_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver,dnNetworkInterface.getNnetworkInterface_subnet_rname());
		AWSSubnetPageAction.ResourcePassvariable(driver, dnNetworkInterface.getNetworkInterface_subnet_cidrBlock(), dnNetworkInterface.getNetworkInterface_subnet_VpcId(),dnNetworkInterface.getgetNnetworkInterface_depends_on(),dnNetworkInterface.getNetworkInterface_con(),dnNetworkInterface.getNetworkInterface_subnet_availabilityZone());
		//null,null, dnNetworkInterface.getNetworkInterface_subnet_availabilityZone(),null);
	    //CommonFunctionalityPageAction.saveResource(driver);
	}
	

	
	@When("^User drag VPC resource and enter all the attribute values$")
	public void user_click_on_VPC_resource_and_enter_all_the_attribute_values() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
        PageFactory.initElements(driver,AWSVpcPage.class);
       // AwsVpcPageAction
        PageFactory.initElements(driver,CommonFunctionalityPage.class);
    	CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
        CommonFunctionalityPageAction.enterResourceName(driver,dnNetworkInterface.getNnetworkInterface_vpc_rname());
        CommonFunctionalityPageAction.resourceCreateBtn(driver);
       // CommonFunctionalityPageAction.clickOnResource(driver,dnNetworkInterface.getNnetworkInterface_vpc_rname());
        AWSVpcPageAction.vpcCidrBlock(driver, dnNetworkInterface.getNetworkInterface_vpc_cidrBlock());
        //CommonFunctionalityPageAction.saveResource(driver);
	}
	
	@When("^User click Network Interface resource and drag on the dashboard$")
	public void user_select_Network_Interface_resource_to_the_environment() throws Throwable{
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,AWSNetworkInterfacePageObject.class);
		AWSNetworkInterfacePageAction.dragNDropNetInterface(driver);
	}
	@And("^User enter the resource name for Network Interface$")
	public void u_enter_the_resource_name_for_Network_Interface() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnNetworkInterface.getNnetworkInterface_rname());
	}
	
	@When("^User click on Network Interface resource$")
	public void user_click_on_the_Network_Interface_resource() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnNetworkInterface.getNnetworkInterface_rname());
		
	}
	@And("^User fill the private ips for Network Interface$")
	public void user_fill_the_private_ips_for_Network_Interface() throws Throwable{
		PageFactory.initElements(driver,AWSInstancePageObject.class);
		PageFactory.initElements(driver,AWSNetworkInterfacePageObject.class);
		AWSNetworkInterfacePageAction.enterPrivateIpsForNetInterface(driver,dnNetworkInterface.getNetworkInterface_private_ips());
	}
	
	@And("^User fill the subnet id for Network Interface$")
	public void user_fill_the_subnet_id_for_Network_Interface() throws Throwable{
		
		PageFactory.initElements(driver,AWSNetworkInterfacePageObject.class);
		AWSNetworkInterfacePageAction.enterSubnetIdForNetInterface(driver,dnNetworkInterface.getNetworkInterface_subnetId());
	}
	
	@And("^User fill the attachment for Network Interface$")
	public void user_fill_the_attachment_for_Network_Interface() throws Throwable{
		
		PageFactory.initElements(driver,AWSNetworkInterfacePageObject.class);
		AWSNetworkInterfacePageAction.enterAttachmentForNetInterface(driver,dnNetworkInterface.getNetworkInterface_attachement());
	}
	@And("^User fill the description for Network Interface$")
	public void user_fill_the_description_for_Network_Interface() throws Throwable{
		
		PageFactory.initElements(driver,AWSNetworkInterfacePageObject.class);
		AWSNetworkInterfacePageAction.enterDescriptionForNetInterface(driver,dnNetworkInterface.getNetworkInterface_description());
	}
	@And("^User fill the security groups for Network Interface$")
	public void user_fill_the_security_groups_for_Network_Interface() throws Throwable{
		
		PageFactory.initElements(driver,AWSNetworkInterfacePageObject.class);
		AWSNetworkInterfacePageAction.enterSecurityGroupsForNetInterface(driver,dnNetworkInterface.getNetworkInterface_security_groups());
	}
	@And("^User fill the source dest check for Network Interface$")
	public void user_fill_the_source_dest_check_for_Network_Interface() throws Throwable{
		
		PageFactory.initElements(driver,AWSNetworkInterfacePageObject.class);
		AWSNetworkInterfacePageAction.enterSourceDestCheckForNetInterface(driver,dnNetworkInterface.getNetworkInterface_source_dest_check());
	}
	@And("^User fill the tags for Network Interface$")
	public void user_fill_the_tags_for_Network_Interface() throws Throwable{
		
		PageFactory.initElements(driver,AWSNetworkInterfacePageObject.class);
		AWSNetworkInterfacePageAction.enterTagsForNetInterface(driver,dnNetworkInterface.getNetworkInterface_tags() );
	}

	@And("^User fill the invalid subnet id for Network Interface$")
	public void user_fill_the_invalid_subnet_id_for_Network_Interface() throws Throwable{
		
		PageFactory.initElements(driver,AWSNetworkInterfacePageObject.class);
		AWSNetworkInterfacePageAction.enterInvalidSubnetIdForNetInterface(driver,dnNetworkInterface.getNetworkInterface_con());
	}
	
	@And("^User fill the depends on for Network Interface$")
	public void user_fill_the_depends_on_for_Network_Interface() throws Throwable{
	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnNetworkInterface.getgetNnetworkInterface_depends_on() );
	}
	
	@And("^User fill the connection for Network Interface$")
	public void user_fill_the_connection_for_Network_Interface() throws Throwable{
	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver,dnNetworkInterface.getNetworkInterface_con() );
	}
}