package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/Features/InvalidDate.feature")
// glue = { "stepdefinition" },
//plugin= {"pretty","html:TestNGReport/main/htmlreport",
//		"json:TestNGReport/main/jsonreport.json",
//		"junit:TestNGReport/main/xmlreport.xml",
//		"com.cucumber.listener.ExtentCucumberFormatter:TestNGReport/main/cucumber-reports/report.html"})
//		

public class testrunner extends AbstractTestNGCucumberTests {
}
