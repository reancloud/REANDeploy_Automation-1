@RegressionTest
Feature: Test on AWS SSH AUTO SCALING GROUP Definition 

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then I create or search an environment for Auto Scaling Group resource

@P1 
Scenario: To check the functionality of yes destroy button for Auto scaling group
     
     When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
    Then Message should display resource created successfully
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
    Then Message should display resource created successfully
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
     Then User should see message environment saved successfully
      When User click on canvas	
      And User refresh the page
      Then User click deploy button and should see message environment deployed successfully
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	And User refresh the page
      Then i delete the created environment for auto scaling group
      
@p1  
 Scenario: To check the functionality of re deploy button for Auto Scaling Group 
  
                    When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
     Then Message should display resource created successfully
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
      Then Message should display resource created successfully
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
       Then User should see message environment saved successfully
      And User refresh the page
     Then User click deploy button and should see message environment deployed successfully
      When User click on canvas
		Then User click redeploy button and should see message environment deployed successfully
		 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	And User refresh the page
      Then i delete the created environment for auto scaling group
  

@P3 
Scenario: Negative test case to check the functionality of save Button and deploy without providing the mandatory fields for Auto Scaling Group

	
	  When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
     Then Message should display resource created successfully 
	Then I fill the attributes as blank under Auto Scaling Group resource section
	Then User should see message environment saved successfully
	 And User refresh the page
     Then User click deploy button and should see message environment deployed successfully
      When User click on canvas
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	And User refresh the page
	Then i delete the created environment for auto scaling group
	
	
@P3		
Scenario:To check the functionality of create button if resource name is blank	
	
	
	When I select auto scaling group resource to the environment
	Then I enter the blank auto scaling group resource name
	Then Message should display resource created successfully
	And User refresh the page
	Then i delete the created environment for auto scaling group	
  
@P2	  
Scenario: To check the functionality of save button if user edits Then i delete the created environment for auto scaling group resource name 	
	
	
	When I select auto scaling group resource to the environment
	Then i enter resource name of auto scaling group
	Then Message should display resource created successfully
	Then i click on auto scaling group resource
	Then User click on the auto scaling group resource name link
	When User click the name text box to edit resource name "test-autoscaling"
	Then User click save button on pop up of resource name link
	And User refresh the page
	Then i delete the created environment for auto scaling group
	
@P2  
Scenario:To check the functionality of delete  button if user wants to delete resource	
	
	When I select auto scaling group resource to the environment
	Then i enter resource name of auto scaling group
	Then Message should display resource created successfully
	And I  delete the auto scaling group resource by clicking the cross button on resource
	And User refresh the page
	Then i delete the created environment for auto scaling group	
	
@P2 	 
Scenario:To check the functionality of delete cross button Please don't delete button if user wants to delete resource	
	
	
	When I select auto scaling group resource to the environment
	Then i enter resource name of auto scaling group
	Then Message should display resource created successfully
	And I dont delete the auto scaling group resource by clicking the cross button on resource
	And User refresh the page
	Then i delete the created environment for auto scaling group
	
	
@P2 
Scenario: To check the functionality of Close button if user clicks on resource name link	
	
	
	When I select auto scaling group resource to the environment
	Then i enter resource name of auto scaling group
	Then Message should display resource created successfully
	Then i click on auto scaling group resource
	Then User click on the auto scaling group resource name link
	Then User click close button on pop up of resource name link
	And User refresh the page
	Then i delete the created environment for auto scaling group	
	
@P2  
Scenario: To check the functionality of Cross button if user clicks on resource name link
	
	When I select auto scaling group resource to the environment
	Then i enter resource name of auto scaling group
	Then Message should display resource created successfully
	Then i click on auto scaling group resource
	Then User click on the auto scaling group resource name link
	Then User click cross button on pop up of resource name link
	And User refresh the page
	Then i delete the created environment for auto scaling group	
	
@P2	
Scenario: To check the functionality of Cross close button when user drags the resource from resource section	
	
	When I select auto scaling group resource to the environment
	Then User click on the cross close button when user drags the resource from resource section
	And User refresh the page
	Then i delete the created environment for auto scaling group
	
	
@P2 
Scenario:To check the functionality of  close button when user drags the resource from resource section	
	
	When I select auto scaling group resource to the environment
	Then i enter resource name of auto scaling group
	Then User click on the close button when user drags the resource from resource section
	And User refresh the page
	Then i delete the created environment for auto scaling group		
	
	

@P2 
Scenario: To check the functionality of Resource Logs button after the successful deployment of the resource
      
       When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
     Then Message should display resource created successfully
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
     Then Message should display resource created successfully
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
      Then User should see message environment saved successfully
	 And User refresh the page
     Then User click deploy button and should see message environment deployed successfully
      When User click on canvas 
	And User refresh the page
     When User click on logs button on dash board
      And User refresh the page
       When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	And User refresh the page
      Then i delete the created environment for auto scaling group
      		


@P2 
Scenario: To check the functionality of close Resource Logs button after the successful deployment of the resource
      
       When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
     When User click on create button on resource pop up
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
      When User click on create button on resource pop up
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
      When User click on save button on dash board
      And User click on deploy button on dash board
      And User refresh the page
     When User click on logs button on dash board
	Then User click on close button on logs window
      And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
      Then i delete the created environment for auto scaling group
   
   
@P2 
Scenario: To check the functionality of Refresh button when user clicks on Resource Logs button   
   
     When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
     When User click on create button on resource pop up
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
      When User click on create button on resource pop up
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
      When User click on save button on dash board
      And User click on deploy button on dash board
      And User refresh the page
      When User click on logs button on dash board
	Then User click on refresh button on logs window
	And User refresh the page
      And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
      Then i delete the created environment for auto scaling group 	
      
      
@p2       
Scenario: To check the functionality of don't destroy it button when user clicks on destroy button      
       
       When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
     When User click on create button on resource pop up
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
      When User click on create button on resource pop up
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
      When User click on save button on dash board
      And User click on deploy button on dash board
      And User refresh the page
      And User click on destroy button
      Then User click on dont destroy button
      And User refresh the page
      Then i delete the created environment for auto scaling group	
      
      
@P2	
Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment of the resource      
      
       When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
     When User click on create button on resource pop up
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
      When User click on create button on resource pop up
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
      When User click on save button on dash board
      And User click on deploy button on dash board
      When User click on resource details link on the attribute section
    Then User search for attributes in the resource details "test-auto"
	And User refresh the page
	And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
     Then i delete the created environment for auto scaling group 
     
     
@P2			
Scenario: To check the functionality of Stop button while deploying the resource
             
             
       When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
     When User click on create button on resource pop up
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
      When User click on create button on resource pop up
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
      When User click on save button on dash board
      And User click on deploy button on dash board
      And User click on stop button
	Then User click on yes stop it button
	And User refresh the page
	Then i delete the created environment for auto scaling group
	
 @P2 	
Scenario: To check the functionality of dont stop it button when user clicks on Force stop button               
    
                  
       When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
     When User click on create button on resource pop up
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
      When User click on create button on resource pop up
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
      When User click on save button on dash board
      And User click on deploy button on dash board
      And User click on stop button
	Then User click on yes stop it button
	And User click on force stop button
	 Then User click on dont force stop button
     And User refresh the page
     Then i delete the created environment for auto scaling group
	
@P2	
Scenario: To check the functionality of yes stop it button when user clicks on Force stop button	
	
	      When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
     When User click on create button on resource pop up
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
      When User click on create button on resource pop up
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
      When User click on save button on dash board
      And User click on deploy button on dash board
      And User click on stop button
	Then User click on yes stop it button
	 And User click on force stop button
	Then User click on yes force stop it button
     And User refresh the page
     Then i delete the created environment for auto scaling group
@P2 
Scenario: To check the functionality of Cross Close button when user clicks on resource logs button.		
  
            When I select launch configuration resource to the environment
     Then i enter resource name of launch configuration
     When User click on create button on resource pop up
     Then i click on launch configuration resource
      When i enter image id of launch configuration
      Then i enter instance type of launch configuration
     When I select auto scaling group resource to the environment
     Then i enter resource name of auto scaling group
      When User click on create button on resource pop up
      Then i enter launch configuration name of auto scaling group
      Then i enter maxsize of auto scaling group
      Then i enter minsize of auto scaling group
      Then i enter availability zone of auto scaling group
      When User click on save button on dash board
      And User click on deploy button on dash board
      And User refresh the page
	When User click on logs button on dash board
	Then User click on cross close button on logs window
	And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
    Then i delete the created environment for auto scaling group
      	     