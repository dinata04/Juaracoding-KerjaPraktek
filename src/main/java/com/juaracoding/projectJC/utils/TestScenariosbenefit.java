package com.juaracoding.projectJC.utils;

public enum TestScenariosbenefit {
	
	T1("User valid login"),
	T2("show benefit menu"),
	T3("add benefit"),
	T4("edit benefit"),
	T5("check data");
	private String testName;
	
	TestScenariosbenefit(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	

}
