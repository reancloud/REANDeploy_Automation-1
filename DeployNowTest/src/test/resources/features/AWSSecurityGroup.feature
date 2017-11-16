@RegressionTest @SecuritygroupAll @R53 
Feature: Test on AWS SSH Security group Resource 

Background:
			Given User direct to deploy now application
	 	   When User log in
	       Then Login sucessfully should display
			
@P1 @Suite1
Scenario: To check the functionality of re deploy button for security group

          Then User search or create environment for SecurityGroup and see message as environment created successfully
          When User click SecurityGroup resource and drag on the dashboard
          And User enter SecurityGroup resource name 
          Then Message should display resource created successfully
          When User click on security group resource
          And User enter egress value for security_group
          And User enter ingress value for security_group
          And User enter name for security_group
          And User select connection for securitygroup
          And User enter dependson for securitygroup
          And User enter description for securitygroup
          Then User enter vpc id for securitygroup
          Then User should see message environment saved successfully
		  When User click on canvas
		  Then User click deploy button and should see message environment deployed successfully
		  Then User click redeploy button and should see message environment deployed successfully
		  When User click on destroy button
		  Then User should see message environment destroyed sucessfully
		  Then User delete SecurityGroup environment and see message environment deleted sucessfully
          
 @P1 @Suite1      
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks on DESTROY button for Securitygroup 
#Test Case no:28
           Then User search or create environment for SecurityGroup and see message as environment created successfully
          When User click SecurityGroup resource and drag on the dashboard
          And User enter SecurityGroup resource name 
          Then Message should display resource created successfully
          When User click on security group resource
          And User enter egress value for security_group
          And User enter ingress value for security_group
          And User enter name for security_group
          And User select connection for securitygroup
          And User enter dependson for securitygroup
          And User enter description for securitygroup
          Then User enter vpc id for securitygroup
          Then User should see message environment saved successfully
		  When User click on canvas
		  Then User click deploy button and should see message environment deployed successfully
	      When User click on destroy button
		  Then User should see message environment destroyed sucessfully
		  And User double refresh the page
	      Then User delete SecurityGroup environment and see message environment deleted sucessfully
	  	     
