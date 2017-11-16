package com.opex.test.pageobjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.Annotations;
public class ConnectionPage extends BaseClass{

	public ConnectionPage(WebDriver driver){
		super(driver);
	}   
	
	@FindBy(how=How.XPATH, xpath="//*[text()='PX_SSH']")
	public static WebElement SSH;
	
	/*@FindBy(how=How.XPATH, xpath="//*[@uib-popover='More']/following::a[text()='Connections']")
	public static WebElement connection_selection;*/
	
	@FindBy(how=How.XPATH, xpath="//*[@id='simple-dropdown']/following::a[text()='Connections']")
	public static WebElement connection_selection;
	
	@FindBy(how=How.XPATH, xpath="//h2[contains(text(),'Are you sure?')]")
	public static WebElement remove_click_textbox;
	
	@FindBy(how=How.XPATH, xpath="//h2[contains(text(),'Are you sure?')]/following::span[text()='Yes!']")
	public static WebElement remove_click_yes;
	
	@FindBy(how=How.XPATH, xpath="//h2[contains(text(),'Are you sure?')]/following::span[text()='Cancel']")
	public static WebElement remove_click_cancle;
	
	
	
	@FindBy(how=How.XPATH, xpath="//tr[contains(.,'PX_SSH')]//button[1]")
	public static WebElement edit_click_SSH;
	
	@FindBy(how=How.XPATH, xpath="//tr[contains(.,'PX_WinRM')]//button[1]")
	public static WebElement edit_click_WinRM;
	
	@FindBy(how=How.XPATH, xpath=".//button[contains(.,'Save')]")
	public static WebElement save_click;
	
	@FindBy(how=How.XPATH, xpath=".//button[contains(.,'Update')]")
	public static WebElement update_button;

	/*@FindBy(how=How.XPATH, xpath=".//button[contains(.,'Add')]")
	public static WebElement add_click;*/
	@FindBy(how=How.XPATH, xpath=".//button[contains(.,'Add')]")
	public static WebElement add_click;
	
	@FindBy(how=How.XPATH, xpath="//h4[text()='Connection List']")
	public static WebElement connectionlist;
	
	@FindBy(how=How.XPATH,xpath = "//tr[contains(.,'PX_SSH')]//button[2]")       
	 public static WebElement delete_click_SSH;
	 
	@FindBy(how=How.XPATH,xpath = "//tr[contains(.,'PX_WinRM')]//button[2]")
	 public static WebElement delete_click_WinRM;
	 
	@FindBy(how=How.XPATH, xpath=".//input[@ng-model='vmConnection.name']")
	public static WebElement connection_name;
	
	@FindBy(how=How.XPATH, xpath="//*[@class='md-select-value']//div[@class='md-text ng-binding']")
	public static WebElement connection_type_dropdown;
	
	@FindBy(how=How.XPATH, xpath="//*[@value='WinRM']")
	public static WebElement connection_type_WinRM;
	
	@FindBy(how=How.XPATH, xpath=".//input[@ng-model='vmConnection.user']")
	public static WebElement connection_username;
	
	@FindBy(how=How.XPATH, xpath=".//input[@ng-model='vmConnection.password']")
	public static WebElement connection_password;
	
	@FindBy(how=How.XPATH, xpath=".//*[@class='md-thumb md-ink-ripple'][1]")
	public static WebElement connection_toggle;
	
	
	@FindBy(how=How.XPATH, xpath=".//textarea[@ng-model='vmConnection.secureKey']")
	public static WebElement connection_ssh_key;
	
	@FindBy(how=How.XPATH, xpath="//section[@class='col-sm-6']//md-content[@style='height:419px;overflow-y:auto']")
	public static WebElement connection_scrollbar;
	
		@FindBy(how=How.XPATH, xpath="//*[@ng-click='checkOwnSSHKey()']")
		public static WebElement sshKeyCheckBox;
		
	
	}
