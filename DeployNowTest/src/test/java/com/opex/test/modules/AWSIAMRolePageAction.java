package com.opex.test.modules;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSIAMRolePage;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSIAMRolePageAction extends SleepFunctionality{

	public static void enterAssumeRolePolicy(WebDriver driver, String json) throws Exception{
		Log.info("Enter Assume Role Policy value");
		CommonFunctionalityPageAction.setText(driver, json, AWSIAMRolePage.iamRole_click_settext, CommonFunctionalityPage.select_text_area_for_settext, CommonFunctionalityPage.setvalue_for_settext);
		Reporter.log("Assume Role Policy  attribute is entered");
	}

	public static void enterNamePrefixIamRole(WebDriver driver, String name_prefix) throws Exception{
		Log.info("Enter name prefix for iam role");
		WebElement element = AWSIAMRolePage.iamRole_enter_nameprefix;
		element.sendKeys(Keys.CONTROL + "a");
	    element.sendKeys(Keys.DELETE);
		AWSIAMRolePage.iamRole_enter_nameprefix.sendKeys(name_prefix);
		//sleepTime();
		Reporter.log("Prefix for IAMRole is entered");				
	}
	
public static void enterNameAttributeIamRole(WebDriver driver, String name) throws Exception{
		Log.info("Enter name attribute for iam role");
		WebElement element = AWSIAMRolePage.iamRole_enter_name;
		element.sendKeys(Keys.CONTROL + "a");
	    element.sendKeys(Keys.DELETE);
		AWSIAMRolePage.iamRole_enter_name.sendKeys(name);
		//sleepTime();
		Reporter.log("Name for IAMRole is entered");				
	}
	
	public static void enterPathIamrole(WebDriver driver, String path) throws Exception{
		Log.info("Enter path for iam role");
		WebElement element = AWSIAMRolePage.iamRole_enter_path;
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(Keys.DELETE);
		AWSIAMRolePage.iamRole_enter_path.sendKeys(path);
		//sleepTime();
		Reporter.log("Path for IAMRole is entered");				
	}

}
