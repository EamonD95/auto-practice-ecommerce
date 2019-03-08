import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class ContactUsPage extends BasePage {
    ContactUsPage(WebDriver driver) {
        super(driver);
    }

    private static final By SUBJECT_HEADING = By.cssSelector("#id_contact.form-control");
    private static final By EMAIL_ADDRESS = By.id("email");
    private static final By MESSAGE_BOX = By.id("message");
    private static final By ORDER_REFERENCE_BOX = By.id("id_order");
    private static final By ATTACH_FILE_BUTTON = By.id("uniform-fileUpload");
    private static final By SEND_BUTTON = By.id("submitMessage");
    private static final By CONFIRM_MESSAGE_SENT = By.cssSelector("p.alert.alert-success");


    public void verifyContactUs(){

        Assert.assertEquals("Contact us - My Store", driver.getTitle());
    }

    public void selectSubjectHeading(String subjectHeadingSelection){

        Select subHeading = new Select(driver.findElement(SUBJECT_HEADING));
        subHeading.selectByValue(subjectHeadingSelection);
    }

    public void enterEmailAddress(){

        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));

        String email =  new Random().nextInt(1000000) + "@mail.com";
        WebElement emailAddress = driver.findElement(EMAIL_ADDRESS);
        emailAddress.sendKeys(email);
    }

    public void enterMessage(String usersMessage){

        wait.until(ExpectedConditions.elementToBeClickable(By.id("message")));

        WebElement newMessage = driver.findElement(MESSAGE_BOX);
        newMessage.sendKeys(usersMessage);

    }

    public void enterOrderReference(String orderReference){

        wait.until((ExpectedConditions.elementToBeClickable(By.id("id_order"))));

        WebElement newOrderReference = driver.findElement(ORDER_REFERENCE_BOX);
        newOrderReference.sendKeys(orderReference);
    }

    public void clickAttachFileButton(){

        wait.until(ExpectedConditions.elementToBeClickable(By.id("uniform-fileUpload")));

        WebElement attachFileButton = driver.findElement(ATTACH_FILE_BUTTON);
        attachFileButton.click();
    }

    public void clickSendButton(){

        wait.until(ExpectedConditions.elementToBeClickable(By.id("submitMessage")));

        WebElement sendButton = driver.findElement(SEND_BUTTON);
        sendButton.click();
    }

    public void confirmMessageSent(){

        WebElement messageConfirmed = driver.findElement(CONFIRM_MESSAGE_SENT);
        Assert.assertTrue(elementIsVisible(messageConfirmed));
    }

}
