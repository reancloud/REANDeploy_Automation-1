package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSSubnetgroupPageObject extends BaseClass{

	public AWSSubnetgroupPageObject (WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how=How.XPATH, xpath="//div[@title='AWS DB Subnet Group']")
	public static WebElement resource_subnetgroup;
	
	@FindBy(how=How.CSS,css=".form-control.input-sm.ng-pristine.ng-untouched.ng-valid.ng-scope.ng-empty")
	public static WebElement resource_description;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='tab-content-2']//table[1]//tr[2]/td[2]/div/input")
	public static WebElement resource_name;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(text(),'subnet_ids')]/following::*[text()='Set Array']")
	public static WebElement resource_clicksetarray;
	
	@FindBy(how=How.XPATH,xpath="//*[@uib-popover='Deploy']")
	public static WebElement deploy_button;
	
	
}

