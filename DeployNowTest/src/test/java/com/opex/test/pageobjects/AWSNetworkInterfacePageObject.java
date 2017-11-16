package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSNetworkInterfacePageObject extends BaseClass {


	public AWSNetworkInterfacePageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,xpath="//div[@title='Network Interface']")
	public static WebElement netInterface_resource;

	@FindBy(how=How.XPATH, xpath="//*[text()='subnet_id']/following::input[1]")
	public static WebElement netInterface_subnetId;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='private_ips']/following::*[text()='Set Array'][1]")
	public static WebElement netInterface_privateIps;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='attachment']/following::*[text()='Set Json'][1]")
	public static WebElement netInterfaceAttachment;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='security_groups']/following::*[text()='Set Array'][1]")
	public static WebElement netInterfaceSecurityGroups;
	
	@FindBy(how=How.XPATH, xpath="	//*[text()='source_dest_check']/following::input[1]")
	public static WebElement netInterfaceSourceDestCheck;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='tags']/following::*[text()='Set Json'][1]")
	public static WebElement netInterfaceTags;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='description']/following::input[1]")
	public static WebElement netInterfaceDescription;
	
	
	@FindBy(how=How.XPATH, xpath="//*[contains(text(),'Set Array value for: ')]/following::*[@class='ace_content']")
	public static WebElement netInterfaceArraySetText;
}
