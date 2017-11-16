package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSNewPlanButtonPageObject {

	@FindBy(how=How.XPATH, xpath="//div[@ng-click='getDeploymentPlan()']")
		public static WebElement plan_button;
		
		@FindBy(how=How.XPATH, xpath="//*[@id='deploymentPlanModal']/div/div/div[1]/button")
		public static WebElement cross_button_on_planwindow;
		
		@FindBy(how=How.XPATH, xpath="//*[@id='deploymentPlanModal']/div/div/div[3]/button")
		public static WebElement close_button_on_planwindow;
		
	
	

}