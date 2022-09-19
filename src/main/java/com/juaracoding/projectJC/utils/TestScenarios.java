package com.juaracoding.projectJC.utils;

public enum TestScenarios {
	
	T1("Invalid username password"),
	T2("Invalid username"),
	T3("invalid password"),
	T4("username & password null"),
	T5("User valid login"),
	T6("Logout");
	
	
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	

}
