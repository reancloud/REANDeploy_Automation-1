package com.opex.test.modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;




public class AWSSubnetPageAction extends SleepFunctionality{

	//User selects subnet resource and drags to the environment
	public static void ResourceSelectsubnet(WebDriver driver) throws Exception
	{
		Log.info("Select Subnet resource drag and drop on canvas resource  ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSSubnetPageObject.resource_subnet);
		Reporter.log("Resource drag to the canvas successfully");
	}

    //Enter all the attribute values
	public static void ResourcePassvariable(WebDriver driver,String cidr_block,String vpc_id,String dependson,String connection,String avaibilty_zone) {

		Log.info("I pass all attributes values under resource");
		AWSSubnetPageObject.resource_cidrblock.sendKeys(cidr_block);
		AWSSubnetPageObject.resource_vpcid.sendKeys(vpc_id);
		AWSSubnetPageObject.resource_dependson.sendKeys(dependson);
		Select Connection =new Select(AWSSubnetPageObject.resource_connection);
		for(int i=0;i< Connection.getOptions().size();i++)
		{
			String myConnection = Connection.getOptions().get(i).getText();
			if(myConnection.equalsIgnoreCase(connection))
			{
				Connection.selectByVisibleText(connection);
				break;
			}
		}
		sleepTime(2000);
		AWSSubnetPageObject.resource_availability_zone.sendKeys(avaibilty_zone);
		sleepTime(2000);
		Reporter.log("Sign out is performed");    
	}
	//Enter all the attribute values
	public static void ResourcePassvariable(WebDriver driver,String cidr_block,String vpc_id,String dependson,String connection,String avaibilty_zone,String map_ip) {

		Log.info("I pass all attributes values under resource");
		AWSSubnetPageObject.resource_cidrblock.sendKeys(cidr_block);
		AWSSubnetPageObject.resource_vpcid.sendKeys(vpc_id);
		AWSSubnetPageObject.resource_dependson.sendKeys(dependson);
		sleepTime(2000);
		Select Connection =new Select(AWSSubnetPageObject.resource_connection);
		for(int i=0;i< Connection.getOptions().size();i++)
		{
			String myConnection = Connection.getOptions().get(i).getText();
			if(myConnection.equalsIgnoreCase(connection))
			{
				Connection.selectByVisibleText(connection);
				break;
			}
		}

		AWSSubnetPageObject.resource_availability_zone.sendKeys(avaibilty_zone);
		Actions action=new Actions(driver);
		action.moveToElement(AWSSubnetPageObject.resource_maplist_click);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(map_ip);
		action.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
		sleepTime(2000);
		Reporter.log("Sign out is performed");    
	}


}




