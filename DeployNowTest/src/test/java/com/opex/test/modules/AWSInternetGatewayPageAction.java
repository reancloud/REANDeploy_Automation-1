package com.opex.test.modules;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;



public class AWSInternetGatewayPageAction extends SleepFunctionality{

	public static void selectIGW(WebDriver driver) throws Exception{

		Log.info("User drag igw on to the environment");
		//CommonFunctionalityPageAction.resourceDragDrop(driver, AWSInternetGatewayPageObject.IGW_resource);
		AWSInternetGatewayPageAction.resourceDragDrop(driver, AWSInternetGatewayPageObject.IGW_resource);
		sleepTime(1000);
		Reporter.log("Sign out is performed");

	}

	public static void resourceDragDrop(WebDriver driver,WebElement rDragDrop) throws Exception{
		int xOffSet = 250;
		int yOffset = 150;
		Log.info("Select resource drag and drop on canvas");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",rDragDrop);
		Actions actions = new Actions(driver);
		actions.moveToElement(rDragDrop);
		actions.click().build().perform();
		sleepTime(1000);
		actions.clickAndHold(rDragDrop).moveToElement(EnvironmentPage.canvas, xOffSet, yOffset).release(null).build().perform();
		sleepTime(1000);
		//sleepTime();
		Reporter.log("Resource drag drop successfully");
		
		    
}
	
	public static void dependsOnTextBoxIGW(WebDriver driver){

			Log.info("User enter depends on value for igw ");
			sleepTime(1000);
			Actions action=new Actions(driver);
			action.moveToElement(CommonFunctionalityPage.select_depends_on_value);
			action.click();
			action.sendKeys(Keys.CONTROL + "a");
			action.sendKeys(Keys.CONTROL + "x");
			action.sendKeys(Keys.BACK_SPACE);
			action.sendKeys("");
			action.build().perform();

		}
	
	public static void vpcTextBoxIGW(WebDriver driver,String igw_vpc_id){
		
		Log.info("Enter VPC_id Value for igw");
		
		Actions action=new Actions(driver);
		action.moveToElement(AWSInternetGatewayPageObject.resource_vpcidtextbox);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(igw_vpc_id);
		action.build().perform();
		Reporter.log("VPC_id is performed");



	}
	


}
