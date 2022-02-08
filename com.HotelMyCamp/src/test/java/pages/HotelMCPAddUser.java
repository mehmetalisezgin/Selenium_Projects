package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelMCPAddUser {
    public HotelMCPAddUser() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //******************    Main Page>>>Log In>>>ADD USER Pages Webelements***********************
    // https://www.hotelmycamp.com/ main page log in click button
    @FindBy(xpath = "//a[@href='/Account/Logon']")
    public WebElement mainPageLogin;
    // mainpage>>logIn admin page userid box
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameBox;
    // mainpage>>logIn admin page password box
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;
    // mainpage>>logIn admin page save click button
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement userLogIn;
    // mainpage>>logIn>>ADD USER  click button for adding new user management
    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addUserElement;
    // mainpage>>LogIN>>AddUser>>usernamebox
    @FindBy(xpath = "//input[@placeholder='UserName']")
    public WebElement addusernamebox;
    // mainpage>>LogIN>>AddUser>>usernamebox>>save
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveclickbutton;
    // mainpage>>LogIN>>AddUser>>passwordbox>>save
    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement adUserpasswordbox;

    // mainpage>>LogIN>>AddUser>>emailbox
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement adUseremailbox;


    // mainpage>>LogIN>>AddUser>>FullName
    @FindBy(xpath = "//input[@placeholder='Full Name']")
    public WebElement adUserFullNamebox;


    // mainpage>>LogIN>>AddUser>>PhoneNo
    @FindBy(xpath = "//input[@placeholder='PhoneNo']")
    public WebElement adUserPhoneNobox;

    // mainpage>>LogIN>>AddUser>>SocialSecurityNumber
    @FindBy(xpath = "//input[@placeholder='Social Security Number']")
    public WebElement adUserSocialSecurityNumberbox;

    // mainpage>>LogIN>>AddUser>>DrivingLicense
    @FindBy(xpath = "//input[@placeholder='Driving License']")
    public WebElement adUserDrivingLicensebox;

    // mainpage>>LogIN>>AddUser>>Country
    @FindBy(xpath = "//select[@id='IDCountry']")
    public WebElement adUserCountrybox;

    // mainpage>>LogIN>>AddUser>>State
    @FindBy(xpath = "//select[@id='IDState']")
    public WebElement adUserStatebox;

    // mainpage>>LogIN>>AddUser>>Address
    @FindBy(xpath = "//input[@placeholder='Address']")
    public WebElement adUserAddressbox;

    // mainpage>>LogIN>>AddUser>>DateofBirth
    @FindBy(xpath = "//input[@placeholder='Date of Birth']")
    public WebElement adUserDateofBirthbox;

    // mainpage>>LogIN>>AddUser>>WorkingSector
    @FindBy(xpath = "//input[@placeholder='WorkingSector']")
    public WebElement adUserWorkingSectorbox;

    // mainpage>>LogIN>>AddUser>>Role
    @FindBy(xpath = "//select[@id='IDRole']")
    public WebElement adUserRolebox;

    // mainpage>>LogIN>>AddUser>>Approved
    @FindBy(xpath = "//div[@class='radio-list']")
    public WebElement adUserApprovedbox;

//*******************  MAIN PAGE>>> lOG IN  Webelements correct-incorrect words **************************

    // MainPage>>LogIn Username or Password is incorrect
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement usernamepasswordincorrect;

    // MainPage>>LogIn Username or Password is correct
    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement usernamepasswordcorrect;
    // DrivingLicense incorretc word
    @FindBy(xpath = "//span[@for='DrivingLicense']")
    public WebElement addDrivingLicenseIncorrect;

    //******************  Main Page>>>Log In>>>ADD USER Pages Webelements IN CORRECT WORDS *******************

    @FindBy(xpath = "//span[@for='UserName']")
    public WebElement addUserUserNameIncorrect;


    // Email inccorrect word
    @FindBy(xpath = "//span[@for='Email']")
    public WebElement addUserEmailIncorrect;

    // Password inccorrect word
    @FindBy(xpath = "//span[@for='txtPassword']")
    public WebElement addUserPassWordIncorrect;

    // Spcial securoty incorretc word
    @FindBy(xpath = "//span[@for='SSN']")
    public WebElement addUserSSNIncorrect;

    // Phone box incorrect word
    @FindBy(xpath = "//span[@for='PhoneNo']")
    public WebElement userPhoneIncorrect;

    //admin/userAdmin/Create/FullName/
    @FindBy(xpath = "//span[@for='NameSurname']")
    public WebElement userFullNameincorrect;

    //admin/userAdmin/Create/Country/
    @FindBy(xpath = "//span[@for='IDCountry']")
    public WebElement adduserCountryincorrect;




    //****************************Hotel Management>>>Hotel List>>>ADD HOTEL Webelements******************************
    // mainpage>>LogIN>>HotelManagement
    @FindBy(xpath = "//span[.='Hotel Management']")
    public WebElement hotelmanagementLink;
    // mainpage>>LogIN>>HotelManagement>>hotelList
    @FindBy(xpath = "//a[text()='Hotel List']")
    public WebElement hotellist;
    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotel;
    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>>codebox
    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[1]")
    public WebElement addHotelCodeBox;

    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>name
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement addHotelNameBox;

    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>adress
    @FindBy(xpath = " //input[@placeholder='Address']")
    public WebElement addHotelAddressBox;


    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>Phone
    @FindBy(xpath = "//input[@placeholder='Phone']")
    public WebElement addHotelPhoneBox;

    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>Email
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement addHotelEmailBox;


    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>IDgroup
    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>Save
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addHotelSavebutton;

    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>Save successfuly word
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement addHotelSaveSuccesWord;

    // mainpage>>LogIN>> the list of columns
    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> columnList;

}