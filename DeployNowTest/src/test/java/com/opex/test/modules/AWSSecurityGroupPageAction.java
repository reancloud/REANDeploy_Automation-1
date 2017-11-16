package com.opex.test.modules;


import org.json.simple.parser.JSONParser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSSecuritygroupPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;

public class AWSSecurityGroupPageAction extends SleepFunctionality
{

	public static void dragdropsecuritygroup(WebDriver driver) throws Exception{

		Log.info("Select Securitygroup resource drag and drop on canvas resource  ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSSecuritygroupPageObject.resource_securitygroup);
		Reporter.log("Sign out is performed");		
	}

	public static void clickoningress(WebDriver driver,String ingress) throws Exception{
		/*String currentURL =  driver.getCurrentUrl();
		System.out.println(currentURL);
		int Index1 = currentURL.indexOf("/");
		int Index2= currentURL.indexOf("#");
		System.out.println(Index1);
		System.out.println(Index2);
		String sub= currentURL.substring(Index1+2,Index2-1);
		System.out.println( sub);*/
		JSONParser parser = new JSONParser();	
		//Object jsn = parser.parse("[\r\n  {\r\n    \"from_port\": 22,\r\n    \"to_port\": 22,\r\n    \"protocol\": \"tcp\",\r\n    \"cidr_blocks\": [\r\n      \""+sub+"/32\"\r\n    ]\r\n  }\r\n]");
		Object jsn = parser.parse(ingress);

		CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNetworkACLPageObject.resource_ingressclick, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
	}
	public static void clickonegress(WebDriver driver, String egress) throws Exception{
		JSONParser parser = new JSONParser();
		Object jsn = parser.parse(egress);
		sleepTime(2000);
		CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNetworkACLPageObject.resource_egressclick, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);

	}

	public static void enterSecuritygroupName(WebDriver driver,String SName) throws Exception{
		Log.info("Enter Securitygroup Name ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSSecuritygroupPageObject.resource_securitygroupname);
		action.click();
		sleepTime(2000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(SName);
		action.build().perform();
		Reporter.log("Securitygroup name is performed");
	}

	public static void security_dependson(WebDriver driver,String dependson) throws Exception{
		Log.info("Enter Securitygroup Depends on ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSSecuritygroupPageObject.securitygroup_dependson);
		action.click();
		sleepTime(2000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(dependson);
		action.build().perform();
		Reporter.log("Securitygroup Depends on is performed");
	}
	public static void security_description(WebDriver driver,String description) throws Exception{
		Log.info("Enter Securitygroup Description ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSSecuritygroupPageObject.securitygroup_description);
		action.click();
		sleepTime(2000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(description);
		action.build().perform();
		Reporter.log("Securitygroup Description  is performed");
	}
	public static void security_vpc_id(WebDriver driver,String vpc) throws Exception{
		Log.info("Enter Securitygroup VPC id ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSSecuritygroupPageObject.securitygroup_vpc_id);
		action.click();
		sleepTime(2000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(vpc);
		action.build().perform();
		Reporter.log("Securitygroup  VPC id is performed");
	}

	public static void enterinavalidSgroupName(WebDriver driver) throws Exception{
		Log.info("Enter Invalid Securitygroup Name ");
		sleepTime(2000);
		AWSSecurityGroupPageAction.enterSecuritygroupName(driver,"security1");
		Reporter.log("Invalid Securitygroup is performed");
	}


}
