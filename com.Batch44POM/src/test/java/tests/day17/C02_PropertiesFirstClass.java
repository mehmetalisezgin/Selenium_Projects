package tests.day17;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Properties;

public class C02_PropertiesFirstClass {
    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
    ConfigReader configReader = new ConfigReader();
    @Test
    public void pozitiveLoginTest() {

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMYCUrl"));
        hotelMyCampPage.mainPageLogin.click();
        //  test data username: manager
        hotelMyCampPage.userNameBox.sendKeys(ConfigReader.getProperty("HMYCValidUserName"));
        //  test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMYCValidPassword"));
        hotelMyCampPage.wait(2);
        hotelMyCampPage.userLogIn.click();

    }


}
