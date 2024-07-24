package tests;

import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoad {
    private static String url;
    private static String username;
    private static String password;
    private static String test_url;
    private static String custID;

    @BeforeClass
    public void loadProperties() throws IOException {
        Properties p = new Properties();
        String workingDir = System.getProperty("user.dir");
        String configPath = workingDir + "/src/main/java/resources/config.properties";

        FileInputStream input = new FileInputStream(configPath);
        p.load(input);
        url = p.getProperty("url");
        test_url = p.getProperty("test_url");
        username = p.getProperty("username");
        password = p.getProperty("password");
        custID = p.getProperty("test_customerID");
    }

    public static String getUrl() {
        return url;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static String getTest_url(){
        return test_url;
    }
    public static String getCustID(){
        return custID;
    }
}



//    @BeforeClass
//    public void useConfig() {
//        ConfigLoad config = new ConfigLoad();
//        try {
//            config.loadProperties();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        username = ConfigLoad.getUsername();
//        System.out.println(username);
//        password = ConfigLoad.getPassword();
//        System.out.println(password);
//    }