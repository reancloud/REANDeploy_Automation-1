package com.opex.test.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSSubnetgroupPageObject;
import org.openqa.selenium.Keys;

public class AWSSubnetGroupPageAction extends SleepFunctionality{


public static void Dragdropsubnetgroup(WebDriver driver) throws Exception{
		
		Log.info("Select Subnegroup resource drag and drop on canvas");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSSubnetgroupPageObject.resource_subnetgroup);
		Reporter.log(" ");		
	}

public static void enterDescriptionForSubnetGroup(WebDriver driver, String description) throws Exception{
	
	Log.info("Enter description for subnet group");
	AWSSubnetgroupPageObject.resource_description.clear();
	AWSSubnetgroupPageObject.resource_description.sendKeys(description);
	sleepTime(1000);
	Reporter.log(" description entered");		
	
}

public static void enterSubnetIdForSubnetGroup(WebDriver driver, String subnetId) throws Exception{
	
	Log.info("Enter Subnet Id for subnet group");
	String myText = subnetId;
	myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));
	CommonFunctionalityPageAction.setArrayCommon(driver, myText, AWSSubnetgroupPageObject.resource_clicksetarray, CommonFunctionalityPage.select_text_area_for_propagation, CommonFunctionalityPage.array_set_value);
	Reporter.log(" Subnet Id entered");		
	
}

public static void deploy(WebDriver driver) {
	Log.info("Click on deploy button");
	sleepTime(2000);
	WebDriverWait wait = new WebDriverWait(driver, 150);
	WebElement element = wait.until(
	ExpectedConditions.visibilityOf(AWSSubnetgroupPageObject.deploy_button));
	element.click();
	
	
}

}