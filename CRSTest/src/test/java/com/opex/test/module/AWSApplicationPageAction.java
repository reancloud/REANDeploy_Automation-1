package com.opex.test.module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSApplicationPageObject;

public class AWSApplicationPageAction extends SleepFunctionality {
	
public static void enterUserName(WebDriver driver, String user_name)throws Exception {
	Log.info("User name is entered");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.username.click();
	AWSApplicationPageObject.username.sendKeys(user_name);
	Log.info(" is entered in UserName text box" );
}

public static void enterPassword(WebDriver driver, String user_password)throws Exception {
	Log.info("User password is entered");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.password.click();
	AWSApplicationPageObject.password.sendKeys(user_password);
	Log.info(" is entered in password text box" );
}

public static void clicklogin(WebDriver driver)throws Exception {
	Log.info("User click on login button");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.login_button.click();
	Log.info(" Clicked on Login button" );
}


public static void verify_main_title_text_post_login(WebDriver driver) throws InterruptedException {
	//AWSApplicationPageObject.main_title.click();
	Thread.sleep(4000);
	String text = "CRS";
	WebDriverWait wait = new WebDriverWait(driver, 3);
	WebElement ele = wait.until(
			ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='MainTitle']/strong"))).get(0);
	String notificationMessage = ele.getText();
		Assert.assertTrue("CRS".equals(notificationMessage));
		System.out.println("MSG :" +notificationMessage);
} 

public static void verify_error_message_for_invalid_credentials(WebDriver driver) throws InterruptedException {
	
	Thread.sleep(4000);
	String text = "Invalid credentials. Please make sure the username and password are correct.";
	WebDriverWait wait = new WebDriverWait(driver, 3);
	WebElement ele = wait.until(
			ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/fieldset/div[3]/label"))).get(0);
	String notificationMessage = ele.getText();
	
		Assert.assertTrue("Invalid credentials. Please make sure the username and password are correct.".equals(notificationMessage));
		System.out.println("MSG :" +notificationMessage);
}

public static void enter_group_code(WebDriver driver, String group_code)throws Exception {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.group_code.click();
	AWSApplicationPageObject.group_code.sendKeys(group_code);
	Log.info(" Group code is enterred" );
	//click on search button
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	AWSApplicationPageObject.search_button.click();
	
}

public static void verify_search_results_should_match_group_code(WebDriver driver) throws InterruptedException {
	
	Thread.sleep(4000);
	String text = "G0055";
	WebDriverWait wait = new WebDriverWait(driver, 3);
	WebElement ele = wait.until(
			ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='main_content_ASPxSplitter1_GridAccount_DXDataRow0']/td[3]"))).get(0);
	String expected_string = ele.getText();
	
		Assert.assertTrue("G0055".equals(expected_string));
		System.out.println("MSG :" +expected_string);
}

public static void enter_account_number(WebDriver driver, String account_code)throws Exception {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.account_number.click();
	AWSApplicationPageObject.account_number.sendKeys(account_code);
	Log.info(" Account number is enterred" );
	//click on search button
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	AWSApplicationPageObject.search_button.click();
	
}

public static void verify_search_results_should_match_account_number(WebDriver driver) throws InterruptedException {
	
	Thread.sleep(4000);
	String text = "20563000";
	WebDriverWait wait = new WebDriverWait(driver, 3);
	WebElement ele = wait.until(
			ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='main_content_ASPxSplitter1_GridAccount_DXDataRow0']/td[5]"))).get(0);
	String expected_string = ele.getText();
	
		Assert.assertTrue("20563000".equals(expected_string));
		System.out.println("MSG :" +expected_string);
}

public static void select_account_holder_from_account_menu(WebDriver driver)throws Exception {
	Log.info("User clicks on Account menu");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.account_menu.click();
	Thread.sleep(5000);
	//user selects account holder option from the menu
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.account_holder.click();
	Thread.sleep(5000);
}

public static void verify_account_holder_main_title(WebDriver driver) throws InterruptedException {
	//AWSApplicationPageObject.main_title.click();
	Thread.sleep(4000);
	String text = "Account Holder";
	WebDriverWait wait = new WebDriverWait(driver, 3);
	WebElement ele = wait.until(
			ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='MainTitle']"))).get(0);
	String notificationMessage = ele.getText();
		Assert.assertTrue("Account Holder".equals(notificationMessage));
		System.out.println("MSG :" +notificationMessage);
}

public static void select_edit_option_for_first_record_and_update_dob(WebDriver driver, String dob)throws Exception {
	Log.info("User clicks on edit option");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.edit_option.click();
	Thread.sleep(5000);
	//user selects 
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.dob_field.click();
	AWSApplicationPageObject.dob_field.clear();
	Thread.sleep(2000);
	AWSApplicationPageObject.dob_field.sendKeys(dob);
	//click update
	AWSApplicationPageObject.update_button.click();
	Thread.sleep(5000);
	
}

public static void verify_dob_field_correctly_updated(WebDriver driver, String dob) throws InterruptedException {
	
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(driver, 3);
	WebElement ele = wait.until(
			ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='main_content_Grid_DXDataRow0']/td[9]"))).get(0);
	String expected_string = ele.getText();
	
		Assert.assertTrue(dob.equals(expected_string));
		System.out.println("MSG :" +expected_string);
}

}