package com.opex.test.modules;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.EnvironmentPage;
public class AWSVpcPageAction extends SleepFunctionality{

		
	public static void vpcCidrBlock(WebDriver driver,String cidr) throws Exception{
		Log.info("Enter CidrBlock Value");
		sleepTime(1000);
		Actions action=new Actions(driver);
		action.moveToElement(AWSVpcPage.enter_cidr_block_value);
		action.click();
		//sleepTime();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(cidr);
		action.build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");
	}
	
	

	public static void selectEnableClasssicLink(WebDriver driver, String eClassicLink) throws Exception{
		Log.info("Select enable classic link");
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSVpcPage.select_enableClassicLink);
		actions.click();		
		actions.sendKeys(Keys.CONTROL + "a");
		actions.sendKeys(Keys.CONTROL + "x");
		actions.sendKeys(Keys.BACK_SPACE);
		actions.sendKeys(eClassicLink);
		actions.build().perform();
		//actions.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");
	}

	public static void selectEnableDnsHostnamesValue(WebDriver driver, String dhostname) throws Exception{
		Log.info("Select enable Dns Host names ");
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSVpcPage.select_enable_dns_hostnames);
		actions.click().build().perform();
		actions.sendKeys(Keys.CONTROL + "a");
		actions.sendKeys(Keys.CONTROL + "x");
		actions.sendKeys(Keys.BACK_SPACE);
		actions.sendKeys(dhostname);
		actions.build().perform();
		//actions.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
		Reporter.log("Sign out is performed");
	}

	public static void selectEnableDnsSupportValue(WebDriver driver,String dSupport) throws Exception{

		Log.info("Select enable Dns Support Value ");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSVpcPage.select_enable_dnssupport_value);
		actions.click().build().perform();
		sleepTime(3000);
		actions.sendKeys(Keys.CONTROL + "a");
		actions.sendKeys(Keys.CONTROL + "x");
		actions.sendKeys(Keys.BACK_SPACE);
		actions.sendKeys(dSupport);
		actions.build().perform();
		//actions.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");
	}
	
	public static void enterInstanceTenancyValue(WebDriver driver,String itenancy) throws Exception{
		Log.info("Enter Instance Tenancy Value");
		AWSVpcPage.enter_instance_tenancy_value.sendKeys(itenancy);
		sleepTime();
		Reporter.log("Sign out is performed");
	}
	
	public static void resourceDragDrop(WebDriver driver,WebElement rDragDrop) throws Exception{
		int xOffSet = 250;
		int yOffset = 150;
		Log.info("Select resource drag and drop on canvas");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",rDragDrop);
		Actions actions = new Actions(driver);
		actions.moveToElement(rDragDrop);
		actions.click().build().perform();
		sleepTime(1000);
		actions.clickAndHold(rDragDrop).moveToElement(EnvironmentPage.canvas, xOffSet, yOffset).release(null).build().perform();
		sleepTime(1000);
		//sleepTime();
		Reporter.log("Resource drag drop successfully");
		
		    
}



	public static void deploy(WebDriver driver) {
		Log.info("Click on deploy button");
		sleepTime(2000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(AWSVpcPage.deploy_button));
		element.click();
		
		
	}

}
