package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSSecuritygroupPageObject extends BaseClass {


	public AWSSecuritygroupPageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH, xpath="//div[@title='AWS Security Group']")
	public static WebElement resource_securitygroup;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='p-securitygroup']")
	public static WebElement resource_securitygroupclick;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name']//following::*[@class='ng-scope'][1]")
	public static WebElement resource_securitygroupname;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='Depends On']//following::*[@class='form-control input-sm ng-pristine ng-untouched ng-valid ng-empty'][1]")
	public static WebElement securitygroup_dependson;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='Connection']//following::*[@class='form-control input-sm ng-pristine ng-valid ng-empty ng-touched'][1]")
	public static WebElement securitygroup_connection;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='description']//following::*[@class='form-control input-sm ng-pristine ng-untouched ng-valid ng-scope ng-empty'][1]")
	public static WebElement securitygroup_description;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='vpc_id']//following::*[@class='form-control input-sm ng-pristine ng-untouched ng-valid ng-scope ng-empty'][1]")
	public static WebElement securitygroup_vpc_id;
	
	
	
	
	
	
	
}
