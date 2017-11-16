package com.opex.test.step_definitions;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSSubnetGroupPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.SignInAction;
import com.opex.test.pageobjects.AWSEBSVolumePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSSubnetgroupPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.AWSRoute53ZonePageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSSubnetgroupSD extends SuperUsedDefinition {

	public AWSSubnetgroupSD()
	{
		super();  	
	}

	
	@Then("^User search or create environment for SubnetGroup and see message as environment created successfully$")
	public void User_search_or_create_environment_for_SubnetGroup_and_see_message_as_environment_created_successfully() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSSubnetgroupSD.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		String className = AWSSubnetgroupSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
		
	}
	@Then("^User drag drop VPC resource and fill all the attribute values for subnetgroup$")
	public void User_drag_drop_VPC_resource_and_fill_all_the_attribute_values_for_subnetgroup() throws Throwable 
	{
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnSubnetGroup.getSubnetGroup_vpc_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSVpcPageAction.vpcCidrBlock(driver,dnSubnetGroup.getSubnetGroup_vpc_cidrBlock());
	}
	@Then("^User drag drop subnet resource and fill all the attribute values for subnetgroup$")
	public void User_drag_drop_subnet_resource_and_fill_all_the_attribute_values_for_subnetgroup() throws Throwable 
	{
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnSubnetGroup.getSubnetGroup_subnet1_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver,dnSubnetGroup.getSubnetGroup_subnet1_rname());
		AWSSubnetPageAction.ResourcePassvariable(driver, dnSubnetGroup.getSubnetGroup_subnet1_cidrBlock(), dnSubnetGroup.getSubnetGroup_subnet1_VpcId()," ", " ", dnSubnetGroup.getSubnetGroup_subnet1_availabilityZone());
	}
	@Then("^User again drag drop subnet resource and fill all the attribute values for subnetgroup$")
	public void User_again_drag_drop_subnet_resource_and_fill_all_the_attribute_values_for_subnetgroup() throws Throwable 
	{
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnSubnetGroup.getSubnetGroup_subnet2_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver, dnSubnetGroup.getSubnetGroup_subnet2_cidrBlock(), dnSubnetGroup.getSubnetGroup_subnet2_VpcId()," ", " ", dnSubnetGroup.getSubnetGroup_subnet2_availabilityZone());
	}

	@Then("^User delete subnetgroup environment and see message environment deleted sucessfully$")
	public void User_delete_subnetgroup_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {

		String className = AWSSubnetgroupSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	@When("^User click SubnetGroup resource and drag on the dashboard$")
	public void User_click_SubnetGroup_resource_and_drag_on_the_dashboard() throws Throwable {
		
		PageFactory.initElements(driver, AWSSubnetgroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetGroupPageAction.Dragdropsubnetgroup(driver);
	}

	@And("^User enter SubnetGroup resource name$")
	public void User_enter_SubnetGroup_resource_name() throws Throwable {
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnSubnetGroup.getSubnetGroup_rname());
	}
	
	@Then("^User click deploy button without providing the mandatory fields for Subnet group and should see message environment deployed successfully$")
	public void User_click_deploy_button_without_providing_the_mandatory_fields_for_Subnet_group() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetGroupPageAction.deploy(driver);
		
	}

	@When("^User click on subnetgroup resource$")
	public void User_click_on_subnetgroup_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnSubnetGroup.getSubnetGroup_rname());
	}
	@And("User enter description for subnetgroup$")
	public void User_enter_description_for_subnetgroup() throws Throwable {
	
		PageFactory.initElements(driver,  AWSSubnetgroupPageObject.class);
		AWSSubnetGroupPageAction.enterDescriptionForSubnetGroup(driver, dnSubnetGroup.getSubnetGroup_description());
	}
	
	@And("User enter subnetId for subnetgroup$")
	public void User_enter_subnetId_for_subnetgroup() throws Throwable {
	
		PageFactory.initElements(driver,  AWSSubnetgroupPageObject.class);
		
		AWSSubnetGroupPageAction.enterSubnetIdForSubnetGroup(driver, dnSubnetGroup.getSubnetGroup_subnetId());
	}
	
	@Then("^User enter blank subnetgroup resource name$")
	public void user_enter_blank_subnetgroup_resource_name() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnSubnetGroup.getSubnetGroup_blankData());
	}
	@Then("^User enter blank attribute values under for subnetgroup$")
	public void User_enter_blank_attribute_values_under_for_subnetgroup() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetGroupPageAction.enterDescriptionForSubnetGroup(driver," ");

	}
	@Then("^User click on cross and click on please delete it button on subnetgroup$")
	public void user_click_on_cross_and_click_on_please_delete_it_button_on_subnetgroup() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetgroupPageObject.class);
	   	PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dnSubnetGroup.getSubnetGroup_rname());
	}
	@Then("^User click on cross and click on please dont delete it button on subnetgroup$")
    public void User_click_on_cross_and_click_on_please_dont_delete_it_button_on_subnetgroup() throws Throwable {
   	 PageFactory.initElements(driver, AWSSubnetgroupPageObject.class);
   	 PageFactory.initElements(driver, CommonFunctionalityPage.class);
	 CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnSubnetGroup.getSubnetGroup_rname());
    }
}



