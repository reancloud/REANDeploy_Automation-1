package com.opex.test.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSEipPage {
	
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='Elastic IP']")
	public static WebElement resource_eip;
	
	
	@FindBy(how=How.XPATH, xpath="//*[text()='associate_with_private_ip']/following::*[@type='text'][1]")
	public static WebElement enter_ass_private_ip;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='instance']/following::*[@type='text'][1]")
	public static WebElement enter_instance;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='network_interface']/following::*[@type='text'][1]")
	public static WebElement enter_network_interface;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='vpc']/following::input[@type='search']")
	public static WebElement select_vpc_eip;
	
}