package com.opex.test.modules;

import java.util.concurrent.TimeUnit;


import org.json.simple.parser.JSONParser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSIAMRolePage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSVpcPage;

public class AWSELBPageAction extends SleepFunctionality{
	public static void ResourceDragDrop(WebDriver driver) throws Exception{
		Log.info("Drag drop resource output");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSELBPageObject.resource_elb);
		Reporter.log("Drag &drop is performed");
	}
	
	public static void enterListnerJson(WebDriver driver,String listnerJson) throws Exception{
		Log.info("Enter valid listner");
		//sleepTime();
		//sleepTime();
		JSONParser parser = new JSONParser();	
		Object jsn = parser.parse(listnerJson);
		CommonFunctionalityPageAction.setJsonCommon(driver,jsn,AWSELBPageObject.click_listener_set_json, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("Valid listner is entered");
	}
	
	public static void enterAccessLog(WebDriver driver,String accesslog) throws Exception{
		Log.info("Enter access log");
		CommonFunctionalityPageAction.setJsonCommon(driver, accesslog,AWSELBPageObject.click_accessLog_set_json, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("Access log is entered.");
	}
	
	public static void crossZoneLodBalancing(WebDriver driver,String crossZoneLooadBalancing) throws Exception{
		
		Log.info("Select crossZoneLodBalancing ");
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSELBPageObject.enter_crossZoneLoadBalancing);
		actions.click();		
		actions.sendKeys(Keys.CONTROL + "a");
		actions.sendKeys(Keys.CONTROL + "x");
		actions.sendKeys(Keys.BACK_SPACE);
		actions.sendKeys(crossZoneLooadBalancing);
		actions.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
		//sleepTime();
		Reporter.log("Select crossZoneLodBalancing");
	}
	public static void healthCheck(WebDriver driver,String healthCheck) throws Exception{
		Log.info("Enter health checkup ");
		CommonFunctionalityPageAction.setJsonCommon(driver, healthCheck,AWSELBPageObject.click_healthCheck_set_json, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("Health checkup is entered");
	}
	public static void idleTimeout(WebDriver driver,String idleTimeout) throws Exception{
		Log.info("Select idleTimeout value ");
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSELBPageObject.enter_idleTimeout);
		actions.click();		
		actions.sendKeys(Keys.CONTROL + "a");
		actions.sendKeys(Keys.CONTROL + "x");
		actions.sendKeys(Keys.BACK_SPACE);
		actions.sendKeys(idleTimeout);
		actions.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
		//sleepTime();
		Reporter.log("Select crossZoneLodBalancing");
	}
	public static void instances(WebDriver driver,String instances) throws Exception{
		Log.info("Set instance ");
		CommonFunctionalityPageAction.setArrayCommon(driver, instances, AWSELBPageObject.click_instances_setArray, CommonFunctionalityPage.select_text_area_for_propagation,CommonFunctionalityPage.array_set_value);
		Reporter.log("Instance value is entered");
	}
	public static void internal(WebDriver driver,String internal) throws Exception{
		Log.info("Enter internal for elb");
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSELBPageObject.enter_internal);
		actions.click();		
		actions.sendKeys(Keys.CONTROL + "a");
		actions.sendKeys(Keys.CONTROL + "x");
		actions.sendKeys(Keys.BACK_SPACE);
		actions.sendKeys(internal);
		actions.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
		//sleepTime();
		Reporter.log("Internal is entered");
	}
	
	public static void securityGroups(WebDriver driver,String securityGroups) throws Exception{
		Log.info("Enter Security group.");
		CommonFunctionalityPageAction.setArrayCommon(driver, securityGroups, AWSELBPageObject.click_subnetgroups_setArray, CommonFunctionalityPage.select_text_area_for_propagation,CommonFunctionalityPage.array_set_value);
		Reporter.log("Security group is entered");
	}
	
	public static void tags(WebDriver driver,String tags) throws Exception{
		Log.info("Enter tag");
		CommonFunctionalityPageAction.setJsonCommon(driver,tags,AWSELBPageObject.click_tags_set_json, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("Tag is entered");
	}
		
	
}