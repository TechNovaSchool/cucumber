package step_definitions.wiki_steps;

import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.wikiPages.WikipediaHomePage;

public class Wikipedia_Steps {
    WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();

    @Given("user click on wikipedia page")
    public void user_click_on_wikipedia_page() {
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Main_Page");

    }
    @When("User type Steve Jobs in the wiki search box")
    public void user_type_steve_jobs_in_the_wiki_search_box() {
        wikipediaHomePage.searchBox.sendKeys("Steve Jobs");

    }
    @When("User click search button")
    public void user_click_search_button() {
        wikipediaHomePage.searchButton.click();
    }

    @Then("User see Steve Jobs in the wiki page title")
    public void user_see_steve_jobs_in_the_wiki_page_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Steve Jobs";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("User see Steve Jobs in the main header")
    public void user_see_steve_jobs_in_the_main_header() {
        String header = wikipediaHomePage.articleHeader.getText();
        String expectedHeader = "Steve Jobs";
        Assert.assertTrue(header.contains(expectedHeader));
    }



    @Then("User see Steve Jobs in the Header verification")
    public void user_see_steve_jobs_in_the_header_verification() {
        String imageHeader =wikipediaHomePage.imageHeader.getText();
        String expectedHeader = "Steve Jobs";
        Assert.assertTrue(imageHeader.contains(expectedHeader));

    }


    @When("User type {string} in the wiki search box")
    public void user_type_in_the_wiki_search_box(String name) throws InterruptedException {
        wikipediaHomePage.searchBox.sendKeys(name);

    }
    @Then("User see {string} in the Header verification")
    public void user_see_in_the_header_verification(String test) {
        String imageHeader =wikipediaHomePage.imageHeader.getText();
        String expectedHeader = test;
        Assert.assertTrue(imageHeader.contains(expectedHeader));

    }
}
