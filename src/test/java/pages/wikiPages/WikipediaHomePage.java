package pages.wikiPages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaHomePage {

    public WikipediaHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath ="(//div[@id=\"simpleSearch\"]/input)[1]")
    public WebElement searchBox;

    @FindBy (id ="firstHeading")
    public WebElement articleHeader;

    @FindBy (xpath = "//div[@class=\"fn\"]")
    public WebElement imageHeader;

    @FindBy (id = "searchButton")
    public  WebElement searchButton;



}
