package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LinkText_Partial {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // amazon anasayfaya gidin
driver.get("https://www.amazon.com");
// Gift Cards linkine tiklayin
driver.findElement(By.linkText("Gift Cards")).click();
// linkin bizi Gift Cards sayfasina yonlendirdigini test edin

      //sayfayi kapatin
      Thread.sleep(5000);
      driver.close();

    }
}
