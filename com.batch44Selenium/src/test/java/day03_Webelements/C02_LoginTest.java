package day03_Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_LoginTest {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun: LoginTest
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //    a. http://a.testaddressbook.com adresine gidiniz.
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        //    b. Sign in butonuna basin
        signInLink.click();
        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailtextBox = driver.findElement(By.id("session_email"));
        WebElement passwordtextBox = driver.findElement(By.id("session_password"));
        WebElement signButton = driver.findElement(By.name("commit"));
       /* d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
                 i. Username : testtechproed@gmail.com
                ii. Password : Test1234!  */
        emailtextBox.sendKeys("testtechproed@gmail.com");
        passwordtextBox.sendKeys("Test1234!");
        Thread.sleep(3000);
        signButton.click();
        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement girisYazisiElementi = driver.findElement(By.tagName("h1"));
        System.out.println(girisYazisiElementi.getText());
        String actualGirisYzisi = girisYazisiElementi.getText();
        String expectedYazisi = "Welcome to Address Book";




        if (actualGirisYzisi.equals(expectedYazisi)) {
            System.out.println("Sayfaya giris testi PASS");
        } else {
            System.out.println("sayfaya giris testi FAILED");
        }

        //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adresWebElement = driver.findElement(By.linkText("Addresses"));
        WebElement signOutElement = driver.findElement(By.linkText("Sign out"));
        System.out.println(adresWebElement.isDisplayed());
        if (signOutElement.isDisplayed()) {
            System.out.println("SignOut elementi goruntuleme testi PASS");
        } else {
            System.out.println("SignOut elementi goruntuleme testi FAILED");
        }
        //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfada " + linklerListesi.size() + " adet link bulunmaktadir");// linkler a ile baslar

        driver.close();
    }
}
