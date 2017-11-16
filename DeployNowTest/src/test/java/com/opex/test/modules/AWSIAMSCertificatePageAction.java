package com.opex.test.modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.AWSIAMSCertificatePage;


public class AWSIAMSCertificatePageAction extends SleepFunctionality{
	
public static void dragdropCertificate_resource(WebDriver driver) throws Exception{
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSIAMSCertificatePage.resource_server_certificate);
	
	}
public static void enterCertificateBody(WebDriver driver,String certificate_body) throws Exception{
	Log.info("Enter Certificate body Value");
	CommonFunctionalityPageAction.setText(driver, certificate_body, AWSIAMSCertificatePage.resource_server_certificatebody, CommonFunctionalityPage.select_text_area_for_settext, CommonFunctionalityPage.setvalue_for_settext);
	Reporter.log("Certificate body is performed");
}
public static void enterPrivatekey(WebDriver driver,String privatekey) throws Exception{
	Log.info("Enter Private key Value");
	CommonFunctionalityPageAction.setText(driver, privatekey, AWSIAMSCertificatePage.resource_privatekey, CommonFunctionalityPage.select_text_area_for_settext, CommonFunctionalityPage.setvalue_for_settext);
	Reporter.log("Private key is performed");
}
public static void enterCertificatechain(WebDriver driver,String certificate_chain) throws Exception{
	Log.info("Enter Certificate chain Value");
	CommonFunctionalityPageAction.setText(driver, certificate_chain, AWSIAMSCertificatePage.resource_certificatechain, CommonFunctionalityPage.select_text_area_for_settext, CommonFunctionalityPage.setvalue_for_settext);
	Reporter.log("Certificate chain is performed");
}
public static void enterName(WebDriver driver,String name){
	Log.info("Enter Name Value");
	Actions action=new Actions(driver);
	action.moveToElement(AWSIAMSCertificatePage.resource_name);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(name);
	action.build().perform();
	Reporter.log("Name is performed");
}
public static void enterName_prefix(WebDriver driver,String name_prefix){
	Log.info("Enter Name prefix Value");
	Actions action=new Actions(driver);
	action.moveToElement(AWSIAMSCertificatePage.resource_name_prefix);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(name_prefix);
	action.build().perform();
	Reporter.log("Name prefix is performed");
}
public static void enterPath(WebDriver driver,String path){
	Log.info("Enter path Value");
	Actions action=new Actions(driver);
	action.moveToElement(AWSIAMSCertificatePage.resource_path);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(path);
	action.build().perform();
	sleepTime();
	Reporter.log("path is performed");
}
}
