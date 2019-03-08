import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class WomenPageTest {


    public static WebDriver driver = TestSuite.driverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private WomenPage womenPage = new WomenPage(driver);

    @Before
    public void individualSetUp() {
        homePage.goTo();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
    @Test
    public void navigateToWomensTops(){
        homePage.navigateToWomenPage();
        womenPage.selectTops();
        womenPage.verifyWomenTopsPage();
    }

    @Test
    public void navigateToWomensDresses(){
        homePage.navigateToWomenPage();
        womenPage.selectDresses();
        womenPage.verifyWomenDressesPage();
    }

    // "position:asc" - default position
    // "price:asc" - lowest first, "price:desc" - highest first,
    // "name:asc" - A to Z, "name:desc" - Z to A
    // "quantity:desc" - in stock
    // "reference:asc" - reference lowest first, "reference:desc" - reference highest first

    @Test
    public void sortResults(){
        homePage.navigateToWomenPage();
        womenPage.sortDropDown("name:asc");
    }

    @Test
    public void clickClothesTopsCheckbox(){
        homePage.navigateToWomenPage();
        womenPage.selectTopsCheckbox();
    }

    @Test
    public void clickClothesCheckbox(){
        homePage.navigateToWomenPage();
        womenPage.selectDressesCheckbox();
    }

    @After
    public void individualTearDown() {

    }

    @AfterClass
    public static void mainTearDown() {
    }

}
