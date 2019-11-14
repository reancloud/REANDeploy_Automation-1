package com.opex.test.step_definitions;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.opex.test.module.AWSApplicationPageAction;
import com.opex.test.pageobjects.AWSApplicationPageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class applicationSD extends SuperUsedDefinition{

	public applicationSD()
	{
   	    super(); 	 
	}
   	 
		@Given("^User direct to REAN Demo application$")
		public void User_direct_to_REAN_Demo_application() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("url >"+url);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
   
		@When("^User click on name field and enter the name$")
		public void User_click_on_name_field_and_enter_the_name() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String className = applicationSD.class.getSimpleName();
			String user_name = dnowUser.getuser_name();
			AWSApplicationPageAction.enterUserName(driver, user_name);
		}
		@And("^User click on age field and enter the age$")
		public void user_enter_the_age_of_the_user() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String className = applicationSD.class.getSimpleName();
			String user_age = dnowUser.getuser_age();
			AWSApplicationPageAction.enterUserAge(driver,user_age);
		}
		@And("^User click on salary field and enter the salary$")
		public void user_enter_the_salary_of_the_user() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String className = applicationSD.class.getSimpleName();
			String user_salary = dnowUser.getuser_salary();
			AWSApplicationPageAction.enterUserSalary(driver,user_salary);
		}
		@Then("^User click on Add button and should see message User created successfully$")
		public void click_the_add_button_on_the_webpage() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.clickAddButton(driver);
		 Thread.sleep(1000);
		}
		@Then("^User click on Edit button$")
		public void User_click_on_Edit_button() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.clickEditButton(driver);
	    } 
		@And ("^User edit the User information$")
		public void User_edit_the_User_information()throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			String className = applicationSD.class.getSimpleName();
			String user_salary = dnowUser.getuser_salary();
			AWSApplicationPageAction.editUserSalary(driver,user_salary);
		}
		@Then("^User click on Update button and should see message User Updated successfully$")
		public void User_click_on_Update_button_and_should_see_message_User_Updated_successfully()throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.clickUpdateButton(driver);	
		}
		@Then("^User click on Update button and should not get message User Updated successfully$")    
		public void User_click_on_Update_button_and_should_not__get_message_User_Updated_successfully()throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.clickUpdateButton(driver);	
		}
		@Then("^User click on Remove button and user should get removed successfully$")
		public void User_click_on_Remove_button_and_user_should_get_removed_successfully()throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.clickRemoveButton(driver);
		}
		@Then("^User click on Reset Form button and User information reset successfully$")
		public void User_click_on_Reset_Form_button_and_User_information_reset_successfully()throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.clickresetformButton(driver);
		}
}
