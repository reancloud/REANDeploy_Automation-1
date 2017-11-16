package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Gigamon_Quickstart_Page extends BaseClass {


	public Gigamon_Quickstart_Page(WebDriver driver) {
		super(driver);
	}
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='VPC1']")
    public static WebElement resource_clickresource;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='Public_subnet']")
    public static WebElement resource_clickresourcesubnet1;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='App_subnet']")
    public static WebElement resource_clickresourcesubnet2;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='Mirror_subnet']")
    public static WebElement resource_clickresourcesubnet3;
	
	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='Internet_Gateway1']")
	public static WebElement click_resource_igw;
	
	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='Nat_Gateway']")
	public static WebElement click_resource_nat_gateway;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='route']/following::*[text()='Set Json']")
    public static WebElement resource_routejson;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='output']/following::*[text()='Set Json'][2]")
    public static WebElement output_setjson;
	
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='pub_route_table']")
    public static WebElement resource_clickroutetableresource;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='priv_route_table']")
    public static WebElement resource_clickroutetable2resource;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='pubsubnet_to_igw']")
    public static WebElement resource_clickrouteassresource;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='appsubnet_to_nat']")
    public static WebElement click_route_tbl_association_resource;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='natp']")
    public static WebElement resource_clickNATresource;

	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='Elastic IP']")
	public static WebElement resource_clickeip;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='AWS Nat gateway']")
	public static WebElement resource_clickNAT;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='allocation_id']//following::div[@class='ng-scope'][1]")
	public static WebElement resource_allocation_id;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='tIGW']click_resource_igw")
    public static WebElement resource_clickrouteresource;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='tab-content-2']/div/md-content/table[2]/tbody/tr[1]/td[2]/input")
    public static WebElement resource_dependson;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='public_access']")
	public static WebElement resource_securitygroup1;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='mgmt_access']")
	public static WebElement resource_securitygroup2;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='mirror_access']")
	public static WebElement resource_securitygroup3;
	
	@FindBy(how=How.XPATH, xpath="//div[@title='Depends On']")
	public static WebElement depends_on_resource;
	
	@FindBy(how=How.XPATH, xpath="//*[@title='Depends_On']//following::*[@type='text'][1]")
	public static WebElement depends_on_value;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='networking']")
	public static WebElement click_resource_depends_on;
	
	@FindBy(how=How.XPATH,xpath="//a[contains(text(),'Set Json')]")
	public static WebElement select_set_json_for_output;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='subnet_id']//following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement subnet_id_for_instance;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='instances']/following::*[text()='Set Array'][1]")
	public static WebElement click_instances_setArray;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='setArrayModal']/div/div/div[2]/div/div[2]/div")
		public static WebElement select_instances_textarea_for_elb;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='setArrayModal']//button[text()='Set Value']")
	public static WebElement array_Set_Value;

	@FindBy(how=How.XPATH,xpath="//*[text()='input_variables']/following::*[contains(text(),'Set Json')]")
	public static WebElement input_setjson;
	
	
}
