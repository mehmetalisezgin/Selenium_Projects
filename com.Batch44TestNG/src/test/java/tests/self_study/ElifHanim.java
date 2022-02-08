package tests.self_study;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElifHanim {
    /*
...Exercise1...
BeforeClass ile driver ı olusturun ve class icinde static yapin
Maximize edin, 15 sn bekletin
http://www.google.com adresine gidin
arama kutusuna "Green Mile" yazip, cikan sonuc sayisini yazdirin
arama kutusuna  "Premonition" yazip, cikan sonuc sayisini yazdirin
arama kutusuna  "The Curious Case of Benjamin Button" yazip, cikan sonuc sayisini yazdirin
AfterClass ile kapatın

 */

    WebDriver driver;

    @BeforeClass()
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //1. “https://www.hepsiburada.com/” Adresine gidin
        driver.get("http://www.google.com");


    }
@Test
    public void test01(){

}


}
