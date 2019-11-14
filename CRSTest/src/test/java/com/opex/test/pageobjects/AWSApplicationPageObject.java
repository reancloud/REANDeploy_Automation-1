package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSApplicationPageObject extends BaseClass {
	
	public AWSApplicationPageObject(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,xpath="//*[@id='UserId']")
	public static WebElement username;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='Password']")
	public static WebElement password;
	
	@FindBy(how=How.XPATH,xpath="/html/body/div[1]/div/div[2]/div/div[2]/form/fieldset/input[1]")
	public static WebElement login_button;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\'MainTitle\']/strong")
	public static WebElement main_title;
	
	@FindBy(how=How.XPATH,xpath="//button[@type='button']//following::*[text()='Edit']")
	public static WebElement editbutton;
	
	@FindBy(how=How.XPATH,xpath="//*[@value='Update']")
	public static WebElement updatebutton;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='form-actions floatRight']//following::button[text()='Reset Form']")
	public static WebElement resetformButton;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='main_content_ASPxSplitter1_formLayout_cboGroup_I']")
	public static WebElement group_code;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='main_content_ASPxSplitter1_formLayout_cboAccount_I']")
	public static WebElement account_number;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='main_content_ASPxSplitter1_formLayout_btnSearch']/span")
	public static WebElement search_button;
	
    @FindBy(how=How.XPATH,xpath="//*[@id='AccountMenu']/a")
	public static WebElement account_menu;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='AccountMenu']/ul/li[3]/a")
	public static WebElement account_holder;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='MainTitle']")
	public static WebElement account_holder_main_tile;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='main_content_Grid_DXCBtn0_CD']/span")
	public static WebElement edit_option;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='main_content_Grid_DXPEForm_DXEFL_DXEditor4_I']")
	public static WebElement dob_field;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='main_content_Grid_DXPEForm_DXEFL_DXCBtn38']/span")
	public static WebElement update_button;
	
	
	
	
	
	
	
	
}