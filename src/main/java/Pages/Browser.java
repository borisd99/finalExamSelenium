package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;

    /**
     * Open browser
     * @param browserType If you type: "chrome" this method
     *                    will open Google Chrome. If you type firefox
     *                    it will open Mozilla Firefox etc.
     */
    public static void open(String browserType) {
    switch(browserType) {
        case "chrome":
            System.setProperty("webdriver.chrome.driver", "E:\\webdriversForSeleniumQA\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            break;
        case "firefox":
            break;
        case "opera":
            break;
        default:
            throw new RuntimeException("The browser " + browserType + " is not valid!");
        }
    }

    /**
     * This method close the browser
     */
    public static void quit() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
