Feature: Modul Blog

	Scenario: Login
		When User go to web JC
		And User login
		
		
	# Menampilkan Halaman Blog
	Scenario: show menu blog
		When click menu blog
	
	# Melakukan Search
	Scenario: search blog
		When input keyword
		Then validation search
		
	# Tambah Blog Tidak menginput foto
	Scenario: no choose foto
		When click button tambah1
		And no choose foto
		Then click button simpan1
		
	# Tambah Blog tidak menginput judul
	Scenario: no input judul
		When click button tambah2
		And no input judul
		And click button simpan2
		Then validation no input judul
		
	# Tambah Blog tidak menginput content preview
	Scenario: no input content preview
		When click button tambah3
		And no input content preview
		And click button simpan3
		Then validation no input conten preview
		
	# Tambah Blog tidak menginput content 
	Scenario: no input content 
		When click button tambah4
		And no input content
		And click button simpan4
		Then validation no input conten
		
	# Tambah Blog tidak menginput form
	Scenario: no input form 
		When click button tambah5
		And no input form
		Then click button simpan5
		
	# Edit Blog valid
	Scenario: valid edit blog
		When click blog
		And edit form blog
		And click button simpan edit
		Then validation success edit
		
		# Edit Blog tidak mengisi content preview
	Scenario: edit content preview null 
		When click blog1
		And edit content preview
		Then click button simpan edit1
		Then validation success edit1
	
	# Edit Blog tidak mengisi content
	Scenario: edit content null 
		When click blog2
		And edit content
		Then click button simpan edit2
		Then validation success edit2
	
	# Tambah Blog valid
	Scenario: valid add Blog
		When click button tambah
		And input form add valid
		And click button simpan
		Then validation success add
	
	# Validasi Blog di web tamu
	Scenario: validation web tamu
		When go to web tamu
		And click menu blog Tamu
		Then validation data blog
		
		