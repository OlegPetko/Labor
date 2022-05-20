package Labor.tests.tests;

import Labor.tests.helpers.AddShiftHelper;
import Labor.tests.helpers.LoginFlowHelper;
import org.testng.annotations.Test;

public class AddShiftTest extends BaseTest {

    @Test(priority = 1)
    public void test() throws InterruptedException {
        new LoginFlowHelper().login();
        AddShiftHelper addShiftHelper = new AddShiftHelper();
        addShiftHelper.checkDepartmentCondition();
        addShiftHelper.checkScheduleCondition("Publish");
        addShiftHelper.addingShift();

    }
}
