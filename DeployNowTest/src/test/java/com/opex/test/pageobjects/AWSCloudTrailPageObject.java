package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSCloudTrailPageObject {

	@FindBy(how=How.XPATH, xpath="//div[@title='AWS Cloudtrail']")
	public static WebElement resource_cloud_trail;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='s3_bucket_name']//following::input[1]")
	public static WebElement s3_bucket_name;
	
	
}
