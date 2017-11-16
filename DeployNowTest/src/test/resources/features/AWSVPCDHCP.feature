@RegressionTest @VPCDHCPAll 
Feature: Test on AWS SSH VPCDHCP Options Resource 

Background:
			Given User direct to deploy now application
	        When User log in
			Then Login sucessfully should display
			
@P1 @Suite1 
Scenario: To check the functionality of re deploy button for VPC DHCP

	      Then User search or create environment for VPCDHCP and see message as environment created successfully
          When User click VPCDHCP resource and drag on the dashboard
          And User enter VPCDHCP resource name 
          Then Message should display resource created successfully
          When User click on VPCDHCP resource
          And User enter domain name for VPCDHCP
          Then User enter domain name server for VPCDHCP
          And User enter depends on for VPCDHCP
          And User select connection for VPCDHCP
          And User enter netbios_name_servers for VPCDHCP   
          And User enter ntp_servers for VPCDHCP
          And User enter tags for VPCDHCP
          And User select netbios_node_typ for VPCDHCP 
          Then User should see message environment saved successfully
          When User click on canvas
		  Then User click deploy button and should see message environment deployed successfully
		  Then User click redeploy button and should see message environment deployed successfully  
	      When User click on destroy button
	      Then User should see message environment destroyed sucessfully
	      Then User delete environment for VPCDHCP and see message environment deleted successfully
	      
@P1 @Suite1			
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks on DESTROY button for VPC DHCP 

          Then User search or create environment for VPCDHCP and see message as environment created successfully
          When User click VPCDHCP resource and drag on the dashboard
          And User enter VPCDHCP resource name 
          Then Message should display resource created successfully
          When User click on VPCDHCP resource
          And User enter domain name for VPCDHCP
          Then User enter domain name server for VPCDHCP
          And User enter depends on for VPCDHCP
          And User select connection for VPCDHCP
          And User enter netbios_name_servers for VPCDHCP   
          And User enter ntp_servers for VPCDHCP
          And User enter tags for VPCDHCP 
          And User select netbios_node_typ for VPCDHCP
          Then User should see message environment saved successfully
          When User click on canvas
		  Then User click deploy button and should see message environment deployed successfully
	      When User click on destroy button
	      Then User should see message environment destroyed sucessfully
	      Then User delete environment for VPCDHCP and see message environment deleted successfully