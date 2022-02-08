package day06_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {
        //1-C01_TekrarTesti isimli bir class olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //3- cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
        //4-Sayfa basliginin “Google” ifadesi icerdigini test edin
        String actualPageTitle = driver.getTitle();
        String testWord = "Google";
        if(actualPageTitle.contains(testWord)){
            System.out.println("Title test PASSED");
        }else{
            System.out.println("Title test FAILED");
        }
        //5- Arama cubuguna “Nutella” yazip aratin

        WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));
        searchBox.sendKeys("Nutella", Keys.ENTER);
        //6-Bulunan sonuc sayisini yazdirin

        WebElement resultElement = driver.findElement(By.id("result-stats"));
        System.out.println(resultElement.getText());
        String resultNumberString = resultElement.getText();
        String resultWords[] = resultNumberString.split(" ");
        String resultNutellaNumbersString = resultWords[1] ;
        System.out.println(resultNutellaNumbersString);

        int resultLast = Integer.parseInt(resultNutellaNumbersString) ;
        if (resultLast>10000000){
            System.out.println("Nutella arama testi PASSED");
        } else {
            System.out.println("Nutella arama testi FAILED");
        }
        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        //8-Sayfayi kapatin
        //Collapse
    }
}
