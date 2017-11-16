package com.opex.test.modules;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSS3BucketPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AwsS3BucketPageAction  extends SleepFunctionality{

	public static void enterBucketName(WebDriver driver,String bucket) throws Exception{
		Log.info("Enter bucket name");
		sleepTime();
		AWSS3BucketPage.enter_bucket_name.clear();
		AWSS3BucketPage.enter_bucket_name.sendKeys(bucket);
		Reporter.log("Bucket is entered for S3bucket");
	}

	public static void selectAclValueRSB(WebDriver driver,String acl) throws Exception{
		Log.info("Select Acl value");
		AWSS3BucketPage.select_acl_value.clear();
		Actions act = new Actions(driver);	
		WebElement element =driver.findElement(By.xpath("//md-autocomplete-parent-scope//span[text()='"+acl+"']"));
		act.moveToElement(element).sendKeys(acl);
		act.click().build().perform();
		Reporter.log("Acl is selected from dropdown");
	}

	public static void setCorsRulesRSB(WebDriver driver,String corerule) throws Exception{	
		Log.info("Enter cors Rules ");
		CommonFunctionalityPageAction.setJsonCommon(driver,corerule, AWSS3BucketPage.set_cors_rules,CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("Cors Rules is entered");
	}

	public static void selectForceDestroyRSB(WebDriver driver,String forcedestroy) throws Exception{
		Log.info("Enter force destroy value");
		AWSS3BucketPage.select_force_destroy.clear();
		//sleepTime();
		Actions act = new Actions(driver);	
		WebElement element =driver.findElement(By.xpath("//*[text()='"+forcedestroy+"']"));
		act.moveToElement(element).sendKeys(forcedestroy);
		act.click().build().perform();
		Reporter.log("force destroy value is selected from drop down");
	}

	public static void setLifeCycleRuleRSB(WebDriver driver,String lifecyclerule) throws Exception{
		Log.info("Set life cycle rules");
		JSONObject json = (JSONObject)new JSONParser().parse(lifecyclerule);
		String jsonString=json.toString();
		System.out.println("JsonString >> "+jsonString);
		Actions act = new Actions(driver);	
		act.moveToElement(AWSS3BucketPage.set_lifecycle_rule).click().build().perform();
		act.sendKeys(Keys.CONTROL + "a");
		act.sendKeys(Keys.CONTROL + "x");
		act.sendKeys(Keys.BACK_SPACE);
		sleepTime();
		act.moveToElement(AWSS3BucketPage.set_lifecycle_rule1);
		act.sendKeys(AWSS3BucketPage.set_lifecycle_rule1, jsonString).build().perform();
		act.moveToElement(AWSS3BucketPage.set_value).click().build().perform();
		Reporter.log("life cycle rules is entered");
	}

	public static void setPolicyRSB(WebDriver driver,String policy) throws Exception{
		Log.info("Set Policy for S3bucket");
		JSONObject json = (JSONObject)new JSONParser().parse(policy);
		String jsonString=json.toString();
		System.out.println("JsonString >> "+jsonString);	
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSS3BucketPage.set_policy);
		actions.click().perform();
		sleepTime();
		actions.moveToElement(AWSS3BucketPage.set_policy1).sendKeys(jsonString);
		actions.click().build().perform();
		actions.moveToElement(AWSS3BucketPage.set_policy2).click().build().perform();
		Reporter.log("Policy for S3bucket is entered");

	}

	public static void setTagsRSB(WebDriver driver,String tag) throws Exception{
		Log.info("Set Tag for S3bucket");
		CommonFunctionalityPageAction.setJsonCommon(driver,tag,AWSS3BucketPage.set_tag,AWSS3BucketPage.set_policy1, CommonFunctionalityPage.json_set_value);
		Reporter.log("Tag for S3bucket is entered");
	}

}


