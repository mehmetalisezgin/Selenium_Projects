package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.security.Key;

public class C02 extends TestBase {


    //Bir Class olusturalim KeyboardActions1

    //https://www.amazon.com sayfasina gidelim



    //aramanin gerceklestigini test edin

    @Test
    public void test(){
        driver.get("https://www.amazon.com");
        Actions actions = new Actions(driver);
        //Arama kutusuna actions method’larine kullanarak
        //samsung A71 yazdirin ve Enter’a basarak arama
        //yaptirin
        WebElement searcBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        actions.click(searcBox).
                keyDown(Keys.SHIFT).
                sendKeys("s").
                keyUp(Keys.SHIFT).
                sendKeys("amsung").
                keyDown(Keys.SHIFT).
                sendKeys("a").
                keyUp(Keys.SHIFT).
                sendKeys("71").
                sendKeys(Keys.ENTER).perform();
    }
}
