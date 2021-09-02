package pages.smartBearPages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SBPage {

    public SBPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//select[@name=\"ctl00$MainContent$fmwOrder$ddlProduct\"]")
    public WebElement product;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$txtQuantity\"]")
    public WebElement quantity;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$txtName\"]")
    public WebElement name;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox2\"]")
    public WebElement streetName;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox3\"]")
    public WebElement city;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox4\"]")
    public WebElement state;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox5\"]")
    public WebElement zip;

    @FindBy(xpath = "//label[.=\"Visa\"]")
    public WebElement cardTypeVisa;

    @FindBy(xpath = "//label[.=\"MasterCard\"]")
    public WebElement cardTypeMaster;

    @FindBy(xpath = "//label[.=\"American Express\"]")
    public WebElement cardTypeAmerican;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox6\"]")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox1\"]")
    public WebElement expirationDate;

    @FindBy(css ="#ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//a[.=\"View all orders\"]")
    public WebElement viewAllOrders;

    @FindBy(xpath = "(//tbody/tr/td[2])[2]")
    public WebElement nameInTable;

    @FindBy(xpath = "//a[.=\"Order\"]")
    public WebElement orderPage;

}
