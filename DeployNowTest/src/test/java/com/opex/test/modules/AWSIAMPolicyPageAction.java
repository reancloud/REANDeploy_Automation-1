package com.opex.test.modules;


import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSIAMPolicyPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;


public class AWSIAMPolicyPageAction extends SleepFunctionality{

	public static void selectIAMpolicy(WebDriver driver) throws Exception{

		Log.info("User drag and drop iam policy to the environment");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSIAMPolicyPageObject.iam_policy_resource);
		Reporter.log(" ");
	}
	
	public static void enterIAMPolicyAttributeDescription(WebDriver driver,String description) throws Exception{
		
		Log.info("Enter description attribute for IAM Policy");
		Actions action=new Actions(driver);
		action.moveToElement(AWSIAMPolicyPageObject.resource_attribute_description);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(description);
		action.click().build().perform();	
		Reporter.log(" ");	
	}
	public static void enterIAMPolicyAttributePath(WebDriver driver,String path) throws Exception{
		
		Log.info("Enter path attribute");
		Actions action=new Actions(driver);
		action.moveToElement(AWSIAMPolicyPageObject.iamPolicy_path_attribute);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(path);
		action.click().build().perform();	
		Reporter.log(" ");	
	}
	
	public static void enterIAMPolicyAttributePolicy(WebDriver driver,String policy) throws Exception{
		
		Log.info("Enter policy attribute for IAM Policy");
		sleepTime();
		AWSIAMPolicyPageObject.attribute_iampolicy.click();
		sleepTime(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSIAMPolicyPageObject.policy_setValueTextArea);
		actions.click();
		actions.sendKeys(policy);
		actions.build().perform();
		sleepTime(3000);
		CommonFunctionalityPage.string_setValueButton.click();
		Reporter.log(" ");
		
	}
	public static void enterIAMPolicyBlankName(WebDriver driver, String blank) throws Exception{

		Log.info("User enter the IAM Policy resource name as blank in the popup");
		CommonFunctionalityPageAction.enterResourceName(driver,blank);
		Reporter.log(" ");
	}
	
}
