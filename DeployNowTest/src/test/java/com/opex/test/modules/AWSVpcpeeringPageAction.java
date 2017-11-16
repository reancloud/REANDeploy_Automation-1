package com.opex.test.modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSVPCEndpointPageObject;
import com.opex.test.pageobjects.AWSVpcPeeringPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.AWSVpcPage;

public class AWSVpcpeeringPageAction extends SleepFunctionality {
	public static void enterPeerOwnerId(WebDriver driver,String peerOwnerId) throws Exception{
		Log.info("Enter peer owner id");
		//sleepTime();
		AWSVpcPeeringPageObject.peerOwnerId.sendKeys(peerOwnerId);
		Reporter.log("Service name is performed");
	}
	
	public static void enterPeerVpcID(WebDriver driver,String peerVpcId) throws Exception{
		Log.info("Enter peer vpc id");
		AWSVpcPeeringPageObject.peerVPCId.sendKeys(peerVpcId);
		Reporter.log("Service name is performed");
	}
	
	public static void enterVpcID(WebDriver driver,String vpcId) throws Exception{
		Log.info("Enter vpc id for vpc peering");
		AWSVpcPeeringPageObject.vpcPeering_vpcId.sendKeys(vpcId);
		Reporter.log("Service name is performed");
	}
	
	public static void enterAcceptor(WebDriver driver,String acceptor) throws Exception{
		Log.info("Enter acceptor for vpc peering");
		CommonFunctionalityPageAction.setJsonCommon(driver,acceptor,AWSVpcPeeringPageObject.setJsonAcceptor, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("Service name is performed");
	}
	
	public static void enterAutoAccept(WebDriver driver,String autoAccept) throws Exception{
		Log.info("Enter autoAccept for vpc peering");
		Actions actions = new Actions(driver);
		actions.moveToElement(AWSVpcPeeringPageObject.autoAccept);
		actions.click();		
		actions.sendKeys(Keys.CONTROL + "a");
		actions.sendKeys(Keys.CONTROL + "x");
		actions.sendKeys(Keys.BACK_SPACE);
		actions.sendKeys(autoAccept);
		actions.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
		//sleepTime();
		Reporter.log("Service name is performed");
	}
	
	public static void enterRequestor(WebDriver driver,String requestor) throws Exception{
		Log.info("Enter requestor for vpc peering");
		CommonFunctionalityPageAction.setJsonCommon(driver,requestor,AWSVpcPeeringPageObject.setJsonRequestor, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("Service name is performed");
	}
	
	public static void enterTag(WebDriver driver,String tag) throws Exception{
		Log.info("Enter Tag for vpc peering");
		CommonFunctionalityPageAction.setJsonCommon(driver,tag,AWSVpcPeeringPageObject.setJsonTags, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
		Reporter.log("Service name is performed");
	}

}
