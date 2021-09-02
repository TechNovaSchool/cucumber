package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //this line will force this to RUN using cucumber
@CucumberOptions (
        plugin = {"html:target/cucumber-report.html",
        "json:target/parallel-cucumber-report1.json"},
        features = "src/test/resources/features/google/google.feature",
        glue = "step_definitions"
)

public class GoogleCukesRunnerParallel {

}
