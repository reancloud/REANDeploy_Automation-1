package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSTomcatPageObject {
	
	@FindBy(how=How.XPATH,xpath="//div[text()='tomcat-install']")
	public static WebElement tomcat_pkg;
	
	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='ADN_t_instance']")
	public static WebElement click_resource_instance;

	@FindBy(how=How.XPATH,xpath="//*[@class='accordion-toggle']//*[text()='tomcat-install']")
	public static WebElement tomcat_pkg_link;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='base_version']/following::input[1]")
	public static WebElement tomcat_baseversion;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='base_version']/following::input[2]")
	public static WebElement tomcat_deploy_manager_apps;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='base_version']/following::input[3]")
	public static WebElement tomcat_port;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='base_version']/following::input[4]")
	public static WebElement tomcat_run_base_instance;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='base_version']/following::input[5]")
	public static WebElement tomcat_shutdown_port;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='base_version']/following::input[6]")
	public static WebElement tomcat_ssl_max_threads;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='base_version']/following::input[7]")
	public static WebElement tomcat_ssl_port;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='base_version']/following::input[8]")
	public static WebElement tomcat_tomcat_auth;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='base_version']/following::input[9]")
	public static WebElement tomcat_use_security_manager;
	
	
}
