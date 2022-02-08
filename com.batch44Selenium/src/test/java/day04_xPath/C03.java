package day04_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.MBeanAttributeInfo;
import java.time.Duration;

public class C03 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[text()='Delete']"));
        if(deleteButonu.isDisplayed()){
            System.out.println("delete butonu gorunuyor test PASS");
        }else{
            System.out.println("delete butonu gorunuyor test FAILED");
        }
        //4- Delete tusuna basin
        deleteButonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addYazisiElementi = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']")) ;
        WebElement addYazisiElementi2 = driver.findElement((By.tagName("//h3[text()='Add/Remove Elements']"))) ;

        if(addYazisiElementi.isDisplayed()){
            System.out.println("Add yazisi gorunuyor test PASS");
        }else{
            System.out.println("Add yazisi gorunuyor test FAILED");
        }
        driver.close();

    }
}
