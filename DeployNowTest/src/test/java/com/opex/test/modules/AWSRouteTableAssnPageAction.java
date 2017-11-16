package com.opex.test.modules;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSRouteTableAssnPageObject;

public class AWSRouteTableAssnPageAction extends SleepFunctionality{


public static void dragdropRTA(WebDriver driver) throws Exception{
	CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRouteTableAssnPageObject.resource_RTA);
	
}

public static void enterRTAroute_id(WebDriver driver,String routeid) throws Exception{
	Log.info("Enter Route table id Value");
	Actions action=new Actions(driver);
	action.moveToElement(AWSRouteTableAssnPageObject.resource_RTArouteid);
	action.click();
	sleepTime(1000);
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(routeid);
	action.build().perform();
	Reporter.log("Route table id is performed");
}
public static void enterRTAsubnet_id(WebDriver driver,String subnet_id) throws Exception{
	Log.info("Enter Subnet id Value");
	Actions action=new Actions(driver);
	action.moveToElement(AWSRouteTableAssnPageObject.resource_RTAsubnetid);
	action.click();
	sleepTime(1000);
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(subnet_id);
	action.build().perform();
	Reporter.log("Subnet id is performed");
}

public static void resourceAttributesPassingVariableRTA(WebDriver driver) throws InterruptedException{

	Log.info("User fill the attributes for resource");
	Actions act=new Actions(driver);
	act.moveToElement(AWSRouteTableAssnPageObject.resource_RTArouteid);
	act.click();
	sleepTime(2000);
	act.sendKeys(Keys.CONTROL + "a");
	act.sendKeys(Keys.CONTROL + "x");
	act.sendKeys(Keys.BACK_SPACE);
	act.sendKeys(" ");
	act.build().perform();
	sleepTime(1000);
	Actions ac=new Actions(driver);
	ac.moveToElement(AWSRouteTableAssnPageObject.resource_RTAsubnetid);
	ac.click();
	sleepTime(2000);
	ac.sendKeys(Keys.CONTROL + "a");
	ac.sendKeys(Keys.CONTROL + "x");
	ac.sendKeys(Keys.BACK_SPACE);
	ac.sendKeys(" ");
	ac.build().perform();
	Reporter.log("Sign out is performed");	
}

}
