package com.juaracoding.projectJC.utils;

public enum TestScenariosBlog {
	
	T1("Login"),
	T2("show menu blog"),
	T3("valid add blog");
	
	private String testName;
	
	TestScenariosBlog(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
