package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSVpcPeeringPageObject extends BaseClass{


	public AWSVpcPeeringPageObject(WebDriver driver){
		super(driver);
	}
	@FindBy(how=How.XPATH, xpath="//*[text()='vpc_peering_c...']/following::input[1]")
	public static WebElement route_vpcpeeringConnectionId;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//*[@title='VPC peering connection']")
	public static WebElement resource_vpcPeering;

	@FindBy(how=How.XPATH, xpath="//*[text()='peer_owner_id']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement peerOwnerId;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='peer_vpc_id']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement peerVPCId;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='vpc_id']/following::div[@class='ng-scope'][1]/input[1]")
	public static WebElement vpcPeering_vpcId;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='acceptor']/following::*[text()='Set Json'][1]")
	public static WebElement setJsonAcceptor;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='auto_accept']/following::input[1]")
	public static WebElement autoAccept;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='requestor']/following::*[text()='Set Json'][1]")
	public static WebElement setJsonRequestor;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='tags']/following::*[text()='Set Json'][1]")
	public static WebElement setJsonTags;
}
