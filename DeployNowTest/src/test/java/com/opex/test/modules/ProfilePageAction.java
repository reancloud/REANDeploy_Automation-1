package com.opex.test.modules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.pageobjects.ProfilePage;

import junit.framework.AssertionFailedError;

public class ProfilePageAction extends SleepFunctionality{

	public static void Execute(WebDriver driver) throws Exception{

		Log.info("Click action is performed on Dropdown icon");
		sleepTime(5000);
		CommonPage.dropdown_click.click();
		Log.info("Click action is performed on Signout button");
		ProfilePage.profile_selection.click();
		sleepTime(5000);
		WebElement element = driver.findElement(By.xpath("//h4[text()='My Profile']"));
		String strng = element.getText();
		if(strng != null){

			assertEquals("User navigate to Profile page"+strng);
		}
		else{
			Assert.fail("User cannot navigate to Profile page");
		}
		Reporter.log("Sign out is performed");

	}
	private static void assertEquals(String string) {
		// TODO Auto-generated method stub
		
	}
	public static void profileName(WebDriver driver, String name) throws Exception{

		Log.info("Name is entered in the text box");
		ProfilePage.profile_username.clear();
		ProfilePage.profile_username.sendKeys(name);
		Reporter.log("Sign out is performed");

	}

	/*public static boolean isValidEmailAddress() {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(ProfilePage.profile_email1);
        return m.matches();
 }*/
	public static void profileEmail(WebDriver driver, String email) throws Exception{

		Log.info("Email is entered in the text box");
		ProfilePage.profile_email.click();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(email);
		action.build().perform();
		sleepTime();
		Reporter.log("Sign out is performed");
	}
	public static void profileCompany(WebDriver driver, String company) throws Exception{

		Log.info("Company name is entered in the text box");
		ProfilePage.profile_Company.clear();
		ProfilePage.profile_Company.sendKeys(company);
		Reporter.log("Sign out is performed");
	}

	public static void performUpdateClick(WebDriver driver) throws Exception{

		Log.info("Click action is performed on update button");
		ProfilePage.update_click.click();
		Reporter.log("Sign out is performed");
		assertEquals(
				"Fail if Connection Updated successfully. message not displayed",
				driver.findElement(By.xpath("//*[@class='message ng-binding']"))
				.getText(), "Profile updated successfully.");
		}
	
	public static void profileUpdateButtonColor(WebDriver driver)  {

		Log.info("Mouse hover action is performed on update button");
		System.out.println("Color of a button before mouse hover: "	+ProfilePage.update_click.getCssValue("background-color"));
		Actions action = new Actions(driver);
		action.moveToElement(ProfilePage.update_click).click().build().perform();
		System.out.println("Color of a button after mouse hover : "	+ProfilePage.update_click.getCssValue("background-color"));
	}
	public static void profileReferButtonColor(WebDriver driver)  {

		Log.info("Mouse hover action is performed on refer button");
		System.out.println("Color of a button before mouse hover: "	+ProfilePage.refer_click.getCssValue("background-color"));
		Actions action = new Actions(driver);
		action.moveToElement(ProfilePage.refer_click).click().build().perform();

		System.out.println("Color of a button after mouse hover : "	+ProfilePage.refer_click.getCssValue("background-color"));
	}
	public static void friendsEmail(WebDriver driver) throws Exception{

		Log.info("Text is entered in friend's email text box");
		//ProfilePage.friend_email.sendKeys("nishant.kumar@opexsoftware.com");
		Reporter.log("Sign out is performed");

	}

	public static void performReferClick(WebDriver driver) throws Exception{

		Log.info("Click action is performed on Dropdown icon");
		ProfilePage.refer_click.click();
		Reporter.log("Sign out is performed");

	}
	public static void perform_toggle_On(WebDriver driver) throws Exception{

		Log.info("On toggle button");
		ProfilePage.toggle_on.click();
		Reporter.log("Sign out is performed");
	}
	public static void perform_toggle_Off(WebDriver driver) throws Exception{

		Log.info("Off toggle button");
		ProfilePage.toggle_off.click();
		Reporter.log("Sign out is performed");
	}
	public static void profilePassword(WebDriver driver, String password)throws Exception{

		Log.info("Click action is performed on password");
		ProfilePage.profile_password.sendKeys(password);
		Reporter.log("Sign out is performed");

	}

	public static void typeRetriveAndVerifyPassword(WebDriver driver, String repassword)throws Exception{

		Log.info("Click action is performed on password");
		ProfilePage.profile_password.sendKeys(repassword);
		assertEquals("password::","abc",ProfilePage.profile_password.getAttribute("value"));
		Reporter.log("Sign out is performed");

	}
	private static void assertEquals(String string, String string2, String attribute) {

		System.out.println(ProfilePage.profile_password.getAttribute("value"));
		// TODO Auto-generated method stub

	}
	public static void profilePasswordDisabled(WebDriver driver)throws Exception{

		Log.info("Click action is performed on password");
		if(ProfilePage.profile_password.isEnabled()){
			Assert.fail("Password field is enabled");
		}
		else{
			assertEquals("Password is disabled");
		}
		Reporter.log("Sign out is performed");

	}
	public static void profileRePasswordDisabled(WebDriver driver)throws Exception{

		Log.info("Click action is performed on re password");
		if(ProfilePage.profile_repassword.isEnabled()){
			Assert.fail("Re-Password field is enabled");
		}
		else{
			assertEquals("Re-Password is disabled");
		}
		Reporter.log("Sign out is performed");

	}
	public static void profilePasswordEnabled(WebDriver driver)throws Exception{

		Log.info("Click action is performed on password");
		if(ProfilePage.profile_password.isEnabled()){
			assertEquals("Password is enabled");
		}
		else{
			Assert.fail("Password field is disabled");
			
		}
		Reporter.log("Sign out is performed");

	}
	public static void profileRePasswordEnabled(WebDriver driver)throws Exception{

		Log.info("Click action is performed on re password");
		if(ProfilePage.profile_password.isEnabled()){
			assertEquals("Re-Password is Enabled");
		}
		else{
			Assert.fail("Re-Password field is disabled");
			
		}
		Reporter.log("Sign out is performed");

	}

	public static void profileRePassword(WebDriver driver, String repassword)throws Exception{

		Log.info("Click action is performed on repassword");
		ProfilePage.profile_repassword.sendKeys(repassword);
		Reporter.log("Sign out is performed");

	}

	public static void profileBlankName(WebDriver driver) throws Exception{

		Log.info("Right Click action is performed on refer friend image");
		ProfilePage.profile_username.clear();
		ProfilePage.profile_username.sendKeys(" ");
		ProfilePage.profile_Company.click();
		
		assertEquals(
				"Fail if Connection Updated successfully. message not displayed",
				driver.findElement(By.xpath("//div[@ng-message='required']"))
				.getText(), "You forgot to enter your name ...");
		
	
		Reporter.log("Sign out is performed");
	}


	public static void referFriendImage(WebDriver driver) {
		// TODO Auto-generated method stub

	}
	public static void isValidEmailAddress() {
		// TODO Auto-generated method stub

		/*ProfilePage.profile_email.clear();

		ProfilePage.profile_email.sendKeys("priyankargangurde2@gmail.com");    */
		try{
			if(ProfilePage.profile_email.isDisplayed()){

				String s =  ProfilePage.profile_email.getAttribute("value");


				String[] a = s.split("@");

				if(a[0].equalsIgnoreCase("automation.rcs"))
				{
					System.out.println("PASS");
				}
				else
				{
					System.out.println("Fail");
				}
				System.out.println(" "+a[0]);
			}
			else{
				System.out.println("not passed");
			}

		}catch(Exception e){
			System.out.println("Element not present");
		}
	}
	public static void isValidFriendsEmailAddress() {
		// TODO Auto-generated method stub

		///*ProfilePage.friend_email;

		ProfilePage.friend_email.sendKeys("pallavi.gujju@reancloud.com");   
		try{
			if(ProfilePage.friend_email.isDisplayed()){

				String s =  ProfilePage.friend_email.getAttribute("value");


				String[] a = s.split("@");

				if(a[0].equalsIgnoreCase("pallavi.gujju"))
				{
					System.out.println("PASS");
				}
				else
				{
					System.out.println("Fail");
				}
				System.out.println(" "+a[0]);
			}
			else{
				System.out.println("not passed");
			}

		}catch(Exception e){
			System.out.println("Element not present");
		}
	}
	public static void performUpdateClick1(WebDriver driver) {
		Log.info("Click action is performed on update button");
		ProfilePage.update_click.click();
		
		}
	
		
		
	}

