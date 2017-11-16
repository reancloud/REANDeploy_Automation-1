package com.opex.test.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.opex.test.helpers.Log;

import com.opex.test.pageobjects.CommonPage;

import com.opex.test.pageobjects.EnvironmentListPageObject;
import com.opex.test.pageobjects.EnvironmentPage;

public class EnvironmentListPageAction extends SleepFunctionality{



	public static void Execute(WebDriver driver) throws Exception{
        EnvironmentPage.canvas.click();
		sleepTime(3000);
		Log.info("Click action is performed on Dropdown icon");
		sleepTime();
		CommonPage.more_click.click();
		sleepTime(3000);
		EnvironmentListPageObject.environmentList_selection.click();
		Reporter.log(" ");

	}

	public static void clickShareEnv(WebDriver driver,String env_name) throws Exception{

		Log.info("Click action is performed on share environment icon");
		sleepTime();
		WebDriverWait wait = new WebDriverWait(driver,100);
		WebElement element = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[text()='"+env_name+"']/following::*[@ng-click='shareEnvironment(env, $event)']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click().build().perform();
		
		
	}

	public static void clickYesBtnEnvList(WebDriver driver) throws Exception{

		Log.info("Click action is performed on share environment icon");
		sleepTime(1000);
		EnvironmentListPageObject.environmentList_yes.click();
		}

	public static void clickNoBtnEnvList(WebDriver driver) throws Exception{

		Log.info("Click action is performed on share environment icon");
		sleepTime(1000);
		EnvironmentListPageObject.environmentList_no.click();
		
	}

	public static void clickOnDeployNowLogo(WebDriver driver) throws Exception{

		Log.info("Click action is performed on deploy now logo");
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='TopNavBar']//*[@class='fa-stack fa-lg deploy-logo']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click().build().perform();
		
		}

	public static void searchOnEnvList(WebDriver driver,String env_name) throws Exception{

		Log.info("Environment List search bar");
		
		EnvironmentListPageObject.environmentList_searchBar.sendKeys(env_name);
		

	}	

}
