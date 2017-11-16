@RegressionTest  @Suite4 @FlowlogAll
Feature: Feature: Automating Flow Log resource

Background:
		Given User direct to deploy now application
		When User log in
		Then Login sucessfully should display
		Then User create or search an environment for Flow Log and see message as environment created successfully
	
@P1 @flowlog1 
Scenario: To check the functionality of destroy yes destroy it button for Flow Log
#Test case no 19
		
		When User click VPC resource and drag on the dashboard for for Flow Log
		When User click cloud watch resource and drag on the dashboard for for Flow Log
		When User click IAM Role resource and drag on the dashboard for for Flow Log
		When User click Flow log resource and drag on the dashboard
		And  User enter Flow Log resource name
		Then Message should display resource created successfully
		And User enter iam role name for Flow Log
		And User enter log group name for Flow Log
		And User enter traffic type for Flow Log
		And User enter vpc id for Flow Log
		And User enter eni id for Flow Log
		And User enter subnet id for Flow Log
		And User enter the connection attribute for Flow Log
		And User enter the depends on attribute for Flow Log
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Flow log and see message environment deleted successfully	  	
	  	
@P1 @flowlog2
Scenario: To check the functionality of re deploy button for Flow Log
#Test case no 19
		
		
		When User click VPC resource and drag on the dashboard for for Flow Log
		When User click cloud watch resource and drag on the dashboard for for Flow Log
		When User click IAM Role resource and drag on the dashboard for for Flow Log
		When User click Flow log resource and drag on the dashboard
		And  User enter Flow Log resource name
		Then Message should display resource created successfully
		And User enter iam role name for Flow Log
		And User enter log group name for Flow Log
		And User enter traffic type for Flow Log
		And User enter vpc id for Flow Log
		And User enter eni id for Flow Log
		And User enter subnet id for Flow Log
		And User enter the connection attribute for Flow Log
		And User enter the depends on attribute for Flow Log
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		Then User click redeploy button and should see message environment deployed successfully
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Flow log and see message environment deleted successfully
