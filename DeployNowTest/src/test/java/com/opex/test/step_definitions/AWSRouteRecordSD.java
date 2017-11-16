package com.opex.test.step_definitions;



import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSRoute53RecordPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.pageobjects.AWSRoute53RecordPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSRouteRecordSD extends SuperUsedDefinition  {
	
	public AWSRouteRecordSD()
    {
		super();  	
    }
	
	@And("^User enter Route Record resource name$")
	public void User_enter_Route_Record_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver, dnowRouteRecord.getRrouterecord_rname()); 
	}
	
	@Then("^User search or create environment for Route Record and see message as environment created successfully$")
	public void User_search_or_create_environment_for_Route_Record_and_see_message_as_environment_created_successfully() throws Throwable {
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSRouteRecordSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver,env_name); 
	}

	@When("^User click Route Record resource and drag on the dashboard$")
	public void User_click_Route_Record_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver, AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.dragdroproute_record(driver);
	}

	@When("^User click on Route Record resource$")
	public void User_click_on_Route_Record_resource() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		CommonFunctionalityPageAction.clickOnResource(driver, dnowRouteRecord.getRrouterecord_rname());
	}


	@Then("^User click on set array for Route Record$")
	public void User_click_on_set_array_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.ResourceSetarray(driver,dnowRouteRecord.getRouterecordR_record());
	}

	@Then("^User enter ttl for Route Record$")
	public void user_enter_ttl_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		AWSRoute53RecordPageAction.Resourcettl(driver,dnowRouteRecord.getRouterecordR_ttl());
	}
	@Then("^User enter type for Route Record$")
	public void User_enter_type_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		AWSRoute53RecordPageAction.Resourcetype(driver,dnowRouteRecord.getRouterecordR_type());
	}

	@Then("^User enter zone id for Route Record$")
	public void i_enter_zone_id_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		AWSRoute53RecordPageAction.Resourcezoneid(driver,dnowRouteRecord.getRouterecordR_zoneid());
	}

	@Then("^User delete Route Record environment and see message environment deleted sucessfully$")
	public void User_delete_Route_Record_environment_and_see_message_environment_deleted_sucessfully() throws Throwable {
		String className = AWSRouteRecordSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.environmentDropdown(driver);
		EnvironmentPageAction.deleteEnvironment1(driver,env_name);
	}
	@And("^User enter depends on for Route Record$")
	public void user_enter_depends_on_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnowRouteRecord.getRrouterecord_dependson());
	}

	@And("^User enter alias for Route Record$")
	public void user_enter_alias_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.alias(driver,dnowRouteRecord.getRrouterecord_alias());
	}

	@And("^User enter continent for Route Record$")
	public void user_enter_continent_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.continent(driver,dnowRouteRecord.getRrouterecord_continent());
	}

	@And("^User enter country for Route Record$")
	public void user_enter_country_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.country(driver,dnowRouteRecord.getRrouterecord_country());
	}

	@And("^User enter evaluate_target_health for Route Record$")
	public void user_enter_evaluate_target_health_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.evaluate_target_health(driver,dnowRouteRecord.getRrouterecord_evaluate_target_health());
	}

	@And("^User enter failover_routing_policy for Route Record$")
	public void user_enter_failover_routing_policy_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.failover_routing_policy(driver,dnowRouteRecord.getRrouterecord_failover_routing_policy());
	}

	@And("^User enter geolocation_routing_policy for Route Record$")
	public void user_enter_geolocation_routing_policy_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.geolocation_routing_policy(driver,dnowRouteRecord.getRrouterecord_geolocation_routing_policy());
	}

	@And("^User enter health_check_id for Route Record$")
	public void user_enter_health_check_id_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.health_check_id(driver,dnowRouteRecord.getRrouterecord_health_check_id());
	}

	@And("^User enter latency_routing_policy for Route Record$")
	public void user_enter_latency_routing_policy_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.latency_routing_policy(driver,dnowRouteRecord.getRrouterecord_latency_routing_policy());
	}

	@And("^User enter region for Route Record$")
	public void user_enter_region_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.region(driver,dnowRouteRecord.getRrouterecord_region());
	}

	@And("^User enter set_identifier for Route Record$")
	public void user_enter_set_identifier_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.set_identifier(driver,dnowRouteRecord.getRrouterecord_set_identifier());
	}

	@And("^User enter subdivision for Route Record$")
	public void user_enter_subdivision_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.subdivision(driver,dnowRouteRecord.getRrouterecord_subdivision());
	}

	@And("^User enter weight for Route Record$")
	public void user_enter_weight_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.weight(driver,dnowRouteRecord.getRrouterecord_weight());
	}

	@And("^User enterweighted_routing_policy for Route Record$")
	public void user_enterweighted_routing_policy_for_Route_Record() throws Throwable {
		PageFactory.initElements(driver,  AWSRoute53RecordPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRoute53RecordPageAction.weighted_routing_policy(driver,dnowRouteRecord.getRrouterecord_weighted_routing_policy());
	}


}
