package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSRoute53ZonePageObject extends BaseClass{

	public AWSRoute53ZonePageObject (WebDriver driver) {
		super(driver);
		
	}
	@FindBy(how=How.XPATH, xpath="//div[@title='AWS Route53 Zone']")
	public static WebElement resource_Route53zone;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='EnvSelectorMenu']//*[text()='PX_SSH_AWS_routezone']")
    public static WebElement delete_search_env;
	
	
	@FindBy(how=How.XPATH,xpath="//*[text()='name']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_Routezonename;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='vpc_id']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_Routezonevpcid;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='vpc_region']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_Routezonevpcregion;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='comment']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_comments;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='delegation_set_id ']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_delegation_set_id;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='tags']//following::*[text()='Set Json']")
	public static WebElement resource_tags;
	
	

	
	
	
	
}
