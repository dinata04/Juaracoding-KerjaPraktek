Feature: Login

	Scenario: User valid login
		When User go to web JC
		And User input username password
		And User click button sign
		Then User Valid login