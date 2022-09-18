package com.juaracoding.projectJC.web_admin.step_view_data;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
				features = {"src/test/resources/features/04.DetailDataContact.feature"},
				glue = "com.juaracoding.projectJC.web_admin.step_view_data",
				plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})
public class TestRunnerDetailData extends AbstractTestNGCucumberTests{

}
