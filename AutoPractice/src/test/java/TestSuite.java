

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HomePageTest.class, SignInPageTest.class, RegistrationPageTest.class, SearchResultsTest.class, WomenPageTest.class, DressesPageTest.class, ContactUsTest.class
})

public class TestSuite {

    static DriverFactory driverFactory = new DriverFactory();

    @BeforeClass
    public static void suiteSetUp() {
    }


    @AfterClass
    public static void tearDown() {
        driverFactory.getDriver().quit();
    }

}

