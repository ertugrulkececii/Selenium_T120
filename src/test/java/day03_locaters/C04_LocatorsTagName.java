package day03_locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_LocatorsTagName {
    public static void main(String[] args) {


        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.automationexercise.com/ adresine gidin

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<> LinkListesi= driver.findElements("a");
        int actualLinkSsayisi=LinkListesi.size();
        //4- Products linkine tiklayin
        //5- special offer yazisinin gorundugunu test edin
        //6- Sayfayi kapatin
    }
}
