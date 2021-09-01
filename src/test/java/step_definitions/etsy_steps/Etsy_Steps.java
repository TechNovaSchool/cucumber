package step_definitions.etsy_steps;

import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.etsyPage.EtsyHomePage;

public class Etsy_Steps {
    EtsyHomePage etsyHomePage = new EtsyHomePage();

    @Given("I am on etsy homepage")
    public void i_am_on_etsy_homepage() {
        Driver.getDriver().get("https://etsy.com");
    }
    @When("I search for book")
    public void i_search_for_book() {
        etsyHomePage.search.sendKeys("book");


    }
    @When("I click on search box")
    public void i_click_on_search_box() {
        etsyHomePage.searchBtn.click();

    }
    @Then("I see the title contains book")
    public void i_see_the_title_contains_book() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Book";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("I search for {string}")
    public void i_search_for(String product) {
        etsyHomePage.search.sendKeys(product);
    }

    @Then("I see the title contains {string}")
    public void i_see_the_title_contains(String string) {
        String actualTitle = Driver.getDriver().getTitle().toLowerCase();
        String expectedTitle = string.toLowerCase();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
