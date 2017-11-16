package com.opex.test.modules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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


public class CommonFunctionalityPageAction extends SleepFunctionality{
	/*private static int xOffSet=120;
	private static int yOffset=30;*/
	
	private static int xOffSet=125;
	private static int yOffset=30;
	private static int xIncrement=190;
	private static int yIncrement=30;

	
	//Method to drag and drop particular resource on the created environment
	public static void resourceDragDrop(WebDriver driver,WebElement rDragDrop) throws Exception{
		/*      xOffSet=xOffSet+25;
		yOffset=yOffset+25;
		if(xOffSet==520||xOffSet<=0||yOffset<=0||yOffset==430)
		{
			xOffSet=250;
			yOffset=150;
		}
		Log.info("Select resource drag and drop on canvas");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",rDragDrop);
		Actions actions = new Actions(driver);
		actions.moveToElement(rDragDrop);
		actions.click().build().perform();
		sleepTime(1000);
		actions.clickAndHold(rDragDrop).moveToElement(EnvironmentPage.canvas, xOffSet, yOffset).release(null).build().perform();
		sleepTime(1000);
		Reporter.log("Resource drag drop successfully");*/
		
		if(xOffSet>=950||xOffSet<=0||yOffset<=0||yOffset>=450)
		{
		xOffSet=xIncrement;
		yOffset=yIncrement;
		xIncrement=xIncrement+15;
		}
		Log.info("Select resource drag and drop on canvas");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",rDragDrop);
	    Actions actions = new Actions(driver);
		actions.moveToElement(rDragDrop);
		actions.click().build().perform();
		sleepTime(1000);
		actions.clickAndHold(rDragDrop).moveToElement(EnvironmentPage.canvas, xOffSet, yOffset).release(null).build().perform();
		sleepTime(1000);
		yOffset=yOffset+25;
		Reporter.log("Resource drag drop successfully");
		
	}
		  
	//Method to enter resource name
	public static void enterResourceName(WebDriver driver,String resourceName) {
		Log.info("User enter resource name");
		WebDriverWait wait = new WebDriverWait(driver, 300);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_name));
		CommonFunctionalityPage.resource_name.sendKeys(resourceName);
		Reporter.log("Resource name is entered");	
	}

	//use this carefully as not all resources support this.
	public static void clickResourceExists(WebDriver driver) {
		Log.info("User clicks checkbox that Resource already Exists on Provider!");
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_exists));
		CommonFunctionalityPage.resource_exists.click();;
		Reporter.log("Resource exists is checked");
	}

	//this will succeed the resource exists clicked, has to be used with clickResourceExists
	public static void enterExistingIdForResource(WebDriver driver, String existingId) {
		Log.info("User clicks checkbox that Resource already Exists on Provider!");
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_existing_id));
		CommonFunctionalityPage.resource_existing_id.sendKeys(existingId);
		Reporter.log("Resource existing id is entered");
	}

	public static void enterResourceNameblank(WebDriver driver,String resourceName) {
		Log.info("User enter resource name");
		WebDriverWait wait = new WebDriverWait(driver, 300);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_name));
		CommonFunctionalityPage.resource_name.sendKeys(" ");
		Reporter.log("Resource name is entered");	
	}
	//Method to click on create button when resource name is entered
	public static void resourceCreateBtn(WebDriver driver) throws InterruptedException{
		Log.info("User click on create button");
		CommonFunctionalityPage.resource_create_button.click();
		Thread.sleep(4000);
		String text = "New resource added successfully to environment";
		String text2="Resource name can not be empty";
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement ele = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.build().perform();
		String notificationMessage = ele.getText();
		//System.out.println(notificationMessage);
		if(notificationMessage.equals(text))
		{
			Assert.assertTrue( "New resource added successfully to environment".equals(notificationMessage));
			System.out.println(notificationMessage);
		}
		else if(notificationMessage.equals(text2)){
			Assert.assertTrue("Resource name can not be empty".equals(notificationMessage));
			System.out.println(notificationMessage);
		}
		else 
			if(!notificationMessage.isEmpty())
			{
				System.out.println(notificationMessage);
			}
			else
			{
				Assert.assertTrue(ele.isDisplayed());
			}
		Reporter.log("Create button clicked succeessfully");
		if(notificationMessage.equals("Import started!"))
			Reporter.log(notificationMessage);
	}
	
	//Method to click on close button on resource pop up
	public static void resourceNameCloseBtn(WebDriver driver) {
		Log.info("User click on close button on resource");

		CommonFunctionalityPage.close_btn_resource.click();
		sleepTime(1000);
		Reporter.log("Close button is clicked");	
	}
	
	//Method to click on cross button on resource pop up
	public static void resourceDragCrossBtn(WebDriver driver){
		Log.info("User click on cross button on resource");
		//sleepTime();
		CommonFunctionalityPage.resource_dragrnamecrossclose.click();
		sleepTime(1000);
		Reporter.log("Cross close button clicked successfully");  
	}
	
	//Method to click on close button on resource name edit pop up
	public static void resourceNameEditCloseBtn(WebDriver driver) {
		Log.info("User click on close button for resource name ");
		CommonFunctionalityPage.resource_name_close_btn.click();
		sleepTime(1000);
		Reporter.log("Close button clicked successfully");	
	}
	//Method to click on save button on resource name edit pop up 
	public static void resourceNameEditSaveBtn(WebDriver driver) {
		Log.info("User click on save button for resource name ");
		sleepTime(1000);
		CommonFunctionalityPage.resource_name_save_button.click();
		sleepTime(3000);
		Reporter.log("Save button clicked successfully");	
	}
	//Method to click on cross button on resource name edit pop up
	public static void resourceNameEditCrossBtn(WebDriver driver) {
		Log.info("User click on cross button for resource name ");
		//sleepTime();
		CommonFunctionalityPage.resource_name_cross_btn.click();
		sleepTime(1000);
		Reporter.log("Cross button is clicked");	
	}
	//Method to edit name on resource name edit pop up
	public static void resourceNameEditTextBox(WebDriver driver, String value) {
		Log.info("User click on edit resource name text box");
		CommonFunctionalityPage.resource_name_edit_textBox.clear();
		sleepTime(1000);
		CommonFunctionalityPage.resource_name_edit_textBox.sendKeys(value);
		sleepTime(1000);
		Reporter.log("Name edited successfully");	
	}
	
	//Method to click on save button on the dash board
	public static void saveResource(WebDriver driver) throws InterruptedException{
		Log.info("User save the resource");
		sleepTime(1000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_save_button));
		element.click();
		Thread.sleep(3000);
		String save_msg="Environment saved successfully....";
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		WebElement ele = wait1.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.build().perform();
		String notificationMessage = ele.getText();
		Assert.assertEquals(save_msg, notificationMessage);
		sleepTime();
	}
	//Method to click on deploy button on the dash board
	public static void deploy(WebDriver driver) throws InterruptedException{
		Log.info("Click on deploy button");
		sleepTime(2000);
		WebDriverWait wait = new WebDriverWait(driver, 180);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.deploy_button));
		element.click();
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		WebElement delement = (WebElement) wait
		.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@uib-popover='Destroy']"))).get(0);
		/*new WebDriverWait(driver, 300)
		.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@uib-popover='Destroy']//a"), "Destroy"));*/
		try{
			WebElement deploy=driver.findElement(By.xpath("//*[contains(text(),'Deployed')]"));
			if(deploy.isDisplayed())
			{
				Log.info("Environment deployed successfully");
			}
		}
		catch (Exception e) 
		{
			WebElement fail=driver.findElement(By.xpath("//*[contains(text(),'Failed')]"));
			if(fail.isDisplayed()) 
			{
				CommonFunctionalityPage.canvas.click();
				sleepTime();
				CommonFunctionalityPage.resource_logs_btn.click();
				sleepTime();
				Assert.fail("Deployment Failed");
			}
		}
	}
	
	public static void Redeploy_button(WebDriver driver) throws InterruptedException{
		Log.info("Click on Redeploy button");
		sleepTime(2000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.Redeploy_button));
		element.click();
		WebElement element1 = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.Continue_button));
		element1.click();
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		WebElement delement = (WebElement) wait
		.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@uib-popover='Destroy']"))).get(0);
		/*new WebDriverWait(driver, 300)
		.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@uib-popover='Destroy']//a"), "Destroy"));*/
		try{
			WebElement deploy=driver.findElement(By.xpath("//*[contains(text(),'Deployed')]"));
			if(deploy.isDisplayed())
			{
				Log.info("Environment deployed successfully");
			}
		}
		catch (Exception e) 
		{
			WebElement fail=driver.findElement(By.xpath("//*[@class='fa fa-thumbs-down fa-1']/following::*[contains(text(),'Failed')][1]"));
			if(fail.isDisplayed()) 
			{
				CommonFunctionalityPage.canvas.click();
				sleepTime();
				CommonFunctionalityPage.resource_logs_btn.click();
				sleepTime();
				Assert.fail("Deployment Failed");
			}
		}
	}

	//Method to click on deploy button on the dash board
	public static void deployFails(WebDriver driver) throws InterruptedException{
		Log.info("Click on deploy button");
		sleepTime(2000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.deploy_button));
		element.click();
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		WebElement delement = (WebElement) wait
		.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@uib-popover='Destroy']"))).get(0);

		try{
			WebElement deploy=driver.findElement(By.xpath("//*[contains(text(),'Failed')]"));
			if(deploy.isDisplayed())
			{
				Log.info("Environment failed!");
			}
		}
		catch (Exception e)
		{
			WebElement success=driver.findElement(By.xpath("//*[contains(text(),'Deployed')]"));
			if(success.isDisplayed())
			{
				Assert.fail("Deployment Successful!");
			}
		}
	}

	//Method to move to further steps if the deployment is fail 
	public static void deployfail(WebDriver driver) throws InterruptedException{
	Log.info("Click on deploy button & check status");
	sleepTime(2000);
	WebDriverWait wait = new WebDriverWait(driver, 180);
	WebElement element = wait.until(
	ExpectedConditions.visibilityOf(CommonFunctionalityPage.deploy_button));
	element.click();
	Thread.sleep(3000);
	WebDriverWait wait1 = new WebDriverWait(driver, 3);
	WebElement delement = (WebElement) wait
	.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@uib-popover='ReDeploy']"))).get(0);
	try{
		WebDriverWait wait2= new WebDriverWait(driver, 3);
		WebElement deploy = wait2.until(
		ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'Deployed')]"))).get(0);
		//WebElement deploy=driver.findElement(By.xpath("//*[contains(text(),'Deployed')]"));
		if(deploy.isDisplayed())
		{
			Log.info("Environment deployed successfully");
		}
	}
	catch (Exception e) 
	{
		WebDriverWait wait3 = new WebDriverWait(driver, 3);
		WebElement fail = wait3.until(
		ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'Failed')]"))).get(0);
		//WebElement fail=driver.findElement(By.xpath("//*[@class='fa fa-thumbs-down fa-1']/following::*[contains(text(),'Failed')][1]"));
		if(fail.isDisplayed()) 
		{
			Assert.assertTrue("Deployment status correct", true);	
			Log.info("Deployment status correct");
		}
	}
}

	//Method to click on re deploy button on the dash board
	public static void resourceRedeploybutton(WebDriver driver) throws Exception{
		Log.info(" User click on redeploy  button ");
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(CommonFunctionalityPage.deploy_button));
		element.click();
		Thread.sleep(3000);
		new WebDriverWait(driver, 300)
		.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@ng-click='destroyEnv()']"), "Destroy"));
		Reporter.log("Redeploy button clicked successfully");    
	}
	//Method to click on logs button on the dash board
	public static void resourceLogsButton(WebDriver driver){
		Log.info("User click on resource logs button");
		sleepTime(5000);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement ele = wait1.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@uib-popover='View Logs']"))).get(0);
		CommonFunctionalityPage.resource_logs_btn.click();
		Reporter.log("Resource log button clicked successfully");	
	}
	//Method to click on log refresh button on the logs section
	public static void resourceLogRefreshButton(WebDriver driver){
		Log.info("User click on resource logs button");
		sleepTime(1000);
		CommonFunctionalityPage.resource_log_refresh_btn.click();
		sleepTime(1000);
		Reporter.log("Resource refresh log button clicked successfully");	
	}
	//Method to click on log close button on the logs section
	public static void resourceLogCloseButton(WebDriver driver){
		Log.info("User  click on resource logs close button");
		sleepTime(1000);
		CommonFunctionalityPage.resource_log_close_btn.click();
		System.out.println("clicked on close button");
		sleepTime(1000);
		Reporter.log("Resource close log button clicked successfully");	
	}
	
	//Method to click on log cross button on the logs section
	public static void resourceLogCrossButton(WebDriver driver){
		Log.info("User click on resource logs cross close button");
		sleepTime(1000);
		CommonFunctionalityPage.resource_log_cross_btn.click();
		sleepTime(1000);
		Reporter.log("Resource cross close log button clicked successfully");	
	}
	
	//Method to click on destroy button on the dashboard
	public static void resourceDestroyButton(WebDriver driver){
		Log.info("User click on resource destroy button");
		sleepTime(2000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element= wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_destroy_btn));
		Log.info("User click on resource destroy button1");
		CommonFunctionalityPage.resource_destroy_btn.click();
		Log.info("User click on resource destroy button2");
        Reporter.log("destroy button clicked successfully");	
	}
	//Method to click on Yes destroy button on the destroy pop up
	public static void resourceYesDestroyButton(WebDriver driver) throws InterruptedException{
		Log.info("User enter YES in textbox");
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_destroy_textbox));
		element.sendKeys("YES");
		sleepTime(1000);
		CommonFunctionalityPage.resource_destroy_submit.click();
	    WebDriverWait w = new WebDriverWait(driver, 150);
		WebElement el = w.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.deploy_button));
	}
	//Method to click on don't destroy button on the destroy pop up
	public static void resourceDontDestroyButton(WebDriver driver) throws InterruptedException{
		Log.info("User click on resource logs button");
		//sleepTime();
		/*CommonFunctionalityPage.resource_dont_destroy_btn.click();
		sleepTime(1000);
		*/
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.resource_destroy_textbox));
		element.sendKeys("NO");
		sleepTime(1000);
		CommonFunctionalityPage.resource_destroy_submit.click();
		Reporter.log("dont destroy button clicked successfully");
	}
	//Method to click on stop button
	public static void resourceStopButton(WebDriver driver){
		Log.info("User click on resource stop button");
		CommonFunctionalityPage.resource_stop_btn.click();
		Reporter.log("stop button clicked successfully");	
	}
	//Method to click on yes stop button on stop pop up
	public static void resourceYesStopButton(WebDriver driver){
		Log.info("User click on resource yes stop button");
		sleepTime();
		CommonFunctionalityPage.resource_yes_stop_btn.click();
		//sleepTime();
		Reporter.log("yes stop button clicked successfully");	
	}
	//Method to click on don't stop button on stop pop up
	public static void resourceDontStopButton(WebDriver driver){
		Log.info("User click on resource dont stop button");
		sleepTime();
		CommonFunctionalityPage.resource_dont_stop_btn.click();
		sleepTime();
		//sleepTime();
		Reporter.log("Dont stop button clicked successfully");
	}
	
	//Method to click on force stop button
	public static void resourceForceStopButton(WebDriver driver){
		Log.info("User click on resource force stop button");
		sleepTime();
		CommonFunctionalityPage.resource_force_stop_btn.click();
		//sleepTime();
		//sleepTime();
		Reporter.log("Force stop button clicked successfully");	
	}
	//Method to click on yes force stop button on force stop pop up
	public static void resourceYesForceStopButton(WebDriver driver){
		Log.info("User click on resource yes force stop orce button");
		sleepTime();
		CommonFunctionalityPage.resource_yes_force_stop_btn.click();
		sleepTime();
		//sleepTime();
		Reporter.log("Yes force stop button clicked successfully");	
	}
	//Method to click on don't force stop button on force stop pop up
	public static void resourceDontForceStopButton(WebDriver driver){
		Log.info("User click on resource dont force stop button");
		sleepTime();
		CommonFunctionalityPage.resource_dont_force_stop_btn.click();
		sleepTime();
		//sleepTime();
		Reporter.log("Dont force stop button clicked successfully");
	}
	//Method to click on the resource link on the right side window
	public static void resourceAttributeLink(WebDriver driver){
		Log.info("User click on resource attribute link");
		//sleepTime();
		CommonFunctionalityPage.resource_resourcelink.click();
		sleepTime(1000);
		//sleepTime();
		Reporter.log("Resource attribute link clicked successfully");
	}
	
	//Method to click on the resource search bar on the right side window
	public static void resourceAttributeSearchBar(WebDriver driver,String value){
		Log.info("User search attribute under resource search box");
		//sleepTime();
		CommonFunctionalityPage.resource_search_for_attributes.sendKeys(value);
		sleepTime(1000);
		CommonFunctionalityPage.resource_search_for_attributes.clear();
		sleepTime(1000);
		Reporter.log("Search box is validated");
	}
	
	//Method to click on the resource details link on the right side window
	public static void resourceDetailsAttributeLink(WebDriver driver){
		Log.info("User click on resource deatils attribute link");
		//sleepTime();
		CommonFunctionalityPage.resource_rdetails_link.click();
		sleepTime(1000);
		//sleepTime();
		Reporter.log("resource deatils attribute link clicked successfully");
	}
	
	//Method to click on the resource details search bar on the right side window
	public static void resourceDetailsAttributeSeachBar(WebDriver driver,String value){
		Log.info("User search attribute under resource details search box");
		//sleepTime();
		CommonFunctionalityPage.resource_details_attribute_search_bar.sendKeys(value);
		sleepTime(1000);
		Reporter.log("Search box is validated");
	}
	
	//Method to click on canvas (used to close the right side window)
	public static void clickCanvas(WebDriver driver) {
		Log.info("User click on canvas");
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(CommonFunctionalityPage.canvas));
		CommonFunctionalityPage.canvas.click();
		sleepTime(1000);
		Reporter.log("Canvas clicked successfully");	
	}
	
	//Method to click on the resource name link on the right side window
	public static void resourceEditRnameclick(WebDriver driver) throws Exception{

		Log.info(" User click on resource name link");
		sleepTime(1000);
		CommonFunctionalityPage.resource_editrnamelink.click();
		sleepTime(2000);
		Reporter.log("resource name link clicked successfully");    
	}
	
	//Method to refresh the page 
	public static void refreshPage(WebDriver driver) throws Exception{
		Log.info(" User refresh the page");
		/*sleepTime();
		sleepTime();
		sleepTime();
		sleepTime();
		sleepTime();*/
		driver.navigate().refresh();
		//sleepTime();
		Reporter.log("resource name link clicked successfully"); 
	}
	
	//Method to enter value in depends-on attribute text box
	public static void enterDependsOnValue(WebDriver driver,String dependsOn) throws Exception{
		Log.info("Enter depends on Value");
		WebElement toClear = CommonFunctionalityPage.select_depends_on_value;
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		CommonFunctionalityPage.select_depends_on_value.sendKeys(dependsOn);
		sleepTime();
		Reporter.log("DependsOn is selected");
	}
	
	//Method to select connection attribute text box
	public static void selectConnection(WebDriver driver,String connectionName) throws Exception{
		Log.info("Select connection Value");
		//sleepTime();
		//CommonFunctionalityPage.resource_connectionclick.click();
		Select Connection =new Select(CommonFunctionalityPage.resource_connectiontxtbox);
		String connection= connectionName;
		for(int i=0;i< Connection.getOptions().size();i++)
		{
			String myConnection = Connection.getOptions().get(i).getText();
			if(myConnection.equalsIgnoreCase(connection))
			{
				Connection.selectByVisibleText(connection);
				break;
			}
		}
		sleepTime();
		Reporter.log("connection is selected");
	}
	
	//Method to click on package link on the dash board
	public static void clickonPackageLink(WebDriver driver){
		Log.info("Click action is performed on package link");
		sleepTime();
		sleepTime();
		CommonFunctionalityPage.package_link.click();
		Reporter.log("Package link is clicked");
	}
	
	//Method to click on the package link i=on right side window
	public static void clickonPackageLinkRighsidebar(WebDriver driver){
		Log.info("Click action is performed on package link");
		sleepTime();
		sleepTime();
		CommonFunctionalityPage.package_linkrightsidebar.click();
		Reporter.log("Package link is clicked");
	}
	
	//Method for common Set json attribute
	public static void setJsonCommon(WebDriver driver,Object json,WebElement setClick,WebElement popuptextArea , WebElement setValue) throws Exception
	{
		Log.info("Enter Json");
		
		String jsonString=json.toString();
		sleepTime(2000);
		setClick.click();
		sleepTime(2000);
		Actions action=new Actions(driver);
		action.moveToElement(popuptextArea);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		//sleepTime();
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		sleepTime(1000);
		action.sendKeys(jsonString);
		action.build().perform();
		sleepTime(5000);
		System.out.println("befor set value");
		setValue.click();
		System.out.println("after set value");
		Reporter.log("Json attribute is entered");
	}
	
	//Method for common Set array attribute
	public static void setArrayCommon(WebDriver driver,String arrayValue,WebElement setArray,WebElement selectTextArea, WebElement setValue) throws Exception{
		Log.info("Enter array Json");
		sleepTime(2000);
		setArray.click();
		sleepTime(2000);
		Actions action=new Actions(driver);
		action.moveToElement(selectTextArea);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(arrayValue);
		action.build().perform();
		sleepTime(5000);
		setValue.click();
		sleepTime(2000);
		Reporter.log("Array is entered");
	}
	
	//Method for common Set text  attribute
	public static void setText(WebDriver driver,String arrayValue,WebElement settext,WebElement selectTextArea, WebElement setValue) throws Exception{
		Log.info("Set Text");
		sleepTime(2000);
		settext.click();
		sleepTime(2000);
		Actions action=new Actions(driver);
		action.moveToElement(selectTextArea);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		//sleepTime();
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(arrayValue);
		action.build().perform();
		sleepTime(5000);
		setValue.click();
		sleepTime(2000);
		Reporter.log("Text is entered");
	}
	
	//Method to delete the resource and click on yes delete button
	public static void resource_pleasedelete(WebDriver driver,String Rname) throws InterruptedException{
		Log.info("Click on cross button on resource");
		WebElement element = driver.findElement(By.xpath("//*[@class='resourceNode-text']//*[contains(text(),'"+Rname+"')]//preceding::*[@class='scalable'][1]"));
		Actions action = new Actions(driver);
		action.moveToElement(element,2,2).build().perform();
		//sleepTime();
		WebElement crossbutton = driver.findElement(By.xpath("//*[text()='"+Rname+"']/following::*[text()='X']"));
		crossbutton.click();
		sleepTime(1000);
		CommonFunctionalityPage.resource_delete_btn_attribute.click();
		sleepTime(1000);
		Reporter.log("Please delete button is clicked");  
	}
	//Method to click on don't delete button on delete pop up of resource 
	public static void resourcecross_dntdelete(WebDriver driver,String Rname) throws InterruptedException{
		Log.info("Click on cross button on resource");
		WebElement element = driver.findElement(By.xpath("//*[@class='resourceNode-text']//*[contains(text(),'"+Rname+"')]//preceding::*[@class='scalable'][1]"));
		Actions action = new Actions(driver);
		action.moveToElement(element,2,2).build().perform();
		//sleepTime();
		WebElement crossbutton = driver.findElement(By.xpath("//*[text()='"+Rname+"']/following::*[text()='X']"));
		crossbutton.click();
		sleepTime(1000);
		CommonFunctionalityPage.resource_dont_delete_btn_attribute.click();
		sleepTime(1000);
		Reporter.log("Please delete button is clicked");  
		
}
	
	//Method to click on resource to open the side bar
	public static void clickOnResource(WebDriver driver,String Rname) throws Exception{
		Log.info("User click on resource");
		WebDriverWait wait = new WebDriverWait(driver,300);
		WebElement element =driver.findElement(By.xpath("//*[@class='resourceNode-text']//*[text()='"+Rname+"']"));
		//sleepTime(3000);
		//element.click();
		WebElement element1 = wait.until(
		ExpectedConditions.visibilityOf(element));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	    element.click();
		sleepTime(2000);
		Reporter.log("Click action on resource is performed");
		
	}
	
	public static void doubleRefreshPage(WebDriver driver) throws Exception{
		Thread.sleep(2000);
		driver.navigate().refresh();
		sleepTime();
	}
	
	
	public static void verifydeployment(WebDriver driver){
		Log.info("Verify Deployment Pass or Fail");
		try{
			WebElement deploy=driver.findElement(By.xpath("//*[contains(text(),'Deployed')]"));
			if(deploy.isDisplayed())
			{
				System.out.println("Environment deployed successfully");
			}
		}
		catch (Exception e) 
		{
			WebElement fail=driver.findElement(By.xpath("//*[@class='fa fa-thumbs-down fa-1']/following::*[contains(text(),'Failed')][1]"));
			if(fail.isDisplayed()) 
			{
				CommonFunctionalityPage.resource_logs_btn.click();
				sleepTime();
				sleepTime();
				//Assert.assertTrue(deploy.isEnabled());
				Assert.fail("Deployment Failed");
				sleepTime();
				Reporter.log("Deployment status(Pass/Fail) is checked");				}
		}
	}

	public static void verifyDeployStatusSuccess(WebDriver driver) {
		Log.info("Verify Deployment Success");
		try{
			WebElement deploy=driver.findElement(By.xpath("//*[contains(text(),'Deployed')]"));
			if(deploy.isDisplayed())
			{
				System.out.println("Environment deployed successfully");
			}
		}
		catch (Exception e)
		{
			Assert.fail("Deployment Failed");
		}
	}
	public static void verifyDeployStatusFailed(WebDriver driver) {
		Log.info("Verify Deployment Success");
		try{
			WebElement deploy=driver.findElement(By.xpath("//*[contains(text(),'Failed')]"));
			if(deploy.isDisplayed())
			{
				System.out.println("Environment Failed");
			}
		}
		catch (Exception e)
		{
			Assert.fail("Deployment in not in Failed state");
		}
	}
}
