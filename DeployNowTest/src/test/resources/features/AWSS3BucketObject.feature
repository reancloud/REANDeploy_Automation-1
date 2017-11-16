@RegressionTest @s3objectAll @Suite3
Feature: Test Automation for S3 Bucket Object Resource

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
    	Then User create or search an environment for S3 Bucket Object and see message as environment created successfully
    
@P1 @s31
Scenario:To check the functionality of destroy button for S3 Bucket Object Resource
#Test case No
	
		When User click S3 Bucket and drag on the dashboard for s3 bucket object
		When User click S3 Bucket Object and drag on the dashboard
		And User enter the resource name for S3 Bucket Object
		Then Message should display resource created successfully
		And User fill the bucket for S3 Bucket Object
		And User fill the key for S3 Bucket Object
		And User fill the source for S3 Bucket Object
		Then User should see message environment saved successfully
        	When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
	    	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		Then User delete the environment for S3 Bucket Object and see message environment deleted successfully
		
@P1 @s32
Scenario:To check the functionality of re deploy button for S3 Bucket Object Resource
#Test case No
	
		When User click S3 Bucket and drag on the dashboard for s3 bucket object
		When User click S3 Bucket Object and drag on the dashboard
		And User enter the resource name for S3 Bucket Object
		Then Message should display resource created successfully
		And User fill the bucket for S3 Bucket Object
		And User fill the key for S3 Bucket Object
		And User fill the source for S3 Bucket Object
		Then User should see message environment saved successfully
        	When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
	    	Then User click redeploy button and should see message environment deployed successfully
	    	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		Then User delete the environment for S3 Bucket Object and see message environment deleted successfully
