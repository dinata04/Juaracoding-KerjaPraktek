Feature: Modul Contact Tamu Negative

	#1.fail => tidak mengisi nama ---------------------------------------------------------------------

	Scenario: Do Not Fill in the Name
		When User go to web JC contact tamu
		And User not input name
		And User clik button send one
		Then Alert invalid message one
		
	#2.fail => mengisi email dengan angka ---------------------------------------------------------------------
	Scenario: Fill Name with Number
		When User input name with number
		And User clik button send two
		Then Alert invalid message two
	
	#3.fail => tidak mengisi email ---------------------------------------------------------------------
	Scenario: Do Not Fill in the Email
		When User not input email
		And User clik button send three
		Then Alert invalid message three
	
	#4.fail => mengisi phone number dengan huruf ---------------------------------------------------------------------
	Scenario: Fill in The Phone Number with the Letter
		When User input phone number with letter
		And User clik button send four
		Then Alert invalid message four
		
	#5.fail => tidak mengisi phone number ---------------------------------------------------------------------
	Scenario: Do Not Fill in The Phone Number
		When User not input phone number
		And User clik button send five
		Then Alert invalid message five
	
	#6.fail => tidak mengisi subject ---------------------------------------------------------------------
	Scenario: Tambah Data Contact
		When User not input subject
		And User clik button send six
		Then Alert invalid message six
	
	#7.fail => tidak mengisi message ---------------------------------------------------------------------
	Scenario: Tambah Data Contact
		When User not input message
		And User clik button send seven
		Then Alert invalid message seven

	#8.fail => gagal send message ke contact ---------------------------------------------------------------------
	Scenario: Failed to Send Message
		When User not input one data
		And User clik button send eight
		Then Alert invalid message eight
	