package com.opex.test.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.AWSRDSPageObject;
import com.opex.test.pageobjects.AWSS3BucketPage;

public class AWSRDSPageAction extends SleepFunctionality{

	public static void clickRDSResourceAndDrop(WebDriver driver) throws Exception{
		Log.info("Select S3 bucket resource drag and drop on canvas resource  ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSRDSPageObject.resource_Rds);
		Reporter.log("Sign out is performed");
	}


	public static void resourceCrossBtnDontDelete(WebDriver driver) throws InterruptedException{
		Log.info("Click on cross button on resource");
		Actions action = new Actions(driver);
		action.moveToElement(AWSRDSPageObject.hoverOnResRDS,2,3).build().perform();
		sleepTime();
		AWSRDSPageObject.crossBtnResRDs.click();
		sleepTime();
		CommonFunctionalityPage.resource_dont_delete_btn_attribute.click();
		sleepTime();
		Reporter.log("Sign out is performed");  
	}

	public static void resourceCrossBtnPleaseDelete(WebDriver driver) throws InterruptedException{
		Log.info("Click on cross button on resource");
		Actions action = new Actions(driver);
		action.moveToElement(AWSRDSPageObject.hoverOnResRDS,2,2).build().perform();
		sleepTime();
		AWSRDSPageObject.crossBtnResRDs.click();
		sleepTime();
		CommonFunctionalityPage.resource_delete_btn_attribute.click();
		sleepTime();
		Reporter.log("Sign out is performed");  
	}

	public static void editResourceNameRSB(WebDriver driver) throws Exception{
		Log.info("Edit rousouce name on resource name popup");
		CommonFunctionalityPageAction.resourceNameEditTextBox(driver, "test-rds");
		sleepTime();
		Reporter.log("Sign out is performed");
	}

	public static void rdsAllocatedStorage1(WebDriver driver,String alstorage){
		Log.info("I enter the attribute allocated resource");
		/*R_RDS_SSH_AWSPage.rds_AllocatedStorage.sendKeys(alstorage);
		sleepTime();*/
		Actions action=new Actions(driver);
		action.moveToElement((AWSRDSPageObject.rds_AllocatedStorage));
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(alstorage);
		action.click().build().perform();
		Reporter.log("Sign out is performed");
	}

	public static void rdsEngine(WebDriver driver,String engine){
		Log.info("I select the RDS attribute engine");
		Actions action=new Actions(driver);
		action.moveToElement((AWSRDSPageObject.rds_engine1));
		action.click();
		//sleepTime();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(engine);
		action.click().build().perform();
		Reporter.log("Sign out is performed");	
	}
	public static void rdsAvailibilityZone(WebDriver driver,String availibilityzone){
		Log.info("I select the RDS attribute Availibility zone");
		Actions action=new Actions(driver);
		action.moveToElement((AWSRDSPageObject.rds_availability_zone));
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");	
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(availibilityzone);
		action.click().build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void rdsBackup_window(WebDriver driver,String backup_window){
		Log.info("I select the RDS attribute Backup window");
		Actions action=new Actions(driver);
		action.moveToElement((AWSRDSPageObject.rds_backup_window));
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");	
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(backup_window);
		action.click().build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void rdsCopy_tag_snapshot(WebDriver driver,String copy_tag_snapshot){
		Log.info("I select the RDS attribute Copy tag snapshot");
		Actions action=new Actions(driver);
		action.moveToElement((AWSRDSPageObject.rds_copy_tag_snapshot));
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");	
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(copy_tag_snapshot);
		action.click().build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void rdsDb_subnetgroup_name(WebDriver driver,String db_subnetgroup_name){
		Log.info("I select the RDS attribute subnetgroup name");
		Actions action=new Actions(driver);
		action.moveToElement((AWSRDSPageObject.rds_db_subnetgroup_name));
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");	
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(db_subnetgroup_name);
		action.click().build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void rdsFinal_snapshot_identifier(WebDriver driver,String final_snapshot){
		Log.info("I select the RDS attribute final snapshot identifier");
		Actions action=new Actions(driver);
		action.moveToElement((AWSRDSPageObject.rds_final_snapshot_identifier));
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");	
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(final_snapshot);
		action.click().build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void rdsIops(WebDriver driver,String iops){
		Log.info("I select the RDS attribute iops");
		Actions action=new Actions(driver);
		action.moveToElement((AWSRDSPageObject.rds_iops));
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");	
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(iops);
		action.click().build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void rdsLicense_model_(WebDriver driver,String License_model){
		Log.info("I select the RDS attribute engine");
		Actions action=new Actions(driver);
		action.moveToElement((AWSRDSPageObject.rds_licence_model));
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");	
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(License_model);
		action.click().build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void rdsParameter_group_name(WebDriver driver,String Parameter_group_name){
		Log.info("I select the RDS attribute parameter group name");
		Actions action=new Actions(driver);
		action.moveToElement((AWSRDSPageObject.rds_parameter_group_name));
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");	
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(Parameter_group_name);
		action.click().build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void rdsVPCsecuritygroup_ids(WebDriver driver,String vpc_securitygroup_id) throws Exception{
		Log.info("I select the RDS attribute VPC security group ids");
		CommonFunctionalityPageAction.setArrayCommon(driver, vpc_securitygroup_id, AWSRDSPageObject.rds_vpc_security_group_ids, CommonFunctionalityPage.select_text_area_for_propagation, CommonFunctionalityPage.array_set_value);
		Reporter.log("Sign out is performed");		
	}
	public static void rdsSecuritygroup_name(WebDriver driver,String securitygroup_name) throws Exception{
		Log.info("I select the RDS attribute security group name");
		CommonFunctionalityPageAction.setArrayCommon(driver, securitygroup_name, AWSRDSPageObject.rds_vpc_security_group_name, CommonFunctionalityPage.select_text_area_for_propagation, CommonFunctionalityPage.array_set_value);
		Reporter.log("Sign out is performed");	
	}
	public static void rdsIdentifier(WebDriver driver,String identifier){
		Log.info("I enter the RDS attribute identifier");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRDSPageObject.rds_identifier);
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(identifier);
		action.click().build().perform();
		Reporter.log("Sign out is performed");
	}

	public static void rdsInstanceClass(WebDriver driver,String Instanceclass){
		Log.info("I select the RDS attribute instance class");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRDSPageObject.rds_instance_class1);
		action.click();
		//sleepTime();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(Instanceclass);
		action.click().build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");	
	}

	public static void rdsname1(WebDriver driver, String name){
		Log.info("I enter the RDS attribute name");
		AWSRDSPageObject.rds_name.clear();
		AWSRDSPageObject.rds_name.sendKeys(name);
		sleepTime();
		Reporter.log("Sign out is performed");
	}

	public static void rdsEngineVersion(WebDriver driver,String engineversion){
		Log.info("I enter the RDS attribute engine version");
		AWSRDSPageObject.rds_engine_version.click();
		//sleepTime();
		AWSRDSPageObject.rds_engine_version.sendKeys(Keys.CONTROL + "a");
		AWSRDSPageObject.rds_engine_version.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		AWSRDSPageObject.rds_engine_version.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		AWSRDSPageObject.rds_engine_version.sendKeys(engineversion);
		//sleepTime();
		Reporter.log("Sign out is performed");
	}

	public static void rdsMultipleAz(WebDriver driver,String multipleAz){
		Log.info("I select the RDS attribute MultipleAz");
		sleepTime();
		/*R_RDS_SSH_AWSPage.rds_multi_az1.clear();
		Actions act = new Actions(driver);	
		act.moveToElement(R_RDS_SSH_AWSPage.rds_multi_az1);
		act.click(R_RDS_SSH_AWSPage.rds_multi_az1).doubleClick().build().perform();
		sleepTime();
		WebElement element =driver.findElement(By.xpath("//*[contains(text(),'"+multipleAz+"')]"));
		act.moveToElement(element).sendKeys(multipleAz);
		act.click().build().perform();
		sleepTime();
		Reporter.log("Sign out is performed");*/
		
		AWSRDSPageObject.rds_multi_az1.clear();
		Actions act = new Actions(driver);		
		WebElement element =driver.findElement(By.xpath("//*[contains(text(),'"+multipleAz+"')]"));
		act.moveToElement(element).sendKeys(multipleAz);
		act.click().build().perform();
	}

	public static void rdsPassword1(WebDriver driver,String pass){
		Log.info("I enter the RDS attribute password ");
		//sleepTime();
		AWSRDSPageObject.rds_password.click();
		//sleepTime();
		AWSRDSPageObject.rds_password.sendKeys(Keys.CONTROL + "a");
		AWSRDSPageObject.rds_password.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		AWSRDSPageObject.rds_password.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		AWSRDSPageObject.rds_password.sendKeys(pass);
		//sleepTime();
		Reporter.log("Sign out is performed");
	}

	public static void rdsPort(WebDriver driver,String port){
		Log.info("I enter port");
		
		AWSRDSPageObject.rds_port.click();
		//sleepTime();
		AWSRDSPageObject.rds_port.sendKeys(Keys.CONTROL + "a");
		//sleepTime();
		AWSRDSPageObject.rds_port.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		AWSRDSPageObject.rds_port.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		AWSRDSPageObject.rds_port.sendKeys(port);
		//sleepTime();
		Reporter.log("Sign out is performed");
	}

	public static void rdsPubliclyAccessible(WebDriver driver,String publiclyaccessible){
		Log.info("I select the RDS attribute publicly accessible");
		AWSRDSPageObject.rds_publicly_accessible.clear();
		Actions act = new Actions(driver);		
		WebElement element =driver.findElement(By.xpath("//*[contains(text(),'"+publiclyaccessible+"')]"));
		act.moveToElement(element).sendKeys(publiclyaccessible);
		act.click().build().perform();
		
		/*R_RDS_SSH_AWSPage.rds_publicly_accessible.clear();
		Actions act = new Actions(driver);	
		act.moveToElement(R_RDS_SSH_AWSPage.rds_publicly_accessible);
		act.click(R_RDS_SSH_AWSPage.rds_publicly_accessible).doubleClick().build().perform();
		//sleepTime();
		WebElement element =driver.findElement(By.xpath("//*[contains(text(),'"+publiclyaccessible+"')]"));
		act.moveToElement(element).sendKeys(publiclyaccessible);
		act.click().build().perform();
		sleepTime();*/
		Reporter.log("Sign out is performed");
	}

	public static void rdsSkipFinalSnapshot(WebDriver driver,String skipfinal){
		Log.info("I select the RDS attribute skip final snapshot");
		/*R_RDS_SSH_AWSPage.rds_skip_final_snapshot.clear();
		Actions act = new Actions(driver);	
		act.moveToElement(R_RDS_SSH_AWSPage.rds_skip_final_snapshot);
		//act.click(R_RDS_SSH_AWSPage.rds_skip_final_snapshot).doubleClick().build().perform();
		sleepTime();
		WebElement element =driver.findElement(By.xpath("//*[contains(text(),'"+skipfinal+"')]"));
		act.moveToElement(element).sendKeys(skipfinal);
		act.click().build().perform();
		sleepTime();
		Reporter.log("Sign out is performed");*/
		
		AWSRDSPageObject.rds_skip_final_snapshot.clear();
		Actions act = new Actions(driver);		
		WebElement element =driver.findElement(By.xpath("//*[contains(text(),'"+skipfinal+"')]"));
		act.moveToElement(element).sendKeys(skipfinal);
		act.click().build().perform();
	}

	public static void rdsStorageType(WebDriver driver,String storagetype){
		Log.info("I select the RDS attribute storage type");
		/*R_RDS_SSH_AWSPage.rds_storage_type1.clear();
		Actions act = new Actions(driver);	
		act.moveToElement(R_RDS_SSH_AWSPage.rds_storage_type1);
		act.click(R_RDS_SSH_AWSPage.rds_storage_type1).doubleClick().build().perform();
		sleepTime();
		WebElement element =driver.findElement(By.xpath("//*[contains(text(),'"+storagetype+"')]"));
		act.moveToElement(element).sendKeys(storagetype);
		act.click().build().perform();
		sleepTime();
		Reporter.log("Sign out is performed");*/
		AWSRDSPageObject.rds_storage_type1.clear();
		Actions act = new Actions(driver);		
		WebElement element =driver.findElement(By.xpath("//*[contains(text(),'"+storagetype+"')]"));
		act.moveToElement(element).sendKeys(storagetype);
		act.click().build().perform();
	}

	public static void rdsUsername1(WebDriver driver, String uName){
		Log.info("Enter user name.");
		Actions action=new Actions(driver);
		action.moveToElement(AWSRDSPageObject.rds_username);
		action.click();
		sleepTime();
		action.sendKeys(Keys.CONTROL + "a");
		//sleepTime();
		action.sendKeys(Keys.CONTROL + "x");
		//sleepTime();
		action.sendKeys(Keys.BACK_SPACE);
		//sleepTime();
		action.sendKeys(uName);
		action.click().build().perform();
		//sleepTime();
		Reporter.log("Sign out is performed");
	}

	public static void resourceDetailsAttributeSeachBarRSB(WebDriver driver) throws Exception{
		Log.info("Search bar resource detail attribute.");
		CommonFunctionalityPageAction.resourceDetailsAttributeSeachBar(driver,"port");
		//sleepTime();
		Reporter.log("Sign out is performed");
	}

	public static void rdsBlankValueRSBValidation(WebDriver driver){
		Log.info("I pass blank value");
		AWSRDSPageAction.rdsAllocatedStorage1(driver,"");
		AWSRDSPageAction.rdsname1(driver,"");
		AWSRDSPageAction.rdsPassword1(driver, "");
		AWSRDSPageAction.rdsUsername1(driver,"");
		Reporter.log("Sign out is performed");	
	}



}
