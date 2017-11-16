package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.ManageUsersPageAction;
import com.opex.test.modules.SignupPageAction;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.ManageUsersPage;
import com.opex.test.pageobjects.SignupPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Manage_Users_SD extends SuperUsedDefinition{
	public Manage_Users_SD()
	{
		super();
	}
	//User click on user icon
	@When("^User click on user icon$")
	public void user_click_on_user_icon() throws Throwable {
	PageFactory.initElements(driver,ManageUsersPage.class);
	ManageUsersPageAction.clickusers(driver);
	
	    
	}
	
    //User click on Manage users link
	@And("^User click on Manage users link$")
	public void user_click_on_Manage_users_link() throws Throwable {
		PageFactory.initElements(driver,ManageUsersPage.class);
		ManageUsersPageAction.clickmanageusers();
		
	    }
	
	//Enter Email id into search users box
	@When("^Enter Email id into search users box$")
	public void Enter_Email_id_into_search_users_box() throws Throwable {
		PageFactory.initElements(driver,ManageUsersPage.class);
		ManageUsersPageAction.clicksearchusers(driver);
		
	}
	
	//User click on Assign Roles in action column
	@When("^User click on Assign Roles in action column$")
	public void User_click_on_Assign_Roles_in_action_column() throws Throwable {
		PageFactory.initElements(driver,ManageUsersPage.class);
		ManageUsersPageAction.actions();

}
	//Assign roles to the users
	@Then("^Assign roles to the users$")
	public void Assign_roles_to_the_users() throws Throwable {
		PageFactory.initElements(driver,ManageUsersPage.class);
		ManageUsersPageAction.chkboxclick(driver);
	
}
	
	//Multiple roles assign to the users
	@Then("^Multiple roles assign to the users$")
	public void Multiple_roles_assign_to_the_users() throws Throwable {
		PageFactory.initElements(driver,ManageUsersPage.class);
		ManageUsersPageAction.mulchkboxclick(driver);
	
}
	
	//User click on Assign roles button
	@And("^User click on Assign roles button$")
	public void User_click_on_Assign_roles_button() throws Throwable{
		PageFactory.initElements(driver,ManageUsersPage.class);
		ManageUsersPageAction.assignbtn(driver);
	
		}
	
	//User click on Assign roles button
	@And("^User click on Assign roles button1$")
	public void User_click_on_Assign_roles_button1() throws Throwable{
		PageFactory.initElements(driver,ManageUsersPage.class);
		ManageUsersPageAction.assignbtn1(driver);
	
		}
	
	//Deselect all roles assign to the users
	@Then("^Deselect all roles assign to the users$")
	public void Deselect_all_roles_assign_to_the_users()throws Throwable{
		PageFactory.initElements(driver,ManageUsersPage.class);
		ManageUsersPageAction.mulchkboxclickdeselect(driver);
		
	}
	
	//User enter valid data to create new account1
	@And("^User enter valid data to create new account1$")
	public void User_enter_valid_data_to_create_new_account1()throws Throwable{
		PageFactory.initElements(driver,SignupPage.class);
		PageFactory.initElements(driver, LoginPage.class);
		ManageUsersPageAction.signupValidCreateAcc1(driver);
		
	}
	
	//user click on delete button to delete User
	@Then("^user click on delete button to delete User$")
	public void user_click_on_delete_button_to_delete_User()throws Throwable{
		PageFactory.initElements(driver,ManageUsersPage.class);
		ManageUsersPageAction.deleteUsers(driver);
		
	}
	
	//User click on sign up button
	@Then("^User click on sign up button$")
	public void user_click_on_sign_up()throws Throwable{
		PageFactory.initElements(driver,ManageUsersPage.class);
		ManageUsersPageAction.signupSignuplnk(driver);
	}
	
	
	
}
