import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DressesPageTest {


    public static WebDriver driver = TestSuite.driverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private WomenPage womenPage = new WomenPage(driver);
    private DressesPage dressesPage = new DressesPage(driver);

    @Before
    public void individualSetUp() {
        homePage.goTo();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    @Test
    public void navigateToDressesPage(){
        homePage.navigateToWomenPage();
        womenPage.selectDresses();

    }

    @Test
    public void clickCasualDressesButton(){
        homePage.navigateToWomenPage();
        womenPage.selectDresses();
        dressesPage.selectCasualDresses();
    }

    @Test
    public void clickEveningDressesButton(){
        homePage.navigateToWomenPage();
        womenPage.selectDresses();
        dressesPage.selectEveningDresses();
    }

    @Test
    public void clickSummerDressesButton(){
        homePage.navigateToWomenPage();
        womenPage.selectDresses();
        dressesPage.selectSummerDresses();
    }


    @After
    public void individualTearDown() {

    }

    @AfterClass
    public static void mainTearDown() {
    }
}
