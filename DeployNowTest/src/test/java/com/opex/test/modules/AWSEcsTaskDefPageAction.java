package com.opex.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.opex.test.commons.*;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSECSTaskDefPageObject;
import com.opex.test.pageobjects.AWSIAMGroupPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSRoute53RecordPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSEcsTaskDefPageAction extends SleepFunctionality {
	

public static void enterEcsTaskDef(WebDriver driver) throws Exception{

	Log.info("I enter the EcsTaskDef resource name in the popup");
	CommonFunctionalityPageAction.enterResourceName(driver,"test-EcsTaskDef");
	sleepTime();
	Reporter.log("Sign out is performed");	
}
public static void clickEcsTaskdef(WebDriver driver) throws InterruptedException{

	Log.info("I click on added resource");
	sleepTime();
	AWSECSTaskDefPageObject.click_resource_EcsTaskdef.click();
	sleepTime();
	sleepTime();
	Reporter.log("Sign out is performed");	
}

	
public static void dragdropecstask_def(WebDriver driver) throws Exception{
		
		Log.info("Select Ecs Task Def resource drag and drop on canvas resource  ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSECSTaskDefPageObject.resource_Ecs_task_def);
		Reporter.log("Sign out is performed");		
	}

public static void ResourceClickEcs_Taskdef(WebDriver driver,String Rname) throws Exception{
	
	Log.info("Click on Ecs Task def resource"); 
	WebElement element = driver.findElement(By.xpath("//*[contains(@id,'v-')]//*[text()='"+Rname+"']"));
    element.click();
    sleepTime();
	Reporter.log("Sign out is performed");
	
}


public static void enterEcsTaskBlankName(WebDriver driver) throws InterruptedException {

	Log.info("I enter the ECS Task def resource name as blank in the popup");
	sleepTime();

	try{
		CommonFunctionalityPageAction.enterResourceName(driver," ");
	}catch (Exception e) {
		e.printStackTrace();
	}
	sleepTime();
	Reporter.log("Sign out is performed");	

}
public static void resourceAttributesPassingVariable(WebDriver driver,String Container_def,String family) throws InterruptedException{

	Log.info("I fill the attributes for resource");
	sleepTime();
	sleepTime();
	AWSECSTaskDefPageObject.resource_Ecs_task_def.click();
	sleepTime();
	AWSECSTaskDefPageObject.ECS_task_def_name.clear();
	sleepTime();
	AWSECSTaskDefPageObject.ECS_task_def_name.sendKeys(Container_def);
	sleepTime();
	AWSECSTaskDefPageObject.Ecs_task_family.clear();
	sleepTime();
	AWSECSTaskDefPageObject.Ecs_task_family.sendKeys(family);
	sleepTime();
				
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
public static void resourceCrossBtnPleaseDontDeleteEcsTaskDef(WebDriver driver) throws InterruptedException {

	Log.info("I click cross button on the Ecs Task def resource ");
	//sleepTime();
	Actions action = new Actions(driver);
	action.moveToElement(AWSECSTaskDefPageObject.Ecs_Task_def_resource_hoverresource,2,2).build().perform();
	//sleepTime();
	AWSECSTaskDefPageObject.Ecs_Task_def_resource_cross_btn_on_resource.click();
	
	System.out.println("cross button click");
	sleepTime();
	CommonFunctionalityPage.resource_dont_delete_btn_attribute.click();
	//sleepTime();
	Reporter.log("Sign out is performed");  


}
public static void resourceNameLinkEcsTaskDef(WebDriver driver) throws InterruptedException{
      
	
	Log.info("I click on resource name link");
	sleepTime();
	/*Actions action=new Actions(driver);
	
	action.moveToElement(driver.findElement(By.linkText("ADN_Route_Record"))).click();*/
	AWSECSTaskDefPageObject. resource_Ecs_Task_def_link_attribute.click();
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
public static void resourceCrossBtnPleaseDeleteEcsTaskDef(WebDriver driver) throws InterruptedException {

	Log.info("I click cross button on the EcsTaskDef resource ");
	//sleepTime();
	Actions action = new Actions(driver);
	action.moveToElement(AWSECSTaskDefPageObject.Ecs_Task_def_resource_hoverresource,2,2).build().perform();
	//sleepTime();
	AWSECSTaskDefPageObject.Ecs_Task_def_resource_cross_btn_on_resource.click();
	//sleepTime();
	CommonFunctionalityPage.resource_delete_btn_attribute.click();
	sleepTime();
	Reporter.log("Sign out is performed");  


}
public static void Resourcecontainerdefinition(WebDriver driver,String containerdefinition) throws Exception{
	Log.info("Enter Ecs Task Definition Name ");
	sleepTime();
	AWSECSTaskDefPageObject.ECS_task_def_name.click();
	sleepTime();
	AWSECSTaskDefPageObject.ECS_task_def_name.clear();
	sleepTime();
	AWSECSTaskDefPageObject.ECS_task_def_name.sendKeys(containerdefinition);
	Reporter.log("Ecs Task def is performed");
}
public static void Resourcefamily(WebDriver driver,String family) throws Exception{
	Log.info("Enter Ecs Task Definition Name ");
	sleepTime();
	AWSECSTaskDefPageObject.Ecs_task_family.click();
	sleepTime();
	AWSECSTaskDefPageObject.Ecs_task_family.clear();
	sleepTime();
	AWSECSTaskDefPageObject.Ecs_task_family.sendKeys(family);
	Reporter.log("Ecs Task def is performed");
}

}