Feature: Modul Contact Tamu

	Scenario: Add Data Contact
		When User go to web JC contact tamu
		And User input data contact
		And User clik button send message
		And User go to web JC Admin
		And User login
		And User go to menu contact
		Then User search data