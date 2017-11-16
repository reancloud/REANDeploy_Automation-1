package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AwsEcsServicePageObeject {
	
		@FindBy(how=How.XPATH,xpath="//div[@title='AWS ECS Service Definition']")
	public static WebElement resource_Ecs_Service;

	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='test-EcsService']")
	public static WebElement click_resource_EcsService;
     
	@FindBy(how=How.XPATH,xpath="//*[text()='test-EcsService']/following::*[text()='X']")
	public static WebElement Ecs_Service_resource_cross_btn_on_resource;
     
	@FindBy(how=How.XPATH,xpath="//div[@id='sidebar-wrapper-right']//*[contains(text(),'test-EcsService')]")
	public static WebElement resource_Ecs_Service_link_attribute;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='test-EcsService']//preceding::*[@class='body']")
	public static WebElement Ecs_Service_resource_hoverresource;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='desired_count']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement ECS_desired_count;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='task_definition']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement ECS_task_definition_name;
	
	@FindBy(how=How.XPATH, xpath="//input[@ng-model='resourceName']")
	public static WebElement ecs_resource_name;
	
	
}
