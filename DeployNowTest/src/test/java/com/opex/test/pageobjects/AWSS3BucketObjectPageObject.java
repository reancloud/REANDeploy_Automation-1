package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSS3BucketObjectPageObject extends BaseClass {


	public AWSS3BucketObjectPageObject(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(how=How.XPATH, xpath="//div[@title='AWS S3 Bucket Object']")
	public static WebElement resource_s3BucketObject;

	
	@FindBy(how=How.XPATH, xpath="//*[text()='bucket']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement s3BucketObject_bucket;
	
	
	@FindBy(how=How.XPATH, xpath="//*[text()='key']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement s3BucketObject_key;
	
	
	@FindBy(how=How.XPATH, xpath="//*[text()='source']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement s3BucketObject_source;

}

