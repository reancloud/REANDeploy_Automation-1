package com.opex.test.modules;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSElbAttachmentPageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSOutputPage;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.AWSSecuritygroupPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.Philips_Usecase_PageObject;

public class Philips_Usecase_PageAction extends SleepFunctionality{

	public static void enterSubnetId(WebDriver driver, String pu_natgateway_subnetId) {
		Log.info("User enters subnet id for natgateway");
			Actions action=new Actions(driver);
			action.moveToElement(Philips_Usecase_PageObject.subnetid_natgateway);
			action.click();
			action.sendKeys(Keys.CONTROL + "a");
			action.sendKeys(Keys.CONTROL + "x");
			action.sendKeys(Keys.BACK_SPACE);
			action.sendKeys(pu_natgateway_subnetId);
			action.build().perform();
		Reporter.log("elba instance entered");
	}

	//method to enter ingress for security group
	public static void enterIngressForSG(WebDriver driver) throws Exception {
		Log.info("User entering ingress for sg");
		String currentURL =  driver.getCurrentUrl();
		System.out.println(currentURL);
		int Index1 = currentURL.indexOf("/");
		int Index2= currentURL.indexOf("#");
		System.out.println(Index1);
		System.out.println(Index2);
		//https://35.166.162.174/#/home/dnow/new
		String sub= currentURL.substring(Index1+2,Index2-1);
		System.out.println(sub);
		JSONParser parser = new JSONParser();	
		Object jsn = parser.parse("[\r\n  {\r\n    \"from_port\": 0,\r\n    \"to_port\": 0,\r\n    \"protocol\": \"-1\",\r\n    \"cidr_blocks\": [\r\n      \""+sub+"/32\"\r\n    ]\r\n  }\r\n]");
		CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNetworkACLPageObject.resource_ingressclick, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("ingress is performed");
		
		
	}
	
	//method to enter set json value
	public static void enterJson(WebDriver driver,String ingressJson) throws Exception{
		Log.info("Enter ingress json");
		JSONParser parser = new JSONParser();	
		Object jsn = parser.parse(ingressJson);
		System.out.println(jsn);
		CommonFunctionalityPageAction.setJsonCommon(driver, jsn, Philips_Usecase_PageObject.ingressJson_sg,CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("Enter ingress json for security group");
	}

	 //method to enter output resource json attribute
	public static void enterOutputJson(WebDriver driver, String outputJson) throws Exception {
		Log.info("Enter output json");
		//JSONParser parse=new  JSONParser();
		//Object jsn =parse.parse(outputJson);
	//	System.out.println(outputJson);
		CommonFunctionalityPageAction.setJsonCommon(driver, outputJson, Philips_Usecase_PageObject.click_outputjson, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("Entered output json for output");
	}
	
	//method to locate and click on output resource on canvas
	public static void clickOutputResource(WebDriver driver) throws Exception{	
		Log.info("Click on output Resource");
		sleepTime();
		Philips_Usecase_PageObject.resource_output_click.click();
		sleepTime();
		Reporter.log("Sign out is performed");
	}
	
//Method to save environment
	public static void saveResource(WebDriver driver) throws InterruptedException{
		Log.info("User save the resource");
		sleepTime(2000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_save_button));
		element.click();
	/*	Thread.sleep(3000);
		String save_msg="Environment saved successfully....";
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		WebElement ele = wait1.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.build().perform();
		String notificationMessage = ele.getText();
		Assert.assertEquals(save_msg, notificationMessage);
	*/	sleepTime(2000);
	}
	
	public static void security_vpc_id(WebDriver driver,String vpc) throws Exception{
		Log.info("Enter Securitygroup VPC id ");
		Actions action=new Actions(driver);
		action.moveToElement(Philips_Usecase_PageObject.securitygroup_vpc_id_PU);
		action.click();
		sleepTime(2000);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(vpc);
		action.build().perform();
		sleepTime();
		Reporter.log("Securitygroup  VPC id is performed");
	}
}
