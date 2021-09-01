package step_definitions;

import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup() {
        //Here we can add anything which we want to run before our scenarios
        System.out.println("--The scenario is running--");
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("-The scenario is closing--");
        if (scenario.isFailed()) {
            //We are casting our Webdriver object to TakesScreenshot
            // interface on order to be able to use method which come from interface
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //attach the screen shot mentioning  media type and name
            scenario.attach(screenshot,"image/png","screeshot");
        }

        Driver.quitDriver();
    }
}
