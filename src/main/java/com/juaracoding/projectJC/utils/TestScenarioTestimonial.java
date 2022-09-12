package com.juaracoding.projectJC.utils;

public enum TestScenarioTestimonial {
	
	T1("User valid login"),
	T2("show testimonial menu"),
	T3("add testimonial"),
	T4("check data");
	
	private String testName;
	
	TestScenarioTestimonial(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	

}
