package com.juaracoding.projectJC.utils;

public enum TestScenarios {
	
	T1("User valid login");
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	

}
