package com.opex.test.step_definitions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.modules.AWSInternetGatewayPageAction;
import com.opex.test.modules.AWSRoute53RecordPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSRouteTablePageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.SignInAction;
import com.opex.test.pageobjects.AWSIAMGroupPageObject;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.AWSRoute53RecordPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.AWSRDSPageObject;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSRouteTableSD extends SuperUsedDefinition{
    
    public AWSRouteTableSD()
    {
    	super();
    } 
    @Then("^User search or create environment for Route Table and see message as environment created successfully$")
    public void user_search_or_create_environment_for_Route_Table_and_see_message_as_environment_created_successfully() throws Throwable {
    	PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSRouteTableSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
    }
    @Then("^User delete Route Table environment and see message environment deleted sucessfully$")
    public void user_delete_Route_Table_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
    	String className = AWSRouteTableSD.class.getSimpleName();
    	String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
    }
    
    @Then("^User dragdrop vpc and enter mandatory attribute for Route Table$")
    public void user_dragdrop_vpc_and_enter_mandatory_attribute_for_Route_Table() throws Throwable {
    	PageFactory.initElements(driver,EnvironmentPage.class);
    	PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSVpcPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		CommonFunctionalityPageAction.enterResourceName(driver, dnRT.getRoutetable_vpc_resourceName());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver, dnRT.getRoutetable_vpc_resourceName());
		AWSVpcPageAction.vpcCidrBlock(driver, dnRT.getRoutetable_vpc_cidr());
    }

    @Then("^User dragdrop igw and enter mandatory attribute for Route Table$")
    public void user_dragdrop_igw_and_enter_mandatory_attribute_for_Route_Table() throws Throwable {
    	PageFactory.initElements(driver,EnvironmentPage.class);
    	PageFactory.initElements(driver,CommonFunctionalityPage.class);
    	PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
    	PageFactory.initElements(driver, AWSIAMGroupPageObject.class);
    	CommonFunctionalityPageAction.resourceDragDrop(driver,AWSInternetGatewayPageObject.IGW_resource);
		CommonFunctionalityPageAction.enterResourceName(driver, dnRT.getRoutetable_igw_resourceName());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver,dnRT.getRoutetable_igw_vpcid());
    }

    
    @When("^User click Route Table resource and drag on the dashboard$")
    public void user_click_Route_Table_resource_and_drag_on_the_dashboard() throws Throwable {
    	PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSRouteTablePageObject.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTablePageObject.resource_route_table);
    }

    @When("^User enter Route Table resource name$")
    public void user_enter_Route_Table_resource_name() throws Throwable {
    	PageFactory.initElements(driver, AWSRouteTablePageObject.class);
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnRT.getRoutetable_Rname());
    }
    
    @When("^User enter blank resource name for Route Table$")
    public void user_enter_blank_resource_name_for_Route_Table() throws Throwable {
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,"");
    }
    
    @When("^User click on routeTable resource$")
    public void User_click_on_routeTable_resource() throws Throwable {
    	PageFactory.initElements(driver, AWSRouteTablePageObject.class);
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnRT.getRoutetable_Rname());
	}

    @Then("^User enter vpc id for Route Table$")
    public void user_enter_vpc_id_for_Route_Table() throws Throwable {
    	PageFactory.initElements(driver, AWSRouteTablePageObject.class);
    	AWSRouteTablePageAction.enterRouteTableVpcId(driver, dnRT.getRoutetable_vpcID());
    }
    
    @Then("^User enter blank vpc id for Route table$")
    public void user_enter_blank_vpc_id_for_Route_table() throws Throwable {
    	PageFactory.initElements(driver, AWSRouteTablePageObject.class);
    	AWSRouteTablePageAction.enterRouteTableVpcId(driver,"");
    }

    @Then("^User enter depends on for Route Table$")
    public void user_enter_depends_on_for_Route_Table() throws Throwable {
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
    	CommonFunctionalityPageAction.enterDependsOnValue(driver,dnRT.getRoutetable_dependsOn());
    }

    @Then("^User select connection for Route Table$")
    public void user_select_connection_for_Route_Table() throws Throwable {
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
    	CommonFunctionalityPageAction.selectConnection(driver, dnRT.getRoutetable_connection());
    }

    @Then("^User set propagating vgws for Route Table$")
    public void user_set_propagating_vgws_for_Route_Table() throws Throwable {
    	PageFactory.initElements(driver, AWSRouteTablePageObject.class);
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
    	AWSRouteTablePageAction.enterPropagationArray(driver, dnRT.getRoutetable_propagating_vgws());
    }

    @Then("^User set route json for Route Table$")
    public void user_set_route_json_for_Route_Table() throws Throwable {
    	PageFactory.initElements(driver, AWSRouteTablePageObject.class);
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
    	AWSRouteTablePageAction.enterRouteJson(driver, dnRT.getRoutetable_route());
    }
    @Then("^User click on please delete if resource need to be deleted for Route Table$")
    public void user_click_on_please_delete_if_resource_need_to_be_deleted_for_Route_Table() throws Throwable {
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resource_pleasedelete(driver,dnRT.getRoutetable_Rname());
    }

    @Then("^User click on dont delete if resource need to be deleted for Route Table$")
    public void user_click_on_dont_delete_if_resource_need_to_be_deleted_for_Route_Table() throws Throwable {
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnRT.getRoutetable_Rname());
    }
    
}