Feature: Modul Rincianbiaya
	
	Scenario: show rincianbiaya menu
		When click sub menu
		And click rincianbiaya menu	
	
	Scenario: add rincianbiaya
		When click add
		And input text nama program "IT Help"
		And input text harga normal "6000000"
		And click add increase harga
		And click add decrease harga 
		And input text diskon "20"
		And click add increase diskon 
		And click add decrease diskon
		And show text harga setelah diskon
		And input text keunggulan1 "Memberikan Materi"
		And input text keunggulan2 "Memberikan Motivasi"
		And input text keunggulan3 "Memberikan Semangat"
		And input text keunggulan4 "Memberikan Keunggulan"
		And input text keunggulan5 "Memberikan Konsumsi"
		And select publish
		Then click Save
	
	Scenario: check data valid
		When search name "ahoy"
		And navigate to jc
		Then search nama program
		
		