package tests.day03_webElements_locartors;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");


        System.out.println("baslangictaki konum : " + driver.manage().window().getPosition());
        System.out.println("baslangictaki boyut : " + driver.manage().window().getSize());
        Thread.sleep(3000);


        driver.manage().window().setSize(new Dimension(500, 500));
        driver.manage().window().setPosition(new Point(100, 100));
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("Düzenledikten sonraki konum : " + driver.manage().window().getPosition());
        System.out.println("Düzenledikten sonraki boyut : " + driver.manage().window().getSize());
        Thread.sleep(3000);

        driver.quit();


    }
}
