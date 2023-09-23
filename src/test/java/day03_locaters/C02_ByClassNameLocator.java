package day03_locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ByClassNameLocator {
    public static void main(String[] args) {

       //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       //2- https://www.automationexercise.com/ adresine gidin

       //3- Category bolumundeki elementleri locate edin
       //4- Category bolumunde 3 element oldugunu test edin
       //5- Category isimlerini yazdirin
       //6- Sayfayi kapatin
       //automationexercise.com
       //Automation Exercise
       //This is for automation practice
    }
}
