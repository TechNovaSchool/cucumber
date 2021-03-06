package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //this line will force this to RUN using cucumber
@CucumberOptions (
        plugin = {"html:target/cucumber-report.html", "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = false,
        tags = "@airTable"
)

public class CukesRunner {

}
