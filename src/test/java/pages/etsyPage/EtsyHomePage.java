package pages.etsyPage;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {

    public EtsyHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "#global-enhancements-search-query")
    public WebElement search;

    @FindBy (xpath = "(//button[@type =\"submit\"])[1]")
    public WebElement searchBtn;
}
