@RegressionTest
Feature: Test on AWS SSH awsspec Package 

Background:
			Given User direct to deploy now application
			When User log in
@P0
Scenario: To check the functionality of re deploy button for awsspec

          When i search and click on environment which is created by using AWS provider for awsspec
          When User select Instance resource to the environment
		  Then i enter the resource name for Instance for awsspec
		  When User click on create button on resource pop up
          Then i click on instance resource for awsspec
          And i fill the ami attribute for execute script
          And i fill the instance type attribute for execute script
          And i fill the availability zone attribute for execute script
          When User click on canvas
          When User click on Package link
          Then i drag drop awsspec package on instance resource
          Then i click on instance resource for awsspec
          Then User select Package link on rightsidebar
          Then i click on awsspec link for awsspec
          And i enter source_password for awsspec
          And i enter source_url for awsspec
          Then i enter source_username for awsspec
          When User click on save button on dash board
          And User click on deploy button on dash board
          And User double refresh the page
          And User click on re deploy button on dash board
          And User click on destroy button
	      Then User click on yes destroy it button
	      And User double refresh the page
	      #When User click on canvas
	      Then i delete the created environment for awsspec
@P0 	      
Scenario: To check the functionality of YES DESTROY button when user click on DESTROY button for awsspec

          When i search and click on environment which is created by using AWS provider for awsspec
          When User select Instance resource to the environment
		  Then i enter the resource name for Instance for awsspec
		  When User click on create button on resource pop up
          Then i click on instance resource for awsspec
          And i fill the ami attribute for execute script
          And i fill the instance type attribute for execute script
          And i fill the availability zone attribute for execute script
          When User click on canvas
          When User click on Package link
          Then i drag drop awsspec package on instance resource
          Then i click on instance resource for awsspec
          Then User select Package link on rightsidebar
          Then i click on awsspec link for awsspec
          And i enter source_password for awsspec
          And i enter source_url for awsspec
          Then i enter source_username for awsspec
          When User click on save button on dash board
          And User click on deploy button on dash board
          And User click on destroy button
	      Then User click on yes destroy it button
	      And User double refresh the page
	      #When User click on canvas
	      Then i delete the created environment for awsspec