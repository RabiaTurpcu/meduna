package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver; //null

    public static WebDriver getDriver() {
        if (driver == null) {

            switch (Configreader.getProperty("browser")) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;


                case "firefox":
                default: // asil kullanicagin browser in yanina buna yazarsan default oldugunda otomatik bunu calistirir.
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;

            }
        }

        driver.manage().window().maximize(); //ekrani otomatik buyutur
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// otomatik zaman bosluk verir
        return driver;
    }

    public static void closeDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;// 14. satira donduk
        }

    }

    public static void bekle(int sec){

        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

