Feature: Automation of Multi-layer APP

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display

@app
Scenario:To automate the multi-layer APP blueprints

	When User click on import button for APP blueprint
	Then User click on upload button on import pop up for APP blueprint
	And User click on start import button for APP blueprint
	