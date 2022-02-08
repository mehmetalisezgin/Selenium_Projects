package day04_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    public static void main(String[] args) {

        //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //    a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        //    b. Locate email textbox

        WebElement emailSearchBox = driver.findElement(By.cssSelector("input[type='email']"));


        //    c. Locate password textbox ve
       WebElement passwordTextBox = driver.findElement(By.cssSelector("input[id='session_password']"));
        //    d. Locate signin button
        WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        //    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın

        //        i. Username : testtechproed@gmail.com
        emailSearchBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();
        driver.close();
    }
}
