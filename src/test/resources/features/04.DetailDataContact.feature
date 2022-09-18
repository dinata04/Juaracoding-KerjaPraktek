Feature: Detail Contact Admin

	Scenario: View Data Contact
		When User go to web JC contact tamu two
		And User input data contact two
		And User clik button send message two
		And User go to web JC Admin three
		And User login two
		And User go to menu contact two
		And User view data name in table
		And User view data email in table
		And User view data phone number in table
		And User view data subject in table
		And User view data message in table
		And User click button next
		Then User click button prev