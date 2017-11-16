package com.opex.test.modules;


import org.json.simple.parser.JSONParser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;

public class AWSNetworkACLPageAction extends SleepFunctionality{
	
public static void dragdropNetworkACL(WebDriver driver) throws Exception{
		
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSNetworkACLPageObject.resource_NetworkACL);	
	}

public static void clickonegress(WebDriver driver,String egress) throws Exception{
	Log.info("Enter Json");
	JSONParser parser = new JSONParser();	
	Object jsn = parser.parse(egress);
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNetworkACLPageObject.resource_egressclick, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);

	Reporter.log("Json attribute is entered");
}

public static void clickoningress(WebDriver driver,String ingress) throws Exception{
	Log.info("enter the ingress value in textarea box");
	JSONParser parser = new JSONParser();	
	Object jsn = parser.parse(ingress);
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNetworkACLPageObject.resource_ingressclick, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
	Reporter.log("Json attribute is entered");

}
public static void enterNetworkACLvpc_id(WebDriver driver,String vpc_id) throws Exception{
	
	Log.info("Enter VPC_id Value");
	Actions action=new Actions(driver);
	action.moveToElement(AWSNetworkACLPageObject.resource_vpcidtextbox);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(vpc_id);
	action.build().perform();
	sleepTime(2000);
	Reporter.log("VPC_id is performed");
}

public static void enterNetworkACLdepends_on(WebDriver driver,String dependson) throws Exception{
	
	Log.info("Enter depends on Value");
	Actions action=new Actions(driver);
	action.moveToElement(AWSNetworkACLPageObject.resource_dependsontxtbox);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(dependson);
	action.build().perform();
	sleepTime(2000);
	Reporter.log("Depends on is performed");
}
public static void selectNetworkACLconnection(WebDriver driver,String connection) throws Exception{
	Log.info("Select connection Value");
	AWSNetworkACLPageObject.resource_connectionclick.click();
	Select Connection =new Select(AWSNetworkACLPageObject.resource_connectiontxtbox);
	for(int i=0;i< Connection.getOptions().size();i++)
	{
		String myConnection = Connection.getOptions().get(i).getText();
		if(myConnection.equalsIgnoreCase(connection))
		{
			Connection.selectByVisibleText(connection);
			break;
		}
	}
    Reporter.log("connection is performed");
}
public static void clickNetworkACLsubnet_id(WebDriver driver,String subnetid) throws Exception{
	Log.info("Enter subnetid Value");
	CommonFunctionalityPageAction.setArrayCommon(driver, subnetid, AWSNetworkACLPageObject.resource_subnetidclick, CommonFunctionalityPage.select_text_area_for_propagation, CommonFunctionalityPage.array_set_value);
	Reporter.log("subnetid operation is performed");

	
}

public static void resourceAttributesPassingVariableNACL(WebDriver driver) throws InterruptedException{
	Log.info("I fill the attributes for resource");
	AWSNetworkACLPageObject.resource_egressclick.click();
	Actions action=new Actions(driver);
	action.moveToElement(CommonFunctionalityPage.select_text_area_for_json);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(" ");
	action.build().perform();
	CommonFunctionalityPage.json_set_value.click();
	sleepTime(1000);
	AWSNetworkACLPageObject.resource_ingressclick.click();
	sleepTime(1000);
	Actions ac=new Actions(driver);
	ac.moveToElement(CommonFunctionalityPage.select_text_area_for_json);
	ac.click();
	ac.sendKeys(Keys.CONTROL + "a");
	ac.sendKeys(Keys.CONTROL + "x");
	ac.sendKeys(Keys.BACK_SPACE);
	ac.sendKeys(" ");
	ac.build().perform();
	sleepTime(1000);
	CommonFunctionalityPage.json_set_value.click();
	sleepTime(1000);
	Actions act=new Actions(driver);
	act.moveToElement(AWSNetworkACLPageObject.resource_vpcidtextbox);
	act.click();
	act.sendKeys(Keys.CONTROL + "a");
	act.sendKeys(Keys.CONTROL + "x");
	act.sendKeys(Keys.BACK_SPACE);
	act.sendKeys(" ");
	act.build().perform();
	sleepTime(1000);
	Reporter.log("Sign out is performed");	
}

public static void deployfail(WebDriver driver) {
	Log.info("Click on deploy button & check status");
	sleepTime(2000);
	WebDriverWait wait = new WebDriverWait(driver, 150);
	WebElement element = wait.until(
	ExpectedConditions.visibilityOf(AWSNetworkACLPageObject.deploy_button));
	element.click();
	
}
}

