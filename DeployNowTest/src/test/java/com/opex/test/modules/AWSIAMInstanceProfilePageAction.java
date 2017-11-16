package com.opex.test.modules;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSIAMInstanceProfilePage;
import com.opex.test.pageobjects.AWSIAMRolePage;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSIAMInstanceProfilePageAction extends SleepFunctionality{


	public static void enterRole(WebDriver driver,String arrayValue ) throws Exception{
		Log.info("Enter for for IAMInstance profile");
		CommonFunctionalityPageAction.setArrayCommon(driver, arrayValue,AWSIAMInstanceProfilePage.click_role_setArray ,CommonFunctionalityPage.select_text_area_for_propagation,CommonFunctionalityPage.array_set_value);
		Reporter.log("Role for IAMInstance Profile is entered");
	}
	

	public static void enterName(WebDriver driver, String name){
		Log.info("Enter name for IAMInstance profile");
		WebElement element =AWSIAMInstanceProfilePage.IMIP_enter_nameprefix;
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(Keys.DELETE);
		AWSIAMRolePage.iamRole_enter_path.sendKeys(name);
		//sleepTime();
		Reporter.log("Name for IAMInstance Profile is entered");
	}

	public static void enterNamePrifix(WebDriver driver, String namePrifix){
		Log.info("Enter name_prifix for IAMInstance profile");
		WebElement element =AWSIAMInstanceProfilePage.IMIP_enter_nameprefix;
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(Keys.DELETE);
		AWSIAMRolePage.iamRole_enter_path.sendKeys(namePrifix);
		//sleepTime();
		Reporter.log("Name_prifix for IAMInstance Profile is entered");
	}

	public static void enterPath(WebDriver driver, String path){
		Log.info("Enter path for IAMInstance profile");
		WebElement element =AWSIAMInstanceProfilePage.IMIP_enter_path;
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(Keys.DELETE);
		AWSIAMRolePage.iamRole_enter_path.sendKeys(path);
		//sleepTime();
		Reporter.log("Path for IAMInstance Profile is entered");
	}


	public static void deployfail(WebDriver driver) throws InterruptedException{
		Log.info("Click on deploy button & check status");
		sleepTime(2000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOf(AWSIAMInstanceProfilePage.deploy_button));
		element.click();
		Thread.sleep(3000);
		new WebDriverWait(driver, 300)
		.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@ng-click='destroyEnv()']"), "Destroy"));
}
}