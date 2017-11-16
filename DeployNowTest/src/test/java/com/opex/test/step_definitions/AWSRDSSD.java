package com.opex.test.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.AWSSubnetGroupPageAction;
import com.opex.test.modules.AWSInternetGatewayPageAction;
import com.opex.test.modules.CommonFunctionalityPageAction;
import com.opex.test.modules.EnvironmentPageAction;
import com.opex.test.modules.AWSSubnetPageAction;
import com.opex.test.modules.AWSRDSPageAction;
import com.opex.test.modules.AwsS3BucketPageAction;
import com.opex.test.modules.AWSVpcPageAction;
import com.opex.test.modules.SignInAction;
import com.opex.test.pageobjects.AWSELBPageObject;
import com.opex.test.pageobjects.AWSIAMGroupPageObject;
import com.opex.test.pageobjects.AWSInternetGatewayPageObject;
import com.opex.test.pageobjects.CommonFunctionalityPage;
import com.opex.test.pageobjects.EnvironmentPage;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.AWSSubnetPageObject;
import com.opex.test.pageobjects.AWSSubnetgroupPageObject;
import com.opex.test.pageobjects.AWSRDSPageObject;
import com.opex.test.pageobjects.AWSS3BucketPage;
import com.opex.test.pageobjects.AWSVpcPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AWSRDSSD extends SuperUsedDefinition{

	public  AWSRDSSD() {
		super();
	}	
	@Then("^we select vpc resource and entered attribute values for RDS$")
	public void we_select_vpc_resource_and_entered_attribute_values_for_RDS() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
        PageFactory.initElements(driver, AWSVpcPage.class);
    	PageFactory.initElements(driver, CommonFunctionalityPage.class);
    	CommonFunctionalityPageAction.resourceDragDrop(driver,AWSVpcPage.resource_vpc);
        CommonFunctionalityPageAction.enterResourceName(driver,dnRDS.getrds_vpc_rname());
        CommonFunctionalityPageAction.resourceCreateBtn(driver);
        CommonFunctionalityPageAction.clickOnResource(driver, dnRDS.getrds_vpc_rname()); 
        AWSVpcPageAction.vpcCidrBlock(driver,dnRDS.getrds_vpc_cidrblock()); 
        AWSVpcPageAction.selectEnableDnsHostnamesValue(driver, dnRDS.getrds_vpc_enable_dns_hostnames());
        AWSVpcPageAction.selectEnableDnsSupportValue(driver, dnRDS.getrds_vpc_enable_dns_support());
	}

	@Then("^we select subnet resource and entered attribute values for RDS$")
	public void we_select_subnet_resource_and_entered_attribute_values_for_RDS() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnRDS.getrds_subnet1_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		//CommonFunctionalityPageAction.clickOnResource(driver, dnRDS.getrds_subnet1_rname());
		AWSSubnetPageAction.ResourcePassvariable(driver,dnRDS.getrds_subnet1_cidr_block(),dnRDS.getrds_subnet1_vpc_id(),"","",dnRDS.getrds_subnet1_availibility_zone());
	}

	@Then("^we again select subnet resource and entered attribute values for RDS$")
	public void we_again_select_subnet_resource_and_entered_attribute_values_for_RDS() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetPageObject.class);
		PageFactory.initElements(driver, EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSSubnetPageAction.ResourceSelectsubnet(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnRDS.getrds_subnet2_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		//CommonFunctionalityPageAction.clickOnResource(driver, dnRTA.getRTA_subnet_rname());
		AWSSubnetPageAction.ResourcePassvariable(driver,dnRDS.getrds_subnet2_cidr_block(),dnRDS.getrds_subnet2_vpc_id(),"","",dnRDS.getrds_subnet2_availibility_zone()); 
	}

	@Then("^we select subnetgroup resource and entered attribute values for RDS$")
	public void we_select_subnetgroup_resource_and_entered_attribute_values_for_RDS() throws Throwable {
		PageFactory.initElements(driver, AWSSubnetgroupPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class); 
		AWSSubnetGroupPageAction.Dragdropsubnetgroup(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnRDS.getrds_subnetgroup_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSSubnetGroupPageAction.enterDescriptionForSubnetGroup(driver, dnRDS.getrds_subnetgroup_description());
		AWSSubnetGroupPageAction.enterSubnetIdForSubnetGroup(driver, dnRDS.getrds_subnetgroup_ids());
		//AWSSubnetGroupPageAction.ResourcePassdata(driver,dnRDS.getrds_subnetgroup_description(),dnRDS.getrds_subnetgroup_name(),dnRDS.getrds_subnetgroup_ids(),"","");
		
	}

	@Then("^we select internet gateway resource and entered attribute values for RDS$")
	public void we_select_internet_gateway_resource_and_entered_attribute_values_for_RDS() throws Throwable {
		PageFactory.initElements(driver,AWSInternetGatewayPageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver,CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSIAMGroupPageObject.class);
		AWSInternetGatewayPageAction.selectIGW(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnRDS.getrds_igw_rname());
		CommonFunctionalityPageAction.resourceCreateBtn(driver);
		AWSInternetGatewayPageAction.vpcTextBoxIGW(driver, dnRDS.getrds_igw_vpc_id());
	}

	
	@Then("^we search RDS env$")
	public void we_search_RDS_env() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		String className = AWSRDSSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;
		EnvironmentPageAction.searchSSHAWSEnvironment(driver, env_name);  
	}

	@Then("^We delete env for RDS$")
	public void we_delete_env_for_RDS() throws Throwable {
		String className = AWSRDSSD.class.getSimpleName();
		String env_name = dnowEnv.getEnv_name()+className;	
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver,EnvironmentPage.class);
		EnvironmentPageAction.deleteEnvironment(driver,env_name);
	}

	@Given("^we click RDS resource and drag on the dashboard$")
	public void we_click_RDS_resource_and_drag_on_the_dashboard() throws Throwable {
		PageFactory.initElements(driver,EnvironmentPage.class);
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		AWSRDSPageAction.clickRDSResourceAndDrop(driver);
	}

	@When("^we enter RDS resource name$")
	public void we_enter_RDS_resource_name() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		//R_RDS_SSH_AWSPageAction.enterRName(driver);
		CommonFunctionalityPageAction.enterResourceName(driver,dnRDS.getrds_rname());
	}

	@When("^we enter blank RDS resource name$")
	public void we_enter_blank_RDS_resource_name() throws Throwable {

		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterResourceName(driver," ");
	}

	@Then("^we click on resource RDS$")
	public void we_click_on_resource_RDS() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		//R_RDS_SSH_AWSPageAction.clickRDSResource(driver);
		CommonFunctionalityPageAction.clickOnResource(driver,dnRDS.getrds_rname());

	}
	@Then("^we enter dependson for rds$")
	public void we_enter_dependson_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.enterDependsOnValue(driver, dnRDS.getrds_depends_on());
	}

	@Then("^we select connection for rds$")
	public void we_select_connection_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.selectConnection(driver, dnRDS.getrds_connection());
	}

	@Then("^we enter availibilty zone for rds$")
	public void we_enter_availibilty_zone_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		AWSRDSPageAction.rdsAvailibilityZone(driver,dnRDS.getrds_availibilty_zone());
	}

	@Then("^we enter backup window for rds$")
	public void we_enter_backup_window_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		AWSRDSPageAction.rdsBackup_window(driver,dnRDS.getrds_backup_window());
	}

	@Then("^we enter copy tags to snapshots for rds$")
	public void we_enter_copy_tags_to_snapshots_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		AWSRDSPageAction.rdsCopy_tag_snapshot(driver,dnRDS.getrds_copy_tags_to_snapshots());
	}

	@Then("^we enter db subnetgroup name for rds$")
	public void we_enter_db_subnetgroup_name_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		AWSRDSPageAction.rdsDb_subnetgroup_name(driver,dnRDS.getrds_db_subnetgroup_name()); 
	}

	@Then("^we enter final snapshot identifier for rds$")
	public void we_enter_final_snapshot_identifier_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		AWSRDSPageAction.rdsFinal_snapshot_identifier(driver,dnRDS.getrds_final_snapshot_identifier()); 
	}

	@Then("^we enter iops for rds$")
	public void we_enter_iops_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		AWSRDSPageAction.rdsIops(driver,dnRDS.getrds_iops()); 
	}

	@Then("^we enter license model for rds$")
	public void we_enter_license_model_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		AWSRDSPageAction.rdsLicense_model_(driver,dnRDS.getrds_license_model());
	}

	@Then("^we enter parameter group name for rds$")
	public void we_enter_parameter_group_name_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		AWSRDSPageAction.rdsParameter_group_name(driver,dnRDS.getrds_parameter_group_name());
	}

	@Then("^we enter vpc security group ids for rds$")
	public void we_enter_vpc_security_group_ids_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		AWSRDSPageAction.rdsVPCsecuritygroup_ids(driver,dnRDS.getrds_vpc_security_group_ids());
	}
	@Then("^we enter allocated storage value rds$")
	public void we_enter_allocated_storage_value_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsAllocatedStorage1(driver,dnRDS.getrds_allocated_storage());

	}

	@Then("^we select engine rds$")
	public void we_select_engine_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsEngine(driver,dnRDS.getrds_engine());

	}

	@Then("^we enter identifier value rds$")
	public void we_enter_identifier_value_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsIdentifier(driver,dnRDS.getrds_identifier());

	}

	@Then("^we select instance class for rds$")
	public void we_select_instance_class_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsInstanceClass(driver,dnRDS.getrds_instance_class());
	}

	@Then("^we enter name for rds$")
	public void we_enter_name_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsname1(driver,dnRDS.getrds_name());

	}

	@Then("^we enter engine version for rds$")
	public void we_enter_engine_version_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsEngineVersion(driver,dnRDS.getrds_engine_version());

	}

	@Then("^we select multiaz value for rds$")
	public void we_select_multiaz_value_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsMultipleAz(driver,dnRDS.getrds_multi_az());
	}

	@Then("^we enter password for rds$")
	public void we_enter_password_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsPassword1(driver,dnRDS.getrds_password());

	}

	@Then("^we enter port for rds$")
	public void we_enter_port_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsPort(driver,dnRDS.getrds_port());
	}

	@Then("^we select publicly accessible for rds$")
	public void we_select_publicly_accessible_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsPubliclyAccessible(driver,dnRDS.getrds_publicly_accessible());
	}

	@Then("^we select skip final snapshot for rds$")
	public void we_select_skip_final_snapshot_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsSkipFinalSnapshot(driver,dnRDS.getrds_skip_final_snapshots());
	}

	@Then("^we select storage type for rds$")
	public void we_select_storage_type_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsStorageType(driver,dnRDS.getrds_storage_type());

	}
	@Then("^we enter security group name for rds$")
	public void we_enter_security_group_name_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsSecuritygroup_name(driver,dnRDS.getrds_security_group_name());
	}

	@Then("^we enter user name for rds$")
	public void we_enter_user_name_for_rds() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsUsername1(driver,dnRDS.getrds_username()); 
	}


	@Given("^we click on please delete it resource cross button popup for RDS$")
	public void we_click_on_please_delete_it_resource_cross_button_popup_for_RDS() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnRDS.getrds_rname());  	
	}

	@Given("^we click on please dont delete it resource cross button popup for RDS$")
	public void we_click_on_please_dont_delete_it_resource_cross_button_popup_for_RDS() throws Throwable {
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		CommonFunctionalityPageAction.resourcecross_dntdelete(driver,dnRDS.getrds_rname());
	}

	@And("^we click on resource name link on right sidebar for RDS$")
	public void we_click_on_resource_name_link_on_right_sidebar_for_RDS() throws Throwable{		
		//PageFactory.initElements(driver, R_RDS_SSH_AWSPage.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		CommonFunctionalityPageAction.resourceEditRnameclick(driver);
	}

	@Then("^we edit resource name in resource name edit popup for RDS$")
	public void we_edit_resource_name_in_resource_name_edit_popup_for_RDS() throws Throwable{		
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		//PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.editResourceNameRSB(driver);
	}

	@Then("^we enter search value in search box of resource details right sidebar for RDS$")
	public void we_enter_search_value_in_search_box_of_resource_details_right_sidebar_for_RDS() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.resourceDetailsAttributeSeachBarRSB(driver);
	}

	@And("^we pass mandatory fields as blank for RDS$")
	public void we_pass_mandatory_fields_as_blank_for_RDS() throws Throwable {
		PageFactory.initElements(driver, AWSRDSPageObject.class);
		PageFactory.initElements(driver, CommonFunctionalityPage.class);
		AWSRDSPageAction.rdsBlankValueRSBValidation(driver);
	}



}






