@RegressionTest
Feature: Test on AWS SSH ECS Task Definition 

Background:
			Given User direct to deploy now application
	When User log in
	Then I create or search an environment for ECS Task Def

@P1 
Scenario: To check the functionality of re deploy button for Ecs Task definition	

	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	And User refresh the page
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User refresh the page
	And User click on re deploy button on dash board
    And User refresh the page
    And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
	When User click on canvas
	Then i delete the created environment for Ecs Task def
	
	



@P1	 
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks on DESTROY button for Ecs Task definition


    When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User refresh the page
	And User click on destroy button
	Then User click on yes destroy it button
    And User refresh the page
    When User click on canvas   
    Then i delete the created environment for Ecs Task def






@P3 
Scenario: Negative test case to check the functionality of save Button and deploy without providing the mandatory fields for Ecs Task Definition

	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	Then I fill the attributes as blank under Ecs Task def resource section
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User refresh the page
	Then i delete the created environment for Ecs Task def	
	
@P3		
Scenario:To check the functionality of create button if resource name is blank	
	
	
	When I select Ecs Task def resource to the environment
	Then I enter the blank Ecs Task def resource name
	When User click on create button on resource pop up
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
	
@P2	
Scenario: To check the functionality of save button if user edits Ecs Task def resource name 	
	
	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	Then User click on the Ecs Task def resource name link
	When User click the name text box to edit resource name "test-EcsTask"
	Then User click save button on pop up of resource name link
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
	
@P2 
Scenario:To check the functionality of delete  button if user wants to delete resource	
	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	And I  delete the Ecs Task def resource by clicking the cross button on resource
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
	
@P2 
Scenario:To check the functionality of delete cross button Please don't delete button if user wants to delete resource	
	
	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	And I dont delete the Ecs Task def resource by clicking the cross button on resource
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
@P2 
Scenario: To check the functionality of Close button if user clicks on resource name link	
	
	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	Then User click on the Ecs Task def resource name link
	Then User click close button on pop up of resource name link
	Then i delete the created environment for Ecs Task def
	
	
@P2 
Scenario: To check the functionality of Cross button if user clicks on resource name link
	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	Then User click on the Ecs Task def resource name link
	Then User click cross button on pop up of resource name link
	Then i delete the created environment for Ecs Task def
	
	
@P2	
Scenario: To check the functionality of Cross close button when user drags the resource from resource section	
	
	When I select Ecs Task def resource to the environment
	Then User click on the cross close button when user drags the resource from resource section
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
@P2 
Scenario:To check the functionality of  close button when user drags the resource from resource section	
	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	Then User click on the close button when user drags the resource from resource section
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
	
@P2  
Scenario: To check the functionality of Resource Logs button after the successful deployment of the resource	
	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User refresh the page
	When User click on logs button on dash board
	And User refresh the page
	And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
@P2 
Scenario: To check the functionality of close Resource Logs button after the successful deployment of the resource	
	
	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User refresh the page
	When User click on logs button on dash board
	Then User click on close button on logs window
	And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
@P2 
Scenario: To check the functionality of Refresh button when user clicks on Resource Logs button

    When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User refresh the page
	When User click on logs button on dash board
	Then User click on refresh button on logs window
	And User refresh the page
	And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
	Then i delete the created environment for Ecs Task def

	
@P2	
Scenario: To check the functionality of don't destroy it button when user clicks on destroy button	
	
	 When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User refresh the page
	And User click on destroy button
  	Then User click on dont destroy button
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
@P2	@EcsTask	
Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment of the resource
	
	 When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	When User click on resource details link on the attribute section
    Then User search for attributes in the resource details "id"
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
	
@P2		
Scenario: To check the functionality of Stop button while deploying the resource	
	
    When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User click on stop button
	Then User click on yes stop it button
	And User refresh the page
	Then i delete the created environment for Ecs Task def
	
@P2	
Scenario: To check the functionality of dont stop it button when user clicks on Force stop button	
	
	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User click on stop button
	Then User click on yes stop it button
	 And User click on force stop button
	 Then User click on dont force stop button
     And User refresh the page
     Then i delete the created environment for Ecs Task def
	
@P2	
Scenario: To check the functionality of yes stop it button when user clicks on Force stop button	
	
	When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User click on stop button
	Then User click on yes stop it button
	 And User click on force stop button
	 Then User click on yes force stop button
     And User refresh the page
     Then i delete the created environment for Ecs Task def
	
@P2 
Scenario: To check the functionality of Cross Close button when user clicks on resource logs button.	
	
	  
	  When I select Ecs Task def resource to the environment
	Then i enter resource name of Ecs Task def
	When User click on create button on resource pop up
	Then i click on Ecs Task def resource
	And i enter container definition for Ecs Task def
	And i enter family for Ecs Task def 
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User refresh the page
	When User click on logs button on dash board
	Then User click on cross close button on logs window
	And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
    Then i delete the created environment for Ecs Task def
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
