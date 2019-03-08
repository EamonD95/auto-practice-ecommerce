import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResults extends BasePage {
    SearchResults(WebDriver driver) {
        super(driver);
    }
    public void verifySearchResults(){

        Assert.assertEquals("Search - My Store", driver.getTitle());

    }

    }

