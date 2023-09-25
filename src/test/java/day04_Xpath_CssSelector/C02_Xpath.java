package day04_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver"," chromedriver.exe");
        WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@*='addElement()']"));
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("/button[@*='deleteElement()']"));

        //4- Delete tusuna basin
        deleteButonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
       // WebElement addRemoveYaziElementi= driver.findElement(By.tagName("h3"));
        WebElement addRemoveYaziElementi= driver.findElement(By.xpath("//h3"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Delete butonu PASSED");
        }else {
            System.out.println("Delete utinu FAILED");
        }
    }
}
