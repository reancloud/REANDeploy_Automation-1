@RegressionTest @RouteTableAll @Suite4 @IMI
Feature: Resource Route Table using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
@P2 
Scenario: Validate Route Table can be added to the aws environment
#Test case no 1	
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete Route Table environment and see message environment deleted sucessfully

@P3		
Scenario: Validate RT when mandatory field are not provided
#Test case no 2
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter blank vpc id for Route table 
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	#Then User click on deploy button and check deployment status
	Then User delete Route Table environment and see message environment deleted sucessfully
	 
@P3 
Scenario: Validate create button when resource name is empty for RT
#Test case no 3
	Then User search or create environment for Route Table and see message as environment created successfully
	When User click Route Table resource and drag on the dashboard
	And User enter blank resource name for Route Table
	Then Message should display resource created successfully
	Then User delete Route Table environment and see message environment deleted sucessfully
	 
@P3  
Scenario: Validate create button when duplicate RT is created
#Test case no 4
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	When User click on canvas
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	Then User delete Route Table environment and see message environment deleted sucessfully
	 
	 
@P2 
Scenario: Validate save button on Resource name link popup for RT
#Test case no 5
	Then User search or create environment for Route Table and see message as environment created successfully
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	When User click on routeTable resource
	Then User click on resource name on rightsidebar
	When User click save button on pop up of resource name link
	Then User delete Route Table environment and see message environment deleted sucessfully
	 
	 
@P2 
Scenario: Validate please delete button if resource need to be deleted for rt
#Test case no 6
	Then User search or create environment for Route Table and see message as environment created successfully
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User click on please delete if resource need to be deleted for Route Table
	Then User delete Route Table environment and see message environment deleted sucessfully
	 
@P3
Scenario: Validate dont delete after delete button if resource RT need to be deleted 
#Test case no 7
	Then User search or create environment for Route Table and see message as environment created successfully
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User click on dont delete if resource need to be deleted for Route Table
	Then User delete Route Table environment and see message environment deleted sucessfully

@P3
Scenario: Validate resource name link for RT
#Test case no 8
	Then User search or create environment for Route Table and see message as environment created successfully
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	When User click on routeTable resource
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	Then User delete Route Table environment and see message environment deleted sucessfully
	 
	 
@P3    
Scenario: Validate close button on Resource name link popup for RT
#Test case no 9
	Then User search or create environment for Route Table and see message as environment created successfully
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	When User click on routeTable resource
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	Then User delete Route Table environment and see message environment deleted sucessfully
	 
	 
@P3		 
Scenario: Validate cross button on Resource name link popup for RT
#Test case no 10
	Then User search or create environment for Route Table and see message as environment created successfully
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	When User click on routeTable resource
	Then User click on resource name on rightsidebar
	Then User click cross button on pop up of resource name link
	Then User delete Route Table environment and see message environment deleted sucessfully
	 

@P3
Scenario: Validate save button on Resource name link popup when resource name passed blank for RT
#Test case no 11
	 
	Then User search or create environment for Route Table and see message as environment created successfully
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	When User click on routeTable resource
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name " "
	When User click save button on pop up of resource name link
	Then User click close button on pop up of resource name link
	Then User delete Route Table environment and see message environment deleted sucessfully
	
@P3
Scenario: Validate cross button when resource is dragged for RT
#Test case no 12
	Then User search or create environment for Route Table and see message as environment created successfully
	When User click Route Table resource and drag on the dashboard
	Then User click on the cross close button when user drags the resource from resource section
	Then User delete Route Table environment and see message environment deleted sucessfully
	 
@P3
Scenario: Validate close button when resource is dragged for RT
#Test case no 13
	Then User search or create environment for Route Table and see message as environment created successfully
	When User click Route Table resource and drag on the dashboard
	Then User click on the close button when user drags the resource from resource section
	Then User delete Route Table environment and see message environment deleted sucessfully
	
@P2	 
Scenario: Validate save button on dashboard for RT
#Test case no 14
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	Then User delete Route Table environment and see message environment deleted sucessfully
	 
@P2
Scenario: Validate deploy button on dashboard for RT
#Test case no 15
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete Route Table environment and see message environment deleted sucessfully
	 
@P3	 
Scenario: Validate resource log close button for RT
#Test case no 16
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	When User click on canvas	
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete Route Table environment and see message environment deleted sucessfully
	 
@P3	 
Scenario: Validate resource log cross button for RT
#Test case no 17
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	When User click on canvas	
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on cross close button on logs window 
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete Route Table environment and see message environment deleted sucessfully
@P2	 
Scenario: Validate resource log refresh button for RT
#Test case no 18
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	When User click on canvas	
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on refresh button on logs window
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete Route Table environment and see message environment deleted sucessfully

@P1	@Suite2  @RT
Scenario: Validate redeploy button on dashboard for RT
#Test case no 19
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete Route Table environment and see message environment deleted sucessfully

@P3  
Scenario: Validate dont destroy button when destroy is clicked for RT
#Test case no 20
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User click on dont destroy button
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete Route Table environment and see message environment deleted sucessfully
	 
@P1	@Suite2 @RT
Scenario: Validate yes destroy button when destroy is clicked for RT
#Test case no 21
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete Route Table environment and see message environment deleted sucessfully

@P3 
Scenario: Validate search bar under resource in Right Side bar for RT
Test case no 26
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on canvas
	When User click on routeTable resource
	And User click on resource link on the attribute section
	Then User search for attributes in the resource section "vpc-id"
	When User click on canvas	
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete Route Table environment and see message environment deleted sucessfully
	 
@P3		 
Scenario: Validate search bar under resource details in Right Side bar for RT
#Test case no 27	
	Then User search or create environment for Route Table and see message as environment created successfully
	And User dragdrop vpc and enter mandatory attribute for Route Table
	And User dragdrop igw and enter mandatory attribute for Route Table
	When User click Route Table resource and drag on the dashboard
	And User enter Route Table resource name
	Then Message should display resource created successfully
	And User enter vpc id for Route Table
	And User enter depends on for Route Table
	And User select connection for Route Table
    And User set propagating vgws for Route Table
    And User set route json for Route Table
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on canvas
	When User click on routeTable resource
	And User click on resource details link on the attribute section
	Then User search for attributes in the resource details "vpc-id"
	When User click on canvas	
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
    Then User delete Route Table environment and see message environment deleted sucessfully
	
	 	
