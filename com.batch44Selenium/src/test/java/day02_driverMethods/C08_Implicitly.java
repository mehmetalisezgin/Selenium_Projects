package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_Implicitly {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver/chromedriver.exe ") ;
        WebDriver driver = new ChromeDriver() ;
       // bundan sonra objemiiz olusturur olusturmaz asagidaki islemi yapacagiz
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       //Avantaji: kod calisirsa sayfa hemen acilir kapanir ama burdaki set edilen saniye sayet kod calismaz ise hata var ise 15 sn bekler
        driver.get("https://www.techproeducation.com");
        Thread.sleep(5000);// kodlarin calismasini 5 sn durdurur
        // implicitly wait testimiz boyunca  sayfa acilmasi ve element bulunmasi konusunda driver'in
        // bekleyecegi maximum sureyi belirler
        // Bu sure icerisinde gorevini bitirir bitirmez, bir ssonraki adıma gecer
        // Bu sure icerisinde gorevini bitirmezse o zaman hata verir
        // belirlenen maximum sure Thread.sleep'teki gibi mutlaka bekleme suresi degildir


    }
}
