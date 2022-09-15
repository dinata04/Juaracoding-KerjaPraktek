Feature: Blog

	Scenario: Valid add blog
		When click menu blog
		And click button tambah
		And choose foto
		And input Judul
		And select publish "Active"
		And select set to home "ya"
		And input content preview
		And input content
		And click button simpan
		Then valid add blog