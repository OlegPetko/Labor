package Labor.tests;

import Labor.tests.pages.DashBoardPage;
import Labor.tests.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest {

    @Test
    public void test() throws InterruptedException {


        LoginPage loginPage = new LoginPage();
        loginPage.login("Petko, O", "sunnyday");
        DashBoardPage dashBoardPage = new DashBoardPage();
        String userName = dashBoardPage.getUserName();
        Assert.assertEquals(userName, "Oleg Petko");

//        driver.quit();
    }
}
