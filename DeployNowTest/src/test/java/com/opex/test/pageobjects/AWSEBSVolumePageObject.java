package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSEBSVolumePageObject extends BaseClass {


	public AWSEBSVolumePageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,xpath="//div[@title='AWS EBS Volume']")
	public static WebElement ebsVolume_resource;

	@FindBy(how=How.XPATH,xpath="//*[text()='type']/following::input[1]")
	public static WebElement ebsVolume_resource_type;
	 
	@FindBy(how=How.XPATH, xpath="//*[text()='size']/following::input[1]")
	public static WebElement ebsVolume_resource_size;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='tags']/following::*[text()='Set Json']")
	public static WebElement ebsVolume_resource_tags;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='powered by ace']/following::*[text()='Set Value'][1]")
	public static WebElement ebsVolume_resource_SetValueBtn;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='powered by ace']/following::*[@class='ace_text-input'][1]")
	public static WebElement ebsVolume_resource_JsonTextArea;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='snapshot_id']/following::input[1]")
	public static WebElement ebsVolume_resource_snapshotId;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='kms_key_id']/following::input[1]")
	public static WebElement ebsVolume_resource_kmsKeyId;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='iops']/following::input[1]")
	public static WebElement ebsVolume_resource_iops;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='encrypted']/following::input[1]")
	public static WebElement ebsVolume_resource_encrypted;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='Depends On']/following::input[1]")
	public static WebElement ebsVolume_resource_dependsOn;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='availability_zone']/following::input[1]")
	public static WebElement ebsVolume_resource_availabilityZone;	

}
