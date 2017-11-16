@RegressionTest
Feature: Automate RDS resource using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	
@P1	
Scenario: Validate redeploy button on Dsahboard for RDS
#Test case no 19
	Then we search RDS env
	Then we select vpc resource and entered attribute values for RDS
	Then we select subnet resource and entered attribute values for RDS
	Then we again select subnet resource and entered attribute values for RDS
	Then we select subnetgroup resource and entered attribute values for RDS
	Then we select internet gateway resource and entered attribute values for RDS
	When User click on save button on dash board
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	#Then we click on resource RDS
	Then we enter allocated storage value rds
	And we select engine rds
	And we enter identifier value rds
	And we select instance class for rds
	And we enter name for rds
	And we enter engine version for rds
	And we enter password for rds
	And we enter port for rds
	And we select publicly accessible for rds
	And we select skip final snapshot for rds
	And we select storage type for rds
	And we enter user name for rds
	Then we enter dependson for rds
	And we select connection for rds
	Then we enter availibilty zone for rds
	And we enter backup window for rds
	Then we enter copy tags to snapshots for rds
	And we enter db subnetgroup name for rds
	Then we enter final snapshot identifier for rds
	And we enter iops for rds
	Then we enter license model for rds
	And we select multiaz value for rds
	And we enter parameter group name for rds
	Then we enter security group name for rds
	And we enter vpc security group ids for rds
	When User click on save button on dash board
	#And User click on deploy button on dash board
	And User click on re deploy button on dash board
	And User refresh the page
	And User double refresh the page
	When User verify deployment pass or fail
	And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
	Then We delete env for RDS	
	
@P1	
Scenario: Validate Yes destroy button when destroy is clicked for rds
#Test case no 21
	Then we search RDS env
	Then we select vpc resource and entered attribute values for RDS
	Then we select subnet resource and entered attribute values for RDS
	Then we again select subnet resource and entered attribute values for RDS
	Then we select subnetgroup resource and entered attribute values for RDS
	Then we select internet gateway resource and entered attribute values for RDS
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	#Then we click on resource RDS
	Then we enter allocated storage value rds
	And we select engine rds
	And we enter identifier value rds
	And we select instance class for rds
	And we enter name for rds
	And we enter engine version for rds
	And we enter password for rds
	And we enter port for rds
	And we select publicly accessible for rds
	And we select skip final snapshot for rds
	And we select storage type for rds
	And we enter user name for rds
	Then we enter dependson for rds
	And we select connection for rds
	Then we enter availibilty zone for rds
	And we enter backup window for rds
	Then we enter copy tags to snapshots for rds
	And we enter db subnetgroup name for rds
	Then we enter final snapshot identifier for rds
	And we enter iops for rds
	Then we enter license model for rds
	And we select multiaz value for rds
	And we enter parameter group name for rds
	Then we enter security group name for rds
	And we enter vpc security group ids for rds
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User refresh the page
	And User double refresh the page
	When User verify deployment pass or fail
	And User click on destroy button
	Then User click on yes destroy it button
	And User refresh the page
	Then We delete env for RDS
	
@P2	
Scenario: Validate RDS resource can be added to the aws environment
#Test case no 1
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	Then we enter allocated storage value rds
	And we select engine rds
	And we enter identifier value rds
	And we select instance class for rds
	And we enter name for rds
	And we enter engine version for rds
	And we enter password for rds
	And we enter port for rds
	And we select publicly accessible for rds
	And we select skip final snapshot for rds
	And we select storage type for rds
	And we enter user name for rds
	When User click on canvas
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User refresh the page
	When User verify deployment pass or fail
	And User click on destroy button
	Then User click on yes destroy it button
	Then We delete env for RDS
	
@P3 
Scenario: Validate save button when mandatory attribute passed blank for rds
#Test case no 2
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	And we pass mandatory fields as blank for RDS
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User click on destroy button
	Then User click on yes destroy it button
	Then We delete env for RDS

@P3	
Scenario: Validate create button when resource name is blank for RDS
#Test case no 3
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter blank RDS resource name 
	When User click on create button on resource pop up
	Then We delete env for RDS
	
@P3	
Scenario: Validate create button when resource name is duplicated for RDS
#Test case no 4
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then We delete env for RDS
@P2	
Scenario: Validate save button on resource name link popup when rname is edited for RDS
#Test case no 5
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	And we click on resource name link on right sidebar for RDS
	Then we edit resource name in resource name edit popup for RDS
	When User click save button on pop up of resource name link
	Then We delete env for RDS	
	
@P2	
Scenario: Validate please delete after delete button if resource RDS need to be deleted
#Test case no 6
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	And we click on please delete it resource cross button popup for RDS
	Then We delete env for RDS

@P3	
Scenario: Validate please dont delete after delete button if resource RDS need to be deleted
#Test case no 7
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	And we click on please dont delete it resource cross button popup for RDS
	Then We delete env for RDS
	
@P3	
Scenario: Validate close button on resource name link popup for RDS
#Test case no 8
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	And we click on resource name link on right sidebar for RDS
	Then User click close button on pop up of resource name link
	Then We delete env for RDS
	
@P3	
Scenario: Validate cross button on resource name link popup for RDS
#Test case no 9
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	And we click on resource name link on right sidebar for RDS
	Then User click cross button on pop up of resource name link
	Then We delete env for RDS
	
@P3	
Scenario: Validate cross button on resource RDS when dragged
#Test case no 10
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	Then User click on the cross close button when user drags the resource from resource section
	Then We delete env for RDS
	
@P3	
Scenario: Validate close button on resource RDS when dragged
#Test case no 11
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	Then User click on the close button when user drags the resource from resource section
	Then We delete env for RDS

@P3	
Scenario: Validate text box under resource name link popup when rname is edited for RDS
#Test case no 12
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	And we click on resource name link on right sidebar for RDS
	Then we edit resource name in resource name edit popup for RDS
	When User click save button on pop up of resource name link
	Then User click close button on pop up of resource name link
	Then We delete env for RDS	
	
@P2	
Scenario: Validate save button on dashboard for RDS
#Test case no 14
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	Then we enter allocated storage value rds
	And we select engine rds
	And we enter identifier value rds
	And we select instance class for rds
	And we enter name for rds
	And we enter engine version for rds
	And we select multiaz value for rds
	And we enter password for rds
	And we enter port for rds
	And we select publicly accessible for rds
	And we select skip final snapshot for rds
	And we select storage type for rds
	And we enter user name for rds
	When User click on save button on dash board
	Then We delete env for RDS	
	
@P2	
Scenario: Validate deploy button on dashboard for RDS
#Test case no 15
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	Then we enter allocated storage value rds
	And we select engine rds
	And we enter identifier value rds
	And we select instance class for rds
	And we enter name for rds
	And we enter engine version for rds
	And we select multiaz value for rds
	And we enter password for rds
	And we enter port for rds
	And we select publicly accessible for rds
	And we select skip final snapshot for rds
	And we select storage type for rds
	And we enter user name for rds
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User click on destroy button
	Then User click on yes destroy it button
	Then We delete env for RDS	

@P3
Scenario: Validate close button on resource log for rds
#Test case no 16
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	Then we enter allocated storage value rds
	And we select engine rds
	And we enter identifier value rds
	And we select instance class for rds
	And we enter name for rds
	And we enter engine version for rds
	And we select multiaz value for rds
	And we enter password for rds
	And we enter port for rds
	And we select publicly accessible for rds
	And we select skip final snapshot for rds
	And we select storage type for rds
	And we enter user name for rds
	When User click on save button on dash board
	And User click on deploy button on dash board
	When User click on logs button on dash board
	Then User click on close button on logs window
	And User click on destroy button
	Then User click on yes destroy it button
	Then We delete env for RDS	

@P3	
Scenario: Validate refresh button on resource log for rds
#Test case no 17
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	Then we enter allocated storage value rds
	And we select engine rds
	And we enter identifier value rds
	And we select instance class for rds
	And we enter name for rds
	And we enter engine version for rds
	And we select multiaz value for rds
	And we enter password for rds
	And we enter port for rds
	And we select publicly accessible for rds
	And we select skip final snapshot for rds
	And we select storage type for rds
	And we enter user name for rds
	When User click on save button on dash board
	And User click on deploy button on dash board
	When User click on logs button on dash board
	Then we click on refresh button on resource log popup
	Then User click on close button on logs window
	And User click on destroy button
	Then User click on yes destroy it button
	Then We delete env for RDS	
	
@P3	
Scenario: Validate cross button on resource log for rds
#Test case no 18
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	Then we enter allocated storage value rds
	And we select engine rds
	And we enter identifier value rds
	And we select instance class for rds
	And we enter name for rds
	And we enter engine version for rds
	And we select multiaz value for rds
	And we enter password for rds
	And we enter port for rds
	And we select publicly accessible for rds
	And we select skip final snapshot for rds
	And we select storage type for rds
	And we enter user name for rds
	When User click on save button on dash board
	And User click on deploy button on dash board
	When User click on logs button on dash board
	Then User click on cross close button on logs window
	And User click on destroy button
	Then User click on yes destroy it button
	Then We delete env for RDS	
	

	
@P3
Scenario: Validate dont destroy button when destroy is clicked for RDS
#Test case no 20
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	Then we enter allocated storage value rds
	And we select engine rds
	And we enter identifier value rds
	And we select instance class for rds
	And we enter name for rds
	And we enter engine version for rds
	And we select multiaz value for rds
	And we enter password for rds
	And we enter port for rds
	And we select publicly accessible for rds
	And we select skip final snapshot for rds
	And we select storage type for rds
	And we enter user name for rds
	When User click on save button on dash board
	And User click on deploy button on dash board
	And User click on destroy button
	Then User click on dont destroy button
	And User click on destroy button
	Then User click on yes destroy it button
	Then We delete env for RDS	
	
	


@P3	
Scenario: Validate search bar under resource details for rds
#Test case no 24
	Then we search RDS env
	And we click RDS resource and drag on the dashboard
	When we enter RDS resource name
	When User click on create button on resource pop up
	Then we click on resource RDS
	Then we enter allocated storage value rds
	And we select engine rds
	And we enter identifier value rds
	And we select instance class for rds
	And we enter name for rds
	And we enter engine version for rds
	And we select multiaz value for rds
	And we enter password for rds
	And we enter port for rds
	And we select publicly accessible for rds
	And we select skip final snapshot for rds
	And we select storage type for rds
	And we enter user name for rds
	 When User click on save button on dash board
	And User click on deploy button on dash board
	Then we click on resource RDS
	When User click on resource details link on the attribute section
	Then we enter search value in search box of resource details right sidebar for RDS
	And User click on destroy button
	Then User click on yes destroy it button
	Then We delete env for RDS	
	
	
	
	

	
