package com.opex.test.modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSJavaPageObject;
import com.opex.test.pageobjects.AWSTomcatPageObject;

public class AWSJavaPageAction extends SleepFunctionality{
	
	public static void javaDragDrop(WebDriver driver) throws Exception{

		Log.info("Select package drag and drop on instance resource");
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSJavaPageObject.java_pkg);
		actions.click().build().perform();
		sleepTime();
		actions.dragAndDrop(AWSJavaPageObject.java_pkg,AWSJavaPageObject.click_resource_instance).build().perform();
		sleepTime();
		System.out.println("***Resource is draged to convas");
		Reporter.log("Sign out is performed");

	}
public static void clickjava_link(WebDriver driver) throws Exception{
		
		Log.info("I click on java link");
		sleepTime();
		AWSJavaPageObject.java_pkg_link.click();
		Reporter.log("Sign out is performed");
		
	}
public static void checkaccept_licence(WebDriver driver) throws Exception{
	
	Log.info("I check accept licence aggrement");
	sleepTime();
	WebElement element =AWSJavaPageObject.java_accept_licence;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void checkalternatives_priority(WebDriver driver) throws Exception{
	
	Log.info("I check alternatives_priority");
	sleepTime();
	WebElement element =AWSJavaPageObject.java_alternatives_priority;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void checkjdk_version(WebDriver driver) throws Exception{
	
	Log.info("I check jdk version");
	sleepTime();
	WebElement element =AWSJavaPageObject.java_jdk_version;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void checkopenjdk_version(WebDriver driver,String openjdk_version) throws Exception{
	
	Log.info("I check open jdk version");
	sleepTime();
	WebElement element =AWSJavaPageObject.java_openjdk_version;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	else
	{
		element.sendKeys(openjdk_version);	
	}
	Reporter.log("Sign out is performed");
	
}
public static void checkreset_alternatives(WebDriver driver) throws Exception{
	
	Log.info("I check reset_alternatives");
	sleepTime();
	WebElement element =AWSJavaPageObject.java_reset_alternatives;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void checkset_default(WebDriver driver) throws Exception{
	
	Log.info("I check set_default");
	sleepTime();
	WebElement element =AWSJavaPageObject.java_set_default;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void checkset_etc_environment(WebDriver driver) throws Exception{
	
	Log.info("I check set_etc environment");
	sleepTime();
	WebElement element =AWSJavaPageObject.java_set_etc_environment;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}
public static void checkuse_alt_suffix(WebDriver driver) throws Exception{
	
	Log.info("I check alt suffix");
	sleepTime();
	WebElement element =AWSJavaPageObject.java_use_alt_suffix;
	if (!element.getAttribute("value").equals("")) 
	{
	   System.out.println("Value is available");
	}
	Reporter.log("Sign out is performed");
	
}

}
