package com.opex.test.modules;

import org.json.simple.parser.JSONParser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSExecutescriptpkgPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSKeyPairPageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSSecuritygroupPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;

public class AWSExecutescriptpkgPageAction extends SleepFunctionality{
	public static void enterInstanceName(WebDriver driver) throws Exception{

		Log.info("I enter the Instance resource name in the popup");
		CommonFunctionalityPageAction.enterResourceName(driver,"Automation-instance");
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void clickResourceInstance(WebDriver driver){

		Log.info("I click on added resource");
		sleepTime();
		AWSExecutescriptpkgPageObject.click_resource_instance.click();
		sleepTime();
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	public static void enterKeyPairName(WebDriver driver) throws Exception{

		Log.info("I enter the key pair resource name in the popup");
		CommonFunctionalityPageAction.enterResourceName(driver,"auto-keypair");
		sleepTime();
		Reporter.log("Sign out is performed");	
	}
	
	//Method to select connection attribute text box
		public static void selectConnection(WebDriver driver,String connectionName) throws Exception{
			Log.info("Select connection Value");
			//sleepTime();
			//CommonFunctionalityPage.resource_connectionclick.click();
			Select Connection =new Select(AWSExecutescriptpkgPageObject.resource_connectiontxtbox);
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
	public static void clickResourceKeyPair(WebDriver driver){

		Log.info("I click on added resource");
		sleepTime();
		AWSExecutescriptpkgPageObject.click_keyPair.click();
		
	}
	public static void clickResourceSecurityGroup(WebDriver driver){

		Log.info("I click on added resource");
		sleepTime();
		AWSExecutescriptpkgPageObject.click_securitygroup.click();
		
	}
	
public static void enterKey_Name(WebDriver driver){
		
		Log.info("I enter key name attribute of resource");
		sleepTime();
		AWSKeyPairPageObject.keyPair_KeyName.sendKeys("auto-keypair");
		Reporter.log("Sign out is performed");
		
	}
public static void enterPublic_Key(WebDriver driver){
	
	Log.info("I enter public key name attribute of resource");
	sleepTime();
	AWSKeyPairPageObject.keyPair_PublicKey.sendKeys("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCroadr+6FcrD4lJ44oMkk7ORhdWBzWHL8aWQ/nET30tRFGZayEYUosqwwJF5/Z7CZuXfWS+t99XnQIbZpF4+Cr3ONz4fK5Q5EKJqJVma3m0W4ZXZubjvu7/IwgzXCJiqfcb/0ZJlqB1XEuM3rMuAwAuPSKW4nb/KZwiyH3IATvem1hY+0H1BPMNkj42EYmtL0dBEMd8nbsdVtLWVdEtNYHZOT/DoAjeEoXfoh3OIYM/qneYlFi7g5bZSkr801WgeI8dlgbFqUrqc1bOrBNymUskrWHpdudEmh/Y22y6MQGnOtMhuP/rx/5FW5dGzZU13NGyeQifAJ+j+P4AZCT9VCL ubuntu@ip-10-16-1-83");		
	Reporter.log("Sign out is performed");
	
}
public static void Entersecurityname(WebDriver driver) throws Exception{
	
    Log.info("I enter the Securitygroup resource name in the popup");
    sleepTime();
	CommonFunctionalityPageAction.enterResourceName(driver,"auto-securitygroup");
    sleepTime();
    Reporter.log("Sign out is performed");	
}

public static void securityVpcIdForexecutescript(WebDriver driver) throws Exception{
	Log.info("Enter Securitygroup VPC id ");
	Actions action=new Actions(driver);
	action.moveToElement(AWSSecuritygroupPageObject.securitygroup_vpc_id);
	action.click();
	sleepTime(2000);
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys("vpc-bd12eedb");
	action.build().perform();
	Reporter.log("Securitygroup  VPC id is performed");
}
public static void enterSubnetIdForExecutescript(WebDriver driver) throws Exception{

	Log.info("User enter the Subnet id for Instance resource");
	Actions action=new Actions(driver);
	action.moveToElement(AWSInstancePageObject.instance_subnet_id);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	action.sendKeys(Keys.CONTROL + "x");
	action.sendKeys(Keys.BACK_SPACE);
	action.sendKeys("subnet-55c9c032");
	action.build().perform();
	sleepTime(2000);
	Reporter.log("Sign out is performed");	

}
public static void clickon_ingress(WebDriver driver) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn = parser.parse("[\r\n  {\r\n    \"from_port\": 0,\r\n    \"to_port\": 0,\r\n    \"protocol\": \"-1\",\r\n    \"cidr_blocks\": [\r\n      \"0.0.0.0/0\"\r\n    ]\r\n  }\r\n]");
	//String jsn ="[\r\n  {\r\n    \"from_port\": 22,\r\n    \"to_port\": 22,\r\n    \"protocol\": \"tcp\",\r\n    \"cidr_blocks\": [\r\n      \"183.82.110.76/32\"\r\n    ]\r\n  },\r\n  {\r\n    \"from_port\": 22,\r\n    \"to_port\": 22,\r\n    \"protocol\": \"tcp\",\r\n    \"cidr_blocks\": [\r\n      \"54.87.133.172/32\"\r\n    ]\r\n  }\r\n]";
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNetworkACLPageObject.resource_ingressclick, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
}
public static void clickon_egress(WebDriver driver) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn = parser.parse("[\r\n  {\r\n    \"from_port\": 0,\r\n    \"to_port\": 0,\r\n    \"protocol\": \"-1\",\r\n    \"cidr_blocks\": [\r\n      \"0.0.0.0/0\"\r\n    ]\r\n  }\r\n]");
	//String jsn ="[\r\n  {\r\n    \"from_port\": 0,\r\n    \"to_port\": 0,\r\n    \"protocol\": \"-1\",\r\n    \"cidr_blocks\": [\r\n      \"0.0.0.0/0\"\r\n    ]\r\n  }\r\n]";
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNetworkACLPageObject.resource_egressclick, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
}
public static void enter_Ami(WebDriver driver) throws Exception{
	
	Log.info("I enter the ami for Instance resource");
	sleepTime();
	AWSInstancePageObject.instance_resource_ami.click();
	AWSInstancePageObject.instance_resource_ami.clear();
	AWSInstancePageObject.instance_resource_ami.sendKeys("ami-30e65350");
	sleepTime();
	Reporter.log("Sign out is performed");	
	
}
public static void enterInstanceType(WebDriver driver) throws Exception{

	sleepTime();
	Actions actions = new Actions(driver);
	actions.moveToElement(AWSInstancePageObject.instance_resource_instance_type);
	actions.click(AWSInstancePageObject.instance_resource_instance_type).build().perform();
	actions.moveToElement(AWSInstancePageObject.instance_resource_instance_type_t2micro).click().build().perform();
	sleepTime();

	
}
public static void enterinstance_keyname(WebDriver driver) throws Exception{

	
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(AWSExecutescriptpkgPageObject.click_instance_key);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys("execute-scrpt");
	action.build().perform();
	sleepTime();
	

}
public static void enterVpcSecurityGroupIds(WebDriver driver) throws Exception{

	
	sleepTime();
	AWSInstancePageObject.instance_resource_vpc_security_group_id.click();
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(	AWSInstancePageObject.instance_resource_vpc_security_group_id_textArea);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys("${auto-securitygroup.id}");
	action.build().perform();
	sleepTime();
	AWSInstancePageObject.instance_resource_vpc_security_group_id_setValue_btn.click();
	sleepTime();
	sleepTime();

}
public static void executescriptDragDrop(WebDriver driver) throws Exception{

	Log.info("Select package drag and drop on instance resource");
	Actions actions = new Actions(driver);
	actions.moveToElement(AWSExecutescriptpkgPageObject.executescript_pkg);
	actions.click().build().perform();
	sleepTime();
	actions.dragAndDrop(AWSExecutescriptpkgPageObject.executescript_pkg,AWSExecutescriptpkgPageObject.click_resource_instance).build().perform();
	sleepTime();
	sleepTime();
	System.out.println("***Resource is draged to convas");
	Reporter.log("Sign out is performed");

}
public static void executescriptclick_setinline(WebDriver driver) throws Exception{
	
    Log.info("I enter the Route53_Record resource name in the popup");
    sleepTime();
    AWSExecutescriptpkgPageObject.executescript_pkg_link.click();
    sleepTime();
    AWSExecutescriptpkgPageObject.inlinelink_setarray.click();
    	sleepTime();
    	Actions action=new Actions(driver);
    	action.moveToElement(AWSExecutescriptpkgPageObject.inlinelink_textarea);
    	action.click();
    	action.sendKeys(Keys.CONTROL + "a");
    	sleepTime();
    	action.sendKeys(Keys.CONTROL + "x");
    	sleepTime();
    	action.sendKeys(Keys.BACK_SPACE);
    	sleepTime();
    	action.sendKeys("#!/bin/bash\r\necho \"hello world\"\r\nexit");
    	action.build().perform();
    	sleepTime();
    	CommonFunctionalityPage.array_set_value.click();
    	sleepTime();
    	
    Reporter.log("Sign out is performed");	
}
}