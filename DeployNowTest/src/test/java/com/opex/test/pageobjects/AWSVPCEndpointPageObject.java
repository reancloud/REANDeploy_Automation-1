package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSVPCEndpointPageObject {
	
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='AWS VPC Endpoint']")
	public static WebElement resource_vpcendpoint;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='service_name']/following::*[3]")
	public static WebElement enter_service_name_value;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='vpc_id']/following::*[3]")
	public static WebElement select_vpc_id_value;
	
	@FindBy(how=How.XPATH,xpath=".//*[@id='tab-content-2']//*[contains(text(),'Set text')]")
	public static WebElement policy_set_text_btn;
	
	@FindBy(how=How.XPATH, xpath="//*[@ng-click='closeSetStringModal()']")
	public static WebElement policy_set_value_btn;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='setStringModal']/div/div/div[2]/div/div[2]/div")
	public static WebElement policy_text_area;
	
	@FindBy(how=How.XPATH,xpath=".//*[@id='tab-content-2']//*[contains(text(),'Set Array')]")
	public static WebElement endpoint_route_table_id;

}
