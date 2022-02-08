package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class C02_Facebook {


    //Secili degilse cinsiyet butonundan size uygun olani secin
WebDriver driver ;

    @Before
    public void setUp() {
        //1. Bir class oluşturun : RadioButtonTest
        //2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver() ;

        driver.manage().window().maximize();
    }

    @Test
    public void facebookRadioButton() {
        //https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");
        //Cookies’i kabul edin
        driver.findElement(By.xpath("//button[text()='Allow All Cookies']")).click();
        //“Create an Account” button’una basin
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        //“radio buttons” elementlerini locate edin


        //Secili degilse cinsiyet butonundan size uygun olani secin
        driver.findElement(By.xpath("//input[@value='2']")).click();
    }

    @After
    public void tearw(){

    }


}
