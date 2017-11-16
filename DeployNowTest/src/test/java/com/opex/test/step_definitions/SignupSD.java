package com.opex.test.step_definitions;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.SignInAction;
import com.opex.test.modules.SignoutAction;
import com.opex.test.modules.SignupPageAction;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.LogoutPage;
import com.opex.test.pageobjects.SignupPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class SignupSD extends SuperUsedDefinition{

	public SignupSD()
	{
   	    super(); 	 
	}
   	 
		@When("^User click on create account link and should see create account page$")
		public void User_click_on_create_account_link_and_should_see_create_account_page() throws Throwable
		{
			 PageFactory.initElements(driver,SignupPage.class);
			 SignupPageAction.execute(driver);
			 
		}
		@And("^User enter valid data to create new account$")
		public void User_enter_valid_data_to_create_new_account() throws Throwable {
			 PageFactory.initElements(driver,SignupPage.class);
			 PageFactory.initElements(driver, LoginPage.class);
			 SignupPageAction.signupValidCreateAcc(driver);
		}
		@Then("^User click on sign up button and should see verification message$")
    	public void User_click_on_sign_up_button_and_should_see_verification_message() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupSignuplnk(driver);
    	}
		
    	@And("^User enter valid name$")
    	public void User_enter_valid_name() throws Throwable
    	{
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupName(driver);
   		 
    	}
    	@And("^User enter valid email$")
    	public void User_enter_valid_email() throws Throwable
    	{
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupEmail(driver);   		 
    	}
    	@And("^User enter valid password$")
    	public void User_enter_valid_password() throws Throwable
    	{
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupPassword(driver);   		 
    	}
    	@And("^User enter valid organization website url$")
    	public void User_enter_valid_organization_website_url() throws Throwable
    	{
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupUrl(driver);   		 
    	}
    	@Then("^User click on i agree checkbox$")
    	public void User_click_on_i_agree_checkbox() throws Throwable
    	{
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupTickchkbox(driver);   		 
    	}
    	@And("^User again click on i agree checkbox$")
    	public void User_again_click_on_i_agree_checkbox() throws Throwable
    	{
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.SignupUntickchkbox(driver);   		 
    	}
    	@And("^User click on terms and conditions$")
    	public void User_click_on_terms_and_conditions() throws Throwable
    	{
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupTermsconditions(driver);;   		 
    	}
    	@And("^click on close button in terms and condition$")
    	public void click_on_close_button_in_terms_and_condition() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupClosebutton(driver);   	 
    	}
   	 
   	 
    	@Then("^User click on scroll bar$")
    	public void User_click_on_scroll_bar() throws Throwable {
   		 
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupScrollbar(driver);   	 
    	}
    	@Then("^User click on cross close button in terms and condition$")
    	public void User_click_on_cross_close_button_in_terms_and_condition() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupCrossclosebutton(driver);
    	}
    	@Then("^User click on sign in link$")
    	public void User_click_on_sign_in_link() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupSigninlnk(driver);
    	}
    	
    	@And("^User enter blank space in name$")
    	public void User_enter_blank_space_in_name() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupBlankname(driver);
    	}
    	@Then("^User enter blank space in email$")
    	public void User_enter_blank_space_in_email() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupBlankemail(driver);
    	}
    	@Then("^User enter blank space in organization website url$")
    	public void User_enter_blank_space_in_organization_website_url() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupBlankOrgwebsite(driver);
    	}
    	@Then("^User enter blank space in password$")
    	public void User_enter_blank_space_in_password() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupBlankpassword(driver);
    	}
    	@Then("^User enter password$")
    	public void User_enter_password() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupEncryptedpwd(driver);
    	}
    	@Then("^User move mouse pointer on sign up button$")
    	public void User_move_mouse_pointer_on_close_button() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupSignupbtncolor(driver);
    	}
    	@Then("^User create new account with invalid credentials$")
    	public void User_create_new_account_with_invalid_credentials() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidCreateAcc(driver);
    	}
    	@Then("^User enter invalid name in capital$")
    	public void User_enter_invalid_name_in_capital() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidnamecapital(driver);
    	}
    	@Then("^User enter invalid name in small letters$")
    	public void User_enter_invalid_name_in_small_letters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidnamesmall(driver);
    	}
    	@Then("^User enter invalid name in special characters$")
    	public void User_enter_invalid_name_in_special_characters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidnamespecialchar(driver);
    	}
    	@Then("^User enter invalid name in digits$")
    	public void User_enter_invalid_name_in_digits() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidnamedigits(driver);
    	}
   	 
    	@Then("^User enter name minimum less than four character$")
    	public void  User_enter_name_minimum_less_than_four_character() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidnamemin(driver);
    	}
    	@Then("^User enter email in digits$")
    	public void User_enter_email_in_digits() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidemaildigits(driver);
    	}
    	@Then("^User enter email in special characters$")
    	public void User_enter_email_in_special_characters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidemailspecial(driver);
    	}
    	@Then("^User enter email as at the rate sign not present$")
    	public void User_enter_email_as_at_the_rate_sign_not_present() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidemailattheratesign(driver);
    	}
    	@Then("^User enter email as domain name not present$")
    	public void User_enter_email_as_domain_name_not_present() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidemaildomainname(driver);
    	}
    	@Then("^User enter email as dot not present$")
    	public void User_enter_email_as_dot_not_present() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidemaildot(driver);
    	}
    	@Then("^User enter email as username not present$")
    	public void User_enter_email_as_username_not_present() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidemailusername(driver);
    	}
    	@Then("^User enter email as minimum less than four characters$")
    	public void User_enter_email_as_minimum_less_than_four_characters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidemailmin(driver);
    	}
    	@Then("^User enter invalid password in digits$")
    	public void User_enter_invalid_password_in_digits() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidepassworddigits(driver);
    	}
    	@Then("^User enter invalid password in small letters$")
    	public void User_enter_invalid_password_in_small_letters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidepasswordsmall(driver);
    	}
    	@Then("^User enter invalid password in capital letters$")
    	public void User_enter_invalid_password_in_capital_letters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidepasswordcapital(driver);
    	}
    	@Then("^User enter invalid password in special characters$")
    	public void User_enter_invalid_password_in_special_characters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidepasswordspecial(driver);
    	}
    	@Then("^User enter invalid password minimum less than four character$")
    	public void User_enter_invalid_password_minimum_less_than_four_character() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidepasswordmin(driver);
    	}
    	@Then("^User enter invalid password invalid characters$")
    	public void User_enter_invalid_password_invalid_characters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidepasswordcombiantion(driver);
    	}
    	@Then("^User enter invalid organization website url minimum less than four character$")
    	public void User_enter_invalid_organization_website_url_minimum_less_than_four_character() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalideorganizationurlmin(driver);
    	}
    	@Then("^User enter organization website url in special characters$")
    	public void User_enter_organization_website_url_in_special_characters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalideorganizationurlspecial(driver);
    	}
    	@Then("^User enter organization website url in capital letters$")
    	public void User_enter_organization_website_url_in_capital_letters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalideorganizationurlcapital(driver);
    	}
    	@Then("^User enter invalid name as more than 64 characters$")
    	public void User_enter_invalid_name_as_more_than_64_characters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidnamemax(driver);
    	}
    	@Then("^User enter invalid email as more than 64 characters$")
    	public void User_enter_invalid_email_as_more_than_64_characters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidemailmax(driver);
    	}  
    	@Then("^User enter invalid password as more than 64 characters$")
    	public void User_enter_invalid_password_as_more_than_64_characters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.SignupInvalidepasswordmax(driver);
    	}
    	@Then("^User enter invalid organization website url as more than 64 characters$")
    	public void User_enter_invalid_organization_website_url_as_more_than_64_characters() throws Throwable {
   		 PageFactory.initElements(driver,SignupPage.class);
   		 SignupPageAction.signupInvalidorganizationurlmax(driver);
    	}  
       
}   	 


