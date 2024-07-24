package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@name='cusid']")
    public WebElement customerID;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submit;

    public AlertPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void enterCustID(String test_customerID){
        customerID.sendKeys(test_customerID);
    }

    public void submit(){
        submit.click();
        Alert al =driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();
    }
}
