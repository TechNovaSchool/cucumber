package step_definitions.autoamtionPracticeSteps;

import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.automationPracticePages.AutomationPracticeLandingPage;

public class AutomationBasicSteps {

    AutomationPracticeLandingPage automationPracticeLandingPage = new AutomationPracticeLandingPage();

    @Given("I open the AutomationPractice Website")
    public void i_open_the_automation_practice_website() {
        Driver.getDriver().get("http://automationpractice.com/index.php");

    }
    @When("I check the title")
    public void i_check_the_title() {
        Driver.getDriver().getTitle();

    }
    @Then("I should see the correct name")
    public void i_should_see_the_correct_name() {
        String expected = "My Store";
        Assert.assertEquals(expected, Driver.getDriver().getTitle());
    }

    @When("I add a new product to my cart")
    public void i_add_a_new_product_to_my_cart() {
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        jse.executeScript("window.scrollBy(0,750)");
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(automationPracticeLandingPage.picture1).perform();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        automationPracticeLandingPage.product1.click();
    }

    @Then("I check it contains a product text")
    public void i_check_it_contains_a_product_text() {
        String productText = automationPracticeLandingPage.cart.getText();
        String cartText = "1 Product";
        System.out.println(productText);
        Assert.assertTrue(productText.contains(cartText));

    }
}
