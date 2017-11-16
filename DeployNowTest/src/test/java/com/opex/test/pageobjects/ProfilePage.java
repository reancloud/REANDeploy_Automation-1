package com.opex.test.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePage extends BaseClass{

	public ProfilePage(WebDriver driver){
		super(driver);
	}    

	@FindBy(how=How.XPATH, xpath=".//a[text()='Profile']")
	public static WebElement profile_selection;
	
	@FindBy(how=How.XPATH, xpath=".//button[text()='Update']")
	public static WebElement update_click;
	
	@FindBy(how=How.XPATH, xpath=".//input[@ng-model='referFriendRequest.friendEmail']")
	public static WebElement friend_email;
	
	@FindBy(how=How.XPATH, xpath=".//button[text()='Refer']")
	public static WebElement refer_click;
	

	@FindBy(how=How.XPATH, xpath="//md-switch[@aria-checked='true']")
	public static WebElement toggle_off;
	
	@FindBy(how=How.XPATH, xpath="//md-switch[@aria-checked='false']")
	public static WebElement toggle_on;
	
	//span[text()=' Change Password ']
	@FindBy(how=How.XPATH, xpath="//md-switch[@aria-checked='false']")
	public static WebElement change_password_text;
	
	@FindBy(how=How.XPATH, xpath="//input[@name='password']")
	public static WebElement profile_password;
	
	@FindBy(how=How.XPATH, xpath="//input[@name='repassword']")
	public static WebElement profile_repassword;
	
	//img[@src='images/referFriend.jpg']
	@FindBy(how=How.XPATH, xpath="//img[@src='images/referFriend.jpg']")
	public static WebElement profile__friend_image;
	
	@FindBy(how=How.XPATH, xpath="//form[@name='profileForm']//input[@ng-model='user.name']")
	public static WebElement profile_username;
	
	@FindBy(how=How.XPATH, xpath="//form[@name='profileForm']//input[@name='emailAddress']")
	public static WebElement profile_email;
	
	@FindBy(how=How.XPATH, xpath="//form[@name='profileForm']//input[@name='clientName']")
	public static CharSequence profile_email1;
	
	//form[@name='profileForm']//*[text()='Company']
	@FindBy(how=How.XPATH, xpath="//form[@name='profileForm']//input[@name='orgURL']")
	public static WebElement profile_Company;
	

}