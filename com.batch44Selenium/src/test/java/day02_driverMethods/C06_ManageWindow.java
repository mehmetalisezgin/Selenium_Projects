package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver/chromedriver.exe ") ;
        WebDriver driver = new ChromeDriver() ;
        //1. Yeni bir Class olusturalim.C06_ManageWindow
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());// x ve y sini veriyor
        System.out.println(driver.manage().window().getSize());// sayfanin size ini veriyor
        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Maximize durumunda position : "+driver.manage().window().getPosition());
        System.out.println("Maximize durumunda : "+driver.manage().window().getSize());
        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen durumunda position : "+driver.manage().window().getPosition());
        System.out.println("Fullscreen durumunda : "+driver.manage().window().getSize());
        //8. Sayfayi kapatin

driver.close();
    }
}
