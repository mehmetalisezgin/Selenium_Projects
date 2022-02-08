package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw01 {
    /*
Question1
1.https://www.youtube.com sayfasına gidin
2.Title i consolda yazdirin
3.Title “YouTube” a eşitse “correct title” yazdirin değilse “incorrect title yzdirin”
4.Sayfayi kapatin
5.Tum sayfalari kapatin
6.Consola “Test completed” yazdirin
 */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe")   ;
        WebDriver driver = new ChromeDriver() ;

        driver.get("https://www.youtube.com") ;
        driver.manage().window().fullscreen();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Page title is : "+driver.getTitle());

        if(driver.getTitle().equals("YouTube")){
            System.out.println("Correct title...");
        }else{
            System.out.println("incorrect title ");
        }
        System.out.println("Test completed");
        driver.close();
    }
}
