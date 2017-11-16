package com.opex.test.modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSCloudwatchLogGroupPageObject;
import com.opex.test.pageobjects.EnvironmentPage;

public class AWSCloudwatchLogGroupPageAction extends SleepFunctionality{
	
	public static void ResourceSelectCloud(WebDriver driver) throws Exception
	{
		Log.info("User drag Cloudwatch log group resource ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSCloudwatchLogGroupPageObject.resource_cloudwatch);    
		sleepTime(2000);
		Reporter.log(" ");
	 /*Log.info("Cloudwatch log group is selected ");
	 sleepTime();
	 Actions action=new Actions(driver);
	 action.moveToElement(AWSCloudwatchLogGroupPageObject.resource_cloudwatch);
	 action.click().build().perform();
	 sleepTime();
	 action.dragAndDrop(AWSCloudwatchLogGroupPageObject.resource_cloudwatch,EnvironmentPage.canvas).build().perform();
	 sleepTime();
	 Reporter.log("Sign out is performed");*/
	}
	
public static void Enter_retention_in_days(WebDriver driver,String days) throws Exception{

		Actions action=new Actions(driver);
		action.moveToElement(AWSCloudwatchLogGroupPageObject.retention_in_days);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(days);
		action.build().perform();
		sleepTime();

	}
public static void enterName(WebDriver driver,String name) throws Exception{

	Actions action=new Actions(driver);
	action.moveToElement(AWSCloudwatchLogGroupPageObject.name);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(name);
	action.build().perform();
	sleepTime();
	

}

}
