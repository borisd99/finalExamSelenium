package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegFormPage {

    /**
     * Fill the registration form of Pragmatic Store
     * @param firstName Enter Your first name
     * @param lastName Enter your last name
     * @param eMail    Enter your email
     * @param phoneNumber Enter your mobile number
     * @param pass        Enter password
     * @param passConfirm Re-enter password
     */
    public static void fillRegForm(String firstName, String lastName, String eMail, String phoneNumber, String pass, String passConfirm){
        Browser.driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstName);
        Browser.driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastName);
        Browser.driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(eMail);
        Browser.driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(phoneNumber);
        Browser.driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
        Browser.driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(passConfirm);
    }

    /**
     * Choose radio button 'yes' - that is for subscription
     * @throws Exception if the button is not checked throw an exception
     */
    public static void subscribeYes() throws Exception {
        Browser.driver.findElement(By.xpath("//input[@value='1' and @type='radio' and @name='newsletter']")).click();
        boolean isSubscribed = Browser.driver.findElement(By.xpath("//input[@value='1' and @type='radio' and @name='newsletter']")).isSelected();
        if(!isSubscribed){
            throw new Exception("You are not subscribed");
        }
    }

    /**
     * This method click on checkbox that is for agreement with privacy policy
     * @throws Exception Throw an exception that you don't agree with privacy policy
     */
    public static void readPrivacyPolicy() throws Exception {
        Browser.driver.findElement(By.xpath("//input[@value='1' and @type='checkbox' and @name='agree']")).click();
        boolean isReadPrivacyPolChecked = Browser.driver.findElement(By.xpath("//input[@value='1' and @type='checkbox' and @name='agree']")).isSelected();
        if(!isReadPrivacyPolChecked) {
            throw new Exception("You don't read privacy policy!");
        }
    }

    /**
     * Click the button for registration
     */
    public static void clickRegButton(){
        Browser.driver.findElement(By.xpath("//input[@value='Continue']")).click();
    }

    /**
     * This method check if register correctly or not!
     * @param expected Content from page when you want to FAIL REGISTER
     * @param errorMessage Message if you Register SUCCESSFULLY
     */
    public static void errorMessageForNoRegister(String expected, String errorMessage) {
        Browser.driver.getPageSource();
        String actualTitle = "Warning: You must agree to the Privacy Policy!";
        Assert.assertEquals(actualTitle, expected, errorMessage);
    }
}
