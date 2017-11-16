package com.opex.test.modules;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;


public class AWSRouteTablePageAction extends SleepFunctionality{

	public static void enterRouteTableVpcId(WebDriver driver,String VPCid) throws Exception{
		Log.info("Enter vpc id Value");
		WebElement toClear = AWSRouteTablePageObject.RT_vpc_id;
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		AWSRouteTablePageObject.RT_vpc_id.sendKeys(VPCid);
		Reporter.log("Enter VPC ID for route table");		
	}

	public static void enterPropagationArray(WebDriver driver,String propagation) throws Exception{
		Log.info("Enter propagatio array");
		CommonFunctionalityPageAction.setArrayCommon(driver, propagation, AWSRouteTablePageObject.click_RT_propagating_vgws,CommonFunctionalityPage.select_text_area_for_propagation,CommonFunctionalityPage.array_set_value);
		Reporter.log("Enter propagation array for route table");
	}

	public static void enterRouteJson(WebDriver driver,String routeJson) throws Exception{
		Log.info("Enter routetable Route json");
		JSONParser parser = new JSONParser();	
		Object jsn = parser.parse(routeJson);
		CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSRouteTablePageObject.click_RT_route,CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("Enter Route json for route table");
	}

}

