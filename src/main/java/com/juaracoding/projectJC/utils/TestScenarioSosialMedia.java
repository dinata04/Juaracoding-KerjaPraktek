package com.juaracoding.projectJC.utils;

public enum TestScenarioSosialMedia {

	T1("User valid login admin"),
	T2("User not fill link facebook"),
	T3("User not fill link instagram"),
	T4("User not fill link youtube"),
	T5("User not fill number whatsapp"),
	T6("User fill whatsapp with letter"),
	T7("User not fill one form"),
	T8("User fill all form"),
	T9("User fill all form with the true data");

	private String testName;

	TestScenarioSosialMedia(String value) {
			testName = value;
		}

	public String getTestName() {
		return testName;
	}
}
