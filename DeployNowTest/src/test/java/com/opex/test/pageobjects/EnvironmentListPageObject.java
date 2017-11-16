package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnvironmentListPageObject {
	
	
	@FindBy(how=How.XPATH, xpath="//*[text()='Environments']")
	public static WebElement environmentList_selection;
	
	
	@FindBy(how=How.XPATH, xpath="//*[@ng-click='dialog.hide()']")
	public static WebElement environmentList_yes;
	
	@FindBy(how=How.XPATH, xpath="//*[@ng-click='dialog.abort()']")
	public static WebElement environmentList_no;
	
	 
	@FindBy(how=How.XPATH, xpath="//input[@ng-model='searchenv']")
			//input[@type='text']")
	public static WebElement environmentList_searchBar;
}
