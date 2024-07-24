package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    String url;
    String test_url;

    @BeforeClass
    public void useConfigBase() {
        // Ensure that the properties are loaded before accessing them
        ConfigLoad config = new ConfigLoad();
        try {
            config.loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Access the configuration properties
       // url = ConfigLoad.getUrl();
        test_url = ConfigLoad.getTest_url();

    }
    @BeforeMethod
    public void setUp() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(test_url);

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
