@RegressionTest @Suite4 
Feature:Test on AWS SSH CloudTrail Resource


Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
       
            
             
@P1   
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks on Destroy button
#Test case no:21
            Then User search or create environment for Cloudtrail resource and see message as environment created successfully
            When User click Cloudtrail resource and drag on the dashboard
            And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
            When User click on Cloudtrail resource
            And User enter name of s3 bucket name of cloudtrail resource
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            When User click on destroy button
	        Then User should see message environment destroyed sucessfully
            Then User delete cloudtrail environment and see message environment deleted sucessfully        
            
@P1           
Scenario: To check the functionality of Redeploy Button 
#Test case no:21
          
             Then User search or create environment for Cloudtrail resource and see message as environment created successfully
            When User click Cloudtrail resource and drag on the dashboard
            And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
            When User click on Cloudtrail resource
            And User enter name of s3 bucket name of cloudtrail resource
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            Then User click redeploy button and should see message environment deployed successfully
            When User click on destroy button
	        Then User should see message environment destroyed sucessfully
            Then User delete cloudtrail environment and see message environment deleted sucessfully              


@P3    
Scenario: Negative test case to check the functionality of save Button and deploy without 
providing the mandatory fields for cloudtrail resource
#Test case no 2
	
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
            When User click Cloudtrail resource and drag on the dashboard
            And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
            When User click on Cloudtrail resource
            	#Then User fill the attributes as blank under resource section
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	
@P2	   
Scenario: To check the functionality of save button if user edits  resource name for CloudTrail
#Test case no 5
	
		Then User search or create environment for Cloudtrail resource and see message as environment created successfully
            When User click Cloudtrail resource and drag on the dashboard
            And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
            When User click on Cloudtrail resource
             And User enter name of s3 bucket name of cloudtrail resource
            Then User should see message environment saved successfully
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "test-rajacloudtrail"
	When User click save button on pop up of resource name link
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	
	

@P3  
Scenario: To check the functionality of create button if resource name is duplicate for CloudTrail
#Test case no 4
	
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
            When User click Cloudtrail resource and drag on the dashboard
            And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click Cloudtrail resource and drag on the dashboard
            And User enter resource name for Cloudtrail resource
	Then Message should display resource created successfully
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	
@P3	  	
Scenario:To check the functionality of create button if resource name is blank for cloudtrail 
#Test case no 3
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
            When User click Cloudtrail resource and drag on the dashboard
	Then Message should display resource created successfully
	#When User click on create button on resource pop up
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	


@P2	  
Scenario:To check the functionality of delete cross button Please delete button 
if user wants to delete resource for cloudtrail
#Test case no 6
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
            And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	And User delete the resource by clicking the cross button on cloud trail
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	


@P3	  
Scenario:To check the functionality of delete cross button Please don't delete button 
if user wants to delete resource for cloud trail
#Test case no 7


      Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
            And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	And User dont delete the resource by clicking the cross button on cloud trail
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	
@P3   
Scenario: To check the functionality of Close button if user clicks on resource name link for cloud trail
#Test case no 8
	
	 Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
            And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click on Cloudtrail resource
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	

	@P3	 
Scenario: To check the functionality of Cross button if user clicks on resource name link for cloud trail
#Test case no 9
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
            And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click on Cloudtrail resource
	Then User click on resource name on rightsidebar
	Then User click cross button on pop up of resource name link
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	

@P3	   
Scenario: To check the functionality of Cross close button when user drags the resource 
from resource section for cloud trail
#Test case no 10
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
	Then User click on the cross close button when user drags the resource from resource section
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	
@P3	 
Scenario:To check the functionality of close button when user drags the resource from resource section for cloud trail
#Test case no 11
	
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
	Then User click on the close button when user drags the resource from resource section
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	
@P3	  
Scenario: To check the functionality of text box when user clicks on resource name link and edits the name for cloud trail
#Test case no 12
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
	  And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click on Cloudtrail resource
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "cloudtrail"
	Then User click close button on pop up of resource name link
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	

@P2  
Scenario: To check the functionality of Resource Logs button after the successful deployment of the resource for cloud trail
#Test case no 13
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
	  And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click on Cloudtrail resource
	            And User enter name of s3 bucket name of cloudtrail resource
            Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	


@P3 
Scenario: To check the functionality of Close button on logs window after the successful 
deployment of the resource for cloud trail
#Test case no 14
	
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
	  And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click on Cloudtrail resource
	            And User enter name of s3 bucket name of cloudtrail resource
            Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	

@P3 
Scenario: To check the functionality of Cross Close button on logs window after the successful 
deployment of the resource for cloud trail
#Test case no 16
	
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
	  And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click on Cloudtrail resource
	            And User enter name of s3 bucket name of cloudtrail resource
            Then User should see message environment saved successfully
    	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on cross close button on logs window
	When User click on destroy button
  		Then User should see message environment destroyed sucessfully
		 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	
@P3	  
Scenario: To check the functionality of destroy don't destroy it button for cloud trail
#Test case no 18

		
	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
	  And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click on Cloudtrail resource
	            And User enter name of s3 bucket name of cloudtrail resource
            Then User should see message environment saved successfully
    	When User click on canvas
	    	Then User click deploy button and should see message environment deployed successfully
	    	When User click on destroy button
  		Then User click on dont destroy button
  		When User click on destroy button
  		Then User should see message environment destroyed sucessfully
	     Then User delete cloudtrail environment and see message environment deleted sucessfully 
	
@P2     
Scenario: To check the functionality of deploy button for cloud trail
#Test case no 22

	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
	  And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click on Cloudtrail resource
	            And User enter name of s3 bucket name of cloudtrail resource
            Then User should see message environment saved successfully
            When User click on canvas
    Then User click deploy button and should see message environment deployed successfully	
	When User click on destroy button
    	Then User should see message environment destroyed sucessfully
	 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	

@P3	  
Scenario: To check the functionality of Search bar if user wants to search for attributes after 
deployment of the resource for cloud trail
#Test case no 23

	 	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
	  And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click on Cloudtrail resource
	            And User enter name of s3 bucket name of cloudtrail resource
            Then User should see message environment saved successfully
            When User click on canvas
    Then User click deploy button and should see message environment deployed successfully	
		When User click on Cloudtrail resource
	 	When User click on resource details link on the attribute section
		Then User search for attributes in the resource details "id"
		When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	

@P3	  	@cloudtrail
Scenario: To check the functionality of Search bar if user wants to search for attributes after 
deployment under resource for cloud trail	
#Test case no 26

		
	 	Then User search or create environment for Cloudtrail resource and see message as environment created successfully
	 When User click Cloudtrail resource and drag on the dashboard
	  And User enter resource name for Cloudtrail resource
            Then Message should display resource created successfully
	When User click on Cloudtrail resource
	            And User enter name of s3 bucket name of cloudtrail resource
            Then User should see message environment saved successfully
            When User click on canvas
	    	Then User click deploy button and should see message environment deployed successfully
		When User click on Cloudtrail resource
	 	When User click on resource link on the attribute section
		Then User search for attributes in the resource section "Connection"
		When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		 Then User delete cloudtrail environment and see message environment deleted sucessfully 
	
	 	







		 	            