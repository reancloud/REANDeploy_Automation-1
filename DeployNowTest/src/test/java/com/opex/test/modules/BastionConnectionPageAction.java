package com.opex.test.modules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.BastionHostPageObject;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.pageobjects.ConnectionPage;


public class BastionConnectionPageAction extends SleepFunctionality {
	
	
public static void LinkExecute(WebDriver driver) throws Exception{
		
	
	sleepTime(2000);
	sleepTime(2000);
	sleepTime(2000);
	
		Log.info("Click action is performed on Dropdown icon");
		
		sleepTime(2000);
		
		CommonPage.more_click.click();
		
		sleepTime(2000);
		
		Log.info("Click action is performed on Connection option");
		
		sleepTime(2000);
		
		sleepTime(2000);
		
		BastionHostPageObject.connection_link.click();
		
		sleepTime(2000);
		
				Reporter.log("Click action is performed on Dropdown icon ");
	}
	
	
	public static void ClickBastionConnection(WebDriver driver)
	{
		Log.info("click the bastion connection link ");
		BastionHostPageObject.bastion_link.click();
		sleepTime(); 
		sleepTime();
		Reporter.log("click action is completed");
	}
	
	
	public static void EnterBastionUser(WebDriver driver,String user)
	{
		Log.info("enter the user for bastion connection");
		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(BastionHostPageObject.bastion_user);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(user);
		action.click().build().perform();
		sleepTime();
		Reporter.log(" ");	
	}
	
	public static void EnterBastionHost(WebDriver driver,String host)
	{
		Log.info("enter the host for bastion connection");
		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(BastionHostPageObject.bastion_host);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(host);
		action.click().build().perform();
		sleepTime();
		Reporter.log(" ");	
	}
	
	public static void EnterBastionPort(WebDriver driver,String port)
	{
		Log.info("enter the port for bastion connection");
		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(BastionHostPageObject.bastion_port);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(port);
		action.click().build().perform();
		sleepTime();
		Reporter.log(" ");	
	}
	
	
	public static void EnterBastionKey(WebDriver driver,String key)
	{
		Log.info("enter the port for bastion connection");
		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(BastionHostPageObject.bastion_key);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(key);
		action.click().build().perform();
		sleepTime();
		Reporter.log(" ");	
	}
	
	
	public static void ClickSetParameterButton(WebDriver driver)
	{
		Log.info("enter the port for bastion connection");
		sleepTime();
		BastionHostPageObject.setparameter_button.click();
		sleepTime();
		Reporter.log(" ");	
	}
	
	public static void FillAttributes(WebDriver driver,String user,String host,String port,String key)
	{
		Log.info("user fill the null attributes");
		sleepTime();
		BastionHostPageObject.bastion_user.click();
		BastionHostPageObject.bastion_user.sendKeys(user);
		sleepTime();
		BastionHostPageObject.bastion_host.click();
		BastionHostPageObject.bastion_host.sendKeys(host);
		sleepTime();
		BastionHostPageObject.bastion_port.click();
		BastionHostPageObject.bastion_port.sendKeys(port);
		sleepTime();
		BastionHostPageObject.bastion_key.click();
		BastionHostPageObject.bastion_key.sendKeys(key);
		sleepTime();
		
		Reporter.log("action is completed");
		
	}
	
	public static void ClickCrossButton(WebDriver driver)
	{
		Log.info("cross button is performed");
		sleepTime();
		BastionHostPageObject.bastion_closebutton.click();
		sleepTime();
		
		Reporter.log("action is completed");
	}
	

}
