package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver() ;
        // Biz driver objesi olsuturdugumuz da bos bir chrome browser  acilir
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);// 3000 3 sn demek 3 sn ye bekledikten sonra kapatiyor
        driver.close();

    }
}
