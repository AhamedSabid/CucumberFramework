package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:Reports/cucumber-html-report-Junit.html", "json:target/cucumber.json",
		"pretty"},
features = { "src/test/java/Features" }, 
glue = { "StepDefinitions" },
monochrome = true)

public class MyTestRunner {
	
	
	/*
	 * @AfterClass public static void setup() { Reporter.loadXMLConfig(new
	 * File("./extent-config.xml")); //Reporter.setSystemInfo("Test User",
	 * System.getProperty("user.name")); Reporter.setSystemInfo("User Name", "AJ");
	 * Reporter.setSystemInfo("Application Name", "Test App ");
	 * Reporter.setSystemInfo("Operating System Type",
	 * System.getProperty("os.name").toString());
	 * Reporter.setSystemInfo("Environment", "Production");
	 * Reporter.setTestRunnerOutput("Test Execution Cucumber Report"); }
	 */

}
