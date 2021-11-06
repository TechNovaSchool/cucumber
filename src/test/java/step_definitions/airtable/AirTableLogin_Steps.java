package step_definitions.airtable;

import Utilities.APIUtillities;
import Utilities.Config;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.airtablePage.AirTableLoginPage;

public class AirTableLogin_Steps {

    AirTableLoginPage airTableLoginPage = new AirTableLoginPage();

    @Given("Navigate to login page")
    public void navigate_to_login_page() {
        Driver.getDriver().get(Config.getProperty("loginAirTableURL"));
    }

    @When("Enter the email address")
    public void enter_the_email_address() throws Exception {
        airTableLoginPage.emailInpt.sendKeys(Config.getProperty("User"));
    }

    @When("Enter the password")
    public void enter_the_password() {
        airTableLoginPage.passwordInpt.sendKeys(Config.getProperty("Pass"));
    }

    @When("press the sign in button")
    public void press_the_sign_in_button() {
        airTableLoginPage.signIn.click();
    }

    @Then("Home base page should appear")
    public void home_base_page_should_appear() {
        String actual = "My First Workspace";
        Assert.assertEquals(actual,airTableLoginPage.MyWorkSpace.getText());
    }
    @Then("Click on Dragon warior button")
    public void click_on_dragon_warior_button() {
        airTableLoginPage.DragonWarriors.click();
    }

    @When("I add a new record")
    public void i_add_a_new_record()  throws Exception{
        airTableLoginPage.firstNameField.click();
        airTableLoginPage.firstNameField.sendKeys("James");

        airTableLoginPage.lastNameField.click();
        airTableLoginPage.lastNameField.sendKeys("Kool");

        airTableLoginPage.phoneField.click();
        airTableLoginPage.phoneField.sendKeys("(623) 817-8526");

        airTableLoginPage.addressField.click();
        airTableLoginPage.addressField.sendKeys("741 Drive", Keys.ENTER);
        Thread.sleep(5000);

    }
    @Then("I will check with API that record was saved")
    public void i_will_check_with_api_that_record_was_saved() {
        APIUtillities.hitGET("");
        Assert.assertEquals("James",APIUtillities.getResponseBody().getRecords().get(0).getFields().getFirstname());
        Assert.assertEquals("Kool",APIUtillities.getResponseBody().getRecords().get(0).getFields().getLastname());
        Assert.assertEquals("(623) 817-8526",APIUtillities.getResponseBody().getRecords().get(0).getFields().getPhone());
        Assert.assertEquals("741 Drive",APIUtillities.getResponseBody().getRecords().get(0).getFields().getAddress());
    }

}
