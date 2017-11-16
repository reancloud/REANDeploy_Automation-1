package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSIAMRolePage {
	
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='AWS IAM Role']")
	public static WebElement resource_iamrole;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='Depends On']/following::*[1]/input")
	public static WebElement iamRole_select_depends_on_value;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='assume_role_policy']/following::*[contains(text(),'Set text')]")
	public static WebElement iamRole_click_settext;
	
	@FindBy(how=How.XPATH,xpath=" //*[text()='Set String value for: assume_role_policy ']//following::div[@class='ace_content'][1]")
	public static WebElement iamRole_select_text_area;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name']/following::input[1]")
	public static WebElement iamRole_enter_name;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name_prefix']/following::input[1]")
	public static WebElement iamRole_enter_nameprefix;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='path']/following::input[1]")
	public static WebElement iamRole_enter_path;
	
	}
