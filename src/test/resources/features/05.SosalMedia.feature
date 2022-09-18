Feature: Modul Sosial Media

	#0.passed => valid login ---------------------------------------------------------------------

	Scenario: User valid login admin
		When User go to web JC contact admin four
		And User sign in
		And User clik button sign in
		And User get validasi succeed sign in
		And User go to home jc
		And User click button sosial media
		Then User get validasi sosial media
		
	#1.failed => tidak masukan link facebook ---------------------------------------------------------------------
	
	Scenario: User not fill link facebook
		When User not input link facebook
		And User click save one
		Then User get validasi one
		
	#2.failed => tidak masukan link instagram ---------------------------------------------------------------------

	Scenario: User not fill link instagram
		When User not input link instagram
		And User click save two
		Then User get validasi two
			
	#3.failed => tidak masukkan link youtube ---------------------------------------------------------------------

	Scenario: User not fill link youtube
		When User not input link youtube
		And User click save three
		Then User get validasi three
			
	#4.failed => tidak masukkan no whatsapp ---------------------------------------------------------------------

	Scenario: User not fill number whatsapp
		When User not input number whatsapp
		And User click save four
		Then User get validasi four
		
	#5.failed => masukan no whatsapp dengan huruf ---------------------------------------------------------------------	
	
	Scenario: User fill whatsapp with letter
		When User input whatsapp with letter
		And User click save five
		Then User get validasi five

	#6.failed => gagal simpan data sosial media ---------------------------------------------------------------------	
	
	Scenario: User not fill one form
		When User not input one form
		And User click save six
		Then User get validasi six
			
	#7.passed => simpan data sosial media ---------------------------------------------------------------------	
		#7a.passed => masukan link facebook ---------------------------------------------------------------------
		#7b.passed => masukkan link instagram ---------------------------------------------------------------------	
		#7c.passed => masukkan link youtube ---------------------------------------------------------------------	
		#7d.passed => masukkan no whatsapp ---------------------------------------------------------------------
	
	Scenario: User fill all form
		When User input all form
		And User click save seven
		Then User get validasi seven
	
	#8.passed => berihasil simpan data sosial media ---------------------------------------------------------------------	

	Scenario: User fill all form with the true data
		When User input all form with the true data
		And User click save eight
		Then User get validasi eight