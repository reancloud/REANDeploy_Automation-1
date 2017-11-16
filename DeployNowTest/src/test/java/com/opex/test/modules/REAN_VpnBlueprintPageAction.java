package com.opex.test.modules;

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

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.ConnectionPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.thoughtworks.selenium.Wait;

/**
 * 
 * @author Pallavi
 * REAN-VPN-between-VPCs-Blueprint
 * Date : 04/05/2017
 **/

public class REAN_VpnBlueprintPageAction extends SleepFunctionality{

	public static int count = 0;

	//Import REAN-VPN Blueprint 
	public static void importStartImportBtnREAN_Vpn(WebDriver driver) throws Exception
	{
		Log.info("User click on start import button ");
		EnvironmentPage.importStartImportButton.click();
		String envConnection = "connection-vpn";
		String envProvider = "Auto_AWS";

		if((driver.findElement(By.xpath("//*[@ng-click='select($event)']/following::*[text()='REAN-VPN-between-VPCs-Network-Blueprint']")).isDisplayed())){
			sleepTime(2000);
			count = 0;
			REAN_VpnBlueprintPageAction.importConnectionProviderForREAN_Vpn(driver,envConnection,envProvider);

		}
		sleepTime(4000);
		if((driver.findElement(By.xpath("//*[@ng-click='select($event)']/following::*[text()='REAN-VPN-between-VPCs-Blueprint']")).isDisplayed())){
			driver.findElement(By.xpath("//*[@ng-click='select($event)']/following::*[text()='REAN-VPN-between-VPCs-Blueprint']")).click();
			count++;
			REAN_VpnBlueprintPageAction.importConnectionProviderForREAN_Vpn(driver,envConnection,envProvider);

		}
		sleepTime(2000);
		Log.info("Click on import button");

		String element = "//*[text()='Import ALL']";
		REAN_VpnBlueprintPageAction.explicitWait(driver,element,20);

		EnvironmentPage.importALLButton.click();
		sleepTime(5000);

		String text = "Environment imported successfully.......";
		String text1 = "Environment with the same name already exists.";
		//String text2 = "The environment/s with name/s REAN-VPN-between-VPCs-Blueprint already exists!!";
		//String text3 = "The environment/s with name/s APP-IAM, APP-VPC-Blueprint, Audit-Blueprint already exists!!";

		String element2 = "//*[@class='message ng-binding']";
		REAN_VpnBlueprintPageAction.explicitWait(driver,element2,20);

		WebElement element3 = driver.findElement(By.xpath("//*[@class='message ng-binding']"));
		REAN_VpnBlueprintPageAction.actionMethod(driver, element3);

		String notificationMessage = element3.getText();

		if(notificationMessage.equals(text))
		{
			System.out.println(""+notificationMessage);
			Assert.assertTrue("Environment imported successfully.......".equals(notificationMessage));
			Log.info(notificationMessage);
			REAN_VpnBlueprintPageAction.searchREANVpnBlueprintEnvsAndDeploy(driver);

		}

		else if(notificationMessage.equals(text1))
		{
			System.out.println(" "+notificationMessage);
			Assert.fail("Environment with the same name already exists.");
			Log.info(notificationMessage);
		}
		/*else if(notificationMessage.equals(text2))
			{
				System.out.println(" "+notificationMessage);
				Assert.fail("The environment/s with name/s Audit-Blueprint already exists!!");
				Log.info(notificationMessage);
			}*/

	}

	//Select connection and provider if they are not present after importing environment/blueprint
	public static void importConnectionProviderForREAN_Vpn(WebDriver driver,String envConnection, String envProvider) throws Exception{


		//Method to Select connection of ec2-user
		Log.info("User select connection for import blueprint");
		sleepTime(3000);
		String connection = "//*[@name='importEnvConnection_"+count+"']";
		WebElement connectionDropdown = driver.findElement(By.xpath("//*[@name='importEnvConnection_"+count+"']"));
		REAN_VpnBlueprintPageAction.explicitWait(driver, connection,20);

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

	public static void searchREANVpnBlueprintEnvsAndDeploy(WebDriver driver) throws Exception
	{
		Log.info("User search environment$");	
		// Search REAN-VPN-between-VPCs-Network-Blueprint Environment 


		String envOneName="REAN-VPN-between-VPCs-Network-Blueprint";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement elementOen= driver.findElement(By.xpath("//*[@id='EnvSelectorMenu']//span[normalize-space(.) = '" + envOneName + "']"));

		if(elementOen.isDisplayed()){
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elementOen);
			sleepTime(5000);
			REAN_VpnBlueprintPageAction.explicitWait(driver, elementOen, 50);
			elementOen.click();
			REAN_VpnBlueprintPageAction.explicitWait(driver, CommonFunctionalityPage.deploy_button,300);
			CommonFunctionalityPage.deploy_button.click();
			//Thread.sleep(3000);
			new WebDriverWait(driver, 800)
			.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@ng-click='destroyEnv()']"), "Destroy"));
			WebElement deploy=driver.findElement(By.xpath("//*[contains(text(),'Deployed')]"));
			//String deployText = "Deployed";
			REAN_VpnBlueprintPageAction.explicitWait(driver,deploy, 1000);
			Log.info("Environment deployed successfully");
			if(deploy.isDisplayed())
			{
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Search REAN-VPN-between-VPCs-Blueprint 
				EnvironmentPage.environment_dropdown.click();
				String envTwoName =  "REAN-VPN-between-VPCs-Blueprint";
				WebElement elementTwo = driver.findElement(By.xpath("//*[@id='EnvSelectorMenu']//span[normalize-space(.) = '" + envTwoName + "']"));

				if(elementTwo.isDisplayed()){
					JavascriptExecutor j = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(true);",elementTwo);
					sleepTime(5000);
					REAN_VpnBlueprintPageAction.explicitWait(driver, elementTwo, 50);
					elementTwo.click();
					REAN_VpnBlueprintPageAction.explicitWait(driver, CommonFunctionalityPage.deploy_button,500);
					CommonFunctionalityPage.deploy_button.click();
					new WebDriverWait(driver, 1000)
					.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@ng-click='destroyEnv()']"), "Destroy"));
					sleepTime();
					EnvironmentPage.environment_dropdown.click();
					WebElement destroy2ndEnv=driver.findElement(By.xpath("//div[@ng-click='destroyEnv()']"));
					destroy2ndEnv.click();
					WebDriverWait wait = new WebDriverWait(driver, 200);
					WebElement element1 = wait.until(
							ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_destroy_textbox));
					element1.sendKeys("YES");
					sleepTime(1000);
					CommonFunctionalityPage.resource_destroy_submit.click();
					Thread.sleep(3000);
					WebDriverWait w = new WebDriverWait(driver, 500);
					WebElement el = w.until(
							ExpectedConditions.visibilityOf(CommonFunctionalityPage.deploy_button));
					driver.navigate().refresh();
					//EnvironmentPage.environment_dropdown.click();

					String env2nd = "REAN-VPN-between-VPCs-Blueprint";
					EnvironmentPageAction.deleteEnvironment(driver,env2nd);

					String text="Environment deleted successfully.......";
					WebDriverWait wait1 = new WebDriverWait(driver, 3);
					WebElement message = (WebElement)wait.until(
							ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
					Actions act = new Actions(driver);
					act.moveToElement(message);
					act.build().perform();
					String notificationMessage = message.getText();
					if(notificationMessage.equals(text))
					{
						Assert.assertTrue( "Environment deleted successfully.......".equals(notificationMessage));
						Log.info(notificationMessage);
						//sleepTime();	
					}
					REAN_VpnBlueprintPageAction.explicitWait(driver, message, 100);

					//EnvironmentPage.environment_dropdown.click();

					WebElement element1st= driver.findElement(By.xpath("//*[@id='EnvSelectorMenu']//span[normalize-space(.) = 'REAN-VPN-between-VPCs-Network-Blueprint']"));

					JavascriptExecutor jee = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(true);",element1st);
					sleepTime(5000);
					REAN_VpnBlueprintPageAction.explicitWait(driver, element1st, 100);
					element1st.click();

					REAN_VpnBlueprintPageAction.explicitWait(driver, CommonFunctionalityPage.resource_destroy_btn,300);



					WebElement destroy1stEnv=driver.findElement(By.xpath("//div[@ng-click='destroyEnv()']"));
					destroy1stEnv.click();
					WebDriverWait wait2 = new WebDriverWait(driver, 200);
					WebElement element2 = wait2.until(
							ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_destroy_textbox));
					element2.sendKeys("YES");
					sleepTime(1000);
					CommonFunctionalityPage.resource_destroy_submit.click();
					Thread.sleep(3000);
					WebDriverWait wt = new WebDriverWait(driver, 500);
					WebElement ele = wt.until(
							ExpectedConditions.visibilityOf(CommonFunctionalityPage.deploy_button));

					driver.navigate().refresh();
					//EnvironmentPage.environment_dropdown.click();

					String env1st = "REAN-VPN-between-VPCs-Network-Blueprint";
					EnvironmentPageAction.deleteEnvironment(driver,env1st);

					String text1="Environment deleted successfully.......";
					WebDriverWait wait3 = new WebDriverWait(driver, 3);
					WebElement message1 = (WebElement)wait.until(
							ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
					Actions actn = new Actions(driver);
					actn.moveToElement(message1);
					actn.build().perform();
					String notificationMessage1 = message1.getText();
					if(notificationMessage1.equals(text))
					{
						Assert.assertTrue( "Environment deleted successfully.......".equals(notificationMessage1));
						Log.info(notificationMessage1);
						//sleepTime();	
					}
					REAN_VpnBlueprintPageAction.explicitWait(driver, message1, 50);

					driver.close();

						}
				else{
					REAN_VpnBlueprintPageAction.checkFailStatus(driver);
				}	
			}
		}



	}



	// Method to check whether deployment is failed 
	public static void checkFailStatus(WebDriver driver){
		WebElement fail=driver.findElement(By.xpath("//*[@class='fa fa-thumbs-down fa-1']/following::*[contains(text(),'Failed')][1]"));
		if(fail.isDisplayed()) 
		{
			CommonFunctionalityPage.canvas.click();
			CommonFunctionalityPage.resource_logs_btn.click();
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
		//element.click();

	}


	// Action method
	public static void actionMethod(WebDriver driver, WebElement element){

		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();
	}


	//Method to destroy after the environment is deployed
	public static void deleteEnvREAN_Vpn(WebDriver driver, String env) throws InterruptedException{

		EnvironmentPage.environment_dropdown.click();
		WebElement element = driver.findElement(By.xpath("//*[@id='EnvSelectorMenu']//span[normalize-space(.) = '" + env + "']"));
		if (element.isDisplayed()) {
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);", element);
			sleepTime(5000);
			element.click();
			/*WebDriverWait wait = new WebDriverWait(driver, 200);
			WebElement element1 = wait.until(
			ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_destroy_textbox));
			element1.sendKeys("YES");
			sleepTime(1000);
			CommonFunctionalityPage.resource_destroy_submit.click();
			Thread.sleep(3000);
			WebDriverWait w = new WebDriverWait(driver, 300);
			WebElement el = w.until(
			ExpectedConditions.visibilityOf(CommonFunctionalityPage.deploy_button));
			 */
			EnvironmentPageAction.deleteEnvironment(driver, env);

		}
	}


	public static void createConnectionREAN_Vpn(WebDriver driver) throws Exception
	{
		ConnectionPageAction.Execute(driver);
		sleepTime(2000);
		WebElement conn=null;

		String conName = "connection-test";
		String conUser = "ec2-user";
		// \r\n


		String sshKey = "-----BEGIN RSA PRIVATE KEY-----MIIEowIBAAKCAQEAsCUlKwKwhXOyRrxlCt57MLMwnpRg8opiQu3AnJ3/m2/opSSkXNd0oc9Bi0ZSxptUdo7QHrPnTRzBHtaAQGgX9TZzgEWRd45DaLEDAhIFKeHGDSSxuM/0OW/DlneonIZ4fBYDrIcrJRHP2m6TIzUYZQpqSLkX1pcnIYN0zcGShBMWBaHRdDWqi7OCRcyJPNuLHlaf+ARAZ+Tzot3Gq7r5WijsAXuc/YYARq39B9vlu7nAUuyMIUwPxUdtq2mXTv6c7DNFu7i4+LIX/qzHkdbj29oG+UAKNu/3ZyE1LtBa5YaGvRMghdEHrZLO6TWB3aCeVO86kTzjG4cLEcOVWbAltwIDAQABAoIBAGYb8lLfiUKjUfpNZemKFTGi/pE/BIA1FkckGd7wfGc31U4+UoV7ZKIUSjOZfYyiKLFdkmnp8jCydYUR5WDwtsqwWP5H1c7PimYbDtpZZeLkfXHLDrdK3ZGaJ3CHRxgNn7SW8mRGKw2fKLXAGc10DwMrqXckzRvZnZaA5OoNx4iFqjVBBWkmjtM02cMIsKCqXyeCo+0Ru5uQDzF7Fj7TJSLfgfNh7XuFCIR49lCUwBLce21TTOslbkQcyjHEz+HNhM/JmNCvv7uQAgj8cr47wsmNuFMp4UAc549NdZ8taRBZi/fhyU9h6Dock33R1JTAx3tlxJtjIBi7b3gaQ7TCDTkCgYEA+zFN2i+kxjqIJ7QvwvwH/t6b1eOkUAIqMZTqT2rZXCwn0eAc3xlqKO76Guk1BJDK7CGvEivMFgtLwO30GhSwkr7TeR9ylwe1WyP0r3rEk8qMD69dnvMwuIjoswfSB1XF3C6xh7mcI/0AdDvB/uyfX1QVhZvsOZCsfhc0lCCYLRUCgYEAs4QnCwDpivy3/DYTDL3bqzuq8cHpfHlapjpUGM0lYEAo+X8wr3l56pBepLqZXw7NjXJgLzhPJV/bKp34XY9H1FrzRBMFirVfwUnORaoRMazUvgaxsMj/paQs+r02lzsE9UoP1o3ohMIsf6fJ7Co5qlvikWDV3U0h/YHNBRjz8psCgYEAmoo624F0XoCkQ8kXmV51jNhoB6+F57NtQhPcFAAougxwcy7ulFOOfKCKPwQ7GhP6xEv06bkIVoeck5XSGDmiaKX+dQZj+YdEjE4Su+NMDaEPipbZgnEcCGwyvfKRxPGASXZwwo/vADUnklsxfyUU6BFTLGBBdSkM9oZQUtG6zgECgYBvlcizFUkWJMq0kmQ6+lTuVjOG/RMGVWSciQs3M2V1M8yEcaQwnuDChiTeXkLxjIEG2D6je2vu/mt8TR9SALsUa8hk2zIJq34u5pK6SOFRMG45BG41RmtqaeevoCerz3rggb3gjusmgpAodYKVMxYPJ/hoh3nIiqaDLsjiz0Tr2wKBgHPkIWSPagKV3b2Tf6x1Y42GuplnACxCvk+IY7ti/bxy0/Wvzi9W7FV/dfUEJXPE9/6Z8QiRHYSMcGEdiHZB0Xuq8JE3ypcZCU0g+ATYZRek5vMV8l8U6PafmH1e0hFnCNWhn1hsvM2D0m66JRvbnHJ/At8eYVNI3glrudX4vt9K-----END RSA PRIVATE KEY-----";

		try{
			conn = driver.findElement(By.xpath("//*[text()='" + conName + "']"));
			if(conn.isDisplayed())
			{
				Log.info("Found Connection Object");
				CommonFunctionalityPage.deploynow_logo.click();	
			}

		}catch(Exception ex){
			Log.error("Exception while searching SSH Connection object",ex);
		} finally {
			if(conn==null){
				Log.info("Creating new SSH Connection Object");
				ConnectionPageAction.newConnection(driver,conName ,conUser,sshKey );
				ConnectionPage.save_click.click();
				sleepTime(5000);
			}	
		}
	}



	//Method to click on Yes destroy button on the destroy pop up
	public static void resourceYesDestroyButton(WebDriver driver) throws InterruptedException{
		Log.info("User enter YES in textbox");
		WebDriverWait wait = new WebDriverWait(driver, 200);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_destroy_textbox));
		element.sendKeys("YES");
		sleepTime(1000);
		CommonFunctionalityPage.resource_destroy_submit.click();
		Thread.sleep(3000);
		WebDriverWait w = new WebDriverWait(driver, 300);
		WebElement el = w.until(
				ExpectedConditions.visibilityOf(CommonFunctionalityPage.deploy_button));
	}


}


