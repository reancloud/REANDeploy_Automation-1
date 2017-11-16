#Feature file for GCE support in deploynow

@RegressionTest
Feature: GCE support in deploynow

Background:
    Given User direct to deploy now application
    When User log in
    
Scenario: create connection
   	When I select connections from dropdown
   	Then i enter connection details

Scenario:create provider
           	When I click on welcome link
    	When I click provider link from dropdown
    	When I enter provider name
    	When I enter provider type google
    	When I enter provider details
    	Then I click save button on provider page

Scenario:create environment with newly created connection and provider
    	Then I create or search an environment for new connection
     	Then User delete the environment for connection

Scenario:deploy the gce instance resource
    	Then I create or search an environment for new connection
    	When User select gce Instance resource to the environment
   	 Then User enter the gce resource name for Instance
   	  When User click on create button on resource pop up
   	 Then User click on gce Instance resource
   	 Then I fill the disk details
   	 Then I fill the machine details
   	 Then I fill the network details
   	 Then I fill the zone details
   	 When User click on save button on dash board
      	And User click on deploy button on dash board






Scenario:destory the gce instance  resource   
     	Then I create or search an environment for new connection
    	When User select gce Instance resource to the environment
   	 Then User enter the gce resource name for Instance
   	  When User click on create button on resource pop up
   	 Then User click on gce Instance resource
   	 Then I fill the disk details
   	 Then I fill the machine details
   	 Then I fill the network details
   	 Then I fill the zone details
   	 When User click on save button on dash board
      	And User click on deploy button on dash board
  And User refresh the page
And User click on destroy button
 Then User click on yes destroy it button
  And User refresh the page
  When User click on canvas
  Then User delete the environment for connection

Scenario:added package to the gce instance resource
 Then I create or search an environment for new connection
   When User select gce Instance resource to the environment
   Then User enter the gce resource name for Instance
   When User click on create button on resource pop up
    Then Add a package to gce instance
    Then User delete the environment for connection

Scenario:deploy and destory the output variable resource
Then I create or search an environment for new connection
   When User select output variable Instance resource to the environment
   When User click on save button on dash board
     And User click on deploy button on dash board
      And User refresh the page
      And User click on destroy button
      Then User click on yes destroy it button
      And User refresh the page
      When User click on canvas
      Then User delete the environment for connection

Scenario:deploy and destory the input variable resource
Then I create or search an environment for new connection
   When User select input variable Instance resource to the environment
   When User click on save button on dash board
     And User click on deploy button on dash board
      And User refresh the page
      And User click on destroy button
      Then User click on yes destroy it button
      And User refresh the page
      When User click on canvas
      Then User delete the environment for connection

Scenario:Verify the resource details after successful deploy
      Then I create or search an environment for new connection
    	When User select gce Instance resource to the environment
   	 Then User enter the gce resource name for Instance
   	  When User click on create button on resource pop up
   	 Then User click on gce Instance resource
   	 Then I fill the disk details
   	 Then I fill the machine details
   	 Then I fill the network details
   	 Then I fill the zone details
   	 When User click on save button on dash board
      	And User click on deploy button on dash board
      	And User refresh the page
      	And User refresh the page
      	Then User click on gce Instance resource
      	When User click on resource details link on the attribute section

Scenario:deploy and destory the Existing Vm Resource 
                  Then I create or search an environment for new connection
  	When User select Existing Vm resource to the environment
  	Then User enter the Existing Vm Resource
  	When User click on create button on resource pop up
      Then User click on Existing Vm resource
    When I fill the host for existing virtual resource
    When User click on save button on dash board
      	And User click on deploy button on dash board
      	And User refresh the page
    And User click on destroy button
      	Then User click on yes destroy it button
      	And User refresh the page
      	When User click on canvas
      	Then User delete the environment for connection

