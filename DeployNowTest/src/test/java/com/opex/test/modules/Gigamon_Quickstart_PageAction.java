package com.opex.test.modules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.Gigamon_Quickstart_Page;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSInputVariablePageObject;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSOutputPage;
import com.opex.test.pageobjects.AWSRouteTableAssnPageObject;
import com.opex.test.pageobjects.AWSRouteTablePageObject;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.step_definitions.SuperUsedDefinition;

public class Gigamon_Quickstart_PageAction extends SleepFunctionality{
	
	private static String envName;






	//Environment search
	public static void searchAWSEnvironment(WebDriver driver,String envdName) throws Exception
	{
	        Log.info("I search environment$");

	        try {
	                sleepTime();
	                sleepTime();
	                //WebElement element = driver.findElement(By.xpath("//*[@id='EnvSelectorMenu']//*[contains(text(),'"+envdName+"')]"));
	                WebElement element = driver.findElement(By.xpath("//*[@id='EnvSelectorMenu']//span[normalize-space(.) = '"+envdName+"']"));
	                if(element.isDisplayed()){
	                        System.out.println("Element is Present");
	                        JavascriptExecutor je = (JavascriptExecutor) driver;
	                        je.executeScript("arguments[0].scrollIntoView(true);",element);
	                        sleepTime();
	                        System.out.println(element.getText());
	                        element.click();
	                        System.out.println("Scroll bar funtion on action page successful");
	                        System.out.println("******************** search block");
	                        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	                        sleepTime();
	                        sleepTime();
	                }
	        } catch (Exception e) {
	        	System.out.println("Element not Present");
	           //EnvironmentPageAction.fillingNewEnvironmentDetailsAfterCreate(driver,envdName, SuperUsedDefinition.dnowEnv.getEnv_description(),SuperUsedDefinition.dnowEnv.getEnv_connection());
	        	EnvironmentPageAction.fillingCopyEnvironmentDetailsAfterCreate(driver, SuperUsedDefinition.dnowEnv.getEnv_copy_name(),SuperUsedDefinition.dnowEnv.getEnv_copy_description(), SuperUsedDefinition.dncon.getCon_name(), SuperUsedDefinition.dnProvider.getprovider_AWSname());
	        	EnvironmentPageAction.createNewEnvironmentButton(driver);
	        }      
	        sleepTime();
	        Reporter.log("I search value in search box");
	}
	
	//Deploy throught Curl cmd
	public static void cmdDeploy() throws Exception {
		
		try{
		    PrintWriter writer = new PrintWriter("/tmp/deploy.sh", "UTF-8");
		    writer.println("curl -k -i -H 'Authorization:anamika.singh@reancloud.com:Rean@123' -H 'Content-Type: application/json' -X POST -d '{ \"deployConfig\": { \"emailToNotify\": \"anamikasingh011993@gmail.com\", \"deployParentEnvironments\": \"true\", \"maxRetries\": \"2\", \"parentDeployConfig\": { \"emailToNotify\": \"anamikasingh011993@gmail.com\", \"notifyStatuses\": [\"DESTROYED\", \"FAILED\"] } }, \"copyConfig\": { \"newEnvironment\": \"test_env_instance1\", \"originalEnvironment\": \"Gigamon_Quickstart_Instance_Layer\", \"newEnvProvider\": \"Auto_AWS\", \"copyParentEnvironments\": \"false\"} }' 'https://34.209.21.253/DeployNow/rest/env/copyanddeploy' -D /tmp/copyAndDeploy.log");
		    writer.close();
		    String chmod_command = "chmod 777 /tmp/deploy.sh";
	        Process	process1 = Runtime.getRuntime().exec(chmod_command);
	         process1.waitFor(); 
        	BufferedReader reader = new BufferedReader(new InputStreamReader(process1.getInputStream()));
        	String line = "";
        	while ((line = reader.readLine())!= null) 
        	{
        		System.out.println(line);
        	}
		} catch (IOException e) {
		   System.out.println("Error : File not found");
		}
		
		String testCurlCommand = "/tmp/deploy.sh";
          	Process	p = Runtime.getRuntime().exec(testCurlCommand);
        	p.waitFor(); 
        	BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        	String line = "";
        	while ((line = reader.readLine())!= null) 
        	{
        		System.out.println(line);
        	}
		
	}
	
	
	
	//enter VPC CidrBlockValue
	public static void enterVPCCidrBlockValue(WebDriver driver) throws Exception{
		//ResourceVpc_SSH_AWS_PageAction.vpcCidrBlock(driver, "10.100.0.0/22");
		AWSVpcPageAction.vpcCidrBlock(driver, "10.100.0.0/22");
	}
	
	//enter the subnet resource name
	public static void Resourcename(WebDriver driver, String resource_name) throws Exception{
	    
	    Log.info("I enter the subnet resource name in the popup");
	    CommonFunctionalityPageAction.enterResourceName(driver,resource_name);
	    sleepTime();
	    Reporter.log("Sign out is performed");    
	}
	/*
public static void enterSubnetRname(WebDriver driver) throws Exception{
	    
	    Log.info("I enter the subnet resource name in the popup");
	    CommonFunctionalityPageAction.enterResourceName(driver,"t-subnet1");
	    sleepTime();
	    Reporter.log("Sign out is performed");    
	}
	public static void ResourcEnteredalldata(WebDriver driver) throws InterruptedException {
	    
	    Log.info("I entered all attributes values under resource");
	    RSubnet_SSH_AWSAction. ResourcePassvariable(driver,"10.100.2.0/24","${VPC1.id}","${VPC1.id}","us-west-2a","true");
	    sleepTime();
	    Reporter.log("Sign out is performed");    
	    
	}
	*/

	//enter all attributes values for subnet resource 
public static void Resource_subnet_data(WebDriver driver, String cidr_block, String vpc_id, String map_public_ip ) throws InterruptedException {
	    
	    Log.info("I entered all attributes values under resource");
	   // AWSSubnetPageAction.ResourcePassvariable(driver, cidr_block ,vpc_id, "","","us-west-2a", map_public_ip);
	    PageFactory.initElements(driver, AWSSubnetPageObject.class);
	    AWSSubnetPageAction.ResourcePassvariable(driver,cidr_block,vpc_id,"${VPC1.id}",SuperUsedDefinition.dncon.getCon_name(),"us-west-2a",SuperUsedDefinition.dnsubnet.getSubnet_map_public_ip_on());
	    sleepTime();
	    Reporter.log("Sign out is performed");    
	    
	}
//Entere all data subnet
public static void ResourcEnteredalldatasubnet(WebDriver driver) throws InterruptedException {
	    
	    Log.info("I entered all attributes values under resource");
	    AWSSubnetPageAction. ResourcePassvariable(driver,"10.10.0.0/24","${Automation-vpc.id}","${Automation-vpc.id}","","");
	    sleepTime();
	    Reporter.log("Sign out is performed");    
	    
	}
//enter RouteTable Resource Name
public static void enterRouteTableRName(WebDriver driver , String route_table_name) throws Exception{

	Log.info("Enter route table resource sub method ");
	sleepTime();
	CommonFunctionalityPageAction.enterResourceName(driver, route_table_name);
	sleepTime();
	System.out.println("****Resource name is passed");
	Reporter.log("Sign out is performed");

}
//Enter route table VPC id
public static void enterRouteTableVpcId(WebDriver driver) throws Exception{
//	ResourceRoute_Table_SSH_AWS_PageAction.enterRouteTableVpcId1(driver, "${VPC1.id}");
	AWSRouteTablePageAction.enterRouteTableVpcId(driver, "${VPC1.id}");
}
//Enter route table json
public static void clickRouteTableJson(WebDriver driver) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn = parser.parse("[\r\n  {\r\n    \"cidr_block\": \"0.0.0.0/0\",\r\n    \"gateway_id\": \"${Internet_Gateway1.id}\"\r\n  }\r\n]");
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, Gigamon_Quickstart_Page.resource_routejson, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
}


//Enter route table2 json
public static void clickRouteTable2Json(WebDriver driver) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn = parser.parse("[\r\n  {\r\n    \"cidr_block\": \"0.0.0.0/0\",\r\n    \"gateway_id\": \"${Nat_Gateway.id}\"\r\n  }\r\n]");
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, Gigamon_Quickstart_Page.resource_routejson, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
}
//create vpc resource
public static void clickCreateOnVpcResourceNamePopup(WebDriver driver) throws Exception{
	Log.info("I click on create button on the popup");
	System.out.println("****Create resource");
	sleepTime();
	CommonFunctionalityPage.resource_create_button.click();
	sleepTime();
	sleepTime();
	sleepTime();

	Reporter.log("Sign out is performed");
}
//Resource Click create resource
public static void ResourceClickcreatedresource(WebDriver driver) throws Exception{
    
    Log.info("I click on created resource");
    sleepTime();
    sleepTime();
    Gigamon_Quickstart_Page.resource_clickresource.click();
    sleepTime();
    Reporter.log("Sign out is performed");    
}
//create subnet public,app,mirror 
public static void ResourceClickcreatedsubnet(WebDriver driver, String subnet_name) throws Exception{
    
    Log.info("I click on created resource");
    sleepTime();
    sleepTime();
    if (subnet_name == "Public_subnet" ){
    Gigamon_Quickstart_Page.resource_clickresourcesubnet1.click();
    } else if (subnet_name == "App_subnet"){
    	Gigamon_Quickstart_Page.resource_clickresourcesubnet2.click();	
    }else if (subnet_name == "Mirror_subnet"){
    	Gigamon_Quickstart_Page.resource_clickresourcesubnet3.click();
    }
    sleepTime();
    Reporter.log("Sign out is performed");    
}

//Click on the Resource Internet Gateway
public static void clickResourceIGW(WebDriver driver, String resource_to_click){

	Log.info("I click on added resource");
	sleepTime();
	Actions action = new Actions(driver);
	if (resource_to_click == "Internet_Gateway1" ){
	action.moveToElement(Gigamon_Quickstart_Page.click_resource_igw);
	}else if (resource_to_click == "Nat_Gateway" ) {
		action.moveToElement(Gigamon_Quickstart_Page.click_resource_nat_gateway);	
	}
	action.click().build().perform();
	sleepTime();
}

//click on create route table resource
public static void ResourceClickcreatedrouteresource(WebDriver driver) throws Exception{
    
    Log.info("I click on created resource");
    sleepTime();
    sleepTime();
    Gigamon_Quickstart_Page.resource_clickrouteresource.click();
    sleepTime();
    Reporter.log("Sign out is performed");    
}
//click on create route table Association  resource
public static void ResourceClickcreatedRouteassresource(WebDriver driver) throws Exception{
    
    Log.info("I click on created resource");
    sleepTime();
    sleepTime();
    Gigamon_Quickstart_Page.resource_clickrouteassresource.click();
    sleepTime();
    Reporter.log("Sign out is performed");    
}
//click on create route table Association  resource2
public static void click_route_tbl_association2(WebDriver driver) throws Exception{
    
    Log.info("I click on created resource");
    sleepTime();
    sleepTime();
    Gigamon_Quickstart_Page.click_route_tbl_association_resource.click();
    sleepTime();
    Reporter.log("Sign out is performed");    
}
//click on create nat gateway resource
public static void ResourceClickcreatedNATresource(WebDriver driver) throws Exception{
    
    Log.info("I click on created resource");
    sleepTime();
    sleepTime();
    Gigamon_Quickstart_Page.resource_clickNATresource.click();
    sleepTime();
    Reporter.log("Sign out is performed");    
}
//click on create route table
public static void ResourceClickCreatedRouteTableResource(WebDriver driver, String route_table) throws Exception{
    
    Log.info("I click on created resource");
    sleepTime();
    sleepTime();
    if (route_table == "pub_route_table" ){
    Gigamon_Quickstart_Page.resource_clickroutetableresource.click();
    }else if (route_table == "priv_route_table" ) {
    	Gigamon_Quickstart_Page.resource_clickroutetable2resource.click();
    }
    sleepTime();
    Reporter.log("Sign out is performed");    
}
 //click route table json
public static void clickRTableJson(WebDriver driver) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn = parser.parse("[\r\n  {\r\n    \"cidr_block\": \"10.0.1.0/24\",\r\n    \"nat_gateway_id\": \"${natp.id}\"\r\n  }\r\n]");
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, Gigamon_Quickstart_Page.resource_routejson, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
}
//enter IGW Resource Name
public static void enterIGWRName(WebDriver driver) throws Exception{

	Log.info("Enter IGW resource name ");
	sleepTime();
	CommonFunctionalityPageAction.enterResourceName(driver,"tIGW");
	sleepTime();
	System.out.println("****Resource name is passed");
	Reporter.log("Sign out is performed");

}
//click on EIP Resource
public static void clickEIPResourceAndDrop(WebDriver driver) throws Exception{

	Log.info("Select EIP resource  ");
	Actions actions = new Actions(driver);
	actions.moveToElement(Gigamon_Quickstart_Page.resource_clickeip);
	actions.click().build().perform();
	sleepTime();
	actions.dragAndDrop(Gigamon_Quickstart_Page.resource_clickeip,EnvironmentPage.canvas).build().perform();
	sleepTime();
	sleepTime();
	System.out.println("***Resourcedraged to convas");
	Reporter.log("Sign out is performed");

}
//click on NAT gateway Resource
public static void clickNATResourceAndDrop(WebDriver driver) throws Exception{

	Log.info("Select NAT resource  ");
	Actions actions = new Actions(driver);
	actions.moveToElement(Gigamon_Quickstart_Page.resource_clickNAT);
	actions.click().build().perform();
	sleepTime();
	actions.dragAndDrop(Gigamon_Quickstart_Page.resource_clickNAT,EnvironmentPage.canvas).build().perform();
	sleepTime();
	sleepTime();
	System.out.println("***Resourcedraged to convas");
	Reporter.log("Sign out is performed");

}
//enter EIP name
public static void enterEIPName(WebDriver driver) throws Exception{

	Log.info("Enter EIP resource name ");
	sleepTime();
	CommonFunctionalityPageAction.enterResourceName(driver,"NAT_EIP");
	sleepTime();
	System.out.println("****Resource name is passed");
	Reporter.log("Sign out is performed");

}
//enter route table association resource name
public static void enterRoutetableassName(WebDriver driver, String Route_tbl_association) throws Exception{

	Log.info("Enter Route Table association resource name ");
	sleepTime();
	CommonFunctionalityPageAction.enterResourceName(driver, Route_tbl_association);
	sleepTime();
	System.out.println("****Resource name is passed");
	Reporter.log("Sign out is performed");

}
//enter NAT gateway Resource Name
public static void enterNATRName(WebDriver driver) throws Exception{

	Log.info("Enter Route Table association resource name ");
	sleepTime();
	CommonFunctionalityPageAction.enterResourceName(driver,"natp");
	sleepTime();
	System.out.println("****Resource name is passed");
	Reporter.log("Sign out is performed");

}
//navigate to refresh page
public static void refresh_page(WebDriver driver) throws Exception{
	
	Thread.sleep(90000);
	driver.navigate().refresh();
	sleepTime();
	
}
//enter route table id
public static void enterRTAroute_id(WebDriver driver, String route_table_id ) throws Exception{
	Log.info("Enter Route table id Value");
	System.out.println("****Enter Route table id Value");
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(AWSRouteTableAssnPageObject.resource_RTArouteid);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys(route_table_id);
	action.build().perform();
	sleepTime();
	Reporter.log("Route table id is performed");
}

//enter route table subnet id
public static void enterRTAsubnet_id(WebDriver driver, String subnet_id) throws Exception{
	Log.info("Enter Subnet id Value");
	System.out.println("****Enter Subnet id Value");
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(AWSRouteTableAssnPageObject.resource_RTAsubnetid);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys(subnet_id);
	action.build().perform();
	sleepTime();
	Reporter.log("Subnet id is performed");
}
//Enter allocation id 
public static void enterallocation_id(WebDriver driver) throws Exception{
	Log.info("Enter Allocation id Value");
	System.out.println("****Enter allocation id Value");
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(Gigamon_Quickstart_Page.resource_allocation_id);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys("${NAT_EIP.id}");
	action.build().perform();
	sleepTime();
	Reporter.log("Allocation id is performed");
}
// enter route_table_association igw name
public static void enterIGWName(WebDriver driver) throws Exception{

	Log.info("I enter the IGW resource name in the popup");
	sleepTime();
	CommonFunctionalityPageAction.enterResourceName(driver,"test-igw");

	sleepTime();
	Reporter.log("Sign out is performed");	
}
//enter vpc 
public static void vpcTextBoxIGW(WebDriver driver){
	Log.info("Enter VPC_id Value");
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(AWSInternetGatewayPageObject.resource_vpcidtextbox);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys("${VPC1.id}");
	action.build().perform();
	sleepTime();

	Reporter.log("VPC_id is Entered");
}
//click on Depends on

public static void click_on_depends_on_resource(WebDriver driver) throws Exception{

	 Log.info("I click on created resource");
	 sleepTime();
	 sleepTime();
	 Gigamon_Quickstart_Page.click_resource_depends_on.click();
	 sleepTime();
	 Reporter.log("Sign out is performed");    
}
//Enter depends on name
public static void enterDepends_on(WebDriver driver) throws Exception{
	Log.info("Enter Value for Depends_on");
	System.out.println("****Enter Value for Depends_on");
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(Gigamon_Quickstart_Page.resource_dependson);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys("${Nat_Gateway}");
	action.build().perform();
	sleepTime();
	Reporter.log("Route table id is performed");
}
//enter resource name
public static void Entername(WebDriver driver, String resource_name) throws Exception{
	
    Log.info("Resource Name is entered");
    sleepTime();
	CommonFunctionalityPageAction.enterResourceName(driver, resource_name);
    sleepTime();
    Reporter.log("Sign out is performed");	
}
//click on security group
public static void ResourceClickSgroup(WebDriver driver, String security_group_name) throws Exception{
	
	Log.info("Click on Securitygroup resource");
	if (security_group_name == "public_access" ){
		Gigamon_Quickstart_Page.resource_securitygroup1.click();
	}else if (security_group_name == "mgmt_access" ){
		Gigamon_Quickstart_Page.resource_securitygroup2.click();
	}else if (security_group_name == "mirror_access" ){
		Gigamon_Quickstart_Page.resource_securitygroup3.click();
	}
    sleepTime();
	Reporter.log("Sign out is performed");
	
}
 //click on ingress for security group
public static void clickoningress(WebDriver driver) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn = parser.parse("[\r\n  {\r\n    \"from_port\": 443,\r\n    \"to_port\": 443,\r\n    \"protocol\": \"TCP\",\r\n    \"cidr_blocks\": [\r\n      \"35.160.159.184/32\"\r\n    ]\r\n  }\r\n]");
//	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, R_Network_ACL_SSH_AWSPage.resource_ingressclick, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNetworkACLPageObject.resource_ingressclick, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);    
}
//click on engress for security group
public static void clickonegress(WebDriver driver) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn = parser.parse("[\r\n  {\r\n    \"from_port\": 80,\r\n    \"to_port\": 80,\r\n    \"protocol\": \"6\",\r\n    \"cidr_blocks\": [\r\n      \"10.100.0.0/22\"\r\n    ]\r\n  }\r\n]");
//	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, R_Network_ACL_SSH_AWSPage.resource_egressclick, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSNetworkACLPageObject.resource_egressclick, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
}

//Drag and Drop Resources
public static void drag_and_drop_resource(WebDriver driver) throws Exception{
	
	Log.info("Select resource and  drag & drop on canvas");
	CommonFunctionalityPageAction.resourceDragDrop(driver,Gigamon_Quickstart_Page.depends_on_resource);
	System.out.println("***Depends on Resource is added to environment");
	Reporter.log("Sign out is performed");		
}

//Enter Depends on value
public static void dependson_value(WebDriver driver, String env_name){
	Log.info("Enter Value for Depends_On");
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(Gigamon_Quickstart_Page.depends_on_value);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys(env_name);
	action.build().perform();
	sleepTime();

	Reporter.log("Depends_On attribute value is entered");
}
//Enter output json
public static void enterOutputJson(WebDriver driver,Object json) throws Exception{
	Log.info("Enter Output Json");
	String jsonString=json.toString();
	System.out.println("JsonString >> "+jsonString);
	
	sleepTime();
//	R_Output_SSH_AWS_Page.select_set_json_for_output.click();
	sleepTime();
	Actions action=new Actions(driver);
//	action.moveToElement(R_Output_SSH_AWS_Page.select_text_area_for_route);
	action.click();
	action.sendKeys(Keys.CONTROL + "a");
	sleepTime();
	action.sendKeys(Keys.CONTROL + "x");
	sleepTime();
	action.sendKeys(Keys.BACK_SPACE);
	sleepTime();
	action.sendKeys(jsonString);
	action.build().perform();
	sleepTime();
//	R_Output_SSH_AWS_Page.json_set_value.click();
	sleepTime();
	Reporter.log("Output Json attribute is entered");
}

public static void enterOutputValidJson(WebDriver driver) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn  = parser.parse("{\n  \"Full_Name\": {\n    \"value\": \"${var.FName} ${var.LName}\"\n  },\n  \"public_subnet_id\": {\n    \"value\": \"${ aws_subnet.Public_subnet.id }\"\n  },\n  \"public_access_id\": {\n    \"value\": \"${ aws_security_group.public_access.id }\"\n  },\n  \"app_subnet_id\": {\n    \"value\": \"${ aws_subnet.App_subnet.id }\"\n  }\n}");
	//R_Output_SSH_AWS_PageAction.enterOutputJson(driver, jsn);
//	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, R_Output_SSH_AWS_Page.select_set_json_for_output, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSOutputPage.select_set_json_for_output, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
}

/*
public static void enter_subnet_id_instance(WebDriver driver) throws Exception{
	
	Log.info("I enter the subnet_id for Instance resource");
	sleepTime();
	Gigamon_Quickstart_Page.subnet_id_for_instance.click();
	Gigamon_Quickstart_Page.subnet_id_for_instance.clear();
	Gigamon_Quickstart_Page.subnet_id_for_instance.sendKeys("${networking.app_subnet_id}");
	sleepTime();
	Reporter.log("Sign out is performed");	
}
*/

//enter subnetid for instance
public static void enter_subnet_id_instance(WebDriver driver) throws Exception{

	Log.info("I enter the subnet_id for Instance resource");
	sleepTime();
	
	sleepTime();
	Actions action=new Actions(driver);
	action.moveToElement(	Gigamon_Quickstart_Page.subnet_id_for_instance);
	action.click();
	Gigamon_Quickstart_Page.subnet_id_for_instance.clear();
	Gigamon_Quickstart_Page.subnet_id_for_instance.sendKeys("${networking.app_subnet_id}");
	sleepTime();

}
//enter Subnet Array
public static void enterValidSubnetArray(WebDriver driver) throws Exception{
	String arrayValue="${networking.public_subnet_id}";
//	CommonFunctionalityPageAction.setArrayCommon(driver, arrayValue, AWS_ELB_Page.click_subnets_setArray, AWS_ELB_Page.select_subnets_textarea_for_elb,AWS_ELB_Page.array_Set_Value);
	CommonFunctionalityPageAction.setArrayCommon(driver, arrayValue, AWSELBPageObject.click_subnetgroups_setArray, CommonFunctionalityPage.select_text_area_for_propagation,CommonFunctionalityPage.array_set_value);
}

//enter instance Array
public static void enterValidinstanceArray(WebDriver driver) throws Exception{
	String arrayValue="${test-instance.id}";
	CommonFunctionalityPageAction.setArrayCommon(driver, arrayValue, Gigamon_Quickstart_Page.click_instances_setArray, Gigamon_Quickstart_Page.select_instances_textarea_for_elb,Gigamon_Quickstart_Page.array_Set_Value);
}

//enter output json
public static void enterOutputValidJson2(WebDriver driver) throws Exception{
	JSONParser parser = new JSONParser();
	Object jsn  = parser.parse("{\n\t\"app_subnet_id\": {\n\t\t\"value\": \"${ aws_subnet.App_subnet.id }\"\n\t},\n\t\"public_subnet_id\": {\n\t\t\"value\": \"${ aws_subnet.Public_subnet.id }\"\n\t},\n\t\"public_access_id\": {\n\t\t\"value\": \"${ aws_security_group.public_access.id }\"\n\t}\n}");
	//R_Output_SSH_AWS_PageAction.enterOutputJson(driver, jsn);
//	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, R_Output_SSH_AWS_Page.select_set_json_for_output, CommonFunctionalityPage.select_text_area_for_json,CommonFunctionalityPage.json_set_value);
	CommonFunctionalityPageAction.setJsonCommon(driver, jsn, AWSOutputPage.select_set_json_for_output, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
}

//verify deployment
public static void verifydeployment(WebDriver driver) throws Exception{
	
	//Log.info("Verify Deployment Status");
	//Wait till deployment is complete
do {
		System.out.println("Environment is Deploying");
		Thread.sleep(5000);
		String str1 = driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/div/div[1]/div/div[1]")).getText().trim();
		System.out.println("String1: " +str1);
		
		if (str1.equals("Status:   Deployed     Logs")){
			System.out.println("Environment Deployment Complete");
			System.out.println("Environment Deployed successfully");
			break;	
		}else if(str1.equals("Status:   Failed     Logs")){
			CommonFunctionalityPage.resource_logs_btn.click();
			sleepTime();
			sleepTime();
			System.out.println("Environment Deployment Failed");
			Assert.fail("ERROR : Deployment Failed !!!");
			break;
		}
	}while(true);
 }

   //Create button
	public static void resourceCreateBtn(WebDriver driver) throws InterruptedException{

		Log.info("I click on create resource ");
		CommonFunctionalityPage.resource_create_button.click();
		Thread.sleep(3000);
		System.out.println("create button success");
	}
//set json for output variable
	public static void setOutputJSON(WebDriver driver) throws Exception {
		Log.info("User entering Output Resource ");
		JSONParser parser = new JSONParser();
		Object jsn = parser.parse("{\n\t\"app_subnet_id\": {\n\t\t\"value\": \"${ aws_subnet.App_subnet.id }\"\n\t},\n\t\"public_subnet_id\": {\n\t\t\"value\": \"${ aws_subnet.Public_subnet.id }\"\n\t},\n\t\"public_access_id\": {\n\t\t\"value\": \"${ aws_security_group.public_access.id }\"\n\t}\n}");
		//JSONParser parser = new JSONParser();
		//Object jsn= parser.parse("[\n  \"Full_Name\": {\n    \"value\": \"${var.FName} ${var.LName}\"\n  },\n  \"public_subnet_id\": {\n    \"value\": \"${ aws_subnet.Public_subnet.id }\"\n  },\n  \"public_access_id\": {\n    \"value\": \"${ aws_security_group.public_access.id }\"\n  },\n  \"app_subnet_id\": {\n    \"value\": \"${ aws_subnet.App_subnet.id }\"\n  }\n]");
		//String  jsn ="{\n\t\"app_subnet_id\": {\n\t\t\"value\": \"${ aws_subnet.App_subnet.id }\"\n\t},\n\t\"public_subnet_id\": {\n\t\t\"value\": \"${ aws_subnet.Public_subnet.id }\"\n\t},\n\t\"public_access_id\": {\n\t\t\"value\": \"${ aws_security_group.public_access.id }\"\n\t}\n}";
		CommonFunctionalityPageAction.setJsonCommon(driver, jsn, Gigamon_Quickstart_Page.output_setjson, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		
	}
//set json for input variable
	public static void setInputJSON(WebDriver driver,String json) throws Exception {
		JSONParser parser = new JSONParser();
		Object jsn = parser.parse(json);
		CommonFunctionalityPageAction.setJsonCommon(driver,jsn, AWSInputVariablePageObject.input_variables_attribute, CommonFunctionalityPage.select_text_area_for_json, CommonFunctionalityPage.json_set_value);
		
	}
   //set array for elb resource
	public static void setArrayCommon1(WebDriver driver,String arrayValue,WebElement setArray,WebElement selectTextArea, WebElement setValue) {
		Log.info("Enter array Json");
		sleepTime(2000);
		setArray.click();
		sleepTime(2000);
		Actions action=new Actions(driver);
		action.moveToElement(selectTextArea);
		action.click();
		action.sendKeys(Keys.CONTROL + "a");
		action.sendKeys(Keys.CONTROL + "x");
		action.sendKeys(Keys.BACK_SPACE);
		arrayValue="${networking.public_subnet_id}";
		action.sendKeys(arrayValue);
		action.build().perform();
		sleepTime(5000);
		setValue.click();
		sleepTime(2000);
		Reporter.log("Array is entered");
		
	}
//search for 1st environment Gigamon_Quickstart network layer
	public static void searchSSHAWSEnvironment1(WebDriver driver, String env_name) throws InterruptedException {
		
		Log.info("User search environment$");
		EnvironmentPage.canvas.click();
		EnvironmentPage.environment_dropdown.clear();
		EnvironmentPage.environment_dropdown.sendKeys(env_name);
		try {	
			WebElement element = driver.findElement(By.xpath("//*[@name='env-search']/following::span[contains(text(),'"+env_name+"')]"));
			
			if (element.isDisplayed()) {
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", element);
				element.click();
				sleepTime(2000);
				
				try {
					WebElement resource_destroy_btn = driver.findElement(By.xpath("//*[@uib-popover='Destroy']"));
					if (resource_destroy_btn.isDisplayed()) {
						resource_destroy_btn.click();
						sleepTime(1000);
						CommonFunctionalityPageAction.resourceYesDestroyButton(driver);
						sleepTime(1000);
						
					}
                     
						} catch (Exception e) {
							CommonFunctionalityPageAction.refreshPage(driver);
							EnvironmentPage.environment_dropdown.clear();
							EnvironmentPage.environment_dropdown.sendKeys(env_name);
							sleepTime(1000);
							EnvironmentPageAction.deleteEnvironment(driver, env_name);
				            }
			}

		
			
	}catch (Exception e) {
		try {
			CommonFunctionalityPageAction.refreshPage(driver);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		EnvironmentPage.environment_dropdown.clear();
		EnvironmentPage.environment_dropdown.sendKeys(env_name);
		sleepTime(1000);
		EnvironmentPageAction.deleteEnvironment(driver, env_name);
        }
	}

    //wait for destroy button
	public static void destroywait(WebDriver driver) throws Exception {
		Log.info("wait for destroy button");
		Thread.sleep(2000);
		new WebDriverWait(driver, 200)
		.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@uib-popover='Destroy']"), "Destroy"));
		
	}

//search environment created by curl command
	public static void searchSSHAWSEnvironment2(WebDriver driver, String envdName)throws Exception {
		Log.info("User search environment$");
	  EnvironmentPage.canvas.click();
	  EnvironmentPage.environment_dropdown.sendKeys(envdName);
			
			WebElement element = driver.findElement(By.xpath("//*[@name='env-search']/following::span[contains(text(),'"+envdName+"')]"));
			
			if (element.isDisplayed()) {
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", element);
				element.click();
				sleepTime(1000);
				
			}
	}
		
	

//Delete Test_env_Instance1
	public static void deleteEnvironment1(WebDriver driver, String env_name)throws Exception {
		Log.info("Action is performed on connection scroll bar");
		CommonFunctionalityPageAction.refreshPage(driver);
        EnvironmentPage.environment_dropdown.clear();
//	    EnvironmentPage.environment_dropdown.sendKeys(envName);
		try{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//sleepTime();
			//driver.navigate().refresh();
			//sleepTime();
			//sleepTime();
			
			WebElement searchedCreatedEnvironment = driver.findElement(By.xpath("//*[@name='env-search']/following::span[contains(text(),'"+envName+"')]"));
			if(searchedCreatedEnvironment.isDisplayed()){
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);",searchedCreatedEnvironment);
				sleepTime(2000);
				//CommonFunctionalityPageAction.refreshPage(driver);
				//EnvironmentPage.environment_dropdown.clear();
				//EnvironmentPage.environment_dropdown.sendKeys(envName);
				//element.click();
				WebElement deleteSearchedCreatedEnvironment = driver.findElement(By.xpath("//span[contains(text(),'"+envName+"')]/following::span"));
				deleteSearchedCreatedEnvironment.click();
				sleepTime(2000);
				//sleepTime();
				EnvironmentPage.delete_yessearch_env.click();
				sleepTime(2000);	
			}
			String text="Environment deleted successfully.......";
			WebDriverWait wait = new WebDriverWait(driver, 3);
			WebElement message = (WebElement)wait.until(
					ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
			Actions act = new Actions(driver);
			act.moveToElement(message);
			act.build().perform();
			String notificationMessage = message.getText();
			if(notificationMessage.equals(text))
			{
				Assert.assertTrue( "Environment deleted successfully.......".equals(notificationMessage));
				Log.info(notificationMessage);
				//sleepTime();	
			}
		}catch(Exception e){
			Log.error("Exception while searching Environment object",e);
		}
	}}
	