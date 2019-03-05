package com.basic.ereport;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		// activate html report in json
			
		plugin = {
				"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
		}, 
		tags = {"@Smoke"},
		
		//features: paths of feature file
		features = {"src/test/resources/com/basic/ereportFF"},
		
		//glue: packages of java cose of implementation of steps
		glue = {"com/basic/ereportSD"}
		
		//automation
		//one instance of chromedriver
		//monochrome = true,
		//
		//dryRun = true
		
		

		
		)
public class RunExtendReportScenarioTest {

}
