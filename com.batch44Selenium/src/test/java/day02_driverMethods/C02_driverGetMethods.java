package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driverGetMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.amazon.co.uk") ;

        System.out.println(driver.getTitle());// sayfanin title ini getirir
        System.out.println(driver.getCurrentUrl());// sayfanin url ini getirir
        System.out.println(driver.getWindowHandle());// herseferinde farkli bir key getirir
        System.out.println(driver.getPageSource());



    }
}
