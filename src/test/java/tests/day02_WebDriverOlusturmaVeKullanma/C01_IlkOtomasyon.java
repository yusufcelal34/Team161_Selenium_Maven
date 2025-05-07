package tests.day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");
    }
}
