package com.opex.test.step_definitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Class which implements all the steps.
public class AWSSubnetSD extends SuperUsedDefinition{
    
	public AWSSubnetSD()
	{
   	 super(); 	 
	}
	
    @And("^User enter vpc resource name for subnet$")
    public void User_enter_vpc_resource_name_for_subnet() throws Throwable {
   	 PageFactory.initElements(driver, AWSVpcPage.class);
 	PageFactory.initElements(driver, CommonFunctionalityPage.class);
   	CommonFunctionalityPageAction.enterResourceName(driver,dnsubnet.getSubnet_vpc_Rname());
    }
    
    @When("^User click on Vpc resource for subnet$")
    public void User_click_on_Vpc_resource_for_subnet() throws Throwable{
   	 PageFactory.initElements(driver, AWSVpcPage.class);
 	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	CommonFunctionalityPageAction.clickOnResource(driver, dnsubnet.getSubnet_vpc_Rname());   
      	 
	}
    @And("^User enter cidr_block range for subnet$")
    public void User_enter_cidr_block_range_for_subnet() throws Throwable{
   	 PageFactory.initElements(driver, AWSVpcPage.class);
   	 AWSVpcPageAction.vpcCidrBlock(driver, dnsubnet.getSubnet_vpc_cidr());    
   	 
	}
    
    @Then("^User search or create environment for Subnet and see message as environment created successfully$")
    public void User_search_or_create_environment_for_Subnet_and_see_message_as_environment_created_successfully() throws Throwable {
    	PageFactory.initElements(driver, EnvironmentPage.class);
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSSubnetSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name);
    }


    @When("^User click Subnet resource and drag on the dashboard$")
    public void User_click_Subnet_resource_and_drag_on_the_dashboard() throws Throwable {
   	 PageFactory.initElements(driver, AWSSubnetPageObject.class);
   	 PageFactory.initElements(driver, EnvironmentPage.class);
   	PageFactory.initElements(driver, CommonFunctionalityPage.class);
   	AWSSubnetPageAction.ResourceSelectsubnet(driver);
    }

    @And("^User enter Subnet resource name$")
    public void User_enter_subnet_resource_name() throws Throwable {
   	 PageFactory.initElements(driver, AWSSubnetPageObject.class);
   	PageFactory.initElements(driver, CommonFunctionalityPage.class);
   	CommonFunctionalityPageAction.enterResourceName(driver,dnsubnet.getsubnet_rname() );
    }
  
    @Then("^User entered all attributes values under resource$")
    public void Userentered_all_attributes_values_under_resource() throws Throwable {
   	 PageFactory.initElements(driver, AWSSubnetPageObject.class);
   	 AWSSubnetPageAction.ResourcePassvariable(driver,dnsubnet.getSubnet_cidr_block(),dnsubnet.getSubnet_vpc_id(),dnsubnet.getSubnet_Depends_On(),dncon.getCon_name(),dnsubnet.getSubnet_availability_zone(),dnsubnet.getSubnet_map_public_ip_on());
    }


    @Then("^User entered blank attributes values under resource$")
    public void User_entered_blank_attributes_values_under_resource() throws Throwable {
   	 PageFactory.initElements(driver, AWSSubnetPageObject.class);
   	 AWSSubnetPageAction.ResourcePassvariable(driver," "," ","${test-vpc.id}","PX_SSH","us-west-2a");
    }
    @Then("^User entered cidr block attribute values not in range under resource$")
    public void User_entered_cidr_block_attribute_values_not_in_range_under_resource() throws Throwable {
   	 PageFactory.initElements(driver, AWSSubnetPageObject.class);
   	 AWSSubnetPageAction.ResourcePassvariable(driver,"172.16.208.0/24","${test-vpc.id} ","","","");
    }
    @Then("^User entered invalid vpcid attribute values under resource$")
    public void User_entered_invalid_vpcid_attribute_values_under_resource() throws Throwable {
   	 PageFactory.initElements(driver, AWSSubnetPageObject.class);
   	 AWSSubnetPageAction.ResourcePassvariable(driver,"10.0.1.0/24","${testvpc.id}","","","");
    }
    
    @Then("^User enter blank resource name$")
    public void User_enter_blank_resource_name() throws Throwable {
   	 PageFactory.initElements(driver, AWSSubnetPageObject.class);
   	PageFactory.initElements(driver, CommonFunctionalityPage.class);
   	CommonFunctionalityPageAction.enterResourceName(driver," ");
    }
    @When("^User click on Subnet resource$")
    public void User_click_on_Subnet_resource() throws Throwable {
   	 PageFactory.initElements(driver, AWSSubnetPageObject.class);
 	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	CommonFunctionalityPageAction.clickOnResource(driver, dnsubnet.getsubnet_rname());
    }

    @Then("^User delete subnet resource$")
    public void  User_delete_subnet_resource() throws Throwable {
   	PageFactory.initElements(driver, AWSSubnetPageObject.class);
   	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	CommonFunctionalityPageAction.resource_pleasedelete(driver,dnsubnet.getsubnet_rname());
    }
    
    @Then("^User please don't delete subnet resource button$")
    public void User_please_don_t_delete_subnet_resource_button() throws Throwable {
   	 PageFactory.initElements(driver, AWSSubnetPageObject.class);
   	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnsubnet.getsubnet_rname());
    }
   
    @Then("^User delete subnet environment and see message environment deleted sucessfully$")
    public void User_delete_subnet_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
    	String className = AWSSubnetSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
    }
 
    
}



