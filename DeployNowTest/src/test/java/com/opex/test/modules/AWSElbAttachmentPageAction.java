package com.opex.test.modules;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSElbAttachmentPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSElbAttachmentPageAction extends SleepFunctionality{
	
   //method to Drag and drop resource from resource list
	public static void resrcDragDrop(WebDriver driver) throws Exception{
		Log.info("Drag drop resource output");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSElbAttachmentPageObject.resource_ELBA);
		Reporter.log("Drag &drop is performed");
	}

	//enter attribute elb for ELB Attachment
	public static void enterElb(WebDriver driver,String elb) {
		Log.info("entering elb attribute for ELB Attachmnet");
		Actions action=new Actions(driver);
			action.moveToElement(AWSElbAttachmentPageObject.resource_ELBAelb);
			action.click();
			
			action.sendKeys(Keys.CONTROL + "a");
			action.sendKeys(Keys.CONTROL + "x");
			action.sendKeys(Keys.BACK_SPACE);
			action.sendKeys(elb);
			action.build().perform();
			Reporter.log("elba elb instance entered");
	}

	//enter attribute instance for ELB Attachment
	public static void enterInstance(WebDriver driver, String elba_instance) {
		Log.info("entering instance attribute for ELB Attachmnet");
		Actions action=new Actions(driver);
			action.moveToElement(AWSElbAttachmentPageObject.resource_ELBAinstance);
			action.click();
			action.sendKeys(Keys.CONTROL + "a");
			action.sendKeys(Keys.CONTROL + "x");
			action.sendKeys(Keys.BACK_SPACE);
			action.sendKeys(elba_instance);
			action.build().perform();
		Reporter.log("elba instance entered");
	}

	//method to click on resource placed on canvas
	public static void clickOnResource(WebDriver driver,String Rname) throws Exception{
		Log.info("User click on resource");
		//WebElement element =driver.findElement(By.xpath(".//*[@id='v-9472']"));
		WebElement element =driver.findElement(By.xpath("//*[@class='resourceNode-text']//*[text()='"+Rname+"']"));
		sleepTime(2000);
		element =driver.findElement(By.xpath("//*[@class='resourceNode-text']//*[text()='"+Rname+"']"));
		element.click();
		sleepTime(3000);
		Reporter.log("Click action on resource is performed");
	}
	
	
	//method to deploy environment
	public static void deploy(WebDriver driver) throws InterruptedException {
		Log.info("Click on deploy button");
		sleepTime(2000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(CommonFunctionalityPage.deploy_button));
		element.click();
		Thread.sleep(1000);
		Log.info("after element.click");
		Reporter.log("Error message displayed");
		
	}

	//enter attribute ingree for security group for ELB Attachment resource
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
	
	//enter attribute to be searched in search bar
	public static void resourceDetailsAttributeSeachBar(WebDriver driver,String value){
		Log.info("User search attribute under resource details search box");
		//sleepTime();
		CommonFunctionalityPage.resource_details_attribute_search_bar.sendKeys(value);
		sleepTime(4000);
		Reporter.log("Search box is validated");
	}
	
	
	
}
