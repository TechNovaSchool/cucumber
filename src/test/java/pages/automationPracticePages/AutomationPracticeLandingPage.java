package pages.automationPracticePages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeLandingPage {

    public AutomationPracticeLandingPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//span[.=\"Add to cart\"])[1]")
    public WebElement product1;

    @FindBy(xpath = "//a[@title=\"View my shopping cart\"]")
    public WebElement cart;

    @FindBy (xpath = "(//a[@class=\"product_img_link\"]/img)[1]")
    public WebElement picture1;

}
