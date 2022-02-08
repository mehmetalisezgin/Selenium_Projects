package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelMCPAddUserMethods {
    HotelMCPAddUser hotelMCPAddUser =new HotelMCPAddUser();

    // Thread.sleep
    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Main Page>>>Log In>>>ADD USER kismina kadar olan giris
    public void hotelMyCampLoginAddUser() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMCPAddUser.mainPageLogin.click();
        hotelMCPAddUser.userNameBox.sendKeys("manager");
        hotelMCPAddUser.passwordBox.sendKeys("Manager1!");
        hotelMCPAddUser.userLogIn.click();
        hotelMCPAddUser.addUserElement.click();

    }
    // Main Page>>>Log In
    public void hotelMyCampLogin() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMCPAddUser.mainPageLogin.click();
        hotelMCPAddUser.userNameBox.sendKeys("manager");
        hotelMCPAddUser.passwordBox.sendKeys("Manager1!");
        hotelMCPAddUser.userLogIn.click();


    }
    //Screen shot method
    public void tumSayfaScreenshot() {
        TakesScreenshot tss = (TakesScreenshot) Driver.getDriver();

        String tarih = new SimpleDateFormat("yyMMddhhmmss").format(new Date());

        File tumSayfaSS = new File("target/screenShot/tumSayfa" + tarih + ".jpeg");
        File gecici = tss.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(gecici, tumSayfaSS);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //this method will bring us to the wanted row
    public WebElement rowBring(int rowNo){
         // print 2nd row  ===>  //tbody//tr[2]
        // print 7th row ===>  //tbody//tr[2]
        String rowPath = "//tbody//tr[" +rowNo+ "]" ;
        WebElement rowElement=  Driver.getDriver().findElement(By.xpath(rowPath));
        return rowElement ;

    }

    //this method will bring us to the wanted column
    public void columnBring(int columnNo) {
        // her bir satirdaki istenen sutun elementini yazdirabilmek icin
        // once satir sayisini bilmeye ihtiyacim var
        int columnNumber=hotelMCPAddUser.columnList.size();
        for (int i=1 ; i<=columnNumber ; i++ ){
            System.out.println(cellWebElementBring(i, columnNo));
        }
    }





    //this method will bring us to the wanted cell it means intersection of row and column
    public String cellWebElementBring(int rowNo, int columnNo){

        // print the 4th data of  2nd row ===> means intersection of 2nd row and 4th column //tbody//tr[2]//td[4]
        // print the 5th data of  4nd row ===> means intersection of 4nd row and 5th column //tbody//tr[4]//td[5]
        String cellPath="//tbody//tr["+ rowNo +"]//td["+ columnNo  +"]";
        WebElement cellWebelement=Driver.getDriver().findElement(By.xpath(cellPath));
        String cellData=cellWebelement.getText();
        return cellData;
    }


}
