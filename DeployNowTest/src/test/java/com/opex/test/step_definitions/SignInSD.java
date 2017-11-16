package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;
import com.opex.test.modules.SignInFunctionality;
import com.opex.test.pageobjects.LoginPage;
import cucumber.api.java.en.When;

public class SignInSD extends SuperUsedDefinition{
	
	public SignInSD()
	{
		super();
	}
	

	@When("^User enters Credentials to LogIn Username as \"(.*)\" password as \"(.*)\"$")
	public void user_enters_credentials_to_LogIn_Username_as_password_as(String username, String password){
		
		PageFactory.initElements(driver, LoginPage.class);
		try {
			SignInFunctionality.Execute(driver, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}