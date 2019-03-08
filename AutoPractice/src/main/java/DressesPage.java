import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DressesPage extends BasePage {
    DressesPage(WebDriver driver) {
        super(driver);
    }

    private static final By SELECT_CASUAL_DRESSES_SUB = By.cssSelector("#subcategories > ul > li:nth-child(1) > div.subcategory-image > a");
    private static final By SELECT_EVENING_DRESSES_SUB = By.cssSelector("#subcategories > ul > li:nth-child(2) > div.subcategory-image > a > img");
    private static final By SELECT_SUMMER_DRESSES_SUB = By.cssSelector("#subcategories > ul > li:nth-child(3) > div.subcategory-image > a > img");

    public void verifyDressesPage(){

        Assert.assertEquals("Dresses - My Store", driver.getTitle());

    }

    public void selectCasualDresses(){

        WebElement casualDressesButton = driver.findElement(SELECT_CASUAL_DRESSES_SUB);
        casualDressesButton.click();
    }

    public void selectEveningDresses(){

        WebElement eveningDressesButton = driver.findElement(SELECT_EVENING_DRESSES_SUB);
        eveningDressesButton.click();
    }

    public void selectSummerDresses(){

        WebElement summerDressesButton = driver.findElement(SELECT_SUMMER_DRESSES_SUB);
        summerDressesButton.click();
    }


}
