package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSRDSPageObject extends BaseClass{

	public AWSRDSPageObject(WebDriver driver){
		super(driver);
	}  

	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//div[@title='AWS RDS Instance']")
	public static WebElement resource_Rds;

	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='test-rds']")
	public static WebElement click_resource_RDS;

	@FindBy(how=How.XPATH, xpath="//*[text()='test-rds']//preceding::*[@class='body']")
	public static WebElement hoverOnResRDS;

	@FindBy(how=How.XPATH, xpath="//*[text()='test-rds']/following::*[text()='X']")
	public static WebElement crossBtnResRDs;

	//RDS allocated storage 
	@FindBy(how=How.XPATH,xpath=".//*[@id='tab-content-2']/div/md-content/table[1]/tbody/tr[1]/td[2]/div/input")
	public static WebElement rds_AllocatedStorage;


	//RDS engine MySQL
	@FindBy(how=How.XPATH,xpath="//*[@id='tab-content-2']/div/md-content/table[1]/tbody/tr[2]/td[2]//input[starts-with(@id,'input-') and @type='search']")
	public static WebElement rds_engine1;

	//RDS identifier
	@FindBy(how=How.XPATH,xpath="//*[text()='identifier']/following::*[@type='text'][1]")
	public static WebElement rds_identifier;
   
	//RDS Availibilty Zone
	@FindBy(how=How.XPATH,xpath="//*[text()='availability_zone']/following::*[@type='text'][1]")
	public static WebElement rds_availability_zone;
	
	//RDS Backup Window
	@FindBy(how=How.XPATH,xpath="//*[text()='backup_window']/following::*[@type='text'][1]")
	public static WebElement rds_backup_window;
	
	//RDS Copy to tag snapshot
	@FindBy(how=How.XPATH,xpath="//*[text()='copy_tags_to_snapshot']/following::*[@type='search'][1]")
	public static WebElement rds_copy_tag_snapshot;
	
	//RDS DB subnetgroup name
	@FindBy(how=How.XPATH,xpath="//*[text()='copy_tags_to_snapshot']/following::*[@type='text'][1]")
	public static WebElement rds_db_subnetgroup_name;
	
	//RDS final snapshot identifier
	@FindBy(how=How.XPATH,xpath="//*[text()='final_snapshot_identifier']/following::*[@type='text'][1]")
	public static WebElement rds_snapshot_identifier;
	
	//RDS iops
	@FindBy(how=How.XPATH,xpath="//*[text()='iops']/following::*[@type='text'][1]")
	public static WebElement rds_iops;
	
	//RDS Licence model
	@FindBy(how=How.XPATH,xpath="//*[text()='iops']/following::*[@type='search'][1]")
	public static WebElement rds_licence_model;
	
	//RDS Parameter group name
	@FindBy(how=How.XPATH,xpath="//*[text()='parameter_group_name']/following::*[@type='text'][1]")
	public static WebElement rds_parameter_group_name;
	
	//RDS vpc security group ids
	@FindBy(how=How.XPATH,xpath="//*[text()='vpc_security_group_ids']/following::*[contains(text(),'Set Array')]")
	public static WebElement rds_vpc_security_group_ids;
	
	//RDS security group name
	@FindBy(how=How.XPATH,xpath="//*[text()='security_group_names']/following::*[contains(text(),'Set Array')][1]")
	public static WebElement rds_vpc_security_group_name;
	
	//RDS name
	@FindBy(how=How.XPATH,xpath="//*[text()='name']/following::*[@type='text'][1]")
	public static WebElement rds_name;

	//RDS engine version
	@FindBy(how=How.XPATH,xpath="//*[text()='engine_version']/following::*[@type='text'][1]")
	public static WebElement rds_engine_version;

	//RDS multi_az
	@FindBy(how=How.XPATH,xpath="//*[text()='multi_az']/following::input[1]")
	public static WebElement rds_multi_az1;

	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'true')]")
	public static WebElement rds_multi_az2;

	//RDS instance class
	@FindBy(how=How.XPATH,xpath="//*[text()='instance_class']/following::input[1]")
	public static WebElement rds_instance_class1;

	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'db.t2.small')]")
	public static WebElement rds_instance_class2;

	//RDS password 
	@FindBy(how=How.XPATH,xpath="//*[text()='password']/following::*[@type='password'][1]")
	public static WebElement rds_password;

	//RDS port
	@FindBy(how=How.XPATH,xpath="//*[text()='port']/following::input[1]")
	public static WebElement rds_port;

	//RDS storage type
	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'storage_type')]/following::*[@type='search']")
	public static WebElement rds_storage_type1;

	//RDS publicly accessible
	@FindBy(how=How.XPATH,xpath="//*[text()='publicly_accessible']/following::input[1]")
	public static WebElement rds_publicly_accessible;

	//RDS storage type
	@FindBy(how=How.XPATH,xpath="//*[text()='skip_final_snapshot']/following::input[1]")
	public static WebElement rds_skip_final_snapshot;
	
	//RDS skip final snapshot
	@FindBy(how=How.XPATH,xpath="//*[text()='final_snapshot_identifier']/following::input[1]")
	public static WebElement rds_final_snapshot_identifier;
	
	//RDS user name
	@FindBy(how=How.XPATH,xpath="//*[text()='username']/following::*[@type='text'][1]")
	public static WebElement rds_username;




}
