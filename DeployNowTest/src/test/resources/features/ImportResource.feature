@RegressionTest @Sanity 
Feature: Test on Import Resource feature

#For this some resources should be existing on Provider
#So we will create an environment and deploy, get id from deployed resource details
#Create another environment and import that resource


Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display


@Smoke @Sanity
Scenario: To check the functionality of import resource for instance in NEW Environment
#Test case no
	Then User create or search an environment for Instance and see message as environment created successfully
	When User click VPC resource and drag on the dashboard for Instance
	When User dragdrop subnet and enter attribute for Instance
	When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
	And User fill the ami attribute for Instance
	And User fill the instance type attribute for Instance
	And User fill the source dest check attribute for Instance
	And User fill the key name attribute for Instance
	And User fill the subnetid attribute for Instance
	And User fill the associate public ip address for Instance
	Then User fill the tags attribute of Instance for import
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then get id of Instance from resource details
	#env-2
	Then User create another environment for importing resources and see message as environment created successfully
	When User click Instance resource and drag on the dashboard
	And User checks the checkbox resource already Exists
	And User enters the id from previous environment
	And User enter the resource name for Instance
	Then Message should display resource import started
	Then Message should display resource imported successfully
	Then User should see environment status as deployed
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for importing resources and see message environment deleted successfully
	#destroy and delete env1
	Then User search and delete environment for Instance



@Smoke @Sanity 
Scenario: To check the functionality of import resource for instance in FAILED Environment
#Test case no
	Then User create or search an environment for Instance and see message as environment created successfully
	When User click VPC resource and drag on the dashboard for Instance
	When User dragdrop subnet and enter attribute for Instance
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then get id of subnet from resource details
	 #env-2
	Then User create another environment for importing resources and see message as environment created successfully
	When User click VPC resource and drag on the dashboard
	And User enter vpc resource name
	Then Message should display resource created successfully
	When User click on Vpc resource
	And User enter invalid cidr_block for vpc
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see environment status as failed
	When User click Subnet resource and drag on the dashboard
	And User checks the checkbox resource already Exists
	And User enters the id from previous environment
	And User enter Subnet resource name
	Then Message should display resource import started
	Then Message should display resource imported successfully
	Then User should see environment status as failed
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for importing resources and see message environment deleted successfully
	#destroy and delete env1
	Then User search and delete environment for Instance


