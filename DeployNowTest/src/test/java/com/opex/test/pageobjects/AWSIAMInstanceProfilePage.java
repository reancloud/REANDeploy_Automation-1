package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSIAMInstanceProfilePage {
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='AWS IAM Instance Profile']")
	public static WebElement resource_IMIP;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name']/following::input[1]")
	public static WebElement IMIP_enter_name;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name_prefix']/following::input[1]")
	public static WebElement IMIP_enter_nameprefix;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='path']/following::input[1]")
	public static WebElement IMIP_enter_path;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='roles']/following::*[text()='Set Array'][1]")
	public static WebElement click_role_setArray;
	
	@FindBy(how=How.XPATH,xpath="//div[@ng-click ='deployEnv()']")
	public static WebElement deploy_button;
	
	

}
