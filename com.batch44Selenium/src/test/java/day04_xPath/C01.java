package day04_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.MBeanAttributeInfo;
import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //2.	Main method olsuturun ve asagidaki gorevi tamamlayin.
        //a.	Amazon web sayfasina gidin. https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");

        //b.	Search “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
      //  aramaKutusu.submit();


        //c.	Amazonda goruntulenen ilgili sonuc sayisini yazdirin

        // WebElement sonucYazisiElementi = driver.findElement(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12' ]"));
        System.out.println(sonucYazisiElementi.getText());
        driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
                               // xpath yazimi //tagname[@attribute='degeri']

        //e.	Sonra karsinizia cikan ilk sonucun resmine tiklayin…
        WebElement ilkUrunResmi = driver.findElement(By.className("s-image"));
        ilkUrunResmi.click();






    }


}
