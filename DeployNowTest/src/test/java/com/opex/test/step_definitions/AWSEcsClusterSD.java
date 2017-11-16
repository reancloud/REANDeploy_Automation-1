package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSEcsClusterPageAction;
import com.opex.test.modules.AWSIAMPolicyPageAction;
import com.opex.test.modules.AWSNetworkInterfacePageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSEcsClusterPageObject;
import com.opex.test.pageobjects.AWSIAMPolicyPageObject;
import com.opex.test.pageobjects.AWSNetworkInterfacePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSEcsClusterSD extends SuperUsedDefinition{

	public AWSEcsClusterSD()
	{
		super();
	}
	
	
	@Then("^User create or search an environment for EcsCluster and see message as environment created successfully$")
	public void user_search_and_select_the_required_environment_for_EcsCluster() throws Throwable{
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSEcsClusterSD.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		String className = AWSEcsClusterSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);
	}
	
	@Then("^User delete the environment for EcsCluster and see message environment deleted successfully$")
	public void user_delete_the_environment_for_EcsCluster() throws Throwable {
		
		String className = AWSEcsClusterSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	
	@When("^User click EcsCluster resource and drag on the dashboard$")
	public void user_select_EcsCluster_resource_to_the_environment() throws Throwable{
		
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,AWSEcsClusterPageObject.class);
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSEcsClusterPageObject.ecsCluster_resource);
		//AWSEcsClusterPageAction.dragNDropEcsCluster(driver);
	}
	@And("^User enter the resource name for EcsCluster$")
	public void user_enter_the_resource_name_for_EcsCluster() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,dnEcsCluster.getEcsCluster_rname());
	}
	
	@Then("^User click on EcsCluster resource$")
	public void user_click_on_the_EcsCluster_resource() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.clickOnResource(driver,dnEcsCluster.getEcsCluster_rname());
		
	}
	
	@And("^User fill the connection for EcsCluster$")
	public void user_fill_the_connection_for_EcsCluster()throws Throwable{

		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver,dnEcsCluster.getEcsCluster_con());
	}
	@And("^User fill the dependsOn for EcsCluster$")
	public void user_fill_the_dependsOn_for_EcsCluster()throws Throwable{

		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dnEcsCluster.getEcsCluster_depends_on());
	}

	@And("^User fill the name for EcsCluster$")
	public void user_fill_the_name_for_EcsCluster()throws Throwable{

		PageFactory.initElements(driver, AWSIAMPolicyPageObject.class);
		AWSEcsClusterPageAction.ecsClustername(driver, dnEcsCluster.getEcsCluster_rname());
	}
	
	@And("^User enter the resource name as blank for EcsCluster$")
	public void user_enter_the_resource_name_as_blank_for_EcsCluster() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver,"  ");
	}
	
	
	
	@Then("^User enter the edit resource name for EcsCluster$")
	public void user_enter_the_edit_resource_name_for_EcsCluster() throws Throwable{
		
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceNameEditTextBox(driver, dnEcsCluster.getEcsCluster_rname());
	}
	
	@And("^User fill the name as blank for EcsCluster$")
	public void user_fill_the_name_as_blank_for_EcsCluster()throws Throwable{

		PageFactory.initElements(driver, AWSIAMPolicyPageObject.class);
		AWSEcsClusterPageAction.ecsClustername(driver,dnEcsCluster.getEcsCluster_blankData());
	}
	
	

}
