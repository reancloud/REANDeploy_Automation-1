package com.opex.test.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPage extends BaseClass{

	public LogoutPage(WebDriver driver){
		super(driver);
	}    

	@FindBy(how=How.XPATH, xpath=".//a[text()='Logout']")
	public static WebElement signout_button;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(text(),'Welcome to REAN Deploy')]")
	public static WebElement deploynow_text;
	
		
}
