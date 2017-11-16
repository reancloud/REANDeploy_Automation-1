package com.opex.test.modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSVPCDHCPPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSVPCDHCPPageAction extends SleepFunctionality{
	
public static void dragdropVPCDHCP(WebDriver driver) throws Exception{
		
		Log.info("Select VPC DHCP resource drag and drop on canvas resource  ");
		CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVPCDHCPPageObject.resource_VPCDHCP);
		Reporter.log("VPC DHCP resource drag and drop on canvas resource ");		
	}
public static void Resourcedomain_name_server(WebDriver driver,String domainname_server) throws Exception{
	
	Log.info("I enter the VPCDHCP resource name in the popup");
	CommonFunctionalityPageAction.setArrayCommon(driver, domainname_server, AWSVPCDHCPPageObject.R_VPCDHCP_dnameclick, CommonFunctionalityPage.select_text_area_for_propagation, CommonFunctionalityPage.array_set_value);

	Reporter.log("Sign out is performed");	
}
public static void Resourcedomain_name(WebDriver driver,String domainname) throws Exception{
	Log.info("Enter VPCDHCP Name ");
	Actions action=new Actions(driver);
	action.moveToElement(AWSVPCDHCPPageObject.R_VPCDHCP_domainname);
	action.click();
	sleepTime(2000);
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys(domainname);
	action.build().perform();
	sleepTime(2000);
	Reporter.log("Route53_Record is performed");
}
public static void netbiosNameServers(WebDriver driver,String netbios_nameservers) throws Exception{
	Log.info("User enter netbios name servers");
	CommonFunctionalityPageAction.setArrayCommon(driver, netbios_nameservers, AWSVPCDHCPPageObject.VPCDHCP_netbios_name_servers_click, CommonFunctionalityPage.select_text_area_for_propagation, CommonFunctionalityPage.array_set_value);
	Reporter.log("netbios name servers performed successfully");		
}
public static void netbiosNodeType(WebDriver driver,String netbios_nodetype) throws Exception{
	Log.info("Select netbios node type");
	Actions act = new Actions(driver);	
	act.moveToElement(AWSVPCDHCPPageObject.VPCDHCP_netbios_type);
	act.click();
	sleepTime(2000);
	act.sendKeys(Keys.CONTROL + "a");
	act.sendKeys(Keys.CONTROL + "x");
	act.sendKeys(Keys.BACK_SPACE);
	act.sendKeys(netbios_nodetype);
	act.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
	Reporter.log("netbios node type is performed");
}
public static void ntpServers(WebDriver driver,String ntp_servers) throws Exception{
	Log.info("User enter netbios name servers");
	CommonFunctionalityPageAction.setArrayCommon(driver, ntp_servers, AWSVPCDHCPPageObject.VPCDHCP_ntp_servers, CommonFunctionalityPage.select_text_area_for_propagation, CommonFunctionalityPage.array_set_value);
	Reporter.log("netbios name servers performed successfully");		
}
public static void tags(WebDriver driver,String tags) throws Exception{
	Log.info("User enter tags");
	CommonFunctionalityPageAction.setJsonCommon(driver, tags, AWSVPCDHCPPageObject.VPCDHCP_tags, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
	Reporter.log("tags performed successfully");		
}


}
