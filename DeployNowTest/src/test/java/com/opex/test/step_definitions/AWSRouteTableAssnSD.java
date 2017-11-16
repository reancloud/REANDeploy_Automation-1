package com.opex.test.step_definitions;
import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.AWSInternetGatewayPageAction;
import com.opex.test.modules.AWSRouteTablePageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSRouteTableAssnPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.pageobjects.AWSIAMGroupPageObject;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSRouteTableAssnPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.AWSRoute53ZonePageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSRouteTableAssnSD extends SuperUsedDefinition {
	public AWSRouteTableAssnSD()
    {
		super();  	
    }

	@Then("^User click on VPC resource and entered all the attribute values for Route table Association$")
	public void User_click_on_VPC_resource_and_entered_all_the_attribute_values_for_Route_table_Association() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
        PageFactory.initElements(driver, AWSVpcPage.class);
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
    	CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
        CommonFunctionalityPageAction.enterResourceName(driver,dnRTA.getRTA_vpc_rname());
        CommonFunctionalityPageAction.resourceCreateBtn(driver);
        CommonFunctionalityPageAction.clickOnResource(driver, dnRTA.getRTA_vpc_rname()); 
        AWSVpcPageAction.vpcCidrBlock(driver,dnRTA.getRTA_vpc_cidrblock()); 
	
	}

	@Then("^User click on subnet resource and entered all the attribute values for Route table Association$")
	public void User_click_on_subnet_resource_and_entered_all_the_attribute_values_for_Route_table_Association() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnRTA.getRTA_subnet_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetPageAction.ResourcePassvariable(driver,dnRTA.getRTA_subnet_cidr_block(),dnRTA.getRTA_subnet_vpc_id(),"","","");
		
	}

	@Then("^User click on IGW resource and entered all the attribute values for RTA$")
	public void User_click_on_IGW_resource_and_entered_all_the_attribute_values_for_Route_table_Association() throws Throwable {
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMGroupPageObject.class);
		AWSInternetGatewayPageAction.selectIGW(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnRTA.getRTA_igw_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver, dnRTA.getRTA_igw_vpc_id());
		
	}

	@Then("^User click on route table resource and entered all the attribute values for Route table Association")
	public void User_click_on_route_table_resource_and_entered_all_the_attribute_values_for_Route_table_Association() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
		CommonFunctionalityPageAction.enterResourceName(driver,dnRTA.getRTA_routetable_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSRouteTablePageAction.enterRouteTableVpcId(driver, dnRTA.getRTA_routetable_vpcid());
		AWSRouteTablePageAction.enterRouteJson(driver, dnRTA.getRTA_routetable_route());
	}

	@Then("^User search or create environment for RTA and see message as environment created successfully$")
	public void User_search_or_create_environment_for_RTA_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, AWSRoute53ZonePageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSRouteTableAssnSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name);
	}
	@When("^User click RTA resource and drag on the dashboard$")
	public void User_click_RTA_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRouteTableAssnPageAction.dragdropRTA(driver);
	    
	}

	@And("^User enter RTA resource name$")
	public void User_enter_RTA_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnRTA.getRTA_rname());  
	}
	@Then("^User click on cross and click on please delete it button on Route table Association$")
	public void User_click_on_cross_and_click_on_please_delete_it_button_on_Route_table_Association() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dnRTA.getRTA_rname());
	}
	@Then("^User click on cross and click on please dont delete it button on Route table Association$")
	public void User_click_on_cross_and_click_on_please_dont_delete_it_button_on_Route_table_Association() throws Throwable {
		PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnRTA.getRTA_rname());
	    
	}
	@Then("^User enter blank Route table Association resource name$")
    public void User_enter_blank_Route_table_Association_resource_name() throws Throwable {
   	 PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
   	 PageFactory.initElements(driver, CommonFunctionalityPage.class);
   	CommonFunctionalityPageAction.enterResourceName(driver," "); 
    } 
	@When("^User click on RTA resource$")
	public void User_click_on_RTA_resource() throws Throwable {
	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	CommonFunctionalityPageAction.clickOnResource(driver, dnRTA.getRTA_rname());
	}

	@And("^User enter route table id on Route table Association$")
	public void User_enter_route_table_id_on_Route_table_Association() throws Throwable {
	PageFactory.initElements(driver, CommonFunctionalityPage.class);
	AWSRouteTableAssnPageAction.enterRTAroute_id(driver,dnRTA.getRTA_route_table_id());

	}

	@And("^User enter subnet id on Route table Association$")
	public void User_enter_subnet_id_on_Route_table_Association() throws Throwable {
	PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
	AWSRouteTableAssnPageAction.enterRTAsubnet_id(driver,dnRTA.getRTA_subnet_id());
	}

	@And("^User select connection on Route table Association resource$")
	public void User_select_connection_on_Route_table_Association_resource() throws Throwable {
	PageFactory.initElements(driver, AWSRouteTableAssnPageObject.class);
	CommonFunctionalityPageAction.selectConnection(driver,dnRTA.getRTA_connection());  
	}

	
	@Then("^User delete RTA environment and see message environment deleted sucessfully$")
    public void User_delete_RTA_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSRouteTableAssnSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);	
    }
	
    @Then("^User enter blank attribute values under for RTA$")
    public void User_enter_blank_attribute_values_under_for_RTA() throws Throwable {
	PageFactory.initElements(driver,  AWSRouteTableAssnPageObject.class);
	AWSRouteTableAssnPageAction.resourceAttributesPassingVariableRTA(driver);
    }
    
}


