package step_definitions;

import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleLandingPage;

public class Google_Steps {

    GoogleLandingPage googleLandingPage = new GoogleLandingPage();

    @Given("I am on google home page")
    public void i_am_on_google_home_page() {
        Driver.getDriver().get("https://google.com");
    }



    @Then("I should see that title contains Google")
    public void i_should_see_that_title_contains_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals("Title test fail",expectedTitle,actualTitle);
    }

    @When("I search for pen")
    public void i_search_for_pen() {
        googleLandingPage.searchBox.sendKeys("pen", Keys.ENTER);
    }



    @Then("I see the title contains pen")
    public void i_see_the_title_contains_pen() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "water";
        Assert.assertTrue("Title test fail",actualTitle.contains(expectedTitle));

    }

}
