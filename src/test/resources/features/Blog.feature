Feature: Modul Blog

	Scenario: Login
		When User go to web JC
		And User login
		
		
	# Menampilkan Halaman Blog
	Scenario: show menu blog
		When click menu blog
		
	# Case Tambah Blog Positive
	Scenario: valid add Blog
		When click button tambah
		And input form add
		And click button simpan
		
		