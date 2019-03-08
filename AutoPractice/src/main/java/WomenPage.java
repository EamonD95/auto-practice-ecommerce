import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WomenPage extends BasePage {
    WomenPage(WebDriver driver) {
        super(driver);
    }

    private static final By SELECT_TOPS_SUB = By.cssSelector("#subcategories > ul > li:nth-child(1) > div.subcategory-image > a");
    private static final By SELECT_DRESSES_SUB = By.cssSelector("#subcategories > ul > li:nth-child(2) > div.subcategory-image > a");
    private static final By DROP_DOWN_SORT = By.cssSelector("#selectProductSort");
    private static final By TOPS_CHECKBOX = By.id("layered_category_4");
    private static final By DRESSES_CHECKBOX = By.id("layered_category_8");


    public void sortDropDown(String selection) {

        Select firstSelection = new Select(driver.findElement(DROP_DOWN_SORT));
        firstSelection.selectByValue(selection);
    }

    public void selectTops() {

        WebElement selectWomenTops = driver.findElement(SELECT_TOPS_SUB);
        selectWomenTops.click();
    }

    public void selectDresses() {

        WebElement selectWomenDresses = driver.findElement(SELECT_DRESSES_SUB);
        selectWomenDresses.click();
    }

    public void selectTopsCheckbox() {

        WebElement topsCheckbox = driver.findElement(TOPS_CHECKBOX);
        topsCheckbox.click();
    }

    public void selectDressesCheckbox() {

        WebElement dressesCheckbox = driver.findElement(DRESSES_CHECKBOX);
        dressesCheckbox.click();
    }

    public void verifyWomenTopsPage() {

        Assert.assertEquals("Tops - My Store", driver.getTitle());
    }

    public void verifyWomenDressesPage() {

        Assert.assertEquals("Dresses - My Store", driver.getTitle());
    }

    public void verifyWomenPage() {

        Assert.assertEquals("Women - My Store", driver.getTitle());

    }
}
