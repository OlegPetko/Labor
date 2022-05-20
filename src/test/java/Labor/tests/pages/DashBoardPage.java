package Labor.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage{

	@FindBy(css="#nav_personal")
	protected WebElement userName;

}
