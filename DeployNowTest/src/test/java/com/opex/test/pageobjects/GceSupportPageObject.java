/*package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GCE_Support_page extends BaseClass {
	
	public GCE_Support_page(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(how=How.XPATH,xpath="//div[@title='GCE Instance']")
	public static WebElement gce_instance_resource;

	@FindBy(how=How.XPATH,xpath="//*[@id='tab-content-2']/div/md-content/table[1]/tbody/tr[1]/td[2]/a")
	public static WebElement gce_instance_disk_json;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='tab-content-2']/div/md-content/table[1]/tbody/tr[4]/td[2]/a")
	public static WebElement gce_instance_network_json;
	
	
	@FindBy(how=How.XPATH,xpath="//*[text()='machine_type']//following::div[@class='ng-scope'][1]")
	public static WebElement gce_instance_machine_type;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='zone']//following::div[@class='ng-scope']")
	public static WebElement gce_instance_zone;
	
	@FindBy(how=How.XPATH,xpath="//textarea[@class='ace_text-input']")
	public static WebElement disk_details_textarea;
      
	@FindBy(how=How.XPATH,xpath="//*[text()='Set Value']")
	public static WebElement set_value_button;

	@FindBy(how=How.XPATH,xpath="//span[text()='n1-standard-1']")
	public static WebElement machine_type;
	
	@FindBy(how=How.XPATH,xpath="//textarea[@class='ace_text-input']")
	public static WebElement network_details_textarea;
	
	@FindBy(how=How.XPATH,xpath="//span[text()='us-east1-b']")
	public static WebElement zone_type;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='setJsonValueModel']/div/div/div[3]/button")
	public static WebElement click_value_button;
	
	@FindBy(how=How.XPATH,xpath="//a[text()='Packages']")
	public static WebElement click_package_link;
	
	@FindBy(how=How.XPATH,xpath="//div[@title='mysql-install']")
	public static WebElement click_package_name;
	
	@FindBy(how=How.XPATH,xpath="//div[@title='Input Variables']")
	public static WebElement input_variable;
	
	@FindBy(how=How.XPATH,xpath="//div[@title='Output']")
	public static WebElement output_variable;
	
	@FindBy(how=How.XPATH,xpath="//div[@title='Existing VM']")
	public static WebElement Existing_vm;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='host']//following::div[@class='ng-scope']")
	public static WebElement enter_host;
		
	
}
	
	
	


*/