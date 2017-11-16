package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSAwsspecPageObject {
	
	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='Auto-instance']")
	public static WebElement click_resource_instance;
	
	/*@FindBy(how=How.XPATH,xpath="//*[text()='rake_target']/following::*[@ng-readonly='sharedData.resourceReadOnly'][1]")
	public static WebElement rake_target;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='rake_target']/following::*[@ng-readonly='sharedData.resourceReadOnly'][2]")
	public static WebElement source_dir;*/
	
	@FindBy(how=How.XPATH,xpath="//*[text()='source_password']/following::input[1]")
	public static WebElement source_password;
	
	/*@FindBy(how=How.XPATH,xpath="//*[text()='source_password']/following::input[2]")
	public static WebElement source_type;*/
	
	@FindBy(how=How.XPATH,xpath="//*[text()='source_password']/following::input[3]")
	public static WebElement source_url;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='source_password']/following::input[4]")
	public static WebElement source_username;
	

	@FindBy(how=How.XPATH,xpath="//div[text()='awspec']")
	public static WebElement aws_pkg;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='accordion-toggle']//*[text()='awspec']")
	public static WebElement aws_pkg_link;
	
	
	

}
