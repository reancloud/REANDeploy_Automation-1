@RegressionTest 
Feature:Test on NEW PLAN BUTTON 


Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
       
            
             
@P1  
Scenario: check the functionality of plan button 
            
      Then I create or search an environment for plan button
      When User click Cloudtrail resource and drag on the dashboard
      And User enter resource name for Cloudtrail resource
      Then Message should display resource created successfully
      When User click on Cloudtrail resource
      And User enter name of s3 bucket name of cloudtrail resource
      Then User should see message environment saved successfully
      When User click on canvas
      Then User click plan button on dash board
      When User click on canvas
      Then i delete the created environment for plan button
    
 @P1  
Scenario:Negative test case to check the functionality of plan button
            
      Then I create or search an environment for plan button
      When User click Cloudtrail resource and drag on the dashboard
      And User enter resource name for Cloudtrail resource
      Then Message should display resource created successfully
      When User click on Cloudtrail resource
      Then User should see message environment saved successfully
      Then User click on canvas
      Then User click plan button on dash board
      When User click on canvas
      Then i delete the created environment for plan button
    	

  @P1  
Scenario:to check the functionality of  Deployment plan window cross button
            
      Then I create or search an environment for plan button
      When User click Cloudtrail resource and drag on the dashboard
      And User enter resource name for Cloudtrail resource
      Then Message should display resource created successfully
      When User click on Cloudtrail resource
      And User enter name of s3 bucket name of cloudtrail resource
      Then User should see message environment saved successfully
      When User click on canvas
      Then User click plan button on dash board
      Then User click the cross button on pop up window
      When User click on canvas
      Then i delete the created environment for plan button
    
  @P1  
Scenario:to check the functionality of  Deployment plan window close button
            
      Then I create or search an environment for plan button
      When User click Cloudtrail resource and drag on the dashboard
      And User enter resource name for Cloudtrail resource
      Then Message should display resource created successfully
      When User click on Cloudtrail resource
      And User enter name of s3 bucket name of cloudtrail resource
      Then User should see message environment saved successfully
      When User click on canvas
      Then User click plan button on dash board
      Then User click the close button on pop up window
      When User click on canvas
      Then i delete the created environment for plan button    	          	
 	
 	 
	
