package day03_Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementGetMethodlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://a.testaddressbook.com");
        WebElement signInLink = driver.findElement(By.id("sign-in"));

        System.out.println("size :"+ signInLink.getSize());
        System.out.println("aria role :"+signInLink.getAriaRole());
        System.out.println("accessib name :"+signInLink.getAccessibleName());
        System.out.println("id Aattribute value :" +signInLink.getAttribute("id"));
        System.out.println("location :"+signInLink.getLocation());
        System.out.println("genislik :"+signInLink.getRect().width);
        System.out.println("colour : "+signInLink.getCssValue("color"));
    }
}
