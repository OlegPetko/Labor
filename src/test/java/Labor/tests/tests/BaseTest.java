package Labor.tests.tests;


import Labor.tests.pages.BasePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    /*static App app = new App();

    @AfterSuite
    public void afterSuite() {
        app.common.close();
    }*/

    @BeforeSuite
    public void beforeSuite() {
        BasePage.initDriver();
    }
}
