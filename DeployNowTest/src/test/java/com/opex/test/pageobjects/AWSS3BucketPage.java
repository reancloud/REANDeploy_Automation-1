package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebDriver;

public class AWSS3BucketPage {
		
	@FindBy(how=How.XPATH, xpath="//*[@id='tab-content-2']//table[2]/tbody/tr[5]/td[2]//input")
	public static WebElement select_force_destroy;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='tab-content-2']//table[2]//tr[3]/td[2]//input")
	public static WebElement select_acl_value;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//div[@title='AWS S3 Bucket']")
	public static WebElement resource_S3Bucket;
	
	@FindBy(how=How.XPATH, xpath="//md-content/table[1]/tbody/tr/td[2]/div/input")
	public static WebElement enter_bucket_name;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='tab-content-2']//md-content/table[2]//tr[6]/td[2]/a")
	public static WebElement set_lifecycle_rule;
	
	@FindBy(how=How.XPATH, xpath="//div[@class='ace_content']")
	public static WebElement set_lifecycle_rule1;
	
	@FindBy(how=How.XPATH, xpath="//button[text()='Set Value']")
	public static WebElement set_value;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='tab-content-2']//table[2]//tr[7]/td[2]/a")
	public static WebElement set_policy;
	
	@FindBy(how=How.XPATH, xpath="//div[@class='ace_content']")
	public static WebElement set_policy1;
	
	@FindBy(how=How.XPATH, xpath="//button[text()='Set Value']")
	public static WebElement set_policy2;
	
	@FindBy(how=How.XPATH, xpath="//md-content/table[2]/tbody/tr[4]/td[2]/a")
	public static WebElement set_cors_rules;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='tab-content-2']//table[2]//tr[8]/td[2]/a")
	public static WebElement set_tag;
	
	
}





