package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSJavaPageObject {
	
	@FindBy(how=How.XPATH,xpath="//div[text()='java']")
	public static WebElement java_pkg;
	
	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='ADN_j_instance']")
	public static WebElement click_resource_instance;

	@FindBy(how=How.XPATH,xpath="//*[@class='accordion-toggle']//*[text()='java']")
	public static WebElement java_pkg_link;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='accept_license_agreement']/following::input[1]")
	public static WebElement java_accept_licence;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='accept_license_agreement']/following::input[2]")
	public static WebElement java_alternatives_priority;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='accept_license_agreement']/following::input[3]")
	public static WebElement java_jdk_version;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='accept_license_agreement']/following::input[4]")
	public static WebElement java_openjdk_version;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='accept_license_agreement']/following::input[5]")
	public static WebElement java_reset_alternatives;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='accept_license_agreement']/following::input[6]")
	public static WebElement java_set_default;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='accept_license_agreement']/following::input[7]")
	public static WebElement java_set_etc_environment;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='accept_license_agreement']/following::input[8]")
	public static WebElement java_use_alt_suffix;
	
	
}
