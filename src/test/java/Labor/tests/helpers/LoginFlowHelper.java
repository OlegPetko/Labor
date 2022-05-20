package Labor.tests.helpers;

import Labor.tests.pages.LoginFlowPage;


public class LoginFlowHelper extends LoginFlowPage {

    public void resetLoginForm() {
        userNameField.clear();
        passwordField.clear();
    }

    public void login() {
        userNameField.sendKeys("Petko, o");
        passwordField.sendKeys("sunnyday");
        loginButton.click();
    }

    public void logOut() {
        logOutButton.click();
    }

    public void loginwWithEmptyFields() {
        loginButton.click();
    }

    public void loginWithoutName() {
        passwordField.sendKeys("sunnyday");
        loginButton.click();
    }

    public void loginWithoutPassword() {
        userNameField.sendKeys("Petko, o");
        loginButton.click();
    }

    public void loginWithWrongPassword() {
        userNameField.sendKeys("Petko, o");
        passwordField.sendKeys("sunnynight");
        loginButton.click();
    }

    public String getPasswordField() {
        return passwordField.getAttribute("id");
    }

    public String getButtonName() {
        return loginButton.getAttribute("class");
    }

    public String getDepartmentName() {
        return departmentButton.getText();
    }

    public String getLanguagePanel() {
        return languagePanel.getAttribute("id");
    }


    public boolean isLanguagePanelVisible() {
        return this.isElementDisplayed(languagePanel);
    }

    public boolean isLoginButtonVisible() {
        return this.isElementDisplayed(loginButton);
    }


}
