package com.juaracoding.projectJC.web_tamu.modul_contact_message_negative;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
				features = {"src/test/resources/features/03.ContactTamuNegative.feature"},
				glue = "com.juaracoding.projectJC.web_tamu.modul_contact_message_negative",
				plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})
public class TestRunnerContactNegative extends AbstractTestNGCucumberTests {

}