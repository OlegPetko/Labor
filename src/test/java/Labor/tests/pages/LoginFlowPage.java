package Labor.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	@FindBy(css="td>#uname")
	protected WebElement userNameField;

	@FindBy(css="#pword")
	protected WebElement passwordField;

	@FindBy(css=".login_submit")
	protected WebElement loginButton;

	@FindBy(css="#logout_link1")
	protected WebElement logOutButton;

}
