package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.entity.AutoScalingGroup;
import com.opex.test.modules.AutoScalingGroupPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AutoScalingGroupPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutoScalingGroupSD extends SuperUsedDefinition{
	
	public AutoScalingGroupSD()
	{
		super();
	}
	
	@Then("^I create or search an environment for Auto Scaling Group resource$")
	public void i_create_or_search_an_environment_for_Auto_Scaling_Group_resource() throws Throwable{
		String className = AutoScalingGroupSD .class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;		
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);

	}
	@When("^I select launch configuration resource to the environment$")
	public void i_select_launch_configuration_resource_to_the_environment() throws Throwable{
		PageFactory.initElements(driver,AutoScalingGroupPageObject.class);
		AutoScalingGroupPageAction.dragDropLaunchConfiguration(driver);
	}
	@Then("^i enter resource name of launch configuration$")
	public void i_enter_resource_name_of_launch_configuration() throws Throwable {
		PageFactory.initElements(driver, AutoScalingGroupPageObject.class);
		String launchname=dnauto.getLaunch_config_name();
	     System.out.println(launchname);
	    AutoScalingGroupPageAction.resourceNameEnter(driver,launchname );
	}
	 @Then("^i click on launch configuration resource$")
		public void i_click_on_launch_configuration_resource() throws Throwable {
			PageFactory.initElements(driver,  AutoScalingGroupPageObject.class);
			String launchname=dnauto.getLaunch_config_name();
			AutoScalingGroupPageAction.ResourceClickLaunchConfiguration(driver,launchname);
		}
	 @When("^I select auto scaling group resource to the environment$")
		public void i_select_auto_scaling_group_resource_to_the_environment() throws Throwable{
			PageFactory.initElements(driver,AutoScalingGroupPageObject.class);
			AutoScalingGroupPageAction.dragDropAutoScalingGroup(driver);
		}
		@Then("^i enter resource name of auto scaling group$")
		public void i_enter_resource_name_of_auto_scaling_group() throws Throwable {
			PageFactory.initElements(driver, AutoScalingGroupPageObject.class);
			String resourceName=dnauto.getAuto_scaling_name();
		     System.out.println(resourceName);
		     AutoScalingGroupPageAction.resourceNameEnter(driver,resourceName );
		}
		 @Then("^i click on auto scaling group resource$")
			public void i_click_on_auto_scaling_group_resource() throws Throwable {
				PageFactory.initElements(driver,  AutoScalingGroupPageObject.class);
				String autoscalingname=dnauto.getAuto_scaling_name();
				AutoScalingGroupPageAction.ResourceClickAutoScalingGroup(driver,autoscalingname);
			}
		 @When("^i enter image id of launch configuration$")
		 public void i_enter_image_id_of_launch_configuration(){
			 PageFactory.initElements(driver, AutoScalingGroupPageObject.class);
			 String imageid=dnauto.getImage_id();
			 AutoScalingGroupPageAction.enterImageId(driver,imageid);
		 }
		 @Then("^i enter instance type of launch configuration$")
		 public void i_enter_instance_type_of_launch_configuration(){
			 PageFactory.initElements(driver, AutoScalingGroupPageObject.class);
			 String instancetype=dnauto.getInstance_type();
			 AutoScalingGroupPageAction.enterInstanceType(driver,instancetype);
			 
		 }

      @Then("^i delete the created environment for auto scaling group$")
	public void i_delete_the_created_environment_for_auto_scaling_group() throws Throwable {
	String className = AutoScalingGroupSD .class.getSimpleName(); 	 	  
	String env_name = dnowEnv.getEnv_name()+className;		
	PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}
      @Then("^i enter launch configuration name of auto scaling group$")
		 public void i_enter_launch_configuration_name_of_auto_scaling_group(){
			 PageFactory.initElements(driver, AutoScalingGroupPageObject.class);
			 String launchname=dnauto.getLaunch_configuration();
			 AutoScalingGroupPageAction.enterLaunchConfigurationName(driver,launchname);
			 
		 }
      @Then("^i enter maxsize of auto scaling group$")
		 public void i_enter_maxsize_of_auto_scaling_group(){
			 PageFactory.initElements(driver, AutoScalingGroupPageObject.class);
			 String maxsize=dnauto.getMax_size();
			 AutoScalingGroupPageAction.enterMaxSize(driver, maxsize);
			 
		 }
      @Then("^i enter minsize of auto scaling group$")
		 public void i_enter_minsize_of_auto_scaling_group(){
			 PageFactory.initElements(driver, AutoScalingGroupPageObject.class);
			 String minsize=dnauto.getMin_size();
			 AutoScalingGroupPageAction.enterMinSize(driver, minsize);
			 
		 }
      @Then("^i enter availability zone of auto scaling group$")
		 public void i_enter_availability_zone_of_auto_scaling_group(){
			 PageFactory.initElements(driver, AutoScalingGroupPageObject.class);
			 String zone=dnauto.getAvailability_zones();
			 AutoScalingGroupPageAction.enterAvailabilityZone(driver, zone);
			 
		 }
      @Then("^I fill the attributes as blank under Auto Scaling Group resource section$")
		public void i_fill_the_attributes_as_blank_under_Auto_Scaling_Group_resource_section() throws Throwable{

			PageFactory.initElements(driver,  AutoScalingGroupPageObject.class);

			AutoScalingGroupPageAction.resourceAttributesBlank(driver);

		}
      @Then("^I enter the blank auto scaling group resource name$")
		public void i_enter_the_blank_auto_scaling_group_resource_name() throws Throwable{
			PageFactory.initElements(driver,AutoScalingGroupPageObject.class);
			AutoScalingGroupPageAction.enterAutoScalingGroupBlankName(driver);
		}
      @Then("^User click on the auto scaling group resource name link$")
		public void user_click_on_the_auto_scaling_group_resource_name_link() throws Throwable{

			PageFactory.initElements(driver, AutoScalingGroupPageObject.class);
			String autoscalingname=dnauto.getAuto_scaling_name();
			AutoScalingGroupPageAction.resourceNameLinkAutoScaling(driver, autoscalingname);

		}
      @And("^I dont delete the auto scaling group resource by clicking the cross button on resource$")
		public void i_dont_delete_the_auto_scaling_group_resource_by_clicking_the_cross_button_on_resource() throws Throwable {
			PageFactory.initElements(driver,CommonFunctionalityPage.class);
			String autoscalingname=dnauto.getAuto_scaling_name();
			AutoScalingGroupPageAction.resourceCrossBtnPleaseDontDeleteAutoScalingGroup(driver, autoscalingname);
		}
	  @When("^I  delete the auto scaling group resource by clicking the cross button on resource$")
		public void i_delete_the_auto_scaling_group_resource_by_clicking_the_cross_button_on_resource() throws Throwable {
			PageFactory.initElements(driver,AutoScalingGroupPageObject.class);
			String autoscalingname=dnauto.getAuto_scaling_name();
			AutoScalingGroupPageAction.resourceCrossBtnPleaseDeleteAutoScalingGroup(driver, autoscalingname);
		}
}
