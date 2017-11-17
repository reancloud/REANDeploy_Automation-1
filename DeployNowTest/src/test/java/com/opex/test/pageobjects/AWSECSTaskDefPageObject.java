package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSECSTaskDefPageObject {
	
	
	@FindBy(how=How.XPATH, xpath="//div[@title='AWS ECS Task Definition']")
	public static WebElement resource_Ecs_task_def;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='container_definitions']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement ECS_task_def_name;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='family']//following::*[@ng-if='!a.possibleValues '][1]")
	public static WebElement Ecs_task_family;
	
		@FindBy(how=How.XPATH, xpath="//*[text()='test-EcsTaskDef']//preceding::*[@class='body']")
	public static WebElement Ecs_Task_def_resource_hoverresource;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='test-EcsTaskDef']/following::*[text()='X']")
	public static WebElement Ecs_Task_def_resource_cross_btn_on_resource;
	 
	@FindBy(how=How.XPATH,xpath="//div[@id='sidebar-wrapper-right']//*[contains(text(),'test-EcsTaskDef')]")
	public static WebElement resource_Ecs_Task_def_link_attribute;
	
	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='test-EcsTaskDef']")
	public static WebElement click_resource_EcsTaskdef;

}

