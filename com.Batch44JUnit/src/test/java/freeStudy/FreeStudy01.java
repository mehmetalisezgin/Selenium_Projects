package freeStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FreeStudy01 {
    static WebDriver driver;


    @Test
    public void testUserPassword() {

        driver.findElement(By.cssSelector("button[id='signin_button']")).click();// sign in butonuna tikladi
        WebElement username = driver.findElement(By.id("user_login"));// user text box in icine girdi
        username.sendKeys("username");// user text box a user id yi yazdi
        WebElement password = driver.findElement(By.id("user_password"));// pasword text box in icine girdi
        password.sendKeys("password");// paswordu yazdi
        driver.findElement(By.xpath("//input[@id='user_remember_me']")).click();// beni hatrlaya tikladi
        driver.findElement(By.xpath("//input[@type='submit']")).click();// sign in butonuna tikladi
        driver.findElement(By.xpath("//button[@id='details-button']")).click();// bazi web sayfalarinda guvenlik hatasi veriyor advanced e tikladi
        driver.findElement(By.id("proceed-link")).click();// guvenli giris yapti

    }

    @Test
    public void onlineBanking() {
        driver.findElement(By.id("onlineBankingMenu")).click();
        WebElement actualWord1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/h1"));
        String actualword = actualWord1.getText();
        String expectedWord = "Online Banking";
        if (actualword.contains(expectedWord)) {
            System.out.println("Online Banking sentence is appearing Test PASSED");
        } else {
            System.out.println("Online Banking sentence NOT appearing Test FAILED");
        }


    }

    @Test
    public void testC() {




    }

    @BeforeClass
    public static void settingsSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Bu kodu ogrenelim
        driver.get("http://zero.webappsecurity.com");
        WebElement urlmicrofocus = driver.findElement(By.xpath("//a[@href='https://www.microfocus.com/about/legal/#privacy']"));
        urlmicrofocus.click();


    }

    @AfterClass
    public static void endingTest() {

    }


}
