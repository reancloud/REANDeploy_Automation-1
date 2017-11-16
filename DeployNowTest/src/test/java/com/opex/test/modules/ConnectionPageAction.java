package com.opex.test.modules;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.pageobjects.ConnectionPage;


public class ConnectionPageAction extends SleepFunctionality{

	public static void Execute(WebDriver driver) throws Exception{
		
		Log.info("Click action is performed on Dropdown icon");
		CommonPage.more_click.click();
		sleepTime(2000);
		Log.info("Click action is performed on Connection option");
		ConnectionPage.connection_selection.click();
		sleepTime(2000);
		WebElement element = driver.findElement(By.xpath("//h4[text()='Add/Edit Connection']"));
		String strng = element.getText();
		if(strng != null){

			assertEquals("User navigate to Connection page"+strng);
		}
		else{
			Assert.fail("User cannot navigate to Connection page");
		}
		Reporter.log("Click action is performed on Dropdown icon ");
	}

	private static void assertEquals(String string) {


	}

	public static WebElement findConnectionByName(WebDriver driver, String conName) throws Exception {
		try {
			String element1 = "//*[text()='" +conName+ "']//following::*[@ng-click='editVmConnection(i)']";
			return driver.findElement(By.xpath(element1));
		}
		catch (Exception e){
			Reporter.log("Unable to find element!");
			return null;
		}
	}

	public static void performEditClickSSH(WebDriver driver,String conName, String newName,String password) throws Exception{

		Log.info("Click action is performed on Dropdown icon");
	
		WebElement element = ConnectionPage.connectionlist;
		System.out.println("connection page");
		String connection = element.getText();
		//if(connection.contains(conName))
		//{
			findConnectionByName(driver, conName).click();
			System.out.println("connection page2");
			ConnectionPageAction.connectionName(driver, newName);
			sleepTime();
			System.out.println("connection page3");
			ConnectionPage.connection_toggle.click();
			ConnectionPage.connection_password.sendKeys(password);
			ConnectionPage.connection_toggle.click();
			ConnectionPage.update_button.click();
			assertEquals(
					"Fail if Connection Updated successfully. message not displayed",
					driver.findElement(By.xpath("//*[@class='message ng-binding']"))
					.getText(), "Connection Updated successfully.");
			
			//performSaveClick(driver);

		//}
		//else{
			//Assert.fail("Connection doesn't exist");

		//}
		Reporter.log(" ");

	}


	

	private static void assertEquals(String string, String text, String string2) {
		// TODO Auto-generated method stub
		
	}

	public static void performSaveClick(WebDriver driver) throws Exception{

		Log.info("Click action is performed on Dropdown icon");
		sleepTime();
		try{
			sleepTime(2000);
			WebDriverWait wait1 = new WebDriverWait(driver,5);
			WebElement element1 = wait1.until(
					ExpectedConditions.visibilityOf(ConnectionPage.save_click));
			element1.click();
			
			Thread.sleep(3000);
			String text = "Connection name can not be empty.";
			WebDriverWait wait = new WebDriverWait(driver, 5);
			WebElement element = (WebElement)wait.until(
					ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.build().perform();
			String notificationMessage = element.getText();
			if(notificationMessage.equals(text))
			{
				Assert.assertTrue( "Connection name can not be empty.".equals(notificationMessage));
				System.out.println(notificationMessage);
			}
			else{
				Assert.assertTrue( "Connection Saved successfully.".equals(notificationMessage));
				System.out.println(notificationMessage);
			}
		}
		catch(Exception e){

			System.out.println("Notification Blank");
		}
		Reporter.log("Connection Saved");
	}




	public static void connectionWinRM(WebDriver driver, String con_winrm, String conUser, String conPwd , String conType) throws Exception{

		Log.info("Enter connection WINRM");
		WebElement conn=null;
		try{
			conn = driver.findElement(By.xpath("//*[text()='" + con_winrm + "']"));
			if(conn.isDisplayed())
			{
				Log.info("Found Connection Object");
				ConnectionPageAction.performRemoveConnectionWinRM(driver);
				//CommonFunctionalityPage.deploynow_logo.click();
			}

		}catch(Exception ex){
			//Log.error("Exception while searching SSH Connection object",ex);
		} finally {
			if(conn==null){
				Log.info("Creating new SSH Connection Object");
				ConnectionPage.connection_name.clear();
				ConnectionPage.connection_name.sendKeys(con_winrm);
				sleepTime(1000);
				ConnectionPage.connection_username.clear();
				ConnectionPage.connection_username.sendKeys(conUser);
				sleepTime(1000);
				ConnectionPage.connection_password.sendKeys(conPwd);
				sleepTime(1000);
				ConnectionPage.connection_type_dropdown.click();
				sleepTime(1000);
				Actions actions = new Actions(driver);
				WebElement element = driver.findElement(By.xpath("//*[@value='"+conType+"']"));
				actions.moveToElement(element);
				actions.click().build().perform();
				sleepTime(2000);
				
			}
		}

	}
	public static void connectionBlankData(WebDriver driver) throws Exception{

		Log.info("Enter connection blank");
		try{

			performNewConnectionBlankData(driver,"    ","   ","  ","   ");
		}catch(Exception e){
			System.out.println("Notification Blank");
		}

	}
	public static void addButtonConnection(WebDriver driver){

		Log.info("Click action is performed on New Button");
		WebElement element = driver.findElement(By.xpath("//button[contains(.,'Add')]"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		element.click();
	}

	public static void performNewConnectionBlankData(WebDriver driver,String connectionname,String username,String password,String sshKey) throws Exception{

		Log.info("Click action is performed on Dropdown icon");
		ConnectionPage.connection_name.sendKeys(connectionname);

		ConnectionPage.connection_username.sendKeys(username);

		ConnectionPage.connection_password.sendKeys(password);

		ConnectionPage.connection_ssh_key.sendKeys(sshKey);
		sleepTime();
		Reporter.log("Sign out is performed");
	}


	public static void performNewConnectionWinRM(WebDriver driver,String conName,String conUser,String con_key,String conTypeWINRM) throws Exception{


		Log.info("Enter connection WinRM ");

		WebElement element = ConnectionPage.connectionlist;
		String connection = element.getText();

		if(connection.contains(conName))
		{
			System.out.println("Connection already exist");
			CommonFunctionalityPage.deploynow_logo.click();

		}

		else{

			newConnection(driver,conName,conUser,con_key);
			connectionType(driver,conTypeWINRM);

			sleepTime();
		}

		Reporter.log(" ");	
	}

	public static void performRemoveConnectionSSH(WebDriver driver, String conName) throws Exception{

		Log.info("Click action is performed on Dropdown icon");
		sleepTime();
		String element1 = "//*[text()='"+conName+"']//following-sibling::td[2]//span[@data-title='Remove']";
		driver.findElement(By.xpath(element1)).click();
		WebDriverWait wait = new WebDriverWait(driver, 200);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(ConnectionPage.remove_click_textbox));
		sleepTime(1000);
		ConnectionPage.remove_click_yes.click();
		Thread.sleep(3000);
			assertEquals(
					"Fail if Connection removed successfully.. message not displayed",
					driver.findElement(By.xpath("//*[@class='message ng-binding']"))
					.getText(), "Connection removed successfully.");
			
		sleepTime();	
	}
	public static void performRemoveConnectionWinRM(WebDriver driver) throws Exception{

		Log.info("Click action is performed on Dropdown icon");
		sleepTime(); 
		ConnectionPage.delete_click_WinRM.click();
		String text = "Connection removed successfully.";
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'"+text+"')]")));
		String notificationMessage = element.getText();
		System.out.println("notificationMessage > "+notificationMessage);
		Assert.assertTrue( "Connection removed successfully.".equals(notificationMessage) );
		sleepTime();	
	}

	public static void connectionScrollBar(WebDriver driver) throws Exception{

		Log.info("Action is performed on connection scroll bar");
		sleepTime(2000);
		WebElement element = driver.findElement(By.xpath("//html/body/div/div/div/div/section[2]/md-content/table/tbody/tr[1]/td[1]"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		sleepTime();
	}


	public static void connectionName(WebDriver driver, String conName) throws Exception{

		Log.info("Enter connection name");
		sleepTime();
		WebElement element = ConnectionPage.connectionlist;
		String connection = element.getText();
		try{
			if(connection.contains(conName))
			{
				System.out.println("Connection already exist");	
			}
		}
		catch(Exception e){

			ConnectionPage.connection_name.clear();
			ConnectionPage.connection_name.sendKeys(conName);
			sleepTime();
		}

		Reporter.log("");

	}

	public static void connectionUser(WebDriver driver, String conUser) throws Exception{

		Log.info("Enter connection ssh/winRM user");
		sleepTime();
		ConnectionPage.connection_username.clear();
		ConnectionPage.connection_username.sendKeys(conUser);

		Reporter.log("");

	}

	public static void connectionType(WebDriver driver,String conTypeWINRM) throws Exception{

		Log.info("Enter connection ssh/winRM user");
		ConnectionPage.connection_type_dropdown.click();
		sleepTime(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement((WebElement)By.xpath("//*[@value='"+conTypeWINRM+"']"));
		actions.click().build().perform();
		sleepTime(2000);
		Reporter.log(" ");

	}
	public static void connectionPassword(WebDriver driver, String password) throws Exception{

		Log.info("Enter connection password");
		ConnectionPage.connection_password.clear();
		ConnectionPage.connection_password.sendKeys(password);
		sleepTime();
		Reporter.log("");
	}




	public static void connectionSSHKey(WebDriver driver,String con_key) throws Exception{

		Log.info("Enter connection ssh key");
		sleepTime();
		ConnectionPage.connection_ssh_key.clear();
		ConnectionPage.connection_ssh_key.sendKeys(con_key); 
		sleepTime();

	}

	public static void connectionSSHKeyCheckBox(WebDriver driver) throws Exception{

		Log.info("Click the check box connection ssh key");
		sleepTime();
		ConnectionPage.sshKeyCheckBox.click();
		sleepTime();
	}

	/*public static void connectionSSH(WebDriver driver, String conName, String conUser,String con_key) throws Exception{

		Log.info("Enter connection SSH");

		WebElement element = ConnectionPage.connectionlist;
		String connection = element.getText();

		if(connection.contains(conName))
		{
			System.out.println("Connection already exist");
			CommonFunctionalityPage.deploynow_logo.click();

		}

	else{

			NewConnection(driver,conName,conUser,con_key);
			sleepTime();
		}
	}
	 */
	public static void connectionSSH(WebDriver driver, String conName , String conUser, String conKey ) throws Exception
	{
		ConnectionPageAction.addButtonConnection(driver);
		//sleepTime(1000);
		WebElement conn=null;
		try{
			conn = driver.findElement(By.xpath("//*[text()='" + conName + "']"));
			if(conn.isDisplayed())
			{
				Log.info("Found Connection Object");
				CommonFunctionalityPage.deploynow_logo.click();
			}

		}catch(Exception ex){
			//Log.error("Exception while searching SSH Connection object",ex);
		} finally {
			if(conn==null){
				Log.info("Creating new SSH Connection Object");
				ConnectionPageAction.newConnection(driver, conName, conUser, conKey);
				ConnectionPage.save_click.click();
				//sleepTime(5000);
			}	
		}
	}
	public static void newConnection(WebDriver driver, String conName, String conUser,String con_key) throws Exception{

		Log.info("Create new cnnection");


		ConnectionPage.connection_name.clear();
		ConnectionPage.connection_name.sendKeys(conName);
		sleepTime();
		ConnectionPage.connection_username.clear();
		ConnectionPage.connection_username.sendKeys(conUser);
		ConnectionPage.connection_ssh_key.clear();
		ConnectionPage.connection_ssh_key.sendKeys(con_key); 
		sleepTime();
		Reporter.log("Sign out is performed");
	}
	public static void newConnection(WebDriver driver, String conName, String conUser,String con_key,String conTypeWINRM) throws Exception{

		Log.info("Create new WinRM  connection");

		ConnectionPage.connection_name.clear();
		ConnectionPage.connection_name.sendKeys(conName);
		sleepTime(1000);
		ConnectionPage.connection_username.clear();
		ConnectionPage.connection_username.sendKeys(conUser);
		ConnectionPage.connection_ssh_key.clear();
		ConnectionPage.connection_ssh_key.sendKeys(con_key); 
		sleepTime(1000);
		ConnectionPage.connection_type_dropdown.click();
		sleepTime(1000);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@value='"+conTypeWINRM+"']"));
		actions.moveToElement(element);
		actions.click().build().perform();
		sleepTime(2000);
	}

	
	public static void verifyConnection(WebDriver driver, String connection, String user) throws Exception{		
		Log.info("Verify if connection get created."); 
		sleepTime(1000);
		WebElement element = driver.findElement(By.xpath("//tr[@ng-repeat='i in vmConnections']//td[contains(text(),'"+connection+"')]/following-sibling::td[contains(text(),'"+user+"')]"));
		String element_user = element.getText();
		if(element_user == user){
		assertTrue(element_user.equals(user));
		}
		Reporter.log("Verification of connection creation");
	}

}
