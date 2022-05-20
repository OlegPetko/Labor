package Labor.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFlowPage extends BasePage {

    @FindBy(css = "td>#uname")
    public WebElement userNameField;

    @FindBy(css = "#pword")
    public WebElement passwordField;

    @FindBy(css = ".login_submit")
    protected WebElement loginButton;

    @FindBy(css = "#logout_link1")
    protected WebElement logOutButton;

    @FindBy(css = "#locswitch_26506635")
    protected WebElement departmentButton;

    @FindBy(css = "#language")
    protected WebElement languagePanel;


   /* public boolean isLanguagePanelVisible(){
        return this.isElementDisplayed(languagePanel);
    }

    public boolean isLoginButtonVisible(){
        return this.isElementDisplayed(loginButton);
    }*/
}
