package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindosSet {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver/chromedriver.exe ") ;
        WebDriver driver = new ChromeDriver() ;
        //1. Yeni bir Class olusturalim.C07_ManageWindowSet

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition((new Point(0,-2)));
        driver.manage().window().setSize(new Dimension(300,500));
        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        int xPosition = driver.manage().window().getPosition().getX();
        int yPosition = driver.manage().window().getPosition().getY();
        int genislik = driver.manage().window().getSize().getWidth();
        int yukseklik = driver.manage().window().getSize().getHeight();

        if(xPosition==0 && yPosition==-2 && genislik==300 && yukseklik==500){
            System.out.println("Test Pass");
        }else{
            System.out.println("Olceklendirme test failed");
        }


        //8. Sayfayi kapatin
        driver.close();
    }
}
