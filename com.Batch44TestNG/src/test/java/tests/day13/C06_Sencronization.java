package tests.day13;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_Sencronization extends TestBase {


    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(500);
        driver.findElement(By.id("file-submit")).click();



    }





}
