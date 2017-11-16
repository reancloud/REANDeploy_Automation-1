@RegressionTest
Feature: Test on AWS SSH Tomcat install Package 

Background:
			Given User direct to deploy now application
			When User log in
@P0	@te	
Scenario: To check the functionality of re deploy button for Tomcat install

          When i search and click on environment which is created by using AWS provider for tomcat install
          When User select Key Pair resource to the environment
          Then i enter the resource name of Key Pair for tomcat
	     When User click on create button on resource pop up
	     Then i click on key pair resource for tomcat
	      And i fill the key name for tomcat
	      And i fill the public key for tomcat
	      Then i drag and drop security group resource
	      Then i enter resource name of security group for tomcat
	      When User click on create button on resource pop up
	      Then i enter ingress value of security_group for tomcat
          When User select Instance resource to the environment
		 Then i enter the instance resource name for tomcat
		  When User click on create button on resource pop up
		  #Then i click on instance resource for tomcat
          And i fill the ami attribute for tomcat
          And User fill the instance type attribute for Instance
	     And User fill the availability zone attribute for Instance
          Then i select connection from dropdown
          Then i entered keyname for tomcat
          And i entered vpc_security_group_ids for tomcat
          When User click on canvas
          When User click on Package link
          Then i drag drop tomcat package on instance resource
          Then i click on instance resource for tomcat
          Then User select Package link on rightsidebar
          And I click on tomcat install package link
          Then i check base_version for tomcat
          And i check deploy_manager_apps value for tomcat
          And i check port for tomcat 
          Then i check run_base_instance for tomcat
          And i check shutdown_port for tomcat
          Then i check ssl_max_threads for tomcat
          And i check ssl_port for tomcat
          And i check tomcat_auth for tomcat
          Then i check use_security_manager for tomcat
          When User click on save button on dash board
          And User click on deploy button on dash board
          And User refresh the page
          And User click on re deploy button on dash board
          And User refresh the page
          And User click on destroy button
	      Then User click on yes destroy it button
	      And User refresh the page
	      Then i delete the created environment for tomcat
	      
	      
@P0		
Scenario: To check the functionality of YES DESTROY button when user click on DESTROY button for Tomcat install

         When i search and click on environment which is created by using AWS provider for tomcat install
          When User select Key Pair resource to the environment
          Then i enter the resource name of Key Pair for tomcat
	     When User click on create button on resource pop up
	     Then i click on key pair resource for tomcat
	      And i fill the key name for tomcat
	      And i fill the public key for tomcat
	      Then i drag and drop security group resource
	      Then i enter resource name of security group for tomcat
	      When User click on create button on resource pop up
	      Then i enter ingress value of security_group for tomcat
          When User select Instance resource to the environment
		 Then i enter the instance resource name for tomcat
		  When User click on create button on resource pop up
		  #Then i click on instance resource for tomcat
          And i fill the ami attribute for tomcat
          And User fill the instance type attribute for Instance
	     And User fill the availability zone attribute for Instance
          Then i select connection from dropdown
          Then i entered keyname for tomcat
          And i entered vpc_security_group_ids for tomcat
          When User click on canvas
          When User click on Package link
          Then i drag drop tomcat package on instance resource
          Then i click on instance resource for tomcat
          Then User select Package link on rightsidebar
          And I click on tomcat install package link
          Then i check base_version for tomcat
          And i check deploy_manager_apps value for tomcat
          And i check port for tomcat 
          Then i check run_base_instance for tomcat
          And i check shutdown_port for tomcat
          Then i check ssl_max_threads for tomcat
          And i check ssl_port for tomcat
          And i check tomcat_auth for tomcat
          Then i check use_security_manager for tomcat
          When User click on save button on dash board
          And User click on deploy button on dash board
          And User refresh the page
          And User click on destroy button
	      Then User click on yes destroy it button
	      And User refresh the page
	      Then i delete the created environment for tomcat
