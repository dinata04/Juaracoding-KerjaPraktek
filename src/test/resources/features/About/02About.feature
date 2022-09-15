# sebelum mejalankan buat 1 trainer dengan nama "tester 3" .
# Dantidak boleh double trainer dengan nama sama.
Feature: Modul About

# 1.pass--------------------------------------------------------------------

	Scenario: show about menu
    When click about menu

# 2.pass--------------------------------------------------------------------

	Scenario: edit about invalid delete name
		When search name "tester3"
		And open trainer
		And delete nama
		Then try click save
	
# 3.pass--------------------------------------------------------------------
	
	Scenario: edit about invalid delete jabatan
		And open trainer
		And delete jabatan
		Then try click save

# 4.pass--------------------------------------------------------------------
	
	Scenario: edit about invalid delete text profile
		And open trainer
		And delete text profile
		Then try click save

# 5.pass--------------------------------------------------------------------
	
	Scenario: edit about valid change data
		And open trainer
		And input file "C:\Users\Ramma\Pictures\gambar steam\nuggen.PNG"
		And delete nama
		And input nama ulang "test about edit"
		And delete jabatan
		And input jabatan "jabatan Berhasil"
		And delete text profile
		And input text profile "isi test Trainer"
		And select publish 1
		Then click save

# 6.pass--------------------------------------------------------------------
	
	Scenario: add about invalid
		When click about menu
		When click add
		Then click save
		And input file "C:\Users\Ramma\Pictures\gambar steam\pewdiepie.jpg"
		Then click save
		And input name "testTrainer edit"
		Then click save
		And input jabatan "isi jabatan edit"
		And select publish 0
		Then click save
		And back page

# 7.pass--------------------------------------------------------------------

  Scenario: add about valid
		When click add
		And input file "C:\Users\Ramma\Pictures\antony.jpg"
		And input name "testTrainer BerhasilL"
		And input jabatan "isi jabatan"
		And input text profile "isi test Trainer"
		And select publish 0
		Then click save
	
# 8.pass--------------------------------------------------------------------
		
	Scenario: check data
		When search name "testTrainer BerhasilL"
		And navigate to jc
		Then click about jc
		And click last radio button jc
		
#------------------------------------------------------------------------------
