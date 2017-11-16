package com.opex.test.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AWSRouteTablePageObject extends BaseClass{

	public AWSRouteTablePageObject(WebDriver driver){
		super(driver);
	}    

	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='AWS Route Table']")
	public static WebElement resource_route_table;

	@FindBy(how=How.XPATH, xpath="//*[text()='vpc_id']/following::*[3]")
	public static WebElement RT_vpc_id;

	@FindBy(how=How.XPATH,xpath="//*[text()='propagating_vgws']/following::*[contains(text(),'Set Array')]")
	public static WebElement click_RT_propagating_vgws;

	@FindBy(how=How.XPATH,xpath="//*[text()='route']/following::*[contains(text(),'Set Json')][1]")
	public static WebElement click_RT_route;

	
}
