package zFreeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Free01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;


        driver.get("https://www.amazon.co.uk/");// ana sayfa giris
       // driver.manage().window().fullscreen();

        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();// sign sayfasina giris
        //driver.manage().window().fullscreen();

        driver.findElement(By.id("ap_email")).sendKeys("mhmetaliszgn@gmail.com"); ;// username yazma
        //username yazma id si           // kendi username iniz
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();// username giris click
        Thread.sleep(2000);
        driver.findElement(By.id("ap_password")).sendKeys("2012ervanaz"); ;//password yazma
        //password yazma id si               kendi sifreniz
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();//pasword giris click butonu yani
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"); ;
        Thread.sleep(2000);
        //aramabutonu id si                         aramak istediginiz obje
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();// aranacak kelimeyi yazdiktan sonra search butonu tiklama

        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")).click();
        driver.findElement(By.xpath("//*[@id=\"ya-myab-address-add-link\"]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-countryCode\"]/span/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("address-ui-widgets-countryCode-dropdown-nativeId_234")).sendKeys("Slovenia");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-countryCode-dropdown-nativeId_203\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Mehmet Ali Sezgin");
        driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("Podmilscakova ulica 38");
        Thread.sleep(2000);
        driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Ljubljana");
        driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("1000");
        Thread.sleep(2000);
        driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("0038630335147");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")).click();
    }
}
