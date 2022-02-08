package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {

    //a. Verilen web sayfasına gidin.



    //d. Checkbox2 seçili değilse onay kutusunu tıklayın
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver() ;

        driver.manage().window().maximize();
    }

    @Test
    public void test01() throws InterruptedException {
        //https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        //c. Checkbox1 seçili değilse onay kutusunu tıklayın
        Thread.sleep(5000);
        if(!checkbox1.isSelected()){
            checkbox1.click();
        }
        if(!checkbox2.isSelected()){
            checkbox2.click();
        }
        Thread.sleep(5000);
    }

    @After
    public void teardown() {
        driver.close();

    }


}
