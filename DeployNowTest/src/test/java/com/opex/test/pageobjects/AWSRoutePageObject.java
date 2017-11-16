package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSRoutePageObject extends BaseClass {


	public AWSRoutePageObject(WebDriver driver) {
		super(driver);
	}
	
	
@FindBy(how=How.XPATH,xpath="//div[@title='AWS Route']")
public static WebElement route_resource;

@FindBy(how=How.XPATH,xpath="//*[@class='resourceNode-text']//*[contains(text(),'automation-route')]")
public static WebElement click_route;

@FindBy(how=How.XPATH,xpath="//*[text()='destination_cidr_block']/following::*[@type='text'][1]")
public static WebElement enter_destn_cidr;

@FindBy(how=How.XPATH,xpath="//*[text()='route_table_id']/following::*[@type='text'][1]")
public static WebElement enter_routeTable_id;

@FindBy(how=How.XPATH,xpath="//*[text()='gateway_id']/following::*[@type='text'][1]")
public static WebElement enter_gateway_id;

@FindBy(how=How.XPATH,xpath="//*[text()='instance_id']/following::*[@type='text'][1]")
public static WebElement enter_instance_id;

@FindBy(how=How.XPATH,xpath="//*[text()='nat_gateway_id']/following::*[@type='text'][1]")
public static WebElement enter_natgateway_id;

@FindBy(how=How.XPATH,xpath="//*[text()='network_interface_id']/following::*[@type='text'][1]")
public static WebElement network_interface_id;

@FindBy(how=How.XPATH,xpath="//*[text()='vpc_peering_connection_id']/following::*[@type='text'][1]")
public static WebElement vpc_peering_id;

}
