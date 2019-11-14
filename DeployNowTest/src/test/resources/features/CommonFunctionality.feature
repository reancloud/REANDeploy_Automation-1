Feature: Common Functionality scenarios

Scenario:
	
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User log out
	
Scenario:
    
    Then Message should display resource created successfully
	#When User click on create button on resource pop up
	Then User click on the cross close button when user drags the resource from resource section
	Then User click on the close button when user drags the resource from resource section
	
Scenario:
	
	When User click on canvas
	And User refresh the page
	And User double refresh the page
	Then User should see message environment saved successfully
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	Then User click on deploy button and check deployment status
	
Scenario:	
	When User click the name text box to edit resource name \"(.*)\"
	When User click save button on pop up of resource name link
	Then User click cross button on pop up of resource name link
	Then User click close button on pop up of resource name link

Scenario:	
	When User click on logs button on dash board
	And User click on close button on logs window
	And User click on cross close button on logs window
	And User click on refresh button on logs window

Scenario:	
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User click on dont destroy button
	And User click on stop button
  	Then User click on yes stop it button
  	Then User click on dont stop button
  	And User click on force stop button
  	Then User click on yes force stop it button
  	Then User click on dont force stop button
  	
Scenario:
		And User click on resource details link on the attribute section
		Then User search for attributes in the resource details "id"
		And User click on resource link on the attribute section
		Then User search for attributes in the resource section "Connection"
		Then User select connection from dropdown
	
Scenario:
        When User click on Package link
        Then User select Package link on rightsidebar
        Then User click on resource name on rightsidebar
        


