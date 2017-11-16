package com.opex.test.modules;


import org.json.simple.parser.JSONParser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;


public class AWSInstancePageAction extends SleepFunctionality{



	public static void selectInstance(WebDriver driver) throws Exception{

		Log.info("User drag and drop instance on dashboard");
		CommonFunctionalityPageAction.resourceDragDrop(driver, AWSInstancePageObject.instance_resource);
		Reporter.log("Sign out is performed");

	}

	public static void enterAmi(WebDriver driver, String ami) throws Exception{

		Log.info("User enter the ami for Instance resource");
		AWSInstancePageObject.instance_resource_ami.click();
		AWSInstancePageObject.instance_resource_ami.clear();
		AWSInstancePageObject.instance_resource_ami.sendKeys(ami);
		Reporter.log("Sign out is performed");	

	}
	
	public static void enterAmifalse(WebDriver driver, String ami) throws Exception{

		Log.info("User enter the ami for Instance resource");
		AWSInstancePageObject.instance_resource_ami.click();
		AWSInstancePageObject.instance_resource_ami.clear();
		AWSInstancePageObject.instance_resource_ami.sendKeys("ami");
		Reporter.log("Sign out is performed");	

	}

	public static void enterAvailabilityZone(WebDriver driver, String availability_zone) throws Exception{

		Log.info("User enter the availability for Instance resource");
		AWSInstancePageObject.instance_resource_avaibility_zone.sendKeys(availability_zone);
		Reporter.log("Sign out is performed");	

	}

	public static void enterInstanceAttributeInstanceType(WebDriver driver, String instance_type) throws Exception{

		Log.info("User enter Instance Attribute Instance Type for instance");
		Actions action=new Actions(driver);
		action.moveToElement(AWSInstancePageObject.instance_resource_instance_type);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(instance_type);
		action.click().build().perform();
		sleepTime();


	}
	public static void enterInstanceInitiated(WebDriver driver, String instance_initiated) throws Exception{

		Log.info("User enter instance initiated attribute for instance");
		Actions action=new Actions(driver);
		action.moveToElement(AWSInstancePageObject.instance_resource_instance_initiated);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(instance_initiated);
		action.click().build().perform();

	}

	public static void enterInstanceAttributeSourceDestCheck(WebDriver driver, String resource_source_dest_check) throws Exception{

		Log.info("User enter source destination check attribute for instance");
		Actions action=new Actions(driver);
		action.moveToElement(AWSInstancePageObject.instance_resource_source_dest_check);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(resource_source_dest_check);
		action.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();

	}
	public static void enterVpcSecurityGroupIds(WebDriver driver, String resource_vpc_security_group_id) throws Exception{

		Log.info("User enter vpc security group id attribute for instance");
		AWSInstancePageObject.instance_resource_vpc_security_group_id.click();
		Actions action=new Actions(driver);
		action.moveToElement(AWSInstancePageObject.instance_resource_vpc_security_group_id_textArea);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(resource_vpc_security_group_id);
		action.build().perform();
		AWSInstancePageObject.instance_resource_vpc_security_group_id_setValue_btn.click();
	}

	public static void enterinstance_keyname(WebDriver driver, String string) throws Exception{

		Log.info("User enter key name attribute for instance");
		Actions action=new Actions(driver);
		action.moveToElement(AWSInstancePageObject.click_instance_key);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys("execute-scrpt");
		action.build().perform();
	
	}


	public static void enterSecurityGroups(WebDriver driver,String security_groups) throws Exception{

		Log.info("User enter security groups for instance");
		CommonFunctionalityPageAction.setArrayCommon(driver,security_groups,AWSInstancePageObject.instance_security_groups,AWSInstancePageObject.instance_security_groups_textArea,CommonFunctionalityPage.array_set_value);

	}

	public static void enterDisableApiTermination(WebDriver driver, String api) throws Exception{

		Log.info("User enter the Disable Api Termination for Instance resource");
		Actions action=new Actions(driver);
		action.moveToElement(AWSInstancePageObject.instance_disable_api_termination);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(api);
		action.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
		Reporter.log("Sign out is performed");	

	}
	public static void enterAssociatePublicIpAddress(WebDriver driver, String publicIp) throws Exception{

			Log.info("User enter the Associate PublicIp Address for Instance resource");
			Actions action=new Actions(driver);
			action.moveToElement(AWSInstancePageObject.instance_associate_public_ip_address);
			action.click();
			action.sendKeys(Keys.CONTROL + "a");
			action.sendKeys(Keys.CONTROL + "x");
			action.sendKeys(Keys.BACK_SPACE);
			action.sendKeys(publicIp);
			action.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
			sleepTime(2000);
			Reporter.log("Sign out is performed");	

	}
	public static void enterSubnetIdForInstance(WebDriver driver, String subnetid) throws Exception{

		Log.info("User enter the Subnet id for Instance resource");
		Actions action=new Actions(driver);
		action.moveToElement(AWSInstancePageObject.instance_subnet_id);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(subnetid);
		action.build().perform();
		sleepTime(2000);
		Reporter.log("Sign out is performed");	

}

	public static void enterMonitoring(WebDriver driver, String monitoring) throws Exception{

			Log.info("User enter the Monitoring for Instance resource");
			Actions action=new Actions(driver);
			action.moveToElement(AWSInstancePageObject.instance_monitoring);
			action.click();
			action.sendKeys(Keys.CONTROL + "a");
			action.sendKeys(Keys.CONTROL + "x");
			action.sendKeys(Keys.BACK_SPACE);
			action.sendKeys(monitoring);
			action.click(CommonFunctionalityPage.resource_search_for_attributes).build().perform();
			sleepTime(2000);
			Reporter.log("Sign out is performed");	

	}


	public static void enterTenancy(WebDriver driver, String tenancy) throws Exception{

		Log.info("User enter the tenancy for Instance resource");
		Actions action=new Actions(driver);
		action.moveToElement(AWSInstancePageObject.instance_tenancy);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(tenancy);
		action.click().build().perform();
		Reporter.log("Sign out is performed");	

	}

	public static void enterPlacementGroup(WebDriver driver, String placement) throws Exception{

		Log.info("User enter the placement group for Instance resource");
		Actions action=new Actions(driver);
		action.moveToElement(AWSInstancePageObject.instance_placement_group);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(placement);
		action.click().build().perform();
		sleepTime(2000);
		Reporter.log("Sign out is performed");	

	}
	public static void enterPrivateIp(WebDriver driver, String privateIp) throws Exception{

		Log.info("User enter the tenancy for private Ip resource");
		Actions action=new Actions(driver);
		action.moveToElement(AWSInstancePageObject.instance_private_ip);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.sendKeys(privateIp);
		action.click().build().perform();
		Reporter.log("Sign out is performed");	

	}
	
	public static void enterEBSBlockDevice(WebDriver driver, String ebsBlockDevice) throws Exception{

		Log.info("User enter the EBS Block Device for instance resource");
		String jsonString=ebsBlockDevice.toString();
		sleepTime(2000);
		AWSInstancePageObject.instance_ebs_block_device.click();
		sleepTime(2000);
		Actions action=new Actions(driver);
		action.moveToElement(CommonFunctionalityPage.select_text_area_for_json);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		action.build().perform();
		sleepTime(5000);
		CommonFunctionalityPage.json_set_value.click();
		Reporter.log("Sign out is performed");	

	}
	
	public static void enterEphemeralBlockDevice(WebDriver driver, String ephemeral) throws Exception{

		Log.info("User enter the Ephemeral Block Device for instance resource");
		sleepTime(2000);
		CommonFunctionalityPageAction.setJsonCommon(driver, ephemeral, AWSInstancePageObject.instance_ephemeral_block_device, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("Sign out is performed");	

	}
	
	public static void enterRootBlockDevice(WebDriver driver, String root) throws Exception{

		Log.info("User enter the Root Block Device for instance resource");
		sleepTime(2000);
		CommonFunctionalityPageAction.setJsonCommon(driver, root, AWSInstancePageObject.instance_root_block_device, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("Sign out is performed");	

	}
	
	public static void enterTags(WebDriver driver, String tags) throws Exception{

		Log.info("User enter the tags for instance resource");
		sleepTime(2000);
		CommonFunctionalityPageAction.setJsonCommon(driver, tags, AWSInstancePageObject.instance_tags, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		Reporter.log("Sign out is performed");	

	}
	
	public static void enterUserData(WebDriver driver, String userdata) throws Exception{

		Log.info("User enter the user data for instance resource");
		sleepTime(2000);
		CommonFunctionalityPageAction.setText(driver, userdata, AWSInstancePageObject.instance_user_data, CommonFunctionalityPage.select_text_area_for_settext, CommonFunctionalityPage.setvalue_for_settext);
		Reporter.log("Sign out is performed");	

	}
	
	public static void enterEbsOptimized(WebDriver driver, String optimized) throws Exception{

		Log.info("User enter the ebs optimized for instance resource");
		sleepTime(2000);
		 Actions action=new Actions(driver);
			action.moveToElement(AWSInstancePageObject.instance_ebs_optimized);
			action.click();
			action.sendKeys(Keys.CONTROL + "a");
			action.sendKeys(Keys.CONTROL + "x");
			action.sendKeys(Keys.BACK_SPACE);
			action.sendKeys(optimized);
			action.click().build().perform();
			sleepTime(2000);
		Reporter.log("Sign out is performed");	

	}
	
	public static void enterIngressForSG(WebDriver driver) throws Exception{
		//sleepTime();
		String currentURL =  driver.getCurrentUrl();
		System.out.println(currentURL);
		int Index1 = currentURL.indexOf("/");
		int Index2= currentURL.indexOf("#");
		System.out.println(Index1);
		System.out.println(Index2);
		//https://35.166.162.174/#/home/dnow/new
		String sub= currentURL.substring(Index1+2,Index2-1);
		System.out.println( sub);
		JSONParser parser = new JSONParser();	
		Object jsn = parser.parse("[\r\n  {\r\n    \"from_port\": 0,\r\n    \"to_port\": 0,\r\n    \"protocol\": \"-1\",\r\n    \"cidr_blocks\": [\r\n      \""+sub+"/32\"\r\n    ]\r\n  }\r\n]");
		CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNetworkACLPageObject.resource_ingressclick, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
	}
	
}
