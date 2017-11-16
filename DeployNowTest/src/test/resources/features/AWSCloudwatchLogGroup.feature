@RegressionTest @Suite4 @CloudwatchAll
Feature:Test on AWS SSH Cloudwatch log group Resource


Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
       
            
             
@P1     
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks on Destroy button
#Test case no:21
            Then User search or create environment for Cloudwatch log group and see message as environment created successfully
            When User click Cloudwatch log group resource and drag on the dashboard
            And User enter resource name for Cloudwatch log group resource
            Then Message should display resource created successfully
            When User click on Cloudwatch log group resource
            And User enter name of Cloudwatch log group resource
            Then User select connection from dropdown
            And User enter depends on for Cloudwatch log group resource
            And User enter retention_in_days for Cloudwatch log group resource
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            When User click on destroy button
	        Then User should see message environment destroyed sucessfully
            Then User delete Cloudwatch log group environment and see message environment deleted sucessfully                      
            
@P1            
Scenario: To check the functionality of Redeploy Button 
#Test case no:21
          
            Then User search or create environment for Cloudwatch log group and see message as environment created successfully
            When User click Cloudwatch log group resource and drag on the dashboard
            And User enter resource name for Cloudwatch log group resource
            Then Message should display resource created successfully
            When User click on Cloudwatch log group resource
            And User enter name of Cloudwatch log group resource
            And User select connection from dropdown
            And User enter depends on for Cloudwatch log group resource
            And User enter retention_in_days for Cloudwatch log group resource
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            Then User click redeploy button and should see message environment deployed successfully
            When User click on destroy button
	        Then User should see message environment destroyed sucessfully
            Then User delete Cloudwatch log group environment and see message environment deleted sucessfully
