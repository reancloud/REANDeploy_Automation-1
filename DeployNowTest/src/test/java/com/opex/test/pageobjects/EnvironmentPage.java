package com.opex.test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnvironmentPage extends BaseClass{

	public EnvironmentPage(WebDriver driver) {
		super(driver);
		
	}
	
	//dropdown button at environment
	@FindBy(how=How.XPATH,xpath="//*[@name='env-search']")
	public static WebElement environment_dropdown;
	
	@FindBy(how=How.XPATH,xpath="//div[@id='canvas']")
	public static WebElement canvas;
	
	@FindBy(how=How.XPATH,xpath=".//li[@id='more-dropdown']")
	public static WebElement MoreOptions;
	
	//@FindBy(how=How.XPATH,xpath=".//*[@name='env-search']")
	//public static WebElement search_env;
	
	//create button
	@FindBy(how=How.XPATH, xpath="//*[@uib-popover='Create']")
	public static WebElement create_Button;
	
	//name
	@FindBy(how=How.XPATH, xpath="//input[@ng-model='newEnv.name']")
	public static WebElement create_environment_name;
	
	//description
	@FindBy(how=How.XPATH, xpath="//textarea[@ng-model='newEnv.description']")
	public static WebElement create_environment_description;
	
	//connection
	@FindBy(how=How.XPATH, xpath="//select[@ng-model='newEnv.connectionId']")
	public static WebElement create_environment_connection;
	
	//provider 
	@FindBy(how=How.XPATH, xpath="//*[@id='EnvProviderEntered'][2]")								 
	public static WebElement create_environment_provider;

	//region
	@FindBy(how=How.XPATH, xpath="//*[@id='EnvAwsRegion']")
	public static WebElement create_aws_region;
	
	@FindBy(how=How.XPATH, xpath=".//*[contains(text(),'PX_DigitalOcean')]")
	public static WebElement environment_digitalOcean_provider;
	
	@FindBy(how=How.XPATH, xpath=".//*[contains(text(),'PX_Vsphere')]")
	public static WebElement environment_Vsphere_provider;

	@FindBy(how=How.XPATH, xpath="//*[text()='PX_Docker']")
	//.//*[contains(text(),'Docker')]")
	public static WebElement environment_docker_provider;

	@FindBy(how=How.XPATH, xpath=".//*[contains(text(),'PX_Azure')]")
	public static WebElement environment_Azure_provider;

	//@FindBy(how=How.XPATH, xpath=".//*[contains(text(),'Auto_AWS')]")
	@FindBy(how=How.XPATH, xpath="//*[@id='EnvProviderEntered']/following::*[text()='Auto_AWS'][1]")
	public static WebElement environment_AWS_provider;
	
	//create button on create environment page
	@FindBy(how=How.XPATH, xpath="//button[@ng-click='createEnv()']")
	public static WebElement create_environment_create_click;
	
	//close button on create environment page
	@FindBy(how=How.XPATH, xpath="//*[@id='CreateEnvModal']/div/div/div[3]/button[2]")
	public static WebElement create_environment_close_click;

	@FindBy(how=How.XPATH,xpath="//spam[text()='PX_SSH_AWS_ENVI']")
	//spam[text()='PX_SSH_Azure']
	public static WebElement environment_To_Modify;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='more-dropdown']//following::a[text()='Copy']")
	public static WebElement create_environment_copybutton_click;
	
	@FindBy(how=How.XPATH,xpath="//*[@id='EnvSelectorMenu']//*[contains(text(),'PX_SSH_AWS_ENVI')]/following::i[2]")
			//"//*[@id='EnvSelectorMenu']/li/a/div/i[2]")
	public static WebElement create_environment_delete;
	
	@FindBy(how=How.XPATH,xpath="//spam[text()='MagentoWebStore']")
	public static WebElement choose_environment_resource;

	@FindBy(how=How.XPATH, xpath="//span[text()='Yes']")
    public static WebElement delete_yessearch_env;
    
	@FindBy(how=How.XPATH, xpath="//span[text()='No']")
    public static WebElement delete_nosearch_env;
	
	//Yes destroy it
		@FindBy(how=How.XPATH,xpath="//*[text()='Yes destroy it!']")
		public static WebElement resource_yes_destroy_btn;
		
		@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Do you want to export the Environment?')]/following::button[1]")
		public static WebElement doYouWantToExportNo;
		
		@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Do you want to export the Environment?')]/following::button[2]")
		public static WebElement doYouWantToExport_yes;
		
		@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Do you want to export the environment as Blueprint environment?')]")
		public static WebElement ExportAsBluePrint;
		
		@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Do you want to export the environment as Blueprint environment?')]/following::button[2]")
		public static WebElement ExportAsBluePrint_yes;
		
		@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Do you want to export the environment as Blueprint environment?')]/following::button[1]")
		public static WebElement ExportAsBluePrint_no;


//Xpath for import
		
		@FindBy(how=How.XPATH,xpath="//*[@id='more-dropdown']//following::a[text()='Import']")
		public static WebElement importButton;
		
		@FindBy(how=How.XPATH,xpath="//*[@id='PrepareImportEnvModal']//*[@class='close']")
		public static WebElement importCrossButton;
		
		@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Import Environment/Blueprint')]/following::button[1]")
		public static WebElement importCancelButton;
		
		@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Select File')]/following::*[text()='Upload']")
		public static WebElement importUploadButton;
				
		@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Select File')]/following::input[1]")
		public static WebElement importChooseFileButton;
		
		@FindBy(how=How.XPATH,xpath="//*[text()='Start Import']")
		public static WebElement importStartImportButton;
		
		@FindBy(how=How.XPATH,xpath="//*[@ng-click='importEnv()']")
		public static WebElement importImportButton;
		
		@FindBy(how=How.XPATH,xpath="//*[text()='Import ALL']")
		public static WebElement importALLButton;

		//Xpath for edit

		@FindBy(how=How.XPATH,xpath="//*[@id='more-dropdown']//following::a[text()='Edit']")
		public static WebElement editButton;

		@FindBy(how=How.XPATH,xpath="//*[@id='editEnvModal']//*[@class='close']")
		public static WebElement editCrossButton;

		//edit name
		@FindBy(how=How.XPATH, xpath="//*[@id='editEnvModal']//input[@ng-model='sharedData.selectedEnv.name']")
		public static WebElement edit_environment_name;

		//edit description
		@FindBy(how=How.XPATH, xpath="//*[@id='editEnvModal']//textarea[@ng-model='sharedData.selectedEnv.description']")
		public static WebElement edit_environment_description;

		//edit connection
		@FindBy(how=How.XPATH, xpath="//*[@id='editEnvModal']//select[@ng-model='sharedData.selectedEnv.connectionId']")
		public static WebElement edit_environment_connection;

		//edit provider
		@FindBy(how=How.XPATH, xpath="//*[@id='editEnvModal']//*[@ng-model='sharedData.selectedEnv.provider'][2]")								 
		public static WebElement edit_environment_provider;

		//edit region
		@FindBy(how=How.XPATH, xpath="//*[@id='editEnvModal']//*[@id='EnvAwsRegion']")
		public static WebElement edit_aws_region;

		@FindBy(how=How.XPATH,xpath="//*[@id='editEnvModal']//button[contains(@class, 'rean-btn-secondary')]")
		public static WebElement editCancelButton;

		@FindBy(how=How.XPATH,xpath="//*[@id='editEnvModal']//button[text()='UPDATE']")
		public static WebElement editUpdateButton;

}