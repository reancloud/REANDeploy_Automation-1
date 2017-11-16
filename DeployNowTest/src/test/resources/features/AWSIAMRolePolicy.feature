@RegressionTest @IAMRolePolicy
Feature: Automate IAM Role Policy resource using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
@P1	@Suite2   
Scenario: Validate Yes destroy it after destroy for IAMRole Policy
#Test case no 1
	Then User search or create environment for IAMRolePolicy and see message as environment created successfully
	Then we dragdrop iamrole resource and enter attribute for IAMRolePolicy
	When User click IAMRolePolicy resource and drag on the dashboard
	And User enter IAMRolePolicy resource name
	Then Message should display resource created successfully
	And User enter name for IAMRolePolicy
	And User set policy for IAMRolePolicy
	And User enter role for IAMRolePolicy
	And User enter dependson for IAMRolePolicy
	And User select connection for IAMRolePolicy
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete IAMRolePolicy environment and see message environment deleted sucessfully 	
		
@P1	@Suite2  	
Scenario: Validate redeploy button for IAMRole Policy
#Test case no 1

	Then User search or create environment for IAMRolePolicy and see message as environment created successfully
	Then we dragdrop iamrole resource and enter attribute for IAMRolePolicy
	When User click IAMRolePolicy resource and drag on the dashboard
	And User enter IAMRolePolicy resource name
	Then Message should display resource created successfully
	And User enter name for IAMRolePolicy
	And User set policy for IAMRolePolicy
	And User enter role for IAMRolePolicy
	And User enter dependson for IAMRolePolicy
	And User select connection for IAMRolePolicy
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete IAMRolePolicy environment and see message environment deleted sucessfully 	
	
