package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {


    @Test
    public void test01() {
        //amazon a gidelim
        Driver.getDriver().get("https://amazon.com");
        // amazona gittigimizi test edelim
        String actultitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actultitle.contains("Amazon"));
        Driver.closeDriver();

    }

    @Test
    public void test02() {
        // bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");

        // bestbuy a gittigimizi test edelim
        String actualurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualurl.contains("bestbuy"));
        Driver.closeDriver();
    }

}
