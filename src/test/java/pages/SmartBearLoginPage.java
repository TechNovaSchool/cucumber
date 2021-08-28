package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {

    public SmartBearLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "ctl00_MainContent_username")
    public WebElement username;

    @FindBy (id = "ctl00_MainContent_password")
    public WebElement password;

    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy (id = "ctl00_MainContent_status")
    public WebElement status;


}
