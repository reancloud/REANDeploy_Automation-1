@RegressionTest @Smoke @Sanity 
Feature: Test on AWS SSH Execute Script Package 
#Prerequisite
#1-For deploy Execute Script Package we need same publickey(tocreatekeypair) and sshkey(tocreateconnecction) 
#2-So here we will create connection(Auto_new) in REAN-Deploy instance and used that connection(Auto_new)
#3-we will take keyname for instance that is already exist.so here we will take "execute-scrpt" key-pair that is available in us-east-1
#4-If you want to deploy Execute script Package in your local machine ensure that the keyname that you used available on your instance,And "Auto_new" connection available on ur local machine.

Background:
			Given User direct to deploy now application
			When User log in
			Then Login sucessfully should display
			
@Smoke @Sanity
Scenario: To check the functionality of deploy button for Execute script

         When i search and click on environment which is created by using AWS provider for execute script
         When User dragdrop security group for execute script
	     Then i enter resource name of security group for executescript
	     Then Message should display resource created successfully
	     Then i click on security group resource
	      Then i enter ingress value of security_group
          Then i enter egress value of security_group 
          When User click Instance resource and drag on the dashboard
	     Then i enter the resource name for Instance
	      Then Message should display resource created successfully
          Then i click on instance resource for execute script
          And i fill the ami attribute for execute script
          And i fill the instance type attribute for execute script
          And User fill connection from dropdown 
          Then i entered keyname for execute script
          And i entered vpc_security_group_ids for execute script
          When User click on canvas
          #When User click Key Pair resource and drag on the dashboard
          #And User enter the resource name for Key Pair
	      #Then Message should display resource created successfully
	      #When User click on key pair resource
	      #And User fill the key name for Key Pair
	      #And User fill the public key for Key Pair
	      #And User fill the connection for Key Pair
	      #Then User should see message environment saved successfully
          #When User click on canvas
          When User click on Package link
          Then i drag drop executescript package on instance resource
          Then i click on instance resource for execute script
          Then User select Package link on rightsidebar
          Then i click on executescript link and set array for inline attribute
          Then User should see message environment saved successfully
          #Then User click deploy button and should see message environment deployed successfully
          Then User click on deploy button and check deployment status
          When User click on destroy button
	      Then User should see message environment destroyed sucessfully
	      Then i delete the created environment for executescript
