package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSKeyPairPageObject extends BaseClass{
	
	public AWSKeyPairPageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,xpath="//div[@title='AWS Key Pair']")
	public static WebElement keyPair_resource;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='resourceNode-text']//*[contains(text(),'automation-keypair')]")
	public static WebElement click_keyPair;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='key_name']/following::input[1]")
	public static WebElement keyPair_KeyName;
			
	@FindBy(how=How.XPATH, xpath="//*[text()='public_key']/following::input[1]")
	public static WebElement keyPair_PublicKey;	
	
}
