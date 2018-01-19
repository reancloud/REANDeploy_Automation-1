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
	Log.info("User name is entere");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.username.click();
	AWSApplicationPageObject.username.sendKeys(user_name);
	Log.info(" is entered in UserName text box" );
}

public static void enterUserAge(WebDriver driver, String user_age)throws Exception {
	Log.info("User name is entere");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.userage.click();
	AWSApplicationPageObject.userage.sendKeys(user_age);
	Log.info(" is entered in UserAge text box" );
}

public static void enterUserSalary(WebDriver driver, String user_salary)throws Exception {
	Log.info("User name is entere");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.usersalary.click();
	AWSApplicationPageObject.usersalary.sendKeys(user_salary);
	Log.info(" is entered in UserSalary text box" );
}

public static void editUserSalary(WebDriver driver, String user_salary)throws Exception {
	Log.info("User name is entere");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	AWSApplicationPageObject.usersalary.click();
	AWSApplicationPageObject.usersalary.clear();
	AWSApplicationPageObject.usersalary.sendKeys("100000");
	Log.info(" is entered in UserName text box" );
}

public static void clickAddButton(WebDriver driver) throws InterruptedException {
	AWSApplicationPageObject.addbutton.click();
	Thread.sleep(4000);
	String text = "User created successfully";
	WebDriverWait wait = new WebDriverWait(driver, 3);
	WebElement ele = wait.until(
			ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='alert alert-success ng-binding ng-scope']"))).get(0);
	String notificationMessage = ele.getText();
	if(notificationMessage.equals(text))
	{
		Assert.assertTrue("User created successfully".equals(notificationMessage));
		System.out.println(notificationMessage);
	}
	else
	{
		Assert.assertTrue(ele.isDisplayed());
	}
	
} 

public static void clickUpdateButton(WebDriver driver) throws InterruptedException {
	AWSApplicationPageObject.updatebutton.click();
	Thread.sleep(4000);
	String text = "User updated successfully";
	WebDriverWait wait = new WebDriverWait(driver, 3);
	WebElement ele = wait.until(
			ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='alert alert-success ng-binding ng-scope']"))).get(0);
	String notificationMessage = ele.getText();
	if(notificationMessage.equals(text))
	{
		Assert.assertTrue( "User updated successfully".equals(notificationMessage));
		System.out.println(notificationMessage);
	}
	else
	{
		Assert.assertTrue(ele.isDisplayed());
	}
	
} 

public static void clickEditButton(WebDriver driver) throws InterruptedException {
	AWSApplicationPageObject.editbutton.click();
	Thread.sleep(4000);
}

public static void clickRemoveButton(WebDriver driver) throws InterruptedException {
	AWSApplicationPageObject.removeButton.click();
	Thread.sleep(4000);
}
public static void clickresetformButton(WebDriver driver) throws InterruptedException {
	AWSApplicationPageObject.resetformButton.click();
	Thread.sleep(4000);
}

}