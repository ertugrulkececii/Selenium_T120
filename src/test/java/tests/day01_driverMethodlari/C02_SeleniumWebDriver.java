package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_SeleniumWebDriver {
    public static void main(String[] args) {

        // ilk adimi atlayip direk WebDriver objesi olusuralim.

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        /*
        Selenium son versiyonlarindan birinde kendi webdriver classini ekledi
        boylece oncesinde driver.exe dosyasini tanitmasakta istedigmiz browser i calistirir

        Sadece oncelikle bizden driver bekledigi icin birazcik gec calisir.

        Sirketler acik kaynakli driver kullanmayi tercih etmez.
        Genellikle kendi satin aldiklari bir driver'i kullanmamizi isterler
         */
    }

}
