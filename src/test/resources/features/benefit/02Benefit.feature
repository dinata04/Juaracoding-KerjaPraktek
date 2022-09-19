Feature: Modul Benefit


	

# fail test tambah data--------------------------------------------------------
Scenario: show benefit menu fail
		When click sub menu
		And click benefit menu
		
		Scenario: add benefit fail
		When click add benefit
		And input text judul 1 ""
		And input isi deskripsi 1 ""
		And select publish 1
		Then click save
		
# pass test tambah data--------------------------------------------------------
Scenario: show benefit menu
		When click sub menu
		And click benefit menu
		
		
		Scenario: add benefit
		When click add benefit
		And input text judul 1 "testing123"
		And input isi deskripsi 1 "tester12345asd"
		And input text judul 2 "testing1234"
		And input isi deskripsi 2 "tester12345asd"
		And input text judul 3 "testing12345"
		And input isi deskripsi 3 "tester12345asd"
		And input text judul 4 "testing123456"
		And input isi deskripsi 4 "tester12345asd"
		And select publish 1
		Then click save
		
		# test edit data--------------------------------------------------------
	Scenario: edit benefit
		When click edit
		And edit text judul 1 "testing123123123"
		And select publish 2
		Then click save
		
	Scenario: check data
		When click sub menu
		And click benefit menu
			#-------------------------------------------------------------------------