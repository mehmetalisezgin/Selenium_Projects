package tests.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01 {

    /*
    * accept()==> Bir uyarida (alert) OK i tiklamakla ayni.
    driver.switchTo().alert().accept();
    * dismiss()==> bir uyarida (alert) Cancel i iklamakla ayni
    driver.switchTo().alert().dismiss();
    * getText()==> Uyaridaki (slert) mesaji almak icin32

    */
    WebDriver driver;

    @BeforeClass()
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }


    //● Bir metod olusturun: acceptAlert
    @Test
    public void acceptAlert() throws InterruptedException {
        // 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

// “You successfully clicked an alert” oldugunu test edin.
        String actualWords = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedResult = "You successfully clicked an alert";
        Assert.assertEquals(actualWords, expectedResult);
    }

    @Test
    public void dismissAlert() throws InterruptedException {
        //● Bir metod olusturun:
        //        ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        //        “successfuly” icermedigini test edin.

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        String actualWords = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedResult = "successfully";
        Assert.assertNotEquals(actualWords, expectedResult);

    }

    @Test
    public void sendKeysAlert() throws InterruptedException {

        //● Bir metod olusturun: sendKeysAlert
        //        ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
        //        tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().sendKeys("Mehmet Ali Sezgin");
        driver.switchTo().alert().accept();
        String actualWords = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedResult = "Mehmet Ali Sezgin";
        Assert.assertTrue(actualWords.contains(expectedResult));

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


}
