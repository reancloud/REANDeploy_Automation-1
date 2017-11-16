package com.opex.test.modules;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;

import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSNetworkInterfacePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSNetworkInterfacePageAction extends SleepFunctionality
{
	public static void dragNDropNetInterface(WebDriver driver) throws Exception{

		Log.info("User drag and drop Network Interface to the environment");
		sleepTime();
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSNetworkInterfacePageObject.netInterface_resource);
		sleepTime();
		Reporter.log(" ");

	}

	public static void enterPrivateIpsForNetInterface(WebDriver driver, String privateIps) throws Exception{

		Log.info("Enter private ips attribute");
		sleepTime();
		AWSNetworkInterfacePageObject.netInterface_privateIps.click();
		sleepTime();
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSNetworkInterfacePageObject.netInterfaceArraySetText);
		actions.click();
		sleepTime();
		actions.sendKeys(privateIps);
		actions.build().perform();
		sleepTime();
		CommonFunctionalityPage.array_setValueButton.click();
		
		
		/*sleepTime();
		AWS_NetworkInterface_PageObject.netInterface_privateIps.click();
		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(CommonFunctionalityPage.setArrayTextArea);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		sleepTime();
		action.sendKeys(Keys.CONTROL + "x");
		sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		sleepTime();
		action.sendKeys(privateIps);
		action.build().perform();
		sleepTime();
		CommonFunctionalityPage.array_setValueButton.click();*/
		Reporter.log(" ");

	}
	public static void enterSubnetIdForNetInterface(WebDriver driver, String subnetId) throws Exception{
		
		Log.info("Enter subnet id attribute for network interface");
		sleepTime();
		AWSNetworkInterfacePageObject.netInterface_subnetId.clear();
		sleepTime();
		AWSNetworkInterfacePageObject.netInterface_subnetId.sendKeys(subnetId);
		sleepTime();
		Reporter.log(" ");

	}
	
	public static void enterDescriptionForNetInterface(WebDriver driver, String description) throws Exception{
		
		Log.info("Enter Description attribute for network interface");
		sleepTime();
		AWSNetworkInterfacePageObject.netInterfaceDescription.clear();
		sleepTime();
		AWSNetworkInterfacePageObject.netInterfaceDescription.sendKeys(description);
		sleepTime();
		Reporter.log(" ");

	}
	
public static void enterSourceDestCheckForNetInterface(WebDriver driver, String sourceDestCheck) throws Exception{
		
		Log.info("Enter Source Dest Check attribute for network interface");
		sleepTime();
		AWSNetworkInterfacePageObject.netInterfaceSourceDestCheck.clear();
		sleepTime();
		AWSNetworkInterfacePageObject.netInterfaceSourceDestCheck.sendKeys(sourceDestCheck);
		
		sleepTime();
		Reporter.log(" ");

	}

	public static void enterInvalidSubnetIdForNetInterface(WebDriver driver, String invalid) throws Exception{
		
		Log.info("Enter invalid subnet id attribute for network interface");
		sleepTime();
		AWSNetworkInterfacePageObject.netInterface_subnetId.sendKeys(invalid);
		sleepTime();
		Reporter.log(" ");

	}
	
	public static void enterSecurityGroupsForNetInterface(WebDriver driver, String securityGroups) throws Exception{

		Log.info("Enter Security Groups attribute for network interface");
		sleepTime();
		AWSNetworkInterfacePageObject.netInterfaceSecurityGroups.click();
		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(AWSNetworkInterfacePageObject.netInterfaceArraySetText);	
		action.click();
		sleepTime();
		action.sendKeys(securityGroups);
		action.build().perform();
		sleepTime();
		CommonFunctionalityPage.array_setValueButton.click();
		Reporter.log(" ");

	}
	
	public static void enterTagsForNetInterface(WebDriver driver, String json) throws Exception{
		
		Log.info("Enter tags attribute for network interface");
		sleepTime();
		sleepTime();
		CommonFunctionalityPageAction.setJsonCommon(driver, json, AWSNetworkInterfacePageObject.netInterfaceTags, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log(" ");
	}
	
	public static void enterAttachmentForNetInterface(WebDriver driver, String json) throws Exception{
		
		Log.info("Enter Attachment attribute for network interface");
		sleepTime();
		CommonFunctionalityPageAction.setJsonCommon(driver, json, AWSNetworkInterfacePageObject.netInterfaceAttachment, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log(" ");
	}
	

}

