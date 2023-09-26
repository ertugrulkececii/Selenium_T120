package zMijn_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G01_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver(); // Selenium'un kendi webdriver'ini kullanir
        driver.manage().window().maximize();

        //amazon sayfasina gidin
        driver.get("https:www.amazon.com");
        Thread.sleep(3000);

        //sayfa basliginin smile more icerdigini test edin
        String expectedTitleIcerik = "smile more";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Amazon title testi PASSED");
        } else {
            System.out.println("Amazon title testi FAILED");
        }

        //youtube anasayfaya gidin
        driver.navigate().to("https://www.youtube.com");

        Thread.sleep(3000);

        //url'in "youtube" icerdigini test edin
        String expectedUrlIcerik = "youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Youtube url testi PASSED");
        } else {
            System.out.println("Youtube url testi FAILED");}

            //tekrar amazon anasayfaya donun
            //ve url'nin "ramazan" icermedigini test edin

            driver.navigate().back();
            Thread.sleep(3000);

            String unExpectedUrlIcerik = "ramazan";
            actualUrl = driver.getCurrentUrl();

            if (actualUrl.contains(unExpectedUrlIcerik)) {
                System.out.println("Amazon Url testi FAILED");
            } else {
                System.out.println("Amazon Url testi PASSED");
            }

            //tekrar youtube anasayfaya gidin
            //sayfa kaynak kodlarinda "music" gectigini kontrol edin
            driver.navigate().forward();
            Thread.sleep(3000);

            String exoectedSayfaIcerik = "music";
            String actualSayfaKaynakKodlari = driver.getPageSource();

            if (actualSayfaKaynakKodlari.contains(exoectedSayfaIcerik)) {
                System.out.println("Yotube kaynak kodu testi PASSED");
            } else {
                System.out.println("Yotube kaynak kodu testi FAILED");
            }

            //sayfayi kapatin


            Thread.sleep(3000);

            driver.close();

    }
}
