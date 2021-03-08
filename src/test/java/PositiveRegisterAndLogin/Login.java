package PositiveRegisterAndLogin;

import Pages.Browser;
import Pages.LoginPage;
import Pages.PragmaticStoreHomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    @BeforeMethod
    public void openBrowser() {
        Browser.open("chrome");
    }

    @Test
    public void loginPositive() {
        PragmaticStoreHomePage.openPragmaticHomePage();
        PragmaticStoreHomePage.openLoginForm();
        LoginPage.checkIfYouAreOnLoginPage("Returning Customer", "You are NOT on login page");
        LoginPage.fillLoginForm("testMail@abv.bg", "parolaS");
        LoginPage.verifyContent("My Account", "You are NOT logged!");

    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Browser.quit();
    }
}
