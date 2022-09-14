package com.juaracoding.projectJC.web_tamu.modul_contact_message;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
				features = {"src/test/resources/WebTamu/01.ContactTamu.feature"},
				glue = "com.juaracoding.projectJC.web_tamu.modul_contact_message",
				plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})
public class TestRunnerContactPositif extends AbstractTestNGCucumberTests{

}
