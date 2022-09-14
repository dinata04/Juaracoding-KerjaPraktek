
Feature: Modul About

















#test tambah trainer-----------------------------------------------------
  Scenario: show about menu
    When click about menu

  Scenario: add trainer
		When click add
		And input file "C:\Users\Ramma\Pictures\Baizhu.jpg"
		And input name "testTrainer11"
		And input jabatan "isi jabatan"
		And input isi profile "isi test Trainer"
		And select publish 0
		Then click save
		
	Scenario: check data
		When search name "testTrainer11"
		And navigate to jc
		Then click about jc
		And click last radio button jc
		
#-------------------------------------------------------------------------
