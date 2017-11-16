package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.ProfilePageAction;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.pageobjects.ProfilePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ProfileSD extends SuperUsedDefinition {
	  
	    public ProfileSD()
	    {
	    	super();
	    }
	 
	    
	    @When("^User go to the profile page$")
	    public void user_go_to_the_profile_page() throws Throwable {
	    	PageFactory.initElements(driver, ProfilePage.class);
	    	PageFactory.initElements(driver,CommonPage.class);
	    	ProfilePageAction.Execute(driver);


	    }
	    @When("^User enter the name in profile page$")
	    public void user_enter_the_name_in_profile_page() throws Throwable{
	    	PageFactory.initElements(driver, ProfilePage.class);
	    	ProfilePageAction.profileName(driver, dnProfileAttributes.getProfileName());
	    }
	    
	    @When("^User enter the email in profile page$")
	    public void User_enter_the_email_in_profile_page() throws Throwable{
	    	PageFactory.initElements(driver, ProfilePage.class);
	    	ProfilePageAction.profileEmail(driver, dnProfileAttributes.getProfileEmail());
	    }
	    @When("^User enter the company name in profile page$")
	    public void User_enter_the_company_name_in_profile_page() throws Throwable{
	    	PageFactory.initElements(driver, ProfilePage.class);
	    	ProfilePageAction.profileCompany(driver, dnProfileAttributes.getProfileCompany());
	    }
	    
	    @When("User enter friends email$")
	    public void User_enter_friends_email() throws Throwable{
	    	PageFactory.initElements(driver, ProfilePage.class);
	    	ProfilePageAction.friendsEmail(driver);
	    }
	    
	    @When("^User click update button from profile page$")
	    public void user_click_update_button_from_profile_page() throws Throwable {
	    	PageFactory.initElements(driver, ProfilePage.class);
	    	ProfilePageAction.performUpdateClick(driver);
	    }
	    
	    @Then("User click update button from profile page with blank space in name$")
	    public void user_click_update_button_from_profile_page_with_blank_space_in_name() throws Throwable {
	    	PageFactory.initElements(driver, ProfilePage.class);
	    	ProfilePageAction.performUpdateClick1(driver);
	    }
	    
	    @Then("^User refer a friend from profile page$")
	    public void User_refer_a_friend_from_profile_page() throws Throwable {
	    	PageFactory.initElements(driver, ProfilePage.class);
	        ProfilePageAction.performReferClick(driver);
	    }


	    @When("^User click on the toggle button from profile page$")
	    public void User_click_on_the_toggle_button_from_profile_page() throws Throwable {
	    	PageFactory.initElements(driver, ProfilePage.class);
	    	ProfilePageAction.perform_toggle_On(driver);
	    	}


	    @When("^User click off the toggle button from profile page$")
	    public void User_click_off_the_toggle_button_from_profile_page() throws Throwable {
	    	PageFactory.initElements(driver, ProfilePage.class);
	    	ProfilePageAction.perform_toggle_Off(driver);
	    	}
	   @Then("^User enter password in profile page$")
	   public void User_enter_password_in_profile_page() throws Throwable{
		   PageFactory.initElements(driver, ProfilePage.class);
		   ProfilePageAction.profilePassword(driver, dnProfileAttributes.getProfilePassword()); 
	   }
	   
	   @Then("^User enter re password in profile page$")
	   public void User_enter_re_password_in_profile_page() throws Throwable{
		   PageFactory.initElements(driver, ProfilePage.class);
		   
	   }
	   @And("^User click on the refer friend image$")
	   public void User_click_on_the_refer_friend_image() throws Throwable{
		   PageFactory.initElements(driver, ProfilePage.class);
		   ProfilePageAction.referFriendImage(driver);
		   
	   }
	   @Then("^User check if password is disabled profile page$")
	   public void User_check_if_password_is_disabled_profile_page() throws Throwable{
		   PageFactory.initElements(driver, ProfilePage.class);
		   ProfilePageAction.profilePasswordDisabled(driver);
	   }
	   @And("^User check if re password is disabled profile page$")
	   public void User_check_if_re_password_is_disabled_profile_page() throws Throwable{
		   PageFactory.initElements(driver, ProfilePage.class);
		   ProfilePageAction.profileRePasswordDisabled(driver);
	   }
	   @Then("^User check if password is enabled profile page$")
	   public void User_check_if_password_is_enabled_profile_page() throws Throwable{
		   PageFactory.initElements(driver, ProfilePage.class);
		   ProfilePageAction.profilePasswordEnabled(driver);
	   }
	   /*@And("^I check if re password is enabled profile page$")
	   public void i_check_if_re_password_is_enabled_profile_page() throws Throwable{
		   PageFactory.initElements(driver, ProfilePage.class);
		   //ProfilePageAction.profileRePasswordEnabled(driver);
		   ProfilePageAction.typeRetriveAndVerifyPassword(driver,dnProfileAttributes.getProfileRePassword());
		  
	   }*/
	   @Then("^User check mouse hover functionality on update button$")
	   public void User_check_mouse_hover_functionality_on_update_button()throws Throwable{
		   PageFactory.initElements(driver, ProfilePage.class);
		   ProfilePageAction.profileUpdateButtonColor(driver);
	   }
	   @Then("^User check mouse hover functionality on refer button$")
	   public void User_check_mouse_hover_functionality_on_refer_button()throws Throwable{
		   PageFactory.initElements(driver, ProfilePage.class);
		   ProfilePageAction.profileReferButtonColor(driver);
	   }
	   @When("^User enter blank data in name text box in profile page$")
	   public void User_enter_blank_data_in_name_text_box_in_profile_page()throws Throwable{
		   PageFactory.initElements(driver, ProfilePage.class);
		   ProfilePageAction.profileBlankName(driver);
	   }
	   @When("^User validate the email in profile page$")
	   public void User_validate_the_email_in_profile_page(){
		   PageFactory.initElements(driver, ProfilePage.class);
		   ProfilePageAction.isValidEmailAddress();
	   }
	   @When("^User validate the friends email in profile page$")
	   public void User_validate_the_friends_email_in_profile_page(){
		   PageFactory.initElements(driver, ProfilePage.class);
		   ProfilePageAction.isValidFriendsEmailAddress();
	   }
	   
	   @Then("^User check if re password is enabled profile page$")
	   public void user_check_if_re_password_is_enabled_profile_page() throws Throwable {
		   PageFactory.initElements(driver, ProfilePage.class);
		   //ProfilePageAction.profileRePasswordEnabled(driver);
		   ProfilePageAction.typeRetriveAndVerifyPassword(driver,dnProfileAttributes.getProfileRePassword());

	   }
	}


