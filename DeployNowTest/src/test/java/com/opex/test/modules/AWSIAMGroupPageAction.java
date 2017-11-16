package com.opex.test.modules;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSIAMGroupPageObject;


public class AWSIAMGroupPageAction extends SleepFunctionality{

	public static void selectIAMgroup(WebDriver driver) throws Exception{
		
		Log.info("User drag and drop iam group");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSIAMGroupPageObject.iam_group_resource);
		Reporter.log(" ");

	}

	public static void pathAttributeIamGroup(WebDriver driver, String path){
		
		Log.info("User enter the IAM Group path attribute");
		Actions action=new Actions(driver);
		action.moveToElement(AWSIAMGroupPageObject.iamGroup_path_attribute);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(path);
		action.click().build().perform();
		Reporter.log(" ");	

	}

}
