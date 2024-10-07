package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features/Admin.feature",  // Corrected path to the feature file
    glue = "stepDefinitions",  // Corrected spelling of "stepDefinitions"
    dryRun = false,
    monochrome = true,
    publish = true,
    tags = "@Single"
)

public class TestRunner {

}
