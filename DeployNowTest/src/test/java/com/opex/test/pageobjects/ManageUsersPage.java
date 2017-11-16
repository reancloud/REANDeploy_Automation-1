package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ManageUsersPage extends BaseClass{

	public ManageUsersPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(how=How.XPATH, xpath="//*[@id='simple-dropdown']")
	public static WebElement usersicon;
	
	@FindBy(how=How.XPATH, xpath="//*[@placeholder='search Users']")
	public static WebElement search;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='UserMainOptions']//a[contains(text(),'Manage Users')]")
	public static WebElement manageusrs;
	
	@FindBy(how=How.XPATH, xpath="//*[@title='Assign Roles']")
	public static WebElement actionmanageusrs;
	
	
	@FindBy(how=How.XPATH, xpath=".//*[@id='assignRoleModal']/div/div/div[2]/table/tbody/tr[1]/td[1]/md-checkbox/div[1]")
	public static WebElement checkbox1;
	
	@FindBy(how=How.XPATH, xpath=".//*[@id='assignRoleModal']/div/div/div[2]/table/tbody/tr[2]/td[1]/md-checkbox/div[1]")
	public static WebElement checkbox2;
	
	@FindBy(how=How.XPATH, xpath=".//*[@id='assignRoleModal']/div/div/div[2]/table/tbody/tr[3]/td[1]/md-checkbox/div[1]")
	public static WebElement checkbox3;
	
	@FindBy(how=How.XPATH, xpath=".//*[@id='assignRoleModal']/div/div/div[2]/table/tbody/tr[4]/td[1]/md-checkbox/div[1]")
	public static WebElement checkbox4;

	@FindBy(how=How.XPATH, xpath="//*[@id='assignRoleModal']//*[text()='Assign Roles']")
	public static WebElement assignroles;
	
	@FindBy(how =How.XPATH,xpath="//input[ @ng-model='signup.name']")
    public static WebElement signup_name;
	
	@FindBy(how =How.XPATH,xpath="//*[@ng-model='signup.email']")
	 public static WebElement signup_email;
	
	@FindBy(how =How.XPATH,xpath="//*[@ng-model='signup.password']")
    public static WebElement signup_password;
	
	@FindBy(how =How.XPATH,xpath="//*[@ng-model='signup.orgURL']")
    public static WebElement signup_url;
     
	 @FindBy(how =How.XPATH,xpath="//*[@ng-model='others.tandcFlag']")
	 public static WebElement signup_iagreechkbox;
	 
	 @FindBy(how=How.XPATH, xpath="//*[@title='Delete User']")
	    public static WebElement deletebtn;
	 
	 @FindBy(how=How.XPATH, xpath="//span[text()='Yes']")
	    public static WebElement delete_yessearch;
	    
	 @FindBy(how=How.XPATH, xpath="//span[text()='No']")
	    public static WebElement delete_nosearch;
      
	 @FindBy(how =How.XPATH,xpath="//*[contains(text(),'Sign Up')]")
	    public static WebElement signup_signupbtn;
	
	

	
	

    



}
