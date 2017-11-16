package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSSecurityGroupPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSNetworkACLPageAction;
import com.opex.test.pageobjects.AWSSecuritygroupPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSRoute53ZonePageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSSecuritygroupSD extends SuperUsedDefinition  {
	
	public AWSSecuritygroupSD()
    {
		super();  	
    }
	

	@And("^User select connection for securitygroup$")
	public void User_select_connection_for_securitygroup() throws Throwable {
	PageFactory.initElements(driver, CommonFunctionalityPage.class); 
	CommonFunctionalityPageAction.selectConnection(driver,dnsecurity.getsecurity_connection()); 
	}
	@And("^User enter dependson for securitygroup$")
	public void User_enter_dependson_for_securitygroup() throws Throwable {
	PageFactory.initElements(driver, CommonFunctionalityPage.class); 
	PageFactory.initElements(driver,  AWSSecuritygroupPageObject.class);
	AWSSecurityGroupPageAction.security_dependson(driver,dnsecurity.getsecurity_dpendson()); 
	}
	@And("^User enter description for securitygroup$")
	public void User_enter_description_for_securitygroup() throws Throwable {
	PageFactory.initElements(driver, CommonFunctionalityPage.class); 
	PageFactory.initElements(driver,  AWSSecuritygroupPageObject.class);
	AWSSecurityGroupPageAction.security_description(driver,dnsecurity.getsecurity_description()); 
	}
	@And("^User enter vpc id for securitygroup$")
	public void User_enter_vpc_id_for_securitygroup() throws Throwable {
	PageFactory.initElements(driver, CommonFunctionalityPage.class); 
	PageFactory.initElements(driver,  AWSSecuritygroupPageObject.class);
	AWSSecurityGroupPageAction.security_vpc_id(driver,dnsecurity.getsecurity_vpcid()); 
	}
	@And("^User enter egress value for security_group$")
	public void User_enter_egress_value_for_security_group() throws Throwable {
	PageFactory.initElements(driver, CommonFunctionalityPage.class); 
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	PageFactory.initElements(driver,  AWSSecuritygroupPageObject.class);
	AWSSecurityGroupPageAction.clickonegress(driver,dnsecurity.getsecurity_egress()); 
	}

	@And("^User enter ingress value for security_group$")
	public void User_enter_ingress_value_for_security_group() throws Throwable {
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class); 
	PageFactory.initElements(driver,  AWSSecuritygroupPageObject.class);
	AWSSecurityGroupPageAction.clickoningress(driver,dnsecurity.getsecurity_ingress());
	}
	@And("^User enter name for security_group$")
	public void User_enter_name_for_security_group() throws Throwable {
	PageFactory.initElements(driver,  AWSSecuritygroupPageObject.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class); 
	AWSSecurityGroupPageAction.enterSecuritygroupName(driver,dnsecurity.getsecurity_name());
	}
	@And("^User enter invalid name for security_group$")
	public void User_enter_invalid_name_for_security_group() throws Throwable {
	PageFactory.initElements(driver,  AWSSecuritygroupPageObject.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	AWSSecurityGroupPageAction.enterinavalidSgroupName(driver);
	}
	@Then("^User delete SecurityGroup environment and see message environment deleted sucessfully$")
    public void User_delete_SecurityGroup_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSSecuritygroupSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		//EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
    }
	@Then("^User search or create environment for SecurityGroup and see message as environment created successfully$")
	public void User_search_or_create_environment_for_SecurityGroup_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSSecuritygroupSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name);
	}

	@When("^User click SecurityGroup resource and drag on the dashboard$")
	public void User_click_SecurityGroup_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
	}

	@And("^User enter SecurityGroup resource name$")
	public void User_enter_SecurityGroup_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
	   
	   	CommonFunctionalityPageAction.enterResourceName(driver,dnsecurity.getsecurity_name() );
		//AWS_Securitygroup_PageAction.Enterrname(driver);  
	}

	@When("^User click on security group resource$")
	public void User_click_on_security_group_resource() throws Throwable {
		PageFactory.initElements(driver,  AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
	
		CommonFunctionalityPageAction.clickOnResource(driver, dnsecurity.getsecurity_name()); 
		//AWS_Securitygroup_PageAction.ResourceClickSgroup(driver);
	}
	
	
	
}
