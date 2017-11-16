package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSInternetGatewayPageAction;
import com.opex.test.modules.AWSRoutePageAction;
import com.opex.test.modules.AWSRouteTableAssnPageAction;
import com.opex.test.modules.AWSRouteTablePageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.AWSRoutePageObject;
import com.opex.test.pageobjects.AWSRouteTableAssnPageObject;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSRouteSD extends SuperUsedDefinition{

	public AWSRouteSD()
	{
		super();
	}	
	
	@Then("^User search or create environment for Route and see message as environment created successfully$")
	public void User_search_or_create_environment_for_Route_and_see_message_as_environment_created_successfully() throws Throwable{
		PageFactory.initElements(driver, AWSRoutePageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSRouteSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}
	

	@Then("^User delete Route environment and see message environment deleted sucessfully$")
	public void User_delete_Route_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		
		String className = AWSRouteSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
	
	@When("^User click Route resource and drag on the dashboard$")
	public void User_click_Route_resource_and_drag_on_the_dashboard() throws Throwable{
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,AWSRoutePageObject.class);
		AWSRoutePageAction.selectRoute(driver);
	}
	@And("^User enter Route resource name$")
	public void User_enter_Route_resource_name() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnRoute.getroute_Rname()); 
	}
	@When("^User click on route resource$")
	public void User_click_on_route_resource() throws Throwable{
		
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnRoute.getroute_Rname());
	}

	@And("^User fill the route table id for Route$")
	public void user_fill_the_routeTable_id_for_Route() throws Throwable{
		
		PageFactory.initElements(driver,AWSRoutePageObject.class);
		AWSRoutePageAction.enterRouteTableId(driver,dnRoute.getRouteTable_id());
	}
	@And("^User fill the destn cidr for Route$")
	public void user_fill_the_destn_cidr_for_Route() throws Throwable{
		
		PageFactory.initElements(driver,AWSRoutePageObject.class);
		AWSRoutePageAction.enterDestn_cidr(driver,dnRoute.getDestn_cidr());
	}
	@And("^User fill the gateway id for Route$")
	public void user_fill_the_gateway_id_for_Route() throws Throwable{
		
		PageFactory.initElements(driver,AWSRoutePageObject.class);
		AWSRoutePageAction.enterGatewayId(driver, dnRoute.getGateway_id());
	}
	
	@And("^User fill the invalid gateway id for Route$")
	public void user_fill_the_invalid_gateway_id_for_Route() throws Throwable{
		
		PageFactory.initElements(driver,AWSRoutePageObject.class);
		AWSRoutePageAction.enterGatewayId(driver,dnKeyPair.getInvalidPublic_key());
	}
	@Then("^User select connection for Route$")
	public void user_select_connection_for_Route() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver,dnRoute.getroute_connection()); 
	}

	@Then("^User enter depends on for Route$")
	public void user_enter_depends_on_for_Route() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnRoute.getroute_depends_on()); 
	}
	@Then("^User enter instance id for Route$")
	public void user_enter_instance_id_for_Route() throws Throwable {
		PageFactory.initElements(driver,AWSRoutePageObject.class);
		AWSRoutePageAction.enterInstanceId(driver, dnRoute.getroute_instance_id());
	}

	@Then("^User enter nat gateway id for Route$")
	public void user_enter_nat_gateway_id_for_Route() throws Throwable {
		PageFactory.initElements(driver,AWSRoutePageObject.class);
		AWSRoutePageAction.enterNatgatewayId(driver, dnRoute.getroute_nat_gateway_id());
	}

	@Then("^User enter network interface id for Route$")
	public void user_enter_network_interface_id_for_Route() throws Throwable {
		PageFactory.initElements(driver,AWSRoutePageObject.class);
		AWSRoutePageAction.enternetworkinterfaceid(driver, dnRoute.getroute_network_interface_id());
	}

	@Then("^User enter vpc peering conn id for Route$")
	public void user_enter_vpc_peering_conn_id_for_Route() throws Throwable {
		PageFactory.initElements(driver,AWSRoutePageObject.class);
		AWSRoutePageAction.entervpcpeering(driver, dnRoute.getroute_vpc_peering_conn_id());
	}
	
	@Then("^User click on IGW resource and entered all the attribute values for Route$")
	public void User_click_on_IGW_resource_and_entered_all_the_attribute_values_for_Route() throws Throwable {
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSInternetGatewayPageAction.selectIGW(driver);
		CommonFunctionalityPageAction.enterResourceName(driver, dnRoute.getroute_igw_Rname()); 
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver, dnRoute.getroute_igw_vpcid());
	}
	@Then("^User click on Route Table resource and entered all the attribute values for Route$")
	public void User_click_on_Route_Table_resource_and_entered_all_the_attribute_values_for_Route() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);	
		CommonFunctionalityPageAction.enterResourceName(driver, dnRoute.getroute_RT_Rname()); 
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver, dnRoute.getroute_RT_vpcid());
		AWSRouteTablePageAction.enterRouteJson(driver, dnRoute.getroute_RT_route());
	}
	@Then("^User click on VPC resource and entered all the attribute values for Route$")
	public void User_click_on_VPC_resource_and_entered_all_the_attribute_values_for_Route() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		CommonFunctionalityPageAction.enterResourceName(driver,dnRoute.getroute_vpc_Rname()); 
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSVpcPageAction.vpcCidrBlock(driver, dnRoute.getroute_cidrblock());
	}

}
