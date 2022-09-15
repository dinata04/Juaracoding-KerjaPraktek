Feature: Modul Contact Tamu

	Scenario: Tambah Data Contact
		When User go to web JC Contact Tamu
		And User input data contact
		And User clik button send message
		Then Alert valid message
		