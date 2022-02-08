package tests.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_DependsOnMethods {
//● Bir class oluşturun: DependsOnTest
//● https://www.amazon.com/ adresine gidin.
//    1. Test : Amazon ana sayfaya gittiginizi test edin
//    2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icinarama yapin ve aramanizin gerceklestigini Test edin
//    3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin    $16.83 oldugunu test edin

    WebDriver driver;

    @BeforeClass
    public void seytUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test           //(priority = 1)
    public void logoTest() {
        driver.get("https://www.amazon.com/");
        WebElement logoelementi = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        Assert.assertTrue(logoelementi.isDisplayed());
    }

    @Test  (dependsOnMethods ="logoTest")       //(priority = 2)
    public void searchingTest() {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella", Keys.ENTER);
        String actualTitle = driver.getTitle();
        String expectedWord = "Nutella";
        Assert.assertTrue(actualTitle.contains(expectedWord));
    }
    @Test (dependsOnMethods = "searchingTest")
    public void priceTest(){
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        WebElement nutellaPrice = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[2]"));
        String nutellaPriceString = nutellaPrice.getText();
        String searchingPrice = "$14.99";

        Assert.assertTrue(nutellaPriceString.contains(searchingPrice));
    }

}
