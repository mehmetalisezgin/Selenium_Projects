package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Task1 {
    public static void main(String[] args) {
        // 1-driver olusturalim
        // 2-java class'imiza chromedriver.exe'yi tanitalim
        System.setProperty("webdriver.opera.driver","src/driver/operadriver_win64/operadriver.exe") ;
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe") ;
        // 3-driver'in tum ekrani kaplamasini saglayalim
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        WebDriver opera = new OperaDriver();
        opera.manage().window().maximize();
        // 4-https://github.com/ adresine gidelim
        chrome.get("https://github.com/");
        chrome.get("https://github.com/") ;
        String chromeUrlGithup = chrome.getCurrentUrl() ;
        String operaUrlGithup = opera.getCurrentUrl();
        String testWordGithup = "github";

        if(chromeUrlGithup.contains(testWordGithup)){
            System.out.println("Chrome Test Githup contains word PASS");
        }else{
            System.out.println("Chrome Test Github contains word FAILED");
        }

        if(operaUrlGithup.contains(testWordGithup)){
            System.out.println("Opera Test Github contains word PASS");
        }else{
            System.out.println("Opera Test Github contains word FAILED");
        }
        System.out.println(chrome.getCurrentUrl());
        System.out.println(operaUrlGithup);
        // 5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
        chrome.get("https://www.hepsiburada.com/");
        opera.get("https://www.hepsiburada.com/");
        // 6-Title ve url console da yazdirin ve yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim

        String chromeTitleHepsiburada = chrome.getTitle();
        String chromeUrlHepsiburada = chrome.getCurrentUrl() ;

        String operaTitleHepsiburada = opera.getTitle();
        String operaUrlHepsiburada = opera.getCurrentUrl();

        String testWord = "burada" ;


       if(chromeTitleHepsiburada.contains(testWord)&&chromeUrlHepsiburada.contains(testWord)){

           System.out.println("Chrome title and url Test Pass");
       }else {
           System.out.println("Chrome title and url Test Pass");
       }
       if(operaTitleHepsiburada.contains(testWord)&&operaUrlHepsiburada.contains(testWord)){
           System.out.println("Opera title and url Test Pass");
           System.out.println();
       }else {
           System.out.println("Opera  title and url Test FAILED");
       }
       // 7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim
       chrome.navigate().back();
       opera.navigate().back();
        // 8-Son adim olarak butun sayfalarimizi kapatmis olalim.
        chrome.close();
        opera.close();

    }
}
