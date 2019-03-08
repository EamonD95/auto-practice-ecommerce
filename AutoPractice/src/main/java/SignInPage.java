import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class SignInPage extends BasePage {
    SignInPage(WebDriver driver) {
        super(driver);
    }

    private static final By RETURN_TO_HOME = By.cssSelector("a.home");
    private static final By ENTER_NEW_EMAIL = By.cssSelector("#email_create");
    private static final By CREATE_ACCOUNT_BUTTON = By.cssSelector("#SubmitCreate");


    public void verifySignIn(){
        Assert.assertEquals("Login - My Store", driver.getTitle());
    }
    public void navigateBackToHome(){

        WebElement backHome = driver.findElement(RETURN_TO_HOME);
        backHome.click();
    }

    public void createNewAccountEnterEmail(){

        String email =  new Random().nextInt(1000000) + "@mail.com";
        WebElement enterEmail = driver.findElement(ENTER_NEW_EMAIL);

        enterEmail.sendKeys(email);

        WebElement clickCreateAccount = driver.findElement(CREATE_ACCOUNT_BUTTON);
        clickCreateAccount.click();

    }


}
