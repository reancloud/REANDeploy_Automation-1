package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSJavaPageAction;
import com.opex.test.modules.AWSKeyPairPageAction;
import com.opex.test.modules.AWSTomcatPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSExecutescriptpkgPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSJavaPageObject;
import com.opex.test.pageobjects.AWSKeyPairPageObject;
import com.opex.test.pageobjects.AWSTomcatPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSJavaSD extends SuperUsedDefinition{
	
	public AWSJavaSD()
	{
		super();
	}
	
	@When("^i search and click on environment which is created by using AWS provider for java$")
	public void i_search_and_click_on_environment_which_is_created_by_using_AWS_provider_for_java() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSJavaSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}

	@Then("^i enter the resource name of Key Pair for java$")
	public void i_enter_the_resource_name_of_Key_Pair_for_java() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String Rname=dnjava_install.getjavaKey_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		CommonFunctionalityPageAction.enterResourceName(driver,Resource );
	}

	@Then("^i click on key pair resource for java$")
	public void i_click_on_key_pair_resource_for_java() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String Rname=dnjava_install.getjavaKey_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		CommonFunctionalityPageAction.clickOnResource(driver,Resource);
	}

	@Then("^i fill the key name for java$")
	public void i_fill_the_key_name_for_java() throws Throwable {
		PageFactory.initElements(driver,AWSKeyPairPageObject.class);
		String Rname=dnjava_install.getjavaKey_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		AWSKeyPairPageAction.enterKeyName(driver,Resource);
	}

	@Then("^i enter resource name of security group for java$")
	public void i_enter_resource_name_of_security_group_for_java() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String Rname=dnjava_install.getjava_security_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		CommonFunctionalityPageAction.enterResourceName(driver, Resource);
	}

	@Then("^i enter the instance resource name for java$")
	public void i_enter_the_instance_resource_name_for_java() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String Rname=dnjava_install.getjava_instance_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		CommonFunctionalityPageAction.enterResourceName(driver,Resource );
	}

	@Then("^i entered keyname for java$")
	public void i_entered_keyname_for_java() throws Throwable {
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		PageFactory.initElements(driver,AWSExecutescriptpkgPageObject.class);
		PageFactory.initElements(driver,AWSTomcatPageObject.class);
		String Rname=dnjava_install.getjavaKey_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		String instance_keyname = "${"+Resource+".key_name}";
		AWSTomcatPageAction.enterinstance_keyname(driver,instance_keyname);
	}

	@Then("^i entered vpc_security_group_ids for java$")
	public void i_entered_vpc_security_group_ids_for_java() throws Throwable {
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		String Rname=dnjava_install.getjava_security_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		String vpc_sec_id = "${"+Resource+".id}";
		AWSTomcatPageAction.entervpcsec_keyname(driver,vpc_sec_id);
	}

	@Then("^i drag drop java package on instance resource$")
	public void i_drag_drop_java_package_on_instance_resource() throws Throwable {
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		AWSJavaPageAction.javaDragDrop(driver);
	}

	@Then("^i click on instance resource for java$")
	public void i_click_on_instance_resource_for_java() throws Throwable {
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		String Rname=dnjava_install.getjava_instance_name();
		String Resource = dnowCommanfun.getResource_name()+Rname;
		CommonFunctionalityPageAction.clickOnResource(driver,Resource);
	}

	@Then("^I click on java install package link$")
	public void i_click_on_java_install_package_link() throws Throwable {
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		AWSJavaPageAction.clickjava_link(driver);
	}

	@Then("^i check accept_license_agreement for java$")
	public void i_check_accept_license_agreement_for_java() throws Throwable {
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		AWSJavaPageAction.checkaccept_licence(driver);
	}

	@Then("^i check alternatives_priority for java$")
	public void i_check_alternatives_priority_for_java() throws Throwable {
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		AWSJavaPageAction.checkalternatives_priority(driver);
	}

	@Then("^i check jdk_version for java$")
	public void i_check_jdk_version_for_java() throws Throwable {
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		AWSJavaPageAction.checkjdk_version(driver);
	}

	@Then("^i check openjdk_version for java$")
	public void i_check_openjdk_version_for_java() throws Throwable {
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		AWSJavaPageAction.checkopenjdk_version(driver,dnjava_install.getjava_openjdk_version());
	}

	@Then("^i check reset_alternatives for java$")
	public void i_check_reset_alternatives_for_java() throws Throwable {
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		AWSJavaPageAction.checkreset_alternatives(driver);
	    	}

	@Then("^i check set_default for java$")
	public void i_check_set_default_for_java() throws Throwable {
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		AWSJavaPageAction.checkset_default(driver);
	}

	@Then("^i check set_etc_environment for java$")
	public void i_check_set_etc_environment_for_java() throws Throwable {
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		AWSJavaPageAction.checkset_etc_environment(driver);
	}

	@Then("^i check use_alt_suffix for java$")
	public void i_check_use_alt_suffix_for_java() throws Throwable {
		PageFactory.initElements(driver,AWSJavaPageObject.class);
		AWSJavaPageAction.checkuse_alt_suffix(driver);
	   
	}
	@Then("^i delete the created environment for java$")
	public void i_delete_the_created_environment_for_java() throws Throwable {
		String className = AWSJavaSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		//EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	   
	}
	

}
