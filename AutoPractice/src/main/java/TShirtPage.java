import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TShirtPage extends BasePage {
    TShirtPage(WebDriver driver) {
        super(driver);
    }
    public void verifyTShirtPage(){

        Assert.assertEquals("T-shirts - My Store", driver.getTitle());

    }
}
