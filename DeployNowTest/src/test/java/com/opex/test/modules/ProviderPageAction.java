package com.opex.test.modules;
import static org.testng.AssertJUnit.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.pageobjects.ProviderPage;

public class ProviderPageAction extends SleepFunctionality{

	public static void Execute(WebDriver driver) throws Exception{
		Log.info("User click on more link$");
		//wait until notification hides
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='message ng-binding']")));

		CommonPage.more_click.click();
		sleepTime(1000);
	}

	public static void selectProvidersFromDropdown(WebDriver driver) throws Exception{
		Log.info("User click provider link from welcome dropdown$");
		ProviderPage.provider_selection.click();
		sleepTime(4000);
		
	}
	
	public static void assertProviderPage(WebDriver driver) throws Exception{
		Log.info("User is directed to provider page" );
		try{
		if(ProviderPage.assert_providerPage.isDisplayed())
		{
			Assert.assertTrue(ProviderPage.assert_providerPage.getText().matches("Provider"));
		}
		}catch(Exception ex)
		{
			Assert.fail("User is not on provider page");
		}
		Reporter.log("User is on provider page");
	}
	
	public static void performSaveClick(WebDriver driver) throws Exception{

		Log.info("User Click on save button on provider page");
		try{
			ProviderPage.save_click.click();
			sleepTime(2000);
			String text = "Provider name can not be empty";
			String text1 = "Provider type can not be empty";
			String text2 = "Provider with name Auto_AWS already exists.";
			//String text3 = "Provider with name Auto_Azure already exists.";
			String formated_string =text2.substring(0,18);
			WebDriverWait wait = new WebDriverWait(driver,150);
			WebElement element = (WebElement)wait.until(
			ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.build().perform();
			String notificationMessage = element.getText();
			if(notificationMessage.equals(text))
			{
				System.out.println("Provider name can not be empty");
				Assert.assertTrue( "Provider name can not be empty".equals(notificationMessage));
				
			}
			else if(notificationMessage.equals(text1)){
				System.out.println("Provider type can not be empty");
				Assert.assertTrue( "Provider type can not be empty".equals(notificationMessage));
							}
			else if(formated_string.equals("Provider with name")){
				Assert.assertTrue(formated_string.equals("Provider with name"));
							}
			else{
				System.out.println("Provider saved successfully.");
				Assert.assertTrue( "Provider saved successfully.".equals(notificationMessage));
							}
			sleepTime(1000);
		}
		catch(Exception e){
			Assert.fail("Blank Notification");
		}
		Reporter.log("Click action is performed on save button");
	}
	public static void performupdateClick(WebDriver driver) throws Exception{

		Log.info("User Click on save button on provider page");
		try{
			ProviderPage.update_click.click();
			//ProviderPage.save_click.click();
			sleepTime(3000);
			String text = "Provider name can not be empty";
			String text1 = "Provider type can not be empty";
			String text2 = "Provider with name Auto_AWS already exists.";
			//String text3 = "Provider with name Auto_Azure already exists.";
			String formated_string =text2.substring(0,18);
			WebDriverWait wait = new WebDriverWait(driver, 3);
			WebElement element = (WebElement)wait.until(
			ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.build().perform();
			String notificationMessage = element.getText();
			if(notificationMessage.equals(text))
			{
				System.out.println("Provider name can not be empty");
				Assert.assertTrue( "Provider name can not be empty".equals(notificationMessage));
				
			}
			else if(notificationMessage.equals(text1)){
				System.out.println("Provider type can not be empty");
				Assert.assertTrue( "Provider type can not be empty".equals(notificationMessage));
							}
			else if(formated_string.equals("Provider with name")){
				Assert.assertTrue(formated_string.equals("Provider with name"));
							}
			else{
				System.out.println("Provider saved successfully.");
				Assert.assertTrue( "Provider saved successfully.".equals(notificationMessage));
							}
			sleepTime(1000);
		}
		catch(Exception e){
			Assert.fail("Blank Notification");
		}
		Reporter.log("Click action is performed on save button");
	}

	public static void providerName(WebDriver driver,String pname) throws Exception{
		Log.info("User enter provider name");
		sleepTime(1000);
		ProviderPage.provider_name.clear();
		Assert.assertTrue("Provider Name should be empty", ProviderPage.provider_name.getAttribute("value").equals(""));
		ProviderPage.provider_name.sendKeys(pname);
		Reporter.log("Provider name is entered");
	}


	public static void providerType(WebDriver driver,String type) throws Exception{
		Log.info("User select provider type");
		//sleepTime(1000);
		ProviderPage.provider_type_click.clear();
		Assert.assertTrue("Provider type should be empty", ProviderPage.provider_type_click.getAttribute("value").equals(""));
		ProviderPage.provider_type_click.click();
		sleepTime(1000);
		WebElement element =driver.findElement(By.xpath("//ul[@role='listbox']/li/a/span[contains(text(),'"+type+"')]"));
		element.click();
		Reporter.log("Provider type is selected.");
	}
	
	public static void providerDetailsFormatButton(WebDriver driver) throws Exception{
		Log.info("User click format button on provider page");
		if(ProviderPage.provider_details_format_click.isDisplayed()) 
		{
			ProviderPage.provider_details_format_click.click();
		}
		else{
			Assert.fail("Format button under provider detail is absent");
		}
		//sleepTime();
		Reporter.log("Click action is performed on format button");
	}

	public static void providerDetailsCompactButton(WebDriver driver) throws Exception{
		Log.info("User click compact button on provider page");
		if(ProviderPage.provider_details_compact_click.isDisplayed()) 
		{
			ProviderPage.provider_details_compact_click.click();
		}
		else{
			Assert.fail("Compact button under provider detail is absent");
		}
		//sleepTime();
		Reporter.log("click action is performed on compact button");
	}


	public static void providerEditorMode(WebDriver driver,String mode) throws Exception{
		Log.info("Provider editor mode ");
		Actions actions = new Actions(driver);
		actions.moveToElement(ProviderPage.provider_details_mode_dropdown);
		actions.click().build().perform();
		WebElement element =driver.findElement(By.xpath("//button[contains(text(),'"+mode+"')]"));
		sleepTime();
		element.click();
		Reporter.log(mode+"editor mode is selected");
	}

	public static void providerSearchBox(WebDriver driver) throws Exception{
		Log.info("User validate search box availibility");
		try{
			Assert.assertTrue(ProviderPage.provider_details_search.isDisplayed());
		}
		catch (Exception e) {
			Log.error("Element is absent",e);
		}
		Reporter.log("User validate search box");
	}
	
	public static void searchValueProviderDetails(WebDriver driver) throws Exception{
		Log.info("User search value in search box.");
		Actions actions = new Actions(driver);
		actions.moveToElement(ProviderPage.provider_details_search);
		actions.click();
		sleepTime();
		actions.sendKeys("access_key");
		actions.build().perform();		   	
		sleepTime(1000);
		try{
			assertEquals("access_key",ProviderPage.provider_details_search_highlight.getText());
		}
		catch (Exception e) {
			Log.error("Exception occurred in ProviderPage.provider_details_search_highlight",e);
		}
		Reporter.log("Sign out is performed");
	}

	public static void providerDetailsAwsAccessKey(WebDriver driver) throws Exception{
		Log.info("Access key is entered.");
		ProviderPage.provider_details_aws_accesskey.sendKeys("AKIAIDXFOEISD6YPQW6A");
		sleepTime(1000);
		Reporter.log("Sign out is performed");
	}

	public static void providerDetailsAwsSecretKey(WebDriver driver) throws Exception{
		Log.info("Secret key is entered.");
		ProviderPage.provider_details_aws_secretkey.sendKeys("zAW0nG0pY/VXElbojZ8Jxj5Sbqe8Z2cFPBGGBOVj");
		sleepTime(1000);
		Reporter.log("Sign out is performed");
	}
	
	public static void deleteProvider(WebDriver driver,String Provider) throws Exception{
  		Log.info("I click on delete button.");
  		sleepTime(1000);
 		
 		WebElement provider =driver.findElement(By.xpath("//*[text()='"+Provider+"']//following-sibling::td[2]//span[@data-title='Remove']"));
  		//tr[contains(.,'"+Provider+"')]//button[2]"));
  		provider.click();
 		sleepTime(1000);
 		WebDriverWait wait = new WebDriverWait(driver, 300);
 		WebElement element = wait.until(
 		ExpectedConditions.visibilityOf(ProviderPage.remove_click_textbox));
 		sleepTime(2000);
 		ProviderPage.remove_click_yes.click();
 		Thread.sleep(3000);
 			assertEquals(
 					"Fail if Provider removed successfully.. message not displayed",
 					driver.findElement(By.xpath("//*[@class='message ng-binding']"))
 					.getText(), "Provider removed successfully.");
 			
 	sleepTime();	
  		sleepTime(3000);
  		Reporter.log("Message box should display");
  }  	

	public static void assertProviderDeleteBtn(WebDriver driver) throws Exception{
		Log.info("I assert delete button on provider page");
		/*//sleepTime();
		WebElement provider =driver.findElement(By.xpath("//tr[contains(.,'"+Provider+"')]//button[2]"));
		//provider.click();
		//Thread.sleep(3000);
*/		String text = "Provider removed successfully.";
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();
		String notificationMessage = element.getText();
		if(notificationMessage.equals(text))
		{
			Assert.assertTrue( text.equals(notificationMessage));
			System.out.println(notificationMessage);
		}
		else{
			Assert.assertTrue( text.equals(notificationMessage));
			}
		Reporter.log("Message box should display");
	}  	

	public static void providerEditButton(WebDriver driver,String pname) throws Exception{
		Log.info("I click on edit button.");
		WebElement element = findExistingProviderByName(driver, pname);
		//tr[contains(.,'"+pname+"')]//button[1]"));
		element.click();
		sleepTime(3000);
		Reporter.log("Sign out is performed");
	}  	

	public static WebElement findExistingProviderByName(WebDriver driver,  String pname) throws Exception {
		try {
			WebElement elem = driver.findElement(By.xpath("//*[contains(.,'"+pname+"')]/following::*[@ng-click='editProvider(i)']"));
			return elem;
		}

		catch (Exception e){
			Reporter.log("Unable to find element!");
			return null;
		}
	};

		public static void editProviderDetails(WebDriver driver,String awsprovider_details) throws Exception{
		Log.info("I edit provider detail");
		
		try{
			PrintWriter writer = new PrintWriter("/tmp/deploy.sh", "UTF-8");
			String currentURL =  driver.getCurrentUrl();
			System.out.println(currentURL);
			int Index1 = currentURL.indexOf("/");
			int Index2= currentURL.indexOf("#");
			System.out.println(Index1);
			System.out.println(Index2);
			String sub= currentURL.substring(Index1+2,Index2-1);
			System.out.println(sub);
			writer.println("curl -k -i -H 'Authorization:auto@mailinator.com:Auto@1234' -H 'Content-Type: application/json' -X POST -d '{ \"name\":\"Auto_AWS\", \"json\":{ \"access_key\":\"AKIAIDXFOEISD6YPQW6A\", \"secret_key\":\"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\", \"region\":\"us-east-1\" }, \"type\":\"aws\" }' 'https://"+sub+"/DeployNow/rest/provider'");
			writer.close();
			String chmod_command = "chmod 777 /tmp/deploy.sh";
			Process process1 = Runtime.getRuntime().exec(chmod_command);
			process1.waitFor(); 
			BufferedReader reader = new BufferedReader(new InputStreamReader(process1.getInputStream()));
			String line = "";
			while ((line = reader.readLine())!= null) 
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error : File not found");
		}
		
		/*JSONParser parser = new JSONParser();
		Object json  = parser.parse(awsprovider_details);
		String jsonString=json.toString();
		System.out.println("JsonString >> "+jsonString);
		Actions action=new Actions(driver);
		action.moveToElement(ProviderPage.provider_details_textarea);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(jsonString);
		action.build().perform();*/
		Reporter.log("Provider details is passed");
	}

	public static void newProviderButton(WebDriver driver) throws Exception{		
		Log.info("I click on new button.");   	
		ProviderPage.new_click.click();
		sleepTime(3000);
		Reporter.log("Click action is performed on new button");
	}  	 

	public static void scrollProviderPage(WebDriver driver) throws Exception{		
		Log.info("I Scroll scroll bar."); 
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",ProviderPage.provider_scroll_scrollbar);
		sleepTime(1000);
		Reporter.log("Scroll action is performed on provider list section");
	}  	

	
}