@RegressionTest  @Suite4 @VpcendpointAll
Feature: Automate vpcendpoint resource using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
@P1 @Suite4 @vpcep
Scenario: Validate redeploy button for vpcendpoint
#Test case no 19

	Then User search or create environment for VPCendpoint and see message as environment created successfully
	Then User dragdrop vpc and enter attribute for VPCendpoint
	When User click VPCendpoint resource and drag on the dashboard
	And User enter VPCendpoint resource name
	Then Message should display resource created successfully
	#When User click on VPCendpoint resource
	And User enter service name for VPCendpoint
	And User enter vpc id for VPCendpoint
	And User enter dependson for VPCendpoint
	And User set connection for VPCendpoint
	And User enter policyText for VPCendpoint
	And User enter routetableId for VPCendpoint
	Then User should see message environment saved successfully
	When User click on canvas	
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete VPCendpoint environment and see message environment deleted sucessfully
	
@P1
Scenario: Validate Yes destroy it after destroy for vpcendpoint
#Test case no 17

	Then User search or create environment for VPCendpoint and see message as environment created successfully
	Then User dragdrop vpc and enter attribute for VPCendpoint
	When User click VPCendpoint resource and drag on the dashboard
	And User enter VPCendpoint resource name
	Then Message should display resource created successfully
	#When User click on VPCendpoint resource
	And User enter service name for VPCendpoint
	And User enter vpc id for VPCendpoint
	And User enter dependson for VPCendpoint
	And User set connection for VPCendpoint
	And User enter policyText for VPCendpoint
	And User enter routetableId for VPCendpoint
	Then User should see message environment saved successfully
	When User click on canvas	
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete VPCendpoint environment and see message environment deleted sucessfully
	
