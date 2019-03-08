import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {


    public static WebDriver driver = TestSuite.driverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private SignInPage signIn = new SignInPage(driver);
    private RegistrationPage regPage = new RegistrationPage(driver);

    @Before
    public void individualSetUp() {
        homePage.goTo();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    @Test
    public void enterAccountDetails(){
        homePage.navigatateToSignInPage();
        signIn.createNewAccountEnterEmail();
        regPage.clickMR();
        regPage.enterFirstName("Eamon");
        regPage.enterLastName("Droko");
        regPage.enterPassword("random");
        regPage.selectDay("15"); // Enter day of birth as number 1-31
        regPage.selectMonth("1"); // Enter month of birth as number 1-12
        regPage.selectYear("1995"); // Enter year of birth as number
        regPage.enterCompany("Blah Blah Company");
        regPage.enterAddress("25 Blah Blah Street");
        regPage.enterAddress2("Blah Blah Lane");
        regPage.enterCity("Blah Blah City");
        regPage.selectState("30");// Enter state as number
        regPage.enterZipCode();
        regPage.selectYourCountry("21");// Only option is 'United States'. Enter '21' for United States. '-' is the default option

    }

    @After
    public void individualTearDown() {

    }

    @AfterClass
    public static void mainTearDown() {
    }

}
