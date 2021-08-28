package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderLandingPage {

    public SmartBearOrderLandingPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = ".login_info")
    public WebElement welcomeMessage;
}
