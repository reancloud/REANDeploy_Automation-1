package com.opex.test.modules;

import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.opex.test.entity.DeployNowSignUpUser;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.step_definitions.SuperUsedDefinition;


public class SignInAction extends SuperUsedDefinition{

	public static void execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		
		Log.info("Enter username and password" );
		LoginPage.email.sendKeys(map.get("username"));
		LoginPage.password.sendKeys(map.get("password"));
		Reporter.log("Username password entered successfully");

	}
public static void signinValidation(WebDriver driver) throws Exception{
		
		Log.info("Click action is perfromed on Sign in link" );
		//DeployNowSignUpUser signup_user_info = SignupPageAction.getUserInformation();
		//String s_username = signup_user_info.getUser_name();
		LoginPage.signin_button.click();
		try{
			WebElement element=driver.findElement(By.xpath("//*[@src='logo.png']"));
			//WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Welcome "+dnsignup.getUser_name()+"')]"));
		if(element.isDisplayed())
		{	
		//Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Welcome "+dnsignup.getUser_name()+"')]")).getText().matches("Welcome "+dnsignup.getUser_name()+""));
			Assert.assertTrue("Pass",true);
		}
		}catch(Exception ex)
		{
			Assert.fail("Login Unsuccessfull");
		}
		Reporter.log("SignIn Action is successfully perfomred");

	}
	
}