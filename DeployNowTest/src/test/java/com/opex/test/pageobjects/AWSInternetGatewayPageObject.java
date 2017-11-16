package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSInternetGatewayPageObject extends BaseClass {


	public AWSInternetGatewayPageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,xpath="//div[@title='AWS Internet gateway']")
	public static WebElement IGW_resource;

	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]//*[text()='test-igw']")
	public static WebElement click_resource_igw;

	@FindBy(how=How.XPATH, xpath="//*[text()='test-igw']//preceding::*[@class='body']")
	public static WebElement resource_hoverresource;

	@FindBy(how=How.XPATH,xpath="//*[text()='test-igw']/following::*[text()='X']")
	public static WebElement resource_cross_btn_on_resource;

	@FindBy(how=How.XPATH,xpath="//div[@id='sidebar-wrapper-right']//*[contains(text(),'test-igw')]")
	public static WebElement resource_test_iam_policy_link_attribute;

	@FindBy(how=How.XPATH, xpath="//*[@id='EnvSelectorMenu']//*[text()='PX_SSH_AWS_IGW']")
	public static WebElement search_ssh_aws_env_IGW;

	//*[@id='EnvSelectorMenu']//*[contains(text(),'PX_SSH_AWS_Z')]/following::i[2]
	@FindBy(how=How.XPATH, xpath="//*[@id='EnvSelectorMenu']//*[contains(text(),'PX_SSH_AWS_IGW')]/following::i[2]")
	public static WebElement IGW_env_delete;

	//span[text()='Yes']
	@FindBy(how=How.XPATH, xpath="//span[text()='Yes']")
	public static WebElement IGW_env_delete_yesBtn;

	@FindBy(how=How.XPATH, xpath="//span[text()='No']")
	public static WebElement IGW_env_delete_noBtn;

	@FindBy(how=How.XPATH, xpath="//*[text()='vpc_id']//following::*[@type='text'][1]")
	public static WebElement resource_vpcidtextbox;

	@FindBy(how=How.XPATH, xpath="//*[text()='test-igw']//preceding::*[@class='body']")
	public static WebElement resource_hoverresourceIGW;

	@FindBy(how=How.XPATH,xpath="//*[text()='test-igw']/following::*[text()='X']")
	public static WebElement resource_cross_btn_on_resourceIGW;

	//span[text()='Yes']
	@FindBy(how=How.XPATH, xpath="//span[text()='Yes']")
	public static WebElement IAMP_env_delete_yesBtn;

	@FindBy(how=How.XPATH, xpath="//span[text()='No']")
	public static WebElement IAMP_env_delete_noBtn;

	@FindBy(how=How.XPATH, xpath="//div[@id='sidebar-wrapper-right']//*[contains(text(),'test-igw')]")
	public static WebElement resource_test_igw_link_attribute;
}