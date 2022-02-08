package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {

    public static void main(String[] args) throws InterruptedException {
        // 1-C01_TekrarTesti isimli bir class olusturu

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);// 3000 3 sn demek 3 sn ye bekledikten sonra kapatiyor
        // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        // 4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String spendLess = driver.getTitle();
        String actualWord = "Spend less";
        if (spendLess.contains(actualWord)) {
            System.out.println("Title testi PASSED");

        } else {
            System.out.println("Title testi FAILED");
        }
        // 6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
        // 7- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday Gift Cards']")).click();
        // 8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();
        // 9- Gift card details’den 25 $’i  secin
        driver.findElement(By.xpath("//button[@value='25.00']")).click();
        // 10-Urun ucretinin 25$ oldugunu test edin
        driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();
        WebElement fiyatElementi=driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));
        String expectedFiyat="$25.00";
        String actualFiyat=fiyatElementi.getText();
        if (expectedFiyat.equals(actualFiyat)){
            System.out.println("Fiyat testi PASSED");
        }else {
            System.out.println("Fiyat testi FAILED");
        }
        //10-Sayfayi kapatin
        driver.close();

    }


}
