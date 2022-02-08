package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        //      Task 3






        //1.	Bir Class olusturun AmazonSearchTest
        //2.	Main method olsuturun ve asagidaki gorevi tamamlayin.
        //a.	Amazon web sayfasina gidin. https://www.amazon.com
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.amazon.com");
        //b.	Search “city bike”
        WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchTextBox.sendKeys("city bike", Keys.ENTER);
        //c.	Amazonda goruntulenen ilgili sonuc sayisini yazdirin
        //List<WebElement> sayfaSayisi = driver.findElements(By.className("a-section a-spacing-small a-spacing-top-small"));
        //System.out.println(sayfaSayisi.size());

        //d.	Shopping e tiklayin
        //e.	Sonra karsinizia cikan ilk sonucun resmine tiklayin…
      //  WebElement ilkRESIM = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
       // ilkRESIM.click();

        Thread.sleep(3000);

        driver.close();
    }

}
