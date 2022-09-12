package com.juaracoding.projectJC.utils;

public enum TestScenarioAbout {
	
	T1("User valid login"),
	T2("show about menu"),
	T3("add trainer"),
	T4("check data");
	
	private String testName;
	
	TestScenarioAbout(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	

}
