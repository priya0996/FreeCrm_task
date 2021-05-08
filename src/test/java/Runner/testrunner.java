package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Features/login.feature",
glue= {"stepdefinition"})
public class testrunner extends AbstractTestNGCucumberTests{
}

