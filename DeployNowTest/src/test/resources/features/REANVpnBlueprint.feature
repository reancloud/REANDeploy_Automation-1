Feature: Automation of REAN VPN Between VPCs Blueprint

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display


@vpn
Scenario: To create a ec2-user connection for automating the REAN-VPN-between-VPCs Blueprint

	When User create a ec2 user connection
	

@vpn1
Scenario:  To automate the REAN VPN blueprints

	When User click on import button for REAN-VPN Vpn blueprint
	Then User click on upload button on import pop up for REAN-VPN blueprint
	And User click on start import button for REAN-VPN blueprint
	