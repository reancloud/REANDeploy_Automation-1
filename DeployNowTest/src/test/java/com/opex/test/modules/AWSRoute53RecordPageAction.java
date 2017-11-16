package com.opex.test.modules;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSRoute53RecordPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;


public class AWSRoute53RecordPageAction extends SleepFunctionality {


	
	public static void dragdroproute_record(WebDriver driver) throws Exception{

		Log.info("Select Route53_Record resource drag and drop on canvas resource  ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRoute53RecordPageObject.resource_route_record);
		Reporter.log("Sign out is performed");		
	}

	public static void ResourceSetarray(WebDriver driver,String record_setarray) throws Exception{

		Log.info("User enter the Route53_Record resource name in the popup");
		CommonFunctionalityPageAction.setArrayCommon(driver, record_setarray, AWSRoute53RecordPageObject.route_recordsetarray_Click, CommonFunctionalityPage.select_text_area_for_propagation, CommonFunctionalityPage.array_set_value);

		Reporter.log("Route53_Record array set");	
	}
	public static void Resourcettl(WebDriver driver,String ttl) throws Exception{
		Log.info("Enter Route53_Record TTL ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_ttl);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(ttl);
		action.build().perform();
		sleepTime(1000);
		Reporter.log("Route53_Record TTLis performed");
	}
	public static void Resourcetype(WebDriver driver,String type) throws Exception{
		Log.info("Enter Route53_Record Type ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_type);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(type);
		action.build().perform();
		sleepTime(1000);
		Reporter.log("Route53_Record is performed");
	}
	public static void Resourcezoneid(WebDriver driver,String zoneid) throws Exception{
		Log.info("Enter Route53_Record zone id ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_zone_id);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(zoneid);
		action.build().perform();
		sleepTime(1000);
		Reporter.log("Route53_Record zone idis performed");
	}
	public static void alias(WebDriver driver,String alias) throws Exception{
		Log.info("Enter Route53_Record alias ");
		CommonFunctionalityPageAction.setJsonCommon(driver, alias, AWSRoute53RecordPageObject.route_alias, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("Route53_Record alias is performed");
	}
	public static void continent(WebDriver driver,String continent) throws Exception{
		Log.info("Enter Route53_Record continent");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_continent);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(continent);
		action.build().perform();
		sleepTime(1000);
		Reporter.log("Route53_Record continent is performed");
	}
	public static void country(WebDriver driver,String country) throws Exception{
		Log.info("Enter Route53_Record Country ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_country);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(country);
		action.build().perform();
		sleepTime(1000);
		Reporter.log("Route53_Record Country is performed");
	}

	public static void evaluate_target_health(WebDriver driver,String evaluate_target_health) throws Exception{
		Log.info("Enter Route53_Record evaluate_target_health ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_evaluate_target_health);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(evaluate_target_health);
		action.build().perform();
		sleepTime(1000);		Reporter.log("Route53_Record evaluate_target_health is performed");
	}
	public static void failover_routing_policy(WebDriver driver,String failover_routing_policy) throws Exception{
		Log.info("Enter Route53_Record failover_routing_policy ");
		CommonFunctionalityPageAction.setJsonCommon(driver, failover_routing_policy, AWSRoute53RecordPageObject.route_failover_routing_policy, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("Route53_Record failover_routing_policy is performed");
	}
	public static void geolocation_routing_policy(WebDriver driver,String geolocation_routing_policy) throws Exception{
		Log.info("Enter Route53_Record geolocation_routing_policy ");
		CommonFunctionalityPageAction.setJsonCommon(driver, geolocation_routing_policy, AWSRoute53RecordPageObject.route_geolocation_routing_policy, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("Route53_Record geolocation_routing_policy is performed");
	}
	public static void health_check_id(WebDriver driver,String health_check_id) throws Exception{
		Log.info("Enter Route53_Record health_check_id ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_health_check_id);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(health_check_id);
		action.build().perform();
		sleepTime(1000);
		Reporter.log("Route53_Record health_check_id is performed");
	}
	public static void latency_routing_policy(WebDriver driver,String latency_routing_policy) throws Exception{
		Log.info("Enter Route53_Record latency_routing_policy ");
		CommonFunctionalityPageAction.setJsonCommon(driver, latency_routing_policy, AWSRoute53RecordPageObject.route_latency_routing_policy, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);

		Reporter.log("Route53_Record latency_routing_policyis performed");
	}
	public static void region(WebDriver driver,String region) throws Exception{
		Log.info("Enter Route53_Record Name ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_region);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(region);
		action.build().perform();
		sleepTime(1000);
		Reporter.log("Route53_Record is performed");
	}
	public static void set_identifier(WebDriver driver,String set_identifier) throws Exception{
		Log.info("Enter Route53_Record set_identifier ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_set_identifier);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(set_identifier);
		action.build().perform();
		sleepTime(1000);
		Reporter.log("Route53_Record is performed");
	}
	public static void subdivision(WebDriver driver,String subdivision) throws Exception{
		Log.info("Enter Route53_Record Name ");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_subdivision);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(subdivision);
		action.build().perform();
		sleepTime(1000);
		Reporter.log("Route53_Record is performed");
	}
	public static void weight(WebDriver driver,String weight) throws Exception{
		Log.info("Enter Route53_Record weight ");
		sleepTime();
		Actions action=new Actions(driver);
		action.moveToElement(AWSRoute53RecordPageObject.route_weight);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(weight);
		action.build().perform();
		sleepTime(1000);
		Reporter.log("Route53_Record weight is performed");
	}
	public static void weighted_routing_policy(WebDriver driver,String weighted_routing_policy) throws Exception{
		Log.info("Enter Route53_Record weighted_routing_policy ");
		CommonFunctionalityPageAction.setJsonCommon(driver, weighted_routing_policy, AWSRoute53RecordPageObject.route_weighted_routing_policy, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("Route53_Record weighted_routing_policy is performed");
	}
	

}
