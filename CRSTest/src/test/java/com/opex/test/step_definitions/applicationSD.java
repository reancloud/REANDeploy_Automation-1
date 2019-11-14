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
/*   	 
		@Given("^User direct to REAN Demo application$")
		public void User_direct_to_REAN_Demo_application() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("url >"+url);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
*/
	   @Given("^User is directed to CRS application login page")
	   public void User_directed_to_CRS_Demo_application() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("url >"+url);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@When("User clicks on username field and enter username$")
		public void User_click_on_name_field_and_enter_username() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String className = applicationSD.class.getSimpleName();
			String username = dnowUser.getuser_name();
			AWSApplicationPageAction.enterUserName(driver, username);
		}
		@And("^User clicks on the password field and enter password$")
		public void user_enter_the_password() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String className = applicationSD.class.getSimpleName();
			String user_password = dnowUser.getuser_password();
			AWSApplicationPageAction.enterPassword(driver,user_password);
		}
		@And("^User click on login button$")
		public void user_click_on_login_button() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String className = applicationSD.class.getSimpleName();
			AWSApplicationPageAction.clicklogin(driver);
		}
		@Then("^Verify the presence of main title after login$")
		public void click_on_main_tile_post_login() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.verify_main_title_text_post_login(driver);
		 Thread.sleep(1000);
		}
		
		@When("User clicks on username field and enter invalid username$")
		public void User_click_on_name_field_and_enter_invalid_username() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String className = applicationSD.class.getSimpleName();
			String invalid_username = dnowUser.getinvalid_username();
			AWSApplicationPageAction.enterUserName(driver, invalid_username);
		}
		@And("^User clicks on the password field and enter invalid password$")
		public void user_enter_theinvalid_password() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String className = applicationSD.class.getSimpleName();
			String invalid_password = dnowUser.getinvalid_password();
			AWSApplicationPageAction.enterPassword(driver,invalid_password);
		}
		@Then("^Verify the presence of error message for invalid credentials$")
		public void verify_error_message_for_invalid_credentials() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.verify_error_message_for_invalid_credentials(driver);
		 Thread.sleep(1000);
		}
		@When("^User enters the Group code in the search box and press enter$")
		public void user_enter_the_groupcode_in_search_box() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String group_code = dnowUser.getgroup_code();
			AWSApplicationPageAction.enter_group_code(driver,group_code);
		}
		@Then("^Account overview for results matching the group code should only be displayed$")
		public void verify_search_results_should_match_group_code() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.verify_search_results_should_match_group_code(driver);
		 Thread.sleep(1000);
		}
		@When("^User enters the Account number in the search box and press enter$")
		public void user_enter_the_account_number_in_search_box() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String account_number = dnowUser.getaccount_number();
			AWSApplicationPageAction.enter_account_number(driver,account_number);
		}
		@Then("^Account overview for results matching the account number should only be displayed$")
		public void verify_search_results_should_match_account_code() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.verify_search_results_should_match_account_number(driver);
		 Thread.sleep(1000);
		}
		@When("^User selects AccountHolder option from Account menu$")
		public void select_account_holder_from_account_menu() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String className = applicationSD.class.getSimpleName();
			AWSApplicationPageAction.select_account_holder_from_account_menu(driver);
		}
		@Then("^Verify account holder information should be displayed$")
		public void verify_account_holder_main_title() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			AWSApplicationPageAction.verify_account_holder_main_title(driver);
		 Thread.sleep(1000);
		}
		@And("^User selects edit option for the first record and edits DOB field$")
		public void user_selects_edit_option_for_first_record() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String className = applicationSD.class.getSimpleName();
			String dob = dnowUser.getdob();
			AWSApplicationPageAction.select_edit_option_for_first_record_and_update_dob(driver, dob);
		}
		@Then("^verify the DOB field is updated$")
		public void verify_dob_field_is_updated() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			PageFactory.initElements(driver, AWSApplicationPageAction.class);
			PageFactory.initElements(driver,AWSApplicationPageObject.class);
			String dob = dnowUser.getdob();
			AWSApplicationPageAction.verify_dob_field_correctly_updated(driver, dob);
		 Thread.sleep(1000);
		}
		
		
		
}
