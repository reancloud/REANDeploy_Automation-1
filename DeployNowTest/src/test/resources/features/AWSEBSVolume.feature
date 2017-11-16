@RegressionTest
Feature: Automation testing on EBS Volume resource

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User create or search an environment for EBS Volume and see message as environment created successfully



@P1 @ebs1 @Suite3 
Scenario: To check the functionality of yes destroy it button for EBS Volume
#Test case no 
	
	When User click EBS Volume resource and drag on the dashboard for EBS Volume
	And User enter the resource name for EBS Volume
	Then Message should display resource created successfully
	When User click on EBS Volume resource
	And User fill the valid availability zone for EBS Volume
	And User fill the size for EBS Volume
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete the environment for EBS Volume and see message environment deleted successfully
	
@P1 @ebs2 @Suite3 
Scenario: To check the functionality of re deploy button for EBS Volume
#Test case no 
	
	When User click EBS Volume resource and drag on the dashboard for EBS Volume
	And User enter the resource name for EBS Volume
	Then Message should display resource created successfully
	When User click on EBS Volume resource
	And User fill the valid availability zone for EBS Volume
	And User fill the size for EBS Volume
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete the environment for EBS Volume and see message environment deleted successfully
	
	
@ebs3
Scenario: To check the functionality of yes destroy it button for EBS Volume
#Test case no 
	
	When User click EBS Volume resource and drag on the dashboard for EBS Volume
	And User enter the resource name for EBS Volume
	Then Message should display resource created successfully
	When User click on EBS Volume resource
	And User fill the valid availability zone for EBS Volume
	And User fill the tags for EBS Volume
	And User fill the connection for EBS Volume
	And User fill the type for EBS Volume
	And User fill the iops for EBS Volume
	And User fill the kms key id for EBS Volume
	And User fill the snapshot id for EBS Volume
	And User fill the encrypted for EBS Volume
	And User fill the size for EBS Volume
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for EBS Volume and see message environment deleted successfully
	
		

	

	
	
	
