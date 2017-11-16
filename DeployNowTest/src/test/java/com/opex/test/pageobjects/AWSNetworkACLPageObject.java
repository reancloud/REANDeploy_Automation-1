package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSNetworkACLPageObject extends BaseClass{
	
	public AWSNetworkACLPageObject (WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, xpath="//div[@title='AWS Network ACL']")
	public static WebElement resource_NetworkACL;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='egress']/following::*[text()='Set Json'][1]")
	public static WebElement resource_egressclick;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='powered by ace']/following::*[@class='ace_scroller'][1]")
	public static WebElement resource_egresstextarea;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='setJsonValueModel']//*[text()='Set Value']")
	public static WebElement resource_egresssetvalue;
	
	
	@FindBy(how=How.XPATH, xpath="//*[text()='egress']/following::*[text()='Set Json'][2]")
	public static WebElement resource_ingressclick;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='Code ▾']/following::*[@class='ace_scroller'][1]")
	public static WebElement resource_ingresstextarea;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='setJsonValueModel']//*[text()='Set Value']")
	public static WebElement resource_ingresssetvalue;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='vpc_id']//following::*[@class='ng-scope'][1]")
	public static WebElement resource_vpcidtextbox;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='Depends On']/following::*[1]/input")
	public static WebElement resource_dependsontxtbox;
	
	@FindBy(how=How.XPATH,xpath=".//*[@id='tab-content-2']/div/md-content/table[2]/tbody/tr[2]/td[2]/select")
	public static WebElement resource_connectiontxtbox;
	
	@FindBy(how=How.XPATH,xpath=".//*[@id='tab-content-2']//*[contains(text(),'PX_SSH')]")
	public static WebElement resource_connectionclick;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='subnet_ids']/following::*[text()='Set Array'][1]")
	public static WebElement resource_subnetidclick;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='setArrayModal']/div/div/div[2]/div/div[2]/div")
	public static WebElement resource_subnetidtextarea;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='setArrayModal']//*[text()='Set Value']")
	public static WebElement resource_subnetidsetvalue;
	
	@FindBy(how=How.XPATH,xpath="//*[@uib-popover='Deploy']")
	public static WebElement deploy_button;
	
}

