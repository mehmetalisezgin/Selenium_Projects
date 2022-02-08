package day06_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class C03_FirstTestMethod {
    WebDriver driver ;
    @Test // @Test notasyonu run yapmayi saglar
    public void test01() {
        // amazon.com a gidelim ve title in amazon icerdigini test edelim
        driver.get("https://www.amazon.com");
        String actualTitle = driver.getTitle();
        String findingWord = "amazon";
        if(actualTitle.contains(findingWord)){
            System.out.println("Amazon testi PASSED");
        }else{
            System.out.println("Amazon test FAILED");
        }


    }

    @Test
    public void test02() {
        // google a gidelim ve basliginin google icerdigini test edelim
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
        String actualTitle = driver.getTitle();
        String findingWord = "google";
        if(actualTitle.contains(findingWord)){
            System.out.println("Google testi PASSED");
        }else{
            System.out.println("Google test FAILED");
        }
    }
    @Before // her test methodundan once calisir
    public void ayarlarDuzenle() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void ortaligiTopla(){
        driver.close();
    }
}
