package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class C02_HandleDropDown {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
    }


    @Test
    public void dropdownTest() throws InterruptedException {
        //amazon sayfasindaki all dropdown segmesine gidiyoruz

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        //dropdown.click();
        //3.adim select objesini kullanarak select classinda var olan 3 secim methodundan
        //istedigimizi kullanarak dropdown da var olan options birini secebiliriz
        //secim yapmamiza yardim eden bu 3 method void dir dolayisiyla bize birsey dondurmez
        Select select = new Select(dropdown);
        select.selectByIndex(3);
        // eger sectigimiz option degerini yazdirmak istersek
        System.out.println(select.getFirstSelectedOption());
        Thread.sleep(3000);
        select.selectByVisibleText("Deals");

        select.selectByValue("search-alias=arts-crafts-intl-ship");

        List<WebElement> dropdownList = select.getOptions();
        for(WebElement each : dropdownList){
            System.out.println(each.getText());
        }


    }


}
