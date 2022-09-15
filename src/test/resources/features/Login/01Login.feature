Feature: Login Admin

	Scenario: User valid login
		When User go to web JC
		When User input username password
		And User clik button sign
		Then User Valid login
		
		