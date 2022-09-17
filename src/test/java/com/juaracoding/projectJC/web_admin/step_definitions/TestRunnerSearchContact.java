package com.juaracoding.projectJC.web_admin.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
				features = {"src/test/resources/features/01.SearchContact.feature"},
				glue = "com.juaracoding.projectJC.web_admin.step_definitions",
				plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})
public class TestRunnerSearchContact extends AbstractTestNGCucumberTests {

}
