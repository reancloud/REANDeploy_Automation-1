package com.opex.test.modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSEcsClusterPageObject;
import com.opex.test.pageobjects.AWSCloudwatchLogGroupPageObject;

public class AWSEcsClusterPageAction extends SleepFunctionality{
	
	public static void dragNDropEcsCluster(WebDriver driver) throws Exception{

		Log.info("User drag and drop Ecs Cluster to the environment");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSEcsClusterPageObject.ecsCluster_resource);
		Reporter.log(" ");

	}
	public static void ecsClustername(WebDriver driver,String name) throws Exception{
		
	Actions action=new Actions(driver);
	action.moveToElement(AWSEcsClusterPageObject.ecsClusterNameAttribute);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(name);
	action.build().perform();
	sleepTime();
	
	}

}
