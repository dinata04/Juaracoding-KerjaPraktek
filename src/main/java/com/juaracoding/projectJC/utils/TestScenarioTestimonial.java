package com.juaracoding.projectJC.utils;

public enum TestScenarioTestimonial {
	
	T1("User valid login"),
	T2("show testimonial menu"),
	T3("edit testimonial invalid delete name"),
	T4("edit testimonial invalid delete text testimonial"),
	T5("edit testimonial valid change data"),
	T6("add testimonial invalid data null"),
	T7("add testimonial invalid just foto"),
	T8("add testimonial invalid just name"),
	T9("add testimonial invalid just testimonial"),
	T10("add testimonial valid"),
	T11("check data valid");
	
	private String testName;
	
	TestScenarioTestimonial(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	
	
}
