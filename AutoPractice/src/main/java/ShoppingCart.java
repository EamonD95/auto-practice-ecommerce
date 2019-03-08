import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ShoppingCart extends BasePage {
    ShoppingCart(WebDriver driver) {
        super(driver);
    }

    public void verifyShoppingCart(){

        Assert.assertEquals("Order - My Store", driver.getTitle());

    }
}
