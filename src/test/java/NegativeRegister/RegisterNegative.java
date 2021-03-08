package NegativeRegister;

import Pages.Browser;
import Pages.PragmaticStoreHomePage;
import Pages.RegFormPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterNegative {

    @BeforeMethod
    public void openBrowser() {
        Browser.open("chrome");
    }

    @Test
    public void negativeRegister() {
        PragmaticStoreHomePage.openPragmaticHomePage();
        PragmaticStoreHomePage.openRegForm();
        RegFormPage.clickRegButton();
        RegFormPage.errorMessageForNoRegister("Warning: You must agree to the Privacy Policy!", "You ARE registered!");
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Browser.quit();
    }
}
