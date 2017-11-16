package com.opex.test.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.BastionConnectionPageAction;
import com.opex.test.modules.ConnectionPageAction;
import com.opex.test.pageobjects.BastionHostPageObject;
import com.opex.test.pageobjects.ConnectionPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BastionConnectionSD extends SuperUsedDefinition{
   
	public BastionConnectionSD ()
	{
		super();
	}
	@When("^User select connections link from drop down$")
	public void user_select_connections_link_from_drop_down() throws Throwable {
		
		PageFactory.initElements(driver, BastionHostPageObject.class);
		BastionConnectionPageAction.LinkExecute(driver);
		
	}
	@And("User select bastion connection link in the connection page")
	public void user_select_bastion_connection_link_in_the_connection_window() throws Throwable{
		
		BastionConnectionPageAction.ClickBastionConnection(driver);
			
	}
	@And("User enter user on bastion connection page")
	public void user_enter_user_on_bastion_connection_page() throws Throwable{
		String user=dnbastionattributes.getusername();
		BastionConnectionPageAction.EnterBastionUser(driver, user);
			
	}
	@And("User enter host on bastion connection page")
	public void user_enter_host_on_bastion_connection_page() throws Throwable{
		
		String host=dnbastionattributes.getHost();
		
		BastionConnectionPageAction.EnterBastionHost(driver, host);
		
		
			
	}
	@And("User enter port on bastion connection page")
	public void user_enter_port_on_bastion_connection_page() throws Throwable{
		
	String port=dnbastionattributes.getport();
	
	BastionConnectionPageAction.EnterBastionPort(driver, port);
			
	}
	@And("User enter key on bastion connection page")
	public void user_enter_key_on_bastion_connection_page() throws Throwable{
		
		String key=dnbastionattributes.getbastionkey();
		BastionConnectionPageAction.EnterBastionKey(driver, key);	
	}
	@Then("user click the set parameter button on connection page")
	public void user_click_the_set_parameter_button_on_connection_page() throws Throwable{
		
		BastionConnectionPageAction.ClickSetParameterButton(driver);
		
			
	}
	@And("User fill the attributes for the bastion connection page")
	public void user_fill_the_attributes_for_the_bastion_connection_page() throws Throwable{
		
		
		BastionConnectionPageAction.FillAttributes(driver, " ", " ", " ", " ");	
	}
	
	@And("User click the cross button on bastion connection page")
	public void user_click_the_cross_button_on_bastion_connection_page() throws Throwable{
		
		
		BastionConnectionPageAction.ClickCrossButton(driver);
	}
	
	
}
