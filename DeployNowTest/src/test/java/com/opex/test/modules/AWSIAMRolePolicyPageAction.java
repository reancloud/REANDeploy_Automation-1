package com.opex.test.modules;

import org.json.simple.parser.JSONParser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSIAMRolePolicyPageObject;
import com.opex.test.pageobjects.AWSNATgatewayPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSIAMRolePolicyPageAction extends SleepFunctionality{
	
	public static void enterName(WebDriver driver,String name) throws Exception{
		Log.info("Enter name for IAMRolePolicy");
		sleepTime(1000);
		AWSIAMRolePolicyPageObject.enter_name.clear();
		AWSIAMRolePolicyPageObject.enter_name.sendKeys(name);
		Reporter.log("Name for IAMRolePolicy is entered");
	}
	public static void enterPolicy(WebDriver driver, String policy) throws Exception{
		Log.info("Enter policy IAMRolePolicy");
		sleepTime(3000);
		CommonFunctionalityPageAction.setJsonCommon(driver, policy,AWSIAMRolePolicyPageObject.click_policy_setText, AWSIAMRolePolicyPageObject.click_textArea,AWSIAMRolePolicyPageObject.setValue_textArea);
		Reporter.log("Policy for IAMRolePolicy is entered");
	}
	
	public static void enterRole(WebDriver driver,String role) throws Exception{
		Log.info("Enter role for IAMRolePolicy");
		AWSIAMRolePolicyPageObject.enter_role.sendKeys(role);
		//sleepTime();
		Reporter.log("Role for IAMRolePolicy is entered");
	}
	
	

	

}
