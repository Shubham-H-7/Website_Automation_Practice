package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement usernameField;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButtom;

    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement signInSubmit;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
        submitButtom.click();
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
        signInSubmit.click();
    }

}
