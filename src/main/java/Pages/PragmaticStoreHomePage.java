package Pages;

import org.openqa.selenium.By;

public class PragmaticStoreHomePage {

    /**
     * This method open Pragmatic Store Home Page.
     */
    public static void openPragmaticHomePage() {
        Browser.driver.get("http://shop.pragmatic.bg/");
    }

    /**
     * This method open the registration page
     * that need to fill
     */
    public static void openRegForm() {
        Browser.driver.findElement(By.xpath("//a[@title='My Account']")).click();
        Browser.driver.findElement(By.xpath("//a[@href='http://shop.pragmatic.bg/index.php?route=account/register']")).click();

    }


    /**
     * This method open login form of the site
     */
    public static void openLoginForm() {
        Browser.driver.findElement(By.xpath("//a[@title='My Account']")).click();
        Browser.driver.findElement(By.xpath("//a[@href='http://shop.pragmatic.bg/index.php?route=account/login']")).click();
    }


}
