package com.opex.test.modules;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSEBSVolumePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;


public class AWSEBSVolumePageAction extends SleepFunctionality{



	public static void selectEBSvolume(WebDriver driver) throws Exception{

		Log.info("User drag and drop ebs volume to the environment");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSEBSVolumePageObject.ebsVolume_resource);
		sleepTime(2000);
		Reporter.log(" ");

	}

	public static void enterTagsJsonEBSvolume(WebDriver driver, String json) throws Exception{

		Log.info("User enter json tags for ebs volume");
		CommonFunctionalityPageAction.setJsonCommon(driver, json, AWSEBSVolumePageObject.ebsVolume_resource_tags,
		CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("");

	}


	public static void enterSizeEBSvolume(WebDriver driver, String size){

		Log.info("Enter Size attribute for ebs volume");
		Actions action=new Actions(driver);
		action.moveToElement(AWSEBSVolumePageObject.ebsVolume_resource_size);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(size);
		action.click().build().perform();	
		Reporter.log(" ");	
	}
	public static void entertypeEBSvolume(WebDriver driver, String type){

		Log.info("Enter type attribute for ebs volume");
		AWSEBSVolumePageObject.ebsVolume_resource_type.clear();
		Actions action = new Actions(driver);	
		WebElement element =driver.findElement(By.xpath("//*[text()='"+type+"']"));
		action.moveToElement(element).sendKeys(type);
		action.click().build().perform();		
		Reporter.log(" ");
	}

	public static void enterEncryptedEBSvolume(WebDriver driver, String encrypted){

		Log.info("Enter encrypted attribute for ebs volume");
		AWSEBSVolumePageObject.ebsVolume_resource_encrypted.clear();
		Actions action = new Actions(driver);	
		WebElement element =driver.findElement(By.xpath("//*[text()='encrypted']/following::*[text()='"+encrypted+"']"));
		action.moveToElement(element).sendKeys(encrypted);
		action.click().build().perform();		
		Reporter.log(" ");
	}

	public static void enterIopsEBSvolume(WebDriver driver, String iops){

		Log.info("Enter iops attribute for ebs volume");
		Actions action=new Actions(driver);
		action.moveToElement(AWSEBSVolumePageObject.ebsVolume_resource_iops);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(iops);
		action.click().build().perform();	
		Reporter.log(" ");	
		sleepTime();
	}
	public static void enterKmsKeyIdEBSvolume(WebDriver driver, String kmsKeyId){

		Log.info("Enter kms key attribute");
		Actions action=new Actions(driver);
		action.moveToElement(AWSEBSVolumePageObject.ebsVolume_resource_kmsKeyId);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(kmsKeyId);
		action.click().build().perform();	
		Reporter.log(" ");	

	}
	public static void enterSnapshotIdEBSvolume(WebDriver driver, String snapshotId){

		Log.info("Enter snapshot id attribute");
		Actions action=new Actions(driver);
		action.moveToElement(AWSEBSVolumePageObject.ebsVolume_resource_snapshotId);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(snapshotId);
		action.click().build().perform();	
		Reporter.log(" ");	

	}

	public static void enterAvailabilityZoneForEBSvolume(WebDriver driver, String zone) {

		Log.info("Enter availability zone attribute for ebs volume");
		AWSEBSVolumePageObject.ebsVolume_resource_availabilityZone.clear();

		AWSEBSVolumePageObject.ebsVolume_resource_availabilityZone.click();
		
		AWSEBSVolumePageObject.ebsVolume_resource_availabilityZone.sendKeys(zone);
		
		Reporter.log(" ");	

	}


}
