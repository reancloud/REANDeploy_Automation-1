package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BastionHostPageObject {
	
	@FindBy(how=How.XPATH, xpath="//*[@id='simple-dropdown']/i")
	public static WebElement profile_link;
	
	@FindBy(how=How.XPATH, xpath="//a[text()='Connections']")
	public static WebElement connection_link;
	
	@FindBy(how=How.XPATH, xpath="//a[text()='Bastion Connection']")
	public static WebElement bastion_link;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='bHost']")
	public static WebElement bastion_host;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='bUser']")
	public static WebElement bastion_user;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='bPort']")
	public static WebElement bastion_port;
	
	
	@FindBy(how=How.XPATH, xpath="//*[@class='modal-body']//following::textarea")
	public static WebElement bastion_key;
	
	@FindBy(how=How.XPATH, xpath="//button[text()='Set Parameter']")
	public static WebElement setparameter_button;
	
	@FindBy(how=How.XPATH, xpath="//*[@class='close']")
	public static WebElement bastion_closebutton;
	
	
	
	}
