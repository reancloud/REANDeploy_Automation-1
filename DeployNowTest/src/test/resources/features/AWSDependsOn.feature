@RegressionTest @Suite4 @Sanity
Feature: Automation Test on Depends On

Background:

		Given User direct to deploy now application
		When User log in
		Then Login sucessfully should display
		
		
@Sanity 
Scenario: To check the functionality of destroy button for Depends On

	
	Then User create or search an environment of vpc for Depends On and see message as environment created successfully
	When User click VPC resource and drag on the dashboard for Depends On
	Then Message should display resource created successfully
	And User fill the cidr of vpc for Depends On
	Then User should see message environment saved successfully
	When User click output resource and drag on the dashboard for Depends On
	And User fill output json for Depends On
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	#When User click on the environment dropdown for Depends On
	Then User create or search an environment of subnet for Depends On and see message as environment created successfully
	When User click subnet resource and drag on the dashboard for Depends On
	Then Message should display resource created successfully
	And User fill cidr and vpc id of Subnet for Depends On
	When User click depends on resource and drag on the dashboard
	And User enter the name of depends on resource
	Then Message should display resource created successfully
	And User fill the depends on attribute for Depends On
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for subnet and see message environment deleted successfully for Depends On
	Then User search for environment and select environment
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for vpc and see message environment deleted successfully for Depends On
	 
	
@Sanity
Scenario: To check the functionality of redeploy button for Depends On

	Then User create or search an environment of vpc for Depends On and see message as environment created successfully
	When User click VPC resource and drag on the dashboard for Depends On
	Then Message should display resource created successfully
	And User fill the cidr of vpc for Depends On
	Then User should see message environment saved successfully
	When User click output resource and drag on the dashboard for Depends On
	And User fill output json for Depends On
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	#When User click on the environment dropdown for Depends On
	Then User create or search an environment of subnet for Depends On and see message as environment created successfully
	When User click subnet resource and drag on the dashboard for Depends On
	Then Message should display resource created successfully
	And User fill cidr and vpc id of Subnet for Depends On
	When User click depends on resource and drag on the dashboard
	And User enter the name of depends on resource
	Then Message should display resource created successfully
	And User fill the depends on attribute for Depends On
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for subnet and see message environment deleted successfully for Depends On
	Then User search for environment and select environment
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for vpc and see message environment deleted successfully for Depends On
	
