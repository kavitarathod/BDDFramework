package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber"},
		features = {"src/test/resources/"},
		glue={"stepDefinitions"},
		monochrome = true,
		tags = "@smokeTest or @smoke",   //@smokeTest for single tag
		dryRun = false,
		strict = true
		)
public class TestRunner {

}
