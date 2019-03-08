import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ContactUsTest {


    public static WebDriver driver = TestSuite.driverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private ContactUsPage contactUsPage = new ContactUsPage(driver);

    @Before
    public void individualSetUp() {
        homePage.goTo();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    @Test
    public void selectSubjectHeader() {
        homePage.navigateToContactUsPage();
        contactUsPage.selectSubjectHeading("1"); // Enter '2' for 'Customer service' and enter '1' for 'Webmaster'
    }

    @Test
    public void enterEmailAddress() {
        homePage.navigateToContactUsPage();
        contactUsPage.enterEmailAddress();
    }

    @Test
    public void enterNewMessage() {
        homePage.navigateToContactUsPage();
        contactUsPage.enterMessage("Blah Blah Blah"); // Enter message string
    }

    @Test
    public void enterNewOrderReference() {
        homePage.navigateToContactUsPage();
        contactUsPage.enterOrderReference("12345"); // Enter order reference string
    }

    @Test
    public void clickAttachFileButton(){
        homePage.navigateToContactUsPage();
        contactUsPage.clickAttachFileButton();
    }

    @Test
    public void clickSendButton(){
        homePage.navigateToContactUsPage();
        contactUsPage.clickSendButton();
    }

    @Test
    public void enterDetailsAndSendMessage(){
        homePage.navigateToContactUsPage();
        contactUsPage.selectSubjectHeading("2"); // Enter '2' for 'Customer service' and enter '1' for 'Webmaster'
        contactUsPage.enterEmailAddress();
        contactUsPage.enterOrderReference("12345"); // Enter order reference string
        contactUsPage.enterMessage("Blah Blah Blah"); // Enter message string
        contactUsPage.clickSendButton();
        contactUsPage.confirmMessageSent();
    }

    @After
    public void individualTearDown() {

    }

    @AfterClass
    public static void mainTearDown() {
    }
}
