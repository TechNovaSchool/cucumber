package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleLandingPage {

    public GoogleLandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "q")
    public WebElement searchBox;

}
