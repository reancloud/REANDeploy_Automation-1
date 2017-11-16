package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSInputVariablePageObject {

	
	@FindBy(how=How.XPATH,xpath="//div[@title='Input Variables']")
	public static WebElement input_variable_resource;
	
	//*[contains(@id,'v-')]//*[text()='Input Variables']")
	@FindBy(how=How.XPATH,xpath="//*[@class='resourceNode-text']//*[contains(text(),'Input')]")
	public static WebElement click_resource_input_variable;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='EnvSelectorMenu']//*[contains(text(),'PX_SSH_AWS_InputVar')]/following::i[2]")
	public static WebElement input_variable_env_delete;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='EnvSelectorMenu']//*[text()='PX_SSH_AWS_InputVar']")
	public static WebElement search_ssh_aws_env_input_variable;

	//span[text()='Yes']
	@FindBy(how=How.XPATH, xpath="//span[text()='Yes']")
	public static WebElement input_variable_env_delete_yesBtn;
	
	@FindBy(how=How.XPATH, xpath="//span[text()='No']")
	public static WebElement input_variable_env_delete_noBtn;
	
	@FindBy(how=How.XPATH, xpath="//*[@class='resourceNode-text']//*[contains(text(),'Input')]//preceding::*[@class='scalable']")
	//*[@class='resourceNode-text']//*[contains(text(),'Variables')]/ancestor::*[2]")
	//*[text()='Variables']//preceding::*[@class='body']")
    public static WebElement resource_hoverresource_input_variable;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='resourceNode-text']//*[contains(text(),'Variables')]/following::*[text()='X']")
	public static WebElement resource_cross_btn_on_resource;
	
	@FindBy(how=How.XPATH,xpath="//*[contains(@id,'v-')]/following::*[text()='Input Variables']")
	public static WebElement resource_test_input_variable_link_attribute;
	
	 //*[@class='propertyvalue']//*[contains(text(),'Set Json')]
	@FindBy(how=How.XPATH,xpath="//*[text()='input_variables']/following::*[contains(text(),'Set Json')]")
	public static WebElement input_variables_attribute;
	
	//*[@id='jsoneditor75865589']
	@FindBy(how=How.XPATH,xpath="//*[text()='powered by ace']/following::*[@class='ace_scroller'][1]")
	public static WebElement input_variable_textArea_Json;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='ace_scroller']/following::*[text()='Set Value']")
	public static WebElement input_variable_setValueBtn;
	
	
	@FindBy(how=How.XPATH,xpath="//*[@ng-click='closeSetJsonModal()']")
	public static WebElement input_variable_closeJson;
	
	
	@FindBy(how=How.XPATH,xpath="//b[contains(text(),'Error')]")
	public static WebElement input_variable_errorJsonMsg;

	@FindBy(how=How.XPATH,xpath="//*[text()='Please delete it!']")
	public static WebElement plsDelete;
	
	@FindBy(how=How.XPATH,xpath="//*[text()='Dont delete it']")
	public static WebElement plsDontDelete;
}


