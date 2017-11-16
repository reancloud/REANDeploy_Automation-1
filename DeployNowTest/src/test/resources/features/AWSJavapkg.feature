@RegressionTest
Feature: Test on AWS SSH Java install Package 

Background:
			Given User direct to deploy now application
		    When User log in
			Then Login sucessfully should display
@P1	@cloud
Scenario: To check the functionality of re deploy button for Java install

          When i search and click on environment which is created by using AWS provider for java
          When User click Key Pair resource and drag on the dashboard
          Then i enter the resource name of Key Pair for java
	      Then Message should display resource created successfully
	      Then i click on key pair resource for java
	      And i fill the key name for java
	      And User fill the public key for Key Pair
	      When User click SecurityGroup resource and drag on the dashboard
	      Then i enter resource name of security group for java
	      Then Message should display resource created successfully
	      Then i enter ingress value of security_group for tomcat
          When User click Instance resource and drag on the dashboard
		  Then i enter the instance resource name for java
		  Then Message should display resource created successfully
		  #Then i click on instance resource for tomcat
          And i fill the ami attribute for tomcat
          And User fill the instance type attribute for Instance
	     And User fill the availability zone attribute for Instance
          Then User select connection from dropdown
          Then i entered keyname for java
          And i entered vpc_security_group_ids for java
          When User click on canvas
          When User click on Package link
          Then i drag drop java package on instance resource
          Then i click on instance resource for java
          Then User select Package link on rightsidebar
          And I click on java install package link
          Then i check accept_license_agreement for java
          And i check alternatives_priority for java
          Then i check jdk_version for java
          Then i check openjdk_version for java
          And i check reset_alternatives for java
          Then i check set_default for java
          And i check set_etc_environment for java
          Then i check set_etc_environment for java
          And i check use_alt_suffix for java
          Then User should see message environment saved successfully
		  Then User click deploy button and should see message environment deployed successfully
          Then User click redeploy button and should see message environment deployed successfully
          When User click on destroy button
		 Then User should see message environment destroyed sucessfully
	      Then i delete the created environment for java
	      
	      
@P1		
Scenario: To check the functionality of YES DESTROY button when user click on DESTROY button for Java

          When i search and click on environment which is created by using AWS provider for java
          When User select Key Pair resource to the environment
          Then i enter the resource name of Key Pair for java
	      When User click on create button on resource pop up
	      Then i click on key pair resource for java
	     And i fill the key name for java
	      And User fill the public key for Key Pair
	      Then i drag and drop security group resource
	      Then i enter resource name of security group for java
	      When User click on create button on resource pop up
	      Then i enter ingress value of security_group for tomcat
          When User select Instance resource to the environment
		 Then i enter the instance resource name for java
		  When User click on create button on resource pop up
		  #Then i click on instance resource for java
         And i fill the ami attribute for tomcat
          And User fill the instance type attribute for Instance
	     And User fill the availability zone attribute for Instance
          Then i select connection from dropdown
          Then i entered keyname for java
          And i entered vpc_security_group_ids for java
          When User click on canvas
          When User click on Package link
          Then i drag drop java package on instance resource
          Then i click on instance resource for java
          Then User select Package link on rightsidebar
          And I click on java install package link
          Then i check accept_license_agreement for java
         And i check alternatives_priority for java
          Then i check jdk_version for java
          Then i check openjdk_version for java
          And i check reset_alternatives for java
          Then i check set_default for java
          And i check set_etc_environment for java
          Then i check set_etc_environment for java
          And i check use_alt_suffix for java
          When User click on save button on dash board
          And User click on deploy button on dash board
          And User double refresh the page
          And User double refresh the page
          And User click on destroy button
	      Then User click on yes destroy it button
	      And User double refresh the page 
	      And User double refresh the page
	      Then i delete the created environment for java
