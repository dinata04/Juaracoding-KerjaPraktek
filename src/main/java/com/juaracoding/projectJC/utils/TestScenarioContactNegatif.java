package com.juaracoding.projectJC.utils;

public enum TestScenarioContactNegatif {
	
	T1("Do Not Fill in the Name");
//	T2("Fill Name with Number"),
//	T3("Do Not Fill in the Email"),
//	T4("Fill in The Phone Number with the Letter"),
//	T5("Do Not Fill in The Phone Number"),
//	T6("Do Not Fill in Subject"),
//	T7("Do Not Fill in Message"),
//	T8("Failed to Send Message One"),
//	T9("Failed to Send Message Two"),
//	T10("Fill Name with Numbers");
	
	private String testName;

	TestScenarioContactNegatif(String value) {
		testName = value;
	}

	public String getTestName() {
		return testName;
	}


}
