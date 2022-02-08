package tests.hotel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMCPAddUser;
import pages.HotelMCPAddUserMethods;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;

public class AddUser {

    HotelMCPAddUser hotelMCPAddUser= new HotelMCPAddUser();
    HotelMCPAddUserMethods hotelMCPAddUserMethods = new HotelMCPAddUserMethods();

     SoftAssert softAssert = new SoftAssert();
     Actions actions =new Actions(Driver.getDriver()) ;
    @BeforeClass
    public void beforeMethodLoginHotel() {
        hotelMCPAddUserMethods.hotelMyCampLoginAddUser();
    }


    @Test (priority = 1)
    public void userNameNegativeTest()  {

        hotelMCPAddUser.addusernamebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongUserName"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserUserNameIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(3);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addusernamebox.clear();

        hotelMCPAddUser.addusernamebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongUserName1"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserUserNameIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(3);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addusernamebox.clear();

        hotelMCPAddUser.addusernamebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongUserName2"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserUserNameIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(3);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.addusernamebox.clear();



    }

    @Test (priority = 2)
    public void userNamePositiveTest()  {

        hotelMCPAddUser.addusernamebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueUserName"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertFalse(hotelMCPAddUser.addUserUserNameIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(3);
        hotelMCPAddUserMethods.tumSayfaScreenshot();


    }

    @Test (priority = 3)
    public void negativepasswordtestAddUser() throws IOException {



        hotelMCPAddUser.adUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPassword1"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserpasswordbox.clear();


        hotelMCPAddUser.adUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPassword2"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserpasswordbox.clear();

        hotelMCPAddUser.adUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPassword3"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserpasswordbox.clear();

        hotelMCPAddUser.adUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPassword4"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserpasswordbox.clear();

        hotelMCPAddUser.adUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPassword5"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserpasswordbox.clear();



    }
@Test (priority = 4)
    public void positivePasswordtestAddUser()  {

    hotelMCPAddUser.adUserpasswordbox.sendKeys(ConfigReader.getProperty("HMCAddUserTruePassword"));
    actions.sendKeys(Keys.END).perform();
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUser.saveclickbutton.click();
    softAssert.assertFalse(hotelMCPAddUser.addUserPassWordIncorrect.isDisplayed());
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUserMethods.tumSayfaScreenshot();


}
    @Test (priority = 5)
    public void negativeEmailtestAddUser(){



        hotelMCPAddUser.adUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail1"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(2);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();

        hotelMCPAddUser.adUseremailbox.clear();

        hotelMCPAddUser.adUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail2"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();

        hotelMCPAddUser.adUseremailbox.clear();

        hotelMCPAddUser.adUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail3"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(2);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();

        hotelMCPAddUser.adUseremailbox.clear();

        hotelMCPAddUser.adUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail4"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUseremailbox.clear();
        hotelMCPAddUser.adUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail5"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUseremailbox.clear();
        hotelMCPAddUser.adUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserWrongEmail6"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUseremailbox.clear();

    }
    @Test (priority = 6)
    public void possitiveEmailtestAddUser(){

        hotelMCPAddUser.adUseremailbox.sendKeys(ConfigReader.getProperty("HCMAddUserTrueEmail"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();

        hotelMCPAddUserMethods.wait(1);
        softAssert.assertFalse(hotelMCPAddUser.addUserEmailIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();




    }

    @Test (priority = 7)
    public void negativeFulnameTest(){

        hotelMCPAddUser.adUserFullNamebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongFullname"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.userFullNameincorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserFullNamebox.clear();

        hotelMCPAddUser.adUserFullNamebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongFullname1"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.userFullNameincorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserFullNamebox.clear();
    }
    @Test (priority = 8)
    public void positiveFulnameTest()  {

        hotelMCPAddUser.adUserFullNamebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueFullname"));
        actions.sendKeys(Keys.END).perform();
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertFalse(hotelMCPAddUser.userFullNameincorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
    }
    @Test (priority = 9)
    public void negativePhoneBoxTesti(){

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.adUserPhoneNobox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPhone"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserPhoneNobox.clear();



        hotelMCPAddUser.adUserPhoneNobox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPhone1"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserPhoneNobox.clear();


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.adUserPhoneNobox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPhone2"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserPhoneNobox.clear();



        hotelMCPAddUser.adUserPhoneNobox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongPhone3"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserPhoneNobox.clear();


        softAssert.assertAll();

    }

    @Test (priority = 10)
    public void positivePhoneBoxTesti(){


        hotelMCPAddUser.adUserPhoneNobox.sendKeys(ConfigReader.getProperty("HMCAddUserTruePhone"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertFalse(hotelMCPAddUser.userPhoneIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();

    }





    @Test (priority = 11)
    public  void negativeSSNTest() {


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.adUserSocialSecurityNumberbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongSSN"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserSSNIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserSocialSecurityNumberbox.clear();


        hotelMCPAddUser.adUserSocialSecurityNumberbox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongSSN1"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        softAssert.assertTrue(hotelMCPAddUser.addUserSSNIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserSocialSecurityNumberbox.clear();

    }

    @Test (priority = 12)
    public void possitiveSSNTest() {

        hotelMCPAddUser.adUserSocialSecurityNumberbox.sendKeys(ConfigReader.getProperty("HMCAddUSerTrueSSN"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.saveclickbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        softAssert.assertFalse(hotelMCPAddUser.addUserSSNIncorrect.isDisplayed());
        hotelMCPAddUserMethods.tumSayfaScreenshot();

    }


    @Test (priority = 13)
    public void drivingLicenseNegativeTest(){


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.adUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongDrivingLicense"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.getText().contains("This field is required."),
                "'This field is required.' is not appearing");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserDrivingLicensebox.clear();


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.adUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongDrivingLicense1"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.getText().contains("This field is required."),
                "'This field is required.' is not appearing");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserDrivingLicensebox.clear();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.adUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongDrivingLicense2"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.getText().contains("This field is required."),
                "'This field is required.' is not appearing");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserDrivingLicensebox.clear();


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.adUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserWrongDrivingLicense3"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.getText().contains("This field is required."),
                "'This field is required.' is not appearing");
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();
        hotelMCPAddUser.adUserDrivingLicensebox.clear();
        softAssert.assertAll();

    }

@Test (priority = 14)
    public void drivingLicensePositiveTest(){


    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUser.adUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueDrivingLicense4"));
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUser.saveclickbutton.click();
    softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.isDisplayed()," 'This field is required.' " +
            "is not appearing...");
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUserMethods.tumSayfaScreenshot();
    hotelMCPAddUser.adUserDrivingLicensebox.clear();


    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUser.adUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueDrivingLicense5"));
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUser.saveclickbutton.click();
    softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.isDisplayed()," 'This field is required.' " +
            "is not appearing...");
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUserMethods.tumSayfaScreenshot();
    hotelMCPAddUser.adUserDrivingLicensebox.clear();


    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUser.adUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueDrivingLicense6"));
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUser.saveclickbutton.click();
    softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.isDisplayed()," 'This field is required.' " +
            "is not appearing...");
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUserMethods.tumSayfaScreenshot();
    hotelMCPAddUser.adUserDrivingLicensebox.clear();


    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUser.adUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueDrivingLicense7"));
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUser.saveclickbutton.click();
    softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.isDisplayed()," 'This field is required.' " +
            "is not appearing...");
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUserMethods.tumSayfaScreenshot();
    hotelMCPAddUser.adUserDrivingLicensebox.clear();


    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUser.adUserDrivingLicensebox.sendKeys(ConfigReader.getProperty("HMCAddUserTrueDrivingLicense8"));
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUser.saveclickbutton.click();
    softAssert.assertTrue(hotelMCPAddUser.addDrivingLicenseIncorrect.isDisplayed()," 'This field is required.' " +
            "is not appearing...");
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUserMethods.tumSayfaScreenshot();
    Driver.closeDriver();
}
@Test (priority = 15)
    public void countryNegativeTest(){

    actions.sendKeys(Keys.PAGE_DOWN).perform();
    Select select=new Select(hotelMCPAddUser.adUserCountrybox);
    select.selectByIndex(0);
    hotelMCPAddUserMethods.wait(1);
   // hotelMCPAddUser.adUserCountrybox.click();
    //hotelMCPAddUser.adUserCountrybox.click();
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUser.saveclickbutton.click();
    softAssert.assertTrue(hotelMCPAddUser.adduserCountryincorrect.isDisplayed());
    hotelMCPAddUserMethods.wait(1);
    hotelMCPAddUserMethods.tumSayfaScreenshot();

}
    @Test (priority = 15)
    public void countryPozitiveTest(){

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select select=new Select(hotelMCPAddUser.adUserCountrybox);
        select.selectByIndex(5);
        hotelMCPAddUserMethods.wait(1);
        // hotelMCPAddUser.adUserCountrybox.click();
        //hotelMCPAddUser.adUserCountrybox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUser.saveclickbutton.click();
        softAssert.assertFalse(hotelMCPAddUser.adduserCountryincorrect.isDisplayed());
        hotelMCPAddUserMethods.wait(1);
        hotelMCPAddUserMethods.tumSayfaScreenshot();

    }

}
