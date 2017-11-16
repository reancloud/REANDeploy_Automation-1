package com.opex.test.modules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.ManageUsersPage;
import com.opex.test.pageobjects.SignupPage;

public class ManageUsersPageAction extends SleepFunctionality {
	
	public ManageUsersPageAction(WebDriver driver) {
		super();}
	
	//click on manage users
     public static void clickmanageusers() {
	 Log.info("Click action is performed on Manage Users");
	 ManageUsersPage.manageusrs.click();
	 sleepTime(5000);
	 Reporter.log("Click action is performed on Manage Users ");
		
	}
   
     //click on assignRoles button
	public static void actions() {
    Log.info("Click action is performed on AssignRoles button");
	ManageUsersPage.actionmanageusrs.click();
	sleepTime(5000);
	Reporter.log("Click action is performed on Manage Users ");
		
		}

	
    //Multiple roles assign
	public static void mulchkboxclick(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ManageUsersPage.checkbox1));
		element.click();
		boolean checkstatus;
		checkstatus=ManageUsersPage.checkbox1.isSelected();
		if (checkstatus==true){
		    System.out.println("Checkbox is already checked");  
		}
		else
		{
			ManageUsersPage.checkbox1.click();
		    System.out.println("Checked the checkbox");
		}
		
		
		
		WebDriverWait wait2 = new WebDriverWait(driver, 150);
		WebElement element2 = wait.until(ExpectedConditions.visibilityOf(ManageUsersPage.checkbox2));
		boolean checkstatus2;
		checkstatus=ManageUsersPage.checkbox2.isSelected();
		if (checkstatus==true){
		    System.out.println("Checkbox is already checked");  
		}
		else
		{
			ManageUsersPage.checkbox2.click();
		    System.out.println("Checked the checkbox");
		}
			
		
		
		WebDriverWait wait3 = new WebDriverWait(driver, 150);
		WebElement element3 = wait.until(ExpectedConditions.visibilityOf(ManageUsersPage.checkbox3));
		boolean checkstatus3;
		checkstatus=ManageUsersPage.checkbox3.isSelected();
		if (checkstatus==true){
				    System.out.println("Checkbox is already checked");  
		 }
		 else
		 {
					ManageUsersPage.checkbox3.click();
				    System.out.println("Checked the checkbox");
		 }
				
			
	   
		WebDriverWait wait4 = new WebDriverWait(driver, 150);
		WebElement element4 = wait.until(ExpectedConditions.visibilityOf(ManageUsersPage.checkbox4));
		boolean checkstatus4;
		checkstatus=ManageUsersPage.checkbox4.isSelected();
		if (checkstatus==true){
			System.out.println("Checkbox is already checked");  
		}
		else
		{
		   ManageUsersPage.checkbox4.click();
			System.out.println("Checked the checkbox");
		}
		}
		
		 
    //click on user icon
	public static void clickusers(WebDriver driver)throws InterruptedException {
		
		Log.info("Click action is performed on Dropdown icon");
		ManageUsersPage.usersicon.click();
		sleepTime(2000);
		//WebDriverWait driver ;
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ManageUsersPage.manageusrs));
			
	}

	
	//click on assignroles button
	public static void assignbtn(WebDriver driver)throws InterruptedException{
 
		Log.info("User click on assignroles button");
		sleepTime(2000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(ManageUsersPage.assignroles));
		element.click();
		Thread.sleep(2000);
		String save_msg="Roles assigned to user successfully.";
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		WebElement ele = wait1.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.build().perform();
		String notificationMessage = ele.getText();
		Assert.assertEquals(save_msg, notificationMessage);
		sleepTime(1000);

	  }	
		
	
     //User click on assignroles button with blank checkboxes
	public static void assignbtn1(WebDriver driver)throws Exception {
		Log.info("User click on assignroles button");
		sleepTime(2000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(ManageUsersPage.assignroles));
		element.click();
		Thread.sleep(3000);
		String save_msg="Please assign atleast one role.";
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		WebElement ele = wait1.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.build().perform();
		String notificationMessage = ele.getText();
		Assert.assertEquals(save_msg, notificationMessage);
		sleepTime();

		
		
	}
	
    //click on checkboxs
	public static void chkboxclick(WebDriver driver)throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ManageUsersPage.checkbox1));
		element.click();
		boolean checkstatus;
		checkstatus=ManageUsersPage.checkbox1.isSelected();
		if (checkstatus==true){
		    System.out.println("Checkbox is already checked");  
		}
		else
		{
		ManageUsersPage.checkbox1.click();
		System.out.println("Checked the checkbox");
		}
		
	    }

	
	//deselect checkboxes
	public static void mulchkboxclickdeselect(WebDriver driver)throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, 150);
	WebElement element = wait.until(ExpectedConditions.visibilityOf(ManageUsersPage.checkbox1));
	element.click();
	boolean checkstatus;
	checkstatus=element.isSelected();
	if (checkstatus==true) {
	ManageUsersPage.checkbox1.click();
    System.out.println("Checkbox is unchecked");
	}
	else
	{
	System.out.println("Checkbox is already unchecked"); 
	}
	sleepTime(2000);
	
    WebDriverWait wait2 = new WebDriverWait(driver, 150);
	WebElement element2 = wait.until(ExpectedConditions.visibilityOf(ManageUsersPage.checkbox2));
	element2.click();
	boolean checkstatus2;
	checkstatus=element2.isSelected();
	if (checkstatus==true) {
	ManageUsersPage.checkbox2.click();
	System.out.println("Checkbox is unchecked");
	}
	else
	{
	System.out.println("Checkbox is already unchecked"); 
	}
	
	WebDriverWait wait3 = new WebDriverWait(driver, 150);
	WebElement element3 = wait.until(ExpectedConditions.visibilityOf(ManageUsersPage.checkbox3));
	element3.click();
	boolean checkstatus3;
	checkstatus=element3.isSelected();
	if (checkstatus==true) {
	ManageUsersPage.checkbox3.click();
	System.out.println("Checkbox is unchecked");
	}
	else
	{
	System.out.println("Checkbox is already unchecked"); 
	}
	sleepTime(2000);
	
	WebDriverWait wait4 = new WebDriverWait(driver, 150);
	WebElement element4 = wait.until(ExpectedConditions.visibilityOf(ManageUsersPage.checkbox4));
	element4.click();
	boolean checkstatus4;
	checkstatus=element4.isSelected();
	if (checkstatus==true) {
	ManageUsersPage.checkbox4.click();
	System.out.println("Checkbox is unchecked");
	}
	else
	{
	System.out.println("Checkbox is already unchecked"); 
	}
	sleepTime(2000);
	}
	
     //search user
	public static void clicksearchusers(WebDriver driver)throws Exception {
	    WebElement element = driver.findElement(By.xpath("//*[@placeholder='search Users']"));
		element.click();
		sleepTime(5000);
		element.sendKeys("anamika.singh@reancloud");
		sleepTime(8000);
		element.clear();
		sleepTime(2000);
		
		
	}
     
	//create account
	public static void signupValidCreateAcc1(WebDriver driver)throws Exception {
		Log.info("Checking functinality of create new account with validcredentials" );
		ManageUsersPage.signup_name.sendKeys("ReanDeploy");
		ManageUsersPage.signup_email.sendKeys("rean1234@gmail.com");
		ManageUsersPage.signup_password.sendKeys("sant@123");
		ManageUsersPage.signup_url.sendKeys("reancloud.com");
		ManageUsersPage.signup_iagreechkbox.click();
		Reporter.log("entered all data successfully");
		
	}
	
    //Delete users
	public static void deleteUsers(WebDriver driver)throws Exception {
		Log.info("Deleting User");
		String name="ReanDeploy";
		WebElement element = driver.findElement(By.xpath("//*[text()='"+name+"']/following::*[@title='Delete User']"));
		element.click();
		ManageUsersPage.delete_yessearch.click();
		String text="User deleted successfully";
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement message = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		sleepTime(5000);
		Actions actions = new Actions(driver);
		actions.moveToElement(message);
		actions.build().perform();
		String notificationMessage = message.getText();
		Assert.assertEquals(text, notificationMessage);
		sleepTime(2000);

	}

	//click on signup button
	public static void signupSignuplnk(WebDriver driver)throws Exception {
		Log.info("Checking functionality of signup link" );
		System.out.println("clicked on singup button");
		ManageUsersPage.signup_signupbtn.click();
		sleepTime(5000);
		//String success_message="Your DeployNow account is created successfully. Please check your email and verify the account.";
		String success_message="Your REAN Deploy account is created successfully. Please check your email and verify the account.";
		String not_verified ="User is not yet verified.";
		//String exist_message="User with email "+ dnsignup.getUser_email() +" is already registered.";
		String invalid ="Invalid user and password combination.";
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();
		String notificationMessage =element.getText();
		Assert.assertEquals(success_message, notificationMessage);
		sleepTime();

		
		
	}
	

	
}

		
		
	

	

	
