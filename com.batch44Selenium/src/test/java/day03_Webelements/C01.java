package day03_Webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
        // 1. Yeni bir class olusturun (TekrarTesti)
        // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://youtube.com");
        if(driver.getTitle().equals("youtube")){
            System.out.println("Youtube title testi PASS");
        }else{
            System.out.println("Youtube title testi PASS"+driver.getTitle());
        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        // içermiyorsa actual URL'yi yazdırın.
        String actualYoutubeUrl=driver.getCurrentUrl();
        String arananKelimeYoutubeUrl="youtube";
        if (actualYoutubeUrl.contains(arananKelimeYoutubeUrl)){
            System.out.println("Youtube URL testi PASS");
        }else {
            System.out.println("Youtube URL testi FAILED \nActual YouTube url : " + actualYoutubeUrl);
        }

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualAmazonTitle= driver.getTitle();
        String amazonTitleArananKelime="Amazon";

        if (actualAmazonTitle.contains(amazonTitleArananKelime)){
            System.out.println("Amazon Title testi PASS");
        }else {
            System.out.println("Amazon Title testi FAILED \nActual amazon Title : " + actualAmazonTitle);
        }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın,
        // degilse doğru URL'yi yazdırın

        String expectedAmazonUrl="https://www.amazon.com/";
        String actualAmazonUrl= driver.getCurrentUrl();

        if (expectedAmazonUrl.equals(actualAmazonUrl)){
            System.out.println("Amazon URL testi PASS");
        } else {
            System.out.println("Amazon Url testi FAILED \nActual Amazon Url : " + actualAmazonUrl);
        }
        //11.Sayfayi kapatin
        driver.close();
    }
}
