package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSVPCDHCPPageObject {
	
	@FindBy(how=How.XPATH, xpath="//div[@title='VPC DHCP Options']")
	public static WebElement resource_VPCDHCP;
	
	@FindBy(how=How.XPATH, xpath="	//*[text()='domain_name']//following::*[@ng-model='a.value']")
	public static WebElement R_VPCDHCP_domainname;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='domain_name_servers']/following::*[text()='Set Array'][1]")
	public static WebElement R_VPCDHCP_dnameclick;
	
	@FindBy(how=How.XPATH, xpath="//*[contains(text(),'Set Array value for:')]//following::div[@class='ace_content'][1]")
			// "//*[text()='Set Array value for: domain_name_servers ']//following::div[@class='ace_content'][1]")
	public static WebElement R_VPCDHCP_dnametextarea;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='netbios_name_servers']/following::*[text()='Set Array'][1]")
	public static WebElement VPCDHCP_netbios_name_servers_click;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='netbios_node_type']/following::input[1]")
	public static WebElement VPCDHCP_netbios_type;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='ntp_servers']/following::*[text()='Set Array'][1]")
	public static WebElement VPCDHCP_ntp_servers;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='tags']/following::*[text()='Set Json'][1]")
	public static WebElement VPCDHCP_tags;
	
	
}
