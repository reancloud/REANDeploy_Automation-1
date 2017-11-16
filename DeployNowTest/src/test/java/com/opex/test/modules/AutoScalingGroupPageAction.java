package com.opex.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AutoScalingGroupPageObject;
import com.opex.test.pageobjects.AwsEcsServicePageObeject;
import com.opex.test.pageobjects.CommonFunctionalityPage;


public class AutoScalingGroupPageAction extends SleepFunctionality{
	
	
	
		public static void dragDropLaunchConfiguration(WebDriver driver) throws Exception{
			
			Log.info("Select launch comfiguration resource drag and drop on canvas resource  ");
			CommonFunctionalityPageAction.resourceDragDrop(driver,AutoScalingGroupPageObject.resource_launch_config);
			
			Reporter.log("Sign out is performed");		
		}

	public static void ResourceClickLaunchConfiguration(WebDriver driver,String launchname) throws Exception{
		
		Log.info("Click on launch configuration resource"); 
		WebElement element = driver.findElement(By.xpath("//*[contains(@id,'v-')]//*[text()='"+launchname+"']"));
	    Actions action=new Actions(driver);
	    action.dragAndDropBy(element, 500,200);
	    Point point=element.getLocation();
	    int xcord=point.getX();
	    System.out.println("x cordination"+xcord);
	    int ycord=point.getY();
	    System.out.println("y cordination"+ycord);
	    element.click();
	    Thread.sleep(4000);
	    sleepTime();
		Reporter.log("Sign out is performed");
		
	}
	public static void dragDropAutoScalingGroup(WebDriver driver) throws Exception{
		
		Log.info("Select auto scaling group resource drag and drop on canvas resource  ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AutoScalingGroupPageObject.resource_Auto_scaling);
		Reporter.log("Sign out is performed");		
	}

public static void ResourceClickAutoScalingGroup(WebDriver driver,String autoscalingname) throws Exception{
	
	Log.info("Click on auto scaling group resource"); 
	WebElement element = driver.findElement(By.xpath("//*[contains(@id,'v-')]//*[text()='"+autoscalingname+"']"));
	Actions action=new Actions(driver);
    action.dragAndDropBy(element, 900,400);
    Point point=element.getLocation();
    int xcord=point.getX();
    System.out.println("x cordination"+xcord);
    int ycord=point.getY();
    System.out.println("y cordination"+ycord);
    element.click();
    Thread.sleep(4000);
    sleepTime();
	Reporter.log("Sign out is performed");
	
}

	
	public static void enterAutoScalingGroupBlankName(WebDriver driver) throws InterruptedException {

		Log.info("I enter the auto scaling group resource name as blank in the popup");
		sleepTime();

		try{
			CommonFunctionalityPageAction.enterResourceName(driver," ");
		}catch (Exception e) {
			e.printStackTrace();
		}
		sleepTime();
		Reporter.log("Sign out is performed");	

	}
	public static void resourceAttributesPassingVariable(WebDriver driver,String launch_configuration,String max_size,String min_size) throws InterruptedException{

		Log.info("I fill the attributes for resource");
		sleepTime();
		sleepTime();
		AutoScalingGroupPageObject.launch_config_name.clear();
		sleepTime();
		AutoScalingGroupPageObject.launch_config_name.click();
		sleepTime();
		AutoScalingGroupPageObject.launch_config_name.sendKeys(launch_configuration);
		sleepTime();
		AutoScalingGroupPageObject.maximum_size.clear();
		sleepTime();
		AutoScalingGroupPageObject.maximum_size.click();
		sleepTime();
		AutoScalingGroupPageObject.maximum_size.sendKeys(max_size);
		sleepTime();
		AutoScalingGroupPageObject.minimum_size.clear();
		sleepTime();
		AutoScalingGroupPageObject.minimum_size.click();
		sleepTime();
		AutoScalingGroupPageObject.minimum_size.sendKeys(min_size);
		sleepTime();
		
					
	}
	public static void resourceAttributesBlank(WebDriver driver) throws Exception
	{
		Log.info("Enter blank attributes");
		try{
			resourceAttributesPassingVariable(driver,"","","");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void resourceCrossBtnPleaseDontDeleteAutoScalingGroup(WebDriver driver,String autoscalinggroup) throws InterruptedException {

		Log.info("I click cross button on the Auto scaling group resource ");
		//sleepTime();
		WebElement element=driver.findElement(By.xpath("//*[text()='"+autoscalinggroup+"']//preceding::*[@class='body']"));
		Actions action = new Actions(driver);
		action.moveToElement(element,2,2).build().perform();
		//sleepTime();
		WebElement element1=driver.findElement(By.xpath("//*[text()='"+autoscalinggroup+"']/following::*[text()='X']"));
		element1.click();
		
		System.out.println("cross button click");
		sleepTime();
		CommonFunctionalityPage.resource_dont_delete_btn_attribute.click();
		//sleepTime();
		Reporter.log("Sign out is performed");  


	}
	public static void resourceNameLinkAutoScaling(WebDriver driver,String autoscalingname) throws InterruptedException{
	      
		
		Log.info("I click on resource name link");
		sleepTime();
		Actions action=new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.linkText("ADN_Route_Record"))).click();
		WebElement element=driver.findElement(By.xpath("//div[@id='sidebar-wrapper-right']//*[contains(text(),'"+autoscalingname+"')]"));
		action.moveToElement(element);
		element.click();
		sleepTime();
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void resourceAttributesFill(WebDriver driver) throws Exception
	{
		Log.info("Enter attributes value");
		try{
			resourceAttributesPassingVariable(driver," "," " ," ");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void resourceCrossBtnPleaseDeleteAutoScalingGroup(WebDriver driver,String autoscalinggroup) throws InterruptedException {

		Log.info("I click cross button on the Auto Scaling group resource ");
		//sleepTime();
		WebElement element=driver.findElement(By.xpath("//*[text()='"+autoscalinggroup+"']//preceding::*[@class='body']"));
		Actions action = new Actions(driver);
		action.moveToElement(element,2,2).build().perform();
		//sleepTime();
		WebElement element1=driver.findElement(By.xpath("//*[text()='"+autoscalinggroup+"']/following::*[text()='X']"));
		element1.click();
		//sleepTime();
		CommonFunctionalityPage.resource_delete_btn_attribute.click();
		sleepTime();
		Reporter.log("Sign out is performed");  


	}
	public static void Resourcedesiredcount(WebDriver driver,String desiredcount) throws Exception{
		Log.info("Enter Ecs Service Desired count");
		sleepTime();
		AwsEcsServicePageObeject.ECS_desired_count.click();
		sleepTime();
		AwsEcsServicePageObeject.ECS_desired_count.clear();
		sleepTime();
		AwsEcsServicePageObeject.ECS_desired_count.sendKeys(desiredcount);
		Reporter.log("Ecs Service is performed");
	}
	public static void Resourcetaskdefinition(WebDriver driver,String taskdefinition) throws Exception{
		Log.info("Enter Ecs Task Definition Name ");
		sleepTime();
		AwsEcsServicePageObeject.ECS_task_definition_name.click();
		sleepTime();
		AwsEcsServicePageObeject.ECS_task_definition_name.clear();
		sleepTime();
		AwsEcsServicePageObeject.ECS_task_definition_name.sendKeys(taskdefinition);
		Reporter.log("Ecs service is performed");
	}



	public static void resourceNameEnter(WebDriver driver, String resourceName) 
		{
			Log.info("enter resource name");
			sleepTime();
			
			AutoScalingGroupPageObject.enter_resource_name.sendKeys(resourceName);
			Reporter.log("resource name entered is performed");		
		}
		
	
	public static void enterImageId(WebDriver driver,String imageid)
	{
	  Log.info("enter image id");
	  sleepTime();
	  
	  AutoScalingGroupPageObject.launch_config_image_id.clear();
	  AutoScalingGroupPageObject.launch_config_image_id.click();
	  AutoScalingGroupPageObject.launch_config_image_id.sendKeys(imageid);
	  sleepTime();
	  Reporter.log("sign out is performed");
	  
	}

     public static void enterInstanceType(WebDriver driver,String type)
     {
    	 Log.info("I enter the instance type for launch configuration");
    		sleepTime();
    		Actions action=new Actions(driver);
    		action.moveToElement(AutoScalingGroupPageObject.launch_instance_type);
    		action.click();
    		action.sendKeys(Keys.CONTROL + "a");
    		//sleepTime();
    		action.sendKeys(Keys.CONTROL + "x");
    		//sleepTime();
    		action.sendKeys(Keys.BACK_SPACE);
    		//sleepTime();
    		action.sendKeys(type);
    		//	sleepTime();
    		action.moveToElement(AutoScalingGroupPageObject.resource_instance_type_t2micro);
    		action.click().build().perform();
    			sleepTime();
    	 
     }
     public static void enterLaunchConfigurationName(WebDriver driver,String name)
     {
    	 Log.info("I enter the launchconfiguration name for auto scaling group");
 		sleepTime();
 		Actions action=new Actions(driver);
 		action.moveToElement(AutoScalingGroupPageObject.launch_config_name);
 		action.click();
 		action.sendKeys(Keys.CONTROL + "a");
 		//sleepTime();
 		action.sendKeys(Keys.CONTROL + "x");
 		//sleepTime();
 		action.sendKeys(Keys.BACK_SPACE);
 		//sleepTime();
 		action.sendKeys(name);
 		action.build().perform();
 	
 		sleepTime();
     }
     public static void enterMaxSize(WebDriver driver,String maxsize)
     {
    	 Log.info("I enter the max size for auto scaling group");
 		sleepTime();
 		Actions action=new Actions(driver);
 		action.moveToElement(AutoScalingGroupPageObject.maximum_size);
 		action.click();
 		action.sendKeys(Keys.CONTROL + "a");
 		//sleepTime();
 		action.sendKeys(Keys.CONTROL + "x");
 		//sleepTime();
 		action.sendKeys(Keys.BACK_SPACE);
 		//sleepTime();
 		action.sendKeys(maxsize);
 	     action.build().perform();
 		sleepTime();
     }
     public static void enterMinSize(WebDriver driver,String minsize)
     {
    	 Log.info("I enter the max size for auto scaling group");
 		sleepTime();
 		Actions action=new Actions(driver);
 		action.moveToElement(AutoScalingGroupPageObject.minimum_size);
 		action.click();
 		action.sendKeys(Keys.CONTROL + "a");
 		//sleepTime();
 		action.sendKeys(Keys.CONTROL + "x");
 		//sleepTime();
 		action.sendKeys(Keys.BACK_SPACE);
 		//sleepTime();
 		action.sendKeys(minsize);
 	   action.build().perform();
 		sleepTime();
     }
     
     public static void enterAvailabilityZone(WebDriver driver,String zone)
     {
    	 Log.info("I enter the availability zone for auto scaling group");
 		sleepTime();
 		Actions action=new Actions(driver);
 		action.moveToElement(AutoScalingGroupPageObject.Auto_scaling_availability_zones);
 		action.click();
 		action.moveToElement(AutoScalingGroupPageObject.Auto_scaling_availability_Zone_value);
 		action.click();
 		action.sendKeys(Keys.CONTROL + "a");
 		//sleepTime();
 		action.sendKeys(Keys.CONTROL + "x");
 		//sleepTime();
 		action.sendKeys(Keys.BACK_SPACE);
 		//sleepTime();
 		action.sendKeys(zone);
 		action.build().perform();
 		sleepTime();
 	  action.moveToElement(AutoScalingGroupPageObject.Auto_scaling_Availability_zone_setValue_btn);
 	  action.click();
 	  action.build().perform();
 		sleepTime();
     }
    }
