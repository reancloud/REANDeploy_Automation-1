package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSElbAttachmentPageObject {
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='AWS ELB Attachment']")
	public static WebElement resource_ELBA;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='elb']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_ELBAelb;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='instance']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_ELBAinstance;

	@FindBy(how=How.XPATH, xpath=".//*[@id='tab-content-2']/div/md-content/input")
	public static WebElement search_ELBAresource;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='Depends On']//following::div[@class='ng-scope'][2]")
	public static WebElement resource_ELBADependsOn;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='Connection']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_ELBAConnection;

	

}
