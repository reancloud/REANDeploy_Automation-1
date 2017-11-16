package com.opex.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSCloudwatchLogGroupPageObject;
import com.opex.test.pageobjects.AWSCloudTrailPageObject;
import com.opex.test.pageobjects.EnvironmentPage;

public class AWSCloudtrailPageAction extends SleepFunctionality {
	
	public static void ResourceSelectCloudTrail(WebDriver driver) throws Exception
	{
	 Log.info("Cloudtrail resource is selected ");
	 sleepTime();
	 Actions action=new Actions(driver);
	 WebElement ele=driver.findElement(By.xpath("//div[@title='AWS Cloudtrail']"));
	 action.moveToElement(ele);
	 action.click().build().perform();
	 sleepTime();
	 action.dragAndDrop(AWSCloudTrailPageObject.resource_cloud_trail,EnvironmentPage.canvas).build().perform();
	 sleepTime();
	 Reporter.log("Sign out is performed");
	}
	public static void enterS3Name(WebDriver driver,String name) throws Exception{

		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[text()='s3_bucket_name']//following::input[1]"));
		action.moveToElement(ele);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(name);
		action.build().perform();
		sleepTime();
		

	}
}
