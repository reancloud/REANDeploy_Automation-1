package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSIAMPolicyPageObject extends BaseClass {


	public AWSIAMPolicyPageObject(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,xpath="//div[@title='AWS IAM Policy']")
	public static WebElement iam_policy_resource;
	
	@FindBy(how=How.XPATH,xpath="//a[contains(text(),'description')]/following::input[@ng-model='a.value'][1]")
	public static WebElement resource_attribute_description;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='policy']/following::*[text()='Set text']")
	public static WebElement attribute_iampolicy;

	@FindBy(how=How.XPATH,xpath="//*[text()='Set String value for: policy ']//following::div[@class='ace_content'][1]")
	public static WebElement policy_setValueTextArea;
	
	//cross close button:IAM policy resource attribute policy-> set text->cross close button
	@FindBy(how=How.XPATH,xpath="//div[@id='setStringModal']//button[@aria-label='Close']//span[text()='×']")
	public static WebElement set_Text_crossCloseBtn;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='path']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement iamPolicy_path_attribute;
	

	
	

}
