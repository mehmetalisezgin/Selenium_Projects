package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;

public class C03_BestByAssortions {




    //		○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
    WebDriver driver;

    @Before
    public void setUp() {
        //1. Bir class oluşturun : RadioButtonTest
        //2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }


    @Test
    public void test01() {
        // 2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
        driver.get("https://www.bestbuy.com/");
        //	○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        String webUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.bestbuy.com/";
        Assert.assertEquals("lutfen test degerlerini gozden geciriniz", expectedUrl, webUrl);
        //○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        String actualTitle = driver.getTitle();
        String istenmeyenKelime = "Rest";
        Assert.assertFalse(actualTitle.contains((istenmeyenKelime)));
        //		○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        WebElement logoEelemnt = driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]")) ;
        Assert.assertTrue("Logo is Not appearing",logoEelemnt.isDisplayed());// failed oldugunda mesaj cikiyor
//      ○ logoTest => BestBuy logosunun görüntülendigini test edin
        WebElement logoElementi=driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));
        Assert.assertTrue("Logo gorunmuyor",logoElementi.isDisplayed());
        //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        WebElement francais= driver.findElement(By.xpath("//button[text()='Français']"));
        Assert.assertTrue(francais.isDisplayed());
    }






    @After
    public void tearware() {

    }

}
