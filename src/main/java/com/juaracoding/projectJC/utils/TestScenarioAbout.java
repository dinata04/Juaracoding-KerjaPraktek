package com.juaracoding.projectJC.utils;

public enum TestScenarioAbout {
	
	T1("User valid login"),
	T2("show about menu"),
	T3("edit about invalid delete name"),
	T4("edit about invalid delete jabatan"),
	T5("edit about invalid delete text profile"),
	T6("edit about valid change data"),
	T7("add about invalid"),
	T8("add about valid"),
	T9("check data");
	
	private String testName;
	
	TestScenarioAbout(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	

}
