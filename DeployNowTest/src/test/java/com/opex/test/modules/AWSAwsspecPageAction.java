package com.opex.test.modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSExecutescriptpkgPageObject;
import com.opex.test.pageobjects.AWSAwsspecPageObject;

public class AWSAwsspecPageAction extends SignInFunctionality{

	
	public static void awsDragDrop(WebDriver driver) throws Exception{

		Log.info("Select package drag and drop on instance resource");
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSAwsspecPageObject.aws_pkg);
		actions.click().build().perform();
		sleepTime();
		actions.dragAndDrop(AWSAwsspecPageObject.aws_pkg,AWSAwsspecPageObject.click_resource_instance).build().perform();
		sleepTime();
		sleepTime();
		System.out.println("***Resource is draged to convas");
		Reporter.log("Sign out is performed");

	}
	public static void enterInstanceName(WebDriver driver) throws Exception{

		Log.info("I enter the Instance resource name in the popup");
		CommonFunctionalityPageAction.enterResourceName(driver,"Auto-instance");
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void clickResourceInstance(WebDriver driver){

		Log.info("I click on added resource");
		sleepTime();
		AWSAwsspecPageObject.click_resource_instance.click();
		sleepTime();
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void clickawsspec(WebDriver driver){

		Log.info("I click on added resource");
		sleepTime();
		AWSAwsspecPageObject.aws_pkg_link.click();
		sleepTime();
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void entersource_unameawsspec(WebDriver driver,String username){

		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(AWSAwsspecPageObject.source_username);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		sleepTime();
		action.sendKeys(Keys.CONTROL + "x");
		sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		sleepTime();
		action.sendKeys(username);
		action.build().perform();
		sleepTime();
	}
	public static void entersource_pwdawsspec(WebDriver driver,String password){

		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(AWSAwsspecPageObject.source_password);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		sleepTime();
		action.sendKeys(Keys.CONTROL + "x");
		sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		sleepTime();
		action.sendKeys(password);
		action.build().perform();
		sleepTime();
	}
	public static void entersource_urlawsspec(WebDriver driver,String url){

		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(AWSAwsspecPageObject.source_url);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		sleepTime();
		action.sendKeys(Keys.CONTROL + "x");
		sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		sleepTime();
		action.sendKeys(url);
		action.build().perform();
		sleepTime();
	}
}
