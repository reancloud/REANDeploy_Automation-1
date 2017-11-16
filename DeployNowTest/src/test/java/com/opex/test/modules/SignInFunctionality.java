package com.opex.test.modules;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.LoginPage;


public class SignInFunctionality extends SleepFunctionality{

	public static void Execute(WebDriver driver,String username, String password) throws Exception{
		
		Log.info("Click action is performed on username and password text box" );

		LoginPage.email.sendKeys(username);

		Log.info(" is entered in UserName text box" );
		
		LoginPage.password.sendKeys(password);
		
		Log.info(" is entered in Password text box" );

		LoginPage.signin_button.click();
		
		sleepTime();
		
		Log.info("Click action is performed on Submit button");

		Reporter.log("SignIn Action is successfully perfomred");

	}
	
	
}
