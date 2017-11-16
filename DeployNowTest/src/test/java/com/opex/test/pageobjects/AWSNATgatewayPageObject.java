package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSNATgatewayPageObject extends BaseClass {


	public AWSNATgatewayPageObject(WebDriver driver) {
		super(driver);
	}
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='Automation-vpc']")
    public static WebElement resource_clickresource;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='route']/following::*[text()='Set Json']")
    public static WebElement resource_routejson;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='t-routetable']")
    public static WebElement resource_clickIGWresource;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='tRouteassociation']")
    public static WebElement resource_clickrouteassresource;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='natp']")
    public static WebElement resource_clickNATresource;

	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='Elastic IP']")
	public static WebElement resource_clickeip;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='AWS Nat gateway']")
	public static WebElement resource_clickNAT;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='allocation_id']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_allocation_id;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='network_interface_id']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_networkinterfaceid;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='private_ip']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_privateip;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='public_ip']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_publicip;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='tIGW']")
    public static WebElement resource_clickrouteresource;
	
}