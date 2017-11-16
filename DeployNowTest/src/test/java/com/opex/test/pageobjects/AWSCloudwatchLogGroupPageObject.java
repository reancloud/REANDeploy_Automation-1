package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSCloudwatchLogGroupPageObject {

	@FindBy(how=How.XPATH, xpath="//*[@title='AWS CloudWatch Log Group']")
    public static WebElement resource_cloudwatch;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='retention_in_days']/following::*[2]/input")
    public static WebElement retention_in_days;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name']/following::*[2]/input")
    public static WebElement name;
	
}
