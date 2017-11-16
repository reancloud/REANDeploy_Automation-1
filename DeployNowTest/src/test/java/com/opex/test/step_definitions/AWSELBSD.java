package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.AWSELBPageAction;
import com.opex.test.modules.AWSInternetGatewayPageAction;
import com.opex.test.modules.AWSRouteTablePageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSRouteTableAssnPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSRouteTableAssnPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSELBSD extends SuperUsedDefinition{

	public  AWSELBSD(){
		super();
	}
	
	@Then("^User search or create environment for elb and see message as environment created successfully$")
	public void user_search_or_create_environment_for_elb_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSELBSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);  
	}

	@Then("^User delete elb environment and see message environment deleted sucessfully$")
	public void user_delete_elb_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSELBSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
		
	@Then("^User dragdrop vpc and enter attribute for elb$")
	public void User_dragdrop_vpc_and_enter_attribute_for_elb() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElb.getElb_vpc_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver,dnElb.getElb_vpc_Rname());
		AWSVpcPageAction.vpcCidrBlock(driver,dnElb.getElb_vpc_cidrblock());
	}
	
	@Then("^User dragdrop subnet and enter attribute for elb$")
	public void User_dragdrop_subnet_and_enter_attribute_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSSubnetPageObject.resource_subnet);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElb.getElb_subnet_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnElb.getElb_subnet_cidrblock(),dnElb.getElb_subnet_vpcId(),"","","");
	}
	@Then("^User dragdrop routetable and enter attribute for elb$")
	public void User_dragdrop_routetable_and_enter_attribute_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElb.getElb_routetable_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver,dnElb.getElb_routetable_vpcId());
		AWSRouteTablePageAction.enterRouteJson(driver, dnElb.getElb_routetable_route());
	}
	
	@Then("^User dragdrop igw and enter attribute for elb$")
	public void User_dragdrop_igw_and_enter_attribute_for_elb() throws Throwable {
	PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
	PageFactory.initElements(driver, EnvironmentPage.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	AWSInternetGatewayPageAction.selectIGW(driver);
	CommonFunctionalityPageAction.enterResourceName(driver,dnElb.getElb_igw_Rname());
	CommonFunctionalityPageAction.resourceCreateBtn(driver);
	AWSInternetGatewayPageAction.vpcTextBoxIGW(driver,dnElb.getElb_igw_vpcId());
	}
	
	@Then("^User dragdrop RTA and enter attribute for elb$")
	public void User_dragdrop_RTA_and_enter_attribute_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnElb.getElb_rta_Rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnElb.getElb_rta_routetable_id());
		AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnElb.getElb_rta_subnet_id());
	
	}
	
	@When("^User click elb resource and drag on the dashboard$")
	public void User_click_elb_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSELBPageObject.class);
		AWSELBPageAction.ResourceDragDrop(driver);  
	}

	@And("^User enter elb resource name$")
	public void User_enter_elb_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class); 
		CommonFunctionalityPageAction.enterResourceName(driver,dnElb.getElb_Rname()); 
		}

	@When("^User click on elb resource$")
	public void User_click_on_elb_resource() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		CommonFunctionalityPageAction.clickOnResource(driver,dnElb.getElb_Rname());
	}

	@And("^User set listner for elb$")
	public void User_set_listner_for_elb() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSELBPageObject.class); 
		AWSELBPageAction.enterListnerJson(driver,dnElb.getElb_listener());
	}

	@And("^User set subnets array for elb$")
	public void User_set_subnets_array_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);  
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.setArrayCommon(driver,dnElb.getElb_subnets(), AWSELBPageObject.click_subnets_setArray,CommonFunctionalityPage.select_text_area_for_propagation,CommonFunctionalityPage.array_set_value);
	}
	
	@And("^User set dependson for elb$")
	public void User_set_dependson_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnVpc.getVpc_dependsOn());
	}
	
	@And("^User set connection for elb$")
	public void User_set_connection_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver, dnRT.getRoutetable_connection());
		
	}
	@And("^User set accesslog for elb$")
	public void User_set_accesslog_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSELBPageAction.enterAccessLog(driver, dnElb.getElb_access_logs());
	}
	@And("^User set crossZoneLoadBalancing for elb$")
	public void User_set_crossZoneLoadBalancing_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSELBPageAction.crossZoneLodBalancing(driver, dnElb.getElb_cross_zone_load_balancing());
		
	}
	@And("^User set healthCheck for elb$")
	public void User_set_healthCheck_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSELBPageAction.healthCheck(driver,dnElb.getElb_health_check());
	}
	@And("^User set idleTimeout for elb$")
	public void User_set_idleTimeout_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSELBPageAction.idleTimeout(driver,dnElb.getElb_idle_timeout());
	}
	@And("^User set instances for elb$")
	public void User_set_instances_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSELBPageAction.instances(driver,dnElb.getElb_instances());
	}
	@And("^User set internal for elb$")
	public void User_set_internal_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSELBPageAction.internal(driver, dnElb.getElb_internal());
	}
	@And("^User set securityGroup for elb$")
	public void User_set_securityGroup_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSELBPageAction.securityGroups(driver,dnElb.getElb_security_groups());
	}
	@And("^User set tags for elb$")
	public void User_set_tags_for_elb() throws Throwable {
		PageFactory.initElements(driver, AWSELBPageObject.class);   
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSELBPageAction.tags(driver,dnElb.getElb_tags());
	}
	
	
	
}