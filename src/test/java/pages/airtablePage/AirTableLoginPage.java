package pages.airtablePage;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirTableLoginPage {

    public AirTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div/label/input[@name=\"email\"]")
    public WebElement emailInpt;

    @FindBy(xpath = "//div/label/input[@name=\"password\"]")
    public WebElement passwordInpt;

    @FindBy(xpath = "//div/label/button[@type=\"submit\"]")
    public WebElement signIn;


    // the folloeing locators should be in different class

    @FindBy(xpath = "//div/h2")
    public WebElement MyWorkSpace;

    @FindBy(xpath = "(//div/span[contains(text(),'Te')])[2]")
    public WebElement DragonWarriors;

    @FindBy(xpath = "//*[@id=\"view\"]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[5]/div[2]")
    public WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"view\"]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[5]/div[1]")
    public WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"view\"]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[5]/div[2]")
    public WebElement phoneField;

    @FindBy(xpath = "//*[@id=\"view\"]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[5]/div[3]")
    public WebElement addressField;







}
