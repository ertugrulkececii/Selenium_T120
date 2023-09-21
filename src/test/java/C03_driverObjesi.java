import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverObjesi {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://amazon.com"); //www url sini yazmazsakda sayfaya gider fakat https yazmazsak gitmez.
Thread.sleep(13000);
        driver.close();
    }
}
