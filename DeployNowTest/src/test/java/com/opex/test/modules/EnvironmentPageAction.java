package com.opex.test.modules;

import static org.testng.AssertJUnit.assertEquals;

import java.util.NoSuchElementException;
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
import com.opex.test.pageobjects.ConnectionPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.ProviderPage;
import com.opex.test.step_definitions.SuperUsedDefinition;

public class EnvironmentPageAction extends SuperUsedDefinition{

	public EnvironmentPageAction ()
	{
		super();  	
	}

	public static int count = 0;

	public static void createawsprovider(WebDriver driver) throws Exception
	{
		sleepTime(1000);
		ProviderPageAction.Execute(driver);
		ProviderPageAction.selectProvidersFromDropdown(driver);
		WebElement element = ProviderPage.providerlist;
		String provider_aws = element.getText();
		if(provider_aws.contains(dnProvider.getprovider_AWSname()))
		{
			Log.info("Found provider object");
			CommonFunctionalityPage.deploynow_logo.click();
		}
		else
		{
			ProviderPage.new_click.click();
			ProviderPageAction.providerName(driver, dnProvider.getprovider_AWSname());
			ProviderPageAction.providerType(driver, dnProvider.getprovider_AWStype());
			ProviderPageAction.editProviderDetails(driver,dnProvider.getprovider_AWSdetails());
			ProviderPageAction.performSaveClick(driver);
			sleepTime(2000);
			CommonFunctionalityPage.deploynow_logo.click();
		}
	}
	public static void createsshconnection(WebDriver driver) throws Exception
	{
		ConnectionPageAction.Execute(driver);
		sleepTime(2000);
		WebElement conn=null;
		try{
			conn = driver.findElement(By.xpath("//*[text()='" + dncon.getCon_name() + "']"));
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
				ConnectionPageAction.newConnection(driver, dncon.getCon_name(), dncon.getCon_user(), dncon.getCon_key());
				ConnectionPage.save_click.click();
				sleepTime(1000);
			}	
		}
	}
	public static void createwinrmconnection(WebDriver driver) throws Exception
	{
		ConnectionPageAction.Execute(driver);
		sleepTime(1000);
		WebElement conn=null;
		try{
			conn = driver.findElement(By.xpath("//*[text()='" + dncon.getCon_name_winrm() + "']"));
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
				ConnectionPageAction.connectionWinRM(driver,dncon.getCon_name_winrm(),dncon.getCon_user(),dncon.getCon_pwd(),dncon.getCon_typeWINRM());
				ConnectionPage.save_click.click();
				sleepTime(2000);
			}	
		}
	}
	public static void create_digitaloceanprovider(WebDriver driver) throws Exception{
		sleepTime(1000);
		ProviderPageAction.Execute(driver);
		ProviderPageAction.selectProvidersFromDropdown(driver);
		WebElement element = ProviderPage.providerlist;
		String connection_ssh = element.getText();
		//Log.info(connection_ssh);
		if(connection_ssh.contains(dnProvider.getprovider_DegitalOceanname()))
		{
			Log.info("Provider already exist");
			CommonFunctionalityPage.deploynow_logo.click();
		}
		else
		{
			ProviderPage.new_click.click();
			ProviderPageAction.providerName(driver, dnProvider.getprovider_DegitalOceanname());
			ProviderPageAction.providerType(driver,dnProvider.getprovider_DegitalOceantype());
			ProviderPage.save_click.click();
			sleepTime(2000);
			CommonFunctionalityPage.deploynow_logo.click();
		}
	}


	public static void create_vSphereprovider(WebDriver driver) throws Exception{
		sleepTime(2000);
		ProviderPageAction.Execute(driver);
		ProviderPageAction.selectProvidersFromDropdown(driver);
		WebElement element = ProviderPage.providerlist;
		String connection_ssh = element.getText();
		Log.info(connection_ssh);
		if(connection_ssh.contains(dnProvider.getprovider_vSpherename()))
		{
			Log.info("Provider already exist");
			CommonFunctionalityPage.deploynow_logo.click();
		}
		else
		{
			ProviderPage.new_click.click();
			ProviderPageAction.providerName(driver, dnProvider.getprovider_vSpherename());
			ProviderPageAction.providerType(driver,dnProvider.getprovider_vSpheretype());
			ProviderPage.save_click.click();
			sleepTime(2000);
			CommonFunctionalityPage.deploynow_logo.click();
		}
	}
	public static void create_Azureprovider(WebDriver driver) throws Exception{
		sleepTime(1000);
	    
		ProviderPageAction.Execute(driver);
		//CommonPage.dropdown_click.click();
		ProviderPageAction.selectProvidersFromDropdown(driver);
		WebElement element = ProviderPage.providerlist;
		String connection_ssh = element.getText();
		//Log.info(connection_ssh);
		if(connection_ssh.contains(dnProvider.getprovider_Azurename()))
		{
			Log.info("Provider already exist");
			CommonFunctionalityPage.deploynow_logo.click();
		}
		else
		{
			ProviderPage.new_click.click();
			ProviderPageAction.providerName(driver, dnProvider.getprovider_Azurename());
			ProviderPageAction.providerType(driver,dnProvider.getprovider_Azuretype());
			ProviderPage.save_click.click();
			sleepTime(2000);
			CommonFunctionalityPage.deploynow_logo.click();
		}
	}
	public static void create_Dockerprovider(WebDriver driver) throws Exception{
		sleepTime(1000);
		ProviderPageAction.Execute(driver);
		ProviderPageAction.selectProvidersFromDropdown(driver);	
		WebElement element = ProviderPage.providerlist;
		String connection_ssh = element.getText();
		//Log.info(connection_ssh);
		if(connection_ssh.contains(dnProvider.getprovider_Dockername()))
		{
			Log.info("Provider already exist");
			CommonFunctionalityPage.deploynow_logo.click();
		}
		else
		{
			ProviderPage.new_click.click();
			ProviderPageAction.providerName(driver, dnProvider.getprovider_Dockername());
			ProviderPageAction.providerType(driver,dnProvider.getprovider_Dockertype());
			ProviderPage.save_click.click();
			sleepTime(2000);
			CommonFunctionalityPage.deploynow_logo.click();
		}
	}



	public static void Execute(WebDriver driver) throws Exception
	{
		Log.info("Click action is performed on create environment");	
		EnvironmentPage.create_Button.click();
		sleepTime(1000);
	}
	public static void clickonCopybutton(WebDriver driver) throws Exception
	{
		Log.info("Click action is performed on copy environment");
		EnvironmentPage.MoreOptions.click();
		EnvironmentPage.create_environment_copybutton_click.click();
		String text="Environment is being copied.......";
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement message = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		         sleepTime(3000);
	}
	public static void entercopyName(WebDriver driver,String envname) throws Exception
	{

		EnvironmentPage.create_environment_name.sendKeys(envname);
		sleepTime(1000);
	}
	public static void entercopyDescription(WebDriver driver,String envdescription) throws Exception
	{

		EnvironmentPage.create_environment_description.sendKeys(envdescription);
		sleepTime(1000);
	}

	public static void enterEditName(WebDriver driver,String envname) throws Exception
	{
		EnvironmentPage.edit_environment_name.clear();
		EnvironmentPage.edit_environment_name.sendKeys(envname);
		sleepTime(1000);
	}
	public static void enterEditDescription(WebDriver driver,String envdescription) throws Exception
	{
		EnvironmentPage.edit_environment_description.clear();
		EnvironmentPage.edit_environment_description.sendKeys(envdescription);
		sleepTime(1000);
	}

	public static void selectConnectionForEdit(WebDriver driver,String envconnection) throws Exception
	{
		Select Connection =new Select(EnvironmentPage.edit_environment_connection);
		selectConnectionBySelectElement(driver, envconnection, Connection);
	}

	public static void selectconnection(WebDriver driver,String envconnection) throws Exception
	{
		Select Connection =new Select(EnvironmentPage.create_environment_connection);
		selectConnectionBySelectElement(driver, envconnection, Connection);
	}

	private static void selectConnectionBySelectElement(WebDriver driver, String envconnection, Select Connection) throws Exception
	{
		for(int i=0;i< Connection.getOptions().size();i++)
		{
			String myConnection = Connection.getOptions().get(i).getText();
			if(myConnection.equalsIgnoreCase(envconnection))
			{
				Connection.selectByVisibleText(envconnection);
				break;
			}
		}	
		sleepTime(1000);
	}

	public static void selectProviderForEdit(WebDriver driver,String envprovider) throws Exception
	{
		WebElement element = EnvironmentPage.edit_environment_provider;
		selectProviderByElem(driver, envprovider, element);
	}
	public static void selectprovider(WebDriver driver,String envprovider) throws Exception
	{
		WebElement element=driver.findElement(By.xpath("//*[@id='EnvProviderEntered'][2]"));
		selectProviderByElem(driver, envprovider, element);
	}
	private static void selectProviderByElem(WebDriver driver, String envprovider, WebElement providerElem) throws Exception
	{
		Actions actions = new Actions(driver);
		sleepTime(2000);
		providerElem.click();
		providerElem.clear();
		sleepTime(3000);
		WebElement providerclick =driver.findElement(By.xpath("//*[@id='EnvProviderEntered']/following::*[text()='"+envprovider+"'][1]"));
		actions.moveToElement(providerclick);
		actions.click().build().perform();
		sleepTime(3000);
	}

	public static void fillingNewEnvironmentDetailsForSSHAndAWSWithRegion(WebDriver driver,String name, String description, String region) throws Exception
	{
		Log.info("User enter all data for SSH Conn and AWS Provider and specifies region too");
		fillingNewEnvironmentDetailsAfterCreate(driver, name, description, dncon.getCon_name(), dnProvider.getprovider_AWSname());

		Log.info("select aws region from dropdown");
		Select regions =new Select(EnvironmentPage.create_aws_region);
		for(int i=0;i< regions.getOptions().size();i++)
		{
			String myRegion = regions.getOptions().get(i).getText();
			if(myRegion.equalsIgnoreCase(region))
			{
				regions.selectByVisibleText(myRegion);
				break;
			}
		}
	}


	public static void fillingNewEnvironmentDetailsAfterCreate(WebDriver driver,String name, String description, String connection,String provider) throws Exception
	{
		Log.info("User enter all data to create environment");
		EnvironmentPage.create_Button.click();
		sleepTime(4000);
		//EnvironmentPageAction.fillingCopyEnvironmentDetailsAfterCreate(driver, name, description, connection, provider);
		EnvironmentPage.create_environment_name.sendKeys(name);
		EnvironmentPage.create_environment_description.sendKeys(description);
		Log.info("select connection from dropdown");
		Select Connection =new Select(EnvironmentPage.create_environment_connection);
		for(int i=0;i< Connection.getOptions().size();i++)
		{
			String myConnection = Connection.getOptions().get(i).getText();
			if(myConnection.equalsIgnoreCase(connection))
			{
				Connection.selectByVisibleText(connection);
				break;
			}
		}	
		Actions actions = new Actions(driver);
		actions.moveToElement(EnvironmentPage.create_environment_provider);
		actions.click().build().perform();
		sleepTime(1000);
		WebElement providerclick =driver.findElement(By.xpath("//*[@id='EnvProviderEntered']/following::*[text()='"+provider+"'][1]"));
		actions.moveToElement(providerclick);
		actions.click().build().perform();
		sleepTime(3000);
		Reporter.log("All data entered successfully");		
	}
	public static void fillingCopyEnvironmentDetailsAfterCreate(WebDriver driver,String name, String description, String connection,String provider) throws Exception
	{
		Log.info("User enter all data to create environment");
		EnvironmentPage.create_environment_name.clear();
		EnvironmentPage.create_environment_name.sendKeys(name);
		sleepTime(1000);
		EnvironmentPage.create_environment_description.clear();
		EnvironmentPage.create_environment_description.sendKeys(description);
		sleepTime(1000);
		Log.info("select connection from dropdown");
		Select Connection =new Select(EnvironmentPage.create_environment_connection);
		for(int i=0;i< Connection.getOptions().size();i++)
		{
			String myConnection = Connection.getOptions().get(i).getText();
			if(myConnection.equalsIgnoreCase(connection))
			{
				Connection.selectByVisibleText(connection);
				break;
			}
		}	
		sleepTime(3000);
		Actions actions = new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//*[@id='EnvProviderEntered'][2]"));
		/*actions.moveToElement(element);
		actions.click().build().perform();;*/
		element.click();
		element.clear();
		sleepTime(3000);
		WebElement providerclick =driver.findElement(By.xpath("//*[@id='EnvProviderEntered']/following::*[text()='"+provider+"'][1]"));
		actions.moveToElement(providerclick);
		actions.click().build().perform();
		Reporter.log("All data entered successfully");		
	}

	public static void environmentOnlyName(WebDriver driver,String envname) throws Exception
	{

		EnvironmentPage.create_environment_name.sendKeys(envname);
		sleepTime(1000);
	}
	public static void environmentNameDescription(WebDriver driver,String env ,String description) throws Exception
	{

		EnvironmentPage.create_environment_name.sendKeys(env);
		sleepTime(1000);
		EnvironmentPage.create_environment_description.sendKeys(description);
		sleepTime(1000);
	}
	public static void environmentNameDescriptionConnection(WebDriver driver,String env,String description,String connection) throws Exception
	{

		Log.info("Select connection from dropdown");
		EnvironmentPage.create_environment_name.sendKeys(env);
		sleepTime(1000);
		EnvironmentPage.create_environment_description.sendKeys(description);
		sleepTime(1000);
		EnvironmentPage.create_environment_connection.sendKeys(connection);
		sleepTime(1000);
		Log.info("select provider from dropdown");	
	}

	public static void environmentDropdown(WebDriver driver) {
		Log.info("Click action is perform on environment dropdown");
		EnvironmentPage.canvas.click();
		sleepTime(3000);
		EnvironmentPage.environment_dropdown.click();
		sleepTime(3000);
		Reporter.log("Environment dropdown selected");

	}

	public static void verifyCreatePage(WebDriver driver) throws Exception
	{
		Log.info("Verify create environment page");

		assertEquals("DeployNow",driver.getTitle());
		Log.info("title name >> "+driver.getTitle());

	}

	public static void createNewEnvironmentButton(WebDriver driver) throws Exception{
		Log.info("Click action is performed on create");
		sleepTime(3000);
		EnvironmentPage.create_environment_create_click.click();
		sleepTime(2000);
		String text = "Environment created successfully.......";
		String text1 ="Environment name can not be empty.";
		String text2="Please select valid connection to connect Machine Resources.";
		String text3="Environment with the same name already exist.";

		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();

		String notificationMessage = element.getText();

		if(notificationMessage.equals(text))
		{
			Assert.assertTrue( "Environment created successfully.......".equals(notificationMessage));
			Log.info(notificationMessage);
		}
		else if(notificationMessage.equals(text3))
		{
			Assert.assertTrue( "Environment with the same name already exist.".equals(notificationMessage));
			Log.info(notificationMessage);
		}
		else if(notificationMessage.equals(text1)){
			Assert.assertTrue( "Environment name can not be empty.".equals(notificationMessage));
			Log.info(notificationMessage);
		}
		else if(notificationMessage.equals(text2))
		{
			Assert.assertTrue( "Please select valid connection to connect Machine Resources.".equals(notificationMessage));
			Log.info(notificationMessage);
		}
		sleepTime(2000);
		//sleepTime();
		Reporter.log("Sign out is performed");

	}
	
	public static void createNewEnvironmentButton1(WebDriver driver) throws Exception{
		Log.info("Click action is performed on create");
		sleepTime(3000);
		EnvironmentPage.create_environment_create_click.click();
		sleepTime(2000);
		/*String text="Environment with the same name already exist.";

		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);*/
		assertEquals(
				"Fail if Connection Updated successfully. message not displayed",
				driver.findElement(By.xpath("//*[@class='message ng-binding']"))
				.getText(), "Environment with the same name already exists.");
		
	}


	public static void closeCreateEnvironmentPage(WebDriver driver) throws Exception{

		Log.info("Click action is performed on close button");
		EnvironmentPage.create_environment_close_click.click();
		sleepTime(2000);
		Reporter.log("Click action is performed on create button successfully");

	}
	//for search environment
	public static void searchEnvironment(WebDriver driver) throws Exception{

		Log.info("Click action is performed on search box");
		sleepTime(1000); 
		CommonFunctionalityPage.create_environment_search.click();
		sleepTime(1000);
	}

	public static void selectSearchedEnvironment(WebDriver driver) throws Exception{

		Log.info("Searched environment is selected ");
		sleepTime(1000);
		//sleepTime();
		//sleepTime();
		//EnvironmentPage.environment_To_Modify.submit();
		EnvironmentPage.environment_To_Modify.click();
		sleepTime(1000); 
		Reporter.log("Sign out is performed");
	}


	public static void editEnvironment(WebDriver driver) {	 

		Log.info("Click action is performed on edit ");	 
		EnvironmentPage.create_environment_copybutton_click.click();
		sleepTime(1000); 
		Reporter.log("Sign out is performed");
	}
	public static void editName(WebDriver driver){


		Log.info("Edit name ");
		EnvironmentPage.create_environment_name.clear();
		EnvironmentPage.create_environment_name.sendKeys("Test Env Edited");
		sleepTime(1000);
		Log.info("Click action is performed on edit  ");
		EnvironmentPage.create_environment_create_click.click();
		sleepTime(1000);
		Reporter.log("Sign out is performed");
	}
	public static void editDescription(WebDriver driver){


		Log.info("Edit description ");
		EnvironmentPage.create_environment_description.clear();
		EnvironmentPage.create_environment_description.sendKeys("Test Env Edited description");
		sleepTime(1000);
		Log.info("Action is performed on edit  description");
		EnvironmentPage.create_environment_create_click.click();
		sleepTime(1000);
		Reporter.log("Sign out is performed");
	}
	public static void editConnection(WebDriver driver){


		Log.info("Edit connection ");
		//EnvironmentPage.create_environment_connection.clear();
		EnvironmentPage.create_environment_connection.sendKeys("PX_WinRM");
		sleepTime(1000);
		Log.info("Action is performed on edit connection");
		EnvironmentPage.create_environment_create_click.click();
		sleepTime(1000);
		Reporter.log("Sign out is performed");
	}
	public static void editProvider(WebDriver driver){


		Log.info("select provider from dropdown");
		EnvironmentPage.create_environment_provider.clear();
		Actions actions = new Actions(driver);
		actions.moveToElement(EnvironmentPage.create_environment_provider);
		actions.click().build().perform();
		sleepTime(1000);
		actions.moveToElement(EnvironmentPage.environment_Azure_provider);
		actions.click().perform();
		sleepTime(1000);
		EnvironmentPage.create_environment_create_click.click();
		sleepTime(1000);
		Reporter.log("Sign out is performed");
	}
	public static void deleteEnvironment(WebDriver driver) {

		Log.info("Click on delete environment button");
		CommonFunctionalityPageAction.clickCanvas(driver);
		EnvironmentPage.environment_dropdown.click();
		sleepTime(1000);
		WebElement element = EnvironmentPage.environment_To_Modify;
		if(element.isDisplayed()){
			Log.info("Verified PASSED");
			JavascriptExecutor je = (JavascriptExecutor) driver;

			je.executeScript("arguments[0].scrollIntoView(true);",element);
			sleepTime(1000);
			Log.info(element.getText());
			//element.click();
			EnvironmentPage.create_environment_delete.click();
			sleepTime(1000);
			EnvironmentPage.delete_yessearch_env.click();
			sleepTime(1000);
		}
		//EnvironmentPage.create_environment_delete.click();
		String text="Environment deleted successfully.......";
		WebDriverWait wait = new WebDriverWait(driver, 3);
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
		}
	}

	public static void deleteEnvironment1(WebDriver driver,String envName) throws Exception{
		Log.info("Action is performed on connection scroll bar");
		CommonFunctionalityPageAction.refreshPage(driver);
        EnvironmentPage.environment_dropdown.clear();
//	    EnvironmentPage.environment_dropdown.sendKeys(envName);
		try{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebElement searchedCreatedEnvironment = driver.findElement(By.xpath("//*[@name='env-search']/following::span[contains(text(),'"+envName+"')]"));
			if(searchedCreatedEnvironment.isDisplayed()){
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);",searchedCreatedEnvironment);
				sleepTime(2000);
				WebElement deleteSearchedCreatedEnvironment = driver.findElement(By.xpath("//span[contains(text(),'"+envName+"')]/following::span"));
				deleteSearchedCreatedEnvironment.click();
				sleepTime(2000);
				EnvironmentPage.delete_yessearch_env.click();
				sleepTime(2000);	
			}
			String text="Environment deleted successfully.......";
			WebDriverWait wait = new WebDriverWait(driver, 3);
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
				}
		}catch(Exception e){
			Log.error("Exception while searching Environment object",e);
		}
	}
	
public static void deleteEnvironment(WebDriver driver,String envName) {
		Log.info("Action is performed on connection scroll bar");
		try{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//sleepTime();
			//driver.navigate().refresh();
			//sleepTime();
			//sleepTime();
			
			WebElement searchedCreatedEnvironment = driver.findElement(By.xpath("//*[@name='env-search']/following::span[contains(text(),'"+envName+"')]"));
			if(searchedCreatedEnvironment.isDisplayed()){
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);",searchedCreatedEnvironment);
				sleepTime(2000);
				//element.click();
				WebElement deleteSearchedCreatedEnvironment = driver.findElement(By.xpath("//span[contains(text(),'"+envName+"')]/following::span"));
				deleteSearchedCreatedEnvironment.click();
				sleepTime(2000);
				//sleepTime();
				EnvironmentPage.delete_yessearch_env.click();
				sleepTime(2000);	
			}
			String text="Environment deleted successfully.......";
			WebDriverWait wait = new WebDriverWait(driver, 3);
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
		}catch(Exception e){
			Log.error("Exception while searching Environment object",e);
		}
			}
	
		public static void searchSSHAWSEnvironment(WebDriver driver,String env_name) throws Exception
	{
		Log.info("User search environment$");

		resetEnvironment(driver, env_name, true);

		Reporter.log("I search value in search box");
	}

	public static void resetEnvironment(WebDriver driver, String env_name, Boolean createNew) throws Exception
	{
		if(createNew == false)
			Log.info("Search, destroy and delete Environment by name "+ env_name);
		else
			Log.info("Search, destroy, delete and recreate new Environment by name " + env_name);
		//EnvironmentPage.canvas.click();
		EnvironmentPage.environment_dropdown.clear();
		EnvironmentPage.environment_dropdown.sendKeys(env_name);
		try {	
			WebElement element = driver.findElement(By.xpath("//*[@name='env-search']/following::span[contains(text(),'"+env_name+"')]"));
			
			if (element.isDisplayed()) {
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", element);
				element.click();
				sleepTime(2000);
				
				try {
					WebElement resource_destroy_btn = driver.findElement(By.xpath("//*[@uib-popover='Destroy']"));
					if (resource_destroy_btn.isDisplayed()) {
						resource_destroy_btn.click();
						sleepTime(1000);
						CommonFunctionalityPageAction.resourceYesDestroyButton(driver);
						sleepTime(1000);
						CommonFunctionalityPageAction.refreshPage(driver);
						EnvironmentPage.environment_dropdown.clear();
						sleepTime(1000);
						EnvironmentPageAction.deleteEnvironment(driver, env_name);
						if(createNew == true) {
							EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver, env_name,
								dnowEnv.getEnv_description(), dncon.getCon_name(), dnProvider.getprovider_AWSname());
							EnvironmentPageAction.createNewEnvironmentButton(driver);
						}
					}
                } 
				catch (Exception exp)
				{
					EnvironmentPage.environment_dropdown.clear();
					sleepTime(1000);
					EnvironmentPage.environment_dropdown.sendKeys(env_name);
					EnvironmentPageAction.deleteEnvironment(driver, env_name);
					if(createNew == true) {
						EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver, env_name,
							dnowEnv.getEnv_description(),  dncon.getCon_name(), dnProvider.getprovider_AWSname());
						EnvironmentPageAction.createNewEnvironmentButton(driver);
					}
				}
			}
		} catch (Exception e) {
			if(createNew == true) {
				EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver, env_name,
					dnowEnv.getEnv_description(), dncon.getCon_name(), dnProvider.getprovider_AWSname());
				EnvironmentPageAction.createNewEnvironmentButton(driver);
			}
			else {
				Assert.fail("Error finding and destroying env");
			}
		}


	}

		public static void searchCopyEnvironment(WebDriver driver,String envdName) throws Exception
	{
		Log.info("User search environment$");
		EnvironmentPage.environment_dropdown.sendKeys(envdName);
		try{
			WebElement element = driver.findElement(By.xpath("//*[@name='env-search']/following::span[contains(text(),'"+envdName+"')]"));
			if (element.isDisplayed()) 
			{
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", element);
				element.click();
				sleepTime(2000);
				EnvironmentPage.MoreOptions.click();
				WebElement ele =driver.findElement(By.xpath("//*[@id='more-dropdown']//following::a[text()='Copy']"));
				ele.click();
				String text="Environment is being copied.......";
				WebDriverWait wait = new WebDriverWait(driver, 3);
				WebElement message = (WebElement)wait.until(
						ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
				Actions act = new Actions(driver);
				act.moveToElement(message);
				act.build().perform();
				String notificationMessage = message.getText();
				if(notificationMessage.equals(text))
				{
					Assert.assertTrue( "Environment is being copied.......".equals(notificationMessage));
					Log.info(notificationMessage);	
				}
				sleepTime(1000);
				EnvironmentPageAction.fillingCopyEnvironmentDetailsAfterCreate(driver, dnowEnv.getEnv_copy_name(),dnowEnv.getEnv_copy_description(), dncon.getCon_name(), dnProvider.getprovider_AWSname());
				EnvironmentPageAction.createNewEnvironmentButton(driver);
				EnvironmentPage.environment_dropdown.clear();
				EnvironmentPage.environment_dropdown.sendKeys(envdName);
				EnvironmentPageAction.deleteEnvironment1(driver, envdName);
				sleepTime(2000);
				EnvironmentPage.environment_dropdown.clear();
				EnvironmentPage.environment_dropdown.sendKeys(dnowEnv.getEnv_copy_name());
				EnvironmentPageAction.deleteEnvironment1(driver, dnowEnv.getEnv_copy_name());
			}
		}
		catch(Exception e)
		{
			EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver, envdName,
					dnowEnv.getEnv_description(), dncon.getCon_name(), dnProvider.getprovider_AWSname());	
			EnvironmentPageAction.createNewEnvironmentButton(driver);
			sleepTime(2000);
			EnvironmentPage.MoreOptions.click();
			WebElement ele =driver.findElement(By.xpath("//*[@id='more-dropdown']//following::a[text()='Copy']"));
			ele.click();
			sleepTime(3000);
			String text="Environment is being copied.......";
			WebDriverWait wait = new WebDriverWait(driver, 3);
			WebElement message = (WebElement)wait.until(
					ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
			Actions act = new Actions(driver);
			act.moveToElement(message);
			act.build().perform();
			String notificationMessage = message.getText();
			if(notificationMessage.equals(text))
			{
				Assert.assertTrue( "Environment is being copied.......".equals(notificationMessage));
				Log.info(notificationMessage);	
			}
			sleepTime(1000);
			EnvironmentPageAction.fillingCopyEnvironmentDetailsAfterCreate(driver, dnowEnv.getEnv_copy_name(),dnowEnv.getEnv_copy_description(), dncon.getCon_name(), dnProvider.getprovider_AWSname());
			EnvironmentPageAction.createNewEnvironmentButton(driver);
			EnvironmentPage.environment_dropdown.clear();
			EnvironmentPage.environment_dropdown.sendKeys(envdName);
			EnvironmentPageAction.deleteEnvironment(driver, envdName);
			sleepTime(2000);
			EnvironmentPage.environment_dropdown.clear();
			EnvironmentPage.environment_dropdown.sendKeys(dnowEnv.getEnv_copy_name());
			EnvironmentPageAction.deleteEnvironment(driver, dnowEnv.getEnv_copy_name());
		}
		Reporter.log("I search value in search box");
	}

	public static void exportFile(WebDriver driver,String exportFile) throws Exception
	{
		Log.info("Export file");
		EnvironmentPage.MoreOptions.click();
		WebElement exportEnvironment = driver.findElement(By.xpath("//*[@id='more-dropdown']//following::a[text()='Export']"));
		exportEnvironment.click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(EnvironmentPage.doYouWantToExportNo));
		sleepTime(1000);
		Reporter.log("Export action is performed");
	}
	public static void exportFileYes(WebDriver driver) throws Exception
	{
		Log.info("Export file yes button click");
		EnvironmentPage.doYouWantToExport_yes.click();
		sleepTime(1000);
		Reporter.log("Export action is performed");
	}
	public static void exportFileNo(WebDriver driver) throws Exception
	{
		Log.info("Export file No button click");
		EnvironmentPage.doYouWantToExportNo.click();
		sleepTime(1000);
		Reporter.log("Export action is performed");
	}

	public static void exportFileAsBluePrintYes(WebDriver driver) throws Exception
	{
		Log.info("Export file as blueprint yes button click");
		EnvironmentPage.ExportAsBluePrint_yes.click();
		sleepTime(3000);
		String save_msg="Environment exported successfully.......";
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		WebElement ele = wait1.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.build().perform();
		String notificationMessage = ele.getText();
		Assert.assertEquals(save_msg, notificationMessage);
		Reporter.log("Export file as blueprint yes button click is performed");
	}

	public static void exportFileAsBluePrintNo(WebDriver driver) throws Exception
	{
		Log.info("Export file as blueprint no button click");
		EnvironmentPage.ExportAsBluePrint_no.click();
		sleepTime(3000);
		String save_msg="Environment exported successfully.......";
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		WebElement ele = wait1.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.build().perform();
		String notificationMessage = ele.getText();
		Assert.assertEquals(save_msg, notificationMessage);

	}

	public static void editClick(WebDriver driver) throws Exception
	{
		Log.info("User click on edit button ");
		EnvironmentPage.MoreOptions.click();
		EnvironmentPage.editButton.click();
		sleepTime(3000);
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(EnvironmentPage.editCrossButton));
		Reporter.log("edit button is clicked");
	}

	public static void editCrossBtn(WebDriver driver) throws Exception
	{
		Log.info("User click on edit cross button ");
		sleepTime(1000);
		EnvironmentPage.editCrossButton.click();
		Reporter.log("Edit cross button is clicked");
	}

	public static void editCancelBtn(WebDriver driver) throws Exception
	{
		Log.info("User click on edit cancel button ");
		sleepTime(1000);
		EnvironmentPage.editCancelButton.click();
		Reporter.log("Edit Cancel button is clicked");
	}

	public static void editUpdateBtn(WebDriver driver) throws Exception
	{
		Log.info("User click on edit Update button ");
		sleepTime(1000);
		EnvironmentPage.editUpdateButton.click();
		Reporter.log("Edit Update button is clicked");
	}

	public static void importFile(WebDriver driver, String envName) throws Exception
	{
		
		Log.info("User click on import button ");
		EnvironmentPage.MoreOptions.click();
		EnvironmentPage.importButton.click();
		sleepTime(3000);
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(EnvironmentPage.importCrossButton));
		Reporter.log("Import button is clicked");
	}
		
		
	public static void importCrossBtn(WebDriver driver) throws Exception
	{
		Log.info("User click on import cross button ");
		sleepTime(1000);
		EnvironmentPage.importCrossButton.click();
		Reporter.log("Import cross button is clicked");
	}

	public static void importCancelBtn(WebDriver driver) throws Exception
	{
		Log.info("User click on import cancel button ");
		sleepTime(1000);
		EnvironmentPage.importCancelButton.click();
		Reporter.log("Import cancel button is clicked");
	}

	public static void importChooseFile(WebDriver driver,String envName) throws Exception
	{
		Log.info("User choose file to import ");
		sleepTime(3000);
		String workingDir = System.getProperty("user.dir");
		String filepath = workingDir + "/src/test/resources/testData" + envName;
		EnvironmentPage.importChooseFileButton.sendKeys(filepath);
		sleepTime(3000);
		Reporter.log("Choose file to import");
	}


	public static void importUploadBtn(WebDriver driver) throws Exception
	{
		Log.info("User click on upload button ");
		sleepTime(3000);
		EnvironmentPage.importUploadButton.click();
		sleepTime(3000);	
		Reporter.log("Import upload button is clicked");
	}

	public static void importConnectionProviderForMultiLayer(WebDriver driver,String envConnection, String envProvider) throws Exception{

		Log.info("User select provider for import blueprint");
		sleepTime(3000);
		if((driver.findElement(By.xpath("//*[@name='importEnvConnection_"+count+"']"))).equals(envConnection)){
			
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
		Log.info("User select provider for import blueprint");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@name='importEnvProvider_"+count+"']")));
		actions.click().build().perform();	
		sleepTime(5000);
		//*[@ng-model='envImport.importConfig.provider']/following::*[text()='Auto_AWS']
		//*[@ng-src='/images/aws/aws.png']/following::*[text()='"+envProvider+"']
		WebElement providerclick = driver.findElement(By.xpath("//*[@ng-model='envImport.importConfig.provider']/following::*[text()='"+envProvider+"']"));
		actions.moveToElement(providerclick);
		actions.click().build().perform();

	}
	public static void importConnectionProvider(WebDriver driver,String envConnection, String envProvider) throws Exception{

	Log.info("User select provider for import blueprint");
	if((driver.findElement(By.xpath("//*[@name='importEnvConnection']"))).equals(envConnection)){
		
		System.out.println("Connection already selected");
	}
	else{
	Select Connection =new Select(driver.findElement(By.xpath("//*[@name='importEnvConnection']")));
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
	Log.info("User select provider for import blueprint");
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//*[@name='importEnvProvider']")));
	actions.click().build().perform();									
	WebElement providerclick =driver.findElement(By.xpath("//*[@ng-src='/images/aws/aws.png']/following::*[text()='"+envProvider+"']"));
	actions.moveToElement(providerclick);
	actions.click().build().perform();
	
	}
	public static void importStartImportBtn(WebDriver driver,String envConnection, String envProvider,String envdName) throws Exception
	{
		Log.info("User click on start import button ");
		//method to select connection and provider 
		EnvironmentPageAction.importConnectionProvider(driver,envConnection,envProvider);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = (WebElement)wait.until(
		ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@ng-click='importEnv()']"))).get(0);
		EnvironmentPage.importImportButton.click();
		sleepTime(2000);
		String text = "Environment imported successfully.......";
		String text1 = "Environment with the same name already exists.";
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement element1 = (WebElement)wait1.until(
		ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);

		Actions action = new Actions(driver);
		action.moveToElement(element1);
		action.build().perform();
		
		String notificationMessage = element1.getText();
		
		if(notificationMessage.equals(text))
		{
			System.out.println(" "+notificationMessage);
			Assert.assertTrue( "Environment imported successfully.......".equals(notificationMessage));
			Log.info(notificationMessage);
			
		}	
		
		else if(notificationMessage.equals(text1))
		{
			System.out.println(" "+notificationMessage);
			Assert.assertTrue("Environment with the same name already exists.".equals(notificationMessage));
			Log.info(notificationMessage);
		}
				
	}

	public static void validateSuccessMessageForEnvUpdate(WebDriver driver) throws Exception
	{
		sleepTime(2000);
		String text = "Environment updated successfully.......";
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);

		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.build().perform();

		String notificationMessage = element.getText();

		Assert.assertTrue( text.equals(notificationMessage));
		Log.info(notificationMessage);

	}

	public static void validateErrorMessageForEnvUpdate(WebDriver driver) throws Exception
	{
		sleepTime(2000);
		String errorText = "Provider should be of type aws as environment currently have resources";
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);

		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.build().perform();

		String notificationMessage = element.getText();

		Log.info(notificationMessage);
		Assert.assertTrue( errorText.equals(notificationMessage));editCrossBtn(driver);

	}

	public static void validateInvisiblityOfProivder(WebDriver driver) throws Exception
	{
		try {
			WebElement element = EnvironmentPage.edit_environment_provider;
		}
		catch(Exception e) {
			Log.info(e.getMessage());
			Reporter.log(e.getMessage());
			Assert.assertTrue(e instanceof NoSuchElementException);
		}
	}

	private static void sleepTime(long mili){
		try {
			Thread.sleep(mili);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	


}
