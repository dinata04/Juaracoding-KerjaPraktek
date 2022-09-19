Feature: Login Admin

	@Tag1
	Scenario: Invalid username password
		When User go to web JC
		And User input invalid username password
		And User click button sign one
		Then User invalid login one
		
	@Tag2
	Scenario: Invalid username
		When User input invalid username
		And User click button sign two
		Then User invalid login two
		
	@Tag3	
	Scenario: Invalid password
		When User input invalid password
		And User click button sign three
		Then User invalid login three
		
	@Tag4
	Scenario: Username and password null
		When Username password null
		And User click button sign four
		Then User invalid login four
		
	@Tag5	
	Scenario: User valid login
		When User input username password
		And User clik button sign
		Then User Valid login
		
	Scenario: Logout
		When click logout
		Then validation success logout
		