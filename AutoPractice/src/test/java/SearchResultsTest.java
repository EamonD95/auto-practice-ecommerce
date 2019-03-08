import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SearchResultsTest {


    public static WebDriver driver = TestSuite.driverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private SearchResults searchResults = new SearchResults(driver);

    @Before
    public void individualSetUp() {
        homePage.goTo();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    @Test
    public void displaySearchResults() {
        homePage.enterAndSearchText("Dress");
    }



    @After
    public void individualTearDown() {

    }

    @AfterClass
    public static void mainTearDown() {
    }

}
