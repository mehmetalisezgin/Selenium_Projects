package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_YoutubeTesti {

    //1) Bir class oluşturun: YoutubeAssertions
    //2)
    //3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin


    //     ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //    ○ wrongTitleTest  => Sayfa basliginin “youtube” olmadigini dogrulayin
   static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
      //  https://www.youtube.com adresine gidin
        driver.get("https://www.youtube.com");
        driver.findElement(By.xpath("//yt-formatted-string[text()='I agree']")).click();
    }
    @Test
    public void titleTest(){
        //titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
      Assert.assertEquals(driver.getTitle(),"YouTube");


    }

    @Test
    public void imageTest(){
//imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin

    }
    @Test
    public void searcBoxTest(){

    }
    @Test
    public void wrongTitleTest(){

    }
    @AfterClass
    public static void teardown(){

    }

}
