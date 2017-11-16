/*package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProviderPage {
	
	@FindBy(how=How.XPATH, xpath=".//a[text()='Providers']")
	public static WebElement Provider_conection;
	
	@FindBy(how=How.XPATH, xpath=".//input[@ng-model='provider.name']")
	public static WebElement provider_name;
	
	
	@FindBy(how=How.XPATH, xpath=".//input[@ng-model='selectedProviderType']")
	public static WebElement provider_type;
	
	
	@FindBy(how=How.XPATH, xpath=".//span[text()='AWS']")
	public static WebElement provider_aws;
	
	@FindBy(how=How.XPATH, xpath=".//span[text()='Docker']")
	public static WebElement provider_docker;
	
	@FindBy(how=How.XPATH, xpath=".//span[text()='Azure']")
	public static WebElement provider_azure;
	
	@FindBy(how=How.XPATH, xpath=".//span[text()='vSphere']")
	public static WebElement provider_vsphere;
	
	@FindBy(how=How.XPATH, xpath=".//span[text()='DigitalOcean']")
	public static WebElement provider_digital;
	
	@FindBy(how=How.XPATH, xpath=".//textarea[@class='text']")
	public static WebElement provider_details;
	

	@FindBy(how=How.XPATH, xpath=".//*[@ng-click='saveProvider()']")
	public static WebElement provider_save_click;
	
	
	@FindBy(how=How.XPATH, xpath=".//*[@ng-click='newProvider()']")
	public static WebElement provider_new_click;
}

*/