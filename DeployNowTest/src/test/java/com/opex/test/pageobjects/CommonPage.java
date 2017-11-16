package com.opex.test.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class CommonPage extends BaseClass{

	public CommonPage(WebDriver driver){
		super(driver);
	}    

	
	@FindBy(how=How.XPATH, xpath=".//*[@id='simple-dropdown']")
	public static WebElement dropdown_click;
	
	@FindBy(how=How.XPATH, xpath="//span[@id='simple-dropdown']")
	public static WebElement more_click;
	
}