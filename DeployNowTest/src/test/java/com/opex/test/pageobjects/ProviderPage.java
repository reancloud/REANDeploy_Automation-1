package com.opex.test.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class ProviderPage extends BaseClass{

	public ProviderPage(WebDriver driver){
		super(driver);
	}    
	

	@FindBy(how=How.XPATH, xpath="//h4[text()='Provider']")
	public static WebElement assert_providerPage;
	
	@FindBy(how=How.XPATH, xpath="//*[@id='simple-dropdown']/following::a[text()='Providers']")
  	public static WebElement provider_selection;
	
	@FindBy(how=How.XPATH, xpath=".//tr[contains(.,'DO ')]/td[3]/button[1]")
	public static WebElement edit_click;

	@FindBy(how=How.XPATH, xpath=".//button[text()='Save']")
	public static WebElement save_click;
	
	
	@FindBy(how=How.XPATH, xpath=".//button[text()='Update']")
	public static WebElement update_click;

	@FindBy(how=How.XPATH, xpath="//button[@ng-click='newProvider()']")
			//.//button[text()='New']")
	public static WebElement new_click;

	@FindBy(how=How.XPATH, xpath=".//input[@ng-model='provider.name']")
	public static WebElement provider_name;

	@FindBy(how=How.XPATH, xpath="//*[@ng-model='selectedProviderType'][2]")
			// ".//input[@ng-model='selectedProviderType'][2]")
	public static WebElement provider_type_click;

	@FindBy(how=How.XPATH, xpath=".//tr[contains(.,'TestProvider ')]/td[3]/button[2]")
	public static WebElement delete_click;	
	
	@FindBy(how=How.XPATH,xpath="//div[@class=' ace_editor ace-jsoneditor']//textarea")
	public static WebElement provider_details_textarea;

	@FindBy(how=How.XPATH, xpath="//button[contains(@class,'format')]")
	public static WebElement provider_details_format_click;

	@FindBy(how=How.XPATH, xpath="//button[contains(@class,'compact')]")
	public static WebElement provider_details_compact_click;

	@FindBy(how=How.XPATH, xpath="//button[contains(@class,'modes separator')]")
	public static WebElement provider_details_mode_dropdown;

	@FindBy(how=How.XPATH, xpath="//div[@title='Search fields and values']")
	public static WebElement provider_details_search;

	@FindBy(how=How.XPATH, xpath="//div[@class='field highlight']")
	public static WebElement provider_details_search_highlight;

	@FindBy(how=How.XPATH, xpath="//table/tbody/tr/td[4]/div[@contenteditable='true']")
	public static WebElement provider_details_aws_accesskey;

	@FindBy(how=How.XPATH, xpath="//div/div[2]//tr[3]/td[3]/table//td[4]/div")
	public static WebElement provider_details_aws_secretkey;

	@FindBy(how=How.XPATH, xpath="//html/body/div[1]/div/div/div/section[2]/div/md-content/table/tbody/tr[last()]")
	public static WebElement provider_scroll_scrollbar;
	
	 @FindBy(how=How.XPATH, xpath="//*[text()='Providers List']/following::*[@class='ng-binding']")
	 		//+ "//*[@class='layout-padding']//*[@class='table table-striped']")
	public static WebElement providerlist;

	 @FindBy(how=How.XPATH, xpath="//h2[contains(text(),'Are you sure?')]/following::span[text()='Yes!']")
		public static WebElement remove_click_yes;
	 
	 @FindBy(how=How.XPATH, xpath="//h2[contains(text(),'Are you sure?')]")
	 public static WebElement remove_click_textbox;
	 
	 @FindBy(how=How.XPATH, xpath="//h2[contains(text(),'Are you sure?')]/following::span[text()='Cancel']")
	 	public static WebElement remove_click_cancle;
}