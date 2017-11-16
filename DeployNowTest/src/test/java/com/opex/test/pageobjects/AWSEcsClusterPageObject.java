package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSEcsClusterPageObject extends BaseClass {

	public AWSEcsClusterPageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,xpath="//div[@title='AWS ECS Cluster']")
	public static WebElement ecsCluster_resource;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='name']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement ecsClusterNameAttribute;
}
