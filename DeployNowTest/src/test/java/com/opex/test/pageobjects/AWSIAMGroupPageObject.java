package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSIAMGroupPageObject extends BaseClass {



	public AWSIAMGroupPageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,xpath="//button[@id='EnvSelectorButton2']")
	public static WebElement environment_selection_for_resource;

	@FindBy(how=How.XPATH,xpath="//div[@title='AWS IAM Group']")
	public static WebElement iam_group_resource;

	@FindBy(how=How.XPATH,xpath="//*[text()='path']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement iamGroup_path_attribute;

	@FindBy(how=How.XPATH, xpath="//*[@class='env-canvas']//*[@class='scalable']") 
    public static WebElement resource_hoverresource;
	

}