package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSExecutescriptpkgPageAction;
import com.opex.test.modules.AWSInstancePageAction;
import com.opex.test.modules.AWSKeyPairPageAction;
import com.opex.test.modules.AWSSecurityGroupPageAction;
import com.opex.test.modules.AWSTomcatPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSExecutescriptpkgPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSKeyPairPageObject;
import com.opex.test.pageobjects.AWSSecuritygroupPageObject;
import com.opex.test.pageobjects.AWSTomcatPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSTomcatSD extends SuperUsedDefinition{
	
	public AWSTomcatSD()
	{
		super();
	}
	
	@When("^i search and click on environment which is created by using AWS provider for tomcat install$")
	public void i_search_and_click_on_environment_which_is_created_by_using_AWS_provider_for_tomcat_install() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSTomcatSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}

	@Then("^i enter the resource name of Key Pair for tomcat$")
	public void i_enter_the_resource_name_of_Key_Pair_for_tomcat() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String Rname=dntomcat_install.getTomcatKey_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		CommonFunctionalityPageAction.enterResourceName(driver,Resource );
	}

	@Then("^i click on key pair resource for tomcat$")
	public void i_click_on_key_pair_resource_for_tomcat() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String Rname=dntomcat_install.getTomcatKey_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		CommonFunctionalityPageAction.clickOnResource(driver,Resource);
	}

	@Then("^i fill the key name for tomcat$")
	public void i_fill_the_key_name_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSKeyPairPageObject.class);
		String Rname=dntomcat_install.getTomcatKey_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		AWSKeyPairPageAction.enterKeyName(driver,Resource);
	}

	@Then("^i fill the public key for tomcat$")
	public void i_fill_the_public_key_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSKeyPairPageObject.class);
		AWSKeyPairPageAction.enterPublicKey(driver,dnKeyPair.getPublic_key());
		
	}

	@Then("^i enter resource name of security group for tomcat$")
	public void i_enter_resource_name_of_security_group_for_tomcat() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String Rname=dntomcat_install.getTomcat_security_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		CommonFunctionalityPageAction.enterResourceName(driver, Resource);
	}

	@Then("^i enter ingress value of security_group for tomcat$")
	public void i_enter_ingress_value_of_security_group_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class); 
		PageFactory.initElements(driver,  AWSSecuritygroupPageObject.class);
		AWSSecurityGroupPageAction.clickoningress(driver,dnsecurity.getsecurity_ingress());
	}

	@Then("^i enter the instance resource name for tomcat$")
	public void i_enter_the_instance_resource_name_for_tomcat() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String Rname=dntomcat_install.getTomcat_instance_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		CommonFunctionalityPageAction.enterResourceName(driver,Resource );
	}

	@When("^i fill the ami attribute for tomcat$")
	public void i_fill_the_ami_attribute_for_tomcat() throws Throwable {
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		PageFactory.initElements(driver, AWSExecutescriptpkgPageObject.class);
		AWSExecutescriptpkgPageAction.enter_Ami(driver);
	}

	/*@When("^i fill the instance type attribute for tomcat$")
	public void i_fill_the_instance_type_attribute_for_tomcat() throws Throwable {
		PageFactory.initElements(driver, AWS_Instance_PageObject.class);
		AWS_Instance_PageAction.enterInstanceAttributeInstanceType(driver);
	}

	@When("^i fill the availability zone attribute for tomcat$")
	public void i_fill_the_availability_zone_attribute_for_tomcat() throws Throwable {
		PageFactory.initElements(driver, AWS_Instance_PageObject.class);
		AWS_Instance_PageAction.enterAvailabilityZone(driver);
	}*/

	@Then("^i entered keyname for tomcat$")
	public void i_entered_keyname_for_tomcat() throws Throwable {
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		PageFactory.initElements(driver,AWSExecutescriptpkgPageObject.class);
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		String Rname=dntomcat_install.getTomcatKey_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		String instance_keyname = "${'"+Resource+"'.key_name}";
		AWSTomcatPageAction.enterinstance_keyname(driver,instance_keyname);
	}

	@Then("^i entered vpc_security_group_ids for tomcat$")
	public void i_entered_vpc_security_group_ids_for_tomcat() throws Throwable {
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		String Rname=dntomcat_install.getTomcat_security_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		String vpc_sec_id = "${'"+Resource+"'.id}";
		AWSTomcatPageAction.entervpcsec_keyname(driver,vpc_sec_id);
	}

	@Then("^i drag drop tomcat package on instance resource$")
	public void i_drag_drop_tomcat_package_on_instance_resource() throws Throwable {
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.tomcatDragDrop(driver);
	}

	@Then("^i click on instance resource for tomcat$")
	public void i_click_on_instance_resource_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String Rname=dntomcat_install.getTomcat_instance_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		CommonFunctionalityPageAction.clickOnResource(driver,Resource);
		//AWS_tomcat_PageAction.clickResourceInstance(driver);
		
	}
	@Then("^I click on tomcat install package link$")
	public void I_click_on_tomcat_install_package_link() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.clicktomcat_link(driver);
		
	}

	@Then("^i check base_version for tomcat$")
	public void i_check_base_version_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.checkbase_version(driver);
	}

	@Then("^i check deploy_manager_apps value for tomcat$")
	public void i_check_deploy_manager_apps_value_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.check_deploy_manager_apps(driver);
	}

	@Then("^i check port for tomcat$")
	public void i_check_port_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.check_port(driver);
	}

	@Then("^i check run_base_instance for tomcat$")
	public void i_check_run_base_instance_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.check_run_base_instance(driver);
	}

	@Then("^i check shutdown_port for tomcat$")
	public void i_check_shutdown_port_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.check_shutdown_port(driver);
	}

	@Then("^i check ssl_max_threads for tomcat$")
	public void i_check_ssl_max_threads_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.check_ssl_max_threads(driver);
	}

	@Then("^i check ssl_port for tomcat$")
	public void i_check_ssl_port_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.check_ssl_port(driver);
	}

	@Then("^i check tomcat_auth for tomcat$")
	public void i_check_tomcat_auth_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.check_tomcat_auth(driver);
	}

	@Then("^i check use_security_manager for tomcat$")
	public void i_check_use_security_manager_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.check_use_security_manager(driver);
	}
	@Then("^i select connection for tomcat$")
	public void i_select_connection_for_tomcat() throws Throwable {
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		AWSTomcatPageAction.check_use_security_manager(driver);
	}
	
	@Then("^i delete the created environment for tomcat$")
	public void i_delete_the_created_environment_for_tomcat() throws Throwable {
		String className = AWSTomcatSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		//EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}

}
