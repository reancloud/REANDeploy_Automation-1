package com.opex.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSInputVariablePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;


public class AWSInputVariablePageAction extends SleepFunctionality{

	
	 public static void selectInputVar(WebDriver driver) throws Exception {
		Log.info("User drag input variable resource ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSInputVariablePageObject.input_variable_resource);    
		sleepTime(2000);
		Reporter.log(" ");
	}
	
	public static void clickResourceInputVar(WebDriver driver){

		Log.info("User click on input variable resource");
		AWSInputVariablePageObject.click_resource_input_variable.click();
		sleepTime(2000);
		Reporter.log(" ");
	}

	public static void enterJsonInputVar(WebDriver driver,String inputVariableAttribute) throws Exception{
		
		Log.info("Enter json for input variable");
		sleepTime(2000);
		CommonFunctionalityPageAction.setJsonCommon(driver, inputVariableAttribute,AWSInputVariablePageObject.input_variables_attribute,AWSInputVariablePageObject.input_variable_textArea_Json, AWSInputVariablePageObject.input_variable_setValueBtn);
		sleepTime(2000);
		Reporter.log("");
	}

	/*public static void resourceCrossBtnPleaseDeleteInputVar(WebDriver driver) {

		Log.info("User delete input variable resource ");
		sleepTime();
		Actions action = new Actions(driver);
		action.moveToElement(AWSInputVariablePageObject.resource_hoverresource_input_variable,2,2).build().perform();
		AWSInputVariablePageObject.resource_cross_btn_on_resource.click();
		WebDriverWait wait1 = new WebDriverWait(driver,50);
		WebElement ele = wait1.until(
		ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@ng-click='dialog.hide()']"))).get(0);
		ele.click();
		sleepTime(1000);
		Reporter.log(" ");  


	}


		public static void resourceCrossBtnPleaseDontDeleteInputVar(WebDriver driver) {

		Log.info("User check don't delete input variable resource");
		sleepTime();
		Actions action = new Actions(driver);
		action.moveToElement(AWSInputVariablePageObject.resource_hoverresource_input_variable,2,2).build().perform();
		AWSInputVariablePageObject.resource_cross_btn_on_resource.click();
		WebDriverWait wait1 = new WebDriverWait(driver,50);
		WebElement ele = wait1.until(
		ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'Dont delete it')]"))).get(0);
		ele.click();
		sleepTime(1000);
		Reporter.log(" ");  


	}
			
			
*/
	public static void resourceCrossBtnPleaseDeleteInputVar(WebDriver driver) {

		Log.info("User delete resource input variable");
		Actions action = new Actions(driver);
		action.moveToElement(AWSInputVariablePageObject.resource_hoverresource_input_variable,2,2).build().perform();
		AWSInputVariablePageObject.resource_cross_btn_on_resource.click();
		sleepTime(1000);
		AWSInputVariablePageObject.plsDelete.click();
		sleepTime(1000);
		Reporter.log("Sign out is performed");  


	}


	public static void resourceCrossBtnPleaseDontDeleteInputVar(WebDriver driver) {

		Log.info("User click cross button on the IAM Policy resource ");
		Actions action = new Actions(driver);
		action.moveToElement(AWSInputVariablePageObject.resource_hoverresource_input_variable,2,2).build().perform();
		AWSInputVariablePageObject.resource_cross_btn_on_resource.click();
		sleepTime(1000);
		//CommonFunctionalityPage.resource_dont_delete_btn_attribute.submit();
		AWSInputVariablePageObject.plsDontDelete.click();
		sleepTime(1000);
		Reporter.log("Sign out is performed");  


	}
}
