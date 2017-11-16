package com.opex.test.modules;

import java.util.concurrent.TimeUnit;

import org.json.simple.parser.JSONParser;
import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSInputVariablePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.AWSOutputPage;
import com.opex.test.pageobjects.EnvironmentPage;


public class AWSOutputPageAction extends SleepFunctionality {
	
	public static void enterOutputJson(WebDriver driver,String json) throws Exception{
		Log.info("Enter Output Json");
		CommonFunctionalityPageAction.setJsonCommon(driver, json, AWSOutputPage.select_set_json_for_output, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("Output Json attribute is entered");
	}
	
	public static void clickResource(WebDriver driver) throws Exception{	
		Log.info("Click on output Resource");
		sleepTime();
		AWSOutputPage.click_resource_output.click();
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
	public static void resourceCrossBtnPleaseDelete(WebDriver driver) throws InterruptedException{
		Log.info("Click on cross button on resource");
		Actions action = new Actions(driver);
		action.moveToElement(AWSOutputPage.hoverOnRes,2,2).build().perform();
		AWSOutputPage.crossBtnResRT.click();
		sleepTime(3000);
		CommonFunctionalityPage.resource_delete_btn_attribute.click();
		sleepTime(1000);
		Reporter.log("Please delete is clicked");  
	}
	
	public static void resourceCrossBtnDontDelete(WebDriver driver) throws InterruptedException{
		Log.info("Click on cross button on resource");
		Actions action = new Actions(driver);
		action.moveToElement(AWSOutputPage.hoverOnRes,2,3).build().perform();
		AWSOutputPage.crossBtnResRT.click();
		sleepTime(4000);
		CommonFunctionalityPage.resource_dont_delete_btn_attribute.click();
		sleepTime(2000);
		Reporter.log("Dont delete is clicked");  
	}
	

	
}