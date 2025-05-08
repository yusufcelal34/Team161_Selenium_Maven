package tests.day03_webElements_locartors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.List;
import java.time.Duration;

public class C04_ByClassName {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

            // phone icin arama yapin
        WebElement searchBox = driver.findElement(By.id("search-box"));
        searchBox.sendKeys("phone");

        WebElement searchButton = driver.findElement(By.id("search-button"));
        searchButton.click();


            // arama sonucunda urun bulunabildigini test edin

            // bulunan urunlerden ilkini tiklayin

            // acilan urun sayfasindaki urun isminde
            // case sensitive olmaksizin "phone" bulundugunu test edin

            // sayfayi kapatin

    }
}
