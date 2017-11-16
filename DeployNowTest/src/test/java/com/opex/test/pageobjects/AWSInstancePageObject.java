package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSInstancePageObject extends BaseClass {


	public AWSInstancePageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,xpath="//div[@title='AWS Instance']")
	public static WebElement instance_resource;

	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='test-instance']")
	public static WebElement click_resource_instance;

	@FindBy(how=How.XPATH, xpath="//*[text()='test-instance']//preceding::*[@class='body']")
	public static WebElement instance_resource_hoverresource;

	@FindBy(how=How.XPATH,xpath="//*[text()='test-instance']/following::*[text()='X']")
	public static WebElement instance_resource_cross_btn_on_resource;

	@FindBy(how=How.XPATH,xpath="//*[text()='instance_type']/following::*[1]")
	public static WebElement instance_resource_instance_type;

	@FindBy(how=How.XPATH,xpath="//*[text()='instance_type']/following::*[text()='t2.micro']")
	public static WebElement instance_resource_instance_type_t2micro;

	@FindBy(how=How.XPATH,xpath="//*[text()='ami']//following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement instance_resource_ami;

	@FindBy(how=How.XPATH,xpath="//*[text()='instance_initiated_shutdown_behavior']//following::div[@class='ng-scope'][1]")
	public static WebElement instance_resource_instance_initiated;

	@FindBy(how=How.XPATH,xpath="//*[text()='availability_zone']//following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement instance_resource_avaibility_zone;

	@FindBy(how=How.XPATH,xpath="//*[text()='vpc_security_group_ids']//following::*[text()='Set Array']")
	public static WebElement instance_resource_vpc_security_group_id;

	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Set Array value for:')]/following::*[@class='ace_scroller'][1]")
	public static WebElement instance_resource_vpc_security_group_id_textArea;

	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Set Array value for:')]/following::*[text()='Set Value']")
	public static WebElement instance_resource_vpc_security_group_id_setValue_btn;

	@FindBy(how=How.XPATH,xpath="//*[text()='source_dest_check']/following::*[1]")
	public static WebElement instance_resource_source_dest_check;

	@FindBy(how=How.XPATH,xpath="//*[text()='key_name']/following::*[@ng-readonly='sharedData.resourceReadOnly'][1]")
	public static WebElement click_instance_key;

	@FindBy(how=How.XPATH, xpath="//*[@id='EnvSelectorMenu']//*[text()='Env_AWS_Instance_SD']")
	public static WebElement search_ssh_aws_env_Instance;

	@FindBy(how=How.XPATH, xpath="//*[text()='security_groups']/following::*[contains(text(),'Set Array')][1]")
	public static WebElement instance_security_groups;

	@FindBy(how=How.XPATH, xpath="//*[@id='setArrayModal']/div/div/div[2]/div/div[2]/div")
	public static WebElement instance_security_groups_textArea;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='associate_public_ip_address']/following::*[1]")
	public static WebElement instance_associate_public_ip_address;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='disable_api_termination']/following::*[1]")
	public static WebElement instance_disable_api_termination;
	
	
	@FindBy(how=How.XPATH, xpath="//*[text()='ebs_block_device']//following::*[text()='Set Json']")
	public static WebElement instance_ebs_block_device;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='ebs_optimized']/following::*[1]")
	public static WebElement instance_ebs_optimized;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='ephemeral_block_device']//following::*[text()='Set Json']")
	public static WebElement instance_ephemeral_block_device;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='monitoring']/following::*[1]")
	public static WebElement instance_monitoring;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='iam_instance_profile']/following::*[1]")
	public static WebElement instance_iam_instance_profile;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='placement_group']/following::*[1]")
	public static WebElement instance_placement_group;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='private_ip']/following::*[1]")
	public static WebElement instance_private_ip;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='root_block_device']//following::*[text()='Set Json']")
	public static WebElement instance_root_block_device;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='tags']//following::*[text()='Set Json']")
	public static WebElement instance_tags;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='user_data']//following::*[text()='Set text']")
	public static WebElement instance_user_data;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='tenancy']/following::*[1]")
	public static WebElement instance_tenancy;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='subnet_id']/following::*[1]")
	public static WebElement instance_subnet_id;
}