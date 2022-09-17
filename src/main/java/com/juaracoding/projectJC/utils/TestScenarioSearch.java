package com.juaracoding.projectJC.utils;

public enum TestScenarioSearch {
		
	T1("User valid login"),
	T2("User search name"),
	T3("User search name null"),
	T4("User search email"),
	T5("User search email null"),
	T6("User search number"),
	T7("User search number null"),
	T8("User search subject"),
	T9("User search subject null"),
	T10("User search message");

	private String testName;

	TestScenarioSearch(String value) {
			testName = value;
		}

	public String getTestName() {
		return testName;
	}
}