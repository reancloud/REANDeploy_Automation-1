package com.opex.test.modules;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.LogoutPage;

public class SignoutAction extends SleepFunctionality{

	public static void Execute(WebDriver driver) throws Exception{
		
		Log.info("Click action is performed on Dropdown icon");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//*[@id='simple-dropdown']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		element.click();
		sleepTime(1000);
		LogoutPage.signout_button.click();
		sleepTime(2000);
		try{
			if(LogoutPage.deploynow_text.isDisplayed())
			{	
			Assert.assertTrue(LogoutPage.deploynow_text.getText().matches("Welcome to REAN Deploy"));
			}
		   }catch(Exception ex)
			{
				Assert.fail("User failed to logout");
			}
		Reporter.log("Sign out is performed");

	}
	
	
}
