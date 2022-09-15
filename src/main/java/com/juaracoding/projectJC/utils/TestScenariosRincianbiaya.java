package com.juaracoding.projectJC.utils;

public enum TestScenariosRincianbiaya {
	
	T1("Invalid username password"),
	T2("Invalid username"),
	T3("invalid password"),
	T4("username & password null"),
	T5("User valid login");
	
	
	private String testName;
	
	TestScenariosRincianbiaya(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	

}
