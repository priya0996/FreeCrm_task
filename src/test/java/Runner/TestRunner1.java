package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/main.feature",glue= {"StepDefinition"},
plugin= {"pretty","html:JunitReport/main/htmlreport",
		"json:JunitReport/main/jsonreport.json",
		"junit:JunitReport/main/xmlreport.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:JunitReport/main/cucumber-reports/report.html"})


public class TestRunner1 {

}