package Cucumber.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/main/java/Cucumber/Features", glue = "Cucumber.Stepdefs",
        monochrome = true, plugin={"html:src/main/resources/Reports/Cucumber.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
