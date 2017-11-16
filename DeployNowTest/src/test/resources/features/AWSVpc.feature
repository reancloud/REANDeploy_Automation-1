@RegressionTest @Suite2 @Smoke @Sanity 
Feature: Resource VPC using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User search or create environment for VPC and see message as environment created successfully
	
@Smoke @Sanity 
Scenario: Validate Vpc resource can be added to the aws environment
#Test case no 1 
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully
	
@Smoke @Sanity 
Scenario: Validate deploy button on SSH AWS when vpc resource attribute is not define
#Test case no 2
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter blank cidr_block for vpc
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button without providing the mandatory fields for VPC
	  Then User delete vpc environment and see message environment deleted sucessfully
	 
@Smoke @Sanity	   
Scenario: Validate create button when resource name is left blank for VPC
#Test case no 3
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name blank
	 Then Message should display resource created successfully	 
	 Then User delete vpc environment and see message environment deleted sucessfully

@Smoke @Sanity  
Scenario: Validate create button when resource name is duplicated for VPC
#Test case no 4
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully	 
	 Then User delete vpc environment and see message environment deleted sucessfully

@Smoke @Sanity 
Scenario: Validate save button when resource name is edited on resource name link for VPC
#Test case no 5
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 Then User click on resource name on rightsidebar
	 When User click the name text box to edit resource name "VPCtest"
	 Then User click save button on pop up of resource name link
	 Then User delete vpc environment and see message environment deleted sucessfully
	
@Smoke @Sanity 
Scenario: Validate cross button on Vpc resource when resource need to be deleted
#Test case no 6
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 #Then User click on cross button on resource
	 And User click on please delete it on resource cross button popup	 
	 Then User delete vpc environment and see message environment deleted sucessfully
	
@Smoke @Sanity  
Scenario: Validate please delete it button when cross button is clicked for VPC
#Test case no 7
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 And User click on please delete it on resource cross button popup	 
	 Then User delete vpc environment and see message environment deleted sucessfully
	
@Smoke @Sanity
Scenario: Validate Dont delete button when cross button is clicked for VPC
#Test case no 8
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 And User click on please dont delete it on resource cross button popup	 
	 Then User delete vpc environment and see message environment deleted sucessfully

@Smoke @Sanity  
Scenario: Validate resource name link on resource right sidebar is clickable for VPC
#Test case no 9
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 Then User click on resource name on rightsidebar
	 Then User click cross button on pop up of resource name link
	  Then User delete vpc environment and see message environment deleted sucessfully
	 
@Smoke @Sanity   
Scenario: Validate close button on resource name link is clickable for VPC
#Test case no 10
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 Then User click on resource name on rightsidebar
	 Then User click close button on pop up of resource name link	 
	 Then User delete vpc environment and see message environment deleted sucessfully

@Smoke @Sanity 
Scenario: Validate cross button on resource name link is clickable for VPC
#Test case no 11
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 Then User click on resource name on rightsidebar
	 Then User click cross button on pop up of resource name link	 
	 Then User delete vpc environment and see message environment deleted sucessfully
	 
@Smoke @Sanity  
Scenario: Validate save button when resource name is passed blank on resource name popup for VPC
#Test case no 12
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 Then User click on resource name on rightsidebar
	 When User click the name text box to edit resource name " "
	 When User click save button on pop up of resource name link
	 Then User click close button on pop up of resource name link
	 Then User delete vpc environment and see message environment deleted sucessfully
	 
@Smoke @Sanity
Scenario: Validate dragged resource cross button for VPC
#Test case no 13 
	  When User click VPC resource and drag on the dashboard
	 Then User click on the cross close button when user drags the resource from resource section
	  Then User delete vpc environment and see message environment deleted sucessfully

@Smoke @Sanity  
Scenario: Validate save button on SSH AWS dashboard for VPC
#Test case no 14 
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User delete vpc environment and see message environment deleted sucessfully

@Smoke @Sanity  
Scenario: Validate deploy button on SSH AWS dashboard for VPC
#Test case no 15
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully	

@Smoke @Sanity  
Scenario: Validate Resource log and save button on SSH AWS dashboard for VPC
#Test case no 16
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc	 
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 When User click on logs button on dash board
	 And User click on close button on logs window
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully	 
	 
@Smoke @Sanity 
Scenario: Validate close button on Resource log popup for VPC
#Test case no 17
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 When User click on logs button on dash board
	 And User click on close button on logs window
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully	 
	
@Smoke @Sanity   
Scenario: Validate refresh button on Resource log popup for VPC
#Test case no 18
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 When User click on logs button on dash board
	 And User click on refresh button on logs window
	 And User click on close button on logs window
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully	  

@Smoke @Sanity   
Scenario: Validate cross button on Resource log popup for VPC
#Test case no 19
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 When User click on logs button on dash board
	 And User click on cross close button on logs window 
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully	 

@Smoke @Sanity @Suite2   
Scenario: Validate redeploy button on SSH AWS dashboard for VPC
#Test case no 20
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc	 
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 Then User click redeploy button and should see message environment deployed successfully
	  And User refresh the page
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully	 

@Smoke @Sanity  
Scenario: Validate dont destroy it button on destroy popup for VPC
#Test case no 21
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 And User click on destroy button
	 Then User click on dont destroy button
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully	 
	 
@Smoke @Sanity @Suite2  
Scenario: Validate yes destroy it button on destroy popup for VPC
#Test case no 22
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully	 


@Smoke @Sanity  
Scenario: Validate search bar of resource details of right sidebar for VPC
#Test case no 23
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc	 
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 When User click on canvas	
	 When User click on Vpc resource
	 And User click on resource details link on the attribute section
	 Then User search for attributes in the resource details "cidr_block"
	  When User click on canvas
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully
	
@Smoke @Sanity 
Scenario: Validate search bar under resource of right sidebar for VPC
#Test case no 24
	 When User click VPC resource and drag on the dashboard
	 And User enter vpc resource name 
	 Then Message should display resource created successfully
	 When User click on Vpc resource
	 And User enter cidr block for vpc
	 And User enter dependson for vpc
	 And User select connection for vpc
	 And User enter enable_classiclink for vpc
	 And User enter enable_dns_hostnames for vpc
	 Then User enter enable_dns_support for vpc
	 And User enter instance_tenancy for vpc
	 Then User should see message environment saved successfully
	 When User click on canvas	
	 Then User click deploy button and should see message environment deployed successfully
	 When User click on canvas	
	 When User click on Vpc resource
	 And User click on resource link on the attribute section
	 Then User search for attributes in the resource section "cidr_block"
	 When User click on canvas	
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete vpc environment and see message environment deleted sucessfully