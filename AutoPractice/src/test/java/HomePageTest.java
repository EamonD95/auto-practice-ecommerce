
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;





public class HomePageTest {

    public static WebDriver driver = TestSuite.driverFactory.getDriver();
    private HomePage homePage = new HomePage(driver).initElements();
    private ContactUsPage contactUs = new ContactUsPage(driver);
    private SignInPage signIn = new SignInPage(driver);
    private WomenPage womenPage = new WomenPage(driver);
    private DressesPage dressesPage = new DressesPage(driver);
    private TShirtPage tShirtPage = new TShirtPage(driver);
    private SearchResults searchResults = new SearchResults(driver);
    private ShoppingCart shoppingCart = new ShoppingCart(driver);

    @Before
    public void individualSetUp() {

        homePage.goTo();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    @Test
    public void clickContactUsButton() {
        homePage.navigateToContactUsPage();
        contactUs.verifyContactUs();

    }

//    @Test
//    public void searchForTest() {
//        homePage.searchFor("woof");
//    }

    @Test
    public void clickSignInButton(){
        homePage.navigatateToSignInPage();
        signIn.verifySignIn();
    }

    @Test
    public void clickWomenButton(){
        homePage.navigateToWomenPage();
        womenPage.verifyWomenPage();

    }

    @Test
    public void clickDressesButton(){
        homePage.navigateToDressesPage();
        dressesPage.verifyDressesPage();
    }

    @Test
    public void clickTShirtButton() {
        homePage.navigateToTShirtsPage();
        tShirtPage.verifyTShirtPage();
    }

    @Test
    public void searchForProduct(){
        homePage.enterAndSearchText("Dress"); // Search for a product e.g. dress, shirt etc.
        searchResults.verifySearchResults();

    }

    @Test
    public void clickShoppingCart(){
        homePage.navigateToShoppingCart();
        shoppingCart.verifyShoppingCart();
    }

    @Test
    public void clickBestSellersTab(){
        homePage.clickBestSellersTab();
    }

    @Test
    public void submitEmailAddressNewsletter(){
        homePage.emailNewsletter();
        homePage.newsletterConfirmed();
    }


    @After
    public void individualTearDown() {

    }

    @AfterClass
    public static void mainTearDown() {
    }
}
