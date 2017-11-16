package com.opex.test.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AWSOutputPage extends BaseClass{

	public AWSOutputPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='Output']")
	public static WebElement resource_output;

	@FindBy(how=How.XPATH,xpath="//*[text()='output']/following::tbody/tr[4]/td[2]/a")
	public static WebElement select_set_json_for_output;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='Output']//preceding::*[@class='body']")
	public static WebElement hoverOnRes;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='Output']/following::*[text()='X']")
	public static WebElement crossBtnResRT;
	
	@FindBy(how=How.XPATH, xpath="//*[@class='resourceNode-text']//*[text()='Output']")
	public static WebElement click_resource_output;
	
}