Feature: Seacrh Contact

	#0.passed => valid login ---------------------------------------------------------------------
	
	Scenario: User valid login
		When User go to web JC Admin Two
		And User input username password
		And User clik button sign
		Then User get valid login
	
	#1.passed => Search bye kategori nama dan diisi nama misalnya "bina" ---------------------------------------------------------------------
		
	Scenario: User search name
		When User go to contact
		And User select colom by name
		And User input colom search with name
		Then User get result one
		
	#2.fail => Search bye kategori nama dan tidak diisi nama ---------------------------------------------------------------------
	
	Scenario: User search name null
		When User select colom by name two
		And User not input colom one
		Then User get result two
	
	#3.passed => Search bye kategori email dan diisi email misalnya "erbina" ---------------------------------------------------------------------
	
	Scenario: User search email
		When User select colom by email
		And User input colom search with email
		Then User get result three
		
	#4.fail => Search bye kategori email dan tidak diisi email ---------------------------------------------------------------------
	
	Scenario: User search email null
		When User select colom by email two
		And User not input colom two
		Then User get result four
		
	#5.passed => Search bye kategori phone number dan diisi phone number misalnya "123" ---------------------------------------------------------------------
	
	Scenario: User search number
		When User select colom by number
		And User input colom search with number
		Then User get result five
		
	#6.fail => Search bye kategori phone number dan tidak diisi phone number ---------------------------------------------------------------------
	
	Scenario: User search number null
		When User select colom by number two
		And User not input colom three
		Then User get result six
		
	#7.passed => Search bye kategori subject dan diisi subject misalnya "coba" ---------------------------------------------------------------------

	Scenario: User search subject
		When User select colom by subject
		And User input colom search with subject
		Then User get result seven
		
	#8.fail => Search bye kategori subject dan tidak diisi subject ---------------------------------------------------------------------
	
	Scenario: User search subject null
		When User select colom by subject two
		And User not input colom four
		Then User get result eight
		
	#9.passed => Search bye kategori message ---------------------------------------------------------------------
	
	Scenario: User search message
		When User select colom by message
		And User input colom search with message
		Then User get result nine
	