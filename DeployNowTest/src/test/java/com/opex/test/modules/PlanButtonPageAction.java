package com.opex.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;


public class PlanButtonPageAction extends SleepFunctionality{


	public static void clickPlanButton(WebDriver driver) 
	{
		Log.info("click the plan button");
		sleepTime(5000);
		WebElement element=driver.findElement(By.xpath("//div[@ng-click='getDeploymentPlan()']"));
		Actions action=new Actions(driver);
		action.moveToElement(element);
		action.click().build().perform();
		//AWSNewPlanButtonPageObject.plan_button.click();
		sleepTime(5000);
		Reporter.log("click action is performed");		
	}
	public static void clickCrossPlanButton(WebDriver driver) 
	{
		Log.info("click the cross button in the plan window");
		sleepTime(5000);
		WebElement element=driver.findElement(By.xpath("//*[@id='deploymentPlanModal']/div/div/div[1]/button"));
		Actions action=new Actions(driver);
		action.moveToElement(element);
		action.click().build().perform();
		//AWSNewPlanButtonPageObject.plan_button.click();
		sleepTime(5000);
		Reporter.log("click action is performed");		
	}
	public static void clickClosePlanButton(WebDriver driver) 
	{
		Log.info("click the close button in the plan window");
		sleepTime(5000);
		WebElement element=driver.findElement(By.xpath("//*[@id='deploymentPlanModal']/div/div/div[3]/button"));
		Actions action=new Actions(driver);
		action.moveToElement(element);
		action.click().build().perform();
		//AWSNewPlanButtonPageObject.plan_button.click();
		sleepTime(5000);
		Reporter.log("click action is performed");		
	}

}