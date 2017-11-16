@RegressionTest @Suite4 @Sanity 
Feature: Automation test on Philips Usecase Environment

Background: 
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display 
	
@Sanity   
Scenario: Adding required resource and deploy philips Environment
	  
	  Then User search or create Philips Usescase environment and see message as environment created successfully
	  And User dragdrop vpc and enter attribute for PU
	  And User dragdrop vpc2 and enter attribute for PU
	  And User dragdrop subnet1 and enter attribute for PU
	  And User dragdrop subnet2 and enter attribute for PU
	  And User dragdrop subnet3 and enter attribute for PU
	  And User dragdrop subnet4 and enter attribute for PU
	  And User dragdrop subnet5 and enter attribute for PU
	  And User dragdrop subnet6 and enter attribute for PU
	  And User dragdrop igw1 and enter attribute for PU
	  And User dragdrop routetable1 and enter attribute for PU
	  And User dragdrop routetable2 and enter attribute for PU
	  And User dragdrop route1 and enter attribute for PU
	  And User dragdrop igw2 and enter attribute for PU
	  And User dragdrop VpcPeering and enter the attribute for PU
	  And User dragdrop routetable3 and enter attribute for PU
	  And User dragdrop routetable4 and enter attribute for PU
	  And User dragdrop Nat RTA1 and enter attribute for PU
	  And User dragdrop Nat RTA2 and enter attribute for PU
	  And User dragdrop Public RTA1 and enter attribute for PU
	  And User dragdrop Public RTA2 and enter attribute for PU
	  And User dragdrop private RTA1 and enter attribute for PU
	  And User dragdrop private RTA2 and enter attribute for PU
	  And User dragdrop node1 security group and enter attribute for PU
	  And User dragdrop node2 security group and enter attribute for PU
	  And User dragdrop node3 security group and enter attribute for PU
	  And User dragdrop node4 security group and enter attribute for PU
	  And User dragdrop Natgateway and enter attribute for PU
	  And User dragdrop elb security group and enter attribute for PU
	  And User dragdrop security group and enter attribute for PU
	  And User dragdrop route2 and enter attribute for PU
	  And User dragdrop Eip resource and enter attribute for PU
	  When User click on canvas
	  Then User should see message environment saved successfully for PU
	 # Then User click deploy button and should see message environment deployed successfully
	  Then User click on deploy button and check deployment status
	  When User click on destroy button
	  Then User should see message environment destroyed sucessfully
	  Then User delete Philips Usescase environment and see message environment deleted successfully
