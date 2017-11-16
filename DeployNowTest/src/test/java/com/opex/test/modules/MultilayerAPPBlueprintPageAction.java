package com.opex.test.modules;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

/****
 * 
 * @author Pallavi
 * 
 */

public class MultilayerAPPBlueprintPageAction extends SleepFunctionality{

	public static int count = 0;

	// Import Multi-layer APP Blueprint 
	public static void importStartImportBtn(WebDriver driver,String envConnection, String envProvider) throws Exception
	{
		Log.info("User click on start import button ");
		EnvironmentPage.importStartImportButton.click();

		if((driver.findElement(By.xpath("//*[@ng-click='select($event)']/following::*[text()='APP-IAM']")).isDisplayed())){
			sleepTime(2000);
			count = 0;
			MultilayerAPPBlueprintPageAction.importConnectionProviderForMultiLayer(driver,envConnection,envProvider);

		}
		sleepTime(4000);
		if((driver.findElement(By.xpath("//*[@ng-click='select($event)']/following::*[text()='APP-VPC-Blueprint']")).isDisplayed())){
			driver.findElement(By.xpath("//*[@ng-click='select($event)']/following::*[text()='APP-VPC-Blueprint']")).click();
			//sleepTime(5000);
			count++;
			MultilayerAPPBlueprintPageAction.importConnectionProviderForMultiLayer(driver,envConnection,envProvider);

		}
		sleepTime(2000);
		if((driver.findElement(By.xpath("//*[@ng-repeat='envImport in environmentImports']/following::*[text()='Audit-Blueprint']")).isDisplayed())){
			driver.findElement(By.xpath("//*[@ng-repeat='envImport in environmentImports']/following::*[text()='Audit-Blueprint']")).click();
			//sleepTime(5000);
			count++;
			MultilayerAPPBlueprintPageAction.importConnectionProviderForMultiLayer(driver,envConnection,envProvider);


		}
		sleepTime(2000);
		Log.info("Click on import button");
		
		String element = "//*[text()='Import ALL']";
		MultilayerAPPBlueprintPageAction.explicitWait(driver,element,20);

		EnvironmentPage.importALLButton.click();
		sleepTime(5000);

		String text = "Environment imported successfully.......";
		String text1 = "Environment with the same name already exists.";
		String text2 = "The environment/s with name/s Audit-Blueprint already exists!!";
		String text3 = "The environment/s with name/s APP-IAM, APP-VPC-Blueprint, Audit-Blueprint already exists!!";
		System.out.println("Pass0");
		String element2 = "//*[@class='message ng-binding']";
		MultilayerAPPBlueprintPageAction.explicitWait(driver,element2,20);
		System.out.println("Pass1");
		WebElement element3 = driver.findElement(By.xpath("//*[@class='message ng-binding']"));
		MultilayerAPPBlueprintPageAction.actionMethod(driver, element3);

		String notificationMessage = element3.getText();
		System.out.println("Pass2");
		if(notificationMessage.equals(text))
		{
			System.out.println(""+notificationMessage);
			Assert.assertTrue("Environment imported successfully.......".equals(notificationMessage));
			Log.info(notificationMessage);
			System.out.println("Pass3");
			MultilayerAPPBlueprintPageAction.searchAPPIAMAndDeploy(driver);

		}

		else if(notificationMessage.equals(text1))
		{
			System.out.println(" "+notificationMessage);
			Assert.fail("Environment with the same name already exists.");
			Log.info(notificationMessage);
		}
		else if(notificationMessage.equals(text2))
		{
			System.out.println(" "+notificationMessage);
			Assert.fail("The environment/s with name/s Audit-Blueprint already exists!!");
			Log.info(notificationMessage);
		}
		else if(notificationMessage.equals(text3))
		{
			System.out.println(" "+notificationMessage);
			Assert.fail("The environment/s with name/s APP-IAM, APP-VPC-Blueprint, Audit-Blueprint already exists!!");
			Log.info(notificationMessage);
		}



	}

	// Select connection and provider if they are not present after importing environment/blueprint
	public static void importConnectionProviderForMultiLayer(WebDriver driver,String envConnection, String envProvider) throws Exception{

		
		//Method to Select connection
		Log.info("User select connection for import blueprint");
		sleepTime(3000);
		String connection = "//*[@name='importEnvConnection_"+count+"']";
		WebElement connectionDropdown = driver.findElement(By.xpath("//*[@name='importEnvConnection_"+count+"']"));
		MultilayerAPPBlueprintPageAction.explicitWait(driver, connection,20);

		if((connectionDropdown).equals(envConnection)){

			System.out.println("Connection already selected");
		}

		else{
			Select Connection =new Select(driver.findElement(By.xpath("//*[@name='importEnvConnection_"+count+"']")));
			for(int i=0;i< Connection.getOptions().size();i++)
			{
				String myConnection = Connection.getOptions().get(i).getText();
				if(myConnection.equalsIgnoreCase(envConnection))
				{
					Connection.selectByVisibleText(envConnection);
					break;
				}
			}
		}

		//Method to Select provider
		Log.info("User select provider for import blueprint");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@name='importEnvProvider_"+count+"']")));
		actions.click().build().perform();
		
		List<WebElement> providerDropdown = driver.findElements(By.xpath("//*[@name='importEnvProvider_"+count+"']"));	
		
		System.out.println(providerDropdown.size());
		for (int i = 0; i < providerDropdown.size(); i++) {
			System.out.println(providerDropdown.get(i).getText());
			if (providerDropdown.get(i).getText().equals("Auto_AWS")) //to click on a specific provider.
			{ 
				providerDropdown.get(i).click();
				break;
			}
		}
	}
		
	public static void searchAPPIAMAndDeploy(WebDriver driver) throws Exception
	{
		Log.info("User search environment$");	
		// Search APP-IAM Environment 
		String envdName="APP-IAM";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement elementIam = driver.findElement(By.xpath("//*[@id='EnvSelectorMenu']//span[normalize-space(.) = '" + envdName + "']"));

		if(elementIam.isDisplayed()){
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elementIam);
			sleepTime(5000);
			MultilayerAPPBlueprintPageAction.explicitWait(driver, elementIam, 50);
			MultilayerAPPBlueprintPageAction.explicitWait(driver, CommonFunctionalityPage.deploy_button,300);
			CommonFunctionalityPage.deploy_button.click();
			sleepTime(5000);
			WebElement deploy=driver.findElement(By.xpath("//*[contains(text(),'Deployed')]"));
			
			MultilayerAPPBlueprintPageAction.explicitWait(driver, deploy,300);
			Log.info("Environment deployed successfully");
			if(deploy.isDisplayed())
			{

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Search APP-VPC Blueprint 
				String vpcEnvName =  "APP-VPC-Blueprint";
				WebElement elementVpc = driver.findElement(By.xpath("//*[@id='EnvSelectorMenu']//span[normalize-space(.) = '" + vpcEnvName + "']"));
				
				if(elementVpc.isDisplayed()){
					JavascriptExecutor j = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(true);",elementVpc);
					sleepTime(5000);
					MultilayerAPPBlueprintPageAction.explicitWait(driver, elementVpc, 50);
					MultilayerAPPBlueprintPageAction.explicitWait(driver, CommonFunctionalityPage.deploy_button,500);
					CommonFunctionalityPage.deploy_button.click();
					WebElement deployVpc=driver.findElement(By.xpath("//*[contains(text(),'Deployed')]"));
					Log.info("Environment deployed successfully");
					
					WebElement fail1=driver.findElement(By.xpath("//*[@class='fa fa-thumbs-down fa-1']/following::*[contains(text(),'Failed')][1]"));
					MultilayerAPPBlueprintPageAction.explicitWait(driver, deployVpc,300);
					if(deployVpc.isDisplayed())
					{
						// Search Audit Blueprint
						String auditEnvName ="Audit-Blueprint";
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						WebElement elementAudit = driver.findElement(By.xpath("//*[@id='EnvSelectorMenu']//span[normalize-space(.) = '" + auditEnvName + "']"));

						if(elementAudit.isDisplayed()){
							JavascriptExecutor js = (JavascriptExecutor) driver;
							je.executeScript("arguments[0].scrollIntoView(true);",elementAudit);
							sleepTime(5000);
							MultilayerAPPBlueprintPageAction.explicitWait(driver, elementAudit, 50);
							MultilayerAPPBlueprintPageAction.explicitWait(driver, CommonFunctionalityPage.deploy_button,300);
							CommonFunctionalityPage.deploy_button.click();
							WebElement deployAudit=driver.findElement(By.xpath("//*[contains(text(),'Deployed')]"));
							Log.info("Environment deployed successfully");
							if(deployAudit.isDisplayed()){
								
								MultilayerAPPBlueprintPageAction.deleteEnvAPP(driver, auditEnvName);
							}
							
							else{
								MultilayerAPPBlueprintPageAction.checkFailStatus(driver);
							}	
						}
						
					}
					if(elementVpc.isDisplayed()){
						
						MultilayerAPPBlueprintPageAction.deleteEnvAPP(driver, vpcEnvName);
					}

					else{
						MultilayerAPPBlueprintPageAction.checkFailStatus(driver);
					}
				}
			}
			
			if(elementIam.isDisplayed()){
				
				MultilayerAPPBlueprintPageAction.deleteEnvAPP(driver, envdName);
			}

			else{
				MultilayerAPPBlueprintPageAction.checkFailStatus(driver);
			}
			
			
		}
			else{
				MultilayerAPPBlueprintPageAction.checkFailStatus(driver);
			}
			
	}

	// Method to check whether deployment is failed 
	public static void checkFailStatus(WebDriver driver){
		WebElement fail=driver.findElement(By.xpath("//*[@class='fa fa-thumbs-down fa-1']/following::*[contains(text(),'Failed')][1]"));
		if(fail.isDisplayed()) 
		{
			CommonFunctionalityPage.canvas.click();
			//sleepTime();
			CommonFunctionalityPage.resource_logs_btn.click();
			//sleepTime();
			Assert.fail("Deployment Failed");
		}
	}
	
	//Explicit wait method passing only xpath as a string
	public static void explicitWait(WebDriver driver,String importALLButton, int waitTime){

		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		WebElement element = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(importALLButton))).get(0);
	}
	
	//Explicit wait method passing webElement
	public static void explicitWait(WebDriver driver,WebElement text, int waitTime){

		WebDriverWait wait = new WebDriverWait(driver,waitTime);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(text));
		element.click();

	}
	
	
	// Action method
	public static void actionMethod(WebDriver driver, WebElement element){

		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();
	}

	
	//Method to destroy after the environment is deployed
	public static void deleteEnvAPP(WebDriver driver, String env) throws InterruptedException{
		
		WebElement element = driver.findElement(By.xpath("//*[@id='EnvSelectorMenu']//span[normalize-space(.) = '" + env + "']"));
		if (element.isDisplayed()) {
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);", element);
			sleepTime(5000);
			element.click();
				WebElement resource_destroy_btn = driver.findElement(By.xpath("//div[@ng-click='destroyEnv()']"));
				if (resource_destroy_btn.isDisplayed()) {
					resource_destroy_btn.click();
					sleepTime(1000);
					CommonFunctionalityPageAction.resourceYesDestroyButton(driver);
					EnvironmentPage.environment_dropdown.click();
					EnvironmentPageAction.deleteEnvironment(driver, env);

	}
		}
}
}
