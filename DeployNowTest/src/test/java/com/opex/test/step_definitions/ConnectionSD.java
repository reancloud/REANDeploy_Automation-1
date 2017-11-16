package com.opex.test.step_definitions;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.ConnectionPageAction;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.ConnectionPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConnectionSD extends SuperUsedDefinition {

	public ConnectionSD()
	{
		super();
	}


	@When("^User select connections from drop down$")
	public void user_select_connections_from_dropdown() throws Throwable {

		PageFactory.initElements(driver, ConnectionPage.class);
		ConnectionPageAction.Execute(driver);

	}
	@Then("^User click on add button on connection page1$")
	public void user_click_on_new_button_on_connection_page() throws Throwable {
		ConnectionPageAction.addButtonConnection(driver);
	}

	@And("^User create new connection with blank data$")
	public void user_create_new_connection_with_blank_data() throws Throwable{
		ConnectionPageAction.newConnection(driver,dncon.getCon_BlankData(), dncon.getCon_BlankData(), dncon.getCon_BlankData());
	}

	@Then("^User creates/sees another ssh connection$")
	public void user_creates_or_finds_another_ssh_connection() throws Throwable {
		PageFactory.initElements(driver, ConnectionPage.class);
		ConnectionPageAction.Execute(driver);
		WebElement elem = ConnectionPageAction.findConnectionByName(driver, dncon.getAnother_con_name());
		if(elem == null) {
			ConnectionPageAction.newConnection(driver,dncon.getAnother_con_name(), dncon.getCon_user(), dncon.getCon_key());
			ConnectionPageAction.performSaveClick(driver);
		}
	}

	@When("^User select edit button for SSH type from connection page$")
	public void user_select_edit_button_for_SSH_type_from_connection_page() throws Throwable {
		PageFactory.initElements(driver, ConnectionPage.class);
		ConnectionPageAction.performEditClickSSH(driver,dncon.getCon_name_winrm(), dncon.getCon_user(),dncon.getCon_name());
	}

	@When("^User select edit button for WinRM type from connection page$")
	public void user_select_edit_button_for_WinRM_type_from_connection_page() throws Throwable {
		PageFactory.initElements(driver, ConnectionPage.class);
		ConnectionPageAction.performEditClickSSH(driver,dncon.getCon_name(), dncon.getCon_user(),dncon.getCon_name());
	}


	@Then("^User click on save button in connection page$")
	public void uesr_click_on_save_button_in_connection_page() throws Throwable {
		PageFactory.initElements(driver, ConnectionPage.class);
		ConnectionPageAction.performSaveClick(driver);
	}

	@And("^User select add button for SSH from connection page$")
	public void user_select_new_button_for_SSH_from_connection_page() throws Throwable {
		PageFactory.initElements(driver, ConnectionPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		ConnectionPageAction.connectionSSH(driver, dncon.getCon_name(), dncon.getCon_user(), dncon.getCon_key());
	}
	@And("^User select add button for WinRM from connection page$")
	public void user_select_new_button_for_WinRM_from_connection_page() throws Throwable {
		PageFactory.initElements(driver, ConnectionPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		ConnectionPageAction.connectionWinRM(driver, dncon.getCon_name_winrm(), dncon.getCon_user(), dncon.getCon_key_winrm(), dncon.getCon_typeWINRM());
	}

	@Then("^User select remove SSH button from connection page$")
	public void user_select_remove_SSH_button_from_connection_page() throws Throwable {

		ConnectionPageAction.performRemoveConnectionSSH(driver,dncon.getCon_name());
	}

	@Then("^User select remove WinRM button from connection page$")
	public void user_select_remove_WinRM_button_from_connection_page() throws Throwable {

		ConnectionPageAction.performRemoveConnectionSSH(driver,dncon.getCon_name_winrm());
	}


	@Then("User check for scroll bar on connection page")
	public void user_check_for_scroll_bar_on_connection_page() throws Throwable{

		ConnectionPageAction.connectionScrollBar(driver);

	}

	@And("User enter connection name on connection page")
	public void user_enter_connection_name_on_connection_page() throws Throwable{

		ConnectionPageAction.connectionName(driver,dncon.getCon_name());

	}

	@And("User enter connection user on connection page")
	public void user_enter_connection_user_on_connection_page() throws Throwable{

		ConnectionPageAction.connectionUser(driver,dncon.getCon_user());

	}

	@And("User enter connection pwd on connection page")
	public void user_enter_connection_pwd_on_connection_page() throws Throwable{

		ConnectionPageAction.connectionPassword(driver,dncon.getCon_pwd());

	}

	@And("User enter connection key on connection page")
	public void user_enter_connection_key_on_connection_page() throws Throwable{

		ConnectionPageAction.connectionSSHKey(driver,dncon.getCon_key());

	}

	@And("User enter connection type winrm on connection page")
	public void user_enter_connection_type_winrm_on_connection_page() throws Throwable{

		ConnectionPageAction.connectionType(driver, dncon.getCon_typeWINRM());

	}

	@When("User click on connection key check box on connection page")
	public void user_click_on_connection_key_check_box_on_connection_page() throws Throwable{

		ConnectionPageAction.connectionSSHKeyCheckBox(driver);

	}


}