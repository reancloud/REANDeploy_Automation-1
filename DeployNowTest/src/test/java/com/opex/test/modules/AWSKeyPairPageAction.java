package com.opex.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSEBSVolumePageObject;
import com.opex.test.pageobjects.AWSKeyPairPageObject;
import com.opex.test.pageobjects.EnvironmentPage;

public class AWSKeyPairPageAction extends SleepFunctionality{
	
	

	public static void selectKeyPair(WebDriver driver) throws Exception{

		Log.info("I click on key pair to use");
		sleepTime();
		/*Actions action = new Actions(driver);
		(new Actions(driver)).dragAndDrop(AWSKeyPairPageObject.keyPair_resource, EnvironmentPage.canvas).perform();
		Reporter.log(" ");*/
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSKeyPairPageObject.keyPair_resource);

	}
	
	public static void enterKeyPairNameBlank(WebDriver driver) throws Exception{

		Log.info("I enter the key pair resource name as blank in the popup");
		CommonFunctionalityPageAction.enterResourceName(driver," ");
		sleepTime();
		Reporter.log(" ");
	}
	public static void enterKeyName(WebDriver driver,String key_name){
		
		Log.info("User enter key name attribute of resource");
		sleepTime();
		AWSKeyPairPageObject.keyPair_KeyName.sendKeys(key_name);
		Reporter.log(" ");
		
	}
	
	public static void enterPublicKey(WebDriver driver,String public_key){
		
		Log.info("User enter public key name attribute of resource");
		sleepTime();
		AWSKeyPairPageObject.keyPair_PublicKey.sendKeys(public_key);		
		Reporter.log(" ");
		
	}
	
	public static void enterInvalidPublicKey(WebDriver driver,String invalid_public_key2){
		
		Log.info("User enter invalid public key name attribute of resource");
		sleepTime();
		AWSKeyPairPageObject.keyPair_PublicKey.sendKeys(invalid_public_key2);
		Reporter.log(" ");
		
	}
	
	public static void ResourceLinkKeyPair(WebDriver driver,String Rname) throws Exception{

		Log.info("Click on key pair resource"); 
		WebElement element = driver.findElement(By.xpath("//div[@id='sidebar-wrapper-right']//*[contains(text(),'"+Rname+"')]"));
		element.click();
		sleepTime();
		sleepTime();
		Reporter.log(" ");

	}
}
