package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSDependsOnPageObject extends BaseClass {


	public AWSDependsOnPageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,xpath="//div[@title='Depends On']")
	public static WebElement dependsOn_resource;
	
	
	@FindBy(how=How.XPATH,xpath="//*[text()='Depends_On']/following::div[@class='ng-scope']//input[1]")
	public static WebElement dependsOn_attribute;
	

}