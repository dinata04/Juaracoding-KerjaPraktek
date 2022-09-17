package com.juaracoding.projectJC.utils;

public enum TestScenariosBlog {
	
	T1("Login"),
	T2("show menu blog"),
	T3("search blog"),
	T4("no choose foto"),
	T5("no input judul"),
	T6("no input content preview"),
	T7("no input content"),
	T8("no input form"),
	T9("valid edit blog"),
	T10("edit content preview null"),
	T11("edit content null"),
	T12("valid add blog");
	
	private String testName;
	
	TestScenariosBlog(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
