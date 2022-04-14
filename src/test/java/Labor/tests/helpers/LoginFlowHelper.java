package Labor.tests.helpers;

import Labor.tests.pages.LoginPage;

public class LoginHelper extends LoginPage {

    public void login (String name, String password){
        userNameField.sendKeys(name);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void logOut(){
        logOutButton.click();
    }
}
