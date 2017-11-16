/*package com.opex.test.modules;

import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWS_Instance_PageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.GCE_Support_page;
import com.opex.test.pageobjects.ProviderPage1;

public class GCE_Support_PageAction extends SleepFunctionality {
	
	
	
	public static void selectGceInstance(WebDriver driver){

		Log.info("I click on gce instance to use");
		sleepTime();
		Actions action = new Actions(driver);
		(new Actions(driver)).dragAndDrop(GCE_Support_page.gce_instance_resource, EnvironmentPage.canvas).perform();
		sleepTime();
		sleepTime();
		Reporter.log("Sign out is performed");

	}
	public static void enterGceInstanceName(WebDriver driver,String name) throws Exception{

		Log.info("I enter the Gce Instance resource name in the popup");
		
		CommonFunctionalityPageAction.enterResourceName(driver,name);
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void clickResourceGceInstance(WebDriver driver,String name){

		Log.info("I click on gce resource");
		sleepTime();
		WebElement element=driver.findElement(By.xpath("//*[contains(@id,'v-')]//*[text()='"+name+"']"));
		element.click();
		sleepTime();
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	
	public static void clickExistingVmResource(WebDriver driver,String name){

		Log.info("I click on Existing resource");
		sleepTime();
		WebElement element=driver.findElement(By.xpath("//*[contains(@id,'v-')]//*[text()='"+name+"']"));
		element.click();
		sleepTime();
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
public static void enterdisk(WebDriver driver, String disk) throws Exception{
		
		Log.info("I enter the disk for gce Instance resource");
		sleepTime();
		GCE_Support_page.gce_instance_disk_json.click();
		sleepTime();
			Actions action=new Actions(driver);
			action.moveToElement(GCE_Support_page.disk_details_textarea);
			action.click();
			action.sendKeys(Keys.CONTROL + "a");
			sleepTime();
			action.sendKeys(Keys.CONTROL + "x");
			sleepTime();
			action.sendKeys(Keys.BACK_SPACE);
			sleepTime();
			action.sendKeys(disk);
			action.build().perform();
			sleepTime();
			GCE_Support_page.click_value_button.click();
			sleepTime();
			Reporter.log("disk details is passed");

		}
public static void selectInputVariableResource(WebDriver driver){

	Log.info("I click on input variable resource to use");
	sleepTime();
	Actions action = new Actions(driver);
	(new Actions(driver)).dragAndDrop(GCE_Support_page.input_variable, EnvironmentPage.canvas).perform();
	sleepTime();
	sleepTime();
	Reporter.log("Sign out is performed");

}
public static void selectOutputVariableResource(WebDriver driver){

	Log.info("I click on output variable resource to use");
	sleepTime();
	Actions action = new Actions(driver);
	(new Actions(driver)).dragAndDrop(GCE_Support_page.output_variable, EnvironmentPage.canvas).perform();
	sleepTime();
	sleepTime();
	Reporter.log("Sign out is performed");

}
public static void enterHost(WebDriver driver,String host){

	Log.info("I enter the host for existing cirtual resource");
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(GCE_Support_page.enter_host);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys(host);
	action.build().perform();
	sleepTime();
	Reporter.log("Sign out is performed");

}
			
		
	
public static void enterMachineType(WebDriver driver, String type) throws Exception{
	
	Log.info("I enter the machine for gce Instance resource");
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(GCE_Support_page.gce_instance_machine_type);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	//sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	//sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	//sleepTime();
	action.sendKeys(type);
	//	sleepTime();
	action.moveToElement(GCE_Support_page.machine_type);
	action.click().build().perform();
		sleepTime();
	Reporter.log("machine type action is performed");
}
public static void enterzone(WebDriver driver, String zone) throws Exception{
	
	Log.info("I enter the Zone for gce Instance resource");
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(GCE_Support_page.gce_instance_zone);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	//sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	//sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	//sleepTime();
	action.sendKeys(zone);
	//	sleepTime();
	action.moveToElement(GCE_Support_page.zone_type);
	
	action.click().build().perform();
	sleepTime();
	Reporter.log("zone type action is performed");
}
public static void enterNetworkInterface(WebDriver driver, String network) throws Exception{
	
	Log.info("I enter the network for gce Instance resource");
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(GCE_Support_page.gce_instance_network_json);
	action.click();
	
	sleepTime();
	
	action.moveToElement(GCE_Support_page.network_details_textarea);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys(network);
	action.build().perform();
	sleepTime();
	GCE_Support_page.click_value_button.click();
	sleepTime();
	Reporter.log("network interface details is passed");
	
}
public static void packageAddToGceInstance(WebDriver driver,String instancename)
{
	Log.info("package is added to gce instance");
	sleepTime();
	 element=driver.findElement(By.xpath(".//a[text()='Packages']"));
	element.click();
	//CommonFunctionalityPage.package_link.click();
	Actions action=new Actions(driver);
	GCE_Support_page.click_package_link.click();
	
	sleepTime();
	WebElement element=driver.findElement(By.xpath(".//*[@title='mysql-install']"));
	
	WebElement element1=driver.findElement(By.xpath("//*[text()='"+instancename+"']//preceding::*[@class='body']"));
	
	
	action.dragAndDrop(element, element1).build().perform();
}
public static void selectExistingVmResource(WebDriver driver){

	Log.info("I click on Existing vm resource to use");
	sleepTime();
	Actions action = new Actions(driver);
	(new Actions(driver)).dragAndDrop(GCE_Support_page.Existing_vm, EnvironmentPage.canvas).perform();
	sleepTime();
	sleepTime();
	Reporter.log("Sign out is performed");

}

public static void enterExistingVmResourceName(WebDriver driver,String name) throws Exception{

	Log.info("I enter the Gce Instance resource name in the popup");
	
	CommonFunctionalityPageAction.enterResourceName(driver,name);
	sleepTime();
	Reporter.log("Sign out is performed");	
}

}

*/