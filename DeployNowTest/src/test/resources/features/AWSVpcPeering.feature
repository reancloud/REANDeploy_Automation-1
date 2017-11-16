@vpcpeering   @VpcpeeringAll  @Suite4 
Feature: Automate vpcPeering resource using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
@P1 @vpcpeering1
Scenario: Validate redeploy button for vpcpeering
#Test case no 19
	Then User search or create environment for Vpcpeering and see message as environment created successfully
	And User dragdrop vpc1 and enter attribute for vpcPeering
	And User dragdrop route1 and enter attribute for vpcPeering
	And User dragdrop igw1 and enter attribute for vpcPeering
	And User dragdrop subnet1 and enter attribute for vpcPeering
	And User dragdrop routetable1 and enter attribute for vpcPeering
	And User dragdrop RTA1 and enter attribute for vpcPeering
	And User dragdrop vpc2 and enter attribute for vpcPeering
	And User dragdrop igw2 and enter attribute for vpcPeering
	And User dragdrop subnet2 and enter attribute for vpcPeering
	And User dragdrop routetable2 and enter attribute for vpcPeering
	And User dragdrop RTA2 and enter attribute for vpcPeering
	When User click Vpcpeering resource and drag on the dashboard
	And User enter Vpcpeering resource name
	Then Message should display resource created successfully
	And User enter peerOwnerID attributes of Vpcpeering
	And User enter peerVpcId attributes of Vpcpeering
	And User enter VpcId attributes of Vpcpeering
	And User enter dependsOn attributes of Vpcpeering
	And User enter connection attributes of Vpcpeering
	And User enter acceptor attributes of Vpcpeering
	And User enter autoAccept attributes of Vpcpeering
	And User enter requestor attributes of Vpcpeering
	And User enter tags attributes of Vpcpeering
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete Vpcpeering environment and see message environment deleted sucessfully 

@P1	
Scenario:  Validate Yes destroy it after destroy for  vpcpeering
#Test case no 21

	Then User search or create environment for Vpcpeering and see message as environment created successfully
	And User dragdrop vpc1 and enter attribute for vpcPeering
	And User dragdrop route1 and enter attribute for vpcPeering
	And User dragdrop igw1 and enter attribute for vpcPeering
	And User dragdrop subnet1 and enter attribute for vpcPeering
	And User dragdrop routetable1 and enter attribute for vpcPeering
	And User dragdrop RTA1 and enter attribute for vpcPeering
	And User dragdrop vpc2 and enter attribute for vpcPeering
	And User dragdrop igw2 and enter attribute for vpcPeering
	And User dragdrop subnet2 and enter attribute for vpcPeering
	And User dragdrop routetable2 and enter attribute for vpcPeering
	And User dragdrop RTA2 and enter attribute for vpcPeering
	When User click Vpcpeering resource and drag on the dashboard
	And User enter Vpcpeering resource name
	Then Message should display resource created successfully
	And User enter peerOwnerID attributes of Vpcpeering
	And User enter peerVpcId attributes of Vpcpeering
	And User enter VpcId attributes of Vpcpeering
	And User enter dependsOn attributes of Vpcpeering
	And User enter connection attributes of Vpcpeering
	And User enter acceptor attributes of Vpcpeering
	And User enter autoAccept attributes of Vpcpeering
	And User enter requestor attributes of Vpcpeering
	And User enter tags attributes of Vpcpeering
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete Vpcpeering environment and see message environment deleted sucessfully 
	
	
	
	
	
