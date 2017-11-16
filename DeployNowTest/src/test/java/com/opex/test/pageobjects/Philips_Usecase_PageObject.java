package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Philips_Usecase_PageObject {

	@FindBy(how=How.XPATH, xpath="//*[text()='subnet_id']//following::div[@class='ng-scope'][1]")
	public static WebElement subnetid_natgateway;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='ingress']/following::*[contains(text(),'Set Json')][1]")
	public static WebElement ingressJson_sg;

	@FindBy(how=How.XPATH,xpath="//*[text()='output']/following::tbody/tr[4]/td[2]/a")
	public static WebElement click_outputjson;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='resourceNode-text']//*[text()='Output']")
	public static WebElement resource_output_click;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='vpc_id']//following::*[@class='form-control input-sm ng-pristine ng-valid ng-scope ng-not-empty ng-touched'][1]")
	public static WebElement securitygroup_vpc_id_PU;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='vpc_peering_c...']/following::*[@type='text'][1]")
	public static WebElement vpc_peering_id;

}
