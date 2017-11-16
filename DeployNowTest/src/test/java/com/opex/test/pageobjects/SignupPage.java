package com.opex.test.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SignupPage extends BaseClass{
    
    public SignupPage(WebDriver driver){
   	 super(driver);
    }    


    
    @FindBy(how =How.XPATH,xpath="//*[@ng-click='showSignup()']")
    public static WebElement createAcc_link;
    
    @FindBy(how =How.XPATH,xpath="//*[text() ='Welcome to REAN Deploy']")
    public static WebElement welcome_deploy_title;
  
    
    @FindBy(how =How.XPATH,xpath="//input[ @ng-model='signup.name']")
    public static WebElement signup_name;
    
    @FindBy(how =How.XPATH,xpath="//*[@name='signupForm']//*[contains(text(),'Name')][1]")
    public static WebElement signup_name_text;
  
    
    @FindBy(how =How.XPATH,xpath="//*[@ng-model='others.tandcFlag']")
    public static WebElement signup_iagreechkbox;
    
    @FindBy(how =How.XPATH,xpath="//*[contains(text(),'Sign Up')]")
    public static WebElement signup_signupbtn;
        
    @FindBy(how =How.XPATH,xpath="//*[@ng-model='signup.email']")
    public static WebElement signup_email;
    
    @FindBy(how =How.XPATH,xpath="//*[@ng-model='signup.password']")
    public static WebElement signup_password;
    
    
    @FindBy(how =How.XPATH,xpath="//*[@ng-model='signup.orgURL']")
    public static WebElement signup_url;
    
    
    @FindBy(how =How.XPATH,xpath="//*[@ng-click='loadTermsAndCondition()']")
    public static WebElement signup_termsconditions;
    
    @FindBy(how =How.XPATH,xpath="//*[@ng-click='hideTermAndCondtions()']")
    public static WebElement signup_closebutton;
    
    @FindBy(how =How.XPATH,xpath="//*[@id='termsAndCondition']//div[3]//button")
    public static WebElement scrollbar;
    
    @FindBy(how =How.XPATH,xpath="//*[@id='termsAndCondition']//div[3]//button")
    public static WebElement signup_crossclosebutton;
    
    @FindBy(how =How.XPATH,xpath="//*[@ng-click='showSignIn()']")
    public static WebElement signup_signinlnk;
    


    


    
    
    
    


}




