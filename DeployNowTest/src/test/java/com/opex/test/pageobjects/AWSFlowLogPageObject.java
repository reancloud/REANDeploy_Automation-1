package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSFlowLogPageObject extends BaseClass {
	
	public AWSFlowLogPageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,xpath="//div[@title='AWS Flow log']")
	public static WebElement flow_log_resource;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='iam_role_arn']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement iam_role_arn;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='log_group_name']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement log_group_name;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='traffic_type']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement traffic_type;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='eni_id']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement flow_log_eni_id;
		
	@FindBy(how=How.XPATH,xpath="//*[text()='subnet_id']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement flow_log_subnet_id;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='vpc_id']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement flow_log_vpc_id;
	

	
}
