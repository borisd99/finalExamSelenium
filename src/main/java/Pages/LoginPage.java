package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage {

    /**
     * This method check if you are on the login page
     * @param expected Content from login page
     * @param errorMessage Message that will print if you are not on login page
     */
    public static void checkIfYouAreOnLoginPage(String expected, String errorMessage) {
        Browser.driver.getPageSource();
        String actualTitle = "Returning Customer";
        Assert.assertEquals(actualTitle, expected, errorMessage);
    }


    /**
     * Fill the login form
     * @param mail Enter your email address
     * @param password  Enter your password
     */
    public static void fillLoginForm(String mail, String password) {
        Browser.driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(mail);
        Browser.driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
        Browser.driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    /**
     * Method which verify that you are logged in.
     * It use expected contain on the the page after click the login button.
     * @param expected     the expected contain
     * @param errorMessage error message in case the assert fails.
     */
    public static void verifyContent(String expected, String errorMessage) {
        Browser.driver.getPageSource();
        String actualTitle = "My Account";
        Assert.assertEquals(actualTitle, expected, errorMessage);
    }
}
