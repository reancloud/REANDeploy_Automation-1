@RegressionTest @S3BucketAll @Suite2 
Feature: Automate S3 bucket using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
@P2  
Scenario:Validate save and deploy button for S3bucket resource
#Validate S3Bucket resource can be added to the aws environment
 #Test case no 1 
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	And User enter bucket name for S3Bucket
	And User enter depends on value for S3Bucket
	And User select connection for S3Bucket
	And User select acl value for S3Bucket
	And User set cors rule for S3Bucket
	And User select force destroy value from dropdown for S3Bucket
	And User set lifecycle rule for S3Bucket
	And User set policy for S3Bucket
	And User set tags for S3Bucket
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 

@P3 
Scenario:  Validate S3Bucket when invalid bucket attribute is entered 
 #Test case no 2
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	And User enter invalid bucket name for S3Bucket
	Then User should see message environment saved successfully
	Then User click on deploy button and check deployment status
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	
@P3	
Scenario: Validate create button when resource name is left blank for S3Bucket
 #Test case no 7
	Then User search or create environment for S3Bucket and see message as environment created successfully 
	When User click S3Bucket resource and drag on the dashboard
	And User enter blank resource name for S3Bucket 
	Then Message should display resource created successfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 

@P3 
Scenario: Validate create button when resource name is duplicated for S3Bucket
 #Test case no 8 
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 

@P1 
Scenario: Validate Redeploy button on dashboard for S3Bucket
 #Test case no 9 	
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	And User enter bucket name for S3Bucket
	And User enter depends on value for S3Bucket
	And User select connection for S3Bucket
	And User select acl value for S3Bucket
	And User set cors rule for S3Bucket
	And User select force destroy value from dropdown for S3Bucket
	And User set lifecycle rule for S3Bucket
	And User set policy for S3Bucket
	And User set tags for S3Bucket
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	
@P3 @S3Bucket1
Scenario: Validate delete button if resource need to be deleted for S3Bucket
#Test case no 10 	
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	And User click on please delete it resource cross button popup for S3Bucket
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	

@P3 
Scenario: Validate dont delete button if resource need to be deleted for S3Bucket
 #Test case no 11	
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	And User click on please dont delete it resource cross button popup for S3Bucket
	Then User delete S3Bucket environment and see message environment deleted sucessfully 


@P3	 
Scenario:Validate close button under resource name link for S3Bucket
 #Test case no 12	
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	
@P3 	
Scenario: Validate cross button under resource name link for S3Bucket
 #Test case no 13	
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	Then User click on resource name on rightsidebar
	Then User click cross button on pop up of resource name link
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	
@P3	
Scenario: Validate cross button on dragged resource S3Bucket
 #Test case no 14
	Then User search or create environment for S3Bucket and see message as environment created successfully 
	When User click S3Bucket resource and drag on the dashboard
	Then User click on the cross close button when user drags the resource from resource section
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	
@P3	
Scenario: Validate close button on dragged resource S3Bucket	
 #Test case no 15	
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	Then User click on the close button when user drags the resource from resource section
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	
@P2	@S3Bucket
Scenario: Validate save button under resource name link when resource name is edited for S3Bucket
 #Test case no 9 	
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "s3bucket"
	When User click save button on pop up of resource name link
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	
@P2	@S3Bucket
Scenario: Validate the resource log button for S3Bucket
 #Test case no 17	
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	And User enter bucket name for S3Bucket
	And User enter depends on value for S3Bucket
	And User select connection for S3Bucket
	And User select acl value for S3Bucket
	And User set cors rule for S3Bucket
	And User select force destroy value from dropdown for S3Bucket
	And User set lifecycle rule for S3Bucket
	And User set policy for S3Bucket
	And User set tags for S3Bucket
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	
@P3 @S3Bucket
Scenario: Validate the resource log close button S3Bucket
 #Test case no 18
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	And User enter bucket name for S3Bucket
	And User enter depends on value for S3Bucket
	And User select connection for S3Bucket
	And User select acl value for S3Bucket
	And User set cors rule for S3Bucket
	And User select force destroy value from dropdown for S3Bucket
	And User set lifecycle rule for S3Bucket
	And User set policy for S3Bucket
	And User set tags for S3Bucket
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	 
@P3	@S3Bucket
Scenario: Validate the resource log refresh button S3Bucket
 #Test case no 19
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	And User enter bucket name for S3Bucket
	And User enter depends on value for S3Bucket
	And User select connection for S3Bucket
	And User select acl value for S3Bucket
	And User set cors rule for S3Bucket
	And User select force destroy value from dropdown for S3Bucket
	And User set lifecycle rule for S3Bucket
	And User set policy for S3Bucket
	And User set tags for S3Bucket
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on refresh button on logs window
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	
@P3 @S3Bucket
Scenario: Validate the resource log cross button S3Bucket
 #Test case no 20
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	And User enter bucket name for S3Bucket
	And User enter depends on value for S3Bucket
	And User select connection for S3Bucket
	And User select acl value for S3Bucket
	And User set cors rule for S3Bucket
	And User select force destroy value from dropdown for S3Bucket
	And User set lifecycle rule for S3Bucket
	And User set policy for S3Bucket
	And User set tags for S3Bucket
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on cross close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 

@P3	@S3Bucket
Scenario: Validate dont destroy button when destroy is clicked for S3Bucket 
 #Test case no 22
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	And User enter bucket name for S3Bucket
	And User enter depends on value for S3Bucket
	And User select connection for S3Bucket
	And User select acl value for S3Bucket
	And User set cors rule for S3Bucket
	And User select force destroy value from dropdown for S3Bucket
	And User set lifecycle rule for S3Bucket
	And User set policy for S3Bucket
	And User set tags for S3Bucket
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on destroy button
	Then User click on dont destroy button
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 

@P1 @Suite2	@S3Bucket
Scenario: Validate yes destroy button when destroy is clicked for S3Bucket 
 #Test case no 23
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	And User enter bucket name for S3Bucket
	And User enter depends on value for S3Bucket
	And User select connection for S3Bucket
	And User select acl value for S3Bucket
	And User set cors rule for S3Bucket
	And User select force destroy value from dropdown for S3Bucket
	And User set lifecycle rule for S3Bucket
	And User set policy for S3Bucket
	And User set tags for S3Bucket
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 
	

@P3 @S3Bucket
Scenario:Validate search bar of resource details of right sidebar for S3Bucket 
 #Test case no 24
	Then User search or create environment for S3Bucket and see message as environment created successfully
	When User click S3Bucket resource and drag on the dashboard
	And User enter S3Bucket resource name
	Then Message should display resource created successfully
	When User click on S3Bucket resource
	And User enter bucket name for S3Bucket
	And User enter depends on value for S3Bucket
	And User select connection for S3Bucket
	And User select acl value for S3Bucket
	And User set cors rule for S3Bucket
	And User select force destroy value from dropdown for S3Bucket
	And User set lifecycle rule for S3Bucket
	And User set policy for S3Bucket
	And User set tags for S3Bucket
	Then User should see message environment saved successfully
	Then User click on deploy button and check deployment status
	And User click on resource details link on the attribute section
	Then User search for attributes in the resource details "vpc-id"
	When User click on canvas
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete S3Bucket environment and see message environment deleted sucessfully 

