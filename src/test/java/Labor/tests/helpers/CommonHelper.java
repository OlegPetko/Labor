package Labor.tests.helpers;

import Labor.tests.pages.BasePage;

public class CommonHelper extends BasePage {
    public void close(){
        driver.quit();
    }
}
