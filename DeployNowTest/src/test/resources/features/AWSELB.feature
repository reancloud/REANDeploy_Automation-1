@RegressionTests
Feature: Automate ELB resource using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
@P1	@Suite2 
Scenario: Validate redeploy button when invalid attribute is entered for elb
#Test case no 1

	Then User search or create environment for elb and see message as environment created successfully
	And User dragdrop vpc and enter attribute for elb
	And User dragdrop subnet and enter attribute for elb
	And User dragdrop routetable and enter attribute for elb
	And User dragdrop igw and enter attribute for elb
	And User dragdrop RTA and enter attribute for elb
	When User click elb resource and drag on the dashboard
	And User enter elb resource name
	Then Message should display resource created successfully
	#When User click on elb resource
	And User set listner for elb
	And User set subnets array for elb
	And User set dependson for elb
	And User set connection for elb
	And User set accesslog for elb
	And User set crossZoneLoadBalancing for elb
	And User set healthCheck for elb
	And User set idleTimeout for elb
	And User set instances for elb
	And User set internal for elb
	And User set securityGroup for elb
	And User set tags for elb
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete elb environment and see message environment deleted sucessfully
		
	
@P1 @Suite2 
Scenario: Validate Yes destroy after destroy for elb
#Test case no 2
    Then User search or create environment for elb and see message as environment created successfully
	And User dragdrop vpc and enter attribute for elb
	And User dragdrop subnet and enter attribute for elb
	And User dragdrop routetable and enter attribute for elb
	And User dragdrop igw and enter attribute for elb
	And User dragdrop RTA and enter attribute for elb
	When User click elb resource and drag on the dashboard
	And User enter elb resource name
	Then Message should display resource created successfully
	#When User click on elb resource
	And User set listner for elb
	And User set subnets array for elb
	And User set dependson for elb
	And User set connection for elb
	And User set accesslog for elb
	And User set crossZoneLoadBalancing for elb
	And User set healthCheck for elb
	And User set idleTimeout for elb
	And User set instances for elb
	And User set internal for elb
	And User set securityGroup for elb
	And User set tags for elb
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete elb environment and see message environment deleted sucessfully
	
	