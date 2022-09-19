package com.juaracoding.projectJC.utils;

public enum TestScenariosbenefit {
	
	T1("User valid login"),
	T2("show benefit menu fail"),
	T3("fail add benefit"),
	T4("show benefit menu"),
	T5("pass add benefit"),
	T6("edit benefit"),
	T7("check data");
	private String testBenefit;
	
	TestScenariosbenefit(String value) {
		testBenefit = value;
	}
	
	public String getTestName() {
		return testBenefit;
	}
	

}
