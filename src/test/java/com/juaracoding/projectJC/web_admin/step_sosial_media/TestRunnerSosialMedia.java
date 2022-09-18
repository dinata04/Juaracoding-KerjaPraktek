package com.juaracoding.projectJC.web_admin.step_sosial_media;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
				features = {"src/test/resources/features/05.SosalMedia.feature"},
				glue = "com.juaracoding.projectJC.web_admin.step_sosial_media",
				plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})

public class TestRunnerSosialMedia extends AbstractTestNGCucumberTests {

}
