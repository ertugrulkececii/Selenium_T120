package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkClass {
    public static void main(String[] args) {



System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.com");
    }
}
