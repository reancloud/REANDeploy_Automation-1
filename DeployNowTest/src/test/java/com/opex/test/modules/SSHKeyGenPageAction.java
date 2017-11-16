/*package com.opex.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.Auto_Scaling_Group_PageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.SshKeyGen_PageObject;

public class SshKeyGen_PageAction extends SleepFunctionality {
	
	
	public static void dragDropSshKeyGen(WebDriver driver) throws Exception{
		
		Log.info("Select sshkeygen resource drag and drop on canvas resource  ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,SshKeyGen_PageObject.resource_ssh_keygen);
		
		Reporter.log("Sign out is performed");		
	}
	public static void resourceNameEnter(WebDriver driver, String resourceName) 
	{
		Log.info("enter resource name");
		sleepTime();
		
		SshKeyGen_PageObject.enter_resource_name.sendKeys(resourceName);
		Reporter.log("resource name entered is performed");		
	}
public static void ResourceClickSshKeyGen(WebDriver driver,String sshname) throws Exception{
		
		Log.info("Click on Sshkeygen resource"); 
		WebElement element = driver.findElement(By.xpath("//*[contains(@id,'v-')]//*[text()='"+sshname+"']"));
	   
	    element.click();
	    Thread.sleep(4000);
	    sleepTime();
		Reporter.log("Sign out is performed");
		
	}
public static void enterSshKeyGenBlankName(WebDriver driver) throws InterruptedException {

	Log.info("I enter the SshKeyGen resource name as blank in the popup");
	sleepTime();

	try{
		CommonFunctionalityPageAction.enterResourceName(driver," ");
	}catch (Exception e) {
		e.printStackTrace();
	}
	sleepTime();
	Reporter.log("Sign out is performed");	

}
public static void resourceNameLinkSshKeyGen(WebDriver driver,String sshkeyname) throws InterruptedException{
    
	
	Log.info("I click on resource name link");
	sleepTime();
	Actions action=new Actions(driver);
	
	action.moveToElement(driver.findElement(By.linkText("ADN_Route_Record"))).click();
	WebElement element=driver.findElement(By.xpath("//div[@id='sidebar-wrapper-right']//*[contains(text(),'"+sshkeyname+"')]"));
	element.click();
	sleepTime();
	sleepTime();
	Reporter.log("Sign out is performed");	
}
public static void resourceCrossBtnPleaseDontDeleteSshKeyGen(WebDriver driver,String sshkeygenname) throws InterruptedException {

	Log.info("I click cross button on the Auto scaling group resource ");
	sleepTime();
	WebElement element=driver.findElement(By.xpath("//*[text()='"+sshkeygenname+"']//preceding::*[@class='body']"));
	Actions action = new Actions(driver);
	action.moveToElement(element,2,2).build().perform();
     sleepTime();
	WebElement element1=driver.findElement(By.xpath("//*[text()='"+sshkeygenname+"']/following::*[text()='X']"));
	element1.click();
	
	System.out.println("cross button click");
	sleepTime();
	CommonFunctionalityPage.resource_dont_delete_btn_attribute.click();
	sleepTime();
	Reporter.log("Sign out is performed");  


}
public static void resourceCrossBtnPleaseDeleteSshKeyGen(WebDriver driver,String sshkeygenname) throws InterruptedException {

	Log.info("I click cross button on the Auto Scaling group resource ");
	sleepTime();
	WebElement element=driver.findElement(By.xpath("//*[text()='"+sshkeygenname+"']//preceding::*[@class='body']"));
	Actions action = new Actions(driver);
	action.moveToElement(element,2,2).build().perform();
	sleepTime();
	WebElement element1=driver.findElement(By.xpath("//*[text()='"+sshkeygenname+"']/following::*[text()='X']"));
	element1.click();
	sleepTime();
	CommonFunctionalityPage.resource_delete_btn_attribute.click();
	sleepTime();
	Reporter.log("Sign out is performed");  


}
public static void resourceAttributesPassingVariable(WebDriver driver,String name) throws InterruptedException{

	Log.info("I fill the attributes for resource");
	sleepTime();
	sleepTime();
	SshKeyGen_PageObject.name_of_the_resource.click();
	sleepTime();
	SshKeyGen_PageObject.name_of_the_resource.clear();
	sleepTime();
	SshKeyGen_PageObject.name_of_the_resource.sendKeys(name);
	sleepTime();
				
}
public static void resourceAttributesBlank(WebDriver driver) throws Exception
{
	Log.info("Ensster blank attributes");
	try{
		resourceAttributesPassingVariable(driver,"");
	}catch (Exception e) {
		e.printStackTrace();
	}

}


}

*/