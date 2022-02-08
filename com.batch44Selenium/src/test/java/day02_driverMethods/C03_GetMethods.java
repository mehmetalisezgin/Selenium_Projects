package day02_driverMethods;

import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
/*
1. Yeni bir package olusturalim : day01
2. Yeni bir class olusturalim : C01_GetMethods

 */
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver/chromedriver.exe") ;
    WebDriver driver = new ChromeDriver() ;
//3. Amazon sayfasina gidelim. https://www.amazon.com/
    driver.get("https://www.amazon.com") ;
//4. Sayfa basligini(title) yazdirin
    System.out.println("Web sayfasinin ismi "+ driver.getTitle());
//5. Sayfa basliginin “Amazon” icerdigini test edin
    String actualTitle = driver.getTitle();
    String arananKelime = "Amazon" ;
    if (actualTitle.contains(arananKelime)){
        System.out.println("Title testi Pass");
    }else{
        System.out.println("Title test Failed ");
        System.out.println(arananKelime);
    }
//6. Sayfa adresini(url) yazdirin
    System.out.println(driver.getCurrentUrl());
//7. Sayfa url’inin “amazon” icerdigini test edin.
    String actualUrl = driver.getCurrentUrl();
    String urlArananKelime = "amazon";
    if (actualUrl.contains(urlArananKelime)){
        System.out.println("Url test PASS");

    }else{
        System.out.println("Url test FAILED");
    }
//8. Sayfa handle degerini yazdirin
    System.out.println(driver.getWindowHandle());
//9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
    String actualPageSource = driver.getPageSource();
    String findingWord = "euro" ;
    if(actualPageSource.contains(findingWord)){
        System.out.println("Page Source TesT PASS");
    }else{
        System.out.println("Page Source Test FAILED");
    }
//10. Sayfayi kapatin.


}
}
