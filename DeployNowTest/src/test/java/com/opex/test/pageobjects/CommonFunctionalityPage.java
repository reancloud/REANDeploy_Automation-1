package com.opex.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonFunctionalityPage extends BaseClass{

	public CommonFunctionalityPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(how=How.XPATH, xpath=".//span[@class='fa-stack fa-lg deploy-logo']")
	public static WebElement deploynow_logo;

	@FindBy(how=How.XPATH,xpath="//div[@id='canvas']")
	public static WebElement canvas;

	//For environment search bar
	@FindBy(how=How.XPATH,xpath=".//*[@name='env-search']")
	public static WebElement create_environment_search;

	//resource name text box
	@FindBy(how=How.XPATH, xpath="//input[@ng-model='resourceName']")
	public static WebElement resource_name;

	//resource exists on provider check box
	@FindBy(how=How.XPATH, xpath="//div[@title='Import existing resource which already exist on provider console']")
	public static WebElement resource_exists;

	//resource existingID on provider
	@FindBy(how=How.XPATH, xpath="//input[@id='existing-id']")
	public static WebElement resource_existing_id;

	//resource create button
	@FindBy(how=How.XPATH,xpath="//button[@ng-click='createResource()']")
	public static WebElement resource_create_button;

	//resource close button
	@FindBy(how=How.XPATH,xpath="//div[@id='ResourceNameModal']/div//button[2][contains(text(),Close)]")
	public static WebElement close_btn_resource;

	//search bar for resource under attributes
	@FindBy(how=How.XPATH,xpath="//div[@id='sidebar-wrapper-right']//*[@placeholder='Search Attributes']")
	public static WebElement resource_search_for_attributes;


	//save button on resource edit pop up
	@FindBy(how=How.XPATH,xpath="//button[@ng-click='changeResourceName()']")
	public static WebElement resource_name_save_button;

	//Close button on resource edit pop up
	@FindBy(how=How.XPATH,xpath="//*[@id='ResourceNameEdit']//button[2]")
	public static WebElement resource_name_close_btn;

	//Cross button on resource edit pop up
	@FindBy(how=How.XPATH,xpath="//*[@id='ResourceNameEdit']/div/div/div[1]/button")
	public static WebElement resource_name_cross_btn;

	//save button
	@FindBy(how=How.XPATH,xpath="//*[@uib-popover='Save']")
			// "//*[@ng-click='saveAll()']")
	public static WebElement resource_save_button;

	//deploy button
	@FindBy(how=How.XPATH,xpath="//*[@uib-popover='Deploy']")
	public static WebElement deploy_button;
	
	@FindBy(how=How.XPATH,xpath="//*[@uib-popover='ReDeploy']")
	public static WebElement Redeploy_button;
	
	@FindBy(how=How.XPATH,xpath="//span[@class='ng-binding ng-scope'][text()='Continue']")
	public static WebElement Continue_button;

	@FindBy(how=How.XPATH, xpath="//*[contains(@id,'v-')]//*[text()='test-subnetgroup']")
	// "//*[@class='env-canvas']//*[@class='scalable']")
	public static WebElement resource_hoverresource;

	//when a resource is created there is a x cross close button on the resource itself
	@FindBy(how=How.XPATH,xpath="//*[text()='test-subnetgroup']/following::*[text()='X']")
	public static WebElement resource_cross_btn_on_resource;

	//Please delete button
	@FindBy(how=How.XPATH,xpath="//*[@ng-click='dialog.hide()']")
	//md-dialog-actions//button[@aria-label='Please delete it']")
	public static WebElement resource_delete_btn_attribute;

	//Please don't delete button
	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Dont delete it')]")
			// "//md-dialog-actions//button[@aria-label='Dont delete it']")
	public static WebElement resource_dont_delete_btn_attribute;


	//Name text box on resource edit pop up
	//input[@ng-model='sharedData.editResourceName']
	@FindBy(how=How.XPATH,xpath="//input[@ng-model='sharedData.editResourceName']")
	public static WebElement resource_name_edit_textBox;

	//resource log pop up refresh button
	@FindBy(how=How.XPATH,xpath="//*[text()='Refresh']")
	public static WebElement resource_log_refresh_btn;

	//resource logs pop up close button
	@FindBy(how=How.XPATH,xpath=".//*[@id='resourceDetailsModal']//*[text()='Close'][1]")
	public static WebElement resource_log_close_btn;

	//resource logs pop up cross button
	@FindBy(how=How.XPATH,xpath=".//*[@id='resourceDetailsModal']//*[text()='×']")
	public static WebElement resource_log_cross_btn;

	//Logs button
	@FindBy(how=How.XPATH,xpath="//*[@uib-popover='View Logs']")
	public static WebElement resource_logs_btn;

	//Destroy button
	@FindBy(how=How.XPATH,xpath="//*[@uib-popover='Destroy']")
	public static WebElement resource_destroy_btn;

	//Yes destroy it
	@FindBy(how=How.XPATH,xpath="//*[text()='Yes destroy it!']")
	public static WebElement resource_yes_destroy_btn;
	
	//Destroy textbox
	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Do you want to destroy?')]/following::input[1]")
	public static WebElement resource_destroy_textbox;
	
	//Destroy submit button
	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Do you want to destroy?')]/following::button[2]")
	public static WebElement resource_destroy_submit;
	
	
    //Destroying                 
	@FindBy(how=How.XPATH,xpath="//*[@ng-if='sharedData.selectedEnv.createdBy==$root.loginUser.id && sharedData.selectedEnv.status == 'DESTROYING'']")
	public static WebElement resource_destroying;
	
	//Don't destroy it
	@FindBy(how=How.XPATH,xpath="//*[text()='Dont destroy it']")
	public static WebElement resource_dont_destroy_btn;

	//Stop
	@FindBy(how=How.XPATH,xpath="//*[@ng-click='stopDeployment(false)']")
	public static WebElement resource_stop_btn;

	//Yes stop it
	@FindBy(how=How.XPATH,xpath="//*[text()='Yes stop it!']")
	public static WebElement resource_yes_stop_btn;

	//Don't stop it
	@FindBy(how=How.XPATH,xpath="//*[text()='Dont stop it']")
	public static WebElement resource_dont_stop_btn;

	//Force Stop
	@FindBy(how=How.XPATH,xpath="//div[@ng-click='stopDeployment(true)']")
	public static WebElement resource_force_stop_btn;

	//Yes force stop it
	@FindBy(how=How.XPATH,xpath="//button[@ng-click='dialog.hide()']")
	public static WebElement resource_yes_force_stop_btn;

	//Don't force stop it
	@FindBy(how=How.XPATH,xpath="//button[@ng-click='dialog.abort()']")
	public static WebElement resource_dont_force_stop_btn;

	//Search for resource details attributes
	@FindBy(how=How.XPATH,xpath="//input[@placeholder='Search Resource Details']")
	public static WebElement resource_details_attribute_search_bar;

	//Search for attributes
	@FindBy(how=How.XPATH,xpath="//input[@placeholder='Search for attributes...']")
	public static WebElement resource_attribute_search_bar;

	//Search for packages
	@FindBy(how=How.XPATH,xpath="//input[@placeholder='Search for packages...']")
	public static WebElement resource_attribute_package_search_bar;

	//Resource details link on attributes window
	@FindBy(how=How.XPATH,xpath="//*[@id='sidebar-wrapper-right']//md-tab-item[3]//*[text()='Resource Details']")
	public static WebElement resource_rdetails_link;

	//element to find the id in resource details window
	@FindBy(how=How.XPATH, xpath="//*[text()='id']/following::*[1]/input")
	public static WebElement resource_details_id;

	//Resource link on attributes window
	@FindBy(how=How.XPATH,xpath="//*[@id='sidebar-wrapper-right']//md-tab-item[1]//*[text()='Resource']")
	public static WebElement resource_resourcelink;

	//element to find the arn value in resource details window
	@FindBy(how=How.XPATH, xpath="//*[text()='arn']/following::*[1]/input")
	public static WebElement resource_details_arn;



	@FindBy(how=How.XPATH, xpath="//*[@id='ResourceNameModal']/div/div/div[1]/button")
	public static WebElement resource_dragrnamecrossclose;

	//Resource name link on sidebar
	@FindBy(how=How.XPATH, xpath="//*[@ng-click='setResourceName()']")
	public static WebElement resource_editrnamelink;

	//Redeploy button
	@FindBy(how=How.XPATH,xpath="//*[@ng-click='deployEnv()']")
	public static WebElement resource_redeploy_btn;

	//dependsOn
	@FindBy(how=How.XPATH, xpath="//*[text()='Depends On']/following::*[1]/input")
	public static WebElement select_depends_on_value;

	@FindBy(how=How.XPATH,xpath="//*[text()='Connection']//following::*[@ng-model='sharedData.selectedResource.connectionId']")
	public static WebElement resource_connectiontxtbox;

	@FindBy(how=How.XPATH,xpath=".//*[@id='tab-content-2']//*[contains(text(),'PX_SSH')]")
	public static WebElement resource_connectionclick;

	@FindBy(how=How.XPATH,xpath="//div[@class=' ace_editor ace-jsoneditor']//textarea")
	public static WebElement select_text_area_for_json;

	@FindBy(how=How.XPATH, xpath="//*[@ng-click='closeSetJsonModal()']")
	public static WebElement json_set_value;

	@FindBy(how=How.XPATH, xpath="//*[text()='subnets']/following::*[text()='Set Array'][1]")
	public static WebElement click_subnet_set_array;

	@FindBy(how=How.XPATH, xpath="//*[text()='Resources']//following::*[text()='Packages'][1]")
	public static WebElement package_link;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='Resource']/following::*[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple'][1]")
	public static WebElement package_linkrightsidebar;

	@FindBy(how=How.XPATH, xpath="//*[@ng-click='closeSetArrayModal()']")
	public static WebElement array_setValueButton;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='setArrayModal']/div/div/div[2]/div/div[2]/div")
	public static WebElement select_text_area_for_propagation;
	
	@FindBy(how=How.XPATH, xpath="//*[@ng-click='closeSetArrayModal()']")
	public static WebElement array_set_value;
	
	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Set String value for: ')]/following::*[@class='ace_content']")
	public static WebElement select_text_area_for_settext;
	
	@FindBy(how=How.XPATH,xpath="//*[@ng-click='closeSetStringModal()']")
	public static WebElement setvalue_for_settext;
	
	@FindBy(how=How.XPATH, xpath="//*[@ng-click='closeSetStringModal()']")
	public static WebElement string_setValueButton;
}