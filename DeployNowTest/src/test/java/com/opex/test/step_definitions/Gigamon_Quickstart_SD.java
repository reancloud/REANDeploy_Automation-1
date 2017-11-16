package com.opex.test.step_definitions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.modules.AWSInputVariablePageAction;
import com.opex.test.modules.AWSInternetGatewayPageAction;
import com.opex.test.modules.AWSOutputPageAction;
import com.opex.test.modules.AWSRouteTableAssnPageAction;
import com.opex.test.modules.AWSSecurityGroupPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.Gigamon_Quickstart_PageAction;
import com.opex.test.modules.SignInAction;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSInputVariablePageObject;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSOutputPage;
import com.opex.test.pageobjects.AWSRouteTableAssnPageObject;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.AWSSecuritygroupPageObject;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.Gigamon_Quickstart_Page;
import com.opex.test.pageobjects.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gigamon_Quickstart_SD extends SuperUsedDefinition{

	public Gigamon_Quickstart_SD()
	{
		super();
	}
	
	//signin
	@When("^User logs in to deploynow$")
	public void user_log_in() throws Throwable {
		
		PageFactory.initElements(driver, LoginPage.class);
		SignInAction.execute(driver,datamap.get(0));
		LoginPage.signin_button.click();
	}
	
	//Create Environment for Gigamon_Quickstart_Network_Layer
	@Then("^User create or search an environment for Gigamon_Quickstart_Network_Layer$")
	public void user_create_or_search_an_environment() throws Throwable{
		String env_name = "Gigamon_Quickstart_Network_Layer";
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}
	//user search an environment for Gigamon_Quickstart_Network_Layer
	@And("^user search an environment for Gigamon_Quickstart_Network_Layer$")
	public void user_search_an_environment_Gigamon_Quickstart_Network_Layer() throws Throwable{
		String env_name = "Gigamon_Quickstart_Network_Layer";
		PageFactory.initElements(driver,EnvironmentPage.class);
		Gigamon_Quickstart_PageAction.searchSSHAWSEnvironment1(driver, env_name);
		
	}
	
	
	//user search an environment for test_env_instance1
    @Then("^user search an environment for test_env_instance1$")
	public void user_search_an_environment_test_env_instance1() throws Throwable{
		String env_name = "test_env_instance1";
		PageFactory.initElements(driver,EnvironmentPage.class);
		Gigamon_Quickstart_PageAction.searchSSHAWSEnvironment2(driver, env_name);
		
	}  
    
    @Then("^user search an environment test_env_instance1 for delete$")
    public void user_search_an_environment_test_env_instance1_delete() throws Throwable{
    	String env_name = "test_env_instance1";
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickCanvas(driver);
		EnvironmentPage.environment_dropdown.click();
		Gigamon_Quickstart_PageAction.deleteEnvironment1(driver, env_name);

		
    }
	
    @Then("^user search an environment Gigamon_Quickstart_Network_Layer for delete$")
    public void user_search_an_environment_Gigamon_Quickstart_Network_Layer_delete() throws Throwable{
    	String env_name = "Gigamon_Quickstart_Network_Layer";
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickCanvas(driver);
		EnvironmentPage.environment_dropdown.click();
		Gigamon_Quickstart_PageAction.deleteEnvironment1(driver, env_name);

		
    }
    @Then("^user search an environment Gigamon_Quickstart_Instance_Layer for delete$")
    public void user_search_an_environment_Gigamon_Quickstart_Instance_Layer_delete() throws Throwable{
    	String env_name = "Gigamon_Quickstart_Network_Layer";
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickCanvas(driver);
		EnvironmentPage.environment_dropdown.click();
		Gigamon_Quickstart_PageAction.deleteEnvironment1(driver, env_name);

		
    }
	//Search environment
	@When("^Search environment Gigamon_Quickstart_Network_Layer$")
	public void search_environment() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		//String className = AWS_VPC_SD.class.getSimpleName();
		//String env_name = dnowEnv.getEnv_name()+className;
		String env_name = "Gigamon_Quickstart_Network_Layer";
		//String env_name = "Env_Gigamon_Quickstart_SD1";
		Gigamon_Quickstart_PageAction.searchAWSEnvironment(driver, env_name);
	}
	
	//Add VPC Resource to Environment and add required attributes
	@Then("^Add VPC resource to environment and enter attribute values$")
	public void click_on_VPC_resource_and_entered_the_attribute_values() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
        PageFactory.initElements(driver, AWSVpcPage.class);
        PageFactory.initElements(driver, CommonFunctionalityPage.class);
        PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
        //ResourceVpc_SSH_AWS_PageAction.clickVpcResourceAndDrop(driver);
        CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
        Gigamon_Quickstart_PageAction.Resourcename(driver, "VPC1");
        CommonFunctionalityPageAction.resourceCreateBtn(driver);
        Gigamon_Quickstart_PageAction.ResourceClickcreatedresource(driver);
        Gigamon_Quickstart_PageAction.enterVPCCidrBlockValue(driver); 
        //AWSVpcPageAction.selectEnableDnsSupportValue(driver);
        AWSVpcPageAction.selectEnableDnsSupportValue(driver,dnVpc.getVpc_enableDnssupport());
        //AWSVpcPageAction.selectEnableDnsHostnamesValue(driver);
        AWSVpcPageAction.selectEnableDnsHostnamesValue(driver, dnVpc.getVpc_enableHostname());
      }
	
	//Save the environment
	@And("^User clicks on save button on dashboard$")
	public void user_click_on_save_button_on_dash_board() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		CommonFunctionalityPageAction.saveResource(driver);
	}
	
	//Add subnet1 to environment and enter attribute values
	@Then("^Add subnet1 resource to the environment and enter attribute values$")
	public void click_on_subnet1_resource_and_entered_the_attribute_values() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		//PageFactory.initElements(driver, RSubnet_SSH_AWSPage.class);
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		//RSubnet_SSH_AWSAction.ResourceSelectsubnet(driver);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		Gigamon_Quickstart_PageAction.Resourcename(driver, "Public_subnet");
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		Gigamon_Quickstart_PageAction.ResourceClickcreatedsubnet(driver,"Public_subnet");
		Gigamon_Quickstart_PageAction.Resource_subnet_data(driver, "10.100.2.0/24", "${VPC1.id}", "true" );
	}
	
	//Add subnet2 to environment and enter attribute values
	@Then("^Add subnet2 resource to the environment and enter attribute values$")
	public void click_on_subnet2_resource_and_entered_the_attribute_values() throws Throwable {
		//PageFactory.initElements(driver, RSubnet_SSH_AWSPage.class);
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		//RSubnet_SSH_AWSAction.ResourceSelectsubnet(driver);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		Gigamon_Quickstart_PageAction.Resourcename(driver, "App_subnet");
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		Gigamon_Quickstart_PageAction.ResourceClickcreatedsubnet(driver, "App_subnet");
		Gigamon_Quickstart_PageAction.Resource_subnet_data(driver, "10.100.0.0/24", "${VPC1.id}", "false");
			
	}
	
	//Add subnet3 to environment and enter attribute values
	@Then("^Add subnet3 resource to the environment and enter attribute values$")
	public void click_on_subnet3_resource_and_entered_the_attribute_values() throws Throwable {
		//PageFactory.initElements(driver, RSubnet_SSH_AWSPage.class);
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		//RSubnet_SSH_AWSAction.ResourceSelectsubnet(driver);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		Gigamon_Quickstart_PageAction.Resourcename(driver, "Mirror_subnet");
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		Gigamon_Quickstart_PageAction.ResourceClickcreatedsubnet(driver, "Mirror_subnet");
		Gigamon_Quickstart_PageAction.Resource_subnet_data(driver, "10.100.1.0/24", "${VPC1.id}", "false");
	}
	
	//Add Internet gateway resource and enter attribute values
	@Then("^User select Internet Gateway resource drags to the environment and enter attribute values$")
	public void select_Internet_Gateway_resource_and_drag_to_the_environment() throws Throwable {
		//PageFactory.initElements(driver,AWS_InternetGateway_PageObject.class);
		//AWS_InternetGateway_PageAction.selectIGW(driver);
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		AWSInternetGatewayPageAction.selectIGW(driver);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver,Gigamon_Quickstart_Page.class);
		CommonFunctionalityPageAction.enterResourceName(driver,"Internet_Gateway1");
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		PageFactory.initElements(driver,Gigamon_Quickstart_Page.class);
		Gigamon_Quickstart_PageAction.clickResourceIGW(driver, "Internet_Gateway1");
		//PageFactory.initElements(driver,AWS_InternetGateway_PageObject.class);
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		Gigamon_Quickstart_PageAction.vpcTextBoxIGW(driver);
	}
	
	//Add Nat Gateway resource and enter attribute values
	@Then("^User select NAT Gateway resource and drags to the environment and enter attribute values$")
	public void select_NAT_Gateway_resource_and_drags_to_the_environment() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.clickNATResourceAndDrop(driver);
    	PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
    	CommonFunctionalityPageAction.enterResourceName(driver,"Nat_Gateway");
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		Gigamon_Quickstart_PageAction.clickResourceIGW(driver, "Nat_Gateway");
		Gigamon_Quickstart_PageAction.enterallocation_id(driver);
    	//PageFactory.initElements(driver, R_Route_Table_assn_SSH_AWSPage.class);
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		Gigamon_Quickstart_PageAction.enterRTAsubnet_id(driver, "${Public_subnet.id}");
	}
	
	//Add EIP resource to environment
	@When("^User drag drop the EIP resource$")
	public void drag_and_drop_the_Eip_resource() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.clickEIPResourceAndDrop(driver);	
	}
	
	//Enter resource name for EIP resource
	@Then("^Enter resource name for EIP resource$")
	public void enter_resource_name_for_EIP_resource() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.enterEIPName(driver);	
	}
	
	//add route table association resource to environment
	@Then("^User drag and drop Route table Association resource$")
	public void drag_and_drop_Route_table_Association_resource() throws Throwable {
		//PageFactory.initElements(driver, R_Route_Table_assn_SSH_AWSPage.class);
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		//R_Route_Table_assn_SSH_AWSAction.dragdropRTA(driver);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
	}
	
	//Enter resource name for route table association resource
	@When("^Enter resource name for Route table Association resource$")
	public void enter_route_table_association_resource_name() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		//Gigamon_Quickstart_PageAction.enterRouteTableRName(driver);
		Gigamon_Quickstart_PageAction.enterRoutetableassName(driver, "pubsubnet_to_igw");
	}
	
	//Enter route table ID for route table association resource
	@Then("^Enter route table id for Route table Association$")
	public void enter_route_table_id_of_Route_table_Association() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.ResourceClickcreatedRouteassresource(driver);
		Gigamon_Quickstart_PageAction.enterRTAroute_id(driver, "${pub_route_table.id}");	
	}
	
	//Enter subnet ID for route table association resource
	@Then("^Enter subnet id for Route table Association$")
	public void enter_subnet_id_of_Route_table_Association() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		//PageFactory.initElements(driver, R_Route_Table_assn_SSH_AWSPage.class);
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		Gigamon_Quickstart_PageAction.enterRTAsubnet_id(driver, "${Public_subnet.id}");	
	}
	
	//Add route table resource to environment
	@Then("^Click on route table resource and drag on the dashboard$")
    public void click_route_table_resource_and_drag_on_the_dashboard() throws Throwable {
    	PageFactory.initElements(driver,EnvironmentPage.class);
		//PageFactory.initElements(driver, ResourceRoute_Table_SSH_AWS_PageObject.class);
    	PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		//ResourceRoute_Table_SSH_AWS_PageAction.clickRouteTableResourceAndDrop(driver);
    	CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
    }
	
	//Add route table1 resource name
	@And("^Enter route table1 resource name$")
	public void enter_route_table1_resource_name() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.enterRouteTableRName(driver , "pub_route_table");	
	}
	
	//Click on pub_route_table route table resource
	@Then("^User click on the route table1 resource$")
	public void click_on_resource_route_table() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.ResourceClickCreatedRouteTableResource(driver, "pub_route_table");	
	}
	@And("^User set json for Output resource for Gigamon quickstart$")
	public void User_set_json_for_Output_resource_for_Gigamon_quickstart() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.setOutputJSON(driver);
		Reporter.log("Output  json is performed");
	}
	
	//Enter vpc_id for route table resource 
	@And("^User enters vpc id for route table resource$")
    public void enter_route_table_vpc_id() throws Throwable {
		//PageFactory.initElements(driver, ResourceRoute_Table_SSH_AWS_PageObject.class);
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.enterRouteTableVpcId(driver);
	}
	
	//set json route for route table resource
	@And("^Set json route for route table resource$")
    public void set_json_for_route_for_route_table_resoource() throws Throwable {
    	Log.info("Enter route table json value");
    	PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
    	Gigamon_Quickstart_PageAction.clickRouteTableJson(driver);
		Reporter.log("route table json is performed");     	    	
    }
	
	//Enter resource name for second route table resource
	@And("^Enter route table2 resource name$")
	public void enter_route_table2_resource_name() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.enterRouteTableRName(driver, "priv_route_table");	
	}
	
	//click on priv_route_table resource
	@Then("^User click on the route table2 resource$")
	public void click_on_resource_route_table2() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.ResourceClickCreatedRouteTableResource(driver, "priv_route_table");	
	}
	
	//Enter depends on value for route table resource
	/*@Then("^User enters depends on value for route table resource$")
	public void user_enters_depends_on_value() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.enterDepends_on(driver);	
	}*/
	
	
	//set json route for priv_route_table resource
	@And("^Set json route for route table2 resource$")
    public void set_json_route_for_route_table2() throws Throwable {
    	Log.info("Enter route table json value");
    	PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
    	Gigamon_Quickstart_PageAction.clickRouteTable2Json(driver);
		Reporter.log("route table json is performed");     	    	
    }
	
	//Enter resource name for second route table association resource
	@Then("^Enter resource name for Route_table_Association2 resource$")
	public void enter_route_table_association_resource_name2() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.enterRoutetableassName(driver, "appsubnet_to_nat");
	}
	
	//Enter route table id for route table association2
	@Then("^Enter route table id for Route table Association2$")
	public void enter_route_table_id_of_Route_table_Association2() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.click_route_tbl_association2(driver);
		Gigamon_Quickstart_PageAction.enterRTAroute_id(driver, "${priv_route_table.id}");	
	}
	
	//Enter subnet id for route table association resource
	@Then("^Enter subnet id for Route table Association2$")
	public void enter_subnet_id_of_Route_table_Association2() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		//PageFactory.initElements(driver, R_Route_Table_assn_SSH_AWSPage.class);
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		Gigamon_Quickstart_PageAction.enterRTAsubnet_id(driver, "${App_subnet.id}");	
	}
	
	//add security group resource
	@Then("^User drag and drop security group resource$")
	public void i_drag_and_drop_security_group_resource() throws Throwable {
		//PageFactory.initElements(driver, AWS_Securitygroup_Page.class);
		PageFactory.initElements(driver, AWSSecuritygroupPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		//AWS_Securitygroup_PageAction.dragdropsecuritygroup(driver);
		AWSSecurityGroupPageAction.dragdropsecuritygroup(driver);
	}
	
	//Enter name for security group resource
	@Then("^Enter resource name of security group1$")
	public void enter_resource_name_of_security_group1() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.Entername(driver, "public_access");  
	}
	
	//Click on security group resource
	@Then("^User click on security group1 resource$")
	public void click_on_security_group_resource1() throws Throwable {
		PageFactory.initElements(driver,  Gigamon_Quickstart_Page.class);
		Gigamon_Quickstart_PageAction.ResourceClickSgroup(driver, "public_access");
	}
	
	//Enter egress value for security group	
	@Then("^Enter egress value for security_group1$")
	public void enter_egress_value_for_security_group() throws Throwable {
	//PageFactory.initElements(driver,  AWS_Securitygroup_Page.class);
	PageFactory.initElements(driver, AWSSecuritygroupPageObject.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class); 
	//PageFactory.initElements(driver,  R_Network_ACL_SSH_AWSPage.class);
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	PageFactory.initElements(driver,  Gigamon_Quickstart_Page.class);
	Gigamon_Quickstart_PageAction.clickonegress(driver); 
	}
    
	//Enter ingress value for security group
	@Then("^Enter ingress value for security_group1$")
	public void enter_ingress_value_for_security_group() throws Throwable {
	//PageFactory.initElements(driver,  AWS_Securitygroup_Page.class);
	PageFactory.initElements(driver, AWSSecuritygroupPageObject.class);
	//PageFactory.initElements(driver,  R_Network_ACL_SSH_AWSPage.class);
	PageFactory.initElements(driver,  AWSNetworkACLPageObject.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class); 
	PageFactory.initElements(driver,  Gigamon_Quickstart_Page.class);
	Gigamon_Quickstart_PageAction.clickoningress(driver);
	}
	//enter resource name for security group
	@Then("^Enter resource name of security group2$")
	public void enter_resource_name_of_security_group2() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.Entername(driver, "mgmt_access");  
	}
	
	//click on security group resource
	@Then("^Click on security group resource2$")
	public void click_on_security_group_resource3() throws Throwable {
		PageFactory.initElements(driver,  Gigamon_Quickstart_Page.class);
		Gigamon_Quickstart_PageAction.ResourceClickSgroup(driver, "mgmt_access");
	}
	
	//Enter resource name for security group resource
	@Then("^Enter resource name of security group3$")
	public void enter_resource_name_of_security_group3() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.Entername(driver, "mirror_access");  
	}
	
	//Click on security group resource
	@Then("^Click on security group resource3$")
	public void click_on_security_group_resource2() throws Throwable {
		PageFactory.initElements(driver,  Gigamon_Quickstart_Page.class);
		Gigamon_Quickstart_PageAction.ResourceClickSgroup(driver, "mirror_access");
	}
	
	//Click on canvas to remove the ride side bar of resource details	
	@And("^User clicks on the canvas$")
	public void user_click_on_canvas() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		//CommonFunctionalityPageAction.clickcanvas(driver);
		CommonFunctionalityPageAction.clickCanvas(driver);
	}
    
	//click on refresh
	@Then("^refresh the page for Gigamon Quickstart$")
	public void refresh_the_page_for_Gigamon_Quickstart() throws Throwable {
		//PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
    	//AWS_NATgateway_PageAction.refresh_page(driver);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.refreshPage(driver);

	}
	//User click on environment dropdown box
	@When("^User click on environment dropdown box$")
	public void User_click_on_environment_dropdown_box() throws Throwable{
		PageFactory.initElements(driver, EnvironmentPage.class);
		EnvironmentPage.environment_dropdown.click();	
	}
	
	//Create an environment for Gigamon Instance layer
	@Then("^User create or search an environment for Gigamon_Quickstart_Instance_Layer$")
	public void User_create_or_search_an_environment_Gigamon_Quickstart_Instance_Layer() throws Throwable{
		String env_name = "Gigamon_Quickstart_Instance_Layer";
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
		
	}
	//Search environment Gigamon_Quickstart_Instance_Layer
	@When("^Search environment Gigamon_Quickstart_Instance_Layer$")
	public void search_environment1() throws Throwable{
		PageFactory.initElements(driver, AWSVpcPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		//String className = AWS_VPC_SD.class.getSimpleName();
		//String env_name = dnowEnv.getEnv_name()+className;
		String env_name = "Gigamon_Quickstart_Instance_Layer";
		//String env_name = "Env_Gigamon_Quickstart_SD1";
		Gigamon_Quickstart_PageAction.searchAWSEnvironment(driver, env_name);
	}
	
	//User selects depends_on resource and drags to the environment
	@When("^User select depends on resource and drags to the environment$")
	public void drag_and_drop_depends_on_resource() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.drag_and_drop_resource(driver);
	}
	
	//enter resource name for Depends On Resource
	@Then("^Enter resource name of Depends On$")
	public void enter_resource_name_for_depends_on_resource() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.Entername(driver, "networking");  
	}
	
	//Click on depends on resource
	@Then("^Click on depends on resource$")
	public void click_on_depends_on_resource() throws Throwable {
		PageFactory.initElements(driver,  Gigamon_Quickstart_Page.class);
		Gigamon_Quickstart_PageAction.click_on_depends_on_resource(driver);
	}
	
	//Enter depends_on value for depends on resource
	@Then("^Enter depends_on value for the depends on resource$")
	public void enter_depends_on_attribute_value() throws Throwable {
	PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	Gigamon_Quickstart_PageAction.dependson_value(driver, "Gigamon_Quickstart_Network_Layer");
	
	}
	
	//User enters input variables attribute for Input Variable
	@And("^User enters input variables attribute for Input Variable$")
	public void user_enter_input_variables_attribute_for_Input_Variable() throws Throwable {
       PageFactory.initElements(driver,AWSInputVariablePageObject.class);
		AWSInputVariablePageAction.enterJsonInputVar(driver,"{ \"FName\": \"Dexter\",\r\n  \"LName\": \"Markley\"}");

	}
	//User set json for input resource for Gigamon quickstart instance layer
	@And("^User set json for input resource for Gigamon quickstart instance layer")
	public void User_set_json_input_resource_Gigamon_quickstart_instance_layer() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
    	//PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String demo="{\"app_subnet_id\":\"subnet-258dcb42\",\"public_subnet_id\": \"subnet-c183c5a6\",\"public_access_id\": \"sg-1946f962\"}";
		AWSInputVariablePageAction.enterJsonInputVar(driver, demo);
		//Gigamon_Quickstart_PageAction.setInputJSON(driver,demo);
		Reporter.log("Input  json is performed");
	}
	
	//User set json for the Output resource
	@Then("^User set json for the Output resource$")
	public void User_set_json_for_Output_resource() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		Gigamon_Quickstart_PageAction.enterOutputValidJson(driver);
	}
	
	//User set the json for the Output resource2
	@Then("^User set the json for the Output resource2$")
	public void User_set_json_for_Output_resource2() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		Gigamon_Quickstart_PageAction.enterOutputValidJson2(driver);
	}
	
	//User fill the subnet_id attribute for Instance
	@And("^User fill the subnet_id attribute for Instance$")
	public void user_fill_the_subnet_id_attribute_for_Instance()throws Throwable{

		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);
		Gigamon_Quickstart_PageAction.enter_subnet_id_instance(driver);
	}
	
	//User sets subnets array for elb
	@And("^User sets subnets array for elb$")
	public void we_set_subnets_array_for_elb() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);   
		Gigamon_Quickstart_PageAction.enterValidSubnetArray(driver);
	}
	
	//User sets instance array for elb
	@And("^User sets instance array for elb$")
	public void user_set_instance_array_for_elb() throws Throwable {
		PageFactory.initElements(driver, Gigamon_Quickstart_Page.class);   
		Gigamon_Quickstart_PageAction.enterValidinstanceArray(driver);
	}
	
	//Start the Deploy using copy deploy API
	@Then("^Start the Deploy using copy deploy API$")
	public void start_deploy()throws Throwable{
		//Curl Command to start the deploy	
		//Create file with curl command
		
		Gigamon_Quickstart_PageAction.cmdDeploy();
	}
	
	


	//Click on Deploy button on Dashboard
	@And("^User clicks on deploy button on dashboard$")
	public void user_click_on_deploy_button_for_IAM_policy() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.deploy(driver);

	}
	//check destroy button
	@And("^User check deploy button on dashboard$")
	public void user_check_deploy_button() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.destroywait(driver);
		
	}
	
	//Verify Deployment Status
	@Then ("^User verifies deployment is successful or failed$")
public void User_verify_deployment_pass_or_fail() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.verifydeployment(driver);
		}
	
	//User set subnets array for elb for instance layer
	@And("^User set subnets array for elb for instance layer$")
	public void User_set_subnets_array_elb_instance_layer() throws Throwable{
		PageFactory.initElements(driver, AWSELBPageObject.class);  
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		Gigamon_Quickstart_PageAction.setArrayCommon1(driver,dnElb.getElb_subnets(), AWSELBPageObject.click_subnets_setArray,CommonFunctionalityPage.select_text_area_for_propagation,CommonFunctionalityPage.array_set_value);
		
	}
	
	


}