package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSExecutescriptpkgPageAction;
import com.opex.test.modules.AWSInstancePageAction;
import com.opex.test.modules.AWSSecurityGroupPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSExecutescriptpkgPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSSecuritygroupPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSExecutescriptpkgSD extends SuperUsedDefinition{
	
	public AWSExecutescriptpkgSD(){
		super();
	}
	@When("^i search and click on environment which is created by using AWS provider for execute script$")
	public void i_search_and_click_on_environment_which_is_created_by_using_AWS_provider_for_execute_script() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSExecutescriptpkgSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	
	}
	
	@Then("^i enter the resource name for Instance$")
	public void i_enter_the_resoAWS_Instance_SDurce_name_for_Instance() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSExecutescriptpkgPageObject.class);
		AWSExecutescriptpkgPageAction.enterInstanceName(driver);
	}
	
	@Then("^i click on instance resource for execute script$")
	public void i_click_on_instance_resource_for_execute_script() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSExecutescriptpkgPageObject.class);
		AWSExecutescriptpkgPageAction.clickResourceInstance(driver);
	}
	
	@When("^User dragdrop security group for execute script$")
	public void User_dragdrop_security_group_for_execute_script() throws Throwable {
		
		PageFactory.initElements(driver,AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSInstancePageObject.class);
		PageFactory.initElements(driver,AWSNetworkACLPageObject.class);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
		
	}
	
	@Then("^i click on security group resource$")
	public void i_click_on_security_group_resource() throws Throwable {
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,AWSExecutescriptpkgPageObject.class);
		AWSExecutescriptpkgPageAction.clickResourceSecurityGroup(driver);
	}
	
	@Then("^i enter resource name of security group for executescript$")
	public void i_enter_resource_name_of_security_group_for_executescript() throws Throwable {
		PageFactory.initElements(driver, AWSExecutescriptpkgPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSExecutescriptpkgPageAction.Entersecurityname(driver);   
	}

	@Then("^i enter egress value of security_group$")
	public void i_enter_egress_value_of_security_group() throws Throwable {
		PageFactory.initElements(driver, AWSExecutescriptpkgPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
		AWSExecutescriptpkgPageAction.clickon_egress(driver);
	}

	@Then("^i enter ingress value of security_group$")
	public void i_enter_ingress_value_of_security_group() throws Throwable {
		PageFactory.initElements(driver, AWSExecutescriptpkgPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
		AWSExecutescriptpkgPageAction.clickon_ingress(driver);
	}

	@When("^i fill the ami attribute for execute script$")
	public void i_fill_the_ami_attribute_for_execute_script() throws Throwable {
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterAmi(driver,dnInstance.getAmi());
	}
	
	@And("^User fill connection from dropdown$")
	public void user_fill_connection_from_dropdown_for_Instance() throws Throwable{
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String connectionName="Auto_new";
		AWSExecutescriptpkgPageAction.selectConnection(driver,connectionName);
	}

	@When("^i fill the instance type attribute for execute script$")
	public void i_fill_the_instance_type_attribute_for_execute_script() throws Throwable {
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		PageFactory.initElements(driver, AWSExecutescriptpkgPageObject.class);
		AWSInstancePageAction.enterInstanceAttributeInstanceType(driver,dnInstance.getInstance_type());
	}

	@Then("^i entered keyname for execute script$")
	public void i_entered_keyname_for_execute_script() throws Throwable {
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		PageFactory.initElements(driver, AWSExecutescriptpkgPageObject.class);
		AWSExecutescriptpkgPageAction.enterinstance_keyname(driver);
	}

	@Then("^i entered vpc_security_group_ids for execute script$")
	public void i_entered_vpc_security_group_ids_for_execute_script() throws Throwable {
		PageFactory.initElements(driver, AWSExecutescriptpkgPageObject.class);
		AWSExecutescriptpkgPageAction.enterVpcSecurityGroupIds(driver);
	}

	@Then("^i drag drop executescript package on instance resource$")
	public void i_drag_drop_executescript_package_on_instance_resource() throws Throwable {
		PageFactory.initElements(driver, AWSExecutescriptpkgPageObject.class);
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSExecutescriptpkgPageAction.executescriptDragDrop(driver);
		
	}

	@Then("^i click on executescript link and set array for inline attribute$")
	public void i_click_on_executescript_link_and_set_array_for_inline_attribute() throws Throwable {
		PageFactory.initElements(driver, AWSExecutescriptpkgPageObject.class);
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSExecutescriptpkgPageAction.executescriptclick_setinline(driver);
	}

	@Then("^i delete the created environment for executescript$")
	public void i_delete_the_created_environment_for_executescript() throws Throwable {
		String className = AWSExecutescriptpkgSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
}