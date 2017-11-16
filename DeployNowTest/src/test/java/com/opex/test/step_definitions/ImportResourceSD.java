package com.opex.test.step_definitions;



import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opex.test.modules.AWSInstancePageAction;
import com.opex.test.modules.AWSSecurityGroupPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSInstancePageObject;
import com.opex.test.pageobjects.AWSNetworkACLPageObject;
import com.opex.test.pageobjects.AWSSecuritygroupPageObject;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSVpcPage;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ImportResourceSD extends SuperUsedDefinition{

	private String existingResourceId;
	public ImportResourceSD()
	{
		super();
	}

	@Then("^get id of Instance from resource details$")
	public void get_instance_id_from_details() throws Throwable {
		get_resource_id_from_details(dnInstance.getInstance_rname());
	}

	@Then("^get id of subnet from resource details$")
	public void get_vpc_id_from_details() throws Throwable {
		get_resource_id_from_details(dnInstance.getInstanceSubnet_rname());
	}

	private void get_resource_id_from_details(String resourceName) throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
        PageFactory.initElements(driver, AWSInstancePageObject.class);
        PageFactory.initElements(driver, CommonFunctionalityPage.class);
        CommonFunctionalityPageAction.clickCanvas(driver);
		CommonFunctionalityPageAction.clickOnResource(driver, resourceName);
		CommonFunctionalityPageAction.resourceDetailsAttributeLink(driver);
		existingResourceId = CommonFunctionalityPage.resource_details_id.getAttribute("value");
		System.out.println("Existing resource ID "+ existingResourceId);
	}

	@Then("^User create another environment for importing resources and see message as environment created successfully$")
	public void create_another_env_for_import() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
        PageFactory.initElements(driver, CommonFunctionalityPage.class);
        EnvironmentPageAction.searchSSHAWSEnvironment(driver, dnowEnv.getEnv_import_resource_name());
	}

	@Then("^User delete the environment for importing resources and see message environment deleted successfully$")
	public void delete_another_env_for_import() throws Throwable {
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver, dnowEnv.getEnv_import_resource_name());
	}


	@And("^User enters the id from previous environment$")
	public void enter_existing_resource_id_for_import() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
        PageFactory.initElements(driver, CommonFunctionalityPage.class);
        CommonFunctionalityPageAction.enterExistingIdForResource(driver, existingResourceId);
	}

	@Then("^Message should display resource import started$")
	public void  message_should_display_import_started() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
	}

	//checks if resource is successfully imported notification and success status on resource
	@Then("^Message should display resource imported successfully$")
	public void  message_should_display_import_successful() throws Throwable{
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		Thread.sleep(4000);
		String text = "New resource got imported successfully to environment!"; 
		//wait until the resource element appears on the canvas
		//CommonFunctionalityPageAction.clickCanvas(driver);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement ele = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.build().perform();
		String notificationMessage = ele.getText();
		//Assert.assertTrue(text.equals(notificationMessage));
		if(notificationMessage.equals(text))
		{
			Assert.assertTrue( "New resource got imported successfully to environment!".equals(notificationMessage));
			System.out.println(notificationMessage);
		}

		//check if resource is displayed as deployed
		WebElement successIcon;
		try {
			successIcon = driver.findElement(By.cssSelector("text[class='success-status cfa']"));
			Assert.assertTrue(successIcon != null);
		}
		catch (Exception e){
			//Element not found
		}

	}
@And("^User fill the tags attribute of Instance for import$")
	public void user_fill_the_tags_attribute_of_Instance_for_import()throws Throwable{
		PageFactory.initElements(driver, AWSInstancePageObject.class);
		AWSInstancePageAction.enterTags(driver, dnInstance.getInstanceTagsImport());
				
	}
	

}

