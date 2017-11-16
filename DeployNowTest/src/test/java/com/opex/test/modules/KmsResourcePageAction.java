package com.opex.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.KmsResourcePageObject;

public class KmsResourcePageAction extends SleepFunctionality {
	
	public static void ResourceSelectKmsKey(WebDriver driver) throws Exception
	{
	 Log.info("KmsKey resource is selected ");
	 sleepTime();
	 Actions action=new Actions(driver);
	 WebElement ele=driver.findElement(By.xpath("//div[@title='AWS KMS Key']"));
	 action.moveToElement(ele);
	 action.click().build().perform();
	 sleepTime();
	 action.dragAndDrop(KmsResourcePageObject.KMS_key,EnvironmentPage.canvas).build().perform();
	 sleepTime();
	 Reporter.log("Sign out is performed");
	}
	
	public static void ResourceSelectKmsAlias(WebDriver driver) throws Exception
	{
	 Log.info("KmsAlias resource is selected ");
	 sleepTime();
	 Actions action=new Actions(driver);
	 WebElement ele=driver.findElement(By.xpath("//div[@title='AWS KMS alias']"));
	 action.moveToElement(ele);
	 action.click().build().perform();
	 sleepTime();
	 action.dragAndDrop(KmsResourcePageObject.KMS_Alias,EnvironmentPage.canvas).build().perform();
	 sleepTime();
	 Reporter.log("Sign out is performed");
	}
	
	public static void entertargerid(WebDriver driver,String targetid) throws Exception{

		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[text()='target_key_id']//following::input[1]"));
		action.moveToElement(ele);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(targetid);
		action.build().perform();
		sleepTime();
		

	}
	
	public static void enterAliasName(WebDriver driver,String name) throws Exception{

		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[text()='name']//following::input[1]"));
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

