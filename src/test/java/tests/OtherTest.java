package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertPage;
import java.io.IOException;

public class OtherTest extends BaseTest {
    String custID;

  //  @BeforeMethod
    public void loadConfigTest(){
       ConfigLoad cf =new ConfigLoad();
        try {
            cf.loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
        custID = ConfigLoad.getCustID();
    }
  //  @Test (priority = 1)
    public void alertTest(){
      AlertPage alert = new AlertPage(driver);
      alert.enterCustID(custID);
      alert.submit();
    }
}
