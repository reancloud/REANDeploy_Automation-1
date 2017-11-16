package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class KmsResourcePageObject {
	
	@FindBy(how=How.XPATH, xpath="//div[@title='AWS KMS alias']")
	public static WebElement KMS_Alias;
	
	@FindBy(how=How.XPATH, xpath="//div[@title='AWS KMS Key']")
	public static WebElement KMS_key;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='target_key_id']//following::input[1]")
	public static WebElement target_key_id;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name']//following::input[1]")
	public static WebElement alias_name;
	
	

}

