package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSIAMRolePolicyPageObject {
	
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='AWS IAM Role Policy']")
	public static WebElement resource_IAMRole_Policy;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name']/following::*[@type='text'][1]")
	public static WebElement enter_name;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='role']/following::*[@type='text'][1]")
	public static WebElement enter_role;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='policy']/following::a")
	public static WebElement click_policy_setText;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='setStringModal']//div[@class='ace_content']")
	public static WebElement click_textArea;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='setStringModal']//button[text()='Set Value']")
	public static WebElement setValue_textArea;
	
	}
