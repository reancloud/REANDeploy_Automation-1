package com.opex.test.step_definitions;
import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.AWSFlowLogPageAction;
import com.opex.test.modules.AWSIAMRolePageAction;
import com.opex.test.modules.AWSCloudwatchLogGroupPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.pageobjects.AWSFlowLogPageObject;
import com.opex.test.pageobjects.AWSIAMRolePage;
import com.opex.test.pageobjects.AWSCloudwatchLogGroupPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSVpcPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSFlowLogSD extends SuperUsedDefinition{

	public AWSFlowLogSD()
	{
		super();
	}

	@Then("^User create or search an environment for Flow Log and see message as environment created successfully$")
	public void user_create_or_search_an_environment_for_Flow_Log() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSFlowLogSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}

	@Then("^User delete the environment for Flow log and see message environment deleted successfully$")
	public void user_delete_the_environment_for_Flow_Log() throws Throwable {
		String className = AWSFlowLogSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}

	@When("^User click Flow log resource and drag on the dashboard$") 
	public void user_select_flow_log_resource_to_the_environment() throws Throwable{

		PageFactory.initElements(driver, AWSFlowLogPageObject.class);
		AWSFlowLogPageAction.selectFlowLog(driver);
	}

	@And("^User enter Flow Log resource name$")
	public void user_enter_Flow_Log_resource_name() throws Throwable{

		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnFlowLog.getFlowLog_rname());
	}

	@Then("^User click on Flow Log resource$")
	public void user_click_on_Flow_Log_resource() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnFlowLog.getFlowLog_rname());
	}

	@And("^User enter the connection attribute for Flow Log$")
	public void user_enter_the_connection_attribute_for_FlowLog() throws Throwable{

		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver,dnFlowLog.getFlowLog_con());

	}

	@And("^User enter the depends on attribute for Flow Log$")
	public void user_enter_the_depends_on_attribute_for_FlowLog() throws Throwable{

		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnFlowLog.getFlowLog_depends_on());

	}

	@And("^User enter iam role name for Flow Log$")
	public void user_enter_the_iamRoleName_attribute_for_FlowLog() throws Throwable{

		PageFactory.initElements(driver, AWSFlowLogPageObject.class);
		AWSFlowLogPageAction.enterIamRoleArnFlowLog(driver,dnFlowLog.getFlowLog_iamRoleArn());
	}

	@And("^User enter log group name for Flow Log$")
	public void user_enter_logGroup_attribute_for_FlowLog() throws Throwable{

		PageFactory.initElements(driver, AWSFlowLogPageObject.class);
		AWSFlowLogPageAction.enterLogGroupNameFlowLog(driver,dnFlowLog.getFlowLog_logGroupName());
	}
	@And("^User enter traffic type for Flow Log$")
	public void user_enter_trafficType_attribute_for_FlowLog() throws Throwable{

		PageFactory.initElements(driver, AWSFlowLogPageObject.class);
		AWSFlowLogPageAction.enterTrafficTypeFlowLog(driver, dnFlowLog.getFlowLog_trafficType());
	}
	@And("^User enter vpc id for Flow Log$")
	public void user_enter_the_vpcId_attribute_for_FlowLog() throws Throwable{

		PageFactory.initElements(driver, AWSFlowLogPageObject.class);
		AWSFlowLogPageAction.enterVpcIdFlowLog(driver, dnFlowLog.getFlowLog_vpcId());
	}
	@And("^User enter eni id for Flow Log$")
	public void user_enter_the_eniId_attribute_for_FlowLog() throws Throwable{

		PageFactory.initElements(driver, AWSFlowLogPageObject.class);
		AWSFlowLogPageAction.enterEniIdFlowLog(driver, dnFlowLog.getFlowLog_eniId());
	}
	@And("^User enter subnet id for Flow Log$")
	public void user_enter_subnetId_attribute_for_FlowLog() throws Throwable{

		PageFactory.initElements(driver, AWSFlowLogPageObject.class);
		AWSFlowLogPageAction.enterSubnetIdFlowLog(driver, dnFlowLog.getFlowLog_subnetId());
	}

	@When("^User click VPC resource and drag on the dashboard for for Flow Log$")
	public void create_vpc_resource_and_enter_attributes_of_vpc_for_Flow_Log() throws Throwable{

		PageFactory.initElements(driver,AWSVpcPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnFlowLog.getFlowLog_VPC_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.clickOnResource(driver, dnFlowLog.getFlowLog_VPC_rname());
		AWSVpcPageAction.vpcCidrBlock(driver, dnFlowLog.getFlowLog_VPC_vpcId());
		CommonFunctionalityPageAction.saveResource(driver);
		

	}

	@When("^User click cloud watch resource and drag on the dashboard for for Flow Log$")
	public void create_cloud_watch_resource_and_enter_attributes_of_cloud_watch_for_Flow_Log() throws Throwable{
		PageFactory.initElements(driver,AWSCloudwatchLogGroupPageObject.class);
		AWSCloudwatchLogGroupPageAction.ResourceSelectCloud(driver);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnFlowLog.getFlowLog_CloudWatch_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		CommonFunctionalityPageAction.saveResource(driver);
		//CommonFunctionalityPageAction.clickOnResource(driver, dnFlowLog.getFlowLog_CloudWatch_rname());
	}

	@When("^User click IAM Role resource and drag on the dashboard for for Flow Log$")
	public void create_IAM_role_resource_and_enter_attributes_of_IAM_role_for_Flow_Log() throws Throwable{
		PageFactory.initElements(driver,AWSIAMRolePage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSIAMRolePage.resource_iamrole);
		CommonFunctionalityPageAction.enterResourceName(driver,dnFlowLog.getFlowLog_IAMRole_IAMRole_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		//CommonFunctionalityPageAction.clickOnResource(driver, dnFlowLog.getFlowLog_IAMRole_IAMRole_rname());
		PageFactory.initElements(driver, AWSIAMRolePage.class);
		AWSIAMRolePageAction.enterAssumeRolePolicy(driver, dnFlowLog.getFlowLog_IAMRole_assumeRolePolicy());
		CommonFunctionalityPageAction.saveResource(driver);
		//AWSFlowLogPageAction.enterAssumeRolePolicy(driver, dnFlowLog.getFlowLog_IAMRole_assumeRolePolicy());
		//CommonFunctionalityPageAction.saveResource(driver);


	}
}