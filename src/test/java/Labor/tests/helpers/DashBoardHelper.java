package Labor.tests.helpers;

import Labor.tests.pages.DashBoardPage;

public class DashBoardHelper extends DashBoardPage {

    public String getUserName(){
        return userName.getText();
    }
}
