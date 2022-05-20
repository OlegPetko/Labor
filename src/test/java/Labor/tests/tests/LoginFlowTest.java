package Labor.tests.tests;

import Labor.tests.helpers.DashBoardHelper;
import Labor.tests.helpers.LoginFlowHelper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LoginFlowTest extends BaseTest {

    @AfterTest
    public void resetPage() {
        new LoginFlowHelper().resetLoginForm();
    }

    @Test(priority = 0)
    public void test() throws InterruptedException {

        new LoginFlowHelper().login();
        String userName = new DashBoardHelper().getUserName();
//        assertTrue(userName.equals("Oleg Petko"));
        Assert.assertEquals(userName, "Oleg Petko");
        new LoginFlowHelper().logOut();


        new LoginFlowHelper().loginwWithEmptyFields();
        String passwordField = new LoginFlowHelper().getPasswordField();
        Assert.assertEquals(passwordField, "pword");


        Thread.sleep(3000);
        new LoginFlowHelper().loginWithoutName();
        String buttonName = new LoginFlowHelper().getButtonName();
        Assert.assertEquals(buttonName, "login_submit");

        Thread.sleep(3000);
        new LoginFlowHelper().loginWithoutPassword();
        String departmentName = new LoginFlowHelper().getDepartmentName();
        Assert.assertEquals(departmentName, "Administrative");


        Thread.sleep(3000);
        LoginFlowHelper loginFlowHelper = new LoginFlowHelper();
        loginFlowHelper.loginWithWrongPassword();
       /* String languagePanel = loginFlowHelper.getLanguagePanel();
        Assert.assertEquals(languagePanel, "language");*/

        boolean isLanguagePanelDisplayed = loginFlowHelper.isLanguagePanelVisible();
        assertTrue(isLanguagePanelDisplayed, "language panel is not visible");
    }
}
