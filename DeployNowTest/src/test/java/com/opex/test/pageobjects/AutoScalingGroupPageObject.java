package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutoScalingGroupPageObject {
	
	
	@FindBy(how=How.XPATH, xpath="//div[@title='AWS Launch Configuration']")
	public static WebElement resource_launch_config;
	
	@FindBy(how=How.XPATH, xpath="//div[@title='AWS Autoscaling Group']")
	public static WebElement resource_Auto_scaling;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='image_id']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement launch_config_image_id;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='instance_type']/following::*[1]")
	public static WebElement launch_instance_type;

	@FindBy(how=How.XPATH, xpath="//input[@ng-model='resourceName']")
	public static WebElement enter_resource_name;	
	
	@FindBy(how=How.XPATH, xpath="//*[text()='launch_configuration']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement launch_config_name;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='max_size']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement maximum_size;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='min_size']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement minimum_size;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='instance_type']/following::*[text()='t2.micro']")
	public static WebElement resource_instance_type_t2micro;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='availability_zones']//following::*[@ng-click='openSetArrayModal(a)'][1]")
	public static WebElement Auto_scaling_availability_zones;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(text(),'Set Array value for:')]/following::*[@class='ace_scroller'][1]")
	public static WebElement Auto_scaling_availability_Zone_value;
	
	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Set Array value for:')]/following::*[text()='Set Value']")
	public static WebElement Auto_scaling_Availability_zone_setValue_btn;
	
		
	


}
