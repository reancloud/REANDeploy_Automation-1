package com.opex.test.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSRoute53RecordPageObject {
	
	@FindBy(how=How.XPATH, xpath="//div[@title='Route53 Record']")
	public static WebElement resource_route_record;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement Rroute_record_name;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='records']/following::*[text()='Set Array'][1]")
	public static WebElement route_recordsetarray_Click;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='Set Array value for: records ']//following::div[@class='ace_content'][1]")
	public static WebElement select_text_area_route;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='ttl']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement route_ttl;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='type']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement route_type;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='zone_id']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement route_zone_id;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='alias']/following::*[contains(text(),'Set Json')][1]")
	public static WebElement route_alias;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='continent']/following::*[@type='text'][1]")
	public static WebElement route_continent;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='country']/following::*[@type='text'][1]")
	public static WebElement route_country;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='evaluate_target_health']/following::*[@type='text'][1]")
	public static WebElement route_evaluate_target_health;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='failover_routing_policy']/following::*[contains(text(),'Set Json')][1]")
	public static WebElement route_failover_routing_policy;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='geolocation_routing_policy']/following::*[contains(text(),'Set Json')][1]")
	public static WebElement route_geolocation_routing_policy ;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='health_check_id']/following::*[@type='text'][1]")
	public static WebElement route_health_check_id;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='latency_routing_policy']/following::*[contains(text(),'Set Json')][1]")
	public static WebElement route_latency_routing_policy;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='region']/following::*[@type='text'][1]")
	public static WebElement route_region;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='set_identifier']/following::*[@type='text'][1]")
	public static WebElement route_set_identifier;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='subdivision']/following::*[@type='text'][1]")
	public static WebElement route_subdivision;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='weight']/following::*[@type='text'][1]")
	public static WebElement route_weight;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='weighted_routing_policy']/following::*[contains(text(),'Set Json')][1]")
	public static WebElement route_weighted_routing_policy ;
	
}
