import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class RegistrationPage extends BasePage {
    RegistrationPage(WebDriver driver) {
        super(driver);
    }

    private static final By ENTER_FIRST_NAME = By.cssSelector("#customer_firstname");
    private static final By ENTER_LAST_NAME = By.cssSelector("#customer_lastname");
    private static final By ENTER_PASSWORD = By.cssSelector("#passwd");
    private static final By SELECT_MR = By.cssSelector("#id_gender1");
    private static final By SELECT_MRS = By.cssSelector("#id_gender2");
    private static final By SELECT_DAY = By.cssSelector("#days.form-control");
    private static final By SELECT_MONTH = By.cssSelector("#months.form-control");
    private static final By SELECT_YEAR = By.cssSelector("#years.form-control");
    private static final By ENTER_COMPANY = By.cssSelector("#company");
    private static final By ENTER_ADDRESS = By.cssSelector("#address1");
    private static final By ENTER_ADDRESS_2 = By.cssSelector("#address2");
    private static final By ENTER_CITY = By.cssSelector("#city");
    private static final By NAME_OF_STATE = By.cssSelector("#id_state.form-control");
    private static final By ZIP_CODE = By.cssSelector("#postcode");
    private static final By SELECT_COUNTRY = By.cssSelector("#id_country.form-control");
    private static final By ADDITIONAL_INFO = By.cssSelector("#other.form-control");
    private static final By PHONE_NUMBER = By.cssSelector("#phone.form-control");
    private static final By MOBILE_NUMBER = By.cssSelector("#phone_mobile.form-control");
    private static final By ADDRESS_ALIAS = By.cssSelector("#alias.form-control");
    private static final By SUBMIT_BUTTON = By.cssSelector("#submitAccount");

    public void clickMR() {

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#id_gender1")));

        WebElement clickMR = driver.findElement(SELECT_MR);
        clickMR.click();
    }

    public void clickMRS() {

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#id_gender2")));

        WebElement clickMRS = driver.findElement(SELECT_MRS);
        clickMRS.click();
    }

    public void enterFirstName(String firstName) {

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer_firstname")));

        WebElement firstName1 = driver.findElement(ENTER_FIRST_NAME);
        firstName1.sendKeys(firstName);

    }

    public void enterLastName(String lastName) {

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer_lastname")));

        WebElement lastName1 = driver.findElement(ENTER_LAST_NAME);
        lastName1.sendKeys(lastName);

    }

    public void enterPassword(String password) {

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#passwd")));

        WebElement password1 = driver.findElement(ENTER_PASSWORD);
        password1.sendKeys(password);
    }


    public void selectDay(String dayOneToThirtyOne) {

        Select day1 = new Select(driver.findElement(SELECT_DAY));
        day1.selectByValue(dayOneToThirtyOne);

    }

    public void selectMonth(String monthOneToTwelve) {

        Select month1 = new Select(driver.findElement(SELECT_MONTH));
        month1.selectByValue(monthOneToTwelve);

    }

    public void selectYear(String theYear) {

        Select year1 = new Select(driver.findElement(SELECT_YEAR));
        year1.selectByValue(theYear);
    }

    public void enterCompany(String nameOfCompany) {

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#company")));

        WebElement companyName = driver.findElement(ENTER_COMPANY);
        companyName.sendKeys(nameOfCompany);


    }

    public void enterAddress(String addressFirstLine) {

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#address1")));

        WebElement address1 = driver.findElement(ENTER_ADDRESS);
        address1.sendKeys(addressFirstLine);
    }

    public void enterAddress2(String addressSecondLine) {

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#address2")));

        WebElement address2 = driver.findElement(ENTER_ADDRESS_2);
        address2.sendKeys(addressSecondLine);

    }

    public void enterCity(String nameOfCity) {


        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#city")));

        WebElement cityName = driver.findElement(ENTER_CITY);
        cityName.sendKeys(nameOfCity);
    }

    public void selectState(String stateOneToFifty) {

        Select state1 = new Select(driver.findElement(NAME_OF_STATE));
        state1.selectByValue(stateOneToFifty);
    }

    public void enterZipCode() {
        String randomZip = new Random().nextInt(100000) + "";
        WebElement enterZip = driver.findElement(ZIP_CODE);

        enterZip.sendKeys(randomZip);
    }

    public void selectYourCountry(String countryName) {

        Select selectCountry = new Select(driver.findElement(SELECT_COUNTRY));
        selectCountry.selectByValue(countryName);
    }

    public void additionalInformation(String addInfo) {

        WebElement additionalInfo = driver.findElement(ADDITIONAL_INFO);
        additionalInfo.sendKeys(addInfo);

    }


}
