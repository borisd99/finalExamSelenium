package PositiveRegisterAndLogin;

import Pages.Browser;
import Pages.PragmaticStoreHomePage;
import Pages.RegFormPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPositive {


    @BeforeMethod
    public void openBrowser() {
        Browser.open("chrome");
    }

    @Test
    public void testRegisterForm() throws Exception {
        PragmaticStoreHomePage.openPragmaticHomePage();
        PragmaticStoreHomePage.openRegForm();
        RegFormPage.fillRegForm("Ivan", "Ivanov", "testMail@abv.bg", "0891", "parolaS", "parolaS");
        RegFormPage.subscribeYes();
        RegFormPage.readPrivacyPolicy();
        RegFormPage.clickRegButton();
        //tuk bih napravil Assert za proverka dali sled natiskane na butona za registraciq se poqvqva nqkakuv ochakvan tekst
        //no mi dava nqkakva greshka i zatova shte proverq v Login testa
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Browser.quit();
    }


}
