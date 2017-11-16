package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSRouteTableAssnPageObject {
	
	@FindBy(how=How.XPATH, xpath="//div[@title='Route Table association']")
	public static WebElement resource_RTA;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='route_table_id']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_RTArouteid;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='subnet_id']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_RTAsubnetid;
	
}
