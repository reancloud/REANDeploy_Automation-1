package com.opex.test.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver){
		super(driver);
	}    

	
	/*@FindBy(how=How.XPATH, xpath=".//*[@id='input_0']")
	public static WebElement email;
	
	@FindBy(how=How.XPATH, xpath=".//*[@id='input_1']")
	public static WebElement password;*/
	
	 @FindBy(how=How.XPATH, xpath="//*[@ng-model='login.user']")
	 public static WebElement email;
		
	 @FindBy(how=How.XPATH, xpath="//*[@ng-model='login.password']")
	 public static WebElement password;
	
	 // @FindBy(how=How.XPATH, xpath=".//button")
	 @FindBy(how=How.XPATH, xpath=".//button[text()='Sign In']")
	 public static WebElement signin_button;

	
}