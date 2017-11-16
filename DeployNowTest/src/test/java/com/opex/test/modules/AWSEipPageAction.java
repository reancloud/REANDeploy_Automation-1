package com.opex.test.modules;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSEipPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSEipPageAction extends SleepFunctionality{

	
	public static void enterEIPAttributes(WebDriver driver,String dependsOnValue,String connectionName, String assPrivateIpValue,String instanceValue,String netInterfaceValue ,String vpcValue) throws Exception{
		Log.info("Enter attributes for Eip");
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver,dependsOnValue);
		//sleepTime();
		CommonFunctionalityPageAction.selectConnection(driver,connectionName);
		//sleepTime();
		AWSEipPage.enter_ass_private_ip.sendKeys(assPrivateIpValue);
		//sleepTime();
		AWSEipPage.enter_instance.sendKeys(instanceValue);
		//sleepTime();
		AWSEipPage.enter_network_interface.sendKeys(netInterfaceValue);
		//sleepTime();
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSEipPage.select_vpc_eip);
		actions.click();		
		actions.sendKeys(Keys.CONTROL + "a");
		actions.sendKeys(Keys.CONTROL + "x");
		actions.sendKeys(Keys.BACK_SPACE);
		actions.sendKeys(vpcValue);
		actions.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
		sleepTime();
		Reporter.log("Sign out is performed");
	}

}
