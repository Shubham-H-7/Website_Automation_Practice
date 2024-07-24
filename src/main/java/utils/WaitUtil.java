package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
    private WebDriver driver;
    private WebDriver wait;

    public WaitUtil(WebDriver driver, int timeout){
        this.driver = driver;

    }
}
