package com.opex.test.modules;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.AWSRoute53ZonePageObject;

public class AWSRoute53ZonePageAction extends SleepFunctionality{

	public static void dragdropRoute53_zone(WebDriver driver) throws Exception{
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRoute53ZonePageObject.resource_Route53zone);
	}

	public static void enter_Name(WebDriver driver,String Rname) throws Exception{
		Log.info("Enter Route 53 zone name Value");
		sleepTime(1000);
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53ZonePageObject.resource_Routezonename);
		action.click();
		sleepTime(1000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(Rname);
		action.build().perform();
		Reporter.log("Route 53 zone name is performed");
	}
	
	public static void enter_routezonevpcid(WebDriver driver,String vpc_id) throws Exception{
		Log.info("Enter Route 53 zone VPC id Value");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53ZonePageObject.resource_Routezonevpcid);
		action.click();
		sleepTime(1000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(vpc_id);
		action.build().perform();
		Reporter.log("Route 53 zone VPC id is performed");
	}
	public static void enter_comments(WebDriver driver,String comments) throws Exception{
		Log.info("Enter Route 53 zone Comment Value");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53ZonePageObject.resource_comments);
		action.click();
		sleepTime(1000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(comments);
		action.build().perform();
		Reporter.log("Route 53 zone Comment is performed");
	}
	public static void enter_delegation_set_id(WebDriver driver,String set_id) throws Exception{
		Log.info("Enter Route 53 zone delegation set id Value");
		
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53ZonePageObject.resource_delegation_set_id);
		action.click();
		sleepTime(1000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(set_id);
		action.build().perform();
		Reporter.log("Route 53 zone delegation set id is performed");
	}
	public static void enter_routezonevpcregion(WebDriver driver,String vpc_region) throws Exception{
		Log.info("Enter Route 53 zone VPC region Value");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53ZonePageObject.resource_Routezonevpcregion);
		action.click();
		sleepTime(1000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(vpc_region);
		action.build().perform();
		Reporter.log("Route 53 zone VPC region is performed");
	}
	public static void enter_tags(WebDriver driver,String tags) throws Exception{
		Log.info("Enter Route 53 zone tag Value");
		CommonFunctionalityPageAction.setJsonCommon(driver, tags, AWSRoute53ZonePageObject.resource_tags, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("Route 53 zone tag is performed");
	}


	public static void enter_blankName(WebDriver driver) throws Exception{
		Log.info("Enter Route 53 zone blank name Value");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53ZonePageObject.resource_Routezonename);
		action.click();
		sleepTime(1000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(" ");
		action.build().perform();
		Reporter.log("Route 53 zone name is performed");
	}
	
}