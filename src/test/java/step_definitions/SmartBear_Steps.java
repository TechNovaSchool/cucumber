package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SmartBearLoginPage;
import pages.SmartBearOrderLandingPage;

public class SmartBear_Steps {
    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
    SmartBearOrderLandingPage smartBearOrderLandingPage = new SmartBearOrderLandingPage();

    @When("User is on SmartBear login page")
    public void user_is_on_smart_bear_login_page() {
        Driver.getDriver().get(Config.getProperty("smartBearURL"));
    }

    @When("User enters correct username2")
    public void user_enters_correct_username2() {
        smartBearLoginPage.username.sendKeys(Config.getProperty("userName"));
    }

    @When("User enters correct password")
    public void user_enters_correct_password() {
        smartBearLoginPage.password.sendKeys(Config.getProperty("password"));
    }
    @When("User clicks to login button")
    public void user_clicks_to_login_button() {
        smartBearLoginPage.loginButton.click();

    }
    @Then("User should be logged in and be able to verify Welcome text is displayed")
    public void user_should_be_logged_in_and_be_able_to_verify_welcome_text_is_displayed() {
        String actual = smartBearOrderLandingPage.welcomeMessage.getText();
        String expectedMessage = "Welcome";
        System.out.println(actual);
        Assert.assertTrue(actual.contains(expectedMessage));
    }

    @When("User enters incorrect password")
    public void user_enters_incorrect_password() {
        smartBearLoginPage.password.sendKeys("12345");
    }

    @Then("User should see the error message displayed on the page")
    public void user_should_see_the_error_message_displayed_on_the_page() {
        Assert.assertTrue(smartBearLoginPage.status.isDisplayed());
    }
}
