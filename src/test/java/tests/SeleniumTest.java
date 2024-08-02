package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import java.io.IOException;

public class SeleniumTest extends BaseTest {

    static String username;
    static String password;

    @BeforeMethod
    public void useConfigTest() {
        ConfigLoad config = new ConfigLoad();
        try {
            config.loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
        username = ConfigLoad.getUsername();
        password = ConfigLoad.getPassword();
    }

    @Test(priority = 1)
    public void testAmazonLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
}
