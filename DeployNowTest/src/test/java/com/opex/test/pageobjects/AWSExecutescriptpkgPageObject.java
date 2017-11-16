package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSExecutescriptpkgPageObject {

	
	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='Automation-instance']")
	public static WebElement click_resource_instance;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='Connection']//following::*[@ng-model='sharedData.selectedResource.connectionId']")
	public static WebElement resource_connectiontxtbox;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='resourceNode-text']//*[contains(text(),'auto-keypair')]")
	public static WebElement click_keyPair;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='resourceNode-text']//*[contains(text(),'auto-securitygroup')]")
	public static WebElement click_securitygroup;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='key_name']/following::*[@ng-readonly='sharedData.resourceReadOnly'][1]")
	public static WebElement click_instance_key;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='vpc_security_group_ids']/following::*[text()='Set Array'][1]")
	public static WebElement click_vpc_securitygroup;
	
	@FindBy(how=How.XPATH,xpath="//div[@title='execute-script']")
	public static WebElement executescript_pkg;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='accordion-toggle']//*[text()='execute-script']")
	public static WebElement executescript_pkg_link;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='inline']/following::*[text()='Set Array'][1]")
	public static WebElement inlinelink_setarray;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='Set Array value for: inline ']//following::div[@class='ace_content'][1]")
	public static WebElement inlinelink_textarea;
	
	
	/*@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='execute-script']")
	public static WebElement click_executescript_pkg;*/
	
}