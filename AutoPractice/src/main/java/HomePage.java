import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.temporal.WeekFields;
import java.util.Random;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage initElements() {
        return PageFactory.initElements(driver, HomePage.class);
    }

    private static String URL = "http://automationpractice.com/index.php";
    private static final By CONTACT_US_BUTTON = By.cssSelector("#contact-link");
    private static final By SIGN_IN_BUTTON = By.cssSelector("a.login");
    private static final By WOMEN_BUTTON = By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a");
    private static final By DRESSES_BUTTON = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private static final By T_SHIRT_BUTTON = By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");
    private static final By SEARCH_BAR = By.cssSelector("#search_query_top");
    private static final By SHOPPING_CART = By.cssSelector("#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a");
    private static final By BEST_SELLERS_TAB = By.cssSelector("a.blockbestsellers");
    private static final By EMAIL_NEWSLETTER = By.cssSelector("#newsletter-input");
    private static final By SUCCESS_EMAIL = By.cssSelector("p.alert.alert-success");

//    @FindBy(id = "search_query_top")
//    public WebElement searchBox;


    public void goTo() {
        driver.get(URL);
        PageFactory.initElements(driver, HomePage.class);
    }

//    public void searchFor(String text)
//    {
//        searchBox.click();
//        searchBox.sendKeys((text));
//    }

    public void verifyHomePage(){
        Assert.assertEquals("My Store", driver.getTitle());
    }

    public void navigateToContactUsPage() {

        WebElement contactUsButton = driver.findElement(CONTACT_US_BUTTON);
        contactUsButton.click();


    }

    public void navigatateToSignInPage() {

        WebElement signInButton = driver.findElement(SIGN_IN_BUTTON);
        signInButton.click();
    }

    public void navigateToWomenPage() {

        WebElement womenButton = driver.findElement(WOMEN_BUTTON);
        womenButton.click();
    }

    public void navigateToDressesPage() {

        WebElement dressesButton = driver.findElement(DRESSES_BUTTON);
        dressesButton.click();
    }

    public void navigateToTShirtsPage() {

        WebElement tShirtButton = driver.findElement(T_SHIRT_BUTTON);
        tShirtButton.click();
    }

    public void enterAndSearchText(String randomSearch) {

        WebElement searchBar = driver.findElement(SEARCH_BAR);
        searchBar.sendKeys (randomSearch, Keys.ENTER);
    }

    public void navigateToShoppingCart() {

        WebElement shoppingCart = driver.findElement(SHOPPING_CART);
        shoppingCart.click();
    }

    public void clickBestSellersTab() {

        WebElement bestSellers = driver.findElement(BEST_SELLERS_TAB);
        bestSellers.click();

    }

    public void emailNewsletter(){

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#newsletter-input")));

        String email =  new Random().nextInt(1000000) + "@mail.com";
        WebElement newsEmail = driver.findElement(EMAIL_NEWSLETTER);

        newsEmail.click();

        newsEmail.sendKeys(email, Keys.ENTER);
    }

    public void newsletterConfirmed(){

        WebElement confirmBox = driver.findElement(SUCCESS_EMAIL);
        Assert.assertTrue(elementIsVisible(confirmBox));

    }
}

