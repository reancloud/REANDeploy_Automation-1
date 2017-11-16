/*package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.Auto_Scaling_Group_PageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.SshKeyGen_PageAction;
import com.opex.test.pageobjects.Auto_Scaling_Group_PageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.SshKeyGen_PageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SshKeyGen_SD extends SuperUsedDefinition {
	
	
	public SshKeyGen_SD()
	{
		super();
	}
	
	@Then("^I create or search an environment for SshKeyGen resource$")
	public void i_create_or_search_an_environment_for_SshKeyGen_resource() throws Throwable{
		String className = SshKeyGen_SD .class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);

	}
	@When("^I select SshKeyGen resource to the environment$")
	public void i_select_SshKeyGen_resource_to_the_environment() throws Throwable{
		PageFactory.initElements(driver,SshKeyGen_PageObject.class);
		SshKeyGen_PageAction.dragDropSshKeyGen(driver);
	}
	@Then("^i enter resource name of SshKeyGen$")
	public void i_enter_resource_name_of_SshKeyGen() throws Throwable {
		PageFactory.initElements(driver, SshKeyGen_PageObject.class);
		String sshname=keygendetails.getssh_keygen_name();
	     System.out.println(sshname);
	     SshKeyGen_PageAction.resourceNameEnter(driver,sshname );
	}
	 @Then("^i click on SshKeyGen resource$")
		public void i_click_on_SshKeyGen_resource() throws Throwable {
			PageFactory.initElements(driver,  SshKeyGen_PageObject.class);
			String sshname=keygendetails.getssh_keygen_name();
			SshKeyGen_PageAction.ResourceClickSshKeyGen(driver, sshname);
	 }
		 
      @Then("^i delete the created environment for SshKeyGen$")
	public void i_delete_the_created_environment_for_SshKeyGen() throws Throwable {
	String className = SshKeyGen_SD .class.getSimpleName();
	String env_name = dnowEnv.getEnv_name()+className;		
	PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
     
      
     
      @Then("^I enter the blank SshKeyGen resource name$")
		public void i_enter_the_blank_SshKeyGen_resource_name() throws Throwable{
			PageFactory.initElements(driver,SshKeyGen_PageObject.class);
			SshKeyGen_PageAction.enterSshKeyGenBlankName(driver);
		}
      @Then("^User click on the SshKeyGen resource name link$")
		public void user_click_on_the_SshKeyGen_resource_name_link() throws Throwable{

			PageFactory.initElements(driver, Auto_Scaling_Group_PageObject.class);
			String sshkeyname=keygendetails.getssh_keygen_name();
			SshKeyGen_PageAction.resourceNameLinkSshKeyGen(driver, sshkeyname);

		}
      @And("^I dont delete the SshKeyGen resource by clicking the cross button on resource$")
		public void i_dont_delete_the_SshKeyGen_resource_by_clicking_the_cross_button_on_resource() throws Throwable {
			PageFactory.initElements(driver,CommonFunctionalityPage.class);
			String sshkeygenname=keygendetails.getssh_keygen_name();
			SshKeyGen_PageAction.resourceCrossBtnPleaseDontDeleteSshKeyGen(driver, sshkeygenname);
		}
	  @When("^I  delete the SshKeyGen resource by clicking the cross button on resource$")
		public void i_delete_the_SshKeyGen_resource_by_clicking_the_cross_button_on_resource() throws Throwable {
			PageFactory.initElements(driver,SshKeyGen_PageObject.class);
			String sshkeygenname=keygendetails.getssh_keygen_name();
			SshKeyGen_PageAction.resourceCrossBtnPleaseDeleteSshKeyGen(driver, sshkeygenname);
		}
	  @When ("^i enter resource name of SshKeygen is blank$")
	  public void i_enter_resource_name_of_sshKeyGen_is_blank() throws Exception
	  {
			PageFactory.initElements(driver,SshKeyGen_PageObject.class);
			SshKeyGen_PageAction.resourceAttributesBlank(driver);
	  }


}

*/