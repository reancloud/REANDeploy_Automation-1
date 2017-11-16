package com.opex.test.pageobjects;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	
	
	public class AWSVpcPage extends BaseClass{
		public AWSVpcPage(WebDriver driver){
			super(driver);
		}    
		
		@FindBy(how=How.XPATH, xpath="//*[@title='AWS VPC']")
		public static WebElement resource_vpc;
		
		@FindBy(how=How.XPATH, xpath=" //*[@id='ResourceNameModal']//div[3]//button[1]")
		public static WebElement resource_vpc_create_button;
			
		@FindBy(how=How.XPATH, xpath="//*[text()='cidr_block']/following::*[@type='text'][1]")
		public static WebElement enter_cidr_block_value;
		
		@FindBy(how=How.XPATH, xpath="//*[text()='enable_classiclink']/following::input[1]")
		public static WebElement select_enableClassicLink;
		
		@FindBy(how=How.XPATH, xpath="//*[text()='enable_dns_hostnames']/following::input[1]")//"//*[text()='enable_dns_hostnames']/following::input[1]")
		public static WebElement select_enable_dns_hostnames;
		
		@FindBy(how=How.XPATH, xpath="//*[text()='enable_dns_support']/following::input[1]") //*[text()='enable_dns_su...']/following::input[1]")
		public static WebElement select_enable_dnssupport_value;
			
		
		@FindBy(how=How.XPATH, xpath="//*[text()='instance_tenancy']/following::input[1]")
		public static WebElement enter_instance_tenancy_value;
		
		@FindBy(how=How.XPATH, xpath="//*[@id='tab-content-0']//*[@class='small-separator'][1]")
		public static WebElement click_rightsidebar;
		
		@FindBy(how=How.XPATH,xpath="//*[@uib-popover='Deploy']")
		public static WebElement deploy_button;
			
}