@RegressionTest  @Suite4 @RouteAll
Feature: Automation of Route Resource

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
    Then User search or create environment for Route and see message as environment created successfully
    

@P1  
Scenario: To check the functionality of destroy it button for Route
#Test case no 
    When User click Route resource and drag on the dashboard
    And User enter Route resource name
    Then Message should display resource created successfully
    When User click on route resource
	And User fill the route table id for Route
	And User fill the destn cidr for Route
	And User fill the gateway id for Route
	And User select connection for Route
	And User enter depends on for Route
	And User enter instance id for Route
	And User enter nat gateway id for Route
	And User enter network interface id for Route
	And User enter vpc peering conn id for Route
    Then User click on IGW resource and entered all the attribute values for Route
    Then User click on Route Table resource and entered all the attribute values for Route
    Then User click on VPC resource and entered all the attribute values for Route
    Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete Route environment and see message environment deleted sucessfully
	
	
@P1  @route
Scenario: To check the functionality of re deploy button for Route
#Test case no 

    When User click Route resource and drag on the dashboard
    And User enter Route resource name
    Then Message should display resource created successfully
    When User click on route resource
	And User fill the route table id for Route
	And User fill the destn cidr for Route
	And User fill the gateway id for Route
	And User select connection for Route
	And User enter depends on for Route
	And User enter instance id for Route
	And User enter nat gateway id for Route
	And User enter network interface id for Route
	And User enter vpc peering conn id for Route
    Then User click on IGW resource and entered all the attribute values for Route
    Then User click on Route Table resource and entered all the attribute values for Route
    Then User click on VPC resource and entered all the attribute values for Route
    Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	 And User refresh the page
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete Route environment and see message environment deleted sucessfully
