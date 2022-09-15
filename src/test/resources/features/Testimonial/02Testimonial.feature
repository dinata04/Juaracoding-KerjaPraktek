#	sebelum menjalankan harus ada peserta dengan nama "tester fail 1" dan "tester fail 2"
#	Dantidak boleh double trainer dengan nama sama.
Feature: Modul Testimonial
	
	# 1.pass--------------------------------------------------------------------
	
	Scenario: show testimonial menu
		When click sub menu
		And click testimonial menu
	
	# 2.fail---------------------------------------------------------------------
	
	Scenario: edit testimonial invalid delete name
		When search name "tester fail 1"
		Then open peserta
		And clear name edit
		Then click save
		And cek alert edit

	# 3.pass---------------------------------------------------------------------
	
	Scenario: edit testimonial invalid delete text testimonial
		When search name "tester fail 2"
		Then open peserta
		And clear txt testimonial edit
		Then click save
		And cek alert edit
		And back page
	
	# 4.pass---------------------------------------------------------------------
	
	Scenario: edit testimonial valid change data
		And input file edit "C:\Users\Ramma\Pictures\antony.jpg"
		And clear name edit
		And input name edit "Tester Edit valid"
		And clear txt testimonial edit
		And input text testimonila edit "Edit berhasil"
		And select publish 1
		And select rating 3
		Then click save
	
	# 5.pass---------------------------------------------------------------------
	
	Scenario: add testimonial invalid data null
		When click add 
		Then click save
		And back page
		
	#	6.Fail--------------------------------------------------------------------
		
	Scenario: add testimonial invalid just foto
		And input file "C:\Users\Ramma\Pictures\gambar steam\bsodSad.jpg"
		And select publish 1
		Then click save
		And cek alert add
		
	#	7.pass---------------------------------------------------------------------
	
	Scenario: add testimonial invalid just name
		When click add
		And input name "ini error"
		Then click save
		And cek alert add
		And back page
	
	#	8.pass---------------------------------------------------------------------
	
	Scenario: add testimonial invalid just testimonial 
		And input text testimonial "ini pasti error"
		Then click save
		And cek alert add
		And back page

	# 9.pass---------------------------------------------------------------------
	
	Scenario: add testimonial valid
		And input file "C:\Users\Ramma\Pictures\Wallpepar\logo steam\nursultan tulyakbay.jpeg"
		And input name "testerTestimonial berhasil"
		And select publish 0
		And input text testimonial "ini isi testimonialnya"
		And select rating 4
		Then click save
		
	Scenario: check data valid
		When search name "testerTestimonial berhasil"
		And navigate to jc
		Then cek testimonial jc
		
	# --------------------------------------------------------------------------