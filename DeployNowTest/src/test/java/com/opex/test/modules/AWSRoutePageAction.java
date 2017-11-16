package com.opex.test.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSKeyPairPageObject;
import com.opex.test.pageobjects.AWSRoutePageObject;
import com.opex.test.pageobjects.EnvironmentPage;

public class AWSRoutePageAction extends SleepFunctionality{
	


	public static void selectRoute(WebDriver driver){

		Log.info("User click on route to use");
		sleepTime();
		Actions action = new Actions(driver);
		(new Actions(driver)).dragAndDrop(AWSRoutePageObject.route_resource, EnvironmentPage.canvas).perform();
		Reporter.log("click action perform");

	}
	
	public static void enterDestn_cidr(WebDriver driver,String destn_cidr){
		
		Log.info("User enter destnation cidr");
		AWSRoutePageObject.enter_destn_cidr.clear();
		sleepTime(1000);
		AWSRoutePageObject.enter_destn_cidr.sendKeys(destn_cidr);
		Reporter.log("Destination cidr block entered");
	}
	
public static void enterRouteTableId(WebDriver driver,String routeTable_id){
		
		Log.info("User enter route table id");
		AWSRoutePageObject.enter_routeTable_id.clear();
		sleepTime(1000);
		AWSRoutePageObject.enter_routeTable_id.sendKeys(routeTable_id);
		Reporter.log("Route table id entered");
	}
	
public static void enterGatewayId(WebDriver driver,String gateway_id){
	
	Log.info("User enter gateway id");
	AWSRoutePageObject.enter_gateway_id.clear();
	sleepTime(1000);
	AWSRoutePageObject.enter_gateway_id.sendKeys(gateway_id);
	Reporter.log("Gateway id entered");
}
public static void enterInstanceId(WebDriver driver,String instance_id){
	
	Log.info("User enter instance id");
	AWSRoutePageObject.enter_instance_id.clear();
	sleepTime(1000);
	AWSRoutePageObject.enter_gateway_id.sendKeys(instance_id);
	Reporter.log("instance id entered");
}
public static void enterNatgatewayId(WebDriver driver,String natgateway_id){
	
	Log.info("User enter natgateway id");
	AWSRoutePageObject.enter_natgateway_id.clear();
	sleepTime(1000);
	AWSRoutePageObject.enter_natgateway_id.sendKeys(natgateway_id);
	Reporter.log("natgateway id entered");
}	
public static void enternetworkinterfaceid(WebDriver driver,String networkinterface_id){
	
	Log.info("User enter network interface id");
	AWSRoutePageObject.network_interface_id.clear();
	sleepTime(1000);
	AWSRoutePageObject.network_interface_id.sendKeys(networkinterface_id);
	Reporter.log("network interface id entered");
}	
public static void entervpcpeering(WebDriver driver,String vpcpeering){
	
	Log.info("User enter vpc peering id");
	AWSRoutePageObject.vpc_peering_id.clear();
	sleepTime(1000);
	AWSRoutePageObject.vpc_peering_id.sendKeys(vpcpeering);
	Reporter.log("vpc peering id entered");
}
}
