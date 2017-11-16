package com.opex.test.modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSFlowLogPageObject;
import com.opex.test.pageobjects.AWSIAMGroupPageObject;
import com.opex.test.pageobjects.AWSIAMRolePage;
import com.opex.test.pageobjects.CommonFunctionalityPage;


public class AWSFlowLogPageAction extends SleepFunctionality {

	public static void selectFlowLog(WebDriver driver) throws Exception{

		Log.info("User drag and drop flow log resource");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSFlowLogPageObject.flow_log_resource);
		Reporter.log(" ");

	}


	public static void enterIamRoleArnFlowLog(WebDriver driver, String iamRoleArn){

		Log.info("User enter iam role arn attribute for flow log");
		Actions action=new Actions(driver);
		action.moveToElement(AWSFlowLogPageObject.iam_role_arn);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(iamRoleArn);
		action.click().build().perform();
		Reporter.log(" ");	

	}
	
	public static void enterLogGroupNameFlowLog(WebDriver driver, String logGroupName){

		Log.info("User enter iam role arn attribute for flow log");
		Actions action=new Actions(driver);
		action.moveToElement(AWSFlowLogPageObject.log_group_name);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(logGroupName);
		action.click().build().perform();	
		Reporter.log(" ");	

	}
	public static void enterTrafficTypeFlowLog(WebDriver driver, String trafficType){

		Log.info("User enter iam role arn attribute for flow log");
		Actions action=new Actions(driver);
		action.moveToElement(AWSFlowLogPageObject.traffic_type);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(trafficType);
		action.click().build().perform();	
		Reporter.log(" ");	

	}
	
	public static void enterVpcIdFlowLog(WebDriver driver, String vpcId){

		Log.info("User enter vpc id attribute for flow log");
		Actions action=new Actions(driver);
		action.moveToElement(AWSFlowLogPageObject.flow_log_vpc_id);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(vpcId);
		action.click().build().perform();	
		Reporter.log(" ");	

	}
	public static void enterSubnetIdFlowLog(WebDriver driver, String subnetId){

		Log.info("User enter iam role arn attribute for flow log");
		Actions action=new Actions(driver);
		action.moveToElement(AWSFlowLogPageObject.flow_log_subnet_id);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(subnetId);
		action.click().build().perform();	
		Reporter.log(" ");	

	}
	public static void enterEniIdFlowLog(WebDriver driver, String eniId){

		Log.info("User enter eni id attribute for flow log");
		Actions action=new Actions(driver);
		action.moveToElement(AWSFlowLogPageObject.flow_log_eni_id);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(eniId);
		action.click().build().perform();	
		Reporter.log(" ");	

	}
	
	public static void enterAssumeRolePolicy(WebDriver driver, String json) throws Exception{

		Log.info("User enter assume role policy for flow log");
		CommonFunctionalityPageAction.setJsonCommon(driver, json, AWSIAMRolePage.iamRole_click_settext, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);	
		Reporter.log(" ");	
	}
}
