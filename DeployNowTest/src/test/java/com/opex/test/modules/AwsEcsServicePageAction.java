/*package com.opex.test.modules;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
//import com.opex.test.pageobjects.AWS_ECS_Task_Def_Page;
//import com.opex.test.pageobjects.AWS_ELB_Page;
import com.opex.test.pageobjects.AWS_EcsService_PageObject;
//import com.opex.test.pageobjects.AWS_Executescriptpkg_Page;
//import com.opex.test.pageobjects.AWS_Instance_PageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
//import com.opex.test.pageobjects.EnvironmentPage;
//import com.opex.test.pageobjects.ResourceRoute_Table_SSH_AWS_PageObject;


public class AWS_EcsService_PageAction extends SleepFunctionality{
	
	
	public static void clickEcsService(WebDriver driver) throws InterruptedException{

		Log.info("I click on added resource");
		sleepTime();
		AWS_EcsService_PageObject.click_resource_EcsService.click();
		sleepTime();
		sleepTime();
		Reporter.log("Sign out is performed");	
	}

		
	public static void dragdropecsservice(WebDriver driver) throws Exception{
			
			Log.info("Select Ecs Service resource drag and drop on canvas resource  ");
			CommonFunctionalityPageAction.resourceDragDrop(driver,AWS_EcsService_PageObject.resource_Ecs_Service);
			Reporter.log("Sign out is performed");		
		}

	public static void ResourceClickEcs_Service(WebDriver driver,String Rname) throws Exception{
		
		Log.info("Click on Ecs Service resource"); 
		WebElement element = driver.findElement(By.xpath("//*[contains(@id,'v-')]//*[text()='"+Rname+"']"));
	    element.click();
	    sleepTime();
		Reporter.log("Sign out is performed");
		
	}

	
	public static void enterEcsServiceBlankName(WebDriver driver) throws InterruptedException {

		Log.info("I enter the ECS Service resource name as blank in the popup");
		sleepTime();

		try{
			CommonFunctionalityPageAction.enterResourceName(driver," ");
		}catch (Exception e) {
			e.printStackTrace();
		}
		sleepTime();
		Reporter.log("Sign out is performed");	

	}
	public static void resourceAttributesPassingVariable(WebDriver driver,String desired_count,String name) throws InterruptedException{

		Log.info("I fill the attributes for resource");
		sleepTime();
		sleepTime();
		AWS_EcsService_PageObject.ECS_desired_count.click();
		sleepTime();
		AWS_EcsService_PageObject.ECS_desired_count.clear();
		sleepTime();
		AWS_EcsService_PageObject.ECS_desired_count.sendKeys(desired_count);
		sleepTime();
		AWS_EcsService_PageObject.ECS_task_definition_name.click();
		sleepTime();
		AWS_EcsService_PageObject.ECS_task_definition_name.clear();
		sleepTime();
		AWS_EcsService_PageObject.ECS_task_definition_name.sendKeys(name);
					
	}
	public static void resourceAttributesBlank(WebDriver driver) throws Exception
	{
		Log.info("Enter blank attributes");
		try{
			resourceAttributesPassingVariable(driver,"","");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void resourceCrossBtnPleaseDontDeleteEcsService(WebDriver driver) throws InterruptedException {

		Log.info("I click cross button on the Ecs Service resource ");
		//sleepTime();
		Actions action = new Actions(driver);
		action.moveToElement(AWS_EcsService_PageObject.Ecs_Service_resource_hoverresource,2,2).build().perform();
		//sleepTime();
		AWS_EcsService_PageObject.Ecs_Service_resource_cross_btn_on_resource.click();
		
		System.out.println("cross button click");
		sleepTime();
		CommonFunctionalityPage.resource_dont_delete_btn_attribute.click();
		//sleepTime();
		Reporter.log("Sign out is performed");  


	}
	public static void resourceNameLinkEcsService(WebDriver driver) throws InterruptedException{
	      
		
		Log.info("I click on resource name link");
		sleepTime();
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("ADN_Route_Record"))).click();
		AWS_EcsService_PageObject.resource_Ecs_Service_link_attribute.click();
		sleepTime();
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void resourceAttributesFill(WebDriver driver) throws Exception
	{
		Log.info("Enter attributes value");
		try{
			resourceAttributesPassingVariable(driver," "," " );
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void resourceCrossBtnPleaseDeleteEcsService(WebDriver driver) throws InterruptedException {

		Log.info("I click cross button on the EcsService resource ");
		//sleepTime();
		Actions action = new Actions(driver);
		action.moveToElement(AWS_EcsService_PageObject.Ecs_Service_resource_hoverresource,2,2).build().perform();
		//sleepTime();
		AWS_EcsService_PageObject.Ecs_Service_resource_cross_btn_on_resource.click();
		//sleepTime();
		CommonFunctionalityPage.resource_delete_btn_attribute.click();
		sleepTime();
		Reporter.log("Sign out is performed");  


	}
	public static void Resourcedesiredcount(WebDriver driver,String desiredcount) throws Exception{
		Log.info("Enter Ecs Service Desired count");
		sleepTime();
		AWS_EcsService_PageObject.ECS_desired_count.click();
		sleepTime();
		AWS_EcsService_PageObject.ECS_desired_count.clear();
		sleepTime();
		AWS_EcsService_PageObject.ECS_desired_count.sendKeys(desiredcount);
		Reporter.log("Ecs Service is performed");
	}
	public static void Resourcetaskdefinition(WebDriver driver,String taskdefinition) throws Exception{
		Log.info("Enter Ecs Task Definition Name ");
		sleepTime();
		AWS_EcsService_PageObject.ECS_task_definition_name.click();
		sleepTime();
		AWS_EcsService_PageObject.ECS_task_definition_name.clear();
		sleepTime();
		AWS_EcsService_PageObject.ECS_task_definition_name.sendKeys(taskdefinition);
		Reporter.log("Ecs service is performed");
	}



	public static void resourceNameEnter(WebDriver driver, String resourceName) {
		{
			Log.info("enter resource name");
			sleepTime();
			
			AWS_EcsService_PageObject.ecs_resource_name.sendKeys(resourceName);
			Reporter.log("resource name entered is performed");		
		}
		
	}

}

*/