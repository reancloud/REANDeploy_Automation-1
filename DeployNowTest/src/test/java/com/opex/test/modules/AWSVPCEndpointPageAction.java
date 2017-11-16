package com.opex.test.modules;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.AWSVPCEndpointPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSVPCEndpointPageAction extends SleepFunctionality{

	public static void enterVpcEndpointServiceName(WebDriver driver,String serviceName) throws Exception{
		Log.info("Service name for vpc endpoint");
		AWSVPCEndpointPageObject.enter_service_name_value.clear();
		AWSVPCEndpointPageObject.enter_service_name_value.sendKeys(serviceName);
		Reporter.log("Service name for vpc endpoint is entered ");
	}

	public static void enterVpcEndpointVpcId(WebDriver driver,String VpcID) throws Exception{
		Log.info("Enter vpc id vpc endpoint");
		WebElement toClear = AWSVPCEndpointPageObject.select_vpc_id_value;
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		AWSVPCEndpointPageObject.select_vpc_id_value.sendKeys(VpcID);
		Reporter.log("Enter vpc id for vpc endpoint is entered");

	}
	public static void enterVpcEndpointPolicyText(WebDriver driver,String policy) throws Exception{
		Log.info("Enter Policy for vpc endpoint");
		AWSVPCEndpointPageObject.policy_set_text_btn.click();
		Actions action=new Actions(driver);
		action.moveToElement(AWSVPCEndpointPageObject.policy_text_area);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		//action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(policy);
		action.build().perform();
		AWSVPCEndpointPageObject.policy_set_value_btn.click();	
		Reporter.log("Policy for vpc endpoint is entered");
	}

	public static void enterVpcEndpointRTId(WebDriver driver,String aryValue) throws Exception{
		Log.info("Enter route table id for vpc endpoint");
		CommonFunctionalityPageAction.setArrayCommon(driver,aryValue, AWSVPCEndpointPageObject.endpoint_route_table_id,CommonFunctionalityPage.select_text_area_for_propagation,CommonFunctionalityPage.array_set_value);
		Reporter.log("Route Table id for vpc endpoint is entered");
	}


}
