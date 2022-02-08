package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    // Normal selenium un kendi IDE side var fakat biz daha kullanisli oldugu icin intellij kullaniyoruz
    // intellij de yeni bir proje actigimizda oncelikle selenium kutuphanelerini projeyte eklememiz gerekir
    // biz en ilkel haliyle projemizze kutuphaneleri jar dosyalari olarak yukledik.
    // bu ekledigimiz doya;larlar artik drievr in ayarlarini yapabiliriz
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe") ;
       // setPropertymethodu 2 parametre ister
        // ilki kullanacagimiz browser a ait driver dir
        // ikinsisi ise selenium sitesinden indirip projemize ekledigimiz chromedriver in path i
        // window kullanicilari sona.exe eklerken appa kullanicilari .ece eklememeli
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.amazon.co.uk") ;

        Thread.sleep(5000);
        driver.close();



    }
}
