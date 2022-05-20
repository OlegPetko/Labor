package Labor.tests.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class BasePage {

    static protected WebDriver driver;

    public static void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dolceclock-staging.qa.spoton.sh/public/company/spotonqa");
//        driver.get("https://stable.dolceclock.com/public/company/spotonqa");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    protected boolean isElementDisplayed(WebElement webElement) {
        return webElement.isDisplayed();
    }

    protected boolean isElementEnabled(WebElement webElement) {
        return webElement.isEnabled();
    }

    protected boolean isElementSelected(WebElement webElement) {
        return webElement.isSelected();
    }
}
