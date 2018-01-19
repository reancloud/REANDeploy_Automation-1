package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSApplicationPageObject extends BaseClass {
	
	public AWSApplicationPageObject(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,xpath="//*[@id='uname']")
	public static WebElement username;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='age']")
	public static WebElement userage;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='salary']")
	public static WebElement usersalary;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='form-actions floatRight']//following::*[@value='Add']")
	public static WebElement addbutton;
	
	@FindBy(how=How.XPATH,xpath="//button[@type='button']//following::*[text()='Edit']")
	public static WebElement editbutton;
	
	@FindBy(how=How.XPATH,xpath="//*[@value='Update']")
	public static WebElement updatebutton;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='form-actions floatRight']//following::button[text()='Reset Form']")
	public static WebElement resetformButton;
	
	@FindBy(how=How.XPATH,xpath="//*[@type='button']//following::*[text()='Remove']")
	public static WebElement removeButton;
}
