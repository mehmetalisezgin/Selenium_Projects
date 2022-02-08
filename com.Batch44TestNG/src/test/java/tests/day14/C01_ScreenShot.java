package tests.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;

public class C01_ScreenShot extends TestBase {


    @Test
    public void screentest(){
        driver.get("https://google.com");
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
        TakesScreenshot tss = (TakesScreenshot) driver; //  TakesScreenshot objesini olusturduk deger olarak driver attik kabul etmesi icinde casting yaptik
        //Tum sayfanin screenshot ini almak icin bir File olusturalim ve
        // dosya yolunu belirtelim
        // dosyanin yeri src nin altinda
        //resim dosyasi olarak png kabul ediyor

        File tumsayfaSS = tss.getScreenshotAs(OutputType.FILE);

        tumsayfaSS =tss.getScreenshotAs(OutputType.FILE);
        File screenname = new File("src\\allPage");
    }

}
