package com.opex.test.modules;

import org.json.simple.parser.JSONParser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSNATgatewayPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.AWSVpcPage;

public class AWSNATGatewayPageAction extends SleepFunctionality{
	
public static void dragdropNAT(WebDriver driver) throws Exception{
		
		Log.info("Select NAT gateway resource drag and drop on canvas resource  ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
		Reporter.log("NAT gateway resource drag and drop on canvas resource ");		
	}
public static void enterRouteTableVpcId(WebDriver driver,String Rtable_vpcid) throws Exception{
	AWSRouteTablePageAction.enterRouteTableVpcId(driver, Rtable_vpcid);

}
public static void clickRouteTableJson(WebDriver driver,String Rtable_json) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn = parser.parse(Rtable_json);
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNATgatewayPageObject.resource_routejson, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
}

public static void clickRTableJson(WebDriver driver,String Rtable_json) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn = parser.parse(Rtable_json);
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNATgatewayPageObject.resource_routejson, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
}

public static void clickNATResourceAndDrop(WebDriver driver) throws Exception{

	Log.info("Select NAT resource  ");
	//CommonFunctionalityPageAction.resourceDragDrop(driver,AWSNATgatewayPageObject.resource_clickNAT);
	AWSNATGatewayPageAction.resourceDragDrop(driver,AWSNATgatewayPageObject.resource_clickNAT);
	Reporter.log("Sign out is performed");

}

public static void enterallocation_id(WebDriver driver,String allocationid) throws Exception{
	Log.info("Enter Allocation id Value");
	Actions action=new Actions(driver);
	action.moveToElement(AWSNATgatewayPageObject.resource_allocation_id);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(allocationid);
	action.build().perform();
	sleepTime(2000);
	Reporter.log("Allocation id is performed");
}

public static void enterNetworkInterfaceId(WebDriver driver,String networkinterfaceid) throws Exception{
	Log.info("Enter networkInterfaceId Value");
	Actions actions = new Actions(driver);
	actions.moveToElement(AWSNATgatewayPageObject.resource_networkinterfaceid);
	actions.click();
	sleepTime(2000);
	Reporter.log("Network Interface Id is performed");
}

public static void enterPrivateip(WebDriver driver,String privateip) throws Exception{
	Log.info("Enter private ip Value");
	Actions actions = new Actions(driver);
	actions.moveToElement(AWSNATgatewayPageObject.resource_privateip);
	actions.click();
	actions.sendKeys(Keys.CONTROL + "a");	
	actions.sendKeys(Keys.BACK_SPACE);
	actions.sendKeys(privateip);
	actions.build().perform();
	sleepTime(2000);
	Reporter.log("Private ip is entered");
}
public static void enterPublicip(WebDriver driver,String publicip) throws Exception{
	Log.info("Enter public ip Value");
	Actions actions = new Actions(driver);
	actions.moveToElement(AWSNATgatewayPageObject.resource_publicip);
	actions.click();
	actions.sendKeys(Keys.CONTROL + "a");	
	actions.sendKeys(Keys.BACK_SPACE);
	actions.sendKeys(publicip);
	actions.build().perform();
	sleepTime(2000);
	Reporter.log("Public ip is entered");
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

	
}