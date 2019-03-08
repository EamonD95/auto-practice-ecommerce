import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignInPageTest {

    public static WebDriver driver = TestSuite.driverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private SignInPage signIn = new SignInPage(driver);

    @Before
    public void individualSetUp() {
        homePage.goTo();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    @Test
    public void returnHomeUsingHouseButton() {
        homePage.navigatateToSignInPage();
        signIn.navigateBackToHome();
        homePage.verifyHomePage();

    }

    @Test
    public void enterNewEmailClickCreateAccount() {
        homePage.navigatateToSignInPage();
        signIn.createNewAccountEnterEmail();
    }


    @After
    public void individualTearDown() {

    }

    @AfterClass
    public static void mainTearDown() {
    }
}
