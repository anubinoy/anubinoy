package runner;




import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
    @CucumberOptions(features="src/test/resources/features/array.feature",
    	glue="stepdefinitions",	
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/report.html"}

     )
    public class TestRunner  {
    	
    	
}