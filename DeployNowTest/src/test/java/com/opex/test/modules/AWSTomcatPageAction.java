package com.opex.test.modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSExecutescriptpkgPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSJavaPageObject;
import com.opex.test.pageobjects.AWSTomcatPageObject;

public class AWSTomcatPageAction extends SleepFunctionality{
	
	public static void enterinstance_keyname(WebDriver driver,String key) throws Exception{

		
		//sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(AWSExecutescriptpkgPageObject.click_instance_key);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		//sleepTime();
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(key);
		action.build().perform();
		sleepTime();
		

	}
	public static void entervpcsec_keyname(WebDriver driver,String securitygroup) throws Exception{

		
		//sleepTime();
		AWSInstancePageObject.instance_resource_vpc_security_group_id.click();
		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(	AWSInstancePageObject.instance_resource_vpc_security_group_id_textArea);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		//sleepTime();
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(securitygroup);
		action.build().perform();
		sleepTime();
		AWSInstancePageObject.instance_resource_vpc_security_group_id_setValue_btn.click();
		sleepTime();
		//sleepTime();

	}
	public static void tomcatDragDrop(WebDriver driver) throws Exception{

		Log.info("Select package drag and drop on instance resource");
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSTomcatPageObject.tomcat_pkg);
		actions.click().build().perform();
		sleepTime();
		actions.dragAndDrop(AWSTomcatPageObject.tomcat_pkg,AWSTomcatPageObject.click_resource_instance).build().perform();
		sleepTime();
		System.out.println("***Resource is draged to convas");
		Reporter.log("Sign out is performed");

	}
	public static void clickResourceInstance(WebDriver driver){

		Log.info("I click on added resource");
		sleepTime();
		AWSTomcatPageObject.click_resource_instance.click();
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void clicktomcat_link(WebDriver driver) throws Exception{
		
		Log.info("I click on added resource");
		sleepTime();
		AWSTomcatPageObject.tomcat_pkg_link.click();
		sleepTime();
		Reporter.log("Sign out is performed");
		
	}
public static void checkbase_version(WebDriver driver) throws Exception{
		
		
		Log.info("I check base version");
		sleepTime();
		WebElement element =AWSTomcatPageObject.tomcat_baseversion;
		if (!element.getAttribute("value").equals("")) 
		{
		   System.out.println("Value is available");
		}
		Reporter.log("Sign out is performed");
	}
public static void check_deploy_manager_apps(WebDriver driver) throws Exception{
	
	Log.info("I check deploy manager apps");
	sleepTime();
	WebElement element =AWSTomcatPageObject.tomcat_deploy_manager_apps;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void check_port(WebDriver driver) throws Exception{
	
	
	Log.info("I check port");
	sleepTime();
	WebElement element =AWSTomcatPageObject.tomcat_port;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void check_run_base_instance(WebDriver driver) throws Exception{
	
	Log.info("I check run base instance");
	sleepTime();
	WebElement element =AWSTomcatPageObject.tomcat_run_base_instance;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void check_shutdown_port(WebDriver driver) throws Exception{
	
	Log.info("I check shut down port");
	sleepTime();
	WebElement element =AWSTomcatPageObject.tomcat_shutdown_port;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void check_ssl_max_threads(WebDriver driver) throws Exception{
	
	Log.info("I check ssl max threads");
	sleepTime();
	WebElement element =AWSTomcatPageObject.tomcat_ssl_max_threads;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void check_ssl_port(WebDriver driver) throws Exception{
	Log.info("I check ssl port");
	sleepTime();
	WebElement element =AWSTomcatPageObject.tomcat_ssl_port;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void check_tomcat_auth(WebDriver driver) throws Exception{
	Log.info("I check tomcat auth");
	sleepTime();
	WebElement element =AWSTomcatPageObject.tomcat_tomcat_auth;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void check_use_security_manager(WebDriver driver) throws Exception{
	Log.info("I check use security manager");
	sleepTime();
	WebElement element =AWSTomcatPageObject.tomcat_use_security_manager;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
}



}
