/*package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWS_Instance_PageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.GCE_Support_PageAction;
import com.opex.test.pageobjects.AWS_Instance_PageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.GCE_Support_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GCE_Support_SD extends SuperUsedDefinition{
	
	public GCE_Support_SD()
	{
		super();
	}
     
	
	@When("^User select gce Instance resource to the environment$")
	public void user_select_gce_Instance_resource_to_the_environment() throws Throwable{
		PageFactory.initElements(driver,GCE_Support_page.class);
		
		GCE_Support_PageAction.selectGceInstance(driver);
	}
	@Then("^User enter the gce resource name for Instance$")
	public void u_enter_the_gce_resource_name_for_Instance() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,GCE_Support_page.class);
		String name=support.getGce_instance_name();
		GCE_Support_PageAction.enterGceInstanceName(driver,name);
	}
	
	@Then("^User click on gce Instance resource$")
	public void user_click_on_gce_Instance_resource() throws Throwable{
		
		PageFactory.initElements(driver,GCE_Support_page.class);
		String name=support.getGce_instance_name();
		GCE_Support_PageAction.clickResourceGceInstance(driver,name);
	}
	@When("^User click save button on pop up for Gce Instance resource$")
	public void user_click_save_button_on_pop_up_for_Gce_Instance_resource() throws Throwable {

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceNameEditSaveBtn(driver);

	}
	@And("^I fill the disk details$")
	public void I_fill_the_disk_details() throws Exception
	{
		PageFactory.initElements(driver,GCE_Support_page.class);
		String disk=support.getDisk();
		GCE_Support_PageAction.enterdisk(driver, disk);
	}
	
	@And("^I fill the zone details$")
	public void I_fill_the_zone_details() throws Exception
	{
		PageFactory.initElements(driver,GCE_Support_page.class);
		String zone=support.getZone();
		GCE_Support_PageAction.enterzone(driver, zone);
	}
	@And("^I fill the machine details$")
	public void I_fill_the_machine_details() throws Exception
	{
		PageFactory.initElements(driver,GCE_Support_page.class);
		String type=support.getMachine_type();
		GCE_Support_PageAction.enterMachineType(driver, type);
	}
	@And("^I fill the network details$")
	public void I_fill_the_network_details() throws Exception
	{
		PageFactory.initElements(driver,GCE_Support_page.class);
		String network=support.getNetwork_interface();
		GCE_Support_PageAction.enterNetworkInterface(driver, network);
	}
	@Then("^Add a package to gce instance$")
	public void Add_a_package_to_gce_instance()
	{
		PageFactory.initElements(driver, GCE_Support_page.class);
		String instancename=support.getGce_instance_name();
		GCE_Support_PageAction.packageAddToGceInstance(driver, instancename);
	}
	
	@When("^User select input variable Instance resource to the environment$")
	public void user_select_input_variable_Instance_resource_to_the_environment() throws Throwable{
		PageFactory.initElements(driver,GCE_Support_page.class);
		
		GCE_Support_PageAction.selectInputVariableResource(driver);
	}
	@When("^User select output variable Instance resource to the environment$")
	public void user_select_output_variable_Instance_resource_to_the_environment() throws Throwable{
		PageFactory.initElements(driver,GCE_Support_page.class);
		
		GCE_Support_PageAction.selectOutputVariableResource(driver);
	}
	@When("^I fill the host for existing virtual resource$")
	public void I_fill_the_host_for_existing_virtual_resource() throws Throwable{
		PageFactory.initElements(driver,GCE_Support_page.class);
		String host=virtual.getHost();
		GCE_Support_PageAction.enterHost(driver, host);
	}
     
	@When("^User select Existing Vm resource to the environment$")
	public void user_select_Existing_Vm_resource_to_the_environment() throws Throwable{
		PageFactory.initElements(driver,GCE_Support_page.class);
		
		GCE_Support_PageAction.selectExistingVmResource(driver);
	}
	@Then("^User click on Existing Vm resource$")
	public void user_click_on_Existing_Vm_resource() throws Throwable{
		
		PageFactory.initElements(driver,GCE_Support_page.class);
		String name=virtual.getVirtual_name();
		GCE_Support_PageAction.clickExistingVmResource(driver,name);
	}
	@Then("^User enter the Existing Vm Resource$")
	public void u_enter_the_Existing_Vm_Resource() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,GCE_Support_page.class);
		String name=virtual.getVirtual_name();
		GCE_Support_PageAction.enterExistingVmResourceName(driver, name);
	}
}

*/