Feature: Modul Testimonial

	
	
	
	
	


	# test tambah data--------------------------------------------------------
	Scenario: show testimonial menu
		When click sub menu
		And click testimonial menu
	
	Scenario: add testimonial
		When click add
		And input file "C:\Users\Ramma\Pictures\Baizhu.jpg"
		And input name "tester53"
		And select publish 0
		And input text testimonial "isi tester53"
		And select rating 4
		Then click save
		
	Scenario: check data
		When search name "tester53"
		
	#-------------------------------------------------------------------------
