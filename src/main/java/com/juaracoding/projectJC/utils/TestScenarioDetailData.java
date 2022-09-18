package com.juaracoding.projectJC.utils;

public enum TestScenarioDetailData {
	
	T1("View Data Contact");
	
	private String testName;

	TestScenarioDetailData(String value) {
		testName = value;
	}

	public String getTestName() {
		return testName;
	}


}
