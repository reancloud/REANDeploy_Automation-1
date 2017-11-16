package com.opex.test.modules;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSDependsOnPageObject;
import com.opex.test.pageobjects.AWSEBSVolumePageObject;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSDependsOnPageAction extends SleepFunctionality{

	public static void clickOnDropdownOfEnv(WebDriver driver) throws Exception{
		Log.info("User click on the env dropdown for Depends On");
		EnvironmentPage.environment_dropdown.click();
		Reporter.log(" ");
	}
	public static void enterAttributesForSubnet(WebDriver driver,String cidr, String vpc_id) throws Exception{
		Log.info("User enter the cidr block and vpc id of subnet for Depends On");
		
		Actions action=new Actions(driver);
		action.moveToElement(AWSSubnetPageObject.resource_cidrblock);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(cidr);
		action.click().build().perform();
		sleepTime(2000);
		
		Actions action1=new Actions(driver);
		action1.moveToElement(AWSSubnetPageObject.resource_vpcid);
		action1.click();
		action1.sendKeys(Keys.CONTROL + "a");
		action1.sendKeys(Keys.CONTROL + "x");
		action1.sendKeys(Keys.BACK_SPACE);
		action1.sendKeys(vpc_id);
		action1.click().build().perform();
		Reporter.log(" ");
	}


	public static void DependsOn_Rname(WebDriver driver,String Rname) throws Exception{
		Log.info("User enter the Depends On name in the popup");
		CommonFunctionalityPageAction.enterResourceName(driver,Rname);
		Reporter.log("Sign out is performed");	
	}
	
	public static void ResourceClickDependsOn(WebDriver driver,String Rname) throws Exception{
		Log.info("User Click on Depends On resource"); 
		WebElement element = driver.findElement(By.xpath("//*[contains(@id,'v-')]//*[text()='"+Rname+"']"));
		element.click();
		Reporter.log("Sign out is performed");
	}

	public static void enterDependsOnAttribute(WebDriver driver,String env) throws Exception{
		Log.info("User enter the Depends On attribute");
	
		Actions action=new Actions(driver);
		action.moveToElement(AWSDependsOnPageObject.dependsOn_attribute);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(env);
		action.click().build().perform();
		Reporter.log("Sign out is performed");	
	}

	public static void enterInvalidDependsOnAttribute(WebDriver driver,String invalid_public_key2){
		Log.info("User enter invalid DependsOnAttribute of resource");
		AWSDependsOnPageObject.dependsOn_attribute.clear();
		AWSDependsOnPageObject.dependsOn_attribute.sendKeys(invalid_public_key2);
		Reporter.log("Sign out is performed");

	}
	
	public static void searchEnvironmentVPCDependson(WebDriver driver,String env) throws Exception{
		Log.info("User enter the Depends On VPC attribute");
		EnvironmentPage.environment_dropdown.click();
		EnvironmentPage.environment_dropdown.clear();
		sleepTime(1000);
		EnvironmentPage.environment_dropdown.sendKeys(env);
		sleepTime(1000);
		try {	
			WebElement element = driver.findElement(By.xpath("//*[@name='env-search']/following::span[contains(text(),'"+env+"')]"));
			
			if (element.isDisplayed()) {
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", element);
				element.click();
				sleepTime(2000);
			}
		    }
			catch (Exception e)
		    {
			  Log.error("Exception while searching Environment object",e);
				
			}
	
            }
}