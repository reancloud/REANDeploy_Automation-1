package com.opex.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSKeyPairPageObject;
import com.opex.test.pageobjects.AWSS3BucketObjectPageObject;
import com.opex.test.pageobjects.AWSVPCDHCPPageObject;

public class AWSS3BucketObjectPageAction extends SleepFunctionality{

	public static void dragdropS3BucketObject(WebDriver driver) throws Exception{

		Log.info("Select S3_Bucket_Object resource drag and drop on canvas resource");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSS3BucketObjectPageObject.resource_s3BucketObject);
		Reporter.log("Sign out is performed");		
	}
	public static void S3_Bucket_Object_Rname(WebDriver driver,String Rname) throws Exception{

		Log.info("I enter the S3_Bucket_Object name in the popup");
		CommonFunctionalityPageAction.enterResourceName(driver,Rname);
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void ResourceClickS3BucketObject(WebDriver driver,String Rname) throws Exception{

		Log.info("Click on S3_Bucket_Object resource"); 
		WebElement element = driver.findElement(By.xpath("//*[contains(@id,'v-')]//*[text()='"+Rname+"']"));
		element.click();
		sleepTime();
		Reporter.log("Sign out is performed");

	}
	
	public static void enterS3BucketObjectBucket(WebDriver driver,String bucket){
		
		Log.info("I enter S3BucketObject attribute of resource");
		sleepTime();
		AWSS3BucketObjectPageObject.s3BucketObject_bucket.clear();
		AWSS3BucketObjectPageObject.s3BucketObject_bucket.sendKeys(bucket);
		Reporter.log("Sign out is performed");
		
	}
	

	public static void enterS3BucketObjectKey(WebDriver driver,String key){
		
		Log.info("I enter public S3BucketObject attribute of resource");
		sleepTime();
		AWSS3BucketObjectPageObject.s3BucketObject_key.clear();
		AWSS3BucketObjectPageObject.s3BucketObject_key.sendKeys(key);		
		Reporter.log("Sign out is performed");
		
	}
	
	public static void enterInvalidS3BucketObjectSource(WebDriver driver,String invalid_public_key2){
		
		Log.info("I enter invalid S3BucketObject source attribute of resource");
		sleepTime();
		AWSS3BucketObjectPageObject.s3BucketObject_source.sendKeys(invalid_public_key2);
		Reporter.log("Sign out is performed");
		
	}
	public static void enterS3BucketObjectSource(WebDriver driver,String source){
		
		Log.info("I enter invalid S3BucketObject source attribute of resource");
		sleepTime();
		AWSS3BucketObjectPageObject.s3BucketObject_source.clear();
		AWSS3BucketObjectPageObject.s3BucketObject_source.sendKeys(source);
		Reporter.log("Sign out is performed");
		
	}

}
