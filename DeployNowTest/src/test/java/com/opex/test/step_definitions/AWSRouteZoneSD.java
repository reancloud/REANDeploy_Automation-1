package com.opex.test.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSNetworkACLPageAction;
import com.opex.test.modules.AWSRouteTableAssnPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.AWSRoute53ZonePageAction;
import com.opex.test.modules.SignInAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.AWSRouteTableAssnPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.AWSRoute53ZonePageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSRouteZoneSD extends SuperUsedDefinition{
	
		public AWSRouteZoneSD ()
		{
		super();  	
		}
		
		@Then("^User click on VPC resource and entered all the attribute values for Route zone$")
		public void User_click_on_VPC_resource_and_entered_all_the_attribute_values_for_Route_zone() throws Throwable {
			PageFactory.initElements(driver,EnvironmentPage.class);
	        PageFactory.initElements(driver, AWSVpcPage.class);
	        PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
	        PageFactory.initElements(driver, CommonFunctionalityPage.class);
	        CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
	     	CommonFunctionalityPageAction.enterResourceName(driver,dnroutzone.getroutezone_vpc_resourceName());
	        CommonFunctionalityPageAction.resourceCreateBtn(driver);
	        CommonFunctionalityPageAction.clickOnResource(driver, dnroutzone.getroutezone_vpc_resourceName()); 
	        AWSVpcPageAction.vpcCidrBlock(driver,dnroutzone.getroutezone_vpc_cidr()); 
		
		}
		@When("^User click Route zone resource and drag on the dashboard$")
		public void User_click_Route_zone_resource_and_drag_on_the_dashboard() throws Throwable {
			PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
			PageFactory.initElements(driver, EnvironmentPage.class);
			PageFactory.initElements(driver, CommonFunctionalityPage.class);
			AWSRoute53ZonePageAction.dragdropRoute53_zone(driver);
		    
		}
		@Then("^User enter blank Route zone resource name$")
	    public void User_enter_blank_Route_zone_resource_name() throws Throwable {
	   	 PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
	   	 PageFactory.initElements(driver, CommonFunctionalityPage.class);
	   	CommonFunctionalityPageAction.enterResourceName(driver,"");
	    } 
		@Then("^User search or create environment for Route zone and see message as environment created successfully$")
		public void User_search_or_create_environment_for_Route_zone_and_see_message_as_environment_created_successfully() throws Throwable {
			PageFactory.initElements(driver, EnvironmentPage.class);
			PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
			PageFactory.initElements(driver, CommonFunctionalityPage.class);
			String className = AWSRouteZoneSD.class.getSimpleName();
			String env_name = dnowEnv.getEnv_name()+className;
			EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name);

		}
		@Then("^User delete Route Zone environment and see message environment deleted sucessfully$")
	    public void User_delete_Route_Zone_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
			
			String className = AWSRouteZoneSD.class.getSimpleName();
			String env_name = dnowEnv.getEnv_name()+className;
			PageFactory.initElements(driver,EnvironmentPage.class);
			EnvironmentPageAction.environmentDropdown(driver);
			EnvironmentPageAction.deleteEnvironment(driver,env_name);
	    }
		
		@And("^User enter Route zone resource name$")
		public void User_enter_Route_zone_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnroutzone.getroutezone_rname());  
		}
		@When("^User click on Route zone resource$")
		public void User_click_on_Route_zone_resource() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnroutzone.getroutezone_rname()); 
		}
	
		@And("^User enter name for Route zone resource$")
		public void User_enter_name_for_Route_zone_resource() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		AWSRoute53ZonePageAction.enter_Name(driver,dnroutzone.getroutezone_rname());
		}

		@And("^User select connection for Route zone resource$")
		public void USer_select_connection_for_Route_zone_resource() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		CommonFunctionalityPageAction.selectConnection(driver, dnroutzone.getroutezone_connection());
		}
		@And("^User enter depends on for Route zone resource$")
		public void  User_enter_depends_on_for_Route_zone_resource() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnroutzone.getroutezone_dependson());
		}
		@And("^User enter comments for Route zone resource$")
		public void User_enter_comments_for_Route_zone_resource() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		AWSRoute53ZonePageAction.enter_comments(driver,dnroutzone.getroutezone_comment());
		}
		
		@And("^User enter delegation set id on for Route zone resource$")
		public void User_enter_delegation_set_id_on_for_Route_zone_resource() throws Throwable {
			PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
			AWSRoute53ZonePageAction.enter_delegation_set_id(driver,dnroutzone.getroutezone_delegation_set_id());
		}
		@And("^User enter tags for Route zone resource$")
		public void User_enter_tags_for_Route_zone_resource() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		AWSRoute53ZonePageAction.enter_tags(driver,dnroutzone.getroutezone_tags());
		}
		
		@And("^User enter vpc id for Route zone resource$")
		public void User_enter_vpc_id_for_Route_zone_resource() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		AWSRoute53ZonePageAction.enter_routezonevpcid(driver,dnroutzone.getroutezone_vpc_id());
		}

		@And("^User enter vpc region for Route zone resource$")
		public void User_enter_vpc_region_for_Route_zone_resource() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		AWSRoute53ZonePageAction.enter_routezonevpcregion(driver,dnroutzone.getroutezone_vpc_region());
		}
		@Then("^User enter invalid vpc id for Route zone resource$")
		public void User_enter_invalid_vpc_id_for_Route_zone_resource() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		AWSRoute53ZonePageAction.enter_routezonevpcid(driver,"${tt-vpc.id}");
		}
	    @Then("^User enter blank name for Route zone resource$")
		public void User_enter_blank_name_for_Route_zone_resource() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		AWSRoute53ZonePageAction.enter_Name(driver," ");
		}
	    @Then("^User click on cross and click on please delete it button for Route zone$")
		public void i_click_on_cross_and_click_on_please_delete_it_button_for_Route_zone() throws Throwable {
	    PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver, dnroutzone.getroutezone_rname());
		}
	    @Then("^User click on cross and click on please dont delete it button for Route zone$")
		public void i_click_on_cross_and_click_on_please_dont_delete_it_button_for_Route_zone() throws Throwable {
	    PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver, dnroutzone.getroutezone_rname());
		}
	    
	    
	    
}
